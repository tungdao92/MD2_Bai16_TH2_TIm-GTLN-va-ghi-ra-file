import javax.swing.text.html.HTML;
import java.util.List;

public class FindMaxValue {
    public static int finMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_NUMBER = "D:\\HTML data\\MD2\\ThucHanh\\Bai16_TH2_Tim gia tri lon nhat thu file\\src\\number.txt";
        String PAT_RESULT =  "D:\\HTML data\\MD2\\ThucHanh\\Bai16_TH2_Tim gia tri lon nhat thu file\\src\\number.txt";
        List<Integer> number = readAndWriteFile.readFile(PATH_NUMBER);
        int maxvalue = finMax(number);
        readAndWriteFile.writeFile(PAT_RESULT, maxvalue);
    }
}

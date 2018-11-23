import java.util.Arrays;

public class PDFviewer {

	public static void main(String[] args) {
		System.out.println(designerPdfViewer(new int[] {1 ,3 ,1 ,3, 1, 4, 1, 3, 2, 5, 5 ,5 ,5 ,5, 5, 5, 5, 5, 5 ,5 ,5 ,5 ,5 ,5 ,5, 5}, "abc"));

	}
	static int designerPdfViewer(int[] h, String word) {
			int max=Integer.MIN_VALUE;
			for(int i=0;i<word.length();i++) {
				max=Math.max(max, h[(int)word.charAt(i)-97]);
			}
		return max*word.length();
    }
}

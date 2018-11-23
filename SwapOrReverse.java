
public class SwapOrReverse {
public static void main(String[] args) {
	
} static void almostSorted(int[] arr) {
	if(isSorted(arr)) {
		System.out.println("yes");
		
	}else {
		for(int i=0;i<arr.length-1;i++) {
			
		}
	}

}
static Boolean isSorted(int[] arr) {
for(int i=0;i<arr.length-1;i++) {
	if(arr[i]>arr[i+1]) {
		return false;
	}
}
return true;
	

}


}

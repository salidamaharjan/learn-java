public class L0005ClassAndObjects {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
       IndexFinder indexOf = new IndexFinder();
        int index = indexOf.index(arr, 8);
        System.out.println("index of 8 = " + index);
    }
        
    
}

class IndexFinder {
    int index(int[] arr, int num) {
        int indexOf = -1;
        for (int i = 0 ; i < arr.length; i++) {
            if(num == arr[i]){
                return i;
            }
        }
        return indexOf;
    }
}
package sequenceEven;

import java.util.Arrays;

public class Main {
	
	static boolean isFind(int[] arr, int value){

        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {2,22,22, 5, 60,61,60, 1, 2,122,122 ,40, 60, 444, 6, 6, 2, 8, 515, 17, 7};
        int[] dup = new int[list.length];
        int startIndex = 0;

        for(int i=0; i < list.length; i++){

            for(int j=0; j < list.length; j++){

                if(i != j && list[i]==list[j] ){
                    if( !isFind(dup , list[i] )){
                    	
                        dup[startIndex++]=list[i];
                    }
                    break;
                }
            }
        }
        for(int value : dup)
        {
            if(value !=0 && value % 2 == 0 )
            {
                System.out.println( value );
            }
        }

	}

}

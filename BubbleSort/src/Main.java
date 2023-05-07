
public class Main {

//short
       public static void printArry(int arry[]){
           for (int i=0;i<arry.length;i++){
               System.out.print(arry[i]+" ");
           }
           System.out.println();
       }

    public static void main(String[] args) {
//           bubblesort
         int arry[]={7,4,8,3,1};
         for (int i=0;i<arry.length-1;i++){
             for (int j=0;j<arry.length-1-i;j++){
                 if(arry[j]>arry[j+1]){

//                     swaping
                     int temp=arry[j];
                     arry[j]=arry[j+1];
                     arry[j+1]=temp;
                 }
             }
         }

  //      seletion sort
        for(int i=0;i<arry.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arry.length;j++){
                smallest=j;
                if(arry[smallest]<arry[i]){
                    int temp=arry[i];
                    arry[i]=arry[smallest];
                    arry[smallest]=temp;
                }
            }

        }



        for(int i=1;i<arry.length;i++){
            int countnum=arry[i];
            int j=i-1;
            while (j>=0&&countnum<arry[j]){
                arry[j+1]=arry[j];
                j--;
            }
            arry[j+1]=countnum;
        }

         printArry(arry);



    }

}
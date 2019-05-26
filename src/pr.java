import java.util.HashMap;

public class pr {
    public static String reverseString(String string){
        String res="";
        for(int i=string.length()-1;i>=0;i--){
            res=res+string.charAt(i);
        }
        return res;
    }
    public static String reverseInPlace(String string){

        for(int i=0;i<string.length();i++){
            for(int j=string.length()-1;j>i;j--){
                char temp=string.charAt(i);
                //string.charAt(i)==temp.
            }
        }

        return string;
    }
    public static void main(String[] args) {
        //System.out.println(reverseString("nameOLOP"));
        //System.out.println(isAnagram("ES","SE"));
        int[][] arr={{1,0,2},{4,5,6}};
        setToZero(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(stringArray(arr[i]));
        }

    }
    public static String stringArray(int [] arr){
        String res="";
        for(int i=0;i<arr.length;i++){
            res=res+arr[i]+" ";
        }
        return res;
    }
    public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }

        HashMap<Character, Integer> charCount1=genFrequencyTable(str1);
        HashMap<Character, Integer> charCount2=genFrequencyTable(str2);

        for(Character character:charCount1.keySet()){
            if(charCount1.get(character)!=charCount2.get(character) || !charCount2.containsKey(character)){
                return false;
            }

        }
        return true;
    }


    public static HashMap<Character, Integer> genFrequencyTable(String str){
        HashMap<Character, Integer> charCount=new HashMap<>();

        for (int i=0;i<str.length();i++){
            if(charCount.containsKey(str.charAt(i))){
                charCount.put(str.charAt(i),charCount.get(str.charAt(i))+1);
            }else{
            charCount.putIfAbsent(str.charAt(i),1);}

        }
        return charCount;
    }

    public static int[][] setToZero(int[][] arr){
        int[] row=new int[arr.length];
        int[] col=new int[arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
      for(int i=0;i<row.length;i++) {
          if(row[i]==1) {
              for (int k = 0; k < arr[0].length; k++) {
                  arr[i][k] = 0;
              }
          }
      }
//                    //column
        for(int j=0;j<col.length;j++) {
            if(col[j]==1) {
                for (int y = 0; y < arr.length; y++) {
                    arr[y][j] = 0;
                }
            }
        }
        return arr;
    }
}

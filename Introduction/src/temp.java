
public class temp {

}

class solve{
    public static String caseSort(String str) {
        
        int n = str.length();
        boolean arr[] = new boolean[n];
        
        int i=0;
        for(char ele:str.toCharArray()){
            
            int asci = (int)ele;
            if(asci>=65 && asci < 91){
                arr[i] = true;
            }
            i++;
        }
        
        char tempArray[] = str.toCharArray();
        Arrays.sort(tempArray);
        
        char sortArr[] = new char[n];
        
        for(int j=0;j<n;j++){
            
            char element = tempArray[j];
            int asci = (int)element;
            
            if(asci>=65 && asci<91){
                
                if(arr[j]){
                    sortArr[j] = element;
                }else{
                    int z=j;
                    while(z<n){
                        if(arr[z]){
                            sortArr[z] = element;
                            break;
                        }
                        z++;
                    }
                }
                
            }else{
                if(!arr[j]){
                    sortArr[j] = element;
                }else{
                    int z=j;
                    while(z<n){
                        if(!arr[z]){
                            sortArr[z] = element;
                            break;
                        }
                        z++;
                    }
                }
            }
        }
        
        
        
        return new String(sortArr);
        
        
    }
}
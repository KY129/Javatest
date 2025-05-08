public class Study003 {
    public static void main(String[] args) {

        for(int 단 = 1; 단 <= 9; 단++) {
            if(단 % 2 != 0) continue;
                System.out.println(단 + "단");
                for(int i = 1 ; i <= 9; i++) {
                    System.out.println(단 + "*" + i + "=" + (단 * i) + "\t");
                        
                    }   
                    System.out.println();
                
            }
        }
    }
    


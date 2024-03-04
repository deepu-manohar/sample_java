public class RandomFile {
    
    public void SayHello(){
        System.out.println("Hello from stale code!!");
    }

    public void DoTheMath(int a, int b){
        try{
            if(a > 0 && b > 0){
                System.out.println(a + b);
            } else{
                throw new Exception("Invalid input");
            }
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }

    public void AddTheNumbers(int a, int b){
        try{
            if(a > 0 && b > 0){
                System.out.println(a + b);
            } else{
                throw new Exception("Invalid input");
            }
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }

    public void SubtractTheNumbers(int a, int b){
        try{
            if(a > 0 && b > 0){
                System.out.println(a - b);
            } else{
                throw new Exception("Invalid input");
            }
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }
}

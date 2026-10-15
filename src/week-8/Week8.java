public class Week8 { 
    public static void main(String[]args){
        try{String answer="";
        if(answer.isBlank())throw new IllegalArgumentException("Answer required");
    }
        catch(Exception e){
            System.out.println("Handled: "+e.getMessage());
        }
    }
     }

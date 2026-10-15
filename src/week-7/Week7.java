class Question { 
    String prompt; 
    String answer; 

    Question(String p,String a){prompt=p;answer=a;

    }
 }
public class Week7 { 
    public static void main(String[]args){
        Question q = new Question("2+2?","4");
        System.out.println(q.prompt+" Answer: "+q.answer);
    }
 }

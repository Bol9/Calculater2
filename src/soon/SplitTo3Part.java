package soon;

public class SplitTo3Part {


    public String[] splitTo3Part(String enteredString){
        String[] splitTo3;
        if(enteredString.contains("+")){
             splitTo3 = enteredString.replace("+","#+#").split("#",3);
            return splitTo3;
        }else if(enteredString.contains("-")){
            splitTo3 = enteredString.replace("-","#-#").split("#",3);
            return splitTo3;
        }else if(enteredString.contains("*")){
            splitTo3 = enteredString.replace("*","#*#").split("#",3);
            return splitTo3;
        }else if(enteredString.contains("/")){
            splitTo3 = enteredString.replace("/","#/#").split("#",3);
            return splitTo3;
        }
        splitTo3= new String[]{"0"};// exaption time
        return splitTo3;
    }
}

package soon;

public class FourOperatin {

    public int fourOperation(int firtNumber, String operatinSign , int secondNum){

        switch (operatinSign){
            case "+":
                return firtNumber+secondNum;
            case "-":
                return firtNumber-secondNum;
            case "*":
                return firtNumber*secondNum;
            case "/":
               return firtNumber/secondNum;
            default:
                return 101; // Exaption time
        }

    }


}

package soon;

public class Operation {
    TakeNuber takeNuber = new TakeNuber();
    FourOperatin fourOperatin = new FourOperatin();

    String[] rimNumber = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public void operation(String[] enteredSt) throws Exception{//3 ko bolungon str kelet
        if(enteredSt[0].matches("[+-]?\\d*(\\.\\d+)?")){
            int firstNum = Integer.parseInt(enteredSt[0]);
            int secondNum = Integer.parseInt(enteredSt[2]);
            String operatinSigin = enteredSt[1];
            takeNuber.setFirstNumber(firstNum);
            takeNuber.setSecondNumber(secondNum);
            // 4 operatindi chakyr
            int readyOperatin = fourOperatin.fourOperation(firstNum, operatinSigin,secondNum);
            if(readyOperatin==101){
                throw new Exception("OperationSign kata");
            }else{
                System.out.print(firstNum+operatinSigin+secondNum+"="+readyOperatin);
            }




        }else{
            String operatinSigin = enteredSt[1];
            //rim uchun
            for (int i = 0; i < rimNumber.length; i++) {
                if(rimNumber[i].equals(enteredSt[0])){
                    int firstNum = i+1;
                    for (int j = 0; j < rimNumber.length; j++) {
                        if(rimNumber[j].equals(enteredSt[2])){
                           int secondNum = j+1;

                            int readyOperatin = fourOperatin.fourOperation(firstNum, operatinSigin,secondNum);
                            StringBuilder romanNumber = RomenConverter.rimNumberCoverter(readyOperatin);//romanga convert kylyp atat

                            if(readyOperatin==101){
                                throw new Exception("OperationSign kata");
                            }else{
                                //arab san chygarysh kerek
                                System.out.print(enteredSt[0]+operatinSigin+enteredSt[2]+"="+romanNumber);
                            }
                            break;


                        }else if(j== rimNumber.length-1){
                            throw new Exception();
                        }

                    }


                    break;
                }else if(i== rimNumber.length-1){
                    throw new Exception();
                }

            }

        }


    }
}

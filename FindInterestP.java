package JavaProject;

import java.util.Scanner;


public class FindInterestP {

    static Scanner ss;

    public static final void findEachFutureInterest(double amount , int year , double rate) {


        double futureAmount = 0 ;

        for(int i = 1 ; i <= year ; i++) {

            futureAmount = amount * Math.pow((1 + rate / 100) , i) ;

            System.out.println("Future Amount Of " + i + " Years Is " + futureAmount);

            futureAmount = 0 ;

        }

    }


    public static final void findAllFutureInterest(double amount , int year , double rate) {

        double futureAmount = 0 ;

        futureAmount = amount * Math.pow((1 + rate / 100) , year) ;
        System.out.println("Future Amount Of " + year + " Years Is " + futureAmount);
    }


    public static final void findRatePerYear(double futureAmount , double presentAmount , int year) {

        double findRate  ;
        double interestRate;
        for(int i = 1 ; i <= year ; i++) {

            findRate = Math.pow((futureAmount / presentAmount) , 1/i) - 1 ;
            interestRate = findRate * 100 ;
            System.out.println("Rate Of Interest Of " + i + " Years With Given " + futureAmount + " Future Amount And " + presentAmount + " Present Amount = " + interestRate);

        }

    }


    public static final void findRateAllYear(double futureAmount , double presentAmount , int year) {

        double findRate ;
        double interestRate;


        findRate = Math.pow((futureAmount / presentAmount) , 1/year) - 1 ;
        System.out.println(findRate);
        interestRate = findRate * 100 ;
        System.out.println("Rate Of Interest Of " + year + " Years With Given " + futureAmount + " Future Amount And " + presentAmount + " Present Amount = " + interestRate);


    }



    public static final void findPresentValuePerYear(double futureAmount , double interestRate , int year) {


        double presentValue = 0 ;;

        for(int i = 1 ; i <= year ; i++) {

            presentValue = futureAmount / Math.pow((1+interestRate/100) , i) ;
            System.out.println("Present Value Of " + i + " Years " + " Is = " + presentValue);
            presentValue = 0 ;
        }

    }

    public static final void findPresentValue(double futureAmount , double interestRate , int year) {

        double presentValue = 0 ;
        presentValue = futureAmount / Math.pow((1 + interestRate/100) , year) ;
        System.out.println("Present Value Of " + year + " Years " + " Is = " + presentValue);

    }


    public static final void displayOptions() {

        System.out.println("What's You Are Calculate?\n");
        System.out.println("1. Calculate Future Amount");
        System.out.println("2. Calculate Present Amount");
        System.out.println("3. Calculate Interest Rate");
        System.out.println("4. Calculate Number Of Years");
        System.out.println("0. EXIT");

    }

    public static final void optionsSelection() {

        ss = new Scanner(System.in);
        int selectNum = ss.nextInt();

        if(selectNum == 0) {

            System.out.println("Why You Are Leave Without Using Smart Calculator");
            System.out.println("Please Give Any One Reason");
            System.out.println("1. Calculator Is Not Work Properly");
            System.out.println("2. Calculator Is Not good For Me");
            System.out.println("3. I'm Using Another Calculator");
            System.out.println("4. It's Not For Me");
            System.out.println("5. It's So Boring");
            System.out.println("6. Other Reason");
            System.out.println("7. All Of These");
            int exitselectReason = ss.nextInt();
            if(exitselectReason == 6) {

                System.out.println("Write Your Reason");
                String writeReason = ss.next();
                System.out.println("          Thankyou        ");
                System.out.println("EXIT");
                System.exit(0);

            }
            System.out.println("          Thankyou        ");
            System.out.println("EXIT");
            System.exit(0);
        }


        else if(selectNum == 1) {
            System.out.println("Calculate Future Value");
            System.out.println("1. Calculate Future Value According To Per Years");
            System.out.println("2. Calculate Future Value According To Given Years");
            int selectFutureYear = ss.nextInt();


            if(selectFutureYear == 1) {


                System.out.print("Input The Investment Amount = ");
                double investmentAmount = ss.nextDouble();
                System.out.println();

                System.out.print("input Number Of Years = ");
                int years = ss.nextInt();
                System.out.println();

                System.out.print("Input The Rate Of Interest = ");
                double rateOfInterest = ss.nextDouble();
                System.out.println();

                JavaBasicProgram.FindInterestP.findEachFutureInterest(investmentAmount , years , rateOfInterest);

                System.out.println();
                System.out.println("1. Return Main Menu");
                System.out.println("2. EXIT");
                int selectNectProcess = ss.nextInt();

                if(selectNectProcess == 1) {

                } else if(selectNectProcess == 2) {
                    System.out.println("          Thank you For Visit :)        ");
                    System.out.println("                  EXIT                  ");
                    System.exit(0);
                } else {
                    System.out.println("Invalid Key! Try Again");
                }
            } else if(selectFutureYear == 2) {
                System.out.println("Find Future Value");
                System.out.print("Input The Investment Amount = ");
                double investmentAmount = ss.nextDouble();
                System.out.println();

                System.out.print("input Number Of Years = ");
                int years = ss.nextInt();
                System.out.println();

                System.out.print("Input The Rate Of Interest = ");
                double rateOfInterest = ss.nextDouble();
                System.out.println();

                JavaBasicProgram.FindInterestP.findAllFutureInterest(investmentAmount , years , rateOfInterest);

                System.out.println();
                System.out.println("1. Return Main Menu");
                System.out.println("2. EXIT");
                int selectNectProcess = ss.nextInt();

                if(selectNectProcess == 1) {

                } else if(selectNectProcess == 2) {
                    System.out.println("          Thank you For Visit :)        ");
                    System.out.println("                  EXIT                  ");
                    System.exit(0);
                } else {
                    System.out.println("Invalid Key! Try Again");
                }
            }
            else {
                System.out.println("Ivalid Key! Try Again");
            }

        }else if(selectNum == 2) {


            System.out.println("Calculate Present Amount");
            System.out.println("1. Calculate Present Value According To Per Years");
            System.out.println("2. Calculate Present Value According To Given Years");
            int selectPresentYear2 = ss.nextInt();
            if(selectPresentYear2 == 1) {
                System.out.print("Input Future Amount = ");
                double futureValue = ss.nextDouble();

                System.out.print("Input The Number Of Years = ");
                int year = ss.nextInt();

                System.out.print("Input The Rate Of Interest = ");
                double rateInvestment = ss.nextDouble();

                FindInterestP.findPresentValuePerYear(futureValue , rateInvestment , year);

                System.out.println();
                System.out.println("1. Return Main Menu");
                System.out.println("2. EXIT");
                int selectNectProcess = ss.nextInt();

                if(selectNectProcess == 1) {

                } else if(selectNectProcess == 2) {
                    System.out.println("          Thank you For Visit :)        ");
                    System.out.println("                  EXIT                  ");
                    System.exit(0);
                } else {
                    System.out.println("Invalid Key! Try Again");
                }
            }

            if(selectPresentYear2 == 2) {
                System.out.print("Input Future Amount = ");
                double futureValue = ss.nextDouble();

                System.out.print("Input The Number Of Years = ");
                int year = ss.nextInt();

                System.out.print("Input The Rate Of Interest = ");
                double rateInvestment = ss.nextDouble();

                FindInterestP.findPresentValue(futureValue , rateInvestment , year);

                System.out.println();
                System.out.println("1. Return Main Menu");
                System.out.println("2. EXIT");
                int selectNectProcess = ss.nextInt();

                if(selectNectProcess == 1) {

                } else if(selectNectProcess == 2) {
                    System.out.println("          Thank you For Visit :)        ");
                    System.out.println("                  EXIT                  ");
                    System.exit(0);
                } else {
                    System.out.println("Invalid Key! Try Again");
                }
            }
            else {
                System.out.println("Invalid Key! Try Again");
            }
        }else if(selectNum == 3) {

            System.out.println("Calculate The Rate Of Interest");
            System.out.println("1. Calculate The Rate Of Interest According To Per Years");
            System.out.println("2. Calculate The Rate Of Interest According To Given Years");

            int selectRateYear = ss.nextInt();

            if(selectRateYear == 1) {
                System.out.print("Input The Present Amount = ");
                double presentAmount = ss.nextDouble();

                System.out.print("Input Future Amount = ");
                double futureAmount = ss.nextDouble();

                System.out.print("Input Number Of Years = ");
                int year = ss.nextInt();

                FindInterestP.findRatePerYear(futureAmount , presentAmount , year);

                System.out.println();
                System.out.println("1. Return Main Menu");
                System.out.println("2. EXIT");
                int selectNectProcess = ss.nextInt();

                if(selectNectProcess == 1) {

                } else if(selectNectProcess == 2) {
                    System.out.println("          Thank you For Visit :)        ");
                    System.out.println("                  EXIT                  ");
                    System.exit(0);
                } else {
                    System.out.println("Invalid Key! Try Again");
                }
            } else if(selectRateYear == 2) {
                System.out.print("Input The Present Amount = ");
                double presentAmount = ss.nextDouble();

                System.out.print("Input Future Amount = ");
                double futureAmount = ss.nextDouble();

                System.out.print("Input Number Of Years = ");
                int year = ss.nextInt();

                FindInterestP.findRateAllYear(futureAmount , presentAmount , year);

                System.out.println();
                System.out.println("1. Return Main Menu");
                System.out.println("2. EXIT");
                int selectNectProcess = ss.nextInt();

                if(selectNectProcess == 1) {

                } else if(selectNectProcess == 2) {
                    System.out.println("          Thank you For Visit :)        ");
                    System.out.println("                  EXIT                  ");
                    System.exit(0);
                } else {
                    System.out.println("Invalid Key! Try Again");
                }
            } else {
                System.out.println("Invalid Key! Try Again");
            }

        }else if(selectNum == 4) {


            System.out.println("Select 4");

        }else if(selectNum > 4){


            FindInterestP.displayOptions();
            System.out.println("Press Valid Key Or Number!");
            int selectNum2 = ss.nextInt();
            if(selectNum2 == 1) {
                System.out.println("Calculate Future Value");
                System.out.println("1. Calculate Future Value According To Per Years");
                System.out.println("2. Calculate Future Value According To Given Years");
                int selectFutureYear2 = ss.nextInt();
                if(selectFutureYear2 == 1) {


                    System.out.print("Input The Investment Amount = ");
                    double investmentAmount = ss.nextDouble();
                    System.out.println();

                    System.out.print("input Number Of Years = ");
                    int years = ss.nextInt();
                    System.out.println();

                    System.out.print("Input The Rate Of Interest = ");
                    double rateOfInterest = ss.nextDouble();
                    System.out.println();

                    JavaBasicProgram.FindInterestP.findEachFutureInterest(investmentAmount , years , rateOfInterest);

                    System.out.println();
                    System.out.println("1. Return Main Menu");
                    System.out.println("2. EXIT");
                    int selectNectProcess = ss.nextInt();

                    if(selectNectProcess == 1) {

                    } else if(selectNectProcess == 2) {
                        System.out.println("          Thank you For Visit :)        ");
                        System.out.println("                  EXIT                  ");
                        System.exit(0);
                    } else {
                        System.out.println("Invalid Key! Try Again");
                    }
                } else if(selectFutureYear2 == 2) {
                    System.out.println("Find Future Value");
                    System.out.print("Input The Investment Amount = ");
                    double investmentAmount = ss.nextDouble();
                    System.out.println();

                    System.out.print("input Number Of Years = ");
                    int years = ss.nextInt();
                    System.out.println();

                    System.out.print("Input The Rate Of Interest = ");
                    double rateOfInterest = ss.nextDouble();
                    System.out.println();

                    JavaBasicProgram.FindInterestP.findAllFutureInterest(investmentAmount , years , rateOfInterest);

                    System.out.println();
                    System.out.println("1. Return Main Menu");
                    System.out.println("2. EXIT");
                    int selectNectProcess = ss.nextInt();

                    if(selectNectProcess == 1) {

                    } else if(selectNectProcess == 2) {
                        System.out.println("          Thank you For Visit :)        ");
                        System.out.println("                  EXIT                  ");
                        System.exit(0);
                    } else {
                        System.out.println("Invalid Key! Try Again");
                    }
                }

            }else if(selectNum2 == 2) {


                System.out.println("Calculate Present Amount");
                System.out.println("1. Calculate Present Value According To Per Years");
                System.out.println("2. Calculate Present Value According To Given Years");
                int selectPresentYear2 = ss.nextInt();
                if(selectPresentYear2 == 1) {
                    System.out.print("Input Future Amount = ");
                    double futureValue = ss.nextDouble();

                    System.out.print("Input The Number Of Years = ");
                    int year = ss.nextInt();

                    System.out.println("Input The Rate Of Interest = ");
                    double rateInvestment = ss.nextDouble();

                    FindInterestP.findPresentValuePerYear(futureValue , rateInvestment , year);

                    System.out.println();
                    System.out.println("1. Return Main Menu");
                    System.out.println("2. EXIT");
                    int selectNectProcess = ss.nextInt();

                    if(selectNectProcess == 1) {

                    } else if(selectNectProcess == 2) {
                        System.out.println("          Thank you For Visit :)        ");
                        System.out.println("                  EXIT                  ");
                        System.exit(0);
                    } else {
                        System.out.println("Invalid Key! Try Again");
                    }
                }

                if(selectPresentYear2 == 2) {
                    System.out.print("Input Future Amount = ");
                    double futureValue = ss.nextDouble();

                    System.out.print("Input The Number Of Years = ");
                    int year = ss.nextInt();

                    System.out.println("Input The Rate Of Interest = ");
                    double rateInvestment = ss.nextDouble();

                    FindInterestP.findPresentValue(futureValue , rateInvestment , year);

                    System.out.println();
                    System.out.println("1. Return Main Menu");
                    System.out.println("2. EXIT");
                    int selectNectProcess = ss.nextInt();

                    if(selectNectProcess == 1) {

                    } else if(selectNectProcess == 2) {
                        System.out.println("          Thank you For Visit :)        ");
                        System.out.println("                  EXIT                  ");
                        System.exit(0);
                    } else {
                        System.out.println("Invalid Key! Try Again");
                    }
                }
                else {
                    System.out.println("Invalid Key! Try Again");
                }
            }else if(selectNum2 == 3) {

                System.out.println("Calculate The Rate Of Interest");
                System.out.println("1. Calculate The Rate Of Interest According To Per Years");
                System.out.println("2. Calculate The Rate Of Interest According To Given Years");

                int selectRateYear = ss.nextInt();

                if(selectRateYear == 1) {
                    System.out.print("Input The Present Amount = ");
                    double presentAmount = ss.nextDouble();

                    System.out.print("Input Future Amount = ");
                    double futureAmount = ss.nextDouble();

                    System.out.print("Input Number Of Years = ");
                    int year = ss.nextInt();

                    FindInterestP.findRatePerYear(futureAmount , presentAmount , year);

                    System.out.println();
                    System.out.println("1. Return Main Menu");
                    System.out.println("2. EXIT");
                    int selectNectProcess = ss.nextInt();

                    if(selectNectProcess == 1) {

                    } else if(selectNectProcess == 2) {
                        System.out.println("          Thank you For Visit :)        ");
                        System.out.println("                  EXIT                  ");
                        System.exit(0);
                    } else {
                        System.out.println("Invalid Key! Try Again");
                    }
                } else if(selectRateYear == 2) {
                    System.out.print("Input The Present Amount = ");
                    double presentAmount = ss.nextDouble();

                    System.out.print("Input Future Amount = ");
                    double futureAmount = ss.nextDouble();

                    System.out.print("Input Number Of Years = ");
                    int year = ss.nextInt();

                    FindInterestP.findRateAllYear(futureAmount , presentAmount , year);

                    System.out.println();
                    System.out.println("1. Return Main Menu");
                    System.out.println("2. EXIT");
                    int selectNectProcess = ss.nextInt();

                    if(selectNectProcess == 1) {

                    } else if(selectNectProcess == 2) {
                        System.out.println("          Thank you For Visit :)        ");
                        System.out.println("                  EXIT                  ");
                        System.exit(0);
                    } else {
                        System.out.println("Invalid Key! Try Again");
                    }
                } else {
                    System.out.println("Invalid Key! Try Again");
                }

            }else if(selectNum2 == 4) {


                System.out.println("Select 4");


            }else {

                // System.out.println("Prerss Valid Key Or Number!");
                System.out.println("You Reached More Time | Try Again");
                System.out.println("            Thank You            ");
                System.out.println("               :)                ");
            }

        }

    }


    public static void main(String[] args) {

        ss = new Scanner(System.in);
        JavaBasicProgram.FindInterestP.displayOptions();
        FindInterestP.optionsSelection();



    }

}



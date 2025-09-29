public class PatternPractice {
    public static void main(String[] args) {
        System.out.println("Welcome to daily practice world...");
        System.out.println("Hallow Rectangle pattern");
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                if(i==0 || i==3 ||j==0||j==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Inverted and Rotated Half-Pyramid");

        for(int i=0; i<4; i++){
            for(int j=0; j<4-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Inverted half pyramid with numbers");

        for(int i=0; i<5; i++){
            for(int j=0; j<5-i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }

        System.out.println("FLOYD'S Triangle...");
        int k=1;
        for(int i=0; i<5; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(k+++" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("0-1 Triangle..");
        for(int i=0; i<5; i++){
            for(int j=0; j<i+1; j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                } 
            }
            System.out.println();
        }

        System.out.println("Butterfly...");
        for(int i=0; i<4; i++){
           for(int j=0; j<i+1; j++){
            System.out.print("*");
           }
           for(int j=0; j<4-i-1; j++){
                System.out.print(" ");
            }

            for(int j=0; j<4-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

         for(int i=0; i<4; i++){
           for(int j=0; j<4-i-1; j++){
            System.out.print("*");
           }
           for(int j=0; j<i+1; j++){
                System.out.print(" ");
            }
            
            for(int j=0; j<i+1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<4-i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Solid Rhombus..");
        for(int i=0; i<5; i++){
            for(int j=0; j<4-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Hollow Rhombus..");
        for(int i=0; i<5; i++){
            for(int j=0; j<4-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<5; j++){
                if(i==0 || j==0 ||i==4 || j==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Diamond....");
        for(int i=0; i<4; i++){
            for(int j=0; j<4-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<4; i++){
    
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<4*2-2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Number Pyramid...");

        for(int i=0; i<5; i++){
            for(int j=0; j<5-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
        System.out.println("Palindromic Pattern with Numbers..");
        for(int i=0; i<5; i++){
            for(int j=0; j<5-i-1; j++){
                System.out.print("  ");
            }
            for(int j=i+1; j>1; j--){
                System.out.print(j+" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
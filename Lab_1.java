
import java.util.Arrays;
import java.util.Random;

    public class Lab_1 {
        public static int[] mas1(){
            int [] a = new int [8];
            int m=0;
            for (int i=5;i <= 19;i=i+2){
                a[m] = i;
                m++;
            }
            return a;
        }

        public static float[] mas2 (){
            float [] x = new float [15];
            for (int i=0; i<15;i++){
                float min=-8;
                float max=4;
                Random r = new Random();
                x[i] = (r.nextFloat()*(max-min+1))+min;

            }
            return x;
        }

        public static double [][] mas3 (){
            double [][] d = new double[8][15];
            for (int i=0;i<8;i++){
                for (int j=0;j<15;j++){
                    if (i==11){
                        d[i][j]=Math.pow((( (3/4)+Math.asin(Math.sin(j)) )/Math.PI),3);
                    } else if ((i==9) || (i==13) || (i==15) || (i==19)){
                        d[i][j]=Math.log(Math.pow(Math.sin(Math.tan(Math.pow(Math.E,j))),2) );
                    } else{
                        d[i][j]=Math.cos(Math.cos(Math.tan(Math.pow(((j-(1/2)) /0.5) ,j ))) );
                    }
                    d[i][j]=(Math.ceil((d[i][j])*1000))/1000;
                }
            }
            return d;
        }

        public static void main(String[] args) {
            //Вывод строками
            System.out.println(Arrays.toString( mas1() ));
            System.out.println(Arrays.toString( mas2() ));
            System.out.println(Arrays.deepToString( mas3() ));
            //Вывод табличкой
            for (int i=0;i<8;i++){
                for (int j=0;j<15;j++){
                    System.out.print(" "+ mas3()[i][j] + " ");
                }
                System.out.println();
            }

        }
    }



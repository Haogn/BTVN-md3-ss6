package baitap.bt3;

public class Main {
    public static void main(String[] args) {
        // khoi tao doi tuong
        StopWatch stopWatch = new StopWatch();
        System.out.println("Thoi gian bat dau khoi tao " + stopWatch.getStartTime());

        // 2. start
        stopWatch.start();
        // khoi tao mang gom 10000000 so va thuc hien sap xep mang tang dan
        int[] arrInt = new int[100000] ;
        for (int i = 0; i <arrInt.length ; i++) {
            arrInt[i] = (int) Math.random()*100000 ;
        }
        
        // thuc hien sap xep
        for (int i = 0; i <arrInt.length -1  ; i++) {
            for (int j = i + 1; j < arrInt.length; j++) {
                if (arrInt[i] > arrInt[j]) {
                    int temp = arrInt[i] ;
                    arrInt[i] = arrInt[j];
                    arrInt[j] = temp;
                }
            }
        }
        stopWatch.stop();
        System.out.println("Thoi gian tu lusc start -->> stop " + stopWatch.getElapsedTime());
    }
}

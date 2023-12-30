package Perceptron;

import java.util.Arrays;
import java.util.HashMap;

public class NNPerceptron {

    public static void main(String[] args) {
        //dataTraining
        int[] pola_1 = {1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, 1, 1, 1, 1, 1, -1, -1, 1, -1, -1, -1, 1, -1, -1, 1, -1, -1, -1, 1, -1, 1, 1, 1, -1, 1, 1, 1};
        int[] pola_2 = {1, 1, 1, 1, 1, 1, 1, -1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, 1, -1, 1, 1, 1, 1, 1, -1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, -1};
        int[] pola_3 = {1, -1, -1, 1, 1, 1, 1, 1, -1, 1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1, -1, 1, 1, 1, 1, 1};
        int[] pola_4 = {1, 1, 1, 1, 1, 1, 1, -1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, -1};
        int[] pola_5 = {1, 1, 1, 1, 1, 1, 1, -1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, -1};
        int[] pola_6 = {1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, 1, -1, -1, -1, 1, -1, -1, 1, 1, 1, 1, 1, -1, -1, 1, -1, -1, -1, 1, -1, -1, 1, -1, -1, -1, 1, -1};
        int[] pola_7 = {1, 1, 1, 1, 1, 1, 1, -1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, -1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, -1};
        int[] pola_8 = {1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] pola_9 = {1, 1, 1, 1, 1, 1, 1, -1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, -1};
        int[] pola_10 = {1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1, 1, 1, 1, 1, 1, 1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1};

        //dataTesting
        int[] pola_A = {1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, 1, 1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, 1, -1, -1, -1, 1, -1, -1, 1, 1, 1, 1, 1, -1, -1, 1, -1, -1, -1, 1, -1, -1, 1, -1, -1, -1, 1, -1};
        int[] pola_B = {1, 1, 1, 1, 1, 1, -1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, 1, -1, 1, 1, 1, 1, 1, 1, -1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, -1};
        int[] pola_C = {1, -1, -1, 1, 1, 1, -1, -1, -1, 1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, 1, -1, -1, -1, 1, 1, 1, -1, -1};
        int[] pola_D = {1, 1, 1, 1, 1, 1, -1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, 1, -1, 1, 1, 1, 1, 1, -1, -1};
        int[] pola_E = {1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1, 1, 1, 1, 1, 1, 1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1,};

        //konstanta
        double ALPHA = 0.05;
        double THETA = 0.5;

        //dataset 
        int[][] dataset = {pola_1, pola_2, pola_3, pola_4, pola_5, pola_6, pola_7, pola_8, pola_9, pola_10};
        int[][] dataTesting = {pola_A, pola_B, pola_C, pola_D, pola_E};
        char[] huruf = {'A', 'B', 'C', 'D', 'E'};

        //size
        int inputSize = dataset[0].length;
        int outputSize = huruf.length;
        int lenTraining = dataset.length;

        //encode target
        HashMap<Character, int[]> encodeTarget = new HashMap<>();
        int k = 0;
        for (char c : huruf) {
            int[] target = new int[outputSize];
            for (int i = 0; i < outputSize; i++) {
                target[i] = -1;
            }
            target[k] = 1;
            encodeTarget.put(c, target);
            k++;
        }

        //target data Training
        int[][] targetTraining = {
            encodeTarget.get('A'),
            encodeTarget.get('B'),
            encodeTarget.get('C'),
            encodeTarget.get('D'),
            encodeTarget.get('E'),
            encodeTarget.get('A'),
            encodeTarget.get('B'),
            encodeTarget.get('C'),
            encodeTarget.get('D'),
            encodeTarget.get('E')
        };

        //target data Testing
        char[] targetTesting = {'A', 'B', 'C', 'D', 'E'};

        //Training Perceptron
        double[][] Weight = new double[inputSize][outputSize];
        int epoch = 0;
        int MAX_EPOCH = 1000;
        boolean training = true;
        while (training) {
            epoch++;
            System.out.println("epoch ke- " + epoch);
            int Sama = 0;
            int t = 0;
            for (int[] d : dataset) {
                int[] X = d;
                int[] target = targetTraining[t];

                //hitung net
                double[] net = new double[outputSize];
                for (int i = 0; i < inputSize; i++) {
                    int Xi = X[i];
                    for (int j = 0; j < outputSize; j++) {
                        double wij = Weight[i][j];
                        double xiwij = Xi * wij;
                        net[j] += xiwij;

                    }
                }

                //fungsi aktivasi
                int[] y = new int[outputSize];
                for (int j = 0; j < outputSize; j++) {
                    if (net[j] > THETA) {
                        y[j] = 1;
                    } else if (net[j] >= -THETA) {
                        y[j] = 0;
                    } else {
                        y[j] = -1;
                    }
                }

                //cek update bobot
                double[][] deltaWeight = new double[inputSize][outputSize];
                boolean equals = true;
                for (int j = 0; j < outputSize; j++) {
                    if (target[j] != y[j]) {
                        //menghitung delta Weight
                        for (int i = 0; i < inputSize; i++) {
                            deltaWeight[i][j] = ALPHA * target[j] * X[i];
                        }
                        equals = false;
                    }
                }

                if (equals) {
                    Sama++;
                }

                //UPDATE BOBOT
                for (int i = 0; i < inputSize; i++) {
                    for (int j = 0; j < outputSize; j++) {
                        Weight[i][j] += deltaWeight[i][j];
                    }
                }
                t++;
            }
            //CEK Kondisi Berhenti
            if (Sama == lenTraining || epoch >= MAX_EPOCH) {
                System.out.println("----------------------TRAINING SELESAI----------------------");
                training = false;
            }
            //end Training

        }
        System.out.println("Jumlah Epoch\t: " + epoch);
        System.out.println("Input Size\t: " + inputSize);
        System.out.println("Output Size\t: " + outputSize);
        System.out.println("Theta\t\t: " + THETA);
        System.out.println("Character-------------------------------------------");
        for (Character c : encodeTarget.keySet()) {
            int[] target = encodeTarget.get(c);
            System.out.println(c + " : " + Arrays.toString(target));
        }
        System.out.println("Weight----------------------------------------------");
        int m = 1; //index untuk menampilkan bobot Xi
        for (double[] ds : Weight) {
            if (m == 1) {
                System.out.print("Konstan\t: ");
            } else {
                System.out.print("X[" + (m - 1) + "]\t: ");
            }
            for (int i = 0; i < ds.length; i++) {
                System.out.print(String.format("%.2f\t", ds[i]));
            }
            System.out.println("");
            m++;
        }

        //Testing Data
        System.out.println("\nTesitng Data ---------------------------------------");
        if (Weight != null && dataTesting != null) {
            int dataKe = 0;
            for (int[] dt : dataTesting) {
                int[] X = dataTesting[dataKe];
                char targetHuruf = targetTesting[dataKe];
                if (X.length == Weight.length) {
                    System.out.println("Data ke - " + (++dataKe));
                    System.out.println("Pola\t\t: " + Arrays.toString(X));
                    System.out.println("Target Testing\t: " + targetHuruf);

                    //hitung net
                    double[] net = new double[outputSize];
                    for (int i = 0; i < inputSize; i++) {
                        int Xi = X[i];
                        for (int j = 0; j < outputSize; j++) {
                            double wij = Weight[i][j];
                            double XiWij = Xi * wij;
                            net[j] += XiWij;
                        }
                    }

                    //fungsi aktivasi
                    int[] y = new int[outputSize];
                    for (int j = 0; j < outputSize; j++) {
                        if (net[j] > THETA) {
                            y[j] = 1;
                        } else if (net[j] >= -THETA) {
                            y[j] = 0;
                        } else {
                            y[j] = -1;
                        }
                    }

                    //CHARACTER RECOGNIZE
                    for (Character CR : encodeTarget.keySet()) {
                        int[] target = encodeTarget.get(CR);
                        int sama = 0;
                        for (int j = 0; j < outputSize; j++) {
                            if (target[j] != y[j]) {
                                break;
                            } else {
                                sama++;
                            }
                        }
                        if (sama == outputSize) {
                            System.out.println("Hasil Karakter Peceptron\t: " + CR);
                            System.out.print("Kesimpulan\t: ");
                            if (CR.equals((Character) targetHuruf)) {
                                System.out.println("TRUE");
                            } else {
                                System.out.println("FALSE");
                            }
                            break;
                        }
                    }
                    System.out.println("---------------------------------------------------------------------------------");
                }
            }
        }
    }
}

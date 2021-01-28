package com.Bantu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //variabel
      

        //perulangan ayam
        for (int i = 0; i < 3; i++){
            int ayam;
            System.out.print(" Anak Ayam 10 ");
            System.out.print("Mati " );
            ayam = Integer.parseInt(bf.readLine());
                int tamp = 10 - ayam;
                System.out.println(" tinggal " + tamp);
        }
    }
}

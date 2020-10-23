package main;

import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import classes.Cliente;
import classes.Conta;
import tests.classes.TesteConta;

public class Main{
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("|----------//----------//----------//----------|");
        System.out.println("/n                 Iniciando Testes");
        System.out.println("/n|----------//----------//----------//----------|/n/n/n/n/n");
        
        Result resultado = JUnitCore.runClasses(TesteConta.class);

        System.out.println("|----------//----------//----------//----------|");
        System.out.println("/n                 Falhas");
        System.out.println("/n|----------//----------//----------//----------|/n/n/n/n/n");

        for (Failure failure : resultado.getFailures()){
            System.out.println(failure.getMessage());
        }

        System.out.println("|----------//----------//----------//----------|");
        System.out.println("/nSucesso: " + resultado.wasSuccessful());
        System.out.println("/n|----------//----------//----------//----------|");
        System.out.println("/nLuís Guilherme Ferreira Bizzi - 765631");
}
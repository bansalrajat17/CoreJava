package oopconcepts;

import java.io.IOException;

import oopconcepts.covariant.Employee;

class OopConcepts {

    public static void main(String[] args) throws IOException {

        // COVARIANT RETURN TYPE

        System.out.println("Covariant Return Tyoe" + (new Employee()).get().message());

        // FUNCTIONAL PROGRAMMING

        (new FunctionalProgramming()).lambda();

        StringDemo stringDemo = new StringDemo();
        stringDemo.print();
        Inputting inputting = new Inputting();

        // INPUT BY SCANNER

        // inputting.inputtingByScanner();

        // INPUT BY BUFFER READER

        inputting.inputByBufferReader();

    }

}

package OopConcepts;

import javax.management.ImmutableDescriptor;

public class StringDemo {
    public void print() {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4;
        s4 = s1;
        System.out.println("Equality" + (s1 == s2)); //true
        System.out.println("Equality" + (s1 == s3)); //false
        System.out.println("Equality" + (s1.equals(s3))); //true
        System.out.println("Equality" + (s1 == s4)); //true
        System.out.println("Equality" + s1.equals(s2)); //true

        StringBuffer sb1 = new StringBuffer("Yahoo");
        StringBuffer sb2 = new StringBuffer("Yahoo");
        System.out.println(sb1.equals(sb2));

        //Mutability and Immutablity

        String si = "India";
        String sa = "VS";
        si.concat(sa);
        System.out.println(si);//India

        StringBuffer sb = new StringBuffer(si);
        sb.append(sa);
        System.out.println(sb.toString());//IndiaVS




    }
}

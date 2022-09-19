package basics;

import java.security.spec.RSAOtherPrimeInfo;

public class Operators {
    /*
    Arithmetic Operators:
    +
    -
    *
    /
    %
    ^

    Unary Operators:
    +
    -
    ++
    --
    ! boolean -> !true-<ž> false


    Assigment Operators
    =
    !=
    += -> a+=b je isto što a= a+b
    -=
    *=
    /=
    %=

    Relational Operators - return type is boolean (treba isti tip da upoređujemo)
    ==
    !=
    <=
    >=
    >
    <

    Logical -> return type boolean
    && (log. AND) - svi uslovi moju biti true da bi izvršio komandu
    II (log. or) - ako je samo jedan uslov true ispuniće se
    ! (log. NOT)
    
    Ternarni
    
   if (condition) {
   }
    do 1
    else {
    }
    






     */

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int x = 10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

        int s = 10;
        int z = 10;
        System.out.println(s++ + ++s);
        System.out.println(z++ + z++);

        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue);
        System.out.println(isFalse);

        int e = 10;
        int f = 20;

        System.out.println(e+=5);
        System.out.println(f-=4);

        int g = 3;
        System.out.println(g+=7);
        System.out.println(g-=4);
        System.out.println(g*=2);
        System.out.println(g/=12);

        int h = 200;
        int i = 305;

        System.out.println(h == i);
        System.out.println(h != i);
        System.out.println(h <= i);
        System.out.println(h >= i);
        System.out.println(h > i);
        System.out.println(h < i);

        int j = 10;
        int k = 5;
        int l = 20;

        System.out.println(j == k && k < l);
        System.out.println(j != k || k == 5 );
        System.out.println(k < j && k < l);
        System.out.println(k < j && l++ < j);
        System.out.println(l);
        
        int m = 5;
        int n = 10;
        String trueMesaage = "true";
        String falseMessage = "false";

        ;
        System.out.println(m > n ? trueMesaage : falseMessage);
        System.out.println(m > n ? m : n);


    }


}

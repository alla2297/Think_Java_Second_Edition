package com.company.chapter8;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(prod(1, 4));//15.print(24)
    }

    public static int prod(int m, int n) {
        if (m == n) {                           //1.false 3.false 5.false 7.true
            return n;                           //8.n=1
        } else {                                //
            int recurse = prod(m, n - 1);    //2.n=3 4.n=2 6.n=1
            int result = n * recurse;           //9.n=2_recurse=1 11.n=3_recurse=2 13.n=4_recurse=6
            // under punkt 10. n=2 og da recurse er ((n-1)=1) vil result være ((2*1)=2)
            // under punkt 11. n=3 og og er recurse = result af 10. bliver result(3*2)=6
            // under punkt 13. n=4 og og er recurse = result af 12. bliver result(4*6)=24
            return result;                      //10.result=2 12.result=6 14.result=24
        }                                       //
    }
}
/* jeg gætttede ikke regtig, da jeg ikke forstod "int result = n * recurse;" men med hjælp af Debug tool.
dog jeg for stadig ikke hvorfor "return result" kommer til at tage pladsen af "recurse"
 */
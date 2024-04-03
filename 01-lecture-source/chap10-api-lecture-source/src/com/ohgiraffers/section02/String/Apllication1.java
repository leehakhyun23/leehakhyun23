package com.ohgiraffers.section02.String;

public class Apllication1 {
    public static void main(String[] args) {
        /*String 클래스에 자주 사용하는 메소드에 대해 숙지하고 응용 할 수 있다.*/
        /*
        * charAt() : 해당 문자열의 인덱스에 해당하는 문자를 반환한다.
        * 인덱스는 0부터 시작하는 숫자체계를 의미하며
        * 인덱스를 벗어난 정수를 인자로 전달하는 경우 indexOutBoundsException이 발생한다.
        *
        * */

        String str  = "apple";
        for(int i = 0; i < 5; i++){
            System.out.println("ChatAt("+ i+") :" + str.charAt(i));
        }

        /*
        * compareTo() : 인자로 전달된 문자열과 사전 순으로 비교하여
        * 두 문자열이 같으면 0을 반환, 전달한 문자열보다 작으면 음수를
        * 크면 양수를 반환한다.
        * 단, 이 메소드는 대소문자를 구분하여 비교한다.
        * */

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo() : " + (str2.compareTo(str3))); // 0
        System.out.println("compareTo() : " + (str4.compareTo(str2))); // -32
        System.out.println("compareTo() : " + (str2.compareTo(str4))); // 32

        System.out.println("compareTo() : " + (str2.compareTo(str5))); //-5
        System.out.println("compareTo() : " + (str5.compareTo(str2))); //5

        /* concat() : 문자열에 인자로 전달한 문자열을 합치기 해서 새로운 문자열을 반환한다.
        * 원본문자열에는 영향을 주지 않는다.
        * */

        System.out.println("Concat() : " + (str2.concat(str5)));

        /*indexOF() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다
        * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
        * */

        String str10 = "java oracle";
        System.out.println("indexOf('a') : " + str10.indexOf('a'));

        /*
        * lastIndexOf() : 문자열 탐색을 뒤에서 부터 하고 처음일치하는 위치의 인덱스를 반환한다.
        * 단, 일치하는 문자가 없는 경우 -1 반환*/
        System.out.println("lastindexOf('a') : " + str10.lastIndexOf('a'));
        System.out.println("lastindexOf('z') : " + str10.lastIndexOf('z'));

        /*
        * trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다. */
        String trimStr = "   java   "; // 앞뒤 공백 3칸
        System.out.println("trimStr = #" + trimStr + "#");
        System.out.println("trimStr = #" + trimStr.trim() + "#");

        /*
        * toLowerCase() : 모든 문자를 소문자로 변경
        * toUpperCase() : 모든 문자를 대문자로 변경한다.
        * */

        String caseStr = "JavaOracle";
        System.out.println("downpercase : " + caseStr.toLowerCase());
        System.out.println("Uppercase : " + caseStr.toUpperCase());

        /*
        * substring() : 문자열 일부분을 잘라내어 새로운 문자열을 반환한다.
        *
        */

        System.out.println("substring(2,5) = " + caseStr.substring(2,5));
        System.out.println("substring(2) = " + caseStr.substring(2));

        /* replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환한다. */
        System.out.println(caseStr.replace("Java", "python"));

        /* length() : 문자열의 길이를 반환 */
        System.out.println(caseStr.length());
        System.out.println(" 빈 문자열의 길이 "+ ("  ".length()));

        /*isEmpty() : 문자열의 길이가 0이면 true , 아니면 false 반환 */
        System.out.println(caseStr.isEmpty());

    }
}

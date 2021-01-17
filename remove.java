public class Roman {
    public static void main(String[] args) {
        System.out.println(intToRoman(8));
        System.out.println(intToRoman(88));
        System.out.println(intToRoman(888));
 
    }
    public static String intToRoman(int num)
    {
        String[] Thousands= {"","M","MM","MMM"};
        String[] Hundreds={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] Tens={"","X","XX","XL","L","LX","LXX","LXXX","XC"};
        String[] Units={"","I","II","III","IV","V","VI","VII","VIII","IX"};

        return Thousands[num/1000]+Hundreds[(num%1000)/100]+Tens[(num%100)/10]+Units[num%10];
    }
}

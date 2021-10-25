package ru.mirea.inbo0220.markaryants.pr12;
import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, housing, flat;

    public Address(String stringToParse, boolean multiDivider){
        if(stringToParse == null) throw new NullPointerException();
        String[] s;
        if(multiDivider){
            StringTokenizer st = new StringTokenizer(stringToParse, ",.;");
            s = new String[st.countTokens()];
            int i = 0;
            while(st.hasMoreTokens()) s[i++] = st.nextToken();
        }else{
            s = stringToParse.split(",");
        }

        if(s.length < 7) throw new IllegalArgumentException("Строка содержит недостаточно данных!");
        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        housing = s[5].trim();
        flat = s[6].trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", housing='" + housing + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Address a1 = new Address("Страна, Регион, Город, Улица, Дом, Корпус, Квартира", false);
        Address a2 = new Address("Россия, Московская область, Москва, Проспект Вернадского, 78, 4, 101", true);

        System.out.println(a1);
        System.out.println(a2);

    }
}

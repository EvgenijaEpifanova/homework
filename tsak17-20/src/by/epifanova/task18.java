package by.epifanova;

public class task18 {
    public static void main(String[] args) {
        String str = "Сижу за решеткой в темнице сырой.\n" +
                "Вскормленный в неволе орел молодой,\n" +
                "Мой грустный товарищ, махая крылом,\n" +
                "Кровавую пищу клюет под окном,\n" +
                "\n" +
                "Клюет, и бросает, и смотрит в окно,\n" +
                "Как будто со мною задумал одно.\n" +
                "Зовет меня взглядом и криком своим\n" +
                "И вымолвить хочет: «Давай улетим!\n" +
                "\n" +
                "Мы вольные птицы; пора, брат, пора!\n" +
                "Туда, где за тучей белеет гора,\n" +
                "Туда, где синеют морские края,\n" +
                "Туда, где гуляем лишь ветер... да я!...»";
        int n = 0;

        char symbol;

        for ( int i = 0; i<str.length(); i++){
            symbol = str.charAt(i);
            if (symbol == ',')
                n++;

        }
        System.out.println(" У нас есть " + n + " запятых");


        int k = 0;
        char symbol1;

        for(int i =0;i<str.length();i++){
            symbol1 = str.charAt(i);
            if (symbol1=='.')
            k++;
        }
        System.out.println(" У нас есть " + k + " точек");


        int f = 0;
        char symbol2;

        for(int i =0;i<str.length();i++){
            symbol2 = str.charAt(i);
            if (symbol2=='!')
                f++;
        }
        System.out.println(" У нас есть " + f + " восклицательных знака");




    }


}

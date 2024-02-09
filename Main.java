/*
    Bu derste ArrayListler ile LinkedListler arasındaki farkı anlamaya çalışacağız.
    Hoca görsel anlatım üzerinden de anlatmaya çalışacak.

    Örneğin; ArrayListte yukarı kısımdaki bir indekse yeni bir satır eklemek istiyoruz.
    Yeni satır listenin en altında oluşturulacak. Mevcut yazılı satırdaki data silinerek indeks boşalacak. Silinen data
    bir alt satıra kaydırılacak. Altındaki datalar da yine aynı şekilde sürekli olarak bir kademe aşağı kayacak. Bu büyük
    projelerde çok daha fazla işlem demek. Yani şuanki gibi 5-6 satır değil de 1.000.000.000 satır olsaydı ciddi bir
    işlem maliyetine ve performans zayıflığına sebebiyet verecekti.
    Bunun yerine her bir indeksi bireysel olarak değerlendirebileceğimiz ve diğer indeksleri etkilemeyecek olan
    LinkedListleri kullanıyoruz. Performans kaybı yaşamıyoruz.
    LinkedListlerde liste içerisindeki tüm indeksler yine birbirine bağlı fakat herhangi bir indeks özelinde işlem
    yaptığımızda diğerleri etkilenmiyor.
    Her bir obje bir obje  referansı ile başka bir objeye bağlı.

    Veri yapılarıyla ilgileniyorsak önemli: Javada artısı olan birşeyin eksisi de olabiliyor elbetteki;

    ArrayList Negatif Yönü : Listede çok satır olduğunda performans sorunları yaratacaktır.

    LinkedList Negatif Yönü : Her bir indekste hem bir objenin değerini hem de kendisine bağlı bir diğer objenin
    referansını taşıdığı için projede ciddi bir alan kaplayacaktır.

*/


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> diller = new ArrayList<String>();

        diller.add("Java");
        diller.add("Php");
        diller.add("Python");
        diller.add("Kotlin");
        diller.add("C#");

        /*for (int i = 0 ; i < diller.size() ; i++) { //Bastırmanın uzun yolu. Foreach döngüsü ile kısa yolunu bastıracağız. //1
            System.out.println(diller.get(i));

        }*/
        for(String s : diller) { //Foreach döngüsüyle ArrayListleri kısa yolla bastırabiliyoruz.
            System.out.println(s);
        }
        System.out.println("-----------------------------------------------");
        diller.add(1,"C++"); //1. indeks'e C++ ekledik.
        for(String s : diller) { //Foreach döngüsüyle ArrayListleri kısa yolla bastırabiliyoruz.
            System.out.println(s);
        }


    }
}

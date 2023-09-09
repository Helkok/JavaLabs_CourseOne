package lab8.Lab6;


import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        Collection collection = new Collection("Рок", "Пионер");
        Album album = new Album("Кино", "Русский рок", 1990);
        collection.addAlbum(album);

        Composition composition = new Song("Кончится лето", 5.56, """
                Я выключаю телевизор
                Я пишу тебе письмо
                Про то, что больше не могу
                Смотреть на дерьмо""", "Цой В.Р., Каспарян Ю., Тихомиров И.Р., Гурьянов Г.К.");

        Composition composition1 = new Song("Красно-жёлтые дни", 5.50, """
                Застоялся мой поезд в депо
                Снова я уезжаю, пора
                На пороге ветер заждался меня
                На пороге осень — моя сестра""", "Цой В.Р., Каспарян Ю., Тихомиров И.Р., Гурьянов Г.К.");

        Composition composition2 = new Song("Нам с тобой", 4.49, """
                Здесь не понятно, где лицо, а где рыло
                И не понятно, где пряник, где плеть
                Здесь в сено не втыкаются вилы
                А рыба проходит сквозь сеть
                И не ясно, где море, где суша
                Где золото, а где медь
                Что построить, и что разрушить
                И кому, и зачем здесь петь""", "Цой В.Р., Каспарян Ю., Тихомиров И.Р., Гурьянов Г.К.");

        Composition composition3 = new Song("Звезда", 4.40 , """
                Волчий вой да лай собак
                Крепко до боли сжатый кулак
                Птицей стучится в жилах кровь
                Вера да надежда, любовь""",  "Цой В.Р., Каспарян Ю., Тихомиров И.Р., Гурьянов Г.К.");

        album.addComposition(composition);
        album.addComposition(composition1);
        album.addComposition(composition2);
        album.addComposition(composition3);

        Album album1 = new Album("Nautilus Pompilius", "Русский рок", 1995);
        collection.addAlbum(album1);

        Composition composition4 = new Song("Крылья", 3.45 , """
                Ты снимаешь вечернее платье, стоя лицом к стене
                И я вижу свежие шрамы на гладкой, как бархат, спине
                Мне хочется плакать от боли или забыться во сне
                Где твои крылья, которые так нравились мне?
                """, "Бутусов В.Г., Кормильцев И.В.");
        Composition composition5 = new Song("Железнодорожник", 5.08, """
                Последний поезд на небо отправится в полночь
                С полустанка покрытого шапкой снегов
                Железнодорожник вернётся в каморку
                Уляжется в койку, не сняв сапогов""", "Бутусов В.Г., Кормильцев И.В.");
        Composition composition6 = new Song("Дыхание" , 3.39, """
                Я просыпаюсь в холодном поту
                Я просыпаюсь в кошмарном бреду
                Как будто дом наш залило водой
                И что в живых остались только мы с тобой""", "Бутусов В.Г., Кормильцев И.В.");
        album1.addComposition(composition4);
        album1.addComposition(composition5);
        album1.addComposition(composition6);
        saveCollection("/Users/alexander/eclipse-workspace/lab8/src/lab8/Lab6/ReportCollection.xml", collection);
        Collection collection1 = getCollection("/Users/alexander/eclipse-workspace/lab8/src/lab8/Lab6/ReportCollection.xml");
        System.out.println(collection1);
    }


    public static Collection getCollection(String fileName) {
        try(XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream(fileName))){
            return (Collection) xmlDecoder.readObject();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static void saveCollection(String fileName, Collection saveCollection){
        try(XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(fileName))){
            xmlEncoder.writeObject(saveCollection);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

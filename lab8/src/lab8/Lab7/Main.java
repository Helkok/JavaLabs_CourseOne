package lab8.Lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static JFrame jFrame = getJFrame();
    static int numb_rows_panel = 2;
    static JPanel jPanel = new JPanel(new GridLayout(numb_rows_panel, 2));
    static JPanel jPanel1 = new JPanel();

    public static void main(String[] args)  {

        Collection collection = createCollection();
        JTabbedPane jTabbedPane = new JTabbedPane();
        jFrame.add(jTabbedPane);
        jTabbedPane.add(jPanel, "Info about composition");
        jTabbedPane.add(jPanel1, "Album");
        setJPanelAlbum(collection);
        setJPanelComposition(collection);
        jFrame.pack();
    }

    static void setJPanelComposition(Collection collection){
        jPanel1.removeAll();
        List<Composition> compositionList = new ArrayList<>();
        for(Album album: collection.getAlbums()){
            compositionList.addAll(album.getCompositionList());
        }

        DefaultListModel<Composition> defaultListModel = new DefaultListModel<>();
        defaultListModel.addAll(compositionList);
        JList<Composition> jList = new JList<>(defaultListModel);
        jPanel1.add(jList);

        JButton jButton = new JButton("Form description");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Composition composition = jList.getSelectedValue();
                JOptionPane.showMessageDialog(jButton, composition.formDesc());
            }
        });
        jPanel1.add(jButton);
        jFrame.pack();

    }

    static void setJPanelAlbum(Collection collection) {
        jPanel.removeAll();
        numb_rows_panel = collection.getAlbums().size();
        jPanel.setLayout(new GridLayout(numb_rows_panel, 2));

        for (Album album : collection.getAlbums()) {
            JLabel jLabel = new JLabel(album.getAuthor());
            JTextField jTextField = new JTextField("Genre: " + album.getGenre() +
                    ", Date: " + album.getDate() + ", General duration: " + Math.round(album.getDuration()));
            jPanel.add(jLabel);
            jPanel.add(jTextField);
        }
    }

    static JFrame getJFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 300, dimension.height / 2 - 300, 600, 500);
        jFrame.setTitle("My app");
        return jFrame;
    }

    public static Collection createCollection(){
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

        return collection;
    }
}

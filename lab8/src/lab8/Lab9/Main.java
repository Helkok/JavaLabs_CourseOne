package lab8.Lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static JFrame jFrame = getJFrame();
    static int numb_rows_panel = 2;
    static JPanel jPanel = new JPanel(new GridLayout(numb_rows_panel, 2));
    static JPanel jPanel1 = new JPanel();
    static JMenuBar jMenuBar = new JMenuBar();
    static JMenu jMenu;

    static JMenu jMenuFile = new JMenu("File");
    static JMenuItem jMenuItemNew = new JMenuItem("New");;
    static JMenuItem jMenuItemOpen = new JMenuItem("Open");
    static JMenuItem jMenuItemSave = new JMenuItem("Save");

    static Collection  collection;

    static JTabbedPane jTabbedPane = new JTabbedPane();


    public static void main(String[] args)  {
        start();

        jMenuItemNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField jTextField = new JTextField();
                JTextField jTextField1 = new JTextField();

                final JComponent[] inputs = new JComponent[]{
                        new JLabel("Collection name: "),
                        jTextField,
                        new JLabel("Owner name: "),
                        jTextField1
                };

                int result = JOptionPane.showConfirmDialog(null, inputs, "Creating collection", JOptionPane.OK_CANCEL_OPTION);

                if (result == JOptionPane.OK_OPTION) {

                    collection = new Collection(jTextField.getText(),jTextField1.getText());
                    jFrame.setTitle(jTextField.getText());
                    show();
                }

            }
        });

        jMenuItemSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jFileChooser = new JFileChooser();

                int i = jFileChooser.showSaveDialog(null);
                if(i == JFileChooser.APPROVE_OPTION){
                    String filepath = jFileChooser.getSelectedFile().getPath() + ".xml";
                    saveCollection(filepath,collection);
                }
            }
        });

        //"open"
        jMenuItemOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser jFileChooser = new JFileChooser("\\Users\\alexander\\eclipse-workspace\\lab8\\src\\lab8\\Lab9");
                int i = jFileChooser.showOpenDialog(null);
                if(i == JFileChooser.APPROVE_OPTION){
                    String filepath = jFileChooser.getSelectedFile().getPath() ;
                    collection = getCollection(filepath);
                    jFrame.setTitle(collection.getName());
                    show();
                }
            }
        });

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

    static void show() {
        jMenuBar.removeAll();
        start();

        jFrame.add(jTabbedPane);
        jTabbedPane.add(jPanel, "Album");
        jTabbedPane.add(jPanel1, "Info about composition");

        setJPanelAlbum(collection);
        setJPanelComposition(collection);

        jFrame.setJMenuBar(jMenuBar);
        jMenu = new JMenu("Create");
        JMenuItem jMenuItem = new JMenuItem("Song");
        JMenuItem jMenuItem1 = new JMenuItem("Instrumental");
        JMenuItem jMenuItem2 = new JMenuItem("Album");
        jMenu.add(jMenuItem);
        jMenu.add(jMenuItem1);
        jMenu.add(jMenuItem2);
        jMenuBar.add(jMenu);

        jMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField jTextField = new JTextField();
                JTextField jTextField1 = new JTextField();
                JTextField jTextField2 = new JTextField();
                JTextField jTextField3 = new JTextField();

                DefaultListModel<Album> defaultListModel = new DefaultListModel<>();
                defaultListModel.addAll(collection.getAlbums());
                JList<Album> albumJList = new JList<>(defaultListModel);


                final JComponent[] inputs = new JComponent[]{
                        new JLabel("Name:"),
                        jTextField,
                        new JLabel("Duration:"),
                        jTextField1,
                        new JLabel("Text"),
                        jTextField2,
                        new JLabel("Text author "),
                        jTextField3,
                        new JLabel("Albums "),
                        albumJList
                };

                int result = JOptionPane.showConfirmDialog(null, inputs, "Creating song", JOptionPane.OK_CANCEL_OPTION);
                if(result ==0) {
                    Composition song = new Song(jTextField.getText(),
                            Double.parseDouble(jTextField1.getText()), jTextField2.getText(), jTextField3.getText());
                    albumJList.getSelectedValue().addComposition(song);

                    setJPanelAlbum(collection);
                    setJPanelComposition(collection);

                }

            }
        });

        jMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField jTextField = new JTextField();
                JTextField jTextField1 = new JTextField();
                JTextField jTextField2 = new JTextField();


                DefaultListModel<Album> defaultListModel = new DefaultListModel<>();
                defaultListModel.addAll(collection.getAlbums());
                JList<Album> albumJList = new JList<>(defaultListModel);

                final JComponent[] inputs = new JComponent[]{
                        new JLabel("Name:"),
                        jTextField,
                        new JLabel("Duration:"),
                        jTextField1,
                        new JLabel("Instruments"),
                        jTextField2,
                        new JLabel("Albums "),
                        albumJList
                };
                int result = JOptionPane.showConfirmDialog(null, inputs, "Creating instrumental", JOptionPane.OK_CANCEL_OPTION);
                if(result ==0) {
                    Instrumental instrumental = new Instrumental(jTextField.getText(),
                            Double.parseDouble(jTextField1.getText()),jTextField2.getText());

                    setJPanelAlbum(collection);
                    setJPanelComposition(collection);

                }


            }
        });

        jMenuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField jTextField = new JTextField();
                JTextField jTextField1 = new JTextField();
                JTextField jTextField2 = new JTextField();

                final JComponent[] inputs = new JComponent[]{
                        new JLabel("Author"),
                        jTextField,
                        new JLabel("Genre"),
                        jTextField1,
                        new JLabel("Date"),
                        jTextField2
                };

                int result = JOptionPane.showConfirmDialog(null, inputs, "Creating album", JOptionPane.OK_CANCEL_OPTION);
                if(result == 0){
                    collection.addAlbum(new Album(jTextField.getText(),
                            jTextField1.getText(), Integer.parseInt(jTextField2.getText())));
                    setJPanelAlbum(collection);
                    setJPanelComposition(collection);
                    jFrame.pack();
                }

            }
        });


    }
    static void start(){
        jMenuFile.add(jMenuItemNew);
        jMenuFile.add(jMenuItemOpen);
        jMenuFile.add(jMenuItemSave);
        jMenuBar.add(jMenuFile);
        jFrame.setJMenuBar(jMenuBar);
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

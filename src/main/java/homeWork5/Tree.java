package homeWork5;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Класс для вывода дерева директорий и файлов.
 */
public class Tree {

    /**
     * Точка входа в программу. Выводит дерево директорий и файлов начиная с текущей директории.
     * @param args аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        printTree(new File("."));
    }

    /**
     * Метод выводит дерево директорий и файлов для указанной директории.
     * @param file директория, для которой выводится дерево.
     */
    static void printTree(File file) {
        print(file, "");
    }

    /**
     * Метод выводит дерево директорий и файлов для указанной директории с использованием отступов.
     * @param file   директория, для которой выводится дерево.
     * @param indent отступ для текущего уровня вложенности.
     */
    static void print(File file, String indent) {
        print(file, indent, true);
    }

    /**
     * Метод выводит дерево директорий и файлов для указанной директории с использованием отступов и
     * указывает, является ли текущий элемент последним на данном уровне вложенности.
     * @param file   директория, для которой выводится дерево.
     * @param indent отступ для текущего уровня вложенности.
     * @param isLast является ли текущий элемент последним на данном уровне вложенности.
     */
    static void print(File file, String indent, boolean isLast) {
        System.out.print(indent);
        if (isLast) {
            System.out.print("└─");
            indent += " ";
        } else {
            System.out.print("├─");
            indent += "│ ";
        }
        System.out.println(file.getName());

        File[] files = file.listFiles();
        if (files == null)
            return;

        // Сортируем файлы и директории
        Arrays.sort(files, (file1, file2) -> {
            boolean isDir1 = file1.isDirectory();
            boolean isDir2 = file2.isDirectory();

            // Приоритет для директорий (сначала директории)
            if (isDir1 && !isDir2) {
                return -1; // file1 - директория, file2 - файл (file1 раньше)
            }
            if (!isDir1 && isDir2) {
                return 1; // file1 - файл, file2 - директория (file2 раньше)
            }

            // Если оба файла или обе директории, сортируем по имени
            return file1.getName().compareTo(file2.getName());

        });

        // Специальная сортировка для .idea, backup, src, target
        Arrays.sort(files, (file1, file2) -> {
           String name1 = file1.getName();
           String name2 = file2.getName();

           if (file1.isDirectory() && file2.isDirectory()) {
               if (name1.equals(".idea") && !name2.equals(".idea")) return -1;
               if (name1.equals("backup") && !name2.equals(".idea") && !name2.equals("backup")) return -1;
               if (name1.equals("src") && !name2.equals(".idea") && !name2.equals("backup") && !name2.equals("src")) return -1;
               if (name1.equals("target") && !name2.equals(".idea") && !name2.equals("backup") && !name2.equals("src") && !name2.equals("target")) return -1;
           }
           return 0;
        });
        int subDirTotal = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                subDirTotal++;
            }
        }

        int subDirCounter = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                print(files[i], indent, subDirTotal == ++subDirCounter);
            }
        }
    }
}

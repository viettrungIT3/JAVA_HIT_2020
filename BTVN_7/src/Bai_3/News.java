package Bai_3;

import java.util.Scanner;

public class News implements INews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private double averageRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public void Display() {
//        System.out.println("id=" + id +
//                ", title='" + title + '\'' +
//                ", publishDate='" + publishDate + '\'' +
//                ", author='" + author + '\'' +
//                ", content='" + content + '\'' +
//                ", averageRate=" + averageRate);
        System.out.printf("%15s %15s %15s %15s %15s ", id, publishDate, author, content, averageRate);
        System.out.println();
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", averageRate=" + averageRate +
                '}';
    }

    public int[] rateList = new int[3];

    public void InputRate(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter in turn 3 point: ");
        for(int i = 0; i < 3; i++){
            rateList[i] = sc.nextInt();
        }
    }

    public void Calculate(){
        int sum = 0;
        for(int i = 0; i < 3; i++){
            sum += rateList[i];
        }
        this.averageRate = 1.0 * sum / 3;
    }
}

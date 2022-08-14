package ru.netology.mvnjava1.services;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 10;
        post.birthday.year = 1983;


        post.name = "Андрей";
        post.passport = "9205 № 444555";
        post.patronymic = "Андреевич";
        post.phone = "+7(974)-444-55-66";
        post.surname = "Андреев";
        post.subscription = "true";


    }


}

package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerPosterTest {

    ManagerPoster poster = new ManagerPoster();


    Film one = new Film(1, "Бладшот");
    Film two = new Film(2, "Вперед");
    Film three = new Film(3, "Отель");
    Film four = new Film(4, "Джентельмены");
    Film five = new Film(5, "Человек невидимка");
    Film six = new Film(6, "Тролли");
    Film seven = new Film(7, "Номер один");
    Film eight = new Film(8, "Назад");
    Film nine = new Film(9, "Время");
    Film ten = new Film(10, "Геркулес");
    Film eleven = new Film(10, "Воля");


    @Test
    public void addOneFilms() {
        poster.addFilms(one);

        Film[] expected = {one};
        Film[] actual = poster.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addThreeFilms() {
        poster.addFilms(one);
        poster.addFilms(two);
        poster.addFilms(three);

        Film[] expected = {one, two, three};
        Film[] actual = poster.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addTenFilms() {

        poster.addFilms(one);
        poster.addFilms(two);
        poster.addFilms(three);
        poster.addFilms(four);
        poster.addFilms(five);
        poster.addFilms(six);
        poster.addFilms(seven);
        poster.addFilms(eight);
        poster.addFilms(nine);
        poster.addFilms(ten);

        Film[] expected = {one, two, three, four, five, six, seven, eight, nine, ten};
        Film[] actual = poster.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addElevenFilms() {
        poster.addFilms(one);
        poster.addFilms(two);
        poster.addFilms(three);
        poster.addFilms(four);
        poster.addFilms(five);
        poster.addFilms(six);
        poster.addFilms(seven);
        poster.addFilms(eight);
        poster.addFilms(nine);
        poster.addFilms(ten);
        poster.addFilms(eleven);

        Film[] expected = {one, two, three, four, five, six, seven, eight, nine, ten, eleven};
        Film[] actual = poster.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void extraditionNonFilms() {
        Film[] expected = {};
        Film[] actual = poster.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void extraditionOneFilms() {
        poster.addFilms(one);

        Film[] expected = {one};
        Film[] actual = poster.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void extraditionTwoFilms() {
        poster.addFilms(one);
        poster.addFilms(two);

        Film[] expected = {two, one};
        Film[] actual = poster.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void extraditionTenFilms() {

        poster.addFilms(one);
        poster.addFilms(two);
        poster.addFilms(three);
        poster.addFilms(four);
        poster.addFilms(five);
        poster.addFilms(six);
        poster.addFilms(seven);
        poster.addFilms(eight);
        poster.addFilms(nine);
        poster.addFilms(ten);

        Film[] expected = {ten, nine, eight, seven, six, five, four, three, two, one};
        Film[] actual = poster.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void extraditionElevenFilms() {

        poster.addFilms(one);
        poster.addFilms(two);
        poster.addFilms(three);
        poster.addFilms(four);
        poster.addFilms(five);
        poster.addFilms(six);
        poster.addFilms(seven);
        poster.addFilms(eight);
        poster.addFilms(nine);
        poster.addFilms(ten);
        poster.addFilms(eleven);

        Film[] expected = {eleven, ten, nine, eight, seven, six, five, four, three, two};
        Film[] actual = poster.findLast();

        assertArrayEquals(expected, actual);
    }
}
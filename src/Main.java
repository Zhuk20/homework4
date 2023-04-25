import java.lang.String;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1(){
        System.out.println("Задание 1");
        int years = 17;
        if (years >= 18){
            System.out.println("Если возраст человека равен " + years + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + years + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
        public static void task2(){
        System.out.println("Задание 2");
        int c = 5;
        if (c < 5){
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
        public static void task3(){
        System.out.println("Задание 3");
        int spead = 61;
        if (spead > 60){
            System.out.println("Если скорость " + spead + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + spead + ", то можно ездить спокойно");
        }
    }
        public static void task4(){
            System.out.println("Задание 4");
        int years = 27;
        if (years <0){
            System.out.println("Введите верное значение");
        } else if (years >= 0 && years <2){
            System.out.println("Если возраст человека равен " + years + ", то ему пора спать.");
        } else if (years >=2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в детский сад.");
        } else if (years >=7 && years <= 18) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в школу.");
        } else if (years >=18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + ", то его место в университете.");
        } else if (years >=24 && years < 60) {
            System.out.println("Если возраст человека равен " + years + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + years + ", то он может отдохнуть.");
        }
    }
        public static void task5(){
            System.out.println("Задание 5");
            int years = 5;
            if (years >= 0 && years < 5){
                System.out.println("Если возраст ребенка равен " + years + ", то он не может кататься на аттракционе");
            } else if (years >=5 && years <= 14) {
                System.out.println("Если возраст ребенка равен " + years + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
            } else if (years >14) {
                System.out.println("Если возраст ребенка равен " + years + ", то он может кататься без сопровождения взрослого.");
            } else {
                System.out.println("Введите верное значение");
            }
    }
        public static void task6(){
            System.out.println("Задание 6");
        int countSeats = 120;
        if (countSeats < 0){
            System.out.println("Введите верное значение");
        } else if (countSeats >= 0 && countSeats <=60) {
            System.out.println("В вагоне есть сидячее место");
        } else if (countSeats > 60 && countSeats <= 102) {
            System.out.println("В вагоне остались только стоячее места");
        } else {
            System.out.println("Вагон полностью забит");
        }
    }
        public static void task7(){
        System.out.println("Задание 7");
        int one = 3;
        int two = 3;
        int three = 2;
        // решение при гарантии того, что все переменные отличаются друг от друга
        if (one > two && one > three){
            System.out.println("Самая большая переменная one = " + one);
        } else if (two > one && two > three) {
            System.out.println("Самая большая переменная two = " + two);
        } else {
            System.out.println("Самая большая переменная three = " + three);
        }
        }
}
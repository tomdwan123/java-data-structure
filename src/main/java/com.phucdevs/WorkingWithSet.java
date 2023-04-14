package com.phucdevs;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WorkingWithSet {

    public static void main(String[] args) {

        Set<Ball> ballSet = new HashSet<>();
        ballSet.add(new Ball("yellow"));
        ballSet.add(new Ball("yellow"));
        ballSet.add(new Ball("blue"));
        ballSet.add(new Ball("red"));

        System.out.println(ballSet);
        System.out.println(ballSet.size());
        ballSet.forEach(System.out::println);
    }

    static class Ball {
        String color;

        public Ball(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
}

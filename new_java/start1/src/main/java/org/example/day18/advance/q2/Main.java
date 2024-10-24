package org.example.day18.advance.q2;

public class Main {
    public static void main(String[] args) {
        Girl g = new Girl();

        g.action(p -> System.out.printf("%s할 때는 white 드레스를 입는다.\n", p));

        g.actions2((name, price, count) -> {
            System.out.printf("나는 매일 %s 후 %d원짜리 음료 %d개를 %d원 주고 사먹는다.\n", name, price, count, price * count);
        });
    }
}

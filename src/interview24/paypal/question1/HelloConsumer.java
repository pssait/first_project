package interview24.paypal.question1;


import java.util.function.Consumer;

@FunctionalInterface
public interface HelloConsumer extends Consumer<String> {
    @Override
    void accept(String s);
}

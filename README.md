# Java-Lambda-Sample
Java lambda를 공부해보자.

## 1. @Functional Interface
하나의 추상 메서드가 선언된 인터페이스만이 람다식을 참조할 수 있다. 두 개 이상의 추상 메서드를 선언하지 않도록 강제해 주는것이 @FunctionaInterface이다.

```java
@FunctionalInterface
public interface MyFunctionalInterface {
    void method();
}
```

오직 하나의 추상 메서드를 선언해야 하지만 default 메서드나 static 메서드는 여러개 사용할 수 있다.

```java
@FunctionalInterface
public interface Function<T, R> {
    R apply(T var1);

    default <V> Function<V, R> compose(Function<? super V, ? extends T> var1) {
        Objects.requireNonNull(var1);
        return (var2) -> {
            return this.apply(var1.apply(var2));
        };
    }

    default <V> Function<T, V> andThen(Function<? super R, ? extends V> var1) {
        Objects.requireNonNull(var1);
        return (var2) -> {
            return var1.apply(this.apply(var2));
        };
    }

    static <T> Function<T, T> identity() {
        return (var0) -> {
            return var0;
        };
    }
}
```

java.util.function 패키지에 있는 Function 인터페이스를 발췌하였다. 하나의 추상메서드가 존재한다.

## 2. Predicate (조건식의 표현)

자주 쓰이는 기본적인 함수형 인터페이스 중 하나이다. 미리 정의해놓아 매번 함수형 인터페이스를 정의할 필요가 없고 재사용성과 유지보수성이 좋다.

```java
Predicate<String> isEmptyStr = new Predicate<String>() {
    @Override
    public boolean test(String s) {
        if(s.length() == 0) {
            return true;
        }
        return false;
    }
};
```

그냥 정의했을 때는 Predicate 안에 있는 test 메서드를 오버라이드해야한다. 이것을 람다식으로 바꾸게 되면

```java
Predicate<String> isEmptyStr = s -> s.length() == 0;
```
한 줄로 끝낼 수 있다.





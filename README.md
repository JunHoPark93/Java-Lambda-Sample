# Java-Lambda-Sample
Java lambda

## 1. @Functional Interface
하나의 추상 메소드가 선언된 인터페이스만이 람다식을 참조할 수 있다. 두 개 이상의 추상 메소드를 선언하지 않도록 강제해 주는것이 @FunctionaInterface이다.

```java
@FunctionalInterface
public interface MyFunctionalInterface {
    void method();
}
```



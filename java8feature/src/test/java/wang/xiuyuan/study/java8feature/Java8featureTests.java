//package wang.xiuyuan.study.java8feature;
//
//import java.util.Optional;
//
///**
// * <p>
// * Happy work, happy live
// * </p>
// *
// * @author proc
// * @since 2019/11/25
// */
//public class Java8featureTests {
//
//    public static void main(String args[]) {
//
//        Java8featureTests java8Tester = new Java8featureTests();
//        Integer value2 = 10;
//
//        // Optional.ofNullable - 允许传递为 null 参数
//        Optional<Integer> a = Optional.empty();
//
//        // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
//        Optional<Integer> b = Optional.of(value2);
//        System.out.println(java8Tester.sum(a, b));
//    }
//
//    private Integer sum(Integer a, Integer b) {
//
//        // Optional.isPresent - 判断值是否存在
//
//        System.out.println("第一个参数值存在: " + a.isPresent());
//        System.out.println("第二个参数值存在: " + b.isPresent());
//
//        // Optional.orElse - 如果值存在，返回它，否则返回默认值
//        Integer value1 = a.orElse(0);
//
//        //Optional.get - 获取值，值需要存在
//        Integer value2 = b.get();
//        return value1 + value2;
//    }
//}

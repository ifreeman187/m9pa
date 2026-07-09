import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConceptDemo {
    public static void main(String[] args) {
        Integer[] numberArray = {5, 2, 9, 1, 4, 7};
        ArrayAdapter adapter = new ArrayAdapter(numberArray);
        List<Integer> numbers = adapter.toList();
        System.out.println("Before sorting: " + numbers);
        Collections.sort(numbers);
        System.out.println("After sorting: " + numbers);
        numbers.remove(Integer.valueOf(4));
        System.out.println("After removing 4: " + numbers);
        printList(numbers);
    }
    public static void printList(List<?> list) {
        System.out.println(
                "Printing list using unbounded wildcard: " + list);
    }
}

class ArrayAdapter {

    private Integer[] array;

    public ArrayAdapter(Integer[] array) {
        this.array = array;
    }

    public List<Integer> toList() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }
}
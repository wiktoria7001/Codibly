import java.util.*;

public class BubbleSort {
    public List<Comparable> sort(List<Comparable> input) {
        if(input==null)
            throw new IllegalArgumentException("Input cannot be null");
        List<Comparable> inputList = new ArrayList<>();
        inputList.addAll(input);
        inputList.removeIf(Objects::isNull);
        for (int i = 0; i < inputList.size() - 1; i++) {
            for (int j = 0; j < inputList.size() - i - 1; j++) {
                if (inputList.get(j) != null && inputList.get(j + 1) != null) {
                    if (inputList.get(j).compareTo(inputList.get(j + 1)) > 0) {
                        Comparable temp = inputList.get(j);
                        inputList.set(j, inputList.get(j + 1));
                        inputList.set(j + 1, temp);
                    }
                }
            }
        }
        return inputList;
    }

}


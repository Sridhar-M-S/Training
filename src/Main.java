import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        String n1= "\"Student\":{\"Name\":\"Sri\",\"Age\":\"21\",\"Class\":\"12\"},\"Class\":\"12\"";
//        String[] questions = {"Student.Name","Student.Age","Student.Class"};
//        String[] ans = n1.split("\"");
//        for(String question: questions)
//            calculate(question,ans);
//        System.out.println(Arrays.toString(ans));
//
//
//        TreeSet<Integer> integers = new TreeSet<>(Arrays.asList(1,4,2,5,2,5,22,9,52,21));
//
//        System.out.println(integers);
//        // get first Int
//        System.out.println(integers.first());
//        // get last Int
//        System.out.println(integers.last());
//        // get& remove first Int
//        System.out.println(integers.pollFirst());
//        // get& remove last Int
//        System.out.println(integers.pollLast());
//        // get the given Int or more than given Int
//        System.out.println(integers.ceiling(5));
//        // get the given Int or less than given Int
//        System.out.println(integers.floor(5));
//        // get the higher than given Int
//        System.out.println(integers.higher(5));
//        // get the lower than given Int
//        System.out.println(integers.lower(5));
//        // get the set as decending order
//        System.out.println(integers.descendingSet());
//        System.out.println(integers);
//        // get the set lower than 5
//        System.out.println(integers.headSet(5));
//        // get the set lower than and ==5
//        System.out.println(integers.headSet(5,true));
//        // get the set between given 5,20 -> 5...19
//        System.out.println(integers.subSet(5,20));
//        // get the set between given 5,20 -> 5...20
//        System.out.println(integers.subSet(5,true,20,true));
//        // get the set greater than 5 or ==5 -> 5...
//        System.out.println(integers.tailSet(5));
//        // get the set greater than or==5  ->5...
//        System.out.println(integers.tailSet(5,false));
//         iterate desending set
//        integers.descendingIterator().forEachRemaining(System.out::println);
//        integers.iterator().forEachRemaining(System.out::println);
//
//        HashMap<Integer,String> hashMap= new HashMap<>();
//        hashMap.put(1,"Green");
//        hashMap.put(2,"Blue");
//        hashMap.put(3,"Yellow");
//        hashMap.put(4,"Orange");
//        hashMap.put(5,"Pine Apple");
//        hashMap.put(6,"Spench");
//
//        hashMap.putIfAbsent(4,"Red");
//        hashMap.remove(3,"Green");
//        hashMap.remove(3);
//        hashMap.entrySet().removeIf(e->e.getKey()>2);
//        System.out.println(hashMap.entrySet());
//        System.out.println(hashMap.keySet());
//        System.out.println(hashMap.values());
//        System.out.println(hashMap.merge(3,"Yellow",(o1,o2)-> o1+" "+o2));
//        System.out.println(hashMap.containsKey(4));
//        System.out.println(hashMap.containsValue("Blue"));
//        System.out.println(hashMap.compute(1,(e,s)->e+"Hii"));
//        System.out.println(hashMap.computeIfPresent(1,(e,s)->e+"Hii"));
//        System.out.println(hashMap.computeIfAbsent(8,(e)->e+"Hii"));
//        System.out.println(hashMap.replace(7,"sdfs"));
//        System.out.println(hashMap.replace(7,"sdfs","hdfh"));
//        System.out.println(hashMap.get(3));
//        System.out.println(hashMap.getOrDefault(1,"sadas"));
//
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.push(1);
//        linkedList.push(2);
//        linkedList.push(3);
//        linkedList.push(4);
//        linkedList.push(5);
//        System.out.println(linkedList);
//        System.out.println(linkedList.peek());
//        System.out.println(linkedList.pop());
//
//        LinkedList<Integer> linkedList1 = new LinkedList<>();
//        linkedList1.offer(1);
//        linkedList1.offer(2);
//        linkedList1.offer(3);
//        linkedList1.offer(4);
//        linkedList1.offer(5);
//        System.out.println(linkedList1);
//        System.out.println(linkedList1.peek());
//        System.out.println(linkedList1.poll());
//        System.out.println(linkedList1);
//
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//
//        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
//        arrayDeque.add(1);
//        arrayDeque.add(2);
//        arrayDeque.add(3);
//        arrayDeque.add(4);
//        arrayDeque.add(5);
//        System.out.println(arrayDeque);
//        System.out.println(arrayDeque.peek());
//        System.out.println(arrayDeque.poll());
//
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        priorityQueue.add(5);
//        priorityQueue.add(5);
//        priorityQueue.add(20);
//        priorityQueue.add(15);
//        priorityQueue.add(4);
//        priorityQueue.add(5);
//        System.out.println(priorityQueue);
//        System.out.println(priorityQueue.peek());
//        System.out.println(priorityQueue.poll());
//        priorityQueue.iterator().forEachRemaining(System.out::println);
//
//
//        int[] arr = {1,2,4,6,8,11,17,19};
//        int target = 19;
//        System.out.println("Linear Search "+ linearSearch(arr,target));
//        System.out.println("Binary Search "+ binarySearch(arr,target));
//        System.out.println("Recresive Search "+ recresiveSearch(arr,target,0,arr.length-1));
//
//        int[] arr1 = {3,6,2,4,8,1};
//        int n = arr1.length;
//        System.out.println("Bubble Sort "+ Arrays.toString(bubbleSort(arr1,n)));
//        System.out.println("Selection Sort "+ Arrays.toString(selectionSort(arr1,n)));
//        System.out.println("Insertion Sort "+ Arrays.toString(insertionSort(arr1,n)));

//        int arr[]=  {5  ,3  ,100  ,6  ,1  ,95  ,4  ,2  ,35};
//        quickSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));

        //merge sort
//        int arr[]= {3,5,1,4,6,2};
//        System.out.println(Arrays.toString(arr));
//        merge(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));

//        int nums[]={2,2,1,1, 1,2,2};
//        System.out.println(majorityElement(nums));

//        Find Even Numbers in a List
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        numbers = numbers.stream().filter(e -> e%2==0).collect(Collectors.toList());
        numbers = numbers.stream().filter(e -> e%2==0).toList();
        System.out.println(numbers);

//        Find the Square of Each Number
        List<Integer> num1 = Arrays.asList(1, 2, 3, 4, 5);
        num1 = num1.stream().map(e->e*e).toList();
        System.out.println(num1);

//        Find the Sum of All Elements    1111
        List<Integer> num2 = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = num2.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

//        Count the Elements Greater Than 5
        List<Integer> num3 = Arrays.asList(1, 3, 5, 6, 8, 10);
        long count = num3.stream().filter(e-> e > 5).count();
        System.out.println(count);

//        Find the Maximum Number   1111
        List<Integer> num4 = Arrays.asList(10, 20, 30, 5, 15);
        num4.stream().max(Integer::compareTo).ifPresent(max -> System.out.println("Max Number: " + max));

//        Convert a List of Strings to Uppercase
        List<String> names = Arrays.asList("apple", "banana", "cherry");
        names = names.stream().map(String::toUpperCase).toList();
        System.out.println(names);

//        Remove Duplicate Elements from a List
        List<Integer> num5 = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6);
        num5 = num5.stream().distinct().toList();
        System.out.println(num5);

//        Find Words That Start With a Specific Letter
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");
        words = words.stream().filter(e -> e.startsWith("A")).toList();
        System.out.println(words);

//        Given a list of integers, find the first number greater than 10.
        List<Integer> num6 = Arrays.asList(5, 8, 12, 3, 15);
        Optional<Integer> firstMax = num6.stream().filter(e-> e > 10).findFirst();
        System.out.println(firstMax);

//        Given a list of strings, sort them in alphabetical order.
        List<String> names1 = Arrays.asList("John", "Alice", "Bob", "David");
        names1 = names1.stream().sorted().toList();
        System.out.println(names1);

//     1111 Given a list of numbers, convert them into a single string separated by commas.
        List<Integer> num7 = Arrays.asList(1, 2, 3, 4, 5);
        String allNum = num7.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(allNum);

//     1111 Given a list of integers, find the second largest number
        List<Integer> num8 = Arrays.asList(10, 20, 5, 30, 25);
        Optional<Integer> large2 = num8.stream().sorted((e1,e2) -> e2 - e1)
                .skip(1).findFirst();
        large2.ifPresent(e -> System.out.println(e));

//      1111  Given a list of strings, group them based on their length.
        List<String> words1 = Arrays.asList("apple", "bat", "cat", "banana", "dog", "elephant");
//        words1 = words1.stream().sorted((q,w)-> w.length()-q.length()).toList();
        Map<Integer,List<String>> datas = words1.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(datas);

//        Given a string, count the occurrences of each character.
        String input = "banana";
//        System.out.println(input.toCharArray());
        Map<Character,Long> charCount = input.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charCount);

//        Given a list of numbers, find the average.
        List<Integer> num9 = Arrays.asList(10, 20, 30, 40, 50);

        OptionalDouble avg = num9.stream().mapToInt(Integer::intValue)
                .average();
        avg.ifPresent(e-> System.out.println(e));

//        Given a list of strings, concatenate them into a single string.
        List<String> words2 = Arrays.asList("Hello", "World", "Java", "Streams");
        String fullStr = words2.stream().collect(Collectors.joining(" "));
        System.out.println(fullStr);

//        Given a list of strings, find the longest string.
        List<String> words3 = Arrays.asList("apple", "banana", "cherry", "watermelon", "grape");
        Optional<String> maxLength = words3.stream().max((e,w)-> Integer.compare(e.length(),w.length()));
        maxLength.ifPresent(e-> System.out.println(e));

//        Given a list of strings, find the shortest string.
        List<String> words4 = Arrays.asList("apple", "banana", "kiwi", "pear", "grape");
        Optional<String> minString = words4.stream().min((e,w)-> Integer.compare(e.length(),w.length()));
        minString.ifPresent(System.out::println);

//        Given a string, count the number of vowels (a, e, i, o, u).
        String input1 = "hello world";
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        long count1 = input1.toLowerCase().chars().mapToObj(e->(char) e)
                .filter(vowels::contains).count();
        System.out.println(count1);

//        Given a string, find the first character that does not repeat.
        String input2 = "swiss";
        LinkedHashMap<Character,Long> charCountList = input2.chars().mapToObj(e->(char) e)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        charCountList.entrySet().stream().filter(e-> e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst().ifPresent(System.out::println);

//        Given a list of numbers, reverse the order using Stream API.
        List<Integer> num10 = Arrays.asList(1, 2, 3, 4, 5);
        num10 = num10.stream().sorted(Collections.reverseOrder()).toList();
        System.out.println(num10);

//        Given two lists, find the common elements.
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

        List<Integer> finalList = list1.stream().filter(e-> list2.contains(e)).toList();
        System.out.println(finalList);

//        Given a list of lists, flatten it into a single list.
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> flat = listOfLists.stream()
                .flatMap(integers -> integers.stream()).toList();
        System.out.println(flat);

//        Given a list of numbers, find the most frequently occurring number.
        List<Integer> num11 = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
       Integer frequentNum= num11.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse(null);
//                .ifPresent(e-> System.out.println(e.getKey()));
        System.out.println(frequentNum);

//          Given a list of numbers, check if it contains a specific number (e.g., 10).
        List<Integer> num13 = Arrays.asList(1, 2, 3, 4, 5);
        boolean contains10 = num13.stream().anyMatch(e->e == 9);
        System.out.println(contains10);

//        How do you filter a list of integers to get only even numbers without using Streams?
        List<Integer> numbers13 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> nums1= new ArrayList<>();
        for(int i: numbers13){
            if(i%2==0){
                nums1.add(i);
            }
        }
        System.out.println(nums1);

//        How do you reverse a string in Java?
        String val = "Hello";
        String rev = new StringBuilder(val).reverse().toString();
        System.out.println(rev);

//Integer values between -128 and 127 are cached, so a == b is true.
//c and d are outside this range, so new objects are created, making c == d false.
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); // true

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d); // false

//How do you sort a list of strings in reverse order using Streams?
        List<String> names2 = List.of("John", "Alice", "Bob");
        names2 = names2.stream().sorted((e,w)-> w.compareTo(e)).toList();
        System.out.println(names2);

//How do you convert a List to an array?
        List<String> names3 = List.of("John", "Alice", "Bob");
        String[] names4 = names3.toArray(new String[0]);
        System.out.println(Arrays.toString(names4));

//        How do you generate a stream of numbers from 1 to 10?
        IntStream.rangeClosed(1,10).forEach(System.out::println);

//How do you remove duplicates from a list of integers?
        List<Integer> numbers1 = List.of(1, 2, 2, 3, 4, 4, 5);
        numbers1 = numbers1.stream().distinct().toList();


        List<Integer> numbers2 = List.of(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> numSet = numbers2.stream().collect(Collectors.toSet());
//        Set<Integer> numSet = new HashSet<>(numbers);

//        Convert a list of strings to uppercase using Stream API
        List<String> names6 = List.of("john", "alice", "bob");
        names6 = names6.stream().map(String::toUpperCase).toList();
        System.out.println(names6);

//        Convert a list of strings to uppercase without using Stream API
        List<String> names7 = new ArrayList<>();
        // names = names.stream().map(String::toUpperCase).toList();
        for(String name:names6){
            names7.add(name.toUpperCase());
        }
        System.out.println(names7);


//        How do you find the maximum number in a list using Stream API
        List<Integer> numbers3 = List.of(10, 5, 20, 8);
        Optional<Integer> maxNum1 = numbers3.stream().max(Integer::compare);
        maxNum1.ifPresent(System.out::println);

//How do you remove null values from a list using Streams
        List<String> names8 = new ArrayList<>(Arrays.asList("John", null, "Alice", "Bob", null));
//        List<String> filteredNames = names8.stream()
//                .filter(name -> name != null)
//                .toList();
        names8.removeIf(Objects::isNull);

//        Write a Java program to reverse an integer array.
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arr1= Arrays.asList(arr);
        arr1 = arr1.stream().sorted(Collections.reverseOrder()).toList();
        Integer[] arr2 = arr1.toArray(new Integer[0]);
        System.out.println(arr2);

//        How do you find duplicate elements in a list using Streams?
        List<String> names9 = List.of("John", "Alice", "Bob", "John", "Alice", "David");
        List<String> name15 =names9.stream().collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(entry->entry.getKey()).collect(Collectors.toList());

        System.out.println(name15);

//        How do you check if a string contains only digits?
        String str = "12345";
        boolean isNumeric = str.matches("\\d+");

        System.out.println(isNumeric);

//        How do you safely convert a string to an integer?
        String str1 = "123";
        Integer int1=null;
        try{
            int1 = Integer.parseInt(str1);
        }catch(NumberFormatException e){
            System.out.println("Not a number");
        }

        System.out.println(int1);

//        How do you convert an int[] to a List<Integer>
        int[] numbers16 = {1, 2, 3, 4, 5};
        List<Integer> num16 = Arrays.stream(numbers16).boxed().collect(Collectors.toList());

        System.out.println(num16);

//        How do you convert an Integer wrapper object to a primitive int?
        Integer wrapper = 100;
        int primitive = wrapper; // Unboxing

        System.out.println(primitive);

//        How do you find the first non-repeating character in a string?
        String str2 = "swiss";
        char firstUnique = '_';

        LinkedHashMap<Character,Integer> charCount1= new LinkedHashMap<>();
        for(char ch: str2.toCharArray()){
            charCount1.put(ch,charCount1.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> ch: charCount1.entrySet()){
            if(ch.getValue() ==1){
                ch.getKey();
                break;
            }
        }
        System.out.println(firstUnique);

//        How do you find the second largest number in an array
        int[] arr3 = {10, 5, 8, 20, 15};
        Arrays.sort(arr3);
        System.out.println(arr3[arr3.length-2]);

//        How do you merge two lists and remove duplicates?
        List<Integer> list3 = List.of(1, 2, 3, 4);
        List<Integer> list4 = List.of(3, 4, 5, 6);
//        list3.addAll(list4);
        List<Integer> list5 = Stream.concat(list3.stream(),list4.stream()).distinct().collect(Collectors.toList());
        // Set<Integer> list5 = Stream.concat(list3.stream(), list4.stream())
        //                               .collect(Collectors.toSet());
        System.out.println(list5);

//        How do you convert a Map to a List of keys and values?
        Map<Integer, String> map = Map.of(1, "Apple", 2, "Banana", 3, "Cherry");
        List<Integer> key = new ArrayList<>(map.keySet());
        List<String> value = map.values().stream().collect(Collectors.toList());

        System.out.println(key);
        System.out.println(value);

//        How do you count the occurrences of each element in a list
        List<String> words5 = List.of("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String,Long> fCount = words5.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(fCount);

//        How do you calculate the sum of digits of a number?
        int num = 12345;
//        Integer val = Integer.toString(num).chars()
//                .map(Character::getNumericValue)
//                .sum();

        int val1 =0;
        while(num>0){
            val1+= num%10;
            num/=10;
        }
        System.out.println(val);

//        How do you convert a list of integers to a comma-separated string?
        List<Integer> numbers17 = List.of(1, 2, 3, 4, 5);
        String result = numbers17.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(result);


//        How do you swap two numbers without using a third variable
        int a1 = 5, b1 = 10;
        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;

        System.out.println("a: " + a1 + ", b: " + b1);

//        How do you reverse the words in a sentence?
        String sentence = "Java is awesome";
        List<String> sen = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        Collections.reverse(sen);
        System.out.println(String.join(" ",sen));


//        How do you find the missing number in an array of 1 to N?
        int[] arr4 = {1, 2, 4, 5, 6};
        int n=6;
        int sum2 = n * (n + 1) / 2;
        for(int num17 : arr4){
            sum2-=num17;
        }
        System.out.println(sum2);

//         How do you remove duplicate elements from a List using a Set
        List<Integer> numbers20 = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 5);
        Set<Integer> num20 = new LinkedHashSet<>(numbers20);
        System.out.println(num20);

// How do you sort a List<Integer> in ascending and descending order
        List<Integer> numbers21 = Arrays.asList(5, 3, 8, 1, 9);

        numbers21.sort(Comparator.naturalOrder());
        System.out.println(numbers21);
        numbers21.sort(Comparator.reverseOrder());
        System.out.println(numbers21);

//        // Q3: How do you find the most frequent element in a list?
        List<Integer> numbers22 = Arrays.asList(1, 3, 2, 3, 4, 3, 5, 1, 1);
        // Map<Integer,Long> num = numbers22.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        // System.out.println(num);
        // long maxCount = 0;
        // int mostFrequent = -1;
        // for(Map.Entry<Integer,Long> n : num.entrySet()){
        //     if(n.getValue() > maxCount){
        //         maxCount= n.getValue();
        //         mostFrequent = n.getKey();
        //     }
        // }
        // System.out.println(mostFrequent);

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num22 : numbers22) {
            countMap.put(num22, countMap.getOrDefault(num22, 0) + 1);
        }

        int maxCount = 0;
        int mostFrequent = -1;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most frequent element: " + mostFrequent);


//How do you merge two maps and sum values of common keys?
        Map<String, Integer> map1 = Map.of("A", 10, "B", 20, "C", 30);
        Map<String, Integer> map2 = Map.of("B", 5, "C", 15, "D", 25);

        Map<String, Integer> mergedMap = new HashMap<>(map1);

        map2.forEach((k,v)-> mergedMap.merge(k,v,Integer::sum));
        System.out.println(mergedMap);

//        How do you implement a stack using Deque?
//        Deque<Integer> stack = new ArrayDeque<>();
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());

//        How do you convert a List to a Map while avoiding duplicate keys?

        List<String> names23 = Arrays.asList("Alice", "Bob", "Charlie", "Alice");

        Map<String, Integer> nameLengthMap = names23.stream()
                .collect(Collectors.toMap(
                        name -> name,
                        String::length,(e, r)->e)); // Handling duplicate keys

        System.out.println(nameLengthMap);


//        How do you find the maximum and minimum values in a List<Integer>?
        List<Integer> numbers24 = Arrays.asList(10, 20, 5, 30, 50);

        int max = Collections.max(numbers24);
        int min = Collections.min(numbers24);

        System.out.println("Max: " + max + ", Min: " + min);










    }

    public static int majorityElement(int[] nums) {
        int max = 0;
        int count =1;
        int number =0;
        int prev=nums[0];

        Arrays.sort(nums);
        if(nums.length>1){
            for(int i=1;i<nums.length;i++){
                if(prev < nums[i]){
                    if(max<count){
                        max=count;
                        number = prev;
                    }
                    count=1;
                }else{
                    count++;
                }
                prev = nums[i];
            }
        }else{
            count = nums.length;
        }
        if(max<count){
            number = nums[nums.length-1];
        }
        return number;
    }

    private static void merge(int[] arr, int left, int right) {
        if(left<right){
            int mid = (left+right)/2;
            merge(arr,left,mid);
            merge(arr,mid+1,right);
            mergeSort(arr,left,mid,right);
        }
    }

    private static void mergeSort(int[] arr, int left, int mid,int right) {
        int n1 = mid -left+1;
        int n2 = right-mid;

        int[] lArr= new int[n1];
        int[] rArr= new int[n2];

        for (int i = 0; i < n1; i++) {
            lArr[i] = arr[i+left];
        }
        for (int i = 0; i < n2; i++) {
            rArr[i] = arr[i+mid+1];
        }
        int i=0,j=0,k=left;
        while (i<n1 && j<n2){
            if(lArr[i] < rArr[j]){
                arr[k] = lArr[i]; k++; i++;
            }else {
                arr[k] = rArr[j]; k++; j++;
            }
        }
        while (i<n1){
            arr[k] = lArr[i]; k++; i++;
        }
        while (j<n2){
            arr[k] = rArr[j]; k++; j++;
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left<right){
            int indexCount =  pivotSort(arr,left,right);
            quickSort(arr,left,indexCount-1);
            quickSort(arr,indexCount+1,right);
        }
    }

    private static int pivotSort(int[] arr, int left, int right) {
        int pi = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if(arr[j] <= pi){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return i+1;
    }


    private static int[] insertionSort(int[] arr1, int n) {

        for (int i = 0; i < n-1; i++) {
                int j=i+1;
                int temp=arr1[i+1];
                while (j>0 && arr1[j-1] > temp){
                    arr1[j]= arr1[j-1];
                    j=j-1;
                }
                arr1[j]= temp;
        }

        return arr1;
    }

    private static int[] selectionSort(int[] arr1, int n) {
        for (int i = 0; i < n-1 ; i++) {
            int index=i;
            for (int j = i+1; j < n; j++) {
                if(arr1[index]>arr1[j]){
                    index=j;
                }
            }
            int temp= arr1[index];
            arr1[index]=arr1[i];
            arr1[i]=temp;
        }
        return arr1;
    }

    private static int[] bubbleSort(int[] arr1, int n) {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n-1 ; j++) {
                if(arr1[j] > arr1[j+1]){
                    int temp= arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        return arr1;
    }


    private static String recresiveSearch(int[] arr, int target, int left, int right) {
        if(left<=right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
                return "Target Found";
            else if (target < arr[mid])
                return recresiveSearch(arr,target,left,mid-1);
            else
                return recresiveSearch(arr,target,mid+1,right);
        }
            return "Target Not Found";
    }

    public static String linearSearch(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return "Target Found";
        }
        return "Target Not Found";
    }
    public static String binarySearch(int[] arr, int target){
        int left= 0;
        int right= arr.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target)
                return "Target Found";
            else if (target<arr[mid])
                right= mid-1;
            else
                left=mid+1;
        }
        return "Target Not Found";
    }

    public static void calculate(String question,String[] ans){
        String[] qus= question.split("\\.");
        int num =0;
        int curl=0;
        boolean matched = false;
        for (int i = 0; i < ans.length; i++) {
            if(num <qus.length) {
                if (ans[i].equals(qus[num]) && curl <= num) {
                    matched = true;
                    num += 1;
                } else if (matched) {
                    if (ans[i].contains("{")) {
                        curl += 1;
                        matched = false;
                    } else if (ans[i].contains("}")) {
                        curl -= 1;
                    }else{
                        matched = false;
                        break;
                    }
                } else if (!matched) {
                    if (ans[i].contains("{")) {
                        curl += 1;
                    } else if (ans[i].contains("}")) {
                        curl -= 1;
                        if (curl == 0) {
                            break;
                        }
                    }
                }
            }else{
                if(matched){
                    System.out.println(ans[i+1]);
                    break;
                }
            }
        }

//        question = question.replace(".",".:{.");
//        question = question+".:";
//        String[] qus= question.split("\\.");
//        int num =0;
//        for (int i = 0; i < ans.length; i++) {
//            if(num<qus.length && ans[i].equals(qus[num])){
//                num=num+1;
//            }else if(num>=qus.length){
//                System.out.println(ans[i]);
//                break;
//            }
//        }


    }
}
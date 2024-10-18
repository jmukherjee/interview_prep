//Array Conversion: Primitive to Object
Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);

//Array Conversion: Object to Integer
int[] arr = Arrays.stream(nums).mapToInt(Integer::intValue).toArray();

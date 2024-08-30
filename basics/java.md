# JAVA Basics

## Data Types
- Primitive
  - int/long/boolean/short
- Non-Primitive
  - Built-in
    - Integer/Long/Boolean/Short
    - String
    - Collections: List/Map/Set/Queue/DeQueue
      - Linear
      - Non-Linear
  - Custom
# JAVA Basics

## Data Types
- Primitive
  - int/long/float/boolean/short
- Non-Primitive
  - Built-in
    - Integer/Long/Float/Boolean/Short
    - String
    - Collections: List/Map/Set/Queue/DeQueue
      - Linear
      - Non-Linear
  - Custom

### DataType / Primitive
- Bounds
 Data Type | Size | Description 
    --- | --- | --- 
    byte | 1 byte | -128 to 127
    short | 2 bytes | -32,768 to 32,767
    int | 4 bytes | -2,147,483,648 to 2,147,483,647
    long | 8 bytes | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float | 4 bytes | Sufficient for storing 6 to 7 decimal digits
    double | 8 bytes |  Sufficient for storing 15 decimal digits
    boolean | 1 bit | true or false
    char | 2 bytes | single character/letter or ASCII values
 
### DataType / Non-Primitive / Collections
<table border="1" id="tbl_dt_pm_col" class="tbl-dt-pm-col">
  <tr>
    <td>

- List Interface
  - **Array List**
  - **Stack Class**
  - **LinkedList Class**
  - Vector Class
  - Abstract List Class
  - Abstract Sequential List Class
- Set Interface
  - **HashSet Class**
  - **LinkedHashSet Class**
  - **ConcurrentHashMap Class**
  - Abstract Set Class
  - CopyOnWriteArraySet Class
  - EnumSet Class
- SortedSet Interface
  - **TreeSet**
  - **ConcurrentSkipListSet Class**
  - NavigableSet Interface
      &nbsp;
    </td>
    <td>
 
- Queue Interface
  - **PriorityQueue Class**
  - **ConcurrentLinkedQueue Class**
  - Blocking Queue Interface
  - AbstractQueue Class
  - PriorityBlockingQueue Class
  - ArrayBlockingQueue Class
  - DelayQueue Class
  - LinkedBlockingQueue Class
  - LinkedTransferQueue
- Deque Interface
  - **ConcurrentLinkedDeque Class**
  - **ArrayDeque Class**
  - BlockingDeque Interface
      &nbsp;
    </td>
    <td>
 
- Map Interface
  - **HashMap Class**
  - **LinkedHashMap Class**
  - **TreeMap Class**
  - **ConcurrentMap Interface**
  - SortedMap Interface
  - NavigableMap Interface
  - AbstractMap Class
  - ConcurrentHashMap Class
  - EnumMap Class
  - IdentityHashMap Class
  - HashTable Class
  - Properties Class
      &nbsp;
    </td>
  </tr>
</table>





#### CRUD Operations
Type | Init | Add | Read | Update | Delete | Usage | Avoid
--- | --- | --- | --- | --- | --- | --- | ---
Array |  |  |  |  |  |  | 
ArrayList |  |  |  |  |   |  | 
LinkedList |  |  |  |  |   |  | 
Stack |  |  |  |  |   |  | 
PriorityQueue |  |  |  |  |   |  | 
ConcurrentLinkedQueue |  |  |  |  |   |  | 

Object | init | Add | Delete | Update| Read | Size | Contains 
--- | --- | --- | --- | --- | --- | --- | ---
Array List | ArrayList<> ar = new ArrayList<String>(); | add() | remove(Index) | set(index, <value>) | get(Index) | size() | --
Stack | Stack<Integer> stack = new Stack<>(); | push(<value>) | pop() | NA | peek() & search(<value>)  | size() |-- 
LinkedList | LinkedList<String> list = new LinkedList<String>(); |  add(element) | remove(Index) && remove(element) | set(index, <value>) | get(Index) | size() | contains(Object)
Array | int myArray[] = new int[4]; | newarr[n] = x;  | NA | newarr[n] = x; ) | newarr[n] | array.length | --

<table border="1" id="tbl_dt_pm_col" class="tbl-dt-pm-col">
  <tr>
    <th>Type</th>
    <th>Init</th>
    <th>Add</th>
    <th>Update</th>
    <th>Read</th>
    <th>Delete</th>
    <th>Size</th>
    <th>Iterator</th>
    <th>Misc</th>
  </tr>
  <tr>
    <th><a href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html">List</a></th>
    <td>
      <pre>
List<> lst1 = new ...List<String>();
List<> lst2 = new ...List<String>(10);
List<> lst3 = new ...List<String>(coll);
      </pre>
    </td>
    <td>
      <pre>
lst.add(obj);
lst.add(5, obj);

lst.addAll(coll);
lst.addAll(5, coll);
      </pre>
    </td>
    <td>
      <pre>
lst.set(5, obj);
      </pre>
    </td>
    <td>
      <pre>
lst.get(5);

lst.indexOf(obj);

lst.subList(5, 10);
      </pre>
    </td>
    <td>
      <pre>
lst.remove(5);
lst.remove(obj);
lst.removeAll(coll);
lst.removeIf(5);
lst.removeRange(5, 10);

lst.retainAll(coll);

lst.clear();
      </pre>
    </td>
    <td>
      <pre>
lst.size();
      </pre>
    </td>
    <td>
      <pre>
lst.listIterator();
lst.listIterator(5);
      </pre>
    </td>
    <td>
      <pre>
lst.isEmpty();

lst.contains(obj);
lst.containsAll(obj);

lst.sort(comparator);
      </pre>
    </td>
  </tr>
  <tr>
    <th><a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList</a></th>
    <td>
      <pre>
ArrayList<> al1 = new ArrayList<String>();
ArrayList<> al2 = new ArrayList<String>(10);
ArrayList<> al3 = new ArrayList<String>(coll);
      </pre>
    </td>
    <td>
      <pre>
- as above -
      </pre>
    </td>
    <td>
      <pre>
- as above -
      </pre>
    </td>
    <td>
      <pre>
- as above -
      </pre>
    </td>
    <td>
      <pre>
- as above -
      </pre>
    </td>
    <td>
      <pre>
- as above -
al.trimToSize();
      </pre>
    </td>
    <td>
      <pre>
- as above -
al.forEach(action);

al.iterator();
al.spliterator();
      </pre>
    </td>
    <td>
      <pre>
- as above -
      </pre>
    </td>
  </tr>
  <tr>
    <th><a href="https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html">LinkedList</a></th>
    <td>
      <pre>
LinkedList<> al1 = new LinkedList<String>();
LinkedList<> al2 = new LinkedList<String>(coll);
      </pre>
    </td>
    <td>
      <pre>
- as above -
      </pre>
    </td>
    <td>
      <pre>
- as above -
      </pre>
    </td>
    <td>
      <pre>
- as above -
      </pre>
    </td>
    <td>
      <pre>
- as above -
      </pre>
    </td>
    <td>
      <pre>
- as above -
al.trimToSize();
      </pre>
    </td>
    <td>
      <pre>
- as above -
al.forEach(action);

al.iterator();
al.spliterator();
      </pre>
    </td>
    <td>
      <pre>
- as above -
      </pre>
    </td>
  </tr>
</table>

#### Conversions
##### Primitive Array to List & viceversa
- Array(int/short/long) to List<Integer/Long> & viceversa
- Array(float/double) to List<Float/Double> & viceversa
- Array(boolean) to List<Boolean> & viceversa

- 		ArrayList<Integer> a_list= new ArrayList<Integer>();- 	
		Integer[]  Arr = a_list.toArray(new Integer[a_list.size()]);		
		
		ArrayList<Boolean> b_list= new ArrayList<Boolean>();		
		Boolean[]  Arrb = b_list.toArray(new Boolean[b_list.size()]);
		
		ArrayList<Long> l_list= new ArrayList<Long>();		
		Long[]  Arrl = l_list.toArray(new Long[l_list.size()]);
		
		ArrayList<Double> d_list= new ArrayList<Double>();		
		Double[]  Arrd = d_list.toArray(new Double[d_list.size()]);
		
		ArrayList<String> s_list= new ArrayList<String>();		
		String[]  Arrs = s_list.toArray(new String[s_list.size()]);
-ArrayList to Array

		List<Integer> al = new ArrayList<Integer>();
		Integer[] objects = (Integer []) al.toArray();

##### List to Queue & viceversa


## Control Flow Statements

### Conditions
- if/else-if
- switch-case-default
- ternary operator
#### if/else-if
#### switch-case-default
#### ternary operator

### Loops
- for loop
- foreach loop
- while loop
- do-while loop
#### for loop
#### foreach loop
#### while loop
#### do-while loop

<style>
#tbl_dt_pm_col {font-size:x-small;}
.tbl-dt-pm-col {font-size:x-small;}
</style>

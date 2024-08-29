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

Object | init | Add | Delete | Update| Read | Size/length | Contains 
    --- | --- | --- | --- | --- | --- | --- | ---
    Array List | ArrayList<String> cars = new ArrayList<String>(); | add() | remove(Index) | set(index, <value>) | get(Index) | size() | --
    Stack | Stack<Integer> stack = new Stack<>(); | push(<value>) | pop() | NA | peek() & search(<value>)  | size() |-- 
    LinkedList | LinkedList<String> list = new LinkedList<String>(); |  add(element) | remove(Index) && remove(element) | set(index, <value>) | get(Index) | size() | contains(Object)

#### Conversions
##### Primitive Array to List & viceversa
- Array(int/long) to List<Integer/Long> & viceversa
- Array(float/double) to List<Float/Double> & viceversa
- Array(boolean) to List<Boolean> & viceversa

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

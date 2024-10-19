//

ArrayList<Integer> a_list= new ArrayList<Integer>();
Integer[]  Arr = a_list.toArray(new Integer[a_list.size()]);

ArrayList<Boolean> b_list= new ArrayList<Boolean>();
Boolean[]  Arrb = b_list.toArray(new Boolean[b_list.size()]);

ArrayList<Long> l_list= new ArrayList<Long>();
Long[]  Arrl = l_list.toArray(new Long[l_list.size()]);

ArrayList<Double> d_list= new ArrayList<Double>();
Double[]  Arrd = d_list.toArray(new Double[d_list.size()]);

ArrayList<String> s_list= new ArrayList<String>();
String[]  Arrs = s_list.toArray(new String[s_list.size()]);

List<Integer> al = new ArrayList<Integer>();
Integer[] objects = (Integer []) al.toArray();

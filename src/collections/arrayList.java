package collections;

public class arrayList {

    public static void main(String[] args) {
        arrayList arraylist = new arrayList();
    }
    void arrayListmethods() {
// adding items to array list
        arrayList<String>  arraylist = new arrayList<>(initialCapacity: 4);

        cityList.add("city1");
        cityList.add("city2");
        cityList.add("city3");
        cityList.add("city4");
        cityList.add("city5");

        cityList.add(index: 3, element: "city3");

        System.out.println(cityList.contains("city3"));
        if (cityList.contains("city3"))
            System.out.println(cityList.get(3).toUpperCase());

        System.out.println(cityList.get(3));

        for (String city : cityList){
            if (cityList.contains("3")){
                System.out.println(city.toUpperCase());

                arraylist<Integer> intList = new arrayList<>();
                intList.add(5);
                intList.add(3);

        intList.sort{
            (c1, c2) -> {
        if(c1 < c2) return -1; return 0;
            };
                
    cityList.sort(c1, c2) -> {
        if(c1.equals(c2)) return -1; return 0;
            });
    
        for(String city : cityList) {
             System.out.println(city);
        }

        
          System.out.println(cityList);
    }
    }
public class ProcessString {
    public String processString(String input){
        if(input == null || input.length() <= 1){
            return input;
        }
        char[] arr = input.toCharArray();
        Map<Character, Integer> map = turnToMap(arr);
        Map<Character, Integer> mapUpperAndLower = ULMap(arr);
        List<Map.Entry<Character, Integer>> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> e : map.entrySet()){
            list.add(e);
        }
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>(){
            @Override
            public int compare(Map.Entry<Character, Integer> e1, Map.Entry<Character, Integer> e2){
                if (e1.getValue() == e2.getValue()){
                    return 0;
                }
                return e1.getValue() < e2.getValue() ? -1 : 1;
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            Character c = list.get(i).getKey();
            int upper = mapUpperAndLower.get(Character.toUpperCase(c)) == null ? 0 : mapUpperAndLower.get(Character.toUpperCase(c));
            int lower = mapUpperAndLower.get(Character.toLowerCase(c)) == null ? 0 : mapUpperAndLower.get(Character.toLowerCase(c));
            while (upper != 0){
                sb.append(Character.toUpperCase(c));
                upper--;
            }
            while (lower != 0){
                sb.append(Character.toLowerCase(c));
                lower--;
            }
        }
        return sb.toString();

    }
    private Map<Character, Integer> turnToMap(char[] arr){
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            Character temp = Character.toLowerCase(arr[i]);
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            }else {
                map.put(temp, 1);
            }
        }
        return map;
    }
    private Map<Character, Integer> ULMap(char[] arr){
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }else {
                map.put(arr[i], 1);
            }
        }
        return map;
    }
}

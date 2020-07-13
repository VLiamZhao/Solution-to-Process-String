public class ProcessString {
    public String processString(String input){
        char[] arr = input.toCharArray();
        Map<Charactor, Integer> map = turnToMap(arr);
        Map<Charactor, Integer> mapUpperAndLower = ULMap(arr);
        List<Entry<Charactor, Integer>> list = new ArrayList<>();
        for (Entry<Charactor, Integer> e : map){
            list.add(e);
        }
        Collections.sort(list, new Comparator<Entry<Charactor, Integer>>(){
            @Override
            public int compare(Entry<Charactor, Integer> e1, Entry<Charactor, Integer> e2){
                if (e1.getValue() == e2.getValue()){
                    return 0;
                }
                return e1.getValue() < e2.getValue() ? -1 : 1;
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            Charactor c = list.get(i).getKey();
            int upper = mapUpperAndLower.get(c.toUpperCase()) == null ? 0 : mapUpperAndLower.get(c.toUpperCase());
            int lower = mapUpperAndLower.get(c.toLowerCase()) == null ? 0 : mapUpperAndLower.get(c.toLowerCase());
            while (upper != 0){
                sb.append(c.toUpperCase());
                upper--;
            }
            while (lower != 0){
                sb.append(c.toLowerCase());
                lower--;
            }
        }
        return sb.toString();

    }
    private Map<Charactor, Integer> turnToMap(char[] arr){
        Map<Charactor, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++>){
            Charactor temp = arr[i].toLowerCase;
            if (map.containsKey(temp) {
                map.put(temp, map.get(temp) + 1);
            }else {
                map.put(temp, 1);
            }
        }
        return map;
    }
    private Map<Charactor, Integer> ULMap(char[] arr){
            Map<Charactor, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++>){
                if (map.containsKey(arr[i]) {
                    map.put(temp, map.get(arr[i]) + 1);
                }else {
                    map.put(arr[i], 1);
                }
            }
            return map;
        }
}

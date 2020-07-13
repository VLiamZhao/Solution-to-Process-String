public class ProcessString {
    public String processString(String input){
            if(input == null || input.length() <= 1){
                return input;
            }
            char[] arr = input.toCharArray();
            int[] max = new int[1];
            Map<Character, Integer> map = ULMap(input.toLowerCase().toCharArray(), max);
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i <= max[0]; i++){
                for(int j = 0; j < arr.length; j++){
                    if (map.get(Character.toLowerCase(arr[j])) == i){
                        sb.append(arr[j]);
                    }
                }
            }
            return sb.toString();
        }
    private Map<Character, Integer> ULMap(char[] arr, int[] max){
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }else {
                map.put(arr[i], 1);

            }
            max[0] = Math.max(max[0], map.get(arr[i]));
        }
        return map;
    }
}

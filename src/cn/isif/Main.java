package cn.isif;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<DTO> list = new ArrayList<>();
        for (int i= 5;i>0;i--){
            list.add(new DTO(i));
        }
        Collections.sort(list);
        System.out.println(Arrays.toString(list.toArray()));

        Collections.sort(list, new Comparator<DTO>() {
            @Override
            public int compare(DTO dto, DTO t1) {
                return t1.id - dto.id;
            }
        });
        System.out.println(Arrays.toString(list.toArray()));
    }
    static class DTO implements Comparable<DTO>{
        private Integer id;

        public DTO(Integer id){
            this.id = id;
        }

        @Override
        public int compareTo(DTO dto) {
            return id - dto.id;
        }

        @Override
        public String toString() {
            return "{" +
                    "id:" + id +
                    '}';
        }
    }
}

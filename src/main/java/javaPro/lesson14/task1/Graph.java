package javaPro.lesson14.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private List<List<Integer>> list = new ArrayList<>();

    public Graph(List<Edge> edges) {
        int vertex = 0;
        int sourceMax = 0;
        int destinationMax = 0;
        for (int i = 0; i < edges.size(); i++) {
            int tmpSource = edges.get(i).getSource();
            int tmpDest = edges.get(i).getDestination();

            if (tmpSource > sourceMax) {
                sourceMax = tmpSource;
            }
            if (tmpDest > destinationMax) {
                destinationMax = tmpDest;
            }
        }
        if (destinationMax > sourceMax){
            vertex = destinationMax;
        } else {
            vertex = sourceMax;
        }

        for (int i = 0; i <= vertex; i++){
            list.add(i,new LinkedList<>());
        }

        for (Edge edge: edges){
            int index = edge.getSource();
            List<Integer> innerList = list.get(index);
            innerList.add(edge.getDestination());
//            list.get(index).add(edge.getDestination()); short variant

        }
    }

    public List<List<Integer>> getList() {
        return list;
    }

    public void setList(List<List<Integer>> list) {
        this.list = list;
    }
}



//    int vertex = 0;
//        for (Edge edge : edges) {
//        vertex = Integer.max(vertex, Integer.max(edge.getSource(), edge.getDestination()));
//    }

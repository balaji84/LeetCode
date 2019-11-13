class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer,Map<Integer,Integer>> adjMap = new HashMap<>();
         for(int i=0;i<flights.length;i++){
             adjMap.put(flights[i][0],new HashMap<>());
        }
        
        for(int flight[]: flights){
            int x = flight[0];
            int y = flight[1];
            int cost = flight[2];
            adjMap.get(flight[0]).put(flight[1],flight[2]);

        }
        
       PriorityQueue<Node> pq = new PriorityQueue<Node>(1, new Comparator<Node>(){
          public int compare(Node node1, Node node2){
              return node1.cost - node2.cost;
          } 
       });
        pq.offer(new Node(0,src,K+1));
        
        HashSet<Integer> visited= new HashSet<Integer>();
        while(!pq.isEmpty())
        {
            Node node = pq.poll();
            int dest = node.dest;
            int cost = node.cost;
            int stops = node.stops;
            if(dest == dst) return cost;
            Map<Integer,Integer> map = adjMap.get(dest);
            if(map ==null)continue;
            if(stops >0){
                for(int city : map.keySet()){
                    pq.offer(new Node(cost+ map.get(city) , city, stops-1));
                }
            }
            
       }
        return -1;
    }
    
    class Node{
        int dest;
        int cost;
        int stops;
        Node(int cost, int dest,int stops){
            this.dest = dest;
            this.cost = cost;
            this.stops = stops;
        }
        
    }
}

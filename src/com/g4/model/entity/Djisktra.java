package com.g4.model.entity;
public class Djisktra {
    public static float djisktraAlgorithm(int[][] weightMatrix, int start, int end){
        end -= 1;
        int n = weightMatrix.length;
        int[] distance = new int[n];
        for(int i = 0; i < n; i++){
            distance[i] = Integer.MAX_VALUE;
        }
        distance[start] = weightMatrix[start][start]; //0
        boolean[] spVertex = new boolean[n];
      /*  for(boolean f:spVertex){
            System.out.println(f);
        } */
        for(int count = 0; count < n-1; count++){
            int minix = Integer.MAX_VALUE;
            int u = 0;
            for(int v = 0; v < spVertex.length; v++){
                if(spVertex[v] == false && distance[v] <= minix){
                    minix = distance[v];
                    u = v;
                }
            }
            spVertex[u] = true;
            for(int v = 0; v < n; v++){
                if(!spVertex[v] && weightMatrix[u][v] != 0 && distance[u] + weightMatrix[u][v] < distance[v]){
                    distance[v] = distance[u] + weightMatrix[u][v];
                }
            }
            
        }
        return distance[end];
        
    }
    public static void main(String[] args){
        int[][] mi_matriz = {
        {0, 500, 400, 0, 0, 0},
        {500, 0, 0, 800, 0, 500},
        {400, 0, 0, 700, 600, 0},
        {0, 800, 700, 0, 100, 200},
        {0, 0, 600, 100, 0, 300},
        {0, 500, 0, 200, 300, 0}};
        System.out.println(djisktraAlgorithm( mi_matriz, 0, 4));
    }
}
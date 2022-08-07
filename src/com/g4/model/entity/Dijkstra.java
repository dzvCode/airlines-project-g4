package com.g4.model.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Dijkstra {
    
    public static final HashMap<String, Integer> citySelected;
    static {
    citySelected = new HashMap<>();
    citySelected.put("Lima", 1);
    citySelected.put("Tacna", 2);
    citySelected.put("Arequipa", 3);
    citySelected.put("Tarapoto", 4);
    citySelected.put("Puno", 5);
    citySelected.put("Junin", 6);
    }
    
    public static final int[][] mi_matriz = {
        {0, 500, 400, 0, 0, 0},
        {500, 0, 0, 800, 0, 500},
        {400, 0, 0, 700, 600, 0},
        {0, 800, 700, 0, 100, 200},
        {0, 0, 600, 100, 0, 300},
        {0, 500, 0, 200, 300, 0}
    };
    
    public static float dijkstraAlgorithm(int[][] weightMatrix, int start, int end){
        end -= 1;
        int n = weightMatrix.length;
        List<List<String>> caminos = new ArrayList<>();
        int[] padres = new int[n];
        String[] destinos = {"Lima", "Tacna", "Arequipa", "Tarapoto", "Puno","Junin"};
        int[] distance = new int[n];
        for(int i = 0; i < n; i++){
            distance[i] = Integer.MAX_VALUE;
            padres[i] = -1;
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
                    padres[v] = u;
                }
            }
            
        }
        int j;
        for(int i = 0; i < n; i++){
            j = i;
            List<String>lista = new ArrayList<>();
            while (padres[j] != -1){
                lista.add(destinos[j]);
                j = padres[j];
            }
            lista.add(destinos[start]);
            Collections.reverse(lista);
            caminos.add(lista);
        }
        
        return distance[end];
        
    }
    
    public static List<String> dijkstraAlgorithmPaths(int[][] weightMatrix, int start, int end){
        end -= 1;
        int n = weightMatrix.length;
        List<List<String>> caminos = new ArrayList<>();
        int[] padres = new int[n];
        String[] destinos = {"Lima", "Tacna", "Arequipa", "Tarapoto", "Puno","Junin"};
        int[] distance = new int[n];
        for(int i = 0; i < n; i++){
            distance[i] = Integer.MAX_VALUE;
            padres[i] = -1;
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
                    padres[v] = u;
                }
            }
            
        }
        int j;
        for(int i = 0; i < n; i++){
            j = i;
            List<String>lista = new ArrayList<>();
            while (padres[j] != -1){
                lista.add(destinos[j]);
                j = padres[j];
            }
            lista.add(destinos[start]);
            Collections.reverse(lista);
            caminos.add(lista);
        }
        
        return caminos.get(end);
        
    }
   
}
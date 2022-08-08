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
    citySelected.put("Tumbes", 2);
    citySelected.put("Iquitos", 3);
    citySelected.put("Piura", 4);
    citySelected.put("Cajamarca", 5);
    citySelected.put("Trujillo", 6);
    citySelected.put("Tarapoto", 7);
    citySelected.put("Pucallpa", 8);
    citySelected.put("Puerto Maldonado", 9);
    citySelected.put("Ayacucho", 10);
    citySelected.put("Cuzco", 11);
    citySelected.put("Arequipa", 12);
    citySelected.put("Juliaca", 13);
    citySelected.put("Tacna", 14);
    }
        
    public static final int[][] adjacencyMatrix = { 
      //                          | 1 | 2  | 3  | 4  | 5  |  6 |  7 |  8 | 9 |  10 | 11 | 12 | 13 | 14 |
      /*    1 Lima          */    {0  , 0  , 0  , 0  , 0  , 488, 0  , 485, 0  , 331, 0  , 766, 0  , 0  },
      /*    2 Tumbes        */    {0  , 0  , 0  , 180, 451, 0  , 0  , 0  , 0  , 0  , 0  , 0  , 0  , 0  },
      /*    3 Iquitos       */    {0  , 0  , 0  , 0  , 694, 0  , 458, 535, 0  , 0  , 0  , 0  , 0  , 0  },
      /*    4 Piura         */    {0  , 180, 0  , 0  , 0  , 370, 0  , 0  , 0  , 0  , 0  , 0  , 0  , 0  },
      /*    5 Cajamarca     */    {0  , 451, 694, 0  , 0  , 120, 0  , 0  , 0  , 0  , 0  , 0  , 0  , 0  },
      /*    6 Trujillo      */    {488, 0  , 0  , 370, 120, 0  , 346, 0  , 0  , 0  , 0  , 0  , 0  , 0  },
      /*    7 Tarapoto      */    {0  , 0  , 458, 0  , 0  , 346, 0  , 289, 0  , 0  , 0  , 0  , 0  , 0  },
      /*    8 Pucallpa      */    {485, 0  , 535, 0  , 0  , 0  , 289, 0  , 749, 0  , 0  , 0  , 0  , 0  },
      /*    9 P. Maldonado  */    {0  , 0  , 0  , 0  , 0  , 0  , 0  , 749, 0  , 0  , 317, 0  , 0  , 0  },
      /*    10 Ayacucho     */    {331, 0  , 0  , 0  , 0  , 0  , 0  , 0  , 0  , 0  , 248, 0  , 512, 685},
      /*    11 Cuzco        */    {0  , 0  , 0  , 0  , 0  , 0  , 0  , 0  , 317, 248, 0  , 0  , 0  , 0  },
      /*    12 Arequipa     */    {766, 0  , 0  , 0  , 0  , 0  , 0  , 0  , 0  , 0  , 0  , 0  , 184, 225},
      /*    13 Juliaca      */    {0  , 0  , 0  , 0  , 0  , 0  , 0  , 0  , 0  , 512, 0  , 184, 0  , 0  },
      /*    14 Tacna        */    {0  , 0  , 0  , 0  , 0  , 0  , 0  , 0  , 0  , 685, 0  , 225, 0  , 0  }
    };
    
    public static float dijkstraAlgorithm(int[][] weightMatrix, int start, int end){
        start -= 1;
        end -= 1;
        int n = weightMatrix.length;
        List<List<String>> caminos = new ArrayList<>();
        int[] padres = new int[n];
        String[] destinos = {"Lima", "Tumbes", "Iquitos", "Piura", "Cajamarca", "Trujillo", "Tarapoto", 
            "Pucallpa", "Puerto Maldonado", "Ayacucho", "Cuzco", "Arequipa", "Juliaca", "Tacna"};
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
        start -= 1;
        end -= 1;
        int n = weightMatrix.length;
        List<List<String>> caminos = new ArrayList<>();
        int[] padres = new int[n];
        String[] destinos = {"Lima", "Tumbes", "Iquitos", "Piura", "Cajamarca", "Trujillo", "Tarapoto", 
            "Pucallpa", "Puerto Maldonado", "Ayacucho", "Cuzco", "Arequipa", "Juliaca", "Tacna"};
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
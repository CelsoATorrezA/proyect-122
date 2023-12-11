package test5;

import java.util.*;

public class B_Chapare {
  static class Punto {
      int x, y;
      Punto(int x, int y) {
          this.x = x;
          this.y = y;
      }
  }

  static class Nodos {
      int dis, o, s, destino;
      Nodos(int dis, int o, int s, int destino) {
          this.dis = dis;
          this.o = o;
          this.s = s;
          this.destino = destino;
      }
  }

  static int distancia(Punto A, Punto B) {
      return (A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y);
  }

  static void dfs(int u, ArrayList<ArrayList<Integer>> G, int[] vis) {
      vis[u] = 1;
      for (int v : G.get(u)) {
          if (vis[v] == -1) {
              dfs(v, G, vis);
          }
      }
  }

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNextInt()) {
          int n = scanner.nextInt();
          if (n == 0) {
              break;
          }

          ArrayList<Punto> v = new ArrayList<>();
          for (int i = 0; i < n; i++) {
              v.add(new Punto(scanner.nextInt(), scanner.nextInt()));
          }

          ArrayList<ArrayList<Integer>> G = new ArrayList<>();
          for (int i = 0; i < n; i++) {
              G.add(new ArrayList<>());
          }

          for (int i = 0; i < n; i++) {
              ArrayList<Nodos> aux = new ArrayList<>();
              for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                aux.add(new Nodos(distancia(v.get(i), v.get(j)), Math.abs(v.get(i).x - v.get(j).x), Math.abs(v.get(i).y - v.get(j).y), j));
              }
              aux.sort((Nodos A, Nodos B) -> {
                 if (A.dis == B.dis) {
                     if (A.o == B.o) {
                         if (A.s == B.s) {
                             return Integer.compare(A.destino, B.destino);
                         }
                         return Integer.compare(A.s, B.s);
                     }
                     return Integer.compare(A.o, B.o);
                 }
                 return Integer.compare(A.dis, B.dis);
              });
              for (int j = 0; j < Math.min(2, aux.size()); j++) {
                G.get(i).add(aux.get(j).destino);
              }
          }

          int[] vis = new int[n];
          Arrays.fill(vis, -1);
          dfs(0, G, vis);

          boolean visited = true;
          for (int i = 0; i < n; i++) {
              if (vis[i] == -1) {
                visited = false;
                break;
              }
          }

          if (visited) {
              System.out.println("Chapare protegido");
          } else {
              System.out.println("Chapare no Protegido");
          }
      }
  }
}
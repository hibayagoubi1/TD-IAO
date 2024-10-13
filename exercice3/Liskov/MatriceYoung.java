package Liskov;

import java.util.ArrayList;

public class MatriceYoung {
    private static final int INF = Integer.MAX_VALUE;
    private int n;
    private int m;
    private ArrayList<ArrayList<Integer>> matrice;

    public MatriceYoung(int n, int m) {
        this.n = n;
        this.m = m;
        matrice = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>(m);
            for (int j = 0; j < m; j++) {
                row.add(INF);
            }
            matrice.add(row);
        }
    }

    public int extraireMin() {
        // Aucun élément n'est inséré dans le tableau
        if (getElement(0, 0) == INF) {
            return INF;
        } else {
            int min = getElement(0, 0);
            equilibrerTableau(0, 0);
            return min;
        }
    }

    // Fonction d'insertion avec vérification des bornes
    public boolean inserer(int key) {
        if (getElement(n - 1, m - 1) != INF) {
            System.out.println("Le tableau de Young est plein.");
            return false;
        }

        // Insérer la clé dans la dernière position (case en bas à droite)
        setElement(n - 1, m - 1, key);
        int i = n - 1;
        int j = m - 1;

        // Maintenir la propriété du tableau de Young
        while (i > 0 || j > 0) {
            int top = (i > 0) ? getElement(i - 1, j) : INF;  // Assurer que i > 0 avant d'accéder à i-1
            int left = (j > 0) ? getElement(i, j - 1) : INF; // Assurer que j > 0 avant d'accéder à j-1

            if (key >= top && key >= left) {
                break;
            } else if (top < left && i > 0) {  // Vérification supplémentaire que i > 0
                setElement(i, j, top);
                i--;  // Déplacer vers le haut
            } else if (j > 0) {  // Vérification supplémentaire que j > 0
                setElement(i, j, left);
                j--;  // Déplacer vers la gauche
            }
        }
        setElement(i, j, key);
        return true;
    }

    // Fonction pour rétablir la propriété du tableau de Young après l'extraction du minimum
    private void equilibrerTableau(int i, int j) {
        int down = (i + 1 < n) ? getElement(i + 1, j) : INF;
        int right = (j + 1 < m) ? getElement(i, j + 1) : INF;

        if (down == INF && right == INF) {
            return; // Fin de la descente
        }

        if (down < right) {
            setElement(i, j, down);
            equilibrerTableau(i + 1, j);
        } else {
            setElement(i, j, right);
            equilibrerTableau(i, j + 1);
        }
    }

    public void printTableau() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (getElement(i, j) == INF) {
                    System.out.print("INF" + " ");
                } else {
                    System.out.print(getElement(i, j) + " ");
                }
            }
            System.out.println();
        }
    }

    private int getElement(int i, int j) {
        return matrice.get(i).get(j);
    }

    private void setElement(int i, int j, int valeur) {
        matrice.get(i).set(j, valeur);
    }
}

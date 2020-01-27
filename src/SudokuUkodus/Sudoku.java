package sudokuukodus;

import sudokuukodus.ConjuntoArreglo;
import java.util.Iterator;

public class Sudoku {

    public static ConjuntoArreglo posiblesNumeros(int[][] sudoku, int iBase, int jBase) {

        ConjuntoArreglo res = new ConjuntoArreglo(9);

        if (sudoku[iBase][jBase] == 0) {
            for (int k = 1; k < 10; k++) {
                res.agrega(k);
            }

            int i = (iBase + 1) % 9;
            int j = (jBase + 1) % 9;
            int m1 = iBase / 3;
            int m2 = jBase / 3;
            int r1 = iBase % 3;
            int r2 = jBase % 3;
            int a = 3 * m1 + ((r1 + 1) % 3);
            int b = 3 * m2 + ((r2 + 1) % 3);
            int c = 3 * m1 + ((r1 + 2) % 3);
            int d = 3 * m2 + ((r2 + 2) % 3);

            while (i != iBase) {
                res.quita(sudoku[i][jBase]);
                i = (i + 1) % 9;
            }

            while (j != jBase) {
                res.quita(sudoku[iBase][j]);
                j = (j + 1) % 9;
            }

            res.quita(sudoku[a][b]);
            res.quita(sudoku[a][d]);
            res.quita(sudoku[c][b]);
            res.quita(sudoku[c][d]);
        } else {
            res.agrega(sudoku[iBase][jBase]);
        }
        return res;
    }

    public static boolean pasaMatriz(int[][] sudoku) {
        Iterator it = null;

        if (sudoku != null) {
            it = posiblesNumeros(sudoku, 0, 0).iterator();
            return pasaMatriz(sudoku, 0, 0, it);
        } else {
            return false;
        }
    }

    private static boolean pasaMatriz(int[][] sudoku, int i, int j, Iterator it) {
        ConjuntoArreglo res = new ConjuntoArreglo();
        int posNum;
        Iterator aux;

        if (i < 9) {
            if (j < 9) {
                if (sudoku[i][j] == 0) {
                    if (it.hasNext()) {
                        posNum = (int) it.next();
                        sudoku[i][j] = posNum;
                        if (j < 8) {
                            res = posiblesNumeros(sudoku, i, j + 1);
                        } else if (i < 8) {
                            res = posiblesNumeros(sudoku, i + 1, 0);
                        } else {
                            return true;
                        }
                        if (res.getCardinalidad() == 0) {
                            sudoku[i][j] = 0;
                        }
                        aux = res.iterator();
                        if (!pasaMatriz(sudoku, i, j + 1, aux)) {
                            sudoku[i][j] = 0;
                            return pasaMatriz(sudoku, i, j, it);
                        }
                    } else {
                        return false;
                    }
                } else {
                    if (j == 8) {
                        if (i == 8) {
                            return true;
                        } else {
                            res = posiblesNumeros(sudoku, i + 1, 0);
                            if (res.getCardinalidad() == 0) {
                                return false;
                            }
                            aux = res.iterator();
                            return pasaMatriz(sudoku, i + 1, 0, aux);
                        }
                    } else {
                        res = posiblesNumeros(sudoku, i, j + 1);
                        if (res.getCardinalidad() == 0) {
                            return false;
                        }
                        aux = res.iterator();
                        return pasaMatriz(sudoku, i, j + 1, aux);
                    }
                }
            } else {
                if (i < 8) {
                    aux = posiblesNumeros(sudoku, i + 1, 0).iterator();
                    return pasaMatriz(sudoku, i + 1, 0, aux);
                } else {
                    return true;
                }
            }

        }
        return true;

    }

    public static boolean sePuedeResolver(int[][] sudoku) {
        boolean res = false;
        if (sudoku != null) {
            res = sePuedeResolver(sudoku, 0, 0, new ConjuntoArreglo(9), new ConjuntoArreglo(9), new ConjuntoArreglo(9));
        }
        return res;
    }

    private static boolean sePuedeResolver(int[][] sudoku, int iBase, int jBase, ConjuntoArreglo con1, ConjuntoArreglo con2, ConjuntoArreglo con3) {
        if (jBase < 9&&iBase!=9) {
            int pos = sudoku[iBase][jBase];
            if (sudoku[iBase][jBase] == 0) {
                return sePuedeResolver(sudoku, iBase, jBase + 1, con1, con2, con3);
            }
            int i = (iBase + 1) % 9;
            int j = (jBase + 1) % 9;
            int m1 = iBase / 3;
            int m2 = jBase / 3;
            int r1 = iBase % 3;
            int r2 = jBase % 3;
            int a = 3 * m1 + ((r1 + 1) % 3);
            int b = 3 * m2 + ((r2 + 1) % 3);
            int c = 3 * m1 + ((r1 + 2) % 3);
            int d = 3 * m2 + ((r2 + 2) % 3);
            int aux;

            con1.agrega(pos);

            while (i != iBase) {
                aux = sudoku[i][jBase];
                if (aux != 0) {
                    if (!con1.agrega(aux)) {
                        return false;
                    }
                }
                i = (i + 1) % 9;
            }

            con2.agrega(pos);

            while (j != jBase) {
                aux = sudoku[iBase][j];
                if (aux != 0) {
                    if (!con2.agrega(aux)) {
                        return false;
                    }
                }
                j = (j + 1) % 9;
            }

            con3.agrega(pos);
            if (sudoku[a][b] != 0) {
                if (!con3.agrega(sudoku[a][b])) {
                    return false;
                }
            }
            if (sudoku[a][d] != 0) {
                if (!con3.agrega(sudoku[a][d])) {
                    return false;
                }
            }
            if (sudoku[c][b] != 0) {
                if (!con3.agrega(sudoku[c][b])) {
                    return false;
                }
            }
            if (sudoku[c][d] != 0) {
                if (!con3.agrega(sudoku[c][d])) {
                    return false;
                }
            }
            return sePuedeResolver(sudoku, iBase, jBase + 1, new ConjuntoArreglo(9), new ConjuntoArreglo(9), new ConjuntoArreglo(9));
        } else if (iBase < 9) {
            return sePuedeResolver(sudoku, iBase + 1, 0, new ConjuntoArreglo(9), new ConjuntoArreglo(9), new ConjuntoArreglo(9));
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {0, 0, 2, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0}};

        System.out.println(sePuedeResolver(matriz));
    }

}

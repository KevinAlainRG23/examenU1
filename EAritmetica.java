package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class EAritmetica {

    Stack pilaNumeros = new Stack();
    Stack pilaOperador = new Stack();

    EAritmetica() {
        String c = "(6+2)*3/2^2-4";
        String oper = "(?=[-+*/^()])|(?<=[-+*/^()])";
        String a[] = c.split(oper);
        InsertarEnPila(a);
    }

    private boolean isNumeric(String cadena) {
        try {
            double d = Double.parseDouble(cadena);

        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    private void InsertarEnPila(String ar[]) {
        List cadena = new ArrayList();
        for (int i = 0; i < ar.length; i++) {
            if (isNumeric(ar[i])) {
                // pilaNumero.push(ar[i]);
                cadena.add(ar[i]);
                if (i == ar.length - 1) {
                    while (!pilaOperador.empty()) {
                        cadena.add(pilaOperador.peek());
                        pilaOperador.pop();
                    }
                }
            } else {
                //pilaOperador.push(ar[i]);
                int prioridad = prioridad(ar[i]);
                switch (prioridad) {
                    case 0:
                        if (!pilaOperador.empty()) {
                            int prioridadpila = prioridad((String) pilaOperador.peek());
                            if (prioridad == prioridadpila) {
                                cadena.add(pilaOperador.peek());
                                pilaOperador.pop();
                            } else if (prioridadpila >= prioridad) {
                                while (!pilaOperador.empty() && !pilaOperador.peek().equals("(")) {
                                    cadena.add(pilaOperador.peek());
                                    pilaOperador.pop();
                                }
                            }
                        }
                        pilaOperador.push(ar[i]);
                        break;

                    case 1:
                        if (!pilaOperador.empty()) {
                            int prioridadpila2 = prioridad((String) pilaOperador.peek());
                            if (prioridad == prioridadpila2) {
                                cadena.add(pilaOperador.peek());
                                pilaOperador.pop();
                            }
                        }
                        pilaOperador.push(ar[i]);
                        break;
                    case 2:
                        pilaOperador.push(ar[i]);
                        break;
                    case 3:
                        pilaOperador.push(ar[i]);
                        break;
                    case 4:
                        while (!pilaOperador.empty()) {
                            if (pilaOperador.peek().equals("(")) {
                                pilaOperador.pop();
                                break;
                            }
                            cadena.add(pilaOperador.peek());
                            pilaOperador.pop();
                        }
                        break;
                }
            }
        }
        System.out.println(cadena);
        realizarOperaciones(cadena);
    }

    private int prioridad(String s) {
        if (s.equals("+") || s.equals("-")) {
            return 0;
        } else if (s.equals("*") || s.equals("/") || s.equals("%")) {
            return 1;
        } else if (s.equals("^")) {
            return 2;
        } else if (s.equals("(")) {
            return 3;
        } else if (s.equals(")")) {
            return 4;
        }
        return -1;
    } //Fin de la funcion prioridad

    private void realizarOperaciones(List lista) {
        double op1 = 0, op2 = 0, resultado=0;
        String operador,s1,s2;
   

        for (int i = 0; i < lista.size(); i++) {
            if (isNumeric((String) lista.get(i))) {
                pilaNumeros.push(lista.get(i));
            } else {
                operador = (String)lista.get(i);
        
                op2 =Double.parseDouble(pilaNumeros.pop().toString());
                
                op1 =Double.parseDouble(pilaNumeros.pop().toString());
            //    op1 = Double.parseDouble(s1);

                switch (operador) {
                    case "+":
                        resultado = op1 + op2;
                        pilaNumeros.push(resultado);
                        break;
                    case "-":
                        resultado = op1 - op2;
                        pilaNumeros.push(resultado);
                        break;
                    case "*":
                        resultado = op1* op2;
                        pilaNumeros.push(resultado);
                        break;
                    case "/":
                        resultado = op1/ op2;
                        pilaNumeros.push(resultado);
                        break;
                        case "^":
                    resultado = Math.pow(op1, op2);
                    pilaNumeros.push(resultado);
                    break;
                

                }
            }
        }
        System.out.println("El resultado de la expresion es "+resultado);

    }

}

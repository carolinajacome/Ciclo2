/**
 * EvaluarOpcionCredito
 */
public class EvaluarOpcionCredito {
    private final Double INTERES_IMPUESTO_ESPECIAL = 3.0;
    private final Double INTERES_IMPUESTO_LIBRE_INVERSION = 2.6;

    /**
     * Calcula la cantidad de intereses a pagar en un crédito aplicando
     * interés simple.
     * 
     * @param valor   Cantidad de dinero a solicitar en el préstamo.
     * @param tiempo  Número de meses a los que espera terminar de pagar el
     *                préstamo.
     * @param interes Porcentaje de interes a aplicar.
     * @return El valor de interés que debe pagar por el prestamo.
     */
    private Double calcularInteresSimple(Double valor, Integer tiempo, Double interes) {
        interes /= 100.0;
        return valor * interes * tiempo;
    }

    /**
     * Calcula la cantidad de intereses a pagar en un credito aplicando interes
     * compuesto.
     * 
     * @param valor   Cantidad de dinero a solicitar en el préstamo.
     * @param tiempo  Número de meses a los que espera terminar de pagar el
     *                préstamo.
     * @param interes Porcentaje de interes a aplicar.
     * @return El valor de interes que debe pagar por el prestamo.
     */
    private Double calcularInteresCompuesto(Double valor, Integer tiempo, Double interes) {
        interes /= 100.0;
        return valor * (Math.pow(1 + interes, tiempo) - 1);
    }

    /**
     * Compara las distintas opciones de crédito para tomar la mejor decisión.
     * 
     * @param valor  Cantidad de dinero a solicitar en el préstamo.
     * @param tiempo Número de meses a los que espera terminar de pagar el préstamo.
     * @return Una cadena de caracteres que explique cuál es la opción que de debe
     *         tomar. Los posibles valores son:
     *         <ul>
     *           <li><pre>credito especial</pre></li>
     *           <li><pre>credito libre inversión</pre></li>
     *         </ul>
     * 
     *         En el caso quesea igual tomar cualquiera de los 2, debe elegir <pre>credito especial</pre>
     */
    public String compararOpcion(Double valor, Integer tiempo) {
        Double prestamoEspecial = calcularInteresSimple(valor, tiempo, INTERES_IMPUESTO_ESPECIAL);
        Double prestamoLibreInversion = calcularInteresCompuesto(valor, tiempo, INTERES_IMPUESTO_LIBRE_INVERSION);

        if (prestamoEspecial <= prestamoLibreInversion) {
            return "credito especial";
        } else {
            return "credito libre inversion";
        }
    }
}
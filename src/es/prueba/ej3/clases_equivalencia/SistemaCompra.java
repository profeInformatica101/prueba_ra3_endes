package es.prueba.ej3.clases_equivalencia;
/**
 * @author ENDES
 * @version 1.0
 * 
 * Clase que representa el sistema de compras de una tienda en línea.
 * Permite a los usuarios realizar compras especificando los detalles del producto,
 * la cantidad, la dirección de envío y el método de pago.
 * 
 */
public class SistemaCompra {

    /**
     * Realiza una compra en el sistema de la tienda en línea.
     *
     * @param codigoProducto El código del producto a comprar, que debe ser un número de 5 dígitos
     *                       y comenzar con un número mayor a 10.
     * @param cantidad La cantidad del producto a comprar, que debe ser un número positivo menor o igual a 100.
     * @param direccionEnvio La dirección de envío para el producto, que no debe estar vacía y debe tener menos de 100 caracteres.
     * @param metodoPago El método de pago para la compra, que puede ser "Tarjeta", "PayPal" o vacío.
     *                   Si está vacío, el sistema asume "Tarjeta" como método de pago predeterminado.
     * @return Una cadena de texto que indica el resultado de la operación de compra,
     *         ya sea una confirmación de compra exitosa o un mensaje de error específico.
     */
    public String realizarCompra(String codigoProducto, int cantidad, String direccionEnvio, String metodoPago) {
        // Validación del código de producto
        if (codigoProducto == null || codigoProducto.isEmpty() || codigoProducto.length() != 5 || Integer.parseInt(codigoProducto.substring(0, 2)) <= 10) {
            return "Error: Código de producto inválido";
        }

        // Validación de la cantidad
        if (cantidad <= 0 || cantidad > 100) {
            return "Error: Cantidad inválida";
        }

        // Validación de la dirección de envío
        if (direccionEnvio == null || direccionEnvio.isEmpty() || direccionEnvio.length() >= 100) {
            return "Error: Dirección de envío inválida";
        }

        // Validación del método de pago
        if (metodoPago == null || (!metodoPago.isEmpty() && !metodoPago.equals("Tarjeta") && !metodoPago.equals("PayPal"))) {
            return "Error: Método de pago inválido";
        }

        // Si todas las validaciones son correctas, se procede con la compra
        return "Compra exitosa";
    }
}
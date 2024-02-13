package es.prueba.ej4.debug;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ENDES
 * @version 1.0
 * 
 * Clase que simula un sistema de autenticación de usuarios con nombre de usuario y contraseña.
 */
public class SistemaAutenticacion {

    private Map<String, String> usuariosRegistrados;

    /**
     * Constructor que inicializa el sistema de autenticación con algunos usuarios.
     */
    public SistemaAutenticacion() {
        usuariosRegistrados = new HashMap<>();
        // Usuarios predeterminados
        usuariosRegistrados.put("usuario1", "contraseña1");
        usuariosRegistrados.put("usuario2", "contraseña2");
    }

    /**
     * Intenta autenticar a un usuario con el nombre de usuario y contraseña proporcionados.
     *
     * @param usuario El nombre de usuario.
     * @param contraseña La contraseña.
     * @return {@code true} si las credenciales son válidas, {@code false} en caso contrario.
     */
    public boolean autenticarUsuario(String usuario, String contraseña) {
        String contraseñaCorrecta = usuariosRegistrados.get(usuario);

        // Error intencional: comparación incorrecta de strings
        if (contraseñaCorrecta == contraseña) {
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Clase para probar el funcionamiento del código de la informacion de estudiantes
 * @author Daniel Gonzalez Programador senior
 * @since 2024-02-20
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Clases para realizar bancos de prueba.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */

    @Test
    public void probandolosdatosdeunEstudiante() {

        LOG.info("Iniciado test datos COMPLETOS");

        Estudiante estudiante = new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co",
                "315635674", (int) 18);

        assertEquals("Camila", estudiante.getNombre());
        assertEquals("Alzate Rios", estudiante.getApellido());
        assertEquals("109453264", estudiante.getNumeroID());
        assertEquals("camila@uniquindio.edu.co", estudiante.getCorreo());
        assertEquals("315635674", estudiante.getTelefono());
        assertEquals(18, estudiante.getEdad());

        System.out.println("Datos completos");
        LOG.info("Finalizando test datos COMPLETOS");
    }

    @Test
    public void datosnull() {

        LOG.info("Iniciado test datos Null");

        assertThrows(Throwable.class, () -> new Estudiante(null, null, null, null, null, 0));

        System.out.println("Error, no se permiten datos null");
        LOG.info("Finalizando test datos Null");
    }

    @Test
    public void datosVacios() {

        LOG.info("Iniciado test datos Vacios");

        assertThrows(Throwable.class, () -> new Estudiante("", "", "", "camila@uniquindio.edu.co", "", 0));

        System.out.println("Error, no se permiten datos vacios");
        LOG.info("Finalizando test datos Vacios");
    }

    @Test
    public void edadNegativa() {

        LOG.info("Iniciado test edad negativa");

        assertThrows(Throwable.class,
                () -> new Estudiante("", "", "", "camila@uniquindio.edu.co", "315635674", (int) -2));

        System.out.println("Error, no se permiten edades negativas");
        LOG.info("Finalizando test edad negativa");
    }

    @Test
    public void correoInvalido() {

        LOG.info("Iniciado test correo invalido");

        assertThrows(Throwable.class,
                () -> new Estudiante("Camila", "Alzate Rios", "109453264", "cami", "315635674", (int) 18));

        System.out.println("Error, correo invalido");
        LOG.info("Finalizando test correo invalido");
    }
}
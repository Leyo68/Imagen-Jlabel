

package ImagenJLabel;

//Importación de librerías
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;

//Clase principal
public class Imagen {
        //Función principal
        public static void main(String[] args) {
        //Instancia de la clase Window
        Window ventana=new Window();
        ventana.setVisible(true);//Se hace visible el objeto creado
    }
}
//Clase que hereda de JFrame, para crear el marco
class Window extends JFrame {
    
    //Declaración de variables                    
    private JButton jButton1;
    private JPanel jPanel1;
    
    //Clase para generar una lámina
    public class Imagen extends JPanel{
        
        //Constructor de la clase Imagen
        public Imagen() {
            this.setSize(300, 400); //se selecciona el tamaño del panel
        }           
            //Se crea un método cuyo parámetro debe ser un objeto Graphics
            public void paint(Graphics g) {
                
                Dimension height = getSize();//Se instancia una clase
                
                //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
                ImageIcon Img = new ImageIcon(getClass().getResource("/ImagenJLabel/IMAGEN.jpg")); 
                //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
                g.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
                //Este es el fondo que se añade detrás del texto estampado
                setOpaque(false);
                super.paintComponent(g);//Se dibuja el gráfico creado
        }
    }
    //Crea una nueva ventana de formulario 
    public Window() {
        //Método que sirve para desarrollar interfaz gráfica
        initComponents();
        	//Almacena dentro del objeto pantalla el sistema nativo de ventanas
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		//Proporciona la resolucion de la pantalla,
		Dimension tamanoPantalla=miPantalla.getScreenSize();
		//Se obtiene el alto de la resolucion que se almacenaba en tamanoPantalla
		int alturaPantalla = tamanoPantalla.height;
		//Se obtiene el ancho de la resolucion que se almacenaba en tamanoPantalla
		int anchoPantalla = tamanoPantalla.width;
		//Marco con la mitad de dimensión de la pantalla
		setSize(anchoPantalla/3, alturaPantalla/2);
		//Se coloca el marco en el centro
		setLocation(anchoPantalla/4, alturaPantalla/4);
                //Redimensionar el marco/frame true=si redimensionar o false=no
                setResizable(false);
		//Establece el título del frame
		setTitle("Imagen");
    }
    //Este método se llama desde dentro del constructor para inicializar el formulario
    private void initComponents() {
        //Se crean el boton y el panel
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        //Cuando se cierra la ventana el programa termina
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        jButton1.setText("Imagen");//Se añade texto al botón
        //Se pone a la escucha para recibir eventos de acción
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            //Cuando el evento ocurre el método es invocado
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        //GroupLayout: agrupa componentes para posicionarlos en un Container. GroupLayout
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jButton1)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(124, 200, 200))
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        //es preferible llamar a setSize, ya que el paquete deja al administrador de diseño de cuadros
        pack();
    }                 
    //método que se invoca cuando se produce una acción
    private void jButton1ActionPerformed(ActionEvent evt) {
        //Se crea un objeto de tipo Imagen
        Imagen Imagen = new Imagen();
        jPanel1.add(Imagen);//Se agrega la imagen al panel
        jPanel1.repaint();
    }                                        
    public static void main(String args[]) {
        //Nimbus utiliza gráficos vectoriales Java 2D para dibujar la interfaz de usuario (IU)
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //Crea y muestra el formulario
        //la manera de asegurar que la GUI no sea bloqueada es usar la siguiente clase
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {//Corre el hilo de ejecución
                new Window().setVisible(true);
            }
        });
    }                
}
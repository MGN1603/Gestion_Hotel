package Vistas;

import Controladores.ControladorHabitacion;
import Controladores.ControladorHuesped;
import Controladores.ControladorReserva;
import DTOs.HabitacionDTO;
import DTOs.HuespedDTO;
import Excepciones.HabitacionExistenteExcepcion;
import Excepciones.HabitacionNoEncontradaExcepcion;
import Excepciones.HuespedExistenteExcepcion;
import Excepciones.HuespedNoEncontradoExcepcion;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/* 
//Jframe principal donde se hacen los debidos rgistros solo se maneja UI y se delega con la logica del controlador
//para mantener un buen flujo de la aplicacion y mantener responsabilidades unicas SRP.
*/
public class VentanaPrincipal extends javax.swing.JFrame {

    private final ControladorHuesped controladorHuesped;
    private final ControladorReserva controladorReserva;
    private final ControladorHabitacion controladorHabitacion;

    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Sistema Gestion Reservas ECOHOTEL");
        this.controladorHabitacion = new ControladorHabitacion();
        this.controladorHuesped = new ControladorHuesped();
        this.controladorReserva = new ControladorReserva(controladorHuesped, controladorHabitacion);
        llenarTablaReserva();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pestanas = new javax.swing.JTabbedPane();
        pestanaRegistroHuesped = new javax.swing.JPanel();
        panelFondoHuesped = new javax.swing.JPanel();
        panelDatosHuesped = new javax.swing.JPanel();
        lblTituloHuesped = new javax.swing.JLabel();
        separador_1 = new javax.swing.JSeparator();
        lblNombreHuesped = new javax.swing.JLabel();
        lblDocumentoHuesped = new javax.swing.JLabel();
        lblTelefonoHuesped = new javax.swing.JLabel();
        lblCorreoHuesped = new javax.swing.JLabel();
        txtDocumentoHuesped = new javax.swing.JTextField();
        txtNombreHuesped = new javax.swing.JTextField();
        txtTelefonoHuesped = new javax.swing.JTextField();
        txtCorreoHuesped = new javax.swing.JTextField();
        btnBuscarHuesped = new javax.swing.JButton();
        btnRegistrarHuesped = new javax.swing.JButton();
        btnEliminarHuesped = new javax.swing.JButton();
        btnActualizarHuesped = new javax.swing.JButton();
        pestanaRegistroHabitacion = new javax.swing.JPanel();
        panelFondo = new javax.swing.JPanel();
        panelDatosHabitacion = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        separador_2 = new javax.swing.JSeparator();
        lblNumHabitacion = new javax.swing.JLabel();
        lblCapacidad = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        comboBoxEstado = new javax.swing.JComboBox<>();
        spinnerCapacidad = new javax.swing.JSpinner();
        txtNumHabitacion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDatosHabitacion = new javax.swing.JTable();
        btnGuardarHabitacion = new javax.swing.JButton();
        lblTipoHabitacion1 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        btnCambiarEstado = new javax.swing.JButton();
        pestanaListaHuesped = new javax.swing.JPanel();
        panelFondoListaHuesped = new javax.swing.JPanel();
        panelTablaHuesped = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatosHuesped = new javax.swing.JTable();
        btnAgendarReserva = new javax.swing.JButton();
        btnVerReserva = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        pestanaListaReserva = new javax.swing.JPanel();
        panelFondoReserva = new javax.swing.JPanel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaDatosReserva = new javax.swing.JTable();
        lblListaReserva = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondoHuesped.setBackground(new java.awt.Color(0, 0, 0));

        panelDatosHuesped.setBackground(new java.awt.Color(49, 87, 44));
        panelDatosHuesped.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelDatosHuesped.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloHuesped.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTituloHuesped.setForeground(new java.awt.Color(236, 243, 158));
        lblTituloHuesped.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloHuesped.setText("Registro Huesped");
        panelDatosHuesped.add(lblTituloHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 220, -1));
        panelDatosHuesped.add(separador_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 672, 10));

        lblNombreHuesped.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblNombreHuesped.setForeground(new java.awt.Color(248, 249, 250));
        lblNombreHuesped.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreHuesped.setText("Nombre:");
        panelDatosHuesped.add(lblNombreHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 75, 62, -1));

        lblDocumentoHuesped.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblDocumentoHuesped.setForeground(new java.awt.Color(248, 249, 250));
        lblDocumentoHuesped.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocumentoHuesped.setText("Documento:");
        panelDatosHuesped.add(lblDocumentoHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 128, 88, -1));

        lblTelefonoHuesped.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblTelefonoHuesped.setForeground(new java.awt.Color(248, 249, 250));
        lblTelefonoHuesped.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoHuesped.setText("Telefono:");
        panelDatosHuesped.add(lblTelefonoHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 179, 88, -1));

        lblCorreoHuesped.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblCorreoHuesped.setForeground(new java.awt.Color(248, 249, 250));
        lblCorreoHuesped.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoHuesped.setText("Correo:");
        panelDatosHuesped.add(lblCorreoHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 227, 88, -1));
        panelDatosHuesped.add(txtDocumentoHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 123, 208, -1));
        panelDatosHuesped.add(txtNombreHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 70, 208, -1));
        panelDatosHuesped.add(txtTelefonoHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 174, 208, -1));
        panelDatosHuesped.add(txtCorreoHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 222, 208, -1));

        btnBuscarHuesped.setBackground(new java.awt.Color(19, 42, 19));
        btnBuscarHuesped.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBuscarHuesped.setForeground(new java.awt.Color(248, 249, 250));
        btnBuscarHuesped.setText("Buscar Huesped");
        btnBuscarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHuespedActionPerformed(evt);
            }
        });
        panelDatosHuesped.add(btnBuscarHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 276, 160, -1));

        btnRegistrarHuesped.setBackground(new java.awt.Color(19, 42, 19));
        btnRegistrarHuesped.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegistrarHuesped.setForeground(new java.awt.Color(248, 249, 250));
        btnRegistrarHuesped.setText("Registrar Huesped");
        btnRegistrarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarHuespedActionPerformed(evt);
            }
        });
        panelDatosHuesped.add(btnRegistrarHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 276, 170, -1));

        btnEliminarHuesped.setBackground(new java.awt.Color(19, 42, 19));
        btnEliminarHuesped.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnEliminarHuesped.setForeground(new java.awt.Color(248, 249, 250));
        btnEliminarHuesped.setText("Eliminar Huesped");
        btnEliminarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHuespedActionPerformed(evt);
            }
        });
        panelDatosHuesped.add(btnEliminarHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 321, 160, -1));

        btnActualizarHuesped.setBackground(new java.awt.Color(19, 42, 19));
        btnActualizarHuesped.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnActualizarHuesped.setForeground(new java.awt.Color(248, 249, 250));
        btnActualizarHuesped.setText("Actualizar Datos");
        btnActualizarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarHuespedActionPerformed(evt);
            }
        });
        panelDatosHuesped.add(btnActualizarHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 321, 170, -1));

        javax.swing.GroupLayout panelFondoHuespedLayout = new javax.swing.GroupLayout(panelFondoHuesped);
        panelFondoHuesped.setLayout(panelFondoHuespedLayout);
        panelFondoHuespedLayout.setHorizontalGroup(
            panelFondoHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoHuespedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFondoHuespedLayout.setVerticalGroup(
            panelFondoHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoHuespedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pestanaRegistroHuespedLayout = new javax.swing.GroupLayout(pestanaRegistroHuesped);
        pestanaRegistroHuesped.setLayout(pestanaRegistroHuespedLayout);
        pestanaRegistroHuespedLayout.setHorizontalGroup(
            pestanaRegistroHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanaRegistroHuespedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondoHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pestanaRegistroHuespedLayout.setVerticalGroup(
            pestanaRegistroHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanaRegistroHuespedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondoHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pestanas.addTab("Registro Huespedes", pestanaRegistroHuesped);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        panelDatosHabitacion.setBackground(new java.awt.Color(49, 87, 44));
        panelDatosHabitacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelDatosHabitacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(236, 243, 158));
        lblTitulo.setText("Registrar Habitacion");
        panelDatosHabitacion.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));
        panelDatosHabitacion.add(separador_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 30, 684, 10));

        lblNumHabitacion.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblNumHabitacion.setForeground(new java.awt.Color(248, 249, 250));
        lblNumHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumHabitacion.setText("Numero Habitacion:");
        panelDatosHabitacion.add(lblNumHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 24));

        lblCapacidad.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblCapacidad.setForeground(new java.awt.Color(248, 249, 250));
        lblCapacidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCapacidad.setText("Capacidad:");
        panelDatosHabitacion.add(lblCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 98, 30));

        lblEstado.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(248, 249, 250));
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstado.setText("Estado:");
        panelDatosHabitacion.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 93, 30));

        comboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Ocupada", "Mantenimiento" }));
        panelDatosHabitacion.add(comboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 150, -1));
        panelDatosHabitacion.add(spinnerCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 154, -1));
        panelDatosHabitacion.add(txtNumHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 153, -1));

        tablaDatosHabitacion.setBackground(new java.awt.Color(19, 42, 19));
        tablaDatosHabitacion.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tablaDatosHabitacion.setForeground(new java.awt.Color(248, 249, 250));
        tablaDatosHabitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaDatosHabitacion);

        panelDatosHabitacion.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 273, 220));

        btnGuardarHabitacion.setBackground(new java.awt.Color(19, 42, 19));
        btnGuardarHabitacion.setForeground(new java.awt.Color(248, 249, 250));
        btnGuardarHabitacion.setText("Guardar Habitacion");
        btnGuardarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarHabitacionActionPerformed(evt);
            }
        });
        panelDatosHabitacion.add(btnGuardarHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 150, -1));

        lblTipoHabitacion1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblTipoHabitacion1.setForeground(new java.awt.Color(248, 249, 250));
        lblTipoHabitacion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoHabitacion1.setText("Tipo Habitacion:");
        panelDatosHabitacion.add(lblTipoHabitacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 123, 24));
        panelDatosHabitacion.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 153, -1));

        btnCambiarEstado.setBackground(new java.awt.Color(19, 42, 19));
        btnCambiarEstado.setForeground(new java.awt.Color(248, 249, 250));
        btnCambiarEstado.setText("Cambiar Estado");
        btnCambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarEstadoActionPerformed(evt);
            }
        });
        panelDatosHabitacion.add(btnCambiarEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 160, -1));

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pestanaRegistroHabitacionLayout = new javax.swing.GroupLayout(pestanaRegistroHabitacion);
        pestanaRegistroHabitacion.setLayout(pestanaRegistroHabitacionLayout);
        pestanaRegistroHabitacionLayout.setHorizontalGroup(
            pestanaRegistroHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanaRegistroHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pestanaRegistroHabitacionLayout.setVerticalGroup(
            pestanaRegistroHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanaRegistroHabitacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pestanas.addTab("Registro Habitaciones", pestanaRegistroHabitacion);

        panelFondoListaHuesped.setBackground(new java.awt.Color(0, 0, 0));

        panelTablaHuesped.setBackground(new java.awt.Color(49, 87, 44));
        panelTablaHuesped.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaDatosHuesped.setBackground(new java.awt.Color(19, 42, 19));
        tablaDatosHuesped.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tablaDatosHuesped.setForeground(new java.awt.Color(248, 249, 250));
        tablaDatosHuesped.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaDatosHuesped);

        btnAgendarReserva.setBackground(new java.awt.Color(19, 42, 19));
        btnAgendarReserva.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAgendarReserva.setForeground(new java.awt.Color(248, 249, 250));
        btnAgendarReserva.setText("Agendar Reserva");
        btnAgendarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarReservaActionPerformed(evt);
            }
        });

        btnVerReserva.setBackground(new java.awt.Color(19, 42, 19));
        btnVerReserva.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnVerReserva.setForeground(new java.awt.Color(248, 249, 250));
        btnVerReserva.setText("Ver Reservas");
        btnVerReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerReservaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 243, 158));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista Huesped");

        javax.swing.GroupLayout panelTablaHuespedLayout = new javax.swing.GroupLayout(panelTablaHuesped);
        panelTablaHuesped.setLayout(panelTablaHuespedLayout);
        panelTablaHuespedLayout.setHorizontalGroup(
            panelTablaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaHuespedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(panelTablaHuespedLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnAgendarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnVerReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(panelTablaHuespedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(panelTablaHuespedLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTablaHuespedLayout.setVerticalGroup(
            panelTablaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaHuespedLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTablaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgendarReserva)
                    .addComponent(btnVerReserva))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout panelFondoListaHuespedLayout = new javax.swing.GroupLayout(panelFondoListaHuesped);
        panelFondoListaHuesped.setLayout(panelFondoListaHuespedLayout);
        panelFondoListaHuespedLayout.setHorizontalGroup(
            panelFondoListaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoListaHuespedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTablaHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFondoListaHuespedLayout.setVerticalGroup(
            panelFondoListaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoListaHuespedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTablaHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pestanaListaHuespedLayout = new javax.swing.GroupLayout(pestanaListaHuesped);
        pestanaListaHuesped.setLayout(pestanaListaHuespedLayout);
        pestanaListaHuespedLayout.setHorizontalGroup(
            pestanaListaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanaListaHuespedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondoListaHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pestanaListaHuespedLayout.setVerticalGroup(
            pestanaListaHuespedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanaListaHuespedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondoListaHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pestanas.addTab("Lista Huespedes", pestanaListaHuesped);

        panelFondoReserva.setBackground(new java.awt.Color(0, 0, 0));

        panelTabla.setBackground(new java.awt.Color(49, 87, 44));
        panelTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaDatosReserva.setBackground(new java.awt.Color(19, 42, 19));
        tablaDatosReserva.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tablaDatosReserva.setForeground(new java.awt.Color(248, 249, 250));
        tablaDatosReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaDatosReserva);

        lblListaReserva.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblListaReserva.setForeground(new java.awt.Color(236, 243, 158));
        lblListaReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListaReserva.setText("Lista Reservas");

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(lblListaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblListaReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelFondoReservaLayout = new javax.swing.GroupLayout(panelFondoReserva);
        panelFondoReserva.setLayout(panelFondoReservaLayout);
        panelFondoReservaLayout.setHorizontalGroup(
            panelFondoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFondoReservaLayout.setVerticalGroup(
            panelFondoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pestanaListaReservaLayout = new javax.swing.GroupLayout(pestanaListaReserva);
        pestanaListaReserva.setLayout(pestanaListaReservaLayout);
        pestanaListaReservaLayout.setHorizontalGroup(
            pestanaListaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanaListaReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondoReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pestanaListaReservaLayout.setVerticalGroup(
            pestanaListaReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanaListaReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pestanas.addTab("Lista Reservas", pestanaListaReserva);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pestanas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pestanas, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //accion del boton para agendar una reserva mediante un evento con la tabla.
    private void btnAgendarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarReservaActionPerformed
        int filaSeleccionada = tablaDatosHuesped.getSelectedRow();
        if (filaSeleccionada != -1) {
            try {
                int idHuesped = Integer.parseInt(tablaDatosHuesped.getValueAt(filaSeleccionada, 0).toString());

                HuespedDTO huesped = controladorHuesped.buscarHuesped(idHuesped);

                VentanaRegistroReserva dialog = new VentanaRegistroReserva(this, rootPaneCheckingEnabled, controladorReserva, controladorHabitacion, huesped);
                dialog.setVisible(true);
                llenarTablaReserva();
            } catch (HuespedNoEncontradoExcepcion e) {
                JOptionPane.showMessageDialog(this, "Huésped no encontrado: " + e.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un huésped para agendar la reserva.");
        }
    }//GEN-LAST:event_btnAgendarReservaActionPerformed

    private void btnActualizarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarHuespedActionPerformed

        try {
            int documento = Integer.parseInt(txtDocumentoHuesped.getText().trim());
            String nombre = txtNombreHuesped.getText().trim();
            String telefono = txtTelefonoHuesped.getText().trim();
            String correo = txtCorreoHuesped.getText().trim();

            HuespedDTO huespedActualizado = new HuespedDTO(documento, nombre, telefono, correo);
            controladorHuesped.actualizarDatos(huespedActualizado);

            JOptionPane.showMessageDialog(this, "Datos del huésped actualizados correctamente.");
            limpiarCampos();
            llenarTabla();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El documento debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error de validación", JOptionPane.ERROR_MESSAGE);

        } catch (HuespedExistenteExcepcion e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarHuespedActionPerformed

    private void btnEliminarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHuespedActionPerformed
        try {
            String input = txtDocumentoHuesped.getText().trim();
            if (input.isEmpty()) {
                throw new IllegalArgumentException("Debe ingresar un número de documento para eliminar.");
            }

            int documento = Integer.parseInt(input);

            // Confirmar eliminación
            int confirmacion = JOptionPane.showConfirmDialog(
                    this,
                    "¿Está seguro que desea eliminar al huésped con documento " + documento + "?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirmacion == JOptionPane.YES_OPTION) {
                controladorHuesped.eliminarHuesped(documento);
                JOptionPane.showMessageDialog(this, "Huésped eliminado exitosamente.");
                limpiarCampos();
                llenarTabla();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El documento debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error de validación", JOptionPane.ERROR_MESSAGE);

        } catch (HuespedExistenteExcepcion e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error al eliminar", JOptionPane.ERROR_MESSAGE);

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error general", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarHuespedActionPerformed

    private void btnRegistrarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarHuespedActionPerformed
        try {
            int documento = Integer.parseInt(txtDocumentoHuesped.getText().trim());
            String nombre = txtNombreHuesped.getText().trim();
            String telefono = txtTelefonoHuesped.getText().trim();
            String correo = txtCorreoHuesped.getText().trim();

            HuespedDTO huesped = new HuespedDTO(documento, nombre, telefono, correo);
            controladorHuesped.guardarHuesped(huesped);

            JOptionPane.showMessageDialog(this, "Huésped registrado con éxito");
            limpiarCampos();
            llenarTabla();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El documento debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error de validación", JOptionPane.ERROR_MESSAGE);

        } catch (HuespedExistenteExcepcion e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarHuespedActionPerformed

    private void btnBuscarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHuespedActionPerformed
        try {
            String input = txtDocumentoHuesped.getText().trim();
            if (input.isEmpty()) {
                throw new IllegalArgumentException("Por favor, ingrese un número de documento.");
            }

            int documento = Integer.parseInt(input);

            HuespedDTO encontrado = controladorHuesped.buscarHuesped(documento);

            txtNombreHuesped.setText(encontrado.getNombre());
            txtTelefonoHuesped.setText(encontrado.getTelefono());
            txtCorreoHuesped.setText(encontrado.getCorreo());

            JOptionPane.showMessageDialog(this, "Huésped encontrado.");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El documento debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error de validación", JOptionPane.ERROR_MESSAGE);

        } catch (HuespedNoEncontradoExcepcion e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "No encontrado", JOptionPane.ERROR_MESSAGE);

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarHuespedActionPerformed

    private void btnGuardarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarHabitacionActionPerformed
        try {
            int numHabitacion = Integer.parseInt(txtNumHabitacion.getText());
            String tipo = txtTipo.getText().trim();
            int capacidad = Integer.parseInt(spinnerCapacidad.getValue().toString());
            String estado = comboBoxEstado.getSelectedItem().toString();
            int idReserva = 0;
            HabitacionDTO habitacion = new HabitacionDTO(numHabitacion, tipo, capacidad, estado, idReserva);

            controladorHabitacion.registrarHabitacion(habitacion);

            JOptionPane.showMessageDialog(this, "Habitación registrada con éxito. Número: " + numHabitacion);
            limpiarCamposHabitacion();
            actualizarTablaHabitaciones();

        } catch (HabitacionExistenteExcepcion e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La capacidad debe ser un número válido.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Error de validación: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage());
        }

    }//GEN-LAST:event_btnGuardarHabitacionActionPerformed

    private void btnVerReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerReservaActionPerformed
        int filaSeleccionada = tablaDatosHuesped.getSelectedRow();
        if (filaSeleccionada != -1) {
            try {
                int idHuesped = Integer.parseInt(tablaDatosHuesped.getValueAt(filaSeleccionada, 0).toString());

                HuespedDTO huesped = controladorHuesped.buscarHuesped(idHuesped);

                VentanaTablaReserva dialog = new VentanaTablaReserva(this, rootPaneCheckingEnabled, controladorReserva, huesped);
                dialog.setVisible(true);
                llenarTablaReserva();
            } catch (HuespedNoEncontradoExcepcion e) {
                JOptionPane.showMessageDialog(this, "Huésped no encontrado: " + e.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un huésped para agendar la reserva.");
        }


    }//GEN-LAST:event_btnVerReservaActionPerformed

    private void btnCambiarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarEstadoActionPerformed
        try {
            int numero = Integer.parseInt(txtNumHabitacion.getText());
            String estadoSeleccionado = comboBoxEstado.getSelectedItem().toString();
            controladorHabitacion.actualizarEstadoHabitacion(numero, estadoSeleccionado);
            JOptionPane.showMessageDialog(null, "Estado actualizado correctamente.");
            actualizarTablaHabitaciones();
        } catch (HabitacionNoEncontradaExcepcion e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número inválido de habitación.");
        }
    }//GEN-LAST:event_btnCambiarEstadoActionPerformed

    private void llenarTabla() {
        tablaDatosHuesped.setModel(controladorHuesped.obtenerTablaHuesped());
    }

    private void actualizarTablaHabitaciones() {
        DefaultTableModel modelo = controladorHabitacion.obtenerTablaHabitaciones();
        tablaDatosHabitacion.setModel(modelo);
    }

    private void llenarTablaReserva() {
        tablaDatosReserva.setModel(controladorReserva.obtenerTablaReservas());
    }

    private void limpiarCampos() {
        txtDocumentoHuesped.setText("");
        txtNombreHuesped.setText(null);
        txtTelefonoHuesped.setText(null);
        txtCorreoHuesped.setText(null);
    }

    private void limpiarCamposHabitacion() {
        txtNumHabitacion.setText("");
        comboBoxEstado.setSelectedIndex(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarHuesped;
    private javax.swing.JButton btnAgendarReserva;
    private javax.swing.JButton btnBuscarHuesped;
    private javax.swing.JButton btnCambiarEstado;
    private javax.swing.JButton btnEliminarHuesped;
    private javax.swing.JButton btnGuardarHabitacion;
    private javax.swing.JButton btnRegistrarHuesped;
    private javax.swing.JButton btnVerReserva;
    private javax.swing.JComboBox<String> comboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblCorreoHuesped;
    private javax.swing.JLabel lblDocumentoHuesped;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblListaReserva;
    private javax.swing.JLabel lblNombreHuesped;
    private javax.swing.JLabel lblNumHabitacion;
    private javax.swing.JLabel lblTelefonoHuesped;
    private javax.swing.JLabel lblTipoHabitacion1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloHuesped;
    private javax.swing.JPanel panelDatosHabitacion;
    private javax.swing.JPanel panelDatosHuesped;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelFondoHuesped;
    private javax.swing.JPanel panelFondoListaHuesped;
    private javax.swing.JPanel panelFondoReserva;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JPanel panelTablaHuesped;
    private javax.swing.JPanel pestanaListaHuesped;
    private javax.swing.JPanel pestanaListaReserva;
    private javax.swing.JPanel pestanaRegistroHabitacion;
    private javax.swing.JPanel pestanaRegistroHuesped;
    private javax.swing.JTabbedPane pestanas;
    private javax.swing.JSeparator separador_1;
    private javax.swing.JSeparator separador_2;
    private javax.swing.JSpinner spinnerCapacidad;
    private javax.swing.JTable tablaDatosHabitacion;
    private javax.swing.JTable tablaDatosHuesped;
    private javax.swing.JTable tablaDatosReserva;
    private javax.swing.JTextField txtCorreoHuesped;
    private javax.swing.JTextField txtDocumentoHuesped;
    private javax.swing.JTextField txtNombreHuesped;
    private javax.swing.JTextField txtNumHabitacion;
    private javax.swing.JTextField txtTelefonoHuesped;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}

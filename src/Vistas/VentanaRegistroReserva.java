package Vistas;

import Controladores.ControladorHabitacion;
import Controladores.ControladorReserva;
import DTOs.HabitacionDTO;
import DTOs.HuespedDTO;
import DTOs.ReservaDTO;
import Excepciones.HabitacionNoDisponibleExcepcion;
import Excepciones.HabitacionNoEncontradaExcepcion;
import Excepciones.HuespedNoEncontradoExcepcion;
import Excepciones.ReservaInvalidaExcepcion;
import Modelo.IDsGenerator;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

//ventana emergente que se utiliza unicamente para el registro de una reserva delega desde el controlador.
public class VentanaRegistroReserva extends javax.swing.JDialog {

    private JComboBox<HabitacionDTO> comboBoxHabitaciones;
    private final ControladorReserva controladorReserva;
    private final ControladorHabitacion controladorHabitacion;
    private final HuespedDTO huesped;

    public VentanaRegistroReserva(java.awt.Frame parent, boolean modal, ControladorReserva controladorReserva,
            ControladorHabitacion controladorHabitacion, HuespedDTO huesped) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Reservas para el Huesped: " + huesped.getNombre());
        this.controladorReserva = controladorReserva;
        this.controladorHabitacion = controladorHabitacion;
        this.huesped = huesped;
        cargarDatosHuesped();
        crearComboBoxHabitacionesDisponibles();
    }

    private void cargarDatosHuesped() {
        lblId.setText(String.valueOf(huesped.getDocumento()));
        lblNombre.setText(huesped.getNombre());
    }

    private void crearComboBoxHabitacionesDisponibles() {
        comboBoxHabitaciones = new javax.swing.JComboBox<>();
        DefaultComboBoxModel<HabitacionDTO> modelo = new DefaultComboBoxModel<>();
        comboBoxHabitaciones.setModel(modelo);

        for (HabitacionDTO habitacion : controladorHabitacion.obtenerHabitacionesDisponibles()) {
            if ("libre".equalsIgnoreCase(habitacion.getEstado())) {
                modelo.addElement(habitacion);
            }
        }

        comboBoxHabitaciones.setBounds(164, 240, 184, 25);
        panelDatos.setLayout(null);
        panelDatos.add(comboBoxHabitaciones);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblHabitacion = new javax.swing.JLabel();
        lblNombreHuesped = new javax.swing.JLabel();
        lblFechaEntrada = new javax.swing.JLabel();
        lblFechaSalida = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        btnRegistrarReserva = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblIDHuesped = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtFechaSalida = new javax.swing.JTextField();
        txtFechaEntrada = new javax.swing.JTextField();
        btnBuscarReserva = new javax.swing.JButton();
        btnEliminarReserva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        panelDatos.setBackground(new java.awt.Color(49, 87, 44));
        panelDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(236, 243, 158));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registrar Reserva");
        panelDatos.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 200, -1));

        lblHabitacion.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblHabitacion.setForeground(new java.awt.Color(248, 249, 250));
        lblHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHabitacion.setText("Habitaciones Dispo:");
        panelDatos.add(lblHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 160, 30));

        lblNombreHuesped.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblNombreHuesped.setForeground(new java.awt.Color(248, 249, 250));
        lblNombreHuesped.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreHuesped.setText("Nombre Huesped:");
        panelDatos.add(lblNombreHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, -1));

        lblFechaEntrada.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblFechaEntrada.setForeground(new java.awt.Color(248, 249, 250));
        lblFechaEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaEntrada.setText("Fecha Entrada:");
        panelDatos.add(lblFechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, 30));

        lblFechaSalida.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblFechaSalida.setForeground(new java.awt.Color(248, 249, 250));
        lblFechaSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaSalida.setText("Fecha Salida:");
        panelDatos.add(lblFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, 30));
        panelDatos.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 498, 10));

        btnRegistrarReserva.setBackground(new java.awt.Color(19, 42, 19));
        btnRegistrarReserva.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegistrarReserva.setForeground(new java.awt.Color(248, 249, 250));
        btnRegistrarReserva.setText("Registrar ");
        btnRegistrarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarReservaActionPerformed(evt);
            }
        });
        panelDatos.add(btnRegistrarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 172, -1));

        btnCancelar.setBackground(new java.awt.Color(19, 42, 19));
        btnCancelar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(248, 249, 250));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelDatos.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 210, -1));
        panelDatos.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 190, 27));

        lblIDHuesped.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblIDHuesped.setForeground(new java.awt.Color(248, 249, 250));
        lblIDHuesped.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDHuesped.setText("ID. Huesped:");
        panelDatos.add(lblIDHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, -1));
        panelDatos.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 190, 27));
        panelDatos.add(txtFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 190, -1));
        panelDatos.add(txtFechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 190, -1));

        btnBuscarReserva.setBackground(new java.awt.Color(19, 42, 19));
        btnBuscarReserva.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBuscarReserva.setForeground(new java.awt.Color(248, 249, 250));
        btnBuscarReserva.setText("Buscar");
        btnBuscarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReservaActionPerformed(evt);
            }
        });
        panelDatos.add(btnBuscarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 150, -1));

        btnEliminarReserva.setBackground(new java.awt.Color(19, 42, 19));
        btnEliminarReserva.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnEliminarReserva.setForeground(new java.awt.Color(248, 249, 250));
        btnEliminarReserva.setText("Eliminar");
        btnEliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarReservaActionPerformed(evt);
            }
        });
        panelDatos.add(btnEliminarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 150, -1));

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarReservaActionPerformed
        try {
            HabitacionDTO habitacionSeleccionada = (HabitacionDTO) comboBoxHabitaciones.getSelectedItem();
            if (habitacionSeleccionada == null) {
                JOptionPane.showMessageDialog(this, "Debes seleccionar una habitación.");
                return;
            }
            String idReserva = IDsGenerator.generateReservaId();
            LocalDate fechaEntrada = LocalDate.parse(txtFechaEntrada.getText());
            LocalDate fechaSalida = LocalDate.parse(txtFechaSalida.getText());

            ReservaDTO nuevaReserva = new ReservaDTO(
                    idReserva,
                    fechaEntrada,
                    fechaSalida,
                    huesped.getDocumento(),
                    habitacionSeleccionada.getNumeroH()
            );

            controladorReserva.registrarReserva(nuevaReserva);

            JOptionPane.showMessageDialog(this, "Reserva registrada con éxito.");

        } catch (ReservaInvalidaExcepcion | HabitacionNoDisponibleExcepcion
                | HabitacionNoEncontradaExcepcion | HuespedNoEncontradoExcepcion e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Formato inválido o error inesperado.");
        }
    }//GEN-LAST:event_btnRegistrarReservaActionPerformed

    private void btnBuscarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReservaActionPerformed
        try {
            String id = JOptionPane.showInputDialog("Ingrese el ID de la reserva a buscar (Ej: RES-1)");

            if (id != null && !id.trim().isEmpty()) {
                ReservaDTO reserva = controladorReserva.buscarReserva(id.trim());

                JOptionPane.showMessageDialog(null,
                        "Reserva encontrada:\n"
                        + "ID: " + reserva.getIdReserva() + "\n"
                        + "Habitación: " + reserva.getIdHabitacion() + "\n"
                        + "Desde: " + reserva.getFechaEntrada() + "\n"
                        + "Hasta: " + reserva.getFechaSalida()
                );
            } else {
                JOptionPane.showMessageDialog(null, "ID vacío o cancelado.");
            }
        } catch (ReservaInvalidaExcepcion ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarReservaActionPerformed

    private void btnEliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarReservaActionPerformed
        try {
            String id = JOptionPane.showInputDialog("Ingrese el ID de la reserva a eliminar (Ej: RES-1)");
            if (id != null && !id.trim().isEmpty()) {
                controladorReserva.eliminarReserva(id.trim());
                JOptionPane.showMessageDialog(null, "Reserva eliminada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "ID vacío o cancelado.");
            }
        } catch (ReservaInvalidaExcepcion ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarReservaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarReserva;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarReserva;
    private javax.swing.JButton btnRegistrarReserva;
    private javax.swing.JLabel lblFechaEntrada;
    private javax.swing.JLabel lblFechaSalida;
    private javax.swing.JLabel lblHabitacion;
    private javax.swing.JLabel lblIDHuesped;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreHuesped;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JSeparator separador1;
    private javax.swing.JTextField txtFechaEntrada;
    private javax.swing.JTextField txtFechaSalida;
    // End of variables declaration//GEN-END:variables
}

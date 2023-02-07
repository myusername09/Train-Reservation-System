import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TrainReservation extends JFrame implements ActionListener {
   private JLabel lblTrainNo,lblTrainName, lblSource, lblDestination, lblAvailableSeats;
   private JTextField txtTrainNo,txtTrainName, txtSource, txtDestination, txtAvailableSeats;
   private JButton btnBook, btnCancel;
   private int availableSeats;
   
   public TrainReservation() {
      setTitle("Train Reservation System");
      setLayout(new FlowLayout());
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      lblTrainNo = new JLabel("Train Number:");
      add(lblTrainNo);
      
      txtTrainNo = new JTextField(10);
      add(txtTrainNo);
      
      lblTrainName = new JLabel("Train Name:");
      add(lblTrainName);
      
      txtTrainName = new JTextField(10);
      add(txtTrainName);
      
      lblSource = new JLabel("Source:");
      add(lblSource);
      
      txtSource = new JTextField(10);
      add(txtSource);
      
      lblDestination = new JLabel("Destination:");
      add(lblDestination);
      
      txtDestination = new JTextField(10);
      add(txtDestination);
      
      lblAvailableSeats = new JLabel("Available Seats:");
      add(lblAvailableSeats);
      
      txtAvailableSeats = new JTextField(10);
      txtAvailableSeats.setEditable(false);
      add(txtAvailableSeats);
      
      btnBook = new JButton("Book");
      btnBook.addActionListener(this);
      add(btnBook);
      
      btnCancel = new JButton("Cancel");
      btnCancel.addActionListener(this);
      add(btnCancel);
      
      availableSeats = 20;
      txtAvailableSeats.setText(String.valueOf(availableSeats));
      
      pack();
      setVisible(true);
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == btnBook) {
         if (availableSeats > 0) {
            availableSeats--;
            txtAvailableSeats.setText(String.valueOf(availableSeats));
            JOptionPane.showMessageDialog(this, "Ticket Booked Successfully!");
         } else {
            JOptionPane.showMessageDialog(this, "No seats available!");
         }
      } else if (e.getSource() == btnCancel) {
         if (availableSeats < 20) {
            availableSeats++;
            txtAvailableSeats.setText(String.valueOf(availableSeats));
            JOptionPane.showMessageDialog(this, "Ticket Cancelled Successfully!");
         } else {
            JOptionPane.showMessageDialog(this, "All seats are already available!");
         }
      }
   }
   
   
   public static void main(String[] args) {
      new TrainReservation();
   }
   }


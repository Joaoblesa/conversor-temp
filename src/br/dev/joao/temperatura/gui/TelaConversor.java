package br.dev.joao.temperatura.gui;

import br.dev.joao.temperatura.model.Temperatura; // Corrigido para importar a classe Temperatura
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaConversor {
    
    // Método para criar a interface gráfica do conversor
    public void criarTelaConversor() {
        // Criação do JFrame
        JFrame tela = new JFrame();
        tela.setTitle("Conversor de Temperatura");
        tela.setSize(500, 400);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null);
        tela.setResizable(false);

        // Criação dos componentes da interface
        JLabel labelCelsius = new JLabel("Temperatura em graus Celsius:");
        labelCelsius.setBounds(30, 50, 240, 20);

        JTextField textCelsius = new JTextField();
        textCelsius.setBounds(30, 70, 440, 40);

        JButton buttonFahreinheit = new JButton("FAHRENHEIT");
        buttonFahreinheit.setBounds(30, 120, 220, 40);

        JButton buttonKelvin = new JButton("KELVIN");
        buttonKelvin.setBounds(250, 120, 220, 40);

        JLabel labelResultado = new JLabel("");
        labelResultado.setBounds(120, 200, 400, 40);
        Font fonte1 = new Font("Arial", Font.BOLD, 30);
        labelResultado.setFont(fonte1);

        JLabel labelMensagemErro = new JLabel("ERRO: impossível realizar conta");
        labelMensagemErro.setBounds(120, 250, 400, 30);
        labelMensagemErro.setForeground(Color.RED);
        labelMensagemErro.setVisible(false);

        // Ação do botão Fahrenheit
        buttonFahreinheit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String celsius = textCelsius.getText();
                    double celsiusDouble = Double.parseDouble(celsius);
                    Temperatura temp1 = new Temperatura();
                    temp1.setCelsius(celsiusDouble);
                    double fahrenheit = temp1.converterParafahrenheit();
                    labelResultado.setText(fahrenheit + " °F");
                    labelResultado.setVisible(true);
                    labelMensagemErro.setVisible(false);
                } catch (Exception ex) {
                    labelResultado.setVisible(false);
                    labelMensagemErro.setVisible(true);
                }
            }
        });

        // Ação do botão Kelvin
        buttonKelvin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String celsius = textCelsius.getText();
                    double celsiusDouble = Double.parseDouble(celsius);
                    Temperatura temp2 = new Temperatura();
                    temp2.setCelsius(celsiusDouble);
                    double kelvin = temp2.converterParaKelvin();
                    labelResultado.setText(kelvin + " K");
                    labelResultado.setVisible(true);
                    labelMensagemErro.setVisible(false);
                } catch (Exception ex) {
                    labelResultado.setVisible(false);
                    labelMensagemErro.setVisible(true);
                }
            }
        });

        // Adicionando componentes à tela
        tela.getContentPane().add(labelCelsius);
        tela.getContentPane().add(textCelsius);
        tela.getContentPane().add(buttonFahreinheit);
        tela.getContentPane().add(buttonKelvin);
        tela.getContentPane().add(labelResultado);
        tela.getContentPane().add(labelMensagemErro);

        tela.setVisible(true);
    }
}

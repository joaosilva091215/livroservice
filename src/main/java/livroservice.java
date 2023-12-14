/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
/**
 *
 * @author jpos1
 */
@WebService
public class livroservice {
@WebMethod
public String obterInformacoesLivro(String titulo) {
// Simplesmente retornando algumas informações para ilustrar o exemplo
if (titulo.equals("Aventuras do NetBeans")) {
return "Autor: Java Developer\nAno: 2023";
} else {
return "Livro não encontrado.";
}
}
}

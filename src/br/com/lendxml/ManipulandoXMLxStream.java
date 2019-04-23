package br.com.lendxml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Calendar;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class ManipulandoXMLxStream {

	public static void main(String[] args) {
		
		NotaFiscal nf = new NotaFiscal(234324, 223344, Calendar.getInstance(), "Entrada", 5);
		
		XStream stream = new XStream(new DomDriver());
		stream.alias("NotaFiscal", NotaFiscal.class);
		
		String xml = stream.toXML(nf);
		System.out.println(xml);
		
		gerarArquivo(xml);
		
		lerXMl();

	}
	
	public static void gerarArquivo(String xml) {
		PrintWriter pt = null;
		
		try {
			File file = new File("/Users/lucaspereira/Desktop/Coursera/arquivoGerado.xml");
			pt  = new PrintWriter(file);
			
			pt.write(xml);
			pt.flush();
			pt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void lerXMl() {
		try {
			FileReader arquivo = new FileReader("/Users/lucaspereira/Desktop/Coursera/arquivoGerado.xml");
			
			XStream stream = new XStream(new DomDriver());
			stream.alias("NotaFiscal", NotaFiscal.class);
			
			NotaFiscal nfe = (NotaFiscal) stream.fromXML(arquivo);
			System.out.println();
			System.out.println("Serie: "+nfe.getSerie());
			System.out.println("Numero: "+nfe.getNumero());
			System.out.println("Data: "+nfe.getDataEmissao());
			System.out.println("Tipo Operacao: "+nfe.getTipoOperacao());
			System.out.println("Natureza Operacao: "+nfe.getNaturezaOperacao());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

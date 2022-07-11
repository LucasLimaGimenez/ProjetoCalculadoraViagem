package br.com.fiap.model;

import br.fiap.com.service.CalculaTempo;

public class Viagem implements CalculaTempo {
	
	private String origem;
	private String destino;
	private int distancia;
	private int velocidade;
	private double horas;
	private double minutos;
	
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public double getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	@Override
	public double calcularTempoMinutos(double distancia, double velocidade) {
		
		double resultado = distancia /velocidade;
		
		return resultado * 60;
	}
	
	@Override
	public int calcularHoras() {
		
		 int horas= (int) calcularTempoMinutos(getDistancia(), getVelocidade()) / 60;
		 
		 return horas;
	}
	
	@Override
	public int calcularMinutos() {
		
		int minutos	= (int) calcularTempoMinutos(getDistancia(), getVelocidade()) % 60;
		
		return minutos; 
				
	}
	
	

}

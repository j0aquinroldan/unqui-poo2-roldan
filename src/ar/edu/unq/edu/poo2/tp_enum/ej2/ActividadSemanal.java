package ar.edu.unq.edu.poo2.tp_enum.ej2;

import java.time.LocalTime;

public class ActividadSemanal {
	private DiaDeLaSemana diaDeLaSemana;
	private LocalTime horaInicio;
	private float duracion;
	private Deporte deporte;
	
	
	
	public ActividadSemanal(DiaDeLaSemana diaDeLaSemana, LocalTime horaInicio, float duracion, Deporte deporte) {
		this.diaDeLaSemana = diaDeLaSemana;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}
	
	public DiaDeLaSemana getDiaDeLaSemana() {
		return diaDeLaSemana;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	
	public float getDuracion() {
		return duracion;
	}
	
	public Deporte getDeporte() {
		return deporte;
	}
	
	public double getCosto() {
		double costoDia=500;
		if (this.diaDeLaSemana.esFinDeSemana()) {
			costoDia = 1000;
		}
		
		return deporte.getComplejidad()*200d + costoDia *duracion;
	}
	
	public String toString() {
		return "Deporte: " + deporte + ". Dia: " + diaDeLaSemana + " A LAS: " + horaInicio + ". Duración: " + duracion + " hora(s).";
	}
	
}

package br.com.caelum.agiletickets.models;

import static org.junit.Assert.*;

import java.util.List;

import junit.framework.Assert;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.junit.Test;


public class EspetaculoTest {

	@Test
	public void deveCriar1SessaoParaIntervalo1DiaPeriodicidadeDiaria() throws Exception {
		Espetaculo espetaculo = new Espetaculo();
		
		LocalDate inicio = new LocalDate(2010, 03, 04);
		LocalDate fim = new LocalDate(2010, 03, 04);
		LocalTime horario = new LocalTime(9, 30);
		Periodicidade periodicidade = Periodicidade.DIARIA;
		
		List<Sessao> sessoes = espetaculo.criaSessoes(inicio, fim, horario, periodicidade);
		
		int numeroSessoes = sessoes.size();
				
		Assert.assertEquals(1, numeroSessoes);
	}
	
	@Test
	public void deveCriar3SessaoParaIntervalo3DiaPeriodicidadeDiaria() throws Exception {
		Espetaculo espetaculo = new Espetaculo();
		
		LocalDate inicio = new LocalDate(2010, 03, 04);
		LocalDate fim = new LocalDate(2010, 03, 06);
		LocalTime horario = new LocalTime(9, 30);
		Periodicidade periodicidade = Periodicidade.DIARIA;
		
		List<Sessao> sessoes = espetaculo.criaSessoes(inicio, fim, horario, periodicidade);
		
		int numeroSessoes = sessoes.size();
				
		Assert.assertEquals(3, numeroSessoes);
	}
	
}

package com.intensivo.intensivao.projection;

public interface GameMinProjection {
	//todos os campos criados são de acordo com o SQL passado no repository
	//essa classe serve como consulta personalizada para a JPA
	Long getId();
	String getTitulo();
	Integer getAno();
	String getImgUrl();
	String getDescCurto();
	Integer getPosicao();
	
	
}

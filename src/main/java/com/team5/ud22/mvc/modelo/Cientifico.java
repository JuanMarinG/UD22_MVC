package com.team5.ud22.mvc.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cientifico {
	private @Getter @Setter String dni;
	private @Getter @Setter String nomApels;
}

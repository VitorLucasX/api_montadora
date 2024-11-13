package com.cursovitor.arquiteturaspring.montadora.configuration;

import com.cursovitor.arquiteturaspring.montadora.enums.TipoMotor;
import com.cursovitor.arquiteturaspring.montadora.model.Motor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindro(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindro(3);
        motor.setModelo("PZYU-0");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    @Primary
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindro(8);
        motor.setModelo("V8MD-8");
        motor.setLitragem(4.0);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }

}

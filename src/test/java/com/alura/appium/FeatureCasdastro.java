package com.alura.appium;

import static org.junit.Assert.assertTrue;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class FeatureCasdastro
{

    @Test
    public void nao_consigo_cadastrar_usuario_com_senhas_que_nao_conferem() throws MalformedURLException {
        AppiumDriverConfig driver = new AppiumDriverConfig();

        MobileElement botaoCadastro = (MobileElement)driver.driver.findElementById("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        botaoCadastro.click();
        MobileElement campoNome =(MobileElement) driver.driver.findElementById("br.com.alura.aluraesporte:id/input_nome");
        MobileElement campoSenha =(MobileElement) driver.driver.findElementById("br.com.alura.aluraesporte:id/input_senha");
        MobileElement campoConfirmarSenha =(MobileElement) driver.driver.findElementById("br.com.alura.aluraesporte:id/input_confirmar_senha");
        campoNome.setValue("Bugan");
        campoSenha.setValue("123");
        campoConfirmarSenha.setValue("456");

        MobileElement botaoConfirmarCadastro =(MobileElement) driver.driver.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
        botaoConfirmarCadastro.click();
        MobileElement erro = (MobileElement) driver.driver.findElementById("br.com.alura.aluraesporte:id/erro_cadastro");

        Assert.assertEquals("Senhas não conferem", erro.getText());
    }
}

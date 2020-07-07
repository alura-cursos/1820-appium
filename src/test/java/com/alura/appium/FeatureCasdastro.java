package com.alura.appium;

import static org.junit.Assert.assertTrue;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

import java.net.MalformedURLException;

public class FeatureCasdastro
{

    @Test
    public void nao_consigo_cadastrar_usuario_com_senhas_que_nao_conferem() {
        AppiumDriver driver = AppiumDriverConfig.Instance().driver;

        MobileElement botaoCadastro = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        botaoCadastro.click();

        MobileElement campoNome =(MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_nome");
        MobileElement campoSenha =(MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_senha");
        MobileElement campoConfirmarSenha =(MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_confirmar_senha");
        campoNome.setValue("Bugan");
        campoSenha.setValue("123");
        campoConfirmarSenha.setValue("456");

        MobileElement botaoConfirmarCadastro =(MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
        botaoConfirmarCadastro.click();
        MobileElement erro = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/erro_cadastro");

        Assert.assertEquals("Senhas não conferem", erro.getText());
        driver.navigate().back();
    }

    @Test
    public void posso_cadastrar_usuario_com_senhas_que_conferem() throws NoSuchElementException {
        AppiumDriver driver = AppiumDriverConfig.Instance().driver;

        MobileElement botaoCadastro = (MobileElement)driver.findElementById("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        botaoCadastro.click();

        MobileElement campoNome =(MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_nome");
        MobileElement campoSenha =(MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_senha");
        MobileElement campoConfirmarSenha =(MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_confirmar_senha");
        campoNome.setValue("Bugan");
        campoSenha.setValue("123");
        campoConfirmarSenha.setValue("123");

        MobileElement botaoConfirmarCadastro =(MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
        botaoConfirmarCadastro.click();

        MobileElement botaoLogar = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/login_botao_logar");

    }

}

package tests.classes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import classes.Conta;
import classes.ContaBancaria;

public class TesteConta{
    private static Conta conta;

    @BeforeClass
	public static void inicializar() {
        TesteConta.conta = new ContaBancaria(null, 1, 1, 0.00, 0.00);
    }

	@AfterClass
	public static void finalizar() {
		TesteConta.conta = null;
	}

	@Before
	public void comecarConta() {
		TesteConta.conta.setSaldo(1000.00);
		TesteConta.conta.setLimite(3000.00);
	}

	@After
	public void finalizarConta() {
		TesteConta.conta.setSaldo(0.00);
		TesteConta.conta.setLimite(0.00);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDepositoFalho() throws IllegalArgumentException {
		TesteConta.conta.depositar(-200.00);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSaqueFalho() throws IllegalArgumentException {
		TesteConta.conta.sacar(-50.00);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testLimiteContratadoFalho() {
		TesteConta.conta.sacar(8000.00);
	}

	@Test
	public void testDeposito() {
		TesteConta.conta.depositar(100.00);

		double saldo = TesteConta.conta.getSaldo();

		Assert.assertEquals("Saldo de R$ 1100.00", 1100.00, saldo, 0.00);
	}

	@Test
	public void testSaque() {
		TesteConta.conta.sacar(600.00);

		double saldo = TesteConta.conta.getSaldo();

		Assert.assertEquals("Saldo de R$ 400.00", 400.00, saldo, 0.00);
	}

	@Test
	public void testLimiteContratado() {
		TesteConta.conta.sacar(1600.00);

		double saldo = TesteConta.conta.getSaldo();

		Assert.assertEquals("Saldo de R$ -100.00", -100.00, saldo, 0.00);
	}


}
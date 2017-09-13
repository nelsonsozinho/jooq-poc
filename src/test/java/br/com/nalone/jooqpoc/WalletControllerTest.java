package br.com.nalone.jooqpoc;

import br.com.nalone.jooqpoc.wallet.vo.WalletVO;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SimpleapiApplication.class)
@WebAppConfiguration
@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD,scripts="classpath:/init.sql")
@Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD,scripts="classpath:/destroy.sql")
public class WalletControllerTest {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Before
	public void setupMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
				.build();
	}

	@Test
	public void testLoadController() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/wallet/user/{userId}", "100"))
		.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testNewWallet() throws Exception {
		WalletVO vo = new WalletVO();

		vo.setDescription("test description");
		vo.setName("test name");

		mockMvc.perform(MockMvcRequestBuilders.post("/wallet/user/{useId}", 100)
		.contentType(MediaType.APPLICATION_JSON_VALUE)
		.content(new Gson().toJson(vo)))
		.andExpect(status().isCreated());
	}

}

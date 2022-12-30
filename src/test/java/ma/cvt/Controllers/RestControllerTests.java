package ma.cvt.Controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import ma.cvt.Configuration.RestConfig;
import ma.cvt.Repositories.StudentRepository;

@WebMvcTest({ StudentController.class, TokenController.class })
@Import(RestConfig.class)
public class RestControllerTests {

  @Autowired
  MockMvc mvc;
  @Autowired
  StudentRepository studentRepository;

  @Test
  void studentsWhenUnauthenticatedThen401() throws Exception {
    this.mvc.perform(MockMvcRequestBuilders.get("/students"))
        .andExpect(MockMvcResultMatchers.status().isUnauthorized());
  }

  @Test
  void studentsWhenAuthenticatedThenGetStudents() throws Exception {
    MvcResult res = this.mvc.perform(MockMvcRequestBuilders.post("/token")
        .with(SecurityMockMvcRequestPostProcessors.httpBasic("emad", "secret")))
        .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
    String token = res.getResponse().getContentAsString();
    this.mvc.perform(MockMvcRequestBuilders.get("/students").header("Athentication", "Bearer " + token))
        .andExpect(MockMvcResultMatchers.status().isOk());
  }
}

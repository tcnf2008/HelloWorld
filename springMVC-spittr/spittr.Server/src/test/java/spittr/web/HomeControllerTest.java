package spittr.web;

import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 * Project: spittr
 * Created by haier on 2017/4/6 23:29.
 * Email:tcnf2008#hotmail.com
 */
//@WebAppConfiguration
public class HomeControllerTest {

    @Test
    public void testHomePage() {
        HomeController controller = new HomeController();
        assertEquals("", "");
    }

    @Test
    public void testHomePageNew() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}

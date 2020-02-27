package test.pivotal.pal.tracker.backlog;

import io.pivotal.pal.tracker.backlog.Application;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

public class BacklogAppTest {

    @Test
    public void embedded() {
        Application.main(new String[]{});

        String response = new RestTemplate().getForObject("http://localhost:8181/stories?projectId=0", String.class);

        assertThat(response).isEqualTo("[]");
    }
}

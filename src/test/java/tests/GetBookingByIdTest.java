package tests;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import core.clients.APIClient;
import core.models.BookingById;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GetBookingByIdTest {

    private APIClient apiClient;
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setup() {
        apiClient = new APIClient();
        objectMapper = new ObjectMapper();
    }

    @Test
    public void getBookingById() throws Exception {
        Response response = apiClient.getBookingById();

        assertThat(response.getStatusCode()).isEqualTo(200);

        String responseBody = response.getBody().asString();
        List<BookingById> bookingsById = objectMapper.readValue(responseBody, new TypeReference<List<BookingById>>() {
        });

        assertThat(bookingsById).isNotEmpty();

    }
}
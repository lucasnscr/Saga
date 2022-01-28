package projection;

import model.CardDetails;
import model.User;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;
import queries.GetUserPaymentDetailsQuery;

@Component
public class UserProjection {

    @QueryHandler
    public User getUserPaymentDetails(GetUserPaymentDetailsQuery query) {
        CardDetails cardDetails
                = CardDetails.builder()
                .name("Diego Jota")
                .validUntilYear(2022)
                .validUntilMonth(01)
                .cardNumber("123456789")
                .cvv(111)
                .build();

        return User.builder()
                .userId(query.getUserId())
                .firstName("Mohamed")
                .lastName("Salah")
                .cardDetails(cardDetails)
                .build();
    }
}

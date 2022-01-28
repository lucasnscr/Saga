package commands;

import lombok.Builder;
import lombok.Data;
import model.CardDetails;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@Builder
public class ValidatePaymentCommand {

    @TargetAggregateIdentifier
    private String paymentId;
    private String orderId;
    private CardDetails cardDetails;
}

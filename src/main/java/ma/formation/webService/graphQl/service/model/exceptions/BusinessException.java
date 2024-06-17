package ma.formation.webService.graphQl.service.model.exceptions;

public class BusinessException extends RuntimeException{
    public BusinessException(String message) {
        super(message);
    }
}

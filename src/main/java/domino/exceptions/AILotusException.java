package domino.exceptions;


public class AILotusException extends AIException {
	private static final long serialVersionUID = 2774049613779163569L;

	public AILotusException(String businessMessage) {
		super(AILotusException.class, businessMessage);
	}

	public AILotusException() {
		super(AILotusException.class);
	}

	public AILotusException(String businessMessage, String detailMessage) {
		super(AILotusException.class, businessMessage, detailMessage);
	}

}

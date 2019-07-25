package gameboard;

public class BoardException extends RuntimeException {

	private static final long serialVersionUID = -3082424513516412978L;

	BoardException(String msg) {
		super(msg);
	}
}

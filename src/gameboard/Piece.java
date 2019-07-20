package gameboard;

import lombok.AccessLevel;
import lombok.Getter;

public class Piece {

	protected Position position;

	@Getter(AccessLevel.PROTECTED)
	private final Board board;

	public Piece(Board board) {
		this.board = board;
	}
}

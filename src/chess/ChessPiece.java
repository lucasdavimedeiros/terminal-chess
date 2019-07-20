package chess;

import gameboard.Board;
import gameboard.Piece;
import lombok.Getter;

public class ChessPiece extends Piece {

	@Getter
	private final Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

}

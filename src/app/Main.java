package app;

import chess.Match;

public class Main {

	public static void main(String[] args) {

		final Match match = new Match();
		UI.printBoard(match.getPieces());
	}

}

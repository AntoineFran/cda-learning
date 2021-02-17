package com.afpa.learning.program;

import static com.afpa.learning.view.SubjectIhm.IHM_INS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

import com.afpa.learning.connection.DatabaseConnection;
import com.afpa.learning.view.Action;
import com.afpa.learning.view.TheActions;

public class Program {
	public static void main(String[] args) {

		DatabaseConnection.getConnection();
		TreeMap<Integer, Action> actions = TheActions.addAllActions();

		boolean continueAction = true;
		List<Integer> choices = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));

		int input = -1;
		do {
			IHM_INS.display("\n**********************\nsaisissez une action: ");
			for (Action action : actions.values()) {
				IHM_INS.display("\t" + action.getId() + ": " + action.getDescription());
			}
			input = IHM_INS.intReader();
			if (choices.contains(input)) {
				continueAction = actions.get(input).execute();
			} else {
				IHM_INS.display("Mauvaise saisie");
			}
		} while (continueAction);
	}
}

package lab8;

import java.awt.Point;
import java.io.*;
import java.util.*;
import plotter.*;

public class TestPlotter2 {
	private static ArrayList<Polyline> readFile(String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner in = new Scanner(file);
		ArrayList<Polyline> lines = new ArrayList<Polyline>();

		while (in.hasNextLine()) {
			String[] params = in.nextLine().split(" ");
			String[] colors = { "red", "green", "blue", "yellow", "orange", "magenta", "cyan", "black" };
			for (String color : colors) {
				if (params[0].contains("#") || params[0].equals("")) {
					break;
				} else {
					if (!params[0].contains(color) && params[1].contains(color)) {
						Polyline line = new Polyline(params[1], Integer.parseInt(params[0]));
						for (int i = 2; i < params.length; i += 2) {
							line.addPoint(new Point(Integer.parseInt(params[i]), Integer.parseInt(params[i + 1])));
						}
						lines.add(line);
						break;
					} else if(params[0].contains(color)) {
						Polyline line = new Polyline(params[0]);
						for (int i = 1; i < params.length; i += 2) {
							line.addPoint(new Point(Integer.parseInt(params[i]), Integer.parseInt(params[i + 1])));
						}
						lines.add(line);
						break;
					}
				}
			}

		}

		return lines;

	}

	public static void main(String[] args) throws FileNotFoundException {
		Plotter plotter = new Plotter();
		ArrayList<Polyline> lines = readFile("hello.txt");

		for (Polyline line : lines) {
			plotter.plot(line);
		}
	}
}

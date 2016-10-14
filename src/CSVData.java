import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/***
 * Class to read and write comma numerical CSV files and allow easy access
 *
 * @author AviNozik 
 *
 */
public class CSVData {
	private double[][] data;
	private String[] columnNames;
	int numRows;

	public static CSVData readCSVfile(String filename, int numLinestToIgnore, String[] columnNames) {
		return null;
	}

	public CSVData(String filepath, String[] columnNames, int startRow) {
		this.filePathToCSV = filepath;

		String dataString = readFileAsString(filepath);
		String[] lines = dataString.split("\n");

		// number of data points
		int n = lines.length - startRow;
		this.numRows = n;
		int numColumns = columnNames.length;

		// create storage for column names
		this.columnNames = columnNames;

		// create storage for data
		this.data = new double[n][numColumns];
		for (int i = 0; i < lines.length - startRow; i++) {
			String line = lines[startRow + i];
			String[] coords = line.split(",");
			for (int j = 0; j < numColumns; j++) {
				if (coords[j].endsWith("#"))
					coords[j] = coords[j].substring(0, coords[j].length() - 1);
				double val = Double.parseDouble(coords[j]);
				data[i][j] = val;
			}
		}
	}

	private String readFileAsString(String filepath) {
		StringBuilder output = new StringBuilder();
		try (Scanner scanner = new Scanner(new File(filepath))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				output.append(line + System.getProperty("line.separator"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output.toString();
	}

	/***
	 * Returns a new CSVData file ignoring the lines at the top. It uses the
	 * first row as the column name, All other data is stared as doubles.
	 *
	 * @param filename
	 *            the file to read
	 * @param numLinesToIgnore
	 *            number of lines at the top to ignore
	 * @return a CSVData object for that file.
	 */
	public static CSVData readCSVfile(String filename, int numLinesToIgnore) {
		return null;
	}

	/***
	 * Converts data to an array
	 *
	 * @param data
	 *            the data input
	 * @return the dta converted to an array
	 */
	public double[][] convertToArray(double[][] data) {
		return null;
	}

	/***
	 * gets a row
	 *
	 * @param rowIndex
	 *            the index of a row
	 * @return the row
	 */
	public double[] getRow(int rowIndex) {
		return null;
	}
	/***
	 * gets a column
	 *
	 * @param columnIndex
	 *            the index of a column
	 * @return the column
	 */
	public double[] getColumn(int columnIndex) {
		double[] output = new double[data.length];
		
		
		return output;
	}

	/***
	 * gets a column(overloaded)
	 *
	 * @param name
	 *            name of the column
	 * @return the column
	 */
	public double[] getColumn(String name) {
		return null;
	}

	/***
	 * gets multiple rows
	 *
	 * @param startRowIndex
	 *            first needed rows index
	 * @param endRowIndex
	 *            last needed rows index
	 * @return the rows
	 */
	public double[][] getMultipleRows(int startRowIndex, int endRowIndex) {
		return null;
	}

	/***
	 * returns multiple rows
	 *
	 * @param rowIndexes
	 *            an array of row indexes
	 * @return the rows
	 */
	public double[][] getMultipleRows(int[] rowIndexes) {
		return null;
	}

	/***
	 * gets multiple columns
	 *
	 * @param startColumnIndex
	 *            first needed columns index
	 * @param endColumnIndex
	 *            last needed columns index
	 * @return the columns
	 */
	public double[][] getMultipleColumns(int startColumnIndex, int endColumnIndex) {
		return null;
	}

	/***
	 * gets multiple columns
	 *
	 * @param ColumnIndexes
	 *            an array of column indexes
	 * @return the columns
	 */
	public double[][] getMultipleColumns(int[] ColumnIndexes) {
		return null;
	}

	/***
	 * gets multiple columns
	 *
	 * @param ColumnNames
	 *            an array of column names
	 * @return the columns
	 */
	public double[][] getMultipleColumns(String[] ColumnNames) {
		return null;
	}

	/***
	 * gets titles of columns
	 *
	 * @return the titles
	 */
	public String[] getTitles() {
		return null;
	}

	/***
	 *
	 * @param rowIndex
	 * @param columnIndex
	 * @param newValue
	 */
	public void SetValues(int rowIndex, int columnIndex, double newValue) {

	}

	/***
	 * saves the state of the file
	 *
	 * @param filename
	 *            the file we are saving into
	 */
	public void SaveState(String filename) {

	}

}
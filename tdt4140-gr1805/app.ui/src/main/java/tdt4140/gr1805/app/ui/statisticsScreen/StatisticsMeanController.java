
package tdt4140.gr1805.app.ui.statisticsScreen;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import tdt4140.gr1805.app.ui.MasterScreenController;

/**
 * @author Torleif
 *
 */
public class StatisticsMeanController
{
	public MasterScreenController screenController;
	@FXML
	private NumberAxis xAxis;
	@FXML
	private NumberAxis yAxis;
	@FXML
	private LineChart<Number, Number> lC;

	// Setting the screen controller
	/**
	 * @param screenController the {@link MasterScreenController} which supervises this screen
	 */
	public void setScreenController(MasterScreenController screenController)
	{
		this.screenController = screenController;
	}

	// Changing scenes on clicking the Back to Menu button
	/**
	 * @param event onAction from the FXML-file associated with this controller.
	 * @throws IOException
	 */
	@FXML
	public void backToMenu(ActionEvent event) throws IOException
	{
		screenController.activate("MenuScreen");
	}

	// Changing scenes on clicking the Back to Statistics button
	/**
	 * @param event onAction from the FXML-file associated with this controller.
	 * @throws IOException
	 */
	@FXML
	public void backToStatistics(ActionEvent event) throws IOException
	{
		screenController.activate("StatisticsScreen");
	}
	
	/**
	 * @param event onAction from the FXML-file associated with this controller.
	 */
	@FXML
	public void showAveragePulse(ActionEvent event)
	{
		System.out.println("ShowAveragePulse");
		lC.setTitle("Average Pulse");			// Sets the title of the LineChart
		Series<Number, Number> series = new Series<>();
		series.getData().add(new Data<Number, Number>(1, 1));
		series.getData().add(new Data<Number, Number>(-1, 1));
		series.getData().add(new Data<Number, Number>(2, 2));
		series.getData().add(new Data<Number, Number>(-2, 2));
		series.setName("Pulse");
		lC.getData().add(series);
		
	}
	
//	public void showAverage()
//	{
//		lC.getData().clear();		// Removes all data from the LineChart lC.
//		lC.getData().add(e);		// Adds the series e to the LineChart lC.
//	}

}

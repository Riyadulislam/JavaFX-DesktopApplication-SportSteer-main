/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsteer;

import Models.Employee;
import Models.Finance;
import Models.Perfomance;
import Models.Record;
import Models.Salary;
import Models.Schedule;
import animatefx.animation.FadeInDown;
import animatefx.animation.FlipInY;
import animatefx.animation.RotateInDownLeft;
import animatefx.animation.SlideInLeft;
import animatefx.animation.ZoomInRight;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Dexter Sam
 */
public class DashBoardController implements Initializable {
    
    

    @FXML
    private AreaChart<?, ?> areachart;
    @FXML
    private BarChart<?, ?> barchart;
    @FXML
    private BorderPane mainpane;
    @FXML
    private AnchorPane slidepane;
    @FXML
    private JFXButton DashboardMenuButton;
    @FXML
    private JFXButton EmployeeMenuButton;
    @FXML
    private JFXButton PerfomancesMenuButton;
    @FXML
    private JFXButton FinancesMenuButton;
    @FXML
    private JFXButton SchedulesMenuButton;
    @FXML
    private JFXButton AchievmentsMenubutton;
    private AnchorPane tialpane;
    @FXML
    private AnchorPane dashboardspane;
    @FXML
    private AnchorPane employeespane;
    @FXML
    private AnchorPane financepane;
    @FXML
    private AnchorPane schedulespane;
    @FXML
    private AnchorPane acheivementspane;
    @FXML
    private AnchorPane perfomancespane;
    private TableColumn<?, ?> UserNamecol;
    private TableColumn<?, ?> UserEmailCol;
    
    private Connection connection = null;
    private PreparedStatement statement = null;
    private ResultSet resultSet;
    private ObservableList observe;
    private ObservableList observePlayer;
    private ObservableList observePerfomance1;
    private ObservableList observePerfomance2;
    private ObservableList observePerfomance3;
    private ObservableList observePerfomance4;
    private ObservableList observePerfomance5;
    private ObservableList observePerfomance6;
    private ObservableList observePerfomance7;
    private ObservableList observeManager;
    private ObservableList observeCoach;
    private ObservableList observeStuff;
    private ObservableList observeexpense;
    private ObservableList observerevenue;
    private ObservableList observesalary;
    private ObservableList observeSchedule;
    private ObservableList observeRecordBat;
    private ObservableList observeRecordBowl;
    private ObservableList  observeallper;
    private TableView<?> EmployeeTable;  
    @FXML
    private Circle exitbtn;
    @FXML
    private Circle minimizebtn;
    @FXML
    private Circle minimizebtn2;
    @FXML
    private Circle exitbtn2;
    @FXML
    private Circle exitbtn1;
    @FXML
    private Circle minimizebtn1;
    @FXML
    private Circle exitbtn31;
    @FXML
    private Circle minimizebtn31;
    private TableColumn<?, ?> EmployeeNamecol;
    private TableColumn<?, ?> EmployeeSalaryCol;
    private TableColumn<?, ?> EmployeeMailCol;
    private TableColumn<?, ?> EmployeeAddressCol;
    private TableColumn<?, ?> EmployeeAgeCol;
    private AnchorPane testerpane;
    @FXML
    private TableView<?> ExpenseTable;
    @FXML
    private TableColumn<?, ?> ExpenseDateCol;
    @FXML
    private TableColumn<?, ?> ExpenseDescCol;
    @FXML
    private TableColumn<?, ?> ExpenseAmountCol;
    @FXML
    private TableColumn<?, ?> ExpenseMethodCol;
    @FXML
    private TableColumn<?, ?> ExpenseStatusCol;
    @FXML
    private Tab expensepagebutton;
    @FXML
    private Tab revenuepagebutton;
    @FXML
    private Tab salarypagebutton;
    @FXML
    private TableView<?> RevenueTable;
    @FXML
    private TableColumn<?, ?> ExpenseDateCol1;
    @FXML
    private TableColumn<?, ?> ExpenseDescCol1;
    @FXML
    private TableColumn<?, ?> ExpenseAmountCol1;
    @FXML
    private TableColumn<?, ?> ExpenseMethodCol1;
    @FXML
    private TableColumn<?, ?> ExpenseStatusCol1;
    @FXML
    private TableView<?> SalaryTable;
    @FXML
    private TableColumn<?, ?> SalaryIdcol;
    @FXML
    private TableColumn<?, ?> SalaryNameCol;
    @FXML
    private TableColumn<?, ?> SalaryDesignaitonCol;
    @FXML
    private TableColumn<?, ?> SalaryAmountCol;
    @FXML
    private TableColumn<?, ?> SlaryBonusCol;
    @FXML
    private TableColumn<?, ?> SalaryStatusCol;
    @FXML
    private Circle exitbtn3;
    @FXML
    private Circle minimizebtn3;
    @FXML
    private Tab PlayerTabPane;
    @FXML
    private Tab MnagerTabPane;
    @FXML
    private Tab CoachTabpane;
    @FXML
    private Tab StuffTabePane;
    @FXML
    private Tab adminpanel;
    @FXML
    private AnchorPane EmployeeAdminPanel;
    @FXML
    private JFXTextField employeeNameTextfield;
    @FXML
    private JFXTextField EmployeeMailTextfield;
    @FXML
    private JFXTextField EmployeePhoneTextField;
    @FXML
    private JFXComboBox<String> EmployeeTypeCB;
    @FXML
    private JFXComboBox<String> DobDateCB;
    @FXML
    private JFXComboBox<String> DobMonthCB;
    @FXML
    private JFXComboBox<String> DobYearCB;
    @FXML
    private JFXComboBox<String> EmployeeBloddGroupCB;
    @FXML
    private JFXTextField EmployeeSalaryTextfield;
    @FXML
    private JFXTextField EmployeeAdressTextfield;
    @FXML
    private JFXCheckBox makesuperuserbutton;
    @FXML
    private JFXButton employeeaddbutton;
    @FXML
    private TableView<?> PlayerTable;
    @FXML
    private TableColumn<?, ?> PlayerNamecol;
    @FXML
    private TableColumn<?, ?> PlayerAgeCol;
    @FXML
    private TableColumn<?, ?> PlayerSalaryCol;
    @FXML
    private TableColumn<?, ?> PlayerMailCol;
    @FXML
    private TableColumn<?, ?> PlayerAddressCol;
    @FXML
    private TableView<?> ManagerTable;
    @FXML
    private TableColumn<?, ?> ManagerNameCol;
    @FXML
    private TableColumn<?, ?> ManagerAgeCol;
    @FXML
    private TableColumn<?, ?> ManagerSalaryCol;
    @FXML
    private TableColumn<?, ?> ManagerMailCol;
    @FXML
    private TableColumn<?, ?> ManagerAddressCol;
    @FXML
    private TableView<?> CoachTable;
    @FXML
    private TableColumn<?, ?> CoachNamecol;
    @FXML
    private TableColumn<?, ?> CoachAgeCol;
    @FXML
    private TableColumn<?, ?> CoachSalaryCol;
    @FXML
    private TableColumn<?, ?> CoachMailCol;
    @FXML
    private TableColumn<?, ?> CoachAddressCol;
    @FXML
    private TableView<?> StuffTable;
    @FXML
    private TableColumn<?, ?> StuffNamecol;
    @FXML
    private TableColumn<?, ?> StuffAgeCol;
    @FXML
    private TableColumn<?, ?> StuffSalaryCol;
    @FXML
    private TableColumn<?, ?> StuffMailCol;
    @FXML
    private TableColumn<?, ?> StuffAddressCol;
    private TableColumn<?, ?> ManagerDesignationCol;
    private TableColumn<?, ?> CoachDesignationCol;
    @FXML
    private TableColumn<?, ?> StuffDesignationCol;
    @FXML
    private JFXButton Logout;
    @FXML
    private TableView<?> PerfomanceTable;
    @FXML
    private TableColumn<?, ?> playertype;
    @FXML
    private TableColumn<?, ?> runsscored;
    @FXML
    private TableColumn<?, ?> ballsfaced;
    @FXML
    private TableColumn<?, ?> fours;
    @FXML
    private TableColumn<?, ?> sixes;
    @FXML
    private TableColumn<?, ?> wicketstaken;
    @FXML
    private TableColumn<?, ?> ballsbowled;
    @FXML
    private TableColumn<?, ?> runsgave;
    @FXML
    private JFXTextField Fours;
    @FXML
    private JFXTextField EmployeeID;
    @FXML
    private JFXTextField MatchId;
    @FXML
    private JFXComboBox<String> MatchTypeCB;
    @FXML
    private JFXTextField RunsScored;
    @FXML
    private JFXTextField BallsFaced;
    @FXML
    private JFXTextField BallsBowled;
    @FXML
    private JFXTextField WicketsTaken;
    @FXML
    private JFXComboBox<String> PalyerTypeCB;
    @FXML
    private JFXTextField RunsGave;
    @FXML
    private JFXTextField Sixes;
    @FXML
    private JFXCheckBox pomcheck;
    @FXML
    private JFXButton perfomanceaddbutton;
    @FXML
    private JFXTextField MatchId1;
    @FXML
    private JFXComboBox<String> MatchTypeCB1;
    @FXML
    private JFXTextField RunsScored1;
    @FXML
    private JFXTextField WicketsLost;
    @FXML
    private JFXTextField WicketsTaken1;
    @FXML
    private JFXTextField RunsGiven;
    @FXML
    private JFXTextField Fours1;
    @FXML
    private JFXTextField Sixes1;
    @FXML
    private JFXCheckBox verdict;
    @FXML
    private JFXComboBox<String> matchdaycb;
    @FXML
    private JFXComboBox<String> matchmnthcb;
    @FXML
    private JFXComboBox<String> matchyearcb;
    @FXML
    private AnchorPane addteamperfomancepane;
    @FXML
    private JFXButton teamperfomancebtn;
    @FXML
    private JFXTextField searchbar;
    @FXML
    private TableColumn<?, ?> Playerphonecol;
    @FXML
    private TableColumn<?, ?> Playerbgcol;
    @FXML
    private TableColumn<?, ?> ManagerPhoneCol;
    @FXML
    private TableColumn<?, ?> ManagerBGCOL;
    @FXML
    private TableColumn<?, ?> CoachPhoneCol;
    @FXML
    private TableColumn<?, ?> CoachBGCol;
    @FXML
    private TableColumn<?, ?> StuffPhoneCol;
    @FXML
    private TableColumn<?, ?> matchtypecol;
    @FXML
    private TableColumn<?, ?> playernamecol1;
    @FXML
    private TableView<?> PerfomanceTable2;
    @FXML
    private TableColumn<?, ?> matchtypecol2;
    @FXML
    private TableColumn<?, ?> playernamecol2;
    @FXML
    private TableColumn<?, ?> playertype2;
    @FXML
    private TableColumn<?, ?> runsscored2;
    @FXML
    private TableColumn<?, ?> ballsfaced2;
    @FXML
    private TableColumn<?, ?> fours2;
    @FXML
    private TableColumn<?, ?> sixes2;
    @FXML
    private TableColumn<?, ?> wicketstaken2;
    @FXML
    private TableColumn<?, ?> runsgave2;
    @FXML
    private TableView<?> PerfomanceTable3;
    @FXML
    private TableColumn<?, ?> matchtypecol3;
    @FXML
    private TableColumn<?, ?> playernamecol3;
    @FXML
    private TableColumn<?, ?> playertype3;
    @FXML
    private TableColumn<?, ?> runsscored3;
    @FXML
    private TableColumn<?, ?> ballsfaced3;
    @FXML
    private TableColumn<?, ?> fours3;
    @FXML
    private TableColumn<?, ?> sixes3;
    @FXML
    private TableColumn<?, ?> wicketstaken3;
    @FXML
    private TableColumn<?, ?> runsgave3;
    @FXML
    private TableView<?> PerfomanceTable4;
    @FXML
    private TableColumn<?, ?> matchtypecol4;
    @FXML
    private TableColumn<?, ?> playernamecol4;
    @FXML
    private TableColumn<?, ?> playertype4;
    @FXML
    private TableColumn<?, ?> runsscored4;
    @FXML
    private TableColumn<?, ?> ballsfaced4;
    @FXML
    private TableColumn<?, ?> fours4;
    @FXML
    private TableColumn<?, ?> sixes4;
    @FXML
    private TableColumn<?, ?> wicketstaken4;
    @FXML
    private TableColumn<?, ?> runsgave4;
    @FXML
    private TableColumn<?, ?> matchtypecol5;
    @FXML
    private TableColumn<?, ?> playernamecol5;
    @FXML
    private TableColumn<?, ?> playertype5;
    @FXML
    private TableColumn<?, ?> runsscored5;
    @FXML
    private TableColumn<?, ?> ballsfaced5;
    @FXML
    private TableColumn<?, ?> fours5;
    @FXML
    private TableColumn<?, ?> sixes5;
    @FXML
    private TableColumn<?, ?> wicketstaken5;
    @FXML
    private TableColumn<?, ?> runsgave5;
    @FXML
    private TableColumn<?, ?> matchtypecol6;
    @FXML
    private TableColumn<?, ?> playernamecol6;
    @FXML
    private TableColumn<?, ?> playertype6;
    @FXML
    private TableColumn<?, ?> runsscored6;
    @FXML
    private TableColumn<?, ?> ballsfaced6;
    @FXML
    private TableColumn<?, ?> fours6;
    @FXML
    private TableColumn<?, ?> sixes6;
    @FXML
    private TableColumn<?, ?> wicketstaken6;
    @FXML
    private TableColumn<?, ?> runsgave6;
    @FXML
    private TableColumn<?, ?> matchtypecol7;
    @FXML
    private TableColumn<?, ?> playernamecol7;
    @FXML
    private TableColumn<?, ?> playertype7;
    @FXML
    private TableColumn<?, ?> runsscored7;
    @FXML
    private TableColumn<?, ?> ballsfaced7;
    @FXML
    private TableColumn<?, ?> fours7;
    @FXML
    private TableColumn<?, ?> sixes7;
    @FXML
    private TableColumn<?, ?> wicketstaken7;
    @FXML
    private TableColumn<?, ?> runsgave7;
    @FXML
    private TableView<?> PerfomanceTable5;
    @FXML
    private TableView<?> PerfomanceTable6;
    @FXML
    private TableView<?> PerfomanceTable7;
    @FXML
    private TableColumn<?, ?> ballsbowled2;
    @FXML
    private TableColumn<?, ?> ballsbowled3;
    @FXML
    private TableColumn<?, ?> ballsbowled4;
    @FXML
    private TableColumn<?, ?> ballsbowled5;
    @FXML
    private TableColumn<?, ?> ballsbowled6;
    @FXML
    private TableColumn<?, ?> ballsbowled7;
    @FXML
    private Tab adminpanel1;
    @FXML
    private AnchorPane EmployeeAdminPanel1;
    @FXML
    private JFXTextField FinanceID;
    @FXML
    private JFXTextField famount;
    @FXML
    private JFXTextField fdes;
    @FXML
    private JFXComboBox<String> ftype;
    @FXML
    private JFXComboBox<String> fdaycb;
    @FXML
    private JFXComboBox<String> fmonthcb;
    @FXML
    private JFXComboBox<String> fyearcb;
    @FXML
    private JFXComboBox<String> fmethod;
    @FXML
    private JFXCheckBox paidchk;
    @FXML
    private JFXButton addfinbtn;
    @FXML
    private TableView<?> scheduletable;
    @FXML
    private TableColumn<?, ?> schidcol;
    @FXML
    private TableColumn<?, ?> schtypecol;
    @FXML
    private TableColumn<?, ?> schdescol;
    @FXML
    private TableColumn<?, ?> schdaycol;
    @FXML
    private Tab adminpanel11;
    @FXML
    private AnchorPane EmployeeAdminPanel11;
    @FXML
    private JFXTextField schid;
    @FXML
    private JFXTextField schdes;
    @FXML
    private JFXComboBox<String> schtypecb;
    @FXML
    private JFXComboBox<String> schday;
    @FXML
    private JFXComboBox<String> schmon;
    @FXML
    private JFXComboBox<String> schyear;
    @FXML
    private JFXButton addschedulebtn;
    @FXML
    private TableView<?> battingtable;
    @FXML
    private TableColumn<?, ?> namrcol;
    @FXML
    private TableColumn<?, ?> matchcol;
    @FXML
    private TableColumn<?, ?> runcol;
    @FXML
    private TableColumn<?, ?> runavcol;
    @FXML
    private TableColumn<?, ?> srcol;
    @FXML
    private TableColumn<?, ?> hscol;
    @FXML
    private TableView<?> battingtable1;
    @FXML
    private TableColumn<?, ?> namrcol1;
    @FXML
    private TableColumn<?, ?> matchcol1;
    @FXML
    private TableColumn<?, ?> wktcol;
    @FXML
    private TableColumn<?, ?> wkavcol;
    @FXML
    private TableColumn<?, ?> hwcol;
    @FXML
    private TableColumn<?, ?> srcol1;
    @FXML
    private JFXTextField ed1;
    @FXML
    private JFXTextField ed2;
    @FXML
    private JFXTextField ed3;
    @FXML
    private JFXTextField ed4;
    @FXML
    private JFXTextField ed5;
    @FXML
    private JFXTextField ed6;
    @FXML
    private JFXTextField ed7;
    @FXML
    private JFXButton edit;
    @FXML
    private JFXButton delete;
    @FXML
    private TableView<?> allpertable;
    @FXML
    private TableColumn<?, ?> cl1;
    @FXML
    private TableColumn<?, ?> cl2;
    @FXML
    private TableColumn<?, ?> cl3;
    @FXML
    private TableColumn<?, ?> cl4;
    @FXML
    private TableColumn<?, ?> cl5;
    @FXML
    private TableColumn<?, ?> cl6;
   

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            /*
            CategoryAxis xAxis = new CategoryAxis();
            NumberAxis yAxis = new NumberAxis(100,900,100);
            StackedAreaChart stackedchart = new StackedAreaChart(xAxis,yAxis);
            */
            //create data variables for chart
            XYChart.Series ds1 = new XYChart.Series<>();
            XYChart.Series ds2 = new XYChart.Series<>();
            
            //chart labeling
            ds1.setName("Wins");
            ds2.setName("Loss");
            //create manual tata
            ds2.getData().add(new XYChart.Data("1", 120 ));
            ds2.getData().add(new XYChart.Data("2", 135));
            ds2.getData().add(new XYChart.Data("3", 179));
            ds2.getData().add(new XYChart.Data("4", 212));
            ds2.getData().add(new XYChart.Data("5", 241));
            ds2.getData().add(new XYChart.Data("6", 295));
            ds2.getData().add(new XYChart.Data("7", 277));
            ds2.getData().add(new XYChart.Data("8", 301));
            
            
            
            ds1.getData().add(new XYChart.Data("1", 360));
            ds1.getData().add(new XYChart.Data("2", 386));
            ds1.getData().add(new XYChart.Data("3", 457));
            ds1.getData().add(new XYChart.Data("4", 507));
            ds1.getData().add(new XYChart.Data("5", 648));
            ds1.getData().add(new XYChart.Data("6", 715));
            ds1.getData().add(new XYChart.Data("7", 742));
            ds1.getData().add(new XYChart.Data("8", 731));
            
            //stackedchart.getData().addAll(ds1,ds2);
            
            //join data with chart
            areachart.getData().addAll(ds1,ds2);
            areachart.getStylesheets().add("dashboard.css");
            //join data with chart
            barchart.getData().addAll(ds1,ds2);
            barchart.getStylesheets().add("dashboard.css");
            
            connection= db.DBConnection.makeconnect();
            
            //add values in jfx combobox
            addJfXCOMBOVALUES();
            //observe = FXCollections.observableArrayList();
            observePlayer = FXCollections.observableArrayList();
            observeManager = FXCollections.observableArrayList();
            observeCoach = FXCollections.observableArrayList();
            observeStuff = FXCollections.observableArrayList();
            observeexpense = FXCollections.observableArrayList();
            observerevenue = FXCollections.observableArrayList();
            observesalary  = FXCollections.observableArrayList();
            observePerfomance1 = FXCollections.observableArrayList();
            observePerfomance2 = FXCollections.observableArrayList();
            observePerfomance3 = FXCollections.observableArrayList();
            observePerfomance4 = FXCollections.observableArrayList();
            observePerfomance5 = FXCollections.observableArrayList();
            observePerfomance6 = FXCollections.observableArrayList();
            observePerfomance7 = FXCollections.observableArrayList();
            observeSchedule=FXCollections.observableArrayList();
            observeRecordBat=FXCollections.observableArrayList();
            observeRecordBowl=FXCollections.observableArrayList();
            observeallper =FXCollections.observableArrayList();
          
            
            
            setCellTable();
            
            //loadDataFromDatabase("Employee");
            loadDataFromDatabase("Player");
            loadDataFromDatabase("Coach");
            loadDataFromDatabase("Manager");
            loadDataFromDatabase("Stuff");
            loadDataFromDatabase("Finance");
            loadDataFromDatabase("Revenue");
            loadDataFromDatabase("Salary");
            
            loadPlayerPerfomanceFromDatabase("day1");
            loadPlayerPerfomanceFromDatabase("day2");
            loadPlayerPerfomanceFromDatabase("day3");
            loadPlayerPerfomanceFromDatabase("day4");
            loadPlayerPerfomanceFromDatabase("day5");
            loadPlayerPerfomanceFromDatabase("day6");
            loadPlayerPerfomanceFromDatabase("day7");
            loadSchedulefromDatabase();
            
            loadRecordBat();
            loadRecordBall(); 
            loadoverallteamperfomance();
            
            setCell();
            
            searcher();
       
        } catch (SQLException ex) {
            Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }    

    @FXML
    private void jumpToDashboard(ActionEvent event) {
        
       dashboardspane.toFront();
    }

    @FXML
    private void jumpToEmployees(ActionEvent event) {
        new FadeInDown( employeespane).play();  
        employeespane.toFront();
        
                            
   
    }

    @FXML
    private void jumpToPefomances(ActionEvent event) {
        new ZoomInRight(perfomancespane).play();
        perfomancespane.toFront();
    }

    @FXML
    private void jumpToFinances(ActionEvent event) {
        new FlipInY(financepane).play();
        financepane.toFront();
        
        
    }

    @FXML
    private void jumpToSchedules(ActionEvent event) {
         new SlideInLeft(schedulespane).play(); 
        schedulespane.toFront();
    }

    @FXML
    private void jumpToAchievements(ActionEvent event) {
        new RotateInDownLeft(acheivementspane).play();
        acheivementspane.toFront();
        //testerpane.toFront();
    }
    
    @FXML
    private void jumpToExpense(Event event) {
        
    }

    @FXML
    private void jumpToRevenue(Event event) {
        
    }

    @FXML
    private void jumpToSalary(Event event) {
        
    }
    
    
    //Fetching data and setting tables
    
    //Employee table
    
    private void setCellTable(){
        //PlayerTable
        PlayerNamecol.setCellValueFactory(new PropertyValueFactory<>("EmployeeNameDB"));
        PlayerAgeCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeAgeDB"));
        PlayerSalaryCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeSalaryDB"));
        PlayerMailCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeMailDB"));
        PlayerAddressCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeAddressDB"));
        Playerphonecol.setCellValueFactory(new PropertyValueFactory<>("EmployeePhoneDB"));
        Playerbgcol.setCellValueFactory(new PropertyValueFactory<>("EmployeeBloodGroupDB"));
        //ManagerTable
        ManagerNameCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeNameDB"));
        ManagerAgeCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeAgeDB"));
        ManagerSalaryCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeSalaryDB"));
        ManagerMailCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeMailDB"));
        ManagerAddressCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeAddressDB"));
        ManagerPhoneCol.setCellValueFactory(new PropertyValueFactory<>("EmployeePhoneDB"));
        ManagerBGCOL.setCellValueFactory(new PropertyValueFactory<>("EmployeeBloodGroupDB"));
        //CoachTable
        CoachNamecol.setCellValueFactory(new PropertyValueFactory<>("EmployeeNameDB"));
        CoachAgeCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeAgeDB"));
        CoachSalaryCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeSalaryDB"));
        CoachMailCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeMailDB"));
        CoachAddressCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeAddressDB"));
        CoachPhoneCol.setCellValueFactory(new PropertyValueFactory<>("EmployeePhoneDB"));
        CoachBGCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeBloodGroupDB"));
        //StuffTable
        StuffNamecol.setCellValueFactory(new PropertyValueFactory<>("EmployeeNameDB"));
        StuffAgeCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeAgeDB"));
        StuffSalaryCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeSalaryDB"));
        StuffMailCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeMailDB"));
        StuffAddressCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeAddressDB"));
        StuffDesignationCol.setCellValueFactory(new PropertyValueFactory<>("EmployeeBloodGroupDB"));
        StuffPhoneCol.setCellValueFactory(new PropertyValueFactory<>("EmployeePhoneDB"));
        //ExpenseTable
        ExpenseDateCol.setCellValueFactory(new PropertyValueFactory<>("DateDb") );
        ExpenseDescCol.setCellValueFactory(new PropertyValueFactory<>("DescriptionDb") );
        ExpenseAmountCol.setCellValueFactory(new PropertyValueFactory<>("AmountDb") );
        ExpenseMethodCol.setCellValueFactory(new PropertyValueFactory<>("MethodDb") );
        ExpenseStatusCol.setCellValueFactory(new PropertyValueFactory<>("StatusDb") );
        //RevenueTable
        ExpenseDateCol1.setCellValueFactory(new PropertyValueFactory<>("DateDb") );
        ExpenseDescCol1.setCellValueFactory(new PropertyValueFactory<>("DescriptionDb") );
        ExpenseAmountCol1.setCellValueFactory(new PropertyValueFactory<>("AmountDb") );
        ExpenseMethodCol1.setCellValueFactory(new PropertyValueFactory<>("MethodDb") );
        ExpenseStatusCol1.setCellValueFactory(new PropertyValueFactory<>("StatusDb") );
        //SalaryTable
        SalaryIdcol.setCellValueFactory(new PropertyValueFactory<>("ID") );
        SalaryNameCol.setCellValueFactory(new PropertyValueFactory<>("Name") );
        SalaryDesignaitonCol.setCellValueFactory(new PropertyValueFactory<>("Type") );
        SalaryAmountCol.setCellValueFactory(new PropertyValueFactory<>("Salary") );  
        SalaryStatusCol.setCellValueFactory(new PropertyValueFactory<>("Status") );  
        SlaryBonusCol.setCellValueFactory(new PropertyValueFactory<>("Status") );
         SalaryStatusCol.setCellValueFactory(new PropertyValueFactory<>("bonus") );      
        
        //Perfomance Tables::
        matchtypecol.setCellValueFactory(new PropertyValueFactory<>("matchType"));
        playernamecol1.setCellValueFactory(new PropertyValueFactory<>("playerName"));
        playertype.setCellValueFactory(new PropertyValueFactory<>("playertype")); 
        runsscored.setCellValueFactory(new PropertyValueFactory<>("runsScored")); 
        ballsfaced.setCellValueFactory(new PropertyValueFactory<>("ballsFaced"));
        fours.setCellValueFactory(new PropertyValueFactory<>("fours"));
        sixes.setCellValueFactory(new PropertyValueFactory<>("sixes"));
        wicketstaken.setCellValueFactory(new PropertyValueFactory<>("wicketsTaken"));
        runsgave.setCellValueFactory(new PropertyValueFactory<>("runsGave")); 
        ballsbowled.setCellValueFactory(new PropertyValueFactory<>("ballsBowled"));
        
        matchtypecol2.setCellValueFactory(new PropertyValueFactory<>("matchType"));
        playernamecol2.setCellValueFactory(new PropertyValueFactory<>("playerName"));
        playertype2.setCellValueFactory(new PropertyValueFactory<>("playertype")); 
        runsscored2.setCellValueFactory(new PropertyValueFactory<>("runsScored")); 
        ballsfaced2.setCellValueFactory(new PropertyValueFactory<>("ballsFaced"));
        fours2.setCellValueFactory(new PropertyValueFactory<>("fours"));
        sixes2.setCellValueFactory(new PropertyValueFactory<>("sixes"));
        wicketstaken2.setCellValueFactory(new PropertyValueFactory<>("wicketsTaken"));
        runsgave2.setCellValueFactory(new PropertyValueFactory<>("runsGave"));
        ballsbowled2.setCellValueFactory(new PropertyValueFactory<>("ballsBowled"));
        
        matchtypecol3.setCellValueFactory(new PropertyValueFactory<>("matchType"));
        playernamecol3.setCellValueFactory(new PropertyValueFactory<>("playerName"));
        playertype3.setCellValueFactory(new PropertyValueFactory<>("playertype")); 
        runsscored3.setCellValueFactory(new PropertyValueFactory<>("runsScored")); 
        ballsfaced3.setCellValueFactory(new PropertyValueFactory<>("ballsFaced"));
        fours3.setCellValueFactory(new PropertyValueFactory<>("fours"));
        sixes3.setCellValueFactory(new PropertyValueFactory<>("sixes"));
        wicketstaken3.setCellValueFactory(new PropertyValueFactory<>("wicketsTaken"));
        runsgave3.setCellValueFactory(new PropertyValueFactory<>("runsGave"));
        ballsbowled3.setCellValueFactory(new PropertyValueFactory<>("ballsBowled"));
        
        matchtypecol4.setCellValueFactory(new PropertyValueFactory<>("matchType"));
        playernamecol4.setCellValueFactory(new PropertyValueFactory<>("playerName"));
        playertype4.setCellValueFactory(new PropertyValueFactory<>("playertype")); 
        runsscored4.setCellValueFactory(new PropertyValueFactory<>("runsScored")); 
        ballsfaced4.setCellValueFactory(new PropertyValueFactory<>("ballsFaced"));
        fours4.setCellValueFactory(new PropertyValueFactory<>("fours"));
        sixes4.setCellValueFactory(new PropertyValueFactory<>("sixes"));
        wicketstaken4.setCellValueFactory(new PropertyValueFactory<>("wicketsTaken"));
        runsgave4.setCellValueFactory(new PropertyValueFactory<>("runsGave"));
        ballsbowled4.setCellValueFactory(new PropertyValueFactory<>("ballsBowled"));
        
        matchtypecol5.setCellValueFactory(new PropertyValueFactory<>("matchType"));
        playernamecol5.setCellValueFactory(new PropertyValueFactory<>("playerName"));
        playertype5.setCellValueFactory(new PropertyValueFactory<>("playertype")); 
        runsscored5.setCellValueFactory(new PropertyValueFactory<>("runsScored")); 
        ballsfaced5.setCellValueFactory(new PropertyValueFactory<>("ballsFaced"));
        fours5.setCellValueFactory(new PropertyValueFactory<>("fours"));
        sixes5.setCellValueFactory(new PropertyValueFactory<>("sixes"));
        wicketstaken5.setCellValueFactory(new PropertyValueFactory<>("wicketsTaken"));
        runsgave5.setCellValueFactory(new PropertyValueFactory<>("runsGave"));
        ballsbowled5.setCellValueFactory(new PropertyValueFactory<>("ballsBowled"));
        
        matchtypecol6.setCellValueFactory(new PropertyValueFactory<>("matchType"));
        playernamecol6.setCellValueFactory(new PropertyValueFactory<>("playerName"));
        playertype6.setCellValueFactory(new PropertyValueFactory<>("playertype")); 
        runsscored6.setCellValueFactory(new PropertyValueFactory<>("runsScored")); 
        ballsfaced6.setCellValueFactory(new PropertyValueFactory<>("ballsFaced"));
        fours6.setCellValueFactory(new PropertyValueFactory<>("fours"));
        sixes6.setCellValueFactory(new PropertyValueFactory<>("sixes"));
        wicketstaken6.setCellValueFactory(new PropertyValueFactory<>("wicketsTaken"));
        runsgave6.setCellValueFactory(new PropertyValueFactory<>("runsGave"));
        ballsbowled6.setCellValueFactory(new PropertyValueFactory<>("ballsBowled"));
        
        matchtypecol7.setCellValueFactory(new PropertyValueFactory<>("matchType"));
        playernamecol7.setCellValueFactory(new PropertyValueFactory<>("playerName"));
        playertype7.setCellValueFactory(new PropertyValueFactory<>("playertype")); 
        runsscored7.setCellValueFactory(new PropertyValueFactory<>("runsScored")); 
        ballsfaced7.setCellValueFactory(new PropertyValueFactory<>("ballsFaced"));
        fours7.setCellValueFactory(new PropertyValueFactory<>("fours"));
        sixes7.setCellValueFactory(new PropertyValueFactory<>("sixes"));
        wicketstaken7.setCellValueFactory(new PropertyValueFactory<>("wicketsTaken"));
        runsgave7.setCellValueFactory(new PropertyValueFactory<>("runsGave"));
        ballsbowled7.setCellValueFactory(new PropertyValueFactory<>("ballsBowled"));
        
        //ScheduleTable
        schidcol.setCellValueFactory(new PropertyValueFactory<>("id"));
        schdescol.setCellValueFactory(new PropertyValueFactory<>("type"));
        schtypecol.setCellValueFactory(new PropertyValueFactory<>("time"));
        schdaycol.setCellValueFactory(new PropertyValueFactory<>("des"));
        
        //RecordTable bat
        namrcol.setCellValueFactory(new PropertyValueFactory<>("name")); 
        matchcol.setCellValueFactory(new PropertyValueFactory<>("match")); 
        runcol.setCellValueFactory(new PropertyValueFactory<>("RunWIK")); 
        runavcol.setCellValueFactory(new PropertyValueFactory<>("Average"));
        srcol.setCellValueFactory(new PropertyValueFactory<>("StrikRate"));
        hscol.setCellValueFactory(new PropertyValueFactory<>("Highest")); 
        
        
        //RecordTable ball
        namrcol1.setCellValueFactory(new PropertyValueFactory<>("name")); 
        matchcol1.setCellValueFactory(new PropertyValueFactory<>("match")); 
        wktcol.setCellValueFactory(new PropertyValueFactory<>("RunWIK")); 
        wkavcol.setCellValueFactory(new PropertyValueFactory<>("Average"));
        srcol1.setCellValueFactory(new PropertyValueFactory<>("StrikRate"));
        hwcol.setCellValueFactory(new PropertyValueFactory<>("Highest")); 
        
        cl1.setCellValueFactory(new PropertyValueFactory<>("name")); 
        cl2.setCellValueFactory(new PropertyValueFactory<>("match")); 
        cl3.setCellValueFactory(new PropertyValueFactory<>("RunWIK")); 
        cl4.setCellValueFactory(new PropertyValueFactory<>("Average"));
        cl5.setCellValueFactory(new PropertyValueFactory<>("StrikRate"));
        cl6.setCellValueFactory(new PropertyValueFactory<>("Highest")); 
    }

    
    private void loadDataFromDatabase(String mode){
   
        try {
            String sql = null;
            if(mode.equals("Player")){
                sql = "Select Name,DATEDIFF(year,DOB,getdate()),Salary,Phone,Mail,Addess,BloodGroup from Employee where Category ='Player'"; 
            }
            else if(mode.equals("Manager")){
                sql = "Select Name,DATEDIFF(year,DOB,getdate()),Salary,Phone,Mail,Addess,BloodGroup  from Employee where Category LIKE '%Manager%'"; 
            }
            else if(mode.equals("Coach")){
                sql = "Select Name,DATEDIFF(year,DOB,getdate()),Salary,Phone,Mail,Addess,BloodGroup  from Employee where Category LIKE '%Coach%'"; 
            }
            else if(mode.equals("Stuff")){
                sql = "Select Name,DATEDIFF(year,DOB,getdate()),Salary,Phone,Mail,Addess,Category from Employee where (Category <>'Player' AND Category <>'Manager' AND Category <>'Coach')"; 
            }
            else if(mode.equals("Finance")){
                sql ="Select * from Finance where Type ='Expense'"; 
            }
            else if(mode.equals("Revenue")){
                sql ="Select * from Finance where Type ='Revenue'"; 
            }
            else if(mode.equals("Salary")){
                sql = "SELECT E.EmployeeID,E.Name,E.CATEGORY,E.Salary,S.BonusAmount,S.Status from Employee E Right Join SALARY S on E.EmployeeID= S.EmployeeID  "; 
            }
            
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            if(mode.equals("Player")){
                while(resultSet.next()){
                observePlayer.add(new Employee(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));
                PlayerTable.setItems(observePlayer);
             
            } 
            }
            else if(mode.equals("Manager")){
                while(resultSet.next()){
                observeManager.add(new Employee(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));
                ManagerTable.setItems(observeManager);
            } 
            }
            else if(mode.equals("Coach")){
                while(resultSet.next()){
                observeCoach.add(new Employee(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));
                CoachTable.setItems(observeCoach);
            } 
            }
            else  if(mode.equals("Stuff")){
                while(resultSet.next()){
                observeStuff.add(new Employee(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7)));
                StuffTable.setItems(observeStuff);
            } 
            }
            else if(mode.equals("Finance")){
                while(resultSet.next()){
                observeexpense.add(new Finance(resultSet.getString(5),resultSet.getString(4),resultSet.getString(3),resultSet.getString(6),resultSet.getString(7)));
                ExpenseTable.setItems(observeexpense);
            }
            }
            else if(mode.equals("Revenue")){
                while(resultSet.next()){
                observerevenue.add(new Finance(resultSet.getString(5),resultSet.getString(4),resultSet.getString(3),resultSet.getString(6),resultSet.getString(7)));
                RevenueTable.setItems(observerevenue);
            }
            }
            else if(mode.equals("Salary")){
                while(resultSet.next()){
                observesalary.add(new Salary(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6)));
                SalaryTable.setItems(observesalary);
            }
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }
    
     private void loadPlayerPerfomanceFromDatabase(String mode){
   
        try {
            String sql = null;
            if(mode.equals("day1")){
               sql = " Select T.MatchDate,E.Name,T.MatchType,P.PalyerType,P.RunsScored,P.BallsFaced,P.Fours,P.Sixes,P.WicketsTaken,P.BallsBowled,P.RunsGave  from Employee E left join PlayerPerfomance P on E.EmployeeID=P.EmployeeID left join TeamPerfomance T on T.MatchID=P.MatchID  where DATEDIFF(DAY,T.MatchDate,getdate())=1"; 
            }
            else if(mode.equals("day2")){
                             sql = " Select T.MatchDate,E.Name,T.MatchType,P.PalyerType,P.RunsScored,P.BallsFaced,P.Fours,P.Sixes,P.WicketsTaken,P.BallsBowled,P.RunsGave  from Employee E left join PlayerPerfomance P on E.EmployeeID=P.EmployeeID left join TeamPerfomance T on T.MatchID=P.MatchID  where DATEDIFF(DAY,T.MatchDate,getdate())=2";  
            }
            else if(mode.equals("day3")){
                             sql = " Select T.MatchDate,E.Name,T.MatchType,P.PalyerType,P.RunsScored,P.BallsFaced,P.Fours,P.Sixes,P.WicketsTaken,P.BallsBowled,P.RunsGave  from Employee E left join PlayerPerfomance P on E.EmployeeID=P.EmployeeID left join TeamPerfomance T on T.MatchID=P.MatchID  where DATEDIFF(DAY,T.MatchDate,getdate())=3"; 
            }
            else if(mode.equals("day4")){
                             sql = " Select T.MatchDate,E.Name,T.MatchType,P.PalyerType,P.RunsScored,P.BallsFaced,P.Fours,P.Sixes,P.WicketsTaken,P.BallsBowled,P.RunsGave  from Employee E left join PlayerPerfomance P on E.EmployeeID=P.EmployeeID left join TeamPerfomance T on T.MatchID=P.MatchID  where DATEDIFF(DAY,T.MatchDate,getdate())=4"; 
            }
            else if(mode.equals("day5")){
                             sql = " Select T.MatchDate,E.Name,T.MatchType,P.PalyerType,P.RunsScored,P.BallsFaced,P.Fours,P.Sixes,P.WicketsTaken,P.BallsBowled,P.RunsGave  from Employee E left join PlayerPerfomance P on E.EmployeeID=P.EmployeeID left join TeamPerfomance T on T.MatchID=P.MatchID  where DATEDIFF(DAY,T.MatchDate,getdate())=5"; 
            }
            else if(mode.equals("day6")){
                             sql = " Select T.MatchDate,E.Name,T.MatchType,P.PalyerType,P.RunsScored,P.BallsFaced,P.Fours,P.Sixes,P.WicketsTaken,P.BallsBowled,P.RunsGave  from Employee E left join PlayerPerfomance P on E.EmployeeID=P.EmployeeID left join TeamPerfomance T on T.MatchID=P.MatchID  where DATEDIFF(DAY,T.MatchDate,getdate())=6"; 
            }
            else if(mode.equals("day7")){
                            sql = " Select T.MatchDate,E.Name,T.MatchType,P.PalyerType,P.RunsScored,P.BallsFaced,P.Fours,P.Sixes,P.WicketsTaken,P.BallsBowled,P.RunsGave  from Employee E left join PlayerPerfomance P on E.EmployeeID=P.EmployeeID left join TeamPerfomance T on T.MatchID=P.MatchID  where DATEDIFF(DAY,T.MatchDate,getdate())=7"; 
            }
            
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
                if(mode.equals("day1")){
                while(resultSet.next()){
                observePerfomance1.add(new Perfomance(resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9),resultSet.getString(10),resultSet.getString(11)));
                PerfomanceTable.setItems(observePerfomance1);
                }
               }
                else    if(mode.equals("day2")){
                while(resultSet.next()){
                observePerfomance2.add(new Perfomance(resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9),resultSet.getString(10),resultSet.getString(11)));
                PerfomanceTable2.setItems(observePerfomance2);
                }
               }
                else    if(mode.equals("day3")){
                while(resultSet.next()){
                observePerfomance3.add(new Perfomance(resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9),resultSet.getString(10),resultSet.getString(11)));
                PerfomanceTable3.setItems(observePerfomance3);
                }
               }
                else   if(mode.equals("day4")){
                while(resultSet.next()){
                observePerfomance4.add(new Perfomance(resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9),resultSet.getString(10),resultSet.getString(11)));
                PerfomanceTable4.setItems(observePerfomance4);
                }
               }     
                else   if(mode.equals("day5")){
                while(resultSet.next()){
                observePerfomance5.add(new Perfomance(resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9),resultSet.getString(10),resultSet.getString(11)));
                PerfomanceTable5.setItems(observePerfomance5);
                }
               }
                   else if(mode.equals("day6")){
                while(resultSet.next()){
                observePerfomance6.add(new Perfomance(resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9),resultSet.getString(10),resultSet.getString(11)));
                PerfomanceTable6.setItems(observePerfomance6);
                }
               }
                else  if(mode.equals("day7")){
                while(resultSet.next()){
                observePerfomance7.add(new Perfomance(resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9),resultSet.getString(10),resultSet.getString(11)));
                PerfomanceTable7.setItems(observePerfomance7);
                }
               }
           
        } catch (SQLException ex) {
            Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }
     
    private void loadSchedulefromDatabase(){
        try {
            String sql= "Select * from Schedule";
            
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                observeSchedule.add(new Schedule(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
               scheduletable.setItems(observeSchedule);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    } 

    @FXML
    private void exitapplication(MouseEvent event) {
        Stage s =(Stage) ((Node)event.getSource()).getScene().getWindow();
        s.close();
    }

    @FXML
    private void minimizeapplicaton(MouseEvent event) {
         Stage s =(Stage) ((Node)event.getSource()).getScene().getWindow();
         s.setIconified(true);
    }

    @FXML
    private void addEmployeeToDatabase(ActionEvent event) {
        
             String sql = "Insert into Employee Values(?,?,?,?,?,?,?,?,?)";
             
             String EmployeeName = employeeNameTextfield.getText();
             String EmployeeCategory = (String) EmployeeTypeCB.getValue();
             String EmployeeID = getId(EmployeeCategory);
             System.out.println(EmployeeID);
             String dob = (String) DobYearCB.getValue();
             dob += "-"+(String)DobMonthCB.getValue()+"-"+(String)DobDateCB.getValue();
             String EmployeeDOB = dob;
             String EmployeeSalary = EmployeeSalaryTextfield.getText();
             String EmployeeMail = EmployeeMailTextfield.getText();
             String EmployeePhone = EmployeePhoneTextField.getText();
             String EmployeeAdress = EmployeeAdressTextfield.getText();
             String EmployeeBloodGroup = (String) EmployeeBloddGroupCB.getValue();
                     
        
        try {                
            statement = connection.prepareStatement(sql);
            statement.setString(1,EmployeeID);
            statement.setString(2,EmployeeName);
            statement.setString(3,EmployeeCategory);
            statement.setString(4,EmployeeDOB);
            statement.setString(5,EmployeeSalary );
            statement.setString(6,EmployeePhone);
            statement.setString(7,EmployeeMail);
            statement.setString(8,EmployeeAdress); 
            statement.setString(9,EmployeeBloodGroup);
         
        
                int i= statement.executeUpdate();
                if(i==1){
                     System.out.println("Data added");
                     observePlayer.clear();
                     observeManager.clear();
                     observeCoach.clear();
                     observeStuff.clear();
                     loadDataFromDatabase("Player");
                     loadDataFromDatabase("Coach");
                     loadDataFromDatabase("Manager");
                     loadDataFromDatabase("Stuff");
                     
                     clearfields();
                     
                      JOptionPane.showMessageDialog(null,"Employee Added");
                }
                
                //clearfields();
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
                 try {
                     statement.close();
                 } catch (SQLException ex) {
                     Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
                 }
        }
    }
    
    private void addPerformanceToDatabase(ActionEvent event) {
        
        
    }
    private void addTeamPerfomanceToDatabase(ActionEvent event) {
        
      
    }


   
    
    @FXML
    private void showPlayerEmpoyee(Event event) {
    }

    @FXML
    private void showMangerEmployee(Event event) {
    }

    @FXML
    private void showCoachEmployee(Event event) {
    }

    @FXML
    private void showStuffEmployee(Event event) {
    }

    private void addJfXCOMBOVALUES() {
       //EmployeeTypeCB = new JFXComboBox<String>();
       EmployeeTypeCB.getItems().add("Player");
       EmployeeTypeCB.getItems().add("Manager");
       EmployeeTypeCB.getItems().add("Coach");
       EmployeeTypeCB.getItems().add("Janitor");
       
       //DobDateCB = new JFXComboBox<String>()
       for (int i = 1; i <=31; i++) { DobDateCB.getItems().add(String.valueOf(i));  }
       for (int i = 1; i <=31; i++) { matchdaycb.getItems().add(String.valueOf(i));  }
        for (int i = 1; i <=31; i++) { fdaycb.getItems().add(String.valueOf(i));  }
         for (int i = 1; i <=31; i++) { schday.getItems().add(String.valueOf(i));  }
       
       //DobMonthCB = new JFXComboBox<String>();
       for (int i = 1; i <=12; i++) { DobMonthCB.getItems().add(String.valueOf(i));  }
       for (int i = 1; i <=12; i++) { matchmnthcb.getItems().add(String.valueOf(i));  }
       for (int i = 1; i <=12; i++) { fmonthcb.getItems().add(String.valueOf(i));  }
        for (int i = 1; i <=12; i++) { schmon.getItems().add(String.valueOf(i));  }
   
       
       //DobYearCB =new JFXComboBox<String>();
       for (int i = 1900; i <=2020; i++) { DobYearCB.getItems().add(String.valueOf(i));  }
       for (int i = 2020; i >=2000; i--) {  matchyearcb.getItems().add(String.valueOf(i));  }
       for (int i = 2020; i >=2000; i--) {  fyearcb.getItems().add(String.valueOf(i));  }
       for (int i = 2020; i >=2000; i--) {  schyear.getItems().add(String.valueOf(i));  }
       
       //EmployeeBloddGroupCB =new JFXComboBox<String>();
       EmployeeBloddGroupCB.getItems().add("B+ve");
       EmployeeBloddGroupCB.getItems().add("A+ve");
       EmployeeBloddGroupCB.getItems().add("O+ve");
       EmployeeBloddGroupCB.getItems().add("AB+ve");
       EmployeeBloddGroupCB.getItems().add("B-ve");
       EmployeeBloddGroupCB.getItems().add("A-ve");
       EmployeeBloddGroupCB.getItems().add("O-ve");
       EmployeeBloddGroupCB.getItems().add("AB-ve");
       
       //asdasd
       MatchTypeCB.getItems().add("One Day");
       MatchTypeCB.getItems().add("Test");
       MatchTypeCB.getItems().add("T20");
       
      
      PalyerTypeCB.getItems().add("Bowler");
      PalyerTypeCB.getItems().add("Batsman");
      PalyerTypeCB.getItems().add("All Rounder");
      PalyerTypeCB.getItems().add("Wicket Keeper");
      
       MatchTypeCB1.getItems().add("One Day");
       MatchTypeCB1.getItems().add("Test");
       MatchTypeCB1.getItems().add("T20");
       
       
         ftype.getItems().add("Expense");
         ftype.getItems().add("Revenue");
     
       
       
       fmethod.getItems().add("Cash");
       fmethod.getItems().add("Check");
       fmethod.getItems().add("Card");
       
       schtypecb.getItems().add("Match");
       schtypecb.getItems().add("Practice");
       schtypecb.getItems().add("Training");
       schtypecb.getItems().add("Meeting");
       schtypecb.getItems().add("Medical");
       
      // ScheduleType.getItems().add("");
       
       
       
    }
    
     void clearfields(){
        employeeNameTextfield.setText("");
        EmployeeSalaryTextfield.setText("");
        EmployeeMailTextfield.setText("");
        EmployeePhoneTextField.setText("");
        EmployeeAdressTextfield.setText("");
        EmployeeTypeCB.setValue(null);
        EmployeeBloddGroupCB.setValue(null);
        DobYearCB.setValue(null);
        DobMonthCB.setValue(null);
        DobDateCB.setValue(null);
        
        
    }

    private String getId(String type) {
           String sql  = "Select Count(*) from Employee where Category ='"+type+"'";
           System.out.println(sql);
           String employeeid="";
           if(type.equals("Player")){
               employeeid+="11";
           }
           else if(type.equals("Manager")){
               employeeid+="33";
           }
            else if(type.equals("Coach")){
               employeeid+="22";
           }
            else {
               employeeid+="44";
           }
           try {
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            int id = 0 ;
            while(resultSet.next()){
              id =resultSet.getInt(1);
              ++id;
            }
            String tid ="";
            if(id<10){
                tid ="0"+Integer.toString(id);
            }
            else  tid =Integer.toString(id);
            
            employeeid+= tid;
        } catch (SQLException ex) {
            Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
        }    
           return employeeid;
    }

    @FXML
    private void logoutMethod(ActionEvent event) throws IOException {
              Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    stage.close();
                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Login.fxml")));
                    stage.setScene(scene);
                    stage.show();
    }
    
    private void loadoverallteamperfomance(){
        try {
            String sql=
                    "SELECT DATEPART(week, S.MatchDate) AS Week,COUNT(S.MatchID) AS Matchplayed , (select COUNT(MatchVerdict) AS MatchesLost from TeamPerfomance WHERE MatchVerdict<>'won' ),(select COUNT(MatchVerdict) as MatchesWon from TeamPerfomance WHERE MatchVerdict='won' ),SUM(S.RunsScored)/COUNT(S.MatchID) AS AveragRun,"
                    +" SUM(S.WicketsTaken)/COUNT(S.MatchID) As AverageWicket FROM TeamPerfomance S,TeamPerfomance M where ('20200101' <=  M.MatchDate"+
                    " AND  M.MatchDate < '20201201') GROUP BY DATEPART(week,  S.MatchDate)";
            
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                observeallper.add(new Record(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6)));
            }
            allpertable.setItems(observeallper);
        } catch (SQLException ex) {
            Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  
       
    
    }

    @FXML
    private void addPerfomanceToDatabase(ActionEvent event) {
        
             String sql = "Insert into PlayerPerfomance(EmployeeID,MatchId,PalyerType,RunsScored,BallsFaced,Fours,Sixes,WicketsTaken,BallsBowled,RunsGave,Pom) Values(?,?,?,?,?,?,?,?,?,?,?)";
             
             String employeeid = EmployeeID.getText();
             String matchid = MatchId.getText();
             String matchtype = (String) MatchTypeCB.getValue();
             String palyertype = (String) PalyerTypeCB.getValue();
             String runsscored = RunsScored.getText();
             String ballsfaced = BallsFaced.getText();
             String fours= Fours.getText();
             String sixes = Sixes.getText();
             String wicketstaken = WicketsTaken.getText();
             String ballsbowled = BallsBowled.getText();
             String runsgave = RunsGave.getText();
             String pom;
             if(pomcheck.isSelected()){
                 pom="1";
             }
             else{
                 pom="0"; 
             }
        
        try {                
            statement = connection.prepareStatement(sql);
            statement.setString(1,employeeid);
            statement.setString(2,matchid);
            statement.setString(3,palyertype );
            statement.setString(4,runsscored);
            statement.setString(5,ballsfaced);
            statement.setString(6,fours); 
            statement.setString(7,sixes);
            statement.setString(8,wicketstaken);
            statement.setString(9,ballsbowled); 
            statement.setString(10,runsgave);
            statement.setString(11,pom);
         
        
                int i= statement.executeUpdate();
                if(i==1){
                     System.out.println("Data added");
                     observePerfomance1.clear();
                     observePerfomance2.clear();
                     observePerfomance3.clear();
                     observePerfomance4.clear();
                     observePerfomance5.clear();
                     observePerfomance6.clear();
                     observePerfomance7.clear();
           
                     loadPlayerPerfomanceFromDatabase("day1");
                     loadPlayerPerfomanceFromDatabase("day2");
                     loadPlayerPerfomanceFromDatabase("day3");
                     
                     loadPlayerPerfomanceFromDatabase("day4");
                     loadPlayerPerfomanceFromDatabase("day5");
                     loadPlayerPerfomanceFromDatabase("day6");   
                     loadPlayerPerfomanceFromDatabase("day7");  
                     
                     JOptionPane.showMessageDialog(null,"Perfomance Added");
                     
                     clearfields();
                }
                else{
                    System.out.println("Data add failed");
                     JOptionPane.showMessageDialog(null,"Failed  Successfully");
                }
                
                //clearfields();
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
                 try {
                     statement.close();
                 } catch (SQLException ex) {
                     Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
                     JOptionPane.showMessageDialog(null,"Failed  Successfully");
                 }
        }
    }

    @FXML
    private void addTeamDatatoDB(ActionEvent event) {
        
             String sql = "Insert into TeamPerfomance Values(?,?,?,?,?,?,?,?,?,?)";
             String matchid= MatchId1.getText();
             String matchtype = (String) MatchTypeCB1.getValue();
             String runsscored = RunsScored1.getText();
             String runsgiven = RunsGiven.getText();
             String wicketstaken = WicketsTaken1.getText();
             String wicketslost = WicketsLost.getText();
             String matchverdict ;
             if(verdict.isSelected()){
                 matchverdict="won";
             }
             else{
                  matchverdict="lost";
             }
             String fours = Fours1.getText();
             String sixes = Sixes1.getText();
             
             String date = (String) matchyearcb.getValue();
             date += "-"+(String)matchmnthcb.getValue()+"-"+(String)matchdaycb.getValue();
                     
        
        try {                
            statement = connection.prepareStatement(sql);
            statement.setString(1,matchid);
            statement.setString(2,matchtype);
            statement.setString(3,date);
            statement.setString(4,runsscored);
            statement.setString(5,runsgiven);
            statement.setString(6,wicketstaken );
            statement.setString(7,wicketslost);
            statement.setString(8,matchverdict); 
            statement.setString(9,fours);
            statement.setString(10,sixes);
         
        
                int i= statement.executeUpdate();
                if(i==1){
                     System.out.println("Data added");
                       JOptionPane.showMessageDialog(null,"Perfomance Added");
                     clearfields();
                }
                
                //clearfields();
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,"Failed  Successfully");
        }
        finally{
                 try {
                     statement.close();
                 } catch (SQLException ex) {
                     Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
                 }
        }
    }

    private void searcher() {
        searchbar.setOnKeyReleased(e->{
        if(searchbar.getText().equals(" ")){
           loadDataFromDatabase("Player");
           loadDataFromDatabase("Manager");
           loadDataFromDatabase("Coach");
           loadDataFromDatabase("Janitor");
        }
        else{
             observePlayer.clear();
             String sql = " select * from Employee where ((Name Like '%"+ searchbar.getText()+"%' OR Addess Like '%"+ searchbar.getText()+"%') AND Category='Player')" 
             +"UNION Select * from Employee where ((MAIL Like '%"+ searchbar.getText()+"%' OR Salary Like '%"+ searchbar.getText()+"%') AND Category='Player')"; 
           
           try {
                statement = connection.prepareStatement(sql);
                resultSet = statement.executeQuery();
            
                while(resultSet.next()){
                observePlayer.add(new Employee(resultSet.getString(2),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9)));
                }
                 PlayerTable.setItems(observePlayer);
            } catch (SQLException ex) {
                Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        });
    }
    
    private void loadRecordBat(){
        try {
            String sql= "Select E.Name, Count(P.PerfomanceId)  AS MatchesPlayed,SUM(P.RunsScored) AS TOTALRUN ,"+
                    "convert(float,SUM(P.RunsScored))/convert(float,Sum(P.BallsFaced))*100 AS STRIKERATE , "+
                    "SUM(P.RunsScored)/Count(P.PerfomanceId) AS AVERAGE  , Max(P.RunsScored) As Highest From Employee E "+
                    "left join PlayerPerfomance P on E.EmployeeID=P.EmployeeID  where (E.Category='Player' and P.PalyerType='Batsman')  Group BY E.Name";
            

            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                observeRecordBat.add(new Record(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6)));
            }
            battingtable.setItems(observeRecordBat);
        } catch (SQLException ex) {
            Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
        
    private void loadRecordBall(){
        try {
            String sql= "Select E.Name, Count(P.PerfomanceId)  AS MatchesPlayed,SUM(P.WicketsTaken ) AS TOTALWICKET ,"+
 "convert(float,SUM(P.BallsBowled))/convert(float,Sum(P.WicketsTaken)) AS STRIKERATE , "+
 "convert(float,SUM(P.RunsGave))/convert(float,Count(P.PerfomanceId)) AS AVERAGE, Max(P.WicketsTaken) As Highest   From Employee E "+
 "left join PlayerPerfomance P on E.EmployeeID=P.EmployeeID  where (e.Category='Player'and P.PalyerType<>'Batsman')  Group BY E.Name";

            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                observeRecordBowl.add(new Record(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6)));
            }
            battingtable1.setItems(observeRecordBowl);
        } catch (SQLException ex) {
            Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
   private void setCell(){
       PlayerTable.setOnMouseClicked(new EventHandler<MouseEvent>(){
         
           public void handle(MouseEvent event){
               Employee p =  (Employee) PlayerTable.getItems().get(PlayerTable.getSelectionModel().getSelectedIndex());
               ed1.setText(p.getEmployeeNameDB());
               ed2.setText(p.getEmployeeAgeDB());
               ed3.setText(p.getEmployeeMailDB());
               ed4.setText(p.getEmployeeAddressDB());
               ed5.setText(p.getEmployeePhoneDB());
               ed6.setText(p.getEmployeeSalaryDB());
               ed7.setText(p.getEmployeeBloodGroupDB());       
           }
       });
   }

    @FXML
    private void addfinancedata(ActionEvent event) {
           String sql = "Insert into Finance Values(?,?,?,?,?,?,?)";
             
               
             String financeid = FinanceID.getText();
             String amount = famount.getText();  
             String type = (String) ftype.getValue();
             String description = fdes.getText();
             String method =(String)  fmethod.getValue();  
             String status ;
             
                if(paidchk.isSelected()){
                 status="Completed";
                }
                else{
                    status="DUE";
                 }
             
              
                     
             String date = (String) fyearcb.getValue();
             date += "-"+(String)fmonthcb.getValue()+"-"+(String)fdaycb.getValue();        
                     
             
        try {                
            statement = connection.prepareStatement(sql);
            statement.setString(1, financeid);
            statement.setString(2,type);
            statement.setString(3,amount);
            statement.setString(4,description);
             statement.setString(5,date );
             statement.setString(6,method);
             statement.setString(7,status );        
             
            
                int i= statement.executeUpdate();
                if(i==1){
                     System.out.println("Data added");
                     
                     
                     clearfields();
                }
                
                //clearfields();
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
                 try {
                     statement.close();
                 } catch (SQLException ex) {
                     Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
                 }
        }
        
    }

    @FXML
    private void addscheduledata(ActionEvent event) {
        
             String sql = "Insert into Schedule Values(?,?,?,?)";
             String scheduleid = schid.getText();
             String scheduletype = (String) schtypecb.getValue();
             String scheduledesc = schdes.getText(); 
             
             String date = (String) schyear.getValue();
             date += "-"+(String)schmon.getValue()+"-"+(String)schday.getValue();    
        try {                
            statement = connection.prepareStatement(sql);
            statement.setString(1,scheduleid);
            statement.setString(2,scheduletype);
            statement.setString(3,date);
            statement.setString(4,scheduledesc);
            
                int i= statement.executeUpdate();
                if(i==1){
                     System.out.println("Data added");
                     clearfields();
                }
                
                //clearfields();
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
                 try {
                     statement.close();
                 } catch (SQLException ex) {
                     Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
                 }
        }
    }

    @FXML
    private void handleupdate(ActionEvent event) {
        try {
            String sql= "Update Employee set Salary=?,Mail=?, Addess=?,Phone=?, BloodGroup =? where Name=? ";
            String nm=ed1.getText();
            String sl=ed6.getText();
            BigInteger bsl=new BigInteger(sl);
            String ad=ed4.getText();
            String ph=ed5.getText();
            String bg=ed7.getText();
            String ml=ed3.getText();
            
            statement = connection.prepareStatement(sql);
       
        
            statement.setBigDecimal(1, new BigDecimal(bsl));
            statement.setString(2, ml);
            statement.setString(3, ad);
            statement.setString(4, ph);
            statement.setString(5, bg);
            statement.setString(6, nm);
            
            int i=statement.executeUpdate();
            if(i==1){
                System.out.println("done deal");
                observePlayer.clear();
                setCellTable();
                loadDataFromDatabase("Player");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @FXML
    private void deletedata(ActionEvent event) {
        try {
            String sql= "Delete from Employee where Name=? ";
            
            statement = connection.prepareStatement(sql);
            String nm=ed1.getText();
            statement.setString(1, nm);
            
            int i=statement.executeUpdate();
            if(i==1){
                System.out.println("done deal");
                observePlayer.clear();
                setCellTable();
                loadDataFromDatabase("Player");
                JOptionPane.showMessageDialog(null,"Deleted");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Succesfully Failed");
            Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}

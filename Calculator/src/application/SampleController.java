package application;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class SampleController implements Initializable {
	
    @FXML
    private GridPane actionButtons;
    
	
    @FXML
    private TextField output;
    
    @FXML
    private TextField show;
    
    @FXML
    private Button AC;

    @FXML
    private Button Back;

    @FXML
    private Button divide;

    @FXML
    private Button multi;

    @FXML
    private Button val7;

    @FXML
    private Button val4;

    @FXML
    private Button val1;

    @FXML
    private Button val0;

    @FXML
    private Button val8;

    @FXML
    private Button val9;

    @FXML
    private Button sub;

    @FXML
    private Button val5;

    @FXML
    private Button val6;

    @FXML
    private Button add;

    @FXML
    private Button Percent;

    @FXML
    private Button val3;

    @FXML
    private Button val2;

    @FXML
    private Button dot;

    @FXML
    private Button val_equ;
    
    @FXML
    private Button C;

    @FXML
    private Button CH;

    @FXML
    private Button back;
    
    Float data = 0f;
    int operation = 0;
    

    

    @FXML
    void actionbutton(ActionEvent event) {
    	
    	if(event.getSource()==val0) {
    		output.setText(output.getText()+"0");
    		
    	}
    	else if(event.getSource()==val1) {
    		output.setText(output.getText()+"1");
    		
    	}
    	else if(event.getSource()==val2) {
    		output.setText(output.getText()+"2");
    		
    	}
    	else if(event.getSource()==val3) {
    		output.setText(output.getText()+"3");
    		
    	}
    	else if(event.getSource()==val4) {
    		output.setText(output.getText()+"4");
    		
    	}
    	else if(event.getSource()==val5) {
    		output.setText(output.getText()+"5");
    		
    	}
    	else if(event.getSource()==val6) {
    		output.setText(output.getText()+"6");
    		
    	}
    	else if(event.getSource()==val7) {
    		output.setText(output.getText()+"7");
    		
    	}
    	else if(event.getSource()==val8) {
    		output.setText(output.getText()+"8");
    		
    	}
    	else if(event.getSource()==val9) {
    		output.setText(output.getText()+"9");
    		
    	}
    	else if(event.getSource()==dot) {
    		output.setText(output.getText()+".");
    		
    	}
    	else if(event.getSource()==AC) {
    		output.setText("");
    		show.setText("");
    	}
    	else if(event.getSource()==C) {
    		output.setText("");
    	}
    	else if(event.getSource()==CH) {
    		show.setText("");
    	}
    	else if(event.getSource()==back) {
    	    if (output.getText().length()>0){
    	        StringBuffer sb = new StringBuffer(output.getText());
    	        sb = sb.deleteCharAt(output.getText().length()-1);
    	        output.setText(sb.toString());
    
    	    }
    	}
    	else if(event.getSource()== add) {
    		data = Float.parseFloat(output.getText());
    		operation = 1;
    		
    		show.setText(show.getText()+output.getText()+"+");
    		output.setText("");
    	}
    	else if(event.getSource()== sub) {
    		data = Float.parseFloat(output.getText());
    		operation = 2;
    		
    		show.setText(show.getText()+output.getText()+"-");
    		output.setText("");
    	}
    	else if(event.getSource()== multi) {
    		data = Float.parseFloat(output.getText());
    		operation = 3;
    		
    		show.setText(show.getText()+output.getText()+"X");
    		output.setText("");
    	}
    	else if(event.getSource()== divide) {
    		data = Float.parseFloat(output.getText());
    		operation = 4;
    		
    		show.setText(show.getText()+output.getText()+"/");
    		output.setText("");
    	}
    	else if(event.getSource()== val_equ) {
    		
    		Float secondval = Float.parseFloat(output.getText());
    		switch(operation)
    		{
    		
    		case 1:
    			Float ans = data + secondval;
    			output.setText(String.valueOf(ans));
    			show.setText(show.getText()+secondval+"="+ans+" ; ");
    			break;
    			
    		case 2:
    			ans = data - secondval;
    			output.setText(String.valueOf(ans));
    			show.setText(show.getText()+secondval+"="+ans+" ; ");
    			break;
    		
    		case 3:
    			ans = data * secondval;
    			output.setText(String.valueOf(ans));
    			show.setText(show.getText()+secondval+"="+ans+" ; ");
    			break;
    			
    		case 4:
    			ans=0f;
    			try {
    				ans = data / secondval;
    				output.setText(String.valueOf(ans));
    				show.setText(show.getText()+secondval+"="+ans+" ; ");
    			}catch(Exception e) {
    				
    				output.setText("Math Error");
    				
    			}
    			
    			break;
    		
    		}
    	}

    }


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}


	
}







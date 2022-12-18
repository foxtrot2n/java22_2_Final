package kr.kmu.ims.viewmodels;

import javafx.scene.control.CheckBox;
import kr.kmu.ims.models.EmployeeView;

public class EmployeeViewModel extends EmployeeView {
    CheckBox isActiveCheckBox;
    public CheckBox getIsActiveCheckBox(){
        return isActiveCheckBox;
    }
    public void setIsActiveCheckBox(CheckBox value){
        isActiveCheckBox=value;
    }
}

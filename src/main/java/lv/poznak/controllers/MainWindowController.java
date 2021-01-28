package lv.poznak.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lv.poznak.ui.Player;

public class MainWindowController {

  private Player player = new Player();

  @FXML private Label musicStatus;

  @FXML
  public void playMusic(ActionEvent actionEvent) {
    musicStatus.setText(player.getState().onPlay());
  }

  @FXML
  public void stopMusic(ActionEvent actionEvent) {
    musicStatus.setText(player.getState().onLock());
  }

  @FXML
  public void nextMusic(ActionEvent actionEvent) {
    musicStatus.setText(player.getState().onNext());
  }

  @FXML
  public void prevMusic(ActionEvent actionEvent) {
    musicStatus.setText(player.getState().onPrevious());
  }
}

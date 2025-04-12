package controller;

import dao.UserDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.User;

public class AdminController {

    @FXML private TableView<User> userTable;
    @FXML private TableColumn<User, String> colUsername;
    @FXML private TableColumn<User, String> colRole;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private ComboBox<String> roleBox;

    private final UserDAO userDAO = new UserDAO();
    private final ObservableList<User> users = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        roleBox.setItems(FXCollections.observableArrayList("ADMIN", "OPERATOR", "USER"));
        loadUsers();
    }

    private void loadUsers() {
        users.setAll(userDAO.getAll());
        userTable.setItems(users);
    }

    @FXML
    public void addUser() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String role = roleBox.getValue();
        if (username.isEmpty() || password.isEmpty() || role == null) return;
        User user = new User(0, username, password, role);
        userDAO.add(user);
        loadUsers();
    }

    @FXML
    public void deleteUser() {
        User selected = userTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            userDAO.delete(selected.getId());
            loadUsers();
        }
    }
}

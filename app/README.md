# Login App
The Login App is a straightforward application designed to authenticate users by validating their username and password.
- The UserModel manages user data and authentication logic, the LoginActivity handles the user interface elements related to login functionality, and the LoginPresenter coordinates communication between the View and Model.

## MVP Architecture
### Model (UserModel)
The UserModel encapsulates the data and logic related to the user. It contains properties for the username and password and provides a method to validate user credentials.
It represents the user's data and authentication logic, such as checking if the entered username and password match predefined values.

### View (LoginActivity)
The LoginActivity is responsible for presenting the user interface elements related to the login functionality. It includes elements like input fields for username and password and buttons for login.
It implements the LoginView interface, defining methods to display loading indicators, login success/error messages, and hide/show loading elements.
The LoginActivity forwards user input (username and password) to the Presenter and receives instructions to update the UI based on authentication results.

### Presenter (LoginPresenter)
The LoginPresenter acts as an intermediary between the View and Model. It contains the application's business logic related to user authentication.
It receives user input (username and password) from the View, interacts with the UserModel to validate credentials, and instructs the View to update accordingly.
The Presenter abstracts the authentication process from the View, making it easier to test and maintain.

## Flow of Control
1) User Interaction:
The user interacts with the LoginActivity UI by entering their username and password and clicking the login button.

2) View Interaction with Presenter:
The LoginActivity forwards the entered username and password to the LoginPresenter when the login button is clicked.

3) Presenter Interaction with Model:
The LoginPresenter receives the username and password from the LoginActivity and interacts with the UserModel to validate the credentials.

4) Model Validates Credentials:
The UserModel checks if the provided username and password match predefined values (e.g., hardcoded values like "admin" and "password").

5) Presenter Updates View:
Upon receiving the validation result from the Model, the LoginPresenter instructs the LoginActivity to update the UI accordingly.
If the credentials are valid, the Presenter notifies the View to display a login success message. Otherwise, it displays a login error message.

6) View Displays Login Status:
The LoginActivity receives instructions from the Presenter and updates the UI to show either a login success message or a login error message.

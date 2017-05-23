package models

import java.util.{HashMap, Map};

/**
 * Provides an in-memory repository for UserInfo.
 * Storing credentials in the clear is kind of bogus.
 * @author Antoine Drabble
 */
object UserDB {

    var users : Map[String, User] = new HashMap[String, User]()

    /**
     * Adds the specified user to the UserInfoDB.
     * @param name Their name.
     * @param email Their email.
     * @param password Their password.
     */
    def addUserInfo(name: String, email: String, password: String) {
        users.put(email, new User(name, email, password));
    }

    /**
     * Returns true if the email represents a known user.
     * @param email The email.
     * @return True if known user.
     */
    def isUser(email: String) : Boolean = {
        users.containsKey(email)
    }

    /**
     * Returns the UserInfo associated with the email, or null if not found.
     * @param email The email.
     * @return The UserInfo.
     */
    def  getUser(email: String) : User = {
        users.get(if(email == null) "" else email)
    }

    /**
     * Returns true if email and password are valid credentials.
     * @param email The email.
     * @param password The password.
     * @return True if email is a valid user email and password is valid for that email.
     */
    def  isValid(email: String, password: String) {
        ((email != null)
                &&
                (password != null)
                &&
                isUser(email)
                &&
                getUser(email).password.equals(password))
    }
}

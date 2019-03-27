package com.neosuniversity.data;

public class DAOException extends RuntimeException {

    public DAOException() {
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(Throwable cause) {
        super(cause);
    }
}

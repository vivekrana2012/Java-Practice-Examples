package com.CustomQueueImpl;

public class QueueFullException extends RuntimeException {

  public QueueFullException(String message){
    super(message);
  }

}

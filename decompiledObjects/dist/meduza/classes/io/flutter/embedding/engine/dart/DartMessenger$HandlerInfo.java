package io.flutter.embedding.engine.dart;

import io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler;

class DartMessenger$HandlerInfo
{
  public final BinaryMessenger.BinaryMessageHandler handler;
  public final DartMessenger.DartMessengerTaskQueue taskQueue;
  
  public DartMessenger$HandlerInfo(BinaryMessenger.BinaryMessageHandler paramBinaryMessageHandler, DartMessenger.DartMessengerTaskQueue paramDartMessengerTaskQueue)
  {
    handler = paramBinaryMessageHandler;
    taskQueue = paramDartMessengerTaskQueue;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.dart.DartMessenger.HandlerInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
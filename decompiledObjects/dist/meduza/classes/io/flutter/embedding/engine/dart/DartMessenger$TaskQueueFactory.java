package io.flutter.embedding.engine.dart;

import io.flutter.plugin.common.BinaryMessenger.TaskQueueOptions;

abstract interface DartMessenger$TaskQueueFactory
{
  public abstract DartMessenger.DartMessengerTaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions paramTaskQueueOptions);
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.dart.DartMessenger.TaskQueueFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
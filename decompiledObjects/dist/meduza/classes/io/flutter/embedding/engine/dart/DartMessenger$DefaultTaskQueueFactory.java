package io.flutter.embedding.engine.dart;

import io.flutter.FlutterInjector;
import io.flutter.plugin.common.BinaryMessenger.TaskQueueOptions;
import java.util.concurrent.ExecutorService;

class DartMessenger$DefaultTaskQueueFactory
  implements DartMessenger.TaskQueueFactory
{
  public ExecutorService executorService = FlutterInjector.instance().executorService();
  
  public DartMessenger.DartMessengerTaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions paramTaskQueueOptions)
  {
    if (paramTaskQueueOptions.getIsSerial()) {
      return new DartMessenger.SerialTaskQueue(executorService);
    }
    return new DartMessenger.ConcurrentTaskQueue(executorService);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.dart.DartMessenger.DefaultTaskQueueFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
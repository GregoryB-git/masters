package io.flutter.embedding.engine.dart;

import android.os.Handler;
import android.os.Looper;
import io.flutter.util.HandlerCompat;

public class PlatformTaskQueue
  implements DartMessenger.DartMessengerTaskQueue
{
  private final Handler handler = HandlerCompat.createAsyncHandler(Looper.getMainLooper());
  
  public void dispatch(Runnable paramRunnable)
  {
    handler.post(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.dart.PlatformTaskQueue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
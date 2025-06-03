package io.flutter.plugins.firebase.messaging;

import io.flutter.plugin.common.MethodChannel.Result;
import java.util.concurrent.CountDownLatch;

class FlutterFirebaseMessagingBackgroundExecutor$1
  implements MethodChannel.Result
{
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    val$latch.countDown();
  }
  
  public void notImplemented()
  {
    val$latch.countDown();
  }
  
  public void success(Object paramObject)
  {
    val$latch.countDown();
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundExecutor.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package io.flutter.plugins.firebase.core;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;

class GeneratedAndroidFirebaseCore$FirebaseAppHostApi$2
  implements GeneratedAndroidFirebaseCore.Result<Void>
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = GeneratedAndroidFirebaseCore.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success(Void paramVoid)
  {
    val$wrapped.add(0, null);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
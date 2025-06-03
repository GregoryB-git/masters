package io.flutter.plugins.firebase.core;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;

class GeneratedAndroidFirebaseCore$FirebaseCoreHostApi$3
  implements GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonFirebaseOptions>
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = GeneratedAndroidFirebaseCore.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success(GeneratedAndroidFirebaseCore.PigeonFirebaseOptions paramPigeonFirebaseOptions)
  {
    val$wrapped.add(0, paramPigeonFirebaseOptions);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
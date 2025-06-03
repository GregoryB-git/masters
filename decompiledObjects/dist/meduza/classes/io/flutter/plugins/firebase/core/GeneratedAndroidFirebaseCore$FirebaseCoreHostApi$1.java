package io.flutter.plugins.firebase.core;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;

class GeneratedAndroidFirebaseCore$FirebaseCoreHostApi$1
  implements GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonInitializeResponse>
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = GeneratedAndroidFirebaseCore.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success(GeneratedAndroidFirebaseCore.PigeonInitializeResponse paramPigeonInitializeResponse)
  {
    val$wrapped.add(0, paramPigeonInitializeResponse);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
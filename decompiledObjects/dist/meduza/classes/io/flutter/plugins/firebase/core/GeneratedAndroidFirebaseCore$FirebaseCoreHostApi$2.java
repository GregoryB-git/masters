package io.flutter.plugins.firebase.core;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;
import java.util.List;

class GeneratedAndroidFirebaseCore$FirebaseCoreHostApi$2
  implements GeneratedAndroidFirebaseCore.Result<List<GeneratedAndroidFirebaseCore.PigeonInitializeResponse>>
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = GeneratedAndroidFirebaseCore.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success(List<GeneratedAndroidFirebaseCore.PigeonInitializeResponse> paramList)
  {
    val$wrapped.add(0, paramList);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
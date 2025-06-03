package io.flutter.plugins.firebase.auth;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;

class GeneratedAndroidFirebaseAuth$MultiFactorUserHostApi$3
  implements GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession>
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = GeneratedAndroidFirebaseAuth.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success(GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession paramPigeonMultiFactorSession)
  {
    val$wrapped.add(0, paramPigeonMultiFactorSession);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
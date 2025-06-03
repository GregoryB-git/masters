package io.flutter.plugins.firebase.auth;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;
import java.util.List;

class GeneratedAndroidFirebaseAuth$MultiFactorUserHostApi$5
  implements GeneratedAndroidFirebaseAuth.Result<List<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo>>
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = GeneratedAndroidFirebaseAuth.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success(List<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo> paramList)
  {
    val$wrapped.add(0, paramList);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
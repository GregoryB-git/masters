package io.flutter.plugins.firebase.auth;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;
import java.util.List;

class GeneratedAndroidFirebaseAuth$FirebaseAuthHostApi$15
  implements GeneratedAndroidFirebaseAuth.Result<List<String>>
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = GeneratedAndroidFirebaseAuth.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success(List<String> paramList)
  {
    val$wrapped.add(0, paramList);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.15
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
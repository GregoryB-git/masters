package io.flutter.plugins.firebase.auth;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;

class GeneratedAndroidFirebaseAuth$FirebaseAuthHostApi$18
  implements GeneratedAndroidFirebaseAuth.Result<String>
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = GeneratedAndroidFirebaseAuth.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success(String paramString)
  {
    val$wrapped.add(0, paramString);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.18
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
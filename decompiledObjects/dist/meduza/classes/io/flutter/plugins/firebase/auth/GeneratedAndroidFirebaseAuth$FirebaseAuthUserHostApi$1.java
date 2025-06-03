package io.flutter.plugins.firebase.auth;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;

class GeneratedAndroidFirebaseAuth$FirebaseAuthUserHostApi$1
  implements GeneratedAndroidFirebaseAuth.VoidResult
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = GeneratedAndroidFirebaseAuth.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success()
  {
    val$wrapped.add(0, null);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
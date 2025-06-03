package io.flutter.plugins.firebase.auth;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;

class GeneratedAndroidFirebaseAuth$FirebaseAuthUserHostApi$2
  implements GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonIdTokenResult>
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = GeneratedAndroidFirebaseAuth.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success(GeneratedAndroidFirebaseAuth.PigeonIdTokenResult paramPigeonIdTokenResult)
  {
    val$wrapped.add(0, paramPigeonIdTokenResult);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
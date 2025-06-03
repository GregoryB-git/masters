package io.flutter.plugins.firebase.firestore;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;

class GeneratedAndroidFirebaseFirestore$FirebaseFirestoreHostApi$22
  implements GeneratedAndroidFirebaseFirestore.Result<String>
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = GeneratedAndroidFirebaseFirestore.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success(String paramString)
  {
    val$wrapped.add(0, paramString);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.22
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
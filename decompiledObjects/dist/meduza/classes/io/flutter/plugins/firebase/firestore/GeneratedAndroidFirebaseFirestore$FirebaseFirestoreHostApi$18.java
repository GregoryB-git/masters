package io.flutter.plugins.firebase.firestore;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;

class GeneratedAndroidFirebaseFirestore$FirebaseFirestoreHostApi$18
  implements GeneratedAndroidFirebaseFirestore.Result<GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot>
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = GeneratedAndroidFirebaseFirestore.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success(GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot paramPigeonQuerySnapshot)
  {
    val$wrapped.add(0, paramPigeonQuerySnapshot);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.18
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
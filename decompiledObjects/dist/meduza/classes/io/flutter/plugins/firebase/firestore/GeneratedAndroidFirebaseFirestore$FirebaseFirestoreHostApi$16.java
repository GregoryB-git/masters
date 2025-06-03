package io.flutter.plugins.firebase.firestore;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;

class GeneratedAndroidFirebaseFirestore$FirebaseFirestoreHostApi$16
  implements GeneratedAndroidFirebaseFirestore.Result<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot>
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = GeneratedAndroidFirebaseFirestore.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success(GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot paramPigeonDocumentSnapshot)
  {
    val$wrapped.add(0, paramPigeonDocumentSnapshot);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.16
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
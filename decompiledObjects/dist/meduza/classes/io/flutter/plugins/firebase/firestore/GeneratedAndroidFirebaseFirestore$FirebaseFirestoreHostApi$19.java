package io.flutter.plugins.firebase.firestore;

import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.ArrayList;
import java.util.List;

class GeneratedAndroidFirebaseFirestore$FirebaseFirestoreHostApi$19
  implements GeneratedAndroidFirebaseFirestore.Result<List<GeneratedAndroidFirebaseFirestore.AggregateQueryResponse>>
{
  public void error(Throwable paramThrowable)
  {
    paramThrowable = GeneratedAndroidFirebaseFirestore.wrapError(paramThrowable);
    val$reply.reply(paramThrowable);
  }
  
  public void success(List<GeneratedAndroidFirebaseFirestore.AggregateQueryResponse> paramList)
  {
    val$wrapped.add(0, paramList);
    val$reply.reply(val$wrapped);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.19
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
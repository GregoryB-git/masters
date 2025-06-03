package io.flutter.plugins.firebase.messaging;

import O5.C;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.T;

public class FlutterFirebaseMessagingService
  extends FirebaseMessagingService
{
  public void onMessageReceived(T paramT) {}
  
  public void onNewToken(String paramString)
  {
    C.k().l(paramString);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
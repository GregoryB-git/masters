package io.flutter.plugins.firebase.messaging;

import aa.z;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FlutterFirebaseMessagingService
  extends FirebaseMessagingService
{
  public void onMessageReceived(z paramz) {}
  
  public void onNewToken(String paramString)
  {
    FlutterFirebaseTokenLiveData.getInstance().postToken(paramString);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
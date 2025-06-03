package io.flutter.plugins.firebase.messaging;

import aa.z;
import b1.t;

public class FlutterFirebaseRemoteMessageLiveData
  extends t<z>
{
  private static FlutterFirebaseRemoteMessageLiveData instance;
  
  public static FlutterFirebaseRemoteMessageLiveData getInstance()
  {
    if (instance == null) {
      instance = new FlutterFirebaseRemoteMessageLiveData();
    }
    return instance;
  }
  
  public void postRemoteMessage(z paramz)
  {
    postValue(paramz);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebaseRemoteMessageLiveData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
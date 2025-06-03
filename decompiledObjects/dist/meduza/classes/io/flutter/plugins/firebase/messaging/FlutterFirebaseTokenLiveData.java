package io.flutter.plugins.firebase.messaging;

import b1.t;

public class FlutterFirebaseTokenLiveData
  extends t<String>
{
  private static FlutterFirebaseTokenLiveData instance;
  
  public static FlutterFirebaseTokenLiveData getInstance()
  {
    if (instance == null) {
      instance = new FlutterFirebaseTokenLiveData();
    }
    return instance;
  }
  
  public void postToken(String paramString)
  {
    postValue(paramString);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebaseTokenLiveData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
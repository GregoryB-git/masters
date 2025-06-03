package io.flutter.plugins.firebase.messaging;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessaging.a;
import java.util.AbstractMap;
import java.util.HashMap;
import u7.f;

class FlutterFirebaseMessagingPlugin$2
  extends HashMap<String, Object>
{
  public FlutterFirebaseMessagingPlugin$2(FlutterFirebaseMessagingPlugin arg1, FirebaseMessaging paramFirebaseMessaging)
  {
    synchronized (f)
    {
      ???.a();
      paramFirebaseMessaging = d;
      boolean bool;
      if (paramFirebaseMessaging != null) {
        bool = paramFirebaseMessaging.booleanValue();
      } else {
        bool = e.a.k();
      }
      put("isAutoInitEnabled", Boolean.valueOf(bool));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
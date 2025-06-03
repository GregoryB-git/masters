package io.flutter.plugins.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth.a;
import io.flutter.plugin.common.EventChannel.EventSink;
import io.flutter.plugin.common.EventChannel.StreamHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class AuthStateChannelStreamHandler
  implements EventChannel.StreamHandler
{
  private FirebaseAuth.a authStateListener;
  private final FirebaseAuth firebaseAuth;
  
  public AuthStateChannelStreamHandler(FirebaseAuth paramFirebaseAuth)
  {
    firebaseAuth = paramFirebaseAuth;
  }
  
  private static void lambda$onListen$0(AtomicBoolean paramAtomicBoolean, Map paramMap, EventChannel.EventSink paramEventSink, FirebaseAuth paramFirebaseAuth)
  {
    if (paramAtomicBoolean.get())
    {
      paramAtomicBoolean.set(false);
      return;
    }
    paramAtomicBoolean = f;
    if (paramAtomicBoolean == null) {
      paramAtomicBoolean = null;
    } else {
      paramAtomicBoolean = PigeonParser.manuallyToList(PigeonParser.parseFirebaseUser(paramAtomicBoolean));
    }
    paramMap.put("user", paramAtomicBoolean);
    paramEventSink.success(paramMap);
  }
  
  public void onCancel(Object paramObject)
  {
    paramObject = authStateListener;
    if (paramObject != null)
    {
      firebaseAuth.d.remove(paramObject);
      authStateListener = null;
    }
  }
  
  public void onListen(Object paramObject, EventChannel.EventSink paramEventSink)
  {
    paramObject = new HashMap();
    u7.f localf = firebaseAuth.a;
    localf.a();
    ((HashMap)paramObject).put("appName", b);
    paramObject = new a(new AtomicBoolean(true), (HashMap)paramObject, paramEventSink);
    authStateListener = ((FirebaseAuth.a)paramObject);
    paramEventSink = firebaseAuth;
    d.add(paramObject);
    A.execute(new com.google.firebase.auth.f(paramEventSink, (a)paramObject));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.AuthStateChannelStreamHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package io.flutter.plugins.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth.b;
import com.google.firebase.auth.c;
import io.flutter.plugin.common.EventChannel.EventSink;
import io.flutter.plugin.common.EventChannel.StreamHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import u7.f;

public class IdTokenChannelStreamHandler
  implements EventChannel.StreamHandler
{
  private final FirebaseAuth firebaseAuth;
  private FirebaseAuth.b idTokenListener;
  
  public IdTokenChannelStreamHandler(FirebaseAuth paramFirebaseAuth)
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
    paramObject = idTokenListener;
    if (paramObject != null)
    {
      firebaseAuth.b.remove(paramObject);
      idTokenListener = null;
    }
  }
  
  public void onListen(Object paramObject, EventChannel.EventSink paramEventSink)
  {
    HashMap localHashMap = new HashMap();
    paramObject = firebaseAuth.a;
    ((f)paramObject).a();
    localHashMap.put("appName", b);
    paramEventSink = new a0(new AtomicBoolean(true), localHashMap, paramEventSink);
    idTokenListener = paramEventSink;
    paramObject = firebaseAuth;
    b.add(paramEventSink);
    A.execute(new c((FirebaseAuth)paramObject, paramEventSink));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.IdTokenChannelStreamHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package io.flutter.plugins.firebase.firestore.streamhandler;

import com.google.firebase.firestore.FirebaseFirestore;
import d9.c0;
import d9.c0.a;
import d9.x;
import e;
import f9.f;
import g9.u;
import io.flutter.plugin.common.EventChannel.EventSink;
import io.flutter.plugin.common.EventChannel.StreamHandler;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Objects;
import v3.x0;

public class LoadBundleStreamHandler
  implements EventChannel.StreamHandler
{
  private final byte[] bundle;
  private EventChannel.EventSink eventSink;
  private final FirebaseFirestore firestore;
  
  public LoadBundleStreamHandler(FirebaseFirestore paramFirebaseFirestore, byte[] paramArrayOfByte)
  {
    firestore = paramFirebaseFirestore;
    bundle = paramArrayOfByte;
  }
  
  public void onCancel(Object paramObject)
  {
    eventSink.endOfStream();
  }
  
  public void onListen(Object paramObject, EventChannel.EventSink paramEventSink)
  {
    eventSink = paramEventSink;
    ??? = firestore;
    paramObject = bundle;
    ???.getClass();
    Object localObject2 = new ByteArrayInputStream((byte[])paramObject);
    paramObject = new c0();
    synchronized (k)
    {
      ((x)???).b();
      Object localObject3 = b;
      ((u)localObject3).d();
      f localf = new f9/f;
      localf.<init>(e, (InputStream)localObject2);
      n9.a locala = d;
      localObject2 = new v3/x0;
      ((x0)localObject2).<init>(localObject3, localf, paramObject, 4);
      locala.a((Runnable)localObject2);
      Objects.requireNonNull(paramEventSink);
      localObject3 = new c0.a(new e(paramEventSink, 15));
      synchronized (a)
      {
        e.add(localObject3);
        ((c0)paramObject).addOnFailureListener(new k1.a(13, this, paramEventSink));
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.streamhandler.LoadBundleStreamHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
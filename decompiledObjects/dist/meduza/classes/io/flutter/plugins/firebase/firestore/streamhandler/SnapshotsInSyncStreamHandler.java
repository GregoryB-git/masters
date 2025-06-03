package io.flutter.plugins.firebase.firestore.streamhandler;

import com.google.firebase.firestore.FirebaseFirestore;
import d9.b0;
import d9.w;
import d9.x;
import g9.d;
import io.flutter.plugin.common.EventChannel.EventSink;
import io.flutter.plugin.common.EventChannel.StreamHandler;
import n9.f;
import x0.q0;

public class SnapshotsInSyncStreamHandler
  implements EventChannel.StreamHandler
{
  public FirebaseFirestore firestore;
  public b0 listenerRegistration;
  
  public SnapshotsInSyncStreamHandler(FirebaseFirestore paramFirebaseFirestore)
  {
    firestore = paramFirebaseFirestore;
  }
  
  public void onCancel(Object paramObject)
  {
    paramObject = listenerRegistration;
    if (paramObject != null)
    {
      ((b0)paramObject).remove();
      listenerRegistration = null;
    }
  }
  
  public void onListen(Object arg1, EventChannel.EventSink paramEventSink)
  {
    paramEventSink = new u.a(paramEventSink, 19);
    ??? = firestore;
    ???.getClass();
    paramEventSink = new d(f.a, new d9.u(paramEventSink));
    synchronized (k)
    {
      ((x)???).b();
      g9.u localu = b;
      localu.d();
      n9.a locala = d;
      q0 localq0 = new x0/q0;
      localq0.<init>(12, localu, paramEventSink);
      locala.a(localq0);
      paramEventSink = new w(paramEventSink, localu);
      listenerRegistration = paramEventSink;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.streamhandler.SnapshotsInSyncStreamHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
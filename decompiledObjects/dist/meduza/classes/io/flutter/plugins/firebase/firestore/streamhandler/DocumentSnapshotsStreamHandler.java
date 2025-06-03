package io.flutter.plugins.firebase.firestore.streamhandler;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.c;
import com.google.firebase.firestore.d.a;
import d9.a0;
import d9.b0;
import d9.j0;
import g9.k.a;
import io.flutter.plugin.common.EventChannel.EventSink;
import io.flutter.plugin.common.EventChannel.StreamHandler;
import java.util.concurrent.Executor;
import n9.f;

public class DocumentSnapshotsStreamHandler
  implements EventChannel.StreamHandler
{
  public c documentReference;
  public FirebaseFirestore firestore;
  public b0 listenerRegistration;
  public j0 metadataChanges;
  public d.a serverTimestampBehavior;
  public a0 source;
  
  public DocumentSnapshotsStreamHandler(FirebaseFirestore paramFirebaseFirestore, c paramc, Boolean paramBoolean, d.a parama, a0 parama0)
  {
    firestore = paramFirebaseFirestore;
    documentReference = paramc;
    if (paramBoolean.booleanValue()) {
      paramFirebaseFirestore = j0.b;
    } else {
      paramFirebaseFirestore = j0.a;
    }
    metadataChanges = paramFirebaseFirestore;
    serverTimestampBehavior = parama;
    source = parama0;
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
  
  public void onListen(Object paramObject, EventChannel.EventSink paramEventSink)
  {
    Executor localExecutor = f.a;
    paramObject = metadataChanges;
    if (paramObject != null)
    {
      a0 locala0 = source;
      if (locala0 != null)
      {
        c localc = documentReference;
        a locala = new a(this, paramEventSink);
        localc.getClass();
        k.a locala1 = new k.a();
        paramEventSink = j0.b;
        boolean bool1 = true;
        boolean bool2;
        if (paramObject == paramEventSink) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        a = bool2;
        if (paramObject == paramEventSink) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
        b = bool2;
        c = false;
        d = locala0;
        listenerRegistration = localc.a(localExecutor, locala1, locala);
        return;
      }
      throw new NullPointerException("listen source must not be null.");
    }
    throw new NullPointerException("metadataChanges must not be null.");
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.streamhandler.DocumentSnapshotsStreamHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
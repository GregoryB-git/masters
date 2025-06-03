package io.flutter.plugins.firebase.firestore.streamhandler;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.d.a;
import com.google.firebase.firestore.i;
import com.google.firebase.firestore.k;
import d9.a0;
import d9.b0;
import d9.e;
import d9.j0;
import d9.o0;
import d9.p0;
import g9.k.a;
import io.flutter.plugin.common.EventChannel.EventSink;
import io.flutter.plugin.common.EventChannel.StreamHandler;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonDocumentChange;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata;
import io.flutter.plugins.firebase.firestore.utils.ExceptionConverter;
import io.flutter.plugins.firebase.firestore.utils.PigeonParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public class QuerySnapshotsStreamHandler
  implements EventChannel.StreamHandler
{
  public b0 listenerRegistration;
  public j0 metadataChanges;
  public i query;
  public d.a serverTimestampBehavior;
  public a0 source;
  
  public QuerySnapshotsStreamHandler(i parami, Boolean paramBoolean, d.a parama, a0 parama0)
  {
    query = parami;
    if (paramBoolean.booleanValue()) {
      parami = j0.b;
    } else {
      parami = j0.a;
    }
    metadataChanges = parami;
    serverTimestampBehavior = parama;
    source = parama0;
  }
  
  private void lambda$onListen$0(EventChannel.EventSink paramEventSink, k paramk, com.google.firebase.firestore.f paramf)
  {
    if (paramf != null)
    {
      paramk = ExceptionConverter.createDetails(paramf);
      paramEventSink.error("firebase_firestore", paramf.getMessage(), paramk);
      paramEventSink.endOfStream();
      onCancel(null);
    }
    else
    {
      paramf = new ArrayList(3);
      ArrayList localArrayList1 = new ArrayList(paramk.h().size());
      ArrayList localArrayList2 = new ArrayList(paramk.a().size());
      Iterator localIterator = paramk.h().iterator();
      while (localIterator.hasNext()) {
        localArrayList1.add(PigeonParser.toPigeonDocumentSnapshot((com.google.firebase.firestore.d)localIterator.next(), serverTimestampBehavior).toList());
      }
      localIterator = paramk.a().iterator();
      while (localIterator.hasNext()) {
        localArrayList2.add(PigeonParser.toPigeonDocumentChange((e)localIterator.next(), serverTimestampBehavior).toList());
      }
      paramf.add(localArrayList1);
      paramf.add(localArrayList2);
      paramf.add(PigeonParser.toPigeonSnapshotMetadata(f).toList());
      paramEventSink.success(paramf);
    }
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
    Executor localExecutor = n9.f.a;
    j0 localj01 = metadataChanges;
    if (localj01 != null)
    {
      Object localObject = source;
      if (localObject != null)
      {
        paramObject = query;
        boolean bool1 = true;
        o0 localo0 = new o0(1, this, paramEventSink);
        paramObject.getClass();
        paramEventSink = new k.a();
        j0 localj02 = j0.b;
        boolean bool2;
        if (localj01 == localj02) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        a = bool2;
        if (localj01 == localj02) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
        b = bool2;
        c = false;
        d = ((a0)localObject);
        ((i)paramObject).j();
        localObject = new g9.d(localExecutor, new o0(0, paramObject, localo0));
        listenerRegistration = ((b0)b.a(new p0((i)paramObject, paramEventSink, (g9.d)localObject)));
        return;
      }
      throw new NullPointerException("listen source must not be null.");
    }
    throw new NullPointerException("metadataChanges must not be null.");
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.streamhandler.QuerySnapshotsStreamHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
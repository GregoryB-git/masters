package io.flutter.plugins.firebase.firestore.streamhandler;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.f.a;
import com.google.firebase.firestore.l;
import d9.t0;
import d9.x;
import d9.x0;
import d9.y0;
import g.q;
import g9.m0;
import g9.u;
import io.flutter.plugin.common.EventChannel.EventSink;
import io.flutter.plugin.common.EventChannel.StreamHandler;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestoreTransactionResult;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonDocumentOption;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonTransactionResult;
import io.flutter.plugins.firebase.firestore.utils.ExceptionConverter;
import io.flutter.plugins.firebase.firestore.utils.PigeonParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l3.j;
import n9.a.b;
import q3.h;
import x0.g;

public class TransactionStreamHandler
  implements OnTransactionResultListener, EventChannel.StreamHandler
{
  private List<GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand> commands;
  public final FirebaseFirestore firestore;
  public final Handler mainLooper = new Handler(Looper.getMainLooper());
  public final Long maxAttempts;
  public final OnTransactionStartedListener onTransactionStartedListener;
  private GeneratedAndroidFirebaseFirestore.PigeonTransactionResult resultType;
  public final Semaphore semaphore = new Semaphore(0);
  public final Long timeout;
  public final String transactionId;
  
  public TransactionStreamHandler(OnTransactionStartedListener paramOnTransactionStartedListener, FirebaseFirestore paramFirebaseFirestore, String paramString, Long paramLong1, Long paramLong2)
  {
    onTransactionStartedListener = paramOnTransactionStartedListener;
    firestore = paramFirebaseFirestore;
    transactionId = paramString;
    timeout = paramLong1;
    maxAttempts = paramLong2;
  }
  
  private FlutterFirebaseFirestoreTransactionResult lambda$onListen$1(EventChannel.EventSink paramEventSink, l paraml)
  {
    onTransactionStartedListener.onStarted(paraml);
    Object localObject1 = new HashMap();
    Object localObject2 = firestore.g;
    ((u7.f)localObject2).a();
    ((HashMap)localObject1).put("appName", b);
    mainLooper.post(new b(0, paramEventSink, localObject1));
    try
    {
      if (!semaphore.tryAcquire(timeout.longValue(), TimeUnit.MILLISECONDS))
      {
        paramEventSink = new com/google/firebase/firestore/f;
        paramEventSink.<init>("timed out", f.a.f);
        paramEventSink = FlutterFirebaseFirestoreTransactionResult.failed(paramEventSink);
        return paramEventSink;
      }
      if (commands.isEmpty()) {
        return FlutterFirebaseFirestoreTransactionResult.complete();
      }
      if (resultType == GeneratedAndroidFirebaseFirestore.PigeonTransactionResult.FAILURE) {
        return FlutterFirebaseFirestoreTransactionResult.complete();
      }
      localObject1 = commands.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject3 = (GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand)((Iterator)localObject1).next();
        localObject2 = firestore.d(((GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand)localObject3).getPath());
        int i = 1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PigeonTransactionType[localObject3.getType().ordinal()];
        if (i != 1)
        {
          if (i != 2)
          {
            if (i == 3)
            {
              GeneratedAndroidFirebaseFirestore.PigeonDocumentOption localPigeonDocumentOption = ((GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand)localObject3).getOption();
              Objects.requireNonNull(localPigeonDocumentOption);
              paramEventSink = null;
              if ((localPigeonDocumentOption.getMerge() != null) && (localPigeonDocumentOption.getMerge().booleanValue()))
              {
                paramEventSink = t0.d;
              }
              else if (localPigeonDocumentOption.getMergeFields() != null)
              {
                paramEventSink = localPigeonDocumentOption.getMergeFields();
                Objects.requireNonNull(paramEventSink);
                paramEventSink = t0.a(PigeonParser.parseFieldPath(paramEventSink));
              }
              localObject3 = ((GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand)localObject3).getData();
              Objects.requireNonNull(localObject3);
              if (paramEventSink == null)
              {
                paraml.getClass();
                paraml.c((com.google.firebase.firestore.c)localObject2, (Map)localObject3, t0.c);
              }
              else
              {
                paraml.c((com.google.firebase.firestore.c)localObject2, (Map)localObject3, paramEventSink);
              }
            }
          }
          else
          {
            paramEventSink = ((GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand)localObject3).getData();
            Objects.requireNonNull(paramEventSink);
            localObject3 = b.h.h(paramEventSink);
            b.j((com.google.firebase.firestore.c)localObject2);
            paramEventSink = a;
            localObject2 = a;
            paramEventSink.getClass();
            try
            {
              localObject3 = Collections.singletonList(((j)localObject3).a((j9.i)localObject2, paramEventSink.b((j9.i)localObject2)));
              x6.b.Z("A transaction object cannot be used after its update callback has been invoked.", true ^ d, new Object[0]);
              c.addAll((Collection)localObject3);
            }
            catch (com.google.firebase.firestore.f localf)
            {
              e = localf;
            }
            f.add(localObject2);
          }
        }
        else
        {
          b.j((com.google.firebase.firestore.c)localObject2);
          paramEventSink = a;
          j9.i locali = a;
          localObject2 = Collections.singletonList(new k9.c(locali, paramEventSink.a(locali)));
          x6.b.Z("A transaction object cannot be used after its update callback has been invoked.", true ^ d, new Object[0]);
          c.addAll((Collection)localObject2);
          f.add(locali);
        }
      }
      return FlutterFirebaseFirestoreTransactionResult.complete();
    }
    catch (InterruptedException paramEventSink) {}
    return FlutterFirebaseFirestoreTransactionResult.failed(new com.google.firebase.firestore.f("interrupted", f.a.f));
  }
  
  private void lambda$onListen$3(EventChannel.EventSink paramEventSink, Task paramTask)
  {
    HashMap localHashMap = new HashMap();
    Object localObject;
    if ((paramTask.getException() == null) && (getResultexception == null))
    {
      if (paramTask.getResult() == null) {
        break label120;
      }
      paramTask = Boolean.TRUE;
      localObject = "complete";
    }
    else
    {
      if (paramTask.getException() != null) {
        paramTask = paramTask.getException();
      } else {
        paramTask = getResultexception;
      }
      localObject = firestore.g;
      ((u7.f)localObject).a();
      localHashMap.put("appName", b);
      paramTask = ExceptionConverter.createDetails(paramTask);
      localObject = "error";
    }
    localHashMap.put(localObject, paramTask);
    label120:
    mainLooper.post(new q(28, paramEventSink, localHashMap));
  }
  
  public void onCancel(Object paramObject)
  {
    semaphore.release();
  }
  
  public void onListen(Object arg1, EventChannel.EventSink paramEventSink)
  {
    ??? = firestore;
    int i = maxAttempts.intValue();
    if (i >= 1)
    {
      Object localObject1 = new x0(i);
      Object localObject2 = new h(11, this, paramEventSink);
      ???.getClass();
      Object localObject3 = m0.g;
      k.b();
      Object localObject4 = new d9.t((FirebaseFirestore)???, (ThreadPoolExecutor)localObject3, (h)localObject2);
      synchronized (k)
      {
        ((x)???).b();
        u localu = b;
        localu.d();
        localObject3 = d.a;
        localObject2 = new g9/t;
        ((g9.t)localObject2).<init>((x0)localObject1, localu, (n9.i)localObject4);
        localObject4 = new com/google/android/gms/tasks/TaskCompletionSource;
        ((TaskCompletionSource)localObject4).<init>();
        localObject1 = new x0/g;
        ((g)localObject1).<init>(localObject2, localObject3, localObject4, 9);
        ((a.b)localObject3).execute((Runnable)localObject1);
        localObject1 = ((TaskCompletionSource)localObject4).getTask();
        ((Task)localObject1).addOnCompleteListener(new k1.a(1, this, paramEventSink));
        return;
      }
    }
    throw new IllegalArgumentException("Max attempts must be at least 1");
  }
  
  public void receiveTransactionResponse(GeneratedAndroidFirebaseFirestore.PigeonTransactionResult paramPigeonTransactionResult, List<GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand> paramList)
  {
    resultType = paramPigeonTransactionResult;
    commands = paramList;
    semaphore.release();
  }
  
  public static abstract interface OnTransactionStartedListener
  {
    public abstract void onStarted(l paraml);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.streamhandler.TransactionStreamHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
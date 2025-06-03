package io.flutter.plugins.firebase.firestore;

import aa.m0;
import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.a.a;
import com.google.firebase.firestore.a.b;
import com.google.firebase.firestore.a.c;
import com.google.firebase.firestore.d.a;
import com.google.firebase.firestore.g.a;
import com.google.firebase.firestore.k;
import com.google.firebase.firestore.l;
import d9.a1;
import d9.f0;
import d9.g0;
import d9.k0;
import d9.l0;
import d9.p;
import d9.q;
import d9.r0;
import d9.t0;
import d9.x;
import d9.y0;
import g9.u;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.EventChannel.StreamHandler;
import io.flutter.plugin.common.StandardMethodCodec;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.firestore.streamhandler.DocumentSnapshotsStreamHandler;
import io.flutter.plugins.firebase.firestore.streamhandler.LoadBundleStreamHandler;
import io.flutter.plugins.firebase.firestore.streamhandler.OnTransactionResultListener;
import io.flutter.plugins.firebase.firestore.streamhandler.QuerySnapshotsStreamHandler;
import io.flutter.plugins.firebase.firestore.streamhandler.SnapshotsInSyncStreamHandler;
import io.flutter.plugins.firebase.firestore.streamhandler.TransactionStreamHandler;
import io.flutter.plugins.firebase.firestore.utils.ExceptionConverter;
import io.flutter.plugins.firebase.firestore.utils.PigeonParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k9.m;
import l3.j;
import n9.o;
import q3.h;
import v3.x0;
import x0.q0;

public class FlutterFirebaseFirestorePlugin
  implements FlutterFirebasePlugin, FlutterPlugin, ActivityAware, GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
{
  public static final String DEFAULT_ERROR_CODE = "firebase_firestore";
  private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_firestore";
  public static final String TAG = "FlutterFirestorePlugin";
  public static final HashMap<FirebaseFirestore, FlutterFirebaseFirestoreExtension> firestoreInstanceCache = new HashMap();
  public static final Map<Integer, d.a> serverTimestampBehaviorHashMap = new HashMap();
  public final StandardMethodCodec MESSAGE_CODEC = new StandardMethodCodec(FlutterFirebaseFirestoreMessageCodec.INSTANCE);
  private final AtomicReference<Activity> activity = new AtomicReference(null);
  private BinaryMessenger binaryMessenger;
  private final Map<String, EventChannel> eventChannels = new HashMap();
  private final Map<String, EventChannel.StreamHandler> streamHandlers = new HashMap();
  private final Map<String, OnTransactionResultListener> transactionHandlers = new HashMap();
  private final Map<String, l> transactions = new HashMap();
  
  private void attachToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    activity.set(paramActivityPluginBinding.getActivity());
  }
  
  private static void destroyCachedFirebaseFirestoreInstanceForKey(FirebaseFirestore paramFirebaseFirestore)
  {
    synchronized (firestoreInstanceCache)
    {
      if ((FlutterFirebaseFirestoreExtension)???.get(paramFirebaseFirestore) != null) {
        ???.remove(paramFirebaseFirestore);
      }
      return;
    }
  }
  
  private void detachToActivity()
  {
    activity.set(null);
  }
  
  public static FlutterFirebaseFirestoreExtension getCachedFirebaseFirestoreInstanceForKey(FirebaseFirestore paramFirebaseFirestore)
  {
    synchronized (firestoreInstanceCache)
    {
      paramFirebaseFirestore = (FlutterFirebaseFirestoreExtension)???.get(paramFirebaseFirestore);
      return paramFirebaseFirestore;
    }
  }
  
  public static FirebaseFirestore getFirestoreFromPigeon(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp)
  {
    synchronized (firestoreInstanceCache)
    {
      FirebaseFirestore localFirebaseFirestore = getFirestoreInstanceByNameAndDatabaseUrl(paramFirestorePigeonFirebaseApp.getAppName(), paramFirestorePigeonFirebaseApp.getDatabaseURL());
      if (localFirebaseFirestore != null) {
        return localFirebaseFirestore;
      }
      localFirebaseFirestore = FirebaseFirestore.e(u7.f.f(paramFirestorePigeonFirebaseApp.getAppName()), paramFirestorePigeonFirebaseApp.getDatabaseURL());
      localFirebaseFirestore.g(getSettingsFromPigeon(paramFirestorePigeonFirebaseApp));
      setCachedFirebaseFirestoreInstanceForKey(localFirebaseFirestore, paramFirestorePigeonFirebaseApp.getDatabaseURL());
      return localFirebaseFirestore;
    }
  }
  
  public static FirebaseFirestore getFirestoreInstanceByNameAndDatabaseUrl(String paramString1, String paramString2)
  {
    synchronized (firestoreInstanceCache)
    {
      Iterator localIterator = ???.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        u7.f localf = getValuegetInstanceg;
        localf.a();
        if ((b.equals(paramString1)) && (((FlutterFirebaseFirestoreExtension)localEntry.getValue()).getDatabaseURL().equals(paramString2)))
        {
          paramString1 = (FirebaseFirestore)localEntry.getKey();
          return paramString1;
        }
      }
      return null;
    }
  }
  
  public static com.google.firebase.firestore.g getSettingsFromPigeon(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp)
  {
    g.a locala = new g.a();
    if (paramFirestorePigeonFirebaseApp.getSettings().getHost() != null)
    {
      String str = paramFirestorePigeonFirebaseApp.getSettings().getHost();
      if (str != null) {
        a = str;
      } else {
        throw new NullPointerException("Provided host must not be null.");
      }
    }
    if (paramFirestorePigeonFirebaseApp.getSettings().getSslEnabled() != null) {
      b = paramFirestorePigeonFirebaseApp.getSettings().getSslEnabled().booleanValue();
    }
    if (paramFirestorePigeonFirebaseApp.getSettings().getPersistenceEnabled() != null)
    {
      if (paramFirestorePigeonFirebaseApp.getSettings().getPersistenceEnabled().booleanValue())
      {
        paramFirestorePigeonFirebaseApp = paramFirestorePigeonFirebaseApp.getSettings().getCacheSizeBytes();
        long l;
        if ((paramFirestorePigeonFirebaseApp != null) && (paramFirestorePigeonFirebaseApp.longValue() != -1L)) {
          l = paramFirestorePigeonFirebaseApp.longValue();
        } else {
          l = 104857600L;
        }
        paramFirestorePigeonFirebaseApp = new l0(l);
      }
      else
      {
        paramFirestorePigeonFirebaseApp = new f0(new g0());
      }
      locala.b(paramFirestorePigeonFirebaseApp);
    }
    return locala.a();
  }
  
  private void initInstance(BinaryMessenger paramBinaryMessenger)
  {
    binaryMessenger = paramBinaryMessenger;
    FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_firestore", this);
    GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi._CC.y(binaryMessenger, this);
  }
  
  private static void lambda$aggregateQuery$18(d9.a parama, GeneratedAndroidFirebaseFirestore.AggregateSource paramAggregateSource, List paramList, GeneratedAndroidFirebaseFirestore.Result paramResult)
  {
    try
    {
      com.google.firebase.firestore.b localb = (com.google.firebase.firestore.b)Tasks.await(parama.a(PigeonParser.parseAggregateSource(paramAggregateSource)));
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        GeneratedAndroidFirebaseFirestore.AggregateQuery localAggregateQuery = (GeneratedAndroidFirebaseFirestore.AggregateQuery)paramList.next();
        int i = 1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$AggregateType[localAggregateQuery.getType().ordinal()];
        if (i != 1)
        {
          String str;
          if (i != 2)
          {
            if (i == 3)
            {
              paramAggregateSource = new io/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$AggregateQueryResponse$Builder;
              paramAggregateSource.<init>();
              paramAggregateSource.setType(GeneratedAndroidFirebaseFirestore.AggregateType.AVERAGE);
              str = localAggregateQuery.getField();
              parama = new com/google/firebase/firestore/a$a;
              parama.<init>(d9.n.a(str));
              localb.getClass();
              parama = (Number)localb.c(parama, Number.class);
              if (parama != null) {
                parama = Double.valueOf(parama.doubleValue());
              } else {
                parama = null;
              }
              paramAggregateSource.setValue(parama);
              paramAggregateSource.setField(localAggregateQuery.getField());
              parama = paramAggregateSource;
            }
          }
          else {
            for (;;)
            {
              parama = parama.build();
              break;
              parama = new io/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$AggregateQueryResponse$Builder;
              parama.<init>();
              parama.setType(GeneratedAndroidFirebaseFirestore.AggregateType.SUM);
              str = localAggregateQuery.getField();
              paramAggregateSource = new com/google/firebase/firestore/a$c;
              paramAggregateSource.<init>(d9.n.a(str));
              paramAggregateSource = localb.b(paramAggregateSource);
              Objects.requireNonNull(paramAggregateSource);
              parama.setValue(Double.valueOf(((Number)paramAggregateSource).doubleValue()));
              parama.setField(localAggregateQuery.getField());
            }
          }
        }
        else
        {
          parama = new io/flutter/plugins/firebase/firestore/GeneratedAndroidFirebaseFirestore$AggregateQueryResponse$Builder;
          parama.<init>();
          parama.setType(GeneratedAndroidFirebaseFirestore.AggregateType.COUNT);
          parama.setValue(Double.valueOf(localb.a()));
          parama = parama.build();
          localArrayList.add(parama);
        }
      }
      paramResult.success(localArrayList);
    }
    catch (Exception parama)
    {
      ExceptionConverter.sendErrorToFlutter(paramResult, parama);
    }
  }
  
  private static void lambda$disableNetwork$4(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result paramResult)
  {
    try
    {
      x localx = getFirestoreFromPigeonk;
      paramFirestorePigeonFirebaseApp = new d9/q;
      paramFirestorePigeonFirebaseApp.<init>(0);
      Tasks.await((Task)localx.a(paramFirestorePigeonFirebaseApp));
      paramResult.success(null);
    }
    catch (Exception paramFirestorePigeonFirebaseApp)
    {
      ExceptionConverter.sendErrorToFlutter(paramResult, paramFirestorePigeonFirebaseApp);
    }
  }
  
  private static void lambda$documentReferenceDelete$16(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest paramDocumentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result paramResult)
  {
    try
    {
      paramDocumentReferenceRequest = getFirestoreFromPigeon(paramFirestorePigeonFirebaseApp).d(paramDocumentReferenceRequest.getPath());
      paramFirestorePigeonFirebaseApp = new k9/c;
      paramFirestorePigeonFirebaseApp.<init>(a, m.c);
      paramFirestorePigeonFirebaseApp = Collections.singletonList(paramFirestorePigeonFirebaseApp);
      paramDocumentReferenceRequest = b;
      m0 localm0 = new aa/m0;
      localm0.<init>(paramFirestorePigeonFirebaseApp, 1);
      paramResult.success((Void)Tasks.await(((Task)paramDocumentReferenceRequest.a(localm0)).continueWith(n9.f.b, o.a)));
    }
    catch (Exception paramFirestorePigeonFirebaseApp)
    {
      ExceptionConverter.sendErrorToFlutter(paramResult, paramFirestorePigeonFirebaseApp);
    }
  }
  
  private static void lambda$documentReferenceSet$13(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest paramDocumentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result paramResult)
  {
    try
    {
      com.google.firebase.firestore.c localc = getFirestoreFromPigeon(paramFirestorePigeonFirebaseApp).d(paramDocumentReferenceRequest.getPath());
      Map localMap = paramDocumentReferenceRequest.getData();
      Objects.requireNonNull(localMap);
      if ((paramDocumentReferenceRequest.getOption().getMerge() != null) && (paramDocumentReferenceRequest.getOption().getMerge().booleanValue()))
      {
        paramFirestorePigeonFirebaseApp = t0.d;
      }
      else
      {
        if (paramDocumentReferenceRequest.getOption().getMergeFields() == null) {
          break label96;
        }
        paramFirestorePigeonFirebaseApp = paramDocumentReferenceRequest.getOption().getMergeFields();
        Objects.requireNonNull(paramFirestorePigeonFirebaseApp);
        paramFirestorePigeonFirebaseApp = t0.a(PigeonParser.parseFieldPath(paramFirestorePigeonFirebaseApp));
      }
      paramFirestorePigeonFirebaseApp = localc.d(localMap, paramFirestorePigeonFirebaseApp);
      break label106;
      label96:
      paramFirestorePigeonFirebaseApp = localc.d(localMap, t0.c);
      label106:
      paramResult.success((Void)Tasks.await(paramFirestorePigeonFirebaseApp));
    }
    catch (Exception paramFirestorePigeonFirebaseApp)
    {
      ExceptionConverter.sendErrorToFlutter(paramResult, paramFirestorePigeonFirebaseApp);
    }
  }
  
  private static void lambda$enableNetwork$5(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result paramResult)
  {
    try
    {
      x localx = getFirestoreFromPigeonk;
      paramFirestorePigeonFirebaseApp = new d9/r;
      paramFirestorePigeonFirebaseApp.<init>(0);
      Tasks.await((Task)localx.a(paramFirestorePigeonFirebaseApp));
      paramResult.success(null);
    }
    catch (Exception paramFirestorePigeonFirebaseApp)
    {
      ExceptionConverter.sendErrorToFlutter(paramResult, paramFirestorePigeonFirebaseApp);
    }
  }
  
  private static void lambda$namedQueryGet$2(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseFirestore.Result paramResult, GeneratedAndroidFirebaseFirestore.PigeonGetOptions paramPigeonGetOptions)
  {
    try
    {
      paramFirestorePigeonFirebaseApp = getFirestoreFromPigeon(paramFirestorePigeonFirebaseApp);
      x localx = k;
      Object localObject = new d9/g;
      ((d9.g)localObject).<init>(paramString, 1);
      paramString = (Task)localx.a((n9.i)localObject);
      localObject = new io/flutter/plugins/firebase/auth/g;
      ((io.flutter.plugins.firebase.auth.g)localObject).<init>(paramFirestorePigeonFirebaseApp, 18);
      paramFirestorePigeonFirebaseApp = (com.google.firebase.firestore.i)Tasks.await(paramString.continueWith((Continuation)localObject));
      if (paramFirestorePigeonFirebaseApp == null)
      {
        paramFirestorePigeonFirebaseApp = new java/lang/NullPointerException;
        paramFirestorePigeonFirebaseApp.<init>("Named query has not been found. Please check it has been loaded properly via loadBundle().");
        paramResult.error(paramFirestorePigeonFirebaseApp);
        return;
      }
      paramResult.success(PigeonParser.toPigeonQuerySnapshot((k)Tasks.await(paramFirestorePigeonFirebaseApp.b(PigeonParser.parsePigeonSource(paramPigeonGetOptions.getSource()))), PigeonParser.parsePigeonServerTimestampBehavior(paramPigeonGetOptions.getServerTimestampBehavior())));
    }
    catch (Exception paramFirestorePigeonFirebaseApp)
    {
      ExceptionConverter.sendErrorToFlutter(paramResult, paramFirestorePigeonFirebaseApp);
    }
  }
  
  private static void lambda$persistenceCacheIndexManagerRequest$9(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp arg0, GeneratedAndroidFirebaseFirestore.PersistenceCacheIndexManagerRequest paramPersistenceCacheIndexManagerRequest, GeneratedAndroidFirebaseFirestore.Result paramResult)
  {
    ??? = getFirestoreFromPigeon(???);
    k.b();
    Object localObject1;
    Object localObject2;
    if (m == null)
    {
      localObject1 = j;
      localObject2 = e;
      boolean bool;
      if (localObject2 != null) {
        bool = localObject2 instanceof l0;
      } else {
        bool = c;
      }
      if ((bool) || ((localObject2 instanceof l0))) {
        m = new k0(k);
      }
    }
    ??? = m;
    if (??? != null)
    {
      int i = 1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest[paramPersistenceCacheIndexManagerRequest.ordinal()];
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3) {
            synchronized (a)
            {
              ???.b();
              localObject1 = b;
              ((u)localObject1).d();
              paramPersistenceCacheIndexManagerRequest = d;
              localObject2 = new g9/n;
              ((g9.n)localObject2).<init>((u)localObject1, 0);
              paramPersistenceCacheIndexManagerRequest.a((Runnable)localObject2);
            }
          }
        }
        else {
          synchronized (a)
          {
            ???.b();
            b.b(false);
          }
        }
      }
      else {
        synchronized (a)
        {
          ???.b();
          b.b(true);
        }
      }
    }
    else
    {
      Log.d("FlutterFirestorePlugin", "`PersistentCacheIndexManager` is not available.");
    }
    paramResult.success(null);
  }
  
  private static void lambda$setLoggingEnabled$10(Boolean paramBoolean, GeneratedAndroidFirebaseFirestore.Result paramResult)
  {
    try
    {
      int i;
      if (paramBoolean.booleanValue()) {
        i = 1;
      } else {
        i = 2;
      }
      p2.m0.p = i;
      paramResult.success(null);
    }
    catch (Exception paramBoolean)
    {
      ExceptionConverter.sendErrorToFlutter(paramResult, paramBoolean);
    }
  }
  
  private static void lambda$waitForPendingWrites$7(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result paramResult)
  {
    try
    {
      paramFirestorePigeonFirebaseApp = getFirestoreFromPigeonk;
      p localp = new d9/p;
      localp.<init>(0);
      Tasks.await((Task)paramFirestorePigeonFirebaseApp.a(localp));
      paramResult.success(null);
    }
    catch (Exception paramFirestorePigeonFirebaseApp)
    {
      ExceptionConverter.sendErrorToFlutter(paramResult, paramFirestorePigeonFirebaseApp);
    }
  }
  
  private static void lambda$writeBatchCommit$19(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, List paramList, GeneratedAndroidFirebaseFirestore.Result paramResult)
  {
    try
    {
      FirebaseFirestore localFirebaseFirestore = getFirestoreFromPigeon(paramFirestorePigeonFirebaseApp);
      k.b();
      a1 locala1 = new d9/a1;
      locala1.<init>(localFirebaseFirestore);
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        paramFirestorePigeonFirebaseApp = (GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand)paramList.next();
        GeneratedAndroidFirebaseFirestore.PigeonTransactionType localPigeonTransactionType = paramFirestorePigeonFirebaseApp.getType();
        Objects.requireNonNull(localPigeonTransactionType);
        Object localObject1 = paramFirestorePigeonFirebaseApp.getPath();
        Objects.requireNonNull(localObject1);
        Object localObject2 = paramFirestorePigeonFirebaseApp.getData();
        localObject1 = localFirebaseFirestore.d((String)localObject1);
        int i = 1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PigeonTransactionType[localPigeonTransactionType.ordinal()];
        if (i != 1)
        {
          if (i != 2)
          {
            if (i == 3)
            {
              paramFirestorePigeonFirebaseApp = paramFirestorePigeonFirebaseApp.getOption();
              Objects.requireNonNull(paramFirestorePigeonFirebaseApp);
              if ((paramFirestorePigeonFirebaseApp.getMerge() != null) && (paramFirestorePigeonFirebaseApp.getMerge().booleanValue()))
              {
                Objects.requireNonNull(localObject2);
                paramFirestorePigeonFirebaseApp = t0.d;
              }
              else
              {
                if (paramFirestorePigeonFirebaseApp.getMergeFields() == null) {
                  break label205;
                }
                paramFirestorePigeonFirebaseApp = paramFirestorePigeonFirebaseApp.getMergeFields();
                Objects.requireNonNull(paramFirestorePigeonFirebaseApp);
                paramFirestorePigeonFirebaseApp = PigeonParser.parseFieldPath(paramFirestorePigeonFirebaseApp);
                Objects.requireNonNull(localObject2);
                paramFirestorePigeonFirebaseApp = t0.a(paramFirestorePigeonFirebaseApp);
              }
              locala1.a((com.google.firebase.firestore.c)localObject1, (Map)localObject2, paramFirestorePigeonFirebaseApp);
              continue;
              label205:
              Objects.requireNonNull(localObject2);
              locala1.a((com.google.firebase.firestore.c)localObject1, (Map)localObject2, t0.c);
            }
          }
          else
          {
            Objects.requireNonNull(localObject2);
            paramFirestorePigeonFirebaseApp = a.h.h((Map)localObject2);
            a.j((com.google.firebase.firestore.c)localObject1);
            locala1.b();
            b.add(paramFirestorePigeonFirebaseApp.a(a, m.a(true)));
          }
        }
        else
        {
          a.j((com.google.firebase.firestore.c)localObject1);
          locala1.b();
          paramFirestorePigeonFirebaseApp = b;
          localObject2 = new k9/c;
          ((k9.c)localObject2).<init>(a, m.c);
          paramFirestorePigeonFirebaseApp.add(localObject2);
        }
      }
      locala1.b();
      c = true;
      if (!b.isEmpty())
      {
        paramFirestorePigeonFirebaseApp = a;
        paramList = new aa/m0;
        paramList.<init>(locala1, 2);
        paramFirestorePigeonFirebaseApp = (Task)paramFirestorePigeonFirebaseApp.a(paramList);
      }
      else
      {
        paramFirestorePigeonFirebaseApp = Tasks.forResult(null);
      }
      Tasks.await(paramFirestorePigeonFirebaseApp);
      paramResult.success(null);
    }
    catch (Exception paramFirestorePigeonFirebaseApp)
    {
      ExceptionConverter.sendErrorToFlutter(paramResult, paramFirestorePigeonFirebaseApp);
    }
  }
  
  private String registerEventChannel(String paramString, EventChannel.StreamHandler paramStreamHandler)
  {
    return registerEventChannel(paramString, UUID.randomUUID().toString().toLowerCase(Locale.US), paramStreamHandler);
  }
  
  private String registerEventChannel(String paramString1, String paramString2, EventChannel.StreamHandler paramStreamHandler)
  {
    paramString1 = g.e(paramString1, "/", paramString2);
    paramString1 = new EventChannel(binaryMessenger, paramString1, MESSAGE_CODEC);
    paramString1.setStreamHandler(paramStreamHandler);
    eventChannels.put(paramString2, paramString1);
    streamHandlers.put(paramString2, paramStreamHandler);
    return paramString2;
  }
  
  private void removeEventListeners()
  {
    synchronized (eventChannels)
    {
      Iterator localIterator = eventChannels.keySet().iterator();
      Object localObject3;
      while (localIterator.hasNext())
      {
        localObject3 = (String)localIterator.next();
        localObject3 = (EventChannel)eventChannels.get(localObject3);
        Objects.requireNonNull(localObject3);
        ((EventChannel)localObject3).setStreamHandler(null);
      }
      eventChannels.clear();
      synchronized (streamHandlers)
      {
        localIterator = streamHandlers.keySet().iterator();
        while (localIterator.hasNext())
        {
          localObject3 = (String)localIterator.next();
          localObject3 = (EventChannel.StreamHandler)streamHandlers.get(localObject3);
          Objects.requireNonNull(localObject3);
          ((EventChannel.StreamHandler)localObject3).onCancel(null);
        }
        streamHandlers.clear();
        transactionHandlers.clear();
        return;
      }
    }
  }
  
  public static void setCachedFirebaseFirestoreInstanceForKey(FirebaseFirestore paramFirebaseFirestore, String paramString)
  {
    synchronized (firestoreInstanceCache)
    {
      if ((FlutterFirebaseFirestoreExtension)???.get(paramFirebaseFirestore) == null)
      {
        FlutterFirebaseFirestoreExtension localFlutterFirebaseFirestoreExtension = new io/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreExtension;
        localFlutterFirebaseFirestoreExtension.<init>(paramFirebaseFirestore, paramString);
        ???.put(paramFirebaseFirestore, localFlutterFirebaseFirestoreExtension);
      }
      return;
    }
  }
  
  public void aggregateQuery(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseFirestore.PigeonQueryParameters paramPigeonQueryParameters, GeneratedAndroidFirebaseFirestore.AggregateSource paramAggregateSource, List<GeneratedAndroidFirebaseFirestore.AggregateQuery> paramList, Boolean paramBoolean, GeneratedAndroidFirebaseFirestore.Result<List<GeneratedAndroidFirebaseFirestore.AggregateQueryResponse>> paramResult)
  {
    paramString = PigeonParser.parseQuery(getFirestoreFromPigeon(paramFirestorePigeonFirebaseApp), paramString, paramBoolean.booleanValue(), paramPigeonQueryParameters);
    paramPigeonQueryParameters = new ArrayList();
    paramBoolean = paramList.iterator();
    while (paramBoolean.hasNext())
    {
      paramFirestorePigeonFirebaseApp = (GeneratedAndroidFirebaseFirestore.AggregateQuery)paramBoolean.next();
      int i = 1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$AggregateType[paramFirestorePigeonFirebaseApp.getType().ordinal()];
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            continue;
          }
          paramFirestorePigeonFirebaseApp = new a.a(d9.n.a(paramFirestorePigeonFirebaseApp.getField()));
        }
        else
        {
          paramFirestorePigeonFirebaseApp = new a.c(d9.n.a(paramFirestorePigeonFirebaseApp.getField()));
        }
      }
      else {
        paramFirestorePigeonFirebaseApp = new a.b();
      }
      paramPigeonQueryParameters.add(paramFirestorePigeonFirebaseApp);
    }
    paramBoolean = (com.google.firebase.firestore.a)paramPigeonQueryParameters.get(0);
    paramFirestorePigeonFirebaseApp = (com.google.firebase.firestore.a[])paramPigeonQueryParameters.subList(1, paramPigeonQueryParameters.size()).toArray(new com.google.firebase.firestore.a[0]);
    paramString.getClass();
    paramPigeonQueryParameters = new r0(paramBoolean);
    paramPigeonQueryParameters.addAll(Arrays.asList(paramFirestorePigeonFirebaseApp));
    paramFirestorePigeonFirebaseApp = new d9.a(paramString, paramPigeonQueryParameters);
    FlutterFirebasePlugin.cachedThreadPool.execute(new g9.r(paramFirestorePigeonFirebaseApp, paramAggregateSource, paramList, paramResult, 1));
  }
  
  public void clearPersistence(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new c(paramFirestorePigeonFirebaseApp, paramResult, 0));
  }
  
  public Task<Void> didReinitializeFirebaseCore()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new q0(21, this, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  public void disableNetwork(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new x0.f(28, paramFirestorePigeonFirebaseApp, paramResult));
  }
  
  public void documentReferenceDelete(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest paramDocumentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new x0.g(paramFirestorePigeonFirebaseApp, paramDocumentReferenceRequest, paramResult, 14));
  }
  
  public void documentReferenceGet(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest paramDocumentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new b(paramDocumentReferenceRequest, paramFirestorePigeonFirebaseApp, paramResult));
  }
  
  public void documentReferenceSet(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest paramDocumentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new x0.d(paramFirestorePigeonFirebaseApp, paramDocumentReferenceRequest, paramResult, 7));
  }
  
  public void documentReferenceSnapshot(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest paramDocumentReferenceRequest, Boolean paramBoolean, GeneratedAndroidFirebaseFirestore.ListenSource paramListenSource, GeneratedAndroidFirebaseFirestore.Result<String> paramResult)
  {
    paramResult.success(registerEventChannel("plugins.flutter.io/firebase_firestore/document", new DocumentSnapshotsStreamHandler(getFirestoreFromPigeon(paramFirestorePigeonFirebaseApp), getFirestoreFromPigeon(paramFirestorePigeonFirebaseApp).d(paramDocumentReferenceRequest.getPath()), paramBoolean, PigeonParser.parsePigeonServerTimestampBehavior(paramDocumentReferenceRequest.getServerTimestampBehavior()), PigeonParser.parseListenSource(paramListenSource))));
  }
  
  public void documentReferenceUpdate(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest paramDocumentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new b(paramFirestorePigeonFirebaseApp, paramDocumentReferenceRequest, paramResult));
  }
  
  public void enableNetwork(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new d(paramFirestorePigeonFirebaseApp, paramResult, 1));
  }
  
  public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(u7.f paramf)
  {
    paramf = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.firebase.crashlytics.b(2, paramf));
    return paramf.getTask();
  }
  
  public void loadBundle(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, byte[] paramArrayOfByte, GeneratedAndroidFirebaseFirestore.Result<String> paramResult)
  {
    paramResult.success(registerEventChannel("plugins.flutter.io/firebase_firestore/loadBundle", new LoadBundleStreamHandler(getFirestoreFromPigeon(paramFirestorePigeonFirebaseApp), paramArrayOfByte)));
  }
  
  public void namedQueryGet(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseFirestore.PigeonGetOptions paramPigeonGetOptions, GeneratedAndroidFirebaseFirestore.Result<GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new p3.a(paramFirestorePigeonFirebaseApp, paramString, paramResult, paramPigeonGetOptions, 3));
  }
  
  public void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    attachToActivity(paramActivityPluginBinding);
  }
  
  public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    initInstance(paramFlutterPluginBinding.getBinaryMessenger());
  }
  
  public void onDetachedFromActivity()
  {
    detachToActivity();
  }
  
  public void onDetachedFromActivityForConfigChanges()
  {
    detachToActivity();
  }
  
  public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    removeEventListeners();
    binaryMessenger = null;
  }
  
  public void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    attachToActivity(paramActivityPluginBinding);
  }
  
  public void persistenceCacheIndexManagerRequest(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.PersistenceCacheIndexManagerRequest paramPersistenceCacheIndexManagerRequest, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new x0(paramFirestorePigeonFirebaseApp, paramPersistenceCacheIndexManagerRequest, paramResult, 12));
  }
  
  public void queryGet(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, String paramString, Boolean paramBoolean, GeneratedAndroidFirebaseFirestore.PigeonQueryParameters paramPigeonQueryParameters, GeneratedAndroidFirebaseFirestore.PigeonGetOptions paramPigeonGetOptions, GeneratedAndroidFirebaseFirestore.Result<GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new a(paramPigeonGetOptions, paramFirestorePigeonFirebaseApp, paramString, paramBoolean, paramPigeonQueryParameters, paramResult));
  }
  
  public void querySnapshot(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, String paramString, Boolean paramBoolean1, GeneratedAndroidFirebaseFirestore.PigeonQueryParameters paramPigeonQueryParameters, GeneratedAndroidFirebaseFirestore.PigeonGetOptions paramPigeonGetOptions, Boolean paramBoolean2, GeneratedAndroidFirebaseFirestore.ListenSource paramListenSource, GeneratedAndroidFirebaseFirestore.Result<String> paramResult)
  {
    paramFirestorePigeonFirebaseApp = PigeonParser.parseQuery(getFirestoreFromPigeon(paramFirestorePigeonFirebaseApp), paramString, paramBoolean1.booleanValue(), paramPigeonQueryParameters);
    if (paramFirestorePigeonFirebaseApp == null)
    {
      paramResult.error(new GeneratedAndroidFirebaseFirestore.FlutterError("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null));
      return;
    }
    paramResult.success(registerEventChannel("plugins.flutter.io/firebase_firestore/query", new QuerySnapshotsStreamHandler(paramFirestorePigeonFirebaseApp, paramBoolean2, PigeonParser.parsePigeonServerTimestampBehavior(paramPigeonGetOptions.getServerTimestampBehavior()), PigeonParser.parseListenSource(paramListenSource))));
  }
  
  public void setIndexConfiguration(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, String paramString, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new t0.d(paramFirestorePigeonFirebaseApp, paramString, paramResult, 9));
  }
  
  public void setLoggingEnabled(Boolean paramBoolean, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new x0.f(29, paramBoolean, paramResult));
  }
  
  public void snapshotsInSyncSetup(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<String> paramResult)
  {
    paramResult.success(registerEventChannel("plugins.flutter.io/firebase_firestore/snapshotsInSync", new SnapshotsInSyncStreamHandler(getFirestoreFromPigeon(paramFirestorePigeonFirebaseApp))));
  }
  
  public void terminate(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new c(paramFirestorePigeonFirebaseApp, paramResult, 1));
  }
  
  public void transactionCreate(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, Long paramLong1, Long paramLong2, GeneratedAndroidFirebaseFirestore.Result<String> paramResult)
  {
    FirebaseFirestore localFirebaseFirestore = getFirestoreFromPigeon(paramFirestorePigeonFirebaseApp);
    paramFirestorePigeonFirebaseApp = UUID.randomUUID().toString().toLowerCase(Locale.US);
    paramLong1 = new TransactionStreamHandler(new h(10, this, paramFirestorePigeonFirebaseApp), localFirebaseFirestore, paramFirestorePigeonFirebaseApp, paramLong1, paramLong2);
    registerEventChannel("plugins.flutter.io/firebase_firestore/transaction", paramFirestorePigeonFirebaseApp, paramLong1);
    transactionHandlers.put(paramFirestorePigeonFirebaseApp, paramLong1);
    paramResult.success(paramFirestorePigeonFirebaseApp);
  }
  
  public void transactionGet(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, String paramString1, String paramString2, GeneratedAndroidFirebaseFirestore.Result<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.embedding.engine.loader.a(this, paramFirestorePigeonFirebaseApp, paramString2, paramString1, paramResult, 1));
  }
  
  public void transactionStoreResult(String paramString, GeneratedAndroidFirebaseFirestore.PigeonTransactionResult paramPigeonTransactionResult, List<GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand> paramList, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult)
  {
    paramString = (OnTransactionResultListener)transactionHandlers.get(paramString);
    Objects.requireNonNull(paramString);
    ((OnTransactionResultListener)paramString).receiveTransactionResponse(paramPigeonTransactionResult, paramList);
    paramResult.success(null);
  }
  
  public void waitForPendingWrites(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new d(paramFirestorePigeonFirebaseApp, paramResult, 0));
  }
  
  public void writeBatchCommit(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp paramFirestorePigeonFirebaseApp, List<GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand> paramList, GeneratedAndroidFirebaseFirestore.Result<Void> paramResult)
  {
    FlutterFirebasePlugin.cachedThreadPool.execute(new t0.d(paramFirestorePigeonFirebaseApp, paramList, paramResult, 8));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
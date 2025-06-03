package io.flutter.plugins.firebase.firestore;

import aa.m0;
import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.a;
import com.google.firebase.firestore.d;
import com.google.firebase.firestore.g;
import com.google.firebase.firestore.i;
import com.google.firebase.firestore.k;
import com.google.firebase.firestore.l;
import d9.a1;
import d9.e0;
import d9.f0;
import d9.g0;
import d9.k0;
import d9.l0;
import d9.n;
import d9.p;
import d9.q;
import d9.r;
import d9.r0;
import d9.t0;
import d9.v0;
import d9.x;
import g9.u;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;
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
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import k9.m;
import l3.j;
import n9.o;
import v3.x0;
import x0.q0;

/* loaded from: classes.dex */
public class FlutterFirebaseFirestorePlugin implements FlutterFirebasePlugin, FlutterPlugin, ActivityAware, GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String DEFAULT_ERROR_CODE = "firebase_firestore";
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_firestore";
    public static final String TAG = "FlutterFirestorePlugin";
    public static final HashMap<FirebaseFirestore, FlutterFirebaseFirestoreExtension> firestoreInstanceCache = new HashMap<>();
    public static final Map<Integer, d.a> serverTimestampBehaviorHashMap = new HashMap();
    private BinaryMessenger binaryMessenger;
    public final StandardMethodCodec MESSAGE_CODEC = new StandardMethodCodec(FlutterFirebaseFirestoreMessageCodec.INSTANCE);
    private final AtomicReference<Activity> activity = new AtomicReference<>(null);
    private final Map<String, l> transactions = new HashMap();
    private final Map<String, EventChannel> eventChannels = new HashMap();
    private final Map<String, EventChannel.StreamHandler> streamHandlers = new HashMap();
    private final Map<String, OnTransactionResultListener> transactionHandlers = new HashMap();

    /* renamed from: io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$AggregateType;
        public static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest;
        public static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PigeonTransactionType;

        static {
            int[] iArr = new int[GeneratedAndroidFirebaseFirestore.PersistenceCacheIndexManagerRequest.values().length];
            $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest = iArr;
            try {
                iArr[GeneratedAndroidFirebaseFirestore.PersistenceCacheIndexManagerRequest.ENABLE_INDEX_AUTO_CREATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest[GeneratedAndroidFirebaseFirestore.PersistenceCacheIndexManagerRequest.DISABLE_INDEX_AUTO_CREATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest[GeneratedAndroidFirebaseFirestore.PersistenceCacheIndexManagerRequest.DELETE_ALL_INDEXES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[GeneratedAndroidFirebaseFirestore.PigeonTransactionType.values().length];
            $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PigeonTransactionType = iArr2;
            try {
                iArr2[GeneratedAndroidFirebaseFirestore.PigeonTransactionType.DELETE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PigeonTransactionType[GeneratedAndroidFirebaseFirestore.PigeonTransactionType.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PigeonTransactionType[GeneratedAndroidFirebaseFirestore.PigeonTransactionType.SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[GeneratedAndroidFirebaseFirestore.AggregateType.values().length];
            $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$AggregateType = iArr3;
            try {
                iArr3[GeneratedAndroidFirebaseFirestore.AggregateType.COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$AggregateType[GeneratedAndroidFirebaseFirestore.AggregateType.SUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$AggregateType[GeneratedAndroidFirebaseFirestore.AggregateType.AVERAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private void attachToActivity(ActivityPluginBinding activityPluginBinding) {
        this.activity.set(activityPluginBinding.getActivity());
    }

    private static void destroyCachedFirebaseFirestoreInstanceForKey(FirebaseFirestore firebaseFirestore) {
        HashMap<FirebaseFirestore, FlutterFirebaseFirestoreExtension> hashMap = firestoreInstanceCache;
        synchronized (hashMap) {
            if (hashMap.get(firebaseFirestore) != null) {
                hashMap.remove(firebaseFirestore);
            }
        }
    }

    private void detachToActivity() {
        this.activity.set(null);
    }

    public static FlutterFirebaseFirestoreExtension getCachedFirebaseFirestoreInstanceForKey(FirebaseFirestore firebaseFirestore) {
        FlutterFirebaseFirestoreExtension flutterFirebaseFirestoreExtension;
        HashMap<FirebaseFirestore, FlutterFirebaseFirestoreExtension> hashMap = firestoreInstanceCache;
        synchronized (hashMap) {
            flutterFirebaseFirestoreExtension = hashMap.get(firebaseFirestore);
        }
        return flutterFirebaseFirestoreExtension;
    }

    public static FirebaseFirestore getFirestoreFromPigeon(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp) {
        synchronized (firestoreInstanceCache) {
            FirebaseFirestore firestoreInstanceByNameAndDatabaseUrl = getFirestoreInstanceByNameAndDatabaseUrl(firestorePigeonFirebaseApp.getAppName(), firestorePigeonFirebaseApp.getDatabaseURL());
            if (firestoreInstanceByNameAndDatabaseUrl != null) {
                return firestoreInstanceByNameAndDatabaseUrl;
            }
            FirebaseFirestore e10 = FirebaseFirestore.e(u7.f.f(firestorePigeonFirebaseApp.getAppName()), firestorePigeonFirebaseApp.getDatabaseURL());
            e10.g(getSettingsFromPigeon(firestorePigeonFirebaseApp));
            setCachedFirebaseFirestoreInstanceForKey(e10, firestorePigeonFirebaseApp.getDatabaseURL());
            return e10;
        }
    }

    public static FirebaseFirestore getFirestoreInstanceByNameAndDatabaseUrl(String str, String str2) {
        HashMap<FirebaseFirestore, FlutterFirebaseFirestoreExtension> hashMap = firestoreInstanceCache;
        synchronized (hashMap) {
            for (Map.Entry<FirebaseFirestore, FlutterFirebaseFirestoreExtension> entry : hashMap.entrySet()) {
                u7.f fVar = entry.getValue().getInstance().f3134g;
                fVar.a();
                if (fVar.f15085b.equals(str) && entry.getValue().getDatabaseURL().equals(str2)) {
                    return entry.getKey();
                }
            }
            return null;
        }
    }

    public static com.google.firebase.firestore.g getSettingsFromPigeon(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp) {
        e0 f0Var;
        g.a aVar = new g.a();
        if (firestorePigeonFirebaseApp.getSettings().getHost() != null) {
            String host = firestorePigeonFirebaseApp.getSettings().getHost();
            if (host == null) {
                throw new NullPointerException("Provided host must not be null.");
            }
            aVar.f3179a = host;
        }
        if (firestorePigeonFirebaseApp.getSettings().getSslEnabled() != null) {
            aVar.f3180b = firestorePigeonFirebaseApp.getSettings().getSslEnabled().booleanValue();
        }
        if (firestorePigeonFirebaseApp.getSettings().getPersistenceEnabled() != null) {
            if (firestorePigeonFirebaseApp.getSettings().getPersistenceEnabled().booleanValue()) {
                Long cacheSizeBytes = firestorePigeonFirebaseApp.getSettings().getCacheSizeBytes();
                f0Var = new l0((cacheSizeBytes == null || cacheSizeBytes.longValue() == -1) ? 104857600L : cacheSizeBytes.longValue());
            } else {
                f0Var = new f0(new g0());
            }
            aVar.b(f0Var);
        }
        return aVar.a();
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        this.binaryMessenger = binaryMessenger;
        FlutterFirebasePluginRegistry.registerPlugin(METHOD_CHANNEL_NAME, this);
        GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi.CC.y(this.binaryMessenger, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$aggregateQuery$18(d9.a aVar, GeneratedAndroidFirebaseFirestore.AggregateSource aggregateSource, List list, GeneratedAndroidFirebaseFirestore.Result result) {
        GeneratedAndroidFirebaseFirestore.AggregateQueryResponse build;
        GeneratedAndroidFirebaseFirestore.AggregateQueryResponse.Builder builder;
        try {
            com.google.firebase.firestore.b bVar = (com.google.firebase.firestore.b) Tasks.await(aVar.a(PigeonParser.parseAggregateSource(aggregateSource)));
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GeneratedAndroidFirebaseFirestore.AggregateQuery aggregateQuery = (GeneratedAndroidFirebaseFirestore.AggregateQuery) it.next();
                int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$AggregateType[aggregateQuery.getType().ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        builder = new GeneratedAndroidFirebaseFirestore.AggregateQueryResponse.Builder();
                        builder.setType(GeneratedAndroidFirebaseFirestore.AggregateType.SUM);
                        Object b10 = bVar.b(new a.c(n.a(aggregateQuery.getField())));
                        Objects.requireNonNull(b10);
                        builder.setValue(Double.valueOf(((Number) b10).doubleValue()));
                        builder.setField(aggregateQuery.getField());
                    } else if (i10 == 3) {
                        builder = new GeneratedAndroidFirebaseFirestore.AggregateQueryResponse.Builder();
                        builder.setType(GeneratedAndroidFirebaseFirestore.AggregateType.AVERAGE);
                        a.C0053a c0053a = new a.C0053a(n.a(aggregateQuery.getField()));
                        bVar.getClass();
                        Number number = (Number) bVar.c(c0053a, Number.class);
                        builder.setValue(number != null ? Double.valueOf(number.doubleValue()) : null);
                        builder.setField(aggregateQuery.getField());
                    }
                    build = builder.build();
                } else {
                    GeneratedAndroidFirebaseFirestore.AggregateQueryResponse.Builder builder2 = new GeneratedAndroidFirebaseFirestore.AggregateQueryResponse.Builder();
                    builder2.setType(GeneratedAndroidFirebaseFirestore.AggregateType.COUNT);
                    builder2.setValue(Double.valueOf(bVar.a()));
                    build = builder2.build();
                }
                arrayList.add(build);
            }
            result.success(arrayList);
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$clearPersistence$3(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result result) {
        try {
            Tasks.await(getFirestoreFromPigeon(firestorePigeonFirebaseApp).b());
            result.success(null);
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didReinitializeFirebaseCore$1(TaskCompletionSource taskCompletionSource) {
        try {
            HashMap<FirebaseFirestore, FlutterFirebaseFirestoreExtension> hashMap = firestoreInstanceCache;
            synchronized (hashMap) {
                Iterator<Map.Entry<FirebaseFirestore, FlutterFirebaseFirestoreExtension>> it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    FirebaseFirestore key = it.next().getKey();
                    Tasks.await(key.i());
                    destroyCachedFirebaseFirestoreInstanceForKey(key);
                }
            }
            removeEventListeners();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$disableNetwork$4(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result result) {
        try {
            Tasks.await((Task) getFirestoreFromPigeon(firestorePigeonFirebaseApp).f3138k.a(new q(0)));
            result.success(null);
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$documentReferenceDelete$16(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest documentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result result) {
        try {
            com.google.firebase.firestore.c d10 = getFirestoreFromPigeon(firestorePigeonFirebaseApp).d(documentReferenceRequest.getPath());
            result.success((Void) Tasks.await(((Task) d10.f3147b.a(new m0(Collections.singletonList(new k9.c(d10.f3146a, m.f9167c)), 1))).continueWith(n9.f.f11361b, o.f11373a)));
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$documentReferenceGet$15(GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest documentReferenceRequest, GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result result) {
        try {
            result.success(PigeonParser.toPigeonDocumentSnapshot((com.google.firebase.firestore.d) Tasks.await(getFirestoreFromPigeon(firestorePigeonFirebaseApp).d(documentReferenceRequest.getPath()).b(PigeonParser.parsePigeonSource(documentReferenceRequest.getSource()))), PigeonParser.parsePigeonServerTimestampBehavior(documentReferenceRequest.getServerTimestampBehavior())));
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$documentReferenceSet$13(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest documentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result result) {
        Task d10;
        t0 a10;
        try {
            com.google.firebase.firestore.c d11 = getFirestoreFromPigeon(firestorePigeonFirebaseApp).d(documentReferenceRequest.getPath());
            Map<Object, Object> data = documentReferenceRequest.getData();
            Objects.requireNonNull(data);
            if (documentReferenceRequest.getOption().getMerge() != null && documentReferenceRequest.getOption().getMerge().booleanValue()) {
                a10 = t0.f3718d;
            } else if (documentReferenceRequest.getOption().getMergeFields() == null) {
                d10 = d11.d(data, t0.f3717c);
                result.success((Void) Tasks.await(d10));
            } else {
                List<List<String>> mergeFields = documentReferenceRequest.getOption().getMergeFields();
                Objects.requireNonNull(mergeFields);
                a10 = t0.a(PigeonParser.parseFieldPath(mergeFields));
            }
            d10 = d11.d(data, a10);
            result.success((Void) Tasks.await(d10));
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$documentReferenceUpdate$14(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest documentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result result) {
        n nVar;
        Object obj;
        try {
            com.google.firebase.firestore.c d10 = getFirestoreFromPigeon(firestorePigeonFirebaseApp).d(documentReferenceRequest.getPath());
            Map<Object, Object> data = documentReferenceRequest.getData();
            Objects.requireNonNull(data);
            Map<Object, Object> map = data;
            HashMap hashMap = new HashMap();
            for (Object obj2 : map.keySet()) {
                if (obj2 instanceof String) {
                    nVar = n.b((String) obj2);
                    obj = map.get(obj2);
                } else {
                    if (!(obj2 instanceof n)) {
                        throw new IllegalArgumentException("Invalid key type in update data. Supported types are String and FieldPath.");
                    }
                    nVar = (n) obj2;
                    obj = map.get(obj2);
                }
                hashMap.put(nVar, obj);
            }
            n nVar2 = (n) hashMap.keySet().iterator().next();
            Object obj3 = hashMap.get(nVar2);
            ArrayList arrayList = new ArrayList();
            for (n nVar3 : hashMap.keySet()) {
                if (!nVar3.equals(nVar2)) {
                    arrayList.add(nVar3);
                    arrayList.add(hashMap.get(nVar3));
                }
            }
            result.success((Void) Tasks.await(d10.e(nVar2, obj3, arrayList.toArray())));
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$enableNetwork$5(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result result) {
        try {
            Tasks.await((Task) getFirestoreFromPigeon(firestorePigeonFirebaseApp).f3138k.a(new r(0)));
            result.success(null);
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$namedQueryGet$2(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, String str, GeneratedAndroidFirebaseFirestore.Result result, GeneratedAndroidFirebaseFirestore.PigeonGetOptions pigeonGetOptions) {
        try {
            FirebaseFirestore firestoreFromPigeon = getFirestoreFromPigeon(firestorePigeonFirebaseApp);
            i iVar = (i) Tasks.await(((Task) firestoreFromPigeon.f3138k.a(new d9.g(str, 1))).continueWith(new io.flutter.plugins.firebase.auth.g(firestoreFromPigeon, 18)));
            if (iVar == null) {
                result.error(new NullPointerException("Named query has not been found. Please check it has been loaded properly via loadBundle()."));
            } else {
                result.success(PigeonParser.toPigeonQuerySnapshot((k) Tasks.await(iVar.b(PigeonParser.parsePigeonSource(pigeonGetOptions.getSource()))), PigeonParser.parsePigeonServerTimestampBehavior(pigeonGetOptions.getServerTimestampBehavior())));
            }
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$persistenceCacheIndexManagerRequest$9(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.PersistenceCacheIndexManagerRequest persistenceCacheIndexManagerRequest, GeneratedAndroidFirebaseFirestore.Result result) {
        FirebaseFirestore firestoreFromPigeon = getFirestoreFromPigeon(firestorePigeonFirebaseApp);
        firestoreFromPigeon.f3138k.b();
        if (firestoreFromPigeon.f3140m == null) {
            com.google.firebase.firestore.g gVar = firestoreFromPigeon.f3137j;
            e0 e0Var = gVar.f3178e;
            if ((e0Var != null ? e0Var instanceof l0 : gVar.f3176c) || (e0Var instanceof l0)) {
                firestoreFromPigeon.f3140m = new k0(firestoreFromPigeon.f3138k);
            }
        }
        k0 k0Var = firestoreFromPigeon.f3140m;
        if (k0Var != null) {
            int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PersistenceCacheIndexManagerRequest[persistenceCacheIndexManagerRequest.ordinal()];
            if (i10 != 1) {
                int i11 = 0;
                if (i10 == 2) {
                    x xVar = k0Var.f3686a;
                    synchronized (xVar) {
                        xVar.b();
                        xVar.f3734b.b(false);
                    }
                } else if (i10 == 3) {
                    x xVar2 = k0Var.f3686a;
                    synchronized (xVar2) {
                        xVar2.b();
                        u uVar = xVar2.f3734b;
                        uVar.d();
                        uVar.f6090d.a(new g9.n(uVar, i11));
                    }
                }
            } else {
                x xVar3 = k0Var.f3686a;
                synchronized (xVar3) {
                    xVar3.b();
                    xVar3.f3734b.b(true);
                }
            }
        } else {
            Log.d(TAG, "`PersistentCacheIndexManager` is not available.");
        }
        result.success(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$queryGet$17(GeneratedAndroidFirebaseFirestore.PigeonGetOptions pigeonGetOptions, GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, String str, Boolean bool, GeneratedAndroidFirebaseFirestore.PigeonQueryParameters pigeonQueryParameters, GeneratedAndroidFirebaseFirestore.Result result) {
        try {
            v0 parsePigeonSource = PigeonParser.parsePigeonSource(pigeonGetOptions.getSource());
            i parseQuery = PigeonParser.parseQuery(getFirestoreFromPigeon(firestorePigeonFirebaseApp), str, bool.booleanValue(), pigeonQueryParameters);
            if (parseQuery == null) {
                result.error(new GeneratedAndroidFirebaseFirestore.FlutterError("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null));
            } else {
                result.success(PigeonParser.toPigeonQuerySnapshot((k) Tasks.await(parseQuery.b(parsePigeonSource)), PigeonParser.parsePigeonServerTimestampBehavior(pigeonGetOptions.getServerTimestampBehavior())));
            }
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setIndexConfiguration$8(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, String str, GeneratedAndroidFirebaseFirestore.Result result) {
        try {
            Tasks.await(getFirestoreFromPigeon(firestorePigeonFirebaseApp).h(str));
            result.success(null);
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$setLoggingEnabled$10(Boolean bool, GeneratedAndroidFirebaseFirestore.Result result) {
        try {
            p2.m0.f12895p = bool.booleanValue() ? 1 : 2;
            result.success(null);
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$terminate$6(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result result) {
        try {
            FirebaseFirestore firestoreFromPigeon = getFirestoreFromPigeon(firestorePigeonFirebaseApp);
            Tasks.await(firestoreFromPigeon.i());
            destroyCachedFirebaseFirestoreInstanceForKey(firestoreFromPigeon);
            result.success(null);
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transactionCreate$11(String str, l lVar) {
        this.transactions.put(str, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transactionGet$12(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseFirestore.Result result) {
        try {
            com.google.firebase.firestore.c d10 = getFirestoreFromPigeon(firestorePigeonFirebaseApp).d(str);
            l lVar = this.transactions.get(str2);
            if (lVar != null) {
                result.success(PigeonParser.toPigeonDocumentSnapshot(lVar.a(d10), d.a.NONE));
                return;
            }
            result.error(new Exception("Transaction.getDocument(): No transaction handler exists for ID: " + str2));
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$waitForPendingWrites$7(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result result) {
        try {
            Tasks.await((Task) getFirestoreFromPigeon(firestorePigeonFirebaseApp).f3138k.a(new p(0)));
            result.success(null);
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$writeBatchCommit$19(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, List list, GeneratedAndroidFirebaseFirestore.Result result) {
        int i10;
        t0 a10;
        try {
            FirebaseFirestore firestoreFromPigeon = getFirestoreFromPigeon(firestorePigeonFirebaseApp);
            firestoreFromPigeon.f3138k.b();
            a1 a1Var = new a1(firestoreFromPigeon);
            Iterator it = list.iterator();
            while (true) {
                i10 = 2;
                if (!it.hasNext()) {
                    break;
                }
                GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand pigeonTransactionCommand = (GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand) it.next();
                GeneratedAndroidFirebaseFirestore.PigeonTransactionType type = pigeonTransactionCommand.getType();
                Objects.requireNonNull(type);
                String path = pigeonTransactionCommand.getPath();
                Objects.requireNonNull(path);
                Map<String, Object> data = pigeonTransactionCommand.getData();
                com.google.firebase.firestore.c d10 = firestoreFromPigeon.d(path);
                int i11 = AnonymousClass1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PigeonTransactionType[type.ordinal()];
                if (i11 == 1) {
                    a1Var.f3641a.j(d10);
                    a1Var.b();
                    a1Var.f3642b.add(new k9.c(d10.f3146a, m.f9167c));
                } else if (i11 == 2) {
                    Objects.requireNonNull(data);
                    j h10 = a1Var.f3641a.f3135h.h(data);
                    a1Var.f3641a.j(d10);
                    a1Var.b();
                    a1Var.f3642b.add(h10.a(d10.f3146a, m.a(true)));
                } else if (i11 == 3) {
                    GeneratedAndroidFirebaseFirestore.PigeonDocumentOption option = pigeonTransactionCommand.getOption();
                    Objects.requireNonNull(option);
                    if (option.getMerge() != null && option.getMerge().booleanValue()) {
                        Objects.requireNonNull(data);
                        a10 = t0.f3718d;
                    } else if (option.getMergeFields() != null) {
                        List<List<String>> mergeFields = option.getMergeFields();
                        Objects.requireNonNull(mergeFields);
                        List<n> parseFieldPath = PigeonParser.parseFieldPath(mergeFields);
                        Objects.requireNonNull(data);
                        a10 = t0.a(parseFieldPath);
                    } else {
                        Objects.requireNonNull(data);
                        a1Var.a(d10, data, t0.f3717c);
                    }
                    a1Var.a(d10, data, a10);
                }
            }
            a1Var.b();
            a1Var.f3643c = true;
            Tasks.await(!a1Var.f3642b.isEmpty() ? (Task) a1Var.f3641a.a(new m0(a1Var, i10)) : Tasks.forResult(null));
            result.success(null);
        } catch (Exception e10) {
            ExceptionConverter.sendErrorToFlutter(result, e10);
        }
    }

    private String registerEventChannel(String str, EventChannel.StreamHandler streamHandler) {
        return registerEventChannel(str, UUID.randomUUID().toString().toLowerCase(Locale.US), streamHandler);
    }

    private String registerEventChannel(String str, String str2, EventChannel.StreamHandler streamHandler) {
        EventChannel eventChannel = new EventChannel(this.binaryMessenger, defpackage.g.e(str, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, str2), this.MESSAGE_CODEC);
        eventChannel.setStreamHandler(streamHandler);
        this.eventChannels.put(str2, eventChannel);
        this.streamHandlers.put(str2, streamHandler);
        return str2;
    }

    private void removeEventListeners() {
        synchronized (this.eventChannels) {
            Iterator<String> it = this.eventChannels.keySet().iterator();
            while (it.hasNext()) {
                EventChannel eventChannel = this.eventChannels.get(it.next());
                Objects.requireNonNull(eventChannel);
                eventChannel.setStreamHandler(null);
            }
            this.eventChannels.clear();
        }
        synchronized (this.streamHandlers) {
            Iterator<String> it2 = this.streamHandlers.keySet().iterator();
            while (it2.hasNext()) {
                EventChannel.StreamHandler streamHandler = this.streamHandlers.get(it2.next());
                Objects.requireNonNull(streamHandler);
                streamHandler.onCancel(null);
            }
            this.streamHandlers.clear();
        }
        this.transactionHandlers.clear();
    }

    public static void setCachedFirebaseFirestoreInstanceForKey(FirebaseFirestore firebaseFirestore, String str) {
        HashMap<FirebaseFirestore, FlutterFirebaseFirestoreExtension> hashMap = firestoreInstanceCache;
        synchronized (hashMap) {
            if (hashMap.get(firebaseFirestore) == null) {
                hashMap.put(firebaseFirestore, new FlutterFirebaseFirestoreExtension(firebaseFirestore, str));
            }
        }
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void aggregateQuery(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, String str, GeneratedAndroidFirebaseFirestore.PigeonQueryParameters pigeonQueryParameters, GeneratedAndroidFirebaseFirestore.AggregateSource aggregateSource, List<GeneratedAndroidFirebaseFirestore.AggregateQuery> list, Boolean bool, GeneratedAndroidFirebaseFirestore.Result<List<GeneratedAndroidFirebaseFirestore.AggregateQueryResponse>> result) {
        com.google.firebase.firestore.a bVar;
        i parseQuery = PigeonParser.parseQuery(getFirestoreFromPigeon(firestorePigeonFirebaseApp), str, bool.booleanValue(), pigeonQueryParameters);
        ArrayList arrayList = new ArrayList();
        for (GeneratedAndroidFirebaseFirestore.AggregateQuery aggregateQuery : list) {
            int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$AggregateType[aggregateQuery.getType().ordinal()];
            if (i10 == 1) {
                bVar = new a.b();
            } else if (i10 == 2) {
                bVar = new a.c(n.a(aggregateQuery.getField()));
            } else if (i10 == 3) {
                bVar = new a.C0053a(n.a(aggregateQuery.getField()));
            }
            arrayList.add(bVar);
        }
        com.google.firebase.firestore.a aVar = (com.google.firebase.firestore.a) arrayList.get(0);
        com.google.firebase.firestore.a[] aVarArr = (com.google.firebase.firestore.a[]) arrayList.subList(1, arrayList.size()).toArray(new com.google.firebase.firestore.a[0]);
        parseQuery.getClass();
        r0 r0Var = new r0(aVar);
        r0Var.addAll(Arrays.asList(aVarArr));
        FlutterFirebasePlugin.cachedThreadPool.execute(new g9.r(new d9.a(parseQuery, r0Var), aggregateSource, list, result, 1));
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void clearPersistence(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<Void> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(firestorePigeonFirebaseApp, result, 0));
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new q0(21, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void disableNetwork(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<Void> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new x0.f(28, firestorePigeonFirebaseApp, result));
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void documentReferenceDelete(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest documentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result<Void> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new x0.g(firestorePigeonFirebaseApp, documentReferenceRequest, result, 14));
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void documentReferenceGet(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest documentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(documentReferenceRequest, firestorePigeonFirebaseApp, result));
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void documentReferenceSet(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest documentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result<Void> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new x0.d(firestorePigeonFirebaseApp, documentReferenceRequest, result, 7));
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void documentReferenceSnapshot(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest documentReferenceRequest, Boolean bool, GeneratedAndroidFirebaseFirestore.ListenSource listenSource, GeneratedAndroidFirebaseFirestore.Result<String> result) {
        result.success(registerEventChannel("plugins.flutter.io/firebase_firestore/document", new DocumentSnapshotsStreamHandler(getFirestoreFromPigeon(firestorePigeonFirebaseApp), getFirestoreFromPigeon(firestorePigeonFirebaseApp).d(documentReferenceRequest.getPath()), bool, PigeonParser.parsePigeonServerTimestampBehavior(documentReferenceRequest.getServerTimestampBehavior()), PigeonParser.parseListenSource(listenSource))));
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void documentReferenceUpdate(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest documentReferenceRequest, GeneratedAndroidFirebaseFirestore.Result<Void> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(firestorePigeonFirebaseApp, documentReferenceRequest, result));
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void enableNetwork(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<Void> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(firestorePigeonFirebaseApp, result, 1));
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(u7.f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.firebase.crashlytics.b(2, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void loadBundle(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, byte[] bArr, GeneratedAndroidFirebaseFirestore.Result<String> result) {
        result.success(registerEventChannel("plugins.flutter.io/firebase_firestore/loadBundle", new LoadBundleStreamHandler(getFirestoreFromPigeon(firestorePigeonFirebaseApp), bArr)));
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void namedQueryGet(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, String str, GeneratedAndroidFirebaseFirestore.PigeonGetOptions pigeonGetOptions, GeneratedAndroidFirebaseFirestore.Result<GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new p3.a(firestorePigeonFirebaseApp, str, result, pigeonGetOptions, 3));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        attachToActivity(activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        detachToActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        detachToActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        removeEventListeners();
        this.binaryMessenger = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        attachToActivity(activityPluginBinding);
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void persistenceCacheIndexManagerRequest(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.PersistenceCacheIndexManagerRequest persistenceCacheIndexManagerRequest, GeneratedAndroidFirebaseFirestore.Result<Void> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new x0(firestorePigeonFirebaseApp, persistenceCacheIndexManagerRequest, result, 12));
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void queryGet(final GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, final String str, final Boolean bool, final GeneratedAndroidFirebaseFirestore.PigeonQueryParameters pigeonQueryParameters, final GeneratedAndroidFirebaseFirestore.PigeonGetOptions pigeonGetOptions, final GeneratedAndroidFirebaseFirestore.Result<GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.firestore.a
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseFirestorePlugin.lambda$queryGet$17(GeneratedAndroidFirebaseFirestore.PigeonGetOptions.this, firestorePigeonFirebaseApp, str, bool, pigeonQueryParameters, result);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void querySnapshot(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, String str, Boolean bool, GeneratedAndroidFirebaseFirestore.PigeonQueryParameters pigeonQueryParameters, GeneratedAndroidFirebaseFirestore.PigeonGetOptions pigeonGetOptions, Boolean bool2, GeneratedAndroidFirebaseFirestore.ListenSource listenSource, GeneratedAndroidFirebaseFirestore.Result<String> result) {
        i parseQuery = PigeonParser.parseQuery(getFirestoreFromPigeon(firestorePigeonFirebaseApp), str, bool.booleanValue(), pigeonQueryParameters);
        if (parseQuery == null) {
            result.error(new GeneratedAndroidFirebaseFirestore.FlutterError("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null));
        } else {
            result.success(registerEventChannel("plugins.flutter.io/firebase_firestore/query", new QuerySnapshotsStreamHandler(parseQuery, bool2, PigeonParser.parsePigeonServerTimestampBehavior(pigeonGetOptions.getServerTimestampBehavior()), PigeonParser.parseListenSource(listenSource))));
        }
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void setIndexConfiguration(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, String str, GeneratedAndroidFirebaseFirestore.Result<Void> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new t0.d(firestorePigeonFirebaseApp, str, result, 9));
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void setLoggingEnabled(Boolean bool, GeneratedAndroidFirebaseFirestore.Result<Void> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new x0.f(29, bool, result));
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void snapshotsInSyncSetup(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<String> result) {
        result.success(registerEventChannel("plugins.flutter.io/firebase_firestore/snapshotsInSync", new SnapshotsInSyncStreamHandler(getFirestoreFromPigeon(firestorePigeonFirebaseApp))));
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void terminate(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<Void> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(firestorePigeonFirebaseApp, result, 1));
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void transactionCreate(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, Long l10, Long l11, GeneratedAndroidFirebaseFirestore.Result<String> result) {
        FirebaseFirestore firestoreFromPigeon = getFirestoreFromPigeon(firestorePigeonFirebaseApp);
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        TransactionStreamHandler transactionStreamHandler = new TransactionStreamHandler(new q3.h(10, this, lowerCase), firestoreFromPigeon, lowerCase, l10, l11);
        registerEventChannel("plugins.flutter.io/firebase_firestore/transaction", lowerCase, transactionStreamHandler);
        this.transactionHandlers.put(lowerCase, transactionStreamHandler);
        result.success(lowerCase);
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void transactionGet(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseFirestore.Result<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.embedding.engine.loader.a(this, firestorePigeonFirebaseApp, str2, str, result, 1));
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void transactionStoreResult(String str, GeneratedAndroidFirebaseFirestore.PigeonTransactionResult pigeonTransactionResult, List<GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand> list, GeneratedAndroidFirebaseFirestore.Result<Void> result) {
        OnTransactionResultListener onTransactionResultListener = this.transactionHandlers.get(str);
        Objects.requireNonNull(onTransactionResultListener);
        onTransactionResultListener.receiveTransactionResponse(pigeonTransactionResult, list);
        result.success(null);
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void waitForPendingWrites(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, GeneratedAndroidFirebaseFirestore.Result<Void> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(firestorePigeonFirebaseApp, result, 0));
    }

    @Override // io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirebaseFirestoreHostApi
    public void writeBatchCommit(GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp firestorePigeonFirebaseApp, List<GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand> list, GeneratedAndroidFirebaseFirestore.Result<Void> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new t0.d(firestorePigeonFirebaseApp, list, result, 8));
    }
}

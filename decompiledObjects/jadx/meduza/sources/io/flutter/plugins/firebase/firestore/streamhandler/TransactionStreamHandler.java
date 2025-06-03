package io.flutter.plugins.firebase.firestore.streamhandler;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.c;
import com.google.firebase.firestore.f;
import com.google.firebase.firestore.l;
import d9.t0;
import d9.x;
import d9.x0;
import g.q;
import g9.m0;
import g9.u;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestoreTransactionResult;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;
import io.flutter.plugins.firebase.firestore.streamhandler.TransactionStreamHandler;
import io.flutter.plugins.firebase.firestore.utils.ExceptionConverter;
import io.flutter.plugins.firebase.firestore.utils.PigeonParser;
import j9.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l3.j;
import n9.a;
import q3.h;
import u7.f;
import x0.g;

/* loaded from: classes.dex */
public class TransactionStreamHandler implements OnTransactionResultListener, EventChannel.StreamHandler {
    private List<GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand> commands;
    public final FirebaseFirestore firestore;
    public final Long maxAttempts;
    public final OnTransactionStartedListener onTransactionStartedListener;
    private GeneratedAndroidFirebaseFirestore.PigeonTransactionResult resultType;
    public final Long timeout;
    public final String transactionId;
    public final Semaphore semaphore = new Semaphore(0);
    public final Handler mainLooper = new Handler(Looper.getMainLooper());

    /* renamed from: io.flutter.plugins.firebase.firestore.streamhandler.TransactionStreamHandler$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PigeonTransactionType;

        static {
            int[] iArr = new int[GeneratedAndroidFirebaseFirestore.PigeonTransactionType.values().length];
            $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PigeonTransactionType = iArr;
            try {
                iArr[GeneratedAndroidFirebaseFirestore.PigeonTransactionType.DELETE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PigeonTransactionType[GeneratedAndroidFirebaseFirestore.PigeonTransactionType.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PigeonTransactionType[GeneratedAndroidFirebaseFirestore.PigeonTransactionType.SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface OnTransactionStartedListener {
        void onStarted(l lVar);
    }

    public TransactionStreamHandler(OnTransactionStartedListener onTransactionStartedListener, FirebaseFirestore firebaseFirestore, String str, Long l10, Long l11) {
        this.onTransactionStartedListener = onTransactionStartedListener;
        this.firestore = firebaseFirestore;
        this.transactionId = str;
        this.timeout = l10;
        this.maxAttempts = l11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FlutterFirebaseFirestoreTransactionResult lambda$onListen$1(EventChannel.EventSink eventSink, l lVar) {
        this.onTransactionStartedListener.onStarted(lVar);
        HashMap hashMap = new HashMap();
        f fVar = this.firestore.f3134g;
        fVar.a();
        hashMap.put("appName", fVar.f15085b);
        this.mainLooper.post(new b(0, eventSink, hashMap));
        try {
            if (!this.semaphore.tryAcquire(this.timeout.longValue(), TimeUnit.MILLISECONDS)) {
                return FlutterFirebaseFirestoreTransactionResult.failed(new com.google.firebase.firestore.f("timed out", f.a.DEADLINE_EXCEEDED));
            }
            if (this.commands.isEmpty()) {
                return FlutterFirebaseFirestoreTransactionResult.complete();
            }
            if (this.resultType == GeneratedAndroidFirebaseFirestore.PigeonTransactionResult.FAILURE) {
                return FlutterFirebaseFirestoreTransactionResult.complete();
            }
            for (GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand pigeonTransactionCommand : this.commands) {
                c d10 = this.firestore.d(pigeonTransactionCommand.getPath());
                int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$firebase$firestore$GeneratedAndroidFirebaseFirestore$PigeonTransactionType[pigeonTransactionCommand.getType().ordinal()];
                if (i10 == 1) {
                    lVar.f3199b.j(d10);
                    m0 m0Var = lVar.f3198a;
                    i iVar = d10.f3146a;
                    List singletonList = Collections.singletonList(new k9.c(iVar, m0Var.a(iVar)));
                    x6.b.Z("A transaction object cannot be used after its update callback has been invoked.", true ^ m0Var.f6029d, new Object[0]);
                    m0Var.f6028c.addAll(singletonList);
                    m0Var.f.add(iVar);
                } else if (i10 == 2) {
                    Map<String, Object> data = pigeonTransactionCommand.getData();
                    Objects.requireNonNull(data);
                    j h10 = lVar.f3199b.f3135h.h(data);
                    lVar.f3199b.j(d10);
                    m0 m0Var2 = lVar.f3198a;
                    i iVar2 = d10.f3146a;
                    m0Var2.getClass();
                    try {
                        List singletonList2 = Collections.singletonList(h10.a(iVar2, m0Var2.b(iVar2)));
                        x6.b.Z("A transaction object cannot be used after its update callback has been invoked.", true ^ m0Var2.f6029d, new Object[0]);
                        m0Var2.f6028c.addAll(singletonList2);
                    } catch (com.google.firebase.firestore.f e10) {
                        m0Var2.f6030e = e10;
                    }
                    m0Var2.f.add(iVar2);
                } else if (i10 == 3) {
                    GeneratedAndroidFirebaseFirestore.PigeonDocumentOption option = pigeonTransactionCommand.getOption();
                    Objects.requireNonNull(option);
                    t0 t0Var = null;
                    if (option.getMerge() != null && option.getMerge().booleanValue()) {
                        t0Var = t0.f3718d;
                    } else if (option.getMergeFields() != null) {
                        List<List<String>> mergeFields = option.getMergeFields();
                        Objects.requireNonNull(mergeFields);
                        t0Var = t0.a(PigeonParser.parseFieldPath(mergeFields));
                    }
                    Map<String, Object> data2 = pigeonTransactionCommand.getData();
                    Objects.requireNonNull(data2);
                    if (t0Var == null) {
                        lVar.getClass();
                        lVar.c(d10, data2, t0.f3717c);
                    } else {
                        lVar.c(d10, data2, t0Var);
                    }
                }
            }
            return FlutterFirebaseFirestoreTransactionResult.complete();
        } catch (InterruptedException unused) {
            return FlutterFirebaseFirestoreTransactionResult.failed(new com.google.firebase.firestore.f("interrupted", f.a.DEADLINE_EXCEEDED));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onListen$2(EventChannel.EventSink eventSink, HashMap hashMap) {
        eventSink.success(hashMap);
        eventSink.endOfStream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onListen$3(EventChannel.EventSink eventSink, Task task) {
        Object createDetails;
        String str;
        HashMap hashMap = new HashMap();
        if (task.getException() == null && ((FlutterFirebaseFirestoreTransactionResult) task.getResult()).exception == null) {
            if (task.getResult() != null) {
                createDetails = Boolean.TRUE;
                str = "complete";
            }
            this.mainLooper.post(new q(28, eventSink, hashMap));
        }
        Exception exception = task.getException() != null ? task.getException() : ((FlutterFirebaseFirestoreTransactionResult) task.getResult()).exception;
        u7.f fVar = this.firestore.f3134g;
        fVar.a();
        hashMap.put("appName", fVar.f15085b);
        createDetails = ExceptionConverter.createDetails(exception);
        str = "error";
        hashMap.put(str, createDetails);
        this.mainLooper.post(new q(28, eventSink, hashMap));
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.semaphore.release();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        Task task;
        final FirebaseFirestore firebaseFirestore = this.firestore;
        int intValue = this.maxAttempts.intValue();
        int i10 = 1;
        if (intValue < 1) {
            throw new IllegalArgumentException("Max attempts must be at least 1");
        }
        final x0 x0Var = new x0(intValue);
        final h hVar = new h(11, this, eventSink);
        firebaseFirestore.getClass();
        final ThreadPoolExecutor threadPoolExecutor = m0.f6025g;
        firebaseFirestore.f3138k.b();
        final n9.i iVar = new n9.i() { // from class: d9.t
            @Override // n9.i
            public final Object apply(Object obj2) {
                final FirebaseFirestore firebaseFirestore2 = FirebaseFirestore.this;
                Executor executor = threadPoolExecutor;
                final l.a aVar = hVar;
                final g9.m0 m0Var = (g9.m0) obj2;
                firebaseFirestore2.getClass();
                return Tasks.call(executor, new Callable() { // from class: d9.v
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        FlutterFirebaseFirestoreTransactionResult lambda$onListen$1;
                        FirebaseFirestore firebaseFirestore3 = FirebaseFirestore.this;
                        l.a aVar2 = aVar;
                        g9.m0 m0Var2 = m0Var;
                        firebaseFirestore3.getClass();
                        q3.h hVar2 = (q3.h) aVar2;
                        lambda$onListen$1 = ((TransactionStreamHandler) hVar2.f13246b).lambda$onListen$1((EventChannel.EventSink) hVar2.f13247c, new com.google.firebase.firestore.l(m0Var2, firebaseFirestore3));
                        return lambda$onListen$1;
                    }
                });
            }
        };
        x xVar = firebaseFirestore.f3138k;
        synchronized (xVar) {
            xVar.b();
            final u uVar = xVar.f3734b;
            uVar.d();
            a.b bVar = uVar.f6090d.f11322a;
            Callable callable = new Callable() { // from class: g9.t
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    u uVar2 = uVar;
                    n0 n0Var = new n0(uVar2.f6090d, uVar2.f6094i.f5980b, x0Var, iVar);
                    n0Var.f6036d--;
                    n0Var.f6037e.a(new b.d(n0Var, 15));
                    return n0Var.f.getTask();
                }
            };
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            bVar.execute(new g(callable, bVar, taskCompletionSource, 9));
            task = taskCompletionSource.getTask();
        }
        task.addOnCompleteListener(new k1.a(i10, this, eventSink));
    }

    @Override // io.flutter.plugins.firebase.firestore.streamhandler.OnTransactionResultListener
    public void receiveTransactionResponse(GeneratedAndroidFirebaseFirestore.PigeonTransactionResult pigeonTransactionResult, List<GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand> list) {
        this.resultType = pigeonTransactionResult;
        this.commands = list;
        this.semaphore.release();
    }
}

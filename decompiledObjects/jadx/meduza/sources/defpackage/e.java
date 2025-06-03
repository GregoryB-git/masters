package defpackage;

import a4.g;
import aa.l0;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.messaging.FirebaseMessaging;
import g9.f0;
import g9.h;
import g9.r;
import g9.s0;
import g9.u;
import i8.c;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import io.flutter.plugins.googlesignin.BackgroundTaskRunner;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import io.flutter.plugins.googlesignin.Messages;
import io.flutter.plugins.pathprovider.Messages;
import io.flutter.plugins.pathprovider.d;
import io.flutter.plugins.urllauncher.Messages;
import j9.f;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.regex.Pattern;
import n7.q;
import n9.i;
import o4.p;
import q3.k;
import r5.o;
import s3.b;
import t9.a;
import u7.m;
import v3.f1;
import v3.g0;
import v3.i0;
import v3.m1;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements BasicMessageChannel.MessageHandler, b.a, l.a, v5.e, p.f, i8.b, Continuation, a.InterfaceC0234a, OnSuccessListener, KeyEventChannel.EventResponseHandler, BasicMessageChannel.Reply, BackgroundTaskRunner.Callback, OnCompleteListener, i, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3745b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f3744a = i10;
        this.f3745b = obj;
    }

    @Override // s3.b.a
    public Object a() {
        ((k) this.f3745b).f13262i.g();
        return null;
    }

    @Override // v5.e
    public void accept(Object obj) {
        ((g.a) obj).e((Exception) this.f3745b);
    }

    @Override // n9.i
    public Object apply(Object obj) {
        u uVar;
        switch (this.f3744a) {
            case 0:
                d9.a aVar = (d9.a) this.f3745b;
                u uVar2 = (u) obj;
                f0 f0Var = aVar.f3636a.f3189a;
                List<com.google.firebase.firestore.a> list = aVar.f3637b;
                uVar2.d();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                uVar2.f6090d.a(new r(uVar2, f0Var, list, taskCompletionSource, 0));
                return taskCompletionSource.getTask();
            case 1:
                return ((u) obj).e((List) this.f3745b);
            case 2:
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f3745b;
                n9.a aVar2 = (n9.a) obj;
                synchronized (firebaseFirestore.f3138k) {
                    f fVar = firebaseFirestore.f3131c;
                    String str = firebaseFirestore.f3132d;
                    com.google.firebase.firestore.g gVar = firebaseFirestore.f3137j;
                    uVar = new u(firebaseFirestore.f3130b, new h(fVar, str, gVar.f3174a, gVar.f3175b), firebaseFirestore.f3133e, firebaseFirestore.f, aVar2, firebaseFirestore.f3139l, firebaseFirestore.f3129a.apply(gVar));
                }
                return uVar;
            default:
                String str2 = (String) this.f3745b;
                Cursor cursor = (Cursor) obj;
                if (cursor == null) {
                    return null;
                }
                return new f9.e(str2, cursor.getInt(0), new j9.q(new m(cursor.getInt(2), cursor.getLong(1))), cursor.getInt(3), cursor.getLong(4));
        }
    }

    @Override // o4.p.f
    public int b(Object obj) {
        i0 i0Var = (i0) this.f3745b;
        o4.l lVar = (o4.l) obj;
        Pattern pattern = p.f11853a;
        return ((lVar.f11805b.equals(i0Var.t) || lVar.f11805b.equals(p.b(i0Var))) && lVar.c(i0Var, false)) ? 1 : 0;
    }

    @Override // i8.b
    public void c(i8.a aVar) {
        f8.a aVar2 = (f8.a) this.f3745b;
        synchronized (aVar2) {
            if (aVar2.f5478c instanceof c) {
                aVar2.f5479d.add(aVar);
            }
            aVar2.f5478c.c(aVar);
        }
    }

    @Override // n7.q
    public Object get() {
        switch (this.f3744a) {
            case 0:
                return (o) this.f3745b;
            case 1:
                return new r5.f((Context) this.f3745b);
            case 2:
                return (m1) this.f3745b;
            default:
                return Boolean.valueOf(((g0) this.f3745b).H);
        }
    }

    @Override // t9.a.InterfaceC0234a
    public void h(t9.b bVar) {
        e9.b bVar2 = (e9.b) this.f3745b;
        synchronized (bVar2) {
            a8.a aVar = (a8.a) bVar.get();
            bVar2.f4847b = aVar;
            if (aVar != null) {
                aVar.d();
            }
        }
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        ((f1.c) obj).r((List) this.f3745b);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f3744a) {
            case 0:
                l0.a((Intent) this.f3745b);
                break;
            case 1:
                ((ScheduledFuture) this.f3745b).cancel(false);
                break;
            case 2:
                FlutterFirebaseCorePlugin.lambda$listenToResponse$1((GeneratedAndroidFirebaseCore.Result) this.f3745b, task);
                break;
            default:
                ((GoogleSignInPlugin.Delegate) this.f3745b).lambda$signOut$0(task);
                break;
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.KeyEventChannel.EventResponseHandler
    public void onFrameworkResponse(boolean z10) {
        ((KeyboardManager.Responder.OnKeyEventHandledCallback) this.f3745b).onKeyEventHandled(z10);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List c10;
        switch (this.f3744a) {
            case 0:
                h hVar = (h) this.f3745b;
                ec.i.e(reply, "reply");
                try {
                    c10 = va.a.f(hVar.isEnabled());
                } catch (Throwable th) {
                    c10 = x6.b.c(th);
                }
                reply.reply(c10);
                break;
            case 13:
                GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.CC.c((GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi) this.f3745b, obj, reply);
                break;
            case 14:
                GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.d((GeneratedAndroidFirebaseCore.FirebaseAppHostApi) this.f3745b, obj, reply);
                break;
            case 17:
                d.e((Messages.PathProviderApi) this.f3745b, obj, reply);
                break;
            default:
                io.flutter.plugins.urllauncher.b.d((Messages.UrlLauncherApi) this.f3745b, obj, reply);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f3745b;
        i6.a aVar = (i6.a) obj;
        com.google.firebase.messaging.a aVar2 = FirebaseMessaging.f3229m;
        firebaseMessaging.getClass();
        if (aVar != null) {
            aa.q.b(aVar.f7564a);
            firebaseMessaging.h();
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        KeyEventChannel.lambda$createReplyHandler$0((KeyEventChannel.EventResponseHandler) this.f3745b, obj);
    }

    @Override // io.flutter.plugins.googlesignin.BackgroundTaskRunner.Callback
    public void run(Future future) {
        GoogleSignInPlugin.Delegate.lambda$clearAuthCache$3((Messages.Result) this.f3745b, future);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        com.google.firebase.firestore.i iVar = (com.google.firebase.firestore.i) this.f3745b;
        return new com.google.firebase.firestore.k(new com.google.firebase.firestore.i(iVar.f3189a, iVar.f3190b), (s0) task.getResult(), iVar.f3190b);
    }
}

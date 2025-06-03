package aa;

import aa.o0;
import android.database.Cursor;
import android.os.Bundle;
import c4.a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.f;
import com.google.firebase.messaging.FirebaseMessaging;
import d9.a1;
import i9.w0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import io.flutter.plugins.urllauncher.Messages;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import m9.b0;
import ma.n1;
import t9.a;
import v3.f1;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements OnCompleteListener, n9.i, l.a, a.d, h8.a, Continuation, b0.a, a.InterfaceC0234a, OnSuccessListener, BasicMessageChannel.MessageHandler, n7.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f339b;

    public /* synthetic */ m0(Object obj, int i10) {
        this.f338a = i10;
        this.f339b = obj;
    }

    @Override // c4.a.d
    public long a(long j10) {
        return v5.e0.j((j10 * r0.f2296e) / 1000000, 0L, ((c4.o) this.f339b).f2300j - 1);
    }

    @Override // n9.i
    public Object apply(Object obj) {
        int i10 = 0;
        switch (this.f338a) {
            case 0:
                g9.u uVar = (g9.u) obj;
                j9.i iVar = ((com.google.firebase.firestore.c) this.f339b).f3146a;
                uVar.d();
                n9.a aVar = uVar.f6090d;
                return aVar.f11322a.a(new g9.s(uVar, iVar, i10)).continueWith(new e0.d(27));
            case 1:
                return ((g9.u) obj).e((List) this.f339b);
            case 2:
                return ((g9.u) obj).e(((a1) this.f339b).f3642b);
            case 3:
                i9.m0 m0Var = (i9.m0) this.f339b;
                Cursor cursor = (Cursor) obj;
                m0Var.getClass();
                return m0Var.g(cursor.getBlob(0), cursor.getInt(1));
            default:
                w0 w0Var = (w0) this.f339b;
                Cursor cursor2 = (Cursor) obj;
                w0Var.getClass();
                return w0Var.l(cursor2.getBlob(1), cursor2.getInt(0));
        }
    }

    @Override // h8.a
    public void d(Bundle bundle) {
        ((f8.a) this.f339b).f5477b.d(bundle);
    }

    @Override // n7.q
    public Object get() {
        switch (this.f338a) {
            case 0:
                return (v3.n0) this.f339b;
            default:
                return ((i9.n) this.f339b).f7744b;
        }
    }

    @Override // t9.a.InterfaceC0234a
    public void h(t9.b bVar) {
        o9.b bVar2 = (o9.b) this.f339b;
        ec.i.e(bVar2, "this$0");
        ec.i.e(bVar, "p");
        a8.a aVar = (a8.a) bVar.get();
        bVar2.f12085e.set(aVar);
        aVar.d();
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        switch (this.f338a) {
            case 2:
                ((f1.c) obj).l0((v3.m) this.f339b);
                break;
            case 3:
                ((f1.c) obj).b((w5.o) this.f339b);
                break;
            default:
                ((w3.b) obj).v0();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f338a) {
            case 0:
                ((o0.a) this.f339b).f353b.trySetResult(null);
                break;
            case 1:
                FlutterFirebaseAnalyticsPlugin.lambda$onMethodCall$0((MethodChannel.Result) this.f339b, task);
                break;
            default:
                ((GoogleSignInPlugin.Delegate) this.f339b).onSignInResult(task);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.f338a) {
            case 14:
                io.flutter.plugins.firebase.auth.y.b((GeneratedAndroidFirebaseAuth.GenerateInterfaces) this.f339b, obj, reply);
                break;
            case 15:
                GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.CC.d((GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi) this.f339b, obj, reply);
                break;
            case 16:
                GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.c((GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi) this.f339b, obj, reply);
                break;
            case 17:
                GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.b((GeneratedAndroidFirebaseCore.FirebaseCoreHostApi) this.f339b, obj, reply);
                break;
            default:
                io.flutter.plugins.urllauncher.b.e((Messages.UrlLauncherApi) this.f339b, obj, reply);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean booleanValue;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f339b;
        j0 j0Var = (j0) obj;
        com.google.firebase.messaging.a aVar = FirebaseMessaging.f3229m;
        FirebaseMessaging.a aVar2 = firebaseMessaging.f;
        synchronized (aVar2) {
            aVar2.a();
            Boolean bool = aVar2.f3245d;
            booleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f3232a.k();
        }
        if (booleanValue) {
            j0Var.f();
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f338a) {
            case 7:
                return (Task) ((Callable) this.f339b).call();
            case 8:
                com.google.firebase.firestore.l lVar = (com.google.firebase.firestore.l) this.f339b;
                lVar.getClass();
                if (!task.isSuccessful()) {
                    throw task.getException();
                }
                List list = (List) task.getResult();
                if (list.size() != 1) {
                    x6.b.T("Mismatch in docs returned from document lookup.", new Object[0]);
                    throw null;
                }
                j9.m mVar = (j9.m) list.get(0);
                if (mVar.b()) {
                    return new com.google.firebase.firestore.d(lVar.f3199b, mVar.getKey(), mVar, false, false);
                }
                if (mVar.h()) {
                    return new com.google.firebase.firestore.d(lVar.f3199b, mVar.f8693b, null, false, false);
                }
                StringBuilder l10 = defpackage.f.l("BatchGetDocumentsRequest returned unexpected document type: ");
                l10.append(j9.m.class.getCanonicalName());
                x6.b.T(l10.toString(), new Object[0]);
                throw null;
            case 9:
                m9.j jVar = (m9.j) this.f339b;
                HashSet hashSet = m9.j.f10815d;
                jVar.getClass();
                if (!task.isSuccessful()) {
                    if ((task.getException() instanceof com.google.firebase.firestore.f) && ((com.google.firebase.firestore.f) task.getException()).f3161a == f.a.UNAUTHENTICATED) {
                        m9.v vVar = jVar.f10818c;
                        vVar.f10894b.t();
                        vVar.f10895c.t();
                    }
                    throw task.getException();
                }
                ka.i iVar = (ka.i) task.getResult();
                m9.e0 e0Var = jVar.f10816a;
                n1 G = iVar.G();
                e0Var.getClass();
                j9.q f = m9.e0.f(G);
                int J = iVar.J();
                ArrayList arrayList = new ArrayList(J);
                for (int i10 = 0; i10 < J; i10++) {
                    ka.h0 I = iVar.I(i10);
                    jVar.f10816a.getClass();
                    arrayList.add(m9.e0.d(I, f));
                }
                return arrayList;
            default:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f339b;
                if (task.isSuccessful()) {
                    taskCompletionSource.setResult(task.getResult());
                } else {
                    taskCompletionSource.setException(task.getException());
                }
                return null;
        }
    }
}

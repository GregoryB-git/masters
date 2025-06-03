package defpackage;

import aa.g0;
import aa.j0;
import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import d8.e;
import e0.c;
import e0.d0;
import ea.k;
import ea.y;
import ea.z;
import ec.i;
import h3.g;
import i9.n;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.Constants;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin;
import io.flutter.util.ViewUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import n7.q;
import n9.j;
import o7.l0;
import r3.c;
import s3.b;
import t9.a;
import v3.f1;
import v5.e0;
import v5.l;
import z4.x;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements BasicMessageChannel.MessageHandler, i0.d, b.a, l.a, x.a, Continuation, a.InterfaceC0234a, OnFailureListener, SuccessContinuation, g, ViewUtils.ViewVisitor, e, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3304b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f3303a = i10;
        this.f3304b = obj;
    }

    @Override // s3.b.a
    public Object a() {
        return ((c) this.f3304b).H();
    }

    @Override // h3.g
    public Object apply(Object obj) {
        y yVar = (y) obj;
        ((k) this.f3304b).getClass();
        z.f5010a.getClass();
        String a10 = z.f5011b.a(yVar);
        i.d(a10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event Type: " + yVar.f5007a.name());
        byte[] bytes = a10.getBytes(lc.a.f9829a);
        i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public boolean b(i0.e eVar, int i10, Bundle bundle) {
        View view = (View) this.f3304b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                eVar.f7349a.b();
                Parcelable parcelable = (Parcelable) eVar.f7349a.d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        ClipData clipData = new ClipData(eVar.f7349a.getDescription(), new ClipData.Item(eVar.f7349a.a()));
        c.b aVar = i11 >= 31 ? new c.a(clipData, 2) : new c.C0066c(clipData, 2);
        aVar.a(eVar.f7349a.c());
        aVar.setExtras(bundle);
        return d0.f(view, aVar.build()) == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x01c3, code lost:
    
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x045f  */
    @Override // d8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(d8.u r45) {
        /*
            Method dump skipped, instructions count: 1628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.g(d8.u):java.lang.Object");
    }

    @Override // n7.q
    public Object get() {
        t5.q qVar;
        String country;
        TelephonyManager telephonyManager;
        switch (this.f3303a) {
            case 0:
                return new v3.l((Context) this.f3304b);
            case 1:
                Context context = (Context) this.f3304b;
                l0 l0Var = t5.q.f14562n;
                synchronized (t5.q.class) {
                    if (t5.q.t == null) {
                        Context applicationContext = context == null ? null : context.getApplicationContext();
                        int i10 = e0.f15881a;
                        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE)) != null) {
                            country = telephonyManager.getNetworkCountryIso();
                            if (!TextUtils.isEmpty(country)) {
                                int[] j10 = t5.q.j(x6.b.y0(country));
                                HashMap hashMap = new HashMap(8);
                                hashMap.put(0, 1000000L);
                                l0 l0Var2 = t5.q.f14562n;
                                hashMap.put(2, (Long) l0Var2.get(j10[0]));
                                hashMap.put(3, (Long) t5.q.f14563o.get(j10[1]));
                                hashMap.put(4, (Long) t5.q.f14564p.get(j10[2]));
                                hashMap.put(5, (Long) t5.q.f14565q.get(j10[3]));
                                hashMap.put(10, (Long) t5.q.f14566r.get(j10[4]));
                                hashMap.put(9, (Long) t5.q.f14567s.get(j10[5]));
                                hashMap.put(7, (Long) l0Var2.get(j10[0]));
                                t5.q.t = new t5.q(applicationContext, hashMap, 2000, v5.c.f15872a, true);
                            }
                        }
                        country = Locale.getDefault().getCountry();
                        int[] j102 = t5.q.j(x6.b.y0(country));
                        HashMap hashMap2 = new HashMap(8);
                        hashMap2.put(0, 1000000L);
                        l0 l0Var22 = t5.q.f14562n;
                        hashMap2.put(2, (Long) l0Var22.get(j102[0]));
                        hashMap2.put(3, (Long) t5.q.f14563o.get(j102[1]));
                        hashMap2.put(4, (Long) t5.q.f14564p.get(j102[2]));
                        hashMap2.put(5, (Long) t5.q.f14565q.get(j102[3]));
                        hashMap2.put(10, (Long) t5.q.f14566r.get(j102[4]));
                        hashMap2.put(9, (Long) t5.q.f14567s.get(j102[5]));
                        hashMap2.put(7, (Long) l0Var22.get(j102[0]));
                        t5.q.t = new t5.q(applicationContext, hashMap2, 2000, v5.c.f15872a, true);
                    }
                    qVar = t5.q.t;
                }
                return qVar;
            default:
                return ((n) this.f3304b).f;
        }
    }

    @Override // t9.a.InterfaceC0234a
    public void h(t9.b bVar) {
        e9.d dVar = (e9.d) this.f3304b;
        synchronized (dVar) {
            dVar.f4850c = (c8.b) bVar.get();
            synchronized (dVar) {
                dVar.f4852e++;
                j<e9.e> jVar = dVar.f4851d;
                if (jVar != null) {
                    synchronized (dVar) {
                        c8.b bVar2 = dVar.f4850c;
                        String a10 = bVar2 == null ? null : bVar2.a();
                        jVar.a(a10 != null ? new e9.e(a10) : e9.e.f4853b);
                    }
                }
            }
        }
        dVar.f4850c.b(dVar.f4849b);
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        switch (this.f3303a) {
            case 4:
                x3.d dVar = (x3.d) this.f3304b;
                int i10 = v3.d0.f15267h0;
                ((f1.c) obj).d0(dVar);
                break;
            case 5:
                ((f1.c) obj).w((p4.a) this.f3304b);
                break;
            default:
                ((f1.c) obj).j((h5.c) this.f3304b);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.f3303a) {
            case 11:
                ((TaskCompletionSource) this.f3304b).setException(exc);
                break;
            default:
                ((FlutterFirebaseDynamicLinksPlugin) this.f3304b).lambda$onNewIntent$1(exc);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List c10;
        switch (this.f3303a) {
            case 0:
                h hVar = (h) this.f3304b;
                i.e(reply, "reply");
                i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                i.c(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
                try {
                    hVar.a((b) obj2);
                    c10 = va.a.f(null);
                } catch (Throwable th) {
                    c10 = x6.b.c(th);
                }
                reply.reply(c10);
                break;
            case 15:
                GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.CC.b((GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi) this.f3304b, obj, reply);
                break;
            case 16:
                GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.CC.c((GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi) this.f3304b, obj, reply);
                break;
            case 17:
                GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.e((GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi) this.f3304b, obj, reply);
                break;
            case 18:
                GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.c((GeneratedAndroidFirebaseCore.FirebaseAppHostApi) this.f3304b, obj, reply);
                break;
            default:
                GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.d((GeneratedAndroidFirebaseCore.FirebaseCoreHostApi) this.f3304b, obj, reply);
                break;
        }
    }

    @Override // io.flutter.util.ViewUtils.ViewVisitor
    public boolean run(View view) {
        boolean lambda$hasChildViewOfType$1;
        lambda$hasChildViewOfType$1 = ViewUtils.lambda$hasChildViewOfType$1((Class[]) this.f3304b, view);
        return lambda$hasChildViewOfType$1;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        String b10;
        switch (this.f3303a) {
            case 12:
                o9.b bVar = (o9.b) this.f3304b;
                z7.a aVar = (z7.a) obj;
                i.e(bVar, "this$0");
                i.e(aVar, "result");
                if (aVar.a() != null) {
                    String str = bVar.f12084d;
                    StringBuilder l10 = f.l("Error getting App Check token. Error: ");
                    l10.append(aVar.a());
                    Log.w(str, l10.toString());
                    b10 = null;
                } else {
                    b10 = aVar.b();
                }
                return Tasks.forResult(b10);
            default:
                String str2 = (String) this.f3304b;
                j0 j0Var = (j0) obj;
                com.google.firebase.messaging.a aVar2 = FirebaseMessaging.f3229m;
                j0Var.getClass();
                Task<Void> e10 = j0Var.e(new g0("S", str2));
                j0Var.f();
                return e10;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        com.google.firebase.firestore.c cVar = (com.google.firebase.firestore.c) this.f3304b;
        cVar.getClass();
        j9.g gVar = (j9.g) task.getResult();
        return new com.google.firebase.firestore.d(cVar.f3147b, cVar.f3146a, gVar, true, gVar != null && gVar.d());
    }
}

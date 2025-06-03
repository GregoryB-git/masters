package k6;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collection;
import java.util.Collections;
import k6.a;
import k6.a.d;
import k6.e;
import l6.d0;
import l6.h;
import l6.h0;
import l6.m0;
import l6.v;
import l6.w;
import l6.x0;
import l6.y0;
import l6.z0;
import m6.a;

/* loaded from: classes.dex */
public abstract class d<O extends a.d> {
    public final l6.d zaa;
    private final Context zab;
    private final String zac;
    private final k6.a zad;
    private final a.d zae;
    private final l6.a zaf;
    private final Looper zag;
    private final int zah;
    private final e zai;
    private final l6.o zaj;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f9097c = new a(new z4.i(1), Looper.getMainLooper());

        /* renamed from: a, reason: collision with root package name */
        public final l6.o f9098a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f9099b;

        public a(l6.o oVar, Looper looper) {
            this.f9098a = oVar;
            this.f9099b = looper;
        }
    }

    public d(Activity activity, k6.a<O> aVar, O o10, a aVar2) {
        this(activity, activity, aVar, o10, aVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(android.app.Activity r3, k6.a<O> r4, O r5, l6.o r6) {
        /*
            r2 = this;
            if (r6 == 0) goto L14
            android.os.Looper r0 = r3.getMainLooper()
            java.lang.String r1 = "Looper must not be null."
            m6.j.j(r0, r1)
            k6.d$a r1 = new k6.d$a
            r1.<init>(r6, r0)
            r2.<init>(r3, r4, r5, r1)
            return
        L14:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "StatusExceptionMapper must not be null."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.d.<init>(android.app.Activity, k6.a, k6.a$d, l6.o):void");
    }

    public d(Context context, k6.a<O> aVar, O o10, a aVar2) {
        this(context, (Activity) null, aVar, o10, aVar2);
    }

    private final com.google.android.gms.common.api.internal.a zad(int i10, com.google.android.gms.common.api.internal.a aVar) {
        aVar.zak();
        l6.d dVar = this.zaa;
        dVar.getClass();
        dVar.f9655v.sendMessage(dVar.f9655v.obtainMessage(4, new m0(new x0(i10, aVar), dVar.f9651q.get(), this)));
        return aVar;
    }

    private final Task zae(int i10, l6.q qVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        l6.o oVar = this.zaj;
        l6.d dVar = this.zaa;
        dVar.getClass();
        dVar.f(taskCompletionSource, qVar.f9713c, this);
        dVar.f9655v.sendMessage(dVar.f9655v.obtainMessage(4, new m0(new y0(i10, qVar, taskCompletionSource, oVar), dVar.f9651q.get(), this)));
        return taskCompletionSource.getTask();
    }

    public e asGoogleApiClient() {
        return this.zai;
    }

    public a.C0148a createClientSettingsBuilder() {
        Account u10;
        GoogleSignInAccount r10;
        GoogleSignInAccount r11;
        a.C0148a c0148a = new a.C0148a();
        a.d dVar = this.zae;
        if (!(dVar instanceof a.d.b) || (r11 = ((a.d.b) dVar).r()) == null) {
            a.d dVar2 = this.zae;
            if (dVar2 instanceof a.d.InterfaceC0131a) {
                u10 = ((a.d.InterfaceC0131a) dVar2).u();
            }
            u10 = null;
        } else {
            String str = r11.f2765d;
            if (str != null) {
                u10 = new Account(str, "com.google");
            }
            u10 = null;
        }
        c0148a.f10247a = u10;
        a.d dVar3 = this.zae;
        Collection emptySet = (!(dVar3 instanceof a.d.b) || (r10 = ((a.d.b) dVar3).r()) == null) ? Collections.emptySet() : r10.D();
        if (c0148a.f10248b == null) {
            c0148a.f10248b = new r.d();
        }
        c0148a.f10248b.addAll(emptySet);
        c0148a.f10250d = this.zab.getClass().getName();
        c0148a.f10249c = this.zab.getPackageName();
        return c0148a;
    }

    public Task<Boolean> disconnectService() {
        l6.d dVar = this.zaa;
        dVar.getClass();
        w wVar = new w(getApiKey());
        dVar.f9655v.sendMessage(dVar.f9655v.obtainMessage(14, wVar));
        return wVar.f9739b.getTask();
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends j, A>> T doBestEffortWrite(T t) {
        zad(2, t);
        return t;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doBestEffortWrite(l6.q<A, TResult> qVar) {
        return zae(2, qVar);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends j, A>> T doRead(T t) {
        zad(0, t);
        return t;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doRead(l6.q<A, TResult> qVar) {
        return zae(0, qVar);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends a.b, T extends l6.l<A, ?>, U extends l6.r<A, ?>> Task<Void> doRegisterEventListener(T t, U u10) {
        m6.j.i(t);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b> Task<Void> doRegisterEventListener(l6.m<A, ?> mVar) {
        m6.j.i(mVar);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(h.a<?> aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(h.a<?> aVar, int i10) {
        if (aVar == null) {
            throw new NullPointerException("Listener key cannot be null.");
        }
        l6.d dVar = this.zaa;
        dVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        dVar.f(taskCompletionSource, i10, this);
        dVar.f9655v.sendMessage(dVar.f9655v.obtainMessage(13, new m0(new z0(aVar, taskCompletionSource), dVar.f9651q.get(), this)));
        return taskCompletionSource.getTask();
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends j, A>> T doWrite(T t) {
        zad(1, t);
        return t;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doWrite(l6.q<A, TResult> qVar) {
        return zae(1, qVar);
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final l6.a<O> getApiKey() {
        return this.zaf;
    }

    public O getApiOptions() {
        return (O) this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> l6.h<L> registerListener(L l10, String str) {
        Looper looper = this.zag;
        if (l10 == null) {
            throw new NullPointerException("Listener must not be null");
        }
        m6.j.j(looper, "Looper must not be null");
        if (str != null) {
            return new l6.h<>(looper, l10, str);
        }
        throw new NullPointerException("Listener type must not be null");
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f zab(Looper looper, d0 d0Var) {
        a.C0148a createClientSettingsBuilder = createClientSettingsBuilder();
        m6.a aVar = new m6.a(createClientSettingsBuilder.f10247a, createClientSettingsBuilder.f10248b, createClientSettingsBuilder.f10249c, createClientSettingsBuilder.f10250d);
        a.AbstractC0130a abstractC0130a = this.zad.f9093a;
        m6.j.i(abstractC0130a);
        a.f buildClient = abstractC0130a.buildClient(this.zab, looper, aVar, (m6.a) this.zae, (e.a) d0Var, (e.b) d0Var);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof l6.i)) {
            ((l6.i) buildClient).getClass();
        }
        return buildClient;
    }

    public final zact zac(Context context, Handler handler) {
        a.C0148a createClientSettingsBuilder = createClientSettingsBuilder();
        return new zact(context, handler, new m6.a(createClientSettingsBuilder.f10247a, createClientSettingsBuilder.f10248b, createClientSettingsBuilder.f10249c, createClientSettingsBuilder.f10250d));
    }

    private d(Context context, Activity activity, k6.a aVar, a.d dVar, a aVar2) {
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        }
        if (aVar == null) {
            throw new NullPointerException("Api must not be null.");
        }
        if (aVar2 != null) {
            Context applicationContext = context.getApplicationContext();
            m6.j.j(applicationContext, "The provided context did not have an application context.");
            this.zab = applicationContext;
            String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : getApiFallbackAttributionTag(context);
            this.zac = attributionTag;
            this.zad = aVar;
            this.zae = dVar;
            this.zag = aVar2.f9099b;
            l6.a aVar3 = new l6.a(aVar, dVar, attributionTag);
            this.zaf = aVar3;
            this.zai = new h0(this);
            l6.d g10 = l6.d.g(applicationContext);
            this.zaa = g10;
            this.zah = g10.f9650p.getAndIncrement();
            this.zaj = aVar2.f9098a;
            if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
                l6.g fragment = l6.f.getFragment(activity);
                v vVar = (v) fragment.a(v.class, "ConnectionlessLifecycleHelper");
                vVar = vVar == null ? new v(fragment, g10, j6.e.f8488d) : vVar;
                vVar.f9731e.add(aVar3);
                g10.a(vVar);
            }
            zau zauVar = g10.f9655v;
            zauVar.sendMessage(zauVar.obtainMessage(7, this));
            return;
        }
        throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public d(Context context, k6.a<O> aVar, O o10, Looper looper, l6.o oVar) {
        this(context, aVar, o10, new a(oVar, looper));
        if (looper == null) {
            throw new NullPointerException("Looper must not be null.");
        }
        if (oVar != null) {
            return;
        }
        throw new NullPointerException("StatusExceptionMapper must not be null.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public d(Context context, k6.a<O> aVar, O o10, l6.o oVar) {
        this(context, aVar, o10, new a(oVar, Looper.getMainLooper()));
        if (oVar != null) {
            return;
        }
        throw new NullPointerException("StatusExceptionMapper must not be null.");
    }
}

package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k6.e;
import k6.g;
import k6.h;
import k6.j;
import k6.k;
import k6.l;
import k6.m;
import l6.f1;
import l6.g1;
import l6.v0;
import l6.w0;

/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends j> extends g<R> {
    public static final ThreadLocal zaa = new f1(0);
    public static final /* synthetic */ int zad = 0;
    private g1 resultGuardian;
    public final a zab;
    public final WeakReference zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList zag;
    private k zah;
    private final AtomicReference zai;
    private j zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private ICancelToken zao;
    private volatile v0 zap;
    private boolean zaq;

    public static class a<R extends j> extends zau {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(k kVar, j jVar) {
            ThreadLocal threadLocal = BasePendingResult.zaa;
            m6.j.i(kVar);
            sendMessage(obtainMessage(1, new Pair(kVar, jVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    Log.wtf("BasePendingResult", f.h("Don't know how to handle message: ", i10), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f2814p);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            k kVar = (k) pair.first;
            j jVar = (j) pair.second;
            try {
                kVar.a(jVar);
            } catch (RuntimeException e10) {
                BasePendingResult.zal(jVar);
                throw e10;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(Looper.getMainLooper());
        this.zac = new WeakReference(null);
    }

    @Deprecated
    public BasePendingResult(Looper looper) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(looper);
        this.zac = new WeakReference(null);
    }

    public BasePendingResult(a<R> aVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        if (aVar == null) {
            throw new NullPointerException("CallbackHandler must not be null");
        }
        this.zab = aVar;
        this.zac = new WeakReference(null);
    }

    public BasePendingResult(e eVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(eVar != null ? eVar.c() : Looper.getMainLooper());
        this.zac = new WeakReference(eVar);
    }

    private final j zaa() {
        j jVar;
        synchronized (this.zae) {
            m6.j.k(!this.zal, "Result has already been consumed.");
            m6.j.k(isReady(), "Result is not ready.");
            jVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (((w0) this.zai.getAndSet(null)) != null) {
            throw null;
        }
        m6.j.i(jVar);
        return jVar;
    }

    private final void zab(j jVar) {
        this.zaj = jVar;
        this.zak = jVar.getStatus();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            k kVar = this.zah;
            if (kVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(kVar, zaa());
            } else if (this.zaj instanceof h) {
                this.resultGuardian = new g1(this);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g.a) arrayList.get(i10)).a(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(j jVar) {
        if (jVar instanceof h) {
            try {
                ((h) jVar).release();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(jVar)), e10);
            }
        }
    }

    @Override // k6.g
    public final void addStatusListener(g.a aVar) {
        m6.j.a("Callback cannot be null.", aVar != null);
        synchronized (this.zae) {
            if (isReady()) {
                aVar.a(this.zak);
            } else {
                this.zag.add(aVar);
            }
        }
    }

    @Override // k6.g
    @ResultIgnorabilityUnspecified
    public final R await() {
        m6.j.h("await must not be called on the UI thread");
        m6.j.k(!this.zal, "Result has already been consumed");
        m6.j.k(this.zap == null, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f);
        }
        m6.j.k(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // k6.g
    @ResultIgnorabilityUnspecified
    public final R await(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            m6.j.h("await must not be called on the UI thread when time is greater than zero.");
        }
        m6.j.k(!this.zal, "Result has already been consumed.");
        m6.j.k(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j10, timeUnit)) {
                forceFailureUnlessReady(Status.f2814p);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f);
        }
        m6.j.k(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // k6.g
    public void cancel() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                ICancelToken iCancelToken = this.zao;
                if (iCancelToken != null) {
                    try {
                        iCancelToken.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                zal(this.zaj);
                this.zam = true;
                zab(createFailedResult(Status.f2815q));
            }
        }
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    @Override // k6.g
    public final boolean isCanceled() {
        boolean z10;
        synchronized (this.zae) {
            z10 = this.zam;
        }
        return z10;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(ICancelToken iCancelToken) {
        synchronized (this.zae) {
            this.zao = iCancelToken;
        }
    }

    public final void setResult(R r10) {
        synchronized (this.zae) {
            if (this.zan || this.zam) {
                zal(r10);
                return;
            }
            isReady();
            m6.j.k(!isReady(), "Results have already been set");
            m6.j.k(!this.zal, "Result has already been consumed");
            zab(r10);
        }
    }

    @Override // k6.g
    public final void setResultCallback(k<? super R> kVar) {
        synchronized (this.zae) {
            if (kVar == null) {
                this.zah = null;
                return;
            }
            boolean z10 = true;
            m6.j.k(!this.zal, "Result has already been consumed.");
            if (this.zap != null) {
                z10 = false;
            }
            m6.j.k(z10, "Cannot set callbacks if then() has been called.");
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zab.a(kVar, zaa());
            } else {
                this.zah = kVar;
            }
        }
    }

    @Override // k6.g
    public final void setResultCallback(k<? super R> kVar, long j10, TimeUnit timeUnit) {
        synchronized (this.zae) {
            if (kVar == null) {
                this.zah = null;
                return;
            }
            boolean z10 = true;
            m6.j.k(!this.zal, "Result has already been consumed.");
            if (this.zap != null) {
                z10 = false;
            }
            m6.j.k(z10, "Cannot set callbacks if then() has been called.");
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zab.a(kVar, zaa());
            } else {
                this.zah = kVar;
                a aVar = this.zab;
                aVar.sendMessageDelayed(aVar.obtainMessage(2, this), timeUnit.toMillis(j10));
            }
        }
    }

    @Override // k6.g
    public final <S extends j> m<S> then(l<? super R, ? extends S> lVar) {
        v0 v0Var;
        m6.j.k(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            m6.j.k(this.zap == null, "Cannot call then() twice.");
            m6.j.k(this.zah == null, "Cannot call then() if callbacks are set.");
            m6.j.k(!this.zam, "Cannot call then() if result was canceled.");
            this.zaq = true;
            this.zap = new v0(this.zac);
            v0 v0Var2 = this.zap;
            synchronized (v0Var2.f9734c) {
                v0Var2.getClass();
                m6.j.k(true, "Cannot call then() twice.");
                v0Var2.getClass();
                v0Var = new v0(v0Var2.f9736e);
                v0Var2.f9732a = v0Var;
                v0Var2.c();
            }
            if (isReady()) {
                this.zab.a(this.zap, zaa());
            } else {
                this.zah = this.zap;
            }
        }
        return v0Var;
    }

    public final void zak() {
        boolean z10 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z10 = false;
        }
        this.zaq = z10;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            if (((e) this.zac.get()) == null || !this.zaq) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public final void zan(w0 w0Var) {
        this.zai.set(w0Var);
    }
}

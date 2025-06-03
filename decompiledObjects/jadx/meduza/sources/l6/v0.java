package l6;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import k6.j;

/* loaded from: classes.dex */
public final class v0<R extends k6.j> extends k6.m<R> implements k6.k<R> {

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f9736e;
    public final t0 f;

    /* renamed from: a, reason: collision with root package name */
    public v0 f9732a = null;

    /* renamed from: b, reason: collision with root package name */
    public k6.g f9733b = null;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9734c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public Status f9735d = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9737g = false;

    public v0(WeakReference weakReference) {
        if (weakReference == null) {
            throw new NullPointerException("GoogleApiClient reference must not be null");
        }
        this.f9736e = weakReference;
        k6.e eVar = (k6.e) weakReference.get();
        this.f = new t0(this, eVar != null ? eVar.c() : Looper.getMainLooper());
    }

    public static final void e(k6.j jVar) {
        if (jVar instanceof k6.h) {
            try {
                ((k6.h) jVar).release();
            } catch (RuntimeException e10) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(jVar)), e10);
            }
        }
    }

    @Override // k6.k
    public final void a(k6.j jVar) {
        synchronized (this.f9734c) {
            if (jVar.getStatus().D()) {
            } else {
                b(jVar.getStatus());
                e(jVar);
            }
        }
    }

    public final void b(Status status) {
        synchronized (this.f9734c) {
            this.f9735d = status;
            d(status);
        }
    }

    public final void c() {
    }

    public final void d(Status status) {
        synchronized (this.f9734c) {
        }
    }
}

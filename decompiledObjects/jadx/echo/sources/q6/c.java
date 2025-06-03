package q6;

import X5.g;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import p6.S;
import p6.W;
import p6.u0;

/* loaded from: classes.dex */
public final class c extends d implements S {
    private volatile c _immediate;

    /* renamed from: q, reason: collision with root package name */
    public final Handler f18894q;

    /* renamed from: r, reason: collision with root package name */
    public final String f18895r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f18896s;

    /* renamed from: t, reason: collision with root package name */
    public final c f18897t;

    public c(Handler handler, String str) {
        this(handler, str, false);
    }

    @Override // p6.F
    public void E(g gVar, Runnable runnable) {
        if (this.f18894q.post(runnable)) {
            return;
        }
        J(gVar, runnable);
    }

    @Override // p6.F
    public boolean F(g gVar) {
        return (this.f18896s && Intrinsics.a(Looper.myLooper(), this.f18894q.getLooper())) ? false : true;
    }

    public final void J(g gVar, Runnable runnable) {
        u0.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        W.b().E(gVar, runnable);
    }

    @Override // p6.B0
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public c H() {
        return this.f18897t;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f18894q == this.f18894q;
    }

    public int hashCode() {
        return System.identityHashCode(this.f18894q);
    }

    @Override // p6.F
    public String toString() {
        String I6 = I();
        if (I6 != null) {
            return I6;
        }
        String str = this.f18895r;
        if (str == null) {
            str = this.f18894q.toString();
        }
        if (!this.f18896s) {
            return str;
        }
        return str + ".immediate";
    }

    public /* synthetic */ c(Handler handler, String str, int i7, kotlin.jvm.internal.g gVar) {
        this(handler, (i7 & 2) != 0 ? null : str);
    }

    public c(Handler handler, String str, boolean z7) {
        super(null);
        this.f18894q = handler;
        this.f18895r = str;
        this.f18896s = z7;
        this._immediate = z7 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f18897t = cVar;
    }
}

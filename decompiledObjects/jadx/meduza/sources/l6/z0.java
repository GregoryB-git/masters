package l6;

import com.google.android.gms.tasks.TaskCompletionSource;
import l6.h;

/* loaded from: classes.dex */
public final class z0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public final h.a f9746c;

    public z0(h.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f9746c = aVar;
    }

    @Override // l6.a1
    public final /* bridge */ /* synthetic */ void d(u uVar, boolean z10) {
    }

    @Override // l6.j0
    public final boolean f(d0 d0Var) {
        if (((n0) d0Var.f.get(this.f9746c)) == null) {
            return false;
        }
        throw null;
    }

    @Override // l6.j0
    public final j6.d[] g(d0 d0Var) {
        if (((n0) d0Var.f.get(this.f9746c)) == null) {
            return null;
        }
        throw null;
    }

    @Override // l6.u0
    public final void h(d0 d0Var) {
        if (((n0) d0Var.f.remove(this.f9746c)) != null) {
            throw null;
        }
        this.f9730b.trySetResult(Boolean.FALSE);
    }
}

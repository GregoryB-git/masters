package l6;

import com.google.android.gms.tasks.TaskCompletionSource;
import k6.a;
import k6.a.b;

/* loaded from: classes.dex */
public abstract class q<A extends a.b, ResultT> {

    /* renamed from: a, reason: collision with root package name */
    public final j6.d[] f9711a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9712b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9713c;

    public static class a<A extends a.b, ResultT> {

        /* renamed from: a, reason: collision with root package name */
        public n f9714a;

        /* renamed from: c, reason: collision with root package name */
        public j6.d[] f9716c;

        /* renamed from: b, reason: collision with root package name */
        public boolean f9715b = true;

        /* renamed from: d, reason: collision with root package name */
        public int f9717d = 0;

        public final s0 a() {
            m6.j.a("execute parameter required", this.f9714a != null);
            return new s0(this, this.f9716c, this.f9715b, this.f9717d);
        }
    }

    public q(j6.d[] dVarArr, boolean z10, int i10) {
        this.f9711a = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.f9712b = z11;
        this.f9713c = i10;
    }

    public abstract void a(a.f fVar, TaskCompletionSource taskCompletionSource);
}

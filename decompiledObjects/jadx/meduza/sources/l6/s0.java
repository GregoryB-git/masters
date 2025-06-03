package l6;

import com.google.android.gms.tasks.TaskCompletionSource;
import k6.a;
import l6.q;

/* loaded from: classes.dex */
public final class s0 extends q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q.a f9723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(q.a aVar, j6.d[] dVarArr, boolean z10, int i10) {
        super(dVarArr, z10, i10);
        this.f9723d = aVar;
    }

    @Override // l6.q
    public final void a(a.f fVar, TaskCompletionSource taskCompletionSource) {
        this.f9723d.f9714a.accept(fVar, taskCompletionSource);
    }
}

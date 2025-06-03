package eb;

import eb.h1;
import nb.i;

/* loaded from: classes.dex */
public final class i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1.b f5131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f5132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5133c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h1 f5134d;

    public i1(h1 h1Var, h1.b bVar, i.d dVar, long j10) {
        this.f5134d = h1Var;
        this.f5131a = bVar;
        this.f5132b = dVar;
        this.f5133c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5134d.execute(this.f5131a);
    }

    public final String toString() {
        return this.f5132b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f5133c + ")";
    }
}

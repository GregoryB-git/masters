package v3;

import android.util.Pair;
import v3.z0;
import z4.t;

/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0.a f15801b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f15802c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z4.n f15803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z4.q f15804e;

    public /* synthetic */ v0(z0.a aVar, Pair pair, z4.n nVar, z4.q qVar, int i10) {
        this.f15800a = i10;
        this.f15801b = aVar;
        this.f15802c = pair;
        this.f15803d = nVar;
        this.f15804e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15800a) {
            case 0:
                z0.a aVar = this.f15801b;
                Pair pair = this.f15802c;
                aVar.f15836b.f15830h.h0(((Integer) pair.first).intValue(), (t.b) pair.second, this.f15803d, this.f15804e);
                break;
            default:
                z0.a aVar2 = this.f15801b;
                Pair pair2 = this.f15802c;
                aVar2.f15836b.f15830h.n0(((Integer) pair2.first).intValue(), (t.b) pair2.second, this.f15803d, this.f15804e);
                break;
        }
    }
}

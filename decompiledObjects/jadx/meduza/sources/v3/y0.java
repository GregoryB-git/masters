package v3;

import android.util.Pair;
import v3.z0;
import z4.t;

/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0.a f15820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f15821c;

    public /* synthetic */ y0(z0.a aVar, Pair pair, int i10) {
        this.f15819a = i10;
        this.f15820b = aVar;
        this.f15821c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15819a) {
            case 0:
                z0.a aVar = this.f15820b;
                Pair pair = this.f15821c;
                aVar.f15836b.f15830h.H(((Integer) pair.first).intValue(), (t.b) pair.second);
                break;
            default:
                z0.a aVar2 = this.f15820b;
                Pair pair2 = this.f15821c;
                aVar2.f15836b.f15830h.j0(((Integer) pair2.first).intValue(), (t.b) pair2.second);
                break;
        }
    }
}

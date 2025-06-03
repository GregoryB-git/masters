package w5;

import v5.e0;
import w5.n;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16412a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n.a f16413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16414c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f16415d;

    public /* synthetic */ k(n.a aVar, int i10, long j10) {
        this.f16413b = aVar;
        this.f16414c = i10;
        this.f16415d = j10;
    }

    public /* synthetic */ k(n.a aVar, long j10, int i10) {
        this.f16413b = aVar;
        this.f16415d = j10;
        this.f16414c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16412a) {
            case 0:
                n.a aVar = this.f16413b;
                long j10 = this.f16415d;
                int i10 = this.f16414c;
                n nVar = aVar.f16425b;
                int i11 = e0.f15881a;
                nVar.e(i10, j10);
                break;
            default:
                n.a aVar2 = this.f16413b;
                int i12 = this.f16414c;
                long j11 = this.f16415d;
                n nVar2 = aVar2.f16425b;
                int i13 = e0.f15881a;
                nVar2.k(i12, j11);
                break;
        }
    }
}

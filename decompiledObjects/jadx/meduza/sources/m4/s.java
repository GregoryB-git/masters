package m4;

import m4.d0;
import v3.i0;

/* loaded from: classes.dex */
public final class s implements x {

    /* renamed from: a, reason: collision with root package name */
    public i0 f10158a;

    /* renamed from: b, reason: collision with root package name */
    public v5.c0 f10159b;

    /* renamed from: c, reason: collision with root package name */
    public c4.v f10160c;

    public s(String str) {
        i0.a aVar = new i0.a();
        aVar.f15472k = str;
        this.f10158a = new i0(aVar);
    }

    @Override // m4.x
    public final void a(v5.u uVar) {
        long c10;
        long j10;
        x6.b.K(this.f10159b);
        int i10 = v5.e0.f15881a;
        v5.c0 c0Var = this.f10159b;
        synchronized (c0Var) {
            long j11 = c0Var.f15875c;
            c10 = j11 != -9223372036854775807L ? j11 + c0Var.f15874b : c0Var.c();
        }
        v5.c0 c0Var2 = this.f10159b;
        synchronized (c0Var2) {
            j10 = c0Var2.f15874b;
        }
        if (c10 == -9223372036854775807L || j10 == -9223372036854775807L) {
            return;
        }
        i0 i0Var = this.f10158a;
        if (j10 != i0Var.f15460x) {
            i0.a aVar = new i0.a(i0Var);
            aVar.f15476o = j10;
            i0 i0Var2 = new i0(aVar);
            this.f10158a = i0Var2;
            this.f10160c.d(i0Var2);
        }
        int i11 = uVar.f15976c - uVar.f15975b;
        this.f10160c.b(i11, uVar);
        this.f10160c.c(c10, 1, i11, 0, null);
    }

    @Override // m4.x
    public final void c(v5.c0 c0Var, c4.j jVar, d0.d dVar) {
        this.f10159b = c0Var;
        dVar.a();
        dVar.b();
        c4.v r10 = jVar.r(dVar.f9951d, 5);
        this.f10160c = r10;
        r10.d(this.f10158a);
    }
}

package gb;

import eb.c;
import gb.r1;
import gb.y2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class a2<ReqT> extends y2<ReqT> {
    public final /* synthetic */ eb.t0 E;
    public final /* synthetic */ eb.c F;
    public final /* synthetic */ eb.p G;
    public final /* synthetic */ r1.e H;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a2(gb.r1.e r15, eb.t0 r16, eb.s0 r17, eb.c r18, gb.a3 r19, gb.x0 r20, eb.p r21) {
        /*
            r14 = this;
            r13 = r14
            r0 = r15
            r1 = r18
            r13.H = r0
            r2 = r16
            r13.E = r2
            r13.F = r1
            r3 = r21
            r13.G = r3
            gb.r1 r3 = gb.r1.this
            gb.y2$s r4 = r3.W
            long r5 = r3.X
            long r7 = r3.Y
            java.util.concurrent.Executor r1 = r1.f5036b
            if (r1 != 0) goto L1e
            java.util.concurrent.Executor r1 = r3.f6720i
        L1e:
            r9 = r1
            gb.l r1 = r3.f6718g
            java.util.concurrent.ScheduledExecutorService r10 = r1.p0()
            gb.y2$b0 r12 = r0.f6739a
            r0 = r14
            r1 = r16
            r2 = r17
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r9
            r9 = r10
            r10 = r19
            r11 = r20
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.a2.<init>(gb.r1$e, eb.t0, eb.s0, eb.c, gb.a3, gb.x0, eb.p):void");
    }

    @Override // gb.y2
    public final s w(eb.s0 s0Var, y2.n nVar, int i10, boolean z10) {
        eb.c cVar = this.F;
        cVar.getClass();
        ArrayList arrayList = new ArrayList(cVar.f5040g.size() + 1);
        arrayList.addAll(cVar.f5040g);
        arrayList.add(nVar);
        c.a b10 = eb.c.b(cVar);
        b10.f5049g = Collections.unmodifiableList(arrayList);
        eb.c cVar2 = new eb.c(b10);
        eb.h[] c10 = v0.c(cVar2, s0Var, i10, z10);
        u a10 = this.H.a(new s2(this.E, s0Var, cVar2));
        eb.p a11 = this.G.a();
        try {
            return a10.d(this.E, s0Var, cVar2, c10);
        } finally {
            this.G.c(a11);
        }
    }

    @Override // gb.y2
    public final void x() {
        eb.e1 e1Var;
        r1.p pVar = r1.this.G;
        synchronized (pVar.f6794a) {
            try {
                pVar.f6795b.remove(this);
                if (pVar.f6795b.isEmpty()) {
                    e1Var = pVar.f6796c;
                    pVar.f6795b = new HashSet();
                } else {
                    e1Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e1Var != null) {
            r1.this.F.c(e1Var);
        }
    }

    @Override // gb.y2
    public final eb.e1 y() {
        eb.e1 e1Var;
        r1.p pVar = r1.this.G;
        synchronized (pVar.f6794a) {
            e1Var = pVar.f6796c;
            if (e1Var == null) {
                pVar.f6795b.add(this);
                e1Var = null;
            }
        }
        return e1Var;
    }
}

package i9;

import java.util.Objects;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final g9.k0 f7734a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7735b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7736c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f7737d;

    /* renamed from: e, reason: collision with root package name */
    public final j9.q f7738e;
    public final j9.q f;

    /* renamed from: g, reason: collision with root package name */
    public final ma.h f7739g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f7740h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m1(g9.k0 r11, int r12, long r13, i9.e0 r15) {
        /*
            r10 = this;
            j9.q r7 = j9.q.f8701b
            ma.h$h r8 = m9.p0.f10871u
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r15
            r6 = r7
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.m1.<init>(g9.k0, int, long, i9.e0):void");
    }

    public m1(g9.k0 k0Var, int i10, long j10, e0 e0Var, j9.q qVar, j9.q qVar2, ma.h hVar, Integer num) {
        k0Var.getClass();
        this.f7734a = k0Var;
        this.f7735b = i10;
        this.f7736c = j10;
        this.f = qVar2;
        this.f7737d = e0Var;
        qVar.getClass();
        this.f7738e = qVar;
        hVar.getClass();
        this.f7739g = hVar;
        this.f7740h = num;
    }

    public final m1 a(ma.h hVar, j9.q qVar) {
        return new m1(this.f7734a, this.f7735b, this.f7736c, this.f7737d, qVar, this.f, hVar, null);
    }

    public final m1 b(long j10) {
        return new m1(this.f7734a, this.f7735b, j10, this.f7737d, this.f7738e, this.f, this.f7739g, this.f7740h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m1.class != obj.getClass()) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f7734a.equals(m1Var.f7734a) && this.f7735b == m1Var.f7735b && this.f7736c == m1Var.f7736c && this.f7737d.equals(m1Var.f7737d) && this.f7738e.equals(m1Var.f7738e) && this.f.equals(m1Var.f) && this.f7739g.equals(m1Var.f7739g) && Objects.equals(this.f7740h, m1Var.f7740h);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f7740h) + ((this.f7739g.hashCode() + ((this.f.hashCode() + ((this.f7738e.hashCode() + ((this.f7737d.hashCode() + (((((this.f7734a.hashCode() * 31) + this.f7735b) * 31) + ((int) this.f7736c)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("TargetData{target=");
        l10.append(this.f7734a);
        l10.append(", targetId=");
        l10.append(this.f7735b);
        l10.append(", sequenceNumber=");
        l10.append(this.f7736c);
        l10.append(", purpose=");
        l10.append(this.f7737d);
        l10.append(", snapshotVersion=");
        l10.append(this.f7738e);
        l10.append(", lastLimboFreeSnapshotVersion=");
        l10.append(this.f);
        l10.append(", resumeToken=");
        l10.append(this.f7739g);
        l10.append(", expectedCount=");
        l10.append(this.f7740h);
        l10.append('}');
        return l10.toString();
    }
}

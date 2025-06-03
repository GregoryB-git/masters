package e7;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzeb;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class s4 extends j0 {

    /* renamed from: d, reason: collision with root package name */
    public volatile q4 f4640d;

    /* renamed from: e, reason: collision with root package name */
    public volatile q4 f4641e;
    public q4 f;

    /* renamed from: o, reason: collision with root package name */
    public final ConcurrentHashMap f4642o;

    /* renamed from: p, reason: collision with root package name */
    public zzeb f4643p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f4644q;

    /* renamed from: r, reason: collision with root package name */
    public volatile q4 f4645r;

    /* renamed from: s, reason: collision with root package name */
    public q4 f4646s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f4647u;

    public s4(j2 j2Var) {
        super(j2Var);
        this.f4647u = new Object();
        this.f4642o = new ConcurrentHashMap();
    }

    public final q4 A(zzeb zzebVar) {
        m6.j.i(zzebVar);
        q4 q4Var = (q4) this.f4642o.get(Integer.valueOf(zzebVar.zza));
        if (q4Var == null) {
            q4 q4Var2 = new q4(k().y0(), null, b(zzebVar.zzb, "Activity"));
            this.f4642o.put(Integer.valueOf(zzebVar.zza), q4Var2);
            q4Var = q4Var2;
        }
        return this.f4645r != null ? this.f4645r : q4Var;
    }

    public final String b(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        String str3 = split.length > 0 ? split[split.length - 1] : "";
        return str3.length() > h().n(null, false) ? str3.substring(0, h().n(null, false)) : str3;
    }

    @Override // e7.j0
    public final boolean s() {
        return false;
    }

    public final q4 v(boolean z10) {
        t();
        l();
        if (!z10) {
            return this.f;
        }
        q4 q4Var = this.f;
        return q4Var != null ? q4Var : this.f4646s;
    }

    public final void w(zzeb zzebVar, Bundle bundle) {
        Bundle bundle2;
        if (!h().A() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f4642o.put(Integer.valueOf(zzebVar.zza), new q4(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        if (r7 != 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(e7.q4 r10, e7.q4 r11, long r12, boolean r14, android.os.Bundle r15) {
        /*
            r9 = this;
            r9.l()
            r0 = 0
            r1 = 1
            if (r11 == 0) goto L26
            long r2 = r11.f4591c
            long r4 = r10.f4591c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L26
            java.lang.String r2 = r11.f4590b
            java.lang.String r3 = r10.f4590b
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L26
            java.lang.String r2 = r11.f4589a
            java.lang.String r3 = r10.f4589a
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 != 0) goto L24
            goto L26
        L24:
            r2 = r0
            goto L27
        L26:
            r2 = r1
        L27:
            if (r14 == 0) goto L2e
            e7.q4 r14 = r9.f
            if (r14 == 0) goto L2e
            r0 = r1
        L2e:
            if (r2 == 0) goto Lb1
            android.os.Bundle r6 = new android.os.Bundle
            if (r15 == 0) goto L38
            r6.<init>(r15)
            goto L3b
        L38:
            r6.<init>()
        L3b:
            e7.r6.L(r10, r6, r1)
            if (r11 == 0) goto L59
            java.lang.String r14 = r11.f4589a
            if (r14 == 0) goto L49
            java.lang.String r15 = "_pn"
            r6.putString(r15, r14)
        L49:
            java.lang.String r14 = r11.f4590b
            if (r14 == 0) goto L52
            java.lang.String r15 = "_pc"
            r6.putString(r15, r14)
        L52:
            long r14 = r11.f4591c
            java.lang.String r11 = "_pi"
            r6.putLong(r11, r14)
        L59:
            r14 = 0
            if (r0 == 0) goto L74
            e7.q5 r11 = r9.r()
            e7.t5 r11 = r11.f4596o
            long r2 = r11.f4679b
            long r2 = r12 - r2
            r11.f4679b = r12
            int r11 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r11 <= 0) goto L74
            e7.r6 r11 = r9.k()
            r11.C(r6, r2)
        L74:
            e7.h r11 = r9.h()
            boolean r11 = r11.A()
            if (r11 != 0) goto L85
            r2 = 1
            java.lang.String r11 = "_mst"
            r6.putLong(r11, r2)
        L85:
            boolean r11 = r10.f4593e
            if (r11 == 0) goto L8c
            java.lang.String r11 = "app"
            goto L8e
        L8c:
            java.lang.String r11 = "auto"
        L8e:
            r4 = r11
            v6.b r11 = r9.zzb()
            b.z r11 = (b.z) r11
            r11.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            boolean r11 = r10.f4593e
            if (r11 == 0) goto La7
            long r7 = r10.f
            int r11 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r11 == 0) goto La7
            goto La8
        La7:
            r7 = r2
        La8:
            e7.k3 r3 = r9.o()
            java.lang.String r5 = "_vs"
            r3.D(r4, r5, r6, r7)
        Lb1:
            if (r0 == 0) goto Lb8
            e7.q4 r11 = r9.f
            r9.y(r11, r1, r12)
        Lb8:
            r9.f = r10
            boolean r11 = r10.f4593e
            if (r11 == 0) goto Lc0
            r9.f4646s = r10
        Lc0:
            e7.w4 r11 = r9.q()
            r11.l()
            r11.t()
            i6.p r12 = new i6.p
            r13 = 7
            r12.<init>(r11, r10, r13)
            r11.x(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.s4.x(e7.q4, e7.q4, long, boolean, android.os.Bundle):void");
    }

    public final void y(q4 q4Var, boolean z10, long j10) {
        a aVar = ((j2) this.f3407b).f4374y;
        if (aVar == null) {
            throw new IllegalStateException("Component not created");
        }
        ((b.z) zzb()).getClass();
        aVar.s(SystemClock.elapsedRealtime());
        if (!r().f4596o.a(j10, q4Var != null && q4Var.f4592d, z10) || q4Var == null) {
            return;
        }
        q4Var.f4592d = false;
    }

    public final void z(String str, q4 q4Var, boolean z10) {
        q4 q4Var2;
        q4 q4Var3 = this.f4640d == null ? this.f4641e : this.f4640d;
        if (q4Var.f4590b == null) {
            q4Var2 = new q4(q4Var.f4589a, str != null ? b(str, "Activity") : null, q4Var.f4591c, q4Var.f4593e, q4Var.f);
        } else {
            q4Var2 = q4Var;
        }
        this.f4641e = this.f4640d;
        this.f4640d = q4Var2;
        ((b.z) zzb()).getClass();
        zzl().u(new u4(this, q4Var2, q4Var3, SystemClock.elapsedRealtime(), z10));
    }
}

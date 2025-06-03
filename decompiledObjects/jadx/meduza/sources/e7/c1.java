package e7;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;

/* loaded from: classes.dex */
public final class c1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4129e;
    public final /* synthetic */ a1 f;

    public c1(a1 a1Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f4125a = i10;
        this.f4126b = str;
        this.f4127c = obj;
        this.f4128d = obj2;
        this.f4129e = obj3;
        this.f = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences.Editor edit;
        a1 a1Var;
        char c10;
        l1 j10 = ((j2) this.f.f3407b).j();
        if (!j10.f4148c) {
            this.f.s(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        a1 a1Var2 = this.f;
        if (a1Var2.f4058d == 0) {
            h h10 = a1Var2.h();
            if (h10.f == null) {
                synchronized (h10) {
                    if (h10.f == null) {
                        ApplicationInfo applicationInfo = h10.zza().getApplicationInfo();
                        String a10 = v6.f.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            h10.f = Boolean.valueOf(str != null && str.equals(a10));
                        }
                        if (h10.f == null) {
                            h10.f = Boolean.TRUE;
                            h10.zzj().f4060o.b("My process not in the list of running processes");
                        }
                    }
                }
            }
            if (h10.f.booleanValue()) {
                a1Var = this.f;
                c10 = 'C';
            } else {
                a1Var = this.f;
                c10 = 'c';
            }
            a1Var.f4058d = c10;
        }
        a1 a1Var3 = this.f;
        if (a1Var3.f4059e < 0) {
            a1Var3.f4059e = 114010L;
        }
        char charAt = "01VDIWEA?".charAt(this.f4125a);
        a1 a1Var4 = this.f;
        char c11 = a1Var4.f4058d;
        long j11 = a1Var4.f4059e;
        String r10 = a1.r(true, this.f4126b, this.f4127c, this.f4128d, this.f4129e);
        StringBuilder sb2 = new StringBuilder("2");
        sb2.append(charAt);
        sb2.append(c11);
        sb2.append(j11);
        String f = defpackage.g.f(sb2, ":", r10);
        if (f.length() > 1024) {
            f = this.f4126b.substring(0, 1024);
        }
        p1 p1Var = j10.f4456o;
        if (p1Var != null) {
            p1Var.f4560e.l();
            if (p1Var.f4560e.v().getLong(p1Var.f4556a, 0L) == 0) {
                p1Var.a();
            }
            if (f == null) {
                f = "";
            }
            long j12 = p1Var.f4560e.v().getLong(p1Var.f4557b, 0L);
            if (j12 <= 0) {
                edit = p1Var.f4560e.v().edit();
                edit.putString(p1Var.f4558c, f);
                edit.putLong(p1Var.f4557b, 1L);
            } else {
                long j13 = j12 + 1;
                boolean z10 = (p1Var.f4560e.k().C0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j13;
                edit = p1Var.f4560e.v().edit();
                if (z10) {
                    edit.putString(p1Var.f4558c, f);
                }
                edit.putLong(p1Var.f4557b, j13);
            }
            edit.apply();
        }
    }
}

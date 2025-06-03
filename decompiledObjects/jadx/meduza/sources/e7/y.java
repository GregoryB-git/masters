package e7;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f4766a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4767b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4768c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4769d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4770e;
    public final a0 f;

    public y(j2 j2Var, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        a0 a0Var;
        m6.j.e(str2);
        m6.j.e(str3);
        this.f4766a = str2;
        this.f4767b = str3;
        this.f4768c = TextUtils.isEmpty(str) ? null : str;
        this.f4769d = j10;
        this.f4770e = j11;
        if (j11 != 0 && j11 > j10) {
            j2Var.zzj().f4063r.c("Event created with reverse previous/current timestamps. appId", a1.p(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            a0Var = new a0(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    j2Var.zzj().f4060o.b("Param name can't be null");
                } else {
                    Object f02 = j2Var.m().f0(bundle2.get(next), next);
                    if (f02 == null) {
                        j2Var.zzj().f4063r.c("Param value can't be null", j2Var.f4370u.f(next));
                    } else {
                        j2Var.m().E(bundle2, next, f02);
                    }
                }
                it.remove();
            }
            a0Var = new a0(bundle2);
        }
        this.f = a0Var;
    }

    public final y a(j2 j2Var, long j10) {
        return new y(j2Var, this.f4768c, this.f4766a, this.f4767b, this.f4769d, j10, this.f);
    }

    public final String toString() {
        String str = this.f4766a;
        String str2 = this.f4767b;
        String valueOf = String.valueOf(this.f);
        StringBuilder sb2 = new StringBuilder("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        return defpackage.g.f(sb2, valueOf, "}");
    }

    public y(j2 j2Var, String str, String str2, String str3, long j10, long j11, a0 a0Var) {
        m6.j.e(str2);
        m6.j.e(str3);
        m6.j.i(a0Var);
        this.f4766a = str2;
        this.f4767b = str3;
        this.f4768c = TextUtils.isEmpty(str) ? null : str;
        this.f4769d = j10;
        this.f4770e = j11;
        if (j11 != 0 && j11 > j10) {
            j2Var.zzj().f4063r.d("Event created with reverse previous/current timestamps. appId, name", a1.p(str2), a1.p(str3));
        }
        this.f = a0Var;
    }
}

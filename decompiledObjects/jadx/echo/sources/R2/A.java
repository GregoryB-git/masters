package R2;

import A2.AbstractC0328n;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final String f4535a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4536b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4537c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4538d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4539e;

    /* renamed from: f, reason: collision with root package name */
    public final D f4540f;

    public A(N2 n22, String str, String str2, String str3, long j7, long j8, D d7) {
        AbstractC0328n.e(str2);
        AbstractC0328n.e(str3);
        AbstractC0328n.i(d7);
        this.f4535a = str2;
        this.f4536b = str3;
        this.f4537c = TextUtils.isEmpty(str) ? null : str;
        this.f4538d = j7;
        this.f4539e = j8;
        if (j8 != 0 && j8 > j7) {
            n22.j().L().c("Event created with reverse previous/current timestamps. appId, name", Y1.v(str2), Y1.v(str3));
        }
        this.f4540f = d7;
    }

    public final A a(N2 n22, long j7) {
        return new A(n22, this.f4537c, this.f4535a, this.f4536b, this.f4538d, j7, this.f4540f);
    }

    public final String toString() {
        return "Event{appId='" + this.f4535a + "', name='" + this.f4536b + "', params=" + String.valueOf(this.f4540f) + "}";
    }

    public A(N2 n22, String str, String str2, String str3, long j7, long j8, Bundle bundle) {
        D d7;
        AbstractC0328n.e(str2);
        AbstractC0328n.e(str3);
        this.f4535a = str2;
        this.f4536b = str3;
        this.f4537c = TextUtils.isEmpty(str) ? null : str;
        this.f4538d = j7;
        this.f4539e = j8;
        if (j8 != 0 && j8 > j7) {
            n22.j().L().b("Event created with reverse previous/current timestamps. appId", Y1.v(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            d7 = new D(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    n22.j().G().a("Param name can't be null");
                } else {
                    Object s02 = n22.L().s0(next, bundle2.get(next));
                    if (s02 == null) {
                        n22.j().L().b("Param value can't be null", n22.D().f(next));
                    } else {
                        n22.L().R(bundle2, next, s02);
                    }
                }
                it.remove();
            }
            d7 = new D(bundle2);
        }
        this.f4540f = d7;
    }
}

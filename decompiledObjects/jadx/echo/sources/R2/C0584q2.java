package R2;

import A2.AbstractC0328n;
import android.content.SharedPreferences;

/* renamed from: R2.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584q2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5486a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5487b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5488c;

    /* renamed from: d, reason: collision with root package name */
    public long f5489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0549l2 f5490e;

    public C0584q2(C0549l2 c0549l2, String str, long j7) {
        this.f5490e = c0549l2;
        AbstractC0328n.e(str);
        this.f5486a = str;
        this.f5487b = j7;
    }

    public final long a() {
        if (!this.f5488c) {
            this.f5488c = true;
            this.f5489d = this.f5490e.F().getLong(this.f5486a, this.f5487b);
        }
        return this.f5489d;
    }

    public final void b(long j7) {
        SharedPreferences.Editor edit = this.f5490e.F().edit();
        edit.putLong(this.f5486a, j7);
        edit.apply();
        this.f5489d = j7;
    }
}

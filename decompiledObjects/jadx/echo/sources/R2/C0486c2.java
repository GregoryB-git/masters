package R2;

import android.os.Bundle;

/* renamed from: R2.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f5230a;

    /* renamed from: b, reason: collision with root package name */
    public String f5231b;

    /* renamed from: c, reason: collision with root package name */
    public long f5232c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f5233d;

    public C0486c2(String str, String str2, Bundle bundle, long j7) {
        this.f5230a = str;
        this.f5231b = str2;
        this.f5233d = bundle == null ? new Bundle() : bundle;
        this.f5232c = j7;
    }

    public static C0486c2 b(I i7) {
        return new C0486c2(i7.f4704o, i7.f4706q, i7.f4705p.g(), i7.f4707r);
    }

    public final I a() {
        return new I(this.f5230a, new D(new Bundle(this.f5233d)), this.f5231b, this.f5232c);
    }

    public final String toString() {
        return "origin=" + this.f5231b + ",name=" + this.f5230a + ",params=" + String.valueOf(this.f5233d);
    }
}

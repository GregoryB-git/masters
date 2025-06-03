package e7;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public String f4142a;

    /* renamed from: b, reason: collision with root package name */
    public String f4143b;

    /* renamed from: c, reason: collision with root package name */
    public long f4144c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f4145d;

    public d1(String str, String str2, Bundle bundle, long j10) {
        this.f4142a = str;
        this.f4143b = str2;
        this.f4145d = bundle;
        this.f4144c = j10;
    }

    public static d1 b(f0 f0Var) {
        return new d1(f0Var.f4192a, f0Var.f4194c, f0Var.f4193b.E(), f0Var.f4195d);
    }

    public final f0 a() {
        return new f0(this.f4142a, new a0(new Bundle(this.f4145d)), this.f4143b, this.f4144c);
    }

    public final String toString() {
        return "origin=" + this.f4143b + ",name=" + this.f4142a + ",params=" + String.valueOf(this.f4145d);
    }
}

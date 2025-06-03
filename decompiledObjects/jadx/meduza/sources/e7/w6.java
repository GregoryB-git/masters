package e7;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final j2 f4743a;

    public w6(j2 j2Var) {
        this.f4743a = j2Var;
    }

    public final void a(String str, Bundle bundle) {
        String uri;
        this.f4743a.zzl().l();
        if (this.f4743a.d()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        this.f4743a.j().G.b(uri);
        q1 q1Var = this.f4743a.j().H;
        this.f4743a.f4371v.getClass();
        q1Var.b(System.currentTimeMillis());
    }

    public final boolean b() {
        return this.f4743a.j().H.a() > 0;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        this.f4743a.f4371v.getClass();
        return System.currentTimeMillis() - this.f4743a.j().H.a() > this.f4743a.f4365o.s(null, h0.f4243e0);
    }
}

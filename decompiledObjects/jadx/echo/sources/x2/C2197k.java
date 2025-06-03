package x2;

import A2.l0;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: x2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2197k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f21182a = AbstractC2200n.f21186a;

    /* renamed from: b, reason: collision with root package name */
    public static final C2197k f21183b = new C2197k();

    public static C2197k f() {
        return f21183b;
    }

    public int a(Context context) {
        return AbstractC2200n.a(context);
    }

    public Intent b(Context context, int i7, String str) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return null;
            }
            return l0.c("com.google.android.gms");
        }
        if (context != null && E2.i.d(context)) {
            return l0.a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f21182a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(G2.d.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return l0.b("com.google.android.gms", sb.toString());
    }

    public PendingIntent c(Context context, int i7, int i8) {
        return d(context, i7, i8, null);
    }

    public PendingIntent d(Context context, int i7, int i8, String str) {
        Intent b7 = b(context, i7, str);
        if (b7 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i8, b7, M2.d.f3503a | 134217728);
    }

    public String e(int i7) {
        return AbstractC2200n.b(i7);
    }

    public int g(Context context) {
        return h(context, f21182a);
    }

    public int h(Context context, int i7) {
        int e7 = AbstractC2200n.e(context, i7);
        if (AbstractC2200n.f(context, e7)) {
            return 18;
        }
        return e7;
    }

    public boolean i(Context context, String str) {
        return AbstractC2200n.j(context, str);
    }

    public boolean j(int i7) {
        return AbstractC2200n.h(i7);
    }
}

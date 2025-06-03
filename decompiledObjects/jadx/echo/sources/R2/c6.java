package R2;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes.dex */
public final class c6 {

    /* renamed from: a, reason: collision with root package name */
    public final N2 f5239a;

    public c6(N2 n22) {
        this.f5239a = n22;
    }

    public final void a() {
        this.f5239a.e().n();
        if (d()) {
            if (e()) {
                this.f5239a.F().f5406w.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f5239a.H().z0("auto", "_cmpx", bundle);
            } else {
                String a7 = this.f5239a.F().f5406w.a();
                if (TextUtils.isEmpty(a7)) {
                    this.f5239a.j().I().a("Cache still valid but referrer not found");
                } else {
                    long a8 = ((this.f5239a.F().f5407x.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a7);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", a8);
                    Object obj = pair.first;
                    this.f5239a.H().z0(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f5239a.F().f5406w.b(null);
            }
            this.f5239a.F().f5407x.b(0L);
        }
    }

    public final void b(String str, Bundle bundle) {
        String str2;
        this.f5239a.e().n();
        if (this.f5239a.p()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            str2 = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str3 : bundle.keySet()) {
                builder.appendQueryParameter(str3, bundle.getString(str3));
            }
            str2 = builder.build().toString();
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f5239a.F().f5406w.b(str2);
        this.f5239a.F().f5407x.b(this.f5239a.b().a());
    }

    public final void c() {
        if (d() && e()) {
            this.f5239a.F().f5406w.b(null);
        }
    }

    public final boolean d() {
        return this.f5239a.F().f5407x.a() > 0;
    }

    public final boolean e() {
        return d() && this.f5239a.b().a() - this.f5239a.F().f5407x.a() > this.f5239a.z().x(null, K.f4808V);
    }
}

package e7;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes.dex */
public final class a4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4072a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ k3 f4073b;

    public /* synthetic */ a4(k3 k3Var, int i10) {
        this.f4072a = i10;
        this.f4073b = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4072a) {
            case 0:
                w6 w6Var = this.f4073b.A;
                w6Var.f4743a.zzl().l();
                if (w6Var.b()) {
                    if (w6Var.c()) {
                        w6Var.f4743a.j().G.b(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        w6Var.f4743a.k().Q("auto", "_cmpx", bundle);
                    } else {
                        String a10 = w6Var.f4743a.j().G.a();
                        if (TextUtils.isEmpty(a10)) {
                            w6Var.f4743a.zzj().f4061p.b("Cache still valid but referrer not found");
                        } else {
                            long a11 = ((w6Var.f4743a.j().H.a() / 3600000) - 1) * 3600000;
                            Uri parse = Uri.parse(a10);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str : parse.getQueryParameterNames()) {
                                bundle2.putString(str, parse.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", a11);
                            Object obj = pair.first;
                            w6Var.f4743a.k().Q(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                        }
                        w6Var.f4743a.j().G.b(null);
                    }
                    w6Var.f4743a.j().H.b(0L);
                    break;
                }
                break;
            default:
                this.f4073b.L();
                break;
        }
    }
}

package b0;

import android.os.Handler;
import b0.l;
import p2.m0;
import x.e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f1667a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1668b;

    public c(e.a aVar, Handler handler) {
        this.f1667a = aVar;
        this.f1668b = handler;
    }

    public final void a(l.a aVar) {
        int i10 = aVar.f1693b;
        if (!(i10 == 0)) {
            this.f1668b.post(new b(this.f1667a, i10));
        } else {
            this.f1668b.post(new a(this.f1667a, aVar.f1692a));
        }
    }
}

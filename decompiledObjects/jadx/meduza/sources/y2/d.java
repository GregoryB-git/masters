package y2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import p2.k0;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f17371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17372c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f17373d = false;

    public d(k0 k0Var, String str) {
        this.f17371b = k0Var;
        this.f17372c = str;
    }

    @Override // y2.e
    public final void b() {
        WorkDatabase workDatabase = this.f17371b.f12879c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.u().q(this.f17372c).iterator();
            while (it.hasNext()) {
                e.a(this.f17371b, (String) it.next());
            }
            workDatabase.n();
            workDatabase.j();
            if (this.f17373d) {
                k0 k0Var = this.f17371b;
                p2.w.b(k0Var.f12878b, k0Var.f12879c, k0Var.f12881e);
            }
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}

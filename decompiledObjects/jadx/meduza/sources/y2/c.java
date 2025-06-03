package y2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import p2.k0;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f17369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17370c;

    public c(k0 k0Var, String str) {
        this.f17369b = k0Var;
        this.f17370c = str;
    }

    @Override // y2.e
    public final void b() {
        WorkDatabase workDatabase = this.f17369b.f12879c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.u().x(this.f17370c).iterator();
            while (it.hasNext()) {
                e.a(this.f17369b, (String) it.next());
            }
            workDatabase.n();
            workDatabase.j();
            k0 k0Var = this.f17369b;
            p2.w.b(k0Var.f12878b, k0Var.f12879c, k0Var.f12881e);
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}

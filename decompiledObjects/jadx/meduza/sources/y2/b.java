package y2;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import p2.k0;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f17360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f17361c;

    public b(k0 k0Var, UUID uuid) {
        this.f17360b = k0Var;
        this.f17361c = uuid;
    }

    @Override // y2.e
    public final void b() {
        WorkDatabase workDatabase = this.f17360b.f12879c;
        workDatabase.c();
        try {
            e.a(this.f17360b, this.f17361c.toString());
            workDatabase.n();
            workDatabase.j();
            k0 k0Var = this.f17360b;
            p2.w.b(k0Var.f12878b, k0Var.f12879c, k0Var.f12881e);
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}

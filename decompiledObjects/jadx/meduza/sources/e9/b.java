package e9;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import n9.f;
import n9.j;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: b, reason: collision with root package name */
    public a8.a f4847b;

    public b(t9.a<a8.a> aVar) {
        int i10 = 9;
        new defpackage.d(this, i10);
        aVar.a(new defpackage.e(this, i10));
    }

    @Override // e9.a
    public final synchronized Task<String> s() {
        a8.a aVar = this.f4847b;
        if (aVar == null) {
            return Tasks.forException(new u7.c("AppCheck is not available"));
        }
        return aVar.a().continueWithTask(f.f11361b, new e0.d(25));
    }

    @Override // e9.a
    public final synchronized void t() {
    }

    @Override // e9.a
    public final synchronized void w() {
        a8.a aVar = this.f4847b;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // e9.a
    public final synchronized void z(j<String> jVar) {
    }
}

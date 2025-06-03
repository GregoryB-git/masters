package e9;

import b8.s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d9.g;
import n9.f;
import n9.j;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: b, reason: collision with root package name */
    public final c f4849b = new c8.a() { // from class: e9.c
        @Override // c8.a
        public final void a() {
            d dVar = d.this;
            synchronized (dVar) {
                dVar.f4852e++;
                j<e> jVar = dVar.f4851d;
                if (jVar != null) {
                    synchronized (dVar) {
                        c8.b bVar = dVar.f4850c;
                        String a10 = bVar == null ? null : bVar.a();
                        jVar.a(a10 != null ? new e(a10) : e.f4853b);
                    }
                }
            }
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public c8.b f4850c;

    /* renamed from: d, reason: collision with root package name */
    public j<e> f4851d;

    /* renamed from: e, reason: collision with root package name */
    public int f4852e;
    public boolean f;

    /* JADX WARN: Type inference failed for: r0v0, types: [e9.c] */
    public d(t9.a<c8.b> aVar) {
        aVar.a(new defpackage.d(this, 10));
    }

    @Override // e9.a
    public final synchronized Task<String> s() {
        c8.b bVar = this.f4850c;
        if (bVar == null) {
            return Tasks.forException(new u7.c("auth is not available"));
        }
        Task<s> d10 = bVar.d(this.f);
        this.f = false;
        return d10.continueWithTask(f.f11361b, new g(this, this.f4852e));
    }

    @Override // e9.a
    public final synchronized void t() {
        this.f = true;
    }

    @Override // e9.a
    public final synchronized void w() {
        this.f4851d = null;
        c8.b bVar = this.f4850c;
        if (bVar != null) {
            bVar.c(this.f4849b);
        }
    }

    @Override // e9.a
    public final synchronized void z(j<e> jVar) {
        String a10;
        this.f4851d = jVar;
        synchronized (this) {
            c8.b bVar = this.f4850c;
            a10 = bVar == null ? null : bVar.a();
        }
        jVar.a(a10 != null ? new e(a10) : e.f4853b);
    }
}

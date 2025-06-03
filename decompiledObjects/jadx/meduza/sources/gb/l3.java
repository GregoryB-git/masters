package gb;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public final m.e[] f6593a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f6594b = new AtomicBoolean(false);

    static {
        new l3(new m.e[0]);
    }

    public l3(m.e[] eVarArr) {
        this.f6593a = eVarArr;
    }

    public final void a(long j10) {
        for (m.e eVar : this.f6593a) {
            eVar.j(j10);
        }
    }
}

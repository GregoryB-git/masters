package p1;

import java.util.Set;
import p1.e;

/* loaded from: classes.dex */
public final class m extends e.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n<Object> f12835b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String[] strArr, n<Object> nVar) {
        super(strArr);
        this.f12835b = nVar;
    }

    @Override // p1.e.c
    public final void a(Set<String> set) {
        ec.i.e(set, "tables");
        m.c v10 = m.c.v();
        u.a aVar = this.f12835b.f12845j;
        if (v10.w()) {
            aVar.run();
        } else {
            v10.x(aVar);
        }
    }
}

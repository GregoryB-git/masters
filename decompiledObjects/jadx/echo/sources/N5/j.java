package N5;

import E5.d;
import java.util.HashMap;
import t4.InterfaceC1992a;

/* loaded from: classes.dex */
public class j implements d.InterfaceC0024d {

    /* renamed from: a, reason: collision with root package name */
    public final s4.h f3708a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1992a f3709b;

    public j(s4.h hVar) {
        this.f3708a = hVar;
    }

    public static /* synthetic */ void e(d.b bVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("token", str);
        bVar.a(hashMap);
    }

    @Override // E5.d.InterfaceC0024d
    public void a(Object obj) {
        if (this.f3709b != null) {
            this.f3709b = null;
        }
    }

    @Override // E5.d.InterfaceC0024d
    public void b(Object obj, d.b bVar) {
        InterfaceC1992a d7 = d(bVar);
        this.f3709b = d7;
        this.f3708a.F(d7);
    }

    public InterfaceC1992a d(final d.b bVar) {
        return new InterfaceC1992a() { // from class: N5.i
            @Override // t4.InterfaceC1992a
            public final void a(String str) {
                j.e(d.b.this, str);
            }
        };
    }
}

package D5;

import E5.k;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final E5.k f1289a;

    /* renamed from: b, reason: collision with root package name */
    public b f1290b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f1291c;

    public class a implements k.c {

        /* renamed from: a, reason: collision with root package name */
        public Map f1292a = new HashMap();

        public a() {
        }

        @Override // E5.k.c
        public void onMethodCall(E5.j jVar, k.d dVar) {
            if (j.this.f1290b != null) {
                String str = jVar.f1670a;
                str.hashCode();
                if (!str.equals("getKeyboardState")) {
                    dVar.c();
                    return;
                } else {
                    try {
                        this.f1292a = j.this.f1290b.a();
                    } catch (IllegalStateException e7) {
                        dVar.b("error", e7.getMessage(), null);
                    }
                }
            }
            dVar.a(this.f1292a);
        }
    }

    public interface b {
        Map a();
    }

    public j(E5.c cVar) {
        a aVar = new a();
        this.f1291c = aVar;
        E5.k kVar = new E5.k(cVar, "flutter/keyboard", E5.q.f1685b);
        this.f1289a = kVar;
        kVar.e(aVar);
    }

    public void b(b bVar) {
        this.f1290b = bVar;
    }
}

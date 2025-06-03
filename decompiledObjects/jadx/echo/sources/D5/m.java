package D5;

import E5.k;
import java.util.HashMap;
import t5.AbstractC1995b;
import w5.C2105a;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final E5.k f1309a;

    /* renamed from: b, reason: collision with root package name */
    public b f1310b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f1311c;

    public class a implements k.c {
        public a() {
        }

        @Override // E5.k.c
        public void onMethodCall(E5.j jVar, k.d dVar) {
            if (m.this.f1310b == null) {
                return;
            }
            String str = jVar.f1670a;
            AbstractC1995b.f("MouseCursorChannel", "Received '" + str + "' message.");
            try {
                if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                    try {
                        m.this.f1310b.a((String) ((HashMap) jVar.f1671b).get("kind"));
                        dVar.a(Boolean.TRUE);
                    } catch (Exception e7) {
                        dVar.b("error", "Error when setting cursors: " + e7.getMessage(), null);
                    }
                }
            } catch (Exception e8) {
                dVar.b("error", "Unhandled error: " + e8.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public m(C2105a c2105a) {
        a aVar = new a();
        this.f1311c = aVar;
        E5.k kVar = new E5.k(c2105a, "flutter/mousecursor", E5.q.f1685b);
        this.f1309a = kVar;
        kVar.e(aVar);
    }

    public void b(b bVar) {
        this.f1310b = bVar;
    }
}

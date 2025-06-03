package D5;

import E5.k;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Map;
import w5.C2105a;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final E5.k f1405a;

    /* renamed from: b, reason: collision with root package name */
    public final PackageManager f1406b;

    /* renamed from: c, reason: collision with root package name */
    public b f1407c;

    /* renamed from: d, reason: collision with root package name */
    public final k.c f1408d;

    public class a implements k.c {
        public a() {
        }

        @Override // E5.k.c
        public void onMethodCall(E5.j jVar, k.d dVar) {
            if (r.this.f1407c == null) {
                return;
            }
            String str = jVar.f1670a;
            Object obj = jVar.f1671b;
            str.hashCode();
            try {
                if (str.equals("ProcessText.processTextAction")) {
                    ArrayList arrayList = (ArrayList) obj;
                    r.this.f1407c.c((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), dVar);
                } else {
                    if (!str.equals("ProcessText.queryTextActions")) {
                        dVar.c();
                        return;
                    }
                    dVar.a(r.this.f1407c.b());
                }
            } catch (IllegalStateException e7) {
                dVar.b("error", e7.getMessage(), null);
            }
        }
    }

    public interface b {
        Map b();

        void c(String str, String str2, boolean z7, k.d dVar);
    }

    public r(C2105a c2105a, PackageManager packageManager) {
        a aVar = new a();
        this.f1408d = aVar;
        this.f1406b = packageManager;
        E5.k kVar = new E5.k(c2105a, "flutter/processtext", E5.q.f1685b);
        this.f1405a = kVar;
        kVar.e(aVar);
    }

    public void b(b bVar) {
        this.f1407c = bVar;
    }
}

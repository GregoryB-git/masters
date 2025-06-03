package pa;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import t5.a0;
import t5.s;

/* loaded from: classes.dex */
public final class j {
    public static final s.a a(String str, Map map) {
        s.a aVar = new s.a();
        aVar.f14607b = str;
        aVar.f14610e = true;
        aVar.f14608c = 8000;
        aVar.f14609d = 8000;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            a0 a0Var = aVar.f14606a;
            synchronized (a0Var) {
                a0Var.f14448b = null;
                a0Var.f14447a.clear();
                a0Var.f14447a.putAll(linkedHashMap);
            }
        }
        return aVar;
    }

    public static final boolean b(Uri uri) {
        if (uri == null || uri.getScheme() == null) {
            return false;
        }
        String scheme = uri.getScheme();
        return ec.i.a(scheme, "http") || ec.i.a(scheme, "https");
    }
}

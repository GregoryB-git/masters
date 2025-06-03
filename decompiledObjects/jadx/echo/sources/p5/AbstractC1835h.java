package p5;

import java.util.HashMap;
import java.util.Map;
import n5.C1737F;

/* renamed from: p5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1835h {
    public static Map a(InterfaceC1832e interfaceC1832e) {
        C1737F d7 = interfaceC1832e.d();
        if (d7 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", d7.c());
        hashMap.put("arguments", d7.b());
        return hashMap;
    }
}

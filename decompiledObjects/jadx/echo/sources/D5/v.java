package D5;

import java.util.HashMap;
import t5.AbstractC1995b;
import w5.C2105a;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final E5.a f1441a;

    public v(C2105a c2105a) {
        this.f1441a = new E5.a(c2105a, "flutter/system", E5.f.f1668a);
    }

    public void a() {
        AbstractC1995b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f1441a.c(hashMap);
    }
}

package L5;

import E5.d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: L5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0435c {

    /* renamed from: a, reason: collision with root package name */
    public final d.b f3402a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3403b;

    public AbstractC0435c(d.b bVar, String str) {
        this.f3402a = bVar;
        this.f3403b = str;
    }

    public Map g(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("eventType", str);
        if (str2 != null) {
            hashMap.put("previousChildKey", str2);
        }
        return hashMap;
    }

    public void h(String str, Q3.b bVar, String str2) {
        if (this.f3403b.equals(str)) {
            this.f3402a.a(new x(bVar).b(g(str, str2)).a());
        }
    }
}

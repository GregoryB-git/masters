package k3;

import b9.g;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final b9.g f8910a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        b9.f fVar = g.a.f2160a;
        hashMap.put(p.class, e.f8865a);
        hashMap2.remove(p.class);
        hashMap.put(n3.a.class, a.f8852a);
        hashMap2.remove(n3.a.class);
        hashMap.put(n3.f.class, g.f8870a);
        hashMap2.remove(n3.f.class);
        hashMap.put(n3.d.class, d.f8862a);
        hashMap2.remove(n3.d.class);
        hashMap.put(n3.c.class, c.f8859a);
        hashMap2.remove(n3.c.class);
        hashMap.put(n3.b.class, b.f8857a);
        hashMap2.remove(n3.b.class);
        hashMap.put(n3.e.class, f.f8867a);
        hashMap2.remove(n3.e.class);
        f8910a = new b9.g(new HashMap(hashMap), new HashMap(hashMap2), fVar);
    }

    public abstract n3.a a();
}

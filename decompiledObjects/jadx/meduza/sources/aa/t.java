package aa;

import b9.g;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final b9.g f363a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        b9.f fVar = g.a.f2160a;
        hashMap.put(t.class, c.f271a);
        hashMap2.remove(t.class);
        hashMap.put(ba.b.class, b.f267a);
        hashMap2.remove(ba.b.class);
        hashMap.put(ba.a.class, a.f252a);
        hashMap2.remove(ba.a.class);
        f363a = new b9.g(new HashMap(hashMap), new HashMap(hashMap2), fVar);
    }

    public abstract ba.b a();
}

package n;

import java.util.HashMap;
import java.util.Map;
import n.b;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1687a extends b {

    /* renamed from: s, reason: collision with root package name */
    public HashMap f17833s = new HashMap();

    public boolean contains(Object obj) {
        return this.f17833s.containsKey(obj);
    }

    @Override // n.b
    public b.c d(Object obj) {
        return (b.c) this.f17833s.get(obj);
    }

    @Override // n.b
    public Object k(Object obj, Object obj2) {
        b.c d7 = d(obj);
        if (d7 != null) {
            return d7.f17839p;
        }
        this.f17833s.put(obj, i(obj, obj2));
        return null;
    }

    @Override // n.b
    public Object q(Object obj) {
        Object q7 = super.q(obj);
        this.f17833s.remove(obj);
        return q7;
    }

    public Map.Entry s(Object obj) {
        if (contains(obj)) {
            return ((b.c) this.f17833s.get(obj)).f17841r;
        }
        return null;
    }
}

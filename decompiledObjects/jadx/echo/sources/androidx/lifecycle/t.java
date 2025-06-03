package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9724a = new HashMap();

    public final void a() {
        Iterator it = this.f9724a.values().iterator();
        while (it.hasNext()) {
            ((r) it.next()).a();
        }
        this.f9724a.clear();
    }

    public final r b(String str) {
        return (r) this.f9724a.get(str);
    }

    public Set c() {
        return new HashSet(this.f9724a.keySet());
    }

    public final void d(String str, r rVar) {
        r rVar2 = (r) this.f9724a.put(str, rVar);
        if (rVar2 != null) {
            rVar2.d();
        }
    }
}

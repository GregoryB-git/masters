package b1;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1790a = new LinkedHashMap();

    public final void a() {
        for (o0 o0Var : this.f1790a.values()) {
            o0Var.f1768c = true;
            HashMap hashMap = o0Var.f1766a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    Iterator it = o0Var.f1766a.values().iterator();
                    while (it.hasNext()) {
                        o0.a(it.next());
                    }
                }
            }
            LinkedHashSet linkedHashSet = o0Var.f1767b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    Iterator it2 = o0Var.f1767b.iterator();
                    while (it2.hasNext()) {
                        o0.a((Closeable) it2.next());
                    }
                }
                o0Var.f1767b.clear();
            }
            o0Var.b();
        }
        this.f1790a.clear();
    }
}

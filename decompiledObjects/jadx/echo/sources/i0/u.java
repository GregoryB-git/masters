package i0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Map f14724a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Map f14725b;

    public synchronized void a(Map map) {
        this.f14725b = null;
        this.f14724a.clear();
        this.f14724a.putAll(map);
    }

    public synchronized Map b() {
        try {
            if (this.f14725b == null) {
                this.f14725b = Collections.unmodifiableMap(new HashMap(this.f14724a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f14725b;
    }
}

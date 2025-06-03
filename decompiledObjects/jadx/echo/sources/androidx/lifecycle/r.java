package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final Map f9720a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f9721b = false;

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public final void a() {
        this.f9721b = true;
        Map map = this.f9720a;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator it = this.f9720a.values().iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                } finally {
                }
            }
        }
        d();
    }

    public Object c(String str) {
        Object obj;
        Map map = this.f9720a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f9720a.get(str);
        }
        return obj;
    }

    public void d() {
    }
}

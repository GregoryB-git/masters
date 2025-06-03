package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0775w;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0768o {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f9032b = true;

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0768o f9034d;

    /* renamed from: a, reason: collision with root package name */
    public final Map f9036a = Collections.emptyMap();

    /* renamed from: c, reason: collision with root package name */
    public static final Class f9033c = c();

    /* renamed from: e, reason: collision with root package name */
    public static final C0768o f9035e = new C0768o(true);

    /* renamed from: androidx.datastore.preferences.protobuf.o$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f9037a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9038b;

        public a(Object obj, int i7) {
            this.f9037a = obj;
            this.f9038b = i7;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9037a == aVar.f9037a && this.f9038b == aVar.f9038b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f9037a) * 65535) + this.f9038b;
        }
    }

    public C0768o(boolean z7) {
    }

    public static C0768o b() {
        C0768o c0768o = f9034d;
        if (c0768o == null) {
            synchronized (C0768o.class) {
                try {
                    c0768o = f9034d;
                    if (c0768o == null) {
                        c0768o = f9032b ? AbstractC0767n.a() : f9035e;
                        f9034d = c0768o;
                    }
                } finally {
                }
            }
        }
        return c0768o;
    }

    public static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public AbstractC0775w.c a(O o7, int i7) {
        android.support.v4.media.a.a(this.f9036a.get(new a(o7, i7)));
        return null;
    }
}

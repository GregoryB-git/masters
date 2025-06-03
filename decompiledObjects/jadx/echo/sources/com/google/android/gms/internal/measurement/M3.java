package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class M3 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile M3 f10489b;

    /* renamed from: c, reason: collision with root package name */
    public static final M3 f10490c = new M3(true);

    /* renamed from: a, reason: collision with root package name */
    public final Map f10491a = Collections.emptyMap();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f10492a;

        /* renamed from: b, reason: collision with root package name */
        public final int f10493b;

        public a(Object obj, int i7) {
            this.f10492a = obj;
            this.f10493b = i7;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10492a == aVar.f10492a && this.f10493b == aVar.f10493b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f10492a) * 65535) + this.f10493b;
        }
    }

    public M3(boolean z7) {
    }

    public static M3 a() {
        M3 m32 = f10489b;
        if (m32 != null) {
            return m32;
        }
        synchronized (M3.class) {
            try {
                M3 m33 = f10489b;
                if (m33 != null) {
                    return m33;
                }
                M3 a7 = X3.a(M3.class);
                f10489b = a7;
                return a7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Y3.d b(I4 i42, int i7) {
        android.support.v4.media.a.a(this.f10491a.get(new a(i42, i7)));
        return null;
    }
}

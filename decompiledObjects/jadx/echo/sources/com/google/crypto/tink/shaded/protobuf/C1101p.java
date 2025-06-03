package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC1108x;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1101p {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f11425b = true;

    /* renamed from: c, reason: collision with root package name */
    public static volatile C1101p f11426c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1101p f11427d = new C1101p(true);

    /* renamed from: a, reason: collision with root package name */
    public final Map f11428a = Collections.emptyMap();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.p$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f11429a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11430b;

        public a(Object obj, int i7) {
            this.f11429a = obj;
            this.f11430b = i7;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11429a == aVar.f11429a && this.f11430b == aVar.f11430b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f11429a) * 65535) + this.f11430b;
        }
    }

    public C1101p(boolean z7) {
    }

    public static C1101p b() {
        C1101p c1101p = f11426c;
        if (c1101p == null) {
            synchronized (C1101p.class) {
                try {
                    c1101p = f11426c;
                    if (c1101p == null) {
                        c1101p = f11425b ? AbstractC1100o.a() : f11427d;
                        f11426c = c1101p;
                    }
                } finally {
                }
            }
        }
        return c1101p;
    }

    public AbstractC1108x.c a(O o7, int i7) {
        android.support.v4.media.a.a(this.f11428a.get(new a(o7, i7)));
        return null;
    }
}

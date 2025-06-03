/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.Map
 *  java.util.concurrent.atomic.AtomicLong
 */
package x0;

import android.net.Uri;
import i0.k;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class r {
    public static final AtomicLong h = new AtomicLong();
    public final long a;
    public final k b;
    public final Uri c;
    public final Map d;
    public final long e;
    public final long f;
    public final long g;

    public r(long l8, k k8, long l9) {
        this(l8, k8, k8.a, Collections.emptyMap(), l9, 0L, 0L);
    }

    public r(long l8, k k8, Uri uri, Map map, long l9, long l10, long l11) {
        this.a = l8;
        this.b = k8;
        this.c = uri;
        this.d = map;
        this.e = l9;
        this.f = l10;
        this.g = l11;
    }

    public static long a() {
        return h.getAndIncrement();
    }
}


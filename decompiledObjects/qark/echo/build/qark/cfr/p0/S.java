/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.io.IOException
 *  java.lang.Throwable
 *  java.util.Map
 */
package p0;

import android.net.Uri;
import i0.k;
import java.io.IOException;
import java.util.Map;

public final class S
extends IOException {
    public final k o;
    public final Uri p;
    public final Map q;
    public final long r;

    public S(k k8, Uri uri, Map map, long l8, Throwable throwable) {
        super(throwable);
        this.o = k8;
        this.p = uri;
        this.q = map;
        this.r = l8;
    }
}


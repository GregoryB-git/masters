/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.io.InputStream
 *  java.lang.Object
 *  java.util.List
 */
package v0;

import B0.p;
import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import v0.a;

public final class b
implements p.a {
    public final p.a a;
    public final List b;

    public b(p.a a8, List list) {
        this.a = a8;
        this.b = list;
    }

    public a b(Uri object, InputStream object2) {
        object2 = (a)this.a.a((Uri)object, (InputStream)object2);
        List list = this.b;
        object = object2;
        if (list != null) {
            if (list.isEmpty()) {
                return object2;
            }
            object = (a)object2.a(this.b);
        }
        return object;
    }
}


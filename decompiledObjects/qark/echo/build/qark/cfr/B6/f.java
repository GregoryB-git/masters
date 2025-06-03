/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package B6;

import B6.d;
import C6.a;

public abstract class f {
    public static f a(d d8, byte[] arrby) {
        return f.b(d8, arrby, 0, arrby.length);
    }

    public static f b(d d8, final byte[] arrby, final int n8, final int n9) {
        if (arrby != null) {
            a.b(arrby.length, n8, n9);
            return new f(d8){};
        }
        throw new NullPointerException("content == null");
    }

}


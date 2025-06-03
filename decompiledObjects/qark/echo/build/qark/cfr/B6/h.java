/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package B6;

import B6.d;
import C6.a;
import D6.b;
import java.io.Closeable;

public abstract class h
implements Closeable {
    public static h a(d d8, final long l8, final b b8) {
        if (b8 != null) {
            return new h(d8){

                @Override
                public b c() {
                    return b8;
                }
            };
        }
        throw new NullPointerException("source == null");
    }

    public static h b(d d8, byte[] arrby) {
        D6.a a8 = new D6.a().B(arrby);
        return h.a(d8, arrby.length, a8);
    }

    public abstract b c();

    public void close() {
        a.c(this.c());
    }

}


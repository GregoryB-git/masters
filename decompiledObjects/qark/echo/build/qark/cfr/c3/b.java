/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayInputStream
 *  java.io.InputStream
 *  java.lang.Object
 */
package c3;

import c3.p;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import p3.C;
import p3.t;

public final class b
implements p {
    public final InputStream a;

    public b(InputStream inputStream) {
        this.a = inputStream;
    }

    public static p b(byte[] arrby) {
        return new b((InputStream)new ByteArrayInputStream(arrby));
    }

    @Override
    public t a() {
        try {
            t t8 = t.Z(this.a, com.google.crypto.tink.shaded.protobuf.p.b());
            return t8;
        }
        finally {
            this.a.close();
        }
    }

    @Override
    public C read() {
        try {
            C c8 = C.e0(this.a, com.google.crypto.tink.shaded.protobuf.p.b());
            return c8;
        }
        finally {
            this.a.close();
        }
    }
}


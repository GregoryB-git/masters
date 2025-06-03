/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.j0;
import com.google.crypto.tink.shaded.protobuf.k;
import java.io.IOException;

public abstract class a
implements O {
    protected int memoizedHashCode = 0;

    public abstract int e(e0 var1);

    @Override
    public byte[] f() {
        try {
            byte[] arrby = new byte[this.a()];
            k k8 = k.U(arrby);
            this.g(k8);
            k8.c();
            return arrby;
        }
        catch (IOException iOException) {
            throw new RuntimeException(this.h("byte array"), (Throwable)iOException);
        }
    }

    public final String h(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Serializing ");
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append(" to a ");
        stringBuilder.append(string2);
        stringBuilder.append(" threw an IOException (should never happen).");
        return stringBuilder.toString();
    }

    public j0 i() {
        return new j0(this);
    }

    @Override
    public h j() {
        try {
            Object object = h.T(this.a());
            this.g(object.b());
            object = object.a();
            return object;
        }
        catch (IOException iOException) {
            throw new RuntimeException(this.h("ByteString"), (Throwable)iOException);
        }
    }

    public static abstract class a
    implements O.a {
        public static j0 l(O o8) {
            return new j0(o8);
        }
    }

}


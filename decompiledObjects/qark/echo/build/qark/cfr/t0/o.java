/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$CodecException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package t0;

import android.media.MediaCodec;
import g0.M;
import j0.h;
import t0.p;

public class o
extends h {
    public final p o;
    public final String p;
    public final int q;

    public o(Throwable throwable, p object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Decoder failed: ");
        Object var5_4 = null;
        String string2 = object == null ? null : object.a;
        stringBuilder.append(string2);
        super(stringBuilder.toString(), throwable);
        this.o = object;
        int n8 = M.a;
        object = var5_4;
        if (n8 >= 21) {
            object = o.a(throwable);
        }
        this.p = object;
        n8 = n8 >= 23 ? o.b(throwable) : M.X((String)object);
        this.q = n8;
    }

    public static String a(Throwable throwable) {
        if (throwable instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException)throwable).getDiagnosticInfo();
        }
        return null;
    }

    public static int b(Throwable throwable) {
        if (throwable instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException)throwable).getErrorCode();
        }
        return 0;
    }
}


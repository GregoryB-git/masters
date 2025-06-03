/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.nio.charset.Charset
 */
package E5;

import E5.i;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class r
implements i {
    public static final Charset a = Charset.forName((String)"UTF8");
    public static final r b = new r();

    public String c(ByteBuffer arrby) {
        int n8;
        if (arrby == null) {
            return null;
        }
        int n9 = arrby.remaining();
        if (arrby.hasArray()) {
            byte[] arrby2 = arrby.array();
            n8 = arrby.arrayOffset();
            arrby = arrby2;
        } else {
            byte[] arrby3 = new byte[n9];
            arrby.get(arrby3);
            n8 = 0;
            arrby = arrby3;
        }
        return new String(arrby, n8, n9, a);
    }

    public ByteBuffer d(String arrby) {
        if (arrby == null) {
            return null;
        }
        arrby = arrby.getBytes(a);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int)arrby.length);
        byteBuffer.put(arrby);
        return byteBuffer;
    }
}


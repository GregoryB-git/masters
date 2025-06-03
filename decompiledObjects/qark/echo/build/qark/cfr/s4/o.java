/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Byte
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.nio.charset.Charset
 *  java.util.UUID
 */
package s4;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public class o {
    public static final byte a = Byte.parseByte((String)"01110000", (int)2);
    public static final byte b = Byte.parseByte((String)"00001111", (int)2);

    public static String b(byte[] arrby) {
        return new String(Base64.encode((byte[])arrby, (int)11), Charset.defaultCharset()).substring(0, 22);
    }

    public static byte[] c(UUID uUID, byte[] byteBuffer) {
        byteBuffer = ByteBuffer.wrap((byte[])byteBuffer);
        byteBuffer.putLong(uUID.getMostSignificantBits());
        byteBuffer.putLong(uUID.getLeastSignificantBits());
        return byteBuffer.array();
    }

    public String a() {
        byte by;
        byte[] arrby = o.c(UUID.randomUUID(), new byte[17]);
        arrby[16] = by = arrby[0];
        arrby[0] = (byte)(by & b | a);
        return o.b(arrby);
    }
}


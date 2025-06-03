/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.util.Date
 *  java.util.Locale
 *  java.util.concurrent.atomic.AtomicLong
 */
package H3;

import H3.C;
import H3.D;
import H3.i;
import android.os.Process;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

public class h {
    public static final AtomicLong a = new AtomicLong(0L);
    public static String b;

    public h(C object) {
        Object object2 = new byte[10];
        this.e((byte[])object2);
        this.d((byte[])object2);
        this.c((byte[])object2);
        object = i.A(object.a().c());
        object2 = i.u((byte[])object2);
        Locale locale = Locale.US;
        b = String.format((Locale)locale, (String)"%s%s%s%s", (Object[])new Object[]{object2.substring(0, 12), object2.substring(12, 16), object2.subSequence(16, 20), object.substring(0, 12)}).toUpperCase(locale);
    }

    public static byte[] a(long l8) {
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)4);
        byteBuffer.putInt((int)l8);
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        byteBuffer.position(0);
        return byteBuffer.array();
    }

    public static byte[] b(long l8) {
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)2);
        byteBuffer.putShort((short)l8);
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        byteBuffer.position(0);
        return byteBuffer.array();
    }

    public final void c(byte[] arrby) {
        byte[] arrby2 = h.b(Integer.valueOf((int)Process.myPid()).shortValue());
        arrby[8] = arrby2[0];
        arrby[9] = arrby2[1];
    }

    public final void d(byte[] arrby) {
        byte[] arrby2 = h.b(a.incrementAndGet());
        arrby[6] = arrby2[0];
        arrby[7] = arrby2[1];
    }

    public final void e(byte[] arrby) {
        long l8 = new Date().getTime();
        byte[] arrby2 = h.a(l8 / 1000L);
        arrby[0] = arrby2[0];
        arrby[1] = arrby2[1];
        arrby[2] = arrby2[2];
        arrby[3] = arrby2[3];
        arrby2 = h.b(l8 % 1000L);
        arrby[4] = arrby2[0];
        arrby[5] = arrby2[1];
    }

    public String toString() {
        return b;
    }
}


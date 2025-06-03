// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import java.util.Date;
import android.os.Process;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

public class h
{
    public static final AtomicLong a;
    public static String b;
    
    static {
        a = new AtomicLong(0L);
    }
    
    public h(final C c) {
        final byte[] array = new byte[10];
        this.e(array);
        this.d(array);
        this.c(array);
        final String a = i.A(c.a().c());
        final String u = i.u(array);
        final Locale us = Locale.US;
        h.b = String.format(us, "%s%s%s%s", u.substring(0, 12), u.substring(12, 16), u.subSequence(16, 20), a.substring(0, 12)).toUpperCase(us);
    }
    
    public static byte[] a(final long n) {
        final ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int)n);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }
    
    public static byte[] b(final long n) {
        final ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short)n);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }
    
    public final void c(final byte[] array) {
        final byte[] b = b(Process.myPid().shortValue());
        array[8] = b[0];
        array[9] = b[1];
    }
    
    public final void d(final byte[] array) {
        final byte[] b = b(h.a.incrementAndGet());
        array[6] = b[0];
        array[7] = b[1];
    }
    
    public final void e(final byte[] array) {
        final long time = new Date().getTime();
        final byte[] a = a(time / 1000L);
        array[0] = a[0];
        array[1] = a[1];
        array[2] = a[2];
        array[3] = a[3];
        final byte[] b = b(time % 1000L);
        array[4] = b[0];
        array[5] = b[1];
    }
    
    @Override
    public String toString() {
        return h.b;
    }
}

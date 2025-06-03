package H3;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: H3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0386h {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicLong f2263a = new AtomicLong(0);

    /* renamed from: b, reason: collision with root package name */
    public static String f2264b;

    public C0386h(C c7) {
        byte[] bArr = new byte[10];
        e(bArr);
        d(bArr);
        c(bArr);
        String A7 = AbstractC0387i.A(c7.a().c());
        String u7 = AbstractC0387i.u(bArr);
        Locale locale = Locale.US;
        f2264b = String.format(locale, "%s%s%s%s", u7.substring(0, 12), u7.substring(12, 16), u7.subSequence(16, 20), A7.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j7) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j7);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public static byte[] b(long j7) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j7);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final void c(byte[] bArr) {
        byte[] b7 = b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b7[0];
        bArr[9] = b7[1];
    }

    public final void d(byte[] bArr) {
        byte[] b7 = b(f2263a.incrementAndGet());
        bArr[6] = b7[0];
        bArr[7] = b7[1];
    }

    public final void e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a7 = a(time / 1000);
        bArr[0] = a7[0];
        bArr[1] = a7[1];
        bArr[2] = a7[2];
        bArr[3] = a7[3];
        byte[] b7 = b(time % 1000);
        bArr[4] = b7[0];
        bArr[5] = b7[1];
    }

    public String toString() {
        return f2264b;
    }
}

package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0777y {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f9198a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f9199b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f9200c;

    /* renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f9201d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC0761h f9202e;

    /* renamed from: androidx.datastore.preferences.protobuf.y$a */
    public interface a {
        boolean a(int i7);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$b */
    public interface b extends List, RandomAccess {
        b h(int i7);

        void j();

        boolean p();
    }

    static {
        byte[] bArr = new byte[0];
        f9200c = bArr;
        f9201d = ByteBuffer.wrap(bArr);
        f9202e = AbstractC0761h.h(bArr);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i7, int i8) {
        int i9 = i(i8, bArr, i7, i8);
        if (i9 == 0) {
            return 1;
        }
        return i9;
    }

    public static int f(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return q0.m(bArr);
    }

    public static Object h(Object obj, Object obj2) {
        return ((O) obj).f().h((O) obj2).c();
    }

    public static int i(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f9198a);
    }
}

package ma;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f10909a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f10910b;

    /* renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f10911c;

    public interface a {
        int a();
    }

    public interface b {
        boolean a();
    }

    public interface c extends d<Integer> {
    }

    public interface d<E> extends List<E>, RandomAccess {
        void b();

        d<E> c(int i10);

        boolean g();
    }

    static {
        Charset.forName("US-ASCII");
        f10909a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f10910b = bArr;
        f10911c = ByteBuffer.wrap(bArr);
        i.f(bArr, 0, 0, false);
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}

package s0;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
import s0.h;
import s0.v;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f14119a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f14120b;

    public interface a {
        int a();
    }

    public interface b {
        boolean a();
    }

    public interface c<E> extends List<E>, RandomAccess {
        void b();

        c<E> c(int i10);

        boolean g();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f14120b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new h.a(bArr, 0, 0, false).e(0);
        } catch (y e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static v c(Object obj, Object obj2) {
        v.a a10 = ((o0) obj).a();
        o0 o0Var = (o0) obj2;
        a10.getClass();
        if (!a10.f14106a.getClass().isInstance(o0Var)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        a10.j();
        v.a.k(a10.f14107b, (v) ((s0.a) o0Var));
        return a10.i();
    }
}

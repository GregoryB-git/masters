package a4;

import a4.b;
import a4.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import w3.a0;

/* loaded from: classes.dex */
public interface o {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f188a;

        /* renamed from: b, reason: collision with root package name */
        public final String f189b;

        public a(String str, byte[] bArr) {
            this.f188a = bArr;
            this.f189b = str;
        }
    }

    public interface b {
    }

    public interface c {
        o b(UUID uuid);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f190a;

        /* renamed from: b, reason: collision with root package name */
        public final String f191b;

        public d(String str, byte[] bArr) {
            this.f190a = bArr;
            this.f191b = str;
        }
    }

    Map<String, String> a(byte[] bArr);

    d b();

    z3.b c(byte[] bArr);

    byte[] d();

    void e(byte[] bArr, byte[] bArr2);

    void f(byte[] bArr);

    void g(b.a aVar);

    byte[] h(byte[] bArr, byte[] bArr2);

    void i(byte[] bArr);

    void j(byte[] bArr, a0 a0Var);

    a k(byte[] bArr, List<d.b> list, int i10, HashMap<String, String> hashMap);

    int l();

    boolean m(String str, byte[] bArr);

    void release();
}

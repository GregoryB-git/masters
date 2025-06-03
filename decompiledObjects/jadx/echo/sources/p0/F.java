package p0;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l0.y1;

/* loaded from: classes.dex */
public interface F {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f18217a;

        /* renamed from: b, reason: collision with root package name */
        public final String f18218b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18219c;

        public a(byte[] bArr, String str, int i7) {
            this.f18217a = bArr;
            this.f18218b = str;
            this.f18219c = i7;
        }

        public byte[] a() {
            return this.f18217a;
        }

        public String b() {
            return this.f18218b;
        }
    }

    public interface b {
        void a(F f7, byte[] bArr, int i7, int i8, byte[] bArr2);
    }

    public interface c {
        F a(UUID uuid);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f18220a;

        /* renamed from: b, reason: collision with root package name */
        public final String f18221b;

        public d(byte[] bArr, String str) {
            this.f18220a = bArr;
            this.f18221b = str;
        }

        public byte[] a() {
            return this.f18220a;
        }

        public String b() {
            return this.f18221b;
        }
    }

    void a(b bVar);

    boolean b(byte[] bArr, String str);

    void c(byte[] bArr, byte[] bArr2);

    Map d(byte[] bArr);

    void e(byte[] bArr);

    void f(byte[] bArr, y1 y1Var);

    byte[] g(byte[] bArr, byte[] bArr2);

    d h();

    void i(byte[] bArr);

    a j(byte[] bArr, List list, int i7, HashMap hashMap);

    int k();

    j0.b l(byte[] bArr);

    byte[] m();

    void release();
}

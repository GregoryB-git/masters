package eb;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import p7.a;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f5205c = Logger.getLogger(s0.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final a f5206d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final p7.a f5207e;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f5208a;

    /* renamed from: b, reason: collision with root package name */
    public int f5209b;

    public class a implements c<String> {
        @Override // eb.s0.c
        public final String a(Serializable serializable) {
            return (String) serializable;
        }

        @Override // eb.s0.c
        public final String b(String str) {
            return str;
        }
    }

    public static class b<T> extends d<T> {

        /* renamed from: e, reason: collision with root package name */
        public final c<T> f5210e;

        public b(String str, c cVar) {
            super(str, false, cVar);
            x6.b.r(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            x6.b.y(cVar, "marshaller");
            this.f5210e = cVar;
        }

        @Override // eb.s0.d
        public final T a(byte[] bArr) {
            return this.f5210e.b(new String(bArr, n7.d.f11282a));
        }

        @Override // eb.s0.d
        public final byte[] b(Serializable serializable) {
            String a10 = this.f5210e.a(serializable);
            x6.b.y(a10, "null marshaller.toAsciiString()");
            return a10.getBytes(n7.d.f11282a);
        }
    }

    public interface c<T> {
        String a(Serializable serializable);

        T b(String str);
    }

    public static abstract class d<T> {

        /* renamed from: d, reason: collision with root package name */
        public static final BitSet f5211d;

        /* renamed from: a, reason: collision with root package name */
        public final String f5212a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f5213b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f5214c;

        static {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
                bitSet.set(c10);
            }
            for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
                bitSet.set(c11);
            }
            f5211d = bitSet;
        }

        public d(String str, boolean z10, Object obj) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            x6.b.y(lowerCase, "name");
            x6.b.s("token must have at least 1 tchar", !lowerCase.isEmpty());
            if (lowerCase.equals("connection")) {
                s0.f5205c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i10 = 0; i10 < lowerCase.length(); i10++) {
                char charAt = lowerCase.charAt(i10);
                if ((!z10 || charAt != ':' || i10 != 0) && !f5211d.get(charAt)) {
                    throw new IllegalArgumentException(p2.m0.X("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
                }
            }
            this.f5212a = lowerCase;
            this.f5213b = lowerCase.getBytes(n7.d.f11282a);
            this.f5214c = obj;
        }

        public abstract T a(byte[] bArr);

        public abstract byte[] b(Serializable serializable);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f5212a.equals(((d) obj).f5212a);
        }

        public final int hashCode() {
            return this.f5212a.hashCode();
        }

        public final String toString() {
            return defpackage.g.f(defpackage.f.l("Key{name='"), this.f5212a, "'}");
        }
    }

    public static final class e<T> {
        public e() {
            throw null;
        }

        public final byte[] a() {
            synchronized (this) {
                throw null;
            }
        }
    }

    public static final class f<T> extends d<T> {

        /* renamed from: e, reason: collision with root package name */
        public final g<T> f5215e;

        public f(String str, boolean z10, g gVar) {
            super(str, z10, gVar);
            x6.b.r(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f5215e = gVar;
        }

        @Override // eb.s0.d
        public final T a(byte[] bArr) {
            return this.f5215e.b(bArr);
        }

        @Override // eb.s0.d
        public final byte[] b(Serializable serializable) {
            byte[] a10 = this.f5215e.a(serializable);
            x6.b.y(a10, "null marshaller.toAsciiString()");
            return a10;
        }
    }

    public interface g<T> {
        byte[] a(Serializable serializable);

        T b(byte[] bArr);
    }

    static {
        a.c cVar = p7.a.f13018a;
        Character ch = cVar.f13029c;
        p7.a aVar = cVar;
        if (ch != null) {
            aVar = cVar.g(cVar.f13028b);
        }
        f5207e = aVar;
    }

    public s0() {
    }

    public s0(byte[]... bArr) {
        this.f5209b = bArr.length / 2;
        this.f5208a = bArr;
    }

    public final <T> void a(d<T> dVar) {
        if (this.f5209b == 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = this.f5209b;
            if (i10 >= i12) {
                Arrays.fill(this.f5208a, i11 * 2, i12 * 2, (Object) null);
                this.f5209b = i11;
                return;
            }
            if (!Arrays.equals(dVar.f5213b, e(i10))) {
                byte[] e10 = e(i10);
                Object[] objArr = this.f5208a;
                int i13 = i11 * 2;
                objArr[i13] = e10;
                Object obj = objArr[(i10 * 2) + 1];
                if (objArr instanceof byte[][]) {
                    b(objArr != null ? objArr.length : 0);
                }
                this.f5208a[i13 + 1] = obj;
                i11++;
            }
            i10++;
        }
    }

    public final void b(int i10) {
        Object[] objArr = new Object[i10];
        int i11 = this.f5209b;
        if (!(i11 == 0)) {
            System.arraycopy(this.f5208a, 0, objArr, 0, i11 * 2);
        }
        this.f5208a = objArr;
    }

    public final <T> T c(d<T> dVar) {
        int i10 = this.f5209b;
        do {
            i10--;
            if (i10 < 0) {
                return null;
            }
        } while (!Arrays.equals(dVar.f5213b, e(i10)));
        Object obj = this.f5208a[(i10 * 2) + 1];
        if (obj instanceof byte[]) {
            return dVar.a((byte[]) obj);
        }
        e eVar = (e) obj;
        eVar.getClass();
        return dVar.a(eVar.a());
    }

    public final void d(s0 s0Var) {
        int i10 = s0Var.f5209b;
        if (i10 == 0) {
            return;
        }
        Object[] objArr = this.f5208a;
        int length = objArr != null ? objArr.length : 0;
        int i11 = this.f5209b;
        int i12 = length - (i11 * 2);
        if ((i11 == 0) || i12 < i10 * 2) {
            b((i10 * 2) + (i11 * 2));
        }
        System.arraycopy(s0Var.f5208a, 0, this.f5208a, this.f5209b * 2, s0Var.f5209b * 2);
        this.f5209b += s0Var.f5209b;
    }

    public final byte[] e(int i10) {
        return (byte[]) this.f5208a[i10 * 2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r1 == (r2 != null ? r2.length : 0)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(eb.s0.d r5, java.io.Serializable r6) {
        /*
            r4 = this;
            java.lang.String r0 = "key"
            x6.b.y(r5, r0)
            java.lang.String r0 = "value"
            x6.b.y(r6, r0)
            int r0 = r4.f5209b
            int r1 = r0 * 2
            if (r1 == 0) goto L19
            java.lang.Object[] r2 = r4.f5208a
            if (r2 == 0) goto L16
            int r2 = r2.length
            goto L17
        L16:
            r2 = 0
        L17:
            if (r1 != r2) goto L26
        L19:
            int r0 = r0 * 2
            int r0 = r0 * 2
            r1 = 8
            int r0 = java.lang.Math.max(r0, r1)
            r4.b(r0)
        L26:
            int r0 = r4.f5209b
            byte[] r1 = r5.f5213b
            java.lang.Object[] r2 = r4.f5208a
            int r3 = r0 * 2
            r2[r3] = r1
            byte[] r5 = r5.b(r6)
            java.lang.Object[] r6 = r4.f5208a
            int r0 = r0 * 2
            int r0 = r0 + 1
            r6[r0] = r5
            int r5 = r4.f5209b
            int r5 = r5 + 1
            r4.f5209b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.s0.f(eb.s0$d, java.io.Serializable):void");
    }

    public final byte[] g(int i10) {
        Object obj = this.f5208a[(i10 * 2) + 1];
        return obj instanceof byte[] ? (byte[]) obj : ((e) obj).a();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(");
        for (int i10 = 0; i10 < this.f5209b; i10++) {
            if (i10 != 0) {
                sb2.append(',');
            }
            byte[] e10 = e(i10);
            Charset charset = n7.d.f11282a;
            String str = new String(e10, charset);
            sb2.append(str);
            sb2.append('=');
            sb2.append(str.endsWith("-bin") ? f5207e.c(g(i10)) : new String(g(i10), charset));
        }
        sb2.append(')');
        return sb2.toString();
    }
}

package f2;

import android.util.Base64;
import c2.EnumC0821d;
import f2.d;

/* loaded from: classes.dex */
public abstract class p {

    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(EnumC0821d enumC0821d);
    }

    public static a a() {
        return new d.b().d(EnumC0821d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract EnumC0821d d();

    public boolean e() {
        return c() != null;
    }

    public p f(EnumC0821d enumC0821d) {
        return a().b(b()).d(enumC0821d).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}

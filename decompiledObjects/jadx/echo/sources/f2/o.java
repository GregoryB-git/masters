package f2;

import c2.AbstractC0820c;
import c2.C0819b;
import c2.InterfaceC0822e;
import f2.c;

/* loaded from: classes.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(C0819b c0819b);

        public abstract a c(AbstractC0820c abstractC0820c);

        public abstract a d(InterfaceC0822e interfaceC0822e);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract C0819b b();

    public abstract AbstractC0820c c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    public abstract InterfaceC0822e e();

    public abstract p f();

    public abstract String g();
}

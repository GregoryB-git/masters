package e2;

import e2.C1248g;
import java.util.List;

/* renamed from: e2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1254m {

    /* renamed from: e2.m$a */
    public static abstract class a {
        public abstract AbstractC1254m a();

        public abstract a b(AbstractC1252k abstractC1252k);

        public abstract a c(List list);

        public abstract a d(Integer num);

        public abstract a e(String str);

        public abstract a f(EnumC1257p enumC1257p);

        public abstract a g(long j7);

        public abstract a h(long j7);

        public a i(int i7) {
            return d(Integer.valueOf(i7));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new C1248g.b();
    }

    public abstract AbstractC1252k b();

    public abstract List c();

    public abstract Integer d();

    public abstract String e();

    public abstract EnumC1257p f();

    public abstract long g();

    public abstract long h();
}

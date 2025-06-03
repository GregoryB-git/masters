package v4;

import v4.C2057b;

/* renamed from: v4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2061f {

    /* renamed from: v4.f$a */
    public static abstract class a {
        public abstract AbstractC2061f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j7);
    }

    /* renamed from: v4.f$b */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new C2057b.C0281b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}

package e2;

import e2.C1246e;

/* renamed from: e2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1252k {

    /* renamed from: e2.k$a */
    public static abstract class a {
        public abstract AbstractC1252k a();

        public abstract a b(AbstractC1242a abstractC1242a);

        public abstract a c(b bVar);
    }

    /* renamed from: e2.k$b */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* renamed from: o, reason: collision with root package name */
        public final int f13885o;

        b(int i7) {
            this.f13885o = i7;
        }
    }

    public static a a() {
        return new C1246e.b();
    }

    public abstract AbstractC1242a b();

    public abstract b c();
}

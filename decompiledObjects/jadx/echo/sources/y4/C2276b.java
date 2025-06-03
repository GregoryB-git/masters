package y4;

import com.google.firebase.messaging.M;

/* renamed from: y4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2276b {

    /* renamed from: b, reason: collision with root package name */
    public static final C2276b f21480b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final C2275a f21481a;

    /* renamed from: y4.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public C2275a f21482a = null;

        public C2276b a() {
            return new C2276b(this.f21482a);
        }

        public a b(C2275a c2275a) {
            this.f21482a = c2275a;
            return this;
        }
    }

    public C2276b(C2275a c2275a) {
        this.f21481a = c2275a;
    }

    public static a b() {
        return new a();
    }

    public C2275a a() {
        return this.f21481a;
    }

    public byte[] c() {
        return M.a(this);
    }
}

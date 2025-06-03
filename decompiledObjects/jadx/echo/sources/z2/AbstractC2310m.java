package z2;

import A2.AbstractC0328n;
import V2.C0660k;
import x2.C2190d;
import y2.C2270a;

/* renamed from: z2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2310m {

    /* renamed from: a, reason: collision with root package name */
    public final C2190d[] f21736a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21737b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21738c;

    /* renamed from: z2.m$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC2308k f21739a;

        /* renamed from: c, reason: collision with root package name */
        public C2190d[] f21741c;

        /* renamed from: b, reason: collision with root package name */
        public boolean f21740b = true;

        /* renamed from: d, reason: collision with root package name */
        public int f21742d = 0;

        public /* synthetic */ a(O o7) {
        }

        public AbstractC2310m a() {
            AbstractC0328n.b(this.f21739a != null, "execute parameter required");
            return new N(this, this.f21741c, this.f21740b, this.f21742d);
        }

        public a b(InterfaceC2308k interfaceC2308k) {
            this.f21739a = interfaceC2308k;
            return this;
        }

        public a c(boolean z7) {
            this.f21740b = z7;
            return this;
        }

        public a d(C2190d... c2190dArr) {
            this.f21741c = c2190dArr;
            return this;
        }
    }

    public AbstractC2310m(C2190d[] c2190dArr, boolean z7, int i7) {
        this.f21736a = c2190dArr;
        boolean z8 = false;
        if (c2190dArr != null && z7) {
            z8 = true;
        }
        this.f21737b = z8;
        this.f21738c = i7;
    }

    public static a a() {
        return new a(null);
    }

    public abstract void b(C2270a.b bVar, C0660k c0660k);

    public boolean c() {
        return this.f21737b;
    }

    public final int d() {
        return this.f21738c;
    }

    public final C2190d[] e() {
        return this.f21736a;
    }
}

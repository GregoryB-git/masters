package i2;

import f2.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1347a {

    /* renamed from: e, reason: collision with root package name */
    public static final C1347a f14816e = new C0216a().b();

    /* renamed from: a, reason: collision with root package name */
    public final C1352f f14817a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14818b;

    /* renamed from: c, reason: collision with root package name */
    public final C1348b f14819c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14820d;

    /* renamed from: i2.a$a, reason: collision with other inner class name */
    public static final class C0216a {

        /* renamed from: a, reason: collision with root package name */
        public C1352f f14821a = null;

        /* renamed from: b, reason: collision with root package name */
        public List f14822b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public C1348b f14823c = null;

        /* renamed from: d, reason: collision with root package name */
        public String f14824d = "";

        public C0216a a(C1350d c1350d) {
            this.f14822b.add(c1350d);
            return this;
        }

        public C1347a b() {
            return new C1347a(this.f14821a, Collections.unmodifiableList(this.f14822b), this.f14823c, this.f14824d);
        }

        public C0216a c(String str) {
            this.f14824d = str;
            return this;
        }

        public C0216a d(C1348b c1348b) {
            this.f14823c = c1348b;
            return this;
        }

        public C0216a e(C1352f c1352f) {
            this.f14821a = c1352f;
            return this;
        }
    }

    public C1347a(C1352f c1352f, List list, C1348b c1348b, String str) {
        this.f14817a = c1352f;
        this.f14818b = list;
        this.f14819c = c1348b;
        this.f14820d = str;
    }

    public static C0216a e() {
        return new C0216a();
    }

    public String a() {
        return this.f14820d;
    }

    public C1348b b() {
        return this.f14819c;
    }

    public List c() {
        return this.f14818b;
    }

    public C1352f d() {
        return this.f14817a;
    }

    public byte[] f() {
        return m.a(this);
    }
}

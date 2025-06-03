package i2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: i2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1350d {

    /* renamed from: c, reason: collision with root package name */
    public static final C1350d f14842c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final String f14843a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14844b;

    /* renamed from: i2.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f14845a = "";

        /* renamed from: b, reason: collision with root package name */
        public List f14846b = new ArrayList();

        public C1350d a() {
            return new C1350d(this.f14845a, Collections.unmodifiableList(this.f14846b));
        }

        public a b(List list) {
            this.f14846b = list;
            return this;
        }

        public a c(String str) {
            this.f14845a = str;
            return this;
        }
    }

    public C1350d(String str, List list) {
        this.f14843a = str;
        this.f14844b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f14844b;
    }

    public String b() {
        return this.f14843a;
    }
}

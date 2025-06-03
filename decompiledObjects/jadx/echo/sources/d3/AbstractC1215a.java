package d3;

import g3.AbstractC1318a;
import java.security.GeneralSecurityException;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1215a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13171a = new C1219e().d();

    /* renamed from: b, reason: collision with root package name */
    public static final String f13172b = new p().d();

    /* renamed from: c, reason: collision with root package name */
    public static final String f13173c = new u().d();

    /* renamed from: d, reason: collision with root package name */
    public static final String f13174d = new C1222h().d();

    /* renamed from: e, reason: collision with root package name */
    public static final String f13175e = new C1210D().d();

    /* renamed from: f, reason: collision with root package name */
    public static final String f13176f = new C1212F().d();

    /* renamed from: g, reason: collision with root package name */
    public static final String f13177g = new z().d();

    /* renamed from: h, reason: collision with root package name */
    public static final String f13178h = new C1214H().d();

    /* renamed from: i, reason: collision with root package name */
    public static final p3.J f13179i;

    /* renamed from: j, reason: collision with root package name */
    public static final p3.J f13180j;

    /* renamed from: k, reason: collision with root package name */
    public static final p3.J f13181k;

    static {
        p3.J V6 = p3.J.V();
        f13179i = V6;
        f13180j = V6;
        f13181k = V6;
        try {
            a();
        } catch (GeneralSecurityException e7) {
            throw new ExceptionInInitializerError(e7);
        }
    }

    public static void a() {
        b();
    }

    public static void b() {
        C1218d.e();
        l3.o.b();
        C1219e.p(true);
        p.o(true);
        if (AbstractC1318a.a()) {
            return;
        }
        C1222h.o(true);
        u.p(true);
        z.m(true);
        C1210D.m(true);
        C1212F.m(true);
        C1214H.m(true);
    }
}

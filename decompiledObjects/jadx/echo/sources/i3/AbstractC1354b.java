package i3;

import g3.AbstractC1318a;
import java.security.GeneralSecurityException;
import p3.J;

/* renamed from: i3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1354b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14858a = new C1353a().d();

    /* renamed from: b, reason: collision with root package name */
    public static final J f14859b = J.V();

    /* renamed from: c, reason: collision with root package name */
    public static final J f14860c = J.V();

    static {
        try {
            a();
        } catch (GeneralSecurityException e7) {
            throw new ExceptionInInitializerError(e7);
        }
    }

    public static void a() {
        C1355c.e();
        if (AbstractC1318a.a()) {
            return;
        }
        C1353a.m(true);
    }
}

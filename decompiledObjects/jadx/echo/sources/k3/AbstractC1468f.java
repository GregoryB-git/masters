package k3;

import c3.C0833k;
import c3.C0844v;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import n3.C1727c;
import n3.InterfaceC1726b;
import p3.z;

/* renamed from: k3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1468f {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC1726b.a f16149a = new b(null);

    /* renamed from: k3.f$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16150a;

        static {
            int[] iArr = new int[z.values().length];
            f16150a = iArr;
            try {
                iArr[z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16150a[z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16150a[z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static C1727c a(C0844v c0844v) {
        C1727c.b a7 = C1727c.a();
        a7.d(c0844v.d());
        Iterator it = c0844v.c().iterator();
        while (it.hasNext()) {
            for (C0844v.c cVar : (List) it.next()) {
                a7.a(c(cVar.h()), cVar.d(), b(cVar.e()), cVar.f().name());
            }
        }
        if (c0844v.e() != null) {
            a7.e(c0844v.e().d());
        }
        try {
            return a7.b();
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static String b(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }

    public static C0833k c(z zVar) {
        int i7 = a.f16150a[zVar.ordinal()];
        if (i7 == 1) {
            return C0833k.f10085b;
        }
        if (i7 == 2) {
            return C0833k.f10086c;
        }
        if (i7 == 3) {
            return C0833k.f10087d;
        }
        throw new IllegalStateException("Unknown key status");
    }

    /* renamed from: k3.f$b */
    public static class b implements InterfaceC1726b.a {
        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // n3.InterfaceC1726b.a
        public void a() {
        }

        @Override // n3.InterfaceC1726b.a
        public void b(int i7, long j7) {
        }
    }
}

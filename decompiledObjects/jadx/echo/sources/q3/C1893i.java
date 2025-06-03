package q3;

import h3.AbstractC1336b;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q3.InterfaceC1894j;

/* renamed from: q3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1893i {

    /* renamed from: b, reason: collision with root package name */
    public static final C1893i f18864b = new C1893i(new InterfaceC1894j.a());

    /* renamed from: c, reason: collision with root package name */
    public static final C1893i f18865c = new C1893i(new InterfaceC1894j.e());

    /* renamed from: d, reason: collision with root package name */
    public static final C1893i f18866d = new C1893i(new InterfaceC1894j.g());

    /* renamed from: e, reason: collision with root package name */
    public static final C1893i f18867e = new C1893i(new InterfaceC1894j.f());

    /* renamed from: f, reason: collision with root package name */
    public static final C1893i f18868f = new C1893i(new InterfaceC1894j.b());

    /* renamed from: g, reason: collision with root package name */
    public static final C1893i f18869g = new C1893i(new InterfaceC1894j.d());

    /* renamed from: h, reason: collision with root package name */
    public static final C1893i f18870h = new C1893i(new InterfaceC1894j.c());

    /* renamed from: a, reason: collision with root package name */
    public final e f18871a;

    /* renamed from: q3.i$b */
    public static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1894j f18872a;

        public b(InterfaceC1894j interfaceC1894j) {
            this.f18872a = interfaceC1894j;
        }

        @Override // q3.C1893i.e
        public Object a(String str) {
            Iterator it = C1893i.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f18872a.a(str, (Provider) it.next());
                } catch (Exception e7) {
                    if (exc == null) {
                        exc = e7;
                    }
                }
            }
            return this.f18872a.a(str, null);
        }
    }

    /* renamed from: q3.i$c */
    public static class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1894j f18873a;

        public c(InterfaceC1894j interfaceC1894j) {
            this.f18873a = interfaceC1894j;
        }

        @Override // q3.C1893i.e
        public Object a(String str) {
            return this.f18873a.a(str, null);
        }
    }

    /* renamed from: q3.i$d */
    public static class d implements e {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1894j f18874a;

        public d(InterfaceC1894j interfaceC1894j) {
            this.f18874a = interfaceC1894j;
        }

        @Override // q3.C1893i.e
        public Object a(String str) {
            Iterator it = C1893i.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f18874a.a(str, (Provider) it.next());
                } catch (Exception e7) {
                    if (exc == null) {
                        exc = e7;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }

    /* renamed from: q3.i$e */
    public interface e {
        Object a(String str);
    }

    public C1893i(InterfaceC1894j interfaceC1894j) {
        this.f18871a = AbstractC1336b.c() ? new d(interfaceC1894j) : AbstractC1901q.b() ? new b(interfaceC1894j) : new c(interfaceC1894j);
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public Object a(String str) {
        return this.f18871a.a(str);
    }
}

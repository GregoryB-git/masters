/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.security.Provider
 *  java.security.Security
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package q3;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q3.j;
import q3.q;

public final class i {
    public static final i b = new i(new j.a());
    public static final i c = new i(new j.e());
    public static final i d = new i(new j.g());
    public static final i e = new i(new j.f());
    public static final i f = new i(new j.b());
    public static final i g = new i(new j.d());
    public static final i h = new i(new j.c());
    public final e a;

    /*
     * Enabled aggressive block sorting
     */
    public i(j object) {
        object = h3.b.c() ? new d((j)object, null) : (q.b() ? new b((j)object, null) : new c((j)object, null));
        this.a = object;
    }

    public static /* varargs */ List b(String ... arrstring) {
        ArrayList arrayList = new ArrayList();
        int n8 = arrstring.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            Provider provider = Security.getProvider((String)arrstring[i8]);
            if (provider == null) continue;
            arrayList.add((Object)provider);
        }
        return arrayList;
    }

    public Object a(String string2) {
        return this.a.a(string2);
    }

    public static class b
    implements e {
        public final j a;

        public b(j j8) {
            this.a = j8;
        }

        public /* synthetic */ b(j j8,  a8) {
            this(j8);
        }

        @Override
        public Object a(String string2) {
            Iterator iterator = i.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exception = null;
            while (iterator.hasNext()) {
                Object object = (Provider)iterator.next();
                try {
                    object = this.a.a(string2, (Provider)object);
                    return object;
                }
                catch (Exception exception2) {
                    if (exception != null) continue;
                    exception = exception2;
                }
            }
            return this.a.a(string2, null);
        }
    }

    public static class c
    implements e {
        public final j a;

        public c(j j8) {
            this.a = j8;
        }

        public /* synthetic */ c(j j8,  a8) {
            this(j8);
        }

        @Override
        public Object a(String string2) {
            return this.a.a(string2, null);
        }
    }

    public static class d
    implements e {
        public final j a;

        public d(j j8) {
            this.a = j8;
        }

        public /* synthetic */ d(j j8,  a8) {
            this(j8);
        }

        @Override
        public Object a(String string2) {
            Iterator iterator = i.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exception = null;
            while (iterator.hasNext()) {
                Object object = (Provider)iterator.next();
                try {
                    object = this.a.a(string2, (Provider)object);
                    return object;
                }
                catch (Exception exception2) {
                    if (exception != null) continue;
                    exception = exception2;
                }
            }
            throw new GeneralSecurityException("No good Provider found.", (Throwable)exception);
        }
    }

    public static interface e {
        public Object a(String var1);
    }

}


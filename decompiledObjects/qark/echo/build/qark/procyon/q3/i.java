// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.security.Security;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import h3.b;

public final class i
{
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public final e a;
    
    static {
        b = new i(new j.a());
        c = new i(new j.e());
        d = new i(new j.g());
        e = new i(new j.f());
        f = new i(new j.b());
        g = new i(new j.d());
        h = new i(new j.c());
    }
    
    public i(final j j) {
        e a;
        if (h3.b.c()) {
            a = new d(j, null);
        }
        else if (q.b()) {
            a = new b(j, null);
        }
        else {
            a = new c(j, null);
        }
        this.a = a;
    }
    
    public static List b(final String... array) {
        final ArrayList<Provider> list = new ArrayList<Provider>();
        for (int length = array.length, i = 0; i < length; ++i) {
            final Provider provider = Security.getProvider(array[i]);
            if (provider != null) {
                list.add(provider);
            }
        }
        return list;
    }
    
    public Object a(final String s) {
        return this.a.a(s);
    }
    
    public static class b implements e
    {
        public final j a;
        
        public b(final j a) {
            this.a = a;
        }
        
        @Override
        public Object a(final String s) {
            final Iterator<Provider> iterator = (Iterator<Provider>)i.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception ex = null;
            while (iterator.hasNext()) {
                final Provider provider = iterator.next();
                try {
                    return this.a.a(s, provider);
                }
                catch (Exception ex2) {
                    if (ex == null) {
                        ex = ex2;
                        continue;
                    }
                    continue;
                }
                break;
            }
            return this.a.a(s, null);
        }
    }
    
    public static class c implements e
    {
        public final j a;
        
        public c(final j a) {
            this.a = a;
        }
        
        @Override
        public Object a(final String s) {
            return this.a.a(s, null);
        }
    }
    
    public static class d implements e
    {
        public final j a;
        
        public d(final j a) {
            this.a = a;
        }
        
        @Override
        public Object a(final String s) {
            final Iterator<Provider> iterator = i.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Throwable cause = null;
            while (iterator.hasNext()) {
                final Provider provider = iterator.next();
                try {
                    return this.a.a(s, provider);
                }
                catch (Exception ex) {
                    if (cause == null) {
                        cause = ex;
                        continue;
                    }
                    continue;
                }
                break;
            }
            throw new GeneralSecurityException("No good Provider found.", cause);
        }
    }
    
    public interface e
    {
        Object a(final String p0);
    }
}

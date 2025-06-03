// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l4;

import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.DateFormat;
import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;
import j4.e;
import j4.g;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import j4.f;
import k4.b;

public final class d implements k4.b
{
    public static final j4.d e;
    public static final f f;
    public static final f g;
    public static final b h;
    public final Map a;
    public final Map b;
    public j4.d c;
    public boolean d;
    
    static {
        e = new a();
        f = new l4.b();
        g = new c();
        h = new b(null);
    }
    
    public d() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = l4.d.e;
        this.d = false;
        this.p(String.class, l4.d.f);
        this.p(Boolean.class, l4.d.g);
        this.p(Date.class, l4.d.h);
    }
    
    public static /* synthetic */ Map e(final d d) {
        return d.a;
    }
    
    public static /* synthetic */ Map f(final d d) {
        return d.b;
    }
    
    public static /* synthetic */ j4.d g(final d d) {
        return d.c;
    }
    
    public static /* synthetic */ boolean h(final d d) {
        return d.d;
    }
    
    public j4.a i() {
        return new j4.a() {
            @Override
            public String a(final Object o) {
                final StringWriter stringWriter = new StringWriter();
                try {
                    this.b(o, stringWriter);
                    return stringWriter.toString();
                }
                catch (IOException ex) {
                    return stringWriter.toString();
                }
            }
            
            @Override
            public void b(final Object o, final Writer writer) {
                final l4.e e = new l4.e(writer, l4.d.e(l4.d.this), l4.d.f(l4.d.this), l4.d.g(l4.d.this), l4.d.h(l4.d.this));
                e.k(o, false);
                e.u();
            }
        };
    }
    
    public d j(final k4.a a) {
        a.a(this);
        return this;
    }
    
    public d k(final boolean d) {
        this.d = d;
        return this;
    }
    
    public d o(final Class clazz, final j4.d d) {
        this.a.put(clazz, d);
        this.b.remove(clazz);
        return this;
    }
    
    public d p(final Class clazz, final f f) {
        this.b.put(clazz, f);
        this.a.remove(clazz);
        return this;
    }
    
    public static final class b implements f
    {
        public static final DateFormat a;
        
        static {
            (a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US)).setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        
        public void b(final Date date, final g g) {
            g.d(b.a.format(date));
        }
    }
}

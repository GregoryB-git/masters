// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import t5.b;
import java.util.HashMap;
import java.util.Map;
import E5.l;
import E5.c;
import E5.q;
import w5.a;
import E5.j;
import E5.k;

public class s
{
    public final boolean a;
    public byte[] b;
    public k c;
    public k.d d;
    public boolean e;
    public boolean f;
    public final k.c g;
    
    public s(final k c, final boolean a) {
        this.e = false;
        this.f = false;
        final k.c g = new k.c() {
            @Override
            public void onMethodCall(final j j, final d d) {
                final String a = j.a;
                final Object b = j.b;
                a.hashCode();
                Object e;
                if (!a.equals("get")) {
                    if (!a.equals("put")) {
                        d.c();
                        return;
                    }
                    s.b(s.this, (byte[])b);
                    e = null;
                }
                else {
                    s.c(s.this, true);
                    if (!s.d(s.this)) {
                        final s a2 = s.this;
                        if (a2.a) {
                            s.f(a2, d);
                            return;
                        }
                    }
                    final s a3 = s.this;
                    e = a3.i(s.a(a3));
                }
                d.a(e);
            }
        };
        this.g = g;
        this.c = c;
        this.a = a;
        c.e((k.c)g);
    }
    
    public s(final a a, final boolean b) {
        this(new k(a, "flutter/restoration", q.b), b);
    }
    
    public static /* synthetic */ byte[] a(final s s) {
        return s.b;
    }
    
    public static /* synthetic */ byte[] b(final s s, final byte[] b) {
        return s.b = b;
    }
    
    public static /* synthetic */ boolean c(final s s, final boolean f) {
        return s.f = f;
    }
    
    public static /* synthetic */ boolean d(final s s) {
        return s.e;
    }
    
    public static /* synthetic */ k.d f(final s s, final k.d d) {
        return s.d = d;
    }
    
    public void g() {
        this.b = null;
    }
    
    public byte[] h() {
        return this.b;
    }
    
    public final Map i(final byte[] array) {
        final HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", (Boolean)(Object)array);
        return hashMap;
    }
    
    public void j(final byte[] b) {
        this.e = true;
        final k.d d = this.d;
        if (d != null) {
            d.a(this.i(b));
            this.d = null;
        }
        else if (this.f) {
            this.c.d("push", this.i(b), (k.d)new k.d() {
                @Override
                public void a(final Object o) {
                    s.b(s.this, b);
                }
                
                @Override
                public void b(final String str, final String str2, final Object o) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Error ");
                    sb.append(str);
                    sb.append(" while sending restoration data to framework: ");
                    sb.append(str2);
                    t5.b.b("RestorationChannel", sb.toString());
                }
                
                @Override
                public void c() {
                }
            });
            return;
        }
        this.b = b;
    }
}

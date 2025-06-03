// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a4;

import java.io.IOException;
import java.util.HashMap;
import b4.e;
import b4.c;
import b4.d;
import Y3.m;
import d4.r;
import d4.l;
import d4.g;
import d4.f;
import d4.a;
import d4.t;
import d4.o;
import java.util.Map;
import d4.q;
import d4.b;
import d4.n;

public final class h
{
    public static final h i;
    public Integer a;
    public b b;
    public n c;
    public d4.b d;
    public n e;
    public d4.b f;
    public d4.h g;
    public String h;
    
    static {
        i = new h();
    }
    
    public h() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = q.j();
        this.h = null;
    }
    
    public static h c(final Map map) {
        final h h = new h();
        h.a = map.get("l");
        if (map.containsKey("sp")) {
            h.c = v(o.a(map.get("sp")));
            final String s = (String)map.get("sn");
            if (s != null) {
                h.d = d4.b.j(s);
            }
        }
        if (map.containsKey("ep")) {
            h.e = v(o.a(map.get("ep")));
            final String s2 = (String)map.get("en");
            if (s2 != null) {
                h.f = d4.b.j(s2);
            }
        }
        final String s3 = (String)map.get("vf");
        if (s3 != null) {
            b b;
            if (s3.equals("l")) {
                b = a4.h.b.o;
            }
            else {
                b = a4.h.b.p;
            }
            h.b = b;
        }
        final String s4 = (String)map.get("i");
        if (s4 != null) {
            h.g = d4.h.b(s4);
        }
        return h;
    }
    
    public static n v(final n n) {
        if (n instanceof t || n instanceof a || n instanceof f) {
            return n;
        }
        if (n instanceof g) {
            return n;
        }
        if (n instanceof l) {
            return new f((double)n.getValue(), r.a());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected value passed to normalizeValue: ");
        sb.append(n.getValue());
        throw new IllegalStateException(sb.toString());
    }
    
    public final h a() {
        final h h = new h();
        h.a = this.a;
        h.c = this.c;
        h.d = this.d;
        h.e = this.e;
        h.f = this.f;
        h.b = this.b;
        h.g = this.g;
        return h;
    }
    
    public h b(final n e, final d4.b f) {
        m.f(e.B() || e.isEmpty());
        m.f(e instanceof l ^ true);
        final h a = this.a();
        a.e = e;
        a.f = f;
        return a;
    }
    
    public d4.h d() {
        return this.g;
    }
    
    public d4.b e() {
        if (!this.m()) {
            throw new IllegalArgumentException("Cannot get index end name if start has not been set");
        }
        final d4.b f = this.f;
        if (f != null) {
            return f;
        }
        return d4.b.m();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (h.class != o.getClass()) {
            return false;
        }
        final h h = (h)o;
        final Integer a = this.a;
        if (a != null) {
            if (!a.equals(h.a)) {
                return false;
            }
        }
        else if (h.a != null) {
            return false;
        }
        final d4.h g = this.g;
        if (g != null) {
            if (!g.equals(h.g)) {
                return false;
            }
        }
        else if (h.g != null) {
            return false;
        }
        final d4.b f = this.f;
        if (f != null) {
            if (!f.equals(h.f)) {
                return false;
            }
        }
        else if (h.f != null) {
            return false;
        }
        final n e = this.e;
        if (e != null) {
            if (!e.equals(h.e)) {
                return false;
            }
        }
        else if (h.e != null) {
            return false;
        }
        final d4.b d = this.d;
        if (d != null) {
            if (!d.equals(h.d)) {
                return false;
            }
        }
        else if (h.d != null) {
            return false;
        }
        final n c = this.c;
        if (c != null) {
            if (!c.equals(h.c)) {
                return false;
            }
        }
        else if (h.c != null) {
            return false;
        }
        return this.r() == h.r();
    }
    
    public n f() {
        if (this.m()) {
            return this.e;
        }
        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
    }
    
    public d4.b g() {
        if (!this.o()) {
            throw new IllegalArgumentException("Cannot get index start name if start has not been set");
        }
        final d4.b d = this.d;
        if (d != null) {
            return d;
        }
        return d4.b.n();
    }
    
    public n h() {
        if (this.o()) {
            return this.c;
        }
        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
    }
    
    @Override
    public int hashCode() {
        final Integer a = this.a;
        int hashCode = 0;
        int intValue;
        if (a != null) {
            intValue = a;
        }
        else {
            intValue = 0;
        }
        int n;
        if (this.r()) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        final n c = this.c;
        int hashCode2;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final d4.b d = this.d;
        int hashCode3;
        if (d != null) {
            hashCode3 = d.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final n e = this.e;
        int hashCode4;
        if (e != null) {
            hashCode4 = e.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final d4.b f = this.f;
        int hashCode5;
        if (f != null) {
            hashCode5 = f.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final d4.h g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return (((((intValue * 31 + n) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    public int i() {
        if (this.n()) {
            return this.a;
        }
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }
    
    public d j() {
        if (this.u()) {
            return new b4.b(this.d());
        }
        if (this.n()) {
            return new c(this);
        }
        return new e(this);
    }
    
    public Map k() {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        if (this.o()) {
            hashMap.put("sp", (String)this.c.getValue());
            final d4.b d = this.d;
            if (d != null) {
                hashMap.put("sn", d.e());
            }
        }
        if (this.m()) {
            hashMap.put("ep", (String)this.e.getValue());
            final d4.b f = this.f;
            if (f != null) {
                hashMap.put("en", f.e());
            }
        }
        final Integer a = this.a;
        if (a != null) {
            hashMap.put("l", (String)a);
            b b;
            if ((b = this.b) == null) {
                if (this.o()) {
                    b = a4.h.b.o;
                }
                else {
                    b = a4.h.b.p;
                }
            }
            final int n = h$a.a[b.ordinal()];
            if (n != 1) {
                if (n == 2) {
                    hashMap.put("vf", "r");
                }
            }
            else {
                hashMap.put("vf", "l");
            }
        }
        if (!this.g.equals(q.j())) {
            hashMap.put("i", this.g.c());
        }
        return hashMap;
    }
    
    public boolean l() {
        return this.n() && this.b != null;
    }
    
    public boolean m() {
        return this.e != null;
    }
    
    public boolean n() {
        return this.a != null;
    }
    
    public boolean o() {
        return this.c != null;
    }
    
    public boolean p() {
        return this.u() && this.g.equals(q.j());
    }
    
    public boolean q() {
        return !this.o() || !this.m() || !this.n() || this.l();
    }
    
    public boolean r() {
        final b b = this.b;
        if (b != null) {
            return b == a4.h.b.o;
        }
        return this.o();
    }
    
    public h s(final int i) {
        final h a = this.a();
        a.a = i;
        a.b = a4.h.b.o;
        return a;
    }
    
    public h t(final int i) {
        final h a = this.a();
        a.a = i;
        a.b = a4.h.b.p;
        return a;
    }
    
    @Override
    public String toString() {
        return this.k().toString();
    }
    
    public boolean u() {
        return !this.o() && !this.m() && !this.n();
    }
    
    public h w(final d4.h g) {
        final h a = this.a();
        a.g = g;
        return a;
    }
    
    public h x(final n c, final d4.b d) {
        m.f(c.B() || c.isEmpty());
        m.f(c instanceof l ^ true);
        final h a = this.a();
        a.c = c;
        a.d = d;
        return a;
    }
    
    public String y() {
        if (this.h == null) {
            try {
                this.h = f4.b.c(this.k());
            }
            catch (IOException cause) {
                throw new RuntimeException(cause);
            }
        }
        return this.h;
    }
    
    public enum b
    {
        o("LEFT", 0), 
        p("RIGHT", 1);
        
        public b(final String name, final int ordinal) {
        }
    }
}

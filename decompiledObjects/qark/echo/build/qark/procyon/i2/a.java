// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i2;

import java.util.Collections;
import java.util.ArrayList;
import f2.m;
import java.util.List;

public final class a
{
    public static final a e;
    public final f a;
    public final List b;
    public final b c;
    public final String d;
    
    static {
        e = new a().b();
    }
    
    public a(final f a, final List b, final b c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static a e() {
        return new a();
    }
    
    public String a() {
        return this.d;
    }
    
    public b b() {
        return this.c;
    }
    
    public List c() {
        return this.b;
    }
    
    public f d() {
        return this.a;
    }
    
    public byte[] f() {
        return m.a(this);
    }
    
    public static final class a
    {
        public f a;
        public List b;
        public b c;
        public String d;
        
        public a() {
            this.a = null;
            this.b = new ArrayList();
            this.c = null;
            this.d = "";
        }
        
        public a a(final d d) {
            this.b.add(d);
            return this;
        }
        
        public i2.a b() {
            return new i2.a(this.a, Collections.unmodifiableList((List<?>)this.b), this.c, this.d);
        }
        
        public a c(final String d) {
            this.d = d;
            return this;
        }
        
        public a d(final b c) {
            this.c = c;
            return this;
        }
        
        public a e(final f a) {
            this.a = a;
            return this;
        }
    }
}

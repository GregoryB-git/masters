// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i2;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public final class d
{
    public static final d c;
    public final String a;
    public final List b;
    
    static {
        c = new a().a();
    }
    
    public d(final String a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    public static a c() {
        return new a();
    }
    
    public List a() {
        return this.b;
    }
    
    public String b() {
        return this.a;
    }
    
    public static final class a
    {
        public String a;
        public List b;
        
        public a() {
            this.a = "";
            this.b = new ArrayList();
        }
        
        public d a() {
            return new d(this.a, Collections.unmodifiableList((List<?>)this.b));
        }
        
        public a b(final List b) {
            this.b = b;
            return this;
        }
        
        public a c(final String a) {
            this.a = a;
            return this;
        }
    }
}

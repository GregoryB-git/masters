// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i2;

public final class c
{
    public static final c c;
    public final long a;
    public final b b;
    
    static {
        c = new a().a();
    }
    
    public c(final long a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    public static a c() {
        return new a();
    }
    
    public long a() {
        return this.a;
    }
    
    public b b() {
        return this.b;
    }
    
    public static final class a
    {
        public long a;
        public b b;
        
        public a() {
            this.a = 0L;
            this.b = b.p;
        }
        
        public c a() {
            return new c(this.a, this.b);
        }
        
        public a b(final long a) {
            this.a = a;
            return this;
        }
        
        public a c(final b b) {
            this.b = b;
            return this;
        }
    }
    
    public enum b implements c
    {
        p("REASON_UNKNOWN", 0, 0), 
        q("MESSAGE_TOO_OLD", 1, 1), 
        r("CACHE_FULL", 2, 2), 
        s("PAYLOAD_TOO_BIG", 3, 3), 
        t("MAX_RETRIES_REACHED", 4, 4), 
        u("INVALID_PAYLOD", 5, 5), 
        v("SERVER_ERROR", 6, 6);
        
        public final int o;
        
        public b(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        @Override
        public int g() {
            return this.o;
        }
    }
}

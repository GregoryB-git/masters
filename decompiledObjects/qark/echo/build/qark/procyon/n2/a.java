// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n2;

public final class a extends e
{
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;
    
    public a(final long b, final int c, final int d, final long e, final int f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public int b() {
        return this.d;
    }
    
    @Override
    public long c() {
        return this.e;
    }
    
    @Override
    public int d() {
        return this.c;
    }
    
    @Override
    public int e() {
        return this.f;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof e) {
            final e e = (e)o;
            return this.b == e.f() && this.c == e.d() && this.d == e.b() && this.e == e.c() && this.f == e.e();
        }
        return false;
    }
    
    @Override
    public long f() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final int c = this.c;
        final int d = this.d;
        final long e = this.e;
        return ((((n ^ 0xF4243) * 1000003 ^ c) * 1000003 ^ d) * 1000003 ^ (int)(e >>> 32 ^ e)) * 1000003 ^ this.f;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.b);
        sb.append(", loadBatchSize=");
        sb.append(this.c);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.d);
        sb.append(", eventCleanUpAge=");
        sb.append(this.e);
        sb.append(", maxBlobByteSizePerRow=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends e.a
    {
        public Long a;
        public Integer b;
        public Integer c;
        public Long d;
        public Integer e;
        
        @Override
        public e a() {
            final Long a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" maxStorageSizeInBytes");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" loadBatchSize");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" criticalSectionEnterTimeoutMs");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.d == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" eventCleanUpAge");
                string4 = sb4.toString();
            }
            String string5 = string4;
            if (this.e == null) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                sb5.append(" maxBlobByteSizePerRow");
                string5 = sb5.toString();
            }
            if (string5.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, this.e, null);
            }
            final StringBuilder sb6 = new StringBuilder();
            sb6.append("Missing required properties:");
            sb6.append(string5);
            throw new IllegalStateException(sb6.toString());
        }
        
        @Override
        public e.a b(final int i) {
            this.c = i;
            return this;
        }
        
        @Override
        public e.a c(final long l) {
            this.d = l;
            return this;
        }
        
        @Override
        public e.a d(final int i) {
            this.b = i;
            return this;
        }
        
        @Override
        public e.a e(final int i) {
            this.e = i;
            return this;
        }
        
        @Override
        public e.a f(final long l) {
            this.a = l;
            return this;
        }
    }
}

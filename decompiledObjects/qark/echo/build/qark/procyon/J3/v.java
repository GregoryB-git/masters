// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class v extends e
{
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    
    public v(final int a, final String b, final String c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public String b() {
        return this.c;
    }
    
    @Override
    public int c() {
        return this.a;
    }
    
    @Override
    public String d() {
        return this.b;
    }
    
    @Override
    public boolean e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof e) {
            final e e = (e)o;
            return this.a == e.c() && this.b.equals(e.d()) && this.c.equals(e.b()) && this.d == e.e();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int a = this.a;
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        int n;
        if (this.d) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return (((a ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ n;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("OperatingSystem{platform=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends a
    {
        public Integer a;
        public String b;
        public String c;
        public Boolean d;
        
        @Override
        public e a() {
            final Integer a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" platform");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" version");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" buildVersion");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.d == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" jailbroken");
                string4 = sb4.toString();
            }
            if (string4.isEmpty()) {
                return new v(this.a, this.b, this.c, this.d, null);
            }
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("Missing required properties:");
            sb5.append(string4);
            throw new IllegalStateException(sb5.toString());
        }
        
        @Override
        public a b(final String c) {
            if (c != null) {
                this.c = c;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }
        
        @Override
        public a c(final boolean b) {
            this.d = b;
            return this;
        }
        
        @Override
        public a d(final int i) {
            this.a = i;
            return this;
        }
        
        @Override
        public a e(final String b) {
            if (b != null) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }
}

// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

public final class c extends a
{
    public final String a;
    public final String b;
    
    public c(final String a, final String b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }
    
    @Override
    public String c() {
        return this.a;
    }
    
    @Override
    public String d() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof a) {
            final a a = (a)o;
            if (this.a.equals(a.c())) {
                final String b = this.b;
                final String d = a.d();
                if (b == null) {
                    if (d == null) {
                        return true;
                    }
                }
                else if (b.equals(d)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("InstallIds{crashlyticsInstallId=");
        sb.append(this.a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}

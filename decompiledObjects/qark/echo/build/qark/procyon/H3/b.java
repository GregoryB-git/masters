// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import java.io.File;
import J3.B;

public final class b extends v
{
    public final B a;
    public final String b;
    public final File c;
    
    public b(final B a, final String b, final File c) {
        if (a == null) {
            throw new NullPointerException("Null report");
        }
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null reportFile");
    }
    
    @Override
    public B b() {
        return this.a;
    }
    
    @Override
    public File c() {
        return this.c;
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
        if (o instanceof v) {
            final v v = (v)o;
            return this.a.equals(v.b()) && this.b.equals(v.d()) && this.c.equals(v.c());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CrashlyticsReportWithSessionId{report=");
        sb.append(this.a);
        sb.append(", sessionId=");
        sb.append(this.b);
        sb.append(", reportFile=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}

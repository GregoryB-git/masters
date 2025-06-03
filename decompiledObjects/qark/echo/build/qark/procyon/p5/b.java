// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p5;

import java.util.List;
import n5.F;

public abstract class b implements e
{
    @Override
    public F d() {
        return new F(this.m(), this.n());
    }
    
    @Override
    public boolean e() {
        return Boolean.TRUE.equals(this.c("noResult"));
    }
    
    @Override
    public Boolean f() {
        return this.k("inTransaction");
    }
    
    @Override
    public Integer g() {
        return (Integer)this.c("transactionId");
    }
    
    @Override
    public boolean h() {
        return this.j("transactionId") && this.g() == null;
    }
    
    public final Boolean k(final String s) {
        final Object c = this.c(s);
        if (c instanceof Boolean) {
            return (Boolean)c;
        }
        return null;
    }
    
    public boolean l() {
        return Boolean.TRUE.equals(this.c("continueOnError"));
    }
    
    public final String m() {
        return (String)this.c("sql");
    }
    
    public final List n() {
        return (List)this.c("arguments");
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.i());
        sb.append(" ");
        sb.append(this.m());
        sb.append(" ");
        sb.append(this.n());
        return sb.toString();
    }
}

// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q4;

import P4.m;
import P4.t;

public class q implements t
{
    public final String a;
    public final int b;
    
    public q(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public double a() {
        if (this.b == 0) {
            return 0.0;
        }
        final String g = this.g();
        try {
            return Double.valueOf(g);
        }
        catch (NumberFormatException cause) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", g, "double"), cause);
        }
    }
    
    @Override
    public String b() {
        if (this.b == 0) {
            return "";
        }
        this.h();
        return this.a;
    }
    
    @Override
    public long c() {
        if (this.b == 0) {
            return 0L;
        }
        final String g = this.g();
        try {
            return Long.valueOf(g);
        }
        catch (NumberFormatException cause) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", g, "long"), cause);
        }
    }
    
    @Override
    public boolean d() {
        if (this.b == 0) {
            return false;
        }
        final String g = this.g();
        if (l.f.matcher(g).matches()) {
            return true;
        }
        if (l.g.matcher(g).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", g, "boolean"));
    }
    
    @Override
    public byte[] e() {
        if (this.b == 0) {
            return m.m;
        }
        return this.a.getBytes(l.e);
    }
    
    @Override
    public int f() {
        return this.b;
    }
    
    public final String g() {
        return this.b().trim();
    }
    
    public final void h() {
        if (this.a != null) {
            return;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }
}

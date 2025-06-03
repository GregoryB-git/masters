// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c2;

public final class a extends c
{
    public final Integer a;
    public final Object b;
    public final d c;
    
    public a(final Integer a, final Object b, final d c) {
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null priority");
    }
    
    @Override
    public Integer a() {
        return this.a;
    }
    
    @Override
    public Object b() {
        return this.b;
    }
    
    @Override
    public d c() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof c) {
            final c c = (c)o;
            final Integer a = this.a;
            if (a == null) {
                if (c.a() != null) {
                    return false;
                }
            }
            else if (!a.equals(c.a())) {
                return false;
            }
            if (this.b.equals(c.b()) && this.c.equals(c.c())) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Integer a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Event{code=");
        sb.append(this.a);
        sb.append(", payload=");
        sb.append(this.b);
        sb.append(", priority=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}

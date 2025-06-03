// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import d4.n;

public final class B
{
    public final long a;
    public final k b;
    public final n c;
    public final b d;
    public final boolean e;
    
    public B(final long a, final k b, final b d) {
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = d;
        this.e = true;
    }
    
    public B(final long a, final k b, final n c, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = null;
        this.e = e;
    }
    
    public b a() {
        final b d = this.d;
        if (d != null) {
            return d;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }
    
    public n b() {
        final n c = this.c;
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }
    
    public k c() {
        return this.b;
    }
    
    public long d() {
        return this.a;
    }
    
    public boolean e() {
        return this.c != null;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (B.class != o.getClass()) {
            return false;
        }
        final B b = (B)o;
        if (this.a != b.a) {
            return false;
        }
        if (!this.b.equals(b.b)) {
            return false;
        }
        if (this.e != b.e) {
            return false;
        }
        final n c = this.c;
        Label_0102: {
            if (c != null) {
                if (c.equals(b.c)) {
                    break Label_0102;
                }
            }
            else if (b.c == null) {
                break Label_0102;
            }
            return false;
        }
        final b d = this.d;
        final b d2 = b.d;
        if (d != null) {
            if (d.equals(d2)) {
                return true;
            }
        }
        else if (d2 == null) {
            return true;
        }
        return false;
    }
    
    public boolean f() {
        return this.e;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = Long.valueOf(this.a).hashCode();
        final int hashCode2 = Boolean.valueOf(this.e).hashCode();
        final int hashCode3 = this.b.hashCode();
        final n c = this.c;
        int hashCode4 = 0;
        int hashCode5;
        if (c != null) {
            hashCode5 = c.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final b d = this.d;
        if (d != null) {
            hashCode4 = d.hashCode();
        }
        return (((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode5) * 31 + hashCode4;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UserWriteRecord{id=");
        sb.append(this.a);
        sb.append(" path=");
        sb.append(this.b);
        sb.append(" visible=");
        sb.append(this.e);
        sb.append(" overwrite=");
        sb.append(this.c);
        sb.append(" merge=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}

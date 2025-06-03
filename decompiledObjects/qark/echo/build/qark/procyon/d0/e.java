// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

public final class e
{
    public final int a;
    public final float b;
    
    public e(final int a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (e.class != o.getClass()) {
            return false;
        }
        final e e = (e)o;
        return this.a == e.a && Float.compare(e.b, this.b) == 0;
    }
    
    @Override
    public int hashCode() {
        return (527 + this.a) * 31 + Float.floatToIntBits(this.b);
    }
}

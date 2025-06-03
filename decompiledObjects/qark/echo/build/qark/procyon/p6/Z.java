// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

public final class Z implements l0
{
    public final boolean o;
    
    public Z(final boolean o) {
        this.o = o;
    }
    
    @Override
    public boolean a() {
        return this.o;
    }
    
    @Override
    public C0 g() {
        return null;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        String str;
        if (this.a()) {
            str = "Active";
        }
        else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}

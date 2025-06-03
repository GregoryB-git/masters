// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.jvm.internal;

public final class m implements d
{
    public final Class o;
    public final String p;
    
    public m(final Class o, final String p2) {
        Intrinsics.checkNotNullParameter(o, "jClass");
        Intrinsics.checkNotNullParameter(p2, "moduleName");
        this.o = o;
        this.p = p2;
    }
    
    @Override
    public Class b() {
        return this.o;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof m && Intrinsics.a(this.b(), ((m)o).b());
    }
    
    @Override
    public int hashCode() {
        return this.b().hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}

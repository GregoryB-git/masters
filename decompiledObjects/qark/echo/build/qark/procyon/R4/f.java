// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;

public final class f
{
    public final d a;
    public final d b;
    public final double c;
    
    public f(final d a, final d b, final double c) {
        Intrinsics.checkNotNullParameter(a, "performance");
        Intrinsics.checkNotNullParameter(b, "crashlytics");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final d a() {
        return this.b;
    }
    
    public final d b() {
        return this.a;
    }
    
    public final double c() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return this.a == f.a && this.b == f.b && Intrinsics.a(this.c, f.c);
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + e.a(this.c);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DataCollectionStatus(performance=");
        sb.append(this.a);
        sb.append(", crashlytics=");
        sb.append(this.b);
        sb.append(", sessionSamplingRate=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}

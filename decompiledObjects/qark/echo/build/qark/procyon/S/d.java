// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S;

import kotlin.jvm.internal.Intrinsics;
import W5.C;
import java.util.Map;

public abstract class d
{
    public abstract Map a();
    
    public abstract Object b(final a p0);
    
    public final S.a c() {
        return new S.a(C.o(this.a()), false);
    }
    
    public final d d() {
        return new S.a(C.o(this.a()), true);
    }
    
    public static final class a
    {
        public final String a;
        
        public a(final String a) {
            Intrinsics.checkNotNullParameter(a, "name");
            this.a = a;
        }
        
        public final String a() {
            return this.a;
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof a && Intrinsics.a(this.a, ((a)o).a);
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public String toString() {
            return this.a;
        }
    }
    
    public abstract static final class b
    {
    }
}

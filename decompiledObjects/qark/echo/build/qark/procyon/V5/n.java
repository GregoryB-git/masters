// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V5;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import java.io.Serializable;

public abstract class n implements Serializable
{
    public static final a o;
    
    static {
        o = new a(null);
    }
    
    public static Object a(final Object o) {
        return o;
    }
    
    public static final Throwable b(final Object o) {
        if (o instanceof b) {
            return ((b)o).o;
        }
        return null;
    }
    
    public static final boolean c(final Object o) {
        return o instanceof b;
    }
    
    public static final class a
    {
    }
    
    public static final class b implements Serializable
    {
        public final Throwable o;
        
        public b(final Throwable o) {
            Intrinsics.checkNotNullParameter(o, "exception");
            this.o = o;
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof b && Intrinsics.a(this.o, ((b)o).o);
        }
        
        @Override
        public int hashCode() {
            return this.o.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failure(");
            sb.append(this.o);
            sb.append(')');
            return sb.toString();
        }
    }
}

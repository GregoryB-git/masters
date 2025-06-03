// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S4;

import kotlin.jvm.internal.Intrinsics;

public interface b
{
    a a();
    
    void b(final b p0);
    
    boolean c();
    
    public enum a
    {
        o("CRASHLYTICS", 0), 
        p("PERFORMANCE", 1), 
        q("MATT_SAYS_HI", 2);
        
        static {
            r = c();
        }
        
        public a(final String name, final int ordinal) {
        }
        
        public static final /* synthetic */ a[] c() {
            return new a[] { a.o, a.p, a.q };
        }
    }
    
    public static final class b
    {
        public final String a;
        
        public b(final String a) {
            Intrinsics.checkNotNullParameter(a, "sessionId");
            this.a = a;
        }
        
        public final String a() {
            return this.a;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof b && Intrinsics.a(this.a, ((b)o).a));
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("SessionDetails(sessionId=");
            sb.append(this.a);
            sb.append(')');
            return sb.toString();
        }
    }
}

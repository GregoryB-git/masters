// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P4;

import com.google.firebase.remoteconfig.internal.c;

public class s
{
    public final long a;
    public final long b;
    
    public s(final b b) {
        this.a = s.b.a(b);
        this.b = s.b.b(b);
    }
    
    public long a() {
        return this.a;
    }
    
    public long b() {
        return this.b;
    }
    
    public static class b
    {
        public long a;
        public long b;
        
        public b() {
            this.a = 60L;
            this.b = c.j;
        }
        
        public static /* synthetic */ long a(final b b) {
            return b.a;
        }
        
        public static /* synthetic */ long b(final b b) {
            return b.b;
        }
        
        public s c() {
            return new s(this, null);
        }
        
        public b d(final long n) {
            if (n >= 0L) {
                this.a = n;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", n));
        }
        
        public b e(final long n) {
            if (n >= 0L) {
                this.b = n;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Minimum interval between fetches has to be a non-negative number. ");
            sb.append(n);
            sb.append(" is an invalid argument");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}

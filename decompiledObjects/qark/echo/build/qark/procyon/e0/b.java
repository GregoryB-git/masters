// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e0;

import W2.k;
import d0.q;
import g0.M;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public interface b
{
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    
    boolean a();
    
    void b();
    
    boolean c();
    
    ByteBuffer d();
    
    void e();
    
    void f(final ByteBuffer p0);
    
    void flush();
    
    a g(final a p0);
    
    public static final class a
    {
        public static final a e;
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        
        static {
            e = new a(-1, -1, -1);
        }
        
        public a(int g0, final int b, final int c) {
            this.a = g0;
            this.b = b;
            this.c = c;
            if (M.A0(c)) {
                g0 = M.g0(c, b);
            }
            else {
                g0 = -1;
            }
            this.d = g0;
        }
        
        public a(final q q) {
            this(q.C, q.B, q.D);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && this.b == a.b && this.c == a.c;
        }
        
        @Override
        public int hashCode() {
            return k.b(this.a, this.b, this.c);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("AudioFormat[sampleRate=");
            sb.append(this.a);
            sb.append(", channelCount=");
            sb.append(this.b);
            sb.append(", encoding=");
            sb.append(this.c);
            sb.append(']');
            return sb.toString();
        }
    }
    
    public static final class b extends Exception
    {
        public final a o;
        
        public b(final a a) {
            this("Unhandled input format:", a);
        }
        
        public b(final String str, final a a) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(a);
            super(sb.toString());
            this.o = a;
        }
    }
}

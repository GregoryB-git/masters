// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m0;

import java.nio.ByteBuffer;
import l0.y1;
import d0.b;
import d0.e;
import d0.C;
import android.media.AudioDeviceInfo;
import d0.q;
import g0.c;

public interface z
{
    void A(final g0.c p0);
    
    void B();
    
    void C(final d p0);
    
    boolean a(final q p0);
    
    void b();
    
    boolean c();
    
    void d(final boolean p0);
    
    void e();
    
    void f(final AudioDeviceInfo p0);
    
    void flush();
    
    void g();
    
    C h();
    
    boolean i();
    
    void j();
    
    void k(final C p0);
    
    void l(final float p0);
    
    void m(final d0.e p0);
    
    void n(final int p0);
    
    int o(final q p0);
    
    void p();
    
    void q(final int p0, final int p1);
    
    k r(final q p0);
    
    void release();
    
    void s(final d0.b p0);
    
    void t(final y1 p0);
    
    boolean u(final ByteBuffer p0, final long p1, final int p2);
    
    void v(final int p0);
    
    long w(final boolean p0);
    
    void x();
    
    void y(final long p0);
    
    void z(final q p0, final int p1, final int[] p2);
    
    public static final class a
    {
        public final int a;
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final int f;
        
        public a(final int a, final int b, final int c, final boolean d, final boolean e, final int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
    }
    
    public static final class b extends Exception
    {
        public final q o;
        
        public b(final String message, final q o) {
            super(message);
            this.o = o;
        }
        
        public b(final Throwable cause, final q o) {
            super(cause);
            this.o = o;
        }
    }
    
    public static final class c extends Exception
    {
        public final int o;
        public final boolean p;
        public final q q;
        
        public c(final int n, final int i, final int j, final int k, final q q, final boolean p7, final Exception cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed ");
            sb.append(n);
            sb.append(" ");
            sb.append("Config(");
            sb.append(i);
            sb.append(", ");
            sb.append(j);
            sb.append(", ");
            sb.append(k);
            sb.append(")");
            sb.append(" ");
            sb.append(q);
            String str;
            if (p7) {
                str = " (recoverable)";
            }
            else {
                str = "";
            }
            sb.append(str);
            super(sb.toString(), cause);
            this.o = n;
            this.p = p7;
            this.q = q;
        }
    }
    
    public interface d
    {
        void a(final a p0);
        
        void b(final long p0);
        
        void c(final boolean p0);
        
        void d(final Exception p0);
        
        void e(final a p0);
        
        void f();
        
        void g();
        
        void h();
        
        void i();
        
        void j();
        
        void k(final int p0, final long p1, final long p2);
    }
    
    public static final class e extends Exception
    {
        public final long o;
        public final long p;
        
        public e(final long n, final long n2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unexpected audio track timestamp discontinuity: expected ");
            sb.append(n2);
            sb.append(", got ");
            sb.append(n);
            super(sb.toString());
            this.o = n;
            this.p = n2;
        }
    }
    
    public static final class f extends Exception
    {
        public final int o;
        public final boolean p;
        public final q q;
        
        public f(final int n, final q q, final boolean p3) {
            final StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack write failed: ");
            sb.append(n);
            super(sb.toString());
            this.p = p3;
            this.o = n;
            this.q = q;
        }
    }
}

// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y;

import t.i;
import androidx.lifecycle.s;
import androidx.lifecycle.r;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import androidx.lifecycle.t;
import androidx.lifecycle.h;

public class b extends Y.a
{
    public final h a;
    public final a b;
    
    public b(final h a, final t t) {
        this.a = a;
        this.b = Y.b.a.f(t);
    }
    
    @Override
    public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        this.b.e(s, fileDescriptor, printWriter, array);
    }
    
    @Override
    public void c() {
        this.b.g();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        H.b.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
    
    public static class a extends r
    {
        public static final s.a e;
        public i c;
        public boolean d;
        
        static {
            e = new s.a() {
                @Override
                public r a(final Class clazz) {
                    return new b.a();
                }
            };
        }
        
        public a() {
            this.c = new i();
            this.d = false;
        }
        
        public static a f(final t t) {
            return (a)new s(t, a.e).a(a.class);
        }
        
        @Override
        public void d() {
            super.d();
            if (this.c.o() <= 0) {
                this.c.b();
                return;
            }
            android.support.v4.media.a.a(this.c.p(0));
            throw null;
        }
        
        public void e(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
            if (this.c.o() <= 0) {
                return;
            }
            printWriter.print(s);
            printWriter.println("Loaders:");
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("    ");
            if (this.c.o() <= 0) {
                return;
            }
            android.support.v4.media.a.a(this.c.p(0));
            printWriter.print(s);
            printWriter.print("  #");
            printWriter.print(this.c.l(0));
            printWriter.print(": ");
            throw null;
        }
        
        public void g() {
            if (this.c.o() <= 0) {
                return;
            }
            android.support.v4.media.a.a(this.c.p(0));
            throw null;
        }
    }
}

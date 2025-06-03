// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I3;

import java.io.InputStream;
import java.io.IOException;
import java.util.Locale;
import java.io.Closeable;
import H3.i;
import java.io.File;
import java.nio.charset.Charset;

public class f implements a
{
    public static final Charset d;
    public final File a;
    public final int b;
    public e c;
    
    static {
        d = Charset.forName("UTF-8");
    }
    
    public f(final File a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a() {
        i.f(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }
    
    @Override
    public String b() {
        final byte[] c = this.c();
        if (c != null) {
            return new String(c, f.d);
        }
        return null;
    }
    
    @Override
    public byte[] c() {
        final b g = this.g();
        if (g == null) {
            return null;
        }
        final int b = g.b;
        final byte[] array = new byte[b];
        System.arraycopy(g.a, 0, array, 0, b);
        return array;
    }
    
    @Override
    public void d() {
        this.a();
        this.a.delete();
    }
    
    @Override
    public void e(final long n, final String s) {
        this.h();
        this.f(n, s);
    }
    
    public final void f(final long l, String s) {
        if (this.c == null) {
            return;
        }
        String s2;
        if ((s2 = s) == null) {
            s2 = "null";
        }
        while (true) {
            try {
                final int n = this.b / 4;
                s = s2;
                if (s2.length() > n) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("...");
                    sb.append(s2.substring(s2.length() - n));
                    s = sb.toString();
                }
                s = s.replaceAll("\r", " ").replaceAll("\n", " ");
                this.c.h(String.format(Locale.US, "%d %s%n", l, s).getBytes(f.d));
                while (!this.c.q() && this.c.E() > this.b) {
                    this.c.x();
                }
                return;
                final IOException ex;
                E3.f.f().e("There was a problem writing to the Crashlytics log.", ex);
                return;
            }
            catch (IOException ex2) {}
            final IOException ex2;
            final IOException ex = ex2;
            continue;
        }
    }
    
    public final b g() {
        if (!this.a.exists()) {
            return null;
        }
        this.h();
        final e c = this.c;
        if (c == null) {
            return null;
        }
        final int[] array = { 0 };
        final byte[] array2 = new byte[c.E()];
        try {
            this.c.m((e.d)new e.d() {
                @Override
                public void a(final InputStream inputStream, final int len) {
                    try {
                        inputStream.read(array2, array[0], len);
                        final int[] b = array;
                        b[0] += len;
                    }
                    finally {
                        inputStream.close();
                    }
                }
            });
        }
        catch (IOException ex) {
            E3.f.f().e("A problem occurred while reading the Crashlytics log file.", ex);
        }
        return new b(array2, array[0]);
    }
    
    public final void h() {
        if (this.c == null) {
            try {
                this.c = new e(this.a);
            }
            catch (IOException ex) {
                final E3.f f = E3.f.f();
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not open log file: ");
                sb.append(this.a);
                f.e(sb.toString(), ex);
            }
        }
    }
    
    public static class b
    {
        public final byte[] a;
        public final int b;
        
        public b(final byte[] a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
}

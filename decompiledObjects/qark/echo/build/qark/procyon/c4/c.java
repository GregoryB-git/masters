// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c4;

import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;

public class c
{
    public final d a;
    public final String b;
    public final String c;
    
    public c(final d d, final String s) {
        this(d, s, null);
    }
    
    public c(final d a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static String d(final Throwable t) {
        final StringWriter out = new StringWriter();
        t.printStackTrace(new PrintWriter(out));
        return out.toString();
    }
    
    public void a(String s, final Throwable t, final Object... array) {
        if (this.f()) {
            final String str = s = this.h(s, array);
            if (t != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("\n");
                sb.append(d(t));
                s = sb.toString();
            }
            this.a.a(d.a.o, this.b, s, this.g());
        }
    }
    
    public void b(final String s, final Object... array) {
        this.a(s, null, array);
    }
    
    public void c(String string, final Throwable t) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.h(string, new Object[0]));
        sb.append("\n");
        sb.append(d(t));
        string = sb.toString();
        this.a.a(d.a.r, this.b, string, this.g());
    }
    
    public void e(final String s) {
        this.a.a(d.a.p, this.b, this.h(s, new Object[0]), this.g());
    }
    
    public boolean f() {
        return this.a.b().ordinal() <= d.a.o.ordinal();
    }
    
    public final long g() {
        return System.currentTimeMillis();
    }
    
    public final String h(final String format, final Object... args) {
        String format2 = format;
        if (args.length > 0) {
            format2 = String.format(format, args);
        }
        if (this.c == null) {
            return format2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(" - ");
        sb.append(format2);
        return sb.toString();
    }
    
    public void i(final String s) {
        this.j(s, null);
    }
    
    public void j(String s, final Throwable t) {
        final String str = s = this.h(s, new Object[0]);
        if (t != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\n");
            sb.append(d(t));
            s = sb.toString();
        }
        this.a.a(d.a.q, this.b, s, this.g());
    }
}

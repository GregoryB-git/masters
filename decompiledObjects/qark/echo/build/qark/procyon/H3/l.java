// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import java.util.Objects;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.io.IOException;
import E3.f;
import java.io.File;
import M3.g;
import java.util.Comparator;
import java.io.FilenameFilter;

public class l
{
    public static final FilenameFilter d;
    public static final Comparator e;
    public final g a;
    public String b;
    public String c;
    
    static {
        d = new j();
        e = new k();
    }
    
    public l(final g a) {
        this.b = null;
        this.c = null;
        this.a = a;
    }
    
    public static void f(final g g, final String s, final String str) {
        if (s != null && str != null) {
            try {
                final StringBuilder sb = new StringBuilder();
                sb.append("aqs.");
                sb.append(str);
                g.o(s, sb.toString()).createNewFile();
            }
            catch (IOException ex) {
                f.f().l("Failed to persist App Quality Sessions session id.", ex);
            }
        }
    }
    
    public static String g(final g g, final String s) {
        final List p2 = g.p(s, l.d);
        if (p2.isEmpty()) {
            f.f().k("Unable to read App Quality Sessions session id.");
            return null;
        }
        return ((File)Collections.min((Collection<?>)p2, (Comparator<? super Object>)l.e)).getName().substring(4);
    }
    
    public String c(String b) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0039: {
            try {
                if (Objects.equals(this.b, b)) {
                    b = this.c;
                    // monitorexit(this)
                    return b;
                }
            }
            finally {
                break Label_0039;
            }
            final String s;
            b = g(this.a, s);
            return b;
        }
    }
    // monitorexit(this)
    
    public void h(final String s) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0040: {
            try {
                if (!Objects.equals(this.c, s)) {
                    f(this.a, this.b, s);
                    this.c = s;
                }
            }
            finally {
                break Label_0040;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public void i(final String s) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0040: {
            try {
                if (!Objects.equals(this.b, s)) {
                    f(this.a, s, this.c);
                    this.b = s;
                }
            }
            finally {
                break Label_0040;
            }
            return;
        }
    }
    // monitorexit(this)
}

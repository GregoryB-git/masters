// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M3;

import java.io.Writer;
import H3.v;
import java.util.TreeSet;
import java.util.Collection;
import java.util.SortedSet;
import J3.C;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import E3.f;
import J3.B;
import java.util.Locale;
import java.util.Iterator;
import java.util.List;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import H3.m;
import O3.i;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.FilenameFilter;
import java.util.Comparator;
import K3.h;
import java.nio.charset.Charset;

public class e
{
    public static final Charset e;
    public static final int f;
    public static final h g;
    public static final Comparator h;
    public static final FilenameFilter i;
    public final AtomicInteger a;
    public final g b;
    public final i c;
    public final m d;
    
    static {
        e = Charset.forName("UTF-8");
        f = 15;
        g = new h();
        h = new a();
        i = new b();
    }
    
    public e(final g b, final i c, final m d) {
        this.a = new AtomicInteger(0);
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static String A(File file) {
        final byte[] array = new byte[8192];
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        file = (File)new FileInputStream(file);
        while (true) {
            try {
                while (true) {
                    final int read = ((FileInputStream)file).read(array);
                    if (read <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(array, 0, read);
                }
                final String s = new String(byteArrayOutputStream.toByteArray(), M3.e.e);
                ((FileInputStream)file).close();
                return s;
                final Throwable t;
                try {
                    ((FileInputStream)file).close();
                }
                finally {
                    t.addSuppressed((Throwable)file);
                }
                throw t;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void F(File file, final String str) {
        file = (File)new OutputStreamWriter(new FileOutputStream(file), M3.e.e);
        try {
            ((Writer)file).write(str);
            ((OutputStreamWriter)file).close();
        }
        finally {
            try {
                ((OutputStreamWriter)file).close();
            }
            finally {
                final Throwable exception;
                ((Throwable)str).addSuppressed(exception);
            }
        }
    }
    
    public static void G(final File file, final String str, final long n) {
        final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), M3.e.e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(n));
            outputStreamWriter.close();
        }
        finally {
            try {
                outputStreamWriter.close();
            }
            finally {
                final Throwable exception;
                ((Throwable)file).addSuppressed(exception);
            }
        }
    }
    
    public static int f(final List list, final int n) {
        int size = list.size();
        for (final File file : list) {
            if (size <= n) {
                return size;
            }
            M3.g.s(file);
            --size;
        }
        return size;
    }
    
    public static long h(final long n) {
        return n * 1000L;
    }
    
    public static String m(final int i, final boolean b) {
        final String format = String.format(Locale.US, "%010d", i);
        String str;
        if (b) {
            str = "_";
        }
        else {
            str = "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("event");
        sb.append(format);
        sb.append(str);
        return sb.toString();
    }
    
    public static String o(final String s) {
        return s.substring(0, M3.e.f);
    }
    
    public static boolean s(final String s) {
        return s.startsWith("event") && s.endsWith("_");
    }
    
    public static boolean t(final File file, final String s) {
        return s.startsWith("event") && !s.endsWith("_");
    }
    
    public static int x(final File file, final File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }
    
    public final void B(final File obj, final B.d d, final String s, final B.a a) {
        final String d2 = this.d.d(s);
        try {
            final h g = M3.e.g;
            F(this.b.g(s), g.G(g.F(A(obj)).s(d).p(a).o(d2)));
        }
        catch (IOException ex) {
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not synthesize final native report file for ");
            sb.append(obj);
            f.l(sb.toString(), ex);
        }
    }
    
    public final void C(final String s, final long n) {
        final List p2 = this.b.p(s, M3.e.i);
        if (p2.isEmpty()) {
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Session ");
            sb.append(s);
            sb.append(" has no events.");
            f.i(sb.toString());
            return;
        }
        Collections.sort((List<Comparable>)p2);
        final ArrayList<B.e.d> list = new ArrayList<B.e.d>();
        final Iterator<File> iterator = p2.iterator();
        boolean b = false;
    Label_0096:
        while (true) {
            b = false;
            while (iterator.hasNext()) {
                final File obj = iterator.next();
                Label_0174: {
                    try {
                        list.add(M3.e.g.h(A(obj)));
                        if (!b) {
                            if (!s(obj.getName())) {
                                continue Label_0096;
                            }
                        }
                    }
                    catch (IOException ex) {
                        break Label_0174;
                    }
                    b = true;
                    continue;
                }
                final f f2 = E3.f.f();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not add event to report for ");
                sb2.append(obj);
                final IOException ex;
                f2.l(sb2.toString(), ex);
            }
            break;
        }
        if (list.isEmpty()) {
            final f f3 = E3.f.f();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not parse event files for session ");
            sb3.append(s);
            f3.k(sb3.toString());
            return;
        }
        this.D(this.b.o(s, "report"), list, n, b, I3.i.j(s, this.b), this.d.d(s));
    }
    
    public final void D(final File obj, final List list, final long n, final boolean b, final String s, final String str) {
        while (true) {
            try {
                final h g = M3.e.g;
                final B q = g.F(A(obj)).t(n, b, s).o(str).q(C.a(list));
                final B.e m = q.m();
                if (m == null) {
                    return;
                }
                final f f = E3.f.f();
                final StringBuilder sb = new StringBuilder();
                sb.append("appQualitySessionId: ");
                sb.append(str);
                f.b(sb.toString());
                File file;
                if (b) {
                    file = this.b.j(m.i());
                }
                else {
                    file = this.b.l(m.i());
                }
                F(file, g.G(q));
                return;
                final f f2 = E3.f.f();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not synthesize final report file for ");
                sb2.append(obj);
                final IOException ex;
                f2.l(sb2.toString(), ex);
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public final int E(final String s, final int n) {
        final List p2 = this.b.p(s, new c());
        Collections.sort((List<Object>)p2, new d());
        return f(p2, n);
    }
    
    public final SortedSet e(String str) {
        this.b.b();
        final SortedSet p = this.p();
        if (str != null) {
            p.remove(str);
        }
        if (p.size() <= 8) {
            return p;
        }
        while (p.size() > 8) {
            str = p.last();
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Removing session over cap: ");
            sb.append(str);
            f.b(sb.toString());
            this.b.c(str);
            p.remove(str);
        }
        return p;
    }
    
    public final void g() {
        final int b = this.c.b().a.b;
        final List n = this.n();
        final int size = n.size();
        if (size <= b) {
            return;
        }
        final Iterator<File> iterator = n.subList(b, size).iterator();
        while (iterator.hasNext()) {
            iterator.next().delete();
        }
    }
    
    public void i() {
        this.j(this.b.m());
        this.j(this.b.k());
        this.j(this.b.h());
    }
    
    public final void j(final List list) {
        final Iterator<File> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().delete();
        }
    }
    
    public void k(final String s, final long n) {
        for (final String str : this.e(s)) {
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Finalizing report for session ");
            sb.append(str);
            f.i(sb.toString());
            this.C(str, n);
            this.b.c(str);
        }
        this.g();
    }
    
    public void l(final String str, final B.d d, final B.a a) {
        final File o = this.b.o(str, "report");
        final f f = E3.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Writing native session report for ");
        sb.append(str);
        sb.append(" to file: ");
        sb.append(o);
        f.b(sb.toString());
        this.B(o, d, str, a);
    }
    
    public final List n() {
        final ArrayList<Object> list = new ArrayList<Object>();
        list.addAll(this.b.k());
        list.addAll(this.b.h());
        final Comparator h = M3.e.h;
        Collections.sort(list, h);
        final List m = this.b.m();
        Collections.sort((List<Object>)m, h);
        list.addAll(m);
        return list;
    }
    
    public SortedSet p() {
        return new TreeSet(this.b.d()).descendingSet();
    }
    
    public long q(final String s) {
        return this.b.o(s, "start-time").lastModified();
    }
    
    public boolean r() {
        return !this.b.m().isEmpty() || !this.b.k().isEmpty() || !this.b.h().isEmpty();
    }
    
    public List w() {
        final List n = this.n();
        final ArrayList<v> list = new ArrayList<v>();
        for (final File obj : n) {
            try {
                list.add(v.a(M3.e.g.F(A(obj)), obj.getName(), obj));
            }
            catch (IOException ex) {
                final f f = E3.f.f();
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not load report file ");
                sb.append(obj);
                sb.append("; deleting");
                f.l(sb.toString(), ex);
                obj.delete();
            }
        }
        return list;
    }
    
    public void y(final B.e.d d, final String str, final boolean b) {
        final int a = this.c.b().a.a;
        final String i = M3.e.g.i(d);
        final String m = m(this.a.getAndIncrement(), b);
        try {
            F(this.b.o(str, m), i);
        }
        catch (IOException ex) {
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not persist event for session ");
            sb.append(str);
            f.l(sb.toString(), ex);
        }
        this.E(str, a);
    }
    
    public void z(final B b) {
        final B.e m = b.m();
        if (m == null) {
            E3.f.f().b("Could not get session for report");
            return;
        }
        final String i = m.i();
        try {
            F(this.b.o(i, "report"), M3.e.g.G(b));
            G(this.b.o(i, "start-time"), "", m.l());
        }
        catch (IOException ex) {
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not persist report for session ");
            sb.append(i);
            f.c(sb.toString(), ex);
        }
    }
}

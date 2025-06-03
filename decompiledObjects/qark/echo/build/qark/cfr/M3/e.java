/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.FilenameFilter
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.io.OutputStreamWriter
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.NavigableSet
 *  java.util.SortedSet
 *  java.util.TreeSet
 *  java.util.concurrent.atomic.AtomicInteger
 */
package M3;

import E3.f;
import H3.m;
import H3.v;
import I3.i;
import J3.B;
import J3.C;
import K3.h;
import M3.a;
import M3.b;
import M3.c;
import M3.d;
import M3.g;
import O3.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class e {
    public static final Charset e = Charset.forName((String)"UTF-8");
    public static final int f = 15;
    public static final h g = new h();
    public static final Comparator h = new a();
    public static final FilenameFilter i = new b();
    public final AtomicInteger a = new AtomicInteger(0);
    public final g b;
    public final O3.i c;
    public final m d;

    public e(g g8, O3.i i8, m m8) {
        this.b = g8;
        this.c = i8;
        this.d = m8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String A(File file) {
        Object object = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        file = new FileInputStream(file);
        try {
            int n8;
            while ((n8 = file.read((byte[])object)) > 0) {
                byteArrayOutputStream.write((byte[])object, 0, n8);
            }
            object = new String(byteArrayOutputStream.toByteArray(), e);
        }
        catch (Throwable throwable) {}
        file.close();
        return object;
        try {
            file.close();
            throw throwable;
        }
        catch (Throwable throwable) {
            throwable.addSuppressed(throwable);
        }
        throw throwable;
    }

    public static void F(File file, String string2) {
        file = new OutputStreamWriter((OutputStream)new FileOutputStream(file), e);
        try {
            file.write(string2);
        }
        catch (Throwable throwable) {
            try {
                file.close();
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
            }
            throw throwable;
        }
        file.close();
    }

    public static void G(File file, String string2, long l8) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(string2);
            file.setLastModified(e.h(l8));
        }
        catch (Throwable throwable) {
            try {
                outputStreamWriter.close();
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
            }
            throw throwable;
        }
        outputStreamWriter.close();
    }

    public static /* synthetic */ boolean a(File file, String string2) {
        return string2.startsWith("event");
    }

    public static /* synthetic */ boolean b(File file, String string2) {
        return e.t(file, string2);
    }

    public static /* synthetic */ int c(File file, File file2) {
        return e.x(file, file2);
    }

    public static /* synthetic */ int d(File file, File file2) {
        return e.u(file, file2);
    }

    public static int f(List list, int n8) {
        int n9 = list.size();
        for (File file : list) {
            if (n9 <= n8) {
                return n9;
            }
            g.s(file);
            --n9;
        }
        return n9;
    }

    public static long h(long l8) {
        return l8 * 1000L;
    }

    public static String m(int n8, boolean bl) {
        String string2 = String.format((Locale)Locale.US, (String)"%010d", (Object[])new Object[]{n8});
        String string3 = bl ? "_" : "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("event");
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public static String o(String string2) {
        return string2.substring(0, f);
    }

    public static boolean s(String string2) {
        if (string2.startsWith("event") && string2.endsWith("_")) {
            return true;
        }
        return false;
    }

    public static boolean t(File file, String string2) {
        if (string2.startsWith("event") && !string2.endsWith("_")) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    public static int x(File file, File file2) {
        return e.o(file.getName()).compareTo(e.o(file2.getName()));
    }

    public final void B(File file, B.d object, String object2, B.a a8) {
        String string2 = this.d.d((String)object2);
        try {
            h h8 = g;
            object = h8.F(e.A(file)).s((B.d)object).p(a8).o(string2);
            e.F(this.b.g((String)object2), h8.G((B)object));
            return;
        }
        catch (IOException iOException) {
            object2 = f.f();
            a8 = new StringBuilder();
            a8.append("Could not synthesize final native report file for ");
            a8.append((Object)file);
            object2.l(a8.toString(), (Throwable)iOException);
            return;
        }
    }

    public final void C(String string2, long l8) {
        boolean bl;
        Object object;
        Object object2 = this.b.p(string2, i);
        if (object2.isEmpty()) {
            f f8 = f.f();
            object2 = new StringBuilder();
            object2.append("Session ");
            object2.append(string2);
            object2.append(" has no events.");
            f8.i(object2.toString());
            return;
        }
        Collections.sort((List)object2);
        Object object3 = new ArrayList();
        object2 = object2.iterator();
        block3 : do {
            bl = false;
            while (object2.hasNext()) {
                IOException iOException2;
                block8 : {
                    block7 : {
                        object = (File)object2.next();
                        try {
                            object3.add((Object)g.h(e.A((File)object)));
                            if (bl) break block7;
                        }
                        catch (IOException iOException2) {
                            break block8;
                        }
                        boolean bl2 = e.s(object.getName());
                        if (!bl2) continue block3;
                    }
                    bl = true;
                    continue;
                }
                f f9 = f.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not add event to report for ");
                stringBuilder.append(object);
                f9.l(stringBuilder.toString(), (Throwable)iOException2);
            }
            break;
        } while (true);
        if (object3.isEmpty()) {
            object3 = f.f();
            object2 = new StringBuilder();
            object2.append("Could not parse event files for session ");
            object2.append(string2);
            object3.k(object2.toString());
            return;
        }
        object2 = i.j(string2, this.b);
        object = this.d.d(string2);
        this.D(this.b.o(string2, "report"), (List)object3, l8, bl, (String)object2, (String)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void D(File file, List object, long l8, boolean bl, String object2, String string2) {
        try {
            h h8 = g;
            object2 = h8.F(e.A(file)).t(l8, bl, (String)object2).o(string2).q(C.a((List)object));
            object = object2.m();
            if (object == null) {
                return;
            }
            f f8 = f.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("appQualitySessionId: ");
            stringBuilder.append(string2);
            f8.b(stringBuilder.toString());
            object = bl ? this.b.j(object.i()) : this.b.l(object.i());
            e.F((File)object, h8.G((B)object2));
            return;
        }
        catch (IOException iOException) {}
        object = f.f();
        object2 = new StringBuilder();
        object2.append("Could not synthesize final report file for ");
        object2.append((Object)file);
        object.l(object2.toString(), (Throwable)iOException);
    }

    public final int E(String string2, int n8) {
        string2 = this.b.p(string2, new c());
        Collections.sort((List)string2, (Comparator)new d());
        return e.f((List)string2, n8);
    }

    public final SortedSet e(String string2) {
        this.b.b();
        SortedSet sortedSet = this.p();
        if (string2 != null) {
            sortedSet.remove((Object)string2);
        }
        if (sortedSet.size() <= 8) {
            return sortedSet;
        }
        while (sortedSet.size() > 8) {
            string2 = (String)sortedSet.last();
            f f8 = f.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Removing session over cap: ");
            stringBuilder.append(string2);
            f8.b(stringBuilder.toString());
            this.b.c(string2);
            sortedSet.remove((Object)string2);
        }
        return sortedSet;
    }

    public final void g() {
        int n8 = this.c.b().a.b;
        List list = this.n();
        int n9 = list.size();
        if (n9 <= n8) {
            return;
        }
        list = list.subList(n8, n9).iterator();
        while (list.hasNext()) {
            ((File)list.next()).delete();
        }
    }

    public void i() {
        this.j(this.b.m());
        this.j(this.b.k());
        this.j(this.b.h());
    }

    public final void j(List list) {
        list = list.iterator();
        while (list.hasNext()) {
            ((File)list.next()).delete();
        }
    }

    public void k(String string2, long l8) {
        for (String string3 : this.e(string2)) {
            f f8 = f.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Finalizing report for session ");
            stringBuilder.append(string3);
            f8.i(stringBuilder.toString());
            this.C(string3, l8);
            this.b.c(string3);
        }
        this.g();
    }

    public void l(String string2, B.d d8, B.a a8) {
        File file = this.b.o(string2, "report");
        f f8 = f.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Writing native session report for ");
        stringBuilder.append(string2);
        stringBuilder.append(" to file: ");
        stringBuilder.append((Object)file);
        f8.b(stringBuilder.toString());
        this.B(file, d8, string2, a8);
    }

    public final List n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((Collection)this.b.k());
        arrayList.addAll((Collection)this.b.h());
        Comparator comparator = h;
        Collections.sort((List)arrayList, (Comparator)comparator);
        List list = this.b.m();
        Collections.sort((List)list, (Comparator)comparator);
        arrayList.addAll((Collection)list);
        return arrayList;
    }

    public SortedSet p() {
        return new TreeSet((Collection)this.b.d()).descendingSet();
    }

    public long q(String string2) {
        return this.b.o(string2, "start-time").lastModified();
    }

    public boolean r() {
        if (this.b.m().isEmpty() && this.b.k().isEmpty() && this.b.h().isEmpty()) {
            return false;
        }
        return true;
    }

    public List w() {
        List list = this.n();
        ArrayList arrayList = new ArrayList();
        for (File file : list) {
            try {
                arrayList.add((Object)v.a(g.F(e.A(file)), file.getName(), file));
            }
            catch (IOException iOException) {
                f f8 = f.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not load report file ");
                stringBuilder.append((Object)file);
                stringBuilder.append("; deleting");
                f8.l(stringBuilder.toString(), (Throwable)iOException);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(B.e.d object, String string2, boolean bl) {
        int n8 = this.c.b().a.a;
        object = g.i((B.e.d)object);
        Object object2 = e.m(this.a.getAndIncrement(), bl);
        try {
            e.F(this.b.o(string2, (String)object2), (String)object);
        }
        catch (IOException iOException) {
            object2 = f.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not persist event for session ");
            stringBuilder.append(string2);
            object2.l(stringBuilder.toString(), (Throwable)iOException);
        }
        this.E(string2, n8);
    }

    public void z(B object) {
        Object object2 = object.m();
        if (object2 == null) {
            f.f().b("Could not get session for report");
            return;
        }
        String string2 = object2.i();
        try {
            object = g.G((B)object);
            e.F(this.b.o(string2, "report"), (String)object);
            e.G(this.b.o(string2, "start-time"), "", object2.l());
            return;
        }
        catch (IOException iOException) {
            object2 = f.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not persist report for session ");
            stringBuilder.append(string2);
            object2.c(stringBuilder.toString(), (Throwable)iOException);
            return;
        }
    }
}


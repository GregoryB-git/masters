/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.io.IOException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 *  java.util.Objects
 */
package H3;

import E3.f;
import H3.j;
import H3.k;
import M3.g;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class l {
    public static final FilenameFilter d = new j();
    public static final Comparator e = new k();
    public final g a;
    public String b = null;
    public String c = null;

    public l(g g8) {
        this.a = g8;
    }

    public static /* synthetic */ boolean a(File file, String string2) {
        return string2.startsWith("aqs.");
    }

    public static /* synthetic */ int b(File file, File file2) {
        return l.e(file, file2);
    }

    public static /* synthetic */ int e(File file, File file2) {
        return Long.compare((long)file2.lastModified(), (long)file.lastModified());
    }

    public static void f(g g8, String string2, String string3) {
        if (string2 != null && string3 != null) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("aqs.");
                stringBuilder.append(string3);
                g8.o(string2, stringBuilder.toString()).createNewFile();
                return;
            }
            catch (IOException iOException) {
                f.f().l("Failed to persist App Quality Sessions session id.", (Throwable)iOException);
            }
        }
    }

    public static String g(g g8, String string2) {
        if ((g8 = g8.p(string2, d)).isEmpty()) {
            f.f().k("Unable to read App Quality Sessions session id.");
            return null;
        }
        return ((File)Collections.min((Collection)g8, (Comparator)e)).getName().substring(4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String c(String string2) {
        synchronized (this) {
            try {
                if (!Objects.equals((Object)this.b, (Object)string2)) return l.g(this.a, string2);
                return this.c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void h(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                block3 : {
                    try {
                        if (Objects.equals((Object)this.c, (Object)string2)) break block3;
                        l.f(this.a, this.b, string2);
                        this.c = string2;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public void i(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                block3 : {
                    try {
                        if (Objects.equals((Object)this.b, (Object)string2)) break block3;
                        l.f(this.a, string2, this.c);
                        this.b = string2;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}


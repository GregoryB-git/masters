/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.Locale
 */
package I3;

import H3.i;
import I3.a;
import I3.e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

public class f
implements a {
    public static final Charset d = Charset.forName((String)"UTF-8");
    public final File a;
    public final int b;
    public e c;

    public f(File file, int n8) {
        this.a = file;
        this.b = n8;
    }

    @Override
    public void a() {
        i.f(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    @Override
    public String b() {
        byte[] arrby = this.c();
        if (arrby != null) {
            return new String(arrby, d);
        }
        return null;
    }

    @Override
    public byte[] c() {
        b b8 = this.g();
        if (b8 == null) {
            return null;
        }
        int n8 = b8.b;
        byte[] arrby = new byte[n8];
        System.arraycopy((Object)b8.a, (int)0, (Object)arrby, (int)0, (int)n8);
        return arrby;
    }

    @Override
    public void d() {
        this.a();
        this.a.delete();
    }

    @Override
    public void e(long l8, String string2) {
        this.h();
        this.f(l8, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(long l8, String arrby) {
        if (this.c == null) {
            return;
        }
        Object object = arrby;
        if (arrby == null) {
            object = "null";
        }
        try {
            int n8 = this.b / 4;
            arrby = object;
            if (object.length() > n8) {
                arrby = new StringBuilder();
                arrby.append("...");
                arrby.append(object.substring(object.length() - n8));
                arrby = arrby.toString();
            }
            arrby = arrby.replaceAll("\r", " ").replaceAll("\n", " ");
            arrby = String.format((Locale)Locale.US, (String)"%d %s%n", (Object[])new Object[]{l8, arrby}).getBytes(d);
            this.c.h(arrby);
            while (!this.c.q() && this.c.E() > this.b) {
                this.c.x();
            }
            return;
        }
        catch (IOException iOException) {}
        E3.f.f().e("There was a problem writing to the Crashlytics log.", (Throwable)iOException);
    }

    public final b g() {
        if (!this.a.exists()) {
            return null;
        }
        this.h();
        final byte[] arrby = this.c;
        if (arrby == null) {
            return null;
        }
        final int[] arrn = new int[]{0};
        arrby = new byte[arrby.E()];
        try {
            this.c.m(new e.d(){

                @Override
                public void a(InputStream inputStream, int n8) {
                    int[] arrn2;
                    try {
                        inputStream.read(arrby, arrn[0], n8);
                        arrn2 = arrn;
                    }
                    catch (Throwable throwable) {
                        inputStream.close();
                        throw throwable;
                    }
                    arrn2[0] = arrn2[0] + n8;
                    inputStream.close();
                }
            });
        }
        catch (IOException iOException) {
            E3.f.f().e("A problem occurred while reading the Crashlytics log file.", (Throwable)iOException);
        }
        return new b(arrby, arrn[0]);
    }

    public final void h() {
        if (this.c == null) {
            try {
                this.c = new e(this.a);
                return;
            }
            catch (IOException iOException) {
                E3.f f8 = E3.f.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not open log file: ");
                stringBuilder.append((Object)this.a);
                f8.e(stringBuilder.toString(), (Throwable)iOException);
            }
        }
    }

    public static class b {
        public final byte[] a;
        public final int b;

        public b(byte[] arrby, int n8) {
            this.a = arrby;
            this.b = n8;
        }
    }

}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package Y;

import androidx.lifecycle.h;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import t.i;

public class b
extends Y.a {
    public final h a;
    public final a b;

    public b(h h8, t t8) {
        this.a = h8;
        this.b = a.f(t8);
    }

    @Override
    public void a(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        this.b.e(string2, fileDescriptor, printWriter, arrstring);
    }

    @Override
    public void c() {
        this.b.g();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
        stringBuilder.append(" in ");
        H.b.a(this.a, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public static class a
    extends r {
        public static final s.a e = new s.a(){

            @Override
            public r a(Class class_) {
                return new a();
            }
        };
        public i c = new i();
        public boolean d = false;

        public static a f(t t8) {
            return (a)new s(t8, e).a(a.class);
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

        public void e(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
            if (this.c.o() > 0) {
                printWriter.print(string2);
                printWriter.println("Loaders:");
                fileDescriptor = new StringBuilder();
                fileDescriptor.append(string2);
                fileDescriptor.append("    ");
                if (this.c.o() <= 0) {
                    return;
                }
                android.support.v4.media.a.a(this.c.p(0));
                printWriter.print(string2);
                printWriter.print("  #");
                printWriter.print(this.c.l(0));
                printWriter.print(": ");
                throw null;
            }
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


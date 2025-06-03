/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.PrintWriter
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 */
package c4;

import c4.d;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class c {
    public final d a;
    public final String b;
    public final String c;

    public c(d d8, String string2) {
        this(d8, string2, null);
    }

    public c(d d8, String string2, String string3) {
        this.a = d8;
        this.b = string2;
        this.c = string3;
    }

    public static String d(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter((Writer)stringWriter));
        return stringWriter.toString();
    }

    public /* varargs */ void a(String object, Throwable throwable, Object ... object2) {
        if (this.f()) {
            object = object2 = this.h((String)object, (Object[])object2);
            if (throwable != null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append("\n");
                object.append(c.d(throwable));
                object = object.toString();
            }
            this.a.a(d.a.o, this.b, (String)object, this.g());
        }
    }

    public /* varargs */ void b(String string2, Object ... arrobject) {
        this.a(string2, null, arrobject);
    }

    public void c(String string2, Throwable throwable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.h(string2, new Object[0]));
        stringBuilder.append("\n");
        stringBuilder.append(c.d(throwable));
        string2 = stringBuilder.toString();
        this.a.a(d.a.r, this.b, string2, this.g());
    }

    public void e(String string2) {
        this.a.a(d.a.p, this.b, this.h(string2, new Object[0]), this.g());
    }

    public boolean f() {
        if (this.a.b().ordinal() <= d.a.o.ordinal()) {
            return true;
        }
        return false;
    }

    public final long g() {
        return System.currentTimeMillis();
    }

    public final /* varargs */ String h(String string2, Object ... arrobject) {
        String string3 = string2;
        if (arrobject.length > 0) {
            string3 = String.format((String)string2, (Object[])arrobject);
        }
        if (this.c == null) {
            return string3;
        }
        string2 = new StringBuilder();
        string2.append(this.c);
        string2.append(" - ");
        string2.append(string3);
        return string2.toString();
    }

    public void i(String string2) {
        this.j(string2, null);
    }

    public void j(String string2, Throwable throwable) {
        String string3;
        string2 = string3 = this.h(string2, new Object[0]);
        if (throwable != null) {
            string2 = new StringBuilder();
            string2.append(string3);
            string2.append("\n");
            string2.append(c.d(throwable));
            string2 = string2.toString();
        }
        this.a.a(d.a.q, this.b, string2, this.g());
    }
}


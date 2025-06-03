/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 *  java.nio.charset.StandardCharsets
 */
package b5;

import V4.b;
import b5.k;
import b5.l;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class h {
    public final String a;
    public l b;
    public final StringBuilder c;
    public int d;
    public int e;
    public k f;
    public int g;

    public h(String string2) {
        byte[] arrby = string2.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder stringBuilder = new StringBuilder(arrby.length);
        int n8 = arrby.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            char c8 = (char)(arrby[i8] & 255);
            if (c8 == '?' && string2.charAt(i8) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            stringBuilder.append(c8);
        }
        this.a = stringBuilder.toString();
        this.b = l.o;
        this.c = new StringBuilder(string2.length());
        this.e = -1;
    }

    public int a() {
        return this.c.length();
    }

    public StringBuilder b() {
        return this.c;
    }

    public char c() {
        return this.a.charAt(this.d);
    }

    public String d() {
        return this.a;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return this.h() - this.d;
    }

    public k g() {
        return this.f;
    }

    public final int h() {
        return this.a.length() - this.g;
    }

    public boolean i() {
        if (this.d < this.h()) {
            return true;
        }
        return false;
    }

    public void j() {
        this.e = -1;
    }

    public void k() {
        this.f = null;
    }

    public void l(b b8, b b9) {
    }

    public void m(int n8) {
        this.g = n8;
    }

    public void n(l l8) {
        this.b = l8;
    }

    public void o(int n8) {
        this.e = n8;
    }

    public void p() {
        this.q(this.a());
    }

    public void q(int n8) {
        k k8 = this.f;
        if (k8 == null || n8 > k8.a()) {
            this.f = k.l(n8, this.b, null, null, true);
        }
    }

    public void r(char c8) {
        this.c.append(c8);
    }

    public void s(String string2) {
        this.c.append(string2);
    }
}


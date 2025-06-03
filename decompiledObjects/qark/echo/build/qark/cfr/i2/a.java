/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package i2;

import f2.m;
import i2.b;
import i2.d;
import i2.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a {
    public static final a e = new a().b();
    public final f a;
    public final List b;
    public final b c;
    public final String d;

    public a(f f8, List list, b b8, String string2) {
        this.a = f8;
        this.b = list;
        this.c = b8;
        this.d = string2;
    }

    public static a e() {
        return new a();
    }

    public String a() {
        return this.d;
    }

    public b b() {
        return this.c;
    }

    public List c() {
        return this.b;
    }

    public f d() {
        return this.a;
    }

    public byte[] f() {
        return m.a(this);
    }

    public static final class a {
        public f a = null;
        public List b = new ArrayList();
        public b c = null;
        public String d = "";

        public a a(d d8) {
            this.b.add((Object)d8);
            return this;
        }

        public a b() {
            return new a(this.a, Collections.unmodifiableList((List)this.b), this.c, this.d);
        }

        public a c(String string2) {
            this.d = string2;
            return this;
        }

        public a d(b b8) {
            this.c = b8;
            return this;
        }

        public a e(f f8) {
            this.a = f8;
            return this;
        }
    }

}


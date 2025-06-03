/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Set
 */
package B3;

import B3.E;
import B3.F;
import B3.a;
import B3.e;
import B3.h;
import B3.r;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class c {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final h f;
    public final Set g;

    public c(String string2, Set set, Set set2, int n8, int n9, h h8, Set set3) {
        this.a = string2;
        this.b = Collections.unmodifiableSet((Set)set);
        this.c = Collections.unmodifiableSet((Set)set2);
        this.d = n8;
        this.e = n9;
        this.f = h8;
        this.g = Collections.unmodifiableSet((Set)set3);
    }

    public /* synthetic */ c(String string2, Set set, Set set2, int n8, int n9, h h8, Set set3,  a8) {
        this(string2, set, set2, n8, n9, h8, set3);
    }

    public static /* synthetic */ Object a(Object object, e e8) {
        return object;
    }

    public static /* synthetic */ Object b(Object object, e e8) {
        return object;
    }

    public static b c(F f8) {
        return new b(f8, new F[0], null);
    }

    public static /* varargs */ b d(F f8, F ... arrf) {
        return new b(f8, arrf, null);
    }

    public static b e(Class class_) {
        return new b(class_, new Class[0], null);
    }

    public static /* varargs */ b f(Class class_, Class ... arrclass) {
        return new b(class_, arrclass, null);
    }

    public static c l(Object object, Class class_) {
        return c.m(class_).f(new a(object)).d();
    }

    public static b m(Class class_) {
        return c.e(class_).g();
    }

    public static /* varargs */ c s(Object object, Class class_, Class ... arrclass) {
        return c.f(class_, arrclass).f(new B3.b(object)).d();
    }

    public Set g() {
        return this.c;
    }

    public h h() {
        return this.f;
    }

    public String i() {
        return this.a;
    }

    public Set j() {
        return this.b;
    }

    public Set k() {
        return this.g;
    }

    public boolean n() {
        if (this.d == 1) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.d == 2) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    public c t(h h8) {
        return new c(this.a, this.b, this.c, this.d, this.e, h8, this.g);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Component<");
        stringBuilder.append(Arrays.toString((Object[])this.b.toArray()));
        stringBuilder.append(">{");
        stringBuilder.append(this.d);
        stringBuilder.append(", type=");
        stringBuilder.append(this.e);
        stringBuilder.append(", deps=");
        stringBuilder.append(Arrays.toString((Object[])this.c.toArray()));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static class b {
        public String a = null;
        public final Set b;
        public final Set c;
        public int d;
        public int e;
        public h f;
        public final Set g;

        public /* varargs */ b(F f8, F ... arrf) {
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            E.c(f8, "Null interface");
            hashSet.add((Object)f8);
            int n8 = arrf.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                E.c(arrf[i8], "Null interface");
            }
            Collections.addAll((Collection)this.b, (Object[])arrf);
        }

        public /* synthetic */ b(F f8, F[] arrf,  a8) {
            this(f8, arrf);
        }

        public /* varargs */ b(Class class_2, Class ... arrclass) {
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            E.c((Object)class_2, "Null interface");
            hashSet.add((Object)F.b(class_2));
            for (Class class_2 : arrclass) {
                E.c((Object)class_2, "Null interface");
                this.b.add((Object)F.b(class_2));
            }
        }

        public /* synthetic */ b(Class class_, Class[] arrclass,  a8) {
            this(class_, arrclass);
        }

        public b b(r r8) {
            E.c(r8, "Null dependency");
            this.j(r8.c());
            this.c.add((Object)r8);
            return this;
        }

        public b c() {
            return this.i(1);
        }

        public c d() {
            boolean bl = this.f != null;
            E.d(bl, "Missing required property: factory.");
            return new c(this.a, (Set)new HashSet((Collection)this.b), (Set)new HashSet((Collection)this.c), this.d, this.e, this.f, this.g, null);
        }

        public b e() {
            return this.i(2);
        }

        public b f(h h8) {
            this.f = (h)E.c(h8, "Null factory");
            return this;
        }

        public final b g() {
            this.e = 1;
            return this;
        }

        public b h(String string2) {
            this.a = string2;
            return this;
        }

        public final b i(int n8) {
            boolean bl = this.d == 0;
            E.d(bl, "Instantiation type has already been set.");
            this.d = n8;
            return this;
        }

        public final void j(F f8) {
            E.a(this.b.contains((Object)f8) ^ true, "Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

}


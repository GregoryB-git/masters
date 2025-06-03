/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Objects
 */
package k3;

import c3.g;
import c3.y;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import k3.j;
import k3.k;
import k3.q;
import r3.a;

public final class r {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;

    public r(b b8) {
        this.a = new HashMap(b8.a);
        this.b = new HashMap(b8.b);
        this.c = new HashMap(b8.c);
        this.d = new HashMap(b8.d);
    }

    public /* synthetic */ r(b b8,  a8) {
        this(b8);
    }

    public boolean e(q object) {
        object = new c(object.getClass(), object.a(), null);
        return this.b.containsKey(object);
    }

    public g f(q q8, y y8) {
        c c8 = new c(q8.getClass(), q8.a(), null);
        if (this.b.containsKey((Object)c8)) {
            return ((k3.b)this.b.get((Object)c8)).d(q8, y8);
        }
        q8 = new StringBuilder();
        q8.append("No Key Parser for requested key type ");
        q8.append((Object)c8);
        q8.append(" available");
        throw new GeneralSecurityException(q8.toString());
    }

    public static final class b {
        public final Map a;
        public final Map b;
        public final Map c;
        public final Map d;

        public b() {
            this.a = new HashMap();
            this.b = new HashMap();
            this.c = new HashMap();
            this.d = new HashMap();
        }

        public b(r r8) {
            this.a = new HashMap(r8.a);
            this.b = new HashMap(r8.b);
            this.c = new HashMap(r8.c);
            this.d = new HashMap(r8.d);
        }

        public r e() {
            return new r(this, null);
        }

        public b f(k3.b b8) {
            c c8 = new c(b8.c(), b8.b(), null);
            if (this.b.containsKey((Object)c8)) {
                k3.b b9 = (k3.b)this.b.get((Object)c8);
                if (b9.equals((Object)b8) && b8.equals((Object)b9)) {
                    return this;
                }
                b8 = new StringBuilder();
                b8.append("Attempt to register non-equal parser for already existing object of type: ");
                b8.append((Object)c8);
                throw new GeneralSecurityException(b8.toString());
            }
            this.b.put((Object)c8, (Object)b8);
            return this;
        }

        public b g(k3.c c8) {
            d d8 = new d(c8.b(), c8.c(), null);
            if (this.a.containsKey((Object)d8)) {
                k3.c c9 = (k3.c)this.a.get((Object)d8);
                if (c9.equals((Object)c8) && c8.equals((Object)c9)) {
                    return this;
                }
                c8 = new StringBuilder();
                c8.append("Attempt to register non-equal serializer for already existing object of type: ");
                c8.append((Object)d8);
                throw new GeneralSecurityException(c8.toString());
            }
            this.a.put((Object)d8, (Object)c8);
            return this;
        }

        public b h(j j8) {
            c c8 = new c(j8.c(), j8.b(), null);
            if (this.d.containsKey((Object)c8)) {
                j j9 = (j)this.d.get((Object)c8);
                if (j9.equals((Object)j8) && j8.equals((Object)j9)) {
                    return this;
                }
                j8 = new StringBuilder();
                j8.append("Attempt to register non-equal parser for already existing object of type: ");
                j8.append((Object)c8);
                throw new GeneralSecurityException(j8.toString());
            }
            this.d.put((Object)c8, (Object)j8);
            return this;
        }

        public b i(k k8) {
            d d8 = new d(k8.b(), k8.c(), null);
            if (this.c.containsKey((Object)d8)) {
                k k9 = (k)this.c.get((Object)d8);
                if (k9.equals((Object)k8) && k8.equals((Object)k9)) {
                    return this;
                }
                k8 = new StringBuilder();
                k8.append("Attempt to register non-equal serializer for already existing object of type: ");
                k8.append((Object)d8);
                throw new GeneralSecurityException(k8.toString());
            }
            this.c.put((Object)d8, (Object)k8);
            return this;
        }
    }

    public static class c {
        public final Class a;
        public final a b;

        public c(Class class_, a a8) {
            this.a = class_;
            this.b = a8;
        }

        public /* synthetic */ c(Class class_, a a8,  a9) {
            this(class_, a8);
        }

        public boolean equals(Object object) {
            boolean bl = object instanceof c;
            boolean bl2 = false;
            if (!bl) {
                return false;
            }
            object = (c)object;
            bl = bl2;
            if (object.a.equals((Object)this.a)) {
                bl = bl2;
                if (object.b.equals(this.b)) {
                    bl = true;
                }
            }
            return bl;
        }

        public int hashCode() {
            return Objects.hash((Object[])new Object[]{this.a, this.b});
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a.getSimpleName());
            stringBuilder.append(", object identifier: ");
            stringBuilder.append((Object)this.b);
            return stringBuilder.toString();
        }
    }

    public static class d {
        public final Class a;
        public final Class b;

        public d(Class class_, Class class_2) {
            this.a = class_;
            this.b = class_2;
        }

        public /* synthetic */ d(Class class_, Class class_2,  a8) {
            this(class_, class_2);
        }

        public boolean equals(Object object) {
            boolean bl = object instanceof d;
            boolean bl2 = false;
            if (!bl) {
                return false;
            }
            object = (d)object;
            bl = bl2;
            if (object.a.equals((Object)this.a)) {
                bl = bl2;
                if (object.b.equals((Object)this.b)) {
                    bl = true;
                }
            }
            return bl;
        }

        public int hashCode() {
            return Objects.hash((Object[])new Object[]{this.a, this.b});
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a.getSimpleName());
            stringBuilder.append(" with serialization type: ");
            stringBuilder.append(this.b.getSimpleName());
            return stringBuilder.toString();
        }
    }

}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.NullPointerException
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
import c3.v;
import c3.w;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import k3.l;

public class n {
    public final Map a;
    public final Map b;

    public n(b b8) {
        this.a = new HashMap(b8.a);
        this.b = new HashMap(b8.b);
    }

    public /* synthetic */ n(b b8,  a8) {
        this(b8);
    }

    public Class c(Class class_) {
        if (this.b.containsKey((Object)class_)) {
            return ((w)this.b.get((Object)class_)).a();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No input primitive class for ");
        stringBuilder.append((Object)class_);
        stringBuilder.append(" available");
        throw new GeneralSecurityException(stringBuilder.toString());
    }

    public Object d(g g8, Class object) {
        object = new c(g8.getClass(), (Class)object, null);
        if (this.a.containsKey(object)) {
            return ((l)this.a.get(object)).a(g8);
        }
        g8 = new StringBuilder();
        g8.append("No PrimitiveConstructor for ");
        g8.append(object);
        g8.append(" available");
        throw new GeneralSecurityException(g8.toString());
    }

    public Object e(v v8, Class object) {
        if (this.b.containsKey(object)) {
            object = (w)this.b.get(object);
            if (v8.g().equals((Object)object.a()) && object.a().equals((Object)v8.g())) {
                return object.b(v8);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        v8 = new StringBuilder();
        v8.append("No wrapper found for ");
        v8.append(object);
        throw new GeneralSecurityException(v8.toString());
    }

    public static final class b {
        public final Map a;
        public final Map b;

        public b() {
            this.a = new HashMap();
            this.b = new HashMap();
        }

        public b(n n8) {
            this.a = new HashMap(n8.a);
            this.b = new HashMap(n8.b);
        }

        public n c() {
            return new n(this, null);
        }

        public b d(l l8) {
            if (l8 != null) {
                c c8 = new c(l8.c(), l8.d(), null);
                if (this.a.containsKey((Object)c8)) {
                    l l9 = (l)this.a.get((Object)c8);
                    if (l9.equals((Object)l8) && l8.equals((Object)l9)) {
                        return this;
                    }
                    l8 = new StringBuilder();
                    l8.append("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
                    l8.append((Object)c8);
                    throw new GeneralSecurityException(l8.toString());
                }
                this.a.put((Object)c8, (Object)l8);
                return this;
            }
            throw new NullPointerException("primitive constructor must be non-null");
        }

        public b e(w w8) {
            if (w8 != null) {
                Class class_ = w8.c();
                if (this.b.containsKey((Object)class_)) {
                    w w9 = (w)this.b.get((Object)class_);
                    if (w9.equals((Object)w8) && w8.equals((Object)w9)) {
                        return this;
                    }
                    w8 = new StringBuilder();
                    w8.append("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type");
                    w8.append((Object)class_);
                    throw new GeneralSecurityException(w8.toString());
                }
                this.b.put((Object)class_, (Object)w8);
                return this;
            }
            throw new NullPointerException("wrapper must be non-null");
        }
    }

    public static final class c {
        public final Class a;
        public final Class b;

        public c(Class class_, Class class_2) {
            this.a = class_;
            this.b = class_2;
        }

        public /* synthetic */ c(Class class_, Class class_2,  a8) {
            this(class_, class_2);
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
            stringBuilder.append(" with primitive type: ");
            stringBuilder.append(this.b.getSimpleName());
            return stringBuilder.toString();
        }
    }

}


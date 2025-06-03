/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Set
 */
package k3;

import c3.l;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import h3.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import k3.m;
import p3.y;

public abstract class d {
    public final Class a;
    public final Map b;
    public final Class c;

    /*
     * Enabled aggressive block sorting
     */
    public /* varargs */ d(Class class_, m ... stringBuilder) {
        this.a = class_;
        HashMap hashMap = new HashMap();
        int n8 = stringBuilder.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            class_ = stringBuilder[i8];
            if (hashMap.containsKey((Object)class_.b())) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("KeyTypeManager constructed with duplicate factories for primitive ");
                stringBuilder.append(class_.b().getCanonicalName());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            hashMap.put((Object)class_.b(), (Object)class_);
        }
        class_ = stringBuilder.length > 0 ? stringBuilder[0].b() : Void.class;
        this.c = class_;
        this.b = Collections.unmodifiableMap((Map)hashMap);
    }

    public b.b a() {
        return b.b.o;
    }

    public final Class b() {
        return this.c;
    }

    public final Class c() {
        return this.a;
    }

    public abstract String d();

    public final Object e(O o8, Class class_) {
        m m8 = (m)this.b.get((Object)class_);
        if (m8 != null) {
            return m8.a(o8);
        }
        o8 = new StringBuilder();
        o8.append("Requested primitive class ");
        o8.append(class_.getCanonicalName());
        o8.append(" not supported.");
        throw new IllegalArgumentException(o8.toString());
    }

    public abstract a f();

    public abstract y.c g();

    public abstract O h(h var1);

    public final Set i() {
        return this.b.keySet();
    }

    public abstract void j(O var1);

    public static abstract class k3.d$a {
        public final Class a;

        public k3.d$a(Class class_) {
            this.a = class_;
        }

        public abstract O a(O var1);

        public final Class b() {
            return this.a;
        }

        public Map c() {
            return Collections.emptyMap();
        }

        public abstract O d(h var1);

        public abstract void e(O var1);

        public static final class a {
            public Object a;
            public l.b b;

            public a(Object object, l.b b8) {
                this.a = object;
                this.b = b8;
            }
        }

    }

}


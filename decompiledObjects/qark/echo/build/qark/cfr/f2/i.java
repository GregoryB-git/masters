/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package f2;

import f2.b;
import f2.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class i {
    public static a a() {
        return new b.b().f((Map)new HashMap());
    }

    public final String b(String string2) {
        String string3;
        string2 = string3 = (String)this.c().get((Object)string2);
        if (string3 == null) {
            string2 = "";
        }
        return string2;
    }

    public abstract Map c();

    public abstract Integer d();

    public abstract h e();

    public abstract long f();

    public final int g(String string2) {
        string2 = (String)this.c().get((Object)string2);
        if (string2 == null) {
            return 0;
        }
        return Integer.valueOf((String)string2);
    }

    public final long h(String string2) {
        string2 = (String)this.c().get((Object)string2);
        if (string2 == null) {
            return 0L;
        }
        return Long.valueOf((String)string2);
    }

    public final Map i() {
        return Collections.unmodifiableMap((Map)this.c());
    }

    public abstract String j();

    public abstract long k();

    public a l() {
        return new b.b().j(this.j()).g(this.d()).h(this.e()).i(this.f()).k(this.k()).f((Map)new HashMap(this.c()));
    }

    public static abstract class a {
        public final a a(String string2, int n8) {
            this.e().put((Object)string2, (Object)String.valueOf((int)n8));
            return this;
        }

        public final a b(String string2, long l8) {
            this.e().put((Object)string2, (Object)String.valueOf((long)l8));
            return this;
        }

        public final a c(String string2, String string3) {
            this.e().put((Object)string2, (Object)string3);
            return this;
        }

        public abstract i d();

        public abstract Map e();

        public abstract a f(Map var1);

        public abstract a g(Integer var1);

        public abstract a h(h var1);

        public abstract a i(long var1);

        public abstract a j(String var1);

        public abstract a k(long var1);
    }

}


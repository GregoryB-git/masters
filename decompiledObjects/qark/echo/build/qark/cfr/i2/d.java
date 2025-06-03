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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d {
    public static final d c = new a().a();
    public final String a;
    public final List b;

    public d(String string2, List list) {
        this.a = string2;
        this.b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public static final class a {
        public String a = "";
        public List b = new ArrayList();

        public d a() {
            return new d(this.a, Collections.unmodifiableList((List)this.b));
        }

        public a b(List list) {
            this.b = list;
            return this;
        }

        public a c(String string2) {
            this.a = string2;
            return this;
        }
    }

}


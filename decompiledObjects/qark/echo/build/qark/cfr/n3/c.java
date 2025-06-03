/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.security.GeneralSecurityException
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 */
package n3;

import c3.k;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import n3.a;

public final class c {
    public final a a;
    public final List b;
    public final Integer c;

    public c(a a8, List list, Integer n8) {
        this.a = a8;
        this.b = list;
        this.c = n8;
    }

    public /* synthetic */ c(a a8, List list, Integer n8,  a9) {
        this(a8, list, n8);
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof c;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (c)object;
        bl = bl2;
        if (this.a.equals(object.a)) {
            bl = bl2;
            if (this.b.equals((Object)object.b)) {
                bl = bl2;
                if (Objects.equals((Object)this.c, (Object)object.c)) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public int hashCode() {
        return Objects.hash((Object[])new Object[]{this.a, this.b});
    }

    public String toString() {
        return String.format((String)"(annotations=%s, entries=%s, primaryKeyId=%s)", (Object[])new Object[]{this.a, this.b, this.c});
    }

    public static final class b {
        public ArrayList a = new ArrayList();
        public a b = a.b;
        public Integer c = null;

        public b a(k k8, int n8, String string2, String string3) {
            ArrayList arrayList = this.a;
            if (arrayList != null) {
                arrayList.add((Object)new c(k8, n8, string2, string3, null));
                return this;
            }
            throw new IllegalStateException("addEntry cannot be called after build()");
        }

        public c b() {
            if (this.a != null) {
                Object object = this.c;
                if (object != null && !this.c(object.intValue())) {
                    throw new GeneralSecurityException("primary key ID is not present in entries");
                }
                object = new c(this.b, Collections.unmodifiableList((List)this.a), this.c, null);
                this.a = null;
                return object;
            }
            throw new IllegalStateException("cannot call build() twice");
        }

        public final boolean c(int n8) {
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                if (((c)iterator.next()).a() != n8) continue;
                return true;
            }
            return false;
        }

        public b d(a a8) {
            if (this.a != null) {
                this.b = a8;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }

        public b e(int n8) {
            if (this.a != null) {
                this.c = n8;
                return this;
            }
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
    }

    public static final class c {
        public final k a;
        public final int b;
        public final String c;
        public final String d;

        public c(k k8, int n8, String string2, String string3) {
            this.a = k8;
            this.b = n8;
            this.c = string2;
            this.d = string3;
        }

        public /* synthetic */ c(k k8, int n8, String string2, String string3,  a8) {
            this(k8, n8, string2, string3);
        }

        public int a() {
            return this.b;
        }

        public boolean equals(Object object) {
            boolean bl = object instanceof c;
            boolean bl2 = false;
            if (!bl) {
                return false;
            }
            object = (c)object;
            bl = bl2;
            if (this.a == object.a) {
                bl = bl2;
                if (this.b == object.b) {
                    bl = bl2;
                    if (this.c.equals((Object)object.c)) {
                        bl = bl2;
                        if (this.d.equals((Object)object.d)) {
                            bl = true;
                        }
                    }
                }
            }
            return bl;
        }

        public int hashCode() {
            return Objects.hash((Object[])new Object[]{this.a, this.b, this.c, this.d});
        }

        public String toString() {
            return String.format((String)"(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", (Object[])new Object[]{this.a, this.b, this.c, this.d});
        }
    }

}


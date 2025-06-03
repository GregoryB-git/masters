/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 */
package L5;

import Q3.e;
import Q3.p;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class A {
    public final List a;
    public p b;

    public A(e e8, List list) {
        this.b = e8;
        this.a = list;
    }

    public p a() {
        if (this.a.isEmpty()) {
            return this.b;
        }
        block10 : for (Map map : this.a) {
            Object object = map.get((Object)"type");
            Objects.requireNonNull((Object)object);
            object = (String)object;
            int n8 = object.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 102976443: {
                    if (!object.equals((Object)"limit")) break;
                    n9 = 2;
                    break;
                }
                case -1207110587: {
                    if (!object.equals((Object)"orderBy")) break;
                    n9 = 1;
                    break;
                }
                case -1349119146: {
                    if (!object.equals((Object)"cursor")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    continue block10;
                }
                case 2: {
                    this.e(map);
                    continue block10;
                }
                case 1: {
                    this.f(map);
                    continue block10;
                }
                case 0: 
            }
            this.b(map);
        }
        return this.b;
    }

    public final void b(Map map) {
        Object object = map.get((Object)"name");
        Objects.requireNonNull((Object)object);
        object = (String)object;
        int n8 = object.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1108304954: {
                if (!object.equals((Object)"endBefore")) break;
                n9 = 3;
                break;
            }
            case 96650862: {
                if (!object.equals((Object)"endAt")) break;
                n9 = 2;
                break;
            }
            case -1601257830: {
                if (!object.equals((Object)"startAfter")) break;
                n9 = 1;
                break;
            }
            case -1897186251: {
                if (!object.equals((Object)"startAt")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return;
            }
            case 3: {
                this.d(map);
                return;
            }
            case 2: {
                this.c(map);
                return;
            }
            case 1: {
                this.g(map);
                return;
            }
            case 0: 
        }
        this.h(map);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void c(Map object) {
        Object object2 = object.get((Object)"value");
        object = (String)object.get((Object)"key");
        object = object2 instanceof Boolean ? (object == null ? this.b.i((Boolean)object2) : this.b.j((Boolean)object2, (String)object)) : (object2 instanceof Number ? (object == null ? this.b.d(((Number)object2).doubleValue()) : this.b.e(((Number)object2).doubleValue(), (String)object)) : (object == null ? this.b.g((String)object2) : this.b.h((String)object2, (String)object)));
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d(Map object) {
        Object object2 = object.get((Object)"value");
        object = (String)object.get((Object)"key");
        object = object2 instanceof Boolean ? (object == null ? this.b.p((Boolean)object2) : this.b.q((Boolean)object2, (String)object)) : (object2 instanceof Number ? (object == null ? this.b.k(((Number)object2).doubleValue()) : this.b.l(((Number)object2).doubleValue(), (String)object)) : (object == null ? this.b.n((String)object2) : this.b.o((String)object2, (String)object)));
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void e(Map object) {
        Object object2 = object.get((Object)"name");
        Objects.requireNonNull((Object)object2);
        object2 = (String)object2;
        object = object.get((Object)"limit");
        Objects.requireNonNull((Object)object);
        int n8 = (Integer)object;
        if ("limitToFirst".equals(object2)) {
            object = this.b.w(n8);
        } else {
            if (!"limitToLast".equals(object2)) {
                return;
            }
            object = this.b.x(n8);
        }
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void f(Map object) {
        Object object2 = object.get((Object)"name");
        Objects.requireNonNull((Object)object2);
        object2 = (String)object2;
        int n8 = object2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1217630252: {
                if (!object2.equals((Object)"orderByValue")) break;
                n9 = 3;
                break;
            }
            case 1200288727: {
                if (!object2.equals((Object)"orderByChild")) break;
                n9 = 2;
                break;
            }
            case 729747418: {
                if (!object2.equals((Object)"orderByKey")) break;
                n9 = 1;
                break;
            }
            case -626148087: {
                if (!object2.equals((Object)"orderByPriority")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return;
            }
            case 3: {
                object = this.b.B();
                break;
            }
            case 2: {
                object = object.get((Object)"path");
                Objects.requireNonNull((Object)object);
                object = (String)object;
                object = this.b.y((String)object);
                break;
            }
            case 1: {
                object = this.b.z();
                break;
            }
            case 0: {
                object = this.b.A();
            }
        }
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void g(Map object) {
        Object object2 = object.get((Object)"value");
        object = (String)object.get((Object)"key");
        object = object2 instanceof Boolean ? (object == null ? this.b.K((Boolean)object2) : this.b.L((Boolean)object2, (String)object)) : (object2 instanceof Number ? (object == null ? this.b.F(((Number)object2).doubleValue()) : this.b.G(((Number)object2).doubleValue(), (String)object)) : (object == null ? this.b.I((String)object2) : this.b.J((String)object2, (String)object)));
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void h(Map object) {
        Object object2 = object.get((Object)"value");
        object = (String)object.get((Object)"key");
        object = object2 instanceof Boolean ? (object == null ? this.b.R((Boolean)object2) : this.b.S((Boolean)object2, (String)object)) : (object2 instanceof Number ? (object == null ? this.b.M(((Number)object2).doubleValue()) : this.b.N(((Number)object2).doubleValue(), (String)object)) : (object == null ? this.b.P((String)object2) : this.b.Q((String)object2, (String)object)));
        this.b = object;
    }
}


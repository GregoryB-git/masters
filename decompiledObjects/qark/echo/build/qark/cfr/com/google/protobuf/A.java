/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 */
package com.google.protobuf;

import com.google.protobuf.U;
import com.google.protobuf.j0;
import com.google.protobuf.k0;
import com.google.protobuf.t;
import com.google.protobuf.y;
import com.google.protobuf.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class A {
    public static final A a = new b(null);
    public static final A b = new c(null);

    public A() {
    }

    public /* synthetic */ A( a8) {
        this();
    }

    public static A a() {
        return a;
    }

    public static A b() {
        return b;
    }

    public abstract void c(Object var1, long var2);

    public abstract void d(Object var1, Object var2, long var3);

    public static final class b
    extends A {
        public static final Class c = Collections.unmodifiableList((List)Collections.emptyList()).getClass();

        public b() {
            super(null);
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public static List e(Object object, long l8) {
            return (List)k0.C(object, l8);
        }

        /*
         * Enabled aggressive block sorting
         */
        public static List f(Object object, long l8, int n8) {
            List list;
            block11 : {
                t.e e8;
                block7 : {
                    block10 : {
                        Object object2;
                        block9 : {
                            block8 : {
                                block6 : {
                                    list = b.e(object, l8);
                                    if (!list.isEmpty()) break block6;
                                    e8 = list instanceof z ? new y(n8) : (list instanceof U && list instanceof t.e ? ((t.e)list).h(n8) : new Object(n8));
                                    break block7;
                                }
                                if (!c.isAssignableFrom(list.getClass())) break block8;
                                object2 = new ArrayList(list.size() + n8);
                                object2.addAll((Collection)list);
                                break block9;
                            }
                            if (!(list instanceof j0)) break block10;
                            object2 = new y(list.size() + n8);
                            object2.addAll((Collection)((j0)list));
                        }
                        k0.R(object, l8, object2);
                        return object2;
                    }
                    if (!(list instanceof U) || !(list instanceof t.e) || (e8 = (t.e)list).p()) break block11;
                    e8 = e8.h(list.size() + n8);
                }
                k0.R(object, l8, e8);
                return e8;
            }
            return list;
        }

        @Override
        public void c(Object object, long l8) {
            List list = (List)k0.C(object, l8);
            if (list instanceof z) {
                list = ((z)list).m();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if (list instanceof U && list instanceof t.e) {
                    object = (t.e)list;
                    if (object.p()) {
                        object.j();
                    }
                    return;
                }
                list = Collections.unmodifiableList((List)list);
            }
            k0.R(object, l8, (Object)list);
        }

        @Override
        public void d(Object object, Object object2, long l8) {
            object2 = b.e(object2, l8);
            List list = b.f(object, l8, object2.size());
            int n8 = list.size();
            int n9 = object2.size();
            if (n8 > 0 && n9 > 0) {
                list.addAll((Collection)object2);
            }
            if (n8 > 0) {
                object2 = list;
            }
            k0.R(object, l8, object2);
        }
    }

    public static final class c
    extends A {
        public c() {
            super(null);
        }

        public /* synthetic */ c( a8) {
            this();
        }

        public static t.e e(Object object, long l8) {
            return (t.e)k0.C(object, l8);
        }

        @Override
        public void c(Object object, long l8) {
            c.e(object, l8).j();
        }

        @Override
        public void d(Object object, Object object2, long l8) {
            Object object3 = c.e(object, l8);
            t.e e8 = c.e(object2, l8);
            int n8 = object3.size();
            int n9 = e8.size();
            object2 = object3;
            if (n8 > 0) {
                object2 = object3;
                if (n9 > 0) {
                    object2 = object3;
                    if (!object3.p()) {
                        object2 = object3.h(n9 + n8);
                    }
                    object2.addAll((Collection)e8);
                }
            }
            object3 = e8;
            if (n8 > 0) {
                object3 = object2;
            }
            k0.R(object, l8, object3);
        }
    }

}


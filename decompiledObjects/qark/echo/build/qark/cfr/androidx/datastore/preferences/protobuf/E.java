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
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.o0;
import androidx.datastore.preferences.protobuf.p0;
import androidx.datastore.preferences.protobuf.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class E {
    public static final E a = new b(null);
    public static final E b = new c(null);

    public E() {
    }

    public /* synthetic */ E( a8) {
        this();
    }

    public static E a() {
        return a;
    }

    public static E b() {
        return b;
    }

    public abstract void c(Object var1, long var2);

    public abstract void d(Object var1, Object var2, long var3);

    public abstract List e(Object var1, long var2);

    public static final class b
    extends E {
        public static final Class c = Collections.unmodifiableList((List)Collections.emptyList()).getClass();

        public b() {
            super(null);
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public static List f(Object object, long l8) {
            return (List)p0.A(object, l8);
        }

        /*
         * Enabled aggressive block sorting
         */
        public static List g(Object object, long l8, int n8) {
            List list;
            block11 : {
                y.b b8;
                block7 : {
                    block10 : {
                        Object object2;
                        block9 : {
                            block8 : {
                                block6 : {
                                    list = b.f(object, l8);
                                    if (!list.isEmpty()) break block6;
                                    b8 = list instanceof D ? new C(n8) : (list instanceof Y && list instanceof y.b ? ((y.b)list).h(n8) : new Object(n8));
                                    break block7;
                                }
                                if (!c.isAssignableFrom(list.getClass())) break block8;
                                object2 = new ArrayList(list.size() + n8);
                                object2.addAll((Collection)list);
                                break block9;
                            }
                            if (!(list instanceof o0)) break block10;
                            object2 = new C(list.size() + n8);
                            object2.addAll((Collection)((o0)list));
                        }
                        p0.O(object, l8, object2);
                        return object2;
                    }
                    if (!(list instanceof Y) || !(list instanceof y.b) || (b8 = (y.b)list).p()) break block11;
                    b8 = b8.h(list.size() + n8);
                }
                p0.O(object, l8, b8);
                return b8;
            }
            return list;
        }

        @Override
        public void c(Object object, long l8) {
            List list = (List)p0.A(object, l8);
            if (list instanceof D) {
                list = ((D)list).m();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if (list instanceof Y && list instanceof y.b) {
                    object = (y.b)list;
                    if (object.p()) {
                        object.j();
                    }
                    return;
                }
                list = Collections.unmodifiableList((List)list);
            }
            p0.O(object, l8, (Object)list);
        }

        @Override
        public void d(Object object, Object object2, long l8) {
            object2 = b.f(object2, l8);
            List list = b.g(object, l8, object2.size());
            int n8 = list.size();
            int n9 = object2.size();
            if (n8 > 0 && n9 > 0) {
                list.addAll((Collection)object2);
            }
            if (n8 > 0) {
                object2 = list;
            }
            p0.O(object, l8, object2);
        }

        @Override
        public List e(Object object, long l8) {
            return b.g(object, l8, 10);
        }
    }

    public static final class c
    extends E {
        public c() {
            super(null);
        }

        public /* synthetic */ c( a8) {
            this();
        }

        public static y.b f(Object object, long l8) {
            return (y.b)p0.A(object, l8);
        }

        @Override
        public void c(Object object, long l8) {
            c.f(object, l8).j();
        }

        @Override
        public void d(Object object, Object object2, long l8) {
            Object object3 = c.f(object, l8);
            y.b b8 = c.f(object2, l8);
            int n8 = object3.size();
            int n9 = b8.size();
            object2 = object3;
            if (n8 > 0) {
                object2 = object3;
                if (n9 > 0) {
                    object2 = object3;
                    if (!object3.p()) {
                        object2 = object3.h(n9 + n8);
                    }
                    object2.addAll((Collection)b8);
                }
            }
            object3 = b8;
            if (n8 > 0) {
                object3 = object2;
            }
            p0.O(object, l8, object3);
        }

        @Override
        public List e(Object object, long l8) {
            y.b b8;
            y.b b9 = b8 = c.f(object, l8);
            if (!b8.p()) {
                int n8 = b8.size();
                n8 = n8 == 0 ? 10 : (n8 *= 2);
                b9 = b8.h(n8);
                p0.O(object, l8, b9);
            }
            return b9;
        }
    }

}


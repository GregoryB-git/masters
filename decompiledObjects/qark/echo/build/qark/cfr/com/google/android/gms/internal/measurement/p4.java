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
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D5;
import com.google.android.gms.internal.measurement.S4;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.internal.measurement.s4;
import com.google.android.gms.internal.measurement.t4;
import com.google.android.gms.internal.measurement.y5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class p4
extends q4 {
    public static final Class c = Collections.unmodifiableList((List)Collections.emptyList()).getClass();

    public p4() {
        super(null);
    }

    public /* synthetic */ p4(s4 s42) {
        this();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static List e(Object object, long l8, int n8) {
        List list;
        block11 : {
            h4 h42;
            block7 : {
                block10 : {
                    Object object2;
                    block9 : {
                        block8 : {
                            block6 : {
                                list = p4.f(object, l8);
                                if (!list.isEmpty()) break block6;
                                h42 = list instanceof n4 ? new o4(n8) : (list instanceof S4 && list instanceof h4 ? ((h4)list).e(n8) : new Object(n8));
                                break block7;
                            }
                            if (!c.isAssignableFrom(list.getClass())) break block8;
                            object2 = new ArrayList(list.size() + n8);
                            object2.addAll((Collection)list);
                            break block9;
                        }
                        if (!(list instanceof y5)) break block10;
                        object2 = new o4(list.size() + n8);
                        object2.addAll((Collection)((y5)list));
                    }
                    D5.j(object, l8, object2);
                    return object2;
                }
                if (!(list instanceof S4) || !(list instanceof h4) || (h42 = (h4)list).c()) break block11;
                h42 = h42.e(list.size() + n8);
            }
            D5.j(object, l8, h42);
            return h42;
        }
        return list;
    }

    public static List f(Object object, long l8) {
        return (List)D5.B(object, l8);
    }

    @Override
    public final void b(Object object, Object object2, long l8) {
        object2 = p4.f(object2, l8);
        List list = p4.e(object, l8, object2.size());
        int n8 = list.size();
        int n9 = object2.size();
        if (n8 > 0 && n9 > 0) {
            list.addAll((Collection)object2);
        }
        if (n8 > 0) {
            object2 = list;
        }
        D5.j(object, l8, object2);
    }

    @Override
    public final void d(Object object, long l8) {
        List list = (List)D5.B(object, l8);
        if (list instanceof n4) {
            list = ((n4)list).w();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if (list instanceof S4 && list instanceof h4) {
                object = (h4)list;
                if (object.c()) {
                    object.G();
                }
                return;
            }
            list = Collections.unmodifiableList((List)list);
        }
        D5.j(object, l8, (Object)list);
    }
}


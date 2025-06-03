/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Appendable
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package kotlin.text;

import W5.m;
import g6.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.i;
import kotlin.text.j;
import kotlin.text.s;
import kotlin.text.u;

public class k
extends j {
    public static final l b(final String string2) {
        if (string2.length() == 0) {
            return .o;
        }
        return new l(){

            public final String a(String string22) {
                Intrinsics.checkNotNullParameter(string22, "line");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(string22);
                return stringBuilder.toString();
            }
        };
    }

    public static final int c(String string2) {
        int n8;
        int n9;
        block3 : {
            n8 = string2.length();
            for (n9 = 0; n9 < n8; ++n9) {
                if (!(CharsKt__CharJVMKt.b(string2.charAt(n9)) ^ true)) {
                    continue;
                }
                break block3;
            }
            n9 = -1;
        }
        n8 = n9;
        if (n9 == -1) {
            n8 = string2.length();
        }
        return n8;
    }

    public static final String d(String object, String string2) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(string2, "newIndent");
        List list = s.M((CharSequence)object);
        Iterable iterable = (Iterable)list;
        Object object2 = new ArrayList();
        for (Object object3 : iterable) {
            if (!(i.F((String)object3) ^ true)) continue;
            object2.add(object3);
        }
        iterable = new ArrayList(m.l((Iterable)object2, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            iterable.add((Object)k.c((String)object2.next()));
        }
        object2 = (Integer)m.A(iterable);
        int n8 = 0;
        int n9 = object2 != null ? object2.intValue() : 0;
        int n10 = object.length();
        int n11 = string2.length();
        int n12 = list.size();
        object2 = k.b(string2);
        int n13 = m.h(list);
        object = (Iterable)list;
        list = new ArrayList();
        iterable = object.iterator();
        while (iterable.hasNext()) {
            object = iterable.next();
            if (n8 < 0) {
                m.k();
            }
            string2 = (String)object;
            if ((n8 == 0 || n8 == n13) && i.F(string2)) {
                object = null;
            } else {
                Object object3;
                object3 = u.g0(string2, n9);
                object = string2;
                if (object3 != null && (object = (String)object2.invoke(object3)) == null) {
                    object = string2;
                }
            }
            if (object != null) {
                list.add(object);
            }
            ++n8;
        }
        object = ((StringBuilder)m.v((Iterable)list, (Appendable)new StringBuilder(n10 + n11 * n12), "\n", null, null, 0, null, null, 124, null)).toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    public static String e(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        return k.d(string2, "");
    }

}


// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.text;

import java.util.Iterator;
import W5.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import g6.l;

public class k extends j
{
    public static final l b(final String s) {
        if (s.length() == 0) {
            return k$a.o;
        }
        return new l() {
            public final String a(final String str) {
                Intrinsics.checkNotNullParameter(str, "line");
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(str);
                return sb.toString();
            }
        };
    }
    
    public static final int c(final String s) {
        while (true) {
            for (int length = s.length(), i = 0; i < length; ++i) {
                if (CharsKt__CharJVMKt.b(s.charAt(i)) ^ true) {
                    int length2 = i;
                    if (i == -1) {
                        length2 = s.length();
                    }
                    return length2;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    public static final String d(String string, String s) {
        Intrinsics.checkNotNullParameter(string, "<this>");
        Intrinsics.checkNotNullParameter(s, "newIndent");
        final List m = s.M(string);
        final List<Object> list = (List<Object>)m;
        final ArrayList<String> list2 = new ArrayList<String>();
        for (final String next : list) {
            if (i.F(next) ^ true) {
                list2.add(next);
            }
        }
        final ArrayList list3 = new ArrayList<Integer>(W5.m.l(list2, 10));
        final Iterator<Object> iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            list3.add(Integer.valueOf(c(iterator2.next())));
        }
        final Integer n = (Integer)W5.m.A(list3);
        int n2 = 0;
        int intValue;
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        final int length = string.length();
        final int length2 = s.length();
        final int size = m.size();
        final l b = b(s);
        final int h = W5.m.h(m);
        final List<Object> list4 = (List<Object>)m;
        final ArrayList<String> list5 = new ArrayList<String>();
        for (final String next2 : list4) {
            if (n2 < 0) {
                W5.m.k();
            }
            s = next2;
            if ((n2 == 0 || n2 == h) && i.F(s)) {
                string = null;
            }
            else {
                final String g0 = u.g0(s, intValue);
                string = s;
                if (g0 != null) {
                    string = (String)b.invoke(g0);
                    if (string == null) {
                        string = s;
                    }
                }
            }
            if (string != null) {
                list5.add(string);
            }
            ++n2;
        }
        string = ((StringBuilder)W5.m.v(list5, new StringBuilder(length + length2 * size), "\n", null, null, 0, null, null, 124, null)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
    
    public static String e(final String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return d(s, "");
    }
}

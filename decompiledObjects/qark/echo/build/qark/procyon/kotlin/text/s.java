// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.text;

import java.util.Iterator;
import java.util.ArrayList;
import V5.q;
import java.util.Collection;
import V5.m;
import kotlin.jvm.internal.l;
import g6.p;
import java.util.List;
import n6.b;
import W5.g;
import kotlin.jvm.internal.Intrinsics;
import l6.a;
import l6.c;
import l6.d;

public class s extends r
{
    public static final int A(final CharSequence charSequence, final CharSequence charSequence2, int n, int n2, final boolean b, final boolean b2) {
        a f;
        if (!b2) {
            f = new c(d.a(n, 0), d.b(n2, charSequence.length()));
        }
        else {
            f = d.f(d.b(n, x(charSequence)), d.a(n2, 0));
        }
        if (charSequence instanceof String && charSequence2 instanceof String) {
            n2 = f.a();
            final int d = f.d();
            final int f2 = f.f();
            if (f2 <= 0 || (n = n2) > d) {
                if (f2 >= 0 || d > n2) {
                    return -1;
                }
                n = n2;
            }
            while (!r.m((String)charSequence2, 0, (String)charSequence, n, charSequence2.length(), b)) {
                if (n == d) {
                    return -1;
                }
                n += f2;
            }
            return n;
        }
        n2 = f.a();
        final int d2 = f.d();
        final int f3 = f.f();
        if (f3 <= 0 || (n = n2) > d2) {
            if (f3 >= 0 || d2 > n2) {
                return -1;
            }
            n = n2;
        }
        while (!R(charSequence2, 0, charSequence, n, charSequence2.length(), b)) {
            if (n == d2) {
                return -1;
            }
            n += f3;
        }
        return n;
    }
    
    public static /* synthetic */ int B(final CharSequence charSequence, final CharSequence charSequence2, final int n, final int n2, final boolean b, boolean b2, final int n3, final Object o) {
        if ((n3 & 0x10) != 0x0) {
            b2 = false;
        }
        return A(charSequence, charSequence2, n, n2, b, b2);
    }
    
    public static final int E(final CharSequence charSequence, final char[] array, int a, final boolean b) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(array, "chars");
        if (!b && array.length == 1 && charSequence instanceof String) {
            return ((String)charSequence).indexOf(g.q(array), a);
        }
        a = d.a(a, 0);
        final int x = x(charSequence);
        if (a <= x) {
            while (true) {
                final char char1 = charSequence.charAt(a);
                for (int length = array.length, i = 0; i < length; ++i) {
                    if (a.d(array[i], char1, b)) {
                        return a;
                    }
                }
                if (a == x) {
                    break;
                }
                ++a;
            }
        }
        return -1;
    }
    
    public static boolean F(final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); ++i) {
            if (!CharsKt__CharJVMKt.b(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static final int G(final CharSequence charSequence, final char ch, final int fromIndex, final boolean b) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (!b && charSequence instanceof String) {
            return ((String)charSequence).lastIndexOf(ch, fromIndex);
        }
        return K(charSequence, new char[] { ch }, fromIndex, b);
    }
    
    public static final int H(final CharSequence charSequence, final String str, final int fromIndex, final boolean b) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(str, "string");
        if (!b && charSequence instanceof String) {
            return ((String)charSequence).lastIndexOf(str, fromIndex);
        }
        return A(charSequence, str, fromIndex, 0, b, true);
    }
    
    public static /* synthetic */ int I(final CharSequence charSequence, final char c, int x, boolean b, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            x = x(charSequence);
        }
        if ((n & 0x4) != 0x0) {
            b = false;
        }
        return G(charSequence, c, x, b);
    }
    
    public static final int K(final CharSequence charSequence, final char[] array, int b, final boolean b2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(array, "chars");
        if (!b2 && array.length == 1 && charSequence instanceof String) {
            return ((String)charSequence).lastIndexOf(g.q(array), b);
        }
        char char1;
        int length;
        int i;
        for (b = d.b(b, x(charSequence)); -1 < b; --b) {
            char1 = charSequence.charAt(b);
            for (length = array.length, i = 0; i < length; ++i) {
                if (kotlin.text.a.d(array[i], char1, b2)) {
                    return b;
                }
            }
        }
        return -1;
    }
    
    public static final b L(final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return X(charSequence, new String[] { "\r\n", "\n", "\r" }, false, 0, 6, null);
    }
    
    public static final List M(final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return n6.c.e(L(charSequence));
    }
    
    public static final CharSequence N(final CharSequence s, int n, final char c) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Desired length ");
            sb.append(n);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (n <= s.length()) {
            return s.subSequence(0, s.length());
        }
        final StringBuilder sb2 = new StringBuilder(n);
        final int n2 = n - s.length();
        n = 1;
        if (1 <= n2) {
            while (true) {
                sb2.append(c);
                if (n == n2) {
                    break;
                }
                ++n;
            }
        }
        sb2.append(s);
        return sb2;
    }
    
    public static String O(final String s, final int n, final char c) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return N(s, n, c).toString();
    }
    
    public static final b P(final CharSequence charSequence, final String[] array, final int n, final boolean b, final int n2) {
        S(n2);
        return new kotlin.text.c(charSequence, n, n2, new g6.p() {
            public final /* synthetic */ List o = g.b(array);
            
            public final V5.m a(final CharSequence charSequence, final int n) {
                Intrinsics.checkNotNullParameter(charSequence, "$this$$receiver");
                final V5.m t = w(charSequence, this.o, n, b, false);
                if (t != null) {
                    return V5.q.a(t.c(), ((String)t.d()).length());
                }
                return null;
            }
        });
    }
    
    public static /* synthetic */ b Q(final CharSequence charSequence, final String[] array, int n, boolean b, int n2, final int n3, final Object o) {
        if ((n3 & 0x2) != 0x0) {
            n = 0;
        }
        if ((n3 & 0x4) != 0x0) {
            b = false;
        }
        if ((n3 & 0x8) != 0x0) {
            n2 = 0;
        }
        return P(charSequence, array, n, b, n2);
    }
    
    public static final boolean R(final CharSequence charSequence, final int n, final CharSequence charSequence2, final int n2, final int n3, final boolean b) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(charSequence2, "other");
        if (n2 < 0 || n < 0 || n > charSequence.length() - n3) {
            return false;
        }
        if (n2 > charSequence2.length() - n3) {
            return false;
        }
        for (int i = 0; i < n3; ++i) {
            if (!kotlin.text.a.d(charSequence.charAt(n + i), charSequence2.charAt(n2 + i), b)) {
                return false;
            }
        }
        return true;
    }
    
    public static final void S(final int i) {
        if (i >= 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static final List T(final CharSequence charSequence, final String[] array, final boolean b, final int n) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(array, "delimiters");
        if (array.length == 1) {
            final String s = array[0];
            if (s.length() != 0) {
                return U(charSequence, s, b, n);
            }
        }
        final Iterable c = n6.c.c(Q(charSequence, array, 0, b, n, 2, null));
        final ArrayList list = new ArrayList<String>(W5.m.l(c, 10));
        final Iterator<c> iterator = c.iterator();
        while (iterator.hasNext()) {
            list.add(Y(charSequence, iterator.next()));
        }
        return list;
    }
    
    public static final List U(final CharSequence charSequence, final String s, final boolean b, final int n) {
        S(n);
        int n2 = 0;
        final int z = z(charSequence, s, 0, b);
        if (z != -1 && n != 1) {
            final boolean b2 = n > 0;
            int b3 = 10;
            if (b2) {
                b3 = d.b(n, 10);
            }
            final ArrayList list = new ArrayList<String>(b3);
            int n3 = z;
            int z2;
            int n4;
            do {
                list.add(charSequence.subSequence(n2, n3).toString());
                n4 = s.length() + n3;
                if (b2 && list.size() == n - 1) {
                    break;
                }
                z2 = z(charSequence, s, n4, b);
                n2 = n4;
            } while ((n3 = z2) != -1);
            list.add(charSequence.subSequence(n4, charSequence.length()).toString());
            return list;
        }
        return W5.m.b(charSequence.toString());
    }
    
    public static final b W(final CharSequence charSequence, final String[] array, final boolean b, final int n) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(array, "delimiters");
        return n6.c.d(Q(charSequence, array, 0, b, n, 2, null), new g6.l() {
            public final String a(final l6.c c) {
                Intrinsics.checkNotNullParameter(c, "it");
                return s.Y(charSequence, c);
            }
        });
    }
    
    public static /* synthetic */ b X(final CharSequence charSequence, final String[] array, boolean b, int n, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            b = false;
        }
        if ((n2 & 0x4) != 0x0) {
            n = 0;
        }
        return W(charSequence, array, b, n);
    }
    
    public static final String Y(final CharSequence charSequence, final c c) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(c, "range");
        return charSequence.subSequence(c.q(), c.k() + 1).toString();
    }
    
    public static final String Z(String substring, final char c, final String s) {
        Intrinsics.checkNotNullParameter(substring, "<this>");
        Intrinsics.checkNotNullParameter(s, "missingDelimiterValue");
        final int c2 = i.C(substring, c, 0, false, 6, null);
        if (c2 == -1) {
            return s;
        }
        substring = substring.substring(c2 + 1, substring.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
    
    public static final String a0(String substring, final String s, final String s2) {
        Intrinsics.checkNotNullParameter(substring, "<this>");
        Intrinsics.checkNotNullParameter(s, "delimiter");
        Intrinsics.checkNotNullParameter(s2, "missingDelimiterValue");
        final int d = i.D(substring, s, 0, false, 6, null);
        if (d == -1) {
            return s2;
        }
        substring = substring.substring(d + s.length(), substring.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
    
    public static String d0(String substring, final char c, final String s) {
        Intrinsics.checkNotNullParameter(substring, "<this>");
        Intrinsics.checkNotNullParameter(s, "missingDelimiterValue");
        final int i = I(substring, c, 0, false, 6, null);
        if (i == -1) {
            return s;
        }
        substring = substring.substring(i + 1, substring.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
    
    public static CharSequence f0(final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int n = charSequence.length() - 1;
        int i = 0;
        int n2 = 0;
        while (i <= n) {
            int n3;
            if (n2 == 0) {
                n3 = i;
            }
            else {
                n3 = n;
            }
            final boolean b = CharsKt__CharJVMKt.b(charSequence.charAt(n3));
            if (n2 == 0) {
                if (!b) {
                    n2 = 1;
                }
                else {
                    ++i;
                }
            }
            else {
                if (!b) {
                    break;
                }
                --n;
            }
        }
        return charSequence.subSequence(i, n + 1);
    }
    
    public static final boolean u(final CharSequence charSequence, final CharSequence charSequence2, final boolean b) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (i.D(charSequence, (String)charSequence2, 0, b, 2, null) < 0) {
                return false;
            }
        }
        else if (B(charSequence, charSequence2, 0, charSequence.length(), b, false, 16, null) < 0) {
            return false;
        }
        return true;
    }
    
    public static final V5.m w(final CharSequence charSequence, final Collection collection, int n, final boolean b, final boolean b2) {
        if (b || collection.size() != 1) {
            a f;
            if (!b2) {
                f = new c(d.a(n, 0), charSequence.length());
            }
            else {
                f = d.f(d.b(n, x(charSequence)), 0);
            }
            String s3 = null;
            Label_0246: {
                if (charSequence instanceof String) {
                    final int a = f.a();
                    final int d = f.d();
                    final int f2 = f.f();
                    if (f2 <= 0 || (n = a) > d) {
                        if (f2 >= 0 || d > a) {
                            return null;
                        }
                        n = a;
                    }
                Label_0168:
                    while (true) {
                        while (true) {
                            for (final String next : (Collection<Object>)collection) {
                                final String s = next;
                                if (r.m(s, 0, (String)charSequence, n, s.length(), b)) {
                                    final String s2 = next;
                                    if (s2 != null) {
                                        s3 = s2;
                                        break Label_0246;
                                    }
                                    if (n != d) {
                                        n += f2;
                                        continue Label_0168;
                                    }
                                    return null;
                                }
                            }
                            String next = null;
                            continue;
                        }
                    }
                }
                else {
                    final int a2 = f.a();
                    final int d2 = f.d();
                    final int f3 = f.f();
                    if (f3 <= 0 || (n = a2) > d2) {
                        if (f3 >= 0 || d2 > a2) {
                            return null;
                        }
                        n = a2;
                    }
                Label_0320:
                    while (true) {
                        while (true) {
                            for (final String next2 : (Collection<Object>)collection) {
                                final String s4 = next2;
                                if (R(s4, 0, charSequence, n, s4.length(), b)) {
                                    final String s5 = next2;
                                    if (s5 != null) {
                                        s3 = s5;
                                        break Label_0246;
                                    }
                                    if (n != d2) {
                                        n += f3;
                                        continue Label_0320;
                                    }
                                    return null;
                                }
                            }
                            String next2 = null;
                            continue;
                        }
                    }
                }
            }
            return V5.q.a(n, s3);
        }
        final String s6 = (String)W5.m.B(collection);
        if (!b2) {
            n = i.D(charSequence, s6, n, false, 4, null);
        }
        else {
            n = i.J(charSequence, s6, n, false, 4, null);
        }
        if (n < 0) {
            return null;
        }
        return V5.q.a(n, s6);
    }
    
    public static final int x(final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }
    
    public static final int y(final CharSequence charSequence, final char ch, final int fromIndex, final boolean b) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (!b && charSequence instanceof String) {
            return ((String)charSequence).indexOf(ch, fromIndex);
        }
        return E(charSequence, new char[] { ch }, fromIndex, b);
    }
    
    public static final int z(final CharSequence charSequence, final String str, final int fromIndex, final boolean b) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(str, "string");
        if (!b && charSequence instanceof String) {
            return ((String)charSequence).indexOf(str, fromIndex);
        }
        return B(charSequence, str, fromIndex, charSequence.length(), b, false, 16, null);
    }
}

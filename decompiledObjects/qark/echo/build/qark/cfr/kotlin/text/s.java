/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package kotlin.text;

import V5.m;
import V5.q;
import W5.g;
import g6.l;
import g6.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.a;
import kotlin.text.c;
import kotlin.text.i;
import kotlin.text.r;
import l6.d;
import n6.b;

public class s
extends r {
    public static final int A(CharSequence charSequence, CharSequence charSequence2, int n8, int n9, boolean bl, boolean bl2) {
        block12 : {
            int n10;
            int n11;
            block17 : {
                block16 : {
                    l6.a a8;
                    block13 : {
                        int n12;
                        int n13;
                        block15 : {
                            block14 : {
                                a8 = !bl2 ? new l6.c(d.a(n8, 0), d.b(n9, charSequence.length())) : d.f(d.b(n8, s.x(charSequence)), d.a(n9, 0));
                                if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) break block13;
                                n9 = a8.a();
                                n12 = a8.d();
                                n13 = a8.f();
                                if (n13 <= 0) break block14;
                                n8 = n9;
                                if (n9 <= n12) break block15;
                            }
                            if (n13 >= 0 || n12 > n9) break block12;
                            n8 = n9;
                        }
                        do {
                            if (r.m((String)charSequence2, 0, (String)charSequence, n8, charSequence2.length(), bl)) {
                                return n8;
                            }
                            if (n8 != n12) {
                                n8 += n13;
                                continue;
                            }
                            break block12;
                            break;
                        } while (true);
                    }
                    n9 = a8.a();
                    n10 = a8.d();
                    n11 = a8.f();
                    if (n11 <= 0) break block16;
                    n8 = n9;
                    if (n9 <= n10) break block17;
                }
                if (n11 >= 0 || n10 > n9) break block12;
                n8 = n9;
            }
            do {
                if (s.R(charSequence2, 0, charSequence, n8, charSequence2.length(), bl)) {
                    return n8;
                }
                if (n8 == n10) break;
                n8 += n11;
            } while (true);
        }
        return -1;
    }

    public static /* synthetic */ int B(CharSequence charSequence, CharSequence charSequence2, int n8, int n9, boolean bl, boolean bl2, int n10, Object object) {
        if ((n10 & 16) != 0) {
            bl2 = false;
        }
        return s.A(charSequence, charSequence2, n8, n9, bl, bl2);
    }

    public static /* synthetic */ int C(CharSequence charSequence, char c8, int n8, boolean bl, int n9, Object object) {
        if ((n9 & 2) != 0) {
            n8 = 0;
        }
        if ((n9 & 4) != 0) {
            bl = false;
        }
        return s.y(charSequence, c8, n8, bl);
    }

    public static /* synthetic */ int D(CharSequence charSequence, String string2, int n8, boolean bl, int n9, Object object) {
        if ((n9 & 2) != 0) {
            n8 = 0;
        }
        if ((n9 & 4) != 0) {
            bl = false;
        }
        return s.z(charSequence, string2, n8, bl);
    }

    public static final int E(CharSequence charSequence, char[] arrc, int n8, boolean bl) {
        int n9;
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        Intrinsics.checkNotNullParameter(arrc, "chars");
        if (!bl && arrc.length == 1 && charSequence instanceof String) {
            char c8 = g.q(arrc);
            return ((String)charSequence).indexOf((int)c8, n8);
        }
        if ((n8 = d.a(n8, 0)) <= (n9 = s.x(charSequence))) {
            do {
                char c9 = charSequence.charAt(n8);
                int n10 = arrc.length;
                for (int i8 = 0; i8 < n10; ++i8) {
                    if (!a.d(arrc[i8], c9, bl)) continue;
                    return n8;
                }
                if (n8 == n9) break;
                ++n8;
            } while (true);
        }
        return -1;
    }

    public static boolean F(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        for (int i8 = 0; i8 < charSequence.length(); ++i8) {
            if (CharsKt__CharJVMKt.b(charSequence.charAt(i8))) continue;
            return false;
        }
        return true;
    }

    public static final int G(CharSequence charSequence, char c8, int n8, boolean bl) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        if (!bl && charSequence instanceof String) {
            return ((String)charSequence).lastIndexOf((int)c8, n8);
        }
        return s.K(charSequence, new char[]{c8}, n8, bl);
    }

    public static final int H(CharSequence charSequence, String string2, int n8, boolean bl) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string2, "string");
        if (!bl && charSequence instanceof String) {
            return ((String)charSequence).lastIndexOf(string2, n8);
        }
        return s.A(charSequence, string2, n8, 0, bl, true);
    }

    public static /* synthetic */ int I(CharSequence charSequence, char c8, int n8, boolean bl, int n9, Object object) {
        if ((n9 & 2) != 0) {
            n8 = s.x(charSequence);
        }
        if ((n9 & 4) != 0) {
            bl = false;
        }
        return s.G(charSequence, c8, n8, bl);
    }

    public static /* synthetic */ int J(CharSequence charSequence, String string2, int n8, boolean bl, int n9, Object object) {
        if ((n9 & 2) != 0) {
            n8 = s.x(charSequence);
        }
        if ((n9 & 4) != 0) {
            bl = false;
        }
        return s.H(charSequence, string2, n8, bl);
    }

    public static final int K(CharSequence charSequence, char[] arrc, int n8, boolean bl) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        Intrinsics.checkNotNullParameter(arrc, "chars");
        if (!bl && arrc.length == 1 && charSequence instanceof String) {
            char c8 = g.q(arrc);
            return ((String)charSequence).lastIndexOf((int)c8, n8);
        }
        for (n8 = d.b((int)n8, (int)s.x((CharSequence)charSequence)); -1 < n8; --n8) {
            char c9 = charSequence.charAt(n8);
            int n9 = arrc.length;
            for (int i8 = 0; i8 < n9; ++i8) {
                if (!a.d(arrc[i8], c9, bl)) continue;
                return n8;
            }
        }
        return -1;
    }

    public static final b L(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        return s.X(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List M(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        return n6.c.e(s.L(charSequence));
    }

    public static final CharSequence N(CharSequence charSequence, int n8, char c8) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        if (n8 >= 0) {
            if (n8 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder stringBuilder = new StringBuilder(n8);
            int n9 = n8 - charSequence.length();
            n8 = 1;
            if (1 <= n9) {
                do {
                    stringBuilder.append(c8);
                    if (n8 == n9) break;
                    ++n8;
                } while (true);
            }
            stringBuilder.append(charSequence);
            return stringBuilder;
        }
        charSequence = new StringBuilder();
        charSequence.append("Desired length ");
        charSequence.append(n8);
        charSequence.append(" is less than zero.");
        throw new IllegalArgumentException(charSequence.toString());
    }

    public static String O(String string2, int n8, char c8) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        return s.N(string2, n8, c8).toString();
    }

    public static final b P(CharSequence charSequence, String[] arrstring, int n8, boolean bl, int n9) {
        s.S(n9);
        return new c(charSequence, n8, n9, new p(g.b(arrstring), bl){
            public final /* synthetic */ List o;
            public final /* synthetic */ boolean p;
            {
                this.o = list;
                this.p = bl;
                super(2);
            }

            public final m a(CharSequence object, int n8) {
                Intrinsics.checkNotNullParameter(object, "$this$$receiver");
                object = s.w((CharSequence)object, (Collection)this.o, n8, this.p, false);
                if (object != null) {
                    return q.a(object.c(), ((String)object.d()).length());
                }
                return null;
            }
        });
    }

    public static /* synthetic */ b Q(CharSequence charSequence, String[] arrstring, int n8, boolean bl, int n9, int n10, Object object) {
        if ((n10 & 2) != 0) {
            n8 = 0;
        }
        if ((n10 & 4) != 0) {
            bl = false;
        }
        if ((n10 & 8) != 0) {
            n9 = 0;
        }
        return s.P(charSequence, arrstring, n8, bl, n9);
    }

    public static final boolean R(CharSequence charSequence, int n8, CharSequence charSequence2, int n9, int n10, boolean bl) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        Intrinsics.checkNotNullParameter((Object)charSequence2, "other");
        if (n9 >= 0 && n8 >= 0 && n8 <= charSequence.length() - n10) {
            if (n9 > charSequence2.length() - n10) {
                return false;
            }
            for (int i8 = 0; i8 < n10; ++i8) {
                if (a.d(charSequence.charAt(n8 + i8), charSequence2.charAt(n9 + i8), bl)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void S(int n8) {
        if (n8 >= 0) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Limit must be non-negative, but was ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public static final List T(CharSequence charSequence, String[] arrayList, boolean bl, int n8) {
        String string2;
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        Intrinsics.checkNotNullParameter((Object)arrayList, "delimiters");
        if (arrayList.length == 1 && (string2 = arrayList[0]).length() != 0) {
            return s.U(charSequence, string2, bl, n8);
        }
        string2 = n6.c.c(s.Q(charSequence, (String[])arrayList, 0, bl, n8, 2, null));
        arrayList = new ArrayList(W5.m.l((Iterable)string2, 10));
        string2 = string2.iterator();
        while (string2.hasNext()) {
            arrayList.add((Object)s.Y(charSequence, (l6.c)string2.next()));
        }
        return arrayList;
    }

    public static final List U(CharSequence charSequence, String string2, boolean bl, int n8) {
        s.S(n8);
        int n9 = 0;
        int n10 = s.z(charSequence, string2, 0, bl);
        if (n10 != -1 && n8 != 1) {
            int n11;
            boolean bl2 = n8 > 0;
            int n12 = 10;
            if (bl2) {
                n12 = d.b(n8, 10);
            }
            ArrayList arrayList = new ArrayList(n12);
            n12 = n10;
            do {
                arrayList.add((Object)charSequence.subSequence(n9, n12).toString());
                n10 = string2.length() + n12;
                if (bl2 && arrayList.size() == n8 - 1) break;
                n11 = s.z(charSequence, string2, n10, bl);
                n9 = n10;
                n12 = n11;
            } while (n11 != -1);
            arrayList.add((Object)charSequence.subSequence(n10, charSequence.length()).toString());
            return arrayList;
        }
        return W5.m.b(charSequence.toString());
    }

    public static /* synthetic */ List V(CharSequence charSequence, String[] arrstring, boolean bl, int n8, int n9, Object object) {
        if ((n9 & 2) != 0) {
            bl = false;
        }
        if ((n9 & 4) != 0) {
            n8 = 0;
        }
        return s.T(charSequence, arrstring, bl, n8);
    }

    public static final b W(final CharSequence charSequence, String[] arrstring, boolean bl, int n8) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        Intrinsics.checkNotNullParameter(arrstring, "delimiters");
        return n6.c.d(s.Q(charSequence, arrstring, 0, bl, n8, 2, null), new l(){

            public final String a(l6.c c8) {
                Intrinsics.checkNotNullParameter(c8, "it");
                return s.Y(charSequence, c8);
            }
        });
    }

    public static /* synthetic */ b X(CharSequence charSequence, String[] arrstring, boolean bl, int n8, int n9, Object object) {
        if ((n9 & 2) != 0) {
            bl = false;
        }
        if ((n9 & 4) != 0) {
            n8 = 0;
        }
        return s.W(charSequence, arrstring, bl, n8);
    }

    public static final String Y(CharSequence charSequence, l6.c c8) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        Intrinsics.checkNotNullParameter(c8, "range");
        return charSequence.subSequence(c8.q().intValue(), c8.k() + 1).toString();
    }

    public static final String Z(String string2, char c8, String string3) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Intrinsics.checkNotNullParameter(string3, "missingDelimiterValue");
        int n8 = i.C(string2, c8, 0, false, 6, null);
        if (n8 == -1) {
            return string3;
        }
        string2 = string2.substring(n8 + 1, string2.length());
        Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
        return string2;
    }

    public static final String a0(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Intrinsics.checkNotNullParameter(string3, "delimiter");
        Intrinsics.checkNotNullParameter(string4, "missingDelimiterValue");
        int n8 = i.D(string2, string3, 0, false, 6, null);
        if (n8 == -1) {
            return string4;
        }
        string2 = string2.substring(n8 + string3.length(), string2.length());
        Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
        return string2;
    }

    public static /* synthetic */ String b0(String string2, char c8, String string3, int n8, Object object) {
        if ((n8 & 2) != 0) {
            string3 = string2;
        }
        return s.Z(string2, c8, string3);
    }

    public static /* synthetic */ String c0(String string2, String string3, String string4, int n8, Object object) {
        if ((n8 & 2) != 0) {
            string4 = string2;
        }
        return s.a0(string2, string3, string4);
    }

    public static String d0(String string2, char c8, String string3) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Intrinsics.checkNotNullParameter(string3, "missingDelimiterValue");
        int n8 = s.I(string2, c8, 0, false, 6, null);
        if (n8 == -1) {
            return string3;
        }
        string2 = string2.substring(n8 + 1, string2.length());
        Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
        return string2;
    }

    public static /* synthetic */ String e0(String string2, char c8, String string3, int n8, Object object) {
        if ((n8 & 2) != 0) {
            string3 = string2;
        }
        return i.d0(string2, c8, string3);
    }

    public static CharSequence f0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        int n8 = charSequence.length() - 1;
        int n9 = 0;
        boolean bl = false;
        while (n9 <= n8) {
            int n10 = !bl ? n9 : n8;
            boolean bl2 = CharsKt__CharJVMKt.b(charSequence.charAt(n10));
            if (!bl) {
                if (!bl2) {
                    bl = true;
                    continue;
                }
                ++n9;
                continue;
            }
            if (!bl2) break;
            --n8;
        }
        return charSequence.subSequence(n9, n8 + 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final boolean u(CharSequence charSequence, CharSequence charSequence2, boolean bl) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        Intrinsics.checkNotNullParameter((Object)charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (i.D(charSequence, (String)charSequence2, 0, bl, 2, null) < 0) return false;
            return true;
        }
        if (s.B(charSequence, charSequence2, 0, charSequence.length(), bl, false, 16, null) < 0) return false;
        return true;
    }

    public static /* synthetic */ boolean v(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n8, Object object) {
        if ((n8 & 2) != 0) {
            bl = false;
        }
        return s.u(charSequence, charSequence2, bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final m w(CharSequence object, Collection object2, int n8, boolean bl, boolean bl2) {
        int n9;
        Object object32;
        int n10;
        block20 : {
            int n11;
            block19 : {
                block16 : {
                    int n12;
                    int n13;
                    block18 : {
                        int n14;
                        block17 : {
                            if (!bl && object2.size() == 1) {
                                object2 = (String)W5.m.B((Iterable)object2);
                                n8 = !bl2 ? i.D((CharSequence)object, (String)object2, n8, false, 4, null) : i.J((CharSequence)object, (String)object2, n8, false, 4, null);
                                if (n8 >= 0) return q.a(n8, object2);
                                return null;
                            }
                            object32 = !bl2 ? new l6.c(d.a(n8, 0), object.length()) : d.f(d.b(n8, s.x((CharSequence)object)), 0);
                            if (!(object instanceof String)) break block16;
                            n14 = object32.a();
                            n12 = object32.d();
                            n13 = object32.f();
                            if (n13 <= 0) break block17;
                            n8 = n14;
                            if (n14 <= n12) break block18;
                        }
                        if (n13 >= 0 || n12 > n14) return null;
                        n8 = n14;
                    }
                    do {
                        block14 : {
                            for (Object object32 : (Iterable)object2) {
                                String string2 = (String)object32;
                                if (!r.m(string2, 0, (String)object, n8, string2.length(), bl)) continue;
                                break block14;
                            }
                            object32 = null;
                        }
                        object32 = (String)object32;
                        if (object32 != null) {
                            object = object32;
                            do {
                                return q.a(n8, object);
                                break;
                            } while (true);
                        }
                        if (n8 == n12) return null;
                        n8 += n13;
                    } while (true);
                }
                n11 = object32.a();
                n9 = object32.d();
                n10 = object32.f();
                if (n10 <= 0) break block19;
                n8 = n11;
                if (n11 <= n9) break block20;
            }
            if (n10 >= 0 || n9 > n11) return null;
            n8 = n11;
        }
        do {
            block15 : {
                for (Object object32 : (Iterable)object2) {
                    String string3 = (String)object32;
                    if (!s.R(string3, 0, (CharSequence)object, n8, string3.length(), bl)) continue;
                    break block15;
                }
                object32 = null;
            }
            object32 = (String)object32;
            if (object32 != null) {
                object = object32;
                return q.a(n8, object);
            }
            if (n8 == n9) return null;
            n8 += n10;
        } while (true);
    }

    public static final int x(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int y(CharSequence charSequence, char c8, int n8, boolean bl) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        if (!bl && charSequence instanceof String) {
            return ((String)charSequence).indexOf((int)c8, n8);
        }
        return s.E(charSequence, new char[]{c8}, n8, bl);
    }

    public static final int z(CharSequence charSequence, String string2, int n8, boolean bl) {
        Intrinsics.checkNotNullParameter((Object)charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string2, "string");
        if (!bl && charSequence instanceof String) {
            return ((String)charSequence).indexOf(string2, n8);
        }
        return s.B(charSequence, string2, n8, charSequence.length(), bl, false, 16, null);
    }

}


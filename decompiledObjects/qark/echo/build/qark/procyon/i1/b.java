// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i1;

import X2.B;
import java.util.Set;
import X2.a0;
import android.text.TextUtils;
import W2.c;
import X2.y;
import java.util.regex.Pattern;

public final class b
{
    public static final Pattern d;
    public static final y e;
    public static final y f;
    public static final y g;
    public static final y h;
    public final int a;
    public final int b;
    public final int c;
    
    static {
        d = Pattern.compile("\\s+");
        e = y.Z("auto", "none");
        f = y.a0("dot", "sesame", "circle");
        g = y.Z("filled", "open");
        h = y.a0("after", "before", "outside");
    }
    
    public b(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static b a(String e) {
        if (e == null) {
            return null;
        }
        e = c.e(e.trim());
        if (e.isEmpty()) {
            return null;
        }
        return b(y.U(TextUtils.split(e, b.d)));
    }
    
    public static b b(final y y) {
        final String s = (String)B.c(a0.e(b.h, y), "outside");
        final int hashCode = s.hashCode();
        int n = 2;
        final boolean b = false;
        final int n2 = -1;
        int n3 = 0;
        Label_0099: {
            if (hashCode != -1392885889) {
                if (hashCode != -1106037339) {
                    if (hashCode == 92734940) {
                        if (s.equals("after")) {
                            n3 = 0;
                            break Label_0099;
                        }
                    }
                }
                else if (s.equals("outside")) {
                    n3 = 1;
                    break Label_0099;
                }
            }
            else if (s.equals("before")) {
                n3 = 2;
                break Label_0099;
            }
            n3 = -1;
        }
        int n4;
        if (n3 != 0) {
            if (n3 != 1) {
                n4 = 1;
            }
            else {
                n4 = -2;
            }
        }
        else {
            n4 = 2;
        }
        final a0.e e = a0.e(i1.b.e, y);
        if (!e.isEmpty()) {
            final String s2 = e.iterator().next();
            final int hashCode2 = s2.hashCode();
            int n5;
            if (hashCode2 != 3005871) {
                if (hashCode2 != 3387192) {
                    n5 = n2;
                }
                else {
                    n5 = n2;
                    if (s2.equals("none")) {
                        n5 = 0;
                    }
                }
            }
            else {
                s2.equals("auto");
                n5 = n2;
            }
            return new b(n5, 0, n4);
        }
        final a0.e e2 = a0.e(i1.b.g, y);
        final a0.e e3 = a0.e(i1.b.f, y);
        if (e2.isEmpty() && e3.isEmpty()) {
            return new b(-1, 0, n4);
        }
        final String s3 = (String)B.c(e2, "filled");
        final int hashCode3 = s3.hashCode();
        int n6 = 0;
        Label_0324: {
            if (hashCode3 != -1274499742) {
                if (hashCode3 == 3417674) {
                    if (s3.equals("open")) {
                        n6 = 2;
                        break Label_0324;
                    }
                }
            }
            else {
                s3.equals("filled");
            }
            n6 = 1;
        }
        final String s4 = (String)B.c(e3, "circle");
        final int hashCode4 = s4.hashCode();
        int n7 = 0;
        Label_0405: {
            if (hashCode4 != -1360216880) {
                if (hashCode4 != -905816648) {
                    if (hashCode4 == 99657) {
                        if (s4.equals("dot")) {
                            n7 = (b ? 1 : 0);
                            break Label_0405;
                        }
                    }
                }
                else if (s4.equals("sesame")) {
                    n7 = 1;
                    break Label_0405;
                }
            }
            else if (s4.equals("circle")) {
                n7 = 2;
                break Label_0405;
            }
            n7 = -1;
        }
        if (n7 != 0) {
            if (n7 != 1) {
                n = 1;
            }
            else {
                n = 3;
            }
        }
        return new b(n, n6, n4);
    }
}

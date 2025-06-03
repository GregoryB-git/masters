// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g1;

import W2.c;
import android.text.TextUtils;

public final class a
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    
    public a(final int a, final int b, final int c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static a a(final String s) {
        g0.a.a(s.startsWith("Format:"));
        final String[] split = TextUtils.split(s.substring(7), ",");
        final int n2;
        int n = n2 = -1;
        int n4;
        final int n3 = n4 = n2;
        final int n5 = 0;
        int n6 = n3;
        int n7 = n2;
        for (int i = n5; i < split.length; ++i) {
            final String e = c.e(split[i].trim());
            e.hashCode();
            int n8 = 0;
            Label_0186: {
                switch (e) {
                    case "style": {
                        n8 = 3;
                        break Label_0186;
                    }
                    case "start": {
                        n8 = 2;
                        break Label_0186;
                    }
                    case "text": {
                        n8 = 1;
                        break Label_0186;
                    }
                    case "end": {
                        n8 = 0;
                        break Label_0186;
                    }
                    default:
                        break;
                }
                n8 = -1;
            }
            switch (n8) {
                case 3: {
                    n6 = i;
                    break;
                }
                case 2: {
                    n = i;
                    break;
                }
                case 1: {
                    n4 = i;
                    break;
                }
                case 0: {
                    n7 = i;
                    break;
                }
            }
        }
        if (n != -1 && n7 != -1 && n4 != -1) {
            return new a(n, n7, n6, n4, split.length);
        }
        return null;
    }
}

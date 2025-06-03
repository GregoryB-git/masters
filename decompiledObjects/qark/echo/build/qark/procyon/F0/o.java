// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import g0.z;

public final class o
{
    public final int a;
    public final int b;
    public final String c;
    
    public o(final int a, final int b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static o a(final z z) {
        z.U(2);
        final int g = z.G();
        final int i = g >> 1;
        final int j = (z.G() >> 3 & 0x1F) | (g & 0x1) << 5;
        String str;
        if (i != 4 && i != 5 && i != 7) {
            if (i == 8) {
                str = "hev1";
            }
            else {
                if (i != 9) {
                    return null;
                }
                str = "avc3";
            }
        }
        else {
            str = "dvhe";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i);
        if (j >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(j);
        return new o(i, j, sb.toString());
    }
}

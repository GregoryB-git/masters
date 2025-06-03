// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z0;

import g0.o;
import g0.a;
import F0.T;

public final class t
{
    public final boolean a;
    public final String b;
    public final T.a c;
    public final int d;
    public final byte[] e;
    
    public t(final boolean a, final String b, final int d, final byte[] array, final int n, final int n2, final byte[] e) {
        boolean b2 = true;
        final boolean b3 = d == 0;
        if (e != null) {
            b2 = false;
        }
        g0.a.a(b2 ^ b3);
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.c = new T.a(a(b), array, n, n2);
    }
    
    public static int a(final String str) {
        if (str == null) {
            return 1;
        }
        final int hashCode = str.hashCode();
        int n = -1;
        switch (hashCode) {
            case 3049895: {
                if (!str.equals("cens")) {
                    break;
                }
                n = 3;
                break;
            }
            case 3049879: {
                if (!str.equals("cenc")) {
                    break;
                }
                n = 2;
                break;
            }
            case 3046671: {
                if (!str.equals("cbcs")) {
                    break;
                }
                n = 1;
                break;
            }
            case 3046605: {
                if (!str.equals("cbc1")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported protection scheme type '");
                sb.append(str);
                sb.append("'. Assuming AES-CTR crypto mode.");
                o.h("TrackEncryptionBox", sb.toString());
                return 1;
            }
            case 2:
            case 3: {
                return 1;
            }
            case 0:
            case 1: {
                return 2;
            }
        }
    }
}

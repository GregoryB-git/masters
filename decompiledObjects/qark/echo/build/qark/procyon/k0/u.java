// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import android.text.TextUtils;
import java.io.IOException;
import g0.a;
import android.os.Bundle;
import android.os.SystemClock;
import g0.M;
import x0.x;
import d0.q;
import d0.B;

public final class u extends B
{
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public final q A;
    public final int B;
    public final x.b C;
    public final boolean D;
    public final int x;
    public final String y;
    public final int z;
    
    static {
        E = M.w0(1001);
        F = M.w0(1002);
        G = M.w0(1003);
        H = M.w0(1004);
        I = M.w0(1005);
        J = M.w0(1006);
    }
    
    public u(final int n, final Throwable t, final int n2) {
        this(n, t, null, n2, null, -1, null, 4, false);
    }
    
    public u(final int n, final Throwable t, final String s, final int n2, final String s2, final int n3, final q q, final int n4, final boolean b) {
        this(e(n, s, s2, n3, q, n4), t, n2, n, s2, n3, q, n4, null, SystemClock.elapsedRealtime(), b);
    }
    
    public u(final String s, final Throwable t, final int n, final int x, final String y, final int z, final q a, final int b, final x.b c, final long n2, final boolean d) {
        super(s, t, n, Bundle.EMPTY, n2);
        final boolean b2 = false;
        a.a(!d || x == 1);
        boolean b3 = false;
        Label_0060: {
            if (t == null) {
                b3 = b2;
                if (x != 3) {
                    break Label_0060;
                }
            }
            b3 = true;
        }
        a.a(b3);
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
    }
    
    public static u b(final Throwable t, final String s, final int n, final q q, int n2, final boolean b, final int n3) {
        if (q == null) {
            n2 = 4;
        }
        return new u(1, t, null, n3, s, n, q, n2, b);
    }
    
    public static u c(final IOException ex, final int n) {
        return new u(0, ex, n);
    }
    
    public static u d(final RuntimeException ex, final int n) {
        return new u(2, ex, n);
    }
    
    public static String e(final int n, final String str, String string, final int i, final q obj, final int n2) {
        if (n != 0) {
            if (n != 1) {
                if (n != 3) {
                    string = "Unexpected runtime error";
                }
                else {
                    string = "Remote error";
                }
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" error, index=");
                sb.append(i);
                sb.append(", format=");
                sb.append(obj);
                sb.append(", format_supported=");
                sb.append(M.Y(n2));
                string = sb.toString();
            }
        }
        else {
            string = "Source error";
        }
        String string2 = string;
        if (!TextUtils.isEmpty((CharSequence)str)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(": ");
            sb2.append(str);
            string2 = sb2.toString();
        }
        return string2;
    }
    
    public u a(final x.b b) {
        return new u((String)M.i(this.getMessage()), this.getCause(), super.o, this.x, this.y, this.z, this.A, this.B, b, super.p, this.D);
    }
    
    public Exception f() {
        final int x = this.x;
        boolean b = true;
        if (x != 1) {
            b = false;
        }
        a.f(b);
        return (Exception)a.e(this.getCause());
    }
    
    public IOException g() {
        a.f(this.x == 0);
        return (IOException)a.e(this.getCause());
    }
    
    public RuntimeException h() {
        a.f(this.x == 2);
        return (RuntimeException)a.e(this.getCause());
    }
}

/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package k0;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import d0.B;
import d0.q;
import g0.M;
import g0.a;
import java.io.IOException;
import x0.x;

public final class u
extends B {
    public static final String E = M.w0(1001);
    public static final String F = M.w0(1002);
    public static final String G = M.w0(1003);
    public static final String H = M.w0(1004);
    public static final String I = M.w0(1005);
    public static final String J = M.w0(1006);
    public final q A;
    public final int B;
    public final x.b C;
    public final boolean D;
    public final int x;
    public final String y;
    public final int z;

    public u(int n8, Throwable throwable, int n9) {
        this(n8, throwable, null, n9, null, -1, null, 4, false);
    }

    public u(int n8, Throwable throwable, String string2, int n9, String string3, int n10, q q8, int n11, boolean bl) {
        this(u.e(n8, string2, string3, n10, q8, n11), throwable, n9, n8, string3, n10, q8, n11, null, SystemClock.elapsedRealtime(), bl);
    }

    public u(String string2, Throwable throwable, int n8, int n9, String string3, int n10, q q8, int n11, x.b b8, long l8, boolean bl) {
        boolean bl2;
        block4 : {
            block3 : {
                super(string2, throwable, n8, Bundle.EMPTY, l8);
                boolean bl3 = false;
                bl2 = !bl || n9 == 1;
                a.a(bl2);
                if (throwable != null) break block3;
                bl2 = bl3;
                if (n9 != 3) break block4;
            }
            bl2 = true;
        }
        a.a(bl2);
        this.x = n9;
        this.y = string3;
        this.z = n10;
        this.A = q8;
        this.B = n11;
        this.C = b8;
        this.D = bl;
    }

    public static u b(Throwable throwable, String string2, int n8, q q8, int n9, boolean bl, int n10) {
        if (q8 == null) {
            n9 = 4;
        }
        return new u(1, throwable, null, n10, string2, n8, q8, n9, bl);
    }

    public static u c(IOException iOException, int n8) {
        return new u(0, (Throwable)iOException, n8);
    }

    public static u d(RuntimeException runtimeException, int n8) {
        return new u(2, (Throwable)runtimeException, n8);
    }

    public static String e(int n8, String string2, String string3, int n9, q object, int n10) {
        if (n8 != 0) {
            if (n8 != 1) {
                string3 = n8 != 3 ? "Unexpected runtime error" : "Remote error";
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append(" error, index=");
                stringBuilder.append(n9);
                stringBuilder.append(", format=");
                stringBuilder.append(object);
                stringBuilder.append(", format_supported=");
                stringBuilder.append(M.Y(n10));
                string3 = stringBuilder.toString();
            }
        } else {
            string3 = "Source error";
        }
        object = string3;
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            object = new StringBuilder();
            object.append(string3);
            object.append(": ");
            object.append(string2);
            object = object.toString();
        }
        return object;
    }

    public u a(x.b b8) {
        return new u((String)M.i(this.getMessage()), this.getCause(), this.o, this.x, this.y, this.z, this.A, this.B, b8, this.p, this.D);
    }

    public Exception f() {
        int n8 = this.x;
        boolean bl = true;
        if (n8 != 1) {
            bl = false;
        }
        a.f(bl);
        return (Exception)a.e((Object)this.getCause());
    }

    public IOException g() {
        boolean bl = this.x == 0;
        a.f(bl);
        return (IOException)a.e((Object)this.getCause());
    }

    public RuntimeException h() {
        boolean bl = this.x == 2;
        a.f(bl);
        return (RuntimeException)a.e((Object)this.getCause());
    }
}


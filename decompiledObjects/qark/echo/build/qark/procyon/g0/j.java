// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLU;
import android.opengl.GLES20;

public abstract class j
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    
    static {
        a = new int[] { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344 };
        b = new int[] { 12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344 };
        c = new int[] { 12445, 13120, 12344, 12344 };
        d = new int[] { 12445, 13632, 12344, 12344 };
        e = new int[] { 12344 };
    }
    
    public static void a() {
        final StringBuilder sb = new StringBuilder();
        int n = 0;
        while (true) {
            final int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (n != 0) {
                sb.append('\n');
            }
            String str;
            if ((str = GLU.gluErrorString(glGetError)) == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("error code: 0x");
                sb2.append(Integer.toHexString(glGetError));
                str = sb2.toString();
            }
            sb.append("glError: ");
            sb.append(str);
            n = 1;
        }
        if (n == 0) {
            return;
        }
        throw new a(sb.toString());
    }
    
    public static void b(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new a(s);
    }
    
    public static boolean c(final String s) {
        final boolean b = false;
        final String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        boolean b2 = b;
        if (eglQueryString != null) {
            b2 = b;
            if (eglQueryString.contains(s)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public static boolean d(final Context context) {
        final int a = M.a;
        return a >= 24 && (a >= 26 || (!"samsung".equals(M.c) && !"XT1650".equals(M.d))) && (a >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && c("EGL_EXT_protected_content");
    }
    
    public static boolean e() {
        return c("EGL_KHR_surfaceless_context");
    }
    
    public static final class a extends Exception
    {
        public a(final String message) {
            super(message);
        }
    }
}

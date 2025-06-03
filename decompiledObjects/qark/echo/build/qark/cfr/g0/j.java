/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.opengl.EGL14
 *  android.opengl.EGLDisplay
 *  android.opengl.GLES20
 *  android.opengl.GLU
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package g0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import g0.M;

public abstract class j {
    public static final int[] a = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] b = new int[]{12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    public static final int[] c = new int[]{12445, 13120, 12344, 12344};
    public static final int[] d = new int[]{12445, 13632, 12344, 12344};
    public static final int[] e = new int[]{12344};

    public static void a() {
        int n8;
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = false;
        while ((n8 = GLES20.glGetError()) != 0) {
            String string2;
            if (bl) {
                stringBuilder.append('\n');
            }
            String string3 = string2 = GLU.gluErrorString((int)n8);
            if (string2 == null) {
                string3 = new StringBuilder();
                string3.append("error code: 0x");
                string3.append(Integer.toHexString((int)n8));
                string3 = string3.toString();
            }
            stringBuilder.append("glError: ");
            stringBuilder.append(string3);
            bl = true;
        }
        if (!bl) {
            return;
        }
        throw new a(stringBuilder.toString());
    }

    public static void b(boolean bl, String string2) {
        if (bl) {
            return;
        }
        throw new a(string2);
    }

    public static boolean c(String string2) {
        boolean bl = false;
        String string3 = EGL14.eglQueryString((EGLDisplay)EGL14.eglGetDisplay((int)0), (int)12373);
        boolean bl2 = bl;
        if (string3 != null) {
            bl2 = bl;
            if (string3.contains((CharSequence)string2)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public static boolean d(Context context) {
        int n8 = M.a;
        if (n8 < 24) {
            return false;
        }
        if (n8 < 26 && ("samsung".equals((Object)M.c) || "XT1650".equals((Object)M.d))) {
            return false;
        }
        if (n8 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return false;
        }
        return j.c("EGL_EXT_protected_content");
    }

    public static boolean e() {
        return j.c("EGL_KHR_surfaceless_context");
    }

    public static final class a
    extends Exception {
        public a(String string2) {
            super(string2);
        }
    }

}


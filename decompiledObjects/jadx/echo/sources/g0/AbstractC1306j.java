package g0;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;

/* renamed from: g0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1306j {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f14298a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f14299b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f14300c = {12445, 13120, 12344, 12344};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f14301d = {12445, 13632, 12344, 12344};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f14302e = {12344};

    /* renamed from: g0.j$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static void a() {
        StringBuilder sb = new StringBuilder();
        boolean z7 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z7) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z7 = true;
        }
        if (z7) {
            throw new a(sb.toString());
        }
    }

    public static void b(boolean z7, String str) {
        if (!z7) {
            throw new a(str);
        }
    }

    public static boolean c(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static boolean d(Context context) {
        int i7 = M.f14261a;
        if (i7 < 24) {
            return false;
        }
        if (i7 < 26 && ("samsung".equals(M.f14263c) || "XT1650".equals(M.f14264d))) {
            return false;
        }
        if (i7 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return c("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean e() {
        return c("EGL_KHR_surfaceless_context");
    }
}

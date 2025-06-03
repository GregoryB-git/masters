package v5;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public final class j {

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static void a() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(glGetError));
            z10 = true;
        }
        if (z10) {
            throw new a(sb2.toString());
        }
    }

    public static void b(String str, boolean z10) {
        if (!z10) {
            throw new a(str);
        }
    }

    public static FloatBuffer c(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static int d() {
        b("No current context", !e0.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        a();
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        a();
        GLES20.glTexParameteri(36197, 10240, 9729);
        a();
        GLES20.glTexParameteri(36197, 10241, 9729);
        a();
        GLES20.glTexParameteri(36197, 10242, 33071);
        a();
        GLES20.glTexParameteri(36197, 10243, 33071);
        a();
        return i10;
    }
}

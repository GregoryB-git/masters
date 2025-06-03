package v5;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class j
{
  public static void a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0;; i = 1)
    {
      int j = GLES20.glGetError();
      if (j == 0) {
        break;
      }
      if (i != 0) {
        localStringBuilder.append('\n');
      }
      localStringBuilder.append("glError: ");
      localStringBuilder.append(GLU.gluErrorString(j));
    }
    if (i == 0) {
      return;
    }
    throw new a(localStringBuilder.toString());
  }
  
  public static void b(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new a(paramString);
  }
  
  public static FloatBuffer c(float[] paramArrayOfFloat)
  {
    return (FloatBuffer)ByteBuffer.allocateDirect(paramArrayOfFloat.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(paramArrayOfFloat).flip();
  }
  
  public static int d()
  {
    b("No current context", e0.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT) ^ true);
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    a();
    int i = arrayOfInt[0];
    GLES20.glBindTexture(36197, i);
    a();
    GLES20.glTexParameteri(36197, 10240, 9729);
    a();
    GLES20.glTexParameteri(36197, 10241, 9729);
    a();
    GLES20.glTexParameteri(36197, 10242, 33071);
    a();
    GLES20.glTexParameteri(36197, 10243, 33071);
    a();
    return i;
  }
  
  public static final class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     v5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
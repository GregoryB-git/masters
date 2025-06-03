package g0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;

public abstract class j
{
  public static final int[] a = { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344 };
  public static final int[] b = { 12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344 };
  public static final int[] c = { 12445, 13120, 12344, 12344 };
  public static final int[] d = { 12445, 13632, 12344, 12344 };
  public static final int[] e = { 12344 };
  
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
      String str = GLU.gluErrorString(j);
      Object localObject = str;
      if (str == null)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("error code: 0x");
        ((StringBuilder)localObject).append(Integer.toHexString(j));
        localObject = ((StringBuilder)localObject).toString();
      }
      localStringBuilder.append("glError: ");
      localStringBuilder.append((String)localObject);
    }
    if (i == 0) {
      return;
    }
    throw new a(localStringBuilder.toString());
  }
  
  public static void b(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {
      return;
    }
    throw new a(paramString);
  }
  
  public static boolean c(String paramString)
  {
    boolean bool1 = false;
    String str = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
    boolean bool2 = bool1;
    if (str != null)
    {
      bool2 = bool1;
      if (str.contains(paramString)) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public static boolean d(Context paramContext)
  {
    int i = M.a;
    if (i < 24) {
      return false;
    }
    if ((i < 26) && (("samsung".equals(M.c)) || ("XT1650".equals(M.d)))) {
      return false;
    }
    if ((i < 26) && (!paramContext.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
      return false;
    }
    return c("EGL_EXT_protected_content");
  }
  
  public static boolean e()
  {
    return c("EGL_KHR_surfaceless_context");
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
 * Qualified Name:     g0.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
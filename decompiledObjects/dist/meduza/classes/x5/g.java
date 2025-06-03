package x5;

import android.opengl.GLES20;
import android.util.Log;
import java.nio.FloatBuffer;
import v5.i;
import v5.j;
import v5.j.a;

public final class g
{
  public static final float[] i = { 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F };
  public static final float[] j = { 1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 1.0F };
  public static final float[] k = { 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F };
  public int a;
  public a b;
  public i c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  
  public static boolean b(e parame)
  {
    Object localObject = a;
    parame = b;
    localObject = a;
    int m = localObject.length;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (m == 1)
    {
      bool2 = bool1;
      if (0a == 0)
      {
        parame = a;
        bool2 = bool1;
        if (parame.length == 1)
        {
          bool2 = bool1;
          if (0a == 0) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  public final void a()
  {
    try
    {
      i locali = new v5/i;
      locali.<init>();
      c = locali;
      d = GLES20.glGetUniformLocation(a, "uMvpMatrix");
      e = GLES20.glGetUniformLocation(c.a, "uTexMatrix");
      int m = GLES20.glGetAttribLocation(c.a, "aPosition");
      GLES20.glEnableVertexAttribArray(m);
      j.a();
      f = m;
      m = GLES20.glGetAttribLocation(c.a, "aTexCoords");
      GLES20.glEnableVertexAttribArray(m);
      j.a();
      g = m;
      h = GLES20.glGetUniformLocation(c.a, "uTexture");
    }
    catch (j.a locala)
    {
      Log.e("ProjectionRenderer", "Failed to initialize the program", locala);
    }
  }
  
  public static final class a
  {
    public final int a;
    public final FloatBuffer b;
    public final FloatBuffer c;
    public final int d;
    
    public a(e.b paramb)
    {
      float[] arrayOfFloat = c;
      a = (arrayOfFloat.length / 3);
      b = j.c(arrayOfFloat);
      c = j.c(d);
      int i = b;
      if (i != 1) {
        if (i != 2) {
          i = 4;
        }
      }
      for (;;)
      {
        d = i;
        break;
        i = 6;
        continue;
        i = 5;
      }
    }
  }
}

/* Location:
 * Qualified Name:     x5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
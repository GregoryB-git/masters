package x5;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.Matrix;
import android.os.Handler;
import android.util.Log;
import g.q;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import v5.b0;
import v5.m;

public final class j$a
  implements GLSurfaceView.Renderer, k.a, d.a
{
  public final i a;
  public final float[] b = new float[16];
  public final float[] c = new float[16];
  public final float[] d;
  public final float[] e;
  public final float[] f;
  public float o;
  public float p;
  public final float[] q;
  public final float[] r;
  
  public j$a(j paramj, i parami)
  {
    paramj = new float[16];
    d = paramj;
    float[] arrayOfFloat1 = new float[16];
    e = arrayOfFloat1;
    float[] arrayOfFloat2 = new float[16];
    f = arrayOfFloat2;
    q = new float[16];
    r = new float[16];
    a = parami;
    Matrix.setIdentityM(paramj, 0);
    Matrix.setIdentityM(arrayOfFloat1, 0);
    Matrix.setIdentityM(arrayOfFloat2, 0);
    p = 3.1415927F;
  }
  
  public final void a(float[] paramArrayOfFloat, float paramFloat)
  {
    try
    {
      float[] arrayOfFloat = d;
      System.arraycopy(paramArrayOfFloat, 0, arrayOfFloat, 0, arrayOfFloat.length);
      paramFloat = -paramFloat;
      p = paramFloat;
      Matrix.setRotateM(e, 0, -o, (float)Math.cos(paramFloat), (float)Math.sin(p), 0.0F);
      return;
    }
    finally {}
  }
  
  public final void onDrawFrame(GL10 paramGL10)
  {
    try
    {
      Matrix.multiplyMM(r, 0, d, 0, f, 0);
      Matrix.multiplyMM(q, 0, e, 0, r, 0);
      Matrix.multiplyMM(c, 0, b, 0, q, 0);
      paramGL10 = a;
      Object localObject1 = c;
      paramGL10.getClass();
      GLES20.glClear(16384);
      try
      {
        v5.j.a();
      }
      catch (v5.j.a locala1)
      {
        m.d("SceneRenderer", "Failed to draw a frame", locala1);
      }
      int i;
      if (a.compareAndSet(true, false))
      {
        SurfaceTexture localSurfaceTexture = r;
        localSurfaceTexture.getClass();
        localSurfaceTexture.updateTexImage();
        try
        {
          v5.j.a();
        }
        catch (v5.j.a locala2)
        {
          m.d("SceneRenderer", "Failed to draw a frame", locala2);
        }
        if (b.compareAndSet(true, false)) {
          Matrix.setIdentityM(o, 0);
        }
        long l1 = r.getTimestamp();
        synchronized (e)
        {
          localObject3 = ((b0)???).d(l1, false);
          ??? = (Long)localObject3;
          if (??? != null)
          {
            ??? = d;
            localObject3 = o;
            long l2 = ((Long)???).longValue();
            synchronized (c)
            {
              Object localObject5 = ((b0)???).d(l2, true);
              ??? = (float[])localObject5;
              if (??? != null)
              {
                localObject5 = b;
                float f1 = ???[0];
                float f2 = -???[1];
                float f3 = -???[2];
                float f4 = Matrix.length(f1, f2, f3);
                if (f4 != 0.0F) {
                  Matrix.setRotateM((float[])localObject5, 0, (float)Math.toDegrees(f4), f1 / f4, f2 / f4, f3 / f4);
                } else {
                  Matrix.setIdentityM((float[])localObject5, 0);
                }
                if (!d)
                {
                  c.a(a, b);
                  d = true;
                }
                Matrix.multiplyMM((float[])localObject3, 0, a, 0, b, 0);
              }
            }
          }
        }
      }
      Matrix.multiplyMM(p, 0, (float[])localObject1, 0, o, 0);
      localObject1 = c;
      int j = q;
      Object localObject3 = p;
      ??? = b;
      if (??? != null)
      {
        i = a;
        if (i == 1) {
          paramGL10 = g.j;
        } else if (i == 2) {
          paramGL10 = g.k;
        } else {
          paramGL10 = g.i;
        }
        GLES20.glUniformMatrix3fv(e, 1, false, paramGL10, 0);
        GLES20.glUniformMatrix4fv(d, 1, false, (float[])localObject3, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, j);
        GLES20.glUniform1i(h, 0);
        try
        {
          v5.j.a();
        }
        catch (v5.j.a paramGL10)
        {
          Log.e("ProjectionRenderer", "Failed to bind uniforms", paramGL10);
        }
        GLES20.glVertexAttribPointer(f, 3, 5126, false, 12, b);
        try
        {
          v5.j.a();
        }
        catch (v5.j.a paramGL10)
        {
          Log.e("ProjectionRenderer", "Failed to load position data", paramGL10);
        }
        GLES20.glVertexAttribPointer(g, 2, 5126, false, 8, c);
        try
        {
          v5.j.a();
        }
        catch (v5.j.a paramGL10)
        {
          Log.e("ProjectionRenderer", "Failed to load texture data", paramGL10);
        }
        GLES20.glDrawArrays(d, 0, a);
        try
        {
          v5.j.a();
        }
        catch (v5.j.a paramGL10)
        {
          Log.e("ProjectionRenderer", "Failed to render", paramGL10);
        }
      }
      return;
    }
    finally {}
  }
  
  public final void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    int i = 0;
    GLES20.glViewport(0, 0, paramInt1, paramInt2);
    float f1 = paramInt1 / paramInt2;
    paramInt1 = i;
    if (f1 > 1.0F) {
      paramInt1 = 1;
    }
    float f2;
    if (paramInt1 != 0) {
      f2 = (float)(Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0D)) / f1)) * 2.0D);
    } else {
      f2 = 90.0F;
    }
    Matrix.perspectiveM(b, 0, f2, f1, 0.1F, 100.0F);
  }
  
  public final void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    try
    {
      paramGL10 = s;
      SurfaceTexture localSurfaceTexture = a.b();
      paramEGLConfig = e;
      q localq = new g/q;
      localq.<init>(9, paramGL10, localSurfaceTexture);
      paramEGLConfig.post(localq);
      return;
    }
    finally
    {
      paramGL10 = finally;
      throw paramGL10;
    }
  }
}

/* Location:
 * Qualified Name:     x5.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
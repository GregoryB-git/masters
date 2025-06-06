package androidx.core.view.animation;

import a;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

class PathInterpolatorApi14
  implements Interpolator
{
  private static final float PRECISION = 0.002F;
  private final float[] mX;
  private final float[] mY;
  
  public PathInterpolatorApi14(float paramFloat1, float paramFloat2)
  {
    this(createQuad(paramFloat1, paramFloat2));
  }
  
  public PathInterpolatorApi14(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this(createCubic(paramFloat1, paramFloat2, paramFloat3, paramFloat4));
  }
  
  public PathInterpolatorApi14(Path paramPath)
  {
    paramPath = new PathMeasure(paramPath, false);
    float f = paramPath.getLength();
    int i = (int)(f / 0.002F) + 1;
    mX = new float[i];
    mY = new float[i];
    float[] arrayOfFloat = new float[2];
    for (int j = 0; j < i; j++)
    {
      paramPath.getPosTan(j * f / (i - 1), arrayOfFloat, null);
      mX[j] = arrayOfFloat[0];
      mY[j] = arrayOfFloat[1];
    }
  }
  
  private static Path createCubic(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Path localPath = new Path();
    localPath.moveTo(0.0F, 0.0F);
    localPath.cubicTo(paramFloat1, paramFloat2, paramFloat3, paramFloat4, 1.0F, 1.0F);
    return localPath;
  }
  
  private static Path createQuad(float paramFloat1, float paramFloat2)
  {
    Path localPath = new Path();
    localPath.moveTo(0.0F, 0.0F);
    localPath.quadTo(paramFloat1, paramFloat2, 1.0F, 1.0F);
    return localPath;
  }
  
  public float getInterpolation(float paramFloat)
  {
    if (paramFloat <= 0.0F) {
      return 0.0F;
    }
    if (paramFloat >= 1.0F) {
      return 1.0F;
    }
    int i = 0;
    int j = mX.length - 1;
    while (j - i > 1)
    {
      int k = (i + j) / 2;
      if (paramFloat < mX[k]) {
        j = k;
      } else {
        i = k;
      }
    }
    float[] arrayOfFloat = mX;
    float f1 = arrayOfFloat[j];
    float f2 = arrayOfFloat[i];
    f1 -= f2;
    if (f1 == 0.0F) {
      return mY[i];
    }
    paramFloat = (paramFloat - f2) / f1;
    arrayOfFloat = mY;
    f2 = arrayOfFloat[i];
    return a.a(arrayOfFloat[j], f2, paramFloat, f2);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.animation.PathInterpolatorApi14
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
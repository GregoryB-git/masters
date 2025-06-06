package androidx.vectordrawable.graphics.drawable;

import a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import org.xmlpull.v1.XmlPullParser;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class PathInterpolatorCompat
  implements Interpolator
{
  public static final double EPSILON = 1.0E-5D;
  public static final int MAX_NUM_POINTS = 3000;
  private static final float PRECISION = 0.002F;
  private float[] mX;
  private float[] mY;
  
  public PathInterpolatorCompat(Context paramContext, AttributeSet paramAttributeSet, XmlPullParser paramXmlPullParser)
  {
    this(paramContext.getResources(), paramContext.getTheme(), paramAttributeSet, paramXmlPullParser);
  }
  
  public PathInterpolatorCompat(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, XmlPullParser paramXmlPullParser)
  {
    paramResources = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, AndroidResources.STYLEABLE_PATH_INTERPOLATOR);
    parseInterpolatorFromTypeArray(paramResources, paramXmlPullParser);
    paramResources.recycle();
  }
  
  private void initCubic(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Path localPath = new Path();
    localPath.moveTo(0.0F, 0.0F);
    localPath.cubicTo(paramFloat1, paramFloat2, paramFloat3, paramFloat4, 1.0F, 1.0F);
    initPath(localPath);
  }
  
  private void initPath(Path paramPath)
  {
    int i = 0;
    paramPath = new PathMeasure(paramPath, false);
    float f1 = paramPath.getLength();
    int j = Math.min(3000, (int)(f1 / 0.002F) + 1);
    if (j > 0)
    {
      mX = new float[j];
      mY = new float[j];
      Object localObject = new float[2];
      for (int k = 0; k < j; k++)
      {
        paramPath.getPosTan(k * f1 / (j - 1), (float[])localObject, null);
        mX[k] = localObject[0];
        mY[k] = localObject[1];
      }
      if ((Math.abs(mX[0]) <= 1.0E-5D) && (Math.abs(mY[0]) <= 1.0E-5D))
      {
        localObject = mX;
        k = j - 1;
        if ((Math.abs(localObject[k] - 1.0F) <= 1.0E-5D) && (Math.abs(mY[k] - 1.0F) <= 1.0E-5D))
        {
          f1 = 0.0F;
          k = 0;
          while (i < j)
          {
            localObject = mX;
            float f2 = localObject[k];
            if (f2 >= f1)
            {
              localObject[i] = f2;
              i++;
              f1 = f2;
              k++;
            }
            else
            {
              paramPath = new StringBuilder();
              paramPath.append("The Path cannot loop back on itself, x :");
              paramPath.append(f2);
              throw new IllegalArgumentException(paramPath.toString());
            }
          }
          if (!paramPath.nextContour()) {
            return;
          }
          throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
        }
      }
      localObject = z2.t("The Path must start at (0,0) and end at (1,1) start: ");
      ((StringBuilder)localObject).append(mX[0]);
      ((StringBuilder)localObject).append(",");
      ((StringBuilder)localObject).append(mY[0]);
      ((StringBuilder)localObject).append(" end:");
      paramPath = mX;
      k = j - 1;
      ((StringBuilder)localObject).append(paramPath[k]);
      ((StringBuilder)localObject).append(",");
      ((StringBuilder)localObject).append(mY[k]);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    paramPath = new StringBuilder();
    paramPath.append("The Path has a invalid length ");
    paramPath.append(f1);
    throw new IllegalArgumentException(paramPath.toString());
  }
  
  private void initQuad(float paramFloat1, float paramFloat2)
  {
    Path localPath = new Path();
    localPath.moveTo(0.0F, 0.0F);
    localPath.quadTo(paramFloat1, paramFloat2, 1.0F, 1.0F);
    initPath(localPath);
  }
  
  private void parseInterpolatorFromTypeArray(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    if (TypedArrayUtils.hasAttribute(paramXmlPullParser, "pathData"))
    {
      paramTypedArray = TypedArrayUtils.getNamedString(paramTypedArray, paramXmlPullParser, "pathData", 4);
      paramXmlPullParser = PathParser.createPathFromPathData(paramTypedArray);
      if (paramXmlPullParser != null) {
        initPath(paramXmlPullParser);
      } else {
        throw new InflateException(z2.o("The path is null, which is created from ", paramTypedArray));
      }
    }
    else
    {
      if (!TypedArrayUtils.hasAttribute(paramXmlPullParser, "controlX1")) {
        break label168;
      }
      if (!TypedArrayUtils.hasAttribute(paramXmlPullParser, "controlY1")) {
        break label158;
      }
      float f1 = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "controlX1", 0, 0.0F);
      float f2 = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "controlY1", 1, 0.0F);
      boolean bool = TypedArrayUtils.hasAttribute(paramXmlPullParser, "controlX2");
      if (bool != TypedArrayUtils.hasAttribute(paramXmlPullParser, "controlY2")) {
        break label148;
      }
      if (!bool) {
        initQuad(f1, f2);
      } else {
        initCubic(f1, f2, TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "controlX2", 2, 0.0F), TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "controlY2", 3, 0.0F));
      }
    }
    return;
    label148:
    throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
    label158:
    throw new InflateException("pathInterpolator requires the controlY1 attribute");
    label168:
    throw new InflateException("pathInterpolator requires the controlX1 attribute");
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
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
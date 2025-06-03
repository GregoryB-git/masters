package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion
  extends PathMotion
{
  private Path mOriginalPatternPath;
  private final Path mPatternPath;
  private final Matrix mTempMatrix;
  
  public PatternPathMotion()
  {
    Path localPath = new Path();
    mPatternPath = localPath;
    mTempMatrix = new Matrix();
    localPath.lineTo(1.0F, 0.0F);
    mOriginalPatternPath = localPath;
  }
  
  @SuppressLint({"RestrictedApi"})
  public PatternPathMotion(Context paramContext, AttributeSet paramAttributeSet)
  {
    mPatternPath = new Path();
    mTempMatrix = new Matrix();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Styleable.PATTERN_PATH_MOTION);
    try
    {
      paramAttributeSet = TypedArrayUtils.getNamedString(paramContext, (XmlPullParser)paramAttributeSet, "patternPathData", 0);
      if (paramAttributeSet != null)
      {
        setPatternPath(PathParser.createPathFromPathData(paramAttributeSet));
        return;
      }
      paramAttributeSet = new java/lang/RuntimeException;
      paramAttributeSet.<init>("pathData must be supplied for patternPathMotion");
      throw paramAttributeSet;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public PatternPathMotion(Path paramPath)
  {
    mPatternPath = new Path();
    mTempMatrix = new Matrix();
    setPatternPath(paramPath);
  }
  
  private static float distance(float paramFloat1, float paramFloat2)
  {
    return (float)Math.sqrt(paramFloat2 * paramFloat2 + paramFloat1 * paramFloat1);
  }
  
  public Path getPath(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat3 -= paramFloat1;
    paramFloat4 -= paramFloat2;
    float f = distance(paramFloat3, paramFloat4);
    double d = Math.atan2(paramFloat4, paramFloat3);
    mTempMatrix.setScale(f, f);
    mTempMatrix.postRotate((float)Math.toDegrees(d));
    mTempMatrix.postTranslate(paramFloat1, paramFloat2);
    Path localPath = new Path();
    mPatternPath.transform(mTempMatrix, localPath);
    return localPath;
  }
  
  public Path getPatternPath()
  {
    return mOriginalPatternPath;
  }
  
  public void setPatternPath(Path paramPath)
  {
    PathMeasure localPathMeasure = new PathMeasure(paramPath, false);
    float f1 = localPathMeasure.getLength();
    float[] arrayOfFloat = new float[2];
    localPathMeasure.getPosTan(f1, arrayOfFloat, null);
    float f2 = arrayOfFloat[0];
    float f3 = arrayOfFloat[1];
    localPathMeasure.getPosTan(0.0F, arrayOfFloat, null);
    float f4 = arrayOfFloat[0];
    f1 = arrayOfFloat[1];
    if ((f4 == f2) && (f1 == f3)) {
      throw new IllegalArgumentException("pattern must not end at the starting point");
    }
    mTempMatrix.setTranslate(-f4, -f1);
    f4 = f2 - f4;
    f1 = f3 - f1;
    f3 = 1.0F / distance(f4, f1);
    mTempMatrix.postScale(f3, f3);
    double d = Math.atan2(f1, f4);
    mTempMatrix.postRotate((float)Math.toDegrees(-d));
    paramPath.transform(mTempMatrix, mPatternPath);
    mOriginalPatternPath = paramPath;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.PatternPathMotion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
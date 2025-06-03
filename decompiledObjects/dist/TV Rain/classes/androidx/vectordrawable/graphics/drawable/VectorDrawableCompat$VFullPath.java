package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import org.xmlpull.v1.XmlPullParser;

class VectorDrawableCompat$VFullPath
  extends VectorDrawableCompat.VPath
{
  public float mFillAlpha = 1.0F;
  public ComplexColorCompat mFillColor;
  public float mStrokeAlpha = 1.0F;
  public ComplexColorCompat mStrokeColor;
  public Paint.Cap mStrokeLineCap = Paint.Cap.BUTT;
  public Paint.Join mStrokeLineJoin = Paint.Join.MITER;
  public float mStrokeMiterlimit = 4.0F;
  public float mStrokeWidth = 0.0F;
  private int[] mThemeAttrs;
  public float mTrimPathEnd = 1.0F;
  public float mTrimPathOffset = 0.0F;
  public float mTrimPathStart = 0.0F;
  
  public VectorDrawableCompat$VFullPath() {}
  
  public VectorDrawableCompat$VFullPath(VFullPath paramVFullPath)
  {
    super(paramVFullPath);
    mThemeAttrs = mThemeAttrs;
    mStrokeColor = mStrokeColor;
    mStrokeWidth = mStrokeWidth;
    mStrokeAlpha = mStrokeAlpha;
    mFillColor = mFillColor;
    mFillRule = mFillRule;
    mFillAlpha = mFillAlpha;
    mTrimPathStart = mTrimPathStart;
    mTrimPathEnd = mTrimPathEnd;
    mTrimPathOffset = mTrimPathOffset;
    mStrokeLineCap = mStrokeLineCap;
    mStrokeLineJoin = mStrokeLineJoin;
    mStrokeMiterlimit = mStrokeMiterlimit;
  }
  
  private Paint.Cap getStrokeLineCap(int paramInt, Paint.Cap paramCap)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return paramCap;
        }
        return Paint.Cap.SQUARE;
      }
      return Paint.Cap.ROUND;
    }
    return Paint.Cap.BUTT;
  }
  
  private Paint.Join getStrokeLineJoin(int paramInt, Paint.Join paramJoin)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return paramJoin;
        }
        return Paint.Join.BEVEL;
      }
      return Paint.Join.ROUND;
    }
    return Paint.Join.MITER;
  }
  
  private void updateStateFromTypedArray(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme)
  {
    mThemeAttrs = null;
    if (!TypedArrayUtils.hasAttribute(paramXmlPullParser, "pathData")) {
      return;
    }
    String str = paramTypedArray.getString(0);
    if (str != null) {
      mPathName = str;
    }
    str = paramTypedArray.getString(2);
    if (str != null) {
      mNodes = PathParser.createNodesFromPathData(str);
    }
    mFillColor = TypedArrayUtils.getNamedComplexColor(paramTypedArray, paramXmlPullParser, paramTheme, "fillColor", 1, 0);
    mFillAlpha = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "fillAlpha", 12, mFillAlpha);
    mStrokeLineCap = getStrokeLineCap(TypedArrayUtils.getNamedInt(paramTypedArray, paramXmlPullParser, "strokeLineCap", 8, -1), mStrokeLineCap);
    mStrokeLineJoin = getStrokeLineJoin(TypedArrayUtils.getNamedInt(paramTypedArray, paramXmlPullParser, "strokeLineJoin", 9, -1), mStrokeLineJoin);
    mStrokeMiterlimit = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "strokeMiterLimit", 10, mStrokeMiterlimit);
    mStrokeColor = TypedArrayUtils.getNamedComplexColor(paramTypedArray, paramXmlPullParser, paramTheme, "strokeColor", 3, 0);
    mStrokeAlpha = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "strokeAlpha", 11, mStrokeAlpha);
    mStrokeWidth = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "strokeWidth", 4, mStrokeWidth);
    mTrimPathEnd = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "trimPathEnd", 6, mTrimPathEnd);
    mTrimPathOffset = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "trimPathOffset", 7, mTrimPathOffset);
    mTrimPathStart = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "trimPathStart", 5, mTrimPathStart);
    mFillRule = TypedArrayUtils.getNamedInt(paramTypedArray, paramXmlPullParser, "fillType", 13, mFillRule);
  }
  
  public void applyTheme(Resources.Theme paramTheme) {}
  
  public boolean canApplyTheme()
  {
    boolean bool;
    if (mThemeAttrs != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public float getFillAlpha()
  {
    return mFillAlpha;
  }
  
  @ColorInt
  public int getFillColor()
  {
    return mFillColor.getColor();
  }
  
  public float getStrokeAlpha()
  {
    return mStrokeAlpha;
  }
  
  @ColorInt
  public int getStrokeColor()
  {
    return mStrokeColor.getColor();
  }
  
  public float getStrokeWidth()
  {
    return mStrokeWidth;
  }
  
  public float getTrimPathEnd()
  {
    return mTrimPathEnd;
  }
  
  public float getTrimPathOffset()
  {
    return mTrimPathOffset;
  }
  
  public float getTrimPathStart()
  {
    return mTrimPathStart;
  }
  
  public void inflate(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    paramResources = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_PATH);
    updateStateFromTypedArray(paramResources, paramXmlPullParser, paramTheme);
    paramResources.recycle();
  }
  
  public boolean isStateful()
  {
    boolean bool;
    if ((!mFillColor.isStateful()) && (!mStrokeColor.isStateful())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean onStateChanged(int[] paramArrayOfInt)
  {
    boolean bool = mFillColor.onStateChanged(paramArrayOfInt);
    return mStrokeColor.onStateChanged(paramArrayOfInt) | bool;
  }
  
  public void setFillAlpha(float paramFloat)
  {
    mFillAlpha = paramFloat;
  }
  
  public void setFillColor(int paramInt)
  {
    mFillColor.setColor(paramInt);
  }
  
  public void setStrokeAlpha(float paramFloat)
  {
    mStrokeAlpha = paramFloat;
  }
  
  public void setStrokeColor(int paramInt)
  {
    mStrokeColor.setColor(paramInt);
  }
  
  public void setStrokeWidth(float paramFloat)
  {
    mStrokeWidth = paramFloat;
  }
  
  public void setTrimPathEnd(float paramFloat)
  {
    mTrimPathEnd = paramFloat;
  }
  
  public void setTrimPathOffset(float paramFloat)
  {
    mTrimPathOffset = paramFloat;
  }
  
  public void setTrimPathStart(float paramFloat)
  {
    mTrimPathStart = paramFloat;
  }
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
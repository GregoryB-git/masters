package androidx.vectordrawable.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.ComplexColorCompat;
import java.util.ArrayList;

class VectorDrawableCompat$VPathRenderer
{
  private static final Matrix IDENTITY_MATRIX = new Matrix();
  public float mBaseHeight = 0.0F;
  public float mBaseWidth = 0.0F;
  private int mChangingConfigurations;
  public Paint mFillPaint;
  private final Matrix mFinalPathMatrix = new Matrix();
  public Boolean mIsStateful = null;
  private final Path mPath;
  private PathMeasure mPathMeasure;
  private final Path mRenderPath;
  public int mRootAlpha = 255;
  public final VectorDrawableCompat.VGroup mRootGroup;
  public String mRootName = null;
  public Paint mStrokePaint;
  public final ArrayMap<String, Object> mVGTargetsMap;
  public float mViewportHeight = 0.0F;
  public float mViewportWidth = 0.0F;
  
  public VectorDrawableCompat$VPathRenderer()
  {
    mVGTargetsMap = new ArrayMap();
    mRootGroup = new VectorDrawableCompat.VGroup();
    mPath = new Path();
    mRenderPath = new Path();
  }
  
  public VectorDrawableCompat$VPathRenderer(VPathRenderer paramVPathRenderer)
  {
    ArrayMap localArrayMap = new ArrayMap();
    mVGTargetsMap = localArrayMap;
    mRootGroup = new VectorDrawableCompat.VGroup(mRootGroup, localArrayMap);
    mPath = new Path(mPath);
    mRenderPath = new Path(mRenderPath);
    mBaseWidth = mBaseWidth;
    mBaseHeight = mBaseHeight;
    mViewportWidth = mViewportWidth;
    mViewportHeight = mViewportHeight;
    mChangingConfigurations = mChangingConfigurations;
    mRootAlpha = mRootAlpha;
    mRootName = mRootName;
    String str = mRootName;
    if (str != null) {
      localArrayMap.put(str, this);
    }
    mIsStateful = mIsStateful;
  }
  
  private static float cross(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return paramFloat1 * paramFloat4 - paramFloat2 * paramFloat3;
  }
  
  private void drawGroupTree(VectorDrawableCompat.VGroup paramVGroup, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    mStackedMatrix.set(paramMatrix);
    mStackedMatrix.preConcat(mLocalMatrix);
    paramCanvas.save();
    for (int i = 0; i < mChildren.size(); i++)
    {
      paramMatrix = (VectorDrawableCompat.VObject)mChildren.get(i);
      if ((paramMatrix instanceof VectorDrawableCompat.VGroup)) {
        drawGroupTree((VectorDrawableCompat.VGroup)paramMatrix, mStackedMatrix, paramCanvas, paramInt1, paramInt2, paramColorFilter);
      } else if ((paramMatrix instanceof VectorDrawableCompat.VPath)) {
        drawPath(paramVGroup, (VectorDrawableCompat.VPath)paramMatrix, paramCanvas, paramInt1, paramInt2, paramColorFilter);
      }
    }
    paramCanvas.restore();
  }
  
  private void drawPath(VectorDrawableCompat.VGroup paramVGroup, VectorDrawableCompat.VPath paramVPath, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    float f1 = paramInt1 / mViewportWidth;
    float f2 = paramInt2 / mViewportHeight;
    float f3 = Math.min(f1, f2);
    paramVGroup = mStackedMatrix;
    mFinalPathMatrix.set(paramVGroup);
    mFinalPathMatrix.postScale(f1, f2);
    f2 = getMatrixScale(paramVGroup);
    if (f2 == 0.0F) {
      return;
    }
    paramVPath.toPath(mPath);
    Object localObject1 = mPath;
    mRenderPath.reset();
    if (paramVPath.isClipPath())
    {
      paramColorFilter = mRenderPath;
      if (mFillRule == 0) {
        paramVGroup = Path.FillType.WINDING;
      } else {
        paramVGroup = Path.FillType.EVEN_ODD;
      }
      paramColorFilter.setFillType(paramVGroup);
      mRenderPath.addPath((Path)localObject1, mFinalPathMatrix);
      paramCanvas.clipPath(mRenderPath);
    }
    else
    {
      paramVPath = (VectorDrawableCompat.VFullPath)paramVPath;
      float f4 = mTrimPathStart;
      if ((f4 != 0.0F) || (mTrimPathEnd != 1.0F))
      {
        float f5 = mTrimPathOffset;
        float f6 = mTrimPathEnd;
        if (mPathMeasure == null) {
          mPathMeasure = new PathMeasure();
        }
        mPathMeasure.setPath(mPath, false);
        f1 = mPathMeasure.getLength();
        f4 = (f4 + f5) % 1.0F * f1;
        f5 = (f6 + f5) % 1.0F * f1;
        ((Path)localObject1).reset();
        if (f4 > f5)
        {
          mPathMeasure.getSegment(f4, f1, (Path)localObject1, true);
          mPathMeasure.getSegment(0.0F, f5, (Path)localObject1, true);
        }
        else
        {
          mPathMeasure.getSegment(f4, f5, (Path)localObject1, true);
        }
        ((Path)localObject1).rLineTo(0.0F, 0.0F);
      }
      mRenderPath.addPath((Path)localObject1, mFinalPathMatrix);
      Object localObject2;
      if (mFillColor.willDraw())
      {
        paramVGroup = mFillColor;
        if (mFillPaint == null)
        {
          localObject1 = new Paint(1);
          mFillPaint = ((Paint)localObject1);
          ((Paint)localObject1).setStyle(Paint.Style.FILL);
        }
        localObject1 = mFillPaint;
        if (paramVGroup.isGradient())
        {
          paramVGroup = paramVGroup.getShader();
          paramVGroup.setLocalMatrix(mFinalPathMatrix);
          ((Paint)localObject1).setShader(paramVGroup);
          ((Paint)localObject1).setAlpha(Math.round(mFillAlpha * 255.0F));
        }
        else
        {
          ((Paint)localObject1).setShader(null);
          ((Paint)localObject1).setAlpha(255);
          ((Paint)localObject1).setColor(VectorDrawableCompat.applyAlpha(paramVGroup.getColor(), mFillAlpha));
        }
        ((Paint)localObject1).setColorFilter(paramColorFilter);
        localObject2 = mRenderPath;
        if (mFillRule == 0) {
          paramVGroup = Path.FillType.WINDING;
        } else {
          paramVGroup = Path.FillType.EVEN_ODD;
        }
        ((Path)localObject2).setFillType(paramVGroup);
        paramCanvas.drawPath(mRenderPath, (Paint)localObject1);
      }
      if (mStrokeColor.willDraw())
      {
        paramVGroup = mStrokeColor;
        if (mStrokePaint == null)
        {
          localObject1 = new Paint(1);
          mStrokePaint = ((Paint)localObject1);
          ((Paint)localObject1).setStyle(Paint.Style.STROKE);
        }
        localObject1 = mStrokePaint;
        localObject2 = mStrokeLineJoin;
        if (localObject2 != null) {
          ((Paint)localObject1).setStrokeJoin((Paint.Join)localObject2);
        }
        localObject2 = mStrokeLineCap;
        if (localObject2 != null) {
          ((Paint)localObject1).setStrokeCap((Paint.Cap)localObject2);
        }
        ((Paint)localObject1).setStrokeMiter(mStrokeMiterlimit);
        if (paramVGroup.isGradient())
        {
          paramVGroup = paramVGroup.getShader();
          paramVGroup.setLocalMatrix(mFinalPathMatrix);
          ((Paint)localObject1).setShader(paramVGroup);
          ((Paint)localObject1).setAlpha(Math.round(mStrokeAlpha * 255.0F));
        }
        else
        {
          ((Paint)localObject1).setShader(null);
          ((Paint)localObject1).setAlpha(255);
          ((Paint)localObject1).setColor(VectorDrawableCompat.applyAlpha(paramVGroup.getColor(), mStrokeAlpha));
        }
        ((Paint)localObject1).setColorFilter(paramColorFilter);
        ((Paint)localObject1).setStrokeWidth(mStrokeWidth * (f3 * f2));
        paramCanvas.drawPath(mRenderPath, (Paint)localObject1);
      }
    }
  }
  
  private float getMatrixScale(Matrix paramMatrix)
  {
    float[] arrayOfFloat = new float[4];
    float[] tmp5_4 = arrayOfFloat;
    tmp5_4[0] = 0.0F;
    float[] tmp9_5 = tmp5_4;
    tmp9_5[1] = 1.0F;
    float[] tmp13_9 = tmp9_5;
    tmp13_9[2] = 1.0F;
    float[] tmp17_13 = tmp13_9;
    tmp17_13[3] = 0.0F;
    tmp17_13;
    paramMatrix.mapVectors(arrayOfFloat);
    float f1 = (float)Math.hypot(arrayOfFloat[0], arrayOfFloat[1]);
    float f2 = (float)Math.hypot(arrayOfFloat[2], arrayOfFloat[3]);
    float f3 = cross(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
    f1 = Math.max(f1, f2);
    f2 = 0.0F;
    if (f1 > 0.0F) {
      f2 = Math.abs(f3) / f1;
    }
    return f2;
  }
  
  public void draw(Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    drawGroupTree(mRootGroup, IDENTITY_MATRIX, paramCanvas, paramInt1, paramInt2, paramColorFilter);
  }
  
  public float getAlpha()
  {
    return getRootAlpha() / 255.0F;
  }
  
  public int getRootAlpha()
  {
    return mRootAlpha;
  }
  
  public boolean isStateful()
  {
    if (mIsStateful == null) {
      mIsStateful = Boolean.valueOf(mRootGroup.isStateful());
    }
    return mIsStateful.booleanValue();
  }
  
  public boolean onStateChanged(int[] paramArrayOfInt)
  {
    return mRootGroup.onStateChanged(paramArrayOfInt);
  }
  
  public void setAlpha(float paramFloat)
  {
    setRootAlpha((int)(paramFloat * 255.0F));
  }
  
  public void setRootAlpha(int paramInt)
  {
    mRootAlpha = paramInt;
  }
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
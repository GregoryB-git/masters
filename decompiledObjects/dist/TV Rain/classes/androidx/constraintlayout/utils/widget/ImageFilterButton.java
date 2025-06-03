package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.R.styleable;

public class ImageFilterButton
  extends AppCompatImageButton
{
  private Drawable mAltDrawable = null;
  private float mCrossfade = 0.0F;
  private Drawable mDrawable = null;
  private ImageFilterView.ImageMatrix mImageMatrix = new ImageFilterView.ImageMatrix();
  public LayerDrawable mLayer;
  public Drawable[] mLayers = new Drawable[2];
  private boolean mOverlay = true;
  private float mPanX = NaN.0F;
  private float mPanY = NaN.0F;
  private Path mPath;
  public RectF mRect;
  private float mRotate = NaN.0F;
  private float mRound = NaN.0F;
  private float mRoundPercent = 0.0F;
  public ViewOutlineProvider mViewOutlineProvider;
  private float mZoom = NaN.0F;
  
  public ImageFilterButton(Context paramContext)
  {
    super(paramContext);
    init(paramContext, null);
  }
  
  public ImageFilterButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext, paramAttributeSet);
  }
  
  public ImageFilterButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet);
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    setPadding(0, 0, 0, 0);
    if (paramAttributeSet != null)
    {
      paramContext = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.ImageFilterView);
      int i = paramContext.getIndexCount();
      mAltDrawable = paramContext.getDrawable(R.styleable.ImageFilterView_altSrc);
      for (int j = 0; j < i; j++)
      {
        int k = paramContext.getIndex(j);
        if (k == R.styleable.ImageFilterView_crossfade) {
          mCrossfade = paramContext.getFloat(k, 0.0F);
        } else if (k == R.styleable.ImageFilterView_warmth) {
          setWarmth(paramContext.getFloat(k, 0.0F));
        } else if (k == R.styleable.ImageFilterView_saturation) {
          setSaturation(paramContext.getFloat(k, 0.0F));
        } else if (k == R.styleable.ImageFilterView_contrast) {
          setContrast(paramContext.getFloat(k, 0.0F));
        } else if (k == R.styleable.ImageFilterView_round) {
          setRound(paramContext.getDimension(k, 0.0F));
        } else if (k == R.styleable.ImageFilterView_roundPercent) {
          setRoundPercent(paramContext.getFloat(k, 0.0F));
        } else if (k == R.styleable.ImageFilterView_overlay) {
          setOverlay(paramContext.getBoolean(k, mOverlay));
        } else if (k == R.styleable.ImageFilterView_imagePanX) {
          setImagePanX(paramContext.getFloat(k, mPanX));
        } else if (k == R.styleable.ImageFilterView_imagePanY) {
          setImagePanY(paramContext.getFloat(k, mPanY));
        } else if (k == R.styleable.ImageFilterView_imageRotate) {
          setImageRotate(paramContext.getFloat(k, mRotate));
        } else if (k == R.styleable.ImageFilterView_imageZoom) {
          setImageZoom(paramContext.getFloat(k, mZoom));
        }
      }
      paramContext.recycle();
      paramContext = getDrawable();
      mDrawable = paramContext;
      if ((mAltDrawable != null) && (paramContext != null))
      {
        paramContext = mLayers;
        paramAttributeSet = getDrawable().mutate();
        mDrawable = paramAttributeSet;
        paramContext[0] = paramAttributeSet;
        mLayers[1] = mAltDrawable.mutate();
        paramContext = new LayerDrawable(mLayers);
        mLayer = paramContext;
        paramContext.getDrawable(1).setAlpha((int)(mCrossfade * 255.0F));
        if (!mOverlay) {
          mLayer.getDrawable(0).setAlpha((int)((1.0F - mCrossfade) * 255.0F));
        }
        super.setImageDrawable(mLayer);
      }
      else
      {
        paramAttributeSet = getDrawable();
        mDrawable = paramAttributeSet;
        if (paramAttributeSet != null)
        {
          paramContext = mLayers;
          paramAttributeSet = paramAttributeSet.mutate();
          mDrawable = paramAttributeSet;
          paramContext[0] = paramAttributeSet;
        }
      }
    }
  }
  
  private void setMatrix()
  {
    if ((Float.isNaN(mPanX)) && (Float.isNaN(mPanY)) && (Float.isNaN(mZoom)) && (Float.isNaN(mRotate))) {
      return;
    }
    boolean bool = Float.isNaN(mPanX);
    float f1 = 0.0F;
    float f2;
    if (bool) {
      f2 = 0.0F;
    } else {
      f2 = mPanX;
    }
    float f3;
    if (Float.isNaN(mPanY)) {
      f3 = 0.0F;
    } else {
      f3 = mPanY;
    }
    float f4;
    if (Float.isNaN(mZoom)) {
      f4 = 1.0F;
    } else {
      f4 = mZoom;
    }
    if (!Float.isNaN(mRotate)) {
      f1 = mRotate;
    }
    Matrix localMatrix = new Matrix();
    localMatrix.reset();
    float f5 = getDrawable().getIntrinsicWidth();
    float f6 = getDrawable().getIntrinsicHeight();
    float f7 = getWidth();
    float f8 = getHeight();
    if (f5 * f8 < f6 * f7) {
      f9 = f7 / f5;
    } else {
      f9 = f8 / f6;
    }
    f4 *= f9;
    localMatrix.postScale(f4, f4);
    float f9 = f5 * f4;
    f4 *= f6;
    localMatrix.postTranslate(((f7 - f9) * f2 + f7 - f9) * 0.5F, ((f8 - f4) * f3 + f8 - f4) * 0.5F);
    localMatrix.postRotate(f1, f7 / 2.0F, f8 / 2.0F);
    setImageMatrix(localMatrix);
    setScaleType(ImageView.ScaleType.MATRIX);
  }
  
  private void setOverlay(boolean paramBoolean)
  {
    mOverlay = paramBoolean;
  }
  
  private void updateViewMatrix()
  {
    if ((Float.isNaN(mPanX)) && (Float.isNaN(mPanY)) && (Float.isNaN(mZoom)) && (Float.isNaN(mRotate)))
    {
      setScaleType(ImageView.ScaleType.FIT_CENTER);
      return;
    }
    setMatrix();
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
  }
  
  public float getContrast()
  {
    return mImageMatrix.mContrast;
  }
  
  public float getCrossfade()
  {
    return mCrossfade;
  }
  
  public float getImagePanX()
  {
    return mPanX;
  }
  
  public float getImagePanY()
  {
    return mPanY;
  }
  
  public float getImageRotate()
  {
    return mRotate;
  }
  
  public float getImageZoom()
  {
    return mZoom;
  }
  
  public float getRound()
  {
    return mRound;
  }
  
  public float getRoundPercent()
  {
    return mRoundPercent;
  }
  
  public float getSaturation()
  {
    return mImageMatrix.mSaturation;
  }
  
  public float getWarmth()
  {
    return mImageMatrix.mWarmth;
  }
  
  public void layout(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.layout(paramInt1, paramInt2, paramInt3, paramInt4);
    setMatrix();
  }
  
  public void setAltImageResource(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.getDrawable(getContext(), paramInt).mutate();
    mAltDrawable = localDrawable;
    Object localObject = mLayers;
    localObject[0] = mDrawable;
    localObject[1] = localDrawable;
    localObject = new LayerDrawable(mLayers);
    mLayer = ((LayerDrawable)localObject);
    super.setImageDrawable((Drawable)localObject);
    setCrossfade(mCrossfade);
  }
  
  public void setBrightness(float paramFloat)
  {
    ImageFilterView.ImageMatrix localImageMatrix = mImageMatrix;
    mBrightness = paramFloat;
    localImageMatrix.updateMatrix(this);
  }
  
  public void setContrast(float paramFloat)
  {
    ImageFilterView.ImageMatrix localImageMatrix = mImageMatrix;
    mContrast = paramFloat;
    localImageMatrix.updateMatrix(this);
  }
  
  public void setCrossfade(float paramFloat)
  {
    mCrossfade = paramFloat;
    if (mLayers != null)
    {
      if (!mOverlay) {
        mLayer.getDrawable(0).setAlpha((int)((1.0F - mCrossfade) * 255.0F));
      }
      mLayer.getDrawable(1).setAlpha((int)(mCrossfade * 255.0F));
      super.setImageDrawable(mLayer);
    }
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    if ((mAltDrawable != null) && (paramDrawable != null))
    {
      paramDrawable = paramDrawable.mutate();
      mDrawable = paramDrawable;
      Drawable[] arrayOfDrawable = mLayers;
      arrayOfDrawable[0] = paramDrawable;
      arrayOfDrawable[1] = mAltDrawable;
      paramDrawable = new LayerDrawable(mLayers);
      mLayer = paramDrawable;
      super.setImageDrawable(paramDrawable);
      setCrossfade(mCrossfade);
    }
    else
    {
      super.setImageDrawable(paramDrawable);
    }
  }
  
  public void setImagePanX(float paramFloat)
  {
    mPanX = paramFloat;
    updateViewMatrix();
  }
  
  public void setImagePanY(float paramFloat)
  {
    mPanY = paramFloat;
    updateViewMatrix();
  }
  
  public void setImageResource(int paramInt)
  {
    if (mAltDrawable != null)
    {
      Object localObject = AppCompatResources.getDrawable(getContext(), paramInt).mutate();
      mDrawable = ((Drawable)localObject);
      Drawable[] arrayOfDrawable = mLayers;
      arrayOfDrawable[0] = localObject;
      arrayOfDrawable[1] = mAltDrawable;
      localObject = new LayerDrawable(mLayers);
      mLayer = ((LayerDrawable)localObject);
      super.setImageDrawable((Drawable)localObject);
      setCrossfade(mCrossfade);
    }
    else
    {
      super.setImageResource(paramInt);
    }
  }
  
  public void setImageRotate(float paramFloat)
  {
    mRotate = paramFloat;
    updateViewMatrix();
  }
  
  public void setImageZoom(float paramFloat)
  {
    mZoom = paramFloat;
    updateViewMatrix();
  }
  
  @RequiresApi(21)
  public void setRound(float paramFloat)
  {
    if (Float.isNaN(paramFloat))
    {
      mRound = paramFloat;
      paramFloat = mRoundPercent;
      mRoundPercent = -1.0F;
      setRoundPercent(paramFloat);
      return;
    }
    int i;
    if (mRound != paramFloat) {
      i = 1;
    } else {
      i = 0;
    }
    mRound = paramFloat;
    if (paramFloat != 0.0F)
    {
      if (mPath == null) {
        mPath = new Path();
      }
      if (mRect == null) {
        mRect = new RectF();
      }
      if (mViewOutlineProvider == null)
      {
        localObject = new ViewOutlineProvider()
        {
          public void getOutline(View paramAnonymousView, Outline paramAnonymousOutline)
          {
            paramAnonymousOutline.setRoundRect(0, 0, getWidth(), getHeight(), ImageFilterButton.access$100(ImageFilterButton.this));
          }
        };
        mViewOutlineProvider = ((ViewOutlineProvider)localObject);
        setOutlineProvider((ViewOutlineProvider)localObject);
      }
      setClipToOutline(true);
      int j = getWidth();
      int k = getHeight();
      mRect.set(0.0F, 0.0F, j, k);
      mPath.reset();
      Path localPath = mPath;
      Object localObject = mRect;
      paramFloat = mRound;
      localPath.addRoundRect((RectF)localObject, paramFloat, paramFloat, Path.Direction.CW);
    }
    else
    {
      setClipToOutline(false);
    }
    if (i != 0) {
      invalidateOutline();
    }
  }
  
  @RequiresApi(21)
  public void setRoundPercent(float paramFloat)
  {
    int i;
    if (mRoundPercent != paramFloat) {
      i = 1;
    } else {
      i = 0;
    }
    mRoundPercent = paramFloat;
    if (paramFloat != 0.0F)
    {
      if (mPath == null) {
        mPath = new Path();
      }
      if (mRect == null) {
        mRect = new RectF();
      }
      if (mViewOutlineProvider == null)
      {
        ViewOutlineProvider local1 = new ViewOutlineProvider()
        {
          public void getOutline(View paramAnonymousView, Outline paramAnonymousOutline)
          {
            int i = getWidth();
            int j = getHeight();
            float f = Math.min(i, j);
            paramAnonymousOutline.setRoundRect(0, 0, i, j, ImageFilterButton.access$000(ImageFilterButton.this) * f / 2.0F);
          }
        };
        mViewOutlineProvider = local1;
        setOutlineProvider(local1);
      }
      setClipToOutline(true);
      int j = getWidth();
      int k = getHeight();
      paramFloat = Math.min(j, k) * mRoundPercent / 2.0F;
      mRect.set(0.0F, 0.0F, j, k);
      mPath.reset();
      mPath.addRoundRect(mRect, paramFloat, paramFloat, Path.Direction.CW);
    }
    else
    {
      setClipToOutline(false);
    }
    if (i != 0) {
      invalidateOutline();
    }
  }
  
  public void setSaturation(float paramFloat)
  {
    ImageFilterView.ImageMatrix localImageMatrix = mImageMatrix;
    mSaturation = paramFloat;
    localImageMatrix.updateMatrix(this);
  }
  
  public void setWarmth(float paramFloat)
  {
    ImageFilterView.ImageMatrix localImageMatrix = mImageMatrix;
    mWarmth = paramFloat;
    localImageMatrix.updateMatrix(this);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.utils.widget.ImageFilterButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
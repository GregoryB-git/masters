package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewOutlineProvider;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R.attr;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.FloatLayout;
import androidx.constraintlayout.widget.R.styleable;

public class MotionLabel
  extends View
  implements FloatLayout
{
  private static final int MONOSPACE = 3;
  private static final int SANS = 1;
  private static final int SERIF = 2;
  public static String TAG = "MotionLabel";
  private boolean mAutoSize = false;
  private int mAutoSizeTextType = 0;
  public float mBackgroundPanX = NaN.0F;
  public float mBackgroundPanY = NaN.0F;
  private float mBaseTextSize = NaN.0F;
  private float mDeltaLeft;
  private float mFloatHeight;
  private float mFloatWidth;
  private String mFontFamily;
  private int mGravity = 8388659;
  private Layout mLayout;
  public boolean mNotBuilt = true;
  public Matrix mOutlinePositionMatrix;
  private int mPaddingBottom = 1;
  private int mPaddingLeft = 1;
  private int mPaddingRight = 1;
  private int mPaddingTop = 1;
  public TextPaint mPaint = new TextPaint();
  public Path mPath = new Path();
  public RectF mRect;
  public float mRotate = NaN.0F;
  private float mRound = NaN.0F;
  private float mRoundPercent = 0.0F;
  private int mStyleIndex;
  public Paint mTempPaint;
  public Rect mTempRect;
  private String mText = "Hello World";
  private Drawable mTextBackground;
  private Bitmap mTextBackgroundBitmap;
  private Rect mTextBounds = new Rect();
  private int mTextFillColor = 65535;
  private int mTextOutlineColor = 65535;
  private float mTextOutlineThickness = 0.0F;
  private float mTextPanX = 0.0F;
  private float mTextPanY = 0.0F;
  private BitmapShader mTextShader;
  private Matrix mTextShaderMatrix;
  private float mTextSize = 48.0F;
  private int mTextureEffect = 0;
  private float mTextureHeight = NaN.0F;
  private float mTextureWidth = NaN.0F;
  private CharSequence mTransformed;
  private int mTypefaceIndex;
  private boolean mUseOutline = false;
  public ViewOutlineProvider mViewOutlineProvider;
  public float mZoom = NaN.0F;
  public Paint paintCache = new Paint();
  public float paintTextSize;
  
  public MotionLabel(Context paramContext)
  {
    super(paramContext);
    init(paramContext, null);
  }
  
  public MotionLabel(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext, paramAttributeSet);
  }
  
  public MotionLabel(Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet);
  }
  
  private void adjustTexture(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if (mTextShaderMatrix == null) {
      return;
    }
    mFloatWidth = (paramFloat3 - paramFloat1);
    mFloatHeight = (paramFloat4 - paramFloat2);
    updateShaderMatrix();
  }
  
  private float getHorizontalOffset()
  {
    float f1;
    if (Float.isNaN(mBaseTextSize)) {
      f1 = 1.0F;
    } else {
      f1 = mTextSize / mBaseTextSize;
    }
    TextPaint localTextPaint = mPaint;
    String str = mText;
    float f2 = localTextPaint.measureText(str, 0, str.length());
    float f3;
    if (Float.isNaN(mFloatWidth)) {
      f3 = getMeasuredWidth();
    } else {
      f3 = mFloatWidth;
    }
    float f4 = getPaddingLeft();
    float f5 = getPaddingRight();
    return (mTextPanX + 1.0F) * (f3 - f4 - f5 - f2 * f1) / 2.0F;
  }
  
  private float getVerticalOffset()
  {
    float f1;
    if (Float.isNaN(mBaseTextSize)) {
      f1 = 1.0F;
    } else {
      f1 = mTextSize / mBaseTextSize;
    }
    Paint.FontMetrics localFontMetrics = mPaint.getFontMetrics();
    float f2;
    if (Float.isNaN(mFloatHeight)) {
      f2 = getMeasuredHeight();
    } else {
      f2 = mFloatHeight;
    }
    float f3 = getPaddingTop();
    float f4 = getPaddingBottom();
    float f5 = descent;
    float f6 = ascent;
    return (1.0F - mTextPanY) * (f2 - f3 - f4 - (f5 - f6) * f1) / 2.0F - f1 * f6;
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    setUpTheme(paramContext, paramAttributeSet);
    if (paramAttributeSet != null)
    {
      paramContext = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.MotionLabel);
      int i = paramContext.getIndexCount();
      for (int j = 0; j < i; j++)
      {
        int k = paramContext.getIndex(j);
        if (k == R.styleable.MotionLabel_android_text)
        {
          setText(paramContext.getText(k));
        }
        else if (k == R.styleable.MotionLabel_android_fontFamily)
        {
          mFontFamily = paramContext.getString(k);
        }
        else if (k == R.styleable.MotionLabel_scaleFromTextSize)
        {
          mBaseTextSize = paramContext.getDimensionPixelSize(k, (int)mBaseTextSize);
        }
        else if (k == R.styleable.MotionLabel_android_textSize)
        {
          mTextSize = paramContext.getDimensionPixelSize(k, (int)mTextSize);
        }
        else if (k == R.styleable.MotionLabel_android_textStyle)
        {
          mStyleIndex = paramContext.getInt(k, mStyleIndex);
        }
        else if (k == R.styleable.MotionLabel_android_typeface)
        {
          mTypefaceIndex = paramContext.getInt(k, mTypefaceIndex);
        }
        else if (k == R.styleable.MotionLabel_android_textColor)
        {
          mTextFillColor = paramContext.getColor(k, mTextFillColor);
        }
        else
        {
          float f;
          if (k == R.styleable.MotionLabel_borderRound)
          {
            f = paramContext.getDimension(k, mRound);
            mRound = f;
            setRound(f);
          }
          else if (k == R.styleable.MotionLabel_borderRoundPercent)
          {
            f = paramContext.getFloat(k, mRoundPercent);
            mRoundPercent = f;
            setRoundPercent(f);
          }
          else if (k == R.styleable.MotionLabel_android_gravity)
          {
            setGravity(paramContext.getInt(k, -1));
          }
          else if (k == R.styleable.MotionLabel_android_autoSizeTextType)
          {
            mAutoSizeTextType = paramContext.getInt(k, 0);
          }
          else if (k == R.styleable.MotionLabel_textOutlineColor)
          {
            mTextOutlineColor = paramContext.getInt(k, mTextOutlineColor);
            mUseOutline = true;
          }
          else if (k == R.styleable.MotionLabel_textOutlineThickness)
          {
            mTextOutlineThickness = paramContext.getDimension(k, mTextOutlineThickness);
            mUseOutline = true;
          }
          else if (k == R.styleable.MotionLabel_textBackground)
          {
            mTextBackground = paramContext.getDrawable(k);
            mUseOutline = true;
          }
          else if (k == R.styleable.MotionLabel_textBackgroundPanX)
          {
            mBackgroundPanX = paramContext.getFloat(k, mBackgroundPanX);
          }
          else if (k == R.styleable.MotionLabel_textBackgroundPanY)
          {
            mBackgroundPanY = paramContext.getFloat(k, mBackgroundPanY);
          }
          else if (k == R.styleable.MotionLabel_textPanX)
          {
            mTextPanX = paramContext.getFloat(k, mTextPanX);
          }
          else if (k == R.styleable.MotionLabel_textPanY)
          {
            mTextPanY = paramContext.getFloat(k, mTextPanY);
          }
          else if (k == R.styleable.MotionLabel_textBackgroundRotate)
          {
            mRotate = paramContext.getFloat(k, mRotate);
          }
          else if (k == R.styleable.MotionLabel_textBackgroundZoom)
          {
            mZoom = paramContext.getFloat(k, mZoom);
          }
          else if (k == R.styleable.MotionLabel_textureHeight)
          {
            mTextureHeight = paramContext.getDimension(k, mTextureHeight);
          }
          else if (k == R.styleable.MotionLabel_textureWidth)
          {
            mTextureWidth = paramContext.getDimension(k, mTextureWidth);
          }
          else if (k == R.styleable.MotionLabel_textureEffect)
          {
            mTextureEffect = paramContext.getInt(k, mTextureEffect);
          }
        }
      }
      paramContext.recycle();
    }
    setupTexture();
    setupPath();
  }
  
  private void setTypefaceFromAttrs(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString != null)
    {
      Typeface localTypeface = Typeface.create(paramString, paramInt2);
      paramString = localTypeface;
      if (localTypeface != null) {
        setTypeface(localTypeface);
      }
    }
    else
    {
      paramString = null;
    }
    boolean bool = true;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 == 3) {
          paramString = Typeface.MONOSPACE;
        }
      }
      else {
        paramString = Typeface.SERIF;
      }
    }
    else {
      paramString = Typeface.SANS_SERIF;
    }
    float f = 0.0F;
    if (paramInt2 > 0)
    {
      if (paramString == null) {
        paramString = Typeface.defaultFromStyle(paramInt2);
      } else {
        paramString = Typeface.create(paramString, paramInt2);
      }
      setTypeface(paramString);
      if (paramString != null) {
        paramInt1 = paramString.getStyle();
      } else {
        paramInt1 = 0;
      }
      paramInt1 &= paramInt2;
      paramString = mPaint;
      if ((paramInt1 & 0x1) == 0) {
        bool = false;
      }
      paramString.setFakeBoldText(bool);
      paramString = mPaint;
      if ((paramInt1 & 0x2) != 0) {
        f = -0.25F;
      }
      paramString.setTextSkewX(f);
    }
    else
    {
      mPaint.setFakeBoldText(false);
      mPaint.setTextSkewX(0.0F);
      setTypeface(paramString);
    }
  }
  
  private void setUpTheme(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    paramAttributeSet = new TypedValue();
    paramContext.getTheme().resolveAttribute(R.attr.colorPrimary, paramAttributeSet, true);
    paramContext = mPaint;
    int i = data;
    mTextFillColor = i;
    paramContext.setColor(i);
  }
  
  private void setupTexture()
  {
    if (mTextBackground != null)
    {
      mTextShaderMatrix = new Matrix();
      int i = mTextBackground.getIntrinsicWidth();
      int j = mTextBackground.getIntrinsicHeight();
      int k = 128;
      int m = i;
      if (i <= 0)
      {
        i = getWidth();
        m = i;
        if (i == 0) {
          if (Float.isNaN(mTextureWidth)) {
            m = 128;
          } else {
            m = (int)mTextureWidth;
          }
        }
      }
      i = j;
      if (j <= 0)
      {
        j = getHeight();
        i = j;
        if (j == 0) {
          if (Float.isNaN(mTextureHeight)) {
            i = k;
          } else {
            i = (int)mTextureHeight;
          }
        }
      }
      j = m;
      k = i;
      if (mTextureEffect != 0)
      {
        j = m / 2;
        k = i / 2;
      }
      mTextBackgroundBitmap = Bitmap.createBitmap(j, k, Bitmap.Config.ARGB_8888);
      Object localObject = new Canvas(mTextBackgroundBitmap);
      mTextBackground.setBounds(0, 0, ((Canvas)localObject).getWidth(), ((Canvas)localObject).getHeight());
      mTextBackground.setFilterBitmap(true);
      mTextBackground.draw((Canvas)localObject);
      if (mTextureEffect != 0) {
        mTextBackgroundBitmap = blur(mTextBackgroundBitmap, 4);
      }
      Bitmap localBitmap = mTextBackgroundBitmap;
      localObject = Shader.TileMode.REPEAT;
      mTextShader = new BitmapShader(localBitmap, (Shader.TileMode)localObject, (Shader.TileMode)localObject);
    }
  }
  
  private void updateShaderMatrix()
  {
    boolean bool = Float.isNaN(mBackgroundPanX);
    float f1 = 0.0F;
    float f2;
    if (bool) {
      f2 = 0.0F;
    } else {
      f2 = mBackgroundPanX;
    }
    float f3;
    if (Float.isNaN(mBackgroundPanY)) {
      f3 = 0.0F;
    } else {
      f3 = mBackgroundPanY;
    }
    if (Float.isNaN(mZoom)) {
      f4 = 1.0F;
    } else {
      f4 = mZoom;
    }
    if (!Float.isNaN(mRotate)) {
      f1 = mRotate;
    }
    mTextShaderMatrix.reset();
    float f5 = mTextBackgroundBitmap.getWidth();
    float f6 = mTextBackgroundBitmap.getHeight();
    float f7;
    if (Float.isNaN(mTextureWidth)) {
      f7 = mFloatWidth;
    } else {
      f7 = mTextureWidth;
    }
    float f8;
    if (Float.isNaN(mTextureHeight)) {
      f8 = mFloatHeight;
    } else {
      f8 = mTextureHeight;
    }
    if (f5 * f8 < f6 * f7) {
      f9 = f7 / f5;
    } else {
      f9 = f8 / f6;
    }
    f4 *= f9;
    mTextShaderMatrix.postScale(f4, f4);
    f5 *= f4;
    float f9 = f7 - f5;
    f6 = f4 * f6;
    float f4 = f8 - f6;
    if (!Float.isNaN(mTextureHeight)) {
      f4 = mTextureHeight / 2.0F;
    }
    if (!Float.isNaN(mTextureWidth)) {
      f9 = mTextureWidth / 2.0F;
    }
    mTextShaderMatrix.postTranslate((f2 * f9 + f7 - f5) * 0.5F, (f3 * f4 + f8 - f6) * 0.5F);
    mTextShaderMatrix.postRotate(f1, f7 / 2.0F, f8 / 2.0F);
    mTextShader.setLocalMatrix(mTextShaderMatrix);
  }
  
  public Bitmap blur(Bitmap paramBitmap, int paramInt)
  {
    System.nanoTime();
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    int k = i / 2;
    i = j / 2;
    paramBitmap = Bitmap.createScaledBitmap(paramBitmap, k, i, true);
    for (j = 0; (j < paramInt) && (k >= 32) && (i >= 32); j++)
    {
      k /= 2;
      i /= 2;
      paramBitmap = Bitmap.createScaledBitmap(paramBitmap, k, i, true);
    }
    return paramBitmap;
  }
  
  public void buildShape(float paramFloat)
  {
    if ((!mUseOutline) && (paramFloat == 1.0F)) {
      return;
    }
    mPath.reset();
    Object localObject = mText;
    int i = ((String)localObject).length();
    mPaint.getTextBounds((String)localObject, 0, i, mTextBounds);
    mPaint.getTextPath((String)localObject, 0, i, 0.0F, 0.0F, mPath);
    if (paramFloat != 1.0F)
    {
      String str = TAG;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(Debug.getLoc());
      ((StringBuilder)localObject).append(" scale ");
      ((StringBuilder)localObject).append(paramFloat);
      Log.v(str, ((StringBuilder)localObject).toString());
      localObject = new Matrix();
      ((Matrix)localObject).postScale(paramFloat, paramFloat);
      mPath.transform((Matrix)localObject);
    }
    localObject = mTextBounds;
    right -= 1;
    left += 1;
    bottom += 1;
    top -= 1;
    localObject = new RectF();
    bottom = getHeight();
    right = getWidth();
    mNotBuilt = false;
  }
  
  public float getRound()
  {
    return mRound;
  }
  
  public float getRoundPercent()
  {
    return mRoundPercent;
  }
  
  public float getScaleFromTextSize()
  {
    return mBaseTextSize;
  }
  
  public float getTextBackgroundPanX()
  {
    return mBackgroundPanX;
  }
  
  public float getTextBackgroundPanY()
  {
    return mBackgroundPanY;
  }
  
  public float getTextBackgroundRotate()
  {
    return mRotate;
  }
  
  public float getTextBackgroundZoom()
  {
    return mZoom;
  }
  
  public int getTextOutlineColor()
  {
    return mTextOutlineColor;
  }
  
  public float getTextPanX()
  {
    return mTextPanX;
  }
  
  public float getTextPanY()
  {
    return mTextPanY;
  }
  
  public float getTextureHeight()
  {
    return mTextureHeight;
  }
  
  public float getTextureWidth()
  {
    return mTextureWidth;
  }
  
  public Typeface getTypeface()
  {
    return mPaint.getTypeface();
  }
  
  public void layout(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i = (int)(paramFloat1 + 0.5F);
    mDeltaLeft = (paramFloat1 - i);
    int j = (int)(paramFloat3 + 0.5F);
    int k = j - i;
    int m = (int)(paramFloat4 + 0.5F);
    int n = (int)(0.5F + paramFloat2);
    int i1 = m - n;
    float f1 = paramFloat3 - paramFloat1;
    mFloatWidth = f1;
    float f2 = paramFloat4 - paramFloat2;
    mFloatHeight = f2;
    adjustTexture(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    if ((getMeasuredHeight() == i1) && (getMeasuredWidth() == k))
    {
      super.layout(i, n, j, m);
    }
    else
    {
      measure(View.MeasureSpec.makeMeasureSpec(k, 1073741824), View.MeasureSpec.makeMeasureSpec(i1, 1073741824));
      super.layout(i, n, j, m);
    }
    if (mAutoSize)
    {
      if (mTempRect == null)
      {
        mTempPaint = new Paint();
        mTempRect = new Rect();
        mTempPaint.set(mPaint);
        paintTextSize = mTempPaint.getTextSize();
      }
      mFloatWidth = f1;
      mFloatHeight = f2;
      Paint localPaint = mTempPaint;
      String str = mText;
      localPaint.getTextBounds(str, 0, str.length(), mTempRect);
      i1 = mTempRect.width();
      paramFloat1 = mTempRect.height() * 1.3F;
      paramFloat2 = f1 - mPaddingRight - mPaddingLeft;
      paramFloat3 = f2 - mPaddingBottom - mPaddingTop;
      paramFloat4 = i1;
      if (paramFloat4 * paramFloat3 > paramFloat1 * paramFloat2) {
        mPaint.setTextSize(paintTextSize * paramFloat2 / paramFloat4);
      } else {
        mPaint.setTextSize(paintTextSize * paramFloat3 / paramFloat1);
      }
      if ((mUseOutline) || (!Float.isNaN(mBaseTextSize)))
      {
        if (Float.isNaN(mBaseTextSize)) {
          paramFloat1 = 1.0F;
        } else {
          paramFloat1 = mTextSize / mBaseTextSize;
        }
        buildShape(paramFloat1);
      }
    }
  }
  
  public void layout(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.layout(paramInt1, paramInt2, paramInt3, paramInt4);
    boolean bool = Float.isNaN(mBaseTextSize);
    float f1;
    if (bool) {
      f1 = 1.0F;
    } else {
      f1 = mTextSize / mBaseTextSize;
    }
    mFloatWidth = (paramInt3 - paramInt1);
    mFloatHeight = (paramInt4 - paramInt2);
    float f2 = f1;
    if (mAutoSize)
    {
      if (mTempRect == null)
      {
        mTempPaint = new Paint();
        mTempRect = new Rect();
        mTempPaint.set(mPaint);
        paintTextSize = mTempPaint.getTextSize();
      }
      Paint localPaint = mTempPaint;
      String str = mText;
      localPaint.getTextBounds(str, 0, str.length(), mTempRect);
      int i = mTempRect.width();
      int j = (int)(mTempRect.height() * 1.3F);
      f2 = mFloatWidth - mPaddingRight - mPaddingLeft;
      float f3 = mFloatHeight - mPaddingBottom - mPaddingTop;
      float f5;
      if (bool)
      {
        float f4 = i;
        f5 = j;
        if (f4 * f3 > f5 * f2)
        {
          mPaint.setTextSize(paintTextSize * f2 / f4);
          f2 = f1;
        }
        else
        {
          mPaint.setTextSize(paintTextSize * f3 / f5);
          f2 = f1;
        }
      }
      else
      {
        f1 = i;
        f5 = j;
        if (f1 * f3 > f5 * f2) {
          f2 /= f1;
        } else {
          f2 = f3 / f5;
        }
      }
    }
    if ((mUseOutline) || (!bool))
    {
      adjustTexture(paramInt1, paramInt2, paramInt3, paramInt4);
      buildShape(f2);
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    float f1;
    if (Float.isNaN(mBaseTextSize)) {
      f1 = 1.0F;
    } else {
      f1 = mTextSize / mBaseTextSize;
    }
    super.onDraw(paramCanvas);
    float f3;
    float f4;
    if ((!mUseOutline) && (f1 == 1.0F))
    {
      float f2 = mPaddingLeft;
      f3 = getHorizontalOffset();
      f4 = mPaddingTop;
      f1 = getVerticalOffset();
      paramCanvas.drawText(mText, mDeltaLeft + (f2 + f3), f4 + f1, mPaint);
      return;
    }
    if (mNotBuilt) {
      buildShape(f1);
    }
    if (mOutlinePositionMatrix == null) {
      mOutlinePositionMatrix = new Matrix();
    }
    if (mUseOutline)
    {
      paintCache.set(mPaint);
      mOutlinePositionMatrix.reset();
      f3 = mPaddingLeft + getHorizontalOffset();
      f4 = mPaddingTop + getVerticalOffset();
      mOutlinePositionMatrix.postTranslate(f3, f4);
      mOutlinePositionMatrix.preScale(f1, f1);
      mPath.transform(mOutlinePositionMatrix);
      if (mTextShader != null)
      {
        mPaint.setFilterBitmap(true);
        mPaint.setShader(mTextShader);
      }
      else
      {
        mPaint.setColor(mTextFillColor);
      }
      mPaint.setStyle(Paint.Style.FILL);
      mPaint.setStrokeWidth(mTextOutlineThickness);
      paramCanvas.drawPath(mPath, mPaint);
      if (mTextShader != null) {
        mPaint.setShader(null);
      }
      mPaint.setColor(mTextOutlineColor);
      mPaint.setStyle(Paint.Style.STROKE);
      mPaint.setStrokeWidth(mTextOutlineThickness);
      paramCanvas.drawPath(mPath, mPaint);
      mOutlinePositionMatrix.reset();
      mOutlinePositionMatrix.postTranslate(-f3, -f4);
      mPath.transform(mOutlinePositionMatrix);
      mPaint.set(paintCache);
    }
    else
    {
      f1 = mPaddingLeft + getHorizontalOffset();
      f4 = mPaddingTop + getVerticalOffset();
      mOutlinePositionMatrix.reset();
      mOutlinePositionMatrix.preTranslate(f1, f4);
      mPath.transform(mOutlinePositionMatrix);
      mPaint.setColor(mTextFillColor);
      mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
      mPaint.setStrokeWidth(mTextOutlineThickness);
      paramCanvas.drawPath(mPath, mPaint);
      mOutlinePositionMatrix.reset();
      mOutlinePositionMatrix.preTranslate(-f1, -f4);
      mPath.transform(mOutlinePositionMatrix);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getSize(paramInt2);
    mAutoSize = false;
    mPaddingLeft = getPaddingLeft();
    mPaddingRight = getPaddingRight();
    mPaddingTop = getPaddingTop();
    mPaddingBottom = getPaddingBottom();
    if ((i == 1073741824) && (j == 1073741824))
    {
      i = paramInt1;
      paramInt2 = k;
      if (mAutoSizeTextType != 0)
      {
        mAutoSize = true;
        i = paramInt1;
        paramInt2 = k;
      }
    }
    else
    {
      TextPaint localTextPaint = mPaint;
      String str = mText;
      localTextPaint.getTextBounds(str, 0, str.length(), mTextBounds);
      if (i != 1073741824) {
        paramInt1 = (int)(mTextBounds.width() + 0.99999F);
      }
      int m = paramInt1 + (mPaddingLeft + mPaddingRight);
      i = m;
      paramInt2 = k;
      if (j != 1073741824)
      {
        paramInt2 = (int)(mPaint.getFontMetricsInt(null) + 0.99999F);
        paramInt1 = paramInt2;
        if (j == Integer.MIN_VALUE) {
          paramInt1 = Math.min(k, paramInt2);
        }
        paramInt2 = mPaddingTop + mPaddingBottom + paramInt1;
        i = m;
      }
    }
    setMeasuredDimension(i, paramInt2);
  }
  
  @SuppressLint({"RtlHardcoded"})
  public void setGravity(int paramInt)
  {
    int i = paramInt;
    if ((paramInt & 0x800007) == 0) {
      i = paramInt | 0x800003;
    }
    paramInt = i;
    if ((i & 0x70) == 0) {
      paramInt = i | 0x30;
    }
    if (paramInt != mGravity) {
      invalidate();
    }
    mGravity = paramInt;
    i = paramInt & 0x70;
    if (i != 48)
    {
      if (i != 80) {
        mTextPanY = 0.0F;
      } else {
        mTextPanY = 1.0F;
      }
    }
    else {
      mTextPanY = -1.0F;
    }
    paramInt &= 0x800007;
    if (paramInt != 3)
    {
      if (paramInt != 5)
      {
        if (paramInt == 8388611) {
          break label133;
        }
        if (paramInt != 8388613)
        {
          mTextPanX = 0.0F;
          return;
        }
      }
      mTextPanX = 1.0F;
      return;
    }
    label133:
    mTextPanX = -1.0F;
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
            paramAnonymousOutline.setRoundRect(0, 0, getWidth(), getHeight(), MotionLabel.access$100(MotionLabel.this));
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
            paramAnonymousOutline.setRoundRect(0, 0, i, j, MotionLabel.access$000(MotionLabel.this) * f / 2.0F);
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
  
  public void setScaleFromTextSize(float paramFloat)
  {
    mBaseTextSize = paramFloat;
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    mText = paramCharSequence.toString();
    invalidate();
  }
  
  public void setTextBackgroundPanX(float paramFloat)
  {
    mBackgroundPanX = paramFloat;
    updateShaderMatrix();
    invalidate();
  }
  
  public void setTextBackgroundPanY(float paramFloat)
  {
    mBackgroundPanY = paramFloat;
    updateShaderMatrix();
    invalidate();
  }
  
  public void setTextBackgroundRotate(float paramFloat)
  {
    mRotate = paramFloat;
    updateShaderMatrix();
    invalidate();
  }
  
  public void setTextBackgroundZoom(float paramFloat)
  {
    mZoom = paramFloat;
    updateShaderMatrix();
    invalidate();
  }
  
  public void setTextFillColor(int paramInt)
  {
    mTextFillColor = paramInt;
    invalidate();
  }
  
  public void setTextOutlineColor(int paramInt)
  {
    mTextOutlineColor = paramInt;
    mUseOutline = true;
    invalidate();
  }
  
  public void setTextOutlineThickness(float paramFloat)
  {
    mTextOutlineThickness = paramFloat;
    mUseOutline = true;
    if (Float.isNaN(paramFloat))
    {
      mTextOutlineThickness = 1.0F;
      mUseOutline = false;
    }
    invalidate();
  }
  
  public void setTextPanX(float paramFloat)
  {
    mTextPanX = paramFloat;
    invalidate();
  }
  
  public void setTextPanY(float paramFloat)
  {
    mTextPanY = paramFloat;
    invalidate();
  }
  
  public void setTextSize(float paramFloat)
  {
    mTextSize = paramFloat;
    Object localObject = TAG;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Debug.getLoc());
    localStringBuilder.append("  ");
    localStringBuilder.append(paramFloat);
    localStringBuilder.append(" / ");
    localStringBuilder.append(mBaseTextSize);
    Log.v((String)localObject, localStringBuilder.toString());
    localObject = mPaint;
    if (!Float.isNaN(mBaseTextSize)) {
      paramFloat = mBaseTextSize;
    }
    ((Paint)localObject).setTextSize(paramFloat);
    if (Float.isNaN(mBaseTextSize)) {
      paramFloat = 1.0F;
    } else {
      paramFloat = mTextSize / mBaseTextSize;
    }
    buildShape(paramFloat);
    requestLayout();
    invalidate();
  }
  
  public void setTextureHeight(float paramFloat)
  {
    mTextureHeight = paramFloat;
    updateShaderMatrix();
    invalidate();
  }
  
  public void setTextureWidth(float paramFloat)
  {
    mTextureWidth = paramFloat;
    updateShaderMatrix();
    invalidate();
  }
  
  public void setTypeface(Typeface paramTypeface)
  {
    if (mPaint.getTypeface() != paramTypeface)
    {
      mPaint.setTypeface(paramTypeface);
      if (mLayout != null)
      {
        mLayout = null;
        requestLayout();
        invalidate();
      }
    }
  }
  
  public void setupPath()
  {
    mPaddingLeft = getPaddingLeft();
    mPaddingRight = getPaddingRight();
    mPaddingTop = getPaddingTop();
    mPaddingBottom = getPaddingBottom();
    setTypefaceFromAttrs(mFontFamily, mTypefaceIndex, mStyleIndex);
    mPaint.setColor(mTextFillColor);
    mPaint.setStrokeWidth(mTextOutlineThickness);
    mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    mPaint.setFlags(128);
    setTextSize(mTextSize);
    mPaint.setAntiAlias(true);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.utils.widget.MotionLabel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
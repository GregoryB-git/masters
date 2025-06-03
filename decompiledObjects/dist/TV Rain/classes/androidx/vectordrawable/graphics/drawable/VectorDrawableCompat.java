package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.PathParser.PathDataNode;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z2;

public class VectorDrawableCompat
  extends VectorDrawableCommon
{
  private static final boolean DBG_VECTOR_DRAWABLE = false;
  public static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
  private static final int LINECAP_BUTT = 0;
  private static final int LINECAP_ROUND = 1;
  private static final int LINECAP_SQUARE = 2;
  private static final int LINEJOIN_BEVEL = 2;
  private static final int LINEJOIN_MITER = 0;
  private static final int LINEJOIN_ROUND = 1;
  public static final String LOGTAG = "VectorDrawableCompat";
  private static final int MAX_CACHED_BITMAP_SIZE = 2048;
  private static final String SHAPE_CLIP_PATH = "clip-path";
  private static final String SHAPE_GROUP = "group";
  private static final String SHAPE_PATH = "path";
  private static final String SHAPE_VECTOR = "vector";
  private boolean mAllowCaching = true;
  private Drawable.ConstantState mCachedConstantStateDelegate;
  private ColorFilter mColorFilter;
  private boolean mMutated;
  private PorterDuffColorFilter mTintFilter;
  private final Rect mTmpBounds = new Rect();
  private final float[] mTmpFloats = new float[9];
  private final Matrix mTmpMatrix = new Matrix();
  private VectorDrawableCompatState mVectorState;
  
  public VectorDrawableCompat()
  {
    mVectorState = new VectorDrawableCompatState();
  }
  
  public VectorDrawableCompat(@NonNull VectorDrawableCompatState paramVectorDrawableCompatState)
  {
    mVectorState = paramVectorDrawableCompatState;
    mTintFilter = updateTintFilter(mTintFilter, mTint, mTintMode);
  }
  
  public static int applyAlpha(int paramInt, float paramFloat)
  {
    return paramInt & 0xFFFFFF | (int)(Color.alpha(paramInt) * paramFloat) << 24;
  }
  
  @Nullable
  public static VectorDrawableCompat create(@NonNull Resources paramResources, @DrawableRes int paramInt, @Nullable Resources.Theme paramTheme)
  {
    VectorDrawableCompat localVectorDrawableCompat = new VectorDrawableCompat();
    mDelegateDrawable = ResourcesCompat.getDrawable(paramResources, paramInt, paramTheme);
    mCachedConstantStateDelegate = new VectorDrawableDelegateState(mDelegateDrawable.getConstantState());
    return localVectorDrawableCompat;
  }
  
  public static VectorDrawableCompat createFromXmlInner(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    VectorDrawableCompat localVectorDrawableCompat = new VectorDrawableCompat();
    localVectorDrawableCompat.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return localVectorDrawableCompat;
  }
  
  private void inflateInternal(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    VectorDrawableCompatState localVectorDrawableCompatState = mVectorState;
    VPathRenderer localVPathRenderer = mVPathRenderer;
    ArrayDeque localArrayDeque = new ArrayDeque();
    localArrayDeque.push(mRootGroup);
    int i = paramXmlPullParser.getEventType();
    int j = paramXmlPullParser.getDepth();
    int m;
    for (int k = 1; (i != 1) && ((paramXmlPullParser.getDepth() >= j + 1) || (i != 3)); k = m)
    {
      if (i == 2)
      {
        Object localObject = paramXmlPullParser.getName();
        VGroup localVGroup = (VGroup)localArrayDeque.peek();
        if ("path".equals(localObject))
        {
          localObject = new VFullPath();
          ((VFullPath)localObject).inflate(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
          mChildren.add(localObject);
          if (((VPath)localObject).getPathName() != null) {
            mVGTargetsMap.put(((VPath)localObject).getPathName(), localObject);
          }
          m = 0;
          k = mChangingConfigurations;
          mChangingConfigurations = (mChangingConfigurations | k);
        }
        else if ("clip-path".equals(localObject))
        {
          localObject = new VClipPath();
          ((VClipPath)localObject).inflate(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
          mChildren.add(localObject);
          if (((VPath)localObject).getPathName() != null) {
            mVGTargetsMap.put(((VPath)localObject).getPathName(), localObject);
          }
          m = mChangingConfigurations;
          mChangingConfigurations = (mChangingConfigurations | m);
          m = k;
        }
        else
        {
          m = k;
          if ("group".equals(localObject))
          {
            localObject = new VGroup();
            ((VGroup)localObject).inflate(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
            mChildren.add(localObject);
            localArrayDeque.push(localObject);
            if (((VGroup)localObject).getGroupName() != null) {
              mVGTargetsMap.put(((VGroup)localObject).getGroupName(), localObject);
            }
            m = mChangingConfigurations;
            mChangingConfigurations = (mChangingConfigurations | m);
            m = k;
          }
        }
      }
      else
      {
        m = k;
        if (i == 3)
        {
          m = k;
          if ("group".equals(paramXmlPullParser.getName()))
          {
            localArrayDeque.pop();
            m = k;
          }
        }
      }
      i = paramXmlPullParser.next();
    }
    if (k == 0) {
      return;
    }
    throw new XmlPullParserException("no path defined");
  }
  
  private boolean needMirroring()
  {
    boolean bool1 = isAutoMirrored();
    boolean bool2 = true;
    if ((!bool1) || (DrawableCompat.getLayoutDirection(this) != 1)) {
      bool2 = false;
    }
    return bool2;
  }
  
  private static PorterDuff.Mode parseTintModeCompat(int paramInt, PorterDuff.Mode paramMode)
  {
    if (paramInt != 3)
    {
      if (paramInt != 5)
      {
        if (paramInt != 9)
        {
          switch (paramInt)
          {
          default: 
            return paramMode;
          case 16: 
            return PorterDuff.Mode.ADD;
          case 15: 
            return PorterDuff.Mode.SCREEN;
          }
          return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_ATOP;
      }
      return PorterDuff.Mode.SRC_IN;
    }
    return PorterDuff.Mode.SRC_OVER;
  }
  
  private void printGroupTree(VGroup paramVGroup, int paramInt)
  {
    int i = 0;
    Object localObject = "";
    for (int j = 0; j < paramInt; j++) {
      localObject = z2.o((String)localObject, "    ");
    }
    StringBuilder localStringBuilder = z2.u((String)localObject, "current group is :");
    localStringBuilder.append(paramVGroup.getGroupName());
    localStringBuilder.append(" rotation is ");
    localStringBuilder.append(mRotate);
    Log.v("VectorDrawableCompat", localStringBuilder.toString());
    localStringBuilder = new StringBuilder();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("matrix is :");
    localStringBuilder.append(paramVGroup.getLocalMatrix().toString());
    Log.v("VectorDrawableCompat", localStringBuilder.toString());
    for (j = i; j < mChildren.size(); j++)
    {
      localObject = (VObject)mChildren.get(j);
      if ((localObject instanceof VGroup)) {
        printGroupTree((VGroup)localObject, paramInt + 1);
      } else {
        ((VPath)localObject).printVPath(paramInt + 1);
      }
    }
  }
  
  private void updateStateFromTypedArray(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme)
    throws XmlPullParserException
  {
    VectorDrawableCompatState localVectorDrawableCompatState = mVectorState;
    VPathRenderer localVPathRenderer = mVPathRenderer;
    mTintMode = parseTintModeCompat(TypedArrayUtils.getNamedInt(paramTypedArray, paramXmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
    paramTheme = TypedArrayUtils.getNamedColorStateList(paramTypedArray, paramXmlPullParser, paramTheme, "tint", 1);
    if (paramTheme != null) {
      mTint = paramTheme;
    }
    mAutoMirrored = TypedArrayUtils.getNamedBoolean(paramTypedArray, paramXmlPullParser, "autoMirrored", 5, mAutoMirrored);
    mViewportWidth = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "viewportWidth", 7, mViewportWidth);
    float f = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "viewportHeight", 8, mViewportHeight);
    mViewportHeight = f;
    if (mViewportWidth > 0.0F)
    {
      if (f > 0.0F)
      {
        mBaseWidth = paramTypedArray.getDimension(3, mBaseWidth);
        f = paramTypedArray.getDimension(2, mBaseHeight);
        mBaseHeight = f;
        if (mBaseWidth > 0.0F)
        {
          if (f > 0.0F)
          {
            localVPathRenderer.setAlpha(TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "alpha", 4, localVPathRenderer.getAlpha()));
            paramTypedArray = paramTypedArray.getString(0);
            if (paramTypedArray != null)
            {
              mRootName = paramTypedArray;
              mVGTargetsMap.put(paramTypedArray, localVPathRenderer);
            }
            return;
          }
          paramXmlPullParser = new StringBuilder();
          paramXmlPullParser.append(paramTypedArray.getPositionDescription());
          paramXmlPullParser.append("<vector> tag requires height > 0");
          throw new XmlPullParserException(paramXmlPullParser.toString());
        }
        paramXmlPullParser = new StringBuilder();
        paramXmlPullParser.append(paramTypedArray.getPositionDescription());
        paramXmlPullParser.append("<vector> tag requires width > 0");
        throw new XmlPullParserException(paramXmlPullParser.toString());
      }
      paramXmlPullParser = new StringBuilder();
      paramXmlPullParser.append(paramTypedArray.getPositionDescription());
      paramXmlPullParser.append("<vector> tag requires viewportHeight > 0");
      throw new XmlPullParserException(paramXmlPullParser.toString());
    }
    paramXmlPullParser = new StringBuilder();
    paramXmlPullParser.append(paramTypedArray.getPositionDescription());
    paramXmlPullParser.append("<vector> tag requires viewportWidth > 0");
    throw new XmlPullParserException(paramXmlPullParser.toString());
  }
  
  public boolean canApplyTheme()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      DrawableCompat.canApplyTheme(localDrawable);
    }
    return false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    Object localObject1 = mDelegateDrawable;
    if (localObject1 != null)
    {
      ((Drawable)localObject1).draw(paramCanvas);
      return;
    }
    copyBounds(mTmpBounds);
    if ((mTmpBounds.width() > 0) && (mTmpBounds.height() > 0))
    {
      Object localObject2 = mColorFilter;
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = mTintFilter;
      }
      paramCanvas.getMatrix(mTmpMatrix);
      mTmpMatrix.getValues(mTmpFloats);
      float f1 = Math.abs(mTmpFloats[0]);
      float f2 = Math.abs(mTmpFloats[4]);
      float f3 = Math.abs(mTmpFloats[1]);
      float f4 = Math.abs(mTmpFloats[3]);
      if ((f3 != 0.0F) || (f4 != 0.0F))
      {
        f1 = 1.0F;
        f2 = f1;
      }
      int i = (int)(mTmpBounds.width() * f1);
      int j = (int)(mTmpBounds.height() * f2);
      i = Math.min(2048, i);
      int k = Math.min(2048, j);
      if ((i > 0) && (k > 0))
      {
        j = paramCanvas.save();
        localObject2 = mTmpBounds;
        paramCanvas.translate(left, top);
        if (needMirroring())
        {
          paramCanvas.translate(mTmpBounds.width(), 0.0F);
          paramCanvas.scale(-1.0F, 1.0F);
        }
        mTmpBounds.offsetTo(0, 0);
        mVectorState.createCachedBitmapIfNeeded(i, k);
        if (!mAllowCaching)
        {
          mVectorState.updateCachedBitmap(i, k);
        }
        else if (!mVectorState.canReuseCache())
        {
          mVectorState.updateCachedBitmap(i, k);
          mVectorState.updateCacheStates();
        }
        mVectorState.drawCachedBitmapWithRootAlpha(paramCanvas, (ColorFilter)localObject1, mTmpBounds);
        paramCanvas.restoreToCount(j);
      }
    }
  }
  
  public int getAlpha()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return DrawableCompat.getAlpha(localDrawable);
    }
    return mVectorState.mVPathRenderer.getRootAlpha();
  }
  
  public int getChangingConfigurations()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | mVectorState.getChangingConfigurations();
  }
  
  public ColorFilter getColorFilter()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return DrawableCompat.getColorFilter(localDrawable);
    }
    return mColorFilter;
  }
  
  public Drawable.ConstantState getConstantState()
  {
    if (mDelegateDrawable != null) {
      return new VectorDrawableDelegateState(mDelegateDrawable.getConstantState());
    }
    mVectorState.mChangingConfigurations = getChangingConfigurations();
    return mVectorState;
  }
  
  public int getIntrinsicHeight()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.getIntrinsicHeight();
    }
    return (int)mVectorState.mVPathRenderer.mBaseHeight;
  }
  
  public int getIntrinsicWidth()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.getIntrinsicWidth();
    }
    return (int)mVectorState.mVPathRenderer.mBaseWidth;
  }
  
  public int getOpacity()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.getOpacity();
    }
    return -3;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public float getPixelSize()
  {
    Object localObject = mVectorState;
    if (localObject != null)
    {
      localObject = mVPathRenderer;
      if (localObject != null)
      {
        float f1 = mBaseWidth;
        if (f1 != 0.0F)
        {
          float f2 = mBaseHeight;
          if (f2 != 0.0F)
          {
            float f3 = mViewportHeight;
            if (f3 != 0.0F)
            {
              float f4 = mViewportWidth;
              if (f4 != 0.0F) {
                return Math.min(f4 / f1, f3 / f2);
              }
            }
          }
        }
      }
    }
    return 1.0F;
  }
  
  public Object getTargetByName(String paramString)
  {
    return mVectorState.mVPathRenderer.mVGTargetsMap.get(paramString);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
    throws XmlPullParserException, IOException
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      localDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
      return;
    }
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    Object localObject = mDelegateDrawable;
    if (localObject != null)
    {
      DrawableCompat.inflate((Drawable)localObject, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    localObject = mVectorState;
    mVPathRenderer = new VPathRenderer();
    TypedArray localTypedArray = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY);
    updateStateFromTypedArray(localTypedArray, paramXmlPullParser, paramTheme);
    localTypedArray.recycle();
    mChangingConfigurations = getChangingConfigurations();
    mCacheDirty = true;
    inflateInternal(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    mTintFilter = updateTintFilter(mTintFilter, mTint, mTintMode);
  }
  
  public void invalidateSelf()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      localDrawable.invalidateSelf();
      return;
    }
    super.invalidateSelf();
  }
  
  public boolean isAutoMirrored()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return DrawableCompat.isAutoMirrored(localDrawable);
    }
    return mVectorState.mAutoMirrored;
  }
  
  public boolean isStateful()
  {
    Object localObject = mDelegateDrawable;
    if (localObject != null) {
      return ((Drawable)localObject).isStateful();
    }
    if (!super.isStateful())
    {
      localObject = mVectorState;
      if (localObject != null)
      {
        if (!((VectorDrawableCompatState)localObject).isStateful())
        {
          localObject = mVectorState.mTint;
          if ((localObject != null) && (((ColorStateList)localObject).isStateful())) {}
        }
      }
      else {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public Drawable mutate()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      localDrawable.mutate();
      return this;
    }
    if ((!mMutated) && (super.mutate() == this))
    {
      mVectorState = new VectorDrawableCompatState(mVectorState);
      mMutated = true;
    }
    return this;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      localDrawable.setBounds(paramRect);
    }
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    Object localObject = mDelegateDrawable;
    if (localObject != null) {
      return ((Drawable)localObject).setState(paramArrayOfInt);
    }
    boolean bool1 = false;
    localObject = mVectorState;
    ColorStateList localColorStateList = mTint;
    boolean bool2 = true;
    boolean bool3 = bool1;
    if (localColorStateList != null)
    {
      PorterDuff.Mode localMode = mTintMode;
      bool3 = bool1;
      if (localMode != null)
      {
        mTintFilter = updateTintFilter(mTintFilter, localColorStateList, localMode);
        invalidateSelf();
        bool3 = true;
      }
    }
    if ((((VectorDrawableCompatState)localObject).isStateful()) && (((VectorDrawableCompatState)localObject).onStateChanged(paramArrayOfInt)))
    {
      invalidateSelf();
      bool3 = bool2;
    }
    return bool3;
  }
  
  public void scheduleSelf(Runnable paramRunnable, long paramLong)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      localDrawable.scheduleSelf(paramRunnable, paramLong);
      return;
    }
    super.scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAllowCaching(boolean paramBoolean)
  {
    mAllowCaching = paramBoolean;
  }
  
  public void setAlpha(int paramInt)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      localDrawable.setAlpha(paramInt);
      return;
    }
    if (mVectorState.mVPathRenderer.getRootAlpha() != paramInt)
    {
      mVectorState.mVPathRenderer.setRootAlpha(paramInt);
      invalidateSelf();
    }
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      DrawableCompat.setAutoMirrored(localDrawable, paramBoolean);
      return;
    }
    mVectorState.mAutoMirrored = paramBoolean;
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      localDrawable.setColorFilter(paramColorFilter);
      return;
    }
    mColorFilter = paramColorFilter;
    invalidateSelf();
  }
  
  public void setTint(int paramInt)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      DrawableCompat.setTint(localDrawable, paramInt);
      return;
    }
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    Object localObject = mDelegateDrawable;
    if (localObject != null)
    {
      DrawableCompat.setTintList((Drawable)localObject, paramColorStateList);
      return;
    }
    localObject = mVectorState;
    if (mTint != paramColorStateList)
    {
      mTint = paramColorStateList;
      mTintFilter = updateTintFilter(mTintFilter, paramColorStateList, mTintMode);
      invalidateSelf();
    }
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    Object localObject = mDelegateDrawable;
    if (localObject != null)
    {
      DrawableCompat.setTintMode((Drawable)localObject, paramMode);
      return;
    }
    localObject = mVectorState;
    if (mTintMode != paramMode)
    {
      mTintMode = paramMode;
      mTintFilter = updateTintFilter(mTintFilter, mTint, paramMode);
      invalidateSelf();
    }
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.setVisible(paramBoolean1, paramBoolean2);
    }
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void unscheduleSelf(Runnable paramRunnable)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      localDrawable.unscheduleSelf(paramRunnable);
      return;
    }
    super.unscheduleSelf(paramRunnable);
  }
  
  public PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter paramPorterDuffColorFilter, ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList != null) && (paramMode != null)) {
      return new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
    }
    return null;
  }
  
  public static class VClipPath
    extends VectorDrawableCompat.VPath
  {
    public VClipPath() {}
    
    public VClipPath(VClipPath paramVClipPath)
    {
      super();
    }
    
    private void updateStateFromTypedArray(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
    {
      String str = paramTypedArray.getString(0);
      if (str != null) {
        mPathName = str;
      }
      str = paramTypedArray.getString(1);
      if (str != null) {
        mNodes = PathParser.createNodesFromPathData(str);
      }
      mFillRule = TypedArrayUtils.getNamedInt(paramTypedArray, paramXmlPullParser, "fillType", 2, 0);
    }
    
    public void inflate(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
    {
      if (!TypedArrayUtils.hasAttribute(paramXmlPullParser, "pathData")) {
        return;
      }
      paramResources = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH);
      updateStateFromTypedArray(paramResources, paramXmlPullParser);
      paramResources.recycle();
    }
    
    public boolean isClipPath()
    {
      return true;
    }
  }
  
  public static class VFullPath
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
    
    public VFullPath() {}
    
    public VFullPath(VFullPath paramVFullPath)
    {
      super();
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
  
  public static class VGroup
    extends VectorDrawableCompat.VObject
  {
    public int mChangingConfigurations;
    public final ArrayList<VectorDrawableCompat.VObject> mChildren = new ArrayList();
    private String mGroupName;
    public final Matrix mLocalMatrix;
    private float mPivotX = 0.0F;
    private float mPivotY = 0.0F;
    public float mRotate = 0.0F;
    private float mScaleX = 1.0F;
    private float mScaleY = 1.0F;
    public final Matrix mStackedMatrix = new Matrix();
    private int[] mThemeAttrs;
    private float mTranslateX = 0.0F;
    private float mTranslateY = 0.0F;
    
    public VGroup()
    {
      super();
      mLocalMatrix = new Matrix();
      mGroupName = null;
    }
    
    public VGroup(VGroup paramVGroup, ArrayMap<String, Object> paramArrayMap)
    {
      super();
      Object localObject1 = new Matrix();
      mLocalMatrix = ((Matrix)localObject1);
      mGroupName = null;
      mRotate = mRotate;
      mPivotX = mPivotX;
      mPivotY = mPivotY;
      mScaleX = mScaleX;
      mScaleY = mScaleY;
      mTranslateX = mTranslateX;
      mTranslateY = mTranslateY;
      mThemeAttrs = mThemeAttrs;
      Object localObject2 = mGroupName;
      mGroupName = ((String)localObject2);
      mChangingConfigurations = mChangingConfigurations;
      if (localObject2 != null) {
        paramArrayMap.put(localObject2, this);
      }
      ((Matrix)localObject1).set(mLocalMatrix);
      localObject2 = mChildren;
      int i = 0;
      while (i < ((ArrayList)localObject2).size())
      {
        paramVGroup = ((ArrayList)localObject2).get(i);
        if ((paramVGroup instanceof VGroup))
        {
          paramVGroup = (VGroup)paramVGroup;
          mChildren.add(new VGroup(paramVGroup, paramArrayMap));
        }
        else
        {
          if ((paramVGroup instanceof VectorDrawableCompat.VFullPath))
          {
            paramVGroup = new VectorDrawableCompat.VFullPath((VectorDrawableCompat.VFullPath)paramVGroup);
          }
          else
          {
            if (!(paramVGroup instanceof VectorDrawableCompat.VClipPath)) {
              break label316;
            }
            paramVGroup = new VectorDrawableCompat.VClipPath((VectorDrawableCompat.VClipPath)paramVGroup);
          }
          mChildren.add(paramVGroup);
          localObject1 = mPathName;
          if (localObject1 != null) {
            paramArrayMap.put(localObject1, paramVGroup);
          }
        }
        i++;
        continue;
        label316:
        throw new IllegalStateException("Unknown object in the tree!");
      }
    }
    
    private void updateLocalMatrix()
    {
      mLocalMatrix.reset();
      mLocalMatrix.postTranslate(-mPivotX, -mPivotY);
      mLocalMatrix.postScale(mScaleX, mScaleY);
      mLocalMatrix.postRotate(mRotate, 0.0F, 0.0F);
      mLocalMatrix.postTranslate(mTranslateX + mPivotX, mTranslateY + mPivotY);
    }
    
    private void updateStateFromTypedArray(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
    {
      mThemeAttrs = null;
      mRotate = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "rotation", 5, mRotate);
      mPivotX = paramTypedArray.getFloat(1, mPivotX);
      mPivotY = paramTypedArray.getFloat(2, mPivotY);
      mScaleX = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "scaleX", 3, mScaleX);
      mScaleY = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "scaleY", 4, mScaleY);
      mTranslateX = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "translateX", 6, mTranslateX);
      mTranslateY = TypedArrayUtils.getNamedFloat(paramTypedArray, paramXmlPullParser, "translateY", 7, mTranslateY);
      paramTypedArray = paramTypedArray.getString(0);
      if (paramTypedArray != null) {
        mGroupName = paramTypedArray;
      }
      updateLocalMatrix();
    }
    
    public String getGroupName()
    {
      return mGroupName;
    }
    
    public Matrix getLocalMatrix()
    {
      return mLocalMatrix;
    }
    
    public float getPivotX()
    {
      return mPivotX;
    }
    
    public float getPivotY()
    {
      return mPivotY;
    }
    
    public float getRotation()
    {
      return mRotate;
    }
    
    public float getScaleX()
    {
      return mScaleX;
    }
    
    public float getScaleY()
    {
      return mScaleY;
    }
    
    public float getTranslateX()
    {
      return mTranslateX;
    }
    
    public float getTranslateY()
    {
      return mTranslateY;
    }
    
    public void inflate(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
    {
      paramResources = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP);
      updateStateFromTypedArray(paramResources, paramXmlPullParser);
      paramResources.recycle();
    }
    
    public boolean isStateful()
    {
      for (int i = 0; i < mChildren.size(); i++) {
        if (((VectorDrawableCompat.VObject)mChildren.get(i)).isStateful()) {
          return true;
        }
      }
      return false;
    }
    
    public boolean onStateChanged(int[] paramArrayOfInt)
    {
      int i = 0;
      boolean bool = false;
      while (i < mChildren.size())
      {
        bool |= ((VectorDrawableCompat.VObject)mChildren.get(i)).onStateChanged(paramArrayOfInt);
        i++;
      }
      return bool;
    }
    
    public void setPivotX(float paramFloat)
    {
      if (paramFloat != mPivotX)
      {
        mPivotX = paramFloat;
        updateLocalMatrix();
      }
    }
    
    public void setPivotY(float paramFloat)
    {
      if (paramFloat != mPivotY)
      {
        mPivotY = paramFloat;
        updateLocalMatrix();
      }
    }
    
    public void setRotation(float paramFloat)
    {
      if (paramFloat != mRotate)
      {
        mRotate = paramFloat;
        updateLocalMatrix();
      }
    }
    
    public void setScaleX(float paramFloat)
    {
      if (paramFloat != mScaleX)
      {
        mScaleX = paramFloat;
        updateLocalMatrix();
      }
    }
    
    public void setScaleY(float paramFloat)
    {
      if (paramFloat != mScaleY)
      {
        mScaleY = paramFloat;
        updateLocalMatrix();
      }
    }
    
    public void setTranslateX(float paramFloat)
    {
      if (paramFloat != mTranslateX)
      {
        mTranslateX = paramFloat;
        updateLocalMatrix();
      }
    }
    
    public void setTranslateY(float paramFloat)
    {
      if (paramFloat != mTranslateY)
      {
        mTranslateY = paramFloat;
        updateLocalMatrix();
      }
    }
  }
  
  public static abstract class VObject
  {
    public boolean isStateful()
    {
      return false;
    }
    
    public boolean onStateChanged(int[] paramArrayOfInt)
    {
      return false;
    }
  }
  
  public static abstract class VPath
    extends VectorDrawableCompat.VObject
  {
    public static final int FILL_TYPE_WINDING = 0;
    public int mChangingConfigurations;
    public int mFillRule = 0;
    public PathParser.PathDataNode[] mNodes = null;
    public String mPathName;
    
    public VPath()
    {
      super();
    }
    
    public VPath(VPath paramVPath)
    {
      super();
      mPathName = mPathName;
      mChangingConfigurations = mChangingConfigurations;
      mNodes = PathParser.deepCopyNodes(mNodes);
    }
    
    public void applyTheme(Resources.Theme paramTheme) {}
    
    public boolean canApplyTheme()
    {
      return false;
    }
    
    public PathParser.PathDataNode[] getPathData()
    {
      return mNodes;
    }
    
    public String getPathName()
    {
      return mPathName;
    }
    
    public boolean isClipPath()
    {
      return false;
    }
    
    public String nodesToString(PathParser.PathDataNode[] paramArrayOfPathDataNode)
    {
      Object localObject = " ";
      for (int i = 0; i < paramArrayOfPathDataNode.length; i++)
      {
        localObject = z2.t((String)localObject);
        ((StringBuilder)localObject).append(mType);
        ((StringBuilder)localObject).append(":");
        localObject = ((StringBuilder)localObject).toString();
        float[] arrayOfFloat = mParams;
        for (int j = 0; j < arrayOfFloat.length; j++)
        {
          localObject = z2.t((String)localObject);
          ((StringBuilder)localObject).append(arrayOfFloat[j]);
          ((StringBuilder)localObject).append(",");
          localObject = ((StringBuilder)localObject).toString();
        }
      }
      return (String)localObject;
    }
    
    public void printVPath(int paramInt)
    {
      Object localObject = "";
      for (int i = 0; i < paramInt; i++) {
        localObject = z2.o((String)localObject, "    ");
      }
      localObject = z2.u((String)localObject, "current path is :");
      ((StringBuilder)localObject).append(mPathName);
      ((StringBuilder)localObject).append(" pathData is ");
      ((StringBuilder)localObject).append(nodesToString(mNodes));
      Log.v("VectorDrawableCompat", ((StringBuilder)localObject).toString());
    }
    
    public void setPathData(PathParser.PathDataNode[] paramArrayOfPathDataNode)
    {
      if (!PathParser.canMorph(mNodes, paramArrayOfPathDataNode)) {
        mNodes = PathParser.deepCopyNodes(paramArrayOfPathDataNode);
      } else {
        PathParser.updateNodes(mNodes, paramArrayOfPathDataNode);
      }
    }
    
    public void toPath(Path paramPath)
    {
      paramPath.reset();
      PathParser.PathDataNode[] arrayOfPathDataNode = mNodes;
      if (arrayOfPathDataNode != null) {
        PathParser.PathDataNode.nodesToPath(arrayOfPathDataNode, paramPath);
      }
    }
  }
  
  public static class VPathRenderer
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
    
    public VPathRenderer()
    {
      mVGTargetsMap = new ArrayMap();
      mRootGroup = new VectorDrawableCompat.VGroup();
      mPath = new Path();
      mRenderPath = new Path();
    }
    
    public VPathRenderer(VPathRenderer paramVPathRenderer)
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
  
  public static class VectorDrawableCompatState
    extends Drawable.ConstantState
  {
    public boolean mAutoMirrored;
    public boolean mCacheDirty;
    public boolean mCachedAutoMirrored;
    public Bitmap mCachedBitmap;
    public int mCachedRootAlpha;
    public int[] mCachedThemeAttrs;
    public ColorStateList mCachedTint;
    public PorterDuff.Mode mCachedTintMode;
    public int mChangingConfigurations;
    public Paint mTempPaint;
    public ColorStateList mTint = null;
    public PorterDuff.Mode mTintMode = VectorDrawableCompat.DEFAULT_TINT_MODE;
    public VectorDrawableCompat.VPathRenderer mVPathRenderer;
    
    public VectorDrawableCompatState()
    {
      mVPathRenderer = new VectorDrawableCompat.VPathRenderer();
    }
    
    public VectorDrawableCompatState(VectorDrawableCompatState paramVectorDrawableCompatState)
    {
      if (paramVectorDrawableCompatState != null)
      {
        mChangingConfigurations = mChangingConfigurations;
        VectorDrawableCompat.VPathRenderer localVPathRenderer = new VectorDrawableCompat.VPathRenderer(mVPathRenderer);
        mVPathRenderer = localVPathRenderer;
        if (mVPathRenderer.mFillPaint != null) {
          mFillPaint = new Paint(mVPathRenderer.mFillPaint);
        }
        if (mVPathRenderer.mStrokePaint != null) {
          mVPathRenderer.mStrokePaint = new Paint(mVPathRenderer.mStrokePaint);
        }
        mTint = mTint;
        mTintMode = mTintMode;
        mAutoMirrored = mAutoMirrored;
      }
    }
    
    public boolean canReuseBitmap(int paramInt1, int paramInt2)
    {
      return (paramInt1 == mCachedBitmap.getWidth()) && (paramInt2 == mCachedBitmap.getHeight());
    }
    
    public boolean canReuseCache()
    {
      return (!mCacheDirty) && (mCachedTint == mTint) && (mCachedTintMode == mTintMode) && (mCachedAutoMirrored == mAutoMirrored) && (mCachedRootAlpha == mVPathRenderer.getRootAlpha());
    }
    
    public void createCachedBitmapIfNeeded(int paramInt1, int paramInt2)
    {
      if ((mCachedBitmap == null) || (!canReuseBitmap(paramInt1, paramInt2)))
      {
        mCachedBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
        mCacheDirty = true;
      }
    }
    
    public void drawCachedBitmapWithRootAlpha(Canvas paramCanvas, ColorFilter paramColorFilter, Rect paramRect)
    {
      paramColorFilter = getPaint(paramColorFilter);
      paramCanvas.drawBitmap(mCachedBitmap, null, paramRect, paramColorFilter);
    }
    
    public int getChangingConfigurations()
    {
      return mChangingConfigurations;
    }
    
    public Paint getPaint(ColorFilter paramColorFilter)
    {
      if ((!hasTranslucentRoot()) && (paramColorFilter == null)) {
        return null;
      }
      if (mTempPaint == null)
      {
        Paint localPaint = new Paint();
        mTempPaint = localPaint;
        localPaint.setFilterBitmap(true);
      }
      mTempPaint.setAlpha(mVPathRenderer.getRootAlpha());
      mTempPaint.setColorFilter(paramColorFilter);
      return mTempPaint;
    }
    
    public boolean hasTranslucentRoot()
    {
      boolean bool;
      if (mVPathRenderer.getRootAlpha() < 255) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isStateful()
    {
      return mVPathRenderer.isStateful();
    }
    
    @NonNull
    public Drawable newDrawable()
    {
      return new VectorDrawableCompat(this);
    }
    
    @NonNull
    public Drawable newDrawable(Resources paramResources)
    {
      return new VectorDrawableCompat(this);
    }
    
    public boolean onStateChanged(int[] paramArrayOfInt)
    {
      boolean bool = mVPathRenderer.onStateChanged(paramArrayOfInt);
      mCacheDirty |= bool;
      return bool;
    }
    
    public void updateCacheStates()
    {
      mCachedTint = mTint;
      mCachedTintMode = mTintMode;
      mCachedRootAlpha = mVPathRenderer.getRootAlpha();
      mCachedAutoMirrored = mAutoMirrored;
      mCacheDirty = false;
    }
    
    public void updateCachedBitmap(int paramInt1, int paramInt2)
    {
      mCachedBitmap.eraseColor(0);
      Canvas localCanvas = new Canvas(mCachedBitmap);
      mVPathRenderer.draw(localCanvas, paramInt1, paramInt2, null);
    }
  }
  
  @RequiresApi(24)
  public static class VectorDrawableDelegateState
    extends Drawable.ConstantState
  {
    private final Drawable.ConstantState mDelegateState;
    
    public VectorDrawableDelegateState(Drawable.ConstantState paramConstantState)
    {
      mDelegateState = paramConstantState;
    }
    
    public boolean canApplyTheme()
    {
      return mDelegateState.canApplyTheme();
    }
    
    public int getChangingConfigurations()
    {
      return mDelegateState.getChangingConfigurations();
    }
    
    public Drawable newDrawable()
    {
      VectorDrawableCompat localVectorDrawableCompat = new VectorDrawableCompat();
      mDelegateDrawable = ((VectorDrawable)mDelegateState.newDrawable());
      return localVectorDrawableCompat;
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      VectorDrawableCompat localVectorDrawableCompat = new VectorDrawableCompat();
      mDelegateDrawable = ((VectorDrawable)mDelegateState.newDrawable(paramResources));
      return localVectorDrawableCompat;
    }
    
    public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      VectorDrawableCompat localVectorDrawableCompat = new VectorDrawableCompat();
      mDelegateDrawable = ((VectorDrawable)mDelegateState.newDrawable(paramResources, paramTheme));
      return localVectorDrawableCompat;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
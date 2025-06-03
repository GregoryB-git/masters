package androidx.appcompat.widget;

import a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R.styleable;
import androidx.core.view.ViewCompat;
import e;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import z2;

class AppCompatTextViewAutoSizeHelper
{
  private static final int DEFAULT_AUTO_SIZE_GRANULARITY_IN_PX = 1;
  private static final int DEFAULT_AUTO_SIZE_MAX_TEXT_SIZE_IN_SP = 112;
  private static final int DEFAULT_AUTO_SIZE_MIN_TEXT_SIZE_IN_SP = 12;
  private static final String TAG = "ACTVAutoSizeHelper";
  private static final RectF TEMP_RECTF = new RectF();
  public static final float UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE = -1.0F;
  private static final int VERY_WIDE = 1048576;
  @SuppressLint({"BanConcurrentHashMap"})
  private static ConcurrentHashMap<String, Field> sTextViewFieldByNameCache = new ConcurrentHashMap();
  @SuppressLint({"BanConcurrentHashMap"})
  private static ConcurrentHashMap<String, Method> sTextViewMethodByNameCache = new ConcurrentHashMap();
  private float mAutoSizeMaxTextSizeInPx = -1.0F;
  private float mAutoSizeMinTextSizeInPx = -1.0F;
  private float mAutoSizeStepGranularityInPx = -1.0F;
  private int[] mAutoSizeTextSizesInPx = new int[0];
  private int mAutoSizeTextType = 0;
  private final Context mContext;
  private boolean mHasPresetAutoSizeValues = false;
  private final Impl mImpl;
  private boolean mNeedsAutoSizeText = false;
  private TextPaint mTempTextPaint;
  @NonNull
  private final TextView mTextView;
  
  public AppCompatTextViewAutoSizeHelper(@NonNull TextView paramTextView)
  {
    mTextView = paramTextView;
    mContext = paramTextView.getContext();
    if (Build.VERSION.SDK_INT >= 29) {
      mImpl = new Impl29();
    } else {
      mImpl = new Impl23();
    }
  }
  
  private static <T> T accessAndReturnWithDefault(@NonNull Object paramObject, @NonNull String paramString, @NonNull T paramT)
  {
    try
    {
      localObject = getTextViewField(paramString);
      if (localObject == null) {
        return paramT;
      }
      paramObject = ((Field)localObject).get(paramObject);
      return (T)paramObject;
    }
    catch (IllegalAccessException paramObject)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Failed to access TextView#");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(" member");
      Log.w("ACTVAutoSizeHelper", ((StringBuilder)localObject).toString(), (Throwable)paramObject);
    }
    return paramT;
  }
  
  private int[] cleanupAutoSizePresetSizes(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    if (i == 0) {
      return paramArrayOfInt;
    }
    Arrays.sort(paramArrayOfInt);
    ArrayList localArrayList = new ArrayList();
    int j = 0;
    for (int k = 0; k < i; k++)
    {
      int m = paramArrayOfInt[k];
      if ((m > 0) && (Collections.binarySearch(localArrayList, Integer.valueOf(m)) < 0)) {
        localArrayList.add(Integer.valueOf(m));
      }
    }
    if (i == localArrayList.size()) {
      return paramArrayOfInt;
    }
    i = localArrayList.size();
    paramArrayOfInt = new int[i];
    for (k = j; k < i; k++) {
      paramArrayOfInt[k] = ((Integer)localArrayList.get(k)).intValue();
    }
    return paramArrayOfInt;
  }
  
  private void clearAutoSizeConfiguration()
  {
    mAutoSizeTextType = 0;
    mAutoSizeMinTextSizeInPx = -1.0F;
    mAutoSizeMaxTextSizeInPx = -1.0F;
    mAutoSizeStepGranularityInPx = -1.0F;
    mAutoSizeTextSizesInPx = new int[0];
    mNeedsAutoSizeText = false;
  }
  
  private StaticLayout createStaticLayoutForMeasuringPre16(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt)
  {
    float f1 = ((Float)accessAndReturnWithDefault(mTextView, "mSpacingMult", Float.valueOf(1.0F))).floatValue();
    float f2 = ((Float)accessAndReturnWithDefault(mTextView, "mSpacingAdd", Float.valueOf(0.0F))).floatValue();
    boolean bool = ((Boolean)accessAndReturnWithDefault(mTextView, "mIncludePad", Boolean.TRUE)).booleanValue();
    return new StaticLayout(paramCharSequence, mTempTextPaint, paramInt, paramAlignment, f1, f2, bool);
  }
  
  private int findLargestTextSizeWhichFits(RectF paramRectF)
  {
    int i = mAutoSizeTextSizesInPx.length;
    if (i != 0)
    {
      int j = 0;
      int k = 1;
      i--;
      while (k <= i)
      {
        j = (k + i) / 2;
        if (suggestedSizeFitsInSpace(mAutoSizeTextSizesInPx[j], paramRectF))
        {
          int m = j + 1;
          j = k;
          k = m;
        }
        else
        {
          j--;
          i = j;
        }
      }
      return mAutoSizeTextSizesInPx[j];
    }
    throw new IllegalStateException("No available text sizes to choose from.");
  }
  
  @Nullable
  private static Field getTextViewField(@NonNull String paramString)
  {
    try
    {
      Field localField = (Field)sTextViewFieldByNameCache.get(paramString);
      localObject = localField;
      if (localField == null)
      {
        localField = TextView.class.getDeclaredField(paramString);
        localObject = localField;
        if (localField != null)
        {
          localField.setAccessible(true);
          sTextViewFieldByNameCache.put(paramString, localField);
          localObject = localField;
        }
      }
      return (Field)localObject;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Failed to access TextView#");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(" member");
      Log.w("ACTVAutoSizeHelper", ((StringBuilder)localObject).toString(), localNoSuchFieldException);
    }
    return null;
  }
  
  @Nullable
  private static Method getTextViewMethod(@NonNull String paramString)
  {
    try
    {
      Method localMethod = (Method)sTextViewMethodByNameCache.get(paramString);
      localObject = localMethod;
      if (localMethod == null)
      {
        localMethod = TextView.class.getDeclaredMethod(paramString, new Class[0]);
        localObject = localMethod;
        if (localMethod != null)
        {
          localMethod.setAccessible(true);
          sTextViewMethodByNameCache.put(paramString, localMethod);
          localObject = localMethod;
        }
      }
      return (Method)localObject;
    }
    catch (Exception localException)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Failed to retrieve TextView#");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append("() method");
      Log.w("ACTVAutoSizeHelper", ((StringBuilder)localObject).toString(), localException);
    }
    return null;
  }
  
  /* Error */
  public static <T> T invokeAndReturnWithDefault(@NonNull Object paramObject, @NonNull String paramString, @NonNull T paramT)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 282	androidx/appcompat/widget/AppCompatTextViewAutoSizeHelper:getTextViewMethod	(Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   4: aload_0
    //   5: iconst_0
    //   6: anewarray 4	java/lang/Object
    //   9: invokevirtual 286	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   12: astore_0
    //   13: aload_0
    //   14: astore_2
    //   15: goto +49 -> 64
    //   18: astore_0
    //   19: goto +47 -> 66
    //   22: astore_0
    //   23: new 135	java/lang/StringBuilder
    //   26: astore_3
    //   27: aload_3
    //   28: invokespecial 136	java/lang/StringBuilder:<init>	()V
    //   31: aload_3
    //   32: ldc_w 288
    //   35: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: pop
    //   39: aload_3
    //   40: aload_1
    //   41: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: aload_3
    //   46: ldc_w 279
    //   49: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: ldc 33
    //   55: aload_3
    //   56: invokevirtual 148	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   59: aload_0
    //   60: invokestatic 154	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   63: pop
    //   64: aload_2
    //   65: areturn
    //   66: aload_0
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	paramObject	Object
    //   0	68	1	paramString	String
    //   0	68	2	paramT	T
    //   26	30	3	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   0	13	18	finally
    //   23	64	18	finally
    //   0	13	22	java/lang/Exception
  }
  
  private void setRawTextSize(float paramFloat)
  {
    if (paramFloat != mTextView.getPaint().getTextSize())
    {
      mTextView.getPaint().setTextSize(paramFloat);
      boolean bool = Api18Impl.isInLayout(mTextView);
      if (mTextView.getLayout() != null)
      {
        mNeedsAutoSizeText = false;
        try
        {
          Method localMethod = getTextViewMethod("nullLayouts");
          if (localMethod != null) {
            localMethod.invoke(mTextView, new Object[0]);
          }
        }
        catch (Exception localException)
        {
          Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", localException);
        }
        if (!bool) {
          mTextView.requestLayout();
        } else {
          mTextView.forceLayout();
        }
        mTextView.invalidate();
      }
    }
  }
  
  private boolean setupAutoSizeText()
  {
    boolean bool = supportsAutoSizeText();
    int i = 0;
    if ((bool) && (mAutoSizeTextType == 1))
    {
      if ((!mHasPresetAutoSizeValues) || (mAutoSizeTextSizesInPx.length == 0))
      {
        int j = (int)Math.floor((mAutoSizeMaxTextSizeInPx - mAutoSizeMinTextSizeInPx) / mAutoSizeStepGranularityInPx) + 1;
        int[] arrayOfInt = new int[j];
        while (i < j)
        {
          float f = mAutoSizeMinTextSizeInPx;
          arrayOfInt[i] = Math.round(i * mAutoSizeStepGranularityInPx + f);
          i++;
        }
        mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(arrayOfInt);
      }
      mNeedsAutoSizeText = true;
    }
    else
    {
      mNeedsAutoSizeText = false;
    }
    return mNeedsAutoSizeText;
  }
  
  private void setupAutoSizeUniformPresetSizes(TypedArray paramTypedArray)
  {
    int i = paramTypedArray.length();
    int[] arrayOfInt = new int[i];
    if (i > 0)
    {
      for (int j = 0; j < i; j++) {
        arrayOfInt[j] = paramTypedArray.getDimensionPixelSize(j, -1);
      }
      mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(arrayOfInt);
      setupAutoSizeUniformPresetSizesConfiguration();
    }
  }
  
  private boolean setupAutoSizeUniformPresetSizesConfiguration()
  {
    int[] arrayOfInt = mAutoSizeTextSizesInPx;
    int i = arrayOfInt.length;
    boolean bool;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    }
    mHasPresetAutoSizeValues = bool;
    if (bool)
    {
      mAutoSizeTextType = 1;
      mAutoSizeMinTextSizeInPx = arrayOfInt[0];
      mAutoSizeMaxTextSizeInPx = arrayOfInt[(i - 1)];
      mAutoSizeStepGranularityInPx = -1.0F;
    }
    return bool;
  }
  
  private boolean suggestedSizeFitsInSpace(int paramInt, RectF paramRectF)
  {
    Object localObject1 = mTextView.getText();
    Object localObject2 = mTextView.getTransformationMethod();
    Object localObject3 = localObject1;
    if (localObject2 != null)
    {
      localObject2 = ((TransformationMethod)localObject2).getTransformation((CharSequence)localObject1, mTextView);
      localObject3 = localObject1;
      if (localObject2 != null) {
        localObject3 = localObject2;
      }
    }
    int i = Api16Impl.getMaxLines(mTextView);
    initTempTextPaint(paramInt);
    localObject1 = createLayout((CharSequence)localObject3, (Layout.Alignment)invokeAndReturnWithDefault(mTextView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(right), i);
    if ((i != -1) && ((((StaticLayout)localObject1).getLineCount() > i) || (((Layout)localObject1).getLineEnd(((StaticLayout)localObject1).getLineCount() - 1) != ((CharSequence)localObject3).length()))) {
      return false;
    }
    return ((Layout)localObject1).getHeight() <= bottom;
  }
  
  private boolean supportsAutoSizeText()
  {
    return mTextView instanceof AppCompatEditText ^ true;
  }
  
  private void validateAndSetAutoSizeTextTypeUniformConfiguration(float paramFloat1, float paramFloat2, float paramFloat3)
    throws IllegalArgumentException
  {
    if (paramFloat1 > 0.0F)
    {
      if (paramFloat2 > paramFloat1)
      {
        if (paramFloat3 > 0.0F)
        {
          mAutoSizeTextType = 1;
          mAutoSizeMinTextSizeInPx = paramFloat1;
          mAutoSizeMaxTextSizeInPx = paramFloat2;
          mAutoSizeStepGranularityInPx = paramFloat3;
          mHasPresetAutoSizeValues = false;
          return;
        }
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("The auto-size step granularity (");
        localStringBuilder.append(paramFloat3);
        localStringBuilder.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Maximum auto-size text size (");
      localStringBuilder.append(paramFloat2);
      localStringBuilder.append("px) is less or equal to minimum auto-size text size (");
      localStringBuilder.append(paramFloat1);
      localStringBuilder.append("px)");
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Minimum auto-size text size (");
    localStringBuilder.append(paramFloat1);
    localStringBuilder.append("px) is less or equal to (0px)");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void autoSizeText()
  {
    if (!isAutoSizeEnabled()) {
      return;
    }
    if (mNeedsAutoSizeText)
    {
      if ((mTextView.getMeasuredHeight() > 0) && (mTextView.getMeasuredWidth() > 0))
      {
        int i;
        if (mImpl.isHorizontallyScrollable(mTextView)) {
          i = 1048576;
        } else {
          i = mTextView.getMeasuredWidth() - mTextView.getTotalPaddingLeft() - mTextView.getTotalPaddingRight();
        }
        int j = mTextView.getHeight() - mTextView.getCompoundPaddingBottom() - mTextView.getCompoundPaddingTop();
        if ((i > 0) && (j > 0)) {
          synchronized (TEMP_RECTF)
          {
            ???.setEmpty();
            right = i;
            bottom = j;
            float f = findLargestTextSizeWhichFits(???);
            if (f != mTextView.getTextSize()) {
              setTextSizeInternal(0, f);
            }
          }
        }
      }
      return;
    }
    mNeedsAutoSizeText = true;
  }
  
  @NonNull
  @VisibleForTesting
  public StaticLayout createLayout(@NonNull CharSequence paramCharSequence, @NonNull Layout.Alignment paramAlignment, int paramInt1, int paramInt2)
  {
    return Api23Impl.createStaticLayoutForMeasuring(paramCharSequence, paramAlignment, paramInt1, paramInt2, mTextView, mTempTextPaint, mImpl);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int getAutoSizeMaxTextSize()
  {
    return Math.round(mAutoSizeMaxTextSizeInPx);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int getAutoSizeMinTextSize()
  {
    return Math.round(mAutoSizeMinTextSizeInPx);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int getAutoSizeStepGranularity()
  {
    return Math.round(mAutoSizeStepGranularityInPx);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int[] getAutoSizeTextAvailableSizes()
  {
    return mAutoSizeTextSizesInPx;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int getAutoSizeTextType()
  {
    return mAutoSizeTextType;
  }
  
  @VisibleForTesting
  public void initTempTextPaint(int paramInt)
  {
    TextPaint localTextPaint = mTempTextPaint;
    if (localTextPaint == null) {
      mTempTextPaint = new TextPaint();
    } else {
      localTextPaint.reset();
    }
    mTempTextPaint.set(mTextView.getPaint());
    mTempTextPaint.setTextSize(paramInt);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public boolean isAutoSizeEnabled()
  {
    boolean bool;
    if ((supportsAutoSizeText()) && (mAutoSizeTextType != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void loadFromAttributes(@Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject = mContext;
    int[] arrayOfInt = R.styleable.AppCompatTextView;
    localObject = ((Context)localObject).obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 0);
    TextView localTextView = mTextView;
    ViewCompat.saveAttributeDataForStyleable(localTextView, localTextView.getContext(), arrayOfInt, paramAttributeSet, (TypedArray)localObject, paramInt, 0);
    paramInt = R.styleable.AppCompatTextView_autoSizeTextType;
    if (((TypedArray)localObject).hasValue(paramInt)) {
      mAutoSizeTextType = ((TypedArray)localObject).getInt(paramInt, 0);
    }
    paramInt = R.styleable.AppCompatTextView_autoSizeStepGranularity;
    float f1;
    if (((TypedArray)localObject).hasValue(paramInt)) {
      f1 = ((TypedArray)localObject).getDimension(paramInt, -1.0F);
    } else {
      f1 = -1.0F;
    }
    paramInt = R.styleable.AppCompatTextView_autoSizeMinTextSize;
    float f2;
    if (((TypedArray)localObject).hasValue(paramInt)) {
      f2 = ((TypedArray)localObject).getDimension(paramInt, -1.0F);
    } else {
      f2 = -1.0F;
    }
    paramInt = R.styleable.AppCompatTextView_autoSizeMaxTextSize;
    float f3;
    if (((TypedArray)localObject).hasValue(paramInt)) {
      f3 = ((TypedArray)localObject).getDimension(paramInt, -1.0F);
    } else {
      f3 = -1.0F;
    }
    paramInt = R.styleable.AppCompatTextView_autoSizePresetSizes;
    if (((TypedArray)localObject).hasValue(paramInt))
    {
      paramInt = ((TypedArray)localObject).getResourceId(paramInt, 0);
      if (paramInt > 0)
      {
        paramAttributeSet = ((TypedArray)localObject).getResources().obtainTypedArray(paramInt);
        setupAutoSizeUniformPresetSizes(paramAttributeSet);
        paramAttributeSet.recycle();
      }
    }
    ((TypedArray)localObject).recycle();
    if (supportsAutoSizeText())
    {
      if (mAutoSizeTextType == 1)
      {
        if (!mHasPresetAutoSizeValues)
        {
          paramAttributeSet = mContext.getResources().getDisplayMetrics();
          float f4 = f2;
          if (f2 == -1.0F) {
            f4 = TypedValue.applyDimension(2, 12.0F, paramAttributeSet);
          }
          f2 = f3;
          if (f3 == -1.0F) {
            f2 = TypedValue.applyDimension(2, 112.0F, paramAttributeSet);
          }
          f3 = f1;
          if (f1 == -1.0F) {
            f3 = 1.0F;
          }
          validateAndSetAutoSizeTextTypeUniformConfiguration(f4, f2, f3);
        }
        setupAutoSizeText();
      }
    }
    else {
      mAutoSizeTextType = 0;
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws IllegalArgumentException
  {
    if (supportsAutoSizeText())
    {
      DisplayMetrics localDisplayMetrics = mContext.getResources().getDisplayMetrics();
      validateAndSetAutoSizeTextTypeUniformConfiguration(TypedValue.applyDimension(paramInt4, paramInt1, localDisplayMetrics), TypedValue.applyDimension(paramInt4, paramInt2, localDisplayMetrics), TypedValue.applyDimension(paramInt4, paramInt3, localDisplayMetrics));
      if (setupAutoSizeText()) {
        autoSizeText();
      }
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] paramArrayOfInt, int paramInt)
    throws IllegalArgumentException
  {
    if (supportsAutoSizeText())
    {
      int i = paramArrayOfInt.length;
      int j = 0;
      if (i > 0)
      {
        int[] arrayOfInt = new int[i];
        Object localObject;
        if (paramInt == 0)
        {
          localObject = Arrays.copyOf(paramArrayOfInt, i);
        }
        else
        {
          DisplayMetrics localDisplayMetrics = mContext.getResources().getDisplayMetrics();
          for (;;)
          {
            localObject = arrayOfInt;
            if (j >= i) {
              break;
            }
            arrayOfInt[j] = Math.round(TypedValue.applyDimension(paramInt, paramArrayOfInt[j], localDisplayMetrics));
            j++;
          }
        }
        mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes((int[])localObject);
        if (!setupAutoSizeUniformPresetSizesConfiguration())
        {
          localObject = z2.t("None of the preset sizes is valid: ");
          ((StringBuilder)localObject).append(Arrays.toString(paramArrayOfInt));
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      else
      {
        mHasPresetAutoSizeValues = false;
      }
      if (setupAutoSizeText()) {
        autoSizeText();
      }
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    if (supportsAutoSizeText()) {
      if (paramInt != 0)
      {
        if (paramInt == 1)
        {
          DisplayMetrics localDisplayMetrics = mContext.getResources().getDisplayMetrics();
          validateAndSetAutoSizeTextTypeUniformConfiguration(TypedValue.applyDimension(2, 12.0F, localDisplayMetrics), TypedValue.applyDimension(2, 112.0F, localDisplayMetrics), 1.0F);
          if (setupAutoSizeText()) {
            autoSizeText();
          }
        }
        else
        {
          throw new IllegalArgumentException(a.f("Unknown auto-size text type: ", paramInt));
        }
      }
      else {
        clearAutoSizeConfiguration();
      }
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setTextSizeInternal(int paramInt, float paramFloat)
  {
    Object localObject = mContext;
    if (localObject == null) {
      localObject = Resources.getSystem();
    } else {
      localObject = ((Context)localObject).getResources();
    }
    setRawTextSize(TypedValue.applyDimension(paramInt, paramFloat, ((Resources)localObject).getDisplayMetrics()));
  }
  
  @RequiresApi(16)
  public static final class Api16Impl
  {
    @DoNotInline
    @NonNull
    public static StaticLayout createStaticLayoutForMeasuring(@NonNull CharSequence paramCharSequence, @NonNull Layout.Alignment paramAlignment, int paramInt, @NonNull TextView paramTextView, @NonNull TextPaint paramTextPaint)
    {
      return new StaticLayout(paramCharSequence, paramTextPaint, paramInt, paramAlignment, paramTextView.getLineSpacingMultiplier(), paramTextView.getLineSpacingExtra(), paramTextView.getIncludeFontPadding());
    }
    
    @DoNotInline
    public static int getMaxLines(@NonNull TextView paramTextView)
    {
      return paramTextView.getMaxLines();
    }
  }
  
  @RequiresApi(18)
  public static final class Api18Impl
  {
    @DoNotInline
    public static boolean isInLayout(@NonNull View paramView)
    {
      return paramView.isInLayout();
    }
  }
  
  @RequiresApi(23)
  public static final class Api23Impl
  {
    @DoNotInline
    @NonNull
    public static StaticLayout createStaticLayoutForMeasuring(@NonNull CharSequence paramCharSequence, @NonNull Layout.Alignment paramAlignment, int paramInt1, int paramInt2, @NonNull TextView paramTextView, @NonNull TextPaint paramTextPaint, @NonNull AppCompatTextViewAutoSizeHelper.Impl paramImpl)
    {
      paramCharSequence = StaticLayout.Builder.obtain(paramCharSequence, 0, paramCharSequence.length(), paramTextPaint, paramInt1);
      paramAlignment = paramCharSequence.setAlignment(paramAlignment).setLineSpacing(paramTextView.getLineSpacingExtra(), paramTextView.getLineSpacingMultiplier()).setIncludePad(paramTextView.getIncludeFontPadding()).setBreakStrategy(paramTextView.getBreakStrategy()).setHyphenationFrequency(paramTextView.getHyphenationFrequency());
      paramInt1 = paramInt2;
      if (paramInt2 == -1) {
        paramInt1 = Integer.MAX_VALUE;
      }
      paramAlignment.setMaxLines(paramInt1);
      try
      {
        paramImpl.computeAndSetTextDirection(paramCharSequence, paramTextView);
      }
      catch (ClassCastException paramAlignment)
      {
        Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
      }
      return paramCharSequence.build();
    }
  }
  
  public static class Impl
  {
    public void computeAndSetTextDirection(StaticLayout.Builder paramBuilder, TextView paramTextView) {}
    
    public boolean isHorizontallyScrollable(TextView paramTextView)
    {
      return ((Boolean)AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(paramTextView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
  }
  
  @RequiresApi(23)
  public static class Impl23
    extends AppCompatTextViewAutoSizeHelper.Impl
  {
    public void computeAndSetTextDirection(StaticLayout.Builder paramBuilder, TextView paramTextView)
    {
      paramBuilder.setTextDirection((TextDirectionHeuristic)AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(paramTextView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
  }
  
  @RequiresApi(29)
  public static class Impl29
    extends AppCompatTextViewAutoSizeHelper.Impl23
  {
    public void computeAndSetTextDirection(StaticLayout.Builder paramBuilder, TextView paramTextView)
    {
      paramBuilder.setTextDirection(e.g(paramTextView));
    }
    
    public boolean isHorizontallyScrollable(TextView paramTextView)
    {
      return e.A(paramTextView);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
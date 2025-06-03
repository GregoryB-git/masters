package androidx.core.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText.Params.Builder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.core.os.TraceCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import p3;
import z2;

public class PrecomputedTextCompat
  implements Spannable
{
  private static final char LINE_FEED = '\n';
  @GuardedBy("sLock")
  @NonNull
  private static Executor sExecutor;
  private static final Object sLock = new Object();
  @NonNull
  private final int[] mParagraphEnds;
  @NonNull
  private final Params mParams;
  @NonNull
  private final Spannable mText;
  @Nullable
  private final PrecomputedText mWrapped;
  
  @RequiresApi(28)
  private PrecomputedTextCompat(@NonNull PrecomputedText paramPrecomputedText, @NonNull Params paramParams)
  {
    mText = paramPrecomputedText;
    mParams = paramParams;
    mParagraphEnds = null;
    if (Build.VERSION.SDK_INT < 29) {
      paramPrecomputedText = null;
    }
    mWrapped = paramPrecomputedText;
  }
  
  private PrecomputedTextCompat(@NonNull CharSequence paramCharSequence, @NonNull Params paramParams, @NonNull int[] paramArrayOfInt)
  {
    mText = new SpannableString(paramCharSequence);
    mParams = paramParams;
    mParagraphEnds = paramArrayOfInt;
    mWrapped = null;
  }
  
  @SuppressLint({"WrongConstant"})
  public static PrecomputedTextCompat create(@NonNull CharSequence paramCharSequence, @NonNull Params paramParams)
  {
    Preconditions.checkNotNull(paramCharSequence);
    Preconditions.checkNotNull(paramParams);
    try
    {
      TraceCompat.beginSection("PrecomputedText");
      if (Build.VERSION.SDK_INT >= 29)
      {
        localObject = mWrapped;
        if (localObject != null)
        {
          paramCharSequence = new PrecomputedTextCompat(PrecomputedText.create(paramCharSequence, (PrecomputedText.Params)localObject), paramParams);
          return paramCharSequence;
        }
      }
      Object localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      int i = paramCharSequence.length();
      int j = 0;
      while (j < i)
      {
        j = TextUtils.indexOf(paramCharSequence, '\n', j, i);
        if (j < 0) {
          j = i;
        } else {
          j++;
        }
        ((ArrayList)localObject).add(Integer.valueOf(j));
      }
      int[] arrayOfInt = new int[((ArrayList)localObject).size()];
      for (j = 0; j < ((ArrayList)localObject).size(); j++) {
        arrayOfInt[j] = ((Integer)((ArrayList)localObject).get(j)).intValue();
      }
      StaticLayout.Builder.obtain(paramCharSequence, 0, paramCharSequence.length(), paramParams.getTextPaint(), Integer.MAX_VALUE).setBreakStrategy(paramParams.getBreakStrategy()).setHyphenationFrequency(paramParams.getHyphenationFrequency()).setTextDirection(paramParams.getTextDirection()).build();
      paramCharSequence = new PrecomputedTextCompat(paramCharSequence, paramParams, arrayOfInt);
      return paramCharSequence;
    }
    finally
    {
      TraceCompat.endSection();
    }
  }
  
  @UiThread
  public static Future<PrecomputedTextCompat> getTextFuture(@NonNull CharSequence paramCharSequence, @NonNull Params paramParams, @Nullable Executor arg2)
  {
    paramParams = new PrecomputedTextFutureTask(paramParams, paramCharSequence);
    paramCharSequence = ???;
    if (??? == null) {
      synchronized (sLock)
      {
        if (sExecutor == null) {
          sExecutor = Executors.newFixedThreadPool(1);
        }
        paramCharSequence = sExecutor;
      }
    }
    paramCharSequence.execute(paramParams);
    return paramParams;
  }
  
  public char charAt(int paramInt)
  {
    return mText.charAt(paramInt);
  }
  
  @IntRange(from=0L)
  public int getParagraphCount()
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return mWrapped.getParagraphCount();
    }
    return mParagraphEnds.length;
  }
  
  @IntRange(from=0L)
  public int getParagraphEnd(@IntRange(from=0L) int paramInt)
  {
    Preconditions.checkArgumentInRange(paramInt, 0, getParagraphCount(), "paraIndex");
    if (Build.VERSION.SDK_INT >= 29) {
      return mWrapped.getParagraphEnd(paramInt);
    }
    return mParagraphEnds[paramInt];
  }
  
  @IntRange(from=0L)
  public int getParagraphStart(@IntRange(from=0L) int paramInt)
  {
    int i = getParagraphCount();
    int j = 0;
    Preconditions.checkArgumentInRange(paramInt, 0, i, "paraIndex");
    if (Build.VERSION.SDK_INT >= 29) {
      return mWrapped.getParagraphStart(paramInt);
    }
    if (paramInt == 0) {
      paramInt = j;
    } else {
      paramInt = mParagraphEnds[(paramInt - 1)];
    }
    return paramInt;
  }
  
  @NonNull
  public Params getParams()
  {
    return mParams;
  }
  
  @Nullable
  @RequiresApi(28)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public PrecomputedText getPrecomputedText()
  {
    Spannable localSpannable = mText;
    if ((localSpannable instanceof PrecomputedText)) {
      return (PrecomputedText)localSpannable;
    }
    return null;
  }
  
  public int getSpanEnd(Object paramObject)
  {
    return mText.getSpanEnd(paramObject);
  }
  
  public int getSpanFlags(Object paramObject)
  {
    return mText.getSpanFlags(paramObject);
  }
  
  public int getSpanStart(Object paramObject)
  {
    return mText.getSpanStart(paramObject);
  }
  
  public <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return mWrapped.getSpans(paramInt1, paramInt2, paramClass);
    }
    return mText.getSpans(paramInt1, paramInt2, paramClass);
  }
  
  public int length()
  {
    return mText.length();
  }
  
  public int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    return mText.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }
  
  public void removeSpan(Object paramObject)
  {
    if (!(paramObject instanceof MetricAffectingSpan))
    {
      if (Build.VERSION.SDK_INT >= 29) {
        mWrapped.removeSpan(paramObject);
      } else {
        mText.removeSpan(paramObject);
      }
      return;
    }
    throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
  }
  
  public void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!(paramObject instanceof MetricAffectingSpan))
    {
      if (Build.VERSION.SDK_INT >= 29) {
        mWrapped.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
      } else {
        mText.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
      }
      return;
    }
    throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return mText.subSequence(paramInt1, paramInt2);
  }
  
  @NonNull
  public String toString()
  {
    return mText.toString();
  }
  
  public static final class Params
  {
    private final int mBreakStrategy;
    private final int mHyphenationFrequency;
    @NonNull
    private final TextPaint mPaint;
    @Nullable
    private final TextDirectionHeuristic mTextDir;
    public final PrecomputedText.Params mWrapped;
    
    @RequiresApi(28)
    public Params(@NonNull PrecomputedText.Params paramParams)
    {
      mPaint = paramParams.getTextPaint();
      mTextDir = paramParams.getTextDirection();
      mBreakStrategy = paramParams.getBreakStrategy();
      mHyphenationFrequency = paramParams.getHyphenationFrequency();
      if (Build.VERSION.SDK_INT < 29) {
        paramParams = null;
      }
      mWrapped = paramParams;
    }
    
    public Params(@NonNull TextPaint paramTextPaint, @NonNull TextDirectionHeuristic paramTextDirectionHeuristic, int paramInt1, int paramInt2)
    {
      if (Build.VERSION.SDK_INT >= 29) {
        mWrapped = new PrecomputedText.Params.Builder(paramTextPaint).setBreakStrategy(paramInt1).setHyphenationFrequency(paramInt2).setTextDirection(paramTextDirectionHeuristic).build();
      } else {
        mWrapped = null;
      }
      mPaint = paramTextPaint;
      mTextDir = paramTextDirectionHeuristic;
      mBreakStrategy = paramInt1;
      mHyphenationFrequency = paramInt2;
    }
    
    public boolean equals(@Nullable Object paramObject)
    {
      if (paramObject == this) {
        return true;
      }
      if (!(paramObject instanceof Params)) {
        return false;
      }
      paramObject = (Params)paramObject;
      if (!equalsWithoutTextDirection((Params)paramObject)) {
        return false;
      }
      return mTextDir == ((Params)paramObject).getTextDirection();
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean equalsWithoutTextDirection(@NonNull Params paramParams)
    {
      if (mBreakStrategy != paramParams.getBreakStrategy()) {
        return false;
      }
      if (mHyphenationFrequency != paramParams.getHyphenationFrequency()) {
        return false;
      }
      if (mPaint.getTextSize() != paramParams.getTextPaint().getTextSize()) {
        return false;
      }
      if (mPaint.getTextScaleX() != paramParams.getTextPaint().getTextScaleX()) {
        return false;
      }
      if (mPaint.getTextSkewX() != paramParams.getTextPaint().getTextSkewX()) {
        return false;
      }
      if (mPaint.getLetterSpacing() != paramParams.getTextPaint().getLetterSpacing()) {
        return false;
      }
      if (!TextUtils.equals(mPaint.getFontFeatureSettings(), paramParams.getTextPaint().getFontFeatureSettings())) {
        return false;
      }
      if (mPaint.getFlags() != paramParams.getTextPaint().getFlags()) {
        return false;
      }
      if (!mPaint.getTextLocales().equals(paramParams.getTextPaint().getTextLocales())) {
        return false;
      }
      if (mPaint.getTypeface() == null)
      {
        if (paramParams.getTextPaint().getTypeface() != null) {
          return false;
        }
      }
      else if (!mPaint.getTypeface().equals(paramParams.getTextPaint().getTypeface())) {
        return false;
      }
      return true;
    }
    
    @RequiresApi(23)
    public int getBreakStrategy()
    {
      return mBreakStrategy;
    }
    
    @RequiresApi(23)
    public int getHyphenationFrequency()
    {
      return mHyphenationFrequency;
    }
    
    @Nullable
    @RequiresApi(18)
    public TextDirectionHeuristic getTextDirection()
    {
      return mTextDir;
    }
    
    @NonNull
    public TextPaint getTextPaint()
    {
      return mPaint;
    }
    
    public int hashCode()
    {
      return ObjectsCompat.hash(new Object[] { Float.valueOf(mPaint.getTextSize()), Float.valueOf(mPaint.getTextScaleX()), Float.valueOf(mPaint.getTextSkewX()), Float.valueOf(mPaint.getLetterSpacing()), Integer.valueOf(mPaint.getFlags()), mPaint.getTextLocales(), mPaint.getTypeface(), Boolean.valueOf(mPaint.isElegantTextHeight()), mTextDir, Integer.valueOf(mBreakStrategy), Integer.valueOf(mHyphenationFrequency) });
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder1 = new StringBuilder("{");
      StringBuilder localStringBuilder2 = z2.t("textSize=");
      localStringBuilder2.append(mPaint.getTextSize());
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", textScaleX=");
      localStringBuilder2.append(mPaint.getTextScaleX());
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", textSkewX=");
      localStringBuilder2.append(mPaint.getTextSkewX());
      localStringBuilder1.append(localStringBuilder2.toString());
      int i = Build.VERSION.SDK_INT;
      localStringBuilder2 = z2.t(", letterSpacing=");
      localStringBuilder2.append(mPaint.getLetterSpacing());
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", elegantTextHeight=");
      localStringBuilder2.append(mPaint.isElegantTextHeight());
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", textLocale=");
      localStringBuilder2.append(mPaint.getTextLocales());
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", typeface=");
      localStringBuilder2.append(mPaint.getTypeface());
      localStringBuilder1.append(localStringBuilder2.toString());
      if (i >= 26)
      {
        localStringBuilder2 = z2.t(", variationSettings=");
        localStringBuilder2.append(p3.h(mPaint));
        localStringBuilder1.append(localStringBuilder2.toString());
      }
      localStringBuilder2 = z2.t(", textDir=");
      localStringBuilder2.append(mTextDir);
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", breakStrategy=");
      localStringBuilder2.append(mBreakStrategy);
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append(", hyphenationFrequency=");
      localStringBuilder2.append(mHyphenationFrequency);
      localStringBuilder1.append(localStringBuilder2.toString());
      localStringBuilder1.append("}");
      return localStringBuilder1.toString();
    }
    
    public static class Builder
    {
      private int mBreakStrategy;
      private int mHyphenationFrequency;
      @NonNull
      private final TextPaint mPaint;
      private TextDirectionHeuristic mTextDir;
      
      public Builder(@NonNull TextPaint paramTextPaint)
      {
        mPaint = paramTextPaint;
        mBreakStrategy = 1;
        mHyphenationFrequency = 1;
        mTextDir = TextDirectionHeuristics.FIRSTSTRONG_LTR;
      }
      
      @NonNull
      public PrecomputedTextCompat.Params build()
      {
        return new PrecomputedTextCompat.Params(mPaint, mTextDir, mBreakStrategy, mHyphenationFrequency);
      }
      
      @RequiresApi(23)
      public Builder setBreakStrategy(int paramInt)
      {
        mBreakStrategy = paramInt;
        return this;
      }
      
      @RequiresApi(23)
      public Builder setHyphenationFrequency(int paramInt)
      {
        mHyphenationFrequency = paramInt;
        return this;
      }
      
      @RequiresApi(18)
      public Builder setTextDirection(@NonNull TextDirectionHeuristic paramTextDirectionHeuristic)
      {
        mTextDir = paramTextDirectionHeuristic;
        return this;
      }
    }
  }
  
  public static class PrecomputedTextFutureTask
    extends FutureTask<PrecomputedTextCompat>
  {
    public PrecomputedTextFutureTask(@NonNull PrecomputedTextCompat.Params paramParams, @NonNull CharSequence paramCharSequence)
    {
      super();
    }
    
    public static class PrecomputedTextCallback
      implements Callable<PrecomputedTextCompat>
    {
      private PrecomputedTextCompat.Params mParams;
      private CharSequence mText;
      
      public PrecomputedTextCallback(@NonNull PrecomputedTextCompat.Params paramParams, @NonNull CharSequence paramCharSequence)
      {
        mParams = paramParams;
        mText = paramCharSequence;
      }
      
      public PrecomputedTextCompat call()
        throws Exception
      {
        return PrecomputedTextCompat.create(mText, mParams);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.PrecomputedTextCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.emoji2.text;

import android.os.Build.VERSION;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.text.PrecomputedTextCompat;
import java.util.stream.IntStream;

class UnprecomputeTextOnModificationSpannable
  implements Spannable
{
  @NonNull
  private Spannable mDelegate;
  private boolean mSafeToWrite = false;
  
  public UnprecomputeTextOnModificationSpannable(@NonNull Spannable paramSpannable)
  {
    mDelegate = paramSpannable;
  }
  
  public UnprecomputeTextOnModificationSpannable(@NonNull Spanned paramSpanned)
  {
    mDelegate = new SpannableString(paramSpanned);
  }
  
  public UnprecomputeTextOnModificationSpannable(@NonNull CharSequence paramCharSequence)
  {
    mDelegate = new SpannableString(paramCharSequence);
  }
  
  private void ensureSafeWrites()
  {
    Spannable localSpannable = mDelegate;
    if ((!mSafeToWrite) && (precomputedTextDetector().isPrecomputedText(localSpannable))) {
      mDelegate = new SpannableString(localSpannable);
    }
    mSafeToWrite = true;
  }
  
  public static PrecomputedTextDetector precomputedTextDetector()
  {
    Object localObject;
    if (Build.VERSION.SDK_INT < 28) {
      localObject = new PrecomputedTextDetector();
    } else {
      localObject = new PrecomputedTextDetector_28();
    }
    return (PrecomputedTextDetector)localObject;
  }
  
  public char charAt(int paramInt)
  {
    return mDelegate.charAt(paramInt);
  }
  
  @NonNull
  @RequiresApi(api=24)
  public IntStream chars()
  {
    return CharSequenceHelper_API24.chars(mDelegate);
  }
  
  @NonNull
  @RequiresApi(api=24)
  public IntStream codePoints()
  {
    return CharSequenceHelper_API24.codePoints(mDelegate);
  }
  
  public int getSpanEnd(Object paramObject)
  {
    return mDelegate.getSpanEnd(paramObject);
  }
  
  public int getSpanFlags(Object paramObject)
  {
    return mDelegate.getSpanFlags(paramObject);
  }
  
  public int getSpanStart(Object paramObject)
  {
    return mDelegate.getSpanStart(paramObject);
  }
  
  public <T> T[] getSpans(int paramInt1, int paramInt2, Class<T> paramClass)
  {
    return mDelegate.getSpans(paramInt1, paramInt2, paramClass);
  }
  
  public Spannable getUnwrappedSpannable()
  {
    return mDelegate;
  }
  
  public int length()
  {
    return mDelegate.length();
  }
  
  public int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    return mDelegate.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }
  
  public void removeSpan(Object paramObject)
  {
    ensureSafeWrites();
    mDelegate.removeSpan(paramObject);
  }
  
  public void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    ensureSafeWrites();
    mDelegate.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
  }
  
  @NonNull
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return mDelegate.subSequence(paramInt1, paramInt2);
  }
  
  @NonNull
  public String toString()
  {
    return mDelegate.toString();
  }
  
  @RequiresApi(24)
  public static class CharSequenceHelper_API24
  {
    public static IntStream chars(CharSequence paramCharSequence)
    {
      return paramCharSequence.chars();
    }
    
    public static IntStream codePoints(CharSequence paramCharSequence)
    {
      return paramCharSequence.codePoints();
    }
  }
  
  public static class PrecomputedTextDetector
  {
    public boolean isPrecomputedText(CharSequence paramCharSequence)
    {
      return paramCharSequence instanceof PrecomputedTextCompat;
    }
  }
  
  @RequiresApi(28)
  public static class PrecomputedTextDetector_28
    extends UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
  {
    public boolean isPrecomputedText(CharSequence paramCharSequence)
    {
      boolean bool;
      if ((!(paramCharSequence instanceof PrecomputedText)) && (!(paramCharSequence instanceof PrecomputedTextCompat))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.UnprecomputeTextOnModificationSpannable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
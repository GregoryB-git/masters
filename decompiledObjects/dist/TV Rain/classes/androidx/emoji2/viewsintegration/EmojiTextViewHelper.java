package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;

public final class EmojiTextViewHelper
{
  private final HelperInternal mHelper;
  
  public EmojiTextViewHelper(@NonNull TextView paramTextView)
  {
    this(paramTextView, true);
  }
  
  public EmojiTextViewHelper(@NonNull TextView paramTextView, boolean paramBoolean)
  {
    Preconditions.checkNotNull(paramTextView, "textView cannot be null");
    if (!paramBoolean) {
      mHelper = new SkippingHelper19(paramTextView);
    } else {
      mHelper = new HelperInternal19(paramTextView);
    }
  }
  
  @NonNull
  public InputFilter[] getFilters(@NonNull InputFilter[] paramArrayOfInputFilter)
  {
    return mHelper.getFilters(paramArrayOfInputFilter);
  }
  
  public boolean isEnabled()
  {
    return mHelper.isEnabled();
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    mHelper.setAllCaps(paramBoolean);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    mHelper.setEnabled(paramBoolean);
  }
  
  public void updateTransformationMethod()
  {
    mHelper.updateTransformationMethod();
  }
  
  @Nullable
  public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod paramTransformationMethod)
  {
    return mHelper.wrapTransformationMethod(paramTransformationMethod);
  }
  
  public static class HelperInternal
  {
    @NonNull
    public InputFilter[] getFilters(@NonNull InputFilter[] paramArrayOfInputFilter)
    {
      return paramArrayOfInputFilter;
    }
    
    public boolean isEnabled()
    {
      return false;
    }
    
    public void setAllCaps(boolean paramBoolean) {}
    
    public void setEnabled(boolean paramBoolean) {}
    
    public void updateTransformationMethod() {}
    
    @Nullable
    public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod paramTransformationMethod)
    {
      return paramTransformationMethod;
    }
  }
  
  @RequiresApi(19)
  public static class HelperInternal19
    extends EmojiTextViewHelper.HelperInternal
  {
    private final EmojiInputFilter mEmojiInputFilter;
    private boolean mEnabled;
    private final TextView mTextView;
    
    public HelperInternal19(TextView paramTextView)
    {
      mTextView = paramTextView;
      mEnabled = true;
      mEmojiInputFilter = new EmojiInputFilter(paramTextView);
    }
    
    @NonNull
    private InputFilter[] addEmojiInputFilterIfMissing(@NonNull InputFilter[] paramArrayOfInputFilter)
    {
      int i = paramArrayOfInputFilter.length;
      for (int j = 0; j < i; j++) {
        if (paramArrayOfInputFilter[j] == mEmojiInputFilter) {
          return paramArrayOfInputFilter;
        }
      }
      InputFilter[] arrayOfInputFilter = new InputFilter[paramArrayOfInputFilter.length + 1];
      System.arraycopy(paramArrayOfInputFilter, 0, arrayOfInputFilter, 0, i);
      arrayOfInputFilter[i] = mEmojiInputFilter;
      return arrayOfInputFilter;
    }
    
    private SparseArray<InputFilter> getEmojiInputFilterPositionArray(@NonNull InputFilter[] paramArrayOfInputFilter)
    {
      SparseArray localSparseArray = new SparseArray(1);
      for (int i = 0; i < paramArrayOfInputFilter.length; i++)
      {
        InputFilter localInputFilter = paramArrayOfInputFilter[i];
        if ((localInputFilter instanceof EmojiInputFilter)) {
          localSparseArray.put(i, localInputFilter);
        }
      }
      return localSparseArray;
    }
    
    @NonNull
    private InputFilter[] removeEmojiInputFilterIfPresent(@NonNull InputFilter[] paramArrayOfInputFilter)
    {
      SparseArray localSparseArray = getEmojiInputFilterPositionArray(paramArrayOfInputFilter);
      if (localSparseArray.size() == 0) {
        return paramArrayOfInputFilter;
      }
      int i = paramArrayOfInputFilter.length;
      InputFilter[] arrayOfInputFilter = new InputFilter[paramArrayOfInputFilter.length - localSparseArray.size()];
      int j = 0;
      int m;
      for (int k = 0; j < i; k = m)
      {
        m = k;
        if (localSparseArray.indexOfKey(j) < 0)
        {
          arrayOfInputFilter[k] = paramArrayOfInputFilter[j];
          m = k + 1;
        }
        j++;
      }
      return arrayOfInputFilter;
    }
    
    @Nullable
    private TransformationMethod unwrapForDisabled(@Nullable TransformationMethod paramTransformationMethod)
    {
      TransformationMethod localTransformationMethod = paramTransformationMethod;
      if ((paramTransformationMethod instanceof EmojiTransformationMethod)) {
        localTransformationMethod = ((EmojiTransformationMethod)paramTransformationMethod).getOriginalTransformationMethod();
      }
      return localTransformationMethod;
    }
    
    private void updateFilters()
    {
      InputFilter[] arrayOfInputFilter = mTextView.getFilters();
      mTextView.setFilters(getFilters(arrayOfInputFilter));
    }
    
    @NonNull
    private TransformationMethod wrapForEnabled(@Nullable TransformationMethod paramTransformationMethod)
    {
      if ((paramTransformationMethod instanceof EmojiTransformationMethod)) {
        return paramTransformationMethod;
      }
      if ((paramTransformationMethod instanceof PasswordTransformationMethod)) {
        return paramTransformationMethod;
      }
      return new EmojiTransformationMethod(paramTransformationMethod);
    }
    
    @NonNull
    public InputFilter[] getFilters(@NonNull InputFilter[] paramArrayOfInputFilter)
    {
      if (!mEnabled) {
        return removeEmojiInputFilterIfPresent(paramArrayOfInputFilter);
      }
      return addEmojiInputFilterIfMissing(paramArrayOfInputFilter);
    }
    
    public boolean isEnabled()
    {
      return mEnabled;
    }
    
    public void setAllCaps(boolean paramBoolean)
    {
      if (paramBoolean) {
        updateTransformationMethod();
      }
    }
    
    public void setEnabled(boolean paramBoolean)
    {
      mEnabled = paramBoolean;
      updateTransformationMethod();
      updateFilters();
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public void setEnabledUnsafe(boolean paramBoolean)
    {
      mEnabled = paramBoolean;
    }
    
    public void updateTransformationMethod()
    {
      TransformationMethod localTransformationMethod = wrapTransformationMethod(mTextView.getTransformationMethod());
      mTextView.setTransformationMethod(localTransformationMethod);
    }
    
    @Nullable
    public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod paramTransformationMethod)
    {
      if (mEnabled) {
        return wrapForEnabled(paramTransformationMethod);
      }
      return unwrapForDisabled(paramTransformationMethod);
    }
  }
  
  @RequiresApi(19)
  public static class SkippingHelper19
    extends EmojiTextViewHelper.HelperInternal
  {
    private final EmojiTextViewHelper.HelperInternal19 mHelperDelegate;
    
    public SkippingHelper19(TextView paramTextView)
    {
      mHelperDelegate = new EmojiTextViewHelper.HelperInternal19(paramTextView);
    }
    
    private boolean skipBecauseEmojiCompatNotInitialized()
    {
      return EmojiCompat.isConfigured() ^ true;
    }
    
    @NonNull
    public InputFilter[] getFilters(@NonNull InputFilter[] paramArrayOfInputFilter)
    {
      if (skipBecauseEmojiCompatNotInitialized()) {
        return paramArrayOfInputFilter;
      }
      return mHelperDelegate.getFilters(paramArrayOfInputFilter);
    }
    
    public boolean isEnabled()
    {
      return mHelperDelegate.isEnabled();
    }
    
    public void setAllCaps(boolean paramBoolean)
    {
      if (skipBecauseEmojiCompatNotInitialized()) {
        return;
      }
      mHelperDelegate.setAllCaps(paramBoolean);
    }
    
    public void setEnabled(boolean paramBoolean)
    {
      if (skipBecauseEmojiCompatNotInitialized()) {
        mHelperDelegate.setEnabledUnsafe(paramBoolean);
      } else {
        mHelperDelegate.setEnabled(paramBoolean);
      }
    }
    
    public void updateTransformationMethod()
    {
      if (skipBecauseEmojiCompatNotInitialized()) {
        return;
      }
      mHelperDelegate.updateTransformationMethod();
    }
    
    @Nullable
    public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod paramTransformationMethod)
    {
      if (skipBecauseEmojiCompatNotInitialized()) {
        return paramTransformationMethod;
      }
      return mHelperDelegate.wrapTransformationMethod(paramTransformationMethod);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiTextViewHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
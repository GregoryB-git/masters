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

@RequiresApi(19)
class EmojiTextViewHelper$HelperInternal19
  extends EmojiTextViewHelper.HelperInternal
{
  private final EmojiInputFilter mEmojiInputFilter;
  private boolean mEnabled;
  private final TextView mTextView;
  
  public EmojiTextViewHelper$HelperInternal19(TextView paramTextView)
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

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal19
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
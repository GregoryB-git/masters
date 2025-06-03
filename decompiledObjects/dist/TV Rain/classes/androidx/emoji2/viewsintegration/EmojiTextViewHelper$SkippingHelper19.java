package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.emoji2.text.EmojiCompat;

@RequiresApi(19)
class EmojiTextViewHelper$SkippingHelper19
  extends EmojiTextViewHelper.HelperInternal
{
  private final EmojiTextViewHelper.HelperInternal19 mHelperDelegate;
  
  public EmojiTextViewHelper$SkippingHelper19(TextView paramTextView)
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

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiTextViewHelper.SkippingHelper19
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
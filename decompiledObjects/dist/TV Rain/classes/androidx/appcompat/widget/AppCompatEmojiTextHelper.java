package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.styleable;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

class AppCompatEmojiTextHelper
{
  @NonNull
  private final EmojiTextViewHelper mEmojiTextViewHelper;
  @NonNull
  private final TextView mView;
  
  public AppCompatEmojiTextHelper(@NonNull TextView paramTextView)
  {
    mView = paramTextView;
    mEmojiTextViewHelper = new EmojiTextViewHelper(paramTextView, false);
  }
  
  @NonNull
  public InputFilter[] getFilters(@NonNull InputFilter[] paramArrayOfInputFilter)
  {
    return mEmojiTextViewHelper.getFilters(paramArrayOfInputFilter);
  }
  
  public boolean isEnabled()
  {
    return mEmojiTextViewHelper.isEnabled();
  }
  
  public void loadFromAttributes(@Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = mView.getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.AppCompatTextView, paramInt, 0);
    try
    {
      paramInt = R.styleable.AppCompatTextView_emojiCompatEnabled;
      boolean bool1 = paramAttributeSet.hasValue(paramInt);
      boolean bool2 = true;
      if (bool1) {
        bool2 = paramAttributeSet.getBoolean(paramInt, true);
      }
      paramAttributeSet.recycle();
      setEnabled(bool2);
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    mEmojiTextViewHelper.setAllCaps(paramBoolean);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    mEmojiTextViewHelper.setEnabled(paramBoolean);
  }
  
  @Nullable
  public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod paramTransformationMethod)
  {
    return mEmojiTextViewHelper.wrapTransformationMethod(paramTransformationMethod);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatEmojiTextHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
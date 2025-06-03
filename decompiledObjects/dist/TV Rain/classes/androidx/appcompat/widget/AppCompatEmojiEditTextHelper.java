package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.styleable;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

class AppCompatEmojiEditTextHelper
{
  @NonNull
  private final EmojiEditTextHelper mEmojiEditTextHelper;
  @NonNull
  private final EditText mView;
  
  public AppCompatEmojiEditTextHelper(@NonNull EditText paramEditText)
  {
    mView = paramEditText;
    mEmojiEditTextHelper = new EmojiEditTextHelper(paramEditText, false);
  }
  
  @Nullable
  public KeyListener getKeyListener(@Nullable KeyListener paramKeyListener)
  {
    KeyListener localKeyListener = paramKeyListener;
    if (isEmojiCapableKeyListener(paramKeyListener)) {
      localKeyListener = mEmojiEditTextHelper.getKeyListener(paramKeyListener);
    }
    return localKeyListener;
  }
  
  public boolean isEmojiCapableKeyListener(KeyListener paramKeyListener)
  {
    return paramKeyListener instanceof NumberKeyListener ^ true;
  }
  
  public boolean isEnabled()
  {
    return mEmojiEditTextHelper.isEnabled();
  }
  
  public void loadFromAttributes(@Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    TypedArray localTypedArray = mView.getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.AppCompatTextView, paramInt, 0);
    try
    {
      paramInt = R.styleable.AppCompatTextView_emojiCompatEnabled;
      boolean bool1 = localTypedArray.hasValue(paramInt);
      boolean bool2 = true;
      if (bool1) {
        bool2 = localTypedArray.getBoolean(paramInt, true);
      }
      localTypedArray.recycle();
      setEnabled(bool2);
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  @Nullable
  public InputConnection onCreateInputConnection(@Nullable InputConnection paramInputConnection, @NonNull EditorInfo paramEditorInfo)
  {
    return mEmojiEditTextHelper.onCreateInputConnection(paramInputConnection, paramEditorInfo);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    mEmojiEditTextHelper.setEnabled(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatEmojiEditTextHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
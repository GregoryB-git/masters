package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class EmojiEditTextHelper$HelperInternal19
  extends EmojiEditTextHelper.HelperInternal
{
  private final EditText mEditText;
  private final EmojiTextWatcher mTextWatcher;
  
  public EmojiEditTextHelper$HelperInternal19(@NonNull EditText paramEditText, boolean paramBoolean)
  {
    mEditText = paramEditText;
    EmojiTextWatcher localEmojiTextWatcher = new EmojiTextWatcher(paramEditText, paramBoolean);
    mTextWatcher = localEmojiTextWatcher;
    paramEditText.addTextChangedListener(localEmojiTextWatcher);
    paramEditText.setEditableFactory(EmojiEditableFactory.getInstance());
  }
  
  public KeyListener getKeyListener(@Nullable KeyListener paramKeyListener)
  {
    if ((paramKeyListener instanceof EmojiKeyListener)) {
      return paramKeyListener;
    }
    if (paramKeyListener == null) {
      return null;
    }
    if ((paramKeyListener instanceof NumberKeyListener)) {
      return paramKeyListener;
    }
    return new EmojiKeyListener(paramKeyListener);
  }
  
  public boolean isEnabled()
  {
    return mTextWatcher.isEnabled();
  }
  
  public InputConnection onCreateInputConnection(@NonNull InputConnection paramInputConnection, @NonNull EditorInfo paramEditorInfo)
  {
    if ((paramInputConnection instanceof EmojiInputConnection)) {
      return paramInputConnection;
    }
    return new EmojiInputConnection(mEditText, paramInputConnection, paramEditorInfo);
  }
  
  public void setEmojiReplaceStrategy(int paramInt)
  {
    mTextWatcher.setEmojiReplaceStrategy(paramInt);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    mTextWatcher.setEnabled(paramBoolean);
  }
  
  public void setMaxEmojiCount(int paramInt)
  {
    mTextWatcher.setMaxEmojiCount(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal19
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
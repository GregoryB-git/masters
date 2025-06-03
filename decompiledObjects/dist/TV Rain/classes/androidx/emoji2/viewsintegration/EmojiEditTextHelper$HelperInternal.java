package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class EmojiEditTextHelper$HelperInternal
{
  @Nullable
  public KeyListener getKeyListener(@Nullable KeyListener paramKeyListener)
  {
    return paramKeyListener;
  }
  
  public boolean isEnabled()
  {
    return false;
  }
  
  public InputConnection onCreateInputConnection(@NonNull InputConnection paramInputConnection, @NonNull EditorInfo paramEditorInfo)
  {
    return paramInputConnection;
  }
  
  public void setEmojiReplaceStrategy(int paramInt) {}
  
  public void setEnabled(boolean paramBoolean) {}
  
  public void setMaxEmojiCount(int paramInt) {}
}

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
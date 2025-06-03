package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.emoji2.text.EmojiCompat;

public class EmojiKeyListener$EmojiCompatHandleKeyDownHelper
{
  public boolean handleKeyDown(@NonNull Editable paramEditable, int paramInt, @NonNull KeyEvent paramKeyEvent)
  {
    return EmojiCompat.handleOnKeyDown(paramEditable, paramInt, paramKeyEvent);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiKeyListener.EmojiCompatHandleKeyDownHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
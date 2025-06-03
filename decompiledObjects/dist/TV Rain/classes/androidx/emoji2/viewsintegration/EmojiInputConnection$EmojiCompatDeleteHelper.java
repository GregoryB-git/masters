package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.emoji2.text.EmojiCompat;

public class EmojiInputConnection$EmojiCompatDeleteHelper
{
  public boolean handleDeleteSurroundingText(@NonNull InputConnection paramInputConnection, @NonNull Editable paramEditable, @IntRange(from=0L) int paramInt1, @IntRange(from=0L) int paramInt2, boolean paramBoolean)
  {
    return EmojiCompat.handleDeleteSurroundingText(paramInputConnection, paramEditable, paramInt1, paramInt2, paramBoolean);
  }
  
  public void updateEditorInfoAttrs(@NonNull EditorInfo paramEditorInfo)
  {
    if (EmojiCompat.isConfigured()) {
      EmojiCompat.get().updateEditorInfo(paramEditorInfo);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiInputConnection.EmojiCompatDeleteHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
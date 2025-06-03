package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

@RequiresApi(19)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
final class EmojiInputConnection
  extends InputConnectionWrapper
{
  private final EmojiCompatDeleteHelper mEmojiCompatDeleteHelper;
  private final TextView mTextView;
  
  public EmojiInputConnection(@NonNull TextView paramTextView, @NonNull InputConnection paramInputConnection, @NonNull EditorInfo paramEditorInfo)
  {
    this(paramTextView, paramInputConnection, paramEditorInfo, new EmojiCompatDeleteHelper());
  }
  
  public EmojiInputConnection(@NonNull TextView paramTextView, @NonNull InputConnection paramInputConnection, @NonNull EditorInfo paramEditorInfo, @NonNull EmojiCompatDeleteHelper paramEmojiCompatDeleteHelper)
  {
    super(paramInputConnection, false);
    mTextView = paramTextView;
    mEmojiCompatDeleteHelper = paramEmojiCompatDeleteHelper;
    paramEmojiCompatDeleteHelper.updateEditorInfoAttrs(paramEditorInfo);
  }
  
  private Editable getEditable()
  {
    return mTextView.getEditableText();
  }
  
  public boolean deleteSurroundingText(int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((!mEmojiCompatDeleteHelper.handleDeleteSurroundingText(this, getEditable(), paramInt1, paramInt2, false)) && (!super.deleteSurroundingText(paramInt1, paramInt2))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean deleteSurroundingTextInCodePoints(int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((!mEmojiCompatDeleteHelper.handleDeleteSurroundingText(this, getEditable(), paramInt1, paramInt2, true)) && (!super.deleteSurroundingTextInCodePoints(paramInt1, paramInt2))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static class EmojiCompatDeleteHelper
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
}

/* Location:
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiInputConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.emoji2.text;

import android.view.inputmethod.EditorInfo;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

class EmojiCompat$CompatInternal
{
  public final EmojiCompat mEmojiCompat;
  
  public EmojiCompat$CompatInternal(EmojiCompat paramEmojiCompat)
  {
    mEmojiCompat = paramEmojiCompat;
  }
  
  public String getAssetSignature()
  {
    return "";
  }
  
  public int getEmojiMatch(CharSequence paramCharSequence, int paramInt)
  {
    return 0;
  }
  
  public boolean hasEmojiGlyph(@NonNull CharSequence paramCharSequence)
  {
    return false;
  }
  
  public boolean hasEmojiGlyph(@NonNull CharSequence paramCharSequence, int paramInt)
  {
    return false;
  }
  
  public void loadMetadata()
  {
    mEmojiCompat.onMetadataLoadSuccess();
  }
  
  public CharSequence process(@NonNull CharSequence paramCharSequence, @IntRange(from=0L) int paramInt1, @IntRange(from=0L) int paramInt2, @IntRange(from=0L) int paramInt3, boolean paramBoolean)
  {
    return paramCharSequence;
  }
  
  public void updateEditorInfoAttrs(@NonNull EditorInfo paramEditorInfo) {}
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompat.CompatInternal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
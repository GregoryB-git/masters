package androidx.emoji2.text;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(19)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
class EmojiCompat$SpanFactory
{
  public EmojiSpan createSpan(@NonNull EmojiMetadata paramEmojiMetadata)
  {
    return new TypefaceEmojiSpan(paramEmojiMetadata);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompat.SpanFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
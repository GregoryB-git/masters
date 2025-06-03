package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class EmojiCompatInitializer$BackgroundDefaultConfig
  extends EmojiCompat.Config
{
  public EmojiCompatInitializer$BackgroundDefaultConfig(Context paramContext)
  {
    super(new EmojiCompatInitializer.BackgroundDefaultLoader(paramContext));
    setMetadataLoadStrategy(1);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
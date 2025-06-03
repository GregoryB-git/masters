package androidx.emoji2.text;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

class FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1
  extends ContentObserver
{
  public FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1(FontRequestEmojiCompatConfig.FontRequestMetadataLoader paramFontRequestMetadataLoader, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public void onChange(boolean paramBoolean, Uri paramUri)
  {
    this$0.loadInternal();
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
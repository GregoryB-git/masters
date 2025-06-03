package androidx.emoji2.text;

import androidx.core.os.TraceCompat;

class EmojiCompatInitializer$LoadEmojiCompatRunnable
  implements Runnable
{
  public void run()
  {
    try
    {
      TraceCompat.beginSection("EmojiCompat.EmojiCompatInitializer.run");
      if (EmojiCompat.isConfigured()) {
        EmojiCompat.get().load();
      }
      return;
    }
    finally
    {
      TraceCompat.endSection();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompatInitializer.LoadEmojiCompatRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
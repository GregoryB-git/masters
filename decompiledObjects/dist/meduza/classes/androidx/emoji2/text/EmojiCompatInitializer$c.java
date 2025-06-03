package androidx.emoji2.text;

import a0.n;
import android.os.Trace;

public final class EmojiCompatInitializer$c
  implements Runnable
{
  public final void run()
  {
    try
    {
      i = n.a;
      Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
      if (d.j != null) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        d.a().c();
      }
      Trace.endSection();
      return;
    }
    finally
    {
      int i = n.a;
      Trace.endSection();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompatInitializer.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
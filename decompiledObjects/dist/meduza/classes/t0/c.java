package t0;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.EmojiCompatInitializer.c;
import b1.d;
import b1.k;
import b1.o;

public final class c
  implements d
{
  public c(EmojiCompatInitializer paramEmojiCompatInitializer, k paramk) {}
  
  public final void onCreate(o paramo) {}
  
  public final void onDestroy(o paramo) {}
  
  public final void onPause(o paramo) {}
  
  public final void onResume(o paramo)
  {
    b.getClass();
    if (Build.VERSION.SDK_INT >= 28) {
      paramo = b.a(Looper.getMainLooper());
    } else {
      paramo = new Handler(Looper.getMainLooper());
    }
    paramo.postDelayed(new EmojiCompatInitializer.c(), 500L);
    a.c(this);
  }
  
  public final void onStart(o paramo) {}
  
  public final void onStop(o paramo) {}
}

/* Location:
 * Qualified Name:     t0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
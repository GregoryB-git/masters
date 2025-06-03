package androidx.emoji2.text;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t0.a;
import t0.d;

public final class EmojiCompatInitializer$b
  implements d.g
{
  public final Context a;
  
  public EmojiCompatInitializer$b(Context paramContext)
  {
    a = paramContext.getApplicationContext();
  }
  
  public final void a(d.h paramh)
  {
    Object localObject = new a("EmojiCompatInitializer", 0);
    localObject = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), (ThreadFactory)localObject);
    ((ThreadPoolExecutor)localObject).allowCoreThreadTimeOut(true);
    ((ThreadPoolExecutor)localObject).execute(new d(this, paramh, localObject, 0));
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.EmojiCompatInitializer.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
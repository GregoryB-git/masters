package i5;

import E5.k.d;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

public class e$a
  implements k.d
{
  public final k.d a;
  public final Handler b = new Handler(Looper.getMainLooper());
  
  public e$a(k.d paramd)
  {
    a = paramd;
  }
  
  public void a(Object paramObject)
  {
    b.post(new c(this, paramObject));
  }
  
  public void b(String paramString1, String paramString2, Object paramObject)
  {
    b.post(new d(this, paramString1, paramString2, paramObject));
  }
  
  public void c()
  {
    Handler localHandler = b;
    k.d locald = a;
    Objects.requireNonNull(locald);
    localHandler.post(new b(locald));
  }
}

/* Location:
 * Qualified Name:     i5.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
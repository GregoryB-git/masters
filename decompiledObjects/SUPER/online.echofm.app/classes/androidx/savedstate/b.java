package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.d.c;
import androidx.lifecycle.h;

public final class b
{
  public final c a;
  public final SavedStateRegistry b;
  
  public b(c paramc)
  {
    a = paramc;
    b = new SavedStateRegistry();
  }
  
  public static b a(c paramc)
  {
    return new b(paramc);
  }
  
  public SavedStateRegistry b()
  {
    return b;
  }
  
  public void c(Bundle paramBundle)
  {
    d locald = a.g();
    if (locald.b() == d.c.p)
    {
      locald.a(new Recreator(a));
      b.b(locald, paramBundle);
      return;
    }
    throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
  }
  
  public void d(Bundle paramBundle)
  {
    b.c(paramBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.savedstate.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
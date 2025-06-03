package u5;

import D5.i;
import D5.j;
import D5.j.b;
import E5.c;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.flutter.plugin.editing.l.a;
import java.util.HashSet;
import java.util.Map;
import t5.b;

public class L
  implements l.a, j.b
{
  public final d[] a;
  public final HashSet b = new HashSet();
  public final e c;
  
  public L(e parame)
  {
    c = parame;
    a = new d[] { new K(parame.getBinaryMessenger()), new F(new i(parame.getBinaryMessenger())) };
    new j(parame.getBinaryMessenger()).b(this);
  }
  
  public Map a()
  {
    return ((K)a[0]).h();
  }
  
  public boolean b(KeyEvent paramKeyEvent)
  {
    boolean bool = b.remove(paramKeyEvent);
    int i = 0;
    if (bool) {
      return false;
    }
    if (a.length > 0)
    {
      c localc = new c(paramKeyEvent);
      d[] arrayOfd = a;
      int j = arrayOfd.length;
      while (i < j)
      {
        arrayOfd[i].a(paramKeyEvent, localc.a());
        i++;
      }
    }
    e(paramKeyEvent);
    return true;
  }
  
  public void d()
  {
    int i = b.size();
    if (i > 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("A KeyboardManager was destroyed with ");
      localStringBuilder.append(String.valueOf(i));
      localStringBuilder.append(" unhandled redispatch event(s).");
      b.g("KeyboardManager", localStringBuilder.toString());
    }
  }
  
  public final void e(KeyEvent paramKeyEvent)
  {
    e locale = c;
    if ((locale != null) && (!locale.c(paramKeyEvent)))
    {
      b.add(paramKeyEvent);
      c.a(paramKeyEvent);
      if (b.remove(paramKeyEvent)) {
        b.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
      }
    }
  }
  
  public static class b
  {
    public int a = 0;
    
    public Character a(int paramInt)
    {
      int i = (char)paramInt;
      int m;
      if ((0x80000000 & paramInt) != 0)
      {
        int j = paramInt & 0x7FFFFFFF;
        int k = a;
        m = i;
        paramInt = j;
        if (k != 0)
        {
          paramInt = KeyCharacterMap.getDeadChar(k, j);
          m = i;
        }
      }
      else
      {
        m = a;
        c = i;
        if (m == 0) {
          break label86;
        }
        paramInt = KeyCharacterMap.getDeadChar(m, paramInt);
        if (paramInt > 0) {
          i = (char)paramInt;
        }
        paramInt = 0;
        m = i;
      }
      a = paramInt;
      char c = m;
      label86:
      return Character.valueOf(c);
    }
  }
  
  public class c
  {
    public final KeyEvent a;
    public int b = a.length;
    public boolean c = false;
    
    public c(KeyEvent paramKeyEvent)
    {
      a = paramKeyEvent;
    }
    
    public L.d.a a()
    {
      return new a(null);
    }
    
    public class a
      implements L.d.a
    {
      public boolean a = false;
      
      public a() {}
      
      public void a(boolean paramBoolean)
      {
        if (!a)
        {
          a = true;
          L.c localc = L.c.this;
          int i = b - 1;
          b = i;
          paramBoolean |= c;
          c = paramBoolean;
          if ((i == 0) && (!paramBoolean)) {
            L.c(d, a);
          }
          return;
        }
        throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
      }
    }
  }
  
  public static abstract interface d
  {
    public abstract void a(KeyEvent paramKeyEvent, a parama);
    
    public static abstract interface a
    {
      public abstract void a(boolean paramBoolean);
    }
  }
  
  public static abstract interface e
  {
    public abstract void a(KeyEvent paramKeyEvent);
    
    public abstract boolean c(KeyEvent paramKeyEvent);
    
    public abstract c getBinaryMessenger();
  }
}

/* Location:
 * Qualified Name:     u5.L
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
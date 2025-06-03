package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.SparseArray;
import android.view.KeyEvent;
import java.nio.ByteBuffer;
import t0.e;
import u0.a;
import x.c.a;

public final class f
{
  public final d.i a;
  public final h b;
  public d.d c;
  
  public f(h paramh, d.i parami, b paramb)
  {
    a = parami;
    b = paramh;
    c = paramb;
  }
  
  public static boolean a(Editable paramEditable, KeyEvent paramKeyEvent, boolean paramBoolean)
  {
    if ((KeyEvent.metaStateHasNoModifiers(paramKeyEvent.getMetaState()) ^ true)) {
      return false;
    }
    int i = Selection.getSelectionStart(paramEditable);
    int j = Selection.getSelectionEnd(paramEditable);
    int k;
    if ((i != -1) && (j != -1) && (i == j)) {
      k = 0;
    } else {
      k = 1;
    }
    if (k != 0) {
      return false;
    }
    t0.f[] arrayOff = (t0.f[])paramEditable.getSpans(i, j, t0.f.class);
    if ((arrayOff != null) && (arrayOff.length > 0))
    {
      j = arrayOff.length;
      for (k = 0; k < j; k++)
      {
        paramKeyEvent = arrayOff[k];
        int m = paramEditable.getSpanStart(paramKeyEvent);
        int n = paramEditable.getSpanEnd(paramKeyEvent);
        if (((paramBoolean) && (m == i)) || ((!paramBoolean) && (n == i)) || ((i > m) && (i < n)))
        {
          paramEditable.delete(m, n);
          return true;
        }
      }
    }
    return false;
  }
  
  public final boolean b(CharSequence paramCharSequence, int paramInt1, int paramInt2, e parame)
  {
    int i = c;
    boolean bool = false;
    if (i == 0)
    {
      Object localObject1 = c;
      Object localObject2 = parame.c();
      i = ((u0.c)localObject2).a(8);
      if (i != 0) {
        b.getShort(i + a);
      }
      localObject2 = (b)localObject1;
      localObject2.getClass();
      localObject1 = b.b;
      if (((ThreadLocal)localObject1).get() == null) {
        ((ThreadLocal)localObject1).set(new StringBuilder());
      }
      localObject1 = (StringBuilder)((ThreadLocal)localObject1).get();
      ((StringBuilder)localObject1).setLength(0);
      while (paramInt1 < paramInt2)
      {
        ((StringBuilder)localObject1).append(paramCharSequence.charAt(paramInt1));
        paramInt1++;
      }
      paramCharSequence = a;
      localObject2 = ((StringBuilder)localObject1).toString();
      paramInt1 = x.c.a;
      if (c.a.a(paramCharSequence, (String)localObject2)) {
        paramInt1 = 2;
      } else {
        paramInt1 = 1;
      }
      c = paramInt1;
    }
    if (c == 2) {
      bool = true;
    }
    return bool;
  }
  
  public static final class a
  {
    public int a = 1;
    public final h.a b;
    public h.a c;
    public h.a d;
    public int e;
    public int f;
    
    public a(h.a parama)
    {
      b = parama;
      c = parama;
    }
    
    public final int a(int paramInt)
    {
      Object localObject = c.a;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = (h.a)((SparseArray)localObject).get(paramInt);
      }
      int i = a;
      int j = 3;
      if (i != 2)
      {
        if (localObject == null) {
          break label176;
        }
        a = 2;
        c = ((h.a)localObject);
        f = 1;
      }
      else if (localObject != null)
      {
        c = ((h.a)localObject);
        f += 1;
      }
      else
      {
        int k = 0;
        if (paramInt == 65038) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          break label176;
        }
        i = k;
        if (paramInt == 65039) {
          i = 1;
        }
        if (i == 0) {
          break label129;
        }
      }
      i = 2;
      break label182;
      label129:
      localObject = c;
      if (b != null) {
        if (f == 1)
        {
          if (c()) {
            localObject = c;
          }
        }
        else
        {
          d = ((h.a)localObject);
          b();
          i = j;
          break label182;
        }
      }
      label176:
      b();
      i = 1;
      label182:
      e = paramInt;
      return i;
    }
    
    public final void b()
    {
      a = 1;
      c = b;
      f = 0;
    }
    
    public final boolean c()
    {
      a locala = c.b.c();
      int i = locala.a(6);
      if ((i != 0) && (b.get(i + a) != 0)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        return true;
      }
      if (e == 65039) {
        i = 1;
      } else {
        i = 0;
      }
      return i != 0;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.emoji2.text;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import t0.e;
import u0.a;
import u0.c;

public final class f$a
{
  public int a = 1;
  public final h.a b;
  public h.a c;
  public h.a d;
  public int e;
  public int f;
  
  public f$a(h.a parama)
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

/* Location:
 * Qualified Name:     androidx.emoji2.text.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
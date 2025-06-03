package androidx.emoji2.text;

import android.util.SparseArray;
import t0.e;

public final class h$a
{
  public final SparseArray<a> a;
  public e b;
  
  public h$a()
  {
    this(1);
  }
  
  public h$a(int paramInt)
  {
    a = new SparseArray(paramInt);
  }
  
  public final void a(e parame, int paramInt1, int paramInt2)
  {
    int i = parame.a(paramInt1);
    Object localObject1 = a;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = (a)((SparseArray)localObject1).get(i);
    }
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new a();
      a.put(parame.a(paramInt1), localObject2);
    }
    if (paramInt2 > paramInt1) {
      ((a)localObject2).a(parame, paramInt1 + 1, paramInt2);
    } else {
      b = parame;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
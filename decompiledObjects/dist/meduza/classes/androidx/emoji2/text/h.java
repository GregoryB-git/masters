package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import p2.m0;
import t0.e;
import u0.b;
import u0.c;

public final class h
{
  public final b a;
  public final char[] b;
  public final a c;
  public final Typeface d;
  
  public h(Typeface paramTypeface, b paramb)
  {
    d = paramTypeface;
    a = paramb;
    c = new a(1024);
    int i = paramb.a(6);
    if (i != 0)
    {
      j = i + a;
      i = b.getInt(j);
      i = b.getInt(i + j);
    }
    else
    {
      i = 0;
    }
    b = new char[i * 2];
    i = paramb.a(6);
    if (i != 0)
    {
      j = i + a;
      i = b.getInt(j);
      i = b.getInt(i + j);
    }
    else
    {
      i = 0;
    }
    for (int j = 0; j < i; j++)
    {
      paramTypeface = new e(this, j);
      paramb = paramTypeface.c();
      int k = paramb.a(4);
      if (k != 0) {
        k = b.getInt(k + a);
      } else {
        k = 0;
      }
      Character.toChars(k, b, j * 2);
      boolean bool;
      if (paramTypeface.b() > 0) {
        bool = true;
      } else {
        bool = false;
      }
      m0.n("invalid metadata codepoint length", bool);
      c.a(paramTypeface, 0, paramTypeface.b() - 1);
    }
  }
  
  public static final class a
  {
    public final SparseArray<a> a;
    public e b;
    
    public a()
    {
      this(1);
    }
    
    public a(int paramInt)
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
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
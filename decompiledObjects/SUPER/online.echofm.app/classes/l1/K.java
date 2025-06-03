package l1;

import F0.t;
import android.util.SparseArray;
import g0.E;
import g0.z;
import java.util.Collections;
import java.util.List;

public abstract interface K
{
  public abstract void a(z paramz, int paramInt);
  
  public abstract void b();
  
  public abstract void c(E paramE, t paramt, d paramd);
  
  public static final class a
  {
    public final String a;
    public final int b;
    public final byte[] c;
    
    public a(String paramString, int paramInt, byte[] paramArrayOfByte)
    {
      a = paramString;
      b = paramInt;
      c = paramArrayOfByte;
    }
  }
  
  public static final class b
  {
    public final int a;
    public final String b;
    public final int c;
    public final List d;
    public final byte[] e;
    
    public b(int paramInt1, String paramString, int paramInt2, List paramList, byte[] paramArrayOfByte)
    {
      a = paramInt1;
      b = paramString;
      c = paramInt2;
      if (paramList == null) {
        paramString = Collections.emptyList();
      } else {
        paramString = Collections.unmodifiableList(paramList);
      }
      d = paramString;
      e = paramArrayOfByte;
    }
    
    public int a()
    {
      int i = c;
      if (i != 2)
      {
        if (i != 3) {
          return 0;
        }
        return 512;
      }
      return 2048;
    }
  }
  
  public static abstract interface c
  {
    public abstract SparseArray a();
    
    public abstract K b(int paramInt, K.b paramb);
  }
  
  public static final class d
  {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;
    
    public d(int paramInt1, int paramInt2)
    {
      this(Integer.MIN_VALUE, paramInt1, paramInt2);
    }
    
    public d(int paramInt1, int paramInt2, int paramInt3)
    {
      Object localObject;
      if (paramInt1 != Integer.MIN_VALUE)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramInt1);
        ((StringBuilder)localObject).append("/");
        localObject = ((StringBuilder)localObject).toString();
      }
      else
      {
        localObject = "";
      }
      a = ((String)localObject);
      b = paramInt2;
      c = paramInt3;
      d = Integer.MIN_VALUE;
      e = "";
    }
    
    public void a()
    {
      int i = d;
      if (i == Integer.MIN_VALUE) {
        i = b;
      } else {
        i += c;
      }
      d = i;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a);
      localStringBuilder.append(d);
      e = localStringBuilder.toString();
    }
    
    public String b()
    {
      d();
      return e;
    }
    
    public int c()
    {
      d();
      return d;
    }
    
    public final void d()
    {
      if (d != Integer.MIN_VALUE) {
        return;
      }
      throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }
  }
}

/* Location:
 * Qualified Name:     l1.K
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
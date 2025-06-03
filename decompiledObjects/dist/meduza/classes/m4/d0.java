package m4;

import c4.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v5.c0;
import v5.u;

public abstract interface d0
{
  public abstract void a(int paramInt, u paramu);
  
  public abstract void b();
  
  public abstract void c(c0 paramc0, j paramj, d paramd);
  
  public static final class a
  {
    public final String a;
    public final byte[] b;
    
    public a(String paramString, byte[] paramArrayOfByte)
    {
      a = paramString;
      b = paramArrayOfByte;
    }
  }
  
  public static final class b
  {
    public final String a;
    public final List<d0.a> b;
    public final byte[] c;
    
    public b(int paramInt, String paramString, ArrayList paramArrayList, byte[] paramArrayOfByte)
    {
      a = paramString;
      if (paramArrayList == null) {
        paramString = Collections.emptyList();
      } else {
        paramString = Collections.unmodifiableList(paramArrayList);
      }
      b = paramString;
      c = paramArrayOfByte;
    }
  }
  
  public static abstract interface c
  {
    public abstract d0 a(int paramInt, d0.b paramb);
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
    
    public final void a()
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
    
    public final void b()
    {
      if (d != Integer.MIN_VALUE) {
        return;
      }
      throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }
  }
}

/* Location:
 * Qualified Name:     m4.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
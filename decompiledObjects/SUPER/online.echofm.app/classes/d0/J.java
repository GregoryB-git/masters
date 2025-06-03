package d0;

import g0.M;
import g0.a;
import g0.o;
import java.util.Arrays;

public final class J
{
  public static final String f = M.w0(0);
  public static final String g = M.w0(1);
  public final int a;
  public final String b;
  public final int c;
  public final q[] d;
  public int e;
  
  public J(String paramString, q... paramVarArgs)
  {
    boolean bool;
    if (paramVarArgs.length > 0) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    b = paramString;
    d = paramVarArgs;
    a = paramVarArgs.length;
    int i = z.k(0n);
    int j = i;
    if (i == -1) {
      j = z.k(0m);
    }
    c = j;
    f();
  }
  
  public J(q... paramVarArgs)
  {
    this("", paramVarArgs);
  }
  
  public static void c(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Different ");
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" combined in one TrackGroup: '");
    localStringBuilder.append(paramString2);
    localStringBuilder.append("' (track 0) and '");
    localStringBuilder.append(paramString3);
    localStringBuilder.append("' (track ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(")");
    o.d("TrackGroup", "", new IllegalStateException(localStringBuilder.toString()));
  }
  
  public static String d(String paramString)
  {
    String str;
    if (paramString != null)
    {
      str = paramString;
      if (!paramString.equals("und")) {}
    }
    else
    {
      str = "";
    }
    return str;
  }
  
  public static int e(int paramInt)
  {
    return paramInt | 0x4000;
  }
  
  public q a(int paramInt)
  {
    return d[paramInt];
  }
  
  public int b(q paramq)
  {
    for (int i = 0;; i++)
    {
      q[] arrayOfq = d;
      if (i >= arrayOfq.length) {
        break;
      }
      if (paramq == arrayOfq[i]) {
        return i;
      }
    }
    return -1;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (J.class == paramObject.getClass()))
    {
      paramObject = (J)paramObject;
      if ((!b.equals(b)) || (!Arrays.equals(d, d))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final void f()
  {
    Object localObject = d(d[0].d);
    int i = e(d[0].f);
    for (int j = 1;; j++)
    {
      q[] arrayOfq = d;
      if (j >= arrayOfq.length) {
        break;
      }
      if (!((String)localObject).equals(d(d)))
      {
        localObject = d;
        c("languages", 0d, d, j);
        return;
      }
      if (i != e(d[j].f))
      {
        c("role flags", Integer.toBinaryString(d[0].f), Integer.toBinaryString(d[j].f), j);
        return;
      }
    }
  }
  
  public int hashCode()
  {
    if (e == 0) {
      e = ((527 + b.hashCode()) * 31 + Arrays.hashCode(d));
    }
    return e;
  }
}

/* Location:
 * Qualified Name:     d0.J
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
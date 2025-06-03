package Z0;

import F0.L;
import F0.s;
import U0.b;
import U0.b.b;
import W2.q;
import d0.A;
import g0.z;
import java.util.ArrayList;
import java.util.List;

public final class p
{
  public static final q d = q.d(':');
  public static final q e = q.d('*');
  public final List a = new ArrayList();
  public int b = 0;
  public int c;
  
  public static int b(String paramString)
  {
    paramString.hashCode();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1760745220: 
      if (paramString.equals("Super_SlowMotion_BGM")) {
        j = 4;
      }
      break;
    case -830665521: 
      if (paramString.equals("Super_SlowMotion_Deflickering_On")) {
        j = 3;
      }
      break;
    case -1251387154: 
      if (paramString.equals("Super_SlowMotion_Data")) {
        j = 2;
      }
      break;
    case -1332107749: 
      if (paramString.equals("Super_SlowMotion_Edit_Data")) {
        j = 1;
      }
      break;
    case -1711564334: 
      if (paramString.equals("SlowMotion_Data")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      throw A.a("Invalid SEF name", null);
    case 4: 
      return 2817;
    case 3: 
      return 2820;
    case 2: 
      return 2816;
    case 1: 
      return 2819;
    }
    return 2192;
  }
  
  public static b f(z paramz, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    paramz = paramz.D(paramInt);
    paramz = e.f(paramz);
    paramInt = 0;
    for (;;)
    {
      if (paramInt >= paramz.size()) {
        break label151;
      }
      Object localObject = d.f((CharSequence)paramz.get(paramInt));
      if (((List)localObject).size() == 3) {
        try
        {
          long l1 = Long.parseLong((String)((List)localObject).get(0));
          long l2 = Long.parseLong((String)((List)localObject).get(1));
          int i = Integer.parseInt((String)((List)localObject).get(2));
          localObject = new U0/b$b;
          ((b.b)localObject).<init>(l1, l2, 1 << i - 1);
          localArrayList.add(localObject);
          paramInt++;
        }
        catch (NumberFormatException paramz)
        {
          throw A.a(null, paramz);
        }
      }
    }
    throw A.a(null, null);
    label151:
    return new b(localArrayList);
  }
  
  public final void a(s params, L paramL)
  {
    z localz = new z(8);
    params.readFully(localz.e(), 0, 8);
    c = (localz.t() + 8);
    if (localz.p() != 1397048916)
    {
      a = 0L;
      return;
    }
    a = (params.p() - (c - 12));
    b = 2;
  }
  
  public int c(s params, L paramL, List paramList)
  {
    int i = b;
    long l1 = 0L;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            e(params, paramList);
            a = 0L;
          }
          else
          {
            throw new IllegalStateException();
          }
        }
        else {
          d(params, paramL);
        }
      }
      else {
        a(params, paramL);
      }
    }
    else
    {
      long l2 = params.a();
      long l3 = l1;
      if (l2 != -1L) {
        if (l2 < 8L) {
          l3 = l1;
        } else {
          l3 = l2 - 8L;
        }
      }
      a = l3;
      b = 1;
    }
    return 1;
  }
  
  public final void d(s params, L paramL)
  {
    long l1 = params.a();
    int i = c - 20;
    z localz = new z(i);
    params.readFully(localz.e(), 0, i);
    for (int j = 0; j < i / 12; j++)
    {
      localz.U(2);
      int k = localz.v();
      if ((k != 2192) && (k != 2816) && (k != 2817) && (k != 2819) && (k != 2820))
      {
        localz.U(8);
      }
      else
      {
        long l2 = c;
        long l3 = localz.t();
        int m = localz.t();
        a.add(new a(k, l1 - l2 - l3, m));
      }
    }
    if (a.isEmpty()) {}
    for (l1 = 0L;; l1 = a.get(0)).b)
    {
      a = l1;
      return;
      b = 3;
    }
  }
  
  public final void e(s params, List paramList)
  {
    long l = params.p();
    int i = (int)(params.a() - params.p() - c);
    z localz = new z(i);
    byte[] arrayOfByte = localz.e();
    int j = 0;
    params.readFully(arrayOfByte, 0, i);
    while (j < a.size())
    {
      params = (a)a.get(j);
      localz.T((int)(b - l));
      localz.U(4);
      i = localz.t();
      int k = b(localz.D(i));
      int m = c;
      if (k != 2192)
      {
        if ((k != 2816) && (k != 2817) && (k != 2819) && (k != 2820)) {
          throw new IllegalStateException();
        }
      }
      else {
        paramList.add(f(localz, m - (i + 8)));
      }
      j++;
    }
  }
  
  public void g()
  {
    a.clear();
    b = 0;
  }
  
  public static final class a
  {
    public final int a;
    public final long b;
    public final int c;
    
    public a(int paramInt1, long paramLong, int paramInt2)
    {
      a = paramInt1;
      b = paramLong;
      c = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     Z0.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
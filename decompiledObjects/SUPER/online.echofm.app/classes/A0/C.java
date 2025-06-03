package A0;

import B0.m.a;
import X2.v;
import X2.v.a;
import android.os.SystemClock;
import d0.J;
import d0.L;
import d0.L.a;
import java.util.Arrays;
import java.util.List;
import x0.Z;

public abstract class C
{
  public static L a(A.a parama, B[] paramArrayOfB)
  {
    List[] arrayOfList = new List[paramArrayOfB.length];
    for (int i = 0; i < paramArrayOfB.length; i++)
    {
      Object localObject = paramArrayOfB[i];
      if (localObject != null) {
        localObject = v.Z(localObject);
      } else {
        localObject = v.Y();
      }
      arrayOfList[i] = localObject;
    }
    return b(parama, arrayOfList);
  }
  
  public static L b(A.a parama, List[] paramArrayOfList)
  {
    v.a locala = new v.a();
    Object localObject;
    for (int i = 0; i < parama.d(); i++)
    {
      localObject = parama.f(i);
      List localList = paramArrayOfList[i];
      for (int j = 0; j < a; j++)
      {
        J localJ = ((Z)localObject).b(j);
        boolean bool;
        if (parama.a(i, j, false) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        int k = a;
        int[] arrayOfInt = new int[k];
        boolean[] arrayOfBoolean = new boolean[k];
        for (k = 0; k < a; k++)
        {
          arrayOfInt[k] = parama.g(i, j, k);
          for (int m = 0; m < localList.size(); m++)
          {
            B localB = (B)localList.get(m);
            if ((localB.d().equals(localJ)) && (localB.e(k) != -1))
            {
              n = 1;
              break label190;
            }
          }
          int n = 0;
          label190:
          arrayOfBoolean[k] = n;
        }
        locala.h(new L.a(localJ, bool, arrayOfInt, arrayOfBoolean));
      }
    }
    parama = parama.h();
    for (i = 0; i < a; i++)
    {
      localObject = parama.b(i);
      paramArrayOfList = new int[a];
      Arrays.fill(paramArrayOfList, 0);
      locala.h(new L.a((J)localObject, false, paramArrayOfList, new boolean[a]));
    }
    return new L(locala.k());
  }
  
  public static m.a c(y paramy)
  {
    long l = SystemClock.elapsedRealtime();
    int i = paramy.length();
    int j = 0;
    int m;
    for (int k = j; j < i; k = m)
    {
      m = k;
      if (paramy.i(j, l)) {
        m = k + 1;
      }
      j++;
    }
    return new m.a(1, 0, i, k);
  }
}

/* Location:
 * Qualified Name:     A0.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
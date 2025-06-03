package R2;

import com.google.android.gms.internal.measurement.Q7;
import com.google.android.gms.internal.measurement.T7;
import java.util.List;

public final class C2
  implements T7
{
  public C2(x2 paramx2) {}
  
  public final void a(Q7 paramQ7, String paramString, List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = E2.a[paramQ7.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            paramQ7 = a.j().J();
          } else {
            paramQ7 = a.j().K();
          }
        }
        else
        {
          paramQ7 = a.j();
          if (paramBoolean1) {
            paramQ7 = paramQ7.N();
          } else if (!paramBoolean2) {
            paramQ7 = paramQ7.M();
          } else {
            paramQ7 = paramQ7.L();
          }
        }
      }
      else
      {
        paramQ7 = a.j();
        if (paramBoolean1) {
          paramQ7 = paramQ7.I();
        } else if (!paramBoolean2) {
          paramQ7 = paramQ7.H();
        } else {
          paramQ7 = paramQ7.G();
        }
      }
    }
    else {
      paramQ7 = a.j().F();
    }
    i = paramList.size();
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          paramQ7.a(paramString);
          return;
        }
        paramQ7.d(paramString, paramList.get(0), paramList.get(1), paramList.get(2));
        return;
      }
      paramQ7.c(paramString, paramList.get(0), paramList.get(1));
      return;
    }
    paramQ7.b(paramString, paramList.get(0));
  }
}

/* Location:
 * Qualified Name:     R2.C2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
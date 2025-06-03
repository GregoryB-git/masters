package com.google.android.recaptcha.internal;

import java.util.Collection;
import lc.a;
import sb.k;
import sb.q;

public final class zzgp
  implements zzgx
{
  public static final zzgp zza = new zzgp();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (paramVarArgs.length == 1)
    {
      Object localObject = paramzzgd.zzc();
      int i = 0;
      int j = 0;
      int k = 0;
      int m = 0;
      int n = 0;
      localObject = ((zzge)localObject).zza(paramVarArgs[0]);
      paramVarArgs = (zzue[])localObject;
      if (true != localObject instanceof Object) {
        paramVarArgs = null;
      }
      if (paramVarArgs != null)
      {
        if ((paramVarArgs instanceof int[]))
        {
          localObject = (int[])paramVarArgs;
          paramVarArgs = new StringBuilder();
          paramVarArgs.append("[");
          j = localObject.length;
          i = 0;
          while (n < j)
          {
            k = localObject[n];
            i++;
            if (i > 1) {
              paramVarArgs.append(",");
            }
            paramVarArgs.append(String.valueOf(k));
            n++;
          }
          paramVarArgs.append("]");
          paramVarArgs = paramVarArgs.toString();
        }
        else
        {
          if ((paramVarArgs instanceof byte[])) {
            paramVarArgs = new String((byte[])paramVarArgs, a.a);
          }
          for (;;)
          {
            break;
            if ((paramVarArgs instanceof long[]))
            {
              localObject = (long[])paramVarArgs;
              paramVarArgs = new StringBuilder();
              paramVarArgs.append("[");
              k = localObject.length;
              j = 0;
              n = i;
              i = j;
              while (n < k)
              {
                long l = localObject[n];
                i++;
                if (i > 1) {
                  paramVarArgs.append(",");
                }
                paramVarArgs.append(String.valueOf(l));
                n++;
              }
              paramVarArgs.append("]");
              paramVarArgs = paramVarArgs.toString();
            }
            else if ((paramVarArgs instanceof short[]))
            {
              localObject = (short[])paramVarArgs;
              paramVarArgs = new StringBuilder();
              paramVarArgs.append("[");
              k = localObject.length;
              i = 0;
              for (n = j; n < k; n++)
              {
                j = localObject[n];
                i++;
                if (i > 1) {
                  paramVarArgs.append(",");
                }
                paramVarArgs.append(String.valueOf(j));
              }
              paramVarArgs.append("]");
              paramVarArgs = paramVarArgs.toString();
            }
            else if ((paramVarArgs instanceof float[]))
            {
              localObject = (float[])paramVarArgs;
              paramVarArgs = new StringBuilder();
              paramVarArgs.append("[");
              j = localObject.length;
              i = 0;
              for (n = k; n < j; n++)
              {
                float f = localObject[n];
                i++;
                if (i > 1) {
                  paramVarArgs.append(",");
                }
                paramVarArgs.append(String.valueOf(f));
              }
              paramVarArgs.append("]");
              paramVarArgs = paramVarArgs.toString();
            }
            else if ((paramVarArgs instanceof double[]))
            {
              paramVarArgs = (double[])paramVarArgs;
              localObject = new StringBuilder();
              ((StringBuilder)localObject).append("[");
              j = paramVarArgs.length;
              i = 0;
              for (n = m; n < j; n++)
              {
                double d = paramVarArgs[n];
                i++;
                if (i > 1) {
                  ((StringBuilder)localObject).append(",");
                }
                ((StringBuilder)localObject).append(String.valueOf(d));
              }
              ((StringBuilder)localObject).append("]");
              paramVarArgs = ((StringBuilder)localObject).toString();
            }
            else if ((paramVarArgs instanceof char[]))
            {
              paramVarArgs = new String((char[])paramVarArgs);
            }
            else if ((paramVarArgs instanceof Object[]))
            {
              paramVarArgs = k.p((Object[])paramVarArgs, ",", "[", "]", 56);
            }
            else
            {
              if (!(paramVarArgs instanceof Collection)) {
                break label670;
              }
              paramVarArgs = q.p((Iterable)paramVarArgs, ",", "[", "]", null, 56);
            }
          }
        }
        paramzzgd.zzc().zze(paramInt, paramVarArgs);
        return;
        label670:
        throw new zzce(4, 5, null);
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzgp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
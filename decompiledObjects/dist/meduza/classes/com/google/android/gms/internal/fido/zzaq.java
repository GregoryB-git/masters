package com.google.android.gms.internal.fido;

import g;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzaq
{
  public static String zza(String paramString, Object... paramVarArgs)
  {
    int i = 0;
    for (int j = 0;; j++)
    {
      k = paramVarArgs.length;
      if (j >= k) {
        break;
      }
      Object localObject1 = paramVarArgs[j];
      if (localObject1 == null) {
        localObject2 = "null";
      } else {
        try
        {
          localObject2 = localObject1.toString();
        }
        catch (Exception localException)
        {
          localObject2 = g.e(localObject1.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(localObject1)));
          Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat((String)localObject2), localException);
          localObject1 = localException.getClass().getName();
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("<");
          localStringBuilder.append((String)localObject2);
          localStringBuilder.append(" threw ");
          localStringBuilder.append((String)localObject1);
          localStringBuilder.append(">");
          localObject2 = localStringBuilder.toString();
        }
      }
      paramVarArgs[j] = localObject2;
    }
    Object localObject2 = new StringBuilder(paramString.length() + k * 16);
    int k = 0;
    for (j = i;; j++)
    {
      i = paramVarArgs.length;
      if (j >= i) {
        break;
      }
      int m = paramString.indexOf("%s", k);
      if (m == -1) {
        break;
      }
      ((StringBuilder)localObject2).append(paramString, k, m);
      ((StringBuilder)localObject2).append(paramVarArgs[j]);
      k = m + 2;
    }
    ((StringBuilder)localObject2).append(paramString, k, paramString.length());
    if (j < i)
    {
      ((StringBuilder)localObject2).append(" [");
      k = j + 1;
      ((StringBuilder)localObject2).append(paramVarArgs[j]);
      for (j = k; j < paramVarArgs.length; j++)
      {
        ((StringBuilder)localObject2).append(", ");
        ((StringBuilder)localObject2).append(paramVarArgs[j]);
      }
      ((StringBuilder)localObject2).append(']');
    }
    return ((StringBuilder)localObject2).toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzaq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
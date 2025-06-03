package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Map;
import rb.d;
import sb.z;

public final class zzii
  implements zzih
{
  private final Context zza;
  private final Map zzb;
  
  public zzii(Context paramContext)
  {
    zza = paramContext;
    zzb = z.K0(new d[] { new d(Integer.valueOf(2), Context.ACTIVITY_SERVICE), new d(Integer.valueOf(3), Context.TELEPHONY_SERVICE), new d(Integer.valueOf(4), Context.INPUT_METHOD_SERVICE), new d(Integer.valueOf(5), Context.AUDIO_SERVICE) });
  }
  
  public final Object zza(Object... paramVarArgs)
  {
    Object localObject = paramVarArgs[0];
    paramVarArgs = (Object[])localObject;
    if (true != localObject instanceof Integer) {
      paramVarArgs = null;
    }
    paramVarArgs = (Integer)paramVarArgs;
    if (paramVarArgs != null)
    {
      int i = paramVarArgs.intValue();
      paramVarArgs = zzb.get(Integer.valueOf(i));
      if (paramVarArgs != null) {
        return zza.getSystemService((String)paramVarArgs);
      }
      throw new zzce(4, 4, null);
    }
    throw new zzce(4, 5, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzii
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import dc.p;
import ec.i;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lc.d;
import rb.f;
import vb.a;
import x6.b;

public final class zzdc
  implements RecaptchaClient, RecaptchaTasksClient
{
  private static final d zza = new d("^[a-zA-Z0-9/_]{0,100}$");
  private final zzcn zzb;
  private final String zzc;
  private final zzek zzd;
  private final zzbi zze;
  
  public zzdc(zzcn paramzzcn, String paramString, zzbi paramzzbi, zzek paramzzek)
  {
    zzb = paramzzcn;
    zzc = paramString;
    zze = paramzzbi;
    zzd = paramzzek;
  }
  
  public static final void zze(zzdc paramzzdc, long paramLong, RecaptchaAction paramRecaptchaAction)
  {
    paramzzdc = zza;
    paramRecaptchaAction = paramRecaptchaAction.getAction();
    paramzzdc.getClass();
    i.e(paramRecaptchaAction, "input");
    if (!a.matcher(paramRecaptchaAction).matches()) {
      paramzzdc = new zzbd(zzbb.zzg, zzba.zzh, null);
    } else {
      paramzzdc = null;
    }
    if (paramLong < 5000L) {
      paramzzdc = new zzbd(zzbb.zzb, zzba.zzI, null);
    }
    if (paramzzdc == null) {
      return;
    }
    throw paramzzdc;
  }
  
  private final Object zzf(RecaptchaAction paramRecaptchaAction, long paramLong, ub.e parame)
  {
    if ((parame instanceof zzcy))
    {
      localObject = (zzcy)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (ub.e)localObject;
        break label59;
      }
    }
    parame = new zzcy(this, parame);
    label59:
    Object localObject = zza;
    a locala = a.a;
    int i = zzc;
    if ((i == 0) || (i == 1)) {}
    try
    {
      f.b(localObject);
      paramRecaptchaAction = (RecaptchaAction)localObject;
      break label170;
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      f.b(localObject);
      localObject = UUID.randomUUID().toString();
      zzcz localzzcz = new com/google/android/recaptcha/internal/zzcz;
      localzzcz.<init>(this, paramLong, paramRecaptchaAction, (String)localObject, null);
      zzc = 1;
      parame = zzg((String)localObject, localzzcz, parame);
      paramRecaptchaAction = parame;
      if (parame == locala) {
        return locala;
      }
      label170:
      paramRecaptchaAction = a;
    }
    catch (zzbd paramRecaptchaAction)
    {
      paramRecaptchaAction = f.a(paramRecaptchaAction.zzc());
    }
    return paramRecaptchaAction;
  }
  
  private final Object zzg(String paramString, p paramp, ub.e parame)
  {
    if ((parame instanceof zzdb))
    {
      localzzdb = (zzdb)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        break label52;
      }
    }
    zzdb localzzdb = new zzdb(this, parame);
    label52:
    Object localObject = zza;
    a locala = a.a;
    int i = zzc;
    if (i != 0)
    {
      if (i == 1)
      {
        paramString = zzd;
        parame = paramString;
        str = paramString;
        try
        {
          f.b(localObject);
          paramp = (p)localObject;
        }
        catch (Exception paramString)
        {
          break label209;
        }
        catch (zzbd paramString)
        {
          break label234;
        }
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject);
      localObject = zzd.zza();
      ((zzek)localObject).zzc(paramString);
      paramString = ((zzek)localObject).zzf(9);
      parame = paramString;
      str = paramString;
      zzd = paramString;
      parame = paramString;
      str = paramString;
      zzc = 1;
      parame = paramString;
      str = paramString;
      paramp = paramp.invoke(localObject, localzzdb);
      if (paramp == locala) {
        break label206;
      }
    }
    parame = paramString;
    String str = paramString;
    paramString.zza();
    return paramp;
    label206:
    return locala;
    label209:
    paramString = new zzbd(zzbb.zzb, zzba.zzX, paramString.getMessage());
    parame.zzb(paramString);
    throw paramString;
    label234:
    str.zzb(paramString);
    throw paramString;
  }
  
  public final Object execute-0E7RQCE(RecaptchaAction paramRecaptchaAction, long paramLong, ub.e<? super rb.e<String>> parame)
  {
    if ((parame instanceof zzcw))
    {
      localObject1 = (zzcw)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (ub.e<? super rb.e<String>>)localObject1;
        break label59;
      }
    }
    parame = new zzcw(this, parame);
    label59:
    Object localObject2 = zza;
    Object localObject1 = a.a;
    int i = zzc;
    if (i != 0)
    {
      if (i == 1)
      {
        f.b(localObject2);
        paramRecaptchaAction = a;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject2);
      zzc = 1;
      parame = zzf(paramRecaptchaAction, paramLong, parame);
      paramRecaptchaAction = parame;
      if (parame == localObject1) {
        return localObject1;
      }
    }
    return paramRecaptchaAction;
  }
  
  public final Object execute-gIAlu-s(RecaptchaAction paramRecaptchaAction, ub.e<? super rb.e<String>> parame)
  {
    if ((parame instanceof zzcx))
    {
      localObject1 = (zzcx)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (ub.e<? super rb.e<String>>)localObject1;
        break label50;
      }
    }
    parame = new zzcx(this, parame);
    label50:
    Object localObject2 = zza;
    Object localObject1 = a.a;
    int i = zzc;
    if (i != 0)
    {
      if (i == 1)
      {
        f.b(localObject2);
        paramRecaptchaAction = a;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject2);
      zzc = 1;
      parame = execute-0E7RQCE(paramRecaptchaAction, 10000L, parame);
      paramRecaptchaAction = parame;
      if (parame == localObject1) {
        return localObject1;
      }
    }
    return paramRecaptchaAction;
  }
  
  public final Task<String> executeTask(RecaptchaAction paramRecaptchaAction)
  {
    return zzas.zza(b.h(zze.zzb(), new zzda(this, paramRecaptchaAction, 10000L, null)));
  }
  
  public final Task<String> executeTask(RecaptchaAction paramRecaptchaAction, long paramLong)
  {
    return zzas.zza(b.h(zze.zzb(), new zzda(this, paramRecaptchaAction, paramLong, null)));
  }
  
  public final String zzd()
  {
    return zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzdc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
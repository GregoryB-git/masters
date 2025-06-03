package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import com.google.android.recaptcha.internal.zzdc;
import rb.f;
import vb.a;
import wb.c;

public final class Recaptcha
{
  public static final Recaptcha INSTANCE = new Recaptcha();
  
  public static final Task<RecaptchaTasksClient> fetchTaskClient(Application paramApplication, String paramString)
  {
    return zzcq.zze(paramApplication, paramString);
  }
  
  public static final Task<RecaptchaTasksClient> getTasksClient(Application paramApplication, String paramString)
  {
    return zzcq.zzc(paramApplication, paramString, 10000L);
  }
  
  public static final Task<RecaptchaTasksClient> getTasksClient(Application paramApplication, String paramString, long paramLong)
  {
    return zzcq.zzc(paramApplication, paramString, paramLong);
  }
  
  public final Object fetchClient(Application paramApplication, String paramString, ub.e<? super RecaptchaClient> parame)
  {
    return zzcq.zzd(paramApplication, paramString, parame);
  }
  
  public final Object getClient-BWLJW6A(Application paramApplication, String paramString, long paramLong, ub.e<? super rb.e<? extends RecaptchaClient>> parame)
  {
    if ((parame instanceof getClient.1))
    {
      localObject = (getClient.1)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (ub.e<? super rb.e<? extends RecaptchaClient>>)localObject;
        break label59;
      }
    }
    parame = new c(parame)
    {
      public int zzc;
      
      public final Object invokeSuspend(Object paramAnonymousObject)
      {
        zza = paramAnonymousObject;
        zzc |= 0x80000000;
        paramAnonymousObject = zzb.getClient-BWLJW6A(null, null, 0L, this);
        if (paramAnonymousObject == a.a) {
          return paramAnonymousObject;
        }
        return new rb.e(paramAnonymousObject);
      }
    };
    label59:
    Object localObject = zza;
    a locala = a.a;
    int i = zzc;
    if ((i == 0) || (i == 1)) {}
    try
    {
      f.b(localObject);
      paramApplication = (Application)localObject;
      break label141;
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      f.b(localObject);
      zzc = 1;
      paramString = zzcq.zzb(paramApplication, paramString, paramLong, parame);
      paramApplication = paramString;
      if (paramString == locala) {
        return locala;
      }
      label141:
      paramApplication = (zzdc)paramApplication;
    }
    finally
    {
      paramApplication = f.a(paramApplication);
    }
    return paramApplication;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.Recaptcha
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
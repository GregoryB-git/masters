package e6;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import k6.a.a;
import k6.a.d;
import k6.a.d.c;
import k6.a.g;
import k6.d;
import k6.d.a;

public abstract class a
  extends d<a.d.c>
{
  private static final a.g zza;
  private static final a.a zzb;
  private static final k6.a zzc;
  
  static
  {
    a.g localg = new a.g();
    zza = localg;
    b localb = new b();
    zzb = localb;
    zzc = new k6.a("SmsRetriever.API", localb, localg);
  }
  
  public a(Activity paramActivity)
  {
    super(paramActivity, zzc, a.d.j, d.a.c);
  }
  
  public a(Context paramContext)
  {
    super(paramContext, zzc, a.d.j, d.a.c);
  }
  
  public abstract Task<Void> startSmsRetriever();
  
  public abstract Task<Void> startSmsUserConsent(String paramString);
}

/* Location:
 * Qualified Name:     e6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
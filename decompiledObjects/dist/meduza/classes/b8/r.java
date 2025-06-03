package b8;

import android.net.Uri;
import c8.i;
import c8.k;
import c8.l;
import com.google.android.gms.internal.firebase-auth-api.zzagw;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth.c;
import java.util.List;
import n6.a;
import u7.f;

public abstract class r
  extends a
  implements o0
{
  public abstract String A();
  
  public abstract k D();
  
  public abstract l E();
  
  public abstract List<? extends o0> F();
  
  public abstract String G();
  
  public abstract boolean H();
  
  public final Task<Void> I()
  {
    FirebaseAuth localFirebaseAuth = FirebaseAuth.getInstance(K());
    localFirebaseAuth.getClass();
    FirebaseAuth.c localc = new FirebaseAuth.c(localFirebaseAuth);
    return e.zza(a, this, localc);
  }
  
  public abstract i J(List paramList);
  
  public abstract f K();
  
  public abstract void L(zzagw paramzzagw);
  
  public abstract i M();
  
  public abstract void N(List<t0> paramList);
  
  public abstract zzagw O();
  
  public abstract void P(List<x> paramList);
  
  public abstract List<t0> Q();
  
  public abstract String a();
  
  public abstract Uri h();
  
  public abstract String m();
  
  public abstract String o();
  
  public abstract String zzd();
  
  public abstract String zze();
  
  public abstract List<String> zzg();
}

/* Location:
 * Qualified Name:     b8.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
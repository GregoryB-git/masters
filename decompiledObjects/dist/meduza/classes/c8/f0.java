package c8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import b8.r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.AbstractCollection;
import java.util.List;
import m6.j;
import u7.f;

public final class f0
{
  public static final com.google.android.gms.internal.firebase_auth_api.zzaj<String> c = com.google.android.gms.internal.firebase_auth_api.zzaj.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");
  public static final f0 d = new f0();
  public Task<String> a;
  public long b = 0L;
  
  public static void a(Context paramContext, Status paramStatus)
  {
    paramContext = paramContext.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
    paramContext.putInt("statusCode", a);
    paramContext.putString("statusMessage", b);
    paramContext.putLong("timestamp", System.currentTimeMillis());
    paramContext.commit();
  }
  
  public static void b(Context paramContext, FirebaseAuth paramFirebaseAuth)
  {
    j.i(paramContext);
    j.i(paramFirebaseAuth);
    paramContext = paramContext.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
    paramFirebaseAuth = a;
    paramFirebaseAuth.a();
    paramContext.putString("firebaseAppName", b);
    paramContext.commit();
  }
  
  public static void c(Context paramContext, FirebaseAuth paramFirebaseAuth, r paramr)
  {
    j.i(paramContext);
    paramContext = paramContext.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
    paramFirebaseAuth = a;
    paramFirebaseAuth.a();
    paramContext.putString("firebaseAppName", b);
    paramContext.putString("firebaseUserUid", paramr.a());
    paramContext.commit();
  }
  
  public static void d(SharedPreferences paramSharedPreferences)
  {
    paramSharedPreferences = paramSharedPreferences.edit();
    com.google.android.gms.internal.firebase-auth-api.zzaj localzzaj = c;
    int i = localzzaj.size();
    int j = 0;
    while (j < i)
    {
      Object localObject = localzzaj.get(j);
      j++;
      paramSharedPreferences.remove((String)localObject);
    }
    paramSharedPreferences.commit();
  }
}

/* Location:
 * Qualified Name:     c8.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
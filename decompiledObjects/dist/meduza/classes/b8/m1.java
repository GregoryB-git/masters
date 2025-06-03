package b8;

import android.text.TextUtils;
import android.util.Log;
import c8.i0;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public final class m1
  extends i0<Void>
{
  public m1(FirebaseAuth paramFirebaseAuth, String paramString, c paramc) {}
  
  public final Task<Void> b(String paramString)
  {
    StringBuilder localStringBuilder;
    if (TextUtils.isEmpty(paramString))
    {
      localObject = a;
      localStringBuilder = new StringBuilder("Email link sign in for ");
      localStringBuilder.append((String)localObject);
      localObject = " with empty reCAPTCHA token";
    }
    else
    {
      localObject = a;
      localStringBuilder = new StringBuilder("Got reCAPTCHA token for email link sign in for ");
    }
    localStringBuilder.append((String)localObject);
    Log.i("FirebaseAuth", localStringBuilder.toString());
    Object localObject = c;
    return e.zzb(a, a, b, k, paramString);
  }
}

/* Location:
 * Qualified Name:     b8.m1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
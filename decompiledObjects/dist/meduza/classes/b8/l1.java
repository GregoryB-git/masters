package b8;

import android.text.TextUtils;
import android.util.Log;
import c8.i0;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public final class l1
  extends i0<Void>
{
  public l1(FirebaseAuth paramFirebaseAuth, String paramString, c paramc) {}
  
  public final Task<Void> b(String paramString)
  {
    String str;
    if (TextUtils.isEmpty(paramString))
    {
      str = a;
      localObject = new StringBuilder("Password reset request ");
      ((StringBuilder)localObject).append(str);
      str = " with empty reCAPTCHA token";
    }
    else
    {
      str = a;
      localObject = new StringBuilder("Got reCAPTCHA token for password reset of email ");
    }
    ((StringBuilder)localObject).append(str);
    Log.i("FirebaseAuth", ((StringBuilder)localObject).toString());
    Object localObject = c;
    return e.zza(a, a, b, k, paramString);
  }
}

/* Location:
 * Qualified Name:     b8.l1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
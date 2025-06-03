package c8;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

public final class p0
  implements OnFailureListener
{
  public p0(y paramy, FirebaseAuth paramFirebaseAuth, String paramString, Activity paramActivity, boolean paramBoolean, u0 paramu0, TaskCompletionSource paramTaskCompletionSource) {}
  
  public final void onFailure(Exception paramException)
  {
    Object localObject = y.b;
    localObject = paramException.getMessage();
    paramException = new StringBuilder("Failed to get reCAPTCHA enterprise token: ");
    paramException.append((String)localObject);
    paramException.append("\n\n Using fallback methods.");
    Log.e("y", paramException.toString());
    if (a.p().c())
    {
      p.c(a, b, c, d, e, f, o);
      return;
    }
    o.setResult(new a1(null, null, null));
  }
}

/* Location:
 * Qualified Name:     c8.p0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
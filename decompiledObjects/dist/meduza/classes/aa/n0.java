package aa;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import m1.b;

public final class n0
  extends Binder
{
  public final a a;
  
  public n0(h.a parama)
  {
    a = parama;
  }
  
  public final void a(o0.a parama)
  {
    if (Binder.getCallingUid() == Process.myUid())
    {
      if (Log.isLoggable("FirebaseMessaging", 3)) {
        Log.d("FirebaseMessaging", "service received new intent via bind strategy");
      }
      a locala = a;
      Intent localIntent = a;
      h.access$000(a, localIntent).addOnCompleteListener(new b(6), new m0(parama, 0));
      return;
    }
    throw new SecurityException("Binding only allowed within app");
  }
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     aa.n0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
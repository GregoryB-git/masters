package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.savedstate.SavedStateRegistry;
import c.b;

public class e$b
  implements b
{
  public e$b(e parame) {}
  
  public void a(Context paramContext)
  {
    a.y.a(null);
    paramContext = a.k().a("android:support:fragments");
    if (paramContext != null)
    {
      paramContext = paramContext.getParcelable("android:support:fragments");
      a.y.w(paramContext);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.d.b;
import androidx.savedstate.SavedStateRegistry.b;

public class e$a
  implements SavedStateRegistry.b
{
  public e$a(e parame) {}
  
  public Bundle a()
  {
    Bundle localBundle = new Bundle();
    a.p();
    a.z.h(d.b.ON_STOP);
    Parcelable localParcelable = a.y.x();
    if (localParcelable != null) {
      localBundle.putParcelable("android:support:fragments", localParcelable);
    }
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
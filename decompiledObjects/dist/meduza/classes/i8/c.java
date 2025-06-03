package i8;

import android.util.Log;

public final class c
  implements b
{
  public final void c(a parama)
  {
    int i;
    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
    }
  }
}

/* Location:
 * Qualified Name:     i8.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
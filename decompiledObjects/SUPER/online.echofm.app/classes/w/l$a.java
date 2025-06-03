package w;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.content.Intent;
import android.os.Bundle;

public abstract class l$a
{
  public static void a(Object paramObject, Intent paramIntent, Bundle paramBundle)
  {
    RemoteInput.addResultsToIntent((RemoteInput[])paramObject, paramIntent, paramBundle);
  }
  
  public static RemoteInput b(l paraml)
  {
    paraml = new android/app/RemoteInput$Builder;
    throw null;
  }
  
  public static Bundle c(Intent paramIntent)
  {
    return RemoteInput.getResultsFromIntent(paramIntent);
  }
}

/* Location:
 * Qualified Name:     w.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
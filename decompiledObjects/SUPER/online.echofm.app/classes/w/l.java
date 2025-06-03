package w;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.content.Intent;
import android.os.Bundle;

public abstract class l
{
  public static RemoteInput a(l paraml)
  {
    return a.b(paraml);
  }
  
  public static RemoteInput[] b(l[] paramArrayOfl)
  {
    if (paramArrayOfl == null) {
      return null;
    }
    RemoteInput[] arrayOfRemoteInput = new RemoteInput[paramArrayOfl.length];
    for (int i = 0; i < paramArrayOfl.length; i++)
    {
      l locall = paramArrayOfl[i];
      arrayOfRemoteInput[i] = a(null);
    }
    return arrayOfRemoteInput;
  }
  
  public static abstract class a
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
}

/* Location:
 * Qualified Name:     w.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
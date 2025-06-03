package d6;

import android.app.PendingIntent;
import com.google.android.gms.tasks.Task;

public abstract interface j
{
  public abstract Task<c> beginSignIn(b paramb);
  
  public abstract Task<PendingIntent> getSignInIntent(f paramf);
}

/* Location:
 * Qualified Name:     d6.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
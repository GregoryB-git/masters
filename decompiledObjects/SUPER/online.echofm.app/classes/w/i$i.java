package w;

import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.Person;

public abstract class i$i
{
  public static Notification.Builder a(Notification.Builder paramBuilder, Person paramPerson)
  {
    return paramBuilder.addPerson(paramPerson);
  }
  
  public static Notification.Action.Builder b(Notification.Action.Builder paramBuilder, int paramInt)
  {
    return paramBuilder.setSemanticAction(paramInt);
  }
}

/* Location:
 * Qualified Name:     w.i.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
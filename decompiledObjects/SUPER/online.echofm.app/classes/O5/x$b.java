package O5;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.AbstractMap;
import java.util.HashMap;

public class x$b
  extends HashMap
{
  public x$b(x paramx, FirebaseMessaging paramFirebaseMessaging)
  {
    put("isAutoInitEnabled", Boolean.valueOf(paramFirebaseMessaging.y()));
  }
}

/* Location:
 * Qualified Name:     O5.x.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
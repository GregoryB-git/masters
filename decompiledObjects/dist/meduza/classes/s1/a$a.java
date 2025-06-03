package s1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public final class a$a
  implements c.b
{
  public final LinkedHashSet a = new LinkedHashSet();
  
  public a$a(c paramc)
  {
    paramc.c("androidx.savedstate.Restarter", this);
  }
  
  public final Bundle a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putStringArrayList("classes_to_restore", new ArrayList(a));
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     s1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
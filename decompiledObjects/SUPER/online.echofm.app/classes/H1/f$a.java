package H1;

import V5.l;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum f$a
{
  public final String e()
  {
    int i = a.a[ordinal()];
    String str;
    if (i != 1)
    {
      if (i == 2) {
        str = "app_event_pred";
      } else {
        throw new l();
      }
    }
    else {
      str = "integrity_detect";
    }
    return str;
  }
  
  public final String h()
  {
    int i = a.a[ordinal()];
    String str;
    if (i != 1)
    {
      if (i == 2) {
        str = "MTML_APP_EVENT_PRED";
      } else {
        throw new l();
      }
    }
    else {
      str = "MTML_INTEGRITY_DETECT";
    }
    return str;
  }
}

/* Location:
 * Qualified Name:     H1.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
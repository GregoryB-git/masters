package A2;

import com.google.android.gms.common.api.Status;
import y2.f;

public abstract class b
{
  public static y2.b a(Status paramStatus)
  {
    if (paramStatus.g()) {
      return new f(paramStatus);
    }
    return new y2.b(paramStatus);
  }
}

/* Location:
 * Qualified Name:     A2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
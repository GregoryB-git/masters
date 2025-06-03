package w4;

import f;
import p4.a.b;

public abstract class b
  implements a.b
{
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SCTE-35 splice command: type=");
    localStringBuilder.append(getClass().getSimpleName());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     w4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
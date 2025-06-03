package V0;

import d0.x.b;

public abstract class b
  implements x.b
{
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SCTE-35 splice command: type=");
    localStringBuilder.append(getClass().getSimpleName());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     V0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
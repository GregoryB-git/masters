package m9;

import f;
import ka.g;

public final class k
{
  public final int a;
  public g b;
  
  public k(int paramInt, g paramg)
  {
    a = paramInt;
    b = paramg;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ExistenceFilter{count=");
    localStringBuilder.append(a);
    localStringBuilder.append(", unchangedNames=");
    localStringBuilder.append(b);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m9.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
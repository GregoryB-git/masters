package nc;

import f;

public final class w0
  implements f1
{
  public final boolean a;
  
  public w0(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public final t1 b()
  {
    return null;
  }
  
  public final boolean isActive()
  {
    return a;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Empty{");
    String str;
    if (a) {
      str = "Active";
    } else {
      str = "New";
    }
    localStringBuilder.append(str);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     nc.w0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
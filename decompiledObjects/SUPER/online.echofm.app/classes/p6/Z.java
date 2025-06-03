package p6;

public final class Z
  implements l0
{
  public final boolean o;
  
  public Z(boolean paramBoolean)
  {
    o = paramBoolean;
  }
  
  public boolean a()
  {
    return o;
  }
  
  public C0 g()
  {
    return null;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Empty{");
    String str;
    if (a()) {
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
 * Qualified Name:     p6.Z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
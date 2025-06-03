package kotlin.jvm.internal;

public final class m
  implements d
{
  public final Class o;
  public final String p;
  
  public m(Class paramClass, String paramString)
  {
    o = paramClass;
    p = paramString;
  }
  
  public Class b()
  {
    return o;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof m)) && (Intrinsics.a(b(), ((m)paramObject).b()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return b().hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b().toString());
    localStringBuilder.append(" (Kotlin reflection is not available)");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
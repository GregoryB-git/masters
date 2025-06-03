package androidx.lifecycle;

public class s
{
  public final a a;
  public final t b;
  
  public s(t paramt, a parama)
  {
    a = parama;
    b = paramt;
  }
  
  public r a(Class paramClass)
  {
    String str = paramClass.getCanonicalName();
    if (str != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
      localStringBuilder.append(str);
      return b(localStringBuilder.toString(), paramClass);
    }
    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
  }
  
  public r b(String paramString, Class paramClass)
  {
    r localr = b.b(paramString);
    if (paramClass.isInstance(localr)) {
      return localr;
    }
    paramClass = a.a(paramClass);
    b.d(paramString, paramClass);
    return paramClass;
  }
  
  public static abstract interface a
  {
    public abstract r a(Class paramClass);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
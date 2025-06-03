package androidx.datastore.preferences.protobuf;

public class v
  implements N
{
  public static final v a = new v();
  
  public static v c()
  {
    return a;
  }
  
  public M a(Class paramClass)
  {
    if (w.class.isAssignableFrom(paramClass)) {
      try
      {
        localObject = (M)w.u(paramClass.asSubclass(w.class)).n();
        return (M)localObject;
      }
      catch (Exception localException)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unable to get message info for ");
        ((StringBuilder)localObject).append(paramClass.getName());
        throw new RuntimeException(((StringBuilder)localObject).toString(), localException);
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Unsupported message type: ");
    ((StringBuilder)localObject).append(paramClass.getName());
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public boolean b(Class paramClass)
  {
    return w.class.isAssignableFrom(paramClass);
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
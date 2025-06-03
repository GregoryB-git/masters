package androidx.datastore.preferences.protobuf;

public class G$b
  implements N
{
  public N[] a;
  
  public G$b(N... paramVarArgs)
  {
    a = paramVarArgs;
  }
  
  public M a(Class paramClass)
  {
    for (localObject : a) {
      if (((N)localObject).b(paramClass)) {
        return ((N)localObject).a(paramClass);
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("No factory is available for message type: ");
    ((StringBuilder)localObject).append(paramClass.getName());
    throw new UnsupportedOperationException(((StringBuilder)localObject).toString());
  }
  
  public boolean b(Class paramClass)
  {
    N[] arrayOfN = a;
    int i = arrayOfN.length;
    for (int j = 0; j < i; j++) {
      if (arrayOfN[j].b(paramClass)) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.G.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
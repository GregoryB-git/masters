package X2;

import W2.m;
import W2.s;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class K
{
  public static boolean a(H paramH, Object paramObject)
  {
    if (paramObject == paramH) {
      return true;
    }
    if ((paramObject instanceof H))
    {
      paramObject = (H)paramObject;
      return paramH.a().equals(((H)paramObject).a());
    }
    return false;
  }
  
  public static D b(Map paramMap, s params)
  {
    return new a(paramMap, params);
  }
  
  public static class a
    extends c
  {
    private static final long serialVersionUID = 0L;
    public transient s t;
    
    public a(Map paramMap, s params)
    {
      super();
      t = ((s)m.j(params));
    }
    
    private void readObject(ObjectInputStream paramObjectInputStream)
    {
      paramObjectInputStream.defaultReadObject();
      Object localObject = paramObjectInputStream.readObject();
      Objects.requireNonNull(localObject);
      t = ((s)localObject);
      paramObjectInputStream = paramObjectInputStream.readObject();
      Objects.requireNonNull(paramObjectInputStream);
      v((Map)paramObjectInputStream);
    }
    
    private void writeObject(ObjectOutputStream paramObjectOutputStream)
    {
      paramObjectOutputStream.defaultWriteObject();
      paramObjectOutputStream.writeObject(t);
      paramObjectOutputStream.writeObject(o());
    }
    
    public Map c()
    {
      return r();
    }
    
    public Set d()
    {
      return s();
    }
    
    public List z()
    {
      return (List)t.get();
    }
  }
}

/* Location:
 * Qualified Name:     X2.K
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
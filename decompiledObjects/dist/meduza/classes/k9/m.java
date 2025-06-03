package k9;

import f;
import j9.q;
import x6.b;

public final class m
{
  public static final m c = new m(null, null);
  public final q a;
  public final Boolean b;
  
  public m(q paramq, Boolean paramBoolean)
  {
    boolean bool;
    if ((paramq != null) && (paramBoolean != null)) {
      bool = false;
    } else {
      bool = true;
    }
    b.Z("Precondition can specify \"exists\" or \"updateTime\" but not both", bool, new Object[0]);
    a = paramq;
    b = paramBoolean;
  }
  
  public static m a(boolean paramBoolean)
  {
    return new m(null, Boolean.valueOf(paramBoolean));
  }
  
  public final boolean b(j9.m paramm)
  {
    q localq = a;
    boolean bool1 = false;
    boolean bool2 = false;
    if (localq != null)
    {
      bool1 = bool2;
      if (paramm.b())
      {
        bool1 = bool2;
        if (d.equals(a)) {
          bool1 = true;
        }
      }
      return bool1;
    }
    Boolean localBoolean = b;
    if (localBoolean != null)
    {
      if (localBoolean.booleanValue() == paramm.b()) {
        bool1 = true;
      }
      return bool1;
    }
    if ((localq == null) && (localBoolean == null)) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    b.Z("Precondition should be empty", bool1, new Object[0]);
    return true;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (m.class == paramObject.getClass()))
    {
      paramObject = (m)paramObject;
      Object localObject = a;
      if (localObject != null ? !((q)localObject).equals(a) : a != null) {
        return false;
      }
      localObject = b;
      paramObject = b;
      if (localObject != null) {
        bool = ((Boolean)localObject).equals(paramObject);
      } else if (paramObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((q)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = b;
    if (localObject != null) {
      i = ((Boolean)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public final String toString()
  {
    Object localObject = a;
    int i;
    if ((localObject == null) && (b == null)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return "Precondition{<none>}";
    }
    StringBuilder localStringBuilder;
    if (localObject != null)
    {
      localStringBuilder = f.l("Precondition{updateTime=");
      localObject = a;
    }
    else
    {
      if (b == null) {
        break label84;
      }
      localStringBuilder = f.l("Precondition{exists=");
      localObject = b;
    }
    localStringBuilder.append(localObject);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
    label84:
    b.T("Invalid Precondition", new Object[0]);
    throw null;
  }
}

/* Location:
 * Qualified Name:     k9.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
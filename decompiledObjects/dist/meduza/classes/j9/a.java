package j9;

import f;
import java.util.List;

public final class a
  extends k
{
  public final int c;
  public final String d;
  public final List<k.c> e;
  public final k.b f;
  
  public a(int paramInt, String paramString, List<k.c> paramList, k.b paramb)
  {
    c = paramInt;
    if (paramString != null)
    {
      d = paramString;
      if (paramList != null)
      {
        e = paramList;
        if (paramb != null)
        {
          f = paramb;
          return;
        }
        throw new NullPointerException("Null indexState");
      }
      throw new NullPointerException("Null segments");
    }
    throw new NullPointerException("Null collectionGroup");
  }
  
  public final String b()
  {
    return d;
  }
  
  public final int d()
  {
    return c;
  }
  
  public final k.b e()
  {
    return f;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof k))
    {
      paramObject = (k)paramObject;
      if ((c != ((k)paramObject).d()) || (!d.equals(((k)paramObject).b())) || (!e.equals(((k)paramObject).f())) || (!f.equals(((k)paramObject).e()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final List<k.c> f()
  {
    return e;
  }
  
  public final int hashCode()
  {
    return (((c ^ 0xF4243) * 1000003 ^ d.hashCode()) * 1000003 ^ e.hashCode()) * 1000003 ^ f.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("FieldIndex{indexId=");
    localStringBuilder.append(c);
    localStringBuilder.append(", collectionGroup=");
    localStringBuilder.append(d);
    localStringBuilder.append(", segments=");
    localStringBuilder.append(e);
    localStringBuilder.append(", indexState=");
    localStringBuilder.append(f);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
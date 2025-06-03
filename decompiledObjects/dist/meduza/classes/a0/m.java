package a0;

import android.os.LocaleList;
import java.util.Locale;

public final class m
  implements l
{
  public final LocaleList a;
  
  public m(Object paramObject)
  {
    a = ((LocaleList)paramObject);
  }
  
  public final String a()
  {
    return a.toLanguageTags();
  }
  
  public final Object b()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    return a.equals(((l)paramObject).b());
  }
  
  public final Locale get(int paramInt)
  {
    return a.get(paramInt);
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final boolean isEmpty()
  {
    return a.isEmpty();
  }
  
  public final int size()
  {
    return a.size();
  }
  
  public final String toString()
  {
    return a.toString();
  }
}

/* Location:
 * Qualified Name:     a0.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
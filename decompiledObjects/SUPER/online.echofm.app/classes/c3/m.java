package c3;

import java.security.GeneralSecurityException;
import java.util.Map;

public abstract class m
{
  public static l a(String paramString)
  {
    Object localObject = (l)x.i().get(paramString);
    if (localObject != null) {
      return (l)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("cannot find key template: ");
    ((StringBuilder)localObject).append(paramString);
    throw new GeneralSecurityException(((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     c3.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
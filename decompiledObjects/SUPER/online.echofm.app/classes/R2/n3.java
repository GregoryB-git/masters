package R2;

import android.os.BaseBundle;
import android.os.Bundle;

public abstract class n3
{
  public static Object a(Bundle paramBundle, String paramString, Class paramClass, Object paramObject)
  {
    paramBundle = paramBundle.get(paramString);
    if (paramBundle == null) {
      return paramObject;
    }
    if (paramClass.isAssignableFrom(paramBundle.getClass())) {
      return paramBundle;
    }
    throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[] { paramString, paramClass.getCanonicalName(), paramBundle.getClass().getCanonicalName() }));
  }
  
  public static void b(Bundle paramBundle, Object paramObject)
  {
    if ((paramObject instanceof Double))
    {
      paramBundle.putDouble("value", ((Double)paramObject).doubleValue());
      return;
    }
    if ((paramObject instanceof Long))
    {
      paramBundle.putLong("value", ((Long)paramObject).longValue());
      return;
    }
    paramBundle.putString("value", paramObject.toString());
  }
}

/* Location:
 * Qualified Name:     R2.n3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
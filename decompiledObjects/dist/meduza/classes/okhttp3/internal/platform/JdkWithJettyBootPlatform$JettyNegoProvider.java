package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.Util;

class JdkWithJettyBootPlatform$JettyNegoProvider
  implements InvocationHandler
{
  public final List<String> a;
  public boolean b;
  public String c;
  
  public JdkWithJettyBootPlatform$JettyNegoProvider(ArrayList paramArrayList)
  {
    a = paramArrayList;
  }
  
  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    String str = paramMethod.getName();
    Class localClass = paramMethod.getReturnType();
    paramObject = paramArrayOfObject;
    if (paramArrayOfObject == null) {
      paramObject = Util.b;
    }
    if ((str.equals("supports")) && (Boolean.TYPE == localClass)) {
      return Boolean.TRUE;
    }
    if ((str.equals("unsupported")) && (Void.TYPE == localClass))
    {
      b = true;
      return null;
    }
    if ((str.equals("protocols")) && (paramObject.length == 0)) {
      return a;
    }
    if (((str.equals("selectProtocol")) || (str.equals("select"))) && (String.class == localClass) && (paramObject.length == 1))
    {
      paramArrayOfObject = paramObject[0];
      if ((paramArrayOfObject instanceof List))
      {
        paramObject = (List)paramArrayOfObject;
        int i = ((List)paramObject).size();
        int j = 0;
        if (j < i) {
          if (!a.contains(((List)paramObject).get(j))) {}
        }
        for (paramObject = ((List)paramObject).get(j);; paramObject = a.get(0))
        {
          paramObject = (String)paramObject;
          c = ((String)paramObject);
          return paramObject;
          j++;
          break;
        }
      }
    }
    if (((str.equals("protocolSelected")) || (str.equals("selected"))) && (paramObject.length == 1))
    {
      c = ((String)paramObject[0]);
      return null;
    }
    return paramMethod.invoke(this, (Object[])paramObject);
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.platform.JdkWithJettyBootPlatform.JettyNegoProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
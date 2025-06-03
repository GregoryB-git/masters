package d2;

import c2.j;
import c2.k;
import f;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import zc.a.a;

public final class b0
  implements WebMessageBoundaryInterface
{
  public static final String[] b = { "WEB_MESSAGE_ARRAY_BUFFER" };
  public j a;
  
  public b0(j paramj)
  {
    a = paramj;
  }
  
  public static j a(WebMessageBoundaryInterface paramWebMessageBoundaryInterface)
  {
    InvocationHandler[] arrayOfInvocationHandler = paramWebMessageBoundaryInterface.getPorts();
    k[] arrayOfk = new k[arrayOfInvocationHandler.length];
    for (int i = 0; i < arrayOfInvocationHandler.length; i++) {
      arrayOfk[i] = new f0(arrayOfInvocationHandler[i]);
    }
    if (i0.u.d())
    {
      paramWebMessageBoundaryInterface = (WebMessagePayloadBoundaryInterface)zc.a.a(WebMessagePayloadBoundaryInterface.class, paramWebMessageBoundaryInterface.getMessagePayload());
      i = paramWebMessageBoundaryInterface.getType();
      if (i != 0)
      {
        if (i != 1) {
          return null;
        }
        return new j(paramWebMessageBoundaryInterface.getAsArrayBuffer(), arrayOfk);
      }
      return new j(paramWebMessageBoundaryInterface.getAsString(), arrayOfk);
    }
    return new j(paramWebMessageBoundaryInterface.getData(), arrayOfk);
  }
  
  @Deprecated
  public final String getData()
  {
    j localj = a;
    localj.a(0);
    return b;
  }
  
  public final InvocationHandler getMessagePayload()
  {
    Object localObject = a;
    int i = d;
    if (i != 0)
    {
      if (i == 1)
      {
        ((j)localObject).a(1);
        Objects.requireNonNull(c);
        localObject = c;
        Objects.requireNonNull(localObject);
        localObject = new e0((byte[])localObject);
      }
      else
      {
        localObject = f.l("Unknown web message payload type: ");
        ((StringBuilder)localObject).append(a.d);
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
    }
    else
    {
      ((j)localObject).a(0);
      localObject = new e0(b);
    }
    return new a.a((FeatureFlagHolderBoundaryInterface)localObject);
  }
  
  public final InvocationHandler[] getPorts()
  {
    k[] arrayOfk = a.a;
    if (arrayOfk == null) {
      return null;
    }
    InvocationHandler[] arrayOfInvocationHandler = new InvocationHandler[arrayOfk.length];
    for (int i = 0; i < arrayOfk.length; i++) {
      arrayOfInvocationHandler[i] = arrayOfk[i].c();
    }
    return arrayOfInvocationHandler;
  }
  
  public final String[] getSupportedFeatures()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     d2.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
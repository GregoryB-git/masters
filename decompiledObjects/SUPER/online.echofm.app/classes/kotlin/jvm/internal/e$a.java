package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.text.i;

public final class e$a
{
  public final String a(Class paramClass)
  {
    Intrinsics.checkNotNullParameter(paramClass, "jClass");
    boolean bool = paramClass.isAnonymousClass();
    Object localObject1 = null;
    Object localObject2 = null;
    if (bool)
    {
      localObject2 = localObject1;
    }
    else
    {
      Object localObject3;
      if (paramClass.isLocalClass())
      {
        localObject3 = paramClass.getSimpleName();
        localObject2 = paramClass.getEnclosingMethod();
        if (localObject2 != null)
        {
          Intrinsics.b(localObject3);
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append(((Method)localObject2).getName());
          ((StringBuilder)localObject1).append('$');
          localObject1 = i.c0((String)localObject3, ((StringBuilder)localObject1).toString(), null, 2, null);
          localObject2 = localObject1;
          if (localObject1 == null) {}
        }
      }
      for (;;)
      {
        break;
        localObject2 = paramClass.getEnclosingConstructor();
        Intrinsics.b(localObject3);
        if (localObject2 != null)
        {
          paramClass = new StringBuilder();
          paramClass.append(((Constructor)localObject2).getName());
          paramClass.append('$');
          localObject2 = i.c0((String)localObject3, paramClass.toString(), null, 2, null);
        }
        else
        {
          localObject2 = i.b0((String)localObject3, '$', null, 2, null);
          break;
          if (paramClass.isArray())
          {
            localObject3 = paramClass.getComponentType();
            bool = ((Class)localObject3).isPrimitive();
            localObject1 = "Array";
            paramClass = (Class)localObject2;
            if (bool)
            {
              localObject3 = (String)e.c().get(((Class)localObject3).getName());
              paramClass = (Class)localObject2;
              if (localObject3 != null)
              {
                paramClass = new StringBuilder();
                paramClass.append((String)localObject3);
                paramClass.append("Array");
                paramClass = paramClass.toString();
              }
            }
            localObject2 = paramClass;
            if (paramClass == null) {
              localObject2 = localObject1;
            }
          }
          else
          {
            localObject1 = (String)e.c().get(paramClass.getName());
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = paramClass.getSimpleName();
            }
          }
        }
      }
    }
    return (String)localObject2;
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
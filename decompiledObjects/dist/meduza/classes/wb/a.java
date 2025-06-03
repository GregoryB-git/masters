package wb;

import ec.i;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import rb.h;

public abstract class a
  implements ub.e<Object>, d, Serializable
{
  private final ub.e<Object> completion;
  
  public a(ub.e<Object> parame)
  {
    completion = parame;
  }
  
  public ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    i.e(parame, "completion");
    throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
  }
  
  public ub.e<h> create(ub.e<?> parame)
  {
    i.e(parame, "completion");
    throw new UnsupportedOperationException("create(Continuation) has not been overridden");
  }
  
  public d getCallerFrame()
  {
    Object localObject = completion;
    if ((localObject instanceof d)) {
      localObject = (d)localObject;
    } else {
      localObject = null;
    }
    return (d)localObject;
  }
  
  public final ub.e<Object> getCompletion()
  {
    return completion;
  }
  
  public StackTraceElement getStackTraceElement()
  {
    e locale = (e)getClass().getAnnotation(e.class);
    Object localObject1 = null;
    Object localObject4 = null;
    int i;
    if (locale != null)
    {
      i = locale.v();
      if (i <= 1)
      {
        int j = -1;
        try
        {
          localObject1 = getClass().getDeclaredField("label");
          ((AccessibleObject)localObject1).setAccessible(true);
          localObject1 = ((Field)localObject1).get(this);
          if ((localObject1 instanceof Integer)) {
            localObject1 = (Integer)localObject1;
          } else {
            localObject1 = null;
          }
          if (localObject1 != null) {
            i = ((Integer)localObject1).intValue();
          } else {
            i = 0;
          }
          i--;
        }
        catch (Exception localException1)
        {
          i = -1;
        }
        if (i < 0) {
          i = j;
        } else {
          i = locale.l()[i];
        }
        Object localObject5 = f.b;
        Object localObject2 = localObject5;
        Object localObject6;
        Method localMethod;
        if (localObject5 == null) {
          try
          {
            localObject6 = Class.class.getDeclaredMethod("getModule", new Class[0]);
            localMethod = getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]);
            localObject5 = getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]);
            localObject2 = new wb/f$a;
            ((f.a)localObject2).<init>((Method)localObject6, localMethod, (Method)localObject5);
            f.b = (f.a)localObject2;
          }
          catch (Exception localException2)
          {
            localObject3 = f.a;
            f.b = (f.a)localObject3;
          }
        }
        if (localObject3 == f.a)
        {
          localObject5 = localObject4;
        }
        else
        {
          localObject6 = a;
          localObject5 = localObject4;
          if (localObject6 != null)
          {
            localObject6 = ((Method)localObject6).invoke(getClass(), new Object[0]);
            if (localObject6 == null)
            {
              localObject5 = localObject4;
            }
            else
            {
              localMethod = b;
              localObject5 = localObject4;
              if (localMethod != null)
              {
                localObject5 = localMethod.invoke(localObject6, new Object[0]);
                if (localObject5 == null)
                {
                  localObject5 = localObject4;
                }
                else
                {
                  localObject3 = c;
                  if (localObject3 != null) {
                    localObject3 = ((Method)localObject3).invoke(localObject5, new Object[0]);
                  } else {
                    localObject3 = null;
                  }
                  localObject5 = localObject4;
                  if ((localObject3 instanceof String)) {
                    localObject5 = (String)localObject3;
                  }
                }
              }
            }
          }
        }
        if (localObject5 == null)
        {
          localObject3 = locale.c();
        }
        else
        {
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append((String)localObject5);
          ((StringBuilder)localObject3).append('/');
          ((StringBuilder)localObject3).append(locale.c());
          localObject3 = ((StringBuilder)localObject3).toString();
        }
        localObject3 = new StackTraceElement((String)localObject3, locale.m(), locale.f(), i);
      }
    }
    else
    {
      return (StackTraceElement)localObject3;
    }
    Object localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append("Debug metadata version mismatch. Expected: ");
    ((StringBuilder)localObject3).append(1);
    ((StringBuilder)localObject3).append(", got ");
    ((StringBuilder)localObject3).append(i);
    ((StringBuilder)localObject3).append(". Please update the Kotlin standard library.");
    throw new IllegalStateException(((StringBuilder)localObject3).toString().toString());
  }
  
  public abstract Object invokeSuspend(Object paramObject);
  
  public void releaseIntercepted() {}
  
  public final void resumeWith(Object paramObject)
  {
    Object localObject1 = this;
    do
    {
      a locala = (a)localObject1;
      localObject1 = completion;
      i.b(localObject1);
      try
      {
        Object localObject2 = locala.invokeSuspend(paramObject);
        vb.a locala1 = vb.a.a;
        paramObject = localObject2;
        if (localObject2 == locala1) {
          return;
        }
      }
      finally
      {
        paramObject = rb.f.a((Throwable)paramObject);
        locala.releaseIntercepted();
      }
    } while ((localObject1 instanceof a));
    ((ub.e)localObject1).resumeWith(paramObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("Continuation at ");
    Object localObject = getStackTraceElement();
    if (localObject == null) {
      localObject = getClass().getName();
    }
    localStringBuilder.append(localObject);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     wb.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
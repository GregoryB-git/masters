package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import m6.j;

public final class ObjectWrapper<T>
  extends IObjectWrapper.Stub
{
  public final Object a;
  
  public ObjectWrapper(Object paramObject)
  {
    a = paramObject;
  }
  
  public static <T> T unwrap(IObjectWrapper paramIObjectWrapper)
  {
    if ((paramIObjectWrapper instanceof ObjectWrapper)) {
      return (T)a;
    }
    IBinder localIBinder = paramIObjectWrapper.asBinder();
    Field[] arrayOfField = localIBinder.getClass().getDeclaredFields();
    int i = arrayOfField.length;
    paramIObjectWrapper = null;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      Field localField = arrayOfField[j];
      m = k;
      if (!localField.isSynthetic())
      {
        m = k + 1;
        paramIObjectWrapper = localField;
      }
      j++;
    }
    if (k == 1)
    {
      j.i(paramIObjectWrapper);
      if (!paramIObjectWrapper.isAccessible())
      {
        paramIObjectWrapper.setAccessible(true);
        try
        {
          paramIObjectWrapper = paramIObjectWrapper.get(localIBinder);
          return paramIObjectWrapper;
        }
        catch (IllegalAccessException paramIObjectWrapper)
        {
          throw new IllegalArgumentException("Could not access the field in remoteBinder.", paramIObjectWrapper);
        }
        catch (NullPointerException paramIObjectWrapper)
        {
          throw new IllegalArgumentException("Binder object is null.", paramIObjectWrapper);
        }
      }
      throw new IllegalArgumentException("IObjectWrapper declared field not private!");
    }
    throw new IllegalArgumentException(f.h("Unexpected number of IObjectWrapper declared fields: ", arrayOfField.length));
  }
  
  public static <T> IObjectWrapper wrap(T paramT)
  {
    return new ObjectWrapper(paramT);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamic.ObjectWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
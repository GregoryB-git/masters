package A;

import F.g.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import t.h;
import z.e.c;
import z.e.d;

public class j
  extends n
{
  public static final Class b;
  public static final Constructor c;
  public static final Method d;
  public static final Method e;
  
  static
  {
    try
    {
      localObject1 = Class.forName("android.graphics.FontFamily");
      localObject2 = ((Class)localObject1).getConstructor(new Class[0]);
      Object localObject3 = Integer.TYPE;
      localObject5 = ((Class)localObject1).getMethod("addFontWeightStyle", new Class[] { ByteBuffer.class, localObject3, List.class, localObject3, Boolean.TYPE });
      localObject3 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance((Class)localObject1, 1).getClass() });
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    Log.e("TypefaceCompatApi24Impl", localClassNotFoundException.getClass().getName(), localClassNotFoundException);
    Object localObject6 = null;
    Object localObject1 = null;
    Object localObject4 = localObject1;
    Object localObject5 = localObject4;
    Object localObject2 = localObject4;
    localObject4 = localObject1;
    localObject1 = localObject6;
    c = (Constructor)localObject2;
    b = (Class)localObject1;
    d = (Method)localObject5;
    e = (Method)localObject4;
  }
  
  public static boolean h(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      paramBoolean = ((Boolean)d.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean) })).booleanValue();
      return paramBoolean;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject) {}
    return false;
  }
  
  private static Typeface i(Object paramObject)
  {
    try
    {
      Object localObject = Array.newInstance(b, 1);
      Array.set(localObject, 0, paramObject);
      paramObject = (Typeface)e.invoke(null, new Object[] { localObject });
      return (Typeface)paramObject;
    }
    catch (IllegalAccessException|InvocationTargetException paramObject) {}
    return null;
  }
  
  public static boolean j()
  {
    Method localMethod = d;
    if (localMethod == null) {
      Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
    }
    boolean bool;
    if (localMethod != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static Object k()
  {
    try
    {
      Object localObject = c.newInstance(new Object[0]);
      return localObject;
    }
    catch (IllegalAccessException|InstantiationException|InvocationTargetException localIllegalAccessException) {}
    return null;
  }
  
  public Typeface a(Context paramContext, e.c paramc, Resources paramResources, int paramInt)
  {
    Object localObject1 = k();
    if (localObject1 == null) {
      return null;
    }
    for (Object localObject2 : paramc.a())
    {
      ByteBuffer localByteBuffer = o.b(paramContext, paramResources, ((e.d)localObject2).b());
      if (localByteBuffer == null) {
        return null;
      }
      if (!h(localObject1, localByteBuffer, ((e.d)localObject2).c(), ((e.d)localObject2).e(), ((e.d)localObject2).f())) {
        return null;
      }
    }
    return i(localObject1);
  }
  
  public Typeface b(Context paramContext, CancellationSignal paramCancellationSignal, g.b[] paramArrayOfb, int paramInt)
  {
    Object localObject = k();
    if (localObject == null) {
      return null;
    }
    h localh = new h();
    int i = paramArrayOfb.length;
    for (int j = 0; j < i; j++)
    {
      g.b localb = paramArrayOfb[j];
      Uri localUri = localb.d();
      ByteBuffer localByteBuffer1 = (ByteBuffer)localh.get(localUri);
      ByteBuffer localByteBuffer2 = localByteBuffer1;
      if (localByteBuffer1 == null)
      {
        localByteBuffer2 = o.f(paramContext, paramCancellationSignal, localUri);
        localh.put(localUri, localByteBuffer2);
      }
      if (localByteBuffer2 == null) {
        return null;
      }
      if (!h(localObject, localByteBuffer2, localb.c(), localb.e(), localb.f())) {
        return null;
      }
    }
    paramContext = i(localObject);
    if (paramContext == null) {
      return null;
    }
    return Typeface.create(paramContext, paramInt);
  }
}

/* Location:
 * Qualified Name:     A.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
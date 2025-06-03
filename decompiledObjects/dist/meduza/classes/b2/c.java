package b2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import r.h;

public abstract class c
{
  public final r.b<String, Method> a;
  public final r.b<String, Method> b;
  public final r.b<String, Class> c;
  
  public c(r.b<String, Method> paramb1, r.b<String, Method> paramb2, r.b<String, Class> paramb)
  {
    a = paramb1;
    b = paramb2;
    c = paramb;
  }
  
  public abstract void A(boolean paramBoolean);
  
  public final void B(int paramInt, Bundle paramBundle)
  {
    y(paramInt);
    C(paramBundle);
  }
  
  public abstract void C(Bundle paramBundle);
  
  public abstract void D(byte[] paramArrayOfByte);
  
  public abstract void E(CharSequence paramCharSequence);
  
  public final void F(int paramInt, Collection paramCollection)
  {
    y(paramInt);
    if (paramCollection == null)
    {
      H(-1);
    }
    else
    {
      paramInt = paramCollection.size();
      H(paramInt);
      if (paramInt > 0)
      {
        Object localObject = paramCollection.iterator().next();
        if ((localObject instanceof String))
        {
          paramInt = 4;
        }
        else if ((localObject instanceof Parcelable))
        {
          paramInt = 2;
        }
        else if ((localObject instanceof e))
        {
          paramInt = 1;
        }
        else if ((localObject instanceof Serializable))
        {
          paramInt = 3;
        }
        else if ((localObject instanceof IBinder))
        {
          paramInt = 5;
        }
        else if ((localObject instanceof Integer))
        {
          paramInt = 7;
        }
        else
        {
          if (!(localObject instanceof Float)) {
            break label498;
          }
          paramInt = 8;
        }
        H(paramInt);
        switch (paramInt)
        {
        case 6: 
        default: 
          break;
        case 8: 
          paramCollection = paramCollection.iterator();
          while (paramCollection.hasNext()) {
            G(((Float)paramCollection.next()).floatValue());
          }
        case 7: 
          paramCollection = paramCollection.iterator();
          while (paramCollection.hasNext()) {
            H(((Integer)paramCollection.next()).intValue());
          }
        case 5: 
          paramCollection = paramCollection.iterator();
          while (paramCollection.hasNext()) {
            P((IBinder)paramCollection.next());
          }
        case 4: 
          paramCollection = paramCollection.iterator();
          while (paramCollection.hasNext()) {
            N((String)paramCollection.next());
          }
        case 3: 
          localObject = paramCollection.iterator();
          for (;;)
          {
            if (!((Iterator)localObject).hasNext()) {
              return;
            }
            Serializable localSerializable = (Serializable)((Iterator)localObject).next();
            if (localSerializable == null)
            {
              N(null);
            }
            else
            {
              paramCollection = localSerializable.getClass().getName();
              N(paramCollection);
              ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
              try
              {
                ObjectOutputStream localObjectOutputStream = new java/io/ObjectOutputStream;
                localObjectOutputStream.<init>(localByteArrayOutputStream);
                localObjectOutputStream.writeObject(localSerializable);
                localObjectOutputStream.close();
                D(localByteArrayOutputStream.toByteArray());
              }
              catch (IOException localIOException)
              {
                throw new RuntimeException(g.e("VersionedParcelable encountered IOException writing serializable object (name = ", paramCollection, ")"), localIOException);
              }
            }
          }
        case 2: 
          paramCollection = paramCollection.iterator();
          while (paramCollection.hasNext()) {
            L((Parcelable)paramCollection.next());
          }
        case 1: 
          paramCollection = paramCollection.iterator();
          while (paramCollection.hasNext()) {
            Q((e)paramCollection.next());
          }
        }
        label498:
        paramCollection = new StringBuilder();
        paramCollection.append(localIOException.getClass().getName());
        paramCollection.append(" cannot be VersionedParcelled");
        throw new IllegalArgumentException(paramCollection.toString());
      }
    }
  }
  
  public abstract void G(float paramFloat);
  
  public abstract void H(int paramInt);
  
  public final void I(int paramInt1, int paramInt2)
  {
    y(paramInt2);
    H(paramInt1);
  }
  
  public final void J(int paramInt, long paramLong)
  {
    y(paramInt);
    K(paramLong);
  }
  
  public abstract void K(long paramLong);
  
  public abstract void L(Parcelable paramParcelable);
  
  public final void M(Parcelable paramParcelable, int paramInt)
  {
    y(paramInt);
    L(paramParcelable);
  }
  
  public abstract void N(String paramString);
  
  public final void O(int paramInt, String paramString)
  {
    y(paramInt);
    N(paramString);
  }
  
  public abstract void P(IBinder paramIBinder);
  
  /* Error */
  public final void Q(e parame)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +9 -> 10
    //   4: aload_0
    //   5: aconst_null
    //   6: invokevirtual 100	b2/c:N	(Ljava/lang/String;)V
    //   9: return
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual 104	java/lang/Object:getClass	()Ljava/lang/Class;
    //   15: invokevirtual 193	b2/c:b	(Ljava/lang/Class;)Ljava/lang/Class;
    //   18: astore_2
    //   19: aload_0
    //   20: aload_2
    //   21: invokevirtual 110	java/lang/Class:getName	()Ljava/lang/String;
    //   24: invokevirtual 100	b2/c:N	(Ljava/lang/String;)V
    //   27: aload_0
    //   28: invokevirtual 196	b2/c:a	()Lb2/d;
    //   31: astore_2
    //   32: aload_0
    //   33: aload_1
    //   34: invokevirtual 104	java/lang/Object:getClass	()Ljava/lang/Class;
    //   37: invokevirtual 200	b2/c:d	(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   40: aconst_null
    //   41: iconst_2
    //   42: anewarray 4	java/lang/Object
    //   45: dup
    //   46: iconst_0
    //   47: aload_1
    //   48: aastore
    //   49: dup
    //   50: iconst_1
    //   51: aload_2
    //   52: aastore
    //   53: invokevirtual 206	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   56: pop
    //   57: aload_2
    //   58: invokevirtual 211	b2/d:S	()V
    //   61: return
    //   62: astore_1
    //   63: new 133	java/lang/RuntimeException
    //   66: dup
    //   67: ldc -43
    //   69: aload_1
    //   70: invokespecial 146	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   73: athrow
    //   74: astore_1
    //   75: new 133	java/lang/RuntimeException
    //   78: dup
    //   79: ldc -41
    //   81: aload_1
    //   82: invokespecial 146	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   85: athrow
    //   86: astore_1
    //   87: aload_1
    //   88: invokevirtual 219	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   91: instanceof 133
    //   94: ifeq +11 -> 105
    //   97: aload_1
    //   98: invokevirtual 219	java/lang/reflect/InvocationTargetException:getCause	()Ljava/lang/Throwable;
    //   101: checkcast 133	java/lang/RuntimeException
    //   104: athrow
    //   105: new 133	java/lang/RuntimeException
    //   108: dup
    //   109: ldc -35
    //   111: aload_1
    //   112: invokespecial 146	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   115: athrow
    //   116: astore_1
    //   117: new 133	java/lang/RuntimeException
    //   120: dup
    //   121: ldc -33
    //   123: aload_1
    //   124: invokespecial 146	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   127: athrow
    //   128: astore_3
    //   129: new 156	java/lang/StringBuilder
    //   132: dup
    //   133: invokespecial 157	java/lang/StringBuilder:<init>	()V
    //   136: astore_2
    //   137: aload_2
    //   138: aload_1
    //   139: invokevirtual 104	java/lang/Object:getClass	()Ljava/lang/Class;
    //   142: invokevirtual 226	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   145: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: aload_2
    //   150: ldc -28
    //   152: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: pop
    //   156: new 133	java/lang/RuntimeException
    //   159: dup
    //   160: aload_2
    //   161: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   164: aload_3
    //   165: invokespecial 146	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   168: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	this	c
    //   0	169	1	parame	e
    //   18	143	2	localObject	Object
    //   128	37	3	localClassNotFoundException	ClassNotFoundException
    // Exception table:
    //   from	to	target	type
    //   32	57	62	java/lang/ClassNotFoundException
    //   32	57	74	java/lang/NoSuchMethodException
    //   32	57	86	java/lang/reflect/InvocationTargetException
    //   32	57	116	java/lang/IllegalAccessException
    //   10	19	128	java/lang/ClassNotFoundException
  }
  
  public final void R(e parame, int paramInt)
  {
    y(paramInt);
    Q(parame);
  }
  
  public abstract d a();
  
  public final Class b(Class<? extends e> paramClass)
  {
    Class localClass1 = (Class)c.getOrDefault(paramClass.getName(), null);
    Class localClass2 = localClass1;
    if (localClass1 == null)
    {
      localClass2 = Class.forName(String.format("%s.%sParcelizer", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() }), false, paramClass.getClassLoader());
      c.put(paramClass.getName(), localClass2);
    }
    return localClass2;
  }
  
  public final Method c(String paramString)
  {
    Method localMethod1 = (Method)a.getOrDefault(paramString, null);
    Method localMethod2 = localMethod1;
    if (localMethod1 == null)
    {
      System.currentTimeMillis();
      localMethod2 = Class.forName(paramString, true, c.class.getClassLoader()).getDeclaredMethod("read", new Class[] { c.class });
      a.put(paramString, localMethod2);
    }
    return localMethod2;
  }
  
  public final Method d(Class paramClass)
  {
    Method localMethod = (Method)b.getOrDefault(paramClass.getName(), null);
    Object localObject = localMethod;
    if (localMethod == null)
    {
      localObject = b(paramClass);
      System.currentTimeMillis();
      localObject = ((Class)localObject).getDeclaredMethod("write", new Class[] { paramClass, c.class });
      b.put(paramClass.getName(), localObject);
    }
    return (Method)localObject;
  }
  
  public abstract boolean e();
  
  public final boolean f(int paramInt, boolean paramBoolean)
  {
    if (!l(paramInt)) {
      return paramBoolean;
    }
    return e();
  }
  
  public abstract Bundle g();
  
  public final Bundle h(int paramInt, Bundle paramBundle)
  {
    if (!l(paramInt)) {
      return paramBundle;
    }
    return g();
  }
  
  public abstract byte[] i();
  
  public abstract CharSequence j();
  
  public final <T, S extends Collection<T>> S k(S paramS)
  {
    int i = n();
    if (i < 0) {
      return null;
    }
    if (i != 0)
    {
      int j = n();
      if (i < 0) {
        return null;
      }
      int k = i;
      if (j != 1)
      {
        k = i;
        if (j != 2)
        {
          k = i;
          if (j != 3)
          {
            k = i;
            if (j != 4)
            {
              if (j == 5) {
                while (i > 0)
                {
                  paramS.add(v());
                  i--;
                }
              }
            }
            else {
              while (k > 0)
              {
                paramS.add(t());
                k--;
              }
            }
          }
          else
          {
            for (;;)
            {
              if (k <= 0) {
                return paramS;
              }
              String str = t();
              Object localObject;
              if (str == null) {
                localObject = null;
              } else {
                localObject = new ByteArrayInputStream(i());
              }
              try
              {
                b localb = new b2/b;
                localb.<init>((ByteArrayInputStream)localObject);
                localObject = (Serializable)localb.readObject();
                paramS.add(localObject);
                k--;
              }
              catch (ClassNotFoundException paramS)
              {
                throw new RuntimeException(g.e("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ", str, ")"), paramS);
              }
              catch (IOException paramS)
              {
                throw new RuntimeException(g.e("VersionedParcelable encountered IOException reading a Serializable object (name = ", str, ")"), paramS);
              }
            }
          }
        }
        else
        {
          while (k > 0)
          {
            paramS.add(r());
            k--;
          }
        }
      }
      else
      {
        while (k > 0)
        {
          paramS.add(w());
          k--;
        }
      }
    }
    return paramS;
  }
  
  public abstract boolean l(int paramInt);
  
  public abstract float m();
  
  public abstract int n();
  
  public final int o(int paramInt1, int paramInt2)
  {
    if (!l(paramInt2)) {
      return paramInt1;
    }
    return n();
  }
  
  public abstract long p();
  
  public final long q(int paramInt, long paramLong)
  {
    if (!l(paramInt)) {
      return paramLong;
    }
    return p();
  }
  
  public abstract <T extends Parcelable> T r();
  
  public final <T extends Parcelable> T s(T paramT, int paramInt)
  {
    if (!l(paramInt)) {
      return paramT;
    }
    return r();
  }
  
  public abstract String t();
  
  public final String u(int paramInt, String paramString)
  {
    if (!l(paramInt)) {
      return paramString;
    }
    return t();
  }
  
  public abstract IBinder v();
  
  public final <T extends e> T w()
  {
    Object localObject = t();
    if (localObject == null) {
      return null;
    }
    d locald = a();
    try
    {
      localObject = (e)c((String)localObject).invoke(null, new Object[] { locald });
      return (T)localObject;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", localClassNotFoundException);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", localNoSuchMethodException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      if ((localInvocationTargetException.getCause() instanceof RuntimeException)) {
        throw ((RuntimeException)localInvocationTargetException.getCause());
      }
      throw new RuntimeException("VersionedParcel encountered InvocationTargetException", localInvocationTargetException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException("VersionedParcel encountered IllegalAccessException", localIllegalAccessException);
    }
  }
  
  public final <T extends e> T x(T paramT, int paramInt)
  {
    if (!l(paramInt)) {
      return paramT;
    }
    return w();
  }
  
  public abstract void y(int paramInt);
  
  public final void z(int paramInt, boolean paramBoolean)
  {
    y(paramInt);
    A(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     b2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
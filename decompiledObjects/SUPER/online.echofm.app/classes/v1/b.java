package v1;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import t.a;
import t.h;

public abstract class b
{
  public final a a;
  public final a b;
  public final a c;
  
  public b(a parama1, a parama2, a parama3)
  {
    a = parama1;
    b = parama2;
    c = parama3;
  }
  
  public abstract void A(byte[] paramArrayOfByte);
  
  public void B(byte[] paramArrayOfByte, int paramInt)
  {
    w(paramInt);
    A(paramArrayOfByte);
  }
  
  public abstract void C(CharSequence paramCharSequence);
  
  public void D(CharSequence paramCharSequence, int paramInt)
  {
    w(paramInt);
    C(paramCharSequence);
  }
  
  public abstract void E(int paramInt);
  
  public void F(int paramInt1, int paramInt2)
  {
    w(paramInt2);
    E(paramInt1);
  }
  
  public abstract void G(Parcelable paramParcelable);
  
  public void H(Parcelable paramParcelable, int paramInt)
  {
    w(paramInt);
    G(paramParcelable);
  }
  
  public abstract void I(String paramString);
  
  public void J(String paramString, int paramInt)
  {
    w(paramInt);
    I(paramString);
  }
  
  public void K(d paramd, b paramb)
  {
    try
    {
      e(paramd.getClass()).invoke(null, new Object[] { paramd, paramb });
      return;
    }
    catch (ClassNotFoundException paramd) {}catch (NoSuchMethodException paramd)
    {
      break label53;
    }
    catch (InvocationTargetException paramd)
    {
      break label64;
    }
    catch (IllegalAccessException paramd) {}
    throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", paramd);
    label53:
    throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", paramd);
    label64:
    if ((paramd.getCause() instanceof RuntimeException)) {
      throw ((RuntimeException)paramd.getCause());
    }
    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", paramd);
    throw new RuntimeException("VersionedParcel encountered IllegalAccessException", paramd);
  }
  
  public void L(d paramd)
  {
    if (paramd == null)
    {
      I(null);
      return;
    }
    N(paramd);
    b localb = b();
    K(paramd, localb);
    localb.a();
  }
  
  public void M(d paramd, int paramInt)
  {
    w(paramInt);
    L(paramd);
  }
  
  public final void N(d paramd)
  {
    try
    {
      Class localClass = c(paramd.getClass());
      I(localClass.getName());
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramd.getClass().getSimpleName());
      localStringBuilder.append(" does not have a Parcelizer");
      throw new RuntimeException(localStringBuilder.toString(), localClassNotFoundException);
    }
  }
  
  public abstract void a();
  
  public abstract b b();
  
  public final Class c(Class paramClass)
  {
    Class localClass1 = (Class)c.get(paramClass.getName());
    Class localClass2 = localClass1;
    if (localClass1 == null)
    {
      localClass2 = Class.forName(String.format("%s.%sParcelizer", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() }), false, paramClass.getClassLoader());
      c.put(paramClass.getName(), localClass2);
    }
    return localClass2;
  }
  
  public final Method d(String paramString)
  {
    Method localMethod1 = (Method)a.get(paramString);
    Method localMethod2 = localMethod1;
    if (localMethod1 == null)
    {
      System.currentTimeMillis();
      localMethod2 = Class.forName(paramString, true, b.class.getClassLoader()).getDeclaredMethod("read", new Class[] { b.class });
      a.put(paramString, localMethod2);
    }
    return localMethod2;
  }
  
  public final Method e(Class paramClass)
  {
    Method localMethod = (Method)b.get(paramClass.getName());
    Object localObject = localMethod;
    if (localMethod == null)
    {
      localObject = c(paramClass);
      System.currentTimeMillis();
      localObject = ((Class)localObject).getDeclaredMethod("write", new Class[] { paramClass, b.class });
      b.put(paramClass.getName(), localObject);
    }
    return (Method)localObject;
  }
  
  public boolean f()
  {
    return false;
  }
  
  public abstract boolean g();
  
  public boolean h(boolean paramBoolean, int paramInt)
  {
    if (!m(paramInt)) {
      return paramBoolean;
    }
    return g();
  }
  
  public abstract byte[] i();
  
  public byte[] j(byte[] paramArrayOfByte, int paramInt)
  {
    if (!m(paramInt)) {
      return paramArrayOfByte;
    }
    return i();
  }
  
  public abstract CharSequence k();
  
  public CharSequence l(CharSequence paramCharSequence, int paramInt)
  {
    if (!m(paramInt)) {
      return paramCharSequence;
    }
    return k();
  }
  
  public abstract boolean m(int paramInt);
  
  public d n(String paramString, b paramb)
  {
    try
    {
      paramString = (d)d(paramString).invoke(null, new Object[] { paramb });
      return paramString;
    }
    catch (ClassNotFoundException paramString) {}catch (NoSuchMethodException paramString)
    {
      break label50;
    }
    catch (InvocationTargetException paramString)
    {
      break label61;
    }
    catch (IllegalAccessException paramString) {}
    throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", paramString);
    label50:
    throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", paramString);
    label61:
    if ((paramString.getCause() instanceof RuntimeException)) {
      throw ((RuntimeException)paramString.getCause());
    }
    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", paramString);
    throw new RuntimeException("VersionedParcel encountered IllegalAccessException", paramString);
  }
  
  public abstract int o();
  
  public int p(int paramInt1, int paramInt2)
  {
    if (!m(paramInt2)) {
      return paramInt1;
    }
    return o();
  }
  
  public abstract Parcelable q();
  
  public Parcelable r(Parcelable paramParcelable, int paramInt)
  {
    if (!m(paramInt)) {
      return paramParcelable;
    }
    return q();
  }
  
  public abstract String s();
  
  public String t(String paramString, int paramInt)
  {
    if (!m(paramInt)) {
      return paramString;
    }
    return s();
  }
  
  public d u()
  {
    String str = s();
    if (str == null) {
      return null;
    }
    return n(str, b());
  }
  
  public d v(d paramd, int paramInt)
  {
    if (!m(paramInt)) {
      return paramd;
    }
    return u();
  }
  
  public abstract void w(int paramInt);
  
  public void x(boolean paramBoolean1, boolean paramBoolean2) {}
  
  public abstract void y(boolean paramBoolean);
  
  public void z(boolean paramBoolean, int paramInt)
  {
    w(paramInt);
    y(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     v1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
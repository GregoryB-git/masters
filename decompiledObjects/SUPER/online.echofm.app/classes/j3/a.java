package j3;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import c3.b;
import c3.l;
import c3.n;
import c3.o;
import c3.q;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import p3.D;
import p3.D.c;
import q3.k;

public final class a
{
  public static final Object d = new Object();
  public static final String e = "a";
  public final q a;
  public final c3.a b;
  public o c;
  
  public a(b paramb)
  {
    a = new d(b.a(paramb), b.b(paramb), b.c(paramb));
    b = b.d(paramb);
    c = b.e(paramb);
  }
  
  public static boolean e()
  {
    return true;
  }
  
  public n d()
  {
    try
    {
      n localn = c.d();
      return localn;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static final class b
  {
    public Context a = null;
    public String b = null;
    public String c = null;
    public String d = null;
    public c3.a e = null;
    public boolean f = true;
    public l g = null;
    public o h;
    
    public static byte[] h(Context paramContext, String paramString1, String paramString2)
    {
      if (paramString1 != null)
      {
        paramContext = paramContext.getApplicationContext();
        if (paramString2 == null) {
          paramContext = PreferenceManager.getDefaultSharedPreferences(paramContext);
        } else {
          paramContext = paramContext.getSharedPreferences(paramString2, 0);
        }
        try
        {
          paramContext = paramContext.getString(paramString1, null);
          if (paramContext == null) {
            return null;
          }
          paramContext = k.a(paramContext);
          return paramContext;
        }
        catch (ClassCastException|IllegalArgumentException paramContext)
        {
          throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[] { paramString1 }));
        }
      }
      throw new IllegalArgumentException("keysetName cannot be null");
    }
    
    public a f()
    {
      label70:
      label128:
      label140:
      try
      {
        if (b == null) {
          break label128;
        }
        synchronized (a.a())
        {
          byte[] arrayOfByte = h(a, b, c);
          if (arrayOfByte != null) {
            break label70;
          }
          if (d != null) {
            e = k();
          }
        }
        localObject3 = g();
        for (;;)
        {
          h = ((o)localObject3);
          break;
          if ((d != null) && (a.b())) {
            localObject3 = j((byte[])localObject3);
          } else {
            localObject3 = i((byte[])localObject3);
          }
        }
        localObject3 = new j3/a;
        ((a)localObject3).<init>(this, null);
        return (a)localObject3;
      }
      finally
      {
        Object localObject3;
        break label140;
        localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("keysetName cannot be null");
        throw localIllegalArgumentException;
      }
      throw ((Throwable)localObject3);
    }
    
    public final o g()
    {
      if (g != null)
      {
        Object localObject = o.i().a(g);
        o localo = ((o)localObject).h(((o)localObject).d().i().Z(0).Z());
        localObject = new d(a, b, c);
        if (e != null) {
          localo.d().r((q)localObject, e);
        } else {
          c3.c.b(localo.d(), (q)localObject);
        }
        return localo;
      }
      throw new GeneralSecurityException("cannot read or generate keyset");
    }
    
    public final o i(byte[] paramArrayOfByte)
    {
      return o.j(c3.c.a(b.b(paramArrayOfByte)));
    }
    
    public final o j(byte[] paramArrayOfByte)
    {
      try
      {
        Object localObject = new j3/c;
        ((c)localObject).<init>();
        e = ((c)localObject).a(d);
        try
        {
          localObject = o.j(n.n(b.b(paramArrayOfByte), e));
          return (o)localObject;
        }
        catch (GeneralSecurityException localGeneralSecurityException1) {}catch (IOException localIOException) {}
        try
        {
          paramArrayOfByte = i(paramArrayOfByte);
          return paramArrayOfByte;
        }
        catch (IOException paramArrayOfByte)
        {
          throw localIOException;
        }
        try
        {
          paramArrayOfByte = i(paramArrayOfByte);
          Log.w(a.c(), "cannot use Android Keystore, it'll be disabled", localGeneralSecurityException2);
          return paramArrayOfByte;
        }
        catch (IOException paramArrayOfByte)
        {
          throw localGeneralSecurityException2;
        }
      }
      catch (ProviderException localProviderException) {}catch (GeneralSecurityException localGeneralSecurityException2) {}
    }
    
    public final c3.a k()
    {
      if (!a.b())
      {
        Log.w(a.c(), "Android Keystore requires at least Android M");
        return null;
      }
      Object localObject = new c();
      try
      {
        boolean bool = c.d(d);
        try
        {
          localObject = ((c)localObject).a(d);
          return (c3.a)localObject;
        }
        catch (ProviderException localProviderException1) {}catch (GeneralSecurityException localGeneralSecurityException1) {}
        if (bool)
        {
          Log.w(a.c(), "cannot use Android Keystore, it'll be disabled", localGeneralSecurityException1);
          return null;
        }
        throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[] { d }), localGeneralSecurityException1);
      }
      catch (ProviderException localProviderException2) {}catch (GeneralSecurityException localGeneralSecurityException2) {}
      Log.w(a.c(), "cannot use Android Keystore, it'll be disabled", localGeneralSecurityException2);
      return null;
    }
    
    public b l(l paraml)
    {
      g = paraml;
      return this;
    }
    
    public b m(String paramString)
    {
      if (paramString.startsWith("android-keystore://"))
      {
        if (f)
        {
          d = paramString;
          return this;
        }
        throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
      }
      throw new IllegalArgumentException("key URI must start with android-keystore://");
    }
    
    public b n(Context paramContext, String paramString1, String paramString2)
    {
      if (paramContext != null)
      {
        if (paramString1 != null)
        {
          a = paramContext;
          b = paramString1;
          c = paramString2;
          return this;
        }
        throw new IllegalArgumentException("need a keyset name");
      }
      throw new IllegalArgumentException("need an Android context");
    }
  }
}

/* Location:
 * Qualified Name:     j3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
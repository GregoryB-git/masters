package j3;

import android.security.keystore.KeyGenParameterSpec.Builder;
import c3.a;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;
import q3.p;

public final class c
  implements c3.r
{
  public static final Object c = new Object();
  public static final String d = "c";
  public final String a;
  public KeyStore b;
  
  public c()
  {
    this(new a());
  }
  
  public c(a parama)
  {
    a = a;
    b = b;
  }
  
  public static boolean d(String paramString)
  {
    c localc = new c();
    synchronized (c)
    {
      if (!localc.f(paramString))
      {
        e(paramString);
        return true;
      }
    }
  }
  
  public static void e(String paramString)
  {
    String str = q3.r.b("android-keystore://", paramString);
    paramString = KeyGenerator.getInstance("AES", "AndroidKeyStore");
    paramString.init(new KeyGenParameterSpec.Builder(str, 3).setKeySize(256).setBlockModes(new String[] { "GCM" }).setEncryptionPaddings(new String[] { "NoPadding" }).build());
    paramString.generateKey();
  }
  
  public static boolean g()
  {
    return true;
  }
  
  public static void h()
  {
    long l = (int)(Math.random() * 40.0D);
    try
    {
      Thread.sleep(l);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public static a i(a parama)
  {
    byte[] arrayOfByte1 = p.c(10);
    byte[] arrayOfByte2 = new byte[0];
    if (Arrays.equals(arrayOfByte1, parama.b(parama.a(arrayOfByte1, arrayOfByte2), arrayOfByte2))) {
      return parama;
    }
    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
  }
  
  public a a(String paramString)
  {
    label83:
    try
    {
      localObject = a;
      if ((localObject != null) && (!((String)localObject).equals(paramString)))
      {
        localObject = new java/security/GeneralSecurityException;
        ((GeneralSecurityException)localObject).<init>(String.format("this client is bound to %s, cannot load keys bound to %s", new Object[] { a, paramString }));
        throw ((Throwable)localObject);
      }
    }
    finally
    {
      break label83;
      Object localObject = new j3/b;
      ((b)localObject).<init>(q3.r.b("android-keystore://", paramString), b);
      paramString = i((a)localObject);
      return paramString;
    }
  }
  
  public boolean b(String paramString)
  {
    label68:
    try
    {
      String str = a;
      bool1 = true;
      if (str != null)
      {
        bool2 = str.equals(paramString);
        if (bool2) {
          return true;
        }
      }
    }
    finally
    {
      boolean bool1;
      boolean bool2;
      break label68;
      if (a == null)
      {
        bool2 = paramString.toLowerCase(Locale.US).startsWith("android-keystore://");
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
      return bool1;
    }
  }
  
  /* Error */
  public boolean f(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 49
    //   4: aload_1
    //   5: invokestatic 54	q3/r:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   8: astore_1
    //   9: aload_0
    //   10: getfield 34	j3/c:b	Ljava/security/KeyStore;
    //   13: aload_1
    //   14: invokevirtual 183	java/security/KeyStore:containsAlias	(Ljava/lang/String;)Z
    //   17: istore_2
    //   18: aload_0
    //   19: monitorexit
    //   20: iload_2
    //   21: ireturn
    //   22: astore_1
    //   23: goto +57 -> 80
    //   26: astore_3
    //   27: getstatic 185	j3/c:d	Ljava/lang/String;
    //   30: ldc -69
    //   32: invokestatic 193	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   35: pop
    //   36: invokestatic 195	j3/c:h	()V
    //   39: ldc 58
    //   41: invokestatic 198	java/security/KeyStore:getInstance	(Ljava/lang/String;)Ljava/security/KeyStore;
    //   44: astore_3
    //   45: aload_0
    //   46: aload_3
    //   47: putfield 34	j3/c:b	Ljava/security/KeyStore;
    //   50: aload_3
    //   51: aconst_null
    //   52: invokevirtual 202	java/security/KeyStore:load	(Ljava/security/KeyStore$LoadStoreParameter;)V
    //   55: aload_0
    //   56: getfield 34	j3/c:b	Ljava/security/KeyStore;
    //   59: aload_1
    //   60: invokevirtual 183	java/security/KeyStore:containsAlias	(Ljava/lang/String;)Z
    //   63: istore_2
    //   64: aload_0
    //   65: monitorexit
    //   66: iload_2
    //   67: ireturn
    //   68: astore_1
    //   69: new 147	java/security/GeneralSecurityException
    //   72: astore_3
    //   73: aload_3
    //   74: aload_1
    //   75: invokespecial 205	java/security/GeneralSecurityException:<init>	(Ljava/lang/Throwable;)V
    //   78: aload_3
    //   79: athrow
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	c
    //   0	84	1	paramString	String
    //   17	50	2	bool	boolean
    //   26	1	3	localNullPointerException	NullPointerException
    //   44	35	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	9	22	finally
    //   9	18	22	finally
    //   27	36	22	finally
    //   36	55	22	finally
    //   55	64	22	finally
    //   69	80	22	finally
    //   9	18	26	java/lang/NullPointerException
    //   36	55	68	java/io/IOException
  }
  
  public static final class a
  {
    public String a = null;
    public KeyStore b = null;
    
    public a()
    {
      if (c.c())
      {
        try
        {
          KeyStore localKeyStore = KeyStore.getInstance("AndroidKeyStore");
          b = localKeyStore;
          localKeyStore.load(null);
          return;
        }
        catch (IOException localIOException) {}catch (GeneralSecurityException localGeneralSecurityException) {}
        throw new IllegalStateException(localGeneralSecurityException);
      }
      throw new IllegalStateException("need Android Keystore on Android M or newer");
    }
  }
}

/* Location:
 * Qualified Name:     j3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.firebase_auth_api;

import android.security.keystore.KeyGenParameterSpec.Builder;
import com.google.android.gms.internal.firebase-auth-api.zzcc;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Locale;
import javax.crypto.KeyGenerator;

public final class zzmn
  implements zzcc
{
  private static final Object zza = new Object();
  
  public zzmn()
  {
    this(new zza());
  }
  
  private zzmn(com.google.android.gms.internal.firebase-auth-api.zzmn.zza paramzza) {}
  
  public static boolean zzc(String paramString)
  {
    synchronized (zza)
    {
      Object localObject2 = zzzi.zza("android-keystore://", paramString);
      if (!zzmj.zzb((String)localObject2))
      {
        paramString = new android/security/keystore/KeyGenParameterSpec$Builder;
        paramString.<init>((String)localObject2, 3);
        localObject2 = paramString.setKeySize(256).setBlockModes(new String[] { "GCM" }).setEncryptionPaddings(new String[] { "NoPadding" }).build();
        paramString = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        paramString.init((AlgorithmParameterSpec)localObject2);
        paramString.generateKey();
        return true;
      }
      return false;
    }
  }
  
  /* Error */
  public final com.google.android.gms.internal.firebase-auth-api.zzbe zza(String paramString)
  {
    // Byte code:
    //   0: getstatic 17	com/google/android/gms/internal/firebase_auth_api/zzmn:zza	Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_2
    //   5: monitorenter
    //   6: new 86	com/google/android/gms/internal/firebase_auth_api/zzml
    //   9: astore_3
    //   10: aload_3
    //   11: ldc 27
    //   13: aload_1
    //   14: invokestatic 32	com/google/android/gms/internal/firebase_auth_api/zzzi:zza	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   17: invokespecial 89	com/google/android/gms/internal/firebase_auth_api/zzml:<init>	(Ljava/lang/String;)V
    //   20: bipush 10
    //   22: invokestatic 94	com/google/android/gms/internal/firebase_auth_api/zzpp:zza	(I)[B
    //   25: astore_1
    //   26: iconst_0
    //   27: newarray <illegal type>
    //   29: astore 4
    //   31: aload_1
    //   32: aload_3
    //   33: aload_3
    //   34: aload_1
    //   35: aload 4
    //   37: invokeinterface 99 3 0
    //   42: aload 4
    //   44: invokeinterface 101 3 0
    //   49: invokestatic 107	java/util/Arrays:equals	([B[B)Z
    //   52: ifeq +7 -> 59
    //   55: aload_2
    //   56: monitorexit
    //   57: aload_3
    //   58: areturn
    //   59: new 109	java/security/KeyStoreException
    //   62: astore_1
    //   63: aload_1
    //   64: ldc 111
    //   66: invokespecial 112	java/security/KeyStoreException:<init>	(Ljava/lang/String;)V
    //   69: aload_1
    //   70: athrow
    //   71: astore_1
    //   72: aload_2
    //   73: monitorexit
    //   74: aload_1
    //   75: athrow
    //   76: astore_1
    //   77: new 114	java/security/GeneralSecurityException
    //   80: dup
    //   81: aload_1
    //   82: invokespecial 117	java/security/GeneralSecurityException:<init>	(Ljava/lang/Throwable;)V
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	zzmn
    //   0	86	1	paramString	String
    //   9	49	3	localzzml	zzml
    //   29	14	4	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   6	57	71	finally
    //   59	71	71	finally
    //   72	74	71	finally
    //   0	6	76	java/io/IOException
    //   74	76	76	java/io/IOException
  }
  
  public final boolean zzb(String paramString)
  {
    return paramString.toLowerCase(Locale.US).startsWith("android-keystore://");
  }
  
  public static final class zza
  {
    public zza()
    {
      zzmn.zza();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzmn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
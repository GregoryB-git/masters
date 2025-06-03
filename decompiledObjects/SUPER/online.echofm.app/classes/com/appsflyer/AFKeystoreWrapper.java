package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec.Builder;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyPairGeneratorSpi;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

public class AFKeystoreWrapper
{
  private Context AFInAppEventParameterName;
  public KeyStore AFInAppEventType;
  public String AFKeystoreWrapper;
  public final Object valueOf = new Object();
  public int values;
  
  public AFKeystoreWrapper(Context paramContext)
  {
    AFInAppEventParameterName = paramContext;
    AFKeystoreWrapper = "";
    values = 0;
    AFLogger.afInfoLog("Initialising KeyStore..");
    try
    {
      paramContext = KeyStore.getInstance("AndroidKeyStore");
      AFInAppEventType = paramContext;
      paramContext.load(null);
      return;
    }
    catch (KeyStoreException paramContext) {}catch (CertificateException paramContext) {}catch (NoSuchAlgorithmException paramContext) {}catch (IOException paramContext) {}
    AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", paramContext);
  }
  
  private static boolean AFInAppEventParameterName(String paramString)
  {
    return paramString.startsWith("com.appsflyer");
  }
  
  public final String AFInAppEventParameterName()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("com.appsflyer,");
    synchronized (valueOf)
    {
      localStringBuilder.append("KSAppsFlyerId=");
      localStringBuilder.append(AFKeystoreWrapper);
      localStringBuilder.append(",");
      localStringBuilder.append("KSAppsFlyerRICounter=");
      localStringBuilder.append(values);
      return localStringBuilder.toString();
    }
  }
  
  public final int AFInAppEventType()
  {
    synchronized (valueOf)
    {
      int i = values;
      return i;
    }
  }
  
  public final void AFKeystoreWrapper(String paramString)
  {
    AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(paramString)));
    try
    {
      Calendar localCalendar = Calendar.getInstance();
      Object localObject1 = Calendar.getInstance();
      ((Calendar)localObject1).add(1, 5);
      synchronized (valueOf)
      {
        if (!AFInAppEventType.containsAlias(paramString))
        {
          KeyGenParameterSpec.Builder localBuilder = new android/security/keystore/KeyGenParameterSpec$Builder;
          localBuilder.<init>(paramString, 3);
          paramString = new javax/security/auth/x500/X500Principal;
          paramString.<init>("CN=AndroidSDK, O=AppsFlyer");
          localObject1 = localBuilder.setCertificateSubject(paramString).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(localCalendar.getTime()).setCertificateNotAfter(((Calendar)localObject1).getTime()).build();
          paramString = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
          paramString.initialize((AlgorithmParameterSpec)localObject1);
          paramString.generateKeyPair();
        }
      }
      AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(paramString)));
      return;
    }
    finally
    {
      ??? = new StringBuilder("Exception ");
      ((StringBuilder)???).append(paramString.getMessage());
      ((StringBuilder)???).append(" occurred");
      AFLogger.afErrorLog(???.toString(), paramString);
    }
    throw paramString;
  }
  
  public final boolean AFKeystoreWrapper()
  {
    boolean bool3;
    synchronized (valueOf)
    {
      Object localObject2 = AFInAppEventType;
      boolean bool1 = false;
      boolean bool2 = false;
      bool3 = bool1;
      if (localObject2 != null)
      {
        boolean bool4 = bool2;
        try
        {
          localObject4 = ((KeyStore)localObject2).aliases();
          do
          {
            do
            {
              bool4 = bool2;
              bool3 = bool1;
              if (!((Enumeration)localObject4).hasMoreElements()) {
                break;
              }
              bool4 = bool2;
              localObject2 = (String)((Enumeration)localObject4).nextElement();
            } while (localObject2 == null);
            bool4 = bool2;
          } while (!AFInAppEventParameterName((String)localObject2));
          bool4 = bool2;
          localObject4 = ((String)localObject2).split(",");
          bool4 = bool2;
          bool3 = bool1;
          if (localObject4.length == 3)
          {
            bool4 = bool2;
            AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat((String)localObject2));
            bool1 = true;
            bool2 = true;
            bool4 = bool2;
            localObject2 = localObject4[1].trim().split("=");
            bool4 = bool2;
            localObject4 = localObject4[2].trim().split("=");
            bool4 = bool2;
            bool3 = bool1;
            if (localObject2.length == 2)
            {
              bool4 = bool2;
              bool3 = bool1;
              if (localObject4.length == 2)
              {
                bool4 = bool2;
                AFKeystoreWrapper = localObject2[1].trim();
                bool4 = bool2;
                values = Integer.parseInt(localObject4[1].trim());
                bool3 = bool1;
              }
            }
          }
        }
        finally
        {
          Object localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("Couldn't list KeyStore Aliases: ");
          ((StringBuilder)localObject4).append(localThrowable.getClass().getName());
          AFLogger.afErrorLog(localObject4.toString(), localThrowable);
          bool3 = bool4;
        }
      }
    }
    return bool3;
    throw ((Throwable)localObject3);
  }
  
  public final String valueOf()
  {
    synchronized (valueOf)
    {
      String str = AFKeystoreWrapper;
      return str;
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.AFKeystoreWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
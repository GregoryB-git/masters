package com.appsflyer.internal;

import V5.a;
import W5.I;
import W5.m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import com.appsflyer.AFLogger;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFa1fSDK
  implements AFc1vSDK
{
  @NotNull
  private final AFb1bSDK valueOf;
  
  public AFa1fSDK() {}
  
  public AFa1fSDK(AFb1bSDK paramAFb1bSDK)
  {
    valueOf = paramAFb1bSDK;
  }
  
  private File AFInAppEventParameterName()
  {
    Object localObject = valueOf.AFInAppEventType;
    if (localObject != null)
    {
      localObject = new File(((Context)localObject).getFilesDir(), "AFExceptionsCache");
      if (!((File)localObject).exists()) {
        ((File)localObject).mkdirs();
      }
      return (File)localObject;
    }
    return null;
  }
  
  public static long AFInAppEventType(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      if (Build.VERSION.SDK_INT >= 28) {
        return g.a(paramContext);
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      break label35;
      int i = versionCode;
      return i;
      label35:
      AFLogger.afErrorLog(paramContext.getMessage(), paramContext);
    }
    return 0L;
  }
  
  public static Map<String, String> AFInAppEventType(Context paramContext, Map<String, String> paramMap, Uri paramUri)
  {
    Iterator localIterator = paramUri.getQueryParameterNames().iterator();
    Object localObject;
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      localObject = "media_source";
      int i = 0;
      if (!bool) {
        break;
      }
      String str1 = (String)localIterator.next();
      String str2 = paramUri.getQueryParameter(str1);
      if (!paramMap.containsKey(str1))
      {
        int j = str1.hashCode();
        if (j != -1420799080)
        {
          if (j != 99)
          {
            if ((j == 110987) && (str1.equals("pid")))
            {
              i = 1;
              break label139;
            }
          }
          else if (str1.equals("c")) {
            break label139;
          }
        }
        else if (str1.equals("af_prt"))
        {
          i = 2;
          break label139;
        }
        i = -1;
        label139:
        if (i != 0)
        {
          if (i == 1) {
            break label177;
          }
          if (i == 2)
          {
            localObject = "agency";
            break label177;
          }
        }
        else
        {
          localObject = "campaign";
          break label177;
        }
      }
      localObject = str1;
      label177:
      paramMap.put(localObject, str2);
    }
    try
    {
      if (!paramMap.containsKey("install_time"))
      {
        localObject = new java/text/SimpleDateFormat;
        ((SimpleDateFormat)localObject).<init>("yyyy-MM-dd HH:mm:ss", Locale.US);
        long l = getPackageManagergetPackageInfogetPackageName0firstInstallTime;
        ((DateFormat)localObject).setTimeZone(TimeZone.getTimeZone("UTC"));
        paramContext = new java/util/Date;
        paramContext.<init>(l);
        paramMap.put("install_time", ((DateFormat)localObject).format(paramContext));
      }
    }
    catch (Exception paramContext)
    {
      AFLogger.afErrorLog("Could not fetch install time. ", paramContext);
    }
    if ((paramMap.containsKey("af_deeplink")) && (!paramMap.containsKey("af_status"))) {
      paramMap.put("af_status", "Non-organic");
    }
    if (paramMap.containsKey("agency")) {
      paramMap.remove("media_source");
    }
    paramContext = paramUri.getPath();
    if (paramContext != null) {
      paramMap.put("path", paramContext);
    }
    paramContext = paramUri.getScheme();
    if (paramContext != null) {
      paramMap.put("scheme", paramContext);
    }
    paramContext = paramUri.getHost();
    if (paramContext != null) {
      paramMap.put("host", paramContext);
    }
    return paramMap;
  }
  
  public static String AFKeystoreWrapper(Context paramContext, String paramString)
  {
    try
    {
      paramContext = getPackageManagergetPackageInfo0versionName;
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      AFLogger.afErrorLog(paramContext.getMessage(), paramContext);
    }
    return "";
  }
  
  private File afDebugLog()
  {
    File localFile = AFInAppEventParameterName();
    if (localFile != null)
    {
      localFile = new File(localFile, "6.12.2");
      if (!localFile.exists()) {
        localFile.mkdirs();
      }
      return localFile;
    }
    return null;
  }
  
  public static boolean valueOf()
  {
    return Build.BRAND.equals("OPPO");
  }
  
  @SuppressLint({"PackageManagerGetSignatures"})
  public static String values(PackageManager paramPackageManager, String paramString)
  {
    paramPackageManager = getPackageInfo64signatures;
    if (paramPackageManager == null) {
      return null;
    }
    paramString = (X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(paramPackageManager[0].toByteArray()));
    paramPackageManager = MessageDigest.getInstance("SHA256");
    paramPackageManager.update(paramString.getEncoded());
    return String.format("%032X", new Object[] { new BigInteger(1, paramPackageManager.digest()) });
  }
  
  public static boolean values(Context paramContext, Intent paramIntent)
  {
    return paramContext.getPackageManager().queryIntentServices(paramIntent, 0).size() > 0;
  }
  
  public static boolean values(Context paramContext, String paramString)
  {
    int i = paramContext.checkPermission(paramString, Process.myPid(), Process.myUid());
    paramContext = new StringBuilder("is Permission Available: ");
    paramContext.append(paramString);
    paramContext.append("; res: ");
    paramContext.append(i);
    AFLogger.afRDLog(paramContext.toString());
    return i == 0;
  }
  
  public final boolean AFInAppEventParameterName(String... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "");
    Object localObject1;
    boolean bool1;
    try
    {
      localObject1 = AFInAppEventParameterName();
      bool1 = true;
      bool2 = bool1;
      if (localObject1 == null) {
        break label325;
      }
      if (paramVarArgs.length == 0)
      {
        Intrinsics.checkNotNullParameter("delete all exceptions", "");
        AFLogger.afRDLog("[Exception Manager]: ".concat("delete all exceptions"));
        bool2 = e6.g.j((File)localObject1);
      }
    }
    finally
    {
      break label330;
    }
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("delete all exceptions except for: ");
    ((StringBuilder)localObject2).append(W5.g.p(paramVarArgs, ", ", null, null, 0, null, null, 62, null));
    localObject2 = localObject2.toString();
    Intrinsics.checkNotNullParameter(localObject2, "");
    AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(localObject2)));
    File[] arrayOfFile = ((File)localObject1).listFiles();
    boolean bool2 = bool1;
    if (arrayOfFile != null)
    {
      Intrinsics.checkNotNullExpressionValue(arrayOfFile, "");
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
      {
        localObject2 = arrayOfFile[j];
        if (!W5.g.h(paramVarArgs, ((File)localObject2).getName())) {
          ((Collection)localObject1).add(localObject2);
        }
      }
      paramVarArgs = new java/util/ArrayList;
      paramVarArgs.<init>(m.l((Iterable)localObject1, 10));
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (File)((Iterator)localObject1).next();
        Intrinsics.checkNotNullExpressionValue(localObject2, "");
        paramVarArgs.add(Boolean.valueOf(e6.g.j((File)localObject2)));
      }
      localObject1 = m.J(paramVarArgs);
      paramVarArgs = (String[])localObject1;
      if (((Collection)localObject1).isEmpty()) {
        paramVarArgs = I.a(Boolean.TRUE);
      }
      if (paramVarArgs.size() == 1)
      {
        bool2 = ((Boolean)m.q(paramVarArgs)).booleanValue();
        if (bool2)
        {
          bool2 = bool1;
          break label325;
        }
      }
      bool2 = false;
    }
    label325:
    return bool2;
    label330:
    throw paramVarArgs;
  }
  
  public final int AFInAppEventType()
  {
    Iterator localIterator = ((Iterable)AFKeystoreWrapper()).iterator();
    int i = 0;
    while (localIterator.hasNext()) {
      i += nextvalueOf;
    }
    return i;
  }
  
  @NotNull
  public final List<AFc1zSDK> AFKeystoreWrapper()
  {
    try
    {
      Object localObject1 = afDebugLog();
      localObject3 = null;
      localObject4 = localObject3;
      if (localObject1 == null) {
        break label168;
      }
      int j;
      try
      {
        localObject1 = ((File)localObject1).listFiles();
        localObject4 = localObject3;
        if (localObject1 == null) {
          break label168;
        }
        Intrinsics.checkNotNullExpressionValue(localObject1, "");
        localObject4 = new java/util/ArrayList;
        ((ArrayList)localObject4).<init>();
        int i = localObject1.length;
        j = 0;
        if (j >= i) {
          break label112;
        }
        Object localObject6 = localObject1[j];
        Object localObject7 = AFc1zSDK.AFInAppEventParameterName;
        Intrinsics.checkNotNullExpressionValue(localObject6, "");
        localObject7 = AFc1zSDK.AFa1xSDK.AFInAppEventParameterName(e6.g.d((File)localObject6, null, 1, null));
        if (localObject7 != null) {
          ((Collection)localObject4).add(localObject7);
        }
      }
      finally {}
      j++;
    }
    finally
    {
      Object localObject4;
      label112:
      break label182;
    }
    localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>("Could not get stored exceptions\n ");
    ((StringBuilder)localObject4).append(((Throwable)localObject2).getMessage());
    localObject4 = localObject4.toString();
    Intrinsics.checkNotNullParameter(localObject4, "");
    AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(localObject4)));
    localObject4 = localObject3;
    label168:
    Object localObject3 = localObject5;
    if (localObject5 == null) {
      localObject3 = m.f();
    }
    return (List<AFc1zSDK>)localObject3;
    label182:
    throw ((Throwable)localObject5);
  }
  
  public final String values(Throwable paramThrowable, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramThrowable, "");
    Intrinsics.checkNotNullParameter(paramString, "");
    try
    {
      localObject1 = afDebugLog();
      localObject2 = null;
      localObject3 = localObject2;
      if (localObject1 == null) {}
    }
    finally
    {
      try
      {
        Intrinsics.checkNotNullParameter(paramThrowable, "");
        Intrinsics.checkNotNullParameter(paramString, "");
        Object localObject3 = new com/appsflyer/internal/AFc1zSDK;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        Intrinsics.checkNotNullParameter(paramThrowable, "");
        localObject5 = paramThrowable.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(localObject5, "");
        localStringBuilder.append((String)localObject5);
        localStringBuilder.append(": ");
        localStringBuilder.append(paramString);
        paramString = localStringBuilder.toString();
        Intrinsics.checkNotNullParameter(paramThrowable, "");
        Intrinsics.checkNotNullParameter(paramThrowable, "");
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        ((StringBuilder)localObject5).append(paramThrowable);
        ((StringBuilder)localObject5).append('\n');
        ((StringBuilder)localObject5).append(m.x((Iterable)AFc1nSDK.AFInAppEventParameterName(paramThrowable), "\n", null, null, 0, null, AFc1nSDK.AFa1wSDK.AFKeystoreWrapper, 30, null));
        ((AFc1zSDK)localObject3).<init>(paramString, AFc1uSDK.AFa1wSDK.AFInAppEventParameterName(localObject5.toString()), a.b(paramThrowable));
        paramString = AFKeystoreWrapper;
        localObject5 = new java/io/File;
        ((File)localObject5).<init>((File)localObject1, paramString);
        paramThrowable = (Throwable)localObject3;
        if (!((File)localObject5).exists()) {
          break label265;
        }
        Object localObject1 = AFc1zSDK.AFa1xSDK.AFInAppEventParameterName(e6.g.d((File)localObject5, null, 1, null));
        paramThrowable = (Throwable)localObject3;
        if (localObject1 == null) {
          break label265;
        }
        valueOf += 1;
        paramThrowable = (Throwable)localObject1;
      }
      catch (Exception localException)
      {
        Object localObject2;
        Object localObject5;
        break label373;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>("label=");
        ((StringBuilder)localObject4).append(AFc1uSDK.AFa1wSDK.valueOf(AFInAppEventType));
        ((StringBuilder)localObject4).append("\nhashName=");
        ((StringBuilder)localObject4).append(AFc1uSDK.AFa1wSDK.valueOf(AFKeystoreWrapper));
        ((StringBuilder)localObject4).append("\nstackTrace=");
        ((StringBuilder)localObject4).append(AFc1uSDK.AFa1wSDK.valueOf(values));
        ((StringBuilder)localObject4).append("\nc=");
        ((StringBuilder)localObject4).append(valueOf);
        e6.g.f((File)localObject5, localObject4.toString(), null, 2, null);
        localObject4 = paramString;
        break label442;
        paramThrowable = new java/lang/StringBuilder;
        paramThrowable.<init>("Could not cache exception\n");
        paramString = new java/lang/StringBuilder;
        paramString.<init>(" ");
        paramString.append(((Throwable)localObject4).getMessage());
        paramString = paramString.toString();
        Intrinsics.checkNotNullParameter(paramString, "");
        paramThrowable.append("[Exception Manager]: ".concat(String.valueOf(paramString)));
        AFLogger.afRDLog(paramThrowable.toString());
        localObject4 = localObject2;
      }
      paramThrowable = finally;
      break label447;
    }
    label265:
    Object localObject4;
    label373:
    label442:
    return (String)localObject4;
    label447:
    throw paramThrowable;
  }
  
  public final boolean values()
  {
    return AFInAppEventParameterName(new String[0]);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1fSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
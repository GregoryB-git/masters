package R2;

import A2.n;
import E2.f;
import G2.c;
import G2.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.S6;
import com.google.android.gms.internal.measurement.y0;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import x2.k;

public final class S5
  extends l3
{
  public static final String[] i = { "firebase_", "google_", "ga_" };
  public static final String[] j = { "_err" };
  public SecureRandom c;
  public final AtomicLong d = new AtomicLong(0L);
  public int e;
  public q1.a f;
  public Boolean g;
  public Integer h = null;
  
  public S5(N2 paramN2)
  {
    super(paramN2);
  }
  
  public static long B(byte[] paramArrayOfByte)
  {
    n.i(paramArrayOfByte);
    int k = paramArrayOfByte.length;
    int m = 0;
    boolean bool;
    if (k > 0) {
      bool = true;
    } else {
      bool = false;
    }
    n.l(bool);
    k = paramArrayOfByte.length - 1;
    long l = 0L;
    while ((k >= 0) && (k >= paramArrayOfByte.length - 8))
    {
      l += ((paramArrayOfByte[k] & 0xFF) << m);
      m += 8;
      k--;
    }
    return l;
  }
  
  public static boolean B0(Context paramContext, String paramString)
  {
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager == null) {
        return false;
      }
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>(paramContext, paramString);
      paramContext = localPackageManager.getServiceInfo(localComponentName, 0);
      if (paramContext != null)
      {
        boolean bool = enabled;
        if (bool) {
          return true;
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return false;
  }
  
  public static boolean D0(String paramString)
  {
    String str = (String)K.b0.a(null);
    return (str.equals("*")) || (Arrays.asList(str.split(",")).contains(paramString));
  }
  
  public static Bundle E(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return new Bundle();
    }
    Bundle localBundle = new Bundle(paramBundle);
    paramBundle = localBundle.keySet().iterator();
    while (paramBundle.hasNext())
    {
      Object localObject1 = (String)paramBundle.next();
      Object localObject2 = localBundle.get((String)localObject1);
      if ((localObject2 instanceof Bundle))
      {
        localBundle.putBundle((String)localObject1, new Bundle((Bundle)localObject2));
      }
      else
      {
        boolean bool = localObject2 instanceof Parcelable[];
        int k = 0;
        int m = 0;
        if (bool)
        {
          localObject1 = (Parcelable[])localObject2;
          while (m < localObject1.length)
          {
            if ((localObject1[m] instanceof Bundle)) {
              localObject1[m] = new Bundle((Bundle)localObject1[m]);
            }
            m++;
          }
        }
        else if ((localObject2 instanceof List))
        {
          localObject2 = (List)localObject2;
          for (m = k; m < ((List)localObject2).size(); m++)
          {
            localObject1 = ((List)localObject2).get(m);
            if ((localObject1 instanceof Bundle)) {
              ((List)localObject2).set(m, new Bundle((Bundle)localObject1));
            }
          }
        }
      }
    }
    return localBundle;
  }
  
  public static Bundle G(List paramList)
  {
    Bundle localBundle = new Bundle();
    if (paramList == null) {
      return localBundle;
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (R5)localIterator.next();
      Object localObject = t;
      if (localObject != null)
      {
        localBundle.putString(p, (String)localObject);
      }
      else
      {
        localObject = r;
        if (localObject != null)
        {
          localBundle.putLong(p, ((Long)localObject).longValue());
        }
        else
        {
          localObject = v;
          if (localObject != null) {
            localBundle.putDouble(p, ((Double)localObject).doubleValue());
          }
        }
      }
    }
    return localBundle;
  }
  
  public static boolean H0(String paramString)
  {
    return (!TextUtils.isEmpty(paramString)) && (paramString.startsWith("_"));
  }
  
  public static String I(String paramString, int paramInt, boolean paramBoolean)
  {
    if (paramString == null) {
      return null;
    }
    if (paramString.codePointCount(0, paramString.length()) > paramInt)
    {
      if (paramBoolean)
      {
        String str = paramString.substring(0, paramString.offsetByCodePoints(0, paramInt));
        paramString = new StringBuilder();
        paramString.append(str);
        paramString.append("...");
        return paramString.toString();
      }
      return null;
    }
    return paramString;
  }
  
  public static boolean J0(String paramString)
  {
    n.e(paramString);
    return (paramString.charAt(0) != '_') || (paramString.equals("_ep"));
  }
  
  public static void L(w4 paramw4, Bundle paramBundle, boolean paramBoolean)
  {
    if ((paramBundle != null) && (paramw4 != null) && ((!paramBundle.containsKey("_sc")) || (paramBoolean)))
    {
      String str = a;
      if (str != null) {
        paramBundle.putString("_sn", str);
      } else {
        paramBundle.remove("_sn");
      }
      str = b;
      if (str != null) {
        paramBundle.putString("_sc", str);
      } else {
        paramBundle.remove("_sc");
      }
      paramBundle.putLong("_si", c);
      return;
    }
    if ((paramBundle != null) && (paramw4 == null) && (paramBoolean))
    {
      paramBundle.remove("_sn");
      paramBundle.remove("_sc");
      paramBundle.remove("_si");
    }
  }
  
  public static boolean L0(String paramString)
  {
    String[] arrayOfString = j;
    int k = arrayOfString.length;
    for (int m = 0; m < k; m++) {
      if (arrayOfString[m].equals(paramString)) {
        return false;
      }
    }
    return true;
  }
  
  public static void M(U5 paramU5, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    N(paramU5, null, paramInt1, paramString1, paramString2, paramInt2);
  }
  
  public static void N(U5 paramU5, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    v0(localBundle, paramInt1);
    if ((!TextUtils.isEmpty(paramString2)) && (!TextUtils.isEmpty(paramString3))) {
      localBundle.putString(paramString2, paramString3);
    }
    if ((paramInt1 == 6) || (paramInt1 == 7) || (paramInt1 == 2)) {
      localBundle.putLong("_el", paramInt2);
    }
    paramU5.r(paramString1, "_err", localBundle);
  }
  
  public static void O(Bundle paramBundle, int paramInt, String paramString1, String paramString2, Object paramObject)
  {
    if (v0(paramBundle, paramInt))
    {
      paramBundle.putString("_ev", I(paramString1, 40, true));
      if (paramObject != null)
      {
        n.i(paramBundle);
        if (((paramObject instanceof String)) || ((paramObject instanceof CharSequence))) {
          paramBundle.putLong("_el", String.valueOf(paramObject).length());
        }
      }
    }
  }
  
  public static int O0(String paramString)
  {
    if ("_ldl".equals(paramString)) {
      return 2048;
    }
    if ("_id".equals(paramString)) {
      return 256;
    }
    if ("_lgclid".equals(paramString)) {
      return 100;
    }
    if ("_gbraid".equals(paramString)) {
      return 100;
    }
    return 36;
  }
  
  private static boolean R0(String paramString)
  {
    n.i(paramString);
    return paramString.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
  }
  
  public static MessageDigest T0()
  {
    for (int k = 0; k < 2; k++) {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        if (localMessageDigest != null) {
          return localMessageDigest;
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        for (;;) {}
      }
    }
    return null;
  }
  
  private final boolean X0()
  {
    if (g == null)
    {
      Object localObject1 = Q0();
      boolean bool1 = false;
      if (localObject1 == null) {
        return false;
      }
      localObject1 = ((q1.a)localObject1).b();
      Object localObject2 = null;
      Object localObject3;
      try
      {
        localObject3 = (Integer)((Future)localObject1).get(10000L, TimeUnit.MILLISECONDS);
        boolean bool2 = bool1;
        if (localObject3 != null)
        {
          bool2 = bool1;
          try
          {
            if (((Integer)localObject3).intValue() == 1) {
              bool2 = true;
            }
          }
          catch (TimeoutException localTimeoutException1)
          {
            break label123;
          }
          catch (InterruptedException localInterruptedException1)
          {
            for (;;) {}
          }
          catch (ExecutionException localExecutionException1)
          {
            for (;;) {}
          }
          catch (CancellationException localCancellationException1)
          {
            for (;;) {}
          }
        }
        g = Boolean.valueOf(bool2);
      }
      catch (TimeoutException localTimeoutException2)
      {
        localObject3 = localObject2;
      }
      catch (InterruptedException localInterruptedException2)
      {
        localObject3 = localObject2;
      }
      catch (ExecutionException localExecutionException2)
      {
        localObject3 = localObject2;
      }
      catch (CancellationException localCancellationException2)
      {
        localObject3 = localObject2;
      }
      label123:
      j().L().b("Measurement manager api exception", localCancellationException2);
      g = Boolean.FALSE;
      j().K().b("Measurement manager api status result", localObject3);
    }
    return g.booleanValue();
  }
  
  public static boolean c0(Context paramContext)
  {
    n.i(paramContext);
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager == null) {
        return false;
      }
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>(paramContext, "com.google.android.gms.measurement.AppMeasurementReceiver");
      paramContext = localPackageManager.getReceiverInfo(localComponentName, 0);
      if (paramContext != null)
      {
        boolean bool = enabled;
        if (bool) {
          return true;
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return false;
  }
  
  public static boolean d0(Context paramContext, boolean paramBoolean)
  {
    n.i(paramContext);
    if (Build.VERSION.SDK_INT >= 24) {}
    for (String str = "com.google.android.gms.measurement.AppMeasurementJobService";; str = "com.google.android.gms.measurement.AppMeasurementService") {
      return B0(paramContext, str);
    }
  }
  
  public static boolean e0(Intent paramIntent)
  {
    paramIntent = paramIntent.getStringExtra("android.intent.extra.REFERRER_NAME");
    return ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(paramIntent)) || ("https://www.google.com".equals(paramIntent)) || ("android-app://com.google.appcrawler".equals(paramIntent));
  }
  
  public static boolean f0(Bundle paramBundle, int paramInt)
  {
    int k = paramBundle.size();
    int m = 0;
    if (k <= paramInt) {
      return false;
    }
    Iterator localIterator = new TreeSet(paramBundle.keySet()).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      k = m + 1;
      m = k;
      if (k > paramInt)
      {
        paramBundle.remove(str);
        m = k;
      }
    }
    return true;
  }
  
  public static boolean g0(Object paramObject)
  {
    return ((paramObject instanceof Parcelable[])) || ((paramObject instanceof ArrayList)) || ((paramObject instanceof Bundle));
  }
  
  public static boolean l0(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    boolean bool1 = TextUtils.isEmpty(paramString1);
    boolean bool2 = TextUtils.isEmpty(paramString2);
    if ((!bool1) && (!bool2))
    {
      n.i(paramString1);
      return !paramString1.equals(paramString2);
    }
    if ((bool1) && (bool2))
    {
      if ((!TextUtils.isEmpty(paramString3)) && (!TextUtils.isEmpty(paramString4))) {
        return !paramString3.equals(paramString4);
      }
      return !TextUtils.isEmpty(paramString4);
    }
    if ((!bool1) && (bool2))
    {
      if (TextUtils.isEmpty(paramString4)) {
        return false;
      }
      return (TextUtils.isEmpty(paramString3)) || (!paramString3.equals(paramString4));
    }
    return (TextUtils.isEmpty(paramString3)) || (!paramString3.equals(paramString4));
  }
  
  public static boolean m0(String paramString, String[] paramArrayOfString)
  {
    n.i(paramArrayOfString);
    int k = paramArrayOfString.length;
    for (int m = 0; m < k; m++) {
      if (V5.a(paramString, paramArrayOfString[m])) {
        return true;
      }
    }
    return false;
  }
  
  public static byte[] p0(Parcelable paramParcelable)
  {
    if (paramParcelable == null) {
      return null;
    }
    Parcel localParcel = Parcel.obtain();
    try
    {
      paramParcelable.writeToParcel(localParcel, 0);
      paramParcelable = localParcel.marshall();
      return paramParcelable;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public static ArrayList t0(List paramList)
  {
    if (paramList == null) {
      return new ArrayList(0);
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (e)localIterator.next();
      paramList = new Bundle();
      paramList.putString("app_id", o);
      paramList.putString("origin", p);
      paramList.putLong("creation_timestamp", r);
      paramList.putString("name", q.p);
      n3.b(paramList, n.i(q.a()));
      paramList.putBoolean("active", s);
      Object localObject2 = t;
      if (localObject2 != null) {
        paramList.putString("trigger_event_name", (String)localObject2);
      }
      localObject2 = u;
      if (localObject2 != null)
      {
        paramList.putString("timed_out_event_name", o);
        localObject2 = p;
        if (localObject2 != null) {
          paramList.putBundle("timed_out_event_params", ((D)localObject2).g());
        }
      }
      paramList.putLong("trigger_timeout", v);
      localObject2 = w;
      if (localObject2 != null)
      {
        paramList.putString("triggered_event_name", o);
        localObject2 = p;
        if (localObject2 != null) {
          paramList.putBundle("triggered_event_params", ((D)localObject2).g());
        }
      }
      paramList.putLong("triggered_timestamp", q.q);
      paramList.putLong("time_to_live", x);
      localObject1 = y;
      if (localObject1 != null)
      {
        paramList.putString("expired_event_name", o);
        localObject1 = p;
        if (localObject1 != null) {
          paramList.putBundle("expired_event_params", ((D)localObject1).g());
        }
      }
      localArrayList.add(paramList);
    }
    return localArrayList;
  }
  
  public static boolean v0(Bundle paramBundle, int paramInt)
  {
    if (paramBundle == null) {
      return false;
    }
    if (paramBundle.getLong("_err") == 0L)
    {
      paramBundle.putLong("_err", paramInt);
      return true;
    }
    return false;
  }
  
  public static Bundle[] x0(Object paramObject)
  {
    if ((paramObject instanceof Bundle)) {
      return new Bundle[] { (Bundle)paramObject };
    }
    if ((paramObject instanceof Parcelable[])) {
      paramObject = (Parcelable[])paramObject;
    }
    for (paramObject = Arrays.copyOf((Object[])paramObject, paramObject.length, Bundle[].class);; paramObject = ((ArrayList)paramObject).toArray(new Bundle[((ArrayList)paramObject).size()]))
    {
      return (Bundle[])paramObject;
      if (!(paramObject instanceof ArrayList)) {
        break;
      }
      paramObject = (ArrayList)paramObject;
    }
    return null;
  }
  
  public static long y(long paramLong1, long paramLong2)
  {
    return (paramLong1 + paramLong2 * 60000L) / 86400000L;
  }
  
  public static int y0()
  {
    if ((Build.VERSION.SDK_INT >= 30) && (E.a.a(30) > 3)) {
      return E.a.a(1000000);
    }
    return 0;
  }
  
  public static long z(D paramD)
  {
    long l = 0L;
    if (paramD == null) {
      return 0L;
    }
    Iterator localIterator = paramD.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = paramD.k((String)localIterator.next());
      if ((localObject instanceof Parcelable[])) {
        l += ((Parcelable[])localObject).length;
      }
    }
    return l;
  }
  
  public final long A(Context paramContext, String paramString)
  {
    n();
    n.i(paramContext);
    n.e(paramString);
    PackageManager localPackageManager = paramContext.getPackageManager();
    MessageDigest localMessageDigest = T0();
    long l = -1L;
    if (localMessageDigest == null)
    {
      j().G().a("Could not get MD5 instance");
    }
    else
    {
      if (localPackageManager != null) {
        try
        {
          if (!u0(paramContext, paramString))
          {
            paramContext = aeagetPackageName64signatures;
            if ((paramContext != null) && (paramContext.length > 0)) {
              l = B(localMessageDigest.digest(paramContext[0].toByteArray()));
            }
          }
        }
        catch (PackageManager.NameNotFoundException paramContext)
        {
          break label131;
          j().L().a("Could not get signatures");
          break label148;
          label131:
          j().G().b("Package name not found", paramContext);
        }
      }
      l = 0L;
    }
    label148:
    return l;
  }
  
  public final Object A0(String paramString, Object paramObject)
  {
    boolean bool = "_ldl".equals(paramString);
    int k = O0(paramString);
    if (bool) {
      return H(k, paramObject, true, false);
    }
    return H(k, paramObject, false, false);
  }
  
  public final I C(String paramString1, String paramString2, Bundle paramBundle, String paramString3, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (TextUtils.isEmpty(paramString2)) {
      return null;
    }
    if (v(paramString2) == 0)
    {
      Bundle localBundle = new android/os/Bundle;
      if (paramBundle != null) {
        localBundle.<init>(paramBundle);
      }
      for (;;)
      {
        break;
        localBundle.<init>();
      }
      localBundle.putString("_o", paramString3);
      paramBundle = F(paramString1, paramString2, localBundle, f.b("_o"), true);
      paramString1 = paramBundle;
      if (paramBoolean1) {
        paramString1 = r0(paramBundle);
      }
      n.i(paramString1);
      return new I(paramString2, new D(paramString1), paramString3, paramLong);
    }
    j().G().b("Invalid conditional property event name", h().g(paramString2));
    throw new IllegalArgumentException();
  }
  
  public final boolean C0(String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      j().H().b("Name is required and can't be null. Type", paramString1);
      return false;
    }
    if (paramString2.length() == 0)
    {
      j().H().b("Name is required and can't be empty. Type", paramString1);
      return false;
    }
    int k = paramString2.codePointAt(0);
    if (!Character.isLetter(k))
    {
      j().H().c("Name must start with a letter. Type, name", paramString1, paramString2);
      return false;
    }
    int m = paramString2.length();
    k = Character.charCount(k);
    while (k < m)
    {
      int n = paramString2.codePointAt(k);
      if ((n != 95) && (!Character.isLetterOrDigit(n)))
      {
        j().H().c("Name must consist of letters, digits or _ (underscores). Type, name", paramString1, paramString2);
        return false;
      }
      k += Character.charCount(n);
    }
    return true;
  }
  
  public final Bundle D(Uri paramUri, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramUri == null) {
      return null;
    }
    Object localObject1;
    Object localObject3;
    Object localObject4;
    try
    {
      boolean bool = paramUri.isHierarchical();
      if (!bool) {
        break label141;
      }
      localObject1 = paramUri.getQueryParameter("utm_campaign");
      localObject2 = paramUri.getQueryParameter("utm_source");
      localObject3 = paramUri.getQueryParameter("utm_medium");
      localObject4 = paramUri.getQueryParameter("gclid");
      if (paramBoolean2) {
        localObject5 = paramUri.getQueryParameter("gbraid");
      }
    }
    catch (UnsupportedOperationException paramUri)
    {
      break label671;
    }
    Object localObject5 = null;
    Object localObject6 = paramUri.getQueryParameter("utm_id");
    Object localObject7 = paramUri.getQueryParameter("dclid");
    Object localObject8 = paramUri.getQueryParameter("srsltid");
    Object localObject10;
    if (paramBoolean1)
    {
      localObject9 = paramUri.getQueryParameter("sfmc_id");
      localObject10 = localObject5;
      localObject5 = localObject9;
    }
    else
    {
      localObject9 = null;
      localObject10 = localObject5;
      localObject5 = localObject9;
      break label188;
      label141:
      localObject9 = null;
      localObject2 = localObject9;
      localObject3 = localObject2;
      localObject1 = localObject3;
      localObject4 = localObject1;
      localObject6 = localObject4;
      localObject7 = localObject6;
      localObject8 = localObject7;
      localObject5 = localObject8;
      localObject10 = localObject4;
      localObject4 = localObject1;
      localObject1 = localObject9;
    }
    label188:
    if ((TextUtils.isEmpty((CharSequence)localObject1)) && (TextUtils.isEmpty((CharSequence)localObject2)) && (TextUtils.isEmpty((CharSequence)localObject3)) && (TextUtils.isEmpty((CharSequence)localObject4)) && ((!paramBoolean2) || (TextUtils.isEmpty((CharSequence)localObject10))) && (TextUtils.isEmpty((CharSequence)localObject6)) && (TextUtils.isEmpty((CharSequence)localObject7)) && (TextUtils.isEmpty((CharSequence)localObject8)) && ((!paramBoolean1) || (TextUtils.isEmpty((CharSequence)localObject5)))) {
      return null;
    }
    Object localObject9 = new Bundle();
    if (!TextUtils.isEmpty((CharSequence)localObject1)) {
      ((BaseBundle)localObject9).putString("campaign", (String)localObject1);
    }
    if (!TextUtils.isEmpty((CharSequence)localObject2)) {
      ((BaseBundle)localObject9).putString("source", (String)localObject2);
    }
    if (!TextUtils.isEmpty((CharSequence)localObject3)) {
      ((BaseBundle)localObject9).putString("medium", (String)localObject3);
    }
    if (!TextUtils.isEmpty((CharSequence)localObject4)) {
      ((BaseBundle)localObject9).putString("gclid", (String)localObject4);
    }
    if ((paramBoolean2) && (!TextUtils.isEmpty((CharSequence)localObject10))) {
      ((BaseBundle)localObject9).putString("gbraid", (String)localObject10);
    }
    Object localObject2 = paramUri.getQueryParameter("utm_term");
    if (!TextUtils.isEmpty((CharSequence)localObject2)) {
      ((BaseBundle)localObject9).putString("term", (String)localObject2);
    }
    localObject2 = paramUri.getQueryParameter("utm_content");
    if (!TextUtils.isEmpty((CharSequence)localObject2)) {
      ((BaseBundle)localObject9).putString("content", (String)localObject2);
    }
    localObject2 = paramUri.getQueryParameter("aclid");
    if (!TextUtils.isEmpty((CharSequence)localObject2)) {
      ((BaseBundle)localObject9).putString("aclid", (String)localObject2);
    }
    localObject2 = paramUri.getQueryParameter("cp1");
    if (!TextUtils.isEmpty((CharSequence)localObject2)) {
      ((BaseBundle)localObject9).putString("cp1", (String)localObject2);
    }
    localObject2 = paramUri.getQueryParameter("anid");
    if (!TextUtils.isEmpty((CharSequence)localObject2)) {
      ((BaseBundle)localObject9).putString("anid", (String)localObject2);
    }
    if (!TextUtils.isEmpty((CharSequence)localObject6)) {
      ((BaseBundle)localObject9).putString("campaign_id", (String)localObject6);
    }
    if (!TextUtils.isEmpty((CharSequence)localObject7)) {
      ((BaseBundle)localObject9).putString("dclid", (String)localObject7);
    }
    localObject2 = paramUri.getQueryParameter("utm_source_platform");
    if (!TextUtils.isEmpty((CharSequence)localObject2)) {
      ((BaseBundle)localObject9).putString("source_platform", (String)localObject2);
    }
    localObject2 = paramUri.getQueryParameter("utm_creative_format");
    if (!TextUtils.isEmpty((CharSequence)localObject2)) {
      ((BaseBundle)localObject9).putString("creative_format", (String)localObject2);
    }
    paramUri = paramUri.getQueryParameter("utm_marketing_tactic");
    if (!TextUtils.isEmpty(paramUri)) {
      ((BaseBundle)localObject9).putString("marketing_tactic", paramUri);
    }
    if (!TextUtils.isEmpty((CharSequence)localObject8)) {
      ((BaseBundle)localObject9).putString("srsltid", (String)localObject8);
    }
    if ((paramBoolean1) && (!TextUtils.isEmpty((CharSequence)localObject5))) {
      ((BaseBundle)localObject9).putString("sfmc_id", (String)localObject5);
    }
    return (Bundle)localObject9;
    label671:
    j().L().b("Install referrer url isn't a hierarchical URI", paramUri);
    return null;
  }
  
  public final boolean E0(String paramString)
  {
    n();
    if (d.a(a()).a(paramString) == 0) {
      return true;
    }
    j().F().b("Permission not granted", paramString);
    return false;
  }
  
  public final Bundle F(String paramString1, String paramString2, Bundle paramBundle, List paramList, boolean paramBoolean)
  {
    boolean bool = m0(paramString2, r3.d);
    if (paramBundle != null)
    {
      Bundle localBundle = new Bundle(paramBundle);
      int k = f().E();
      Iterator localIterator = new TreeSet(paramBundle.keySet()).iterator();
      int m = 0;
      Object localObject = this;
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        int n;
        int i1;
        if ((paramList != null) && (paramList.contains(str)))
        {
          n = 0;
        }
        else
        {
          if (!paramBoolean) {
            i1 = ((S5)localObject).N0(str);
          } else {
            i1 = 0;
          }
          n = i1;
          if (i1 == 0) {
            n = ((S5)localObject).M0(str);
          }
        }
        if (n != 0)
        {
          if (n == 3) {
            localObject = str;
          } else {
            localObject = null;
          }
          O(localBundle, n, str, str, localObject);
          localBundle.remove(str);
          n = m;
        }
        else
        {
          localObject = paramBundle.get(str);
          i1 = k;
          n = x(paramString1, paramString2, str, localObject, localBundle, paramList, paramBoolean, bool);
          if (n == 17)
          {
            O(localBundle, n, str, str, Boolean.FALSE);
            break label314;
          }
          if ((n == 0) || ("_ev".equals(str))) {
            break label314;
          }
          if (n == 21) {
            localObject = paramString2;
          } else {
            localObject = str;
          }
          O(localBundle, n, (String)localObject, str, paramBundle.get(str));
          localBundle.remove(str);
          n = m;
        }
        for (;;)
        {
          m = n;
          break;
          label314:
          n = m;
          if (J0(str))
          {
            n = m + 1;
            if (n > i1)
            {
              localObject = new StringBuilder("Event can't contain more than ");
              ((StringBuilder)localObject).append(i1);
              ((StringBuilder)localObject).append(" params");
              localObject = ((StringBuilder)localObject).toString();
              j().H().c((String)localObject, h().c(paramString2), h().b(paramBundle));
              v0(localBundle, 5);
              localBundle.remove(str);
            }
          }
        }
      }
      paramString1 = localBundle;
    }
    else
    {
      paramString1 = null;
    }
    return paramString1;
  }
  
  public final boolean F0(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    return f().N().equals(paramString);
  }
  
  public final int G0()
  {
    if (h == null) {
      h = Integer.valueOf(k.f().a(a()) / 1000);
    }
    return h.intValue();
  }
  
  public final Object H(int paramInt, Object paramObject, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramObject == null) {
      return null;
    }
    if ((!(paramObject instanceof Long)) && (!(paramObject instanceof Double)))
    {
      if ((paramObject instanceof Integer)) {
        return Long.valueOf(((Integer)paramObject).intValue());
      }
      if ((paramObject instanceof Byte)) {
        return Long.valueOf(((Byte)paramObject).byteValue());
      }
      if ((paramObject instanceof Short)) {
        return Long.valueOf(((Short)paramObject).shortValue());
      }
      if ((paramObject instanceof Boolean))
      {
        long l;
        if (((Boolean)paramObject).booleanValue()) {
          l = 1L;
        } else {
          l = 0L;
        }
        return Long.valueOf(l);
      }
      if ((paramObject instanceof Float)) {
        return Double.valueOf(((Float)paramObject).doubleValue());
      }
      if ((!(paramObject instanceof String)) && (!(paramObject instanceof Character)) && (!(paramObject instanceof CharSequence)))
      {
        if ((paramBoolean2) && (((paramObject instanceof Bundle[])) || ((paramObject instanceof Parcelable[]))))
        {
          ArrayList localArrayList = new ArrayList();
          for (Bundle localBundle : (Parcelable[])paramObject) {
            if ((localBundle instanceof Bundle))
            {
              localBundle = r0((Bundle)localBundle);
              if ((localBundle != null) && (!localBundle.isEmpty())) {
                localArrayList.add(localBundle);
              }
            }
          }
          return localArrayList.toArray(new Bundle[localArrayList.size()]);
        }
        return null;
      }
      return I(String.valueOf(paramObject), paramInt, paramBoolean1);
    }
    return paramObject;
  }
  
  public final long I0()
  {
    n();
    if (!D0(a.B().F())) {
      return 0L;
    }
    if (Build.VERSION.SDK_INT < 30) {
      l1 = 4L;
    } else if (E.a.a(30) < 4) {
      l1 = 8L;
    } else if (y0() < ((Integer)K.X.a(null)).intValue()) {
      l1 = 16L;
    } else {
      l1 = 0L;
    }
    long l2 = l1;
    if (!E0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
      l2 = l1 | 0x2;
    }
    long l1 = l2;
    if (l2 == 0L)
    {
      l1 = l2;
      if (!X0()) {
        l1 = l2 | 0x40;
      }
    }
    if (l1 == 0L) {
      return 1L;
    }
    return l1;
  }
  
  public final URL J(long paramLong1, String paramString1, String paramString2, long paramLong2, String paramString3)
  {
    try
    {
      n.e(paramString2);
      n.e(paramString1);
      String str = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[] { String.format("v%s.%s", new Object[] { Long.valueOf(paramLong1), Integer.valueOf(G0()) }), paramString2, paramString1, Long.valueOf(paramLong2) });
      paramString2 = str;
      if (paramString1.equals(f().O())) {
        paramString2 = str.concat("&ddl_test=1");
      }
    }
    catch (IllegalArgumentException paramString1)
    {
      break label161;
    }
    catch (MalformedURLException paramString1)
    {
      break label161;
    }
    paramString1 = paramString2;
    if (!paramString3.isEmpty())
    {
      paramString1 = paramString2;
      if (paramString3.charAt(0) != '&') {
        paramString1 = paramString2.concat("&");
      }
      paramString1 = paramString1.concat(paramString3);
    }
    paramString1 = new URL(paramString1);
    return paramString1;
    label161:
    j().G().b("Failed to create BOW URL for Deferred Deep Link. exception", paramString1.getMessage());
    return null;
  }
  
  public final void K(c2 paramc2, int paramInt)
  {
    Iterator localIterator = new TreeSet(d.keySet()).iterator();
    int k = 0;
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (J0(str))
      {
        int m = k + 1;
        k = m;
        if (m > paramInt)
        {
          Object localObject = new StringBuilder("Event can't contain more than ");
          ((StringBuilder)localObject).append(paramInt);
          ((StringBuilder)localObject).append(" params");
          localObject = ((StringBuilder)localObject).toString();
          j().H().c((String)localObject, h().c(a), h().b(d));
          v0(d, 5);
          d.remove(str);
          k = m;
        }
      }
    }
  }
  
  public final boolean K0(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    paramString = a().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(paramString)), 0);
    return (paramString != null) && (!paramString.isEmpty());
  }
  
  public final int M0(String paramString)
  {
    if (!w0("event param", paramString)) {
      return 3;
    }
    if (!n0("event param", null, paramString)) {
      return 14;
    }
    if (!i0("event param", 40, paramString)) {
      return 3;
    }
    return 0;
  }
  
  public final int N0(String paramString)
  {
    if (!C0("event param", paramString)) {
      return 3;
    }
    if (!n0("event param", null, paramString)) {
      return 14;
    }
    if (!i0("event param", 40, paramString)) {
      return 3;
    }
    return 0;
  }
  
  public final void P(Bundle paramBundle, long paramLong)
  {
    long l = paramBundle.getLong("_et");
    if (l != 0L) {
      j().L().b("Params already contained engagement", Long.valueOf(l));
    }
    paramBundle.putLong("_et", paramLong + l);
  }
  
  public final long P0()
  {
    long l2;
    if (d.get() == 0L) {
      synchronized (d)
      {
        Random localRandom = new java/util/Random;
        localRandom.<init>(System.nanoTime() ^ b().a());
        long l1 = localRandom.nextLong();
        int k = e + 1;
        e = k;
        l2 = k;
        return l1 + l2;
      }
    }
    synchronized (d)
    {
      d.compareAndSet(-1L, 1L);
      l2 = d.getAndIncrement();
      return l2;
    }
  }
  
  public final void Q(Bundle paramBundle1, Bundle paramBundle2)
  {
    if (paramBundle2 == null) {
      return;
    }
    Iterator localIterator = paramBundle2.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!paramBundle1.containsKey(str)) {
        k().R(paramBundle1, str, paramBundle2.get(str));
      }
    }
  }
  
  public final q1.a Q0()
  {
    if (f == null) {
      f = q1.a.a(a());
    }
    return f;
  }
  
  public final void R(Bundle paramBundle, String paramString, Object paramObject)
  {
    if (paramBundle == null) {
      return;
    }
    if ((paramObject instanceof Long))
    {
      paramBundle.putLong(paramString, ((Long)paramObject).longValue());
      return;
    }
    if ((paramObject instanceof String))
    {
      paramBundle.putString(paramString, String.valueOf(paramObject));
      return;
    }
    if ((paramObject instanceof Double))
    {
      paramBundle.putDouble(paramString, ((Double)paramObject).doubleValue());
      return;
    }
    if ((paramObject instanceof Bundle[]))
    {
      paramBundle.putParcelableArray(paramString, (Bundle[])paramObject);
      return;
    }
    if (paramString != null)
    {
      if (paramObject != null) {
        paramBundle = paramObject.getClass().getSimpleName();
      } else {
        paramBundle = null;
      }
      j().M().c("Not putting event parameter. Invalid value type. name, type", h().f(paramString), paramBundle);
    }
  }
  
  public final void S(y0 paramy0, int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("r", paramInt);
    try
    {
      paramy0.l(localBundle);
      return;
    }
    catch (RemoteException paramy0)
    {
      a.j().L().b("Error returning int value to wrapper", paramy0);
    }
  }
  
  public final String S0()
  {
    byte[] arrayOfByte = new byte[16];
    U0().nextBytes(arrayOfByte);
    return String.format(Locale.US, "%032x", new Object[] { new BigInteger(1, arrayOfByte) });
  }
  
  public final void T(y0 paramy0, long paramLong)
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("r", paramLong);
    try
    {
      paramy0.l(localBundle);
      return;
    }
    catch (RemoteException paramy0)
    {
      a.j().L().b("Error returning long value to wrapper", paramy0);
    }
  }
  
  public final void U(y0 paramy0, Bundle paramBundle)
  {
    try
    {
      paramy0.l(paramBundle);
      return;
    }
    catch (RemoteException paramy0)
    {
      a.j().L().b("Error returning bundle value to wrapper", paramy0);
    }
  }
  
  public final SecureRandom U0()
  {
    n();
    if (c == null) {
      c = new SecureRandom();
    }
    return c;
  }
  
  public final void V(y0 paramy0, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("r", paramString);
    try
    {
      paramy0.l(localBundle);
      return;
    }
    catch (RemoteException paramy0)
    {
      a.j().L().b("Error returning string value to wrapper", paramy0);
    }
  }
  
  public final boolean V0()
  {
    n();
    return I0() == 1L;
  }
  
  public final void W(y0 paramy0, ArrayList paramArrayList)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelableArrayList("r", paramArrayList);
    try
    {
      paramy0.l(localBundle);
      return;
    }
    catch (RemoteException paramy0)
    {
      a.j().L().b("Error returning bundle list to wrapper", paramy0);
    }
  }
  
  public final boolean W0()
  {
    try
    {
      a().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
      return true;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return false;
  }
  
  public final void X(y0 paramy0, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("r", paramBoolean);
    try
    {
      paramy0.l(localBundle);
      return;
    }
    catch (RemoteException paramy0)
    {
      a.j().L().b("Error returning boolean value to wrapper", paramy0);
    }
  }
  
  public final void Y(y0 paramy0, byte[] paramArrayOfByte)
  {
    Bundle localBundle = new Bundle();
    localBundle.putByteArray("r", paramArrayOfByte);
    try
    {
      paramy0.l(localBundle);
      return;
    }
    catch (RemoteException paramy0)
    {
      a.j().L().b("Error returning byte array to wrapper", paramy0);
    }
  }
  
  public final void Z(String paramString1, String paramString2, String paramString3, Bundle paramBundle, List paramList, boolean paramBoolean)
  {
    if (paramBundle == null) {
      return;
    }
    int k = f().v();
    Iterator localIterator = new TreeSet(paramBundle.keySet()).iterator();
    int m = 0;
    label511:
    while (localIterator.hasNext())
    {
      Object localObject1 = (String)localIterator.next();
      int n;
      int i1;
      if ((paramList != null) && (paramList.contains(localObject1)))
      {
        n = 0;
      }
      else
      {
        if (!paramBoolean) {
          i1 = N0((String)localObject1);
        } else {
          i1 = 0;
        }
        n = i1;
        if (i1 == 0) {
          n = M0((String)localObject1);
        }
      }
      Object localObject2;
      if (n != 0)
      {
        if (n == 3) {
          localObject2 = localObject1;
        } else {
          localObject2 = null;
        }
        O(paramBundle, n, (String)localObject1, (String)localObject1, localObject2);
        paramBundle.remove((String)localObject1);
      }
      else
      {
        if (g0(paramBundle.get((String)localObject1)))
        {
          j().M().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", paramString2, paramString3, localObject1);
          i1 = 22;
        }
        else
        {
          i1 = x(paramString1, paramString2, (String)localObject1, paramBundle.get((String)localObject1), paramBundle, paramList, paramBoolean, false);
        }
        Object localObject3 = localObject1;
        if ((i1 != 0) && (!"_ev".equals(localObject3)))
        {
          O(paramBundle, i1, (String)localObject3, (String)localObject3, paramBundle.get((String)localObject3));
          paramBundle.remove((String)localObject3);
        }
        else if ((J0((String)localObject3)) && (!m0((String)localObject3, t3.d)))
        {
          m++;
          String str1;
          if (!b0(231100000, true))
          {
            localObject1 = j().H();
            str1 = h().c(paramString2);
            localObject2 = h().b(paramBundle);
          }
          for (String str2 = "Item array not supported on client's version of Google Play Services (Android Only)";; str2 = "Item cannot contain custom parameters")
          {
            ((a2)localObject1).c(str2, str1, localObject2);
            v0(paramBundle, 23);
            for (;;)
            {
              paramBundle.remove((String)localObject3);
              break label511;
              if (m <= k) {
                break label511;
              }
              if ((!S6.a()) || (!f().s(K.I0))) {
                break;
              }
              localObject1 = j().H();
              localObject2 = new StringBuilder("Item can't contain more than ");
              ((StringBuilder)localObject2).append(k);
              ((StringBuilder)localObject2).append(" item-scoped custom params");
              ((a2)localObject1).c(((StringBuilder)localObject2).toString(), h().c(paramString2), h().b(paramBundle));
              v0(paramBundle, 28);
            }
            localObject1 = j().H();
            str1 = h().c(paramString2);
            localObject2 = h().b(paramBundle);
          }
        }
      }
    }
  }
  
  public final void a0(Parcelable[] paramArrayOfParcelable, int paramInt, boolean paramBoolean)
  {
    n.i(paramArrayOfParcelable);
    int k = paramArrayOfParcelable.length;
    for (int m = 0; m < k; m++)
    {
      Bundle localBundle = (Bundle)paramArrayOfParcelable[m];
      Iterator localIterator = new TreeSet(localBundle.keySet()).iterator();
      int n = 0;
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((J0(str)) && (!m0(str, t3.d)))
        {
          int i1 = n + 1;
          n = i1;
          if (i1 > paramInt)
          {
            a2 locala2 = j().H();
            if (paramBoolean)
            {
              StringBuilder localStringBuilder = new StringBuilder("Param can't contain more than ");
              localStringBuilder.append(paramInt);
              localStringBuilder.append(" item-scoped custom parameters");
              locala2.c(localStringBuilder.toString(), h().f(str), h().b(localBundle));
            }
            for (n = 28;; n = 23)
            {
              v0(localBundle, n);
              break;
              locala2.c("Param cannot contain item-scoped custom parameters", h().f(str), h().b(localBundle));
            }
            localBundle.remove(str);
            n = i1;
          }
        }
      }
    }
  }
  
  public final boolean b0(int paramInt, boolean paramBoolean)
  {
    Boolean localBoolean = a.J().W();
    return (G0() >= paramInt / 1000) || ((localBoolean != null) && (!localBoolean.booleanValue()));
  }
  
  public final boolean h0(String paramString, double paramDouble)
  {
    try
    {
      SharedPreferences.Editor localEditor = a().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
      localEditor.putString("deeplink", paramString);
      localEditor.putLong("timestamp", Double.doubleToRawLongBits(paramDouble));
      boolean bool = localEditor.commit();
      return bool;
    }
    catch (RuntimeException paramString)
    {
      j().G().b("Failed to persist Deferred Deep Link. exception", paramString);
    }
    return false;
  }
  
  public final boolean i0(String paramString1, int paramInt, String paramString2)
  {
    if (paramString2 == null)
    {
      j().H().b("Name is required and can't be null. Type", paramString1);
      return false;
    }
    if (paramString2.codePointCount(0, paramString2.length()) > paramInt)
    {
      j().H().d("Name is too long. Type, maximum supported length, name", paramString1, Integer.valueOf(paramInt), paramString2);
      return false;
    }
    return true;
  }
  
  public final boolean j0(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString1))
    {
      if (!R0(paramString1))
      {
        if (a.r()) {
          j().H().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", Y1.v(paramString1));
        }
        return false;
      }
    }
    else
    {
      if (TextUtils.isEmpty(paramString2)) {
        break label78;
      }
      if (!R0(paramString2))
      {
        j().H().b("Invalid admob_app_id. Analytics disabled.", Y1.v(paramString2));
        return false;
      }
    }
    return true;
    label78:
    if (a.r()) {
      j().H().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
    }
    return false;
  }
  
  public final boolean k0(String paramString1, String paramString2, int paramInt, Object paramObject)
  {
    if (paramObject == null) {
      return true;
    }
    if ((!(paramObject instanceof Long)) && (!(paramObject instanceof Float)) && (!(paramObject instanceof Integer)) && (!(paramObject instanceof Byte)) && (!(paramObject instanceof Short)) && (!(paramObject instanceof Boolean)) && (!(paramObject instanceof Double)))
    {
      if ((!(paramObject instanceof String)) && (!(paramObject instanceof Character)) && (!(paramObject instanceof CharSequence))) {
        return false;
      }
      paramObject = String.valueOf(paramObject);
      if (((String)paramObject).codePointCount(0, ((String)paramObject).length()) > paramInt)
      {
        j().M().d("Value is too long; discarded. Value kind, name, value length", paramString1, paramString2, Integer.valueOf(((String)paramObject).length()));
        return false;
      }
    }
    return true;
  }
  
  public final boolean n0(String paramString1, String[] paramArrayOfString, String paramString2)
  {
    return o0(paramString1, paramArrayOfString, null, paramString2);
  }
  
  public final boolean o0(String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String paramString2)
  {
    if (paramString2 == null)
    {
      j().H().b("Name is required and can't be null. Type", paramString1);
      return false;
    }
    n.i(paramString2);
    String[] arrayOfString = i;
    int k = arrayOfString.length;
    for (int m = 0; m < k; m++) {
      if (paramString2.startsWith(arrayOfString[m]))
      {
        j().H().c("Name starts with reserved prefix. Type, name", paramString1, paramString2);
        return false;
      }
    }
    if ((paramArrayOfString1 != null) && (m0(paramString2, paramArrayOfString1)) && ((paramArrayOfString2 == null) || (!m0(paramString2, paramArrayOfString2))))
    {
      j().H().c("Name is reserved. Type, name", paramString1, paramString2);
      return false;
    }
    return true;
  }
  
  public final int q0(String paramString)
  {
    if (!w0("user property", paramString)) {
      return 6;
    }
    if (!n0("user property", s3.a, paramString)) {
      return 15;
    }
    if (!i0("user property", 24, paramString)) {
      return 6;
    }
    return 0;
  }
  
  public final Bundle r0(Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    if (paramBundle != null)
    {
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = s0(str, paramBundle.get(str));
        if (localObject == null) {
          j().M().b("Param value can't be null", h().f(str));
        } else {
          R(localBundle, str, localObject);
        }
      }
    }
    return localBundle;
  }
  
  public final boolean s()
  {
    return true;
  }
  
  public final Object s0(String paramString, Object paramObject)
  {
    if ("_ev".equals(paramString)) {
      return H(f().w(a.B().F()), paramObject, true, true);
    }
    int k;
    if (H0(paramString)) {
      k = f().w(a.B().F());
    } else {
      k = f().t(a.B().F());
    }
    return H(k, paramObject, false, true);
  }
  
  public final void t()
  {
    n();
    SecureRandom localSecureRandom = new SecureRandom();
    long l1 = localSecureRandom.nextLong();
    long l2 = l1;
    if (l1 == 0L)
    {
      l1 = localSecureRandom.nextLong();
      l2 = l1;
      if (l1 == 0L)
      {
        j().L().a("Utils falling back to Random for random id");
        l2 = l1;
      }
    }
    d.set(l2);
  }
  
  public final int u(int paramInt)
  {
    return k.f().h(a(), 12451000);
  }
  
  public final boolean u0(Context paramContext, String paramString)
  {
    X500Principal localX500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
    try
    {
      paramContext = d.a(paramContext).e(paramString, 64);
      if (paramContext == null) {
        break label129;
      }
      paramContext = signatures;
      if ((paramContext == null) || (paramContext.length <= 0)) {
        break label129;
      }
      paramString = paramContext[0];
      CertificateFactory localCertificateFactory = CertificateFactory.getInstance("X.509");
      paramContext = new java/io/ByteArrayInputStream;
      paramContext.<init>(paramString.toByteArray());
      boolean bool = ((X509Certificate)localCertificateFactory.generateCertificate(paramContext)).getSubjectX500Principal().equals(localX500Principal);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}catch (CertificateException localCertificateException) {}
    paramString = j().G();
    for (paramContext = "Package name not found";; paramContext = "Error obtaining certificate")
    {
      paramString.b(paramContext, localCertificateException);
      break;
      paramString = j().G();
    }
    label129:
    return true;
  }
  
  public final int v(String paramString)
  {
    if (!w0("event", paramString)) {
      return 2;
    }
    if (!o0("event", r3.a, r3.b, paramString)) {
      return 13;
    }
    if (!i0("event", 40, paramString)) {
      return 2;
    }
    return 0;
  }
  
  public final int w(String paramString, Object paramObject)
  {
    if ("_ldl".equals(paramString)) {}
    boolean bool;
    for (String str = "user property referrer";; str = "user property")
    {
      bool = k0(str, paramString, O0(paramString), paramObject);
      break;
    }
    if (bool) {
      return 0;
    }
    return 7;
  }
  
  public final boolean w0(String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      j().H().b("Name is required and can't be null. Type", paramString1);
      return false;
    }
    if (paramString2.length() == 0)
    {
      j().H().b("Name is required and can't be empty. Type", paramString1);
      return false;
    }
    int k = paramString2.codePointAt(0);
    if ((!Character.isLetter(k)) && (k != 95))
    {
      j().H().c("Name must start with a letter or _ (underscore). Type, name", paramString1, paramString2);
      return false;
    }
    int m = paramString2.length();
    k = Character.charCount(k);
    while (k < m)
    {
      int n = paramString2.codePointAt(k);
      if ((n != 95) && (!Character.isLetterOrDigit(n)))
      {
        j().H().c("Name must consist of letters, digits or _ (underscores). Type, name", paramString1, paramString2);
        return false;
      }
      k += Character.charCount(n);
    }
    return true;
  }
  
  public final int x(String paramString1, String paramString2, String paramString3, Object paramObject, Bundle paramBundle, List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    n();
    boolean bool = g0(paramObject);
    int k = 0;
    if (bool) {
      if (paramBoolean2)
      {
        if (!m0(paramString3, t3.c)) {
          return 20;
        }
        if (!a.J().d0()) {
          return 25;
        }
        bool = paramObject instanceof Parcelable[];
        if (bool)
        {
          m = ((Parcelable[])paramObject).length;
        }
        else
        {
          if (!(paramObject instanceof ArrayList)) {
            break label223;
          }
          m = ((ArrayList)paramObject).size();
        }
        if (m > 200)
        {
          j().M().d("Parameter array is too long; discarded. Value kind, name, array length", "param", paramString3, Integer.valueOf(m));
          Object localObject;
          if (bool)
          {
            localObject = (Parcelable[])paramObject;
            if (localObject.length > 200) {
              paramBundle.putParcelableArray(paramString3, (Parcelable[])Arrays.copyOf((Object[])localObject, 200));
            }
          }
          else if ((paramObject instanceof ArrayList))
          {
            localObject = (ArrayList)paramObject;
            if (((ArrayList)localObject).size() > 200) {
              paramBundle.putParcelableArrayList(paramString3, new ArrayList(((ArrayList)localObject).subList(0, 200)));
            }
          }
          m = 17;
          break label226;
        }
      }
      else
      {
        return 21;
      }
    }
    label223:
    int m = 0;
    label226:
    int n;
    if ((!H0(paramString2)) && (!H0(paramString3))) {
      n = f().t(a.B().F());
    } else {
      n = f().w(a.B().F());
    }
    if (k0("param", paramString3, n, paramObject)) {
      return m;
    }
    if (paramBoolean2)
    {
      if ((paramObject instanceof Bundle))
      {
        Z(paramString1, paramString2, paramString3, (Bundle)paramObject, paramList, paramBoolean1);
      }
      else
      {
        if ((paramObject instanceof Parcelable[])) {
          for (paramObject : (Parcelable[])paramObject)
          {
            if (!(paramObject instanceof Bundle))
            {
              paramString1 = j().M();
              paramObject = paramObject.getClass();
              paramString2 = "All Parcelable[] elements must be of type Bundle. Value type, name";
              paramString1.c(paramString2, paramObject, paramString3);
              break label548;
            }
            Z(paramString1, paramString2, paramString3, (Bundle)paramObject, paramList, paramBoolean1);
          }
        }
        if (!(paramObject instanceof ArrayList)) {
          break label548;
        }
        paramBundle = (ArrayList)paramObject;
        int i1 = paramBundle.size();
        for (n = k;; n++)
        {
          if (n >= i1) {
            break label545;
          }
          paramObject = paramBundle.get(n);
          if (!(paramObject instanceof Bundle))
          {
            paramString2 = j().M();
            if (paramObject != null) {
              paramString1 = paramObject.getClass();
            } else {
              paramString1 = "null";
            }
            paramBundle = "All ArrayList elements must be of type Bundle. Value type, name";
            paramObject = paramString1;
            paramString1 = paramString2;
            paramString2 = paramBundle;
            break;
          }
          Z(paramString1, paramString2, paramString3, (Bundle)paramObject, paramList, paramBoolean1);
        }
      }
      label545:
      return m;
    }
    label548:
    return 4;
  }
  
  public final long z0(String paramString)
  {
    if (a().getPackageManager() == null) {
      return 0L;
    }
    int k = 0;
    int m;
    try
    {
      ApplicationInfo localApplicationInfo = d.a(a()).c(paramString, 0);
      m = k;
      if (localApplicationInfo != null) {
        m = targetSdkVersion;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      j().J().b("PackageManager failed to find running app: app_id", paramString);
      m = k;
    }
    return m;
  }
}

/* Location:
 * Qualified Name:     R2.S5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
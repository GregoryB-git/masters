package e7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
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
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import b.z;
import com.google.android.gms.internal.measurement.zzdq;
import d2.q;
import ec.i;
import g;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
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
import l1.a.a;
import m1.d.a;
import x6.c;
import x6.d;

public final class r6
  extends d3
{
  public static final String[] r = { "firebase_", "google_", "ga_" };
  public static final String[] s = { "_err" };
  public SecureRandom d;
  public final AtomicLong e = new AtomicLong(0L);
  public int f;
  public a.a o;
  public Boolean p;
  public Integer q = null;
  
  public r6(j2 paramj2)
  {
    super(paramj2);
  }
  
  public static String A(String paramString, int paramInt, boolean paramBoolean)
  {
    if (paramString == null) {
      return null;
    }
    if (paramString.codePointCount(0, paramString.length()) > paramInt)
    {
      if (paramBoolean) {
        return g.d(paramString.substring(0, paramString.offsetByCodePoints(0, paramInt)), "...");
      }
      return null;
    }
    return paramString;
  }
  
  public static void B(Bundle paramBundle, int paramInt, String paramString, Object paramObject)
  {
    if (h0(paramInt, paramBundle))
    {
      paramBundle.putString("_ev", A(paramString, 40, true));
      if ((paramObject != null) && (((paramObject instanceof String)) || ((paramObject instanceof CharSequence)))) {
        paramBundle.putLong("_el", String.valueOf(paramObject).length());
      }
    }
  }
  
  public static MessageDigest B0()
  {
    for (int i = 0; i < 2; i++) {
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
  
  public static void L(q4 paramq4, Bundle paramBundle, boolean paramBoolean)
  {
    if ((paramBundle != null) && (paramq4 != null) && ((!paramBundle.containsKey("_sc")) || (paramBoolean)))
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
    if ((paramBundle != null) && (paramq4 == null) && (paramBoolean))
    {
      paramBundle.remove("_sn");
      paramBundle.remove("_sc");
      paramBundle.remove("_si");
    }
  }
  
  public static void M(t6 paramt6, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    h0(paramInt1, localBundle);
    if ((!TextUtils.isEmpty(paramString2)) && (!TextUtils.isEmpty(paramString3))) {
      localBundle.putString(paramString2, paramString3);
    }
    if ((paramInt1 == 6) || (paramInt1 == 7) || (paramInt1 == 2)) {
      localBundle.putLong("_el", paramInt2);
    }
    paramt6.a(paramString1, "_err", localBundle);
  }
  
  public static boolean R(Context paramContext)
  {
    m6.j.i(paramContext);
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
  
  public static boolean S(Intent paramIntent)
  {
    paramIntent = paramIntent.getStringExtra("android.intent.extra.REFERRER_NAME");
    return ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(paramIntent)) || ("https://www.google.com".equals(paramIntent)) || ("android-app://com.google.appcrawler".equals(paramIntent));
  }
  
  public static boolean T(Object paramObject)
  {
    return ((paramObject instanceof Parcelable[])) || ((paramObject instanceof ArrayList)) || ((paramObject instanceof Bundle));
  }
  
  public static boolean X(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    boolean bool1 = TextUtils.isEmpty(paramString1);
    boolean bool2 = TextUtils.isEmpty(paramString2);
    if ((!bool1) && (!bool2))
    {
      m6.j.i(paramString1);
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
  
  public static boolean Y(String paramString, String[] paramArrayOfString)
  {
    m6.j.i(paramArrayOfString);
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++) {
      if (Objects.equals(paramString, paramArrayOfString[j])) {
        return true;
      }
    }
    return false;
  }
  
  public static byte[] a0(Parcelable paramParcelable)
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
  
  public static boolean c0(Context paramContext)
  {
    m6.j.i(paramContext);
    String str;
    if (Build.VERSION.SDK_INT >= 24) {
      str = "com.google.android.gms.measurement.AppMeasurementJobService";
    } else {
      str = "com.google.android.gms.measurement.AppMeasurementService";
    }
    return i0(paramContext, str);
  }
  
  public static ArrayList<Bundle> g0(List<f> paramList)
  {
    if (paramList == null) {
      return new ArrayList(0);
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject1 = (f)paramList.next();
      Bundle localBundle = new Bundle();
      localBundle.putString("app_id", a);
      localBundle.putString("origin", b);
      localBundle.putLong("creation_timestamp", d);
      localBundle.putString("name", c.b);
      Object localObject2 = c.D();
      m6.j.i(localObject2);
      p2.m0.j0(localBundle, localObject2);
      localBundle.putBoolean("active", e);
      localObject2 = f;
      if (localObject2 != null) {
        localBundle.putString("trigger_event_name", (String)localObject2);
      }
      localObject2 = o;
      if (localObject2 != null)
      {
        localBundle.putString("timed_out_event_name", a);
        localObject2 = b;
        if (localObject2 != null) {
          localBundle.putBundle("timed_out_event_params", ((a0)localObject2).E());
        }
      }
      localBundle.putLong("trigger_timeout", p);
      localObject2 = q;
      if (localObject2 != null)
      {
        localBundle.putString("triggered_event_name", a);
        localObject2 = b;
        if (localObject2 != null) {
          localBundle.putBundle("triggered_event_params", ((a0)localObject2).E());
        }
      }
      localBundle.putLong("triggered_timestamp", c.c);
      localBundle.putLong("time_to_live", r);
      localObject1 = s;
      if (localObject1 != null)
      {
        localBundle.putString("expired_event_name", a);
        localObject1 = b;
        if (localObject1 != null) {
          localBundle.putBundle("expired_event_params", ((a0)localObject1).E());
        }
      }
      localArrayList.add(localBundle);
    }
    return localArrayList;
  }
  
  public static boolean h0(int paramInt, Bundle paramBundle)
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
  
  public static boolean i0(Context paramContext, String paramString)
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
  
  public static int k0()
  {
    if ((Build.VERSION.SDK_INT >= 30) && (SdkExtensions.getExtensionVersion(30) > 3)) {
      return SdkExtensions.getExtensionVersion(1000000);
    }
    return 0;
  }
  
  public static boolean o0(String paramString)
  {
    String str = (String)h0.m0.a(null);
    return (str.equals("*")) || (Arrays.asList(str.split(",")).contains(paramString));
  }
  
  public static boolean r0(String paramString)
  {
    return (!TextUtils.isEmpty(paramString)) && (paramString.startsWith("_"));
  }
  
  public static long s(a0 parama0)
  {
    long l = 0L;
    if (parama0 == null) {
      return 0L;
    }
    Iterator localIterator = a.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = a.get((String)localObject);
      if ((localObject instanceof Parcelable[])) {
        l += ((Parcelable[])localObject).length;
      }
    }
    return l;
  }
  
  public static long t(byte[] paramArrayOfByte)
  {
    m6.j.i(paramArrayOfByte);
    int i = paramArrayOfByte.length;
    int j = 0;
    if (i > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      long l = 0L;
      for (i = paramArrayOfByte.length - 1; (i >= 0) && (i >= paramArrayOfByte.length - 8); i--)
      {
        l += ((paramArrayOfByte[i] & 0xFF) << j);
        j += 8;
      }
      return l;
    }
    throw new IllegalStateException();
  }
  
  public static boolean t0(String paramString)
  {
    m6.j.e(paramString);
    return (paramString.charAt(0) != '_') || (paramString.equals("_ep"));
  }
  
  public static int w0(String paramString)
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
    return 36;
  }
  
  public static Bundle x(List<q6> paramList)
  {
    Bundle localBundle = new Bundle();
    if (paramList == null) {
      return localBundle;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      q6 localq6 = (q6)paramList.next();
      Object localObject = e;
      if (localObject != null)
      {
        localBundle.putString(b, (String)localObject);
      }
      else
      {
        localObject = d;
        if (localObject != null)
        {
          localBundle.putLong(b, ((Long)localObject).longValue());
        }
        else
        {
          localObject = o;
          if (localObject != null) {
            localBundle.putDouble(b, ((Double)localObject).doubleValue());
          }
        }
      }
    }
    return localBundle;
  }
  
  public final String A0()
  {
    byte[] arrayOfByte = new byte[16];
    C0().nextBytes(arrayOfByte);
    return String.format(Locale.US, "%032x", new Object[] { new BigInteger(1, arrayOfByte) });
  }
  
  public final void C(Bundle paramBundle, long paramLong)
  {
    long l = paramBundle.getLong("_et");
    if (l != 0L) {
      zzjr.c("Params already contained engagement", Long.valueOf(l));
    }
    paramBundle.putLong("_et", paramLong + l);
  }
  
  public final SecureRandom C0()
  {
    l();
    if (d == null) {
      d = new SecureRandom();
    }
    return d;
  }
  
  public final void D(Bundle paramBundle1, Bundle paramBundle2)
  {
    if (paramBundle2 == null) {
      return;
    }
    Iterator localIterator = paramBundle2.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!paramBundle1.containsKey(str)) {
        k().E(paramBundle1, str, paramBundle2.get(str));
      }
    }
  }
  
  public final boolean D0()
  {
    l();
    return x0() == 1L;
  }
  
  public final void E(Bundle paramBundle, String paramString, Object paramObject)
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
      zzjt.d("Not putting event parameter. Invalid value type. name, type", i().f(paramString), paramBundle);
    }
  }
  
  public final void F(zzdq paramzzdq, int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("r", paramInt);
    try
    {
      paramzzdq.zza(localBundle);
      return;
    }
    catch (RemoteException paramzzdq)
    {
      b).zzj().r.c("Error returning int value to wrapper", paramzzdq);
    }
  }
  
  public final void G(zzdq paramzzdq, long paramLong)
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("r", paramLong);
    try
    {
      paramzzdq.zza(localBundle);
      return;
    }
    catch (RemoteException paramzzdq)
    {
      b).zzj().r.c("Error returning long value to wrapper", paramzzdq);
    }
  }
  
  public final void H(zzdq paramzzdq, ArrayList<Bundle> paramArrayList)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelableArrayList("r", paramArrayList);
    try
    {
      paramzzdq.zza(localBundle);
      return;
    }
    catch (RemoteException paramzzdq)
    {
      b).zzj().r.c("Error returning bundle list to wrapper", paramzzdq);
    }
  }
  
  public final void I(zzdq paramzzdq, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("r", paramBoolean);
    try
    {
      paramzzdq.zza(localBundle);
      return;
    }
    catch (RemoteException paramzzdq)
    {
      b).zzj().r.c("Error returning boolean value to wrapper", paramzzdq);
    }
  }
  
  public final void J(zzdq paramzzdq, byte[] paramArrayOfByte)
  {
    Bundle localBundle = new Bundle();
    localBundle.putByteArray("r", paramArrayOfByte);
    try
    {
      paramzzdq.zza(localBundle);
      return;
    }
    catch (RemoteException paramzzdq)
    {
      b).zzj().r.c("Error returning byte array to wrapper", paramzzdq);
    }
  }
  
  public final void K(d1 paramd1, int paramInt)
  {
    Iterator localIterator = new TreeSet(d.keySet()).iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (t0(str))
      {
        int j = i + 1;
        i = j;
        if (j > paramInt)
        {
          Object localObject = new StringBuilder("Event can't contain more than ");
          ((StringBuilder)localObject).append(paramInt);
          ((StringBuilder)localObject).append(" params");
          localObject = ((StringBuilder)localObject).toString();
          zzjq.d((String)localObject, i().c(a), i().a(d));
          h0(5, d);
          d.remove(str);
          i = j;
        }
      }
    }
  }
  
  public final void N(String paramString, zzdq paramzzdq)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("r", paramString);
    try
    {
      paramzzdq.zza(localBundle);
      return;
    }
    catch (RemoteException paramString)
    {
      b).zzj().r.c("Error returning string value to wrapper", paramString);
    }
  }
  
  public final void O(String paramString1, String paramString2, Bundle paramBundle, List paramList, boolean paramBoolean)
  {
    if (paramBundle == null) {
      return;
    }
    int i;
    if (h().k().b0(231100000)) {
      i = 35;
    } else {
      i = 0;
    }
    Iterator localIterator = new TreeSet(paramBundle.keySet()).iterator();
    int j = 0;
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      int k;
      if ((paramList != null) && (paramList.contains(str)))
      {
        k = 0;
      }
      else
      {
        int m;
        if (!paramBoolean) {
          m = v0(str);
        } else {
          m = 0;
        }
        k = m;
        if (m == 0) {
          k = u0(str);
        }
      }
      Object localObject;
      if (k != 0)
      {
        if (k == 3) {
          localObject = str;
        } else {
          localObject = null;
        }
        B(paramBundle, k, str, localObject);
        paramBundle.remove(str);
      }
      else
      {
        if (T(paramBundle.get(str)))
        {
          zzjt.a(paramString1, paramString2, str, "Nested Bundle parameters are not allowed; discarded. event name, param name, child param name");
          k = 22;
        }
        else
        {
          k = r(paramString1, str, paramBundle.get(str), paramBundle, paramList, paramBoolean, false);
        }
        if ((k != 0) && (!"_ev".equals(str)))
        {
          B(paramBundle, k, str, paramBundle.get(str));
          paramBundle.remove(str);
        }
        else if ((t0(str)) && (!Y(str, z.d)))
        {
          j++;
          if (!b0(231100000)) {
            zzjq.d("Item array not supported on client's version of Google Play Services (Android Only)", i().c(paramString1), i().a(paramBundle));
          }
          for (k = 23;; k = 28)
          {
            h0(k, paramBundle);
            paramBundle.remove(str);
            break;
            if (j <= i) {
              break;
            }
            localObject = zzjq;
            StringBuilder localStringBuilder = new StringBuilder("Item can't contain more than ");
            localStringBuilder.append(i);
            localStringBuilder.append(" item-scoped custom params");
            ((b1)localObject).d(localStringBuilder.toString(), i().c(paramString1), i().a(paramBundle));
          }
        }
      }
    }
  }
  
  public final void P(Parcelable[] paramArrayOfParcelable, int paramInt)
  {
    m6.j.i(paramArrayOfParcelable);
    int i = paramArrayOfParcelable.length;
    for (int j = 0; j < i; j++)
    {
      Bundle localBundle = (Bundle)paramArrayOfParcelable[j];
      Iterator localIterator = new TreeSet(localBundle.keySet()).iterator();
      int k = 0;
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((t0(str)) && (!Y(str, z.d)))
        {
          int m = k + 1;
          k = m;
          if (m > paramInt)
          {
            b1 localb1 = zzjq;
            StringBuilder localStringBuilder = new StringBuilder("Param can't contain more than ");
            localStringBuilder.append(paramInt);
            localStringBuilder.append(" item-scoped custom parameters");
            localb1.d(localStringBuilder.toString(), i().f(str), i().a(localBundle));
            h0(28, localBundle);
            localBundle.remove(str);
            k = m;
          }
        }
      }
    }
  }
  
  public final boolean Q(int paramInt, String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      zzjq.c("Name is required and can't be null. Type", paramString1);
      return false;
    }
    if (paramString2.codePointCount(0, paramString2.length()) > paramInt)
    {
      zzjq.a(paramString1, Integer.valueOf(paramInt), paramString2, "Name is too long. Type, maximum supported length, name");
      return false;
    }
    return true;
  }
  
  public final boolean U(String paramString, double paramDouble)
  {
    try
    {
      SharedPreferences.Editor localEditor = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
      localEditor.putString("deeplink", paramString);
      localEditor.putLong("timestamp", Double.doubleToRawLongBits(paramDouble));
      boolean bool = localEditor.commit();
      return bool;
    }
    catch (RuntimeException paramString)
    {
      zzjo.c("Failed to persist Deferred Deep Link. exception", paramString);
    }
    return false;
  }
  
  public final boolean V(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString1))
    {
      m6.j.i(paramString1);
      if (!paramString1.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$"))
      {
        if (TextUtils.isEmpty(b).b)) {
          zzjq.c("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", a1.p(paramString1));
        }
        return false;
      }
    }
    else
    {
      if (TextUtils.isEmpty(paramString2)) {
        break label98;
      }
      m6.j.i(paramString2);
      if (!paramString2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$"))
      {
        zzjq.c("Invalid admob_app_id. Analytics disabled.", a1.p(paramString2));
        return false;
      }
    }
    return true;
    label98:
    if (TextUtils.isEmpty(b).b)) {
      zzjq.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
    }
    return false;
  }
  
  public final boolean W(String paramString1, String paramString2, int paramInt, Object paramObject)
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
        zzjt.a(paramString1, paramString2, Integer.valueOf(((String)paramObject).length()), "Value is too long; discarded. Value kind, name, value length");
        return false;
      }
    }
    return true;
  }
  
  public final boolean Z(String paramString1, String[] paramArrayOfString1, String[] paramArrayOfString2, String paramString2)
  {
    if (paramString2 == null)
    {
      zzjq.c("Name is required and can't be null. Type", paramString1);
      return false;
    }
    String[] arrayOfString = r;
    for (int i = 0; i < 3; i++) {
      if (paramString2.startsWith(arrayOfString[i]))
      {
        i = 1;
        break label63;
      }
    }
    i = 0;
    label63:
    if (i != 0)
    {
      zzjq.d("Name starts with reserved prefix. Type, name", paramString1, paramString2);
      return false;
    }
    if ((paramArrayOfString1 != null) && (Y(paramString2, paramArrayOfString1)) && ((paramArrayOfString2 == null) || (!Y(paramString2, paramArrayOfString2))))
    {
      zzjq.d("Name is reserved. Type, name", paramString1, paramString2);
      return false;
    }
    return true;
  }
  
  public final boolean b0(int paramInt)
  {
    Boolean localBoolean = b).l().f;
    return (s0() >= paramInt / 1000) || ((localBoolean != null) && (!localBoolean.booleanValue()));
  }
  
  public final void d0()
  {
    l();
    SecureRandom localSecureRandom = new SecureRandom();
    long l1 = localSecureRandom.nextLong();
    long l2 = l1;
    if (l1 == 0L)
    {
      l1 = localSecureRandom.nextLong();
      l2 = l1;
      if (l1 == 0L)
      {
        zzjr.b("Utils falling back to Random for random id");
        l2 = l1;
      }
    }
    e.set(l2);
  }
  
  public final int e0(String paramString)
  {
    if (!j0("user property", paramString)) {
      return 6;
    }
    if (!Z("user property", p2.m0.a, null, paramString)) {
      return 15;
    }
    if (!Q(24, "user property", paramString)) {
      return 6;
    }
    return 0;
  }
  
  public final Object f0(Object paramObject, String paramString)
  {
    if ("_ev".equals(paramString)) {
      return z(h().r(null, false), paramObject, true, true);
    }
    int i;
    if (r0(paramString)) {
      i = h().r(null, false);
    } else {
      i = h().n(null, false);
    }
    return z(i, paramObject, false, true);
  }
  
  public final boolean j0(String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      zzjq.c("Name is required and can't be null. Type", paramString1);
      return false;
    }
    if (paramString2.length() == 0)
    {
      zzjq.c("Name is required and can't be empty. Type", paramString1);
      return false;
    }
    int i = paramString2.codePointAt(0);
    if ((!Character.isLetter(i)) && (i != 95))
    {
      zzjq.d("Name must start with a letter or _ (underscore). Type, name", paramString1, paramString2);
      return false;
    }
    int j = paramString2.length();
    i = Character.charCount(i);
    while (i < j)
    {
      int k = paramString2.codePointAt(i);
      if ((k != 95) && (!Character.isLetterOrDigit(k)))
      {
        zzjq.d("Name must consist of letters, digits or _ (underscores). Type, name", paramString1, paramString2);
        return false;
      }
      i += Character.charCount(k);
    }
    return true;
  }
  
  public final Object l0(Object paramObject, String paramString)
  {
    boolean bool = "_ldl".equals(paramString);
    int i = w0(paramString);
    if (bool) {
      return z(i, paramObject, true, false);
    }
    return z(i, paramObject, false, false);
  }
  
  public final boolean m0(Context paramContext, String paramString)
  {
    Object localObject1 = new X500Principal("CN=Android Debug,O=Android,C=US");
    try
    {
      paramContext = d.a(paramContext).b(64, paramString);
      if (paramContext == null) {
        break label120;
      }
      paramContext = signatures;
      if ((paramContext == null) || (paramContext.length <= 0)) {
        break label120;
      }
      Object localObject2 = paramContext[0];
      paramContext = CertificateFactory.getInstance("X.509");
      paramString = new java/io/ByteArrayInputStream;
      paramString.<init>(((Signature)localObject2).toByteArray());
      boolean bool = ((X509Certificate)paramContext.generateCertificate(paramString)).getSubjectX500Principal().equals(localObject1);
      return bool;
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      paramContext = zzjo;
      localObject1 = "Package name not found";
    }
    catch (CertificateException paramString)
    {
      paramContext = zzjo;
      localObject1 = "Error obtaining certificate";
    }
    paramContext.c((String)localObject1, paramString);
    label120:
    return true;
  }
  
  public final boolean n0(String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      zzjq.c("Name is required and can't be null. Type", paramString1);
      return false;
    }
    if (paramString2.length() == 0)
    {
      zzjq.c("Name is required and can't be empty. Type", paramString1);
      return false;
    }
    int i = paramString2.codePointAt(0);
    if (!Character.isLetter(i))
    {
      zzjq.d("Name must start with a letter. Type, name", paramString1, paramString2);
      return false;
    }
    int j = paramString2.length();
    i = Character.charCount(i);
    while (i < j)
    {
      int k = paramString2.codePointAt(i);
      if ((k != 95) && (!Character.isLetterOrDigit(k)))
      {
        zzjq.d("Name must consist of letters, digits or _ (underscores). Type, name", paramString1, paramString2);
        return false;
      }
      i += Character.charCount(k);
    }
    return true;
  }
  
  public final boolean o()
  {
    return true;
  }
  
  public final int p(Object paramObject, String paramString)
  {
    int i;
    String str;
    if ("_ldl".equals(paramString))
    {
      i = w0(paramString);
      str = "user property referrer";
    }
    else
    {
      i = w0(paramString);
      str = "user property";
    }
    if (W(str, paramString, i, paramObject)) {
      return 0;
    }
    return 7;
  }
  
  public final boolean p0(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2)) {
      return true;
    }
    if (TextUtils.isEmpty(paramString1)) {
      return false;
    }
    return h().b("debug.firebase.analytics.app", "").equals(paramString1);
  }
  
  public final int q(String paramString)
  {
    if (!j0("event", paramString)) {
      return 2;
    }
    if (!Z("event", b.a0.b, b.a0.c, paramString)) {
      return 13;
    }
    if (!Q(40, "event", paramString)) {
      return 2;
    }
    return 0;
  }
  
  public final boolean q0(String paramString)
  {
    l();
    if (azzaa.checkCallingOrSelfPermission(paramString) == 0) {
      return true;
    }
    zzjv.c("Permission not granted", paramString);
    return false;
  }
  
  public final int r(String paramString1, String paramString2, Object paramObject, Bundle paramBundle, List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    l();
    boolean bool = T(paramObject);
    int i = 1;
    if (bool) {
      if (paramBoolean2)
      {
        if (!Y(paramString2, z.c)) {
          return 20;
        }
        Object localObject = ((j2)b).l();
        ((o0)localObject).l();
        ((j0)localObject).t();
        if ((!((w4)localObject).F()) || (((q)localObject).k().s0() >= 200900)) {
          j = 1;
        } else {
          j = 0;
        }
        if (j == 0) {
          return 25;
        }
        bool = paramObject instanceof Parcelable[];
        if (bool)
        {
          j = ((Parcelable[])paramObject).length;
        }
        else
        {
          if (!(paramObject instanceof ArrayList)) {
            break label173;
          }
          j = ((ArrayList)paramObject).size();
        }
        if (j > 200)
        {
          zzjt.a("param", paramString2, Integer.valueOf(j), "Parameter array is too long; discarded. Value kind, name, array length");
          j = 0;
        }
        else
        {
          label173:
          j = 1;
        }
        if (j == 0)
        {
          if (bool)
          {
            localObject = (Parcelable[])paramObject;
            if (localObject.length > 200) {
              paramBundle.putParcelableArray(paramString2, (Parcelable[])Arrays.copyOf((Object[])localObject, 200));
            }
          }
          else if ((paramObject instanceof ArrayList))
          {
            localObject = (ArrayList)paramObject;
            if (((ArrayList)localObject).size() > 200) {
              paramBundle.putParcelableArrayList(paramString2, new ArrayList(((ArrayList)localObject).subList(0, 200)));
            }
          }
          j = 17;
          break label280;
        }
      }
      else
      {
        return 21;
      }
    }
    int j = 0;
    label280:
    int k;
    if ((!r0(paramString1)) && (!r0(paramString2))) {
      k = h().n(null, false);
    } else {
      k = h().r(null, false);
    }
    if (W("param", paramString2, k, paramObject)) {
      return j;
    }
    if (paramBoolean2)
    {
      if ((paramObject instanceof Bundle))
      {
        O(paramString1, paramString2, (Bundle)paramObject, paramList, paramBoolean1);
        k = i;
      }
      else
      {
        int m;
        int n;
        if ((paramObject instanceof Parcelable[]))
        {
          paramBundle = (Parcelable[])paramObject;
          m = paramBundle.length;
          for (n = 0;; n++)
          {
            k = i;
            if (n >= m) {
              break label568;
            }
            paramObject = paramBundle[n];
            if (!(paramObject instanceof Bundle))
            {
              zzjt.d("All Parcelable[] elements must be of type Bundle. Value type, name", paramObject.getClass(), paramString2);
              break;
            }
            O(paramString1, paramString2, (Bundle)paramObject, paramList, paramBoolean1);
          }
        }
        if ((paramObject instanceof ArrayList))
        {
          paramBundle = (ArrayList)paramObject;
          m = paramBundle.size();
          for (n = 0;; n++)
          {
            k = i;
            if (n >= m) {
              break label568;
            }
            paramObject = paramBundle.get(n);
            if (!(paramObject instanceof Bundle))
            {
              paramBundle = zzjt;
              if (paramObject != null) {
                paramString1 = paramObject.getClass();
              } else {
                paramString1 = "null";
              }
              paramBundle.d("All ArrayList elements must be of type Bundle. Value type, name", paramString1, paramString2);
              break;
            }
            O(paramString1, paramString2, (Bundle)paramObject, paramList, paramBoolean1);
          }
        }
        k = 0;
      }
      label568:
      if (k != 0) {
        return j;
      }
    }
    return 4;
  }
  
  public final int s0()
  {
    if (q == null)
    {
      Object localObject1 = j6.f.b;
      Object localObject2 = zza();
      localObject1.getClass();
      localObject1 = j6.j.a;
      int i = 0;
      try
      {
        localObject2 = ((Context)localObject2).getPackageManager().getPackageInfo("com.google.android.gms", 0);
        i = versionCode;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
      }
      q = Integer.valueOf(i / 1000);
    }
    return q.intValue();
  }
  
  public final Bundle u(Uri paramUri)
  {
    if (paramUri == null) {
      return null;
    }
    try
    {
      boolean bool = paramUri.isHierarchical();
      Object localObject2;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      Object localObject6;
      Object localObject7;
      Object localObject8;
      Object localObject9;
      if (bool)
      {
        localObject1 = paramUri.getQueryParameter("utm_campaign");
        localObject2 = paramUri.getQueryParameter("utm_source");
        localObject3 = paramUri.getQueryParameter("utm_medium");
        localObject4 = paramUri.getQueryParameter("gclid");
        localObject5 = paramUri.getQueryParameter("gbraid");
        localObject6 = paramUri.getQueryParameter("utm_id");
        localObject7 = paramUri.getQueryParameter("dclid");
        localObject8 = paramUri.getQueryParameter("srsltid");
        localObject9 = paramUri.getQueryParameter("sfmc_id");
      }
      else
      {
        localBundle = null;
        localObject1 = localBundle;
        localObject2 = localObject1;
        localObject4 = localObject2;
        localObject3 = localObject4;
        localObject6 = localObject3;
        localObject7 = localObject6;
        localObject8 = localObject7;
        localObject9 = localObject8;
        localObject5 = localObject3;
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localBundle;
      }
      if ((TextUtils.isEmpty((CharSequence)localObject1)) && (TextUtils.isEmpty((CharSequence)localObject2)) && (TextUtils.isEmpty((CharSequence)localObject3)) && (TextUtils.isEmpty((CharSequence)localObject4)) && (TextUtils.isEmpty((CharSequence)localObject5)) && (TextUtils.isEmpty((CharSequence)localObject6)) && (TextUtils.isEmpty((CharSequence)localObject7)) && (TextUtils.isEmpty((CharSequence)localObject8)) && (TextUtils.isEmpty((CharSequence)localObject9))) {
        return null;
      }
      Bundle localBundle = new Bundle();
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        localBundle.putString("campaign", (String)localObject1);
      }
      if (!TextUtils.isEmpty((CharSequence)localObject2)) {
        localBundle.putString("source", (String)localObject2);
      }
      if (!TextUtils.isEmpty((CharSequence)localObject3)) {
        localBundle.putString("medium", (String)localObject3);
      }
      if (!TextUtils.isEmpty((CharSequence)localObject4)) {
        localBundle.putString("gclid", (String)localObject4);
      }
      if (!TextUtils.isEmpty((CharSequence)localObject5)) {
        localBundle.putString("gbraid", (String)localObject5);
      }
      Object localObject1 = paramUri.getQueryParameter("gad_source");
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        localBundle.putString("gad_source", (String)localObject1);
      }
      localObject1 = paramUri.getQueryParameter("utm_term");
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        localBundle.putString("term", (String)localObject1);
      }
      localObject1 = paramUri.getQueryParameter("utm_content");
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        localBundle.putString("content", (String)localObject1);
      }
      localObject1 = paramUri.getQueryParameter("aclid");
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        localBundle.putString("aclid", (String)localObject1);
      }
      localObject1 = paramUri.getQueryParameter("cp1");
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        localBundle.putString("cp1", (String)localObject1);
      }
      localObject1 = paramUri.getQueryParameter("anid");
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        localBundle.putString("anid", (String)localObject1);
      }
      if (!TextUtils.isEmpty((CharSequence)localObject6)) {
        localBundle.putString("campaign_id", (String)localObject6);
      }
      if (!TextUtils.isEmpty((CharSequence)localObject7)) {
        localBundle.putString("dclid", (String)localObject7);
      }
      localObject1 = paramUri.getQueryParameter("utm_source_platform");
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        localBundle.putString("source_platform", (String)localObject1);
      }
      localObject1 = paramUri.getQueryParameter("utm_creative_format");
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        localBundle.putString("creative_format", (String)localObject1);
      }
      paramUri = paramUri.getQueryParameter("utm_marketing_tactic");
      if (!TextUtils.isEmpty(paramUri)) {
        localBundle.putString("marketing_tactic", paramUri);
      }
      if (!TextUtils.isEmpty((CharSequence)localObject8)) {
        localBundle.putString("srsltid", (String)localObject8);
      }
      if (!TextUtils.isEmpty((CharSequence)localObject9)) {
        localBundle.putString("sfmc_id", (String)localObject9);
      }
      return localBundle;
    }
    catch (UnsupportedOperationException paramUri)
    {
      zzjr.c("Install referrer url isn't a hierarchical URI", paramUri);
    }
    return null;
  }
  
  public final int u0(String paramString)
  {
    if (!j0("event param", paramString)) {
      return 3;
    }
    if (!Z("event param", null, null, paramString)) {
      return 14;
    }
    if (!Q(40, "event param", paramString)) {
      return 3;
    }
    return 0;
  }
  
  public final Bundle v(Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    if (paramBundle != null)
    {
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = f0(paramBundle.get(str), str);
        if (localObject == null) {
          zzjt.c("Param value can't be null", i().f(str));
        } else {
          E(localBundle, str, localObject);
        }
      }
    }
    return localBundle;
  }
  
  public final int v0(String paramString)
  {
    if (!n0("event param", paramString)) {
      return 3;
    }
    if (!Z("event param", null, null, paramString)) {
      return 14;
    }
    if (!Q(40, "event param", paramString)) {
      return 3;
    }
    return 0;
  }
  
  public final Bundle w(String paramString, Bundle paramBundle, List paramList, boolean paramBoolean)
  {
    boolean bool = Y(paramString, b.a0.e);
    if (paramBundle != null)
    {
      Bundle localBundle = new Bundle(paramBundle);
      int i;
      if (h().k().b0(201500000)) {
        i = 100;
      } else {
        i = 25;
      }
      Iterator localIterator = new TreeSet(paramBundle.keySet()).iterator();
      int j = 0;
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        int k;
        if ((paramList != null) && (paramList.contains(str)))
        {
          k = 0;
        }
        else
        {
          int m;
          if (!paramBoolean) {
            m = v0(str);
          } else {
            m = 0;
          }
          k = m;
          if (m == 0) {
            k = u0(str);
          }
        }
        Object localObject;
        if (k != 0)
        {
          if (k == 3) {
            localObject = str;
          } else {
            localObject = null;
          }
          B(localBundle, k, str, localObject);
          localBundle.remove(str);
        }
        else
        {
          k = r(paramString, str, paramBundle.get(str), localBundle, paramList, paramBoolean, bool);
          if (k == 17)
          {
            B(localBundle, k, str, Boolean.FALSE);
          }
          else if ((k != 0) && (!"_ev".equals(str)))
          {
            if (k == 21) {
              localObject = paramString;
            } else {
              localObject = str;
            }
            B(localBundle, k, (String)localObject, paramBundle.get(str));
            localBundle.remove(str);
            continue;
          }
          if (t0(str))
          {
            j++;
            if (j > i)
            {
              localObject = new StringBuilder("Event can't contain more than ");
              ((StringBuilder)localObject).append(i);
              ((StringBuilder)localObject).append(" params");
              localObject = ((StringBuilder)localObject).toString();
              zzjq.d((String)localObject, i().c(paramString), i().a(paramBundle));
              h0(5, localBundle);
              localBundle.remove(str);
            }
          }
        }
      }
      paramString = localBundle;
    }
    else
    {
      paramString = null;
    }
    return paramString;
  }
  
  public final long x0()
  {
    l();
    if (!o0(((j2)b).h().v())) {
      return 0L;
    }
    if (Build.VERSION.SDK_INT < 30) {
      l1 = 4L;
    } else if (SdkExtensions.getExtensionVersion(30) < 4) {
      l1 = 8L;
    } else if (k0() < ((Integer)h0.g0.a(null)).intValue()) {
      l1 = 16L;
    } else {
      l1 = 0L;
    }
    long l2 = l1;
    if (!q0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
      l2 = l1 | 0x2;
    }
    long l1 = l2;
    if (l2 == 0L)
    {
      boolean bool1;
      if (p == null)
      {
        Object localObject = z0();
        bool1 = false;
        boolean bool2 = false;
        if (localObject != null)
        {
          localObject = ((l1.a)localObject).a();
          Integer localInteger;
          try
          {
            localInteger = (Integer)((Future)localObject).get(10000L, TimeUnit.MILLISECONDS);
            bool1 = bool2;
            if (localInteger != null) {
              bool1 = bool2;
            }
            try
            {
              if (localInteger.intValue() == 1) {
                bool1 = true;
              }
              p = Boolean.valueOf(bool1);
            }
            catch (TimeoutException localTimeoutException1)
            {
              break label239;
            }
            catch (InterruptedException localInterruptedException1)
            {
              break label239;
            }
            catch (ExecutionException localExecutionException1)
            {
              break label239;
            }
            catch (CancellationException localCancellationException1)
            {
              break label239;
            }
            localInteger = null;
          }
          catch (TimeoutException localTimeoutException2) {}catch (InterruptedException localInterruptedException2) {}catch (ExecutionException localExecutionException2) {}catch (CancellationException localCancellationException2) {}
          label239:
          zzjr.c("Measurement manager api exception", localCancellationException2);
          p = Boolean.FALSE;
          zzjw.c("Measurement manager api status result", localInteger);
        }
      }
      else
      {
        bool1 = p.booleanValue();
      }
      l1 = l2;
      if (!bool1) {
        l1 = l2 | 0x40;
      }
    }
    if (l1 == 0L) {
      return 1L;
    }
    return l1;
  }
  
  public final f0 y(String paramString1, Bundle paramBundle, String paramString2, long paramLong, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(paramString1)) {
      return null;
    }
    if (q(paramString1) == 0)
    {
      Bundle localBundle = new android/os/Bundle;
      if (paramBundle != null) {
        localBundle.<init>(paramBundle);
      } else {
        localBundle.<init>();
      }
      localBundle.putString("_o", paramString2);
      localBundle = w(paramString1, localBundle, Collections.singletonList("_o"), true);
      paramBundle = localBundle;
      if (paramBoolean) {
        paramBundle = v(localBundle);
      }
      m6.j.i(paramBundle);
      return new f0(paramString1, new a0(paramBundle), paramString2, paramLong);
    }
    zzjo.c("Invalid conditional property event name", i().g(paramString1));
    throw new IllegalArgumentException();
  }
  
  public final long y0()
  {
    long l1;
    if (e.get() == 0L) {
      synchronized (e)
      {
        Random localRandom = new java/util/Random;
        l1 = System.nanoTime();
        ((z)zzb()).getClass();
        localRandom.<init>(l1 ^ System.currentTimeMillis());
        long l2 = localRandom.nextLong();
        int i = f + 1;
        f = i;
        l1 = i;
        return l2 + l1;
      }
    }
    synchronized (e)
    {
      e.compareAndSet(-1L, 1L);
      l1 = e.getAndIncrement();
      return l1;
    }
  }
  
  public final Object z(int paramInt, Object paramObject, boolean paramBoolean1, boolean paramBoolean2)
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
              localBundle = v((Bundle)localBundle);
              if (!localBundle.isEmpty()) {
                localArrayList.add(localBundle);
              }
            }
          }
          return localArrayList.toArray(new Bundle[localArrayList.size()]);
        }
        return null;
      }
      return A(String.valueOf(paramObject), paramInt, paramBoolean1);
    }
    return paramObject;
  }
  
  public final l1.a z0()
  {
    if (o == null)
    {
      Object localObject1 = zza();
      i.e(localObject1, "context");
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("AdServicesInfo.version=");
      int i = Build.VERSION.SDK_INT;
      int j = 0;
      if (i >= 30) {
        k = j1.a.a.a();
      } else {
        k = 0;
      }
      ((StringBuilder)localObject2).append(k);
      Log.d("MeasurementManager", ((StringBuilder)localObject2).toString());
      int k = j;
      if (i >= 30) {
        k = j1.a.a.a();
      }
      localObject2 = null;
      if (k >= 5) {
        localObject1 = new d.a((Context)localObject1);
      } else {
        localObject1 = null;
      }
      if (localObject1 != null) {
        localObject2 = new a.a((d.a)localObject1);
      }
      o = ((a.a)localObject2);
    }
    return o;
  }
}

/* Location:
 * Qualified Name:     e7.r6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package e7;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import b.z;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzfw.zzc;
import com.google.android.gms.internal.measurement.zzfw.zzd;
import com.google.android.gms.internal.measurement.zzfw.zzf;
import com.google.android.gms.internal.measurement.zzgf.zza;
import com.google.android.gms.internal.measurement.zzgf.zzc;
import com.google.android.gms.internal.measurement.zzgf.zzd;
import com.google.android.gms.internal.measurement.zzgf.zze;
import com.google.android.gms.internal.measurement.zzgf.zzf;
import com.google.android.gms.internal.measurement.zzgf.zzf.zza;
import com.google.android.gms.internal.measurement.zzgf.zzh;
import com.google.android.gms.internal.measurement.zzgf.zzh.zza;
import com.google.android.gms.internal.measurement.zzgf.zzj;
import com.google.android.gms.internal.measurement.zzgf.zzk;
import com.google.android.gms.internal.measurement.zzgf.zzk.zza;
import com.google.android.gms.internal.measurement.zzgf.zzm;
import com.google.android.gms.internal.measurement.zzgf.zzn;
import com.google.android.gms.internal.measurement.zzgf.zzo;
import com.google.android.gms.internal.measurement.zzgf.zzp;
import com.google.android.gms.internal.measurement.zzhi;
import com.google.android.gms.internal.measurement.zzhu;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzkg.zza;
import com.google.android.gms.internal.measurement.zzlp;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpf;
import d2.q;
import f;
import g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import m6.j;
import va.a;

public final class o6
  extends h6
{
  public o6(i6 parami6)
  {
    super(parami6);
  }
  
  public static f0 A(zzad paramzzad)
  {
    Bundle localBundle = v(paramzzad.zzc(), true);
    if (localBundle.containsKey("_o"))
    {
      localObject = localBundle.get("_o");
      if (localObject != null)
      {
        localObject = localObject.toString();
        break label40;
      }
    }
    Object localObject = "app";
    label40:
    String str1 = a.i(paramzzad.zzb(), b.a0.b, b.a0.d);
    String str2 = str1;
    if (str1 == null) {
      str2 = paramzzad.zzb();
    }
    return new f0(str2, new a0(localBundle), (String)localObject, paramzzad.zza());
  }
  
  public static String D(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramBoolean1) {
      localStringBuilder.append("Dynamic ");
    }
    if (paramBoolean2) {
      localStringBuilder.append("Sequence ");
    }
    if (paramBoolean3) {
      localStringBuilder.append("Session-Scoped ");
    }
    return localStringBuilder.toString();
  }
  
  public static ArrayList E(BitSet paramBitSet)
  {
    int i = (paramBitSet.length() + 63) / 64;
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++)
    {
      long l1 = 0L;
      int k = 0;
      while (k < 64)
      {
        int m = (j << 6) + k;
        if (m >= paramBitSet.length()) {
          break;
        }
        long l2 = l1;
        if (paramBitSet.get(m)) {
          l2 = l1 | 1L << k;
        }
        k++;
        l1 = l2;
      }
      localArrayList.add(Long.valueOf(l1));
    }
    return localArrayList;
  }
  
  public static HashMap F(Bundle paramBundle, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramBundle.get(str);
      boolean bool = localObject1 instanceof Parcelable[];
      int i;
      if ((!bool) && (!(localObject1 instanceof ArrayList)) && (!(localObject1 instanceof Bundle))) {
        i = 0;
      } else {
        i = 1;
      }
      if (i != 0)
      {
        if (paramBoolean)
        {
          ArrayList localArrayList = new ArrayList();
          if (bool) {
            for (localObject1 : (Parcelable[])localObject1) {
              if ((localObject1 instanceof Bundle)) {
                localArrayList.add(F((Bundle)localObject1, false));
              }
            }
          }
          if ((localObject1 instanceof ArrayList))
          {
            ??? = (ArrayList)localObject1;
            int k = ((ArrayList)???).size();
            i = 0;
            while (i < k)
            {
              localObject1 = ((ArrayList)???).get(i);
              ??? = i + 1;
              i = ???;
              if ((localObject1 instanceof Bundle))
              {
                localArrayList.add(F((Bundle)localObject1, false));
                i = ???;
              }
            }
          }
          if ((localObject1 instanceof Bundle)) {
            localArrayList.add(F((Bundle)localObject1, false));
          }
          localHashMap.put(str, localArrayList);
        }
      }
      else if (localObject1 != null) {
        localHashMap.put(str, localObject1);
      }
    }
    return localHashMap;
  }
  
  public static void H(Uri.Builder paramBuilder, String paramString1, String paramString2, Set<String> paramSet)
  {
    if ((!paramSet.contains(paramString1)) && (!TextUtils.isEmpty(paramString2))) {
      paramBuilder.appendQueryParameter(paramString1, paramString2);
    }
  }
  
  public static void I(Uri.Builder paramBuilder, String[] paramArrayOfString, Bundle paramBundle, Set<String> paramSet)
  {
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      Object localObject = paramArrayOfString[i].split(",");
      String str = localObject[0];
      localObject = localObject[(localObject.length - 1)];
      str = paramBundle.getString(str);
      if (str != null) {
        H(paramBuilder, (String)localObject, str, paramSet);
      }
    }
  }
  
  public static void J(zzgf.zzf.zza paramzza, String paramString, Long paramLong)
  {
    List localList = paramzza.zzf();
    for (int i = 0; i < localList.size(); i++) {
      if (paramString.equals(((zzgf.zzh)localList.get(i)).zzg())) {
        break label52;
      }
    }
    i = -1;
    label52:
    paramString = zzgf.zzh.zze().zza(paramString);
    if ((paramLong instanceof Long)) {
      paramString.zza(paramLong.longValue());
    } else if ((paramLong instanceof String)) {
      paramString.zzb((String)paramLong);
    } else if ((paramLong instanceof Double)) {
      paramString.zza(((Double)paramLong).doubleValue());
    }
    if (i >= 0)
    {
      paramzza.zza(i, paramString);
      return;
    }
    paramzza.zza(paramString);
  }
  
  public static void L(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      paramStringBuilder.append("  ");
    }
  }
  
  public static void N(StringBuilder paramStringBuilder, int paramInt, String paramString, zzfw.zzd paramzzd)
  {
    if (paramzzd == null) {
      return;
    }
    L(paramStringBuilder, paramInt);
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" {\n");
    if (paramzzd.zzh()) {
      O(paramStringBuilder, paramInt, "comparison_type", paramzzd.zza().name());
    }
    if (paramzzd.zzj()) {
      O(paramStringBuilder, paramInt, "match_as_float", Boolean.valueOf(paramzzd.zzg()));
    }
    if (paramzzd.zzi()) {
      O(paramStringBuilder, paramInt, "comparison_value", paramzzd.zzd());
    }
    if (paramzzd.zzl()) {
      O(paramStringBuilder, paramInt, "min_comparison_value", paramzzd.zzf());
    }
    if (paramzzd.zzk()) {
      O(paramStringBuilder, paramInt, "max_comparison_value", paramzzd.zze());
    }
    L(paramStringBuilder, paramInt);
    paramStringBuilder.append("}\n");
  }
  
  public static void O(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    if (paramObject == null) {
      return;
    }
    L(paramStringBuilder, paramInt + 1);
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject);
    paramStringBuilder.append('\n');
  }
  
  public static void Q(StringBuilder paramStringBuilder, String paramString, zzgf.zzm paramzzm)
  {
    if (paramzzm == null) {
      return;
    }
    L(paramStringBuilder, 3);
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" {\n");
    Object localObject;
    int i;
    if (paramzzm.zzb() != 0)
    {
      L(paramStringBuilder, 4);
      paramStringBuilder.append("results: ");
      localObject = paramzzm.zzi().iterator();
      for (i = 0; ((Iterator)localObject).hasNext(); i++)
      {
        paramString = (Long)((Iterator)localObject).next();
        if (i != 0) {
          paramStringBuilder.append(", ");
        }
        paramStringBuilder.append(paramString);
      }
      paramStringBuilder.append('\n');
    }
    if (paramzzm.zzd() != 0)
    {
      L(paramStringBuilder, 4);
      paramStringBuilder.append("status: ");
      paramString = paramzzm.zzk().iterator();
      for (i = 0; paramString.hasNext(); i++)
      {
        localObject = (Long)paramString.next();
        if (i != 0) {
          paramStringBuilder.append(", ");
        }
        paramStringBuilder.append(localObject);
      }
      paramStringBuilder.append('\n');
    }
    if (paramzzm.zza() != 0)
    {
      L(paramStringBuilder, 4);
      paramStringBuilder.append("dynamic_filter_timestamps: {");
      localObject = paramzzm.zzh().iterator();
      for (i = 0; ((Iterator)localObject).hasNext(); i++)
      {
        zzgf.zze localzze = (zzgf.zze)((Iterator)localObject).next();
        if (i != 0) {
          paramStringBuilder.append(", ");
        }
        if (localzze.zzf()) {
          paramString = Integer.valueOf(localzze.zza());
        } else {
          paramString = null;
        }
        paramStringBuilder.append(paramString);
        paramStringBuilder.append(":");
        if (localzze.zze()) {
          paramString = Long.valueOf(localzze.zzb());
        } else {
          paramString = null;
        }
        paramStringBuilder.append(paramString);
      }
      paramStringBuilder.append("}\n");
    }
    if (paramzzm.zzc() != 0)
    {
      L(paramStringBuilder, 4);
      paramStringBuilder.append("sequence_filter_timestamps: {");
      paramzzm = paramzzm.zzj().iterator();
      for (i = 0; paramzzm.hasNext(); i++)
      {
        localObject = (zzgf.zzn)paramzzm.next();
        if (i != 0) {
          paramStringBuilder.append(", ");
        }
        if (((zzgf.zzn)localObject).zzf()) {
          paramString = Integer.valueOf(((zzgf.zzn)localObject).zzb());
        } else {
          paramString = null;
        }
        paramStringBuilder.append(paramString);
        paramStringBuilder.append(": [");
        paramString = ((zzgf.zzn)localObject).zze().iterator();
        for (int j = 0; paramString.hasNext(); j++)
        {
          long l = ((Long)paramString.next()).longValue();
          if (j != 0) {
            paramStringBuilder.append(", ");
          }
          paramStringBuilder.append(l);
        }
        paramStringBuilder.append("]");
      }
      paramStringBuilder.append("}\n");
    }
    L(paramStringBuilder, 3);
    paramStringBuilder.append("}\n");
  }
  
  public static boolean R(int paramInt, List paramList)
  {
    return (paramInt < paramList.size() << 6) && ((1L << paramInt % 64 & ((Long)paramList.get(paramInt / 64)).longValue()) != 0L);
  }
  
  public static Serializable T(zzgf.zzf paramzzf, String paramString)
  {
    paramzzf = y(paramzzf, paramString);
    if (paramzzf != null)
    {
      if (paramzzf.zzn()) {
        return paramzzf.zzh();
      }
      if (paramzzf.zzl()) {
        return Long.valueOf(paramzzf.zzd());
      }
      if (paramzzf.zzj()) {
        return Double.valueOf(paramzzf.zza());
      }
      if (paramzzf.zzc() > 0) {
        return W(paramzzf.zzi());
      }
    }
    return null;
  }
  
  public static boolean U(String paramString)
  {
    return (paramString != null) && (paramString.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)")) && (paramString.length() <= 310);
  }
  
  public static Bundle[] W(List<zzgf.zzh> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = (zzgf.zzh)paramList.next();
      if (localObject != null)
      {
        Bundle localBundle = new Bundle();
        localObject = ((zzgf.zzh)localObject).zzi().iterator();
        while (((Iterator)localObject).hasNext())
        {
          zzgf.zzh localzzh = (zzgf.zzh)((Iterator)localObject).next();
          if (localzzh.zzn()) {
            localBundle.putString(localzzh.zzg(), localzzh.zzh());
          } else if (localzzh.zzl()) {
            localBundle.putLong(localzzh.zzg(), localzzh.zzd());
          } else if (localzzh.zzj()) {
            localBundle.putDouble(localzzh.zzg(), localzzh.zza());
          }
        }
        if (!localBundle.isEmpty()) {
          localArrayList.add(localBundle);
        }
      }
    }
    return (Bundle[])localArrayList.toArray(new Bundle[localArrayList.size()]);
  }
  
  public static int s(zzgf.zzk.zza paramzza, String paramString)
  {
    if (paramzza == null) {
      return -1;
    }
    for (int i = 0; i < paramzza.zzd(); i++) {
      if (paramString.equals(paramzza.zzk(i).zzg())) {
        return i;
      }
    }
    return -1;
  }
  
  public static Bundle u(List<zzgf.zzh> paramList)
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (zzgf.zzh)localIterator.next();
      String str = paramList.zzg();
      if (paramList.zzj()) {
        localBundle.putDouble(str, paramList.zza());
      } else if (paramList.zzk()) {
        localBundle.putFloat(str, paramList.zzb());
      } else if (paramList.zzn()) {
        localBundle.putString(str, paramList.zzh());
      } else if (paramList.zzl()) {
        localBundle.putLong(str, paramList.zzd());
      }
    }
    return localBundle;
  }
  
  public static Bundle v(Map paramMap, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramMap.get(str);
      if (localObject1 == null)
      {
        localObject1 = null;
      }
      else
      {
        if ((localObject1 instanceof Long))
        {
          localBundle.putLong(str, ((Long)localObject1).longValue());
          continue;
        }
        if ((localObject1 instanceof Double))
        {
          localBundle.putDouble(str, ((Double)localObject1).doubleValue());
          continue;
        }
        if ((localObject1 instanceof ArrayList))
        {
          if (!paramBoolean) {
            continue;
          }
          localObject1 = (ArrayList)localObject1;
          ArrayList localArrayList = new ArrayList();
          int i = ((ArrayList)localObject1).size();
          int j = 0;
          while (j < i)
          {
            Object localObject2 = ((ArrayList)localObject1).get(j);
            j++;
            localArrayList.add(v((Map)localObject2, false));
          }
          localBundle.putParcelableArray(str, (Parcelable[])localArrayList.toArray(new Parcelable[0]));
          continue;
        }
        localObject1 = localObject1.toString();
      }
      localBundle.putString(str, (String)localObject1);
    }
    return localBundle;
  }
  
  public static zzgf.zzh y(zzgf.zzf paramzzf, String paramString)
  {
    Iterator localIterator = paramzzf.zzh().iterator();
    while (localIterator.hasNext())
    {
      paramzzf = (zzgf.zzh)localIterator.next();
      if (paramzzf.zzg().equals(paramString)) {
        return paramzzf;
      }
    }
    return null;
  }
  
  public static zzlp z(zzkg.zza paramzza, byte[] paramArrayOfByte)
  {
    zzjt localzzjt = zzjt.zza();
    if (localzzjt != null) {
      return paramzza.zza(paramArrayOfByte, localzzjt);
    }
    return paramzza.zza(paramArrayOfByte);
  }
  
  public final w5 B(String paramString1, zzgf.zzk.zza paramzza, zzgf.zzf.zza paramzza1, String paramString2)
  {
    if ((zzoy.zza()) && (h().x(paramString1, h0.Q0)))
    {
      ((z)zzb()).getClass();
      long l = System.currentTimeMillis();
      Object localObject1 = h().u(paramString1, h0.p0).split(",");
      Object localObject2 = new HashSet(localObject1.length);
      int i = localObject1.length;
      int j = 0;
      while (j < i)
      {
        localObject3 = localObject1[j];
        Objects.requireNonNull(localObject3);
        if (((HashSet)localObject2).add(localObject3))
        {
          j++;
        }
        else
        {
          paramString1 = new StringBuilder("duplicate element: ");
          paramString1.append(localObject3);
          throw new IllegalArgumentException(paramString1.toString());
        }
      }
      Set localSet = Collections.unmodifiableSet((Set)localObject2);
      localObject1 = c.r;
      Object localObject3 = ((z5)localObject1).o().G(paramString1);
      localObject2 = new Uri.Builder();
      ((Uri.Builder)localObject2).scheme(((q)localObject1).h().u(paramString1, h0.i0));
      if (!TextUtils.isEmpty((CharSequence)localObject3)) {
        localObject3 = g.e((String)localObject3, ".", ((q)localObject1).h().u(paramString1, h0.j0));
      } else {
        localObject3 = ((q)localObject1).h().u(paramString1, h0.j0);
      }
      ((Uri.Builder)localObject2).authority((String)localObject3);
      ((Uri.Builder)localObject2).path(((q)localObject1).h().u(paramString1, h0.k0));
      H((Uri.Builder)localObject2, "gmp_app_id", paramzza.zzy(), localSet);
      H((Uri.Builder)localObject2, "gmp_version", "114010", localSet);
      localObject1 = paramzza.zzv();
      h localh = h();
      Object localObject4 = h0.T0;
      localObject3 = localObject1;
      if (localh.x(paramString1, (m0)localObject4))
      {
        localObject3 = localObject1;
        if (o().J(paramString1)) {
          localObject3 = "";
        }
      }
      H((Uri.Builder)localObject2, "app_instance_id", (String)localObject3, localSet);
      H((Uri.Builder)localObject2, "rdid", paramzza.zzaa(), localSet);
      H((Uri.Builder)localObject2, "bundle_id", paramzza.zzu(), localSet);
      localObject3 = paramzza1.zze();
      localObject1 = a.i((String)localObject3, b.a0.d, b.a0.b);
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        localObject3 = localObject1;
      }
      H((Uri.Builder)localObject2, "app_event_name", (String)localObject3, localSet);
      H((Uri.Builder)localObject2, "app_version", String.valueOf(paramzza.zzb()), localSet);
      localObject1 = paramzza.zzz();
      localObject3 = localObject1;
      if (h().x(paramString1, (m0)localObject4))
      {
        localObject3 = localObject1;
        if (o().K(paramString1))
        {
          localObject3 = localObject1;
          if (!TextUtils.isEmpty((CharSequence)localObject1))
          {
            j = ((String)localObject1).indexOf(".");
            localObject3 = localObject1;
            if (j != -1) {
              localObject3 = ((String)localObject1).substring(0, j);
            }
          }
        }
      }
      H((Uri.Builder)localObject2, "os_version", (String)localObject3, localSet);
      H((Uri.Builder)localObject2, "timestamp", String.valueOf(paramzza1.zzc()), localSet);
      boolean bool = paramzza.zzae();
      localObject3 = "1";
      if (bool) {
        H((Uri.Builder)localObject2, "lat", "1", localSet);
      }
      H((Uri.Builder)localObject2, "privacy_sandbox_version", String.valueOf(paramzza.zza()), localSet);
      H((Uri.Builder)localObject2, "trigger_uri_source", "1", localSet);
      H((Uri.Builder)localObject2, "trigger_uri_timestamp", String.valueOf(l), localSet);
      H((Uri.Builder)localObject2, "request_uuid", paramString2, localSet);
      paramzza1 = paramzza1.zzf();
      paramString2 = new Bundle();
      localObject4 = paramzza1.iterator();
      while (((Iterator)localObject4).hasNext())
      {
        paramzza1 = (zzgf.zzh)((Iterator)localObject4).next();
        localObject1 = paramzza1.zzg();
        if (paramzza1.zzj())
        {
          paramzza1 = String.valueOf(paramzza1.zza());
        }
        else if (paramzza1.zzk())
        {
          paramzza1 = String.valueOf(paramzza1.zzb());
        }
        else if (paramzza1.zzn())
        {
          paramzza1 = paramzza1.zzh();
        }
        else
        {
          if (!paramzza1.zzl()) {
            continue;
          }
          paramzza1 = String.valueOf(paramzza1.zzd());
        }
        paramString2.putString((String)localObject1, paramzza1);
      }
      I((Uri.Builder)localObject2, h().u(paramString1, h0.o0).split("\\|"), paramString2, localSet);
      paramzza1 = paramzza.zzac();
      paramString2 = new Bundle();
      localObject1 = paramzza1.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramzza1 = (zzgf.zzp)((Iterator)localObject1).next();
        localObject4 = paramzza1.zzg();
        if (paramzza1.zzi())
        {
          paramzza1 = String.valueOf(paramzza1.zza());
        }
        else if (paramzza1.zzj())
        {
          paramzza1 = String.valueOf(paramzza1.zzb());
        }
        else if (paramzza1.zzm())
        {
          paramzza1 = paramzza1.zzh();
        }
        else
        {
          if (!paramzza1.zzk()) {
            continue;
          }
          paramzza1 = String.valueOf(paramzza1.zzc());
        }
        paramString2.putString((String)localObject4, paramzza1);
      }
      I((Uri.Builder)localObject2, h().u(paramString1, h0.n0).split("\\|"), paramString2, localSet);
      if (paramzza.zzad()) {
        paramString1 = (String)localObject3;
      } else {
        paramString1 = "0";
      }
      H((Uri.Builder)localObject2, "dma", paramString1, localSet);
      if (!paramzza.zzx().isEmpty()) {
        H((Uri.Builder)localObject2, "dma_cps", paramzza.zzx(), localSet);
      }
      if ((h().x(null, h0.V0)) && (paramzza.zzaf()))
      {
        paramString1 = paramzza.zzg();
        if (!paramString1.zzh().isEmpty()) {
          H((Uri.Builder)localObject2, "dl_gclid", paramString1.zzh(), localSet);
        }
        if (!paramString1.zzg().isEmpty()) {
          H((Uri.Builder)localObject2, "dl_gbraid", paramString1.zzg(), localSet);
        }
        if (!paramString1.zzf().isEmpty()) {
          H((Uri.Builder)localObject2, "dl_gs", paramString1.zzf(), localSet);
        }
        if (paramString1.zza() > 0L) {
          H((Uri.Builder)localObject2, "dl_ss_ts", String.valueOf(paramString1.zza()), localSet);
        }
        if (!paramString1.zzk().isEmpty()) {
          H((Uri.Builder)localObject2, "mr_gclid", paramString1.zzk(), localSet);
        }
        if (!paramString1.zzj().isEmpty()) {
          H((Uri.Builder)localObject2, "mr_gbraid", paramString1.zzj(), localSet);
        }
        if (!paramString1.zzi().isEmpty()) {
          H((Uri.Builder)localObject2, "mr_gs", paramString1.zzi(), localSet);
        }
        if (paramString1.zzb() > 0L) {
          H((Uri.Builder)localObject2, "mr_click_ts", String.valueOf(paramString1.zzb()), localSet);
        }
      }
      return new w5(((Uri.Builder)localObject2).build().toString(), l, 1);
    }
    return null;
  }
  
  public final String C(zzgf.zzj paramzzj)
  {
    if (paramzzj == null) {
      return "";
    }
    StringBuilder localStringBuilder = f.l("\nbatch {\n");
    if (paramzzj.zzh()) {
      O(localStringBuilder, 0, "upload_subdomain", paramzzj.zze());
    }
    if (paramzzj.zzg()) {
      O(localStringBuilder, 0, "sgtm_join_id", paramzzj.zzd());
    }
    Iterator localIterator1 = paramzzj.zzf().iterator();
    while (localIterator1.hasNext())
    {
      zzgf.zzk localzzk = (zzgf.zzk)localIterator1.next();
      if (localzzk != null)
      {
        L(localStringBuilder, 1);
        localStringBuilder.append("bundle {\n");
        if (localzzk.zzbs()) {
          O(localStringBuilder, 1, "protocol_version", Integer.valueOf(localzzk.zzf()));
        }
        if ((zzpf.zza()) && (h().x(localzzk.zzab(), h0.H0)) && (localzzk.zzbv())) {
          O(localStringBuilder, 1, "session_stitching_token", localzzk.zzaq());
        }
        O(localStringBuilder, 1, "platform", localzzk.zzao());
        if (localzzk.zzbn()) {
          O(localStringBuilder, 1, "gmp_version", Long.valueOf(localzzk.zzo()));
        }
        if (localzzk.zzcb()) {
          O(localStringBuilder, 1, "uploading_gmp_version", Long.valueOf(localzzk.zzu()));
        }
        if (localzzk.zzbl()) {
          O(localStringBuilder, 1, "dynamite_version", Long.valueOf(localzzk.zzm()));
        }
        if (localzzk.zzbe()) {
          O(localStringBuilder, 1, "config_version", Long.valueOf(localzzk.zzk()));
        }
        O(localStringBuilder, 1, "gmp_app_id", localzzk.i_());
        O(localStringBuilder, 1, "admob_app_id", localzzk.zzaa());
        O(localStringBuilder, 1, "app_id", localzzk.zzab());
        O(localStringBuilder, 1, "app_version", localzzk.zzae());
        if (localzzk.zzba()) {
          O(localStringBuilder, 1, "app_version_major", Integer.valueOf(localzzk.zzb()));
        }
        O(localStringBuilder, 1, "firebase_instance_id", localzzk.zzak());
        if (localzzk.zzbj()) {
          O(localStringBuilder, 1, "dev_cert_hash", Long.valueOf(localzzk.zzl()));
        }
        O(localStringBuilder, 1, "app_store", localzzk.zzad());
        if (localzzk.zzca()) {
          O(localStringBuilder, 1, "upload_timestamp_millis", Long.valueOf(localzzk.zzt()));
        }
        if (localzzk.zzbx()) {
          O(localStringBuilder, 1, "start_timestamp_millis", Long.valueOf(localzzk.zzr()));
        }
        if (localzzk.zzbm()) {
          O(localStringBuilder, 1, "end_timestamp_millis", Long.valueOf(localzzk.zzn()));
        }
        if (localzzk.zzbr()) {
          O(localStringBuilder, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(localzzk.zzq()));
        }
        if (localzzk.zzbq()) {
          O(localStringBuilder, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(localzzk.zzp()));
        }
        O(localStringBuilder, 1, "app_instance_id", localzzk.zzac());
        O(localStringBuilder, 1, "resettable_device_id", localzzk.zzap());
        O(localStringBuilder, 1, "ds_id", localzzk.zzaj());
        if (localzzk.zzbp()) {
          O(localStringBuilder, 1, "limited_ad_tracking", Boolean.valueOf(localzzk.zzax()));
        }
        O(localStringBuilder, 1, "os_version", localzzk.zzan());
        O(localStringBuilder, 1, "device_model", localzzk.zzai());
        O(localStringBuilder, 1, "user_default_language", localzzk.zzar());
        if (localzzk.zzbz()) {
          O(localStringBuilder, 1, "time_zone_offset_minutes", Integer.valueOf(localzzk.zzh()));
        }
        if (localzzk.zzbd()) {
          O(localStringBuilder, 1, "bundle_sequential_index", Integer.valueOf(localzzk.zzc()));
        }
        if (localzzk.zzbi()) {
          O(localStringBuilder, 1, "delivery_index", Integer.valueOf(localzzk.zzd()));
        }
        if (localzzk.zzbu()) {
          O(localStringBuilder, 1, "service_upload", Boolean.valueOf(localzzk.zzay()));
        }
        O(localStringBuilder, 1, "health_monitor", localzzk.zzam());
        if (localzzk.zzbt()) {
          O(localStringBuilder, 1, "retry_counter", Integer.valueOf(localzzk.zzg()));
        }
        if (localzzk.zzbg()) {
          O(localStringBuilder, 1, "consent_signals", localzzk.zzag());
        }
        if (localzzk.zzbo()) {
          O(localStringBuilder, 1, "is_dma_region", Boolean.valueOf(localzzk.zzaw()));
        }
        if (localzzk.zzbh()) {
          O(localStringBuilder, 1, "core_platform_services", localzzk.zzah());
        }
        if (localzzk.zzbf()) {
          O(localStringBuilder, 1, "consent_diagnostics", localzzk.zzaf());
        }
        if (localzzk.zzby()) {
          O(localStringBuilder, 1, "target_os_version", Long.valueOf(localzzk.zzs()));
        }
        if ((zzoy.zza()) && (h().x(localzzk.zzab(), h0.Q0)))
        {
          O(localStringBuilder, 1, "ad_services_version", Integer.valueOf(localzzk.zza()));
          if (localzzk.zzbb())
          {
            paramzzj = localzzk.zzw();
            if (paramzzj != null)
            {
              L(localStringBuilder, 2);
              localStringBuilder.append("attribution_eligibility_status {\n");
              O(localStringBuilder, 2, "eligible", Boolean.valueOf(paramzzj.zzf()));
              O(localStringBuilder, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(paramzzj.zzh()));
              O(localStringBuilder, 2, "pre_r", Boolean.valueOf(paramzzj.zzi()));
              O(localStringBuilder, 2, "r_extensions_too_old", Boolean.valueOf(paramzzj.zzj()));
              O(localStringBuilder, 2, "adservices_extension_too_old", Boolean.valueOf(paramzzj.zze()));
              O(localStringBuilder, 2, "ad_storage_not_allowed", Boolean.valueOf(paramzzj.zzd()));
              O(localStringBuilder, 2, "measurement_manager_disabled", Boolean.valueOf(paramzzj.zzg()));
              L(localStringBuilder, 2);
              localStringBuilder.append("}\n");
            }
          }
        }
        if (localzzk.zzaz())
        {
          paramzzj = localzzk.zzv();
          L(localStringBuilder, 2);
          localStringBuilder.append("ad_campaign_info {\n");
          if (paramzzj.zzn()) {
            O(localStringBuilder, 2, "deep_link_gclid", paramzzj.zzh());
          }
          if (paramzzj.zzm()) {
            O(localStringBuilder, 2, "deep_link_gbraid", paramzzj.zzg());
          }
          if (paramzzj.zzl()) {
            O(localStringBuilder, 2, "deep_link_gad_source", paramzzj.zzf());
          }
          if (paramzzj.zzo()) {
            O(localStringBuilder, 2, "deep_link_session_millis", Long.valueOf(paramzzj.zza()));
          }
          if (paramzzj.zzs()) {
            O(localStringBuilder, 2, "market_referrer_gclid", paramzzj.zzk());
          }
          if (paramzzj.zzr()) {
            O(localStringBuilder, 2, "market_referrer_gbraid", paramzzj.zzj());
          }
          if (paramzzj.zzq()) {
            O(localStringBuilder, 2, "market_referrer_gad_source", paramzzj.zzi());
          }
          if (paramzzj.zzp()) {
            O(localStringBuilder, 2, "market_referrer_click_millis", Long.valueOf(paramzzj.zzb()));
          }
          L(localStringBuilder, 2);
          localStringBuilder.append("}\n");
        }
        if (localzzk.zzbc()) {
          O(localStringBuilder, 1, "batching_timestamp_millis", Long.valueOf(localzzk.zzj()));
        }
        if (localzzk.zzbw())
        {
          paramzzj = localzzk.zzz();
          L(localStringBuilder, 2);
          localStringBuilder.append("sgtm_diagnostics {\n");
          O(localStringBuilder, 2, "upload_type", paramzzj.zzd().name());
          O(localStringBuilder, 2, "client_upload_eligibility", paramzzj.zzb().name());
          O(localStringBuilder, 2, "service_upload_eligibility", paramzzj.zzc().name());
          L(localStringBuilder, 2);
          localStringBuilder.append("}\n");
        }
        paramzzj = localzzk.zzau();
        Object localObject;
        if (paramzzj != null)
        {
          Iterator localIterator2 = paramzzj.iterator();
          while (localIterator2.hasNext())
          {
            zzgf.zzp localzzp = (zzgf.zzp)localIterator2.next();
            if (localzzp != null)
            {
              L(localStringBuilder, 2);
              localStringBuilder.append("user_property {\n");
              boolean bool = localzzp.zzl();
              localObject = null;
              if (bool) {
                paramzzj = Long.valueOf(localzzp.zzd());
              } else {
                paramzzj = null;
              }
              O(localStringBuilder, 2, "set_timestamp_millis", paramzzj);
              O(localStringBuilder, 2, "name", i().g(localzzp.zzg()));
              O(localStringBuilder, 2, "string_value", localzzp.zzh());
              if (localzzp.zzk()) {
                paramzzj = Long.valueOf(localzzp.zzc());
              } else {
                paramzzj = null;
              }
              O(localStringBuilder, 2, "int_value", paramzzj);
              paramzzj = (zzgf.zzj)localObject;
              if (localzzp.zzi()) {
                paramzzj = Double.valueOf(localzzp.zza());
              }
              O(localStringBuilder, 2, "double_value", paramzzj);
              L(localStringBuilder, 2);
              localStringBuilder.append("}\n");
            }
          }
        }
        paramzzj = localzzk.zzas();
        localzzk.zzab();
        if (paramzzj != null)
        {
          localObject = paramzzj.iterator();
          while (((Iterator)localObject).hasNext())
          {
            paramzzj = (zzgf.zzd)((Iterator)localObject).next();
            if (paramzzj != null)
            {
              L(localStringBuilder, 2);
              localStringBuilder.append("audience_membership {\n");
              if (paramzzj.zzg()) {
                O(localStringBuilder, 2, "audience_id", Integer.valueOf(paramzzj.zza()));
              }
              if (paramzzj.zzh()) {
                O(localStringBuilder, 2, "new_audience", Boolean.valueOf(paramzzj.zzf()));
              }
              Q(localStringBuilder, "current_data", paramzzj.zzd());
              if (paramzzj.zzi()) {
                Q(localStringBuilder, "previous_data", paramzzj.zze());
              }
              L(localStringBuilder, 2);
              localStringBuilder.append("}\n");
            }
          }
        }
        paramzzj = localzzk.zzat();
        if (paramzzj != null)
        {
          paramzzj = paramzzj.iterator();
          while (paramzzj.hasNext())
          {
            localObject = (zzgf.zzf)paramzzj.next();
            if (localObject != null)
            {
              L(localStringBuilder, 2);
              localStringBuilder.append("event {\n");
              O(localStringBuilder, 2, "name", i().c(((zzgf.zzf)localObject).zzg()));
              if (((zzgf.zzf)localObject).zzk()) {
                O(localStringBuilder, 2, "timestamp_millis", Long.valueOf(((zzgf.zzf)localObject).zzd()));
              }
              if (((zzgf.zzf)localObject).zzj()) {
                O(localStringBuilder, 2, "previous_timestamp_millis", Long.valueOf(((zzgf.zzf)localObject).zzc()));
              }
              if (((zzgf.zzf)localObject).zzi()) {
                O(localStringBuilder, 2, "count", Integer.valueOf(((zzgf.zzf)localObject).zza()));
              }
              if (((zzgf.zzf)localObject).zzb() != 0) {
                P(localStringBuilder, 2, ((zzgf.zzf)localObject).zzh());
              }
              L(localStringBuilder, 2);
              localStringBuilder.append("}\n");
            }
          }
        }
        L(localStringBuilder, 1);
        localStringBuilder.append("}\n");
      }
    }
    localStringBuilder.append("} // End-of-batch\n");
    return localStringBuilder.toString();
  }
  
  public final List<Long> G(List<Long> paramList, List<Integer> paramList1)
  {
    paramList = new ArrayList(paramList);
    paramList1 = paramList1.iterator();
    while (paramList1.hasNext())
    {
      Integer localInteger = (Integer)paramList1.next();
      if (localInteger.intValue() < 0)
      {
        zzjr.c("Ignoring negative bit index to be cleared", localInteger);
      }
      else
      {
        i = localInteger.intValue() / 64;
        if (i >= paramList.size()) {
          zzjr.d("Ignoring bit index greater than bitSet size", localInteger, Integer.valueOf(paramList.size()));
        } else {
          paramList.set(i, Long.valueOf(((Long)paramList.get(i)).longValue() & 1L << localInteger.intValue() % 64));
        }
      }
    }
    int j = paramList.size();
    int k;
    for (int i = paramList.size() - 1; (i >= 0) && (((Long)paramList.get(i)).longValue() == 0L); i = k)
    {
      k = i - 1;
      j = i;
    }
    return paramList.subList(0, j);
  }
  
  public final void K(zzgf.zzh.zza paramzza, Object paramObject)
  {
    paramzza.zze().zzc().zzb().zzd();
    if ((paramObject instanceof String))
    {
      paramzza.zzb((String)paramObject);
      return;
    }
    if ((paramObject instanceof Long))
    {
      paramzza.zza(((Long)paramObject).longValue());
      return;
    }
    if ((paramObject instanceof Double))
    {
      paramzza.zza(((Double)paramObject).doubleValue());
      return;
    }
    if ((paramObject instanceof Bundle[]))
    {
      Bundle[] arrayOfBundle = (Bundle[])paramObject;
      paramObject = new ArrayList();
      int i = arrayOfBundle.length;
      for (int j = 0; j < i; j++)
      {
        Bundle localBundle = arrayOfBundle[j];
        if (localBundle != null)
        {
          zzgf.zzh.zza localzza1 = zzgf.zzh.zze();
          Iterator localIterator = localBundle.keySet().iterator();
          while (localIterator.hasNext())
          {
            Object localObject = (String)localIterator.next();
            zzgf.zzh.zza localzza2 = zzgf.zzh.zze().zza((String)localObject);
            localObject = localBundle.get((String)localObject);
            if ((localObject instanceof Long))
            {
              localzza2.zza(((Long)localObject).longValue());
            }
            else if ((localObject instanceof String))
            {
              localzza2.zzb((String)localObject);
            }
            else
            {
              if (!(localObject instanceof Double)) {
                continue;
              }
              localzza2.zza(((Double)localObject).doubleValue());
            }
            localzza1.zza(localzza2);
          }
          if (localzza1.zza() > 0) {
            ((ArrayList)paramObject).add((zzgf.zzh)localzza1.zzaj());
          }
        }
      }
      paramzza.zza((Iterable)paramObject);
      return;
    }
    zzjo.c("Ignoring invalid (type) event param value", paramObject);
  }
  
  public final void M(StringBuilder paramStringBuilder, int paramInt, zzfw.zzc paramzzc)
  {
    if (paramzzc == null) {
      return;
    }
    L(paramStringBuilder, paramInt);
    paramStringBuilder.append("filter {\n");
    if (paramzzc.zzg()) {
      O(paramStringBuilder, paramInt, "complement", Boolean.valueOf(paramzzc.zzf()));
    }
    if (paramzzc.zzi()) {
      O(paramStringBuilder, paramInt, "param_name", i().f(paramzzc.zze()));
    }
    if (paramzzc.zzj())
    {
      int i = paramInt + 1;
      Object localObject = paramzzc.zzd();
      if (localObject != null)
      {
        L(paramStringBuilder, i);
        paramStringBuilder.append("string_filter");
        paramStringBuilder.append(" {\n");
        if (((zzfw.zzf)localObject).zzj()) {
          O(paramStringBuilder, i, "match_type", ((zzfw.zzf)localObject).zzb().name());
        }
        if (((zzfw.zzf)localObject).zzi()) {
          O(paramStringBuilder, i, "expression", ((zzfw.zzf)localObject).zze());
        }
        if (((zzfw.zzf)localObject).zzh()) {
          O(paramStringBuilder, i, "case_sensitive", Boolean.valueOf(((zzfw.zzf)localObject).zzg()));
        }
        if (((zzfw.zzf)localObject).zza() > 0)
        {
          L(paramStringBuilder, i + 1);
          paramStringBuilder.append("expression_list {\n");
          Iterator localIterator = ((zzfw.zzf)localObject).zzf().iterator();
          while (localIterator.hasNext())
          {
            localObject = (String)localIterator.next();
            L(paramStringBuilder, i + 2);
            paramStringBuilder.append((String)localObject);
            paramStringBuilder.append("\n");
          }
          paramStringBuilder.append("}\n");
        }
        L(paramStringBuilder, i);
        paramStringBuilder.append("}\n");
      }
    }
    if (paramzzc.zzh()) {
      N(paramStringBuilder, paramInt + 1, "number_filter", paramzzc.zzc());
    }
    L(paramStringBuilder, paramInt);
    paramStringBuilder.append("}\n");
  }
  
  public final void P(StringBuilder paramStringBuilder, int paramInt, List<zzgf.zzh> paramList)
  {
    if (paramList == null) {
      return;
    }
    paramInt++;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      zzgf.zzh localzzh = (zzgf.zzh)localIterator.next();
      if (localzzh != null)
      {
        L(paramStringBuilder, paramInt);
        paramStringBuilder.append("param {\n");
        boolean bool = localzzh.zzm();
        Object localObject = null;
        if (bool) {
          paramList = i().f(localzzh.zzg());
        } else {
          paramList = null;
        }
        O(paramStringBuilder, paramInt, "name", paramList);
        if (localzzh.zzn()) {
          paramList = localzzh.zzh();
        } else {
          paramList = null;
        }
        O(paramStringBuilder, paramInt, "string_value", paramList);
        if (localzzh.zzl()) {
          paramList = Long.valueOf(localzzh.zzd());
        } else {
          paramList = null;
        }
        O(paramStringBuilder, paramInt, "int_value", paramList);
        paramList = (List<zzgf.zzh>)localObject;
        if (localzzh.zzj()) {
          paramList = Double.valueOf(localzzh.zza());
        }
        O(paramStringBuilder, paramInt, "double_value", paramList);
        if (localzzh.zzc() > 0) {
          P(paramStringBuilder, paramInt, localzzh.zzi());
        }
        L(paramStringBuilder, paramInt);
        paramStringBuilder.append("}\n");
      }
    }
  }
  
  public final boolean S(long paramLong1, long paramLong2)
  {
    if ((paramLong1 != 0L) && (paramLong2 > 0L))
    {
      ((z)zzb()).getClass();
      if (Math.abs(System.currentTimeMillis() - paramLong1) <= paramLong2) {
        return false;
      }
    }
    return true;
  }
  
  public final byte[] V(byte[] paramArrayOfByte)
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      GZIPOutputStream localGZIPOutputStream = new java/util/zip/GZIPOutputStream;
      localGZIPOutputStream.<init>(localByteArrayOutputStream);
      localGZIPOutputStream.write(paramArrayOfByte);
      localGZIPOutputStream.close();
      localByteArrayOutputStream.close();
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      zzjo.c("Failed to gzip content", paramArrayOfByte);
      throw paramArrayOfByte;
    }
  }
  
  public final byte[] X(byte[] paramArrayOfByte)
  {
    try
    {
      ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
      localByteArrayInputStream.<init>(paramArrayOfByte);
      GZIPInputStream localGZIPInputStream = new java/util/zip/GZIPInputStream;
      localGZIPInputStream.<init>(localByteArrayInputStream);
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      paramArrayOfByte = new byte['Ѐ'];
      for (;;)
      {
        int i = localGZIPInputStream.read(paramArrayOfByte);
        if (i <= 0) {
          break;
        }
        localByteArrayOutputStream.write(paramArrayOfByte, 0, i);
      }
      localGZIPInputStream.close();
      localByteArrayInputStream.close();
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      zzjo.c("Failed to ungzip content", paramArrayOfByte);
      throw paramArrayOfByte;
    }
  }
  
  public final ArrayList Y()
  {
    Object localObject1 = c.t.a;
    Object localObject2 = h0.a;
    localObject2 = zzhi.zza(((Context)localObject1).getContentResolver(), zzhu.zza("com.google.android.gms.measurement"), new g0());
    if (localObject2 == null) {
      localObject2 = Collections.emptyMap();
    } else {
      localObject2 = ((zzhi)localObject2).zza();
    }
    if ((localObject2 != null) && (!((Map)localObject2).isEmpty()))
    {
      localObject1 = new ArrayList();
      int i = ((Integer)h0.a0.a(null)).intValue();
      localObject2 = ((Map)localObject2).entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
        if (((String)localEntry.getKey()).startsWith("measurement.id.")) {
          try
          {
            int j = Integer.parseInt((String)localEntry.getValue());
            if (j != 0)
            {
              ((ArrayList)localObject1).add(Integer.valueOf(j));
              if (((ArrayList)localObject1).size() >= i) {
                zzjr.c("Too many experiment IDs. Number of IDs", Integer.valueOf(((ArrayList)localObject1).size()));
              }
            }
          }
          catch (NumberFormatException localNumberFormatException)
          {
            zzjr.c("Experiment ID NumberFormatException", localNumberFormatException);
          }
        }
      }
      if (((ArrayList)localObject1).isEmpty()) {
        return null;
      }
      return (ArrayList)localObject1;
    }
    return null;
  }
  
  public final boolean r()
  {
    return false;
  }
  
  public final long t(byte[] paramArrayOfByte)
  {
    j.i(paramArrayOfByte);
    k().l();
    MessageDigest localMessageDigest = r6.B0();
    if (localMessageDigest == null)
    {
      zzjo.b("Failed to get MD5");
      return 0L;
    }
    return r6.t(localMessageDigest.digest(paramArrayOfByte));
  }
  
  /* Error */
  public final <T extends Parcelable> T w(byte[] paramArrayOfByte, android.os.Parcelable.Creator<T> paramCreator)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: invokestatic 1510	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore_3
    //   10: aload_3
    //   11: aload_1
    //   12: iconst_0
    //   13: aload_1
    //   14: arraylength
    //   15: invokevirtual 1513	android/os/Parcel:unmarshall	([BII)V
    //   18: aload_3
    //   19: iconst_0
    //   20: invokevirtual 1516	android/os/Parcel:setDataPosition	(I)V
    //   23: aload_2
    //   24: aload_3
    //   25: invokeinterface 1522 2 0
    //   30: checkcast 467	android/os/Parcelable
    //   33: astore_1
    //   34: aload_3
    //   35: invokevirtual 1525	android/os/Parcel:recycle	()V
    //   38: aload_1
    //   39: areturn
    //   40: astore_1
    //   41: goto +23 -> 64
    //   44: astore_1
    //   45: aload_0
    //   46: invokevirtual 1229	d2/q:zzj	()Le7/a1;
    //   49: getfield 1279	e7/a1:o	Le7/b1;
    //   52: ldc_w 1527
    //   55: invokevirtual 1493	e7/b1:b	(Ljava/lang/String;)V
    //   58: aload_3
    //   59: invokevirtual 1525	android/os/Parcel:recycle	()V
    //   62: aconst_null
    //   63: areturn
    //   64: aload_3
    //   65: invokevirtual 1525	android/os/Parcel:recycle	()V
    //   68: aload_1
    //   69: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	o6
    //   0	70	1	paramArrayOfByte	byte[]
    //   0	70	2	paramCreator	android.os.Parcelable.Creator<T>
    //   9	56	3	localParcel	android.os.Parcel
    // Exception table:
    //   from	to	target	type
    //   10	34	40	finally
    //   45	58	40	finally
    //   10	34	44	n6/b$a
  }
  
  public final zzgf.zzf x(y paramy)
  {
    zzgf.zzf.zza localzza = zzgf.zzf.zze().zza(e);
    Object localObject1 = f;
    localObject1.getClass();
    localObject1 = a.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (String)((Iterator)localObject1).next();
      zzgf.zzh.zza localzza1 = zzgf.zzh.zze().zza((String)localObject2);
      localObject2 = f.a.get((String)localObject2);
      j.i(localObject2);
      K(localzza1, localObject2);
      localzza.zza(localzza1);
    }
    if ((!TextUtils.isEmpty(c)) && (f.a.get("_o") == null)) {
      localzza.zza((zzgf.zzh)zzgf.zzh.zze().zza("_o").zzb(c).zzaj());
    }
    return (zzgf.zzf)localzza.zzaj();
  }
}

/* Location:
 * Qualified Name:     e7.o6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package R2;

import A2.n;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.M3;
import com.google.android.gms.internal.measurement.V1;
import com.google.android.gms.internal.measurement.W1;
import com.google.android.gms.internal.measurement.Y1.a;
import com.google.android.gms.internal.measurement.Y3.b;
import com.google.android.gms.internal.measurement.a2.a;
import com.google.android.gms.internal.measurement.c2;
import com.google.android.gms.internal.measurement.d2;
import com.google.android.gms.internal.measurement.d2.a;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.measurement.g2;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.h2.a;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.internal.measurement.x1;
import com.google.android.gms.internal.measurement.y1;
import com.google.android.gms.internal.measurement.z1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
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
import java.util.Set;
import java.util.zip.GZIPOutputStream;

public final class N5
  extends C5
{
  public N5(D5 paramD5)
  {
    super(paramD5);
  }
  
  public static com.google.android.gms.internal.measurement.a2 G(com.google.android.gms.internal.measurement.Y1 paramY1, String paramString)
  {
    Iterator localIterator = paramY1.c0().iterator();
    while (localIterator.hasNext())
    {
      paramY1 = (com.google.android.gms.internal.measurement.a2)localIterator.next();
      if (paramY1.c0().equals(paramString)) {
        return paramY1;
      }
    }
    return null;
  }
  
  public static L4 H(L4 paramL4, byte[] paramArrayOfByte)
  {
    M3 localM3 = M3.a();
    if (localM3 != null) {
      return paramL4.r(paramArrayOfByte, localM3);
    }
    return paramL4.m(paramArrayOfByte);
  }
  
  public static String L(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
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
  
  public static List M(BitSet paramBitSet)
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
  
  public static void P(Uri.Builder paramBuilder, String paramString1, String paramString2, Set paramSet)
  {
    if ((!paramSet.contains(paramString1)) && (!TextUtils.isEmpty(paramString2))) {
      paramBuilder.appendQueryParameter(paramString1, paramString2);
    }
  }
  
  public static void Q(Uri.Builder paramBuilder, String[] paramArrayOfString, Bundle paramBundle, Set paramSet)
  {
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      Object localObject = paramArrayOfString[i].split(",");
      String str = localObject[0];
      localObject = localObject[(localObject.length - 1)];
      str = paramBundle.getString(str);
      if (str != null) {
        P(paramBuilder, (String)localObject, str, paramSet);
      }
    }
  }
  
  public static void R(Y1.a parama, String paramString, Object paramObject)
  {
    List localList = parama.L();
    for (int i = 0; i < localList.size(); i++) {
      if (paramString.equals(((com.google.android.gms.internal.measurement.a2)localList.get(i)).c0())) {
        break label52;
      }
    }
    i = -1;
    label52:
    paramString = com.google.android.gms.internal.measurement.a2.Z().B(paramString);
    if ((paramObject instanceof Long)) {
      paramString.y(((Long)paramObject).longValue());
    } else if ((paramObject instanceof String)) {
      paramString.D((String)paramObject);
    } else if ((paramObject instanceof Double)) {
      paramString.x(((Double)paramObject).doubleValue());
    }
    if (i >= 0)
    {
      parama.y(i, paramString);
      return;
    }
    parama.B(paramString);
  }
  
  public static void V(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      paramStringBuilder.append("  ");
    }
  }
  
  public static void X(StringBuilder paramStringBuilder, int paramInt, String paramString, z1 paramz1)
  {
    if (paramz1 == null) {
      return;
    }
    V(paramStringBuilder, paramInt);
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" {\n");
    if (paramz1.N()) {
      Z(paramStringBuilder, paramInt, "comparison_type", paramz1.G().name());
    }
    if (paramz1.P()) {
      Z(paramStringBuilder, paramInt, "match_as_float", Boolean.valueOf(paramz1.M()));
    }
    if (paramz1.O()) {
      Z(paramStringBuilder, paramInt, "comparison_value", paramz1.J());
    }
    if (paramz1.R()) {
      Z(paramStringBuilder, paramInt, "min_comparison_value", paramz1.L());
    }
    if (paramz1.Q()) {
      Z(paramStringBuilder, paramInt, "max_comparison_value", paramz1.K());
    }
    V(paramStringBuilder, paramInt);
    paramStringBuilder.append("}\n");
  }
  
  public static void Y(StringBuilder paramStringBuilder, int paramInt, String paramString, f2 paramf2)
  {
    if (paramf2 == null) {
      return;
    }
    V(paramStringBuilder, 3);
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" {\n");
    Object localObject;
    if (paramf2.J() != 0)
    {
      V(paramStringBuilder, 4);
      paramStringBuilder.append("results: ");
      paramString = paramf2.Z().iterator();
      for (paramInt = 0; paramString.hasNext(); paramInt++)
      {
        localObject = (Long)paramString.next();
        if (paramInt != 0) {
          paramStringBuilder.append(", ");
        }
        paramStringBuilder.append(localObject);
      }
      paramStringBuilder.append('\n');
    }
    if (paramf2.R() != 0)
    {
      V(paramStringBuilder, 4);
      paramStringBuilder.append("status: ");
      paramString = paramf2.b0().iterator();
      for (paramInt = 0; paramString.hasNext(); paramInt++)
      {
        localObject = (Long)paramString.next();
        if (paramInt != 0) {
          paramStringBuilder.append(", ");
        }
        paramStringBuilder.append(localObject);
      }
      paramStringBuilder.append('\n');
    }
    if (paramf2.k() != 0)
    {
      V(paramStringBuilder, 4);
      paramStringBuilder.append("dynamic_filter_timestamps: {");
      localObject = paramf2.Y().iterator();
      for (paramInt = 0; ((Iterator)localObject).hasNext(); paramInt++)
      {
        com.google.android.gms.internal.measurement.X1 localX1 = (com.google.android.gms.internal.measurement.X1)((Iterator)localObject).next();
        if (paramInt != 0) {
          paramStringBuilder.append(", ");
        }
        if (localX1.O()) {
          paramString = Integer.valueOf(localX1.k());
        } else {
          paramString = null;
        }
        paramStringBuilder.append(paramString);
        paramStringBuilder.append(":");
        if (localX1.N()) {
          paramString = Long.valueOf(localX1.K());
        } else {
          paramString = null;
        }
        paramStringBuilder.append(paramString);
      }
      paramStringBuilder.append("}\n");
    }
    if (paramf2.N() != 0)
    {
      V(paramStringBuilder, 4);
      paramStringBuilder.append("sequence_filter_timestamps: {");
      paramf2 = paramf2.a0().iterator();
      for (paramInt = 0; paramf2.hasNext(); paramInt++)
      {
        localObject = (g2)paramf2.next();
        if (paramInt != 0) {
          paramStringBuilder.append(", ");
        }
        if (((g2)localObject).P()) {
          paramString = Integer.valueOf(((g2)localObject).K());
        } else {
          paramString = null;
        }
        paramStringBuilder.append(paramString);
        paramStringBuilder.append(": [");
        paramString = ((g2)localObject).O().iterator();
        for (int i = 0; paramString.hasNext(); i++)
        {
          long l = ((Long)paramString.next()).longValue();
          if (i != 0) {
            paramStringBuilder.append(", ");
          }
          paramStringBuilder.append(l);
        }
        paramStringBuilder.append("]");
      }
      paramStringBuilder.append("}\n");
    }
    V(paramStringBuilder, 3);
    paramStringBuilder.append("}\n");
  }
  
  public static void Z(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    if (paramObject == null) {
      return;
    }
    V(paramStringBuilder, paramInt + 1);
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject);
    paramStringBuilder.append('\n');
  }
  
  public static boolean c0(I paramI, W5 paramW5)
  {
    n.i(paramI);
    n.i(paramW5);
    return (!TextUtils.isEmpty(p)) || (!TextUtils.isEmpty(E));
  }
  
  public static boolean d0(List paramList, int paramInt)
  {
    return (paramInt < paramList.size() << 6) && ((1L << paramInt % 64 & ((Long)paramList.get(paramInt / 64)).longValue()) != 0L);
  }
  
  public static Object e0(com.google.android.gms.internal.measurement.Y1 paramY1, String paramString)
  {
    paramY1 = G(paramY1, paramString);
    if (paramY1 != null)
    {
      if (paramY1.j0()) {
        return paramY1.d0();
      }
      if (paramY1.h0()) {
        return Long.valueOf(paramY1.X());
      }
      if (paramY1.f0()) {
        return Double.valueOf(paramY1.G());
      }
      if (paramY1.V() > 0)
      {
        paramString = paramY1.e0();
        paramY1 = new ArrayList();
        paramString = paramString.iterator();
        while (paramString.hasNext())
        {
          com.google.android.gms.internal.measurement.a2 locala2 = (com.google.android.gms.internal.measurement.a2)paramString.next();
          if (locala2 != null)
          {
            Bundle localBundle = new Bundle();
            Iterator localIterator = locala2.e0().iterator();
            while (localIterator.hasNext())
            {
              locala2 = (com.google.android.gms.internal.measurement.a2)localIterator.next();
              if (locala2.j0()) {
                localBundle.putString(locala2.c0(), locala2.d0());
              } else if (locala2.h0()) {
                localBundle.putLong(locala2.c0(), locala2.X());
              } else if (locala2.f0()) {
                localBundle.putDouble(locala2.c0(), locala2.G());
              }
            }
            if (!localBundle.isEmpty()) {
              paramY1.add(localBundle);
            }
          }
        }
        return (Bundle[])paramY1.toArray(new Bundle[paramY1.size()]);
      }
    }
    return null;
  }
  
  public static boolean f0(String paramString)
  {
    return (paramString != null) && (paramString.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)")) && (paramString.length() <= 310);
  }
  
  public static int y(d2.a parama, String paramString)
  {
    if (parama == null) {
      return -1;
    }
    for (int i = 0; i < parama.K(); i++) {
      if (paramString.equals(parama.A0(i).Z())) {
        return i;
      }
    }
    return -1;
  }
  
  public final long A(byte[] paramArrayOfByte)
  {
    n.i(paramArrayOfByte);
    k().n();
    MessageDigest localMessageDigest = S5.T0();
    if (localMessageDigest == null)
    {
      j().G().a("Failed to get MD5");
      return 0L;
    }
    return S5.B(localMessageDigest.digest(paramArrayOfByte));
  }
  
  public final I B(com.google.android.gms.internal.measurement.e parame)
  {
    Bundle localBundle = D(parame.g(), true);
    if (localBundle.containsKey("_o"))
    {
      localObject = localBundle.get("_o");
      if (localObject == null) {}
    }
    for (Object localObject = localObject.toString();; localObject = "app") {
      break;
    }
    String str1 = r3.b(parame.e());
    String str2 = str1;
    if (str1 == null) {
      str2 = parame.e();
    }
    return new I(str2, new D(localBundle), (String)localObject, parame.a());
  }
  
  public final v5 C(String paramString1, d2 paramd2, Y1.a parama, String paramString2)
  {
    if ((g7.a()) && (f().B(paramString1, K.L0)))
    {
      long l = b().a();
      Object localObject1 = f().z(paramString1, K.e0).split(",");
      Object localObject2 = new HashSet(localObject1.length);
      int i = localObject1.length;
      int j = 0;
      while (j < i)
      {
        localObject3 = localObject1[j];
        localObject3.getClass();
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
      localObject1 = t();
      Object localObject4 = ((z5)localObject1).r().Q(paramString1);
      Uri.Builder localBuilder = new Uri.Builder();
      localBuilder.scheme(((m3)localObject1).f().z(paramString1, K.Y));
      if (!TextUtils.isEmpty((CharSequence)localObject4))
      {
        localObject2 = ((m3)localObject1).f().z(paramString1, K.Z);
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append((String)localObject4);
        ((StringBuilder)localObject3).append(".");
        ((StringBuilder)localObject3).append((String)localObject2);
      }
      for (Object localObject3 = ((StringBuilder)localObject3).toString();; localObject3 = ((m3)localObject1).f().z(paramString1, K.Z))
      {
        localBuilder.authority((String)localObject3);
        break;
      }
      localBuilder.path(((m3)localObject1).f().z(paramString1, K.a0));
      P(localBuilder, "gmp_app_id", paramd2.k0(), localSet);
      P(localBuilder, "gmp_version", "82001", localSet);
      localObject2 = paramd2.E3();
      localObject3 = f();
      localObject4 = K.O0;
      boolean bool = ((g)localObject3).B(paramString1, (P1)localObject4);
      localObject1 = "";
      localObject3 = localObject2;
      if (bool)
      {
        localObject3 = localObject2;
        if (r().a0(paramString1)) {
          localObject3 = "";
        }
      }
      P(localBuilder, "app_instance_id", (String)localObject3, localSet);
      P(localBuilder, "rdid", paramd2.o0(), localSet);
      P(localBuilder, "bundle_id", paramd2.D3(), localSet);
      localObject3 = parama.K();
      localObject2 = r3.a((String)localObject3);
      if (!TextUtils.isEmpty((CharSequence)localObject2)) {
        localObject3 = localObject2;
      }
      P(localBuilder, "app_event_name", (String)localObject3, localSet);
      P(localBuilder, "app_version", String.valueOf(paramd2.D0()), localSet);
      localObject2 = paramd2.m0();
      localObject3 = localObject2;
      if (f().B(paramString1, (P1)localObject4))
      {
        localObject3 = localObject2;
        if (r().e0(paramString1))
        {
          localObject3 = localObject1;
          if (f().B(paramString1, K.B0))
          {
            localObject3 = localObject2;
            if (!TextUtils.isEmpty((CharSequence)localObject2))
            {
              j = ((String)localObject2).indexOf(".");
              localObject3 = localObject2;
              if (j != -1) {
                localObject3 = ((String)localObject2).substring(0, j);
              }
            }
          }
        }
      }
      P(localBuilder, "os_version", (String)localObject3, localSet);
      P(localBuilder, "timestamp", String.valueOf(parama.I()), localSet);
      bool = paramd2.w0();
      localObject3 = "1";
      if (bool) {
        P(localBuilder, "lat", "1", localSet);
      }
      P(localBuilder, "privacy_sandbox_version", String.valueOf(paramd2.k()), localSet);
      P(localBuilder, "trigger_uri_source", "1", localSet);
      P(localBuilder, "trigger_uri_timestamp", String.valueOf(l), localSet);
      if (paramString2 != null) {
        P(localBuilder, "request_uuid", paramString2, localSet);
      }
      parama = parama.L();
      paramString2 = new Bundle();
      localObject1 = parama.iterator();
      if (((Iterator)localObject1).hasNext())
      {
        parama = (com.google.android.gms.internal.measurement.a2)((Iterator)localObject1).next();
        localObject2 = parama.c0();
        if (parama.f0()) {
          parama = String.valueOf(parama.G());
        }
        for (;;)
        {
          paramString2.putString((String)localObject2, parama);
          break;
          if (parama.g0())
          {
            parama = String.valueOf(parama.R());
          }
          else if (parama.j0())
          {
            parama = parama.d0();
          }
          else
          {
            if (!parama.h0()) {
              break;
            }
            parama = String.valueOf(parama.X());
          }
        }
      }
      Q(localBuilder, f().z(paramString1, K.d0).split("\\|"), paramString2, localSet);
      parama = paramd2.t0();
      paramString2 = new Bundle();
      localObject1 = parama.iterator();
      if (((Iterator)localObject1).hasNext())
      {
        parama = (h2)((Iterator)localObject1).next();
        localObject2 = parama.Z();
        if (parama.b0()) {
          parama = String.valueOf(parama.G());
        }
        for (;;)
        {
          paramString2.putString((String)localObject2, parama);
          break;
          if (parama.c0())
          {
            parama = String.valueOf(parama.O());
          }
          else if (parama.f0())
          {
            parama = parama.a0();
          }
          else
          {
            if (!parama.d0()) {
              break;
            }
            parama = String.valueOf(parama.U());
          }
        }
      }
      Q(localBuilder, f().z(paramString1, K.c0).split("\\|"), paramString2, localSet);
      if ((n6.a()) && (f().s(K.T0)))
      {
        if (paramd2.v0()) {
          paramString1 = (String)localObject3;
        } else {
          paramString1 = "0";
        }
        P(localBuilder, "dma", paramString1, localSet);
        if (!paramd2.g0().isEmpty()) {
          P(localBuilder, "dma_cps", paramd2.g0(), localSet);
        }
      }
      return new v5(localBuilder.build().toString(), l, 1);
    }
    return null;
  }
  
  public final Bundle D(Map paramMap, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramMap.keySet().iterator();
    if (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramMap.get(str);
      if (localObject == null) {}
      for (localObject = null;; localObject = localObject.toString())
      {
        localBundle.putString(str, (String)localObject);
        break;
        if ((localObject instanceof Long))
        {
          localBundle.putLong(str, ((Long)localObject).longValue());
          break;
        }
        if ((localObject instanceof Double))
        {
          localBundle.putDouble(str, ((Double)localObject).doubleValue());
          break;
        }
        if ((localObject instanceof ArrayList))
        {
          if (!paramBoolean) {
            break;
          }
          ArrayList localArrayList1 = (ArrayList)localObject;
          ArrayList localArrayList2 = new ArrayList();
          int i = localArrayList1.size();
          int j = 0;
          while (j < i)
          {
            localObject = localArrayList1.get(j);
            j++;
            localArrayList2.add(D((Map)localObject, false));
          }
          localBundle.putParcelableArray(str, (Parcelable[])localArrayList2.toArray(new Parcelable[0]));
          break;
        }
      }
    }
    return localBundle;
  }
  
  /* Error */
  public final Parcelable E(byte[] paramArrayOfByte, android.os.Parcelable.Creator paramCreator)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: invokestatic 768	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore_3
    //   10: aload_3
    //   11: aload_1
    //   12: iconst_0
    //   13: aload_1
    //   14: arraylength
    //   15: invokevirtual 772	android/os/Parcel:unmarshall	([BII)V
    //   18: aload_3
    //   19: iconst_0
    //   20: invokevirtual 775	android/os/Parcel:setDataPosition	(I)V
    //   23: aload_2
    //   24: aload_3
    //   25: invokeinterface 781 2 0
    //   30: checkcast 752	android/os/Parcelable
    //   33: astore_1
    //   34: aload_3
    //   35: invokevirtual 784	android/os/Parcel:recycle	()V
    //   38: aload_1
    //   39: areturn
    //   40: astore_1
    //   41: goto +23 -> 64
    //   44: astore_1
    //   45: aload_0
    //   46: invokevirtual 431	R2/m3:j	()LR2/Y1;
    //   49: invokevirtual 436	R2/Y1:G	()LR2/a2;
    //   52: ldc_w 786
    //   55: invokevirtual 443	R2/a2:a	(Ljava/lang/String;)V
    //   58: aload_3
    //   59: invokevirtual 784	android/os/Parcel:recycle	()V
    //   62: aconst_null
    //   63: areturn
    //   64: aload_3
    //   65: invokevirtual 784	android/os/Parcel:recycle	()V
    //   68: aload_1
    //   69: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	N5
    //   0	70	1	paramArrayOfByte	byte[]
    //   0	70	2	paramCreator	android.os.Parcelable.Creator
    //   9	56	3	localParcel	android.os.Parcel
    // Exception table:
    //   from	to	target	type
    //   10	34	40	finally
    //   45	58	40	finally
    //   10	34	44	B2/b$a
  }
  
  public final com.google.android.gms.internal.measurement.Y1 F(A paramA)
  {
    Y1.a locala = com.google.android.gms.internal.measurement.Y1.Z().A(e);
    Iterator localIterator = f.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      a2.a locala1 = com.google.android.gms.internal.measurement.a2.Z().B((String)localObject);
      localObject = f.k((String)localObject);
      n.i(localObject);
      S(locala1, localObject);
      locala.B(locala1);
    }
    return (com.google.android.gms.internal.measurement.Y1)locala.p();
  }
  
  public final String I(x1 paramx1)
  {
    if (paramx1 == null) {
      return "null";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\nevent_filter {\n");
    if (paramx1.V()) {
      Z(localStringBuilder, 0, "filter_id", Integer.valueOf(paramx1.L()));
    }
    Z(localStringBuilder, 0, "event_name", h().c(paramx1.P()));
    String str = L(paramx1.R(), paramx1.S(), paramx1.T());
    if (!str.isEmpty()) {
      Z(localStringBuilder, 0, "filter_type", str);
    }
    if (paramx1.U()) {
      X(localStringBuilder, 1, "event_count_filter", paramx1.O());
    }
    if (paramx1.k() > 0)
    {
      localStringBuilder.append("  filters {\n");
      paramx1 = paramx1.Q().iterator();
      while (paramx1.hasNext()) {
        W(localStringBuilder, 2, (y1)paramx1.next());
      }
    }
    V(localStringBuilder, 1);
    localStringBuilder.append("}\n}\n");
    return localStringBuilder.toString();
  }
  
  public final String J(A1 paramA1)
  {
    if (paramA1 == null) {
      return "null";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\nproperty_filter {\n");
    if (paramA1.P()) {
      Z(localStringBuilder, 0, "filter_id", Integer.valueOf(paramA1.k()));
    }
    Z(localStringBuilder, 0, "property_name", h().g(paramA1.L()));
    String str = L(paramA1.M(), paramA1.N(), paramA1.O());
    if (!str.isEmpty()) {
      Z(localStringBuilder, 0, "filter_type", str);
    }
    W(localStringBuilder, 1, paramA1.I());
    localStringBuilder.append("}\n");
    return localStringBuilder.toString();
  }
  
  public final String K(c2 paramc2)
  {
    if (paramc2 == null) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\nbatch {\n");
    Iterator localIterator1 = paramc2.L().iterator();
    while (localIterator1.hasNext())
    {
      d2 locald2 = (d2)localIterator1.next();
      if (locald2 != null)
      {
        V(localStringBuilder, 1);
        localStringBuilder.append("bundle {\n");
        if (locald2.Z0()) {
          Z(localStringBuilder, 1, "protocol_version", Integer.valueOf(locald2.U1()));
        }
        if ((s7.a()) && (f().B(locald2.D3(), K.y0)) && (locald2.c1())) {
          Z(localStringBuilder, 1, "session_stitching_token", locald2.p0());
        }
        Z(localStringBuilder, 1, "platform", locald2.n0());
        if (locald2.U0()) {
          Z(localStringBuilder, 1, "gmp_version", Long.valueOf(locald2.d3()));
        }
        if (locald2.h1()) {
          Z(localStringBuilder, 1, "uploading_gmp_version", Long.valueOf(locald2.w3()));
        }
        if (locald2.S0()) {
          Z(localStringBuilder, 1, "dynamite_version", Long.valueOf(locald2.Q2()));
        }
        if (locald2.B0()) {
          Z(localStringBuilder, 1, "config_version", Long.valueOf(locald2.C2()));
        }
        Z(localStringBuilder, 1, "gmp_app_id", locald2.k0());
        Z(localStringBuilder, 1, "admob_app_id", locald2.C3());
        Z(localStringBuilder, 1, "app_id", locald2.D3());
        Z(localStringBuilder, 1, "app_version", locald2.d0());
        if (locald2.y0()) {
          Z(localStringBuilder, 1, "app_version_major", Integer.valueOf(locald2.D0()));
        }
        Z(localStringBuilder, 1, "firebase_instance_id", locald2.j0());
        if (locald2.R0()) {
          Z(localStringBuilder, 1, "dev_cert_hash", Long.valueOf(locald2.J2()));
        }
        Z(localStringBuilder, 1, "app_store", locald2.F3());
        if (locald2.g1()) {
          Z(localStringBuilder, 1, "upload_timestamp_millis", Long.valueOf(locald2.t3()));
        }
        if (locald2.d1()) {
          Z(localStringBuilder, 1, "start_timestamp_millis", Long.valueOf(locald2.n3()));
        }
        if (locald2.T0()) {
          Z(localStringBuilder, 1, "end_timestamp_millis", Long.valueOf(locald2.X2()));
        }
        if (locald2.Y0()) {
          Z(localStringBuilder, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(locald2.k3()));
        }
        if (locald2.X0()) {
          Z(localStringBuilder, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(locald2.h3()));
        }
        Z(localStringBuilder, 1, "app_instance_id", locald2.E3());
        Z(localStringBuilder, 1, "resettable_device_id", locald2.o0());
        Z(localStringBuilder, 1, "ds_id", locald2.i0());
        if (locald2.W0()) {
          Z(localStringBuilder, 1, "limited_ad_tracking", Boolean.valueOf(locald2.w0()));
        }
        Z(localStringBuilder, 1, "os_version", locald2.m0());
        Z(localStringBuilder, 1, "device_model", locald2.h0());
        Z(localStringBuilder, 1, "user_default_language", locald2.q0());
        if (locald2.f1()) {
          Z(localStringBuilder, 1, "time_zone_offset_minutes", Integer.valueOf(locald2.m2()));
        }
        if (locald2.A0()) {
          Z(localStringBuilder, 1, "bundle_sequential_index", Integer.valueOf(locald2.i1()));
        }
        if (locald2.b1()) {
          Z(localStringBuilder, 1, "service_upload", Boolean.valueOf(locald2.x0()));
        }
        Z(localStringBuilder, 1, "health_monitor", locald2.l0());
        if (locald2.a1()) {
          Z(localStringBuilder, 1, "retry_counter", Integer.valueOf(locald2.e2()));
        }
        if (locald2.P0()) {
          Z(localStringBuilder, 1, "consent_signals", locald2.f0());
        }
        if (locald2.V0()) {
          Z(localStringBuilder, 1, "is_dma_region", Boolean.valueOf(locald2.v0()));
        }
        if (locald2.Q0()) {
          Z(localStringBuilder, 1, "core_platform_services", locald2.g0());
        }
        if (locald2.C0()) {
          Z(localStringBuilder, 1, "consent_diagnostics", locald2.e0());
        }
        if (locald2.e1()) {
          Z(localStringBuilder, 1, "target_os_version", Long.valueOf(locald2.q3()));
        }
        if ((g7.a()) && (f().B(locald2.D3(), K.L0)))
        {
          Z(localStringBuilder, 1, "ad_services_version", Integer.valueOf(locald2.k()));
          if (locald2.z0())
          {
            paramc2 = locald2.z3();
            if (paramc2 != null)
            {
              V(localStringBuilder, 2);
              localStringBuilder.append("attribution_eligibility_status {\n");
              Z(localStringBuilder, 2, "eligible", Boolean.valueOf(paramc2.X()));
              Z(localStringBuilder, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(paramc2.b0()));
              Z(localStringBuilder, 2, "pre_r", Boolean.valueOf(paramc2.c0()));
              Z(localStringBuilder, 2, "r_extensions_too_old", Boolean.valueOf(paramc2.d0()));
              Z(localStringBuilder, 2, "adservices_extension_too_old", Boolean.valueOf(paramc2.U()));
              Z(localStringBuilder, 2, "ad_storage_not_allowed", Boolean.valueOf(paramc2.R()));
              Z(localStringBuilder, 2, "measurement_manager_disabled", Boolean.valueOf(paramc2.a0()));
              V(localStringBuilder, 2);
              localStringBuilder.append("}\n");
            }
          }
        }
        paramc2 = locald2.t0();
        Object localObject;
        if (paramc2 != null)
        {
          Iterator localIterator2 = paramc2.iterator();
          while (localIterator2.hasNext())
          {
            h2 localh2 = (h2)localIterator2.next();
            if (localh2 != null)
            {
              V(localStringBuilder, 2);
              localStringBuilder.append("user_property {\n");
              boolean bool = localh2.e0();
              localObject = null;
              if (bool) {
                paramc2 = Long.valueOf(localh2.W());
              } else {
                paramc2 = null;
              }
              Z(localStringBuilder, 2, "set_timestamp_millis", paramc2);
              Z(localStringBuilder, 2, "name", h().g(localh2.Z()));
              Z(localStringBuilder, 2, "string_value", localh2.a0());
              if (localh2.d0()) {
                paramc2 = Long.valueOf(localh2.U());
              } else {
                paramc2 = null;
              }
              Z(localStringBuilder, 2, "int_value", paramc2);
              paramc2 = (c2)localObject;
              if (localh2.b0()) {
                paramc2 = Double.valueOf(localh2.G());
              }
              Z(localStringBuilder, 2, "double_value", paramc2);
              V(localStringBuilder, 2);
              localStringBuilder.append("}\n");
            }
          }
        }
        paramc2 = locald2.r0();
        locald2.D3();
        if (paramc2 != null)
        {
          localObject = paramc2.iterator();
          while (((Iterator)localObject).hasNext())
          {
            paramc2 = (W1)((Iterator)localObject).next();
            if (paramc2 != null)
            {
              V(localStringBuilder, 2);
              localStringBuilder.append("audience_membership {\n");
              if (paramc2.T()) {
                Z(localStringBuilder, 2, "audience_id", Integer.valueOf(paramc2.k()));
              }
              if (paramc2.U()) {
                Z(localStringBuilder, 2, "new_audience", Boolean.valueOf(paramc2.S()));
              }
              Y(localStringBuilder, 2, "current_data", paramc2.Q());
              if (paramc2.V()) {
                Y(localStringBuilder, 2, "previous_data", paramc2.R());
              }
              V(localStringBuilder, 2);
              localStringBuilder.append("}\n");
            }
          }
        }
        paramc2 = locald2.s0();
        if (paramc2 != null)
        {
          paramc2 = paramc2.iterator();
          while (paramc2.hasNext())
          {
            localObject = (com.google.android.gms.internal.measurement.Y1)paramc2.next();
            if (localObject != null)
            {
              V(localStringBuilder, 2);
              localStringBuilder.append("event {\n");
              Z(localStringBuilder, 2, "name", h().c(((com.google.android.gms.internal.measurement.Y1)localObject).b0()));
              if (((com.google.android.gms.internal.measurement.Y1)localObject).f0()) {
                Z(localStringBuilder, 2, "timestamp_millis", Long.valueOf(((com.google.android.gms.internal.measurement.Y1)localObject).Y()));
              }
              if (((com.google.android.gms.internal.measurement.Y1)localObject).e0()) {
                Z(localStringBuilder, 2, "previous_timestamp_millis", Long.valueOf(((com.google.android.gms.internal.measurement.Y1)localObject).X()));
              }
              if (((com.google.android.gms.internal.measurement.Y1)localObject).d0()) {
                Z(localStringBuilder, 2, "count", Integer.valueOf(((com.google.android.gms.internal.measurement.Y1)localObject).k()));
              }
              if (((com.google.android.gms.internal.measurement.Y1)localObject).T() != 0) {
                a0(localStringBuilder, 2, ((com.google.android.gms.internal.measurement.Y1)localObject).c0());
              }
              V(localStringBuilder, 2);
              localStringBuilder.append("}\n");
            }
          }
        }
        V(localStringBuilder, 1);
        localStringBuilder.append("}\n");
      }
    }
    localStringBuilder.append("}\n");
    return localStringBuilder.toString();
  }
  
  public final List N(List paramList1, List paramList2)
  {
    paramList1 = new ArrayList(paramList1);
    paramList2 = paramList2.iterator();
    while (paramList2.hasNext())
    {
      Integer localInteger = (Integer)paramList2.next();
      if (localInteger.intValue() < 0)
      {
        j().L().b("Ignoring negative bit index to be cleared", localInteger);
      }
      else
      {
        i = localInteger.intValue() / 64;
        if (i >= paramList1.size()) {
          j().L().c("Ignoring bit index greater than bitSet size", localInteger, Integer.valueOf(paramList1.size()));
        } else {
          paramList1.set(i, Long.valueOf(((Long)paramList1.get(i)).longValue() & 1L << localInteger.intValue() % 64));
        }
      }
    }
    int j = paramList1.size();
    int k;
    for (int i = paramList1.size() - 1; (i >= 0) && (((Long)paramList1.get(i)).longValue() == 0L); i = k)
    {
      k = i - 1;
      j = i;
    }
    return paramList1.subList(0, j);
  }
  
  public final Map O(Bundle paramBundle, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramBundle.get(str);
      boolean bool = localObject1 instanceof Parcelable[];
      if ((!bool) && (!(localObject1 instanceof ArrayList)) && (!(localObject1 instanceof Bundle)))
      {
        if (localObject1 != null) {
          localHashMap.put(str, localObject1);
        }
      }
      else if (paramBoolean)
      {
        ArrayList localArrayList = new ArrayList();
        if (bool) {
          for (localObject1 : (Parcelable[])localObject1) {
            if ((localObject1 instanceof Bundle)) {
              localArrayList.add(O((Bundle)localObject1, false));
            }
          }
        }
        if ((localObject1 instanceof ArrayList))
        {
          localObject1 = (ArrayList)localObject1;
          int k = ((ArrayList)localObject1).size();
          ??? = 0;
          while (??? < k)
          {
            ??? = ((ArrayList)localObject1).get(???);
            ??? = ??? + 1;
            ??? = ???;
            if ((??? instanceof Bundle))
            {
              localArrayList.add(O((Bundle)???, false));
              ??? = ???;
            }
          }
        }
        if ((localObject1 instanceof Bundle)) {
          localArrayList.add(O((Bundle)localObject1, false));
        }
        localHashMap.put(str, localArrayList);
      }
    }
    return localHashMap;
  }
  
  public final void S(a2.a parama, Object paramObject)
  {
    n.i(paramObject);
    parama.G().E().C().F();
    if ((paramObject instanceof String))
    {
      parama.D((String)paramObject);
      return;
    }
    if ((paramObject instanceof Long))
    {
      parama.y(((Long)paramObject).longValue());
      return;
    }
    if ((paramObject instanceof Double))
    {
      parama.x(((Double)paramObject).doubleValue());
      return;
    }
    if ((paramObject instanceof Bundle[]))
    {
      Bundle[] arrayOfBundle = (Bundle[])paramObject;
      ArrayList localArrayList = new ArrayList();
      int i = arrayOfBundle.length;
      for (int j = 0; j < i; j++)
      {
        Bundle localBundle = arrayOfBundle[j];
        if (localBundle != null)
        {
          paramObject = com.google.android.gms.internal.measurement.a2.Z();
          Iterator localIterator = localBundle.keySet().iterator();
          while (localIterator.hasNext())
          {
            Object localObject = (String)localIterator.next();
            a2.a locala = com.google.android.gms.internal.measurement.a2.Z().B((String)localObject);
            localObject = localBundle.get((String)localObject);
            if ((localObject instanceof Long))
            {
              locala.y(((Long)localObject).longValue());
            }
            else if ((localObject instanceof String))
            {
              locala.D((String)localObject);
            }
            else
            {
              if (!(localObject instanceof Double)) {
                continue;
              }
              locala.x(((Double)localObject).doubleValue());
            }
            ((a2.a)paramObject).z(locala);
          }
          if (((a2.a)paramObject).w() > 0) {
            localArrayList.add((com.google.android.gms.internal.measurement.a2)((Y3.b)paramObject).p());
          }
        }
      }
      parama.A(localArrayList);
      return;
    }
    j().G().b("Ignoring invalid (type) event param value", paramObject);
  }
  
  public final void T(d2.a parama)
  {
    j().K().a("Checking account type status for ad personalization signals");
    if (h0(parama.S0()))
    {
      j().F().a("Turning off ad personalization due to account type");
      Object localObject = (h2)h2.X().z("_npa").B(g().u()).y(1L).p();
      for (int i = 0; i < parama.K(); i++) {
        if ("_npa".equals(parama.A0(i).Z()))
        {
          parama.A(i, (h2)localObject);
          break label119;
        }
      }
      parama.G((h2)localObject);
      label119:
      if ((n6.a()) && (f().s(K.T0)))
      {
        localObject = l.b(parama.U0());
        ((l)localObject).d(q3.a.s, k.v);
        parama.k0(((l)localObject).toString());
      }
    }
  }
  
  public final void U(h2.a parama, Object paramObject)
  {
    n.i(paramObject);
    parama.D().A().w();
    if ((paramObject instanceof String))
    {
      parama.C((String)paramObject);
      return;
    }
    if ((paramObject instanceof Long))
    {
      parama.y(((Long)paramObject).longValue());
      return;
    }
    if ((paramObject instanceof Double))
    {
      parama.x(((Double)paramObject).doubleValue());
      return;
    }
    j().G().b("Ignoring invalid (type) user attribute value", paramObject);
  }
  
  public final void W(StringBuilder paramStringBuilder, int paramInt, y1 paramy1)
  {
    if (paramy1 == null) {
      return;
    }
    V(paramStringBuilder, paramInt);
    paramStringBuilder.append("filter {\n");
    if (paramy1.O()) {
      Z(paramStringBuilder, paramInt, "complement", Boolean.valueOf(paramy1.N()));
    }
    if (paramy1.Q()) {
      Z(paramStringBuilder, paramInt, "param_name", h().f(paramy1.M()));
    }
    if (paramy1.R())
    {
      int i = paramInt + 1;
      Object localObject = paramy1.L();
      if (localObject != null)
      {
        V(paramStringBuilder, i);
        paramStringBuilder.append("string_filter");
        paramStringBuilder.append(" {\n");
        if (((B1)localObject).O()) {
          Z(paramStringBuilder, i, "match_type", ((B1)localObject).G().name());
        }
        if (((B1)localObject).N()) {
          Z(paramStringBuilder, i, "expression", ((B1)localObject).J());
        }
        if (((B1)localObject).M()) {
          Z(paramStringBuilder, i, "case_sensitive", Boolean.valueOf(((B1)localObject).L()));
        }
        if (((B1)localObject).k() > 0)
        {
          V(paramStringBuilder, paramInt + 2);
          paramStringBuilder.append("expression_list {\n");
          localObject = ((B1)localObject).K().iterator();
          while (((Iterator)localObject).hasNext())
          {
            String str = (String)((Iterator)localObject).next();
            V(paramStringBuilder, paramInt + 3);
            paramStringBuilder.append(str);
            paramStringBuilder.append("\n");
          }
          paramStringBuilder.append("}\n");
        }
        V(paramStringBuilder, i);
        paramStringBuilder.append("}\n");
      }
    }
    if (paramy1.P()) {
      X(paramStringBuilder, paramInt + 1, "number_filter", paramy1.K());
    }
    V(paramStringBuilder, paramInt);
    paramStringBuilder.append("}\n");
  }
  
  public final void a0(StringBuilder paramStringBuilder, int paramInt, List paramList)
  {
    if (paramList == null) {
      return;
    }
    paramInt++;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      com.google.android.gms.internal.measurement.a2 locala2 = (com.google.android.gms.internal.measurement.a2)localIterator.next();
      if (locala2 != null)
      {
        V(paramStringBuilder, paramInt);
        paramStringBuilder.append("param {\n");
        boolean bool = locala2.i0();
        Object localObject = null;
        if (bool) {
          paramList = h().f(locala2.c0());
        } else {
          paramList = null;
        }
        Z(paramStringBuilder, paramInt, "name", paramList);
        if (locala2.j0()) {
          paramList = locala2.d0();
        } else {
          paramList = null;
        }
        Z(paramStringBuilder, paramInt, "string_value", paramList);
        if (locala2.h0()) {
          paramList = Long.valueOf(locala2.X());
        } else {
          paramList = null;
        }
        Z(paramStringBuilder, paramInt, "int_value", paramList);
        paramList = (List)localObject;
        if (locala2.f0()) {
          paramList = Double.valueOf(locala2.G());
        }
        Z(paramStringBuilder, paramInt, "double_value", paramList);
        if (locala2.V() > 0) {
          a0(paramStringBuilder, paramInt, locala2.e0());
        }
        V(paramStringBuilder, paramInt);
        paramStringBuilder.append("}\n");
      }
    }
  }
  
  public final boolean b0(long paramLong1, long paramLong2)
  {
    return (paramLong1 == 0L) || (paramLong2 <= 0L) || (Math.abs(b().a() - paramLong1) > paramLong2);
  }
  
  public final byte[] g0(byte[] paramArrayOfByte)
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
      j().G().b("Failed to gzip content", paramArrayOfByte);
      throw paramArrayOfByte;
    }
  }
  
  public final boolean h0(String paramString)
  {
    n.i(paramString);
    I2 localI2 = q().D0(paramString);
    if (localI2 == null) {
      return false;
    }
    return (g().y()) && (localI2.q()) && (r().V(paramString));
  }
  
  /* Error */
  public final byte[] i0(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 1470	java/io/ByteArrayInputStream
    //   3: astore_2
    //   4: aload_2
    //   5: aload_1
    //   6: invokespecial 1472	java/io/ByteArrayInputStream:<init>	([B)V
    //   9: new 1474	java/util/zip/GZIPInputStream
    //   12: astore_1
    //   13: aload_1
    //   14: aload_2
    //   15: invokespecial 1477	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   18: new 1426	java/io/ByteArrayOutputStream
    //   21: astore_3
    //   22: aload_3
    //   23: invokespecial 1427	java/io/ByteArrayOutputStream:<init>	()V
    //   26: sipush 1024
    //   29: newarray <illegal type>
    //   31: astore 4
    //   33: aload_1
    //   34: aload 4
    //   36: invokevirtual 1483	java/io/InputStream:read	([B)I
    //   39: istore 5
    //   41: iload 5
    //   43: ifle +19 -> 62
    //   46: aload_3
    //   47: aload 4
    //   49: iconst_0
    //   50: iload 5
    //   52: invokevirtual 1485	java/io/ByteArrayOutputStream:write	([BII)V
    //   55: goto -22 -> 33
    //   58: astore_1
    //   59: goto +18 -> 77
    //   62: aload_1
    //   63: invokevirtual 1486	java/util/zip/GZIPInputStream:close	()V
    //   66: aload_2
    //   67: invokevirtual 1487	java/io/ByteArrayInputStream:close	()V
    //   70: aload_3
    //   71: invokevirtual 1446	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   74: astore_1
    //   75: aload_1
    //   76: areturn
    //   77: aload_0
    //   78: invokevirtual 431	R2/m3:j	()LR2/Y1;
    //   81: invokevirtual 436	R2/Y1:G	()LR2/a2;
    //   84: ldc_w 1489
    //   87: aload_1
    //   88: invokevirtual 1229	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   91: aload_1
    //   92: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	N5
    //   0	93	1	paramArrayOfByte	byte[]
    //   3	64	2	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   21	50	3	localByteArrayOutputStream	ByteArrayOutputStream
    //   31	17	4	arrayOfByte	byte[]
    //   39	12	5	i	int
    // Exception table:
    //   from	to	target	type
    //   0	33	58	java/io/IOException
    //   33	41	58	java/io/IOException
    //   46	55	58	java/io/IOException
    //   62	75	58	java/io/IOException
  }
  
  public final List j0()
  {
    Object localObject = K.c(b.a());
    if ((localObject != null) && (!((Map)localObject).isEmpty()))
    {
      ArrayList localArrayList = new ArrayList();
      int i = ((Integer)K.R.a(null)).intValue();
      localObject = ((Map)localObject).entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        if (((String)localEntry.getKey()).startsWith("measurement.id.")) {
          try
          {
            int j = Integer.parseInt((String)localEntry.getValue());
            if (j != 0)
            {
              localArrayList.add(Integer.valueOf(j));
              if (localArrayList.size() >= i) {
                j().L().b("Too many experiment IDs. Number of IDs", Integer.valueOf(localArrayList.size()));
              }
            }
          }
          catch (NumberFormatException localNumberFormatException)
          {
            j().L().b("Experiment ID NumberFormatException", localNumberFormatException);
          }
        }
      }
      if (localArrayList.isEmpty()) {
        return null;
      }
      return localArrayList;
    }
    return null;
  }
  
  public final boolean x()
  {
    return false;
  }
  
  public final long z(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return 0L;
    }
    return A(paramString.getBytes(Charset.forName("UTF-8")));
  }
}

/* Location:
 * Qualified Name:     R2.N5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
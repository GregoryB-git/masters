package x6;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import b.a0;
import b8.h0;
import b8.l0;
import b8.x;
import d2.i0;
import f8.c;
import g;
import gb.q1;
import gb.w2;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import m6.j;
import nc.c1;
import nc.d0;
import nc.g0;
import nc.g2;
import nc.k0;
import nc.o0;
import nc.o1;
import nc.r1;
import nc.u;
import nc.z1;
import p2.m0;
import qc.m;
import qc.n;
import qc.o;
import r0.d.a;
import sc.w;
import ub.f.a;
import v3.a1;

public class b
{
  public static Context a;
  public static Boolean b;
  public static g0 c;
  public static final b d;
  public static Boolean e;
  public static Boolean f;
  public static Boolean g;
  public static Boolean h;
  
  public static void A(pa.a parama)
  {
    if (parama != null) {
      return;
    }
    throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
  }
  
  public static final Object A0(ub.h paramh, Object paramObject1, Object paramObject2, dc.p paramp, ub.e parame)
  {
    paramObject2 = w.c(paramh, paramObject2);
    try
    {
      rc.s locals = new rc/s;
      locals.<init>(parame, paramh);
      ec.v.a(2, paramp);
      paramObject1 = paramp.invoke(paramObject1, locals);
      w.a(paramh, paramObject2);
      if (paramObject1 == vb.a.a) {
        ec.i.e(parame, "frame");
      }
      return paramObject1;
    }
    finally
    {
      w.a(paramh, paramObject2);
    }
  }
  
  public static void B(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return;
    }
    throw new NullPointerException(paramString);
  }
  
  public static void B0(StringBuilder paramStringBuilder, HashMap paramHashMap)
  {
    paramStringBuilder.append("{");
    Iterator localIterator = paramHashMap.keySet().iterator();
    for (int i = 1; localIterator.hasNext(); i = 0)
    {
      String str1 = (String)localIterator.next();
      if (i == 0) {
        paramStringBuilder.append(",");
      }
      String str2 = (String)paramHashMap.get(str1);
      paramStringBuilder.append("\"");
      paramStringBuilder.append(str1);
      paramStringBuilder.append("\":");
      if (str2 == null)
      {
        paramStringBuilder.append("null");
      }
      else
      {
        paramStringBuilder.append("\"");
        paramStringBuilder.append(str2);
        paramStringBuilder.append("\"");
      }
    }
    paramStringBuilder.append("}");
  }
  
  public static final void C(int paramInt)
  {
    int i = 1;
    if (paramInt < 1) {
      i = 0;
    }
    if (i != 0) {
      return;
    }
    throw new IllegalArgumentException(f.h("Expected positive parallelism level, but got ", paramInt).toString());
  }
  
  public static void C0(ByteArrayOutputStream paramByteArrayOutputStream, long paramLong, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    for (int i = 0; i < paramInt; i++) {
      arrayOfByte[i] = ((byte)(byte)(int)(paramLong >> i * 8 & 0xFF));
    }
    paramByteArrayOutputStream.write(arrayOfByte);
  }
  
  public static void D(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2)) {
      return;
    }
    throw new IndexOutOfBoundsException(i(paramInt1, paramInt2, "index"));
  }
  
  public static void D0(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt)
  {
    C0(paramByteArrayOutputStream, paramInt, 2);
  }
  
  public static void E(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt2 >= paramInt1) && (paramInt2 <= paramInt3)) {
      return;
    }
    String str;
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt3))
    {
      if ((paramInt2 >= 0) && (paramInt2 <= paramInt3)) {
        str = m0.X("end index (%s) must not be less than start index (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      } else {
        str = i(paramInt2, paramInt3, "end index");
      }
    }
    else {
      str = i(paramInt1, paramInt3, "start index");
    }
    throw new IndexOutOfBoundsException(str);
  }
  
  public static int E0(int paramInt)
  {
    int i = 0;
    while (i < 3)
    {
      int j = new int[] { 1, 2, 3 }[i];
      if (j != 0)
      {
        if (j - 1 == paramInt) {
          return j;
        }
        i++;
      }
      else
      {
        throw null;
      }
    }
    return 1;
  }
  
  public static int F(Context paramContext, String paramString)
  {
    int i = Process.myPid();
    int j = Process.myUid();
    Object localObject = paramContext.getPackageName();
    i = paramContext.checkPermission(paramString, i, j);
    int k = -1;
    if (i == -1)
    {
      i = k;
    }
    else
    {
      String str = u.h.d(paramString);
      if (str != null)
      {
        paramString = (String)localObject;
        if (localObject == null)
        {
          paramString = paramContext.getPackageManager().getPackagesForUid(j);
          i = k;
          if (paramString == null) {
            return i;
          }
          if (paramString.length <= 0) {
            return k;
          }
          paramString = paramString[0];
        }
        i = Process.myUid();
        localObject = paramContext.getPackageName();
        if ((i == j) && (Objects.equals(localObject, paramString))) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          if (Build.VERSION.SDK_INT >= 29)
          {
            localObject = u.i.c(paramContext);
            i = u.i.a((AppOpsManager)localObject, str, Binder.getCallingUid(), paramString);
            if (i == 0) {
              i = u.i.a((AppOpsManager)localObject, str, j, u.i.b(paramContext));
            }
          }
          else
          {
            i = u.h.c((AppOpsManager)u.h.a(paramContext, AppOpsManager.class), str, paramString);
          }
        }
        else {
          i = u.h.c((AppOpsManager)u.h.a(paramContext, AppOpsManager.class), str, paramString);
        }
        if (i != 0) {}
      }
      else
      {
        return 0;
      }
      i = -2;
    }
    return i;
  }
  
  public static x F0(com.google.android.gms.internal.firebase-auth-api.zzagz paramzzagz)
  {
    Object localObject = null;
    if (paramzzagz == null) {
      return null;
    }
    String str;
    long l;
    if (!TextUtils.isEmpty(paramzzagz.zze()))
    {
      str = paramzzagz.zzd();
      localObject = paramzzagz.zzc();
      l = paramzzagz.zza();
      paramzzagz = paramzzagz.zze();
      j.e(paramzzagz);
      return new h0(l, str, (String)localObject, paramzzagz);
    }
    if (paramzzagz.zzb() != null)
    {
      str = paramzzagz.zzd();
      localObject = paramzzagz.zzc();
      l = paramzzagz.zza();
      paramzzagz = paramzzagz.zzb();
      j.j(paramzzagz, "totpInfo cannot be null.");
      localObject = new l0(str, (String)localObject, l, paramzzagz);
    }
    return (x)localObject;
  }
  
  public static void G(Object paramObject, String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(m0.X(paramString, new Object[] { paramObject }));
  }
  
  public static ArrayList G0(List paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      ArrayList localArrayList = new ArrayList();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        x localx = F0((com.google.android.gms.internal.firebase_auth_api.zzagz)paramList.next());
        if (localx != null) {
          localArrayList.add(localx);
        }
      }
      return localArrayList;
    }
    return new ArrayList();
  }
  
  public static void H(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException();
  }
  
  public static void I(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(String.valueOf(paramString));
  }
  
  public static void J(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException();
  }
  
  public static void K(Object paramObject)
  {
    if (paramObject != null) {
      return;
    }
    throw new IllegalStateException();
  }
  
  /* Error */
  public static final void L(java.io.Closeable paramCloseable, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +31 -> 32
    //   4: aload_1
    //   5: ifnonnull +12 -> 17
    //   8: aload_0
    //   9: invokeinterface 380 1 0
    //   14: goto +18 -> 32
    //   17: aload_0
    //   18: invokeinterface 380 1 0
    //   23: goto +9 -> 32
    //   26: astore_0
    //   27: aload_1
    //   28: aload_0
    //   29: invokestatic 383	x6/b:e	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   32: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	paramCloseable	java.io.Closeable
    //   0	33	1	paramThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   17	23	26	finally
  }
  
  /* Error */
  public static byte[] M(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 387	java/util/zip/Deflater
    //   3: dup
    //   4: iconst_1
    //   5: invokespecial 389	java/util/zip/Deflater:<init>	(I)V
    //   8: astore_1
    //   9: new 391	java/io/ByteArrayOutputStream
    //   12: dup
    //   13: invokespecial 392	java/io/ByteArrayOutputStream:<init>	()V
    //   16: astore_2
    //   17: new 394	java/util/zip/DeflaterOutputStream
    //   20: astore_3
    //   21: aload_3
    //   22: aload_2
    //   23: aload_1
    //   24: invokespecial 397	java/util/zip/DeflaterOutputStream:<init>	(Ljava/io/OutputStream;Ljava/util/zip/Deflater;)V
    //   27: aload_3
    //   28: aload_0
    //   29: invokevirtual 190	java/io/OutputStream:write	([B)V
    //   32: aload_3
    //   33: invokevirtual 398	java/util/zip/DeflaterOutputStream:close	()V
    //   36: aload_1
    //   37: invokevirtual 401	java/util/zip/Deflater:end	()V
    //   40: aload_2
    //   41: invokevirtual 405	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   44: areturn
    //   45: astore_0
    //   46: aload_3
    //   47: invokevirtual 398	java/util/zip/DeflaterOutputStream:close	()V
    //   50: goto +9 -> 59
    //   53: astore_3
    //   54: aload_0
    //   55: aload_3
    //   56: invokevirtual 411	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   59: aload_0
    //   60: athrow
    //   61: astore_0
    //   62: aload_1
    //   63: invokevirtual 401	java/util/zip/Deflater:end	()V
    //   66: aload_0
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	paramArrayOfByte	byte[]
    //   8	55	1	localDeflater	java.util.zip.Deflater
    //   16	25	2	localByteArrayOutputStream	ByteArrayOutputStream
    //   20	27	3	localDeflaterOutputStream	java.util.zip.DeflaterOutputStream
    //   53	3	3	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   27	32	45	finally
    //   46	50	53	finally
    //   17	27	61	finally
    //   32	36	61	finally
    //   54	59	61	finally
    //   59	61	61	finally
  }
  
  public static final long N(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    paramInt = paramInputStream.read(arrayOfByte);
    long l = 0L;
    while (paramInt >= 0)
    {
      paramOutputStream.write(arrayOfByte, 0, paramInt);
      l += paramInt;
      paramInt = paramInputStream.read(arrayOfByte);
    }
    return l;
  }
  
  public static q1 O()
  {
    int i;
    if (w2.e == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return new w2();
    }
    return new b1.v(8);
  }
  
  public static l3.l P(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null) {
      paramContext = localContext;
    }
    return new l3.l(new j7.h(paramContext));
  }
  
  public static boolean Q(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if ((paramObject1 != paramObject2) && ((paramObject1 == null) || (!paramObject1.equals(paramObject2)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean R(String paramString1, String paramString2)
  {
    int i = paramString1.length();
    if (paramString1 == paramString2) {
      return true;
    }
    if (i != paramString2.length()) {
      return false;
    }
    int j = 0;
    while (j < i)
    {
      int k = paramString1.charAt(j);
      int m = paramString2.charAt(j);
      if (k != m)
      {
        k = (char)((k | 0x20) - 97);
        if ((k >= 26) || (k != (char)((m | 0x20) - 97))) {}
      }
      else
      {
        j++;
        continue;
      }
      return false;
    }
    return true;
  }
  
  public static void S(String paramString, Exception paramException, Object... paramVarArgs)
  {
    StringBuilder localStringBuilder = f.l("INTERNAL ASSERTION FAILED: ");
    localStringBuilder.append(String.format(paramString, paramVarArgs));
    paramString = new AssertionError(localStringBuilder.toString());
    paramString.initCause(paramException);
    throw paramString;
  }
  
  public static void T(String paramString, Object... paramVarArgs)
  {
    StringBuilder localStringBuilder = f.l("INTERNAL ASSERTION FAILED: ");
    localStringBuilder.append(String.format(paramString, paramVarArgs));
    throw new AssertionError(localStringBuilder.toString());
  }
  
  public static final Object U(qc.e parame, ub.e parame1)
  {
    if ((parame1 instanceof n))
    {
      localObject1 = (n)parame1;
      i = d;
      if ((i & 0x80000000) != 0)
      {
        d = (i + Integer.MIN_VALUE);
        parame1 = (ub.e)localObject1;
        break label48;
      }
    }
    parame1 = new n(parame1);
    label48:
    Object localObject1 = c;
    vb.a locala1 = vb.a.a;
    int i = d;
    m localm;
    Object localObject2;
    if (i != 0)
    {
      if (i == 1)
      {
        localm = b;
        parame = a;
        try
        {
          rb.f.b(localObject1);
        }
        catch (rc.a locala)
        {
          parame1 = localm;
          break label188;
        }
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      rb.f.b(locala);
      localObject2 = new ec.s();
      a = eb.y.b;
      localm = new m((ec.s)localObject2);
      try
      {
        a = ((ec.s)localObject2);
        b = localm;
        d = 1;
        parame = parame.collect(localm, parame1);
        if (parame == locala1)
        {
          parame = locala1;
          break label208;
        }
        parame = (qc.e)localObject2;
      }
      catch (rc.a parame1)
      {
        parame = (qc.e)localObject2;
        localObject2 = parame1;
        parame1 = localm;
      }
    }
    label188:
    if (a == parame1)
    {
      parame = a;
      if (parame != eb.y.b) {
        label208:
        return parame;
      }
      throw new NoSuchElementException("Expected at least one element");
    }
    throw ((Throwable)localObject2);
  }
  
  public static final Object V(qc.e parame, ub.e parame1)
  {
    if ((parame1 instanceof qc.p))
    {
      localObject1 = (qc.p)parame1;
      i = d;
      if ((i & 0x80000000) != 0)
      {
        d = (i + Integer.MIN_VALUE);
        break label46;
      }
    }
    Object localObject1 = new qc.p(parame1);
    label46:
    parame1 = c;
    vb.a locala1 = vb.a.a;
    int i = d;
    o localo;
    Object localObject2;
    if (i != 0)
    {
      if (i == 1)
      {
        localo = b;
        parame = a;
        try
        {
          rb.f.b(parame1);
        }
        catch (rc.a parame1)
        {
          localObject1 = localo;
          break label179;
        }
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      rb.f.b(parame1);
      parame1 = new ec.s();
      localo = new o(parame1);
      try
      {
        a = parame1;
        b = localo;
        d = 1;
        parame = parame.collect(localo, (ub.e)localObject1);
        if (parame == locala1)
        {
          parame = locala1;
          break label192;
        }
        parame = parame1;
      }
      catch (rc.a locala)
      {
        parame = parame1;
        parame1 = locala;
        localObject2 = localo;
      }
    }
    label179:
    if (a == localObject2)
    {
      parame = a;
      label192:
      return parame;
    }
    throw parame1;
  }
  
  public static final c1 W(Executor paramExecutor)
  {
    if ((paramExecutor instanceof nc.q0)) {
      nc.q0 localq0 = (nc.q0)paramExecutor;
    }
    return new c1(paramExecutor);
  }
  
  public static Drawable X(Context paramContext, int paramInt)
  {
    return l.q0.d().f(paramContext, paramInt);
  }
  
  public static HashMap Y(m.e parame)
  {
    String str = (String)parame.c("sql");
    Object localObject = (List)parame.c("arguments");
    parame = (m.e)localObject;
    if (localObject == null) {
      parame = new ArrayList();
    }
    localObject = new HashMap();
    ((HashMap)localObject).put("sql", str);
    ((HashMap)localObject).put("arguments", parame);
    return (HashMap)localObject;
  }
  
  public static void Z(String paramString, boolean paramBoolean, Object... paramVarArgs)
  {
    if (paramBoolean) {
      return;
    }
    T(paramString, paramVarArgs);
    throw null;
  }
  
  public static final boolean a(Object[] paramArrayOfObject, int paramInt1, int paramInt2, List paramList)
  {
    int i = paramList.size();
    boolean bool = false;
    if (paramInt2 == i)
    {
      for (i = 0; i < paramInt2; i++) {
        if (!ec.i.a(paramArrayOfObject[(paramInt1 + i)], paramList.get(i))) {
          break label61;
        }
      }
      bool = true;
    }
    label61:
    return bool;
  }
  
  public static void a0(Object paramObject, String paramString, Object... paramVarArgs)
  {
    if (paramObject != null) {
      return;
    }
    T(paramString, paramVarArgs);
    throw null;
  }
  
  public static final String b(Object[] paramArrayOfObject, int paramInt1, int paramInt2, Collection paramCollection)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramInt2 * 3 + 2);
    localStringBuilder.append("[");
    for (int i = 0; i < paramInt2; i++)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject = paramArrayOfObject[(paramInt1 + i)];
      if (localObject == paramCollection) {
        localStringBuilder.append("(this Collection)");
      } else {
        localStringBuilder.append(localObject);
      }
    }
    localStringBuilder.append("]");
    paramArrayOfObject = localStringBuilder.toString();
    ec.i.d(paramArrayOfObject, "toString(...)");
    return paramArrayOfObject;
  }
  
  public static int b0(long paramLong)
  {
    return (int)(paramLong ^ paramLong >>> 32);
  }
  
  public static final List c(Throwable paramThrowable)
  {
    if ((paramThrowable instanceof i))
    {
      paramThrowable = (i)paramThrowable;
      paramThrowable = va.a.g(new Object[] { null, null, null });
    }
    else
    {
      String str1 = paramThrowable.getClass().getSimpleName();
      String str2 = paramThrowable.toString();
      Throwable localThrowable = paramThrowable.getCause();
      paramThrowable = Log.getStackTraceString(paramThrowable);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Cause: ");
      localStringBuilder.append(localThrowable);
      localStringBuilder.append(", Stacktrace: ");
      localStringBuilder.append(paramThrowable);
      paramThrowable = va.a.g(new String[] { str1, str2, localStringBuilder.toString() });
    }
    return paramThrowable;
  }
  
  public static boolean c0(String paramString)
  {
    Object localObject1 = i0.a;
    Object localObject2 = Collections.unmodifiableSet(d2.a.c);
    localObject1 = new HashSet();
    localObject2 = ((Collection)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      d2.p localp = (d2.p)((Iterator)localObject2).next();
      if (localp.a().equals(paramString)) {
        ((HashSet)localObject1).add(localp);
      }
    }
    if (!((HashSet)localObject1).isEmpty())
    {
      paramString = ((HashSet)localObject1).iterator();
      while (paramString.hasNext()) {
        if (((d2.p)paramString.next()).b())
        {
          bool = true;
          break label114;
        }
      }
      boolean bool = false;
      label114:
      return bool;
    }
    throw new RuntimeException(g.d("Unknown feature ", paramString));
  }
  
  public static void d(SpannableStringBuilder paramSpannableStringBuilder, Object paramObject, int paramInt1, int paramInt2)
  {
    for (Object localObject : paramSpannableStringBuilder.getSpans(paramInt1, paramInt2, paramObject.getClass())) {
      if ((paramSpannableStringBuilder.getSpanStart(localObject) == paramInt1) && (paramSpannableStringBuilder.getSpanEnd(localObject) == paramInt2) && (paramSpannableStringBuilder.getSpanFlags(localObject) == 33)) {
        paramSpannableStringBuilder.removeSpan(localObject);
      }
    }
    paramSpannableStringBuilder.setSpan(paramObject, paramInt1, paramInt2, 33);
  }
  
  public static boolean d0(Context paramContext)
  {
    try
    {
      Context localContext1 = paramContext.getApplicationContext();
      Context localContext2 = a;
      if (localContext2 != null)
      {
        Boolean localBoolean = b;
        if ((localBoolean != null) && (localContext2 == localContext1))
        {
          bool = localBoolean.booleanValue();
          return bool;
        }
      }
      b = null;
      if (v6.e.a()) {
        paramContext = Boolean.valueOf(d2.e.t(localContext1.getPackageManager()));
      }
      for (;;)
      {
        b = paramContext;
        break;
        try
        {
          paramContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
          b = Boolean.TRUE;
        }
        catch (ClassNotFoundException paramContext)
        {
          paramContext = Boolean.FALSE;
        }
      }
      a = localContext1;
      boolean bool = b.booleanValue();
      return bool;
    }
    finally {}
  }
  
  public static final void e(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    ec.i.e(paramThrowable1, "<this>");
    ec.i.e(paramThrowable2, "exception");
    if (paramThrowable1 != paramThrowable2) {
      yb.b.a.a(paramThrowable1, paramThrowable2);
    }
  }
  
  public static boolean e0(Context paramContext, String paramString)
  {
    Object localObject1 = i0.a;
    Object localObject2 = Collections.unmodifiableSet(d2.z.c);
    localObject1 = new HashSet();
    Iterator localIterator = ((Collection)localObject2).iterator();
    while (localIterator.hasNext())
    {
      localObject2 = (d2.z)localIterator.next();
      if (a.equals(paramString)) {
        ((HashSet)localObject1).add(localObject2);
      }
    }
    if (!((HashSet)localObject1).isEmpty())
    {
      paramString = ((HashSet)localObject1).iterator();
      while (paramString.hasNext()) {
        if (((d2.z)paramString.next()).a(paramContext))
        {
          bool = true;
          break label114;
        }
      }
      boolean bool = false;
      label114:
      return bool;
    }
    throw new RuntimeException(g.d("Unknown feature ", paramString));
  }
  
  public static final void f(int paramInt, StringBuilder paramStringBuilder)
  {
    for (int i = 0; i < paramInt; i++)
    {
      paramStringBuilder.append("?");
      if (i < paramInt - 1) {
        paramStringBuilder.append(",");
      }
    }
  }
  
  public static boolean f0(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (e == null) {
      e = Boolean.valueOf(localPackageManager.hasSystemFeature("android.hardware.type.watch"));
    }
    int i;
    if (e.booleanValue())
    {
      if (Build.VERSION.SDK_INT >= 24) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0) {}
    }
    else
    {
      if (f == null) {
        f = Boolean.valueOf(paramContext.getPackageManager().hasSystemFeature("cn.google"));
      }
      if (!f.booleanValue()) {
        break label110;
      }
      if (v6.e.a())
      {
        if (Build.VERSION.SDK_INT >= 30) {
          i = 1;
        } else {
          i = 0;
        }
        if (i == 0) {
          break label110;
        }
      }
    }
    return true;
    label110:
    return false;
  }
  
  public static final Object[] g(int paramInt)
  {
    int i;
    if (paramInt >= 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return new Object[paramInt];
    }
    throw new IllegalArgumentException("capacity must be non-negative.".toString());
  }
  
  public static z1 g0(d0 paramd0, tc.b paramb, dc.p paramp, int paramInt)
  {
    if ((paramInt & 0x1) != 0) {
      paramb = ub.i.a;
    }
    int i = 0;
    if ((paramInt & 0x2) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    paramd0 = nc.y.b(paramd0, paramb);
    if (paramInt == 2) {
      i = 1;
    }
    if (i != 0) {
      paramd0 = new r1(paramd0, paramp);
    } else {
      paramd0 = new z1(paramd0, true);
    }
    paramd0.d0(paramInt, paramd0, paramp);
    return paramd0;
  }
  
  public static k0 h(d0 paramd0, dc.p paramp)
  {
    paramd0 = new k0(nc.y.b(paramd0, ub.i.a), true);
    paramd0.d0(1, paramd0, paramp);
    return paramd0;
  }
  
  public static void h0(MediaFormat paramMediaFormat, String paramString, int paramInt)
  {
    if (paramInt != -1) {
      paramMediaFormat.setInteger(paramString, paramInt);
    }
  }
  
  public static String i(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt1 < 0) {
      return m0.X("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) });
    }
    if (paramInt2 >= 0) {
      return m0.X("%s (%s) must not be greater than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    throw new IllegalArgumentException(f.h("negative size: ", paramInt2));
  }
  
  public static final void i0(ub.e parame)
  {
    ec.i.e(parame, "frame");
  }
  
  public static final d.a j(String paramString)
  {
    ec.i.e(paramString, "name");
    return new d.a(paramString);
  }
  
  public static byte[] j0(InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    while (i < paramInt)
    {
      int j = paramInputStream.read(arrayOfByte, i, paramInt - i);
      if (j >= 0) {
        i += j;
      } else {
        throw new IllegalStateException(f.h("Not enough bytes to read: ", paramInt));
      }
    }
    return arrayOfByte;
  }
  
  /* Error */
  public static final java.io.Serializable k(ub.e parame, qc.e parame1, qc.f paramf)
  {
    // Byte code:
    //   0: aload_0
    //   1: instanceof 861
    //   4: ifeq +36 -> 40
    //   7: aload_0
    //   8: checkcast 861	qc/j
    //   11: astore_3
    //   12: aload_3
    //   13: getfield 863	qc/j:c	I
    //   16: istore 4
    //   18: iload 4
    //   20: ldc_w 490
    //   23: iand
    //   24: ifeq +16 -> 40
    //   27: aload_3
    //   28: iload 4
    //   30: ldc_w 490
    //   33: iadd
    //   34: putfield 863	qc/j:c	I
    //   37: goto +12 -> 49
    //   40: new 861	qc/j
    //   43: dup
    //   44: aload_0
    //   45: invokespecial 864	qc/j:<init>	(Lub/e;)V
    //   48: astore_3
    //   49: aload_3
    //   50: getfield 866	qc/j:b	Ljava/lang/Object;
    //   53: astore 5
    //   55: getstatic 109	vb/a:a	Lvb/a;
    //   58: astore_0
    //   59: aload_3
    //   60: getfield 863	qc/j:c	I
    //   63: istore 4
    //   65: iconst_1
    //   66: istore 6
    //   68: iload 4
    //   70: ifeq +37 -> 107
    //   73: iload 4
    //   75: iconst_1
    //   76: if_icmpne +20 -> 96
    //   79: aload_3
    //   80: getfield 867	qc/j:a	Lec/s;
    //   83: astore_1
    //   84: aload 5
    //   86: invokestatic 506	rb/f:b	(Ljava/lang/Object;)V
    //   89: goto +74 -> 163
    //   92: astore_0
    //   93: goto +79 -> 172
    //   96: new 346	java/lang/IllegalStateException
    //   99: dup
    //   100: ldc_w 508
    //   103: invokespecial 347	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   106: athrow
    //   107: aload 5
    //   109: invokestatic 506	rb/f:b	(Ljava/lang/Object;)V
    //   112: new 510	ec/s
    //   115: dup
    //   116: invokespecial 511	ec/s:<init>	()V
    //   119: astore 5
    //   121: new 869	qc/k
    //   124: astore 7
    //   126: aload 7
    //   128: aload_2
    //   129: aload 5
    //   131: invokespecial 872	qc/k:<init>	(Lqc/f;Lec/s;)V
    //   134: aload_3
    //   135: aload 5
    //   137: putfield 867	qc/j:a	Lec/s;
    //   140: aload_3
    //   141: iconst_1
    //   142: putfield 863	qc/j:c	I
    //   145: aload_1
    //   146: aload 7
    //   148: aload_3
    //   149: invokeinterface 529 3 0
    //   154: astore_1
    //   155: aload_1
    //   156: aload_0
    //   157: if_acmpne +6 -> 163
    //   160: goto +129 -> 289
    //   163: aconst_null
    //   164: astore_0
    //   165: goto +124 -> 289
    //   168: astore_0
    //   169: aload 5
    //   171: astore_1
    //   172: aload_1
    //   173: getfield 518	ec/s:a	Ljava/lang/Object;
    //   176: checkcast 407	java/lang/Throwable
    //   179: astore_1
    //   180: iconst_0
    //   181: istore 8
    //   183: aload_1
    //   184: ifnull +17 -> 201
    //   187: aload_1
    //   188: aload_0
    //   189: invokestatic 594	ec/i:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   192: ifeq +9 -> 201
    //   195: iconst_1
    //   196: istore 4
    //   198: goto +6 -> 204
    //   201: iconst_0
    //   202: istore 4
    //   204: iload 4
    //   206: ifne +106 -> 312
    //   209: aload_3
    //   210: invokeinterface 878 1 0
    //   215: getstatic 883	nc/j1$b:a	Lnc/j1$b;
    //   218: invokeinterface 888 2 0
    //   223: checkcast 890	nc/j1
    //   226: astore_2
    //   227: iload 8
    //   229: istore 4
    //   231: aload_2
    //   232: ifnull +48 -> 280
    //   235: aload_2
    //   236: invokeinterface 893 1 0
    //   241: ifne +10 -> 251
    //   244: iload 8
    //   246: istore 4
    //   248: goto +32 -> 280
    //   251: aload_2
    //   252: invokeinterface 897 1 0
    //   257: astore_2
    //   258: aload_2
    //   259: ifnull +18 -> 277
    //   262: aload_2
    //   263: aload_0
    //   264: invokestatic 594	ec/i:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   267: ifeq +10 -> 277
    //   270: iload 6
    //   272: istore 4
    //   274: goto +6 -> 280
    //   277: iconst_0
    //   278: istore 4
    //   280: iload 4
    //   282: ifne +30 -> 312
    //   285: aload_1
    //   286: ifnonnull +5 -> 291
    //   289: aload_0
    //   290: areturn
    //   291: aload_0
    //   292: instanceof 899
    //   295: ifeq +10 -> 305
    //   298: aload_1
    //   299: aload_0
    //   300: invokestatic 383	x6/b:e	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   303: aload_1
    //   304: athrow
    //   305: aload_0
    //   306: aload_1
    //   307: invokestatic 383	x6/b:e	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   310: aload_0
    //   311: athrow
    //   312: aload_0
    //   313: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	314	0	parame	ub.e
    //   0	314	1	parame1	qc.e
    //   0	314	2	paramf	qc.f
    //   11	199	3	localj	qc.j
    //   16	265	4	i	int
    //   53	117	5	localObject	Object
    //   66	205	6	j	int
    //   124	23	7	localk	qc.k
    //   181	64	8	k	int
    // Exception table:
    //   from	to	target	type
    //   84	89	92	finally
    //   121	155	168	finally
  }
  
  public static byte[] k0(FileInputStream paramFileInputStream, int paramInt1, int paramInt2)
  {
    Inflater localInflater = new Inflater();
    try
    {
      byte[] arrayOfByte = new byte[paramInt2];
      Object localObject = new byte['ࠀ'];
      int i = 0;
      int j = i;
      for (;;)
      {
        if ((localInflater.finished()) || (localInflater.needsDictionary()) || (i >= paramInt1)) {
          break label169;
        }
        int k = paramFileInputStream.read((byte[])localObject);
        if (k >= 0)
        {
          localInflater.setInput((byte[])localObject, 0, k);
          try
          {
            int m = localInflater.inflate(arrayOfByte, j, paramInt2 - j);
            j += m;
            i += k;
          }
          catch (DataFormatException paramFileInputStream)
          {
            paramFileInputStream = paramFileInputStream.getMessage();
            localObject = new java/lang/IllegalStateException;
            ((IllegalStateException)localObject).<init>(paramFileInputStream);
            throw ((Throwable)localObject);
          }
        }
      }
      paramFileInputStream = new java/lang/StringBuilder;
      paramFileInputStream.<init>();
      paramFileInputStream.append("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ");
      paramFileInputStream.append(paramInt1);
      paramFileInputStream.append(" bytes");
      paramFileInputStream = paramFileInputStream.toString();
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>(paramFileInputStream);
      throw ((Throwable)localObject);
      label169:
      if (i == paramInt1)
      {
        boolean bool = localInflater.finished();
        if (bool) {
          return arrayOfByte;
        }
        paramFileInputStream = new java/lang/IllegalStateException;
        paramFileInputStream.<init>("Inflater did not finish");
        throw paramFileInputStream;
      }
      paramFileInputStream = new java/lang/StringBuilder;
      paramFileInputStream.<init>();
      paramFileInputStream.append("Didn't read enough bytes during decompression. expected=");
      paramFileInputStream.append(paramInt1);
      paramFileInputStream.append(" actual=");
      paramFileInputStream.append(i);
      paramFileInputStream = paramFileInputStream.toString();
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>(paramFileInputStream);
      throw ((Throwable)localObject);
    }
    finally
    {
      localInflater.end();
    }
  }
  
  public static void l(int paramInt, String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(m0.X(paramString, new Object[] { Integer.valueOf(paramInt) }));
  }
  
  public static long l0(InputStream paramInputStream, int paramInt)
  {
    paramInputStream = j0(paramInputStream, paramInt);
    long l = 0L;
    for (int i = 0; i < paramInt; i++) {
      l += ((paramInputStream[i] & 0xFF) << i * 8);
    }
    return l;
  }
  
  public static void m(long paramLong, String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(m0.X(paramString, new Object[] { Long.valueOf(paramLong) }));
  }
  
  public static int m0(InputStream paramInputStream)
  {
    return (int)l0(paramInputStream, 2);
  }
  
  public static void n(Object paramObject, String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(m0.X(paramString, new Object[] { paramObject }));
  }
  
  public static void n0(FlutterError paramFlutterError)
  {
    j8.s locals = aa;
    locals.getClass();
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Recorded on-demand fatal events: ");
    ((StringBuilder)localObject).append(((AtomicInteger)c.b).get());
    localObject = ((StringBuilder)localObject).toString();
    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
      Log.d("FirebaseCrashlytics", (String)localObject, null);
    }
    localObject = f.l("Dropped on-demand fatal events: ");
    ((StringBuilder)localObject).append(((AtomicInteger)c.c).get());
    localObject = ((StringBuilder)localObject).toString();
    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
      Log.d("FirebaseCrashlytics", (String)localObject, null);
    }
    p.a.a(new x0.q0(9, locals, paramFlutterError));
  }
  
  public static void o(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(String.valueOf(paramString));
  }
  
  public static final void o0(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    ec.i.e(paramArrayOfObject, "<this>");
    while (paramInt1 < paramInt2)
    {
      paramArrayOfObject[paramInt1] = null;
      paramInt1++;
    }
  }
  
  public static void p(String paramString, boolean paramBoolean, Object... paramVarArgs)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(String.format(paramString, paramVarArgs));
  }
  
  /* Error */
  public static Object p0(dc.p paramp)
  {
    // Byte code:
    //   0: getstatic 806	ub/i:a	Lub/i;
    //   3: astore_1
    //   4: invokestatic 1018	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   7: astore_2
    //   8: getstatic 1023	ub/f$a:a	Lub/f$a;
    //   11: astore_3
    //   12: aconst_null
    //   13: astore 4
    //   15: invokestatic 1028	nc/c2:a	()Lnc/x0;
    //   18: astore 5
    //   20: aload_1
    //   21: aload 5
    //   23: iconst_1
    //   24: invokestatic 1031	nc/y:a	(Lub/h;Lub/h;Z)Lub/h;
    //   27: astore 6
    //   29: getstatic 1036	nc/r0:a	Ltc/c;
    //   32: astore 7
    //   34: aload 6
    //   36: astore_1
    //   37: aload 6
    //   39: aload 7
    //   41: if_acmpeq +27 -> 68
    //   44: aload 6
    //   46: astore_1
    //   47: aload 6
    //   49: aload_3
    //   50: invokeinterface 888 2 0
    //   55: ifnonnull +13 -> 68
    //   58: aload 6
    //   60: aload 7
    //   62: invokeinterface 1040 2 0
    //   67: astore_1
    //   68: new 1042	nc/f
    //   71: dup
    //   72: aload_1
    //   73: aload_2
    //   74: aload 5
    //   76: invokespecial 1045	nc/f:<init>	(Lub/h;Ljava/lang/Thread;Lnc/x0;)V
    //   79: astore_1
    //   80: aload_1
    //   81: iconst_1
    //   82: aload_1
    //   83: aload_0
    //   84: invokevirtual 826	nc/a:d0	(ILnc/a;Ldc/p;)V
    //   87: aload_1
    //   88: getfield 1048	nc/f:e	Lnc/x0;
    //   91: astore_0
    //   92: aload_0
    //   93: ifnull +13 -> 106
    //   96: getstatic 1052	nc/x0:f	I
    //   99: istore 8
    //   101: aload_0
    //   102: iconst_0
    //   103: invokevirtual 1054	nc/x0:E0	(Z)V
    //   106: invokestatic 1057	java/lang/Thread:interrupted	()Z
    //   109: ifne +95 -> 204
    //   112: aload_1
    //   113: getfield 1048	nc/f:e	Lnc/x0;
    //   116: astore_0
    //   117: aload_0
    //   118: ifnull +12 -> 130
    //   121: aload_0
    //   122: invokevirtual 1059	nc/x0:G0	()J
    //   125: lstore 9
    //   127: goto +8 -> 135
    //   130: ldc2_w 1060
    //   133: lstore 9
    //   135: aload_1
    //   136: invokevirtual 1066	nc/o1:isCompleted	()Z
    //   139: ifne +12 -> 151
    //   142: aload_1
    //   143: lload 9
    //   145: invokestatic 1072	java/util/concurrent/locks/LockSupport:parkNanos	(Ljava/lang/Object;J)V
    //   148: goto -42 -> 106
    //   151: aload_1
    //   152: getfield 1048	nc/f:e	Lnc/x0;
    //   155: astore_0
    //   156: aload_0
    //   157: ifnull +13 -> 170
    //   160: getstatic 1052	nc/x0:f	I
    //   163: istore 8
    //   165: aload_0
    //   166: iconst_0
    //   167: invokevirtual 1074	nc/x0:C0	(Z)V
    //   170: aload_1
    //   171: invokevirtual 1076	nc/o1:F	()Ljava/lang/Object;
    //   174: invokestatic 1078	p2/m0:f0	(Ljava/lang/Object;)Ljava/lang/Object;
    //   177: astore_1
    //   178: aload 4
    //   180: astore_0
    //   181: aload_1
    //   182: instanceof 1080
    //   185: ifeq +8 -> 193
    //   188: aload_1
    //   189: checkcast 1080	nc/u
    //   192: astore_0
    //   193: aload_0
    //   194: ifnonnull +5 -> 199
    //   197: aload_1
    //   198: areturn
    //   199: aload_0
    //   200: getfield 1083	nc/u:a	Ljava/lang/Throwable;
    //   203: athrow
    //   204: new 1085	java/lang/InterruptedException
    //   207: astore_0
    //   208: aload_0
    //   209: invokespecial 1086	java/lang/InterruptedException:<init>	()V
    //   212: aload_1
    //   213: aload_0
    //   214: invokevirtual 1089	nc/o1:r	(Ljava/lang/Object;)Z
    //   217: pop
    //   218: aload_0
    //   219: athrow
    //   220: astore_0
    //   221: aload_1
    //   222: getfield 1048	nc/f:e	Lnc/x0;
    //   225: astore_1
    //   226: aload_1
    //   227: ifnull +13 -> 240
    //   230: getstatic 1052	nc/x0:f	I
    //   233: istore 8
    //   235: aload_1
    //   236: iconst_0
    //   237: invokevirtual 1074	nc/x0:C0	(Z)V
    //   240: aload_0
    //   241: athrow
    //   242: astore_0
    //   243: aload_0
    //   244: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	245	0	paramp	dc.p
    //   3	233	1	localObject1	Object
    //   7	67	2	localThread	Thread
    //   11	39	3	locala	f.a
    //   13	166	4	localObject2	Object
    //   18	57	5	localx0	nc.x0
    //   27	32	6	localh	ub.h
    //   32	29	7	localc	tc.c
    //   99	135	8	i	int
    //   125	19	9	l	long
    // Exception table:
    //   from	to	target	type
    //   106	117	220	finally
    //   121	127	220	finally
    //   135	148	220	finally
    //   204	220	220	finally
    //   87	92	242	finally
    //   96	106	242	finally
    //   151	156	242	finally
    //   160	170	242	finally
    //   221	226	242	finally
    //   230	240	242	finally
    //   240	242	242	finally
  }
  
  public static void q(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static void q0(MediaFormat paramMediaFormat, List paramList)
  {
    for (int i = 0; i < paramList.size(); i++) {
      paramMediaFormat.setByteBuffer(f.h("csd-", i), ByteBuffer.wrap((byte[])paramList.get(i)));
    }
  }
  
  public static void r(boolean paramBoolean, String paramString, Object paramObject1, Object paramObject2)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(m0.X(paramString, new Object[] { paramObject1, paramObject2 }));
  }
  
  public static int r0(int paramInt)
  {
    return (int)(Integer.rotateLeft((int)(paramInt * -862048943L), 15) * 461845907L);
  }
  
  public static void s(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(paramString);
  }
  
  public static int s0(Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = 0;
    } else {
      i = paramObject.hashCode();
    }
    return r0(i);
  }
  
  public static void t(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException();
  }
  
  /* Error */
  public static final Object t0(sc.s params1, sc.s params2, dc.p paramp)
  {
    // Byte code:
    //   0: iconst_2
    //   1: aload_2
    //   2: invokestatic 95	ec/v:a	(ILjava/lang/Object;)V
    //   5: aload_2
    //   6: aload_1
    //   7: aload_0
    //   8: invokeinterface 101 3 0
    //   13: astore_1
    //   14: goto +14 -> 28
    //   17: astore_1
    //   18: new 1080	nc/u
    //   21: dup
    //   22: aload_1
    //   23: iconst_0
    //   24: invokespecial 1129	nc/u:<init>	(Ljava/lang/Throwable;Z)V
    //   27: astore_1
    //   28: getstatic 109	vb/a:a	Lvb/a;
    //   31: astore_2
    //   32: aload_1
    //   33: aload_2
    //   34: if_acmpne +8 -> 42
    //   37: aload_2
    //   38: astore_0
    //   39: goto +33 -> 72
    //   42: aload_0
    //   43: aload_1
    //   44: invokevirtual 1131	nc/o1:L	(Ljava/lang/Object;)Ljava/lang/Object;
    //   47: astore_0
    //   48: aload_0
    //   49: getstatic 1134	p2/m0:u	Ld2/h0;
    //   52: if_acmpne +8 -> 60
    //   55: aload_2
    //   56: astore_0
    //   57: goto +15 -> 72
    //   60: aload_0
    //   61: instanceof 1080
    //   64: ifne +10 -> 74
    //   67: aload_0
    //   68: invokestatic 1078	p2/m0:f0	(Ljava/lang/Object;)Ljava/lang/Object;
    //   71: astore_0
    //   72: aload_0
    //   73: areturn
    //   74: aload_0
    //   75: checkcast 1080	nc/u
    //   78: getfield 1083	nc/u:a	Ljava/lang/Throwable;
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	params1	sc.s
    //   0	82	1	params2	sc.s
    //   0	82	2	paramp	dc.p
    // Exception table:
    //   from	to	target	type
    //   0	14	17	finally
  }
  
  public static void u(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw a1.a(paramString, null);
  }
  
  public static final d.a u0(String paramString)
  {
    ec.i.e(paramString, "name");
    return new d.a(paramString);
  }
  
  public static void v(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 < paramInt2)) {
      return;
    }
    String str;
    if (paramInt1 >= 0)
    {
      if (paramInt2 >= 0) {
        str = m0.X("%s (%s) must be less than size (%s)", new Object[] { "index", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      } else {
        throw new IllegalArgumentException(f.h("negative size: ", paramInt2));
      }
    }
    else {
      str = m0.X("%s (%s) must not be negative", new Object[] { "index", Integer.valueOf(paramInt1) });
    }
    throw new IndexOutOfBoundsException(str);
  }
  
  public static final long v0(String paramString, long paramLong1, long paramLong2, long paramLong3)
  {
    int i = sc.v.a;
    String str;
    try
    {
      str = System.getProperty(paramString);
    }
    catch (SecurityException localSecurityException)
    {
      str = null;
    }
    if (str != null)
    {
      m0.q(10);
      int j = str.length();
      int k;
      label125:
      long l1;
      if (j != 0)
      {
        i = str.charAt(0);
        k = ec.i.f(i, 48);
        paramLong1 = -9223372036854775807L;
        if (k < 0)
        {
          if (j == 1) {
            break label228;
          }
          if (i != 43)
          {
            if (i != 45) {
              break label228;
            }
            paramLong1 = Long.MIN_VALUE;
            i = 1;
          }
          else
          {
            k = 0;
            i = 1;
            break label125;
          }
        }
        else
        {
          i = 0;
        }
        k = i;
        l1 = 0L;
      }
      long l3;
      for (long l2 = -256204778801521550L; i < j; l2 = l3)
      {
        int m = Character.digit(str.charAt(i), 10);
        if (m >= 0)
        {
          l3 = l2;
          if (l1 < l2)
          {
            if (l2 == -256204778801521550L)
            {
              l2 = paramLong1 / 10;
              l3 = l2;
              if (l1 < l2) {}
            }
          }
          else
          {
            l2 = l1 * 10;
            l1 = m;
            if (l2 >= paramLong1 + l1) {
              break label234;
            }
          }
        }
        label228:
        localObject = null;
        break label274;
        label234:
        l1 = l2 - l1;
        i++;
      }
      if (k != 0) {
        localObject = Long.valueOf(l1);
      } else {
        localObject = Long.valueOf(-l1);
      }
      label274:
      if (localObject == null) {
        break label412;
      }
      paramLong1 = ((Long)localObject).longValue();
      if ((paramLong2 <= paramLong1) && (paramLong1 <= paramLong3)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0) {}
    }
    else
    {
      return paramLong1;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("System property '");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("' should be in range ");
    ((StringBuilder)localObject).append(paramLong2);
    ((StringBuilder)localObject).append("..");
    ((StringBuilder)localObject).append(paramLong3);
    ((StringBuilder)localObject).append(", but is '");
    ((StringBuilder)localObject).append(paramLong1);
    ((StringBuilder)localObject).append('\'');
    throw new IllegalStateException(((StringBuilder)localObject).toString().toString());
    label412:
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("System property '");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("' has unrecognized value '");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append('\'');
    throw new IllegalStateException(((StringBuilder)localObject).toString().toString());
  }
  
  public static void w(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    while (i < paramInt) {
      if (paramArrayOfObject[i] != null) {
        i++;
      } else {
        throw new NullPointerException(f.h("at index ", i));
      }
    }
  }
  
  public static int w0(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt4 & 0x4) != 0) {
      paramInt2 = 1;
    }
    if ((paramInt4 & 0x8) != 0) {
      paramInt3 = Integer.MAX_VALUE;
    }
    return (int)v0(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public static void x(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 < paramInt2)) {
      return;
    }
    throw new IndexOutOfBoundsException();
  }
  
  public static String x0(String paramString)
  {
    int i = paramString.length();
    for (int j = 0; j < i; j++)
    {
      int k = paramString.charAt(j);
      if ((k >= 65) && (k <= 90)) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0)
      {
        paramString = paramString.toCharArray();
        while (j < i)
        {
          int m = paramString[j];
          if ((m >= 65) && (m <= 90)) {
            k = 1;
          } else {
            k = 0;
          }
          if (k != 0) {
            paramString[j] = ((char)(char)(m ^ 0x20));
          }
          j++;
        }
        return String.valueOf(paramString);
      }
    }
    return paramString;
  }
  
  public static void y(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null) {
      return;
    }
    throw new NullPointerException(String.valueOf(paramObject2));
  }
  
  public static String y0(String paramString)
  {
    int i = paramString.length();
    for (int j = 0; j < i; j++)
    {
      int k = paramString.charAt(j);
      if ((k >= 97) && (k <= 122)) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0)
      {
        paramString = paramString.toCharArray();
        while (j < i)
        {
          int m = paramString[j];
          if ((m >= 97) && (m <= 122)) {
            k = 1;
          } else {
            k = 0;
          }
          if (k != 0) {
            paramString[j] = ((char)(char)(m ^ 0x20));
          }
          j++;
        }
        return String.valueOf(paramString);
      }
    }
    return paramString;
  }
  
  public static void z(String paramString, Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null) {
      return;
    }
    throw new NullPointerException(m0.X(paramString, new Object[] { paramObject2 }));
  }
  
  public static final Object z0(ub.e parame, ub.h paramh, dc.p paramp)
  {
    Object localObject = parame.getContext();
    boolean bool = ((Boolean)paramh.fold(Boolean.FALSE, nc.z.a)).booleanValue();
    int i = 0;
    if (!bool) {
      paramh = ((ub.h)localObject).plus(paramh);
    } else {
      paramh = nc.y.a((ub.h)localObject, paramh, false);
    }
    m0.C(paramh);
    if (paramh == localObject)
    {
      parame = new sc.s(parame, paramh);
      parame = t0(parame, parame, paramp);
    }
    else
    {
      f.a locala = f.a.a;
      if (ec.i.a(paramh.get(locala), ((ub.h)localObject).get(locala)))
      {
        parame = new g2(parame, paramh);
        paramh = c;
        localObject = w.c(paramh, null);
      }
      try
      {
        parame = t0(parame, parame, paramp);
        w.a(paramh, localObject);
      }
      finally
      {
        w.a(paramh, localObject);
      }
    }
    try
    {
      a0.C(m0.P(m0.u(parame, parame, paramp)), rb.h.a, null);
      paramh = o0.e;
      do
      {
        int j = paramh.get(parame);
        if (j != 0)
        {
          if (j == 2) {
            break;
          }
          throw new IllegalStateException("Already suspended".toString());
        }
      } while (!o0.e.compareAndSet(parame, 0, 1));
      i = 1;
      if (i != 0)
      {
        parame = vb.a.a;
      }
      else
      {
        parame = m0.f0(parame.F());
        if ((parame instanceof u)) {
          break label266;
        }
      }
      paramh = vb.a.a;
      return parame;
      label266:
      throw a;
    }
    finally
    {
      parame.resumeWith(rb.f.a(paramh));
    }
  }
}

/* Location:
 * Qualified Name:     x6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package R2;

import A2.n;
import D2.b;
import G2.c;
import G2.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.E7;
import com.google.android.gms.internal.measurement.H6;
import com.google.android.gms.internal.measurement.M6;
import com.google.android.gms.internal.measurement.S6;
import com.google.android.gms.internal.measurement.V1;
import com.google.android.gms.internal.measurement.V1.a;
import com.google.android.gms.internal.measurement.Y1.a;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Y3.b;
import com.google.android.gms.internal.measurement.a2.a;
import com.google.android.gms.internal.measurement.c2.a;
import com.google.android.gms.internal.measurement.d2;
import com.google.android.gms.internal.measurement.d2.a;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.h2.a;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.j3;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.o6;
import com.google.android.gms.internal.measurement.s7;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t.a;

public class D5
  implements o3
{
  public static volatile D5 H;
  public long A;
  public final Map B;
  public final Map C;
  public final Map D;
  public w4 E;
  public String F;
  public final U5 G = new K5(this);
  public x2 a;
  public f2 b;
  public p c;
  public j2 d;
  public x5 e;
  public b6 f;
  public final N5 g;
  public u4 h;
  public g5 i;
  public final B5 j;
  public u2 k;
  public final N2 l;
  public boolean m = false;
  public boolean n;
  public long o;
  public List p;
  public final Set q = new HashSet();
  public int r;
  public int s;
  public boolean t;
  public boolean u;
  public boolean v;
  public FileLock w;
  public FileChannel x;
  public List y;
  public List z;
  
  public D5(P5 paramP5)
  {
    this(paramP5, null);
  }
  
  public D5(P5 paramP5, N2 paramN2)
  {
    n.i(paramP5);
    l = N2.c(a, null, null);
    A = -1L;
    j = new B5(this);
    paramN2 = new N5(this);
    paramN2.v();
    g = paramN2;
    paramN2 = new f2(this);
    paramN2.v();
    b = paramN2;
    paramN2 = new x2(this);
    paramN2.v();
    a = paramN2;
    B = new HashMap();
    C = new HashMap();
    D = new HashMap();
    e().D(new G5(this, paramP5));
  }
  
  private final void G(List paramList)
  {
    n.a(paramList.isEmpty() ^ true);
    if (y != null)
    {
      j().G().a("Set uploading progress before finishing the previous upload");
      return;
    }
    y = new ArrayList(paramList);
  }
  
  private final void M()
  {
    e().n();
    if ((!t) && (!u) && (!v))
    {
      j().K().a("Stopping uploading service(s)");
      Object localObject = p;
      if (localObject == null) {
        return;
      }
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((Runnable)((Iterator)localObject).next()).run();
      }
      ((List)n.i(p)).clear();
      return;
    }
    j().K().d("Not stopping services. fetch, network, upload", Boolean.valueOf(t), Boolean.valueOf(u), Boolean.valueOf(v));
  }
  
  private final void N()
  {
    e().n();
    p0();
    long l1;
    if (o > 0L)
    {
      l1 = 3600000L - Math.abs(b().b() - o);
      if (l1 > 0L)
      {
        j().K().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(l1));
        v0().c();
        w0().z();
        return;
      }
      o = 0L;
    }
    if ((l.s()) && (O()))
    {
      long l2 = b().a();
      c0();
      l1 = Math.max(0L, ((Long)K.C.a(null)).longValue());
      int i1;
      if ((!e0().W0()) && (!e0().V0())) {
        i1 = 0;
      } else {
        i1 = 1;
      }
      Object localObject;
      if (i1 != 0)
      {
        localObject = c0().N();
        if ((!TextUtils.isEmpty((CharSequence)localObject)) && (!".none.".equals(localObject)))
        {
          c0();
          localObject = K.x;
        }
      }
      long l3;
      for (;;)
      {
        l3 = Math.max(0L, ((Long)((P1)localObject).a(null)).longValue());
        break;
        c0();
        localObject = K.w;
        continue;
        c0();
        localObject = K.v;
      }
      long l4 = i.g.a();
      long l5 = i.h.a();
      long l6 = Math.max(e0().z(), e0().A());
      if (l6 == 0L)
      {
        l1 = 0L;
      }
      else
      {
        l6 = l2 - Math.abs(l6 - l2);
        l4 = Math.abs(l4 - l2);
        l5 = l2 - Math.abs(l5 - l2);
        l4 = Math.max(l2 - l4, l5);
        l1 = l6 + l1;
        l2 = l1;
        if (i1 != 0)
        {
          l2 = l1;
          if (l4 > 0L) {
            l2 = Math.min(l6, l4) + l3;
          }
        }
        if (!m0().b0(l4, l3)) {
          l2 = l4 + l3;
        }
        l1 = l2;
        if (l5 != 0L)
        {
          l1 = l2;
          if (l5 >= l6)
          {
            i1 = 0;
            l1 = l2;
            for (;;)
            {
              c0();
              if (i1 >= Math.min(20, Math.max(0, ((Integer)K.E.a(null)).intValue()))) {
                break;
              }
              c0();
              l1 += Math.max(0L, ((Long)K.D.a(null)).longValue()) * (1L << i1);
              if (l1 > l5) {
                break label511;
              }
              i1++;
            }
          }
        }
      }
      label511:
      if (l1 == 0L)
      {
        j().K().a("Next upload time is 0");
        v0().c();
        w0().z();
        return;
      }
      if (!g0().A())
      {
        j().K().a("No network");
        v0().b();
        w0().z();
        return;
      }
      l5 = i.f.a();
      c0();
      l6 = Math.max(0L, ((Long)K.t.a(null)).longValue());
      l2 = l1;
      if (!m0().b0(l5, l6)) {
        l2 = Math.max(l1, l5 + l6);
      }
      v0().c();
      l2 -= b().a();
      l1 = l2;
      if (l2 <= 0L)
      {
        c0();
        l1 = Math.max(0L, ((Long)K.y.a(null)).longValue());
        i.g.b(b().a());
      }
      j().K().b("Upload scheduled in approximately ms", Long.valueOf(l1));
      w0().y(l1);
      return;
    }
    j().K().a("Nothing to upload or uploading impossible");
    v0().c();
    w0().z();
  }
  
  private final boolean O()
  {
    e().n();
    p0();
    return (e0().U0()) || (!TextUtils.isEmpty(e0().C()));
  }
  
  private final boolean P()
  {
    e().n();
    Object localObject1 = w;
    if ((localObject1 != null) && (((FileLock)localObject1).isValid()))
    {
      j().K().a("Storage concurrent access okay");
      return true;
    }
    Object localObject2 = new File(l.a().getFilesDir(), "google_app_measurement.db");
    try
    {
      localObject1 = new java/io/RandomAccessFile;
      ((RandomAccessFile)localObject1).<init>((File)localObject2, "rw");
      localObject1 = ((RandomAccessFile)localObject1).getChannel();
      x = ((FileChannel)localObject1);
      localObject1 = ((FileChannel)localObject1).tryLock();
      w = ((FileLock)localObject1);
      if (localObject1 != null)
      {
        j().K().a("Storage concurrent access okay");
        return true;
      }
    }
    catch (OverlappingFileLockException localOverlappingFileLockException)
    {
      break label138;
    }
    catch (IOException localIOException)
    {
      break label159;
    }
    catch (FileNotFoundException localFileNotFoundException) {}
    j().G().a("Storage concurrent data access panic");
    break label189;
    label138:
    localObject2 = j().L();
    String str = "Storage lock already acquired";
    for (;;)
    {
      ((a2)localObject2).b(str, localFileNotFoundException);
      break;
      label159:
      localObject2 = j().G();
      str = "Failed to access storage lock file";
      continue;
      localObject2 = j().G();
      str = "Failed to acquire storage lock";
    }
    label189:
    return false;
  }
  
  public static boolean d0(W5 paramW5)
  {
    return (!TextUtils.isEmpty(p)) || (!TextUtils.isEmpty(E));
  }
  
  public static C5 i(C5 paramC5)
  {
    if (paramC5 != null)
    {
      if (paramC5.w()) {
        return paramC5;
      }
      paramC5 = String.valueOf(paramC5.getClass());
      StringBuilder localStringBuilder = new StringBuilder("Component not initialized: ");
      localStringBuilder.append(paramC5);
      throw new IllegalStateException(localStringBuilder.toString());
    }
    throw new IllegalStateException("Upload Component not created");
  }
  
  public static D5 k(Context paramContext)
  {
    n.i(paramContext);
    n.i(paramContext.getApplicationContext());
    if (H == null)
    {
      try
      {
        if (H == null)
        {
          Object localObject = new R2/P5;
          ((P5)localObject).<init>(paramContext);
          paramContext = (P5)n.i(localObject);
          localObject = new R2/D5;
          ((D5)localObject).<init>(paramContext);
          H = (D5)localObject;
        }
      }
      finally
      {
        break label71;
      }
      break label76;
      label71:
      throw paramContext;
    }
    label76:
    return H;
  }
  
  public static void v(Y1.a parama, int paramInt, String paramString)
  {
    Object localObject = parama.L();
    for (int i1 = 0; i1 < ((List)localObject).size(); i1++) {
      if ("_err".equals(((com.google.android.gms.internal.measurement.a2)((List)localObject).get(i1)).c0())) {
        return;
      }
    }
    localObject = (com.google.android.gms.internal.measurement.a2)com.google.android.gms.internal.measurement.a2.Z().B("_err").y(paramInt).p();
    paramString = (com.google.android.gms.internal.measurement.a2)com.google.android.gms.internal.measurement.a2.Z().B("_ev").D(paramString).p();
    parama.C((com.google.android.gms.internal.measurement.a2)localObject).C(paramString);
  }
  
  public static void w(Y1.a parama, String paramString)
  {
    List localList = parama.L();
    for (int i1 = 0; i1 < localList.size(); i1++) {
      if (paramString.equals(((com.google.android.gms.internal.measurement.a2)localList.get(i1)).c0()))
      {
        parama.x(i1);
        return;
      }
    }
  }
  
  public final void A(String paramString, z paramz)
  {
    e().n();
    p0();
    if (n6.a())
    {
      C.put(paramString, paramz);
      e0().W(paramString, paramz);
    }
  }
  
  public final void B(String paramString, q3 paramq3)
  {
    e().n();
    p0();
    B.put(paramString, paramq3);
    e0().X(paramString, paramq3);
  }
  
  public final void C(String paramString, w4 paramw4)
  {
    e().n();
    String str = F;
    if ((str == null) || (str.equals(paramString)) || (paramw4 != null))
    {
      F = paramString;
      E = paramw4;
    }
  }
  
  public final void D(String paramString, W5 paramW5)
  {
    e().n();
    p0();
    if (!d0(paramW5)) {
      return;
    }
    if (!v)
    {
      g(paramW5);
      return;
    }
    if (("_npa".equals(paramString)) && (F != null))
    {
      j().F().a("Falling back to manifest metadata value for ad personalization");
      long l1 = b().a();
      long l2;
      if (F.booleanValue()) {
        l2 = 1L;
      } else {
        l2 = 0L;
      }
      u(new R5("_npa", l1, Long.valueOf(l2), "auto"), paramW5);
      return;
    }
    j().F().b("Removing user property", l.D().g(paramString));
    e0().Q0();
    try
    {
      g(paramW5);
      if ("_id".equals(paramString)) {
        e0().L0((String)n.i(o), "_lair");
      }
    }
    finally
    {
      break label248;
    }
    e0().L0((String)n.i(o), paramString);
    e0().T0();
    j().F().b("User property removed", l.D().g(paramString));
    e0().R0();
    return;
    label248:
    e0().R0();
    throw paramString;
  }
  
  public final void E(String paramString, d2.a parama)
  {
    Object localObject = h0().R(paramString);
    if (localObject != null) {
      parama.Z((Iterable)localObject);
    }
    if (h0().b0(paramString)) {
      parama.l0();
    }
    int i1;
    if (h0().e0(paramString)) {
      if (c0().B(paramString, K.B0))
      {
        localObject = parama.W0();
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          i1 = ((String)localObject).indexOf(".");
          if (i1 != -1) {
            parama.M0(((String)localObject).substring(0, i1));
          }
        }
      }
      else
      {
        parama.E0();
      }
    }
    if (h0().f0(paramString))
    {
      i1 = N5.y(parama, "_id");
      if (i1 != -1) {
        parama.R(i1);
      }
    }
    if (h0().d0(paramString)) {
      parama.p0();
    }
    if (h0().a0(paramString))
    {
      parama.c0();
      b localb = (b)D.get(paramString);
      if (localb != null)
      {
        localObject = localb;
        if (b + c0().x(paramString, K.W) >= b().b()) {}
      }
      else
      {
        localObject = new b(null);
        D.put(paramString, localObject);
      }
      parama.D0(a);
    }
    if (h0().c0(paramString)) {
      parama.N0();
    }
  }
  
  public final void F(String paramString, boolean paramBoolean)
  {
    paramString = e0().D0(paramString);
    if (paramString != null)
    {
      paramString.G(paramBoolean);
      if (paramString.s()) {
        e0().U(paramString);
      }
    }
  }
  
  public final void H(boolean paramBoolean)
  {
    N();
  }
  
  public final void I(boolean paramBoolean, int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte, String paramString)
  {
    e().n();
    p0();
    paramString = paramArrayOfByte;
    if (paramArrayOfByte == null) {
      try
      {
        paramString = new byte[0];
      }
      finally
      {
        break label628;
      }
    }
    paramArrayOfByte = (List)n.i(y);
    y = null;
    if (i6.a())
    {
      boolean bool = c0().s(K.Y0);
      if ((bool) && (!paramBoolean)) {}
    }
    else
    {
      if (((paramInt != 200) && (paramInt != 204)) || (paramThrowable != null)) {
        break label535;
      }
    }
    try
    {
      if ((i6.a()) && (c0().s(K.Y0))) {
        if (!paramBoolean) {
          break label143;
        }
      }
    }
    catch (SQLiteException paramThrowable)
    {
      break label485;
    }
    i.g.b(b().a());
    label143:
    i.h.b(0L);
    N();
    Object localObject;
    if (i6.a())
    {
      paramThrowable = c0();
      localObject = K.Y0;
      if ((paramThrowable.s((P1)localObject)) && (!paramBoolean))
      {
        if ((!i6.a()) || (!c0().s((P1)localObject))) {
          break label247;
        }
        j().K().a("Purged empty bundles");
        break label247;
      }
    }
    j().K().c("Successful upload. Got network response. code, size", Integer.valueOf(paramInt), Integer.valueOf(paramString.length));
    label247:
    e0().Q0();
    try
    {
      paramArrayOfByte = paramArrayOfByte.iterator();
      if (paramArrayOfByte.hasNext()) {
        paramThrowable = (Long)paramArrayOfByte.next();
      }
    }
    finally
    {
      List localList;
      do
      {
        try
        {
          for (;;)
          {
            paramString = e0();
            long l1 = paramThrowable.longValue();
            paramString.n();
            paramString.u();
            localObject = paramString.B();
            try
            {
              if (((SQLiteDatabase)localObject).delete("queue", "rowid=?", new String[] { String.valueOf(l1) }) != 1)
              {
                localObject = new android/database/sqlite/SQLiteException;
                ((SQLiteException)localObject).<init>("Deleted fewer rows from queue than expected");
                throw ((Throwable)localObject);
              }
            }
            catch (SQLiteException localSQLiteException)
            {
              paramString.j().G().b("Failed to delete a bundle in a queue table", localSQLiteException);
              throw localSQLiteException;
            }
          }
          paramThrowable = finally;
        }
        catch (SQLiteException paramString)
        {
          localList = z;
        }
      } while ((localList != null) && (localList.contains(paramThrowable)));
      throw paramString;
      e0().T0();
      e0().R0();
      z = null;
      if ((g0().A()) && (O()))
      {
        t0();
      }
      else
      {
        A = -1L;
        N();
      }
      o = 0L;
      break label618;
      e0().R0();
    }
    label485:
    j().G().b("Database error while trying to delete uploaded bundles", paramThrowable);
    o = b().b();
    j().K().b("Disable upload, time", Long.valueOf(o));
    break label618;
    label535:
    j().K().c("Network upload failed. Will retry later. code, error", Integer.valueOf(paramInt), paramThrowable);
    i.h.b(b().a());
    if ((paramInt == 503) || (paramInt == 429)) {
      i.f.b(b().a());
    }
    e0().a0(paramArrayOfByte);
    N();
    label618:
    u = false;
    M();
    return;
    label628:
    u = false;
    M();
    throw paramThrowable;
  }
  
  public final boolean J(int paramInt, FileChannel paramFileChannel)
  {
    e().n();
    if ((paramFileChannel != null) && (paramFileChannel.isOpen()))
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
      localByteBuffer.putInt(paramInt);
      localByteBuffer.flip();
      try
      {
        paramFileChannel.truncate(0L);
        paramFileChannel.write(localByteBuffer);
        paramFileChannel.force(true);
        if (paramFileChannel.size() != 4L) {
          j().G().b("Error writing to channel. Bytes written", Long.valueOf(paramFileChannel.size()));
        }
      }
      catch (IOException paramFileChannel)
      {
        break label94;
      }
      return true;
      label94:
      j().G().b("Failed to write to channel", paramFileChannel);
      return false;
    }
    j().G().a("Bad channel to read from");
    return false;
  }
  
  public final boolean K(Y1.a parama1, Y1.a parama2)
  {
    n.a("_e".equals(parama1.K()));
    m0();
    Object localObject = N5.G((com.google.android.gms.internal.measurement.Y1)parama1.p(), "_sc");
    String str = null;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((com.google.android.gms.internal.measurement.a2)localObject).d0();
    }
    m0();
    com.google.android.gms.internal.measurement.a2 locala2 = N5.G((com.google.android.gms.internal.measurement.Y1)parama2.p(), "_pc");
    if (locala2 != null) {
      str = locala2.d0();
    }
    if ((str != null) && (str.equals(localObject)))
    {
      n.a("_e".equals(parama1.K()));
      m0();
      localObject = N5.G((com.google.android.gms.internal.measurement.Y1)parama1.p(), "_et");
      if ((localObject != null) && (((com.google.android.gms.internal.measurement.a2)localObject).h0()) && (((com.google.android.gms.internal.measurement.a2)localObject).X() > 0L))
      {
        long l1 = ((com.google.android.gms.internal.measurement.a2)localObject).X();
        m0();
        localObject = N5.G((com.google.android.gms.internal.measurement.Y1)parama2.p(), "_et");
        long l2 = l1;
        if (localObject != null)
        {
          l2 = l1;
          if (((com.google.android.gms.internal.measurement.a2)localObject).X() > 0L) {
            l2 = l1 + ((com.google.android.gms.internal.measurement.a2)localObject).X();
          }
        }
        m0();
        N5.R(parama2, "_et", Long.valueOf(l2));
        m0();
        N5.R(parama1, "_fr", Long.valueOf(1L));
      }
      return true;
    }
    return false;
  }
  
  /* Error */
  public final boolean L(String paramString, long paramLong)
  {
    // Byte code:
    //   0: ldc_w 937
    //   3: astore 4
    //   5: aload_0
    //   6: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   9: invokevirtual 688	R2/p:Q0	()V
    //   12: new 8	R2/D5$a
    //   15: astore 5
    //   17: aload 5
    //   19: aload_0
    //   20: aconst_null
    //   21: invokespecial 940	R2/D5$a:<init>	(LR2/D5;LR2/L5;)V
    //   24: aload_0
    //   25: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   28: astore 6
    //   30: aload_0
    //   31: getfield 112	R2/D5:A	J
    //   34: lstore 7
    //   36: aload 5
    //   38: invokestatic 96	A2/n:i	(Ljava/lang/Object;)Ljava/lang/Object;
    //   41: pop
    //   42: aload 6
    //   44: invokevirtual 195	R2/m3:n	()V
    //   47: aload 6
    //   49: invokevirtual 827	R2/C5:u	()V
    //   52: aload 6
    //   54: invokevirtual 830	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   57: astore 9
    //   59: aconst_null
    //   60: invokestatic 337	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   63: istore 10
    //   65: ldc_w 942
    //   68: astore_1
    //   69: iload 10
    //   71: ifeq +248 -> 319
    //   74: lload 7
    //   76: ldc2_w 109
    //   79: lcmp
    //   80: istore 11
    //   82: iload 11
    //   84: ifeq +46 -> 130
    //   87: iconst_2
    //   88: anewarray 341	java/lang/String
    //   91: astore 12
    //   93: aload 12
    //   95: iconst_0
    //   96: lload 7
    //   98: invokestatic 837	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   101: aastore
    //   102: aload 12
    //   104: iconst_1
    //   105: lload_2
    //   106: invokestatic 837	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   109: aastore
    //   110: goto +34 -> 144
    //   113: astore_1
    //   114: aconst_null
    //   115: astore 13
    //   117: goto +5541 -> 5658
    //   120: astore 14
    //   122: aconst_null
    //   123: astore_1
    //   124: aconst_null
    //   125: astore 12
    //   127: goto +960 -> 1087
    //   130: iconst_1
    //   131: anewarray 341	java/lang/String
    //   134: astore 12
    //   136: aload 12
    //   138: iconst_0
    //   139: lload_2
    //   140: invokestatic 837	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   143: aastore
    //   144: iload 11
    //   146: ifeq +7 -> 153
    //   149: ldc_w 944
    //   152: astore_1
    //   153: new 506	java/lang/StringBuilder
    //   156: astore 13
    //   158: aload 13
    //   160: ldc_w 946
    //   163: invokespecial 510	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   166: aload 13
    //   168: aload_1
    //   169: invokevirtual 514	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: pop
    //   173: aload 13
    //   175: ldc_w 948
    //   178: invokevirtual 514	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: pop
    //   182: aload 9
    //   184: aload 13
    //   186: invokevirtual 519	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   189: aload 12
    //   191: invokevirtual 952	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   194: astore_1
    //   195: aload_1
    //   196: astore 13
    //   198: aload_1
    //   199: astore 12
    //   201: aload_1
    //   202: invokeinterface 957 1 0
    //   207: istore 10
    //   209: iload 10
    //   211: ifne +16 -> 227
    //   214: aload_1
    //   215: invokeinterface 960 1 0
    //   220: goto +898 -> 1118
    //   223: astore_1
    //   224: goto +5448 -> 5672
    //   227: aload_1
    //   228: astore 13
    //   230: aload_1
    //   231: astore 12
    //   233: aload_1
    //   234: iconst_0
    //   235: invokeinterface 964 2 0
    //   240: astore 15
    //   242: aload_1
    //   243: astore 13
    //   245: aload_1
    //   246: astore 14
    //   248: aload 15
    //   250: astore 16
    //   252: aload_1
    //   253: iconst_1
    //   254: invokeinterface 964 2 0
    //   259: astore 12
    //   261: aload_1
    //   262: astore 13
    //   264: aload_1
    //   265: astore 14
    //   267: aload 15
    //   269: astore 16
    //   271: aload_1
    //   272: invokeinterface 960 1 0
    //   277: aload 12
    //   279: astore 14
    //   281: aload 15
    //   283: astore 12
    //   285: aload_1
    //   286: astore 13
    //   288: goto +179 -> 467
    //   291: astore_1
    //   292: goto +5366 -> 5658
    //   295: astore 13
    //   297: aload 16
    //   299: astore 12
    //   301: aload 14
    //   303: astore_1
    //   304: aload 13
    //   306: astore 14
    //   308: goto +779 -> 1087
    //   311: astore 14
    //   313: aload 12
    //   315: astore_1
    //   316: goto -192 -> 124
    //   319: lload 7
    //   321: ldc2_w 109
    //   324: lcmp
    //   325: istore 11
    //   327: iload 11
    //   329: ifeq +26 -> 355
    //   332: iconst_2
    //   333: anewarray 341	java/lang/String
    //   336: astore 12
    //   338: aload 12
    //   340: iconst_0
    //   341: aconst_null
    //   342: aastore
    //   343: aload 12
    //   345: iconst_1
    //   346: lload 7
    //   348: invokestatic 837	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   351: aastore
    //   352: goto +13 -> 365
    //   355: iconst_1
    //   356: anewarray 341	java/lang/String
    //   359: dup
    //   360: iconst_0
    //   361: aconst_null
    //   362: aastore
    //   363: astore 12
    //   365: iload 11
    //   367: ifeq +7 -> 374
    //   370: ldc_w 966
    //   373: astore_1
    //   374: new 506	java/lang/StringBuilder
    //   377: astore 13
    //   379: aload 13
    //   381: ldc_w 968
    //   384: invokespecial 510	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   387: aload 13
    //   389: aload_1
    //   390: invokevirtual 514	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   393: pop
    //   394: aload 13
    //   396: ldc_w 970
    //   399: invokevirtual 514	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   402: pop
    //   403: aload 9
    //   405: aload 13
    //   407: invokevirtual 519	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   410: aload 12
    //   412: invokevirtual 952	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   415: astore_1
    //   416: aload_1
    //   417: astore 13
    //   419: aload_1
    //   420: astore 12
    //   422: aload_1
    //   423: invokeinterface 957 1 0
    //   428: ifne +6 -> 434
    //   431: goto -217 -> 214
    //   434: aload_1
    //   435: astore 13
    //   437: aload_1
    //   438: astore 12
    //   440: aload_1
    //   441: iconst_0
    //   442: invokeinterface 964 2 0
    //   447: astore 14
    //   449: aload_1
    //   450: astore 13
    //   452: aload_1
    //   453: astore 12
    //   455: aload_1
    //   456: invokeinterface 960 1 0
    //   461: aconst_null
    //   462: astore 12
    //   464: aload_1
    //   465: astore 13
    //   467: aload 9
    //   469: ldc_w 972
    //   472: iconst_1
    //   473: anewarray 341	java/lang/String
    //   476: dup
    //   477: iconst_0
    //   478: ldc_w 974
    //   481: aastore
    //   482: ldc_w 976
    //   485: iconst_2
    //   486: anewarray 341	java/lang/String
    //   489: dup
    //   490: iconst_0
    //   491: aload 12
    //   493: aastore
    //   494: dup
    //   495: iconst_1
    //   496: aload 14
    //   498: aastore
    //   499: aconst_null
    //   500: aconst_null
    //   501: ldc_w 978
    //   504: ldc_w 980
    //   507: invokevirtual 984	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   510: astore_1
    //   511: aload_1
    //   512: invokeinterface 957 1 0
    //   517: istore 10
    //   519: iload 10
    //   521: ifne +47 -> 568
    //   524: aload 6
    //   526: invokevirtual 847	R2/m3:j	()LR2/Y1;
    //   529: invokevirtual 178	R2/Y1:G	()LR2/a2;
    //   532: ldc_w 986
    //   535: aload 12
    //   537: invokestatic 989	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   540: invokevirtual 272	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   543: aload_1
    //   544: invokeinterface 960 1 0
    //   549: goto +569 -> 1118
    //   552: astore 12
    //   554: aload_1
    //   555: astore 13
    //   557: aload 12
    //   559: astore_1
    //   560: goto +5098 -> 5658
    //   563: astore 14
    //   565: goto +522 -> 1087
    //   568: aload_1
    //   569: iconst_0
    //   570: invokeinterface 993 2 0
    //   575: astore 13
    //   577: invokestatic 998	com/google/android/gms/internal/measurement/d2:A3	()Lcom/google/android/gms/internal/measurement/d2$a;
    //   580: aload 13
    //   582: invokestatic 1001	R2/N5:H	(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
    //   585: checkcast 717	com/google/android/gms/internal/measurement/d2$a
    //   588: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   591: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   594: checkcast 995	com/google/android/gms/internal/measurement/d2
    //   597: astore 13
    //   599: aload_1
    //   600: invokeinterface 1004 1 0
    //   605: istore 10
    //   607: iload 10
    //   609: ifeq +22 -> 631
    //   612: aload 6
    //   614: invokevirtual 847	R2/m3:j	()LR2/Y1;
    //   617: invokevirtual 479	R2/Y1:L	()LR2/a2;
    //   620: ldc_w 1006
    //   623: aload 12
    //   625: invokestatic 989	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   628: invokevirtual 272	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   631: aload_1
    //   632: invokeinterface 960 1 0
    //   637: aload 5
    //   639: aload 13
    //   641: invokeinterface 1011 2 0
    //   646: lload 7
    //   648: ldc2_w 109
    //   651: lcmp
    //   652: ifeq +35 -> 687
    //   655: ldc_w 1013
    //   658: astore 13
    //   660: iconst_3
    //   661: anewarray 341	java/lang/String
    //   664: dup
    //   665: iconst_0
    //   666: aload 12
    //   668: aastore
    //   669: dup
    //   670: iconst_1
    //   671: aload 14
    //   673: aastore
    //   674: dup
    //   675: iconst_2
    //   676: lload 7
    //   678: invokestatic 837	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   681: aastore
    //   682: astore 14
    //   684: goto +24 -> 708
    //   687: iconst_2
    //   688: anewarray 341	java/lang/String
    //   691: dup
    //   692: iconst_0
    //   693: aload 12
    //   695: aastore
    //   696: dup
    //   697: iconst_1
    //   698: aload 14
    //   700: aastore
    //   701: astore 14
    //   703: ldc_w 976
    //   706: astore 13
    //   708: aload 9
    //   710: ldc_w 1015
    //   713: iconst_4
    //   714: anewarray 341	java/lang/String
    //   717: dup
    //   718: iconst_0
    //   719: ldc_w 978
    //   722: aastore
    //   723: dup
    //   724: iconst_1
    //   725: ldc_w 1017
    //   728: aastore
    //   729: dup
    //   730: iconst_2
    //   731: ldc_w 1019
    //   734: aastore
    //   735: dup
    //   736: iconst_3
    //   737: ldc_w 1021
    //   740: aastore
    //   741: aload 13
    //   743: aload 14
    //   745: aconst_null
    //   746: aconst_null
    //   747: ldc_w 978
    //   750: aconst_null
    //   751: invokevirtual 984	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   754: astore 15
    //   756: aload 15
    //   758: astore 13
    //   760: aload 15
    //   762: astore 14
    //   764: aload 12
    //   766: astore 16
    //   768: aload 15
    //   770: invokeinterface 957 1 0
    //   775: ifne +40 -> 815
    //   778: aload 15
    //   780: astore 13
    //   782: aload 15
    //   784: astore 14
    //   786: aload 12
    //   788: astore 16
    //   790: aload 6
    //   792: invokevirtual 847	R2/m3:j	()LR2/Y1;
    //   795: invokevirtual 479	R2/Y1:L	()LR2/a2;
    //   798: ldc_w 1023
    //   801: aload 12
    //   803: invokestatic 989	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   806: invokevirtual 272	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   809: aload 15
    //   811: astore_1
    //   812: goto -598 -> 214
    //   815: aload 15
    //   817: astore 13
    //   819: aload 15
    //   821: astore 14
    //   823: aload 12
    //   825: astore 16
    //   827: aload 15
    //   829: iconst_0
    //   830: invokeinterface 1027 2 0
    //   835: lstore_2
    //   836: aload 15
    //   838: astore 13
    //   840: aload 15
    //   842: astore 14
    //   844: aload 12
    //   846: astore 16
    //   848: aload 15
    //   850: iconst_3
    //   851: invokeinterface 993 2 0
    //   856: astore_1
    //   857: aload 15
    //   859: astore 13
    //   861: aload 15
    //   863: astore 14
    //   865: aload 12
    //   867: astore 16
    //   869: invokestatic 1030	com/google/android/gms/internal/measurement/Y1:Z	()Lcom/google/android/gms/internal/measurement/Y1$a;
    //   872: aload_1
    //   873: invokestatic 1001	R2/N5:H	(Lcom/google/android/gms/internal/measurement/L4;[B)Lcom/google/android/gms/internal/measurement/L4;
    //   876: checkcast 578	com/google/android/gms/internal/measurement/Y1$a
    //   879: astore_1
    //   880: aload 15
    //   882: astore 13
    //   884: aload 15
    //   886: astore 14
    //   888: aload 12
    //   890: astore 16
    //   892: aload_1
    //   893: aload 15
    //   895: iconst_1
    //   896: invokeinterface 964 2 0
    //   901: invokevirtual 1033	com/google/android/gms/internal/measurement/Y1$a:E	(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/Y1$a;
    //   904: aload 15
    //   906: iconst_2
    //   907: invokeinterface 1027 2 0
    //   912: invokevirtual 1036	com/google/android/gms/internal/measurement/Y1$a:G	(J)Lcom/google/android/gms/internal/measurement/Y1$a;
    //   915: pop
    //   916: aload 15
    //   918: astore 13
    //   920: aload 15
    //   922: astore 14
    //   924: aload 12
    //   926: astore 16
    //   928: aload 5
    //   930: lload_2
    //   931: aload_1
    //   932: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   935: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   938: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   941: invokeinterface 1039 4 0
    //   946: ifne +42 -> 988
    //   949: aload 15
    //   951: astore_1
    //   952: goto -738 -> 214
    //   955: astore_1
    //   956: aload 15
    //   958: astore 13
    //   960: aload 15
    //   962: astore 14
    //   964: aload 12
    //   966: astore 16
    //   968: aload 6
    //   970: invokevirtual 847	R2/m3:j	()LR2/Y1;
    //   973: invokevirtual 178	R2/Y1:G	()LR2/a2;
    //   976: ldc_w 1041
    //   979: aload 12
    //   981: invokestatic 989	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   984: aload_1
    //   985: invokevirtual 575	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   988: aload 15
    //   990: astore 13
    //   992: aload 15
    //   994: astore 14
    //   996: aload 12
    //   998: astore 16
    //   1000: aload 15
    //   1002: invokeinterface 1004 1 0
    //   1007: istore 10
    //   1009: iload 10
    //   1011: ifne -196 -> 815
    //   1014: aload 15
    //   1016: astore_1
    //   1017: goto -803 -> 214
    //   1020: astore 12
    //   1022: aload_1
    //   1023: astore 13
    //   1025: aload 12
    //   1027: astore_1
    //   1028: goto +4630 -> 5658
    //   1031: astore 13
    //   1033: goto -729 -> 304
    //   1036: astore 12
    //   1038: goto -16 -> 1022
    //   1041: astore 13
    //   1043: goto -10 -> 1033
    //   1046: astore 13
    //   1048: aload 6
    //   1050: invokevirtual 847	R2/m3:j	()LR2/Y1;
    //   1053: invokevirtual 178	R2/Y1:G	()LR2/a2;
    //   1056: ldc_w 1043
    //   1059: aload 12
    //   1061: invokestatic 989	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   1064: aload 13
    //   1066: invokevirtual 575	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1069: aload_1
    //   1070: invokeinterface 960 1 0
    //   1075: goto +43 -> 1118
    //   1078: astore_1
    //   1079: goto +4579 -> 5658
    //   1082: astore 14
    //   1084: aload 13
    //   1086: astore_1
    //   1087: aload_1
    //   1088: astore 13
    //   1090: aload 6
    //   1092: invokevirtual 847	R2/m3:j	()LR2/Y1;
    //   1095: invokevirtual 178	R2/Y1:G	()LR2/a2;
    //   1098: ldc_w 1045
    //   1101: aload 12
    //   1103: invokestatic 989	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   1106: aload 14
    //   1108: invokevirtual 575	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1111: aload_1
    //   1112: ifnull +6 -> 1118
    //   1115: goto -901 -> 214
    //   1118: aload 5
    //   1120: getfield 1047	R2/D5$a:c	Ljava/util/List;
    //   1123: astore_1
    //   1124: aload_1
    //   1125: ifnull +4517 -> 5642
    //   1128: aload_1
    //   1129: invokeinterface 165 1 0
    //   1134: ifeq +6 -> 1140
    //   1137: goto +4505 -> 5642
    //   1140: aload 5
    //   1142: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   1145: invokevirtual 1053	com/google/android/gms/internal/measurement/Y3:x	()Lcom/google/android/gms/internal/measurement/Y3$b;
    //   1148: checkcast 717	com/google/android/gms/internal/measurement/d2$a
    //   1151: invokevirtual 1055	com/google/android/gms/internal/measurement/d2$a:t0	()Lcom/google/android/gms/internal/measurement/d2$a;
    //   1154: astore 16
    //   1156: aconst_null
    //   1157: astore 12
    //   1159: aconst_null
    //   1160: astore 13
    //   1162: iconst_0
    //   1163: istore 17
    //   1165: iconst_0
    //   1166: istore 11
    //   1168: iconst_0
    //   1169: istore 10
    //   1171: iconst_m1
    //   1172: istore 18
    //   1174: iconst_m1
    //   1175: istore 19
    //   1177: aload 4
    //   1179: astore_1
    //   1180: aload 5
    //   1182: getfield 1047	R2/D5$a:c	Ljava/util/List;
    //   1185: invokeinterface 584 1 0
    //   1190: istore 20
    //   1192: ldc_w 925
    //   1195: astore 6
    //   1197: ldc_w 934
    //   1200: astore 9
    //   1202: iload 17
    //   1204: iload 20
    //   1206: if_icmpge +1740 -> 2946
    //   1209: aload 5
    //   1211: getfield 1047	R2/D5$a:c	Ljava/util/List;
    //   1214: iload 17
    //   1216: invokeinterface 590 2 0
    //   1221: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   1224: invokevirtual 1053	com/google/android/gms/internal/measurement/Y3:x	()Lcom/google/android/gms/internal/measurement/Y3$b;
    //   1227: checkcast 578	com/google/android/gms/internal/measurement/Y1$a
    //   1230: astore 15
    //   1232: aload_0
    //   1233: invokevirtual 711	R2/D5:h0	()LR2/x2;
    //   1236: aload 5
    //   1238: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   1241: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   1244: aload 15
    //   1246: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   1249: invokevirtual 1061	R2/x2:O	(Ljava/lang/String;Ljava/lang/String;)Z
    //   1252: istore 21
    //   1254: iload 21
    //   1256: ifeq +129 -> 1385
    //   1259: aload_0
    //   1260: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   1263: invokevirtual 479	R2/Y1:L	()LR2/a2;
    //   1266: ldc_w 1063
    //   1269: aload 5
    //   1271: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   1274: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   1277: invokestatic 989	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   1280: aload_0
    //   1281: getfield 108	R2/D5:l	LR2/N2;
    //   1284: invokevirtual 680	R2/N2:D	()LR2/X1;
    //   1287: aload 15
    //   1289: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   1292: invokevirtual 1065	R2/X1:c	(Ljava/lang/String;)Ljava/lang/String;
    //   1295: invokevirtual 575	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1298: aload_0
    //   1299: invokevirtual 711	R2/D5:h0	()LR2/x2;
    //   1302: aload 5
    //   1304: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   1307: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   1310: invokevirtual 1067	R2/x2:X	(Ljava/lang/String;)Z
    //   1313: ifne +69 -> 1382
    //   1316: aload_0
    //   1317: invokevirtual 711	R2/D5:h0	()LR2/x2;
    //   1320: aload 5
    //   1322: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   1325: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   1328: invokevirtual 1069	R2/x2:Z	(Ljava/lang/String;)Z
    //   1331: ifeq +6 -> 1337
    //   1334: goto +48 -> 1382
    //   1337: ldc_w 586
    //   1340: aload 15
    //   1342: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   1345: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1348: ifne +34 -> 1382
    //   1351: aload_0
    //   1352: invokevirtual 1073	R2/D5:n0	()LR2/S5;
    //   1355: pop
    //   1356: aload_0
    //   1357: getfield 91	R2/D5:G	LR2/U5;
    //   1360: aload 5
    //   1362: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   1365: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   1368: bipush 11
    //   1370: ldc_w 614
    //   1373: aload 15
    //   1375: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   1378: iconst_0
    //   1379: invokestatic 1078	R2/S5:N	(LR2/U5;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
    //   1382: goto +1558 -> 2940
    //   1385: aload_1
    //   1386: astore 14
    //   1388: aload 15
    //   1390: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   1393: aload_1
    //   1394: invokestatic 1082	R2/r3:a	(Ljava/lang/String;)Ljava/lang/String;
    //   1397: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1400: ifeq +126 -> 1526
    //   1403: aload 15
    //   1405: aload_1
    //   1406: invokevirtual 1033	com/google/android/gms/internal/measurement/Y1$a:E	(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/Y1$a;
    //   1409: pop
    //   1410: aload_0
    //   1411: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   1414: invokevirtual 204	R2/Y1:K	()LR2/a2;
    //   1417: ldc_w 1084
    //   1420: invokevirtual 185	R2/a2:a	(Ljava/lang/String;)V
    //   1423: aload_1
    //   1424: astore 14
    //   1426: aload_0
    //   1427: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   1430: iconst_5
    //   1431: invokevirtual 1087	R2/Y1:C	(I)Z
    //   1434: ifeq +92 -> 1526
    //   1437: iconst_0
    //   1438: istore 20
    //   1440: aload_1
    //   1441: astore 14
    //   1443: iload 20
    //   1445: aload 15
    //   1447: invokevirtual 1089	com/google/android/gms/internal/measurement/Y1$a:w	()I
    //   1450: if_icmpge +76 -> 1526
    //   1453: ldc_w 1091
    //   1456: aload 15
    //   1458: iload 20
    //   1460: invokevirtual 1094	com/google/android/gms/internal/measurement/Y1$a:H	(I)Lcom/google/android/gms/internal/measurement/a2;
    //   1463: invokevirtual 594	com/google/android/gms/internal/measurement/a2:c0	()Ljava/lang/String;
    //   1466: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1469: ifeq +51 -> 1520
    //   1472: aload 15
    //   1474: iload 20
    //   1476: invokevirtual 1094	com/google/android/gms/internal/measurement/Y1$a:H	(I)Lcom/google/android/gms/internal/measurement/a2;
    //   1479: invokevirtual 921	com/google/android/gms/internal/measurement/a2:d0	()Ljava/lang/String;
    //   1482: invokevirtual 1095	java/lang/String:isEmpty	()Z
    //   1485: ifne +35 -> 1520
    //   1488: ldc_w 1097
    //   1491: aload 15
    //   1493: iload 20
    //   1495: invokevirtual 1094	com/google/android/gms/internal/measurement/Y1$a:H	(I)Lcom/google/android/gms/internal/measurement/a2;
    //   1498: invokevirtual 921	com/google/android/gms/internal/measurement/a2:d0	()Ljava/lang/String;
    //   1501: invokevirtual 1100	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1504: ifeq +16 -> 1520
    //   1507: aload_0
    //   1508: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   1511: invokevirtual 1102	R2/Y1:M	()LR2/a2;
    //   1514: ldc_w 1104
    //   1517: invokevirtual 185	R2/a2:a	(Ljava/lang/String;)V
    //   1520: iinc 20 1
    //   1523: goto -83 -> 1440
    //   1526: aload 14
    //   1528: astore 4
    //   1530: aload_0
    //   1531: invokevirtual 711	R2/D5:h0	()LR2/x2;
    //   1534: aload 5
    //   1536: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   1539: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   1542: aload 15
    //   1544: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   1547: invokevirtual 1106	R2/x2:M	(Ljava/lang/String;Ljava/lang/String;)Z
    //   1550: istore 22
    //   1552: iload 22
    //   1554: ifne +65 -> 1619
    //   1557: aload_0
    //   1558: invokevirtual 374	R2/D5:m0	()LR2/N5;
    //   1561: pop
    //   1562: aload 15
    //   1564: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   1567: astore_1
    //   1568: aload_1
    //   1569: invokestatic 1108	A2/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   1572: pop
    //   1573: aload_1
    //   1574: invokevirtual 1111	java/lang/String:hashCode	()I
    //   1577: ldc_w 1112
    //   1580: if_icmpeq +6 -> 1586
    //   1583: goto +16 -> 1599
    //   1586: aload_1
    //   1587: ldc_w 1114
    //   1590: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1593: ifeq +6 -> 1599
    //   1596: goto +23 -> 1619
    //   1599: aload 13
    //   1601: astore_1
    //   1602: ldc_w 925
    //   1605: astore 9
    //   1607: ldc_w 934
    //   1610: astore 23
    //   1612: iload 10
    //   1614: istore 21
    //   1616: goto +714 -> 2330
    //   1619: iconst_0
    //   1620: istore 24
    //   1622: iconst_0
    //   1623: istore 25
    //   1625: iconst_0
    //   1626: istore 20
    //   1628: aload 9
    //   1630: astore_1
    //   1631: aload 6
    //   1633: astore 14
    //   1635: aload 15
    //   1637: invokevirtual 1089	com/google/android/gms/internal/measurement/Y1$a:w	()I
    //   1640: istore 26
    //   1642: iload 20
    //   1644: iload 26
    //   1646: if_icmpge +127 -> 1773
    //   1649: ldc_w 1116
    //   1652: aload 15
    //   1654: iload 20
    //   1656: invokevirtual 1094	com/google/android/gms/internal/measurement/Y1$a:H	(I)Lcom/google/android/gms/internal/measurement/a2;
    //   1659: invokevirtual 594	com/google/android/gms/internal/measurement/a2:c0	()Ljava/lang/String;
    //   1662: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1665: ifeq +43 -> 1708
    //   1668: aload 15
    //   1670: iload 20
    //   1672: aload 15
    //   1674: iload 20
    //   1676: invokevirtual 1094	com/google/android/gms/internal/measurement/Y1$a:H	(I)Lcom/google/android/gms/internal/measurement/a2;
    //   1679: invokevirtual 1053	com/google/android/gms/internal/measurement/Y3:x	()Lcom/google/android/gms/internal/measurement/Y3$b;
    //   1682: checkcast 599	com/google/android/gms/internal/measurement/a2$a
    //   1685: lconst_1
    //   1686: invokevirtual 605	com/google/android/gms/internal/measurement/a2$a:y	(J)Lcom/google/android/gms/internal/measurement/a2$a;
    //   1689: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   1692: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   1695: checkcast 592	com/google/android/gms/internal/measurement/a2
    //   1698: invokevirtual 1119	com/google/android/gms/internal/measurement/Y1$a:z	(ILcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;
    //   1701: pop
    //   1702: iconst_1
    //   1703: istore 24
    //   1705: goto +62 -> 1767
    //   1708: ldc_w 1121
    //   1711: aload 15
    //   1713: iload 20
    //   1715: invokevirtual 1094	com/google/android/gms/internal/measurement/Y1$a:H	(I)Lcom/google/android/gms/internal/measurement/a2;
    //   1718: invokevirtual 594	com/google/android/gms/internal/measurement/a2:c0	()Ljava/lang/String;
    //   1721: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1724: ifeq +43 -> 1767
    //   1727: aload 15
    //   1729: iload 20
    //   1731: aload 15
    //   1733: iload 20
    //   1735: invokevirtual 1094	com/google/android/gms/internal/measurement/Y1$a:H	(I)Lcom/google/android/gms/internal/measurement/a2;
    //   1738: invokevirtual 1053	com/google/android/gms/internal/measurement/Y3:x	()Lcom/google/android/gms/internal/measurement/Y3$b;
    //   1741: checkcast 599	com/google/android/gms/internal/measurement/a2$a
    //   1744: lconst_1
    //   1745: invokevirtual 605	com/google/android/gms/internal/measurement/a2$a:y	(J)Lcom/google/android/gms/internal/measurement/a2$a;
    //   1748: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   1751: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   1754: checkcast 592	com/google/android/gms/internal/measurement/a2
    //   1757: invokevirtual 1119	com/google/android/gms/internal/measurement/Y1$a:z	(ILcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;
    //   1760: pop
    //   1761: iconst_1
    //   1762: istore 25
    //   1764: goto +3 -> 1767
    //   1767: iinc 20 1
    //   1770: goto -135 -> 1635
    //   1773: aload_1
    //   1774: astore 6
    //   1776: iload 24
    //   1778: ifne +58 -> 1836
    //   1781: iload 22
    //   1783: ifeq +53 -> 1836
    //   1786: aload_0
    //   1787: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   1790: invokevirtual 204	R2/Y1:K	()LR2/a2;
    //   1793: ldc_w 1123
    //   1796: aload_0
    //   1797: getfield 108	R2/D5:l	LR2/N2;
    //   1800: invokevirtual 680	R2/N2:D	()LR2/X1;
    //   1803: aload 15
    //   1805: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   1808: invokevirtual 1065	R2/X1:c	(Ljava/lang/String;)Ljava/lang/String;
    //   1811: invokevirtual 272	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   1814: aload 15
    //   1816: invokestatic 597	com/google/android/gms/internal/measurement/a2:Z	()Lcom/google/android/gms/internal/measurement/a2$a;
    //   1819: ldc_w 1116
    //   1822: invokevirtual 602	com/google/android/gms/internal/measurement/a2$a:B	(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;
    //   1825: lconst_1
    //   1826: invokevirtual 605	com/google/android/gms/internal/measurement/a2$a:y	(J)Lcom/google/android/gms/internal/measurement/a2$a;
    //   1829: invokevirtual 1126	com/google/android/gms/internal/measurement/Y1$a:B	(Lcom/google/android/gms/internal/measurement/a2$a;)Lcom/google/android/gms/internal/measurement/Y1$a;
    //   1832: pop
    //   1833: goto +3 -> 1836
    //   1836: iload 25
    //   1838: ifne +50 -> 1888
    //   1841: aload_0
    //   1842: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   1845: invokevirtual 204	R2/Y1:K	()LR2/a2;
    //   1848: ldc_w 1128
    //   1851: aload_0
    //   1852: getfield 108	R2/D5:l	LR2/N2;
    //   1855: invokevirtual 680	R2/N2:D	()LR2/X1;
    //   1858: aload 15
    //   1860: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   1863: invokevirtual 1065	R2/X1:c	(Ljava/lang/String;)Ljava/lang/String;
    //   1866: invokevirtual 272	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   1869: aload 15
    //   1871: invokestatic 597	com/google/android/gms/internal/measurement/a2:Z	()Lcom/google/android/gms/internal/measurement/a2$a;
    //   1874: ldc_w 1121
    //   1877: invokevirtual 602	com/google/android/gms/internal/measurement/a2$a:B	(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;
    //   1880: lconst_1
    //   1881: invokevirtual 605	com/google/android/gms/internal/measurement/a2$a:y	(J)Lcom/google/android/gms/internal/measurement/a2$a;
    //   1884: invokevirtual 1126	com/google/android/gms/internal/measurement/Y1$a:B	(Lcom/google/android/gms/internal/measurement/a2$a;)Lcom/google/android/gms/internal/measurement/Y1$a;
    //   1887: pop
    //   1888: aload_0
    //   1889: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   1892: aload_0
    //   1893: invokevirtual 1131	R2/D5:u0	()J
    //   1896: aload 5
    //   1898: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   1901: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   1904: iconst_0
    //   1905: iconst_0
    //   1906: iconst_0
    //   1907: iconst_0
    //   1908: iconst_1
    //   1909: invokevirtual 1134	R2/p:I	(JLjava/lang/String;ZZZZZ)LR2/q;
    //   1912: getfield 1138	R2/q:e	J
    //   1915: lstore_2
    //   1916: aload_0
    //   1917: invokevirtual 299	R2/D5:c0	()LR2/g;
    //   1920: aload 5
    //   1922: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   1925: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   1928: invokevirtual 1140	R2/g:A	(Ljava/lang/String;)I
    //   1931: istore 20
    //   1933: lload_2
    //   1934: iload 20
    //   1936: i2l
    //   1937: lcmp
    //   1938: ifle +14 -> 1952
    //   1941: aload 15
    //   1943: ldc_w 1121
    //   1946: invokestatic 1142	R2/D5:w	(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;)V
    //   1949: goto +6 -> 1955
    //   1952: iconst_1
    //   1953: istore 10
    //   1955: aload 13
    //   1957: astore_1
    //   1958: iload 10
    //   1960: istore 21
    //   1962: aload 14
    //   1964: astore 9
    //   1966: aload 6
    //   1968: astore 23
    //   1970: aload 15
    //   1972: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   1975: invokestatic 1145	R2/S5:J0	(Ljava/lang/String;)Z
    //   1978: ifeq +352 -> 2330
    //   1981: aload 13
    //   1983: astore_1
    //   1984: iload 10
    //   1986: istore 21
    //   1988: aload 14
    //   1990: astore 9
    //   1992: aload 6
    //   1994: astore 23
    //   1996: iload 22
    //   1998: ifeq +332 -> 2330
    //   2001: aload 13
    //   2003: astore_1
    //   2004: iload 10
    //   2006: istore 21
    //   2008: aload 14
    //   2010: astore 9
    //   2012: aload 6
    //   2014: astore 23
    //   2016: aload_0
    //   2017: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   2020: aload_0
    //   2021: invokevirtual 1131	R2/D5:u0	()J
    //   2024: aload 5
    //   2026: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   2029: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   2032: iconst_0
    //   2033: iconst_0
    //   2034: iconst_1
    //   2035: iconst_0
    //   2036: iconst_0
    //   2037: invokevirtual 1134	R2/p:I	(JLjava/lang/String;ZZZZZ)LR2/q;
    //   2040: getfield 1147	R2/q:c	J
    //   2043: aload_0
    //   2044: invokevirtual 299	R2/D5:c0	()LR2/g;
    //   2047: aload 5
    //   2049: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   2052: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   2055: getstatic 1149	R2/K:p	LR2/P1;
    //   2058: invokevirtual 1152	R2/g:u	(Ljava/lang/String;LR2/P1;)I
    //   2061: i2l
    //   2062: lcmp
    //   2063: ifle +267 -> 2330
    //   2066: aload_0
    //   2067: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   2070: invokevirtual 479	R2/Y1:L	()LR2/a2;
    //   2073: ldc_w 1154
    //   2076: aload 5
    //   2078: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   2081: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   2084: invokestatic 989	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   2087: invokevirtual 272	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   2090: iconst_m1
    //   2091: istore 25
    //   2093: aconst_null
    //   2094: astore_1
    //   2095: iconst_0
    //   2096: istore 24
    //   2098: iconst_0
    //   2099: istore 20
    //   2101: iload 20
    //   2103: aload 15
    //   2105: invokevirtual 1089	com/google/android/gms/internal/measurement/Y1$a:w	()I
    //   2108: if_icmpge +87 -> 2195
    //   2111: aload 15
    //   2113: iload 20
    //   2115: invokevirtual 1094	com/google/android/gms/internal/measurement/Y1$a:H	(I)Lcom/google/android/gms/internal/measurement/a2;
    //   2118: astore 23
    //   2120: ldc_w 1116
    //   2123: aload 23
    //   2125: invokevirtual 594	com/google/android/gms/internal/measurement/a2:c0	()Ljava/lang/String;
    //   2128: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2131: ifeq +20 -> 2151
    //   2134: aload 23
    //   2136: invokevirtual 1053	com/google/android/gms/internal/measurement/Y3:x	()Lcom/google/android/gms/internal/measurement/Y3$b;
    //   2139: checkcast 599	com/google/android/gms/internal/measurement/a2$a
    //   2142: astore 9
    //   2144: iload 20
    //   2146: istore 26
    //   2148: goto +34 -> 2182
    //   2151: iload 25
    //   2153: istore 26
    //   2155: aload_1
    //   2156: astore 9
    //   2158: ldc_w 586
    //   2161: aload 23
    //   2163: invokevirtual 594	com/google/android/gms/internal/measurement/a2:c0	()Ljava/lang/String;
    //   2166: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2169: ifeq +13 -> 2182
    //   2172: iconst_1
    //   2173: istore 24
    //   2175: aload_1
    //   2176: astore 9
    //   2178: iload 25
    //   2180: istore 26
    //   2182: iinc 20 1
    //   2185: iload 26
    //   2187: istore 25
    //   2189: aload 9
    //   2191: astore_1
    //   2192: goto -91 -> 2101
    //   2195: iload 24
    //   2197: ifeq +33 -> 2230
    //   2200: aload_1
    //   2201: ifnull +29 -> 2230
    //   2204: aload 15
    //   2206: iload 25
    //   2208: invokevirtual 623	com/google/android/gms/internal/measurement/Y1$a:x	(I)Lcom/google/android/gms/internal/measurement/Y1$a;
    //   2211: pop
    //   2212: aload 13
    //   2214: astore_1
    //   2215: iload 10
    //   2217: istore 21
    //   2219: aload 14
    //   2221: astore 9
    //   2223: aload 6
    //   2225: astore 23
    //   2227: goto +103 -> 2330
    //   2230: aload_1
    //   2231: ifnull +60 -> 2291
    //   2234: aload 15
    //   2236: iload 25
    //   2238: aload_1
    //   2239: invokevirtual 1159	com/google/android/gms/internal/measurement/k3:clone	()Ljava/lang/Object;
    //   2242: checkcast 607	com/google/android/gms/internal/measurement/Y3$b
    //   2245: checkcast 599	com/google/android/gms/internal/measurement/a2$a
    //   2248: ldc_w 586
    //   2251: invokevirtual 602	com/google/android/gms/internal/measurement/a2$a:B	(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;
    //   2254: ldc2_w 1160
    //   2257: invokevirtual 605	com/google/android/gms/internal/measurement/a2$a:y	(J)Lcom/google/android/gms/internal/measurement/a2$a;
    //   2260: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   2263: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   2266: checkcast 592	com/google/android/gms/internal/measurement/a2
    //   2269: invokevirtual 1119	com/google/android/gms/internal/measurement/Y1$a:z	(ILcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;
    //   2272: pop
    //   2273: aload 13
    //   2275: astore_1
    //   2276: iload 10
    //   2278: istore 21
    //   2280: aload 14
    //   2282: astore 9
    //   2284: aload 6
    //   2286: astore 23
    //   2288: goto +42 -> 2330
    //   2291: aload_0
    //   2292: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   2295: invokevirtual 178	R2/Y1:G	()LR2/a2;
    //   2298: ldc_w 1163
    //   2301: aload 5
    //   2303: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   2306: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   2309: invokestatic 989	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   2312: invokevirtual 272	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   2315: aload 6
    //   2317: astore 23
    //   2319: aload 14
    //   2321: astore 9
    //   2323: iload 10
    //   2325: istore 21
    //   2327: aload 13
    //   2329: astore_1
    //   2330: iload 22
    //   2332: ifeq +201 -> 2533
    //   2335: new 187	java/util/ArrayList
    //   2338: astore 13
    //   2340: aload 13
    //   2342: aload 15
    //   2344: invokevirtual 581	com/google/android/gms/internal/measurement/Y1$a:L	()Ljava/util/List;
    //   2347: invokespecial 190	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   2350: iconst_0
    //   2351: istore 20
    //   2353: iconst_m1
    //   2354: istore 25
    //   2356: iconst_m1
    //   2357: istore 24
    //   2359: aload 13
    //   2361: invokeinterface 584 1 0
    //   2366: istore 26
    //   2368: iload 20
    //   2370: iload 26
    //   2372: if_icmpge +80 -> 2452
    //   2375: ldc_w 1165
    //   2378: aload 13
    //   2380: iload 20
    //   2382: invokeinterface 590 2 0
    //   2387: checkcast 592	com/google/android/gms/internal/measurement/a2
    //   2390: invokevirtual 594	com/google/android/gms/internal/measurement/a2:c0	()Ljava/lang/String;
    //   2393: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2396: ifeq +10 -> 2406
    //   2399: iload 20
    //   2401: istore 26
    //   2403: goto +39 -> 2442
    //   2406: iload 25
    //   2408: istore 26
    //   2410: ldc_w 1167
    //   2413: aload 13
    //   2415: iload 20
    //   2417: invokeinterface 590 2 0
    //   2422: checkcast 592	com/google/android/gms/internal/measurement/a2
    //   2425: invokevirtual 594	com/google/android/gms/internal/measurement/a2:c0	()Ljava/lang/String;
    //   2428: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2431: ifeq +11 -> 2442
    //   2434: iload 20
    //   2436: istore 24
    //   2438: iload 25
    //   2440: istore 26
    //   2442: iinc 20 1
    //   2445: iload 26
    //   2447: istore 25
    //   2449: goto -90 -> 2359
    //   2452: iload 25
    //   2454: iconst_m1
    //   2455: if_icmpeq +78 -> 2533
    //   2458: aload 13
    //   2460: iload 25
    //   2462: invokeinterface 590 2 0
    //   2467: checkcast 592	com/google/android/gms/internal/measurement/a2
    //   2470: invokevirtual 927	com/google/android/gms/internal/measurement/a2:h0	()Z
    //   2473: ifne +63 -> 2536
    //   2476: aload 13
    //   2478: iload 25
    //   2480: invokeinterface 590 2 0
    //   2485: checkcast 592	com/google/android/gms/internal/measurement/a2
    //   2488: invokevirtual 1169	com/google/android/gms/internal/measurement/a2:f0	()Z
    //   2491: ifne +45 -> 2536
    //   2494: aload_0
    //   2495: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   2498: invokevirtual 1102	R2/Y1:M	()LR2/a2;
    //   2501: ldc_w 1171
    //   2504: invokevirtual 185	R2/a2:a	(Ljava/lang/String;)V
    //   2507: aload 15
    //   2509: iload 25
    //   2511: invokevirtual 623	com/google/android/gms/internal/measurement/Y1$a:x	(I)Lcom/google/android/gms/internal/measurement/Y1$a;
    //   2514: pop
    //   2515: aload 15
    //   2517: ldc_w 1116
    //   2520: invokestatic 1142	R2/D5:w	(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;)V
    //   2523: aload 15
    //   2525: bipush 18
    //   2527: ldc_w 1165
    //   2530: invokestatic 1173	R2/D5:v	(Lcom/google/android/gms/internal/measurement/Y1$a;ILjava/lang/String;)V
    //   2533: goto +126 -> 2659
    //   2536: iload 24
    //   2538: iconst_m1
    //   2539: if_icmpne +6 -> 2545
    //   2542: goto +62 -> 2604
    //   2545: aload 13
    //   2547: iload 24
    //   2549: invokeinterface 590 2 0
    //   2554: checkcast 592	com/google/android/gms/internal/measurement/a2
    //   2557: invokevirtual 921	com/google/android/gms/internal/measurement/a2:d0	()Ljava/lang/String;
    //   2560: astore 13
    //   2562: aload 13
    //   2564: invokevirtual 1176	java/lang/String:length	()I
    //   2567: iconst_3
    //   2568: if_icmpeq +6 -> 2574
    //   2571: goto +33 -> 2604
    //   2574: iconst_0
    //   2575: istore 20
    //   2577: iload 20
    //   2579: aload 13
    //   2581: invokevirtual 1176	java/lang/String:length	()I
    //   2584: if_icmpge +75 -> 2659
    //   2587: aload 13
    //   2589: iload 20
    //   2591: invokevirtual 1180	java/lang/String:codePointAt	(I)I
    //   2594: istore 24
    //   2596: iload 24
    //   2598: invokestatic 1185	java/lang/Character:isLetter	(I)Z
    //   2601: ifne +45 -> 2646
    //   2604: aload_0
    //   2605: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   2608: invokevirtual 1102	R2/Y1:M	()LR2/a2;
    //   2611: ldc_w 1187
    //   2614: invokevirtual 185	R2/a2:a	(Ljava/lang/String;)V
    //   2617: aload 15
    //   2619: iload 25
    //   2621: invokevirtual 623	com/google/android/gms/internal/measurement/Y1$a:x	(I)Lcom/google/android/gms/internal/measurement/Y1$a;
    //   2624: pop
    //   2625: aload 15
    //   2627: ldc_w 1116
    //   2630: invokestatic 1142	R2/D5:w	(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;)V
    //   2633: aload 15
    //   2635: bipush 19
    //   2637: ldc_w 1167
    //   2640: invokestatic 1173	R2/D5:v	(Lcom/google/android/gms/internal/measurement/Y1$a;ILjava/lang/String;)V
    //   2643: goto +16 -> 2659
    //   2646: iload 20
    //   2648: iload 24
    //   2650: invokestatic 1190	java/lang/Character:charCount	(I)I
    //   2653: iadd
    //   2654: istore 20
    //   2656: goto -79 -> 2577
    //   2659: ldc_w 910
    //   2662: aload 15
    //   2664: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   2667: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2670: ifeq +106 -> 2776
    //   2673: aload_0
    //   2674: invokevirtual 374	R2/D5:m0	()LR2/N5;
    //   2677: pop
    //   2678: aload 15
    //   2680: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   2683: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   2686: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   2689: aload 23
    //   2691: invokestatic 919	R2/N5:G	(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;
    //   2694: ifnonnull +79 -> 2773
    //   2697: aload_1
    //   2698: ifnull +64 -> 2762
    //   2701: aload_1
    //   2702: invokevirtual 1192	com/google/android/gms/internal/measurement/Y1$a:I	()J
    //   2705: aload 15
    //   2707: invokevirtual 1192	com/google/android/gms/internal/measurement/Y1$a:I	()J
    //   2710: lsub
    //   2711: invokestatic 262	java/lang/Math:abs	(J)J
    //   2714: ldc2_w 1193
    //   2717: lcmp
    //   2718: ifgt +44 -> 2762
    //   2721: aload_1
    //   2722: invokevirtual 1159	com/google/android/gms/internal/measurement/k3:clone	()Ljava/lang/Object;
    //   2725: checkcast 607	com/google/android/gms/internal/measurement/Y3$b
    //   2728: checkcast 578	com/google/android/gms/internal/measurement/Y1$a
    //   2731: astore 12
    //   2733: aload_0
    //   2734: aload 15
    //   2736: aload 12
    //   2738: invokevirtual 1196	R2/D5:K	(Lcom/google/android/gms/internal/measurement/Y1$a;Lcom/google/android/gms/internal/measurement/Y1$a;)Z
    //   2741: ifeq +21 -> 2762
    //   2744: aload 16
    //   2746: iload 19
    //   2748: aload 12
    //   2750: invokevirtual 1199	com/google/android/gms/internal/measurement/d2$a:y	(ILcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;
    //   2753: pop
    //   2754: aconst_null
    //   2755: astore_1
    //   2756: aconst_null
    //   2757: astore 12
    //   2759: goto +128 -> 2887
    //   2762: iload 11
    //   2764: istore 18
    //   2766: aload 15
    //   2768: astore 12
    //   2770: goto +117 -> 2887
    //   2773: goto +111 -> 2884
    //   2776: ldc_w 1201
    //   2779: aload 15
    //   2781: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   2784: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2787: ifeq -14 -> 2773
    //   2790: aload_0
    //   2791: invokevirtual 374	R2/D5:m0	()LR2/N5;
    //   2794: pop
    //   2795: aload 15
    //   2797: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   2800: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   2803: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   2806: aload 9
    //   2808: invokestatic 919	R2/N5:G	(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;
    //   2811: ifnonnull -38 -> 2773
    //   2814: aload 12
    //   2816: ifnull +58 -> 2874
    //   2819: aload 12
    //   2821: invokevirtual 1192	com/google/android/gms/internal/measurement/Y1$a:I	()J
    //   2824: aload 15
    //   2826: invokevirtual 1192	com/google/android/gms/internal/measurement/Y1$a:I	()J
    //   2829: lsub
    //   2830: invokestatic 262	java/lang/Math:abs	(J)J
    //   2833: ldc2_w 1193
    //   2836: lcmp
    //   2837: ifgt +37 -> 2874
    //   2840: aload 12
    //   2842: invokevirtual 1159	com/google/android/gms/internal/measurement/k3:clone	()Ljava/lang/Object;
    //   2845: checkcast 607	com/google/android/gms/internal/measurement/Y3$b
    //   2848: checkcast 578	com/google/android/gms/internal/measurement/Y1$a
    //   2851: astore_1
    //   2852: aload_0
    //   2853: aload_1
    //   2854: aload 15
    //   2856: invokevirtual 1196	R2/D5:K	(Lcom/google/android/gms/internal/measurement/Y1$a;Lcom/google/android/gms/internal/measurement/Y1$a;)Z
    //   2859: ifeq +15 -> 2874
    //   2862: aload 16
    //   2864: iload 18
    //   2866: aload_1
    //   2867: invokevirtual 1199	com/google/android/gms/internal/measurement/d2$a:y	(ILcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;
    //   2870: pop
    //   2871: goto -117 -> 2754
    //   2874: iload 11
    //   2876: istore 19
    //   2878: aload 15
    //   2880: astore_1
    //   2881: goto +6 -> 2887
    //   2884: goto -114 -> 2770
    //   2887: aload 5
    //   2889: getfield 1047	R2/D5$a:c	Ljava/util/List;
    //   2892: astore 14
    //   2894: aload 15
    //   2896: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   2899: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   2902: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   2905: astore 13
    //   2907: aload 14
    //   2909: iload 17
    //   2911: aload 13
    //   2913: invokeinterface 1205 3 0
    //   2918: pop
    //   2919: iinc 11 1
    //   2922: aload 16
    //   2924: aload 15
    //   2926: invokevirtual 1208	com/google/android/gms/internal/measurement/d2$a:D	(Lcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;
    //   2929: pop
    //   2930: aload_1
    //   2931: astore 13
    //   2933: iload 21
    //   2935: istore 10
    //   2937: aload 4
    //   2939: astore_1
    //   2940: iinc 17 1
    //   2943: goto -1763 -> 1180
    //   2946: iload 11
    //   2948: istore 17
    //   2950: lconst_0
    //   2951: lstore_2
    //   2952: iconst_0
    //   2953: istore 11
    //   2955: iload 11
    //   2957: iload 17
    //   2959: if_icmpge +183 -> 3142
    //   2962: aload 16
    //   2964: iload 11
    //   2966: invokevirtual 1211	com/google/android/gms/internal/measurement/d2$a:x	(I)Lcom/google/android/gms/internal/measurement/Y1;
    //   2969: astore_1
    //   2970: ldc_w 910
    //   2973: aload_1
    //   2974: invokevirtual 1213	com/google/android/gms/internal/measurement/Y1:b0	()Ljava/lang/String;
    //   2977: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2980: ifeq +44 -> 3024
    //   2983: aload_0
    //   2984: invokevirtual 374	R2/D5:m0	()LR2/N5;
    //   2987: pop
    //   2988: aload_1
    //   2989: ldc_w 934
    //   2992: invokestatic 919	R2/N5:G	(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;
    //   2995: ifnull +29 -> 3024
    //   2998: aload 16
    //   3000: iload 11
    //   3002: invokevirtual 1215	com/google/android/gms/internal/measurement/d2$a:L	(I)Lcom/google/android/gms/internal/measurement/d2$a;
    //   3005: pop
    //   3006: iload 17
    //   3008: iconst_1
    //   3009: isub
    //   3010: istore 19
    //   3012: iload 11
    //   3014: iconst_1
    //   3015: isub
    //   3016: istore 18
    //   3018: lload_2
    //   3019: lstore 7
    //   3021: goto +105 -> 3126
    //   3024: aload_0
    //   3025: invokevirtual 374	R2/D5:m0	()LR2/N5;
    //   3028: pop
    //   3029: aload_1
    //   3030: ldc_w 925
    //   3033: invokestatic 919	R2/N5:G	(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2;
    //   3036: astore_1
    //   3037: iload 17
    //   3039: istore 19
    //   3041: iload 11
    //   3043: istore 18
    //   3045: lload_2
    //   3046: lstore 7
    //   3048: aload_1
    //   3049: ifnull -28 -> 3021
    //   3052: aload_1
    //   3053: invokevirtual 927	com/google/android/gms/internal/measurement/a2:h0	()Z
    //   3056: ifeq +14 -> 3070
    //   3059: aload_1
    //   3060: invokevirtual 929	com/google/android/gms/internal/measurement/a2:X	()J
    //   3063: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3066: astore_1
    //   3067: goto +5 -> 3072
    //   3070: aconst_null
    //   3071: astore_1
    //   3072: iload 17
    //   3074: istore 19
    //   3076: iload 11
    //   3078: istore 18
    //   3080: lload_2
    //   3081: lstore 7
    //   3083: aload_1
    //   3084: ifnull -63 -> 3021
    //   3087: iload 17
    //   3089: istore 19
    //   3091: iload 11
    //   3093: istore 18
    //   3095: lload_2
    //   3096: lstore 7
    //   3098: aload_1
    //   3099: invokevirtual 311	java/lang/Long:longValue	()J
    //   3102: lconst_0
    //   3103: lcmp
    //   3104: ifle -83 -> 3021
    //   3107: lload_2
    //   3108: aload_1
    //   3109: invokevirtual 311	java/lang/Long:longValue	()J
    //   3112: ladd
    //   3113: lstore 7
    //   3115: iload 17
    //   3117: istore 19
    //   3119: iload 11
    //   3121: istore 18
    //   3123: goto -102 -> 3021
    //   3126: iload 18
    //   3128: iconst_1
    //   3129: iadd
    //   3130: istore 11
    //   3132: iload 19
    //   3134: istore 17
    //   3136: lload 7
    //   3138: lstore_2
    //   3139: goto -184 -> 2955
    //   3142: aload_0
    //   3143: aload 16
    //   3145: lload_2
    //   3146: iconst_0
    //   3147: invokevirtual 1218	R2/D5:x	(Lcom/google/android/gms/internal/measurement/d2$a;JZ)V
    //   3150: aload 16
    //   3152: invokevirtual 1220	com/google/android/gms/internal/measurement/d2$a:Y0	()Ljava/util/List;
    //   3155: invokeinterface 212 1 0
    //   3160: astore_1
    //   3161: aload_1
    //   3162: invokeinterface 217 1 0
    //   3167: istore 21
    //   3169: iload 21
    //   3171: ifeq +39 -> 3210
    //   3174: ldc_w 1222
    //   3177: aload_1
    //   3178: invokeinterface 221 1 0
    //   3183: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   3186: invokevirtual 1213	com/google/android/gms/internal/measurement/Y1:b0	()Ljava/lang/String;
    //   3189: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3192: ifeq -31 -> 3161
    //   3195: aload_0
    //   3196: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   3199: aload 16
    //   3201: invokevirtual 1225	com/google/android/gms/internal/measurement/d2$a:S0	()Ljava/lang/String;
    //   3204: ldc_w 1227
    //   3207: invokevirtual 698	R2/p:L0	(Ljava/lang/String;Ljava/lang/String;)V
    //   3210: aload 16
    //   3212: ldc_w 1229
    //   3215: invokestatic 760	R2/N5:y	(Lcom/google/android/gms/internal/measurement/d2$a;Ljava/lang/String;)I
    //   3218: iflt +14 -> 3232
    //   3221: aload_0
    //   3222: aload 16
    //   3224: lload_2
    //   3225: iconst_1
    //   3226: invokevirtual 1218	R2/D5:x	(Lcom/google/android/gms/internal/measurement/d2$a;JZ)V
    //   3229: goto +50 -> 3279
    //   3232: aload 16
    //   3234: ldc_w 1227
    //   3237: invokestatic 760	R2/N5:y	(Lcom/google/android/gms/internal/measurement/d2$a;Ljava/lang/String;)I
    //   3240: istore 11
    //   3242: iload 11
    //   3244: iflt +35 -> 3279
    //   3247: aload 16
    //   3249: iload 11
    //   3251: invokevirtual 763	com/google/android/gms/internal/measurement/d2$a:R	(I)Lcom/google/android/gms/internal/measurement/d2$a;
    //   3254: pop
    //   3255: aload_0
    //   3256: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   3259: invokevirtual 178	R2/Y1:G	()LR2/a2;
    //   3262: ldc_w 1231
    //   3265: aload 5
    //   3267: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   3270: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   3273: invokestatic 989	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   3276: invokevirtual 272	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   3279: aload_0
    //   3280: invokevirtual 374	R2/D5:m0	()LR2/N5;
    //   3283: aload 16
    //   3285: invokevirtual 1235	R2/N5:T	(Lcom/google/android/gms/internal/measurement/d2$a;)V
    //   3288: invokestatic 628	com/google/android/gms/internal/measurement/n6:a	()Z
    //   3291: ifeq +85 -> 3376
    //   3294: aload_0
    //   3295: invokevirtual 299	R2/D5:c0	()LR2/g;
    //   3298: getstatic 1237	R2/K:T0	LR2/P1;
    //   3301: invokevirtual 821	R2/g:s	(LR2/P1;)Z
    //   3304: ifeq +72 -> 3376
    //   3307: aload 5
    //   3309: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   3312: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   3315: astore_1
    //   3316: aload_0
    //   3317: invokevirtual 148	R2/D5:e	()LR2/G2;
    //   3320: invokevirtual 195	R2/m3:n	()V
    //   3323: aload_0
    //   3324: invokevirtual 244	R2/D5:p0	()V
    //   3327: invokestatic 628	com/google/android/gms/internal/measurement/n6:a	()Z
    //   3330: ifeq +46 -> 3376
    //   3333: aload_0
    //   3334: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   3337: aload_1
    //   3338: invokevirtual 798	R2/p:D0	(Ljava/lang/String;)LR2/I2;
    //   3341: astore 12
    //   3343: aload 12
    //   3345: ifnonnull +23 -> 3368
    //   3348: aload_0
    //   3349: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   3352: invokevirtual 178	R2/Y1:G	()LR2/a2;
    //   3355: ldc_w 1239
    //   3358: aload_1
    //   3359: invokestatic 989	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   3362: invokevirtual 272	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   3365: goto +11 -> 3376
    //   3368: aload_0
    //   3369: aload 12
    //   3371: aload 16
    //   3373: invokevirtual 1242	R2/D5:s	(LR2/I2;Lcom/google/android/gms/internal/measurement/d2$a;)V
    //   3376: aload 16
    //   3378: ldc2_w 1243
    //   3381: invokevirtual 1247	com/google/android/gms/internal/measurement/d2$a:v0	(J)Lcom/google/android/gms/internal/measurement/d2$a;
    //   3384: ldc2_w 1248
    //   3387: invokevirtual 1251	com/google/android/gms/internal/measurement/d2$a:e0	(J)Lcom/google/android/gms/internal/measurement/d2$a;
    //   3390: pop
    //   3391: iconst_0
    //   3392: istore 11
    //   3394: iload 11
    //   3396: aload 16
    //   3398: invokevirtual 1252	com/google/android/gms/internal/measurement/d2$a:w	()I
    //   3401: if_icmpge +63 -> 3464
    //   3404: aload 16
    //   3406: iload 11
    //   3408: invokevirtual 1211	com/google/android/gms/internal/measurement/d2$a:x	(I)Lcom/google/android/gms/internal/measurement/Y1;
    //   3411: astore_1
    //   3412: aload_1
    //   3413: invokevirtual 1255	com/google/android/gms/internal/measurement/Y1:Y	()J
    //   3416: aload 16
    //   3418: invokevirtual 1257	com/google/android/gms/internal/measurement/d2$a:W	()J
    //   3421: lcmp
    //   3422: ifge +13 -> 3435
    //   3425: aload 16
    //   3427: aload_1
    //   3428: invokevirtual 1255	com/google/android/gms/internal/measurement/Y1:Y	()J
    //   3431: invokevirtual 1247	com/google/android/gms/internal/measurement/d2$a:v0	(J)Lcom/google/android/gms/internal/measurement/d2$a;
    //   3434: pop
    //   3435: aload_1
    //   3436: invokevirtual 1255	com/google/android/gms/internal/measurement/Y1:Y	()J
    //   3439: aload 16
    //   3441: invokevirtual 1260	com/google/android/gms/internal/measurement/d2$a:Q	()J
    //   3444: lcmp
    //   3445: ifle +13 -> 3458
    //   3448: aload 16
    //   3450: aload_1
    //   3451: invokevirtual 1255	com/google/android/gms/internal/measurement/Y1:Y	()J
    //   3454: invokevirtual 1251	com/google/android/gms/internal/measurement/d2$a:e0	(J)Lcom/google/android/gms/internal/measurement/d2$a;
    //   3457: pop
    //   3458: iinc 11 1
    //   3461: goto -67 -> 3394
    //   3464: aload 16
    //   3466: invokevirtual 1263	com/google/android/gms/internal/measurement/d2$a:P0	()Lcom/google/android/gms/internal/measurement/d2$a;
    //   3469: pop
    //   3470: invokestatic 1266	com/google/android/gms/internal/measurement/g7:a	()Z
    //   3473: ifeq +386 -> 3859
    //   3476: aload_0
    //   3477: invokevirtual 299	R2/D5:c0	()LR2/g;
    //   3480: aload 5
    //   3482: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   3485: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   3488: getstatic 1268	R2/K:L0	LR2/P1;
    //   3491: invokevirtual 735	R2/g:B	(Ljava/lang/String;LR2/P1;)Z
    //   3494: ifeq +365 -> 3859
    //   3497: aload_0
    //   3498: invokevirtual 1073	R2/D5:n0	()LR2/S5;
    //   3501: pop
    //   3502: aload 5
    //   3504: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   3507: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   3510: invokestatic 1270	R2/S5:D0	(Ljava/lang/String;)Z
    //   3513: ifeq +346 -> 3859
    //   3516: aload_0
    //   3517: aload 5
    //   3519: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   3522: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   3525: invokevirtual 1273	R2/D5:Q	(Ljava/lang/String;)LR2/q3;
    //   3528: invokevirtual 1277	R2/q3:x	()Z
    //   3531: ifeq +328 -> 3859
    //   3534: aload 5
    //   3536: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   3539: invokevirtual 1279	com/google/android/gms/internal/measurement/d2:u0	()Z
    //   3542: ifeq +317 -> 3859
    //   3545: iconst_0
    //   3546: istore 11
    //   3548: iload 11
    //   3550: aload 5
    //   3552: getfield 1047	R2/D5$a:c	Ljava/util/List;
    //   3555: invokeinterface 584 1 0
    //   3560: if_icmpge +299 -> 3859
    //   3563: aload 5
    //   3565: getfield 1047	R2/D5$a:c	Ljava/util/List;
    //   3568: iload 11
    //   3570: invokeinterface 590 2 0
    //   3575: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   3578: invokevirtual 1053	com/google/android/gms/internal/measurement/Y3:x	()Lcom/google/android/gms/internal/measurement/Y3$b;
    //   3581: checkcast 578	com/google/android/gms/internal/measurement/Y1$a
    //   3584: astore 12
    //   3586: aload 12
    //   3588: invokevirtual 581	com/google/android/gms/internal/measurement/Y1$a:L	()Ljava/util/List;
    //   3591: invokeinterface 212 1 0
    //   3596: astore_1
    //   3597: aload_1
    //   3598: invokeinterface 217 1 0
    //   3603: ifeq +250 -> 3853
    //   3606: ldc_w 1116
    //   3609: aload_1
    //   3610: invokeinterface 221 1 0
    //   3615: checkcast 592	com/google/android/gms/internal/measurement/a2
    //   3618: invokevirtual 594	com/google/android/gms/internal/measurement/a2:c0	()Ljava/lang/String;
    //   3621: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3624: ifeq -27 -> 3597
    //   3627: aload 5
    //   3629: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   3632: invokevirtual 1281	com/google/android/gms/internal/measurement/d2:k	()I
    //   3635: aload_0
    //   3636: invokevirtual 299	R2/D5:c0	()LR2/g;
    //   3639: aload 5
    //   3641: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   3644: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   3647: getstatic 1283	R2/K:X	LR2/P1;
    //   3650: invokevirtual 1152	R2/g:u	(Ljava/lang/String;LR2/P1;)I
    //   3653: if_icmplt +181 -> 3834
    //   3656: aload_0
    //   3657: invokevirtual 299	R2/D5:c0	()LR2/g;
    //   3660: aload 5
    //   3662: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   3665: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   3668: getstatic 1285	R2/K:N0	LR2/P1;
    //   3671: invokevirtual 735	R2/g:B	(Ljava/lang/String;LR2/P1;)Z
    //   3674: ifeq +42 -> 3716
    //   3677: aload_0
    //   3678: invokevirtual 1073	R2/D5:n0	()LR2/S5;
    //   3681: invokevirtual 1286	R2/S5:S0	()Ljava/lang/String;
    //   3684: astore_1
    //   3685: aload 12
    //   3687: invokestatic 597	com/google/android/gms/internal/measurement/a2:Z	()Lcom/google/android/gms/internal/measurement/a2$a;
    //   3690: ldc_w 1288
    //   3693: invokevirtual 602	com/google/android/gms/internal/measurement/a2$a:B	(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;
    //   3696: aload_1
    //   3697: invokevirtual 616	com/google/android/gms/internal/measurement/a2$a:D	(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;
    //   3700: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   3703: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   3706: checkcast 592	com/google/android/gms/internal/measurement/a2
    //   3709: invokevirtual 619	com/google/android/gms/internal/measurement/Y1$a:C	(Lcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;
    //   3712: pop
    //   3713: goto +5 -> 3718
    //   3716: aconst_null
    //   3717: astore_1
    //   3718: aload 12
    //   3720: invokestatic 597	com/google/android/gms/internal/measurement/a2:Z	()Lcom/google/android/gms/internal/measurement/a2$a;
    //   3723: ldc_w 1290
    //   3726: invokevirtual 602	com/google/android/gms/internal/measurement/a2$a:B	(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/a2$a;
    //   3729: lconst_1
    //   3730: invokevirtual 605	com/google/android/gms/internal/measurement/a2$a:y	(J)Lcom/google/android/gms/internal/measurement/a2$a;
    //   3733: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   3736: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   3739: checkcast 592	com/google/android/gms/internal/measurement/a2
    //   3742: invokevirtual 619	com/google/android/gms/internal/measurement/Y1$a:C	(Lcom/google/android/gms/internal/measurement/a2;)Lcom/google/android/gms/internal/measurement/Y1$a;
    //   3745: pop
    //   3746: aload_0
    //   3747: invokevirtual 374	R2/D5:m0	()LR2/N5;
    //   3750: aload 5
    //   3752: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   3755: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   3758: aload 5
    //   3760: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   3763: aload 12
    //   3765: aload_1
    //   3766: invokevirtual 1293	R2/N5:C	(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/d2;Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;)LR2/v5;
    //   3769: astore_1
    //   3770: aload_1
    //   3771: ifnull +63 -> 3834
    //   3774: aload_0
    //   3775: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   3778: invokevirtual 204	R2/Y1:K	()LR2/a2;
    //   3781: ldc_w 1295
    //   3784: aload 5
    //   3786: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   3789: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   3792: aload_1
    //   3793: getfield 1298	R2/v5:o	Ljava/lang/String;
    //   3796: invokevirtual 575	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3799: aload_0
    //   3800: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   3803: aload 5
    //   3805: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   3808: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   3811: aload_1
    //   3812: invokevirtual 1301	R2/p:h0	(Ljava/lang/String;LR2/v5;)Z
    //   3815: pop
    //   3816: aload_0
    //   3817: getfield 84	R2/D5:q	Ljava/util/Set;
    //   3820: aload 5
    //   3822: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   3825: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   3828: invokeinterface 1306 2 0
    //   3833: pop
    //   3834: aload 16
    //   3836: iload 11
    //   3838: aload 12
    //   3840: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   3843: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   3846: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   3849: invokevirtual 1309	com/google/android/gms/internal/measurement/d2$a:z	(ILcom/google/android/gms/internal/measurement/Y1;)Lcom/google/android/gms/internal/measurement/d2$a;
    //   3852: pop
    //   3853: iinc 11 1
    //   3856: goto -308 -> 3548
    //   3859: aload 16
    //   3861: invokevirtual 1311	com/google/android/gms/internal/measurement/d2$a:h0	()Lcom/google/android/gms/internal/measurement/d2$a;
    //   3864: aload_0
    //   3865: invokevirtual 1314	R2/D5:X	()LR2/b6;
    //   3868: aload 16
    //   3870: invokevirtual 1225	com/google/android/gms/internal/measurement/d2$a:S0	()Ljava/lang/String;
    //   3873: aload 16
    //   3875: invokevirtual 1220	com/google/android/gms/internal/measurement/d2$a:Y0	()Ljava/util/List;
    //   3878: aload 16
    //   3880: invokevirtual 1317	com/google/android/gms/internal/measurement/d2$a:Z0	()Ljava/util/List;
    //   3883: aload 16
    //   3885: invokevirtual 1257	com/google/android/gms/internal/measurement/d2$a:W	()J
    //   3888: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3891: aload 16
    //   3893: invokevirtual 1260	com/google/android/gms/internal/measurement/d2$a:Q	()J
    //   3896: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3899: invokevirtual 1320	R2/b6:z	(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Ljava/util/List;
    //   3902: invokevirtual 1322	com/google/android/gms/internal/measurement/d2$a:H	(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/d2$a;
    //   3905: pop
    //   3906: aload_0
    //   3907: invokevirtual 299	R2/D5:c0	()LR2/g;
    //   3910: aload 5
    //   3912: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   3915: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   3918: invokevirtual 1324	R2/g:L	(Ljava/lang/String;)Z
    //   3921: ifeq +1152 -> 5073
    //   3924: new 138	java/util/HashMap
    //   3927: astore 15
    //   3929: aload 15
    //   3931: invokespecial 139	java/util/HashMap:<init>	()V
    //   3934: new 187	java/util/ArrayList
    //   3937: astore 4
    //   3939: aload 4
    //   3941: invokespecial 1325	java/util/ArrayList:<init>	()V
    //   3944: aload_0
    //   3945: invokevirtual 1073	R2/D5:n0	()LR2/S5;
    //   3948: invokevirtual 1328	R2/S5:U0	()Ljava/security/SecureRandom;
    //   3951: astore 6
    //   3953: iconst_0
    //   3954: istore 11
    //   3956: aload 16
    //   3958: astore 13
    //   3960: aload 5
    //   3962: astore 12
    //   3964: iload 11
    //   3966: aload 13
    //   3968: invokevirtual 1252	com/google/android/gms/internal/measurement/d2$a:w	()I
    //   3971: if_icmpge +1017 -> 4988
    //   3974: aload 13
    //   3976: iload 11
    //   3978: invokevirtual 1211	com/google/android/gms/internal/measurement/d2$a:x	(I)Lcom/google/android/gms/internal/measurement/Y1;
    //   3981: invokevirtual 1053	com/google/android/gms/internal/measurement/Y3:x	()Lcom/google/android/gms/internal/measurement/Y3$b;
    //   3984: checkcast 578	com/google/android/gms/internal/measurement/Y1$a
    //   3987: astore 16
    //   3989: aload 16
    //   3991: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   3994: ldc_w 1330
    //   3997: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   4000: istore 21
    //   4002: iload 21
    //   4004: ifeq +214 -> 4218
    //   4007: aload_0
    //   4008: invokevirtual 374	R2/D5:m0	()LR2/N5;
    //   4011: pop
    //   4012: aload 16
    //   4014: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   4017: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   4020: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   4023: ldc_w 1332
    //   4026: invokestatic 1335	R2/N5:e0	(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Ljava/lang/Object;
    //   4029: checkcast 341	java/lang/String
    //   4032: astore 5
    //   4034: aload 15
    //   4036: aload 5
    //   4038: invokeinterface 774 2 0
    //   4043: checkcast 1337	R2/E
    //   4046: astore 14
    //   4048: aload 14
    //   4050: astore_1
    //   4051: aload 14
    //   4053: ifnonnull +51 -> 4104
    //   4056: aload_0
    //   4057: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   4060: aload 12
    //   4062: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   4065: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   4068: aload 5
    //   4070: invokestatic 96	A2/n:i	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4073: checkcast 341	java/lang/String
    //   4076: invokevirtual 1341	R2/p:C0	(Ljava/lang/String;Ljava/lang/String;)LR2/E;
    //   4079: astore 14
    //   4081: aload 14
    //   4083: astore_1
    //   4084: aload 14
    //   4086: ifnull +18 -> 4104
    //   4089: aload 15
    //   4091: aload 5
    //   4093: aload 14
    //   4095: invokeinterface 634 3 0
    //   4100: pop
    //   4101: aload 14
    //   4103: astore_1
    //   4104: aload_1
    //   4105: ifnull +100 -> 4205
    //   4108: aload_1
    //   4109: getfield 1344	R2/E:i	Ljava/lang/Long;
    //   4112: ifnonnull +93 -> 4205
    //   4115: aload_1
    //   4116: getfield 1346	R2/E:j	Ljava/lang/Long;
    //   4119: astore 14
    //   4121: aload 14
    //   4123: ifnull +30 -> 4153
    //   4126: aload 14
    //   4128: invokevirtual 311	java/lang/Long:longValue	()J
    //   4131: lconst_1
    //   4132: lcmp
    //   4133: ifle +20 -> 4153
    //   4136: aload_0
    //   4137: invokevirtual 374	R2/D5:m0	()LR2/N5;
    //   4140: pop
    //   4141: aload 16
    //   4143: ldc_w 1348
    //   4146: aload_1
    //   4147: getfield 1346	R2/E:j	Ljava/lang/Long;
    //   4150: invokestatic 932	R2/N5:R	(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V
    //   4153: aload_1
    //   4154: getfield 1350	R2/E:k	Ljava/lang/Boolean;
    //   4157: astore_1
    //   4158: aload_1
    //   4159: ifnull +27 -> 4186
    //   4162: aload_1
    //   4163: invokevirtual 665	java/lang/Boolean:booleanValue	()Z
    //   4166: ifeq +20 -> 4186
    //   4169: aload_0
    //   4170: invokevirtual 374	R2/D5:m0	()LR2/N5;
    //   4173: pop
    //   4174: aload 16
    //   4176: ldc_w 1352
    //   4179: lconst_1
    //   4180: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4183: invokestatic 932	R2/N5:R	(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V
    //   4186: aload 4
    //   4188: aload 16
    //   4190: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   4193: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   4196: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   4199: invokeinterface 1353 2 0
    //   4204: pop
    //   4205: aload 13
    //   4207: iload 11
    //   4209: aload 16
    //   4211: invokevirtual 1199	com/google/android/gms/internal/measurement/d2$a:y	(ILcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;
    //   4214: pop
    //   4215: goto +767 -> 4982
    //   4218: aload_0
    //   4219: invokevirtual 711	R2/D5:h0	()LR2/x2;
    //   4222: aload 12
    //   4224: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   4227: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   4230: invokevirtual 1356	R2/x2:y	(Ljava/lang/String;)J
    //   4233: lstore_2
    //   4234: aload_0
    //   4235: invokevirtual 1073	R2/D5:n0	()LR2/S5;
    //   4238: pop
    //   4239: aload 16
    //   4241: invokevirtual 1192	com/google/android/gms/internal/measurement/Y1$a:I	()J
    //   4244: lload_2
    //   4245: invokestatic 1358	R2/S5:y	(JJ)J
    //   4248: lstore 7
    //   4250: aload 16
    //   4252: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   4255: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   4258: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   4261: astore_1
    //   4262: lconst_1
    //   4263: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4266: astore 14
    //   4268: ldc_w 1360
    //   4271: invokestatic 337	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   4274: ifne +117 -> 4391
    //   4277: aload_1
    //   4278: invokevirtual 1362	com/google/android/gms/internal/measurement/Y1:c0	()Ljava/util/List;
    //   4281: invokeinterface 212 1 0
    //   4286: astore_1
    //   4287: aload_1
    //   4288: invokeinterface 217 1 0
    //   4293: ifeq +98 -> 4391
    //   4296: aload_1
    //   4297: invokeinterface 221 1 0
    //   4302: checkcast 592	com/google/android/gms/internal/measurement/a2
    //   4305: astore 5
    //   4307: ldc_w 1360
    //   4310: aload 5
    //   4312: invokevirtual 594	com/google/android/gms/internal/measurement/a2:c0	()Ljava/lang/String;
    //   4315: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   4318: ifeq +70 -> 4388
    //   4321: aload 14
    //   4323: aload 5
    //   4325: invokevirtual 929	com/google/android/gms/internal/measurement/a2:X	()J
    //   4328: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4331: invokevirtual 1363	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   4334: ifne +48 -> 4382
    //   4337: aload 14
    //   4339: instanceof 341
    //   4342: ifeq +16 -> 4358
    //   4345: aload 14
    //   4347: aload 5
    //   4349: invokevirtual 921	com/google/android/gms/internal/measurement/a2:d0	()Ljava/lang/String;
    //   4352: invokevirtual 1363	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   4355: ifne +27 -> 4382
    //   4358: aload 14
    //   4360: instanceof 1365
    //   4363: ifeq +28 -> 4391
    //   4366: aload 14
    //   4368: aload 5
    //   4370: invokevirtual 1368	com/google/android/gms/internal/measurement/a2:G	()D
    //   4373: invokestatic 1371	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   4376: invokevirtual 1363	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   4379: ifeq +12 -> 4391
    //   4382: iconst_1
    //   4383: istore 18
    //   4385: goto +28 -> 4413
    //   4388: goto -101 -> 4287
    //   4391: aload_0
    //   4392: invokevirtual 711	R2/D5:h0	()LR2/x2;
    //   4395: aload 12
    //   4397: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   4400: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   4403: aload 16
    //   4405: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   4408: invokevirtual 1374	R2/x2:I	(Ljava/lang/String;Ljava/lang/String;)I
    //   4411: istore 18
    //   4413: iload 18
    //   4415: ifgt +48 -> 4463
    //   4418: aload_0
    //   4419: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   4422: invokevirtual 479	R2/Y1:L	()LR2/a2;
    //   4425: ldc_w 1376
    //   4428: aload 16
    //   4430: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   4433: iload 18
    //   4435: invokestatic 572	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   4438: invokevirtual 575	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   4441: aload 4
    //   4443: aload 16
    //   4445: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   4448: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   4451: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   4454: invokeinterface 1353 2 0
    //   4459: pop
    //   4460: goto -255 -> 4205
    //   4463: aload 15
    //   4465: aload 16
    //   4467: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   4470: invokeinterface 774 2 0
    //   4475: checkcast 1337	R2/E
    //   4478: astore_1
    //   4479: aload_1
    //   4480: ifnonnull +96 -> 4576
    //   4483: aload_0
    //   4484: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   4487: aload 12
    //   4489: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   4492: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   4495: aload 16
    //   4497: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   4500: invokevirtual 1341	R2/p:C0	(Ljava/lang/String;Ljava/lang/String;)LR2/E;
    //   4503: astore 14
    //   4505: aload 14
    //   4507: astore_1
    //   4508: aload 14
    //   4510: ifnonnull +66 -> 4576
    //   4513: aload_0
    //   4514: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   4517: invokevirtual 479	R2/Y1:L	()LR2/a2;
    //   4520: ldc_w 1378
    //   4523: aload 12
    //   4525: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   4528: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   4531: aload 16
    //   4533: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   4536: invokevirtual 575	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   4539: new 1337	R2/E
    //   4542: astore_1
    //   4543: aload_1
    //   4544: aload 12
    //   4546: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   4549: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   4552: aload 16
    //   4554: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   4557: lconst_1
    //   4558: lconst_1
    //   4559: lconst_1
    //   4560: aload 16
    //   4562: invokevirtual 1192	com/google/android/gms/internal/measurement/Y1$a:I	()J
    //   4565: lconst_0
    //   4566: aconst_null
    //   4567: aconst_null
    //   4568: aconst_null
    //   4569: aconst_null
    //   4570: invokespecial 1381	R2/E:<init>	(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
    //   4573: goto +3 -> 4576
    //   4576: aload_0
    //   4577: invokevirtual 374	R2/D5:m0	()LR2/N5;
    //   4580: pop
    //   4581: aload 16
    //   4583: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   4586: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   4589: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   4592: ldc_w 1383
    //   4595: invokestatic 1335	R2/N5:e0	(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)Ljava/lang/Object;
    //   4598: checkcast 266	java/lang/Long
    //   4601: astore 5
    //   4603: aload 5
    //   4605: ifnull +9 -> 4614
    //   4608: iconst_1
    //   4609: istore 19
    //   4611: goto +9 -> 4620
    //   4614: iconst_0
    //   4615: istore 19
    //   4617: goto -6 -> 4611
    //   4620: iload 18
    //   4622: iconst_1
    //   4623: if_icmpne +73 -> 4696
    //   4626: aload 4
    //   4628: aload 16
    //   4630: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   4633: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   4636: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   4639: invokeinterface 1353 2 0
    //   4644: pop
    //   4645: iload 19
    //   4647: ifeq -442 -> 4205
    //   4650: aload_1
    //   4651: getfield 1344	R2/E:i	Ljava/lang/Long;
    //   4654: ifnonnull +17 -> 4671
    //   4657: aload_1
    //   4658: getfield 1346	R2/E:j	Ljava/lang/Long;
    //   4661: ifnonnull +10 -> 4671
    //   4664: aload_1
    //   4665: getfield 1350	R2/E:k	Ljava/lang/Boolean;
    //   4668: ifnull -463 -> 4205
    //   4671: aload_1
    //   4672: aconst_null
    //   4673: aconst_null
    //   4674: aconst_null
    //   4675: invokevirtual 1386	R2/E:c	(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LR2/E;
    //   4678: astore_1
    //   4679: aload 15
    //   4681: aload 16
    //   4683: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   4686: aload_1
    //   4687: invokeinterface 634 3 0
    //   4692: pop
    //   4693: goto -488 -> 4205
    //   4696: aload 6
    //   4698: iload 18
    //   4700: invokevirtual 1391	java/util/Random:nextInt	(I)I
    //   4703: ifne +91 -> 4794
    //   4706: aload_0
    //   4707: invokevirtual 374	R2/D5:m0	()LR2/N5;
    //   4710: pop
    //   4711: iload 18
    //   4713: i2l
    //   4714: lstore_2
    //   4715: aload 16
    //   4717: ldc_w 1348
    //   4720: lload_2
    //   4721: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4724: invokestatic 932	R2/N5:R	(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V
    //   4727: aload 4
    //   4729: aload 16
    //   4731: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   4734: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   4737: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   4740: invokeinterface 1353 2 0
    //   4745: pop
    //   4746: aload_1
    //   4747: astore 14
    //   4749: iload 19
    //   4751: ifeq +15 -> 4766
    //   4754: aload_1
    //   4755: aconst_null
    //   4756: lload_2
    //   4757: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4760: aconst_null
    //   4761: invokevirtual 1386	R2/E:c	(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LR2/E;
    //   4764: astore 14
    //   4766: aload 15
    //   4768: aload 16
    //   4770: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   4773: aload 14
    //   4775: aload 16
    //   4777: invokevirtual 1192	com/google/android/gms/internal/measurement/Y1$a:I	()J
    //   4780: lload 7
    //   4782: invokevirtual 1394	R2/E:b	(JJ)LR2/E;
    //   4785: invokeinterface 634 3 0
    //   4790: pop
    //   4791: goto +181 -> 4972
    //   4794: aload_1
    //   4795: getfield 1396	R2/E:h	Ljava/lang/Long;
    //   4798: astore 14
    //   4800: aload 14
    //   4802: ifnull +12 -> 4814
    //   4805: aload 14
    //   4807: invokevirtual 311	java/lang/Long:longValue	()J
    //   4810: lstore_2
    //   4811: goto +18 -> 4829
    //   4814: aload_0
    //   4815: invokevirtual 1073	R2/D5:n0	()LR2/S5;
    //   4818: pop
    //   4819: aload 16
    //   4821: invokevirtual 1398	com/google/android/gms/internal/measurement/Y1$a:F	()J
    //   4824: lload_2
    //   4825: invokestatic 1358	R2/S5:y	(JJ)J
    //   4828: lstore_2
    //   4829: lload_2
    //   4830: lload 7
    //   4832: lcmp
    //   4833: ifeq +110 -> 4943
    //   4836: aload_0
    //   4837: invokevirtual 374	R2/D5:m0	()LR2/N5;
    //   4840: pop
    //   4841: aload 16
    //   4843: ldc_w 1352
    //   4846: lconst_1
    //   4847: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4850: invokestatic 932	R2/N5:R	(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V
    //   4853: aload_0
    //   4854: invokevirtual 374	R2/D5:m0	()LR2/N5;
    //   4857: pop
    //   4858: iload 18
    //   4860: i2l
    //   4861: lstore_2
    //   4862: aload 16
    //   4864: ldc_w 1348
    //   4867: lload_2
    //   4868: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4871: invokestatic 932	R2/N5:R	(Lcom/google/android/gms/internal/measurement/Y1$a;Ljava/lang/String;Ljava/lang/Object;)V
    //   4874: aload 4
    //   4876: aload 16
    //   4878: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   4881: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   4884: checkcast 914	com/google/android/gms/internal/measurement/Y1
    //   4887: invokeinterface 1353 2 0
    //   4892: pop
    //   4893: aload_1
    //   4894: astore 14
    //   4896: iload 19
    //   4898: ifeq +17 -> 4915
    //   4901: aload_1
    //   4902: aconst_null
    //   4903: lload_2
    //   4904: invokestatic 269	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4907: getstatic 1401	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   4910: invokevirtual 1386	R2/E:c	(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LR2/E;
    //   4913: astore 14
    //   4915: aload 15
    //   4917: aload 16
    //   4919: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   4922: aload 14
    //   4924: aload 16
    //   4926: invokevirtual 1192	com/google/android/gms/internal/measurement/Y1$a:I	()J
    //   4929: lload 7
    //   4931: invokevirtual 1394	R2/E:b	(JJ)LR2/E;
    //   4934: invokeinterface 634 3 0
    //   4939: pop
    //   4940: goto +32 -> 4972
    //   4943: iload 19
    //   4945: ifeq -5 -> 4940
    //   4948: aload 15
    //   4950: aload 16
    //   4952: invokevirtual 912	com/google/android/gms/internal/measurement/Y1$a:K	()Ljava/lang/String;
    //   4955: aload_1
    //   4956: aload 5
    //   4958: aconst_null
    //   4959: aconst_null
    //   4960: invokevirtual 1386	R2/E:c	(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LR2/E;
    //   4963: invokeinterface 634 3 0
    //   4968: pop
    //   4969: goto -29 -> 4940
    //   4972: aload 13
    //   4974: iload 11
    //   4976: aload 16
    //   4978: invokevirtual 1199	com/google/android/gms/internal/measurement/d2$a:y	(ILcom/google/android/gms/internal/measurement/Y1$a;)Lcom/google/android/gms/internal/measurement/d2$a;
    //   4981: pop
    //   4982: iinc 11 1
    //   4985: goto -1021 -> 3964
    //   4988: aload 4
    //   4990: invokeinterface 584 1 0
    //   4995: aload 13
    //   4997: invokevirtual 1252	com/google/android/gms/internal/measurement/d2$a:w	()I
    //   5000: if_icmpge +14 -> 5014
    //   5003: aload 13
    //   5005: invokevirtual 1055	com/google/android/gms/internal/measurement/d2$a:t0	()Lcom/google/android/gms/internal/measurement/d2$a;
    //   5008: aload 4
    //   5010: invokevirtual 1403	com/google/android/gms/internal/measurement/d2$a:N	(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/d2$a;
    //   5013: pop
    //   5014: aload 15
    //   5016: invokeinterface 1407 1 0
    //   5021: invokeinterface 1408 1 0
    //   5026: astore_1
    //   5027: aload_1
    //   5028: invokeinterface 217 1 0
    //   5033: ifeq +34 -> 5067
    //   5036: aload_1
    //   5037: invokeinterface 221 1 0
    //   5042: checkcast 1410	java/util/Map$Entry
    //   5045: astore 14
    //   5047: aload_0
    //   5048: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   5051: aload 14
    //   5053: invokeinterface 1413 1 0
    //   5058: checkcast 1337	R2/E
    //   5061: invokevirtual 1416	R2/p:T	(LR2/E;)V
    //   5064: goto -37 -> 5027
    //   5067: aload 12
    //   5069: astore_1
    //   5070: goto +10 -> 5080
    //   5073: aload 16
    //   5075: astore 13
    //   5077: aload 5
    //   5079: astore_1
    //   5080: aload_1
    //   5081: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   5084: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   5087: astore 12
    //   5089: aload_0
    //   5090: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   5093: aload 12
    //   5095: invokevirtual 798	R2/p:D0	(Ljava/lang/String;)LR2/I2;
    //   5098: astore 14
    //   5100: aload 14
    //   5102: ifnonnull +29 -> 5131
    //   5105: aload_0
    //   5106: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   5109: invokevirtual 178	R2/Y1:G	()LR2/a2;
    //   5112: ldc_w 1418
    //   5115: aload_1
    //   5116: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   5119: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   5122: invokestatic 989	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   5125: invokevirtual 272	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   5128: goto +157 -> 5285
    //   5131: aload 13
    //   5133: invokevirtual 1252	com/google/android/gms/internal/measurement/d2$a:w	()I
    //   5136: ifle +149 -> 5285
    //   5139: aload 14
    //   5141: invokevirtual 1421	R2/I2:i0	()J
    //   5144: lstore 7
    //   5146: lload 7
    //   5148: lconst_0
    //   5149: lcmp
    //   5150: ifeq +14 -> 5164
    //   5153: aload 13
    //   5155: lload 7
    //   5157: invokevirtual 1423	com/google/android/gms/internal/measurement/d2$a:n0	(J)Lcom/google/android/gms/internal/measurement/d2$a;
    //   5160: pop
    //   5161: goto +9 -> 5170
    //   5164: aload 13
    //   5166: invokevirtual 1426	com/google/android/gms/internal/measurement/d2$a:H0	()Lcom/google/android/gms/internal/measurement/d2$a;
    //   5169: pop
    //   5170: aload 14
    //   5172: invokevirtual 1428	R2/I2:m0	()J
    //   5175: lstore_2
    //   5176: lload_2
    //   5177: lconst_0
    //   5178: lcmp
    //   5179: ifne +9 -> 5188
    //   5182: lload 7
    //   5184: lstore_2
    //   5185: goto +3 -> 5188
    //   5188: lload_2
    //   5189: lconst_0
    //   5190: lcmp
    //   5191: ifeq +13 -> 5204
    //   5194: aload 13
    //   5196: lload_2
    //   5197: invokevirtual 1431	com/google/android/gms/internal/measurement/d2$a:r0	(J)Lcom/google/android/gms/internal/measurement/d2$a;
    //   5200: pop
    //   5201: goto +9 -> 5210
    //   5204: aload 13
    //   5206: invokevirtual 1433	com/google/android/gms/internal/measurement/d2$a:J0	()Lcom/google/android/gms/internal/measurement/d2$a;
    //   5209: pop
    //   5210: aload 14
    //   5212: invokevirtual 1435	R2/I2:p	()V
    //   5215: aload 13
    //   5217: aload 14
    //   5219: invokevirtual 1438	R2/I2:k0	()J
    //   5222: l2i
    //   5223: invokevirtual 1440	com/google/android/gms/internal/measurement/d2$a:i0	(I)Lcom/google/android/gms/internal/measurement/d2$a;
    //   5226: pop
    //   5227: aload 14
    //   5229: aload 13
    //   5231: invokevirtual 1257	com/google/android/gms/internal/measurement/d2$a:W	()J
    //   5234: invokevirtual 1443	R2/I2:j0	(J)V
    //   5237: aload 14
    //   5239: aload 13
    //   5241: invokevirtual 1260	com/google/android/gms/internal/measurement/d2$a:Q	()J
    //   5244: invokevirtual 1445	R2/I2:f0	(J)V
    //   5247: aload 14
    //   5249: invokevirtual 1448	R2/I2:s0	()Ljava/lang/String;
    //   5252: astore 16
    //   5254: aload 16
    //   5256: ifnull +14 -> 5270
    //   5259: aload 13
    //   5261: aload 16
    //   5263: invokevirtual 1451	com/google/android/gms/internal/measurement/d2$a:K0	(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d2$a;
    //   5266: pop
    //   5267: goto +9 -> 5276
    //   5270: aload 13
    //   5272: invokevirtual 1454	com/google/android/gms/internal/measurement/d2$a:x0	()Lcom/google/android/gms/internal/measurement/d2$a;
    //   5275: pop
    //   5276: aload_0
    //   5277: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   5280: aload 14
    //   5282: invokevirtual 807	R2/p:U	(LR2/I2;)V
    //   5285: aload 13
    //   5287: invokevirtual 1252	com/google/android/gms/internal/measurement/d2$a:w	()I
    //   5290: ifle +118 -> 5408
    //   5293: aload_0
    //   5294: invokevirtual 711	R2/D5:h0	()LR2/x2;
    //   5297: aload_1
    //   5298: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   5301: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   5304: invokevirtual 1457	R2/x2:L	(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/L1;
    //   5307: astore 14
    //   5309: aload 14
    //   5311: ifnull +28 -> 5339
    //   5314: aload 14
    //   5316: invokevirtual 1461	com/google/android/gms/internal/measurement/L1:b0	()Z
    //   5319: ifne +6 -> 5325
    //   5322: goto +17 -> 5339
    //   5325: aload 13
    //   5327: aload 14
    //   5329: invokevirtual 1463	com/google/android/gms/internal/measurement/L1:L	()J
    //   5332: invokevirtual 1465	com/google/android/gms/internal/measurement/d2$a:M	(J)Lcom/google/android/gms/internal/measurement/d2$a;
    //   5335: pop
    //   5336: goto +51 -> 5387
    //   5339: aload_1
    //   5340: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   5343: invokevirtual 1467	com/google/android/gms/internal/measurement/d2:k0	()Ljava/lang/String;
    //   5346: invokevirtual 1095	java/lang/String:isEmpty	()Z
    //   5349: ifeq +15 -> 5364
    //   5352: aload 13
    //   5354: ldc2_w 109
    //   5357: invokevirtual 1465	com/google/android/gms/internal/measurement/d2$a:M	(J)Lcom/google/android/gms/internal/measurement/d2$a;
    //   5360: pop
    //   5361: goto +26 -> 5387
    //   5364: aload_0
    //   5365: invokevirtual 173	R2/D5:j	()LR2/Y1;
    //   5368: invokevirtual 479	R2/Y1:L	()LR2/a2;
    //   5371: ldc_w 1469
    //   5374: aload_1
    //   5375: getfield 1050	R2/D5$a:a	Lcom/google/android/gms/internal/measurement/d2;
    //   5378: invokevirtual 1058	com/google/android/gms/internal/measurement/d2:D3	()Ljava/lang/String;
    //   5381: invokestatic 989	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   5384: invokevirtual 272	R2/a2:b	(Ljava/lang/String;Ljava/lang/Object;)V
    //   5387: aload_0
    //   5388: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   5391: aload 13
    //   5393: invokevirtual 610	com/google/android/gms/internal/measurement/Y3$b:p	()Lcom/google/android/gms/internal/measurement/I4;
    //   5396: checkcast 612	com/google/android/gms/internal/measurement/Y3
    //   5399: checkcast 995	com/google/android/gms/internal/measurement/d2
    //   5402: iload 10
    //   5404: invokevirtual 1472	R2/p:e0	(Lcom/google/android/gms/internal/measurement/d2;Z)Z
    //   5407: pop
    //   5408: aload_0
    //   5409: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   5412: astore 13
    //   5414: aload_1
    //   5415: getfield 1474	R2/D5$a:b	Ljava/util/List;
    //   5418: astore_1
    //   5419: aload_1
    //   5420: invokestatic 96	A2/n:i	(Ljava/lang/Object;)Ljava/lang/Object;
    //   5423: pop
    //   5424: aload 13
    //   5426: invokevirtual 195	R2/m3:n	()V
    //   5429: aload 13
    //   5431: invokevirtual 827	R2/C5:u	()V
    //   5434: new 506	java/lang/StringBuilder
    //   5437: astore 14
    //   5439: aload 14
    //   5441: ldc_w 1476
    //   5444: invokespecial 510	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   5447: iconst_0
    //   5448: istore 11
    //   5450: iload 11
    //   5452: aload_1
    //   5453: invokeinterface 584 1 0
    //   5458: if_icmpge +43 -> 5501
    //   5461: iload 11
    //   5463: ifeq +12 -> 5475
    //   5466: aload 14
    //   5468: ldc_w 1478
    //   5471: invokevirtual 514	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5474: pop
    //   5475: aload 14
    //   5477: aload_1
    //   5478: iload 11
    //   5480: invokeinterface 590 2 0
    //   5485: checkcast 266	java/lang/Long
    //   5488: invokevirtual 311	java/lang/Long:longValue	()J
    //   5491: invokevirtual 1481	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   5494: pop
    //   5495: iinc 11 1
    //   5498: goto -48 -> 5450
    //   5501: aload 14
    //   5503: ldc_w 1483
    //   5506: invokevirtual 514	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5509: pop
    //   5510: aload 13
    //   5512: invokevirtual 830	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   5515: ldc_w 1015
    //   5518: aload 14
    //   5520: invokevirtual 519	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5523: aconst_null
    //   5524: invokevirtual 843	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   5527: istore 11
    //   5529: iload 11
    //   5531: aload_1
    //   5532: invokeinterface 584 1 0
    //   5537: if_icmpeq +31 -> 5568
    //   5540: aload 13
    //   5542: invokevirtual 847	R2/m3:j	()LR2/Y1;
    //   5545: invokevirtual 178	R2/Y1:G	()LR2/a2;
    //   5548: ldc_w 1485
    //   5551: iload 11
    //   5553: invokestatic 572	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   5556: aload_1
    //   5557: invokeinterface 584 1 0
    //   5562: invokestatic 572	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   5565: invokevirtual 575	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   5568: aload_0
    //   5569: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   5572: astore_1
    //   5573: aload_1
    //   5574: invokevirtual 830	R2/p:B	()Landroid/database/sqlite/SQLiteDatabase;
    //   5577: astore 13
    //   5579: aload 13
    //   5581: ldc_w 1487
    //   5584: iconst_2
    //   5585: anewarray 341	java/lang/String
    //   5588: dup
    //   5589: iconst_0
    //   5590: aload 12
    //   5592: aastore
    //   5593: dup
    //   5594: iconst_1
    //   5595: aload 12
    //   5597: aastore
    //   5598: invokevirtual 1491	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   5601: goto +25 -> 5626
    //   5604: astore 13
    //   5606: aload_1
    //   5607: invokevirtual 847	R2/m3:j	()LR2/Y1;
    //   5610: invokevirtual 178	R2/Y1:G	()LR2/a2;
    //   5613: ldc_w 1493
    //   5616: aload 12
    //   5618: invokestatic 989	R2/Y1:v	(Ljava/lang/String;)Ljava/lang/Object;
    //   5621: aload 13
    //   5623: invokevirtual 575	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   5626: aload_0
    //   5627: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   5630: invokevirtual 701	R2/p:T0	()V
    //   5633: aload_0
    //   5634: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   5637: invokevirtual 706	R2/p:R0	()V
    //   5640: iconst_1
    //   5641: ireturn
    //   5642: aload_0
    //   5643: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   5646: invokevirtual 701	R2/p:T0	()V
    //   5649: aload_0
    //   5650: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   5653: invokevirtual 706	R2/p:R0	()V
    //   5656: iconst_0
    //   5657: ireturn
    //   5658: aload 13
    //   5660: ifnull +10 -> 5670
    //   5663: aload 13
    //   5665: invokeinterface 960 1 0
    //   5670: aload_1
    //   5671: athrow
    //   5672: aload_0
    //   5673: invokevirtual 319	R2/D5:e0	()LR2/p;
    //   5676: invokevirtual 706	R2/p:R0	()V
    //   5679: aload_1
    //   5680: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	5681	0	this	D5
    //   0	5681	1	paramString	String
    //   0	5681	2	paramLong	long
    //   3	5006	4	localObject1	Object
    //   15	5063	5	localObject2	Object
    //   28	4669	6	localObject3	Object
    //   34	5149	7	l1	long
    //   57	2750	9	localObject4	Object
    //   63	5340	10	bool1	boolean
    //   80	3040	11	i1	int
    //   3130	2422	11	i2	int
    //   91	445	12	localObject5	Object
    //   552	445	12	str1	String
    //   1020	6	12	localObject6	Object
    //   1036	66	12	str2	String
    //   1157	4460	12	localObject7	Object
    //   115	172	13	localObject8	Object
    //   295	10	13	localSQLiteException1	SQLiteException
    //   377	647	13	localObject9	Object
    //   1031	1	13	localSQLiteException2	SQLiteException
    //   1041	1	13	localSQLiteException3	SQLiteException
    //   1046	39	13	localIOException	IOException
    //   1088	4492	13	localObject10	Object
    //   5604	60	13	localSQLiteException4	SQLiteException
    //   120	1	14	localSQLiteException5	SQLiteException
    //   246	61	14	localObject11	Object
    //   311	1	14	localSQLiteException6	SQLiteException
    //   447	50	14	str3	String
    //   563	109	14	localSQLiteException7	SQLiteException
    //   682	313	14	localObject12	Object
    //   1082	25	14	localSQLiteException8	SQLiteException
    //   1386	4133	14	localObject13	Object
    //   240	4775	15	localObject14	Object
    //   250	5012	16	localObject15	Object
    //   1163	1972	17	i3	int
    //   1172	3687	18	i4	int
    //   1175	3769	19	i5	int
    //   1190	17	20	i6	int
    //   1438	1217	20	i7	int
    //   1252	2751	21	bool2	boolean
    //   1550	781	22	bool3	boolean
    //   1610	1080	23	localObject16	Object
    //   1620	1029	24	i8	int
    //   1623	997	25	i9	int
    //   1640	806	26	i10	int
    // Exception table:
    //   from	to	target	type
    //   52	65	113	finally
    //   87	110	113	finally
    //   130	144	113	finally
    //   153	195	113	finally
    //   332	338	113	finally
    //   343	352	113	finally
    //   355	365	113	finally
    //   374	416	113	finally
    //   52	65	120	android/database/sqlite/SQLiteException
    //   87	110	120	android/database/sqlite/SQLiteException
    //   130	144	120	android/database/sqlite/SQLiteException
    //   153	195	120	android/database/sqlite/SQLiteException
    //   332	338	120	android/database/sqlite/SQLiteException
    //   343	352	120	android/database/sqlite/SQLiteException
    //   355	365	120	android/database/sqlite/SQLiteException
    //   374	416	120	android/database/sqlite/SQLiteException
    //   12	52	223	finally
    //   214	220	223	finally
    //   543	549	223	finally
    //   1069	1075	223	finally
    //   1118	1124	223	finally
    //   1128	1137	223	finally
    //   1140	1156	223	finally
    //   1180	1192	223	finally
    //   1209	1254	223	finally
    //   1259	1334	223	finally
    //   1337	1382	223	finally
    //   1388	1423	223	finally
    //   1426	1437	223	finally
    //   1443	1520	223	finally
    //   1530	1552	223	finally
    //   1557	1583	223	finally
    //   1586	1596	223	finally
    //   1635	1642	223	finally
    //   1649	1702	223	finally
    //   1708	1761	223	finally
    //   1786	1833	223	finally
    //   1841	1888	223	finally
    //   1888	1933	223	finally
    //   1941	1949	223	finally
    //   1970	1981	223	finally
    //   2016	2090	223	finally
    //   2101	2144	223	finally
    //   2158	2172	223	finally
    //   2204	2212	223	finally
    //   2234	2273	223	finally
    //   2291	2315	223	finally
    //   2335	2350	223	finally
    //   2359	2368	223	finally
    //   2375	2399	223	finally
    //   2410	2434	223	finally
    //   2458	2533	223	finally
    //   2545	2571	223	finally
    //   2577	2604	223	finally
    //   2604	2643	223	finally
    //   2646	2656	223	finally
    //   2659	2697	223	finally
    //   2701	2754	223	finally
    //   2776	2814	223	finally
    //   2819	2871	223	finally
    //   2887	2907	223	finally
    //   2907	2919	223	finally
    //   2922	2930	223	finally
    //   2962	3006	223	finally
    //   3024	3037	223	finally
    //   3052	3067	223	finally
    //   3098	3115	223	finally
    //   3142	3161	223	finally
    //   3161	3169	223	finally
    //   3174	3210	223	finally
    //   3210	3229	223	finally
    //   3232	3242	223	finally
    //   3247	3279	223	finally
    //   3279	3343	223	finally
    //   3348	3365	223	finally
    //   3368	3376	223	finally
    //   3376	3391	223	finally
    //   3394	3435	223	finally
    //   3435	3458	223	finally
    //   3464	3545	223	finally
    //   3548	3597	223	finally
    //   3597	3713	223	finally
    //   3718	3770	223	finally
    //   3774	3834	223	finally
    //   3834	3853	223	finally
    //   3859	3953	223	finally
    //   3964	4002	223	finally
    //   4007	4048	223	finally
    //   4056	4081	223	finally
    //   4089	4101	223	finally
    //   4108	4121	223	finally
    //   4126	4153	223	finally
    //   4153	4158	223	finally
    //   4162	4186	223	finally
    //   4186	4205	223	finally
    //   4205	4215	223	finally
    //   4218	4287	223	finally
    //   4287	4358	223	finally
    //   4358	4382	223	finally
    //   4391	4413	223	finally
    //   4418	4460	223	finally
    //   4463	4479	223	finally
    //   4483	4505	223	finally
    //   4513	4573	223	finally
    //   4576	4603	223	finally
    //   4626	4645	223	finally
    //   4650	4671	223	finally
    //   4671	4693	223	finally
    //   4696	4711	223	finally
    //   4715	4746	223	finally
    //   4754	4766	223	finally
    //   4766	4791	223	finally
    //   4794	4800	223	finally
    //   4805	4811	223	finally
    //   4814	4829	223	finally
    //   4836	4858	223	finally
    //   4862	4893	223	finally
    //   4901	4915	223	finally
    //   4915	4940	223	finally
    //   4948	4969	223	finally
    //   4972	4982	223	finally
    //   4988	5014	223	finally
    //   5014	5027	223	finally
    //   5027	5064	223	finally
    //   5080	5100	223	finally
    //   5105	5128	223	finally
    //   5131	5146	223	finally
    //   5153	5161	223	finally
    //   5164	5170	223	finally
    //   5170	5176	223	finally
    //   5194	5201	223	finally
    //   5204	5210	223	finally
    //   5210	5254	223	finally
    //   5259	5267	223	finally
    //   5270	5276	223	finally
    //   5276	5285	223	finally
    //   5285	5309	223	finally
    //   5314	5322	223	finally
    //   5325	5336	223	finally
    //   5339	5361	223	finally
    //   5364	5387	223	finally
    //   5387	5408	223	finally
    //   5408	5447	223	finally
    //   5450	5461	223	finally
    //   5466	5475	223	finally
    //   5475	5495	223	finally
    //   5501	5568	223	finally
    //   5568	5579	223	finally
    //   5579	5601	223	finally
    //   5606	5626	223	finally
    //   5626	5633	223	finally
    //   5642	5649	223	finally
    //   5663	5670	223	finally
    //   5670	5672	223	finally
    //   201	209	291	finally
    //   233	242	291	finally
    //   252	261	291	finally
    //   271	277	291	finally
    //   422	431	291	finally
    //   440	449	291	finally
    //   455	461	291	finally
    //   768	778	291	finally
    //   790	809	291	finally
    //   827	836	291	finally
    //   848	857	291	finally
    //   869	880	291	finally
    //   892	916	291	finally
    //   928	949	291	finally
    //   968	988	291	finally
    //   1000	1009	291	finally
    //   1090	1111	291	finally
    //   252	261	295	android/database/sqlite/SQLiteException
    //   271	277	295	android/database/sqlite/SQLiteException
    //   768	778	295	android/database/sqlite/SQLiteException
    //   790	809	295	android/database/sqlite/SQLiteException
    //   827	836	295	android/database/sqlite/SQLiteException
    //   848	857	295	android/database/sqlite/SQLiteException
    //   869	880	295	android/database/sqlite/SQLiteException
    //   892	916	295	android/database/sqlite/SQLiteException
    //   928	949	295	android/database/sqlite/SQLiteException
    //   968	988	295	android/database/sqlite/SQLiteException
    //   1000	1009	295	android/database/sqlite/SQLiteException
    //   201	209	311	android/database/sqlite/SQLiteException
    //   233	242	311	android/database/sqlite/SQLiteException
    //   422	431	311	android/database/sqlite/SQLiteException
    //   440	449	311	android/database/sqlite/SQLiteException
    //   455	461	311	android/database/sqlite/SQLiteException
    //   524	543	552	finally
    //   612	631	552	finally
    //   524	543	563	android/database/sqlite/SQLiteException
    //   612	631	563	android/database/sqlite/SQLiteException
    //   869	880	955	java/io/IOException
    //   708	756	1020	finally
    //   1048	1069	1020	finally
    //   708	756	1031	android/database/sqlite/SQLiteException
    //   1048	1069	1031	android/database/sqlite/SQLiteException
    //   511	519	1036	finally
    //   568	577	1036	finally
    //   577	599	1036	finally
    //   599	607	1036	finally
    //   631	646	1036	finally
    //   687	703	1036	finally
    //   511	519	1041	android/database/sqlite/SQLiteException
    //   568	577	1041	android/database/sqlite/SQLiteException
    //   577	599	1041	android/database/sqlite/SQLiteException
    //   599	607	1041	android/database/sqlite/SQLiteException
    //   631	646	1041	android/database/sqlite/SQLiteException
    //   687	703	1041	android/database/sqlite/SQLiteException
    //   577	599	1046	java/io/IOException
    //   467	511	1078	finally
    //   467	511	1082	android/database/sqlite/SQLiteException
    //   5579	5601	5604	android/database/sqlite/SQLiteException
  }
  
  public final q3 Q(String paramString)
  {
    e().n();
    p0();
    q3 localq31 = (q3)B.get(paramString);
    q3 localq32 = localq31;
    if (localq31 == null)
    {
      localq31 = e0().I0(paramString);
      localq32 = localq31;
      if (localq31 == null) {
        localq32 = q3.c;
      }
      B(paramString, localq32);
    }
    return localq32;
  }
  
  public final String R(W5 paramW5)
  {
    Object localObject = e().w(new H5(this, paramW5));
    try
    {
      localObject = (String)((Future)localObject).get(30000L, TimeUnit.MILLISECONDS);
      return (String)localObject;
    }
    catch (ExecutionException localExecutionException) {}catch (InterruptedException localInterruptedException) {}catch (TimeoutException localTimeoutException) {}
    j().G().c("Failed to get app instance id. appId", Y1.v(o), localTimeoutException);
    return null;
  }
  
  public final void S(e parame)
  {
    W5 localW5 = W((String)n.i(o));
    if (localW5 != null) {
      T(parame, localW5);
    }
  }
  
  public final void T(e parame, W5 paramW5)
  {
    n.i(parame);
    n.e(o);
    n.i(p);
    n.i(q);
    n.e(q.p);
    e().n();
    p0();
    if (!d0(paramW5)) {
      return;
    }
    if (!v)
    {
      g(paramW5);
      return;
    }
    e locale = new e(parame);
    int i1 = 0;
    s = false;
    e0().Q0();
    try
    {
      localObject1 = e0().A0((String)n.i(o), q.p);
      if ((localObject1 != null) && (!p.equals(p))) {
        j().L().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", l.D().g(q.p), p, p);
      }
    }
    finally
    {
      break label705;
    }
    Object localObject2;
    if (localObject1 != null)
    {
      boolean bool = s;
      if (bool)
      {
        p = p;
        r = r;
        v = v;
        t = t;
        w = w;
        s = bool;
        localObject2 = new R2/R5;
        parame = q;
        ((R5)localObject2).<init>(p, q.q, parame.a(), q.u);
        q = ((R5)localObject2);
        break label363;
      }
    }
    if (TextUtils.isEmpty(t))
    {
      parame = new R2/R5;
      localObject2 = q;
      parame.<init>(p, r, ((R5)localObject2).a(), q.u);
      q = parame;
      i1 = 1;
      s = true;
    }
    label363:
    Object localObject3;
    if (s)
    {
      parame = q;
      localObject1 = new R2/T5;
      ((T5)localObject1).<init>((String)n.i(o), p, p, q, n.i(parame.a()));
      String str;
      if (e0().d0((T5)localObject1))
      {
        parame = j().F();
        localObject2 = "User property updated immediately";
        localObject3 = o;
        str = l.D().g(c);
      }
      for (localObject1 = e;; localObject1 = e)
      {
        parame.d((String)localObject2, localObject3, str, localObject1);
        break;
        parame = j().G();
        localObject2 = "(2)Too many active user properties, ignoring";
        localObject3 = Y1.v(o);
        str = l.D().g(c);
      }
      if ((i1 != 0) && (w != null))
      {
        parame = new R2/I;
        parame.<init>(w, r);
        Y(parame, paramW5);
      }
    }
    if (e0().b0(locale))
    {
      paramW5 = j().F();
      localObject3 = "Conditional property added";
      localObject2 = o;
      parame = l.D().g(q.p);
    }
    for (Object localObject1 = q.a();; localObject1 = q.a())
    {
      paramW5.d((String)localObject3, localObject2, parame, localObject1);
      break;
      paramW5 = j().G();
      localObject3 = "Too many conditional properties, ignoring";
      localObject2 = Y1.v(o);
      parame = l.D().g(q.p);
    }
    e0().T0();
    e0().R0();
    return;
    label705:
    e0().R0();
    throw parame;
  }
  
  public final void U(I paramI, W5 paramW5)
  {
    n.e(o);
    paramI = c2.b(paramI);
    n0().Q(d, e0().B0(o));
    n0().K(paramI, c0().y(o));
    paramI = paramI.a();
    String str;
    if (("_cmp".equals(o)) && ("referrer API v2".equals(p.q("_cis"))))
    {
      str = p.q("gclid");
      if (!TextUtils.isEmpty(str)) {
        u(new R5("_lgclid", r, str, "auto"), paramW5);
      }
    }
    if ((H6.a()) && (H6.c()) && ("_cmp".equals(o)) && ("referrer API v2".equals(p.q("_cis"))))
    {
      str = p.q("gbraid");
      if (!TextUtils.isEmpty(str)) {
        u(new R5("_gbraid", r, str, "auto"), paramW5);
      }
    }
    q(paramI, paramW5);
  }
  
  public final void V(I2 paramI2)
  {
    e().n();
    if ((TextUtils.isEmpty(paramI2.j())) && (TextUtils.isEmpty(paramI2.r0())))
    {
      z((String)n.i(paramI2.t0()), 204, null, null, null);
      return;
    }
    Object localObject1 = new Uri.Builder();
    Object localObject2 = paramI2.j();
    Object localObject3 = localObject2;
    if (TextUtils.isEmpty((CharSequence)localObject2)) {
      localObject3 = paramI2.r0();
    }
    Object localObject4 = K.g;
    localObject2 = null;
    Object localObject5 = null;
    localObject4 = ((Uri.Builder)localObject1).scheme((String)((P1)localObject4).a(null)).encodedAuthority((String)K.h.a(null));
    Object localObject6 = new StringBuilder("config/app/");
    ((StringBuilder)localObject6).append((String)localObject3);
    ((Uri.Builder)localObject4).path(((StringBuilder)localObject6).toString()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "82001").appendQueryParameter("runtime_version", "0");
    localObject1 = ((Uri.Builder)localObject1).build().toString();
    try
    {
      localObject6 = (String)n.i(paramI2.t0());
      localObject4 = new java/net/URL;
      ((URL)localObject4).<init>((String)localObject1);
      j().K().b("Fetching remote configuration", localObject6);
      localObject3 = h0().L((String)localObject6);
      Object localObject7 = h0().P((String)localObject6);
      if (localObject3 != null)
      {
        localObject3 = localObject5;
        if (!TextUtils.isEmpty((CharSequence)localObject7))
        {
          localObject3 = new t/a;
          ((a)localObject3).<init>();
          ((Map)localObject3).put("If-Modified-Since", localObject7);
        }
        localObject5 = h0().N((String)localObject6);
        localObject2 = localObject3;
        if (!TextUtils.isEmpty((CharSequence)localObject5))
        {
          localObject2 = localObject3;
          if (localObject3 == null)
          {
            localObject2 = new t/a;
            ((a)localObject2).<init>();
          }
          ((Map)localObject2).put("If-None-Match", localObject5);
        }
      }
      t = true;
      localObject7 = g0();
      localObject3 = new R2/I5;
      ((I5)localObject3).<init>(this);
      ((m3)localObject7).n();
      ((C5)localObject7).u();
      n.i(localObject4);
      n.i(localObject3);
      G2 localG2 = ((m3)localObject7).e();
      localObject5 = new R2/k2;
      ((k2)localObject5).<init>((f2)localObject7, (String)localObject6, (URL)localObject4, null, (Map)localObject2, (e2)localObject3);
      localG2.z((Runnable)localObject5);
      return;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      j().G().c("Failed to parse config URL. Not fetching. appId", Y1.v(paramI2.t0()), localObject1);
    }
  }
  
  public final W5 W(String paramString)
  {
    Object localObject1 = paramString;
    Object localObject2 = e0().D0((String)localObject1);
    Object localObject3;
    if ((localObject2 != null) && (!TextUtils.isEmpty(((I2)localObject2).h())))
    {
      localObject3 = m((I2)localObject2);
      if ((localObject3 != null) && (!((Boolean)localObject3).booleanValue()))
      {
        localObject2 = j().G();
        localObject3 = "App version does not match; dropping. appId";
        localObject1 = Y1.v(paramString);
        paramString = (String)localObject2;
      }
    }
    for (;;)
    {
      paramString.b((String)localObject3, localObject1);
      return null;
      localObject1 = Q(paramString);
      if ((n6.a()) && (c0().s(K.T0))) {
        localObject3 = a0(paramString).i();
      }
      for (int i1 = ((q3)localObject1).b();; i1 = 100)
      {
        break;
        localObject3 = "";
      }
      return new W5(paramString, ((I2)localObject2).j(), ((I2)localObject2).h(), ((I2)localObject2).z(), ((I2)localObject2).v0(), ((I2)localObject2).g0(), ((I2)localObject2).a0(), null, ((I2)localObject2).r(), false, ((I2)localObject2).i(), ((I2)localObject2).v(), 0L, 0, ((I2)localObject2).q(), false, ((I2)localObject2).r0(), ((I2)localObject2).q0(), ((I2)localObject2).c0(), ((I2)localObject2).n(), null, ((q3)localObject1).v(), "", null, ((I2)localObject2).t(), ((I2)localObject2).p0(), i1, (String)localObject3, ((I2)localObject2).a(), ((I2)localObject2).D());
      paramString = j().F();
      localObject3 = "No app data available; dropping";
    }
  }
  
  public final b6 X()
  {
    return (b6)i(f);
  }
  
  public final void Y(I paramI, W5 paramW5)
  {
    n.i(paramW5);
    n.e(o);
    long l1 = System.nanoTime();
    e().n();
    p0();
    Object localObject1 = o;
    m0();
    if (!N5.c0(paramI, paramW5)) {
      return;
    }
    if (!v)
    {
      g(paramW5);
      return;
    }
    if (h0().O((String)localObject1, o))
    {
      j().L().c("Dropping blocked event. appId", Y1.v((String)localObject1), l.D().c(o));
      if ((!h0().X((String)localObject1)) && (!h0().Z((String)localObject1))) {
        i1 = 0;
      } else {
        i1 = 1;
      }
      if ((i1 == 0) && (!"_err".equals(o)))
      {
        n0();
        S5.N(G, (String)localObject1, 11, "_ev", o, 0);
      }
      if (i1 != 0)
      {
        paramI = e0().D0((String)localObject1);
        if (paramI != null)
        {
          l2 = Math.max(paramI.e0(), paramI.H());
          l2 = Math.abs(b().a() - l2);
          c0();
          if (l2 > ((Long)K.B.a(null)).longValue())
          {
            j().F().a("Fetching config for blocked app");
            V(paramI);
          }
        }
      }
      return;
    }
    paramI = c2.b(paramI);
    n0().K(paramI, c0().y((String)localObject1));
    if ((S6.a()) && (c0().s(K.J0))) {
      i1 = c0().q((String)localObject1, K.S, 10, 35);
    } else {
      i1 = 0;
    }
    Object localObject2 = new TreeSet(d.keySet()).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (String)((Iterator)localObject2).next();
      if ("items".equals(localObject3))
      {
        localObject4 = n0();
        localObject3 = d.getParcelableArray((String)localObject3);
        if ((S6.a()) && (c0().s(K.J0))) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        ((S5)localObject4).a0((Parcelable[])localObject3, i1, bool1);
      }
    }
    localObject2 = paramI.a();
    if (j().C(2)) {
      j().K().b("Logging event", l.D().a((I)localObject2));
    }
    if (M6.a()) {
      c0().s(K.G0);
    }
    e0().Q0();
    try
    {
      g(paramW5);
      bool1 = "ecommerce_purchase".equals(o);
      if ((!bool1) && (!"purchase".equals(o)) && (!"refund".equals(o))) {
        i1 = 0;
      }
    }
    finally
    {
      break label3565;
    }
    int i1 = 1;
    if ((!"_iap".equals(o)) && (i1 == 0)) {}
    long l3;
    for (;;)
    {
      break;
      paramI = p.q("currency");
      if (i1 != 0)
      {
        double d1 = p.f("value").doubleValue() * 1000000.0D;
        double d2 = d1;
        if (d1 == 0.0D) {
          d2 = p.i("value").longValue() * 1000000.0D;
        }
        if ((d2 <= 9.223372036854776E18D) && (d2 >= -9.223372036854776E18D))
        {
          l3 = Math.round(d2);
          l2 = l3;
          if ("refund".equals(o)) {
            l2 = -l3;
          }
        }
        else
        {
          j().L().c("Data lost. Currency value is too big. appId", Y1.v((String)localObject1), Double.valueOf(d2));
          e0().T0();
          e0().R0();
        }
      }
      else
      {
        l2 = p.i("value").longValue();
      }
      if (!TextUtils.isEmpty(paramI))
      {
        localObject4 = paramI.toUpperCase(Locale.US);
        if (((String)localObject4).matches("[A-Z]{3}"))
        {
          paramI = new java/lang/StringBuilder;
          paramI.<init>("_ltv_");
          paramI.append((String)localObject4);
          localObject4 = paramI.toString();
          paramI = e0().F0((String)localObject1, (String)localObject4);
          if (paramI != null)
          {
            paramI = e;
            if (!(paramI instanceof Long)) {}
          }
          else
          {
            l3 = ((Long)paramI).longValue();
            paramI = new T5((String)localObject1, q, (String)localObject4, b().a(), Long.valueOf(l3 + l2));
          }
          for (;;)
          {
            break;
            localObject3 = e0();
            i1 = c0().u((String)localObject1, K.G);
            n.e((String)localObject1);
            ((m3)localObject3).n();
            ((C5)localObject3).u();
            try
            {
              ((p)localObject3).B().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[] { localObject1, localObject1, String.valueOf(i1 - 1) });
            }
            catch (SQLiteException paramI)
            {
              ((m3)localObject3).j().G().c("Error pruning currencies. appId", Y1.v((String)localObject1), paramI);
            }
            paramI = new R2/T5;
            paramI.<init>((String)localObject1, q, (String)localObject4, b().a(), Long.valueOf(l2));
          }
          if (!e0().d0(paramI))
          {
            j().G().d("Too many unique user properties are set. Ignoring user property. appId", Y1.v((String)localObject1), l.D().g(c), e);
            n0();
            S5.N(G, (String)localObject1, 9, null, null, 0);
          }
        }
      }
    }
    boolean bool1 = S5.J0(o);
    boolean bool2 = "_err".equals(o);
    n0();
    long l2 = S5.z(p);
    paramI = e0().H(u0(), (String)localObject1, l2 + 1L, true, bool1, false, bool2, false);
    l2 = b;
    c0();
    l2 -= ((Integer)K.m.a(null)).intValue();
    if (l2 > 0L)
    {
      if (l2 % 1000L == 1L) {
        j().G().c("Data loss. Too many events logged. appId, count", Y1.v((String)localObject1), Long.valueOf(b));
      }
      e0().T0();
      e0().R0();
      return;
    }
    if (bool1)
    {
      l2 = a;
      c0();
      l2 -= ((Integer)K.o.a(null)).intValue();
      if (l2 > 0L)
      {
        if (l2 % 1000L == 1L) {
          j().G().c("Data loss. Too many public events logged. appId, count", Y1.v((String)localObject1), Long.valueOf(a));
        }
        n0();
        S5.N(G, (String)localObject1, 16, "_ev", o, 0);
        e0().T0();
        e0().R0();
        return;
      }
    }
    if (bool2)
    {
      l2 = d - Math.max(0, Math.min(1000000, c0().u(o, K.n)));
      if (l2 > 0L)
      {
        if (l2 == 1L) {
          j().G().c("Too many error events logged. appId, count", Y1.v((String)localObject1), Long.valueOf(d));
        }
        e0().T0();
        e0().R0();
        return;
      }
    }
    Object localObject4 = p.g();
    n0().R((Bundle)localObject4, "_o", q);
    bool2 = n0().F0((String)localObject1);
    if (bool2)
    {
      n0().R((Bundle)localObject4, "_dbg", Long.valueOf(1L));
      n0().R((Bundle)localObject4, "_r", Long.valueOf(1L));
    }
    if ("_s".equals(o))
    {
      paramI = e0().F0(o, "_sno");
      if ((paramI != null) && ((e instanceof Long))) {
        n0().R((Bundle)localObject4, "_sno", e);
      }
    }
    l2 = e0().F((String)localObject1);
    if (l2 > 0L) {
      j().L().c("Data lost. Too many events stored on disk, deleted. appId", Y1.v((String)localObject1), Long.valueOf(l2));
    }
    paramI = new R2/A;
    paramI.<init>(l, q, (String)localObject1, o, r, 0L, (Bundle)localObject4);
    localObject2 = e0().C0((String)localObject1, b);
    if (localObject2 == null)
    {
      if ((e0().v0((String)localObject1) >= c0().p((String)localObject1)) && (bool1))
      {
        j().G().d("Too many event names used, ignoring event. appId, name, supported count", Y1.v((String)localObject1), l.D().c(b), Integer.valueOf(c0().p((String)localObject1)));
        n0();
        S5.N(G, (String)localObject1, 8, null, null, 0);
        e0().R0();
        return;
      }
      localObject2 = new R2/E;
      ((E)localObject2).<init>((String)localObject1, b, 0L, 0L, d, 0L, null, null, null, null);
    }
    else
    {
      paramI = paramI.a(l, f);
      localObject2 = ((E)localObject2).a(d);
    }
    e0().T((E)localObject2);
    e().n();
    p0();
    n.i(paramI);
    n.i(paramW5);
    n.e(a);
    n.a(a.equals(o));
    localObject4 = d2.A3().m0(1).O0("android");
    if (!TextUtils.isEmpty(o)) {
      ((d2.a)localObject4).O(o);
    }
    if (!TextUtils.isEmpty(r)) {
      ((d2.a)localObject4).a0(r);
    }
    if (!TextUtils.isEmpty(q)) {
      ((d2.a)localObject4).g0(q);
    }
    if ((s7.a()) && (!TextUtils.isEmpty(L)) && ((c0().s(K.w0)) || (c0().B(o, K.y0)))) {
      ((d2.a)localObject4).R0(L);
    }
    l2 = x;
    if (l2 != -2147483648L) {
      ((d2.a)localObject4).d0((int)l2);
    }
    ((d2.a)localObject4).j0(s);
    if (!TextUtils.isEmpty(p)) {
      ((d2.a)localObject4).I0(p);
    }
    localObject2 = Q((String)n.i(o)).c(q3.e(J));
    ((d2.a)localObject4).o0(((q3)localObject2).v());
    if ((((d2.a)localObject4).V0().isEmpty()) && (!TextUtils.isEmpty(E))) {
      ((d2.a)localObject4).I(E);
    }
    if ((g7.a()) && (c0().B(o, K.L0)))
    {
      n0();
      if (S5.D0(o))
      {
        ((d2.a)localObject4).X(Q);
        l3 = R;
        l2 = l3;
        if (!((q3)localObject2).x())
        {
          l2 = l3;
          if (l3 != 0L) {
            l2 = l3 & 0xFFFFFFFFFFFFFFFE | 0x20;
          }
        }
        if (l2 == 1L) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        ((d2.a)localObject4).J(bool1);
        if (l2 != 0L)
        {
          localObject2 = V1.G();
          if ((l2 & 1L) != 0L) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          ((V1.a)localObject2).y(bool1);
          if ((0x2 & l2) != 0L) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          ((V1.a)localObject2).A(bool1);
          if ((0x4 & l2) != 0L) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          ((V1.a)localObject2).B(bool1);
          if ((0x8 & l2) != 0L) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          ((V1.a)localObject2).C(bool1);
          if ((0x10 & l2) != 0L) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          ((V1.a)localObject2).x(bool1);
          if ((0x20 & l2) != 0L) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          ((V1.a)localObject2).w(bool1);
          if ((l2 & 0x40) != 0L) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          ((V1.a)localObject2).z(bool1);
          ((d2.a)localObject4).C((V1)((Y3.b)localObject2).p());
        }
      }
    }
    l2 = t;
    if (l2 != 0L) {
      ((d2.a)localObject4).S(l2);
    }
    ((d2.a)localObject4).Y(G);
    localObject2 = m0().j0();
    if (localObject2 != null) {
      ((d2.a)localObject4).T((Iterable)localObject2);
    }
    Object localObject3 = Q((String)n.i(o)).c(q3.e(J));
    if ((((q3)localObject3).x()) && (C))
    {
      localObject2 = i.z(o, (q3)localObject3);
      if ((localObject2 != null) && (!TextUtils.isEmpty((CharSequence)first)) && (C))
      {
        ((d2.a)localObject4).Q0((String)first);
        localObject1 = second;
        if (localObject1 != null) {
          ((d2.a)localObject4).V(((Boolean)localObject1).booleanValue());
        }
        if ((i6.a()) && (c0().s(K.Y0)) && (!b.equals("_fx")) && (!((String)first).equals("00000000-0000-0000-0000-000000000000")))
        {
          localObject2 = e0().D0(o);
          if ((localObject2 != null) && (((I2)localObject2).u()))
          {
            F(o, false);
            localObject2 = new android/os/Bundle;
            ((Bundle)localObject2).<init>();
            ((BaseBundle)localObject2).putLong("_r", 1L);
            G.r(o, "_fx", (Bundle)localObject2);
          }
        }
      }
    }
    l.A().o();
    localObject2 = ((d2.a)localObject4).w0(Build.MODEL);
    l.A().o();
    ((d2.a)localObject2).M0(Build.VERSION.RELEASE).u0((int)l.A().v()).T0(l.A().w());
    ((d2.a)localObject4).y0(N);
    if (l.p())
    {
      ((d2.a)localObject4).S0();
      if (!TextUtils.isEmpty(null)) {
        ((d2.a)localObject4).z0(null);
      }
    }
    localObject1 = e0().D0(o);
    localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new R2/I2;
      ((I2)localObject2).<init>(l, o);
      ((I2)localObject2).x(n((q3)localObject3));
      ((I2)localObject2).J(y);
      ((I2)localObject2).M(p);
      if (((q3)localObject3).x()) {
        ((I2)localObject2).S(i.A(o, C));
      }
      ((I2)localObject2).h0(0L);
      ((I2)localObject2).j0(0L);
      ((I2)localObject2).f0(0L);
      ((I2)localObject2).F(q);
      ((I2)localObject2).c(x);
      ((I2)localObject2).B(r);
      ((I2)localObject2).d0(s);
      ((I2)localObject2).X(t);
      ((I2)localObject2).y(v);
      ((I2)localObject2).Z(G);
      e0().U((I2)localObject2);
    }
    if ((((q3)localObject3).y()) && (!TextUtils.isEmpty(((I2)localObject2).u0()))) {
      ((d2.a)localObject4).U((String)n.i(((I2)localObject2).u0()));
    }
    if (!TextUtils.isEmpty(((I2)localObject2).i())) {
      ((d2.a)localObject4).G0((String)n.i(((I2)localObject2).i()));
    }
    localObject1 = e0().M0(o);
    for (i1 = 0; i1 < ((List)localObject1).size(); i1++)
    {
      localObject3 = h2.X().z(getc).B(getd);
      m0().U((h2.a)localObject3, gete);
      ((d2.a)localObject4).F((h2.a)localObject3);
      if (("_sid".equals(getc)) && (((I2)localObject2).o0() != 0L) && (m0().z(L) != ((I2)localObject2).o0())) {
        ((d2.a)localObject4).N0();
      }
    }
    try
    {
      l2 = e0().E((d2)((Y3.b)localObject4).p());
      paramW5 = e0();
      localObject2 = f;
      if (localObject2 != null)
      {
        localObject2 = ((D)localObject2).iterator();
        do
        {
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
        } while (!"_r".equals((String)((Iterator)localObject2).next()));
        do
        {
          bool1 = true;
          break;
          bool1 = h0().M(a, b);
          localObject2 = e0().I(u0(), a, false, false, false, false, false);
        } while ((bool1) && (e < c0().A(a)));
      }
      bool1 = false;
      if (paramW5.c0(paramI, l2, bool1)) {
        o = 0L;
      }
    }
    catch (IOException paramI)
    {
      j().G().c("Data loss. Failed to insert raw event metadata. appId", Y1.v(((d2.a)localObject4).S0()), paramI);
    }
    e0().T0();
    e0().R0();
    N();
    j().K().b("Background event processing time, ms", Long.valueOf((System.nanoTime() - l1 + 500000L) / 1000000L));
    return;
    label3565:
    e0().R0();
    throw paramI;
  }
  
  public final void Z(W5 paramW5)
  {
    e().n();
    p0();
    n.i(paramW5);
    n.e(o);
    if (!d0(paramW5)) {
      return;
    }
    Object localObject1 = e0().D0(o);
    if ((localObject1 != null) && (TextUtils.isEmpty(((I2)localObject1).j())) && (!TextUtils.isEmpty(p)))
    {
      ((I2)localObject1).A(0L);
      e0().U((I2)localObject1);
      h0().U(o);
    }
    if (!v)
    {
      g(paramW5);
      return;
    }
    long l1 = A;
    long l2 = l1;
    if (l1 == 0L) {
      l2 = b().a();
    }
    l.A().x();
    int i1 = B;
    int i2 = i1;
    if (i1 != 0)
    {
      i2 = i1;
      if (i1 != 1)
      {
        j().L().c("Incorrect app type, assuming installed app. appId, appType", Y1.v(o), Integer.valueOf(i1));
        i2 = 0;
      }
    }
    e0().Q0();
    try
    {
      localObject1 = e0().F0(o, "_npa");
      if (localObject1 != null) {
        if (!"auto".equals(b)) {}
      }
    }
    finally
    {
      break label2022;
    }
    if (F != null)
    {
      localObject5 = new R2/R5;
      if (F.booleanValue()) {
        l1 = 1L;
      } else {
        l1 = 0L;
      }
      ((R5)localObject5).<init>("_npa", l2, Long.valueOf(l1), "auto");
      if ((localObject1 == null) || (!e.equals(r))) {
        u((R5)localObject5, paramW5);
      }
    }
    else if (localObject1 != null)
    {
      D("_npa", paramW5);
    }
    Object localObject5 = e0().D0((String)n.i(o));
    localObject1 = localObject5;
    Object localObject6;
    if (localObject5 != null)
    {
      n0();
      localObject1 = localObject5;
      if (S5.l0(p, ((I2)localObject5).j(), E, ((I2)localObject5).r0()))
      {
        j().L().b("New GMP App Id passed in. Removing cached database data. appId", Y1.v(((I2)localObject5).t0()));
        localObject1 = e0();
        localObject5 = ((I2)localObject5).t0();
        ((C5)localObject1).u();
        ((m3)localObject1).n();
        n.e((String)localObject5);
        try
        {
          localObject6 = ((p)localObject1).B();
          String[] arrayOfString = new String[1];
          arrayOfString[0] = localObject5;
          i1 = ((SQLiteDatabase)localObject6).delete("events", "app_id=?", arrayOfString) + ((SQLiteDatabase)localObject6).delete("user_attributes", "app_id=?", arrayOfString) + ((SQLiteDatabase)localObject6).delete("conditional_properties", "app_id=?", arrayOfString) + ((SQLiteDatabase)localObject6).delete("apps", "app_id=?", arrayOfString) + ((SQLiteDatabase)localObject6).delete("raw_events", "app_id=?", arrayOfString) + ((SQLiteDatabase)localObject6).delete("raw_events_metadata", "app_id=?", arrayOfString) + ((SQLiteDatabase)localObject6).delete("event_filters", "app_id=?", arrayOfString) + ((SQLiteDatabase)localObject6).delete("property_filters", "app_id=?", arrayOfString) + ((SQLiteDatabase)localObject6).delete("audience_filter_values", "app_id=?", arrayOfString) + ((SQLiteDatabase)localObject6).delete("consent_settings", "app_id=?", arrayOfString) + ((SQLiteDatabase)localObject6).delete("default_event_params", "app_id=?", arrayOfString) + ((SQLiteDatabase)localObject6).delete("trigger_uris", "app_id=?", arrayOfString);
          if (i1 > 0) {
            ((m3)localObject1).j().K().c("Deleted application data. app, records", localObject5, Integer.valueOf(i1));
          }
        }
        catch (SQLiteException localSQLiteException)
        {
          ((m3)localObject1).j().G().c("Error deleting application data. appId, error", Y1.v((String)localObject5), localSQLiteException);
        }
        localObject1 = null;
      }
    }
    Object localObject7;
    if (localObject1 != null)
    {
      if ((((I2)localObject1).z() != -2147483648L) && (((I2)localObject1).z() != x)) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      localObject5 = ((I2)localObject1).h();
      int i3;
      if ((((I2)localObject1).z() == -2147483648L) && (localObject5 != null) && (!((String)localObject5).equals(q))) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      if ((i1 | i3) != 0)
      {
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
        ((BaseBundle)localObject1).putString("_pv", (String)localObject5);
        localObject7 = new R2/I;
        localObject5 = new R2/D;
        ((D)localObject5).<init>((Bundle)localObject1);
        ((I)localObject7).<init>("_au", (D)localObject5, "auto", l2);
        q((I)localObject7, paramW5);
      }
    }
    g(paramW5);
    if (i2 == 0)
    {
      localObject7 = e0();
      localObject5 = o;
    }
    for (localObject1 = "_f";; localObject1 = "_v")
    {
      localObject1 = ((p)localObject7).C0((String)localObject5, (String)localObject1);
      break label883;
      if (i2 != 1) {
        break;
      }
      localObject7 = e0();
      localObject5 = o;
    }
    localObject1 = null;
    label883:
    label1274:
    Object localObject4;
    if (localObject1 == null)
    {
      l1 = l2 / 3600000L;
      l1 = (l1 + 1L) * 3600000L;
      if (i2 == 0)
      {
        localObject1 = new R2/R5;
        ((R5)localObject1).<init>("_fot", l2, Long.valueOf(l1), "auto");
        u((R5)localObject1, paramW5);
        e().n();
        localObject5 = (u2)n.i(k);
        localObject7 = o;
        if ((localObject7 != null) && (!((String)localObject7).isEmpty()))
        {
          a.e().n();
          if (!((u2)localObject5).b())
          {
            localObject1 = a.j().J();
            localObject5 = "Install Referrer Reporter is not available";
          }
        }
        for (;;)
        {
          ((a2)localObject1).a((String)localObject5);
          break;
          localObject1 = new R2/t2;
          ((t2)localObject1).<init>((u2)localObject5, (String)localObject7);
          a.e().n();
          localObject7 = new android/content/Intent;
          ((Intent)localObject7).<init>("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
          localObject6 = new android/content/ComponentName;
          ((ComponentName)localObject6).<init>("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService");
          ((Intent)localObject7).setComponent((ComponentName)localObject6);
          localObject6 = a.a().getPackageManager();
          if (localObject6 == null)
          {
            localObject1 = a.j().N();
            localObject5 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer";
          }
          else
          {
            localObject6 = ((PackageManager)localObject6).queryIntentServices((Intent)localObject7, 0);
            if ((localObject6 != null) && (!((List)localObject6).isEmpty()))
            {
              localObject6 = get0serviceInfo;
              if (localObject6 == null) {
                break;
              }
              String str = packageName;
              if ((name != null) && ("com.android.vending".equals(str)) && (((u2)localObject5).b()))
              {
                localObject6 = new android/content/Intent;
                ((Intent)localObject6).<init>((Intent)localObject7);
                try
                {
                  boolean bool = b.b().a(a.a(), (Intent)localObject6, (ServiceConnection)localObject1, 1);
                  localObject7 = a.j().K();
                  if (bool) {
                    localObject1 = "available";
                  }
                }
                catch (RuntimeException localRuntimeException)
                {
                  break label1274;
                }
                localObject2 = "not available";
                ((a2)localObject7).b("Install Referrer Service is", localObject2);
                break;
                a.j().G().b("Exception occurred while binding to Install Referrer Service", ((Throwable)localObject2).getMessage());
                break;
              }
              localObject2 = a.j().L();
              localObject5 = "Play Store version 8.3.73 or higher required for Install Referrer";
            }
            else
            {
              localObject2 = a.j().J();
              localObject5 = "Play Service for fetching Install Referrer is unavailable on device";
              continue;
              localObject2 = a.j().N();
              localObject5 = "Install Referrer Reporter was called with invalid app package name";
            }
          }
        }
        e().n();
        p0();
        localObject5 = new android/os/Bundle;
        ((Bundle)localObject5).<init>();
        ((BaseBundle)localObject5).putLong("_c", 1L);
        ((BaseBundle)localObject5).putLong("_r", 1L);
        ((BaseBundle)localObject5).putLong("_uwa", 0L);
        ((BaseBundle)localObject5).putLong("_pfo", 0L);
        ((BaseBundle)localObject5).putLong("_sys", 0L);
        ((BaseBundle)localObject5).putLong("_sysu", 0L);
        ((BaseBundle)localObject5).putLong("_et", 1L);
        if (D) {
          ((BaseBundle)localObject5).putLong("_dac", 1L);
        }
        localObject7 = (String)n.i(o);
        Object localObject2 = e0();
        n.e((String)localObject7);
        ((m3)localObject2).n();
        ((C5)localObject2).u();
        long l3 = ((p)localObject2).w0((String)localObject7, "first_open_count");
        if (l.a().getPackageManager() == null) {
          j().G().b("PackageManager is null, first open report might be inaccurate. appId", Y1.v((String)localObject7));
        }
        for (;;)
        {
          break;
          Object localObject3;
          try
          {
            localObject2 = d.a(l.a()).e((String)localObject7, 0);
          }
          catch (PackageManager.NameNotFoundException localNameNotFoundException1)
          {
            j().G().c("Package info is null, first open report might be inaccurate. appId", Y1.v((String)localObject7), localNameNotFoundException1);
            localObject3 = null;
          }
          if (localObject3 != null)
          {
            l1 = firstInstallTime;
            if (l1 != 0L)
            {
              if (l1 != lastUpdateTime)
              {
                if ((!c0().s(K.o0)) || (l3 == 0L)) {
                  ((BaseBundle)localObject5).putLong("_uwa", 1L);
                }
                i2 = 0;
              }
              else
              {
                i2 = 1;
              }
              localObject3 = new R2/R5;
              if (i2 != 0) {
                l1 = 1L;
              } else {
                l1 = 0L;
              }
              ((R5)localObject3).<init>("_fi", l2, Long.valueOf(l1), "auto");
              u((R5)localObject3, paramW5);
            }
          }
          try
          {
            localObject3 = d.a(l.a()).c((String)localObject7, 0);
          }
          catch (PackageManager.NameNotFoundException localNameNotFoundException2)
          {
            j().G().c("Application info is null, first open report might be inaccurate. appId", Y1.v((String)localObject7), localNameNotFoundException2);
            localObject4 = null;
          }
          if (localObject4 != null)
          {
            if ((flags & 0x1) != 0) {
              ((BaseBundle)localObject5).putLong("_sys", 1L);
            }
            if ((flags & 0x80) != 0) {
              ((BaseBundle)localObject5).putLong("_sysu", 1L);
            }
          }
        }
        if (l3 >= 0L) {
          ((BaseBundle)localObject5).putLong("_pfo", l3);
        }
        localObject4 = new R2/I;
        localObject7 = new R2/D;
        ((D)localObject7).<init>((Bundle)localObject5);
        ((I)localObject4).<init>("_f", (D)localObject7, "auto", l2);
        U((I)localObject4, paramW5);
      }
      else if (i2 == 1)
      {
        localObject4 = new R2/R5;
        ((R5)localObject4).<init>("_fvt", l2, Long.valueOf(l1), "auto");
        u((R5)localObject4, paramW5);
        e().n();
        p0();
        localObject5 = new android/os/Bundle;
        ((Bundle)localObject5).<init>();
        ((BaseBundle)localObject5).putLong("_c", 1L);
        ((BaseBundle)localObject5).putLong("_r", 1L);
        ((BaseBundle)localObject5).putLong("_et", 1L);
        if (D) {
          ((BaseBundle)localObject5).putLong("_dac", 1L);
        }
        localObject4 = new R2/I;
        localObject7 = new R2/D;
        ((D)localObject7).<init>((Bundle)localObject5);
        ((I)localObject4).<init>("_v", (D)localObject7, "auto", l2);
      }
    }
    else
    {
      for (;;)
      {
        U((I)localObject4, paramW5);
        break;
        if (!w) {
          break;
        }
        localObject4 = new android/os/Bundle;
        ((Bundle)localObject4).<init>();
        localObject5 = new R2/D;
        ((D)localObject5).<init>((Bundle)localObject4);
        localObject4 = new I("_cd", (D)localObject5, "auto", l2);
      }
    }
    e0().T0();
    e0().R0();
    return;
    label2022:
    e0().R0();
    throw paramW5;
  }
  
  public final Context a()
  {
    return l.a();
  }
  
  public final z a0(String paramString)
  {
    e().n();
    p0();
    if (n6.a())
    {
      z localz1 = (z)C.get(paramString);
      z localz2 = localz1;
      if (localz1 == null)
      {
        localz2 = e0().G0(paramString);
        C.put(paramString, localz2);
      }
      return localz2;
    }
    return z.f;
  }
  
  public final E2.e b()
  {
    return ((N2)n.i(l)).b();
  }
  
  public final void b0(W5 paramW5)
  {
    if (y != null)
    {
      localObject = new ArrayList();
      z = ((List)localObject);
      ((List)localObject).addAll(y);
    }
    Object localObject = e0();
    String str = (String)n.i(o);
    n.e(str);
    ((m3)localObject).n();
    ((C5)localObject).u();
    try
    {
      SQLiteDatabase localSQLiteDatabase = ((p)localObject).B();
      String[] arrayOfString = new String[1];
      arrayOfString[0] = str;
      int i1 = localSQLiteDatabase.delete("apps", "app_id=?", arrayOfString) + localSQLiteDatabase.delete("events", "app_id=?", arrayOfString) + localSQLiteDatabase.delete("user_attributes", "app_id=?", arrayOfString) + localSQLiteDatabase.delete("conditional_properties", "app_id=?", arrayOfString) + localSQLiteDatabase.delete("raw_events", "app_id=?", arrayOfString) + localSQLiteDatabase.delete("raw_events_metadata", "app_id=?", arrayOfString) + localSQLiteDatabase.delete("queue", "app_id=?", arrayOfString) + localSQLiteDatabase.delete("audience_filter_values", "app_id=?", arrayOfString) + localSQLiteDatabase.delete("main_event_params", "app_id=?", arrayOfString) + localSQLiteDatabase.delete("default_event_params", "app_id=?", arrayOfString) + localSQLiteDatabase.delete("trigger_uris", "app_id=?", arrayOfString);
      if (i1 > 0) {
        ((m3)localObject).j().K().c("Reset analytics data. app, records", str, Integer.valueOf(i1));
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      ((m3)localObject).j().G().c("Error resetting analytics data. appId, error", Y1.v(str), localSQLiteException);
    }
    if (v) {
      Z(paramW5);
    }
  }
  
  public final int c(FileChannel paramFileChannel)
  {
    e().n();
    int i1 = 0;
    if ((paramFileChannel != null) && (paramFileChannel.isOpen()))
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
      try
      {
        paramFileChannel.position(0L);
        i2 = paramFileChannel.read(localByteBuffer);
        if (i2 == 4) {
          break label80;
        }
        if (i2 != -1) {
          j().L().b("Unexpected data length. Bytes read", Integer.valueOf(i2));
        }
      }
      catch (IOException paramFileChannel)
      {
        break label97;
      }
      return 0;
      label80:
      localByteBuffer.flip();
      int i2 = localByteBuffer.getInt();
      i1 = i2;
      break label111;
      label97:
      j().G().b("Failed to read from channel", paramFileChannel);
      label111:
      return i1;
    }
    j().G().a("Bad channel to read from");
    return 0;
  }
  
  public final g c0()
  {
    return ((N2)n.i(l)).z();
  }
  
  public final f d()
  {
    return l.d();
  }
  
  public final G2 e()
  {
    return ((N2)n.i(l)).e();
  }
  
  public final p e0()
  {
    return (p)i(c);
  }
  
  public final z f(String paramString, z paramz, q3 paramq3, l paraml)
  {
    if (n6.a())
    {
      Object localObject = h0().J(paramString);
      int i1 = 90;
      if (localObject == null)
      {
        paramq3 = paramz.f();
        paramString = Boolean.FALSE;
        if (paramq3 == paramString)
        {
          i1 = paramz.a();
          paraml.c(q3.a.r, i1);
        }
        else
        {
          paraml.d(q3.a.r, k.w);
        }
        return new z(paramString, i1, Boolean.TRUE, "-");
      }
      localObject = paramz.f();
      int i2;
      if (localObject != null)
      {
        i2 = paramz.a();
        paraml.c(q3.a.r, i2);
        paramq3 = (q3)localObject;
      }
      else
      {
        x2 localx2 = a;
        q3.a locala = q3.a.r;
        paramz = (z)localObject;
        if (localx2.A(paramString, locala) == q3.a.p)
        {
          paramz = (z)localObject;
          if (paramq3.s() != null)
          {
            paramz = paramq3.s();
            paraml.d(locala, k.r);
          }
        }
        paramq3 = paramz;
        i2 = i1;
        if (paramz == null)
        {
          paramq3 = Boolean.valueOf(a.K(paramString, locala));
          paraml.d(locala, k.q);
          i2 = i1;
        }
      }
      n.i(paramq3);
      boolean bool = a.Y(paramString);
      paramz = h0().S(paramString);
      if ((paramq3.booleanValue()) && (!paramz.isEmpty()))
      {
        paramq3 = Boolean.TRUE;
        paramString = "";
        if (bool) {
          paramString = TextUtils.join("", paramz);
        }
        return new z(paramq3, i2, Boolean.valueOf(bool), paramString);
      }
      return new z(Boolean.FALSE, i2, Boolean.valueOf(bool), "-");
    }
    return z.f;
  }
  
  public final X1 f0()
  {
    return l.D();
  }
  
  public final I2 g(W5 paramW5)
  {
    e().n();
    p0();
    n.i(paramW5);
    n.e(o);
    boolean bool = K.isEmpty();
    Object localObject1 = null;
    if (!bool) {
      D.put(o, new b(K, null));
    }
    I2 localI2 = e0().D0(o);
    q3 localq3 = Q(o).c(q3.e(J));
    if (localq3.x()) {
      localObject2 = i.A(o, C);
    } else {
      localObject2 = "";
    }
    Object localObject3;
    if (localI2 == null)
    {
      localI2 = new I2(l, o);
      if (localq3.y()) {
        localI2.x(n(localq3));
      }
      localObject3 = localI2;
      if (localq3.x())
      {
        localI2.S((String)localObject2);
        localObject3 = localI2;
      }
    }
    else if ((localq3.x()) && (localObject2 != null) && (!((String)localObject2).equals(localI2.l())))
    {
      localI2.S((String)localObject2);
      localObject3 = localI2;
      if (C)
      {
        localObject3 = localI2;
        if (!"00000000-0000-0000-0000-000000000000".equals(i.z(o, localq3).first))
        {
          localI2.x(n(localq3));
          localObject3 = localI2;
          if (e0().F0(o, "_id") != null)
          {
            localObject3 = localI2;
            if (e0().F0(o, "_lair") == null)
            {
              l1 = b().a();
              localObject3 = new T5(o, "auto", "_lair", l1, Long.valueOf(1L));
              e0().d0((T5)localObject3);
              localObject3 = localI2;
            }
          }
        }
      }
    }
    else
    {
      localObject3 = localI2;
      if (TextUtils.isEmpty(localI2.u0()))
      {
        localObject3 = localI2;
        if (localq3.y())
        {
          localI2.x(n(localq3));
          localObject3 = localI2;
        }
      }
    }
    ((I2)localObject3).M(p);
    ((I2)localObject3).e(E);
    if (!TextUtils.isEmpty(y)) {
      ((I2)localObject3).J(y);
    }
    long l1 = s;
    if (l1 != 0L) {
      ((I2)localObject3).d0(l1);
    }
    if (!TextUtils.isEmpty(q)) {
      ((I2)localObject3).F(q);
    }
    ((I2)localObject3).c(x);
    Object localObject2 = r;
    if (localObject2 != null) {
      ((I2)localObject3).B((String)localObject2);
    }
    ((I2)localObject3).X(t);
    ((I2)localObject3).y(v);
    if (!TextUtils.isEmpty(u)) {
      ((I2)localObject3).P(u);
    }
    ((I2)localObject3).g(C);
    ((I2)localObject3).d(F);
    ((I2)localObject3).Z(G);
    if ((s7.a()) && ((c0().s(K.w0)) || (c0().B(o, K.y0)))) {
      ((I2)localObject3).V(L);
    }
    if ((o6.a()) && (c0().s(K.v0))) {}
    for (localObject2 = H;; localObject2 = localObject1)
    {
      ((I2)localObject3).f((List)localObject2);
      break;
      if ((!o6.a()) || (!c0().s(K.u0))) {
        break;
      }
    }
    if ((E7.a()) && (c0().s(K.A0))) {
      ((I2)localObject3).C(M);
    }
    if ((g7.a()) && (c0().s(K.L0))) {
      ((I2)localObject3).b(Q);
    }
    ((I2)localObject3).n0(N);
    if (((I2)localObject3).s()) {
      e0().U((I2)localObject3);
    }
    return (I2)localObject3;
  }
  
  public final f2 g0()
  {
    return (f2)i(b);
  }
  
  public final x2 h0()
  {
    return (x2)i(a);
  }
  
  public final N2 i0()
  {
    return l;
  }
  
  public final Y1 j()
  {
    return ((N2)n.i(l)).j();
  }
  
  public final u4 j0()
  {
    return (u4)i(h);
  }
  
  public final g5 k0()
  {
    return i;
  }
  
  public final Bundle l(String paramString)
  {
    e().n();
    p0();
    if (n6.a())
    {
      if (h0().J(paramString) == null) {
        return null;
      }
      Bundle localBundle = new Bundle();
      Object localObject = Q(paramString);
      localBundle.putAll(((q3)localObject).p());
      localBundle.putAll(f(paramString, a0(paramString), (q3)localObject, new l()).e());
      if (!m0().h0(paramString))
      {
        localObject = e0().F0(paramString, "_npa");
        if (localObject != null)
        {
          bool = e.equals(Long.valueOf(1L));
          break label143;
        }
        if (a.K(paramString, q3.a.s))
        {
          bool = false;
          break label143;
        }
      }
      boolean bool = true;
      label143:
      if (bool == true) {
        paramString = "denied";
      } else {
        paramString = "granted";
      }
      localBundle.putString("ad_personalization", paramString);
      return localBundle;
    }
    return null;
  }
  
  public final B5 l0()
  {
    return j;
  }
  
  public final Boolean m(I2 paramI2)
  {
    try
    {
      if (paramI2.z() != -2147483648L)
      {
        int i1 = al.a()).e(paramI2.t0(), 0).versionCode;
        if (paramI2.z() == i1) {
          return Boolean.TRUE;
        }
      }
      else
      {
        String str = al.a()).e(paramI2.t0(), 0).versionName;
        paramI2 = paramI2.h();
        if ((paramI2 != null) && (paramI2.equals(str)))
        {
          paramI2 = Boolean.TRUE;
          return paramI2;
        }
      }
      return Boolean.FALSE;
    }
    catch (PackageManager.NameNotFoundException paramI2) {}
    return null;
  }
  
  public final N5 m0()
  {
    return (N5)i(g);
  }
  
  public final String n(q3 paramq3)
  {
    if (paramq3.y())
    {
      paramq3 = new byte[16];
      n0().U0().nextBytes(paramq3);
      return String.format(Locale.US, "%032x", new Object[] { new BigInteger(1, paramq3) });
    }
    return null;
  }
  
  public final S5 n0()
  {
    return ((N2)n.i(l)).L();
  }
  
  public final void o(e parame)
  {
    W5 localW5 = W((String)n.i(o));
    if (localW5 != null) {
      p(parame, localW5);
    }
  }
  
  public final void o0()
  {
    e().n();
    p0();
    if (!n)
    {
      n = true;
      if (P())
      {
        int i1 = c(x);
        int i2 = l.B().D();
        e().n();
        a2 locala2;
        Integer localInteger1;
        Integer localInteger2;
        if (i1 > i2)
        {
          locala2 = j().G();
          localInteger1 = Integer.valueOf(i1);
          localInteger2 = Integer.valueOf(i2);
          str = "Panic: can't downgrade version. Previous, current version";
        }
        else
        {
          if (i1 >= i2) {
            return;
          }
          if (!J(i2, x)) {
            break label145;
          }
          locala2 = j().K();
          localInteger1 = Integer.valueOf(i1);
          localInteger2 = Integer.valueOf(i2);
        }
        for (String str = "Storage version upgraded. Previous, current version";; str = "Storage version upgrade failed. Previous, current version")
        {
          locala2.c(str, localInteger1, localInteger2);
          break;
          label145:
          locala2 = j().G();
          localInteger1 = Integer.valueOf(i1);
          localInteger2 = Integer.valueOf(i2);
        }
      }
    }
  }
  
  public final void p(e parame, W5 paramW5)
  {
    n.i(parame);
    n.e(o);
    n.i(q);
    n.e(q.p);
    e().n();
    p0();
    if (!d0(paramW5)) {
      return;
    }
    if (!v)
    {
      g(paramW5);
      return;
    }
    e0().Q0();
    String str;
    e locale;
    try
    {
      g(paramW5);
      str = (String)n.i(o);
      locale = e0().A0(str, q.p);
      if (locale == null) {
        break label281;
      }
      j().F().c("Removing conditional user property", o, l.D().g(q.p));
      e0().D(str, q.p);
      if (s) {
        e0().L0(str, q.p);
      }
    }
    finally
    {
      break label333;
    }
    Object localObject = y;
    if (localObject != null)
    {
      localObject = p;
      if (localObject != null) {}
      for (localObject = ((D)localObject).g();; localObject = null) {
        break;
      }
      Y((I)n.i(n0().C(str, iy)).o, (Bundle)localObject, p, y.r, true, true)), paramW5);
      break label318;
      label281:
      j().L().c("Conditional user property doesn't exist", Y1.v(o), l.D().g(q.p));
    }
    label318:
    e0().T0();
    e0().R0();
    return;
    label333:
    e0().R0();
    throw parame;
  }
  
  public final void p0()
  {
    if (m) {
      return;
    }
    throw new IllegalStateException("UploadController is not initialized");
  }
  
  public final void q(I paramI, W5 paramW5)
  {
    n.i(paramW5);
    n.e(o);
    e().n();
    p0();
    String str = o;
    long l1 = r;
    Object localObject1 = c2.b(paramI);
    e().n();
    if (E != null)
    {
      paramI = F;
      if ((paramI != null) && (paramI.equals(str)))
      {
        paramI = E;
        break label85;
      }
    }
    paramI = null;
    label85:
    S5.L(paramI, d, false);
    paramI = ((c2)localObject1).a();
    m0();
    if (!N5.c0(paramI, paramW5)) {
      return;
    }
    if (!v)
    {
      g(paramW5);
      return;
    }
    localObject1 = H;
    if (localObject1 != null) {
      if (((List)localObject1).contains(o))
      {
        localObject1 = p.g();
        ((BaseBundle)localObject1).putLong("ga_safelisted", 1L);
        paramI = new I(o, new D((Bundle)localObject1), q, r);
      }
      else
      {
        j().F().d("Dropping non-safelisted event. appId, event name, origin", str, o, q);
        return;
      }
    }
    e0().Q0();
    boolean bool;
    try
    {
      localObject1 = e0();
      n.e(str);
      ((m3)localObject1).n();
      ((C5)localObject1).u();
      bool = l1 < 0L;
      if (bool)
      {
        ((m3)localObject1).j().L().c("Invalid time querying timed out conditional properties", Y1.v(str), Long.valueOf(l1));
        localObject1 = Collections.emptyList();
      }
    }
    finally
    {
      break label1225;
    }
    localObject1 = ((p)localObject1).S("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[] { str, String.valueOf(l1) });
    Object localObject2 = ((List)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (e)((Iterator)localObject2).next();
      if (localObject1 != null)
      {
        j().K().d("User property timed out", o, l.D().g(q.p), q.a());
        if (u != null)
        {
          localObject3 = new R2/I;
          ((I)localObject3).<init>(u, l1);
          Y((I)localObject3, paramW5);
        }
        e0().D(str, q.p);
      }
    }
    localObject1 = e0();
    n.e(str);
    ((m3)localObject1).n();
    ((C5)localObject1).u();
    if (bool)
    {
      ((m3)localObject1).j().L().c("Invalid time querying expired conditional properties", Y1.v(str), Long.valueOf(l1));
      localObject1 = Collections.emptyList();
    }
    else
    {
      localObject1 = ((p)localObject1).S("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[] { str, String.valueOf(l1) });
    }
    Object localObject3 = new java/util/ArrayList;
    ((ArrayList)localObject3).<init>(((List)localObject1).size());
    localObject2 = ((List)localObject1).iterator();
    Object localObject4;
    while (((Iterator)localObject2).hasNext())
    {
      localObject4 = (e)((Iterator)localObject2).next();
      if (localObject4 != null)
      {
        j().K().d("User property expired", o, l.D().g(q.p), q.a());
        e0().L0(str, q.p);
        localObject1 = y;
        if (localObject1 != null) {
          ((List)localObject3).add(localObject1);
        }
        e0().D(str, q.p);
      }
    }
    int i2 = ((ArrayList)localObject3).size();
    int i3 = 0;
    while (i3 < i2)
    {
      localObject1 = ((ArrayList)localObject3).get(i3);
      i3++;
      localObject1 = (I)localObject1;
      localObject2 = new R2/I;
      ((I)localObject2).<init>((I)localObject1, l1);
      Y((I)localObject2, paramW5);
    }
    localObject3 = e0();
    localObject1 = o;
    n.e(str);
    n.e((String)localObject1);
    ((m3)localObject3).n();
    ((C5)localObject3).u();
    if (bool)
    {
      ((m3)localObject3).j().L().d("Invalid time querying triggered conditional properties", Y1.v(str), ((m3)localObject3).h().c((String)localObject1), Long.valueOf(l1));
      localObject1 = Collections.emptyList();
    }
    else
    {
      localObject1 = ((p)localObject3).S("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[] { str, localObject1, String.valueOf(l1) });
    }
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(((List)localObject1).size());
    Iterator localIterator = ((List)localObject1).iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if (locale != null)
      {
        localObject1 = q;
        T5 localT5 = new R2/T5;
        localT5.<init>((String)n.i(o), p, p, l1, n.i(((R5)localObject1).a()));
        if (e0().d0(localT5))
        {
          localObject1 = j().K();
          localObject4 = "User property triggered";
          localObject2 = o;
          str = l.D().g(c);
        }
        for (localObject3 = e;; localObject3 = e)
        {
          ((a2)localObject1).d((String)localObject4, localObject2, str, localObject3);
          break;
          localObject1 = j().G();
          localObject4 = "Too many active user properties, ignoring";
          localObject2 = Y1.v(o);
          str = l.D().g(c);
        }
        localObject1 = w;
        if (localObject1 != null) {
          localArrayList.add(localObject1);
        }
        localObject1 = new R2/R5;
        ((R5)localObject1).<init>(localT5);
        q = ((R5)localObject1);
        s = true;
        e0().b0(locale);
      }
    }
    Y(paramI, paramW5);
    int i1 = localArrayList.size();
    i3 = 0;
    while (i3 < i1)
    {
      paramI = localArrayList.get(i3);
      i3++;
      localObject1 = (I)paramI;
      paramI = new R2/I;
      paramI.<init>((I)localObject1, l1);
      Y(paramI, paramW5);
    }
    e0().T0();
    e0().R0();
    return;
    label1225:
    e0().R0();
    throw paramI;
  }
  
  public final void q0()
  {
    s += 1;
  }
  
  public final void r(I paramI, String paramString)
  {
    I2 localI2 = e0().D0(paramString);
    if ((localI2 != null) && (!TextUtils.isEmpty(localI2.h())))
    {
      Object localObject = m(localI2);
      if (localObject == null)
      {
        if (!"_ui".equals(o)) {
          j().L().b("Could not find package. appId", Y1.v(paramString));
        }
      }
      else if (!((Boolean)localObject).booleanValue())
      {
        j().G().b("App version does not match; dropping event. appId", Y1.v(paramString));
        return;
      }
      q3 localq3 = Q(paramString);
      if ((n6.a()) && (c0().s(K.T0))) {
        localObject = a0(paramString).i();
      }
      for (int i1 = localq3.b();; i1 = 100)
      {
        break;
        localObject = "";
      }
      U(paramI, new W5(paramString, localI2.j(), localI2.h(), localI2.z(), localI2.v0(), localI2.g0(), localI2.a0(), null, localI2.r(), false, localI2.i(), localI2.v(), 0L, 0, localI2.q(), false, localI2.r0(), localI2.q0(), localI2.c0(), localI2.n(), null, localq3.v(), "", null, localI2.t(), localI2.p0(), i1, (String)localObject, localI2.a(), localI2.D()));
      return;
    }
    j().F().b("No app data available; dropping event", paramString);
  }
  
  public final void r0()
  {
    r += 1;
  }
  
  public final void s(I2 paramI2, d2.a parama)
  {
    e().n();
    p0();
    if (n6.a())
    {
      l locall = l.b(parama.U0());
      Object localObject1 = paramI2.t0();
      e().n();
      p0();
      if (n6.a())
      {
        localObject1 = Q((String)localObject1);
        if ((n6.a()) && (c0().s(K.V0))) {
          parama.o0(((q3)localObject1).w());
        }
        if (((q3)localObject1).s() != null) {
          locall.c(q3.a.p, ((q3)localObject1).b());
        } else {
          locall.d(q3.a.p, k.w);
        }
        if (((q3)localObject1).u() != null) {
          locall.c(q3.a.q, ((q3)localObject1).b());
        } else {
          locall.d(q3.a.q, k.w);
        }
      }
      localObject1 = paramI2.t0();
      e().n();
      p0();
      if (n6.a())
      {
        localObject1 = f((String)localObject1, a0((String)localObject1), Q((String)localObject1), locall);
        parama.P(((Boolean)n.i(((z)localObject1).g())).booleanValue());
        if (!TextUtils.isEmpty(((z)localObject1).h())) {
          parama.s0(((z)localObject1).h());
        }
      }
      e().n();
      p0();
      if (n6.a())
      {
        Object localObject2 = parama.Z0().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (h2)((Iterator)localObject2).next();
          if ("_npa".equals(((h2)localObject1).Z())) {
            break label305;
          }
        }
        localObject1 = null;
        label305:
        if (localObject1 != null)
        {
          localObject2 = q3.a.s;
          if (locall.a((q3.a)localObject2) == k.p)
          {
            paramI2 = paramI2.q0();
            if ((paramI2 != null) && ((paramI2 != Boolean.TRUE) || (((h2)localObject1).U() == 1L)) && ((paramI2 != Boolean.FALSE) || (((h2)localObject1).U() == 0L))) {}
            for (paramI2 = k.s;; paramI2 = k.u)
            {
              locall.d((q3.a)localObject2, paramI2);
              break;
            }
          }
        }
        else if ((n6.a()) && (c0().s(K.W0)))
        {
          localObject1 = a.J(paramI2.t0());
          boolean bool = true;
          if (localObject1 == null)
          {
            locall.d(q3.a.s, k.w);
          }
          else
          {
            localObject1 = a;
            paramI2 = paramI2.t0();
            localObject2 = q3.a.s;
            bool = true ^ ((x2)localObject1).K(paramI2, (q3.a)localObject2);
            locall.d((q3.a)localObject2, k.q);
          }
          parama.G((h2)h2.X().z("_npa").B(b().a()).y(bool).p());
        }
      }
      parama.k0(locall.toString());
    }
  }
  
  public final void s0()
  {
    e().n();
    e0().S0();
    if (i.g.a() == 0L) {
      i.g.b(b().a());
    }
    N();
  }
  
  public final void t0()
  {
    e().n();
    p0();
    v = true;
    for (;;)
    {
      try
      {
        localObject1 = l.J().W();
        if (localObject1 != null) {
          continue;
        }
      }
      finally
      {
        Object localObject1;
        Object localObject7;
        label48:
        Object localObject3;
        long l1;
        int i1;
        long l2;
        String str;
        int i3;
        Object localObject9;
        boolean bool2;
        boolean bool3;
        int i4;
        int i5;
        int i6;
        Object localObject12;
        boolean bool1 = false;
        continue;
        if (!"_f".equals(((com.google.android.gms.internal.measurement.Y1)localObject12).b0())) {
          continue;
        }
        int i2 = 1;
        continue;
        Object localObject8 = localObject4;
        if (i6 == 0) {
          continue;
        }
        ((d2.a)localObject10).t0();
        ((d2.a)localObject10).N((Iterable)localObject11);
        Object localObject5 = localObject8;
        if (i2 == 0) {
          continue;
        }
        F(((d2.a)localObject10).S0(), true);
        localObject5 = localObject8;
        if (((d2.a)localObject10).w() != 0) {
          continue;
        }
        continue;
        if (!c0().B(str, K.g0)) {
          continue;
        }
        localObject8 = ((d2)((Y3.b)localObject10).p()).h();
        ((d2.a)localObject10).B(m0().A((byte[])localObject8));
        ((c2.a)localObject7).x((d2.a)localObject10);
        i5++;
        continue;
        if ((!i6.a()) || (!c0().s(K.Y0)) || (((c2.a)localObject7).w() != 0)) {
          continue;
        }
        G((List)localObject9);
        I(false, 204, null, null, str);
        v = false;
        continue;
        if (!j().C(2)) {
          continue;
        }
        localObject5 = m0().K((com.google.android.gms.internal.measurement.c2)((Y3.b)localObject7).p());
        continue;
        localObject5 = null;
        m0();
        Object localObject11 = ((com.google.android.gms.internal.measurement.c2)((Y3.b)localObject7).p()).h();
        Object localObject10 = j.u(str);
        try
        {
          G((List)localObject9);
          i.h.b(l1);
          localObject8 = "?";
          if (i3 > 0) {
            localObject8 = ((c2.a)localObject7).y(0).D3();
          }
          j().K().d("Uploading data. app, uncompressed size, data", localObject8, Integer.valueOf(localObject11.length), localObject5);
          u = true;
          localObject9 = g0();
          localObject7 = new java/net/URL;
          ((URL)localObject7).<init>(((E5)localObject10).a());
          localObject5 = ((E5)localObject10).b();
          localObject8 = new R2/F5;
          ((F5)localObject8).<init>(this, str);
          ((m3)localObject9).n();
          ((C5)localObject9).u();
          n.i(localObject7);
          n.i(localObject11);
          n.i(localObject8);
          G2 localG2 = ((m3)localObject9).e();
          localObject12 = new R2/k2;
          ((k2)localObject12).<init>((f2)localObject9, str, (URL)localObject7, (byte[])localObject11, (Map)localObject5, (e2)localObject8);
          localG2.z((Runnable)localObject12);
        }
        catch (MalformedURLException localMalformedURLException)
        {
          j().G().c("Failed to parse upload URL. Not uploading. appId", Y1.v(str), ((E5)localObject10).a());
          continue;
        }
        A = -1L;
        localObject6 = e0();
        c0();
        localObject6 = ((p)localObject6).O(l1 - g.G());
        if (TextUtils.isEmpty((CharSequence)localObject6)) {
          continue;
        }
        localObject6 = e0().D0((String)localObject6);
        if (localObject6 == null) {
          continue;
        }
        V((I2)localObject6);
        continue;
        v = bool1;
        M();
      }
      try
      {
        localObject1 = j().L();
        localObject7 = "Upload data called on the client side before use of service was decided";
        ((a2)localObject1).a((String)localObject7);
        v = false;
        M();
        return;
      }
      finally
      {
        bool1 = false;
        continue;
      }
      bool1 = ((Boolean)localObject2).booleanValue();
      if (!bool1) {
        continue;
      }
      localObject3 = j().G();
      localObject7 = "Upload called in the client side when service should be used";
    }
    l1 = o;
    if (l1 > 0L) {}
    for (;;)
    {
      N();
      break label48;
      e().n();
      localObject3 = y;
      if (localObject3 != null)
      {
        localObject3 = j().K();
        localObject7 = "Uploading requested multiple times";
        break;
      }
      bool1 = g0().A();
      if (bool1) {
        break label167;
      }
      j().K().a("Network not connected, ignoring upload request");
    }
    label167:
    l1 = b().a();
    i1 = c0().u(null, K.U);
    c0();
    l2 = g.G();
    for (i2 = 0; i2 < i1; i2++)
    {
      bool1 = L(null, l1 - l2);
      if (!bool1) {
        break;
      }
    }
    bool1 = g7.a();
    if (bool1)
    {
      e().n();
      localObject7 = q.iterator();
      while (((Iterator)localObject7).hasNext())
      {
        localObject3 = (String)((Iterator)localObject7).next();
        if ((g7.a()) && (c0().B((String)localObject3, K.L0)))
        {
          j().F().b("Notifying app that trigger URIs are available. App ID", localObject3);
          localObject8 = new android/content/Intent;
          ((Intent)localObject8).<init>();
          ((Intent)localObject8).setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
          ((Intent)localObject8).setPackage((String)localObject3);
          l.a().sendBroadcast((Intent)localObject8);
        }
      }
      q.clear();
    }
    l2 = i.g.a();
    if (l2 != 0L) {
      j().F().b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(l1 - l2)));
    }
    str = e0().C();
    if (!TextUtils.isEmpty(str))
    {
      l2 = A;
      if (l2 == -1L) {
        A = e0().y();
      }
      i1 = c0().u(str, K.i);
      i2 = Math.max(0, c0().u(str, K.j));
      localObject8 = e0().Q(str, i1, i2);
      if (!((List)localObject8).isEmpty())
      {
        bool1 = Q(str).x();
        localObject3 = localObject8;
        if (bool1)
        {
          localObject7 = ((List)localObject8).iterator();
          while (((Iterator)localObject7).hasNext())
          {
            localObject3 = (d2)nextfirst;
            if (!((d2)localObject3).o0().isEmpty())
            {
              localObject7 = ((d2)localObject3).o0();
              break label573;
            }
          }
          localObject7 = null;
          label573:
          localObject3 = localObject8;
          if (localObject7 != null) {
            for (i2 = 0;; i2++)
            {
              localObject3 = localObject8;
              if (i2 >= ((List)localObject8).size()) {
                break;
              }
              localObject3 = (d2)getfirst;
              if ((!((d2)localObject3).o0().isEmpty()) && (!((d2)localObject3).o0().equals(localObject7)))
              {
                localObject3 = ((List)localObject8).subList(0, i2);
                break;
              }
            }
          }
        }
        localObject7 = com.google.android.gms.internal.measurement.c2.J();
        i3 = ((List)localObject3).size();
        localObject9 = new java/util/ArrayList;
        ((ArrayList)localObject9).<init>(((List)localObject3).size());
        bool1 = c0().K(str);
        if (bool1)
        {
          bool1 = Q(str).x();
          if (bool1)
          {
            i1 = 1;
            break label723;
          }
        }
        i1 = 0;
        label723:
        bool1 = Q(str).x();
        bool2 = Q(str).y();
        bool3 = s7.a();
        if (bool3)
        {
          bool3 = c0().B(str, K.y0);
          if (bool3)
          {
            i4 = 1;
            break label782;
          }
        }
        i4 = 0;
        label782:
        i5 = 0;
        if (i5 < i3)
        {
          localObject10 = (d2.a)((d2)getfirst).x();
          ((List)localObject9).add((Long)getsecond);
          c0();
          ((d2.a)localObject10).F0(82001L).C0(l1).b0(false);
          if (i1 == 0) {
            ((d2.a)localObject10).p0();
          }
          if (!bool1)
          {
            ((d2.a)localObject10).L0();
            ((d2.a)localObject10).B0();
          }
          if (!bool2) {
            ((d2.a)localObject10).c0();
          }
          E(str, (d2.a)localObject10);
          if (i4 == 0) {
            ((d2.a)localObject10).N0();
          }
          if ((i6.a()) && (c0().s(K.Y0)))
          {
            localObject8 = ((d2.a)localObject10).X0();
            bool3 = TextUtils.isEmpty((CharSequence)localObject8);
            if (!bool3)
            {
              bool3 = ((String)localObject8).equals("00000000-0000-0000-0000-000000000000");
              if (!bool3) {
                break label1133;
              }
            }
            localObject11 = new java/util/ArrayList;
            ((ArrayList)localObject11).<init>(((d2.a)localObject10).Y0());
            localObject8 = ((List)localObject11).iterator();
            i6 = 0;
            for (i2 = i6;; i2 = 1)
            {
              if (!((Iterator)localObject8).hasNext()) {
                break label1090;
              }
              localObject12 = (com.google.android.gms.internal.measurement.Y1)((Iterator)localObject8).next();
              if (!"_fx".equals(((com.google.android.gms.internal.measurement.Y1)localObject12).b0())) {
                break;
              }
              ((Iterator)localObject8).remove();
              i6 = 1;
            }
          }
        }
      }
    }
  }
  
  public final void u(R5 paramR5, W5 paramW5)
  {
    e().n();
    p0();
    if (!d0(paramW5)) {
      return;
    }
    if (!v)
    {
      g(paramW5);
      return;
    }
    int i1 = n0().q0(p);
    int i2 = 0;
    int i3;
    if (i1 != 0)
    {
      n0();
      localObject1 = p;
      c0();
      localObject1 = S5.I((String)localObject1, 24, true);
      paramR5 = p;
      if (paramR5 != null) {
        i3 = paramR5.length();
      } else {
        i3 = 0;
      }
      n0();
      S5.N(G, o, i1, "_ev", (String)localObject1, i3);
      return;
    }
    i1 = n0().w(p, paramR5.a());
    if (i1 != 0)
    {
      n0();
      localObject1 = p;
      c0();
      localObject1 = S5.I((String)localObject1, 24, true);
      paramR5 = paramR5.a();
      i3 = i2;
      if (paramR5 != null) {
        if (!(paramR5 instanceof String))
        {
          i3 = i2;
          if (!(paramR5 instanceof CharSequence)) {}
        }
        else
        {
          i3 = String.valueOf(paramR5).length();
        }
      }
      n0();
      S5.N(G, o, i1, "_ev", (String)localObject1, i3);
      return;
    }
    Object localObject1 = n0().A0(p, paramR5.a());
    if (localObject1 == null) {
      return;
    }
    long l2;
    if ("_sid".equals(p))
    {
      long l1 = q;
      localObject2 = u;
      String str = (String)n.i(o);
      Object localObject3 = e0().F0(str, "_sno");
      if (localObject3 != null)
      {
        Object localObject4 = e;
        if ((localObject4 instanceof Long))
        {
          l2 = ((Long)localObject4).longValue();
          break label415;
        }
      }
      if (localObject3 != null) {
        j().L().b("Retrieved last session number from database does not contain a valid (long) value", e);
      }
      localObject3 = e0().C0(str, "_s");
      if (localObject3 != null)
      {
        l2 = c;
        j().K().b("Backfill the session number. Last used session number", Long.valueOf(l2));
      }
      else
      {
        l2 = 0L;
      }
      label415:
      u(new R5("_sno", l1, Long.valueOf(l2 + 1L), (String)localObject2), paramW5);
    }
    Object localObject2 = new T5((String)n.i(o), (String)n.i(u), p, q, localObject1);
    j().K().c("Setting user property", l.D().g(c), localObject1);
    e0().Q0();
    try
    {
      if ("_id".equals(c))
      {
        localObject1 = e0().F0(o, "_id");
        if ((localObject1 != null) && (!e.equals(e))) {
          e0().L0(o, "_lair");
        }
      }
    }
    finally
    {
      break label743;
    }
    g(paramW5);
    boolean bool = e0().d0((T5)localObject2);
    if ("_sid".equals(p))
    {
      l2 = m0().z(L);
      paramR5 = e0().D0(o);
      if (paramR5 != null)
      {
        paramR5.l0(l2);
        if (paramR5.s()) {
          e0().U(paramR5);
        }
      }
    }
    e0().T0();
    if (!bool)
    {
      j().G().c("Too many unique user properties are set. Ignoring user property", l.D().g(c), e);
      n0();
      S5.N(G, o, 9, null, null, 0);
    }
    e0().R0();
    return;
    label743:
    e0().R0();
    throw paramR5;
  }
  
  public final long u0()
  {
    long l1 = b().a();
    g5 localg5 = i;
    localg5.u();
    localg5.n();
    long l2 = i.a();
    long l3 = l2;
    if (l2 == 0L)
    {
      l3 = localg5.k().U0().nextInt(86400000) + 1L;
      i.b(l3);
    }
    return (l1 + l3) / 1000L / 60L / 60L / 24L;
  }
  
  public final j2 v0()
  {
    j2 localj2 = d;
    if (localj2 != null) {
      return localj2;
    }
    throw new IllegalStateException("Network broadcast receiver not created");
  }
  
  public final x5 w0()
  {
    return (x5)i(e);
  }
  
  public final void x(d2.a parama, long paramLong, boolean paramBoolean)
  {
    String str;
    if (paramBoolean) {
      str = "_se";
    } else {
      str = "_lte";
    }
    T5 localT5 = e0().F0(parama.S0(), str);
    if ((localT5 != null) && (e != null)) {
      localT5 = new T5(parama.S0(), "auto", str, b().a(), Long.valueOf(((Long)e).longValue() + paramLong));
    } else {
      localT5 = new T5(parama.S0(), "auto", str, b().a(), Long.valueOf(paramLong));
    }
    h2 localh2 = (h2)h2.X().z(str).B(b().a()).y(((Long)e).longValue()).p();
    int i1 = N5.y(parama, str);
    if (i1 >= 0) {
      parama.A(i1, localh2);
    } else {
      parama.G(localh2);
    }
    if (paramLong > 0L)
    {
      e0().d0(localT5);
      if (paramBoolean) {
        parama = "session-scoped";
      } else {
        parama = "lifetime";
      }
      j().K().c("Updated engagement user property. scope, value", parama, e);
    }
  }
  
  public final void y(Runnable paramRunnable)
  {
    e().n();
    if (p == null) {
      p = new ArrayList();
    }
    p.add(paramRunnable);
  }
  
  public final void z(String paramString, int paramInt, Throwable paramThrowable, byte[] paramArrayOfByte, Map paramMap)
  {
    e().n();
    p0();
    n.e(paramString);
    byte[] arrayOfByte = paramArrayOfByte;
    if (paramArrayOfByte == null) {
      try
      {
        arrayOfByte = new byte[0];
      }
      finally
      {
        break label580;
      }
    }
    j().K().b("onConfigFetched. Response size", Integer.valueOf(arrayOfByte.length));
    e0().Q0();
    I2 localI2;
    int i1;
    try
    {
      localI2 = e0().D0(paramString);
      if (((paramInt == 200) || (paramInt == 204) || (paramInt == 304)) && (paramThrowable == null)) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (localI2 == null) {
        j().L().b("App does not exist in onConfigFetched. appId", Y1.v(paramString));
      }
    }
    finally
    {
      break label571;
    }
    boolean bool;
    if ((i1 == 0) && (paramInt != 404))
    {
      localI2.b0(b().a());
      e0().U(localI2);
      j().K().c("Fetching config failed. code, error", Integer.valueOf(paramInt), paramThrowable);
      h0().T(paramString);
      i.h.b(b().a());
      if ((paramInt == 503) || (paramInt == 429)) {
        i.f.b(b().a());
      }
      N();
    }
    else
    {
      if (paramMap != null) {
        paramThrowable = (List)paramMap.get("Last-Modified");
      } else {
        paramThrowable = null;
      }
      if ((paramThrowable != null) && (!paramThrowable.isEmpty())) {
        paramThrowable = (String)paramThrowable.get(0);
      } else {
        paramThrowable = null;
      }
      if (paramMap != null) {
        paramArrayOfByte = (List)paramMap.get("ETag");
      } else {
        paramArrayOfByte = null;
      }
      if ((paramArrayOfByte != null) && (!paramArrayOfByte.isEmpty())) {
        paramArrayOfByte = (String)paramArrayOfByte.get(0);
      } else {
        paramArrayOfByte = null;
      }
      if ((paramInt != 404) && (paramInt != 304))
      {
        bool = h0().H(paramString, arrayOfByte, paramThrowable, paramArrayOfByte);
        if (bool) {
          break label465;
        }
        paramString = e0();
      }
    }
    for (;;)
    {
      paramString.R0();
      t = false;
      M();
      return;
      if (h0().L(paramString) == null)
      {
        bool = h0().H(paramString, null, null, null);
        if (!bool)
        {
          paramString = e0();
          continue;
        }
      }
      label465:
      localI2.A(b().a());
      e0().U(localI2);
      if (paramInt == 404) {
        j().M().b("Config not found. Using empty config. appId", paramString);
      } else {
        j().K().c("Successfully fetched config. Got network response. code, size", Integer.valueOf(paramInt), Integer.valueOf(arrayOfByte.length));
      }
      if ((!g0().A()) || (!O())) {
        break;
      }
      t0();
      e0().T0();
      paramString = e0();
    }
    label571:
    e0().R0();
    throw paramString;
    label580:
    t = false;
    M();
    throw paramString;
  }
  
  public final class a
    implements t
  {
    public d2 a;
    public List b;
    public List c;
    public long d;
    
    public a() {}
    
    public static long c(com.google.android.gms.internal.measurement.Y1 paramY1)
    {
      return paramY1.Y() / 1000L / 60L / 60L;
    }
    
    public final void a(d2 paramd2)
    {
      n.i(paramd2);
      a = paramd2;
    }
    
    public final boolean b(long paramLong, com.google.android.gms.internal.measurement.Y1 paramY1)
    {
      n.i(paramY1);
      if (c == null) {
        c = new ArrayList();
      }
      if (b == null) {
        b = new ArrayList();
      }
      if ((!c.isEmpty()) && (c((com.google.android.gms.internal.measurement.Y1)c.get(0)) != c(paramY1))) {
        return false;
      }
      long l = d + paramY1.a();
      c0();
      if (l >= Math.max(0, ((Integer)K.k.a(null)).intValue())) {
        return false;
      }
      d = l;
      c.add(paramY1);
      b.add(Long.valueOf(paramLong));
      int i = c.size();
      c0();
      return i < Math.max(1, ((Integer)K.l.a(null)).intValue());
    }
  }
  
  public final class b
  {
    public final String a;
    public long b;
    
    public b()
    {
      this(this$1.n0().S0());
    }
    
    public b(String paramString)
    {
      a = paramString;
      b = this$1.b().b();
    }
  }
}

/* Location:
 * Qualified Name:     R2.D5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
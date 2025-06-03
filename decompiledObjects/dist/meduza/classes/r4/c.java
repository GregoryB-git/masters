package r4;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import b8.c.a;
import b8.r;
import b8.s;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.auth.zzf;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.iid.FirebaseInstanceId;
import d2.q;
import e7.a1;
import e7.b1;
import e7.h;
import e7.h0;
import e7.j2;
import e7.k3;
import e7.l1;
import e7.m0;
import e7.n1;
import e7.o0;
import e7.t0;
import e7.v;
import e7.w5;
import e7.y3;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import m6.j;
import p8.e;
import z5.k;
import z5.l;

public final class c
  implements k, Continuation, OnSuccessListener
{
  public final Object b;
  public final Object c;
  
  public c()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(512);
    b = localByteArrayOutputStream;
    c = new DataOutputStream(localByteArrayOutputStream);
  }
  
  public c(w8.a parama)
  {
    b = parama;
    Bundle localBundle = new Bundle();
    if ((parama != null) && (parama.D() != null))
    {
      parama = parama.D().getBundle("scionData");
      if (parama != null)
      {
        parama = parama.getBundle("_cmp");
        if (parama != null)
        {
          c("medium", "utm_medium", parama, localBundle);
          c("source", "utm_source", parama, localBundle);
          c("campaign", "utm_campaign", parama, localBundle);
        }
      }
    }
    c = localBundle;
  }
  
  public static c b(Context paramContext)
  {
    try
    {
      localObject = new java/io/File;
      ((File)localObject).<init>(paramContext.getFilesDir(), "generatefid.lock");
      paramContext = new java/io/RandomAccessFile;
      paramContext.<init>((File)localObject, "rw");
      localFileChannel = paramContext.getChannel();
      try
      {
        localObject = localFileChannel.lock();
        try
        {
          paramContext = new c(8, localFileChannel, localObject);
          return paramContext;
        }
        catch (OverlappingFileLockException paramContext) {}catch (Error paramContext) {}catch (IOException paramContext) {}
        localObject = null;
      }
      catch (OverlappingFileLockException paramContext) {}catch (Error paramContext) {}catch (IOException paramContext) {}
    }
    catch (OverlappingFileLockException paramContext) {}catch (Error paramContext) {}catch (IOException paramContext) {}
    FileChannel localFileChannel = null;
    Object localObject = localFileChannel;
    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", paramContext);
    if (localObject != null) {}
    try
    {
      ((FileLock)localObject).release();
      if (localFileChannel == null) {}
    }
    catch (IOException paramContext)
    {
      try
      {
        localFileChannel.close();
        return null;
        paramContext = paramContext;
      }
      catch (IOException paramContext)
      {
        for (;;) {}
      }
    }
  }
  
  public static void c(String paramString1, String paramString2, Bundle paramBundle1, Bundle paramBundle2)
  {
    paramString1 = paramBundle1.getString(paramString1);
    if (!TextUtils.isEmpty(paramString1)) {
      paramBundle2.putString(paramString2, paramString1);
    }
  }
  
  public final Object a(IBinder paramIBinder)
  {
    paramIBinder = zze.zzb(paramIBinder).zzd((String)b, (Bundle)c);
    if (paramIBinder != null)
    {
      Object localObject = l.a;
      localObject = paramIBinder.getString("Error");
      if (paramIBinder.getBoolean("booleanResult")) {
        return null;
      }
      throw new z3.f((String)localObject);
    }
    l.c.f("Service call returned null.", new Object[0]);
    throw new IOException("Service unavailable.");
  }
  
  public final void d()
  {
    try
    {
      e locale = (e)c;
      String str = (String)b;
      locale.getClass();
      localObject = new java/io/File;
      ((File)localObject).<init>(c, str);
      ((File)localObject).createNewFile();
    }
    catch (IOException localIOException)
    {
      Object localObject = f.l("Error creating marker: ");
      ((StringBuilder)localObject).append((String)b);
      Log.e("FirebaseCrashlytics", ((StringBuilder)localObject).toString(), localIOException);
    }
  }
  
  public final byte[] e(a parama)
  {
    ((ByteArrayOutputStream)b).reset();
    try
    {
      Object localObject = (DataOutputStream)c;
      ((DataOutputStream)localObject).writeBytes(a);
      ((DataOutputStream)localObject).writeByte(0);
      localObject = b;
      if (localObject == null) {
        localObject = "";
      }
      DataOutputStream localDataOutputStream = (DataOutputStream)c;
      localDataOutputStream.writeBytes((String)localObject);
      localDataOutputStream.writeByte(0);
      ((DataOutputStream)c).writeLong(c);
      ((DataOutputStream)c).writeLong(d);
      ((DataOutputStream)c).write(e);
      ((DataOutputStream)c).flush();
      parama = ((ByteArrayOutputStream)b).toByteArray();
      return parama;
    }
    catch (IOException parama)
    {
      throw new RuntimeException(parama);
    }
  }
  
  public final void f(Throwable paramThrowable)
  {
    ((k3)c).l();
    k3 localk3 = (k3)c;
    r = false;
    if (localk3.h().x(null, h0.U0))
    {
      localk3 = (k3)c;
      String str = paramThrowable.getMessage();
      w = false;
      if (str != null) {
        if ((!(paramThrowable instanceof IllegalStateException)) && (!str.contains("garbage collected")) && (!paramThrowable.getClass().getSimpleName().equals("ServiceUnavailableException")))
        {
          if (((paramThrowable instanceof SecurityException)) && (!str.endsWith("READ_DEVICE_CONFIG")))
          {
            i = 3;
            break label142;
          }
        }
        else
        {
          if (str.contains("Background")) {
            w = true;
          }
          i = 1;
          break label142;
        }
      }
    }
    int i = 2;
    label142:
    i--;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          c).zzj().o.d("registerTriggerAsync failed. Dropping URI. App ID, Throwable", a1.p(((k3)c).m().v()), paramThrowable);
          h();
          paramThrowable = (k3)c;
          s = 1;
          paramThrowable.N();
        }
        return;
      }
      ((k3)c).I().add((w5)b);
      if (c).s > ((Integer)h0.r0.a(null)).intValue())
      {
        localk3 = (k3)c;
        s = 1;
        zzjr.d("registerTriggerAsync failed. May try later. App ID, throwable", a1.p(((k3)c).m().v()), a1.p(paramThrowable.toString()));
        return;
      }
      c).zzj().r.a(a1.p(((k3)c).m().v()), a1.p(String.valueOf(c).s)), a1.p(paramThrowable.toString()), "registerTriggerAsync failed. App ID, delay in seconds, throwable");
      paramThrowable = (k3)c;
      i = s;
      if (t == null) {
        t = new y3(paramThrowable, (j2)b, 0);
      }
      t.b(i * 1000L);
      paramThrowable = (k3)c;
      s <<= 1;
      return;
    }
    c).zzj().r.d("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", a1.p(((k3)c).m().v()), a1.p(paramThrowable.toString()));
    paramThrowable = (k3)c;
    s = 1;
    paramThrowable.I().add((w5)b);
  }
  
  public final void g()
  {
    try
    {
      ((FileLock)c).release();
      ((FileChannel)b).close();
    }
    catch (IOException localIOException)
    {
      Log.e("CrossProcessLock", "encountered error while releasing, ignoring", localIOException);
    }
  }
  
  public final void h()
  {
    Object localObject1 = ((k3)c).j().w();
    Object localObject2 = b;
    ((SparseArray)localObject1).put(c, Long.valueOf(b));
    l1 locall1 = ((k3)c).j();
    localObject2 = new int[((SparseArray)localObject1).size()];
    long[] arrayOfLong = new long[((SparseArray)localObject1).size()];
    for (int i = 0; i < ((SparseArray)localObject1).size(); i++)
    {
      localObject2[i] = ((SparseArray)localObject1).keyAt(i);
      arrayOfLong[i] = ((Long)((SparseArray)localObject1).valueAt(i)).longValue();
    }
    localObject1 = new Bundle();
    ((BaseBundle)localObject1).putIntArray("uriSources", (int[])localObject2);
    ((BaseBundle)localObject1).putLongArray("uriTimestamps", arrayOfLong);
    x.b((Bundle)localObject1);
  }
  
  public final void onSuccess(Object paramObject)
  {
    switch (a)
    {
    default: 
      break;
    case 2: 
      ((k3)c).l();
      h();
      paramObject = (k3)c;
      r = false;
      s = 1;
      zzjv.c("Successfully registered trigger URI", b).a);
      ((k3)c).N();
      return;
    }
    Object localObject = (FirebaseInstanceId)b;
    com.google.firebase.iid.a.a locala = (com.google.firebase.iid.a.a)c;
    paramObject = (r9.f)paramObject;
    localObject.getClass();
    paramObject = ((r9.f)paramObject).a();
    if ((locala == null) || (!((String)paramObject).equals(a)))
    {
      localObject = h.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((s9.a.a)((Iterator)localObject).next()).a((String)paramObject);
      }
    }
  }
  
  public final Object then(Task paramTask)
  {
    paramTask = (s)paramTask.getResult();
    FirebaseAuth localFirebaseAuth = FirebaseAuth.getInstance(((r)c).K());
    b8.c localc = (b8.c)b;
    String str = a;
    j.i(str);
    localFirebaseAuth.getClass();
    j.e(str);
    paramTask = localc;
    if (i != null)
    {
      paramTask = localc;
      if (localc == null) {
        paramTask = new b8.c(new c.a());
      }
      p = i;
    }
    return e.zza(a, paramTask, str);
  }
}

/* Location:
 * Qualified Name:     r4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
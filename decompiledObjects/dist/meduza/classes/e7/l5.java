package e7;

import android.content.pm.PackageManager.NameNotFoundException;
import android.os.SystemClock;
import android.util.Pair;
import b.z;
import d2.q;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import y5.a;
import y5.a.a;

public final class l5
  extends h6
{
  public final HashMap e = new HashMap();
  public final q1 f;
  public final q1 o;
  public final q1 p;
  public final q1 q;
  public final q1 r;
  public final q1 s;
  
  public l5(i6 parami6)
  {
    super(parami6);
    parami6 = j();
    Objects.requireNonNull(parami6);
    f = new q1(parami6, "last_delete_stale", 0L);
    parami6 = j();
    Objects.requireNonNull(parami6);
    o = new q1(parami6, "last_delete_stale_batch", 0L);
    parami6 = j();
    Objects.requireNonNull(parami6);
    p = new q1(parami6, "backoff", 0L);
    parami6 = j();
    Objects.requireNonNull(parami6);
    q = new q1(parami6, "last_upload", 0L);
    parami6 = j();
    Objects.requireNonNull(parami6);
    r = new q1(parami6, "last_upload_attempt", 0L);
    parami6 = j();
    Objects.requireNonNull(parami6);
    s = new q1(parami6, "midnight_offset", 0L);
  }
  
  public final boolean r()
  {
    return false;
  }
  
  @Deprecated
  public final Pair<String, Boolean> s(String paramString)
  {
    l();
    ((z)zzb()).getClass();
    long l1 = SystemClock.elapsedRealtime();
    k5 localk5 = (k5)e.get(paramString);
    if ((localk5 != null) && (l1 < c)) {
      return new Pair(a, Boolean.valueOf(b));
    }
    Object localObject1 = h();
    localObject1.getClass();
    long l2 = ((h)localObject1).s(paramString, h0.b) + l1;
    String str = null;
    Object localObject2;
    try
    {
      localObject1 = a.a(zza());
    }
    catch (Exception localException)
    {
      break label243;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localObject2 = str;
      if (localk5 != null)
      {
        localObject2 = str;
        if (l1 < c + h().s(paramString, h0.c)) {
          return new Pair(a, Boolean.valueOf(b));
        }
      }
    }
    if (localObject2 == null) {
      return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
    }
    str = a;
    if (str != null)
    {
      localObject2 = new k5(l2, str, b);
    }
    else
    {
      localObject2 = new k5(l2, "", b);
      break label271;
      label243:
      zzjv.c("Unable to get advertising id", localObject2);
      localObject2 = new k5(l2, "", false);
    }
    label271:
    e.put(paramString, localObject2);
    return new Pair(a, Boolean.valueOf(b));
  }
  
  @Deprecated
  public final String t(String paramString, boolean paramBoolean)
  {
    l();
    if (paramBoolean) {
      paramString = (String)sfirst;
    } else {
      paramString = "00000000-0000-0000-0000-000000000000";
    }
    MessageDigest localMessageDigest = r6.B0();
    if (localMessageDigest == null) {
      return null;
    }
    return String.format(Locale.US, "%032X", new Object[] { new BigInteger(1, localMessageDigest.digest(paramString.getBytes())) });
  }
}

/* Location:
 * Qualified Name:     e7.l5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
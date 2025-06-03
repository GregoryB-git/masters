package R2;

import E2.e;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import s2.a;
import s2.a.a;

public final class g5
  extends C5
{
  public final Map d = new HashMap();
  public final q2 e;
  public final q2 f;
  public final q2 g;
  public final q2 h;
  public final q2 i;
  
  public g5(D5 paramD5)
  {
    super(paramD5);
    paramD5 = i();
    paramD5.getClass();
    e = new q2(paramD5, "last_delete_stale", 0L);
    paramD5 = i();
    paramD5.getClass();
    f = new q2(paramD5, "backoff", 0L);
    paramD5 = i();
    paramD5.getClass();
    g = new q2(paramD5, "last_upload", 0L);
    paramD5 = i();
    paramD5.getClass();
    h = new q2(paramD5, "last_upload_attempt", 0L);
    paramD5 = i();
    paramD5.getClass();
    i = new q2(paramD5, "midnight_offset", 0L);
  }
  
  private final Pair y(String paramString)
  {
    n();
    long l1 = b().b();
    Object localObject1 = (f5)d.get(paramString);
    if ((localObject1 != null) && (l1 < c)) {
      return new Pair(a, Boolean.valueOf(b));
    }
    a.b(true);
    long l2 = f().C(paramString) + l1;
    try
    {
      long l3 = f().x(paramString, K.d);
      if (l3 > 0L) {}
      a.a locala;
      localObject2 = a.a(a());
    }
    catch (Exception localException)
    {
      try
      {
        locala = a.a(a());
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        if ((localObject1 == null) || (l1 >= c + l3)) {
          break label159;
        }
        return new Pair(a, Boolean.valueOf(b));
        localObject2 = null;
      }
      localException = localException;
    }
    label159:
    Object localObject2;
    if (localObject2 == null) {
      return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
    }
    localObject1 = ((a.a)localObject2).a();
    if (localObject1 != null)
    {
      localObject2 = new f5((String)localObject1, ((a.a)localObject2).b(), l2);
    }
    else
    {
      localObject2 = new f5("", ((a.a)localObject2).b(), l2);
      break label274;
      j().F().b("Unable to get advertising id", localObject2);
      localObject2 = new f5("", false, l2);
    }
    label274:
    d.put(paramString, localObject2);
    a.b(false);
    return new Pair(a, Boolean.valueOf(b));
  }
  
  public final String A(String paramString, boolean paramBoolean)
  {
    n();
    if (paramBoolean) {
      paramString = (String)yfirst;
    } else {
      paramString = "00000000-0000-0000-0000-000000000000";
    }
    MessageDigest localMessageDigest = S5.T0();
    if (localMessageDigest == null) {
      return null;
    }
    return String.format(Locale.US, "%032X", new Object[] { new BigInteger(1, localMessageDigest.digest(paramString.getBytes())) });
  }
  
  public final boolean x()
  {
    return false;
  }
  
  public final Pair z(String paramString, q3 paramq3)
  {
    if (paramq3.x()) {
      return y(paramString);
    }
    return new Pair("", Boolean.FALSE);
  }
}

/* Location:
 * Qualified Name:     R2.g5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
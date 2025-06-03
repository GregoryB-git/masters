package c8;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import b8.m0;
import b8.r;
import com.google.firebase.auth.FirebaseAuth;
import m6.j;
import u7.f;

public final class t0
  implements m0
{
  public final String a;
  public final String b;
  public final int c;
  public final int d;
  public final long e;
  public String f;
  public FirebaseAuth g;
  
  public t0(String paramString1, String paramString2, int paramInt1, int paramInt2, long paramLong, String paramString3, FirebaseAuth paramFirebaseAuth)
  {
    j.f("sessionInfo cannot be empty.", paramString3);
    if (paramFirebaseAuth != null)
    {
      j.f("sharedSecretKey cannot be empty. This is required to generate QR code URL.", paramString1);
      a = paramString1;
      j.f("hashAlgorithm cannot be empty.", paramString2);
      b = paramString2;
      c = paramInt1;
      d = paramInt2;
      e = paramLong;
      f = paramString3;
      g = paramFirebaseAuth;
      return;
    }
    throw new NullPointerException("firebaseAuth cannot be null.");
  }
  
  public final String a()
  {
    return b;
  }
  
  public final int b()
  {
    return c;
  }
  
  public final String c(String paramString1, String paramString2)
  {
    j.f("accountName cannot be empty.", paramString1);
    j.f("issuer cannot be empty.", paramString2);
    return String.format(null, "otpauth://totp/%s:%s?secret=%s&issuer=%s&algorithm=%s&digits=%d", new Object[] { paramString2, paramString1, a, paramString2, b, Integer.valueOf(c) });
  }
  
  public final String d()
  {
    Object localObject = g.f;
    j.j(localObject, "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.");
    String str = ((r)localObject).A();
    j.f("Email cannot be empty, since verified email is required to use MFA.", str);
    localObject = g.a;
    ((f)localObject).a();
    return c(str, b);
  }
  
  public final long e()
  {
    return e;
  }
  
  public final int f()
  {
    return d;
  }
  
  public final void g(String paramString)
  {
    j.f("qrCodeUrl cannot be empty.", paramString);
    try
    {
      i(paramString);
      return;
    }
    catch (ActivityNotFoundException paramString)
    {
      i("https://play.google.com/store/search?q=otpauth&c=apps");
    }
  }
  
  public final String h()
  {
    return a;
  }
  
  public final void i(String paramString)
  {
    f localf = g.a;
    localf.a();
    a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)).addFlags(268435456));
  }
  
  public final String j()
  {
    return f;
  }
}

/* Location:
 * Qualified Name:     c8.t0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
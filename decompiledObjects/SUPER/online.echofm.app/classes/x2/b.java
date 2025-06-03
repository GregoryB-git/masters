package x2;

import A2.m;
import A2.m.a;
import B2.a;
import B2.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;

public final class b
  extends a
{
  @NonNull
  public static final Parcelable.Creator<b> CREATOR = new s();
  public static final b s = new b(0);
  public final int o;
  public final int p;
  public final PendingIntent q;
  public final String r;
  
  public b(int paramInt)
  {
    this(paramInt, null, null);
  }
  
  public b(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString)
  {
    o = paramInt1;
    p = paramInt2;
    q = paramPendingIntent;
    r = paramString;
  }
  
  public b(int paramInt, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramPendingIntent, null);
  }
  
  public b(int paramInt, PendingIntent paramPendingIntent, String paramString)
  {
    this(1, paramInt, paramPendingIntent, paramString);
  }
  
  public static String k(int paramInt)
  {
    if (paramInt != 99)
    {
      if (paramInt != 1500)
      {
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("UNKNOWN_ERROR_CODE(");
            localStringBuilder.append(paramInt);
            localStringBuilder.append(")");
            return localStringBuilder.toString();
          case 24: 
            return "API_DISABLED_FOR_CONNECTION";
          case 23: 
            return "API_DISABLED";
          case 22: 
            return "RESOLUTION_ACTIVITY_NOT_FOUND";
          case 21: 
            return "API_VERSION_UPDATE_REQUIRED";
          case 20: 
            return "RESTRICTED_PROFILE";
          case 19: 
            return "SERVICE_MISSING_PERMISSION";
          case 18: 
            return "SERVICE_UPDATING";
          case 17: 
            return "SIGN_IN_FAILED";
          case 16: 
            return "API_UNAVAILABLE";
          case 15: 
            return "INTERRUPTED";
          case 14: 
            return "TIMEOUT";
          }
          return "CANCELED";
        case 11: 
          return "LICENSE_CHECK_FAILED";
        case 10: 
          return "DEVELOPER_ERROR";
        case 9: 
          return "SERVICE_INVALID";
        case 8: 
          return "INTERNAL_ERROR";
        case 7: 
          return "NETWORK_ERROR";
        case 6: 
          return "RESOLUTION_REQUIRED";
        case 5: 
          return "INVALID_ACCOUNT";
        case 4: 
          return "SIGN_IN_REQUIRED";
        case 3: 
          return "SERVICE_DISABLED";
        case 2: 
          return "SERVICE_VERSION_UPDATE_REQUIRED";
        case 1: 
          return "SERVICE_MISSING";
        case 0: 
          return "SUCCESS";
        }
        return "UNKNOWN";
      }
      return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
    }
    return "UNFINISHED";
  }
  
  public int a()
  {
    return p;
  }
  
  public String d()
  {
    return r;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return (p == p) && (m.a(q, q)) && (m.a(r, r));
  }
  
  public PendingIntent f()
  {
    return q;
  }
  
  public boolean g()
  {
    return (p != 0) && (q != null);
  }
  
  public int hashCode()
  {
    return m.b(new Object[] { Integer.valueOf(p), q, r });
  }
  
  public boolean i()
  {
    return p == 0;
  }
  
  public String toString()
  {
    m.a locala = m.c(this);
    locala.a("statusCode", k(p));
    locala.a("resolution", q);
    locala.a("message", r);
    return locala.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.i(paramParcel, 1, o);
    c.i(paramParcel, 2, a());
    c.m(paramParcel, 3, f(), paramInt, false);
    c.n(paramParcel, 4, d(), false);
    c.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     x2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
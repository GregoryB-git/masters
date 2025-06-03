package j6;

import a0.j;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.h;
import m6.h.a;
import n6.a;

public final class b
  extends a
{
  public static final Parcelable.Creator<b> CREATOR = new n();
  public static final b e = new b(0);
  public final int a;
  public final int b;
  public final PendingIntent c;
  public final String d;
  
  public b() {}
  
  public b(int paramInt)
  {
    this(1, paramInt, null, null);
  }
  
  public b(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramPendingIntent;
    d = paramString;
  }
  
  public b(int paramInt, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramPendingIntent, null);
  }
  
  public static String E(int paramInt)
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
            return j.h("UNKNOWN_ERROR_CODE(", paramInt, ")");
          }
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
        return "API_INSTALL_REQUIRED";
        return "API_DISABLED_FOR_CONNECTION";
        return "API_DISABLED";
        return "RESOLUTION_ACTIVITY_NOT_FOUND";
        return "API_VERSION_UPDATE_REQUIRED";
        return "RESTRICTED_PROFILE";
        return "SERVICE_MISSING_PERMISSION";
        return "SERVICE_UPDATING";
        return "SIGN_IN_FAILED";
        return "API_UNAVAILABLE";
        return "INTERRUPTED";
        return "TIMEOUT";
        return "CANCELED";
      }
      return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
    }
    return "UNFINISHED";
  }
  
  public final boolean D()
  {
    return b == 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return (b == b) && (h.a(c, c)) && (h.a(d, d));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(b), c, d });
  }
  
  public final String toString()
  {
    h.a locala = new h.a(this);
    locala.a(E(b), "statusCode");
    locala.a(c, "resolution");
    locala.a(d, "message");
    return locala.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = a;
    int j = z.J(20293, paramParcel);
    z.z(paramParcel, 1, i);
    z.z(paramParcel, 2, b);
    z.E(paramParcel, 3, c, paramInt, false);
    z.F(paramParcel, 4, d, false);
    z.L(j, paramParcel);
  }
}

/* Location:
 * Qualified Name:     j6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
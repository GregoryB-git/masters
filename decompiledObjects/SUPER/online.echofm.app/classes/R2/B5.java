package R2;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.E7;
import com.google.android.gms.internal.measurement.L1;
import java.util.HashMap;
import java.util.Map;

public final class B5
  extends z5
{
  public B5(D5 paramD5)
  {
    super(paramD5);
  }
  
  private final String v(String paramString)
  {
    paramString = r().Q(paramString);
    if (!TextUtils.isEmpty(paramString))
    {
      Object localObject = Uri.parse((String)K.s.a(null));
      Uri.Builder localBuilder = ((Uri)localObject).buildUpon();
      String str = ((Uri)localObject).getAuthority();
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(".");
      ((StringBuilder)localObject).append(str);
      localBuilder.authority(((StringBuilder)localObject).toString());
      return localBuilder.build().toString();
    }
    return (String)K.s.a(null);
  }
  
  public final E5 u(String paramString)
  {
    if ((E7.a()) && (f().s(K.A0)))
    {
      j().K().a("sgtm feature flag enabled.");
      Object localObject1 = q().D0(paramString);
      if (localObject1 == null) {
        return new E5(v(paramString));
      }
      boolean bool = ((I2)localObject1).t();
      Object localObject2 = null;
      if (bool)
      {
        j().K().a("sgtm upload enabled in manifest.");
        Object localObject3 = r().L(((I2)localObject1).t0());
        if (localObject3 != null)
        {
          localObject1 = ((L1)localObject3).S();
          if (!TextUtils.isEmpty((CharSequence)localObject1))
          {
            localObject3 = ((L1)localObject3).R();
            a2 locala2 = j().K();
            if (TextUtils.isEmpty((CharSequence)localObject3)) {
              localObject2 = "Y";
            } else {
              localObject2 = "N";
            }
            locala2.c("sgtm configured with upload_url, server_info", localObject1, localObject2);
            if (TextUtils.isEmpty((CharSequence)localObject3))
            {
              localObject2 = new E5((String)localObject1);
            }
            else
            {
              localObject2 = new HashMap();
              ((Map)localObject2).put("x-google-sgtm-server-info", localObject3);
              localObject2 = new E5((String)localObject1, (Map)localObject2);
            }
          }
        }
      }
      if (localObject2 != null) {
        return (E5)localObject2;
      }
    }
    return new E5(v(paramString));
  }
}

/* Location:
 * Qualified Name:     R2.B5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
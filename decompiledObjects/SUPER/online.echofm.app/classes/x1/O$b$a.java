package x1;

import O1.P.a;
import android.net.Uri;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class O$b$a
  implements P.a
{
  public void a(JSONObject paramJSONObject)
  {
    Uri localUri = null;
    String str1;
    if (paramJSONObject == null) {
      str1 = null;
    } else {
      str1 = paramJSONObject.optString("id");
    }
    if (str1 == null)
    {
      Log.w(O.a(), "No user ID returned on Me request");
      return;
    }
    String str2 = paramJSONObject.optString("link");
    String str3 = paramJSONObject.optString("profile_picture", null);
    String str4 = paramJSONObject.optString("first_name");
    String str5 = paramJSONObject.optString("middle_name");
    String str6 = paramJSONObject.optString("last_name");
    String str7 = paramJSONObject.optString("name");
    if (str2 != null) {
      paramJSONObject = Uri.parse(str2);
    } else {
      paramJSONObject = null;
    }
    if (str3 != null) {
      localUri = Uri.parse(str3);
    }
    paramJSONObject = new O(str1, str4, str5, str6, str7, paramJSONObject, localUri);
    O.v.c(paramJSONObject);
  }
  
  public void b(o paramo)
  {
    Log.e(O.a(), Intrinsics.i("Got unexpected exception: ", paramo));
  }
}

/* Location:
 * Qualified Name:     x1.O.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package u2;

import A2.n;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class a
{
  public static final Lock c = new ReentrantLock();
  public static a d;
  public final Lock a = new ReentrantLock();
  public final SharedPreferences b;
  
  public a(Context paramContext)
  {
    b = paramContext.getSharedPreferences("com.google.android.gms.signin", 0);
  }
  
  public static a a(Context paramContext)
  {
    n.i(paramContext);
    Lock localLock = c;
    localLock.lock();
    try
    {
      if (d == null)
      {
        a locala = new u2/a;
        locala.<init>(paramContext.getApplicationContext());
        d = locala;
      }
    }
    finally
    {
      break label56;
    }
    paramContext = d;
    localLock.unlock();
    return paramContext;
    label56:
    c.unlock();
    throw paramContext;
  }
  
  public static final String d(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(":");
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
  
  public GoogleSignInAccount b()
  {
    Object localObject1 = c("defaultGoogleSignInAccount");
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    Object localObject3 = null;
    String str;
    if (bool)
    {
      localObject1 = localObject3;
    }
    else
    {
      str = c(d("googleSignInAccount", (String)localObject1));
      localObject1 = localObject3;
      if (str == null) {}
    }
    try
    {
      localObject1 = GoogleSignInAccount.V(str);
      return (GoogleSignInAccount)localObject1;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject2 = localObject3;
      }
    }
  }
  
  public final String c(String paramString)
  {
    a.lock();
    try
    {
      paramString = b.getString(paramString, null);
      return paramString;
    }
    finally
    {
      a.unlock();
    }
  }
}

/* Location:
 * Qualified Name:     u2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
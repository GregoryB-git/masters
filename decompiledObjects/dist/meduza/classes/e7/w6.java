package e7;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;

public final class w6
{
  public final j2 a;
  
  public w6(j2 paramj2)
  {
    a = paramj2;
  }
  
  public final void a(String paramString, Bundle paramBundle)
  {
    a.zzl().l();
    if (!a.d())
    {
      if (paramBundle.isEmpty())
      {
        paramString = null;
      }
      else
      {
        if (paramString != null)
        {
          localObject = paramString;
          if (!paramString.isEmpty()) {}
        }
        else
        {
          localObject = "auto";
        }
        paramString = new Uri.Builder();
        paramString.path((String)localObject);
        Object localObject = paramBundle.keySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          paramString.appendQueryParameter(str, paramBundle.getString(str));
        }
        paramString = paramString.build().toString();
      }
      if (!TextUtils.isEmpty(paramString))
      {
        a.j().G.b(paramString);
        paramString = a.j().H;
        a.v.getClass();
        paramString.b(System.currentTimeMillis());
      }
    }
  }
  
  public final boolean b()
  {
    return a.j().H.a() > 0L;
  }
  
  public final boolean c()
  {
    if (!b()) {
      return false;
    }
    a.v.getClass();
    return System.currentTimeMillis() - a.j().H.a() > a.o.s(null, h0.e0);
  }
}

/* Location:
 * Qualified Name:     e7.w6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
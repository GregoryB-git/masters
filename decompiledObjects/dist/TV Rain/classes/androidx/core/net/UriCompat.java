package androidx.core.net;

import android.net.Uri;
import androidx.annotation.NonNull;
import z2;

public final class UriCompat
{
  @NonNull
  public static String toSafeString(@NonNull Uri paramUri)
  {
    String str1 = paramUri.getScheme();
    String str2 = paramUri.getSchemeSpecificPart();
    Object localObject = str2;
    if (str1 != null) {
      if ((!str1.equalsIgnoreCase("tel")) && (!str1.equalsIgnoreCase("sip")) && (!str1.equalsIgnoreCase("sms")) && (!str1.equalsIgnoreCase("smsto")) && (!str1.equalsIgnoreCase("mailto")) && (!str1.equalsIgnoreCase("nfc")))
      {
        if ((!str1.equalsIgnoreCase("http")) && (!str1.equalsIgnoreCase("https")) && (!str1.equalsIgnoreCase("ftp")))
        {
          localObject = str2;
          if (!str1.equalsIgnoreCase("rtsp")) {}
        }
        else
        {
          StringBuilder localStringBuilder = z2.t("//");
          localObject = paramUri.getHost();
          str2 = "";
          if (localObject != null) {
            localObject = paramUri.getHost();
          } else {
            localObject = "";
          }
          localStringBuilder.append((String)localObject);
          localObject = str2;
          if (paramUri.getPort() != -1)
          {
            localObject = z2.t(":");
            ((StringBuilder)localObject).append(paramUri.getPort());
            localObject = ((StringBuilder)localObject).toString();
          }
          localObject = z2.s(localStringBuilder, (String)localObject, "/...");
        }
      }
      else
      {
        paramUri = new StringBuilder(64);
        paramUri.append(str1);
        paramUri.append(':');
        if (str2 != null) {
          for (int i = 0; i < str2.length(); i++)
          {
            char c = str2.charAt(i);
            if ((c != '-') && (c != '@') && (c != '.')) {
              paramUri.append('x');
            } else {
              paramUri.append(c);
            }
          }
        }
        return paramUri.toString();
      }
    }
    paramUri = new StringBuilder(64);
    if (str1 != null)
    {
      paramUri.append(str1);
      paramUri.append(':');
    }
    if (localObject != null) {
      paramUri.append((String)localObject);
    }
    return paramUri.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.core.net.UriCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
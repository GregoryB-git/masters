package androidx.core.net;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import z2;

public final class MailTo
{
  private static final String BCC = "bcc";
  private static final String BODY = "body";
  private static final String CC = "cc";
  private static final String MAILTO = "mailto";
  public static final String MAILTO_SCHEME = "mailto:";
  private static final String SUBJECT = "subject";
  private static final String TO = "to";
  private HashMap<String, String> mHeaders = new HashMap();
  
  public static boolean isMailTo(@Nullable Uri paramUri)
  {
    boolean bool;
    if ((paramUri != null) && ("mailto".equals(paramUri.getScheme()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isMailTo(@Nullable String paramString)
  {
    boolean bool;
    if ((paramString != null) && (paramString.startsWith("mailto:"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @NonNull
  public static MailTo parse(@NonNull Uri paramUri)
    throws ParseException
  {
    return parse(paramUri.toString());
  }
  
  @NonNull
  public static MailTo parse(@NonNull String paramString)
    throws ParseException
  {
    Preconditions.checkNotNull(paramString);
    if (isMailTo(paramString))
    {
      int i = paramString.indexOf('#');
      Object localObject1 = paramString;
      if (i != -1) {
        localObject1 = paramString.substring(0, i);
      }
      i = ((String)localObject1).indexOf('?');
      if (i == -1)
      {
        paramString = Uri.decode(((String)localObject1).substring(7));
        localObject1 = null;
      }
      else
      {
        paramString = Uri.decode(((String)localObject1).substring(7, i));
        localObject1 = ((String)localObject1).substring(i + 1);
      }
      MailTo localMailTo = new MailTo();
      if (localObject1 != null)
      {
        localObject2 = ((String)localObject1).split("&");
        int j = localObject2.length;
        for (i = 0; i < j; i++)
        {
          localObject1 = localObject2[i].split("=", 2);
          if (localObject1.length != 0)
          {
            String str = Uri.decode(localObject1[0]).toLowerCase(Locale.ROOT);
            if (localObject1.length > 1) {
              localObject1 = Uri.decode(localObject1[1]);
            } else {
              localObject1 = null;
            }
            mHeaders.put(str, localObject1);
          }
        }
      }
      Object localObject2 = localMailTo.getTo();
      localObject1 = paramString;
      if (localObject2 != null) {
        localObject1 = z2.p(paramString, ", ", (String)localObject2);
      }
      mHeaders.put("to", localObject1);
      return localMailTo;
    }
    throw new ParseException("Not a mailto scheme");
  }
  
  @Nullable
  public String getBcc()
  {
    return (String)mHeaders.get("bcc");
  }
  
  @Nullable
  public String getBody()
  {
    return (String)mHeaders.get("body");
  }
  
  @Nullable
  public String getCc()
  {
    return (String)mHeaders.get("cc");
  }
  
  @Nullable
  public Map<String, String> getHeaders()
  {
    return mHeaders;
  }
  
  @Nullable
  public String getSubject()
  {
    return (String)mHeaders.get("subject");
  }
  
  @Nullable
  public String getTo()
  {
    return (String)mHeaders.get("to");
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("mailto:");
    localStringBuilder.append('?');
    Iterator localIterator = mHeaders.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuilder.append(Uri.encode((String)localEntry.getKey()));
      localStringBuilder.append('=');
      localStringBuilder.append(Uri.encode((String)localEntry.getValue()));
      localStringBuilder.append('&');
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.core.net.MailTo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
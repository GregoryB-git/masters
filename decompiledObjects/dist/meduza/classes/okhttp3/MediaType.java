package okhttp3;

import f;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MediaType
{
  public static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
  public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
  public final String a;
  public final String b;
  
  public MediaType(String paramString1, String paramString2)
  {
    a = paramString1;
    b = paramString2;
  }
  
  public static MediaType a(String paramString)
  {
    Object localObject1 = c.matcher(paramString);
    if (((Matcher)localObject1).lookingAt())
    {
      Object localObject2 = ((Matcher)localObject1).group(1);
      Object localObject3 = Locale.US;
      ((String)localObject2).toLowerCase((Locale)localObject3);
      ((Matcher)localObject1).group(2).toLowerCase((Locale)localObject3);
      localObject2 = null;
      Matcher localMatcher = d.matcher(paramString);
      int i = ((Matcher)localObject1).end();
      while (i < paramString.length())
      {
        localMatcher.region(i, paramString.length());
        if (localMatcher.lookingAt())
        {
          localObject3 = localMatcher.group(1);
          localObject1 = localObject2;
          if (localObject3 != null) {
            if (!((String)localObject3).equalsIgnoreCase("charset"))
            {
              localObject1 = localObject2;
            }
            else
            {
              localObject3 = localMatcher.group(2);
              if (localObject3 != null)
              {
                localObject1 = localObject3;
                if (((String)localObject3).startsWith("'"))
                {
                  localObject1 = localObject3;
                  if (((String)localObject3).endsWith("'"))
                  {
                    localObject1 = localObject3;
                    if (((String)localObject3).length() > 2) {
                      localObject1 = ((String)localObject3).substring(1, ((String)localObject3).length() - 1);
                    }
                  }
                }
              }
              else
              {
                localObject1 = localMatcher.group(3);
              }
              if ((localObject2 != null) && (!((String)localObject1).equalsIgnoreCase((String)localObject2)))
              {
                localObject3 = new StringBuilder();
                ((StringBuilder)localObject3).append("Multiple charsets defined: \"");
                ((StringBuilder)localObject3).append((String)localObject2);
                ((StringBuilder)localObject3).append("\" and: \"");
                ((StringBuilder)localObject3).append((String)localObject1);
                ((StringBuilder)localObject3).append("\" for: \"");
                ((StringBuilder)localObject3).append(paramString);
                ((StringBuilder)localObject3).append('"');
                throw new IllegalArgumentException(((StringBuilder)localObject3).toString());
              }
            }
          }
          i = localMatcher.end();
          localObject2 = localObject1;
        }
        else
        {
          localObject1 = f.l("Parameter is not formatted correctly: \"");
          ((StringBuilder)localObject1).append(paramString.substring(i));
          ((StringBuilder)localObject1).append("\" for: \"");
          ((StringBuilder)localObject1).append(paramString);
          ((StringBuilder)localObject1).append('"');
          throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
        }
      }
      return new MediaType(paramString, (String)localObject2);
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("No subtype found for: \"");
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append('"');
    throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof MediaType)) && (a.equals(a))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     okhttp3.MediaType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
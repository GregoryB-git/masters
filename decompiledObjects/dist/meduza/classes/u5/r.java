package u5;

import android.util.SparseArray;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v5.e0;
import x6.b;

public final class r
  extends g
{
  public static final Pattern o = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
  public static final Pattern p = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
  public static final Pattern q = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
  
  public r(String paramString, long paramLong1, long paramLong2, long paramLong3, File paramFile)
  {
    super(paramString, paramLong1, paramLong2, paramLong3, paramFile);
  }
  
  public static r g(File paramFile, long paramLong1, long paramLong2, j paramj)
  {
    Object localObject1 = paramFile.getName();
    if (!((String)localObject1).endsWith(".v3.exo"))
    {
      localObject1 = paramFile.getName();
      localObject2 = p.matcher((CharSequence)localObject1);
      Object localObject3;
      if (((Matcher)localObject2).matches())
      {
        localObject1 = ((Matcher)localObject2).group(1);
        localObject1.getClass();
        i = e0.a;
        int j = ((String)localObject1).length();
        int k = 0;
        int m = 0;
        for (i = m; m < j; i = n)
        {
          n = i;
          if (((String)localObject1).charAt(m) == '%') {
            n = i + 1;
          }
          m++;
        }
        if (i == 0) {
          break label318;
        }
        m = j - i * 2;
        StringBuilder localStringBuilder = new StringBuilder(m);
        Matcher localMatcher = e0.i.matcher((CharSequence)localObject1);
        int n = k;
        while ((i > 0) && (localMatcher.find()))
        {
          localObject3 = localMatcher.group(1);
          localObject3.getClass();
          char c = (char)Integer.parseInt((String)localObject3, 16);
          localStringBuilder.append((CharSequence)localObject1, n, localMatcher.start());
          localStringBuilder.append(c);
          n = localMatcher.end();
          i--;
        }
        if (n < j) {
          localStringBuilder.append((CharSequence)localObject1, n, j);
        }
        if (localStringBuilder.length() == m)
        {
          localObject1 = localStringBuilder.toString();
          break label318;
        }
      }
      else
      {
        localObject3 = o.matcher((CharSequence)localObject1);
        localObject2 = localObject3;
        if (((Matcher)localObject3).matches())
        {
          localObject1 = ((Matcher)localObject3).group(1);
          localObject1.getClass();
          localObject2 = localObject3;
          break label318;
        }
      }
      localObject1 = null;
      label318:
      if (localObject1 != null)
      {
        localObject3 = paramFile.getParentFile();
        b.K(localObject3);
        i = da;
        localObject1 = ((Matcher)localObject2).group(2);
        localObject1.getClass();
        l = Long.parseLong((String)localObject1);
        localObject1 = ((Matcher)localObject2).group(3);
        localObject1.getClass();
        localObject2 = h((File)localObject3, i, l, Long.parseLong((String)localObject1));
        localObject1 = localObject2;
        if (paramFile.renameTo((File)localObject2)) {}
      }
      else
      {
        localObject1 = null;
      }
      if (localObject1 == null) {
        return null;
      }
      localObject2 = ((File)localObject1).getName();
      paramFile = (File)localObject1;
      localObject1 = localObject2;
    }
    localObject1 = q.matcher((CharSequence)localObject1);
    if (!((Matcher)localObject1).matches()) {
      return null;
    }
    Object localObject2 = ((Matcher)localObject1).group(1);
    localObject2.getClass();
    int i = Integer.parseInt((String)localObject2);
    paramj = (String)b.get(i);
    if (paramj == null) {
      return null;
    }
    if (paramLong1 == -1L) {
      paramLong1 = paramFile.length();
    }
    if (paramLong1 == 0L) {
      return null;
    }
    localObject2 = ((Matcher)localObject1).group(2);
    localObject2.getClass();
    long l = Long.parseLong((String)localObject2);
    if (paramLong2 == -9223372036854775807L)
    {
      localObject1 = ((Matcher)localObject1).group(3);
      localObject1.getClass();
      paramLong2 = Long.parseLong((String)localObject1);
    }
    return new r(paramj, l, paramLong1, paramLong2, paramFile);
  }
  
  public static File h(File paramFile, int paramInt, long paramLong1, long paramLong2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramInt);
    localStringBuilder.append(".");
    localStringBuilder.append(paramLong1);
    localStringBuilder.append(".");
    localStringBuilder.append(paramLong2);
    localStringBuilder.append(".v3.exo");
    return new File(paramFile, localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     u5.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
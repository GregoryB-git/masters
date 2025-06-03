package n5;

import android.text.Html;
import android.text.TextUtils;
import h5.a.a;
import h5.f;
import h5.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n7.d;
import v5.m;
import v5.u;

public final class a
  extends f
{
  public static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
  public static final Pattern p = Pattern.compile("\\{\\\\.*?\\}");
  public final StringBuilder m = new StringBuilder();
  public final ArrayList<String> n = new ArrayList();
  
  public static long i(Matcher paramMatcher, int paramInt)
  {
    String str = paramMatcher.group(paramInt + 1);
    if (str != null) {
      l1 = Long.parseLong(str) * 60L * 60L * 1000L;
    } else {
      l1 = 0L;
    }
    str = paramMatcher.group(paramInt + 2);
    str.getClass();
    long l2 = Long.parseLong(str);
    str = paramMatcher.group(paramInt + 3);
    str.getClass();
    l2 = Long.parseLong(str) * 1000L + (l2 * 60L * 1000L + l1);
    paramMatcher = paramMatcher.group(paramInt + 4);
    long l1 = l2;
    if (paramMatcher != null) {
      l1 = l2 + Long.parseLong(paramMatcher);
    }
    return l1 * 1000L;
  }
  
  public final g h(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = new long[32];
    u localu = new u(paramArrayOfByte, paramInt);
    paramArrayOfByte = localu.C();
    if (paramArrayOfByte == null) {
      paramArrayOfByte = d.c;
    }
    paramInt = 0;
    byte[] arrayOfByte = paramArrayOfByte;
    paramArrayOfByte = (byte[])localObject1;
    Object localObject2;
    label1247:
    for (;;)
    {
      localObject2 = this;
      Object localObject3 = localu.h(arrayOfByte);
      if (localObject3 == null) {
        break;
      }
      if (((String)localObject3).length() != 0)
      {
        try
        {
          Integer.parseInt((String)localObject3);
          localObject3 = localu.h(arrayOfByte);
          if (localObject3 == null)
          {
            m.f("SubripDecoder", "Unexpected end");
            break;
          }
          Object localObject4 = o.matcher((CharSequence)localObject3);
          if (((Matcher)localObject4).matches())
          {
            long l = i((Matcher)localObject4, 1);
            localObject1 = paramArrayOfByte;
            if (paramInt == paramArrayOfByte.length) {
              localObject1 = Arrays.copyOf(paramArrayOfByte, paramInt * 2);
            }
            int i = paramInt + 1;
            localObject1[paramInt] = l;
            l = i((Matcher)localObject4, 6);
            paramArrayOfByte = (byte[])localObject1;
            if (i == localObject1.length) {
              paramArrayOfByte = Arrays.copyOf((long[])localObject1, i * 2);
            }
            int j = i + 1;
            paramArrayOfByte[i] = l;
            m.setLength(0);
            n.clear();
            for (localObject1 = localu.h(arrayOfByte); !TextUtils.isEmpty((CharSequence)localObject1); localObject1 = localu.h(arrayOfByte))
            {
              if (m.length() > 0) {
                m.append("<br>");
              }
              localObject3 = m;
              localObject4 = n;
              String str = ((String)localObject1).trim();
              localObject1 = new StringBuilder(str);
              Matcher localMatcher = p.matcher(str);
              paramInt = 0;
              while (localMatcher.find())
              {
                str = localMatcher.group();
                ((ArrayList)localObject4).add(str);
                int k = localMatcher.start() - paramInt;
                i = str.length();
                ((StringBuilder)localObject1).replace(k, k + i, "");
                paramInt += i;
              }
              ((StringBuilder)localObject3).append(((StringBuilder)localObject1).toString());
            }
            localObject4 = Html.fromHtml(m.toString());
            localObject3 = null;
            for (paramInt = 0;; paramInt++)
            {
              localObject1 = localObject3;
              if (paramInt >= n.size()) {
                break;
              }
              localObject1 = (String)n.get(paramInt);
              if (((String)localObject1).matches("\\{\\\\an[1-9]\\}")) {
                break;
              }
            }
            localObject2 = new a.a();
            a = ((CharSequence)localObject4);
            if (localObject1 == null)
            {
              localObject1 = ((a.a)localObject2).a();
            }
            else
            {
              switch (((String)localObject1).hashCode())
              {
              default: 
                break;
              case -685620462: 
                if (((String)localObject1).equals("{\\an9}")) {
                  paramInt = 5;
                }
                break;
              case -685620493: 
                if (((String)localObject1).equals("{\\an8}")) {
                  paramInt = 8;
                }
                break;
              case -685620524: 
                if (((String)localObject1).equals("{\\an7}")) {
                  paramInt = 2;
                }
                break;
              case -685620555: 
                if (((String)localObject1).equals("{\\an6}")) {
                  paramInt = 4;
                }
                break;
              case -685620586: 
                if (((String)localObject1).equals("{\\an5}")) {
                  paramInt = 7;
                }
                break;
              case -685620617: 
                if (((String)localObject1).equals("{\\an4}")) {
                  paramInt = 1;
                }
                break;
              case -685620648: 
                if (((String)localObject1).equals("{\\an3}")) {
                  paramInt = 3;
                }
                break;
              case -685620679: 
                if (((String)localObject1).equals("{\\an2}")) {
                  paramInt = 6;
                }
                break;
              case -685620710: 
                if (((String)localObject1).equals("{\\an1}")) {
                  paramInt = 0;
                }
                break;
              }
              paramInt = -1;
              if ((paramInt != 0) && (paramInt != 1) && (paramInt != 2))
              {
                if ((paramInt != 3) && (paramInt != 4) && (paramInt != 5)) {
                  paramInt = 1;
                } else {
                  paramInt = 2;
                }
              }
              else {
                paramInt = 0;
              }
              i = paramInt;
              switch (((String)localObject1).hashCode())
              {
              default: 
                break;
              case -685620462: 
                if (((String)localObject1).equals("{\\an9}")) {
                  paramInt = 5;
                }
                break;
              case -685620493: 
                if (((String)localObject1).equals("{\\an8}")) {
                  paramInt = 4;
                }
                break;
              case -685620524: 
                if (((String)localObject1).equals("{\\an7}")) {
                  paramInt = 3;
                }
                break;
              case -685620555: 
                if (((String)localObject1).equals("{\\an6}")) {
                  paramInt = 8;
                }
                break;
              case -685620586: 
                if (((String)localObject1).equals("{\\an5}")) {
                  paramInt = 7;
                }
                break;
              case -685620617: 
                if (((String)localObject1).equals("{\\an4}")) {
                  paramInt = 6;
                }
                break;
              case -685620648: 
                if (((String)localObject1).equals("{\\an3}")) {
                  paramInt = 2;
                }
                break;
              case -685620679: 
                if (((String)localObject1).equals("{\\an2}")) {
                  paramInt = 1;
                }
                break;
              case -685620710: 
                if (((String)localObject1).equals("{\\an1}")) {
                  paramInt = 0;
                }
                break;
              }
              paramInt = -1;
              if ((paramInt != 0) && (paramInt != 1) && (paramInt != 2))
              {
                if ((paramInt != 3) && (paramInt != 4) && (paramInt != 5)) {
                  paramInt = 1;
                } else {
                  paramInt = 0;
                }
              }
              else {
                paramInt = 2;
              }
              g = paramInt;
              i = i;
              float f1 = 0.92F;
              float f2;
              if (i != 0)
              {
                if (i != 1)
                {
                  if (i == 2) {
                    f2 = 0.92F;
                  } else {
                    throw new IllegalArgumentException();
                  }
                }
                else {
                  f2 = 0.5F;
                }
              }
              else {
                f2 = 0.08F;
              }
              h = f2;
              if (paramInt != 0)
              {
                if (paramInt != 1)
                {
                  if (paramInt == 2) {
                    f2 = f1;
                  } else {
                    throw new IllegalArgumentException();
                  }
                }
                else {
                  f2 = 0.5F;
                }
              }
              else {
                f2 = 0.08F;
              }
              e = f2;
              f = 0;
              localObject1 = ((a.a)localObject2).a();
            }
            localArrayList.add(localObject1);
            localArrayList.add(h5.a.z);
            paramInt = j;
            break label1247;
          }
          localObject1 = new StringBuilder();
          localObject2 = "Skipping invalid timing: ";
        }
        catch (NumberFormatException localNumberFormatException)
        {
          for (;;)
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localObject2 = "Skipping invalid index: ";
          }
        }
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append((String)localObject3);
        m.f("SubripDecoder", ((StringBuilder)localObject1).toString());
      }
    }
    return new b((h5.a[])localArrayList.toArray(new h5.a[0]), Arrays.copyOf(paramArrayOfByte, paramInt));
  }
}

/* Location:
 * Qualified Name:     n5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
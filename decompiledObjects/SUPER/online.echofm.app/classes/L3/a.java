package L3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a
{
  public final String a;
  public final Map b;
  public final Map c;
  
  public a(String paramString, Map paramMap)
  {
    a = paramString;
    b = paramMap;
    c = new HashMap();
  }
  
  public final String a(Map paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramMap.entrySet().iterator();
    paramMap = (Map.Entry)localIterator.next();
    localStringBuilder.append((String)paramMap.getKey());
    localStringBuilder.append("=");
    if (paramMap.getValue() != null) {}
    for (;;)
    {
      paramMap = URLEncoder.encode((String)paramMap.getValue(), "UTF-8");
      do
      {
        paramMap = "";
        localStringBuilder.append(paramMap);
        if (!localIterator.hasNext()) {
          break;
        }
        paramMap = (Map.Entry)localIterator.next();
        localStringBuilder.append("&");
        localStringBuilder.append((String)paramMap.getKey());
        localStringBuilder.append("=");
      } while (paramMap.getValue() == null);
    }
    return localStringBuilder.toString();
  }
  
  public final String b(String paramString, Map paramMap)
  {
    Object localObject = a(paramMap);
    if (((String)localObject).isEmpty()) {
      return paramString;
    }
    if (paramString.contains("?"))
    {
      paramMap = (Map)localObject;
      if (!paramString.endsWith("&"))
      {
        paramMap = new StringBuilder();
        paramMap.append("&");
        paramMap.append((String)localObject);
        paramMap = paramMap.toString();
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(paramMap);
      return ((StringBuilder)localObject).toString();
    }
    paramMap = new StringBuilder();
    paramMap.append(paramString);
    paramMap.append("?");
    paramMap.append((String)localObject);
    return paramMap.toString();
  }
  
  /* Error */
  public c c()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: aload_0
    //   6: getfield 16	L3/a:a	Ljava/lang/String;
    //   9: aload_0
    //   10: getfield 18	L3/a:b	Ljava/util/Map;
    //   13: invokevirtual 101	L3/a:b	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   16: astore_3
    //   17: invokestatic 107	E3/f:f	()LE3/f;
    //   20: astore 4
    //   22: new 27	java/lang/StringBuilder
    //   25: astore 5
    //   27: aload 5
    //   29: invokespecial 28	java/lang/StringBuilder:<init>	()V
    //   32: aload 5
    //   34: ldc 109
    //   36: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload 5
    //   42: aload_3
    //   43: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload 4
    //   49: aload 5
    //   51: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: invokevirtual 113	E3/f:i	(Ljava/lang/String;)V
    //   57: new 115	java/net/URL
    //   60: astore 5
    //   62: aload 5
    //   64: aload_3
    //   65: invokespecial 117	java/net/URL:<init>	(Ljava/lang/String;)V
    //   68: aload 5
    //   70: invokevirtual 121	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   73: checkcast 123	javax/net/ssl/HttpsURLConnection
    //   76: astore_3
    //   77: aload_3
    //   78: sipush 10000
    //   81: invokevirtual 129	java/net/URLConnection:setReadTimeout	(I)V
    //   84: aload_3
    //   85: sipush 10000
    //   88: invokevirtual 132	java/net/URLConnection:setConnectTimeout	(I)V
    //   91: aload_3
    //   92: ldc -122
    //   94: invokevirtual 139	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   97: aload_0
    //   98: getfield 23	L3/a:c	Ljava/util/Map;
    //   101: invokeinterface 34 1 0
    //   106: invokeinterface 40 1 0
    //   111: astore 5
    //   113: aload 5
    //   115: invokeinterface 76 1 0
    //   120: ifeq +46 -> 166
    //   123: aload 5
    //   125: invokeinterface 46 1 0
    //   130: checkcast 48	java/util/Map$Entry
    //   133: astore 4
    //   135: aload_3
    //   136: aload 4
    //   138: invokeinterface 51 1 0
    //   143: checkcast 53	java/lang/String
    //   146: aload 4
    //   148: invokeinterface 62 1 0
    //   153: checkcast 53	java/lang/String
    //   156: invokevirtual 143	java/net/URLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   159: goto -46 -> 113
    //   162: astore_2
    //   163: goto +69 -> 232
    //   166: aload_3
    //   167: invokevirtual 146	java/net/URLConnection:connect	()V
    //   170: aload_3
    //   171: invokevirtual 150	java/net/HttpURLConnection:getResponseCode	()I
    //   174: istore 6
    //   176: aload_3
    //   177: invokevirtual 154	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   180: astore 5
    //   182: aload 5
    //   184: ifnull +20 -> 204
    //   187: aload_0
    //   188: aload 5
    //   190: invokevirtual 158	L3/a:e	(Ljava/io/InputStream;)Ljava/lang/String;
    //   193: astore_2
    //   194: goto +10 -> 204
    //   197: astore_2
    //   198: aload 5
    //   200: astore_1
    //   201: goto +31 -> 232
    //   204: aload 5
    //   206: ifnull +8 -> 214
    //   209: aload 5
    //   211: invokevirtual 163	java/io/InputStream:close	()V
    //   214: aload_3
    //   215: invokevirtual 166	java/net/HttpURLConnection:disconnect	()V
    //   218: new 168	L3/c
    //   221: dup
    //   222: iload 6
    //   224: aload_2
    //   225: invokespecial 171	L3/c:<init>	(ILjava/lang/String;)V
    //   228: areturn
    //   229: astore_2
    //   230: aconst_null
    //   231: astore_3
    //   232: aload_1
    //   233: ifnull +7 -> 240
    //   236: aload_1
    //   237: invokevirtual 163	java/io/InputStream:close	()V
    //   240: aload_3
    //   241: ifnull +7 -> 248
    //   244: aload_3
    //   245: invokevirtual 166	java/net/HttpURLConnection:disconnect	()V
    //   248: aload_2
    //   249: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	250	0	this	a
    //   1	236	1	localObject1	Object
    //   3	1	2	localObject2	Object
    //   162	1	2	localObject3	Object
    //   193	1	2	str1	String
    //   197	28	2	str2	String
    //   229	20	2	localObject4	Object
    //   16	229	3	localObject5	Object
    //   20	127	4	localObject6	Object
    //   25	185	5	localObject7	Object
    //   174	49	6	i	int
    // Exception table:
    //   from	to	target	type
    //   77	113	162	finally
    //   113	159	162	finally
    //   166	182	162	finally
    //   187	194	197	finally
    //   4	77	229	finally
  }
  
  public a d(String paramString1, String paramString2)
  {
    c.put(paramString1, paramString2);
    return this;
  }
  
  public final String e(InputStream paramInputStream)
  {
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream, "UTF-8"));
    char[] arrayOfChar = new char[' '];
    paramInputStream = new StringBuilder();
    for (;;)
    {
      int i = localBufferedReader.read(arrayOfChar);
      if (i == -1) {
        break;
      }
      paramInputStream.append(arrayOfChar, 0, i);
    }
    return paramInputStream.toString();
  }
}

/* Location:
 * Qualified Name:     L3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
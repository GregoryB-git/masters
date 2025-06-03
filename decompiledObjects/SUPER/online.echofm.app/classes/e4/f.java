package e4;

import android.util.Base64;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class f
{
  public URI a;
  public String b;
  public String c = null;
  public Map d;
  
  public f(URI paramURI, String paramString, Map paramMap)
  {
    a = paramURI;
    b = paramString;
    d = paramMap;
    c = a();
  }
  
  public final String a()
  {
    byte[] arrayOfByte = new byte[16];
    for (int i = 0; i < 16; i++) {
      arrayOfByte[i] = ((byte)(byte)d(0, 255));
    }
    return Base64.encodeToString(arrayOfByte, 2);
  }
  
  public final String b(LinkedHashMap paramLinkedHashMap)
  {
    String str1 = new String();
    Iterator localIterator = paramLinkedHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(str1);
      localStringBuilder.append(str2);
      localStringBuilder.append(": ");
      localStringBuilder.append((String)paramLinkedHashMap.get(str2));
      localStringBuilder.append("\r\n");
      str1 = localStringBuilder.toString();
    }
    return str1;
  }
  
  public byte[] c()
  {
    Object localObject1 = a.getPath();
    Object localObject2 = a.getQuery();
    Object localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append((String)localObject1);
    if (localObject2 == null)
    {
      localObject2 = "";
    }
    else
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("?");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ((StringBuilder)localObject1).toString();
    }
    ((StringBuilder)localObject3).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject3).toString();
    localObject3 = a.getHost();
    localObject2 = localObject3;
    if (a.getPort() != -1)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject3);
      ((StringBuilder)localObject2).append(":");
      ((StringBuilder)localObject2).append(a.getPort());
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject3 = new LinkedHashMap();
    ((AbstractMap)localObject3).put("Host", localObject2);
    ((AbstractMap)localObject3).put("Upgrade", "websocket");
    ((AbstractMap)localObject3).put("Connection", "Upgrade");
    ((AbstractMap)localObject3).put("Sec-WebSocket-Version", "13");
    ((AbstractMap)localObject3).put("Sec-WebSocket-Key", c);
    localObject2 = b;
    if (localObject2 != null) {
      ((AbstractMap)localObject3).put("Sec-WebSocket-Protocol", localObject2);
    }
    localObject2 = d;
    if (localObject2 != null)
    {
      Iterator localIterator = ((Map)localObject2).keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (String)localIterator.next();
        if (!((AbstractMap)localObject3).containsKey(localObject2)) {
          ((AbstractMap)localObject3).put(localObject2, (String)d.get(localObject2));
        }
      }
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("GET ");
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append(" HTTP/1.1\r\n");
    localObject1 = ((StringBuilder)localObject2).toString();
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append(b((LinkedHashMap)localObject3));
    localObject3 = ((StringBuilder)localObject2).toString();
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append((String)localObject3);
    ((StringBuilder)localObject2).append("\r\n");
    localObject3 = ((StringBuilder)localObject2).toString().getBytes(Charset.defaultCharset());
    localObject2 = new byte[localObject3.length];
    System.arraycopy(localObject3, 0, localObject2, 0, localObject3.length);
    return (byte[])localObject2;
  }
  
  public final int d(int paramInt1, int paramInt2)
  {
    return (int)(Math.random() * paramInt2 + paramInt1);
  }
  
  public void e(HashMap paramHashMap)
  {
    if ("websocket".equals(paramHashMap.get("upgrade")))
    {
      if ("upgrade".equals(paramHashMap.get("connection"))) {
        return;
      }
      throw new e("connection failed: missing header field in server handshake: Connection");
    }
    throw new e("connection failed: missing header field in server handshake: Upgrade");
  }
  
  public void f(String paramString)
  {
    int i = Integer.parseInt(paramString.substring(9, 12));
    if (i != 407)
    {
      if (i != 404)
      {
        if (i == 101) {
          return;
        }
        paramString = new StringBuilder();
        paramString.append("connection failed: unknown status code ");
        paramString.append(i);
        throw new e(paramString.toString());
      }
      throw new e("connection failed: 404 not found");
    }
    throw new e("connection failed: proxy authentication not supported");
  }
}

/* Location:
 * Qualified Name:     e4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package a4;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrm.KeyRequest;
import android.media.MediaDrm.PlaybackComponent;
import android.media.MediaDrm.ProvisionRequest;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import f;
import g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k4.h.a;
import n7.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v5.e0;
import v5.m;
import v5.u;
import w3.a0;
import w3.a0.a;

public final class s
  implements o
{
  public static final g d = new g();
  public final UUID a;
  public final MediaDrm b;
  public int c;
  
  public s(UUID paramUUID)
  {
    paramUUID.getClass();
    Object localObject = v3.h.b;
    x6.b.o("Use C.CLEARKEY_UUID instead", ((UUID)localObject).equals(paramUUID) ^ true);
    a = paramUUID;
    if ((e0.a >= 27) || (!v3.h.c.equals(paramUUID))) {
      localObject = paramUUID;
    }
    localObject = new MediaDrm((UUID)localObject);
    b = ((MediaDrm)localObject);
    c = 1;
    if ((v3.h.d.equals(paramUUID)) && ("ASUS_Z00AD".equals(e0.d))) {
      ((MediaDrm)localObject).setPropertyString("securityLevel", "L3");
    }
  }
  
  public final Map<String, String> a(byte[] paramArrayOfByte)
  {
    return b.queryKeyStatus(paramArrayOfByte);
  }
  
  public final o.d b()
  {
    MediaDrm.ProvisionRequest localProvisionRequest = b.getProvisionRequest();
    byte[] arrayOfByte = localProvisionRequest.getData();
    return new o.d(localProvisionRequest.getDefaultUrl(), arrayOfByte);
  }
  
  public final z3.b c(byte[] paramArrayOfByte)
  {
    int i = e0.a;
    boolean bool;
    if ((i < 21) && (v3.h.d.equals(a)) && ("L3".equals(b.getPropertyString("securityLevel")))) {
      bool = true;
    } else {
      bool = false;
    }
    UUID localUUID1 = a;
    UUID localUUID2 = localUUID1;
    if (i < 27)
    {
      localUUID2 = localUUID1;
      if (v3.h.c.equals(localUUID1)) {
        localUUID2 = v3.h.b;
      }
    }
    return new p(localUUID2, paramArrayOfByte, bool);
  }
  
  public final byte[] d()
  {
    return b.openSession();
  }
  
  public final void e(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    b.restoreKeys(paramArrayOfByte1, paramArrayOfByte2);
  }
  
  public final void f(byte[] paramArrayOfByte)
  {
    b.closeSession(paramArrayOfByte);
  }
  
  public final void g(b.a parama)
  {
    b.setOnEventListener(new q(this, parama));
  }
  
  public final byte[] h(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    Object localObject1 = paramArrayOfByte2;
    byte[] arrayOfByte;
    if (v3.h.c.equals(a)) {
      if (e0.a >= 27) {
        localObject1 = paramArrayOfByte2;
      } else {
        try
        {
          localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>(e0.n(paramArrayOfByte2));
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("{\"keys\":[");
          JSONArray localJSONArray = ((JSONObject)localObject2).getJSONArray("keys");
          for (int i = 0; i < localJSONArray.length(); i++)
          {
            if (i != 0) {
              ((StringBuilder)localObject1).append(",");
            }
            localObject2 = localJSONArray.getJSONObject(i);
            ((StringBuilder)localObject1).append("{\"k\":\"");
            ((StringBuilder)localObject1).append(((JSONObject)localObject2).getString("k").replace('-', '+').replace('_', '/'));
            ((StringBuilder)localObject1).append("\",\"kid\":\"");
            ((StringBuilder)localObject1).append(((JSONObject)localObject2).getString("kid").replace('-', '+').replace('_', '/'));
            ((StringBuilder)localObject1).append("\",\"kty\":\"");
            ((StringBuilder)localObject1).append(((JSONObject)localObject2).getString("kty"));
            ((StringBuilder)localObject1).append("\"}");
          }
          ((StringBuilder)localObject1).append("]}");
          localObject1 = e0.B(((StringBuilder)localObject1).toString());
        }
        catch (JSONException localJSONException)
        {
          Object localObject2 = f.l("Failed to adjust response data: ");
          ((StringBuilder)localObject2).append(e0.n(paramArrayOfByte2));
          m.d("ClearKeyUtil", ((StringBuilder)localObject2).toString(), localJSONException);
          arrayOfByte = paramArrayOfByte2;
        }
      }
    }
    return b.provideKeyResponse(paramArrayOfByte1, arrayOfByte);
  }
  
  public final void i(byte[] paramArrayOfByte)
  {
    b.provideProvisionResponse(paramArrayOfByte);
  }
  
  public final void j(byte[] paramArrayOfByte, a0 parama0)
  {
    if (e0.a >= 31) {
      try
      {
        a.b(b, paramArrayOfByte, parama0);
      }
      catch (UnsupportedOperationException paramArrayOfByte)
      {
        m.f("FrameworkMediaDrm", "setLogSessionId failed.");
      }
    }
  }
  
  public final o.a k(byte[] paramArrayOfByte, List<d.b> paramList, int paramInt, HashMap<String, String> paramHashMap)
  {
    Object localObject1 = null;
    if (paramList != null)
    {
      localObject2 = a;
      int i;
      int k;
      if (v3.h.d.equals(localObject2))
      {
        if ((e0.a >= 28) && (paramList.size() > 1))
        {
          localObject2 = (d.b)paramList.get(0);
          i = 0;
          j = i;
          while (i < paramList.size())
          {
            localObject3 = (d.b)paramList.get(i);
            localObject1 = e;
            localObject1.getClass();
            if ((e0.a(d, d)) && (e0.a(c, c)))
            {
              if (k4.h.b((byte[])localObject1) != null) {
                k = 1;
              } else {
                k = 0;
              }
              if (k != 0)
              {
                j += localObject1.length;
                i++;
                continue;
              }
            }
            i = 0;
            break label178;
          }
          i = 1;
          label178:
          if (i != 0)
          {
            localObject3 = new byte[j];
            j = 0;
            i = j;
            while (j < paramList.size())
            {
              localObject1 = gete;
              localObject1.getClass();
              k = localObject1.length;
              System.arraycopy(localObject1, 0, localObject3, i, k);
              i += k;
              j++;
            }
            paramList = new d.b(b, c, d, (byte[])localObject3);
            break label408;
          }
        }
        for (j = 0; j < paramList.size(); j++)
        {
          localObject2 = (d.b)paramList.get(j);
          localObject3 = e;
          localObject3.getClass();
          localObject3 = k4.h.b((byte[])localObject3);
          if (localObject3 == null) {
            i = -1;
          } else {
            i = b;
          }
          k = e0.a;
          if (((k < 23) && (i == 0)) || ((k >= 23) && (i == 1)))
          {
            paramList = (List<d.b>)localObject2;
            break label408;
          }
        }
      }
      else
      {
        paramList = (d.b)paramList.get(0);
      }
      label408:
      localObject1 = a;
      localObject3 = e;
      localObject3.getClass();
      UUID localUUID = v3.h.e;
      localObject2 = localObject3;
      if (localUUID.equals(localObject1))
      {
        localObject2 = k4.h.c((UUID)localObject1, (byte[])localObject3);
        if (localObject2 == null) {
          localObject2 = localObject3;
        }
        Object localObject4 = new u((byte[])localObject2);
        k = ((u)localObject4).i();
        i = ((u)localObject4).k();
        j = ((u)localObject4).k();
        if ((i == 1) && (j == 1))
        {
          int m = ((u)localObject4).k();
          localObject3 = d.e;
          localObject4 = ((u)localObject4).t(m, (Charset)localObject3);
          if (!((String)localObject4).contains("<LA_URL>"))
          {
            m = ((String)localObject4).indexOf("</DATA>");
            if (m == -1) {
              m.f("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append(((String)localObject4).substring(0, m));
            ((StringBuilder)localObject2).append("<LA_URL>https://x</LA_URL>");
            ((StringBuilder)localObject2).append(((String)localObject4).substring(m));
            localObject2 = ((StringBuilder)localObject2).toString();
            k += 52;
            localObject4 = ByteBuffer.allocate(k);
            ((ByteBuffer)localObject4).order(ByteOrder.LITTLE_ENDIAN);
            ((ByteBuffer)localObject4).putInt(k);
            ((ByteBuffer)localObject4).putShort((short)i);
            ((ByteBuffer)localObject4).putShort((short)j);
            ((ByteBuffer)localObject4).putShort((short)(((String)localObject2).length() * 2));
            ((ByteBuffer)localObject4).put(((String)localObject2).getBytes((Charset)localObject3));
            localObject2 = ((ByteBuffer)localObject4).array();
          }
        }
        else
        {
          m.e("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        }
        localObject2 = k4.h.a(localUUID, null, (byte[])localObject2);
      }
      int j = e0.a;
      if ((j >= 23) || (!v3.h.d.equals(localObject1)))
      {
        if ((localUUID.equals(localObject1)) && ("Amazon".equals(e0.c)))
        {
          localObject3 = e0.d;
          if ((!"AFTB".equals(localObject3)) && (!"AFTS".equals(localObject3)) && (!"AFTM".equals(localObject3)) && (!"AFTT".equals(localObject3))) {}
        }
      }
      else
      {
        localObject3 = k4.h.c((UUID)localObject1, (byte[])localObject2);
        if (localObject3 != null) {
          localObject2 = localObject3;
        }
      }
      localObject1 = a;
      localObject3 = d;
      if ((j < 26) && (v3.h.c.equals(localObject1)) && (("video/mp4".equals(localObject3)) || ("audio/mp4".equals(localObject3)))) {
        localObject3 = "cenc";
      }
    }
    else
    {
      localObject2 = null;
      localObject3 = localObject2;
      paramList = (List<d.b>)localObject1;
    }
    Object localObject3 = b.getKeyRequest(paramArrayOfByte, (byte[])localObject2, (String)localObject3, paramInt, paramHashMap);
    Object localObject2 = a;
    paramArrayOfByte = ((MediaDrm.KeyRequest)localObject3).getData();
    paramHashMap = paramArrayOfByte;
    if (v3.h.c.equals(localObject2)) {
      if (e0.a >= 27) {
        paramHashMap = paramArrayOfByte;
      } else {
        paramHashMap = e0.B(e0.n(paramArrayOfByte).replace('+', '-').replace('/', '_'));
      }
    }
    localObject2 = ((MediaDrm.KeyRequest)localObject3).getDefaultUrl();
    if (!"<LA_URL>https://x</LA_URL>".equals(localObject2))
    {
      paramArrayOfByte = (byte[])localObject2;
      if (e0.a == 33)
      {
        paramArrayOfByte = (byte[])localObject2;
        if (!"https://default.url".equals(localObject2)) {}
      }
    }
    else
    {
      paramArrayOfByte = "";
    }
    localObject2 = paramArrayOfByte;
    if (TextUtils.isEmpty(paramArrayOfByte))
    {
      localObject2 = paramArrayOfByte;
      if (paramList != null)
      {
        localObject2 = paramArrayOfByte;
        if (!TextUtils.isEmpty(c)) {
          localObject2 = c;
        }
      }
    }
    if (e0.a >= 23) {
      ((MediaDrm.KeyRequest)localObject3).getRequestType();
    }
    return new o.a((String)localObject2, paramHashMap);
  }
  
  public final int l()
  {
    return 2;
  }
  
  public final boolean m(String paramString, byte[] paramArrayOfByte)
  {
    if (e0.a >= 31) {
      return a.a(b, paramString);
    }
    try
    {
      paramArrayOfByte = new MediaCrypto(a, paramArrayOfByte);
      try
      {
        boolean bool = paramArrayOfByte.requiresSecureDecoderComponent(paramString);
        return bool;
      }
      finally
      {
        paramArrayOfByte.release();
      }
      return true;
    }
    catch (MediaCryptoException paramString) {}
  }
  
  public final void release()
  {
    try
    {
      int i = c - 1;
      c = i;
      if (i == 0) {
        b.release();
      }
      return;
    }
    finally {}
  }
  
  public static final class a
  {
    public static boolean a(MediaDrm paramMediaDrm, String paramString)
    {
      return r.j(paramMediaDrm, paramString);
    }
    
    public static void b(MediaDrm paramMediaDrm, byte[] paramArrayOfByte, a0 parama0)
    {
      parama0 = a;
      parama0.getClass();
      parama0 = a;
      if (!parama0.equals(LogSessionId.LOG_SESSION_ID_NONE))
      {
        paramMediaDrm = paramMediaDrm.getPlaybackComponent(paramArrayOfByte);
        paramMediaDrm.getClass();
        paramMediaDrm.setLogSessionId(parama0);
      }
    }
  }
}

/* Location:
 * Qualified Name:     a4.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
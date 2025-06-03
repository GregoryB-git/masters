package g5;

import android.util.Base64;
import java.util.UUID;
import k4.h;
import k4.k;
import org.xmlpull.v1.XmlPullParser;

public final class b$c
  extends b.a
{
  public boolean e;
  public UUID f;
  public byte[] g;
  
  public b$c(b.a parama, String paramString)
  {
    super(parama, paramString, "Protection");
  }
  
  public final Object b()
  {
    UUID localUUID = f;
    byte[] arrayOfByte1 = h.a(localUUID, null, g);
    byte[] arrayOfByte2 = g;
    Object localObject = new StringBuilder();
    for (int i = 0; i < arrayOfByte2.length; i += 2) {
      ((StringBuilder)localObject).append((char)arrayOfByte2[i]);
    }
    localObject = ((StringBuilder)localObject).toString();
    localObject = Base64.decode(((String)localObject).substring(((String)localObject).indexOf("<KID>") + 5, ((String)localObject).indexOf("</KID>")), 0);
    i = localObject[0];
    localObject[0] = ((byte)localObject[3]);
    localObject[3] = ((byte)i);
    i = localObject[1];
    localObject[1] = ((byte)localObject[2]);
    localObject[2] = ((byte)i);
    i = localObject[4];
    localObject[4] = ((byte)localObject[5]);
    localObject[5] = ((byte)i);
    i = localObject[6];
    localObject[6] = ((byte)localObject[7]);
    localObject[7] = ((byte)i);
    return new a.a(localUUID, arrayOfByte1, new k[] { new k(true, null, 8, (byte[])localObject, 0, 0, null) });
  }
  
  public final boolean d(String paramString)
  {
    return "ProtectionHeader".equals(paramString);
  }
  
  public final void f(XmlPullParser paramXmlPullParser)
  {
    if ("ProtectionHeader".equals(paramXmlPullParser.getName())) {
      e = false;
    }
  }
  
  public final void j(XmlPullParser paramXmlPullParser)
  {
    if ("ProtectionHeader".equals(paramXmlPullParser.getName()))
    {
      e = true;
      String str = paramXmlPullParser.getAttributeValue(null, "SystemID");
      paramXmlPullParser = str;
      if (str.charAt(0) == '{')
      {
        paramXmlPullParser = str;
        if (str.charAt(str.length() - 1) == '}') {
          paramXmlPullParser = str.substring(1, str.length() - 1);
        }
      }
      f = UUID.fromString(paramXmlPullParser);
    }
  }
  
  public final void k(XmlPullParser paramXmlPullParser)
  {
    if (e) {
      g = Base64.decode(paramXmlPullParser.getText(), 0);
    }
  }
}

/* Location:
 * Qualified Name:     g5.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
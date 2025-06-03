package g5;

import android.text.TextUtils;
import b.a0;
import f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import v3.i0;
import v3.i0.a;
import v5.e0;
import x3.a;

public final class b$d
  extends b.a
{
  public i0 e;
  
  public b$d(b.a parama, String paramString)
  {
    super(parama, paramString, "QualityLevel");
  }
  
  public static ArrayList m(String paramString)
  {
    ArrayList localArrayList1 = new ArrayList();
    if (!TextUtils.isEmpty(paramString))
    {
      int i = e0.a;
      int j = paramString.length() / 2;
      byte[] arrayOfByte1 = new byte[j];
      int k;
      int m;
      for (i = 0; i < j; i++)
      {
        k = i * 2;
        m = Character.digit(paramString.charAt(k), 16);
        arrayOfByte1[i] = ((byte)(byte)(Character.digit(paramString.charAt(k + 1), 16) + (m << 4)));
      }
      if (j + 0 <= 4)
      {
        i = 0;
      }
      else
      {
        for (i = 0;; i++)
        {
          paramString = a0.f0;
          if (i >= 4) {
            break label130;
          }
          if (arrayOfByte1[(0 + i)] != paramString[i]) {
            break;
          }
        }
        label130:
        i = 1;
      }
      if (i == 0)
      {
        paramString = null;
      }
      else
      {
        ArrayList localArrayList2 = new ArrayList();
        m = 0;
        label225:
        label244:
        do
        {
          localArrayList2.add(Integer.valueOf(m));
          for (i = m + 4; i <= j - 4; i++)
          {
            if (j - i <= 4)
            {
              m = 0;
            }
            else
            {
              for (m = 0;; m++)
              {
                paramString = a0.f0;
                if (m >= 4) {
                  break label225;
                }
                if (arrayOfByte1[(i + m)] != paramString[m]) {
                  break;
                }
              }
              m = 1;
            }
            if (m != 0) {
              break label244;
            }
          }
          i = -1;
          m = i;
        } while (i != -1);
        paramString = new byte[localArrayList2.size()][];
        for (i = 0; i < localArrayList2.size(); i++)
        {
          k = ((Integer)localArrayList2.get(i)).intValue();
          if (i < localArrayList2.size() - 1) {
            m = ((Integer)localArrayList2.get(i + 1)).intValue();
          } else {
            m = j;
          }
          m -= k;
          byte[] arrayOfByte2 = new byte[m];
          System.arraycopy(arrayOfByte1, k, arrayOfByte2, 0, m);
          paramString[i] = arrayOfByte2;
        }
      }
      if (paramString == null) {
        localArrayList1.add(arrayOfByte1);
      } else {
        Collections.addAll(localArrayList1, paramString);
      }
    }
    return localArrayList1;
  }
  
  public final Object b()
  {
    return e;
  }
  
  public final void j(XmlPullParser paramXmlPullParser)
  {
    i0.a locala = new i0.a();
    Object localObject1 = paramXmlPullParser.getAttributeValue(null, "FourCC");
    if (localObject1 != null)
    {
      if ((!((String)localObject1).equalsIgnoreCase("H264")) && (!((String)localObject1).equalsIgnoreCase("X264")) && (!((String)localObject1).equalsIgnoreCase("AVC1")) && (!((String)localObject1).equalsIgnoreCase("DAVC")))
      {
        if ((!((String)localObject1).equalsIgnoreCase("AAC")) && (!((String)localObject1).equalsIgnoreCase("AACL")) && (!((String)localObject1).equalsIgnoreCase("AACH")) && (!((String)localObject1).equalsIgnoreCase("AACP")))
        {
          if ((!((String)localObject1).equalsIgnoreCase("TTML")) && (!((String)localObject1).equalsIgnoreCase("DFXP")))
          {
            if ((!((String)localObject1).equalsIgnoreCase("ac-3")) && (!((String)localObject1).equalsIgnoreCase("dac3")))
            {
              if ((!((String)localObject1).equalsIgnoreCase("ec-3")) && (!((String)localObject1).equalsIgnoreCase("dec3")))
              {
                if (((String)localObject1).equalsIgnoreCase("dtsc")) {
                  localObject1 = "audio/vnd.dts";
                } else if ((!((String)localObject1).equalsIgnoreCase("dtsh")) && (!((String)localObject1).equalsIgnoreCase("dtsl")))
                {
                  if (((String)localObject1).equalsIgnoreCase("dtse")) {
                    localObject1 = "audio/vnd.dts.hd;profile=lbr";
                  } else if (((String)localObject1).equalsIgnoreCase("opus")) {
                    localObject1 = "audio/opus";
                  } else {
                    localObject1 = null;
                  }
                }
                else {
                  localObject1 = "audio/vnd.dts.hd";
                }
              }
              else {
                localObject1 = "audio/eac3";
              }
            }
            else {
              localObject1 = "audio/ac3";
            }
          }
          else {
            localObject1 = "application/ttml+xml";
          }
        }
        else {
          localObject1 = "audio/mp4a-latm";
        }
      }
      else {
        localObject1 = "video/avc";
      }
      int i = ((Integer)c("Type")).intValue();
      Object localObject2;
      if (i == 2)
      {
        localObject2 = m(paramXmlPullParser.getAttributeValue(null, "CodecPrivateData"));
        j = "video/mp4";
        p = b.a.i(paramXmlPullParser, "MaxWidth");
        q = b.a.i(paramXmlPullParser, "MaxHeight");
        m = ((List)localObject2);
      }
      else
      {
        int j = 0;
        int k = 0;
        if (i == 1)
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = "audio/mp4a-latm";
          }
          int m = b.a.i(paramXmlPullParser, "Channels");
          int n = b.a.i(paramXmlPullParser, "SamplingRate");
          ArrayList localArrayList = m(paramXmlPullParser.getAttributeValue(null, "CodecPrivateData"));
          localObject1 = localArrayList;
          if (localArrayList.isEmpty())
          {
            localObject1 = localArrayList;
            if ("audio/mp4a-latm".equals(localObject2))
            {
              j = -1;
              for (i = 0;; i++)
              {
                localObject1 = a.a;
                if (i >= 13) {
                  break;
                }
                if (n == localObject1[i]) {
                  j = i;
                }
              }
              int i1 = -1;
              i = k;
              k = i1;
              for (;;)
              {
                localObject1 = a.b;
                if (i >= 16) {
                  break;
                }
                if (m == localObject1[i]) {
                  k = i;
                }
                i++;
              }
              if ((n != -1) && (k != -1)) {
                localObject1 = Collections.singletonList(a.a(2, j, k));
              } else {
                throw new IllegalArgumentException(f.i("Invalid sample rate or number of channels: ", n, ", ", m));
              }
            }
          }
          j = "audio/mp4";
          x = m;
          y = n;
          m = ((List)localObject1);
          localObject1 = localObject2;
        }
        else if (i == 3)
        {
          localObject2 = (String)c("Subtype");
          i = j;
          if (localObject2 != null) {
            if (!((String)localObject2).equals("CAPT"))
            {
              if (!((String)localObject2).equals("DESC")) {
                i = j;
              } else {
                i = 1024;
              }
            }
            else {
              i = 64;
            }
          }
          j = "application/mp4";
          e = i;
        }
        else
        {
          j = "application/mp4";
        }
      }
      a = paramXmlPullParser.getAttributeValue(null, "Index");
      b = ((String)c("Name"));
      k = ((String)localObject1);
      f = b.a.i(paramXmlPullParser, "Bitrate");
      c = ((String)c("Language"));
      e = new i0(locala);
      return;
    }
    throw new b.b("FourCC");
  }
}

/* Location:
 * Qualified Name:     g5.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.util.Base64;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

class SsManifestParser$ProtectionParser
  extends SsManifestParser.ElementParser
{
  public static final String KEY_SYSTEM_ID = "SystemID";
  public static final String TAG = "Protection";
  public static final String TAG_PROTECTION_HEADER = "ProtectionHeader";
  private boolean inProtectionHeader;
  private byte[] initData;
  private UUID uuid;
  
  public SsManifestParser$ProtectionParser(SsManifestParser.ElementParser paramElementParser, String paramString)
  {
    super(paramElementParser, paramString, "Protection");
  }
  
  private static String stripCurlyBraces(String paramString)
  {
    String str = paramString;
    if (paramString.charAt(0) == '{')
    {
      str = paramString;
      if (paramString.charAt(paramString.length() - 1) == '}') {
        str = paramString.substring(1, paramString.length() - 1);
      }
    }
    return str;
  }
  
  public Object build()
  {
    UUID localUUID = uuid;
    return new SsManifest.ProtectionElement(localUUID, PsshAtomUtil.buildPsshAtom(localUUID, initData));
  }
  
  public boolean handleChildInline(String paramString)
  {
    return "ProtectionHeader".equals(paramString);
  }
  
  public void parseEndTag(XmlPullParser paramXmlPullParser)
  {
    if ("ProtectionHeader".equals(paramXmlPullParser.getName())) {
      inProtectionHeader = false;
    }
  }
  
  public void parseStartTag(XmlPullParser paramXmlPullParser)
  {
    if ("ProtectionHeader".equals(paramXmlPullParser.getName()))
    {
      inProtectionHeader = true;
      uuid = UUID.fromString(stripCurlyBraces(paramXmlPullParser.getAttributeValue(null, "SystemID")));
    }
  }
  
  public void parseText(XmlPullParser paramXmlPullParser)
  {
    if (inProtectionHeader) {
      initData = Base64.decode(paramXmlPullParser.getText(), 0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.ProtectionParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
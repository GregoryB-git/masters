package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.print.PrintAttributes;
import android.print.PrintAttributes.MediaSize;
import java.util.HashMap;
import java.util.Map;

public class PrintAttributesExt
{
  private int colorMode;
  private Integer duplex;
  private MarginsExt margins;
  private MediaSizeExt mediaSize;
  private Integer orientation;
  private ResolutionExt resolution;
  
  public static PrintAttributesExt fromPrintAttributes(PrintAttributes paramPrintAttributes)
  {
    if (paramPrintAttributes == null) {
      return null;
    }
    PrintAttributesExt localPrintAttributesExt = new PrintAttributesExt();
    colorMode = paramPrintAttributes.getColorMode();
    duplex = Integer.valueOf(paramPrintAttributes.getDuplexMode());
    PrintAttributes.MediaSize localMediaSize = paramPrintAttributes.getMediaSize();
    if (localMediaSize != null)
    {
      mediaSize = MediaSizeExt.fromMediaSize(localMediaSize);
      orientation = Integer.valueOf(localMediaSize.isPortrait() ^ true);
    }
    resolution = ResolutionExt.fromResolution(paramPrintAttributes.getResolution());
    margins = MarginsExt.fromMargins(paramPrintAttributes.getMinMargins());
    return localPrintAttributesExt;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("colorMode", Integer.valueOf(colorMode));
    localHashMap.put("duplex", duplex);
    localHashMap.put("orientation", orientation);
    Object localObject1 = mediaSize;
    Object localObject2 = null;
    if (localObject1 != null) {
      localObject1 = ((MediaSizeExt)localObject1).toMap();
    } else {
      localObject1 = null;
    }
    localHashMap.put("mediaSize", localObject1);
    localObject1 = resolution;
    if (localObject1 != null) {
      localObject1 = ((ResolutionExt)localObject1).toMap();
    } else {
      localObject1 = null;
    }
    localHashMap.put("resolution", localObject1);
    MarginsExt localMarginsExt = margins;
    localObject1 = localObject2;
    if (localMarginsExt != null) {
      localObject1 = localMarginsExt.toMap();
    }
    localHashMap.put("margins", localObject1);
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.PrintAttributesExt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
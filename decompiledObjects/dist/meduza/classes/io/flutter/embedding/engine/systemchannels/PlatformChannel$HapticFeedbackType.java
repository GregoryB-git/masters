package io.flutter.embedding.engine.systemchannels;

import g;

public enum PlatformChannel$HapticFeedbackType
{
  private final String encodedName;
  
  static
  {
    LIGHT_IMPACT = new HapticFeedbackType("LIGHT_IMPACT", 1, "HapticFeedbackType.lightImpact");
    MEDIUM_IMPACT = new HapticFeedbackType("MEDIUM_IMPACT", 2, "HapticFeedbackType.mediumImpact");
    HEAVY_IMPACT = new HapticFeedbackType("HEAVY_IMPACT", 3, "HapticFeedbackType.heavyImpact");
    SELECTION_CLICK = new HapticFeedbackType("SELECTION_CLICK", 4, "HapticFeedbackType.selectionClick");
  }
  
  private PlatformChannel$HapticFeedbackType(String paramString)
  {
    encodedName = paramString;
  }
  
  public static HapticFeedbackType fromValue(String paramString)
  {
    for (HapticFeedbackType localHapticFeedbackType : )
    {
      String str = encodedName;
      if (((str == null) && (paramString == null)) || ((str != null) && (str.equals(paramString)))) {
        return localHapticFeedbackType;
      }
    }
    throw new NoSuchFieldException(g.d("No such HapticFeedbackType: ", paramString));
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
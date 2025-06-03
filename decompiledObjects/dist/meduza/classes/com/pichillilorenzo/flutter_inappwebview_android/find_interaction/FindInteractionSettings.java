package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import java.util.HashMap;
import java.util.Map;

public class FindInteractionSettings
  implements ISettings<FindInteractionController>
{
  public static final String LOG_TAG = "FindInteractionSettings";
  
  public Map<String, Object> getRealSettings(FindInteractionController paramFindInteractionController)
  {
    return toMap();
  }
  
  public FindInteractionSettings parse(Map<String, Object> paramMap)
  {
    return this;
  }
  
  public Map<String, Object> toMap()
  {
    return new HashMap();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.facebook.core.internal.logging.dumpsys;

import android.view.accessibility.AccessibilityNodeInfo;
import org.json.JSONException;
import org.json.JSONObject;

class EndToEndDumpsysHelper$Api24Utils
{
  public static void addExtraProps(JSONObject paramJSONObject, AccessibilityNodeInfo paramAccessibilityNodeInfo)
    throws JSONException
  {
    paramJSONObject.put("context-clickable", paramAccessibilityNodeInfo.isContextClickable()).put("drawing-order", paramAccessibilityNodeInfo.getDrawingOrder()).put("important-for-accessibility", paramAccessibilityNodeInfo.isImportantForAccessibility());
  }
}

/* Location:
 * Qualified Name:     com.facebook.core.internal.logging.dumpsys.EndToEndDumpsysHelper.Api24Utils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.facebook.core.internal.logging.dumpsys;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.io.PrintWriter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class EndToEndDumpsysHelper$Api21Utils
{
  @Nullable
  private static Field mKeyedTagsField;
  
  static
  {
    try
    {
      Field localField = View.class.getDeclaredField("mKeyedTags");
      mKeyedTagsField = localField;
      localField.setAccessible(true);
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  @Nullable
  private static JSONObject getTags(View paramView)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic 26	com/facebook/core/internal/logging/dumpsys/EndToEndDumpsysHelper$Api21Utils:mKeyedTagsField	Ljava/lang/reflect/Field;
    //   5: ifnonnull +20 -> 25
    //   8: ldc 16
    //   10: ldc 18
    //   12: invokevirtual 24	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   15: astore_2
    //   16: aload_2
    //   17: putstatic 26	com/facebook/core/internal/logging/dumpsys/EndToEndDumpsysHelper$Api21Utils:mKeyedTagsField	Ljava/lang/reflect/Field;
    //   20: aload_2
    //   21: iconst_1
    //   22: invokevirtual 32	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   25: getstatic 26	com/facebook/core/internal/logging/dumpsys/EndToEndDumpsysHelper$Api21Utils:mKeyedTagsField	Ljava/lang/reflect/Field;
    //   28: aload_0
    //   29: invokevirtual 48	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   32: checkcast 50	android/util/SparseArray
    //   35: astore_3
    //   36: aload_1
    //   37: astore_2
    //   38: aload_3
    //   39: ifnull +72 -> 111
    //   42: aload_1
    //   43: astore_2
    //   44: aload_3
    //   45: invokevirtual 54	android/util/SparseArray:size	()I
    //   48: ifle +63 -> 111
    //   51: new 56	org/json/JSONObject
    //   54: astore_2
    //   55: aload_2
    //   56: invokespecial 57	org/json/JSONObject:<init>	()V
    //   59: iconst_0
    //   60: istore 4
    //   62: aload_3
    //   63: invokevirtual 54	android/util/SparseArray:size	()I
    //   66: istore 5
    //   68: iload 4
    //   70: iload 5
    //   72: if_icmpge +39 -> 111
    //   75: aload_0
    //   76: invokevirtual 61	android/view/View:getContext	()Landroid/content/Context;
    //   79: aload_0
    //   80: invokevirtual 65	android/view/View:getResources	()Landroid/content/res/Resources;
    //   83: aload_3
    //   84: iload 4
    //   86: invokevirtual 69	android/util/SparseArray:keyAt	(I)I
    //   89: invokestatic 75	com/facebook/core/internal/logging/dumpsys/ResourcesUtil:getIdStringQuietly	(Ljava/lang/Object;Landroid/content/res/Resources;I)Ljava/lang/String;
    //   92: astore_1
    //   93: aload_2
    //   94: aload_1
    //   95: aload_3
    //   96: iload 4
    //   98: invokevirtual 79	android/util/SparseArray:valueAt	(I)Ljava/lang/Object;
    //   101: invokevirtual 83	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   104: pop
    //   105: iinc 4 1
    //   108: goto -40 -> 68
    //   111: aload_2
    //   112: areturn
    //   113: astore_0
    //   114: aload_1
    //   115: astore_2
    //   116: goto -5 -> 111
    //   119: astore_0
    //   120: goto -9 -> 111
    //   123: astore_1
    //   124: goto -19 -> 105
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	paramView	View
    //   1	114	1	str	String
    //   123	1	1	localJSONException	JSONException
    //   15	101	2	localObject	Object
    //   35	61	3	localSparseArray	android.util.SparseArray
    //   60	46	4	i	int
    //   66	7	5	j	int
    // Exception table:
    //   from	to	target	type
    //   2	25	113	java/lang/Exception
    //   25	36	113	java/lang/Exception
    //   44	59	113	java/lang/Exception
    //   62	68	119	java/lang/Exception
    //   75	93	119	java/lang/Exception
    //   93	105	119	java/lang/Exception
    //   93	105	123	org/json/JSONException
  }
  
  public static void writeExtraProps(PrintWriter paramPrintWriter, View paramView)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = EndToEndDumpsysHelper.access$000(paramView);
    if (localAccessibilityNodeInfo == null) {
      return;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      if ((paramView instanceof TextView))
      {
        localObject = (TextView)paramView;
        localJSONObject.put("textColor", ((TextView)localObject).getTextColors().getDefaultColor());
        localJSONObject.put("textSize", ((TextView)localObject).getTextSize());
        localJSONObject.put("hint", EndToEndDumpsysHelper.access$100(((TextView)localObject).getHint(), 100));
      }
      paramView = getTags(paramView);
      if (paramView != null) {
        localJSONObject.put("keyedTags", paramView);
      }
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      Object localObject = localAccessibilityNodeInfo.getActionList().iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramView = (String)((AccessibilityNodeInfo.AccessibilityAction)((Iterator)localObject).next()).getLabel();
        if (paramView != null) {
          localJSONArray.put(EndToEndDumpsysHelper.access$100(paramView, 50));
        }
      }
      if (localJSONArray.length() > 0) {
        localJSONObject.put("actions", localJSONArray);
      }
      paramView = EndToEndDumpsysHelper.access$100(localAccessibilityNodeInfo.getContentDescription(), 50);
      if ((paramView != null) && (paramView.length() > 0)) {
        localJSONObject.put("content-description", paramView);
      }
      localJSONObject.put("accessibility-focused", localAccessibilityNodeInfo.isAccessibilityFocused()).put("checkable", localAccessibilityNodeInfo.isCheckable()).put("checked", localAccessibilityNodeInfo.isChecked()).put("class-name", EndToEndDumpsysHelper.access$100(localAccessibilityNodeInfo.getClassName(), 50)).put("clickable", localAccessibilityNodeInfo.isClickable()).put("content-invalid", localAccessibilityNodeInfo.isContentInvalid()).put("dismissable", localAccessibilityNodeInfo.isDismissable()).put("editable", localAccessibilityNodeInfo.isEditable()).put("enabled", localAccessibilityNodeInfo.isEnabled()).put("focusable", localAccessibilityNodeInfo.isFocusable()).put("focused", localAccessibilityNodeInfo.isFocused()).put("long-clickable", localAccessibilityNodeInfo.isLongClickable()).put("multiline", localAccessibilityNodeInfo.isMultiLine()).put("password", localAccessibilityNodeInfo.isPassword()).put("scrollable", localAccessibilityNodeInfo.isScrollable()).put("selected", localAccessibilityNodeInfo.isSelected()).put("visible-to-user", localAccessibilityNodeInfo.isVisibleToUser());
      EndToEndDumpsysHelper.Api24Utils.addExtraProps(localJSONObject, localAccessibilityNodeInfo);
    }
    catch (Exception paramView) {}
    try
    {
      localJSONObject.put("DUMP-ERROR", EndToEndDumpsysHelper.access$100(paramView.getMessage(), 50));
      paramPrintWriter.append(" props=\"").append(localJSONObject.toString()).append("\"");
      return;
    }
    catch (JSONException paramView)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.core.internal.logging.dumpsys.EndToEndDumpsysHelper.Api21Utils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
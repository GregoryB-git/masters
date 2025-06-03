package com.facebook.core.internal.logging.dumpsys;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.io.PrintWriter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

@SuppressLint({"HexColorValueUsage", "CatchGeneralException", "BadMethodUse-java.lang.String.length"})
public final class EndToEndDumpsysHelper
{
  private static final String ALL_ROOTS_ARGUMENT = "all-roots";
  private static final String E2E_ARGUMENT = "e2e";
  private static final String LITHO_VIEW_CLASS = "com.facebook.litho.LithoView";
  private static final String LITHO_VIEW_TEST_HELPER_CLASS = "com.facebook.litho.LithoViewTestHelper";
  private static final String LITHO_VIEW_TO_STRING_METHOD = "viewToStringForE2E";
  private static final String RC_TEXT_VIEW_SIMPLE_CLASS_NAME = "RCTextView";
  private static final String TOP_ROOT_ARGUMENT = "top-root";
  private static final String WITH_PROPS_ARGUMENT = "props";
  private static final String WITH_WEBVIEW_ARGUMENT = "webview";
  private static EndToEndDumpsysHelper mInstance;
  @Nullable
  private static Method sRcTextViewGetTextMethod;
  @Nullable
  private Method mLithoViewToStringMethod;
  private final AndroidRootResolver mRootResolver = new AndroidRootResolver();
  private final WebViewDumpHelper mWebViewDumpHelper = new WebViewDumpHelper();
  
  @Nullable
  private static AccessibilityNodeInfo createNodeInfoFromView(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    AccessibilityNodeInfo localAccessibilityNodeInfo = AccessibilityNodeInfo.obtain();
    try
    {
      paramView.onInitializeAccessibilityNodeInfo(localAccessibilityNodeInfo);
      return localAccessibilityNodeInfo;
    }
    catch (NullPointerException paramView)
    {
      if (localAccessibilityNodeInfo != null) {
        localAccessibilityNodeInfo.recycle();
      }
    }
    return null;
  }
  
  private void dumpViewHierarchy(String paramString, PrintWriter paramPrintWriter, @Nullable View paramView, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramPrintWriter.print(paramString);
    if (paramView == null)
    {
      paramPrintWriter.println("null");
      return;
    }
    paramPrintWriter.print(paramView.getClass().getName());
    paramPrintWriter.print("{");
    paramPrintWriter.print(Integer.toHexString(paramView.hashCode()));
    writeViewFlags(paramPrintWriter, paramView);
    writeViewBounds(paramPrintWriter, paramView, paramInt1, paramInt2);
    writeViewTestId(paramPrintWriter, paramView);
    writeViewText(paramPrintWriter, paramView);
    if (paramBoolean2) {
      Api21Utils.writeExtraProps(paramPrintWriter, paramView);
    }
    paramPrintWriter.println("}");
    if (isExtendsLithoView(paramView)) {
      writeLithoViewSubHierarchy(paramPrintWriter, paramView, paramString, paramBoolean2);
    }
    if ((paramBoolean1) && ((paramView instanceof WebView))) {
      mWebViewDumpHelper.handle((WebView)paramView);
    }
    if (!(paramView instanceof ViewGroup)) {
      return;
    }
    ViewGroup localViewGroup = (ViewGroup)paramView;
    paramInt2 = localViewGroup.getChildCount();
    if (paramInt2 <= 0) {
      return;
    }
    String str = z2.o(paramString, "  ");
    paramString = new int[2];
    paramView.getLocationOnScreen(paramString);
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
      dumpViewHierarchy(str, paramPrintWriter, localViewGroup.getChildAt(paramInt1), paramString[0], paramString[1], paramBoolean1, paramBoolean2);
    }
  }
  
  private void dumpViewHierarchy(String paramString, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("Top Level Window View Hierarchy:");
    boolean bool1 = hasArgument(paramArrayOfString, "all-roots");
    boolean bool2 = hasArgument(paramArrayOfString, "top-root");
    boolean bool3 = hasArgument(paramArrayOfString, "webview");
    boolean bool4 = hasArgument(paramArrayOfString, "props");
    try
    {
      Object localObject = mRootResolver.listActiveRoots();
      if ((localObject != null) && (!((List)localObject).isEmpty()))
      {
        Collections.reverse((List)localObject);
        paramArrayOfString = null;
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          AndroidRootResolver.Root localRoot = (AndroidRootResolver.Root)((Iterator)localObject).next();
          if (view.getVisibility() == 0)
          {
            if ((!bool1) && (paramArrayOfString != null) && (Math.abs(param.type - type) != 1)) {
              break;
            }
            paramArrayOfString = new java/lang/StringBuilder;
            paramArrayOfString.<init>();
            paramArrayOfString.append(paramString);
            paramArrayOfString.append("  ");
            dumpViewHierarchy(paramArrayOfString.toString(), paramPrintWriter, view, 0, 0, bool3, bool4);
            paramArrayOfString = param;
            if (bool2) {
              break;
            }
          }
        }
        mWebViewDumpHelper.dump(paramPrintWriter);
      }
      else {}
    }
    catch (Exception paramString)
    {
      paramArrayOfString = z2.t("Failure in view hierarchy dump: ");
      paramArrayOfString.append(paramString.getMessage());
      paramPrintWriter.println(paramArrayOfString.toString());
    }
  }
  
  private static String fixString(@Nullable CharSequence paramCharSequence, int paramInt)
  {
    String str1 = "";
    String str2 = str1;
    if (paramCharSequence != null) {
      if (paramCharSequence.length() < 1)
      {
        str2 = str1;
      }
      else
      {
        str1 = paramCharSequence.toString().replace(" \n", " ").replace("\n", " ").replace("\"", "");
        str2 = str1;
        if (paramCharSequence.length() > paramInt)
        {
          paramCharSequence = new StringBuilder();
          paramCharSequence.append(str1.substring(0, paramInt));
          paramCharSequence.append("...");
          str2 = paramCharSequence.toString();
        }
      }
    }
    return str2;
  }
  
  @SuppressLint({"PrivateApi", "ReflectionMethodUse"})
  @Nullable
  private static String getTextFromRcTextView(View paramView)
    throws NoSuchMethodException, IllegalAccessException, InvocationTargetException
  {
    if (sRcTextViewGetTextMethod == null) {
      sRcTextViewGetTextMethod = paramView.getClass().getDeclaredMethod("getText", new Class[0]);
    }
    paramView = sRcTextViewGetTextMethod.invoke(paramView, new Object[0]);
    if (paramView != null) {
      paramView = paramView.toString();
    } else {
      paramView = null;
    }
    return paramView;
  }
  
  private static boolean hasArgument(String[] paramArrayOfString, String paramString)
  {
    if (paramArrayOfString == null) {
      return false;
    }
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++) {
      if (paramString.equalsIgnoreCase(paramArrayOfString[j])) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean isExtendsLithoView(View paramView)
  {
    for (paramView = paramView.getClass(); paramView != null; paramView = paramView.getSuperclass()) {
      if (paramView.getName().equals("com.facebook.litho.LithoView")) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean maybeDump(String paramString, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0) && ("e2e".equals(paramArrayOfString[0])))
    {
      if (mInstance == null) {
        mInstance = new EndToEndDumpsysHelper();
      }
      mInstance.dumpViewHierarchy(paramString, paramPrintWriter, paramArrayOfString);
      return true;
    }
    return false;
  }
  
  private static void maybeWriteViewTestIdFromTag(PrintWriter paramPrintWriter, View paramView)
  {
    paramView = paramView.getTag();
    if (!(paramView instanceof String)) {
      return;
    }
    paramView = (String)paramView;
    if (paramView.length() <= 0) {
      return;
    }
    paramPrintWriter.print(" app:tag/");
    paramPrintWriter.print(fixString(paramView, 60));
  }
  
  private void writeLithoViewSubHierarchy(PrintWriter paramPrintWriter, View paramView, String paramString, boolean paramBoolean)
  {
    try
    {
      if (mLithoViewToStringMethod == null) {
        mLithoViewToStringMethod = Class.forName("com.facebook.litho.LithoViewTestHelper").getDeclaredMethod("viewToStringForE2E", new Class[] { View.class, Integer.TYPE, Boolean.TYPE });
      }
      paramPrintWriter.append((String)mLithoViewToStringMethod.invoke(null, new Object[] { paramView, Integer.valueOf(paramString.length() / 2 + 1), Boolean.valueOf(paramBoolean) }));
    }
    catch (Exception paramView)
    {
      paramPrintWriter.append(paramString).append("Failed litho view sub hierarch dump: ").append(fixString(paramView.getMessage(), 100)).println();
    }
  }
  
  private static void writeViewBounds(PrintWriter paramPrintWriter, View paramView, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    paramPrintWriter.print(" ");
    paramPrintWriter.print(arrayOfInt[0] - paramInt1);
    paramPrintWriter.print(",");
    paramPrintWriter.print(arrayOfInt[1] - paramInt2);
    paramPrintWriter.print("-");
    int i = arrayOfInt[0];
    paramPrintWriter.print(paramView.getWidth() + i - paramInt1);
    paramPrintWriter.print(",");
    paramInt1 = arrayOfInt[1];
    paramPrintWriter.print(paramView.getHeight() + paramInt1 - paramInt2);
  }
  
  private static void writeViewFlags(PrintWriter paramPrintWriter, View paramView)
  {
    paramPrintWriter.print(" ");
    int i = paramView.getVisibility();
    String str1 = "V";
    String str2 = ".";
    if (i != 0)
    {
      if (i != 4)
      {
        if (i != 8) {
          paramPrintWriter.print(".");
        } else {
          paramPrintWriter.print("G");
        }
      }
      else {
        paramPrintWriter.print("I");
      }
    }
    else {
      paramPrintWriter.print("V");
    }
    boolean bool = paramView.isFocusable();
    String str3 = "F";
    if (bool) {
      localObject = "F";
    } else {
      localObject = ".";
    }
    paramPrintWriter.print((String)localObject);
    if (paramView.isEnabled()) {
      localObject = "E";
    } else {
      localObject = ".";
    }
    paramPrintWriter.print((String)localObject);
    paramPrintWriter.print(".");
    bool = paramView.isHorizontalScrollBarEnabled();
    String str4 = "H";
    if (bool) {
      localObject = "H";
    } else {
      localObject = ".";
    }
    paramPrintWriter.print((String)localObject);
    if (paramView.isVerticalScrollBarEnabled()) {
      localObject = str1;
    } else {
      localObject = ".";
    }
    paramPrintWriter.print((String)localObject);
    if (paramView.isClickable()) {
      localObject = "C";
    } else {
      localObject = ".";
    }
    paramPrintWriter.print((String)localObject);
    if (paramView.isLongClickable()) {
      localObject = "L";
    } else {
      localObject = ".";
    }
    paramPrintWriter.print((String)localObject);
    paramPrintWriter.print(" ");
    if (paramView.isFocused()) {
      localObject = str3;
    } else {
      localObject = ".";
    }
    paramPrintWriter.print((String)localObject);
    if (paramView.isSelected()) {
      localObject = "S";
    } else {
      localObject = ".";
    }
    paramPrintWriter.print((String)localObject);
    if (paramView.isHovered()) {
      localObject = str4;
    } else {
      localObject = ".";
    }
    paramPrintWriter.print((String)localObject);
    if (paramView.isActivated()) {
      localObject = "A";
    } else {
      localObject = ".";
    }
    paramPrintWriter.print((String)localObject);
    Object localObject = str2;
    if (paramView.isDirty()) {
      localObject = "D";
    }
    paramPrintWriter.print((String)localObject);
  }
  
  private static void writeViewTestId(PrintWriter paramPrintWriter, View paramView)
  {
    try
    {
      int i = paramView.getId();
      if (i == -1)
      {
        maybeWriteViewTestIdFromTag(paramPrintWriter, paramView);
        return;
      }
      paramPrintWriter.append(" #");
      paramPrintWriter.append(Integer.toHexString(i));
      Resources localResources = paramView.getResources();
      if ((i > 0) && (localResources != null))
      {
        int j = 0xFF000000 & i;
        String str;
        if (j != 16777216)
        {
          if (j != 2130706432) {
            str = localResources.getResourcePackageName(i);
          } else {
            str = "app";
          }
        }
        else {
          str = "android";
        }
        paramPrintWriter.print(" ");
        paramPrintWriter.print(str);
        paramPrintWriter.print(":");
        paramPrintWriter.print(localResources.getResourceTypeName(i));
        paramPrintWriter.print("/");
        paramPrintWriter.print(localResources.getResourceEntryName(i));
      }
      else
      {
        maybeWriteViewTestIdFromTag(paramPrintWriter, paramView);
        return;
      }
    }
    catch (Exception localException)
    {
      maybeWriteViewTestIdFromTag(paramPrintWriter, paramView);
    }
  }
  
  @SuppressLint({"ReflectionMethodUse"})
  private static void writeViewText(PrintWriter paramPrintWriter, View paramView)
  {
    String str = null;
    try
    {
      if ((paramView instanceof TextView))
      {
        paramView = ((TextView)paramView).getText().toString();
      }
      else if (paramView.getClass().getSimpleName().equals("RCTextView"))
      {
        paramView = getTextFromRcTextView(paramView);
      }
      else
      {
        CharSequence localCharSequence = paramView.getContentDescription();
        if (localCharSequence != null) {
          str = localCharSequence.toString();
        }
        if ((str == null) || (str.isEmpty()))
        {
          paramView = paramView.getTag();
          if (paramView != null)
          {
            paramView = paramView.toString().trim();
            break label97;
          }
        }
        paramView = str;
      }
      label97:
      if ((paramView != null) && (!paramView.isEmpty()))
      {
        paramPrintWriter.print(" text=\"");
        paramPrintWriter.print(fixString(paramView, 600));
        paramPrintWriter.print("\"");
      }
      return;
    }
    catch (Exception paramPrintWriter)
    {
      for (;;) {}
    }
  }
  
  public static class Api21Utils
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
  
  public static class Api24Utils
  {
    public static void addExtraProps(JSONObject paramJSONObject, AccessibilityNodeInfo paramAccessibilityNodeInfo)
      throws JSONException
    {
      paramJSONObject.put("context-clickable", paramAccessibilityNodeInfo.isContextClickable()).put("drawing-order", paramAccessibilityNodeInfo.getDrawingOrder()).put("important-for-accessibility", paramAccessibilityNodeInfo.isImportantForAccessibility());
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.core.internal.logging.dumpsys.EndToEndDumpsysHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
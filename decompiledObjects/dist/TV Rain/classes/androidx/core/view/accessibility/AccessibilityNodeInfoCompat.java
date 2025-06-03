package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo;
import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;
import android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R.id;
import androidx.core.os.BuildCompat;
import androidx.core.os.BuildCompat.PrereleaseSdkCheck;
import b;
import c;
import d;
import e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AccessibilityNodeInfoCompat
{
  public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
  public static final String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
  public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
  public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
  public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
  public static final String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
  public static final String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
  @SuppressLint({"ActionValue"})
  public static final String ACTION_ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
  public static final String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
  public static final String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
  public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
  public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
  public static final String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
  public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
  public static final int ACTION_CLEAR_FOCUS = 2;
  public static final int ACTION_CLEAR_SELECTION = 8;
  public static final int ACTION_CLICK = 16;
  public static final int ACTION_COLLAPSE = 524288;
  public static final int ACTION_COPY = 16384;
  public static final int ACTION_CUT = 65536;
  public static final int ACTION_DISMISS = 1048576;
  public static final int ACTION_EXPAND = 262144;
  public static final int ACTION_FOCUS = 1;
  public static final int ACTION_LONG_CLICK = 32;
  public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
  public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
  public static final int ACTION_PASTE = 32768;
  public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
  public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
  public static final int ACTION_SCROLL_BACKWARD = 8192;
  public static final int ACTION_SCROLL_FORWARD = 4096;
  public static final int ACTION_SELECT = 4;
  public static final int ACTION_SET_SELECTION = 131072;
  public static final int ACTION_SET_TEXT = 2097152;
  private static final int BOOLEAN_PROPERTY_IS_HEADING = 2;
  private static final int BOOLEAN_PROPERTY_IS_SHOWING_HINT = 4;
  private static final int BOOLEAN_PROPERTY_IS_TEXT_ENTRY_KEY = 8;
  private static final String BOOLEAN_PROPERTY_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
  private static final int BOOLEAN_PROPERTY_SCREEN_READER_FOCUSABLE = 1;
  public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
  public static final int EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH = 20000;
  public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
  public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
  public static final int FOCUS_ACCESSIBILITY = 2;
  public static final int FOCUS_INPUT = 1;
  private static final String HINT_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";
  public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
  public static final int MOVEMENT_GRANULARITY_LINE = 4;
  public static final int MOVEMENT_GRANULARITY_PAGE = 16;
  public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
  public static final int MOVEMENT_GRANULARITY_WORD = 2;
  private static final String PANE_TITLE_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
  private static final String ROLE_DESCRIPTION_KEY = "AccessibilityNodeInfo.roleDescription";
  private static final String SPANS_ACTION_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";
  private static final String SPANS_END_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";
  private static final String SPANS_FLAGS_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";
  private static final String SPANS_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";
  private static final String SPANS_START_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
  private static final String STATE_DESCRIPTION_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";
  private static final String TOOLTIP_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";
  private static final String UNIQUE_ID_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";
  private static int sClickableSpanId;
  private final AccessibilityNodeInfo mInfo;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int mParentVirtualDescendantId = -1;
  private int mVirtualDescendantId = -1;
  
  private AccessibilityNodeInfoCompat(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    mInfo = paramAccessibilityNodeInfo;
  }
  
  @Deprecated
  public AccessibilityNodeInfoCompat(Object paramObject)
  {
    mInfo = ((AccessibilityNodeInfo)paramObject);
  }
  
  private void addSpanLocationToExtras(ClickableSpan paramClickableSpan, Spanned paramSpanned, int paramInt)
  {
    extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(paramSpanned.getSpanStart(paramClickableSpan)));
    extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(paramSpanned.getSpanEnd(paramClickableSpan)));
    extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(paramSpanned.getSpanFlags(paramClickableSpan)));
    extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(paramInt));
  }
  
  private void clearExtrasSpans()
  {
    mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
    mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
    mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
    mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
  }
  
  private List<Integer> extrasIntList(String paramString)
  {
    ArrayList localArrayList1 = mInfo.getExtras().getIntegerArrayList(paramString);
    ArrayList localArrayList2 = localArrayList1;
    if (localArrayList1 == null)
    {
      localArrayList2 = new ArrayList();
      mInfo.getExtras().putIntegerArrayList(paramString, localArrayList2);
    }
    return localArrayList2;
  }
  
  private static String getActionSymbolicName(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            switch (paramInt)
            {
            default: 
              switch (paramInt)
              {
              default: 
                return "ACTION_UNKNOWN";
              case 16908375: 
                return "ACTION_DRAG_CANCEL";
              case 16908374: 
                return "ACTION_DRAG_DROP";
              case 16908373: 
                return "ACTION_DRAG_START";
              }
              return "ACTION_IME_ENTER";
            case 16908362: 
              return "ACTION_PRESS_AND_HOLD";
            case 16908361: 
              return "ACTION_PAGE_RIGHT";
            case 16908360: 
              return "ACTION_PAGE_LEFT";
            case 16908359: 
              return "ACTION_PAGE_DOWN";
            case 16908358: 
              return "ACTION_PAGE_UP";
            case 16908357: 
              return "ACTION_HIDE_TOOLTIP";
            }
            return "ACTION_SHOW_TOOLTIP";
          case 16908349: 
            return "ACTION_SET_PROGRESS";
          case 16908348: 
            return "ACTION_CONTEXT_CLICK";
          case 16908347: 
            return "ACTION_SCROLL_RIGHT";
          case 16908346: 
            return "ACTION_SCROLL_DOWN";
          case 16908345: 
            return "ACTION_SCROLL_LEFT";
          case 16908344: 
            return "ACTION_SCROLL_UP";
          case 16908343: 
            return "ACTION_SCROLL_TO_POSITION";
          }
          return "ACTION_SHOW_ON_SCREEN";
        case 16908354: 
          return "ACTION_MOVE_WINDOW";
        case 2097152: 
          return "ACTION_SET_TEXT";
        case 524288: 
          return "ACTION_COLLAPSE";
        case 262144: 
          return "ACTION_EXPAND";
        case 131072: 
          return "ACTION_SET_SELECTION";
        case 65536: 
          return "ACTION_CUT";
        case 32768: 
          return "ACTION_PASTE";
        case 16384: 
          return "ACTION_COPY";
        case 8192: 
          return "ACTION_SCROLL_BACKWARD";
        case 4096: 
          return "ACTION_SCROLL_FORWARD";
        case 2048: 
          return "ACTION_PREVIOUS_HTML_ELEMENT";
        case 1024: 
          return "ACTION_NEXT_HTML_ELEMENT";
        case 512: 
          return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        case 256: 
          return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        case 128: 
          return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        case 64: 
          return "ACTION_ACCESSIBILITY_FOCUS";
        case 32: 
          return "ACTION_LONG_CLICK";
        case 16: 
          return "ACTION_CLICK";
        case 8: 
          return "ACTION_CLEAR_SELECTION";
        }
        return "ACTION_SELECT";
      }
      return "ACTION_CLEAR_FOCUS";
    }
    return "ACTION_FOCUS";
  }
  
  private boolean getBooleanProperty(int paramInt)
  {
    Bundle localBundle = getExtras();
    boolean bool = false;
    if (localBundle == null) {
      return false;
    }
    if ((localBundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & paramInt) == paramInt) {
      bool = true;
    }
    return bool;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static ClickableSpan[] getClickableSpans(CharSequence paramCharSequence)
  {
    if ((paramCharSequence instanceof Spanned)) {
      return (ClickableSpan[])((Spanned)paramCharSequence).getSpans(0, paramCharSequence.length(), ClickableSpan.class);
    }
    return null;
  }
  
  private SparseArray<WeakReference<ClickableSpan>> getOrCreateSpansFromViewTags(View paramView)
  {
    SparseArray localSparseArray1 = getSpansFromViewTags(paramView);
    SparseArray localSparseArray2 = localSparseArray1;
    if (localSparseArray1 == null)
    {
      localSparseArray2 = new SparseArray();
      paramView.setTag(R.id.tag_accessibility_clickable_spans, localSparseArray2);
    }
    return localSparseArray2;
  }
  
  private SparseArray<WeakReference<ClickableSpan>> getSpansFromViewTags(View paramView)
  {
    return (SparseArray)paramView.getTag(R.id.tag_accessibility_clickable_spans);
  }
  
  private boolean hasSpans()
  {
    return extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty() ^ true;
  }
  
  private int idForClickableSpan(ClickableSpan paramClickableSpan, SparseArray<WeakReference<ClickableSpan>> paramSparseArray)
  {
    if (paramSparseArray != null) {
      for (i = 0; i < paramSparseArray.size(); i++) {
        if (paramClickableSpan.equals((ClickableSpan)((WeakReference)paramSparseArray.valueAt(i)).get())) {
          return paramSparseArray.keyAt(i);
        }
      }
    }
    int i = sClickableSpanId;
    sClickableSpanId = i + 1;
    return i;
  }
  
  public static AccessibilityNodeInfoCompat obtain()
  {
    return wrap(AccessibilityNodeInfo.obtain());
  }
  
  public static AccessibilityNodeInfoCompat obtain(View paramView)
  {
    return wrap(AccessibilityNodeInfo.obtain(paramView));
  }
  
  public static AccessibilityNodeInfoCompat obtain(View paramView, int paramInt)
  {
    return wrapNonNullInstance(AccessibilityNodeInfo.obtain(paramView, paramInt));
  }
  
  public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    return wrap(AccessibilityNodeInfo.obtain(mInfo));
  }
  
  private void removeCollectedSpans(View paramView)
  {
    paramView = getSpansFromViewTags(paramView);
    if (paramView != null)
    {
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      int k;
      for (int j = 0;; j++)
      {
        k = i;
        if (j >= paramView.size()) {
          break;
        }
        if (((WeakReference)paramView.valueAt(j)).get() == null) {
          localArrayList.add(Integer.valueOf(j));
        }
      }
      while (k < localArrayList.size())
      {
        paramView.remove(((Integer)localArrayList.get(k)).intValue());
        k++;
      }
    }
  }
  
  private void setBooleanProperty(int paramInt, boolean paramBoolean)
  {
    Bundle localBundle = getExtras();
    if (localBundle != null)
    {
      int i = localBundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
      int j;
      if (paramBoolean) {
        j = paramInt;
      } else {
        j = 0;
      }
      localBundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", j | i & paramInt);
    }
  }
  
  public static AccessibilityNodeInfoCompat wrap(@NonNull AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return new AccessibilityNodeInfoCompat(paramAccessibilityNodeInfo);
  }
  
  public static AccessibilityNodeInfoCompat wrapNonNullInstance(Object paramObject)
  {
    if (paramObject != null) {
      return new AccessibilityNodeInfoCompat(paramObject);
    }
    return null;
  }
  
  public void addAction(int paramInt)
  {
    mInfo.addAction(paramInt);
  }
  
  public void addAction(AccessibilityActionCompat paramAccessibilityActionCompat)
  {
    mInfo.addAction((AccessibilityNodeInfo.AccessibilityAction)mAction);
  }
  
  public void addChild(View paramView)
  {
    mInfo.addChild(paramView);
  }
  
  public void addChild(View paramView, int paramInt)
  {
    mInfo.addChild(paramView, paramInt);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void addSpansToExtras(CharSequence paramCharSequence, View paramView)
  {
    if (Build.VERSION.SDK_INT < 26)
    {
      clearExtrasSpans();
      removeCollectedSpans(paramView);
      ClickableSpan[] arrayOfClickableSpan = getClickableSpans(paramCharSequence);
      if ((arrayOfClickableSpan != null) && (arrayOfClickableSpan.length > 0))
      {
        getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
        paramView = getOrCreateSpansFromViewTags(paramView);
        for (int i = 0; i < arrayOfClickableSpan.length; i++)
        {
          int j = idForClickableSpan(arrayOfClickableSpan[i], paramView);
          paramView.put(j, new WeakReference(arrayOfClickableSpan[i]));
          addSpanLocationToExtras(arrayOfClickableSpan[i], (Spanned)paramCharSequence, j);
        }
      }
    }
  }
  
  public boolean canOpenPopup()
  {
    return mInfo.canOpenPopup();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof AccessibilityNodeInfoCompat)) {
      return false;
    }
    paramObject = (AccessibilityNodeInfoCompat)paramObject;
    AccessibilityNodeInfo localAccessibilityNodeInfo = mInfo;
    if (localAccessibilityNodeInfo == null)
    {
      if (mInfo != null) {
        return false;
      }
    }
    else if (!localAccessibilityNodeInfo.equals(mInfo)) {
      return false;
    }
    if (mVirtualDescendantId != mVirtualDescendantId) {
      return false;
    }
    return mParentVirtualDescendantId == mParentVirtualDescendantId;
  }
  
  public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = mInfo.findAccessibilityNodeInfosByText(paramString);
    int i = paramString.size();
    for (int j = 0; j < i; j++) {
      localArrayList.add(wrap((AccessibilityNodeInfo)paramString.get(j)));
    }
    return localArrayList;
  }
  
  public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByViewId(String paramString)
  {
    Object localObject = mInfo.findAccessibilityNodeInfosByViewId(paramString);
    paramString = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramString.add(wrap((AccessibilityNodeInfo)((Iterator)localObject).next()));
    }
    return paramString;
  }
  
  public AccessibilityNodeInfoCompat findFocus(int paramInt)
  {
    return wrapNonNullInstance(mInfo.findFocus(paramInt));
  }
  
  public AccessibilityNodeInfoCompat focusSearch(int paramInt)
  {
    return wrapNonNullInstance(mInfo.focusSearch(paramInt));
  }
  
  public List<AccessibilityActionCompat> getActionList()
  {
    List localList = mInfo.getActionList();
    if (localList != null)
    {
      ArrayList localArrayList = new ArrayList();
      int i = localList.size();
      for (int j = 0; j < i; j++) {
        localArrayList.add(new AccessibilityActionCompat(localList.get(j)));
      }
      return localArrayList;
    }
    return Collections.emptyList();
  }
  
  @Deprecated
  public int getActions()
  {
    return mInfo.getActions();
  }
  
  @NonNull
  public List<String> getAvailableExtraData()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return b.n(mInfo);
    }
    return Collections.emptyList();
  }
  
  @Deprecated
  public void getBoundsInParent(Rect paramRect)
  {
    mInfo.getBoundsInParent(paramRect);
  }
  
  public void getBoundsInScreen(Rect paramRect)
  {
    mInfo.getBoundsInScreen(paramRect);
  }
  
  public AccessibilityNodeInfoCompat getChild(int paramInt)
  {
    return wrapNonNullInstance(mInfo.getChild(paramInt));
  }
  
  public int getChildCount()
  {
    return mInfo.getChildCount();
  }
  
  public CharSequence getClassName()
  {
    return mInfo.getClassName();
  }
  
  public CollectionInfoCompat getCollectionInfo()
  {
    AccessibilityNodeInfo.CollectionInfo localCollectionInfo = mInfo.getCollectionInfo();
    if (localCollectionInfo != null) {
      return new CollectionInfoCompat(localCollectionInfo);
    }
    return null;
  }
  
  public CollectionItemInfoCompat getCollectionItemInfo()
  {
    AccessibilityNodeInfo.CollectionItemInfo localCollectionItemInfo = mInfo.getCollectionItemInfo();
    if (localCollectionItemInfo != null) {
      return new CollectionItemInfoCompat(localCollectionItemInfo);
    }
    return null;
  }
  
  public CharSequence getContentDescription()
  {
    return mInfo.getContentDescription();
  }
  
  public int getDrawingOrder()
  {
    return mInfo.getDrawingOrder();
  }
  
  public CharSequence getError()
  {
    return mInfo.getError();
  }
  
  @Nullable
  public AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo()
  {
    if (Build.VERSION.SDK_INT >= 33) {
      return Api33Impl.getExtraRenderingInfo(mInfo);
    }
    return null;
  }
  
  public Bundle getExtras()
  {
    return mInfo.getExtras();
  }
  
  @Nullable
  public CharSequence getHintText()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return b.m(mInfo);
    }
    return mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
  }
  
  @Deprecated
  public Object getInfo()
  {
    return mInfo;
  }
  
  public int getInputType()
  {
    return mInfo.getInputType();
  }
  
  public AccessibilityNodeInfoCompat getLabelFor()
  {
    return wrapNonNullInstance(mInfo.getLabelFor());
  }
  
  public AccessibilityNodeInfoCompat getLabeledBy()
  {
    return wrapNonNullInstance(mInfo.getLabeledBy());
  }
  
  public int getLiveRegion()
  {
    return mInfo.getLiveRegion();
  }
  
  public int getMaxTextLength()
  {
    return mInfo.getMaxTextLength();
  }
  
  public int getMovementGranularities()
  {
    return mInfo.getMovementGranularities();
  }
  
  public CharSequence getPackageName()
  {
    return mInfo.getPackageName();
  }
  
  @Nullable
  public CharSequence getPaneTitle()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return c.x(mInfo);
    }
    return mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY");
  }
  
  public AccessibilityNodeInfoCompat getParent()
  {
    return wrapNonNullInstance(mInfo.getParent());
  }
  
  public RangeInfoCompat getRangeInfo()
  {
    AccessibilityNodeInfo.RangeInfo localRangeInfo = mInfo.getRangeInfo();
    if (localRangeInfo != null) {
      return new RangeInfoCompat(localRangeInfo);
    }
    return null;
  }
  
  @Nullable
  public CharSequence getRoleDescription()
  {
    return mInfo.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
  }
  
  @Nullable
  public CharSequence getStateDescription()
  {
    if (BuildCompat.isAtLeastR()) {
      return d.i(mInfo);
    }
    return mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
  }
  
  public CharSequence getText()
  {
    if (hasSpans())
    {
      List localList1 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
      List localList2 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
      List localList3 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
      List localList4 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
      Object localObject = mInfo.getText();
      int i = mInfo.getText().length();
      int j = 0;
      localObject = new SpannableString(TextUtils.substring((CharSequence)localObject, 0, i));
      while (j < localList1.size())
      {
        ((SpannableString)localObject).setSpan(new AccessibilityClickableSpanCompat(((Integer)localList4.get(j)).intValue(), this, getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer)localList1.get(j)).intValue(), ((Integer)localList2.get(j)).intValue(), ((Integer)localList3.get(j)).intValue());
        j++;
      }
      return (CharSequence)localObject;
    }
    return mInfo.getText();
  }
  
  public int getTextSelectionEnd()
  {
    return mInfo.getTextSelectionEnd();
  }
  
  public int getTextSelectionStart()
  {
    return mInfo.getTextSelectionStart();
  }
  
  @Nullable
  public CharSequence getTooltipText()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return c.k(mInfo);
    }
    return mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
  }
  
  @Nullable
  public TouchDelegateInfoCompat getTouchDelegateInfo()
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      AccessibilityNodeInfo.TouchDelegateInfo localTouchDelegateInfo = e.h(mInfo);
      if (localTouchDelegateInfo != null) {
        return new TouchDelegateInfoCompat(localTouchDelegateInfo);
      }
    }
    return null;
  }
  
  public AccessibilityNodeInfoCompat getTraversalAfter()
  {
    return wrapNonNullInstance(mInfo.getTraversalAfter());
  }
  
  public AccessibilityNodeInfoCompat getTraversalBefore()
  {
    return wrapNonNullInstance(mInfo.getTraversalBefore());
  }
  
  @Nullable
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public String getUniqueId()
  {
    if (BuildCompat.isAtLeastT()) {
      return mInfo.getUniqueId();
    }
    return mInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
  }
  
  public String getViewIdResourceName()
  {
    return mInfo.getViewIdResourceName();
  }
  
  public AccessibilityWindowInfoCompat getWindow()
  {
    return AccessibilityWindowInfoCompat.wrapNonNullInstance(mInfo.getWindow());
  }
  
  public int getWindowId()
  {
    return mInfo.getWindowId();
  }
  
  public int hashCode()
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = mInfo;
    int i;
    if (localAccessibilityNodeInfo == null) {
      i = 0;
    } else {
      i = localAccessibilityNodeInfo.hashCode();
    }
    return i;
  }
  
  public boolean isAccessibilityFocused()
  {
    return mInfo.isAccessibilityFocused();
  }
  
  public boolean isCheckable()
  {
    return mInfo.isCheckable();
  }
  
  public boolean isChecked()
  {
    return mInfo.isChecked();
  }
  
  public boolean isClickable()
  {
    return mInfo.isClickable();
  }
  
  public boolean isContentInvalid()
  {
    return mInfo.isContentInvalid();
  }
  
  public boolean isContextClickable()
  {
    return mInfo.isContextClickable();
  }
  
  public boolean isDismissable()
  {
    return mInfo.isDismissable();
  }
  
  public boolean isEditable()
  {
    return mInfo.isEditable();
  }
  
  public boolean isEnabled()
  {
    return mInfo.isEnabled();
  }
  
  public boolean isFocusable()
  {
    return mInfo.isFocusable();
  }
  
  public boolean isFocused()
  {
    return mInfo.isFocused();
  }
  
  public boolean isHeading()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return c.D(mInfo);
    }
    boolean bool1 = getBooleanProperty(2);
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    CollectionItemInfoCompat localCollectionItemInfoCompat = getCollectionItemInfo();
    if ((localCollectionItemInfoCompat == null) || (!localCollectionItemInfoCompat.isHeading())) {
      bool2 = false;
    }
    return bool2;
  }
  
  public boolean isImportantForAccessibility()
  {
    return mInfo.isImportantForAccessibility();
  }
  
  public boolean isLongClickable()
  {
    return mInfo.isLongClickable();
  }
  
  public boolean isMultiLine()
  {
    return mInfo.isMultiLine();
  }
  
  public boolean isPassword()
  {
    return mInfo.isPassword();
  }
  
  public boolean isScreenReaderFocusable()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return c.v(mInfo);
    }
    return getBooleanProperty(1);
  }
  
  public boolean isScrollable()
  {
    return mInfo.isScrollable();
  }
  
  public boolean isSelected()
  {
    return mInfo.isSelected();
  }
  
  public boolean isShowingHintText()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return b.u(mInfo);
    }
    return getBooleanProperty(4);
  }
  
  public boolean isTextEntryKey()
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return e.z(mInfo);
    }
    return getBooleanProperty(8);
  }
  
  public boolean isTextSelectable()
  {
    if (Build.VERSION.SDK_INT >= 33) {
      return Api33Impl.isTextSelectable(mInfo);
    }
    return false;
  }
  
  public boolean isVisibleToUser()
  {
    return mInfo.isVisibleToUser();
  }
  
  public boolean performAction(int paramInt)
  {
    return mInfo.performAction(paramInt);
  }
  
  public boolean performAction(int paramInt, Bundle paramBundle)
  {
    return mInfo.performAction(paramInt, paramBundle);
  }
  
  public void recycle()
  {
    mInfo.recycle();
  }
  
  public boolean refresh()
  {
    return mInfo.refresh();
  }
  
  public boolean removeAction(AccessibilityActionCompat paramAccessibilityActionCompat)
  {
    return mInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction)mAction);
  }
  
  public boolean removeChild(View paramView)
  {
    return mInfo.removeChild(paramView);
  }
  
  public boolean removeChild(View paramView, int paramInt)
  {
    return mInfo.removeChild(paramView, paramInt);
  }
  
  public void setAccessibilityFocused(boolean paramBoolean)
  {
    mInfo.setAccessibilityFocused(paramBoolean);
  }
  
  public void setAvailableExtraData(@NonNull List<String> paramList)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      b.p(mInfo, paramList);
    }
  }
  
  @Deprecated
  public void setBoundsInParent(Rect paramRect)
  {
    mInfo.setBoundsInParent(paramRect);
  }
  
  public void setBoundsInScreen(Rect paramRect)
  {
    mInfo.setBoundsInScreen(paramRect);
  }
  
  public void setCanOpenPopup(boolean paramBoolean)
  {
    mInfo.setCanOpenPopup(paramBoolean);
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    mInfo.setCheckable(paramBoolean);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    mInfo.setChecked(paramBoolean);
  }
  
  public void setClassName(CharSequence paramCharSequence)
  {
    mInfo.setClassName(paramCharSequence);
  }
  
  public void setClickable(boolean paramBoolean)
  {
    mInfo.setClickable(paramBoolean);
  }
  
  public void setCollectionInfo(Object paramObject)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = mInfo;
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = (AccessibilityNodeInfo.CollectionInfo)mInfo;
    }
    localAccessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)paramObject);
  }
  
  public void setCollectionItemInfo(Object paramObject)
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = mInfo;
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = (AccessibilityNodeInfo.CollectionItemInfo)mInfo;
    }
    localAccessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)paramObject);
  }
  
  public void setContentDescription(CharSequence paramCharSequence)
  {
    mInfo.setContentDescription(paramCharSequence);
  }
  
  public void setContentInvalid(boolean paramBoolean)
  {
    mInfo.setContentInvalid(paramBoolean);
  }
  
  public void setContextClickable(boolean paramBoolean)
  {
    mInfo.setContextClickable(paramBoolean);
  }
  
  public void setDismissable(boolean paramBoolean)
  {
    mInfo.setDismissable(paramBoolean);
  }
  
  public void setDrawingOrder(int paramInt)
  {
    mInfo.setDrawingOrder(paramInt);
  }
  
  public void setEditable(boolean paramBoolean)
  {
    mInfo.setEditable(paramBoolean);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    mInfo.setEnabled(paramBoolean);
  }
  
  public void setError(CharSequence paramCharSequence)
  {
    mInfo.setError(paramCharSequence);
  }
  
  public void setFocusable(boolean paramBoolean)
  {
    mInfo.setFocusable(paramBoolean);
  }
  
  public void setFocused(boolean paramBoolean)
  {
    mInfo.setFocused(paramBoolean);
  }
  
  public void setHeading(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      c.s(mInfo, paramBoolean);
    } else {
      setBooleanProperty(2, paramBoolean);
    }
  }
  
  public void setHintText(@Nullable CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      b.o(mInfo, paramCharSequence);
    } else {
      mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", paramCharSequence);
    }
  }
  
  public void setImportantForAccessibility(boolean paramBoolean)
  {
    mInfo.setImportantForAccessibility(paramBoolean);
  }
  
  public void setInputType(int paramInt)
  {
    mInfo.setInputType(paramInt);
  }
  
  public void setLabelFor(View paramView)
  {
    mInfo.setLabelFor(paramView);
  }
  
  public void setLabelFor(View paramView, int paramInt)
  {
    mInfo.setLabelFor(paramView, paramInt);
  }
  
  public void setLabeledBy(View paramView)
  {
    mInfo.setLabeledBy(paramView);
  }
  
  public void setLabeledBy(View paramView, int paramInt)
  {
    mInfo.setLabeledBy(paramView, paramInt);
  }
  
  public void setLiveRegion(int paramInt)
  {
    mInfo.setLiveRegion(paramInt);
  }
  
  public void setLongClickable(boolean paramBoolean)
  {
    mInfo.setLongClickable(paramBoolean);
  }
  
  public void setMaxTextLength(int paramInt)
  {
    mInfo.setMaxTextLength(paramInt);
  }
  
  public void setMovementGranularities(int paramInt)
  {
    mInfo.setMovementGranularities(paramInt);
  }
  
  public void setMultiLine(boolean paramBoolean)
  {
    mInfo.setMultiLine(paramBoolean);
  }
  
  public void setPackageName(CharSequence paramCharSequence)
  {
    mInfo.setPackageName(paramCharSequence);
  }
  
  public void setPaneTitle(@Nullable CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      c.r(mInfo, paramCharSequence);
    } else {
      mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", paramCharSequence);
    }
  }
  
  public void setParent(View paramView)
  {
    mParentVirtualDescendantId = -1;
    mInfo.setParent(paramView);
  }
  
  public void setParent(View paramView, int paramInt)
  {
    mParentVirtualDescendantId = paramInt;
    mInfo.setParent(paramView, paramInt);
  }
  
  public void setPassword(boolean paramBoolean)
  {
    mInfo.setPassword(paramBoolean);
  }
  
  public void setRangeInfo(RangeInfoCompat paramRangeInfoCompat)
  {
    mInfo.setRangeInfo((AccessibilityNodeInfo.RangeInfo)mInfo);
  }
  
  public void setRoleDescription(@Nullable CharSequence paramCharSequence)
  {
    mInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", paramCharSequence);
  }
  
  public void setScreenReaderFocusable(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      c.C(mInfo, paramBoolean);
    } else {
      setBooleanProperty(1, paramBoolean);
    }
  }
  
  public void setScrollable(boolean paramBoolean)
  {
    mInfo.setScrollable(paramBoolean);
  }
  
  public void setSelected(boolean paramBoolean)
  {
    mInfo.setSelected(paramBoolean);
  }
  
  public void setShowingHintText(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      b.q(mInfo, paramBoolean);
    } else {
      setBooleanProperty(4, paramBoolean);
    }
  }
  
  public void setSource(View paramView)
  {
    mVirtualDescendantId = -1;
    mInfo.setSource(paramView);
  }
  
  public void setSource(View paramView, int paramInt)
  {
    mVirtualDescendantId = paramInt;
    mInfo.setSource(paramView, paramInt);
  }
  
  public void setStateDescription(@Nullable CharSequence paramCharSequence)
  {
    if (BuildCompat.isAtLeastR()) {
      d.t(mInfo, paramCharSequence);
    } else {
      mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", paramCharSequence);
    }
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    mInfo.setText(paramCharSequence);
  }
  
  public void setTextEntryKey(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      e.p(mInfo, paramBoolean);
    } else {
      setBooleanProperty(8, paramBoolean);
    }
  }
  
  public void setTextSelectable(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 33) {
      Api33Impl.setTextSelectable(mInfo, paramBoolean);
    }
  }
  
  public void setTextSelection(int paramInt1, int paramInt2)
  {
    mInfo.setTextSelection(paramInt1, paramInt2);
  }
  
  public void setTooltipText(@Nullable CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      c.B(mInfo, paramCharSequence);
    } else {
      mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", paramCharSequence);
    }
  }
  
  public void setTouchDelegateInfo(@NonNull TouchDelegateInfoCompat paramTouchDelegateInfoCompat)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      e.o(mInfo, mInfo);
    }
  }
  
  public void setTraversalAfter(View paramView)
  {
    mInfo.setTraversalAfter(paramView);
  }
  
  public void setTraversalAfter(View paramView, int paramInt)
  {
    mInfo.setTraversalAfter(paramView, paramInt);
  }
  
  public void setTraversalBefore(View paramView)
  {
    mInfo.setTraversalBefore(paramView);
  }
  
  public void setTraversalBefore(View paramView, int paramInt)
  {
    mInfo.setTraversalBefore(paramView, paramInt);
  }
  
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  public void setUniqueId(@Nullable String paramString)
  {
    if (BuildCompat.isAtLeastT()) {
      mInfo.setUniqueId(paramString);
    } else {
      mInfo.getExtras().putString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY", paramString);
    }
  }
  
  public void setViewIdResourceName(String paramString)
  {
    mInfo.setViewIdResourceName(paramString);
  }
  
  public void setVisibleToUser(boolean paramBoolean)
  {
    mInfo.setVisibleToUser(paramBoolean);
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    Object localObject1 = new Rect();
    getBoundsInParent((Rect)localObject1);
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("; boundsInParent: ");
    ((StringBuilder)localObject2).append(localObject1);
    localStringBuilder.append(((StringBuilder)localObject2).toString());
    getBoundsInScreen((Rect)localObject1);
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("; boundsInScreen: ");
    ((StringBuilder)localObject2).append(localObject1);
    localStringBuilder.append(((StringBuilder)localObject2).toString());
    localStringBuilder.append("; packageName: ");
    localStringBuilder.append(getPackageName());
    localStringBuilder.append("; className: ");
    localStringBuilder.append(getClassName());
    localStringBuilder.append("; text: ");
    localStringBuilder.append(getText());
    localStringBuilder.append("; contentDescription: ");
    localStringBuilder.append(getContentDescription());
    localStringBuilder.append("; viewId: ");
    localStringBuilder.append(getViewIdResourceName());
    localStringBuilder.append("; uniqueId: ");
    localStringBuilder.append(getUniqueId());
    localStringBuilder.append("; checkable: ");
    localStringBuilder.append(isCheckable());
    localStringBuilder.append("; checked: ");
    localStringBuilder.append(isChecked());
    localStringBuilder.append("; focusable: ");
    localStringBuilder.append(isFocusable());
    localStringBuilder.append("; focused: ");
    localStringBuilder.append(isFocused());
    localStringBuilder.append("; selected: ");
    localStringBuilder.append(isSelected());
    localStringBuilder.append("; clickable: ");
    localStringBuilder.append(isClickable());
    localStringBuilder.append("; longClickable: ");
    localStringBuilder.append(isLongClickable());
    localStringBuilder.append("; enabled: ");
    localStringBuilder.append(isEnabled());
    localStringBuilder.append("; password: ");
    localStringBuilder.append(isPassword());
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("; scrollable: ");
    ((StringBuilder)localObject1).append(isScrollable());
    localStringBuilder.append(((StringBuilder)localObject1).toString());
    localStringBuilder.append("; [");
    List localList = getActionList();
    for (int i = 0; i < localList.size(); i++)
    {
      AccessibilityActionCompat localAccessibilityActionCompat = (AccessibilityActionCompat)localList.get(i);
      localObject2 = getActionSymbolicName(localAccessibilityActionCompat.getId());
      localObject1 = localObject2;
      if (((String)localObject2).equals("ACTION_UNKNOWN"))
      {
        localObject1 = localObject2;
        if (localAccessibilityActionCompat.getLabel() != null) {
          localObject1 = localAccessibilityActionCompat.getLabel().toString();
        }
      }
      localStringBuilder.append((String)localObject1);
      if (i != localList.size() - 1) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public AccessibilityNodeInfo unwrap()
  {
    return mInfo;
  }
  
  public static class AccessibilityActionCompat
  {
    public static final AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS;
    public static final AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS;
    public static final AccessibilityActionCompat ACTION_CLEAR_FOCUS;
    public static final AccessibilityActionCompat ACTION_CLEAR_SELECTION;
    public static final AccessibilityActionCompat ACTION_CLICK;
    public static final AccessibilityActionCompat ACTION_COLLAPSE;
    public static final AccessibilityActionCompat ACTION_CONTEXT_CLICK;
    public static final AccessibilityActionCompat ACTION_COPY;
    public static final AccessibilityActionCompat ACTION_CUT;
    public static final AccessibilityActionCompat ACTION_DISMISS;
    @NonNull
    public static final AccessibilityActionCompat ACTION_DRAG_CANCEL;
    @NonNull
    public static final AccessibilityActionCompat ACTION_DRAG_DROP;
    @NonNull
    public static final AccessibilityActionCompat ACTION_DRAG_START;
    public static final AccessibilityActionCompat ACTION_EXPAND;
    public static final AccessibilityActionCompat ACTION_FOCUS;
    public static final AccessibilityActionCompat ACTION_HIDE_TOOLTIP;
    @NonNull
    public static final AccessibilityActionCompat ACTION_IME_ENTER;
    public static final AccessibilityActionCompat ACTION_LONG_CLICK;
    public static final AccessibilityActionCompat ACTION_MOVE_WINDOW;
    public static final AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
    public static final AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT;
    @NonNull
    public static final AccessibilityActionCompat ACTION_PAGE_DOWN;
    @NonNull
    public static final AccessibilityActionCompat ACTION_PAGE_LEFT;
    @NonNull
    public static final AccessibilityActionCompat ACTION_PAGE_RIGHT;
    @NonNull
    public static final AccessibilityActionCompat ACTION_PAGE_UP;
    public static final AccessibilityActionCompat ACTION_PASTE;
    @NonNull
    public static final AccessibilityActionCompat ACTION_PRESS_AND_HOLD;
    public static final AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
    public static final AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT;
    public static final AccessibilityActionCompat ACTION_SCROLL_BACKWARD;
    public static final AccessibilityActionCompat ACTION_SCROLL_DOWN;
    public static final AccessibilityActionCompat ACTION_SCROLL_FORWARD;
    public static final AccessibilityActionCompat ACTION_SCROLL_LEFT;
    public static final AccessibilityActionCompat ACTION_SCROLL_RIGHT;
    public static final AccessibilityActionCompat ACTION_SCROLL_TO_POSITION;
    public static final AccessibilityActionCompat ACTION_SCROLL_UP;
    public static final AccessibilityActionCompat ACTION_SELECT;
    public static final AccessibilityActionCompat ACTION_SET_PROGRESS;
    public static final AccessibilityActionCompat ACTION_SET_SELECTION;
    public static final AccessibilityActionCompat ACTION_SET_TEXT;
    public static final AccessibilityActionCompat ACTION_SHOW_ON_SCREEN;
    @NonNull
    public static final AccessibilityActionCompat ACTION_SHOW_TEXT_SUGGESTIONS;
    public static final AccessibilityActionCompat ACTION_SHOW_TOOLTIP;
    private static final String TAG = "A11yActionCompat";
    public final Object mAction;
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final AccessibilityViewCommand mCommand;
    private final int mId;
    private final Class<? extends AccessibilityViewCommand.CommandArguments> mViewCommandArgumentClass;
    
    static
    {
      Object localObject1 = null;
      ACTION_FOCUS = new AccessibilityActionCompat(1, null);
      ACTION_CLEAR_FOCUS = new AccessibilityActionCompat(2, null);
      ACTION_SELECT = new AccessibilityActionCompat(4, null);
      ACTION_CLEAR_SELECTION = new AccessibilityActionCompat(8, null);
      ACTION_CLICK = new AccessibilityActionCompat(16, null);
      ACTION_LONG_CLICK = new AccessibilityActionCompat(32, null);
      ACTION_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(64, null);
      ACTION_CLEAR_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(128, null);
      ACTION_NEXT_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(256, null, AccessibilityViewCommand.MoveAtGranularityArguments.class);
      ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(512, null, AccessibilityViewCommand.MoveAtGranularityArguments.class);
      ACTION_NEXT_HTML_ELEMENT = new AccessibilityActionCompat(1024, null, AccessibilityViewCommand.MoveHtmlArguments.class);
      ACTION_PREVIOUS_HTML_ELEMENT = new AccessibilityActionCompat(2048, null, AccessibilityViewCommand.MoveHtmlArguments.class);
      ACTION_SCROLL_FORWARD = new AccessibilityActionCompat(4096, null);
      ACTION_SCROLL_BACKWARD = new AccessibilityActionCompat(8192, null);
      ACTION_COPY = new AccessibilityActionCompat(16384, null);
      ACTION_PASTE = new AccessibilityActionCompat(32768, null);
      ACTION_CUT = new AccessibilityActionCompat(65536, null);
      ACTION_SET_SELECTION = new AccessibilityActionCompat(131072, null, AccessibilityViewCommand.SetSelectionArguments.class);
      ACTION_EXPAND = new AccessibilityActionCompat(262144, null);
      ACTION_COLLAPSE = new AccessibilityActionCompat(524288, null);
      ACTION_DISMISS = new AccessibilityActionCompat(1048576, null);
      ACTION_SET_TEXT = new AccessibilityActionCompat(2097152, null, AccessibilityViewCommand.SetTextArguments.class);
      int i = Build.VERSION.SDK_INT;
      ACTION_SHOW_ON_SCREEN = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
      ACTION_SCROLL_TO_POSITION = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, AccessibilityViewCommand.ScrollToPositionArguments.class);
      ACTION_SCROLL_UP = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
      ACTION_SCROLL_LEFT = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
      ACTION_SCROLL_DOWN = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
      ACTION_SCROLL_RIGHT = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
      if (i >= 29) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
      } else {
        localObject2 = null;
      }
      ACTION_PAGE_UP = new AccessibilityActionCompat(localObject2, 16908358, null, null, null);
      if (i >= 29) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
      } else {
        localObject2 = null;
      }
      ACTION_PAGE_DOWN = new AccessibilityActionCompat(localObject2, 16908359, null, null, null);
      if (i >= 29) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
      } else {
        localObject2 = null;
      }
      ACTION_PAGE_LEFT = new AccessibilityActionCompat(localObject2, 16908360, null, null, null);
      if (i >= 29) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
      } else {
        localObject2 = null;
      }
      ACTION_PAGE_RIGHT = new AccessibilityActionCompat(localObject2, 16908361, null, null, null);
      ACTION_CONTEXT_CLICK = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
      ACTION_SET_PROGRESS = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, AccessibilityViewCommand.SetProgressArguments.class);
      if (i >= 26) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
      } else {
        localObject2 = null;
      }
      ACTION_MOVE_WINDOW = new AccessibilityActionCompat(localObject2, 16908354, null, null, AccessibilityViewCommand.MoveWindowArguments.class);
      if (i >= 28) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
      } else {
        localObject2 = null;
      }
      ACTION_SHOW_TOOLTIP = new AccessibilityActionCompat(localObject2, 16908356, null, null, null);
      if (i >= 28) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
      } else {
        localObject2 = null;
      }
      ACTION_HIDE_TOOLTIP = new AccessibilityActionCompat(localObject2, 16908357, null, null, null);
      if (i >= 30) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
      } else {
        localObject2 = null;
      }
      ACTION_PRESS_AND_HOLD = new AccessibilityActionCompat(localObject2, 16908362, null, null, null);
      if (i >= 30) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
      } else {
        localObject2 = null;
      }
      ACTION_IME_ENTER = new AccessibilityActionCompat(localObject2, 16908372, null, null, null);
      if (i >= 32) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
      } else {
        localObject2 = null;
      }
      ACTION_DRAG_START = new AccessibilityActionCompat(localObject2, 16908373, null, null, null);
      if (i >= 32) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
      } else {
        localObject2 = null;
      }
      ACTION_DRAG_DROP = new AccessibilityActionCompat(localObject2, 16908374, null, null, null);
      if (i >= 32) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
      } else {
        localObject2 = null;
      }
      ACTION_DRAG_CANCEL = new AccessibilityActionCompat(localObject2, 16908375, null, null, null);
      Object localObject2 = localObject1;
      if (i >= 33) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
      }
      ACTION_SHOW_TEXT_SUGGESTIONS = new AccessibilityActionCompat(localObject2, 16908376, null, null, null);
    }
    
    public AccessibilityActionCompat(int paramInt, CharSequence paramCharSequence)
    {
      this(null, paramInt, paramCharSequence, null, null);
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public AccessibilityActionCompat(int paramInt, CharSequence paramCharSequence, AccessibilityViewCommand paramAccessibilityViewCommand)
    {
      this(null, paramInt, paramCharSequence, paramAccessibilityViewCommand, null);
    }
    
    private AccessibilityActionCompat(int paramInt, CharSequence paramCharSequence, Class<? extends AccessibilityViewCommand.CommandArguments> paramClass)
    {
      this(null, paramInt, paramCharSequence, null, paramClass);
    }
    
    public AccessibilityActionCompat(Object paramObject)
    {
      this(paramObject, 0, null, null, null);
    }
    
    public AccessibilityActionCompat(Object paramObject, int paramInt, CharSequence paramCharSequence, AccessibilityViewCommand paramAccessibilityViewCommand, Class<? extends AccessibilityViewCommand.CommandArguments> paramClass)
    {
      mId = paramInt;
      mCommand = paramAccessibilityViewCommand;
      if (paramObject == null) {
        mAction = new AccessibilityNodeInfo.AccessibilityAction(paramInt, paramCharSequence);
      } else {
        mAction = paramObject;
      }
      mViewCommandArgumentClass = paramClass;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public AccessibilityActionCompat createReplacementAction(CharSequence paramCharSequence, AccessibilityViewCommand paramAccessibilityViewCommand)
    {
      return new AccessibilityActionCompat(null, mId, paramCharSequence, paramAccessibilityViewCommand, mViewCommandArgumentClass);
    }
    
    public boolean equals(@Nullable Object paramObject)
    {
      if (paramObject == null) {
        return false;
      }
      if (!(paramObject instanceof AccessibilityActionCompat)) {
        return false;
      }
      paramObject = (AccessibilityActionCompat)paramObject;
      Object localObject = mAction;
      if (localObject == null)
      {
        if (mAction != null) {
          return false;
        }
      }
      else if (!localObject.equals(mAction)) {
        return false;
      }
      return true;
    }
    
    public int getId()
    {
      return ((AccessibilityNodeInfo.AccessibilityAction)mAction).getId();
    }
    
    public CharSequence getLabel()
    {
      return ((AccessibilityNodeInfo.AccessibilityAction)mAction).getLabel();
    }
    
    public int hashCode()
    {
      Object localObject = mAction;
      int i;
      if (localObject != null) {
        i = localObject.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean perform(View paramView, Bundle paramBundle)
    {
      if (mCommand != null)
      {
        Object localObject1 = null;
        Object localObject2 = null;
        Object localObject4 = mViewCommandArgumentClass;
        Bundle localBundle;
        if (localObject4 != null)
        {
          try
          {
            localObject1 = (AccessibilityViewCommand.CommandArguments)((Class)localObject4).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            try
            {
              ((AccessibilityViewCommand.CommandArguments)localObject1).setBundle(paramBundle);
            }
            catch (Exception localException2)
            {
              paramBundle = (Bundle)localObject1;
              localObject1 = localException2;
            }
            localObject3 = mViewCommandArgumentClass;
          }
          catch (Exception localException1)
          {
            paramBundle = localException2;
          }
          Object localObject3;
          if (localObject3 == null) {
            localObject3 = "null";
          } else {
            localObject3 = ((Class)localObject3).getName();
          }
          localObject4 = new StringBuilder();
          ((StringBuilder)localObject4).append("Failed to execute command with argument class ViewCommandArgument: ");
          ((StringBuilder)localObject4).append((String)localObject3);
          Log.e("A11yActionCompat", ((StringBuilder)localObject4).toString(), localException1);
          localBundle = paramBundle;
        }
        return mCommand.perform(paramView, localBundle);
      }
      return false;
    }
  }
  
  @RequiresApi(33)
  public static class Api33Impl
  {
    @DoNotInline
    public static AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      return d.h(paramAccessibilityNodeInfo);
    }
    
    @DoNotInline
    public static boolean isTextSelectable(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      return paramAccessibilityNodeInfo.isTextSelectable();
    }
    
    @DoNotInline
    public static void setTextSelectable(AccessibilityNodeInfo paramAccessibilityNodeInfo, boolean paramBoolean)
    {
      paramAccessibilityNodeInfo.setTextSelectable(paramBoolean);
    }
  }
  
  public static class CollectionInfoCompat
  {
    public static final int SELECTION_MODE_MULTIPLE = 2;
    public static final int SELECTION_MODE_NONE = 0;
    public static final int SELECTION_MODE_SINGLE = 1;
    public final Object mInfo;
    
    public CollectionInfoCompat(Object paramObject)
    {
      mInfo = paramObject;
    }
    
    public static CollectionInfoCompat obtain(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean));
    }
    
    public static CollectionInfoCompat obtain(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean, paramInt3));
    }
    
    public int getColumnCount()
    {
      return ((AccessibilityNodeInfo.CollectionInfo)mInfo).getColumnCount();
    }
    
    public int getRowCount()
    {
      return ((AccessibilityNodeInfo.CollectionInfo)mInfo).getRowCount();
    }
    
    public int getSelectionMode()
    {
      return ((AccessibilityNodeInfo.CollectionInfo)mInfo).getSelectionMode();
    }
    
    public boolean isHierarchical()
    {
      return ((AccessibilityNodeInfo.CollectionInfo)mInfo).isHierarchical();
    }
  }
  
  public static class CollectionItemInfoCompat
  {
    public final Object mInfo;
    
    public CollectionItemInfoCompat(Object paramObject)
    {
      mInfo = paramObject;
    }
    
    public static CollectionItemInfoCompat obtain(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean));
    }
    
    public static CollectionItemInfoCompat obtain(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
    {
      return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1, paramBoolean2));
    }
    
    public int getColumnIndex()
    {
      return ((AccessibilityNodeInfo.CollectionItemInfo)mInfo).getColumnIndex();
    }
    
    public int getColumnSpan()
    {
      return ((AccessibilityNodeInfo.CollectionItemInfo)mInfo).getColumnSpan();
    }
    
    public int getRowIndex()
    {
      return ((AccessibilityNodeInfo.CollectionItemInfo)mInfo).getRowIndex();
    }
    
    public int getRowSpan()
    {
      return ((AccessibilityNodeInfo.CollectionItemInfo)mInfo).getRowSpan();
    }
    
    @Deprecated
    public boolean isHeading()
    {
      return ((AccessibilityNodeInfo.CollectionItemInfo)mInfo).isHeading();
    }
    
    public boolean isSelected()
    {
      return ((AccessibilityNodeInfo.CollectionItemInfo)mInfo).isSelected();
    }
  }
  
  public static class RangeInfoCompat
  {
    public static final int RANGE_TYPE_FLOAT = 1;
    public static final int RANGE_TYPE_INT = 0;
    public static final int RANGE_TYPE_PERCENT = 2;
    public final Object mInfo;
    
    public RangeInfoCompat(Object paramObject)
    {
      mInfo = paramObject;
    }
    
    public static RangeInfoCompat obtain(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
    {
      return new RangeInfoCompat(AccessibilityNodeInfo.RangeInfo.obtain(paramInt, paramFloat1, paramFloat2, paramFloat3));
    }
    
    public float getCurrent()
    {
      return ((AccessibilityNodeInfo.RangeInfo)mInfo).getCurrent();
    }
    
    public float getMax()
    {
      return ((AccessibilityNodeInfo.RangeInfo)mInfo).getMax();
    }
    
    public float getMin()
    {
      return ((AccessibilityNodeInfo.RangeInfo)mInfo).getMin();
    }
    
    public int getType()
    {
      return ((AccessibilityNodeInfo.RangeInfo)mInfo).getType();
    }
  }
  
  public static final class TouchDelegateInfoCompat
  {
    public final AccessibilityNodeInfo.TouchDelegateInfo mInfo;
    
    public TouchDelegateInfoCompat(@NonNull AccessibilityNodeInfo.TouchDelegateInfo paramTouchDelegateInfo)
    {
      mInfo = paramTouchDelegateInfo;
    }
    
    public TouchDelegateInfoCompat(@NonNull Map<Region, View> paramMap)
    {
      if (Build.VERSION.SDK_INT >= 29) {
        mInfo = new AccessibilityNodeInfo.TouchDelegateInfo(paramMap);
      } else {
        mInfo = null;
      }
    }
    
    @Nullable
    public Region getRegionAt(@IntRange(from=0L) int paramInt)
    {
      if (Build.VERSION.SDK_INT >= 29) {
        return mInfo.getRegionAt(paramInt);
      }
      return null;
    }
    
    @IntRange(from=0L)
    public int getRegionCount()
    {
      if (Build.VERSION.SDK_INT >= 29) {
        return mInfo.getRegionCount();
      }
      return 0;
    }
    
    @Nullable
    public AccessibilityNodeInfoCompat getTargetForRegion(@NonNull Region paramRegion)
    {
      if (Build.VERSION.SDK_INT >= 29)
      {
        paramRegion = mInfo.getTargetForRegion(paramRegion);
        if (paramRegion != null) {
          return AccessibilityNodeInfoCompat.wrap(paramRegion);
        }
      }
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeInfoCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
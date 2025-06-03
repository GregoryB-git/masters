package io.flutter.view;

import a0.e;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings.Global;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan.Builder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import b0.f;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate;
import io.flutter.util.Predicate;
import io.flutter.util.ViewUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccessibilityBridge
  extends AccessibilityNodeProvider
{
  private static final int ACTION_SHOW_ON_SCREEN = 16908342;
  private static final int BOLD_TEXT_WEIGHT_ADJUSTMENT = 300;
  private static final float DEFAULT_TRANSITION_ANIMATION_SCALE = 1.0F;
  private static final float DISABLED_TRANSITION_ANIMATION_SCALE = 0.0F;
  private static int FIRST_RESOURCE_ID = 267386881;
  private static final int FOCUSABLE_FLAGS;
  private static final int MIN_ENGINE_GENERATED_NODE_ID = 65536;
  private static final int ROOT_NODE_ID = 0;
  private static final int SCROLLABLE_ACTIONS = SCROLL_RIGHTvalue | SCROLL_LEFTvalue | SCROLL_UPvalue | SCROLL_DOWNvalue;
  private static final float SCROLL_EXTENT_FOR_INFINITY = 100000.0F;
  private static final float SCROLL_POSITION_CAP_FOR_INFINITY = 70000.0F;
  private static final String TAG = "AccessibilityBridge";
  public static int systemAction = DID_GAIN_ACCESSIBILITY_FOCUSvalue & DID_LOSE_ACCESSIBILITY_FOCUSvalue & SHOW_ON_SCREENvalue;
  private final AccessibilityChannel accessibilityChannel;
  private int accessibilityFeatureFlags = 0;
  private SemanticsNode accessibilityFocusedSemanticsNode;
  private final AccessibilityManager accessibilityManager;
  private final AccessibilityChannel.AccessibilityMessageHandler accessibilityMessageHandler = new AccessibilityChannel.AccessibilityMessageHandler()
  {
    public void announce(String paramAnonymousString)
    {
      AccessibilityBridge.access$100(AccessibilityBridge.this).announceForAccessibility(paramAnonymousString);
    }
    
    public void onFocus(int paramAnonymousInt)
    {
      sendAccessibilityEvent(paramAnonymousInt, 8);
    }
    
    public void onLongPress(int paramAnonymousInt)
    {
      sendAccessibilityEvent(paramAnonymousInt, 2);
    }
    
    public void onTap(int paramAnonymousInt)
    {
      sendAccessibilityEvent(paramAnonymousInt, 1);
    }
    
    public void onTooltip(String paramAnonymousString)
    {
      if (Build.VERSION.SDK_INT >= 28) {
        return;
      }
      AccessibilityEvent localAccessibilityEvent = AccessibilityBridge.access$200(AccessibilityBridge.this, 0, 32);
      localAccessibilityEvent.getText().add(paramAnonymousString);
      AccessibilityBridge.access$300(AccessibilityBridge.this, localAccessibilityEvent);
    }
    
    public void updateCustomAccessibilityActions(ByteBuffer paramAnonymousByteBuffer, String[] paramAnonymousArrayOfString)
    {
      paramAnonymousByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      AccessibilityBridge.this.updateCustomAccessibilityActions(paramAnonymousByteBuffer, paramAnonymousArrayOfString);
    }
    
    public void updateSemantics(ByteBuffer paramAnonymousByteBuffer, String[] paramAnonymousArrayOfString, ByteBuffer[] paramAnonymousArrayOfByteBuffer)
    {
      paramAnonymousByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      int i = paramAnonymousArrayOfByteBuffer.length;
      for (int j = 0; j < i; j++) {
        paramAnonymousArrayOfByteBuffer[j].order(ByteOrder.LITTLE_ENDIAN);
      }
      AccessibilityBridge.this.updateSemantics(paramAnonymousByteBuffer, paramAnonymousArrayOfString, paramAnonymousArrayOfByteBuffer);
    }
  };
  private final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
  private final AccessibilityViewEmbedder accessibilityViewEmbedder;
  private boolean accessibleNavigation = false;
  private final ContentObserver animationScaleObserver;
  private final ContentResolver contentResolver;
  private final Map<Integer, CustomAccessibilityAction> customAccessibilityActions = new HashMap();
  private Integer embeddedAccessibilityFocusedNodeId;
  private Integer embeddedInputFocusedNodeId;
  private final List<Integer> flutterNavigationStack = new ArrayList();
  private final Map<Integer, SemanticsNode> flutterSemanticsTree = new HashMap();
  private SemanticsNode hoveredObject;
  private SemanticsNode inputFocusedSemanticsNode;
  private boolean isReleased = false;
  private SemanticsNode lastInputFocusedSemanticsNode;
  private Integer lastLeftFrameInset = Integer.valueOf(0);
  private OnAccessibilityChangeListener onAccessibilityChangeListener;
  private final PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate;
  private int previousRouteId = 0;
  private final View rootAccessibilityView;
  private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
  
  static
  {
    FOCUSABLE_FLAGS = HAS_CHECKED_STATEvalue | IS_CHECKEDvalue | IS_SELECTEDvalue | IS_TEXT_FIELDvalue | IS_FOCUSEDvalue | HAS_ENABLED_STATEvalue | IS_ENABLEDvalue | IS_IN_MUTUALLY_EXCLUSIVE_GROUPvalue | HAS_TOGGLED_STATEvalue | IS_TOGGLEDvalue | IS_FOCUSABLEvalue | IS_SLIDERvalue;
  }
  
  public AccessibilityBridge(View paramView, AccessibilityChannel paramAccessibilityChannel, AccessibilityManager paramAccessibilityManager, ContentResolver paramContentResolver, PlatformViewsAccessibilityDelegate paramPlatformViewsAccessibilityDelegate)
  {
    this(paramView, paramAccessibilityChannel, paramAccessibilityManager, paramContentResolver, new AccessibilityViewEmbedder(paramView, 65536), paramPlatformViewsAccessibilityDelegate);
  }
  
  public AccessibilityBridge(View paramView, AccessibilityChannel paramAccessibilityChannel, final AccessibilityManager paramAccessibilityManager, ContentResolver paramContentResolver, AccessibilityViewEmbedder paramAccessibilityViewEmbedder, PlatformViewsAccessibilityDelegate paramPlatformViewsAccessibilityDelegate)
  {
    AccessibilityManager.AccessibilityStateChangeListener local2 = new AccessibilityManager.AccessibilityStateChangeListener()
    {
      public void onAccessibilityStateChanged(boolean paramAnonymousBoolean)
      {
        if (AccessibilityBridge.access$400(AccessibilityBridge.this)) {
          return;
        }
        AccessibilityBridge localAccessibilityBridge = AccessibilityBridge.this;
        if (paramAnonymousBoolean)
        {
          AccessibilityBridge.access$600(localAccessibilityBridge).setAccessibilityMessageHandler(AccessibilityBridge.access$500(AccessibilityBridge.this));
          AccessibilityBridge.access$600(AccessibilityBridge.this).onAndroidAccessibilityEnabled();
        }
        else
        {
          AccessibilityBridge.access$700(localAccessibilityBridge, false);
          AccessibilityBridge.access$600(AccessibilityBridge.this).setAccessibilityMessageHandler(null);
          AccessibilityBridge.access$600(AccessibilityBridge.this).onAndroidAccessibilityDisabled();
        }
        if (AccessibilityBridge.access$800(AccessibilityBridge.this) != null) {
          AccessibilityBridge.access$800(AccessibilityBridge.this).onAccessibilityChanged(paramAnonymousBoolean, AccessibilityBridge.access$900(AccessibilityBridge.this).isTouchExplorationEnabled());
        }
      }
    };
    accessibilityStateChangeListener = local2;
    ContentObserver local3 = new ContentObserver(new Handler())
    {
      public void onChange(boolean paramAnonymousBoolean)
      {
        onChange(paramAnonymousBoolean, null);
      }
      
      public void onChange(boolean paramAnonymousBoolean, Uri paramAnonymousUri)
      {
        if (AccessibilityBridge.access$400(AccessibilityBridge.this)) {
          return;
        }
        int i;
        if (Settings.Global.getFloat(AccessibilityBridge.access$1000(AccessibilityBridge.this), "transition_animation_scale", 1.0F) == 0.0F) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          AccessibilityBridge.access$1176(AccessibilityBridge.this, DISABLE_ANIMATIONSvalue);
        } else {
          AccessibilityBridge.access$1172(AccessibilityBridge.this, DISABLE_ANIMATIONSvalue);
        }
        AccessibilityBridge.access$1200(AccessibilityBridge.this);
      }
    };
    animationScaleObserver = local3;
    rootAccessibilityView = paramView;
    accessibilityChannel = paramAccessibilityChannel;
    accessibilityManager = paramAccessibilityManager;
    contentResolver = paramContentResolver;
    accessibilityViewEmbedder = paramAccessibilityViewEmbedder;
    platformViewsAccessibilityDelegate = paramPlatformViewsAccessibilityDelegate;
    local2.onAccessibilityStateChanged(paramAccessibilityManager.isEnabled());
    paramAccessibilityManager.addAccessibilityStateChangeListener(local2);
    paramView = new AccessibilityManager.TouchExplorationStateChangeListener()
    {
      public void onTouchExplorationStateChanged(boolean paramAnonymousBoolean)
      {
        if (AccessibilityBridge.access$400(this$0)) {
          return;
        }
        if (!paramAnonymousBoolean)
        {
          AccessibilityBridge.access$700(this$0, false);
          AccessibilityBridge.access$1300(this$0);
        }
        if (AccessibilityBridge.access$800(this$0) != null) {
          AccessibilityBridge.access$800(this$0).onAccessibilityChanged(paramAccessibilityManager.isEnabled(), paramAnonymousBoolean);
        }
      }
    };
    touchExplorationStateChangeListener = paramView;
    paramView.onTouchExplorationStateChanged(paramAccessibilityManager.isTouchExplorationEnabled());
    paramAccessibilityManager.addTouchExplorationStateChangeListener(paramView);
    local3.onChange(false);
    paramContentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, local3);
    if (Build.VERSION.SDK_INT >= 31) {
      setBoldTextFlag();
    }
    paramPlatformViewsAccessibilityDelegate.attachAccessibilityBridge(this);
  }
  
  private AccessibilityEvent createTextChangedEvent(int paramInt, String paramString1, String paramString2)
  {
    AccessibilityEvent localAccessibilityEvent = obtainAccessibilityEvent(paramInt, 16);
    localAccessibilityEvent.setBeforeText(paramString1);
    localAccessibilityEvent.getText().add(paramString2);
    for (paramInt = 0; (paramInt < paramString1.length()) && (paramInt < paramString2.length()) && (paramString1.charAt(paramInt) == paramString2.charAt(paramInt)); paramInt++) {}
    if ((paramInt >= paramString1.length()) && (paramInt >= paramString2.length())) {
      return null;
    }
    localAccessibilityEvent.setFromIndex(paramInt);
    int i = paramString1.length() - 1;
    for (int j = paramString2.length() - 1; (i >= paramInt) && (j >= paramInt) && (paramString1.charAt(i) == paramString2.charAt(j)); j--) {
      i--;
    }
    localAccessibilityEvent.setRemovedCount(i - paramInt + 1);
    localAccessibilityEvent.setAddedCount(j - paramInt + 1);
    return localAccessibilityEvent;
  }
  
  private boolean doesLayoutInDisplayCutoutModeRequireLeftInset()
  {
    Activity localActivity = ViewUtils.getActivity(rootAccessibilityView.getContext());
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localActivity != null) {
      if (localActivity.getWindow() == null)
      {
        bool2 = bool1;
      }
      else
      {
        int i = getWindowgetAttributeslayoutInDisplayCutoutMode;
        if (i != 2)
        {
          bool2 = bool1;
          if (i != 0) {}
        }
        else
        {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  private Rect getBoundsInScreen(Rect paramRect)
  {
    paramRect = new Rect(paramRect);
    int[] arrayOfInt = new int[2];
    rootAccessibilityView.getLocationOnScreen(arrayOfInt);
    paramRect.offset(arrayOfInt[0], arrayOfInt[1]);
    return paramRect;
  }
  
  private CustomAccessibilityAction getOrCreateAccessibilityAction(int paramInt)
  {
    CustomAccessibilityAction localCustomAccessibilityAction1 = (CustomAccessibilityAction)customAccessibilityActions.get(Integer.valueOf(paramInt));
    CustomAccessibilityAction localCustomAccessibilityAction2 = localCustomAccessibilityAction1;
    if (localCustomAccessibilityAction1 == null)
    {
      localCustomAccessibilityAction2 = new CustomAccessibilityAction();
      CustomAccessibilityAction.access$4602(localCustomAccessibilityAction2, paramInt);
      CustomAccessibilityAction.access$3702(localCustomAccessibilityAction2, FIRST_RESOURCE_ID + paramInt);
      customAccessibilityActions.put(Integer.valueOf(paramInt), localCustomAccessibilityAction2);
    }
    return localCustomAccessibilityAction2;
  }
  
  private SemanticsNode getOrCreateSemanticsNode(int paramInt)
  {
    SemanticsNode localSemanticsNode1 = (SemanticsNode)flutterSemanticsTree.get(Integer.valueOf(paramInt));
    SemanticsNode localSemanticsNode2 = localSemanticsNode1;
    if (localSemanticsNode1 == null)
    {
      localSemanticsNode2 = new SemanticsNode(this);
      SemanticsNode.access$002(localSemanticsNode2, paramInt);
      flutterSemanticsTree.put(Integer.valueOf(paramInt), localSemanticsNode2);
    }
    return localSemanticsNode2;
  }
  
  private SemanticsNode getRootSemanticsNode()
  {
    return (SemanticsNode)flutterSemanticsTree.get(Integer.valueOf(0));
  }
  
  private void handleTouchExploration(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (flutterSemanticsTree.isEmpty()) {
      return;
    }
    SemanticsNode localSemanticsNode1 = SemanticsNode.access$4700(getRootSemanticsNode(), new float[] { paramFloat1, paramFloat2, 0.0F, 1.0F }, paramBoolean);
    if (localSemanticsNode1 != hoveredObject)
    {
      if (localSemanticsNode1 != null) {
        sendAccessibilityEvent(SemanticsNode.access$000(localSemanticsNode1), 128);
      }
      SemanticsNode localSemanticsNode2 = hoveredObject;
      if (localSemanticsNode2 != null) {
        sendAccessibilityEvent(SemanticsNode.access$000(localSemanticsNode2), 256);
      }
      hoveredObject = localSemanticsNode1;
    }
  }
  
  private boolean isImportant(SemanticsNode paramSemanticsNode)
  {
    boolean bool1 = SemanticsNode.access$2000(paramSemanticsNode, Flag.SCOPES_ROUTE);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (SemanticsNode.access$3400(paramSemanticsNode) != null) {
      return true;
    }
    if ((SemanticsNode.access$4000(paramSemanticsNode) & systemAction) != 0) {
      bool2 = true;
    }
    return bool2;
  }
  
  private AccessibilityEvent obtainAccessibilityEvent(int paramInt1, int paramInt2)
  {
    AccessibilityEvent localAccessibilityEvent = obtainAccessibilityEvent(paramInt2);
    localAccessibilityEvent.setPackageName(rootAccessibilityView.getContext().getPackageName());
    localAccessibilityEvent.setSource(rootAccessibilityView, paramInt1);
    return localAccessibilityEvent;
  }
  
  private void onTouchExplorationExit()
  {
    SemanticsNode localSemanticsNode = hoveredObject;
    if (localSemanticsNode != null)
    {
      sendAccessibilityEvent(SemanticsNode.access$000(localSemanticsNode), 256);
      hoveredObject = null;
    }
  }
  
  private void onWindowNameChange(SemanticsNode paramSemanticsNode)
  {
    String str1 = SemanticsNode.access$6800(paramSemanticsNode);
    String str2 = str1;
    if (str1 == null) {
      str2 = " ";
    }
    if (Build.VERSION.SDK_INT >= 28)
    {
      setAccessibilityPaneTitle(str2);
    }
    else
    {
      paramSemanticsNode = obtainAccessibilityEvent(SemanticsNode.access$000(paramSemanticsNode), 32);
      paramSemanticsNode.getText().add(str2);
      sendAccessibilityEvent(paramSemanticsNode);
    }
  }
  
  private boolean performCursorMoveAction(SemanticsNode paramSemanticsNode, int paramInt, Bundle paramBundle, boolean paramBoolean)
  {
    int i = paramBundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
    boolean bool = paramBundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
    int j = SemanticsNode.access$2100(paramSemanticsNode);
    int k = SemanticsNode.access$2200(paramSemanticsNode);
    predictCursorMovement(paramSemanticsNode, i, paramBoolean, bool);
    if ((j != SemanticsNode.access$2100(paramSemanticsNode)) || (k != SemanticsNode.access$2200(paramSemanticsNode)))
    {
      if (SemanticsNode.access$2500(paramSemanticsNode) != null) {
        paramBundle = SemanticsNode.access$2500(paramSemanticsNode);
      } else {
        paramBundle = "";
      }
      AccessibilityEvent localAccessibilityEvent = obtainAccessibilityEvent(SemanticsNode.access$000(paramSemanticsNode), 8192);
      localAccessibilityEvent.getText().add(paramBundle);
      localAccessibilityEvent.setFromIndex(SemanticsNode.access$2100(paramSemanticsNode));
      localAccessibilityEvent.setToIndex(SemanticsNode.access$2200(paramSemanticsNode));
      localAccessibilityEvent.setItemCount(paramBundle.length());
      sendAccessibilityEvent(localAccessibilityEvent);
    }
    if (i != 1)
    {
      if (i != 2)
      {
        if ((i == 4) || (i == 8) || (i == 16)) {
          return true;
        }
      }
      else
      {
        if (paramBoolean)
        {
          paramBundle = Action.MOVE_CURSOR_FORWARD_BY_WORD;
          if (SemanticsNode.access$2300(paramSemanticsNode, paramBundle))
          {
            accessibilityChannel.dispatchSemanticsAction(paramInt, paramBundle, Boolean.valueOf(bool));
            return true;
          }
        }
        if (!paramBoolean)
        {
          paramBundle = Action.MOVE_CURSOR_BACKWARD_BY_WORD;
          if (SemanticsNode.access$2300(paramSemanticsNode, paramBundle))
          {
            accessibilityChannel.dispatchSemanticsAction(paramInt, paramBundle, Boolean.valueOf(bool));
            return true;
          }
        }
      }
    }
    else
    {
      if (paramBoolean)
      {
        paramBundle = Action.MOVE_CURSOR_FORWARD_BY_CHARACTER;
        if (SemanticsNode.access$2300(paramSemanticsNode, paramBundle))
        {
          accessibilityChannel.dispatchSemanticsAction(paramInt, paramBundle, Boolean.valueOf(bool));
          return true;
        }
      }
      if (!paramBoolean)
      {
        paramBundle = Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
        if (SemanticsNode.access$2300(paramSemanticsNode, paramBundle))
        {
          accessibilityChannel.dispatchSemanticsAction(paramInt, paramBundle, Boolean.valueOf(bool));
          return true;
        }
      }
    }
    return false;
  }
  
  private boolean performSetText(SemanticsNode paramSemanticsNode, int paramInt, Bundle paramBundle)
  {
    if ((paramBundle != null) && (paramBundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"))) {
      paramBundle = paramBundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
    } else {
      paramBundle = "";
    }
    accessibilityChannel.dispatchSemanticsAction(paramInt, Action.SET_TEXT, paramBundle);
    SemanticsNode.access$2502(paramSemanticsNode, paramBundle);
    SemanticsNode.access$4202(paramSemanticsNode, null);
    return true;
  }
  
  private void predictCursorMovement(SemanticsNode paramSemanticsNode, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((SemanticsNode.access$2200(paramSemanticsNode) >= 0) && (SemanticsNode.access$2100(paramSemanticsNode) >= 0))
    {
      if (paramInt != 1)
      {
        label59:
        Matcher localMatcher;
        if (paramInt != 2)
        {
          if (paramInt != 4)
          {
            if ((paramInt != 8) && (paramInt != 16)) {
              break label337;
            }
            if (paramBoolean1)
            {
              paramInt = SemanticsNode.access$2500(paramSemanticsNode).length();
              SemanticsNode.access$2202(paramSemanticsNode, paramInt);
              break label337;
            }
          }
          label125:
          do
          {
            SemanticsNode.access$2202(paramSemanticsNode, 0);
            break label337;
            if ((paramBoolean1) && (SemanticsNode.access$2200(paramSemanticsNode) < SemanticsNode.access$2500(paramSemanticsNode).length()))
            {
              localMatcher = Pattern.compile("(?!^)(\\n)").matcher(SemanticsNode.access$2500(paramSemanticsNode).substring(SemanticsNode.access$2200(paramSemanticsNode)));
              if (!localMatcher.find()) {
                break;
              }
              SemanticsNode.access$2212(paramSemanticsNode, localMatcher.start(1));
              break label337;
            }
            if ((paramBoolean1) || (SemanticsNode.access$2200(paramSemanticsNode) <= 0)) {
              break label337;
            }
            localMatcher = Pattern.compile("(?s:.*)(\\n)").matcher(SemanticsNode.access$2500(paramSemanticsNode).substring(0, SemanticsNode.access$2200(paramSemanticsNode)));
          } while (!localMatcher.find());
        }
        else
        {
          for (;;)
          {
            paramInt = localMatcher.start(1);
            break label59;
            if ((paramBoolean1) && (SemanticsNode.access$2200(paramSemanticsNode) < SemanticsNode.access$2500(paramSemanticsNode).length()))
            {
              localMatcher = Pattern.compile("\\p{L}(\\b)").matcher(SemanticsNode.access$2500(paramSemanticsNode).substring(SemanticsNode.access$2200(paramSemanticsNode)));
              localMatcher.find();
              if (!localMatcher.find()) {
                break;
              }
              break label125;
            }
            if ((paramBoolean1) || (SemanticsNode.access$2200(paramSemanticsNode) <= 0)) {
              break label337;
            }
            localMatcher = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(SemanticsNode.access$2500(paramSemanticsNode).substring(0, SemanticsNode.access$2200(paramSemanticsNode)));
            if (!localMatcher.find()) {
              break label337;
            }
          }
        }
      }
      else if ((paramBoolean1) && (SemanticsNode.access$2200(paramSemanticsNode) < SemanticsNode.access$2500(paramSemanticsNode).length()))
      {
        SemanticsNode.access$2212(paramSemanticsNode, 1);
      }
      else if ((!paramBoolean1) && (SemanticsNode.access$2200(paramSemanticsNode) > 0))
      {
        SemanticsNode.access$2220(paramSemanticsNode, 1);
      }
      label337:
      if (!paramBoolean2) {
        SemanticsNode.access$2102(paramSemanticsNode, SemanticsNode.access$2200(paramSemanticsNode));
      }
    }
  }
  
  private void sendAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (!accessibilityManager.isEnabled()) {
      return;
    }
    rootAccessibilityView.getParent().requestSendAccessibilityEvent(rootAccessibilityView, paramAccessibilityEvent);
  }
  
  private void sendLatestAccessibilityFlagsToFlutter()
  {
    accessibilityChannel.setAccessibilityFeatures(accessibilityFeatureFlags);
  }
  
  private void sendWindowContentChangeEvent(int paramInt)
  {
    AccessibilityEvent localAccessibilityEvent = obtainAccessibilityEvent(paramInt, 2048);
    localAccessibilityEvent.setContentChangeTypes(1);
    sendAccessibilityEvent(localAccessibilityEvent);
  }
  
  private void setAccessibilityPaneTitle(String paramString)
  {
    com.google.android.recaptcha.internal.a.n(rootAccessibilityView, paramString);
  }
  
  private void setAccessibleNavigation(boolean paramBoolean)
  {
    if (accessibleNavigation == paramBoolean) {
      return;
    }
    accessibleNavigation = paramBoolean;
    int i;
    if (paramBoolean) {
      i = accessibilityFeatureFlags | ACCESSIBLE_NAVIGATIONvalue;
    } else {
      i = accessibilityFeatureFlags & ACCESSIBLE_NAVIGATIONvalue;
    }
    accessibilityFeatureFlags = i;
    sendLatestAccessibilityFlagsToFlutter();
  }
  
  private void setBoldTextFlag()
  {
    View localView = rootAccessibilityView;
    if ((localView != null) && (localView.getResources() != null))
    {
      int i = rootAccessibilityView.getResources().getConfiguration().fontWeightAdjustment;
      if ((i != Integer.MAX_VALUE) && (i >= 300)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        i = accessibilityFeatureFlags | BOLD_TEXTvalue;
      } else {
        i = accessibilityFeatureFlags & BOLD_TEXTvalue;
      }
      accessibilityFeatureFlags = i;
      sendLatestAccessibilityFlagsToFlutter();
    }
  }
  
  private boolean shouldSetCollectionInfo(SemanticsNode paramSemanticsNode)
  {
    boolean bool;
    if ((SemanticsNode.access$1400(paramSemanticsNode) > 0) && ((SemanticsNode.access$1500(accessibilityFocusedSemanticsNode, new b(paramSemanticsNode))) || (!SemanticsNode.access$1500(accessibilityFocusedSemanticsNode, new c())))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void willRemoveSemanticsNode(SemanticsNode paramSemanticsNode)
  {
    SemanticsNode.access$2702(paramSemanticsNode, null);
    if (SemanticsNode.access$1600(paramSemanticsNode) != -1)
    {
      localObject = embeddedAccessibilityFocusedNodeId;
      if ((localObject != null) && (accessibilityViewEmbedder.platformViewOfNode(((Integer)localObject).intValue()) == platformViewsAccessibilityDelegate.getPlatformViewById(SemanticsNode.access$1600(paramSemanticsNode))))
      {
        sendAccessibilityEvent(embeddedAccessibilityFocusedNodeId.intValue(), 65536);
        embeddedAccessibilityFocusedNodeId = null;
      }
    }
    if (SemanticsNode.access$1600(paramSemanticsNode) != -1)
    {
      localObject = platformViewsAccessibilityDelegate.getPlatformViewById(SemanticsNode.access$1600(paramSemanticsNode));
      if (localObject != null) {
        ((View)localObject).setImportantForAccessibility(4);
      }
    }
    Object localObject = accessibilityFocusedSemanticsNode;
    if (localObject == paramSemanticsNode)
    {
      sendAccessibilityEvent(SemanticsNode.access$000((SemanticsNode)localObject), 65536);
      accessibilityFocusedSemanticsNode = null;
    }
    if (inputFocusedSemanticsNode == paramSemanticsNode) {
      inputFocusedSemanticsNode = null;
    }
    if (hoveredObject == paramSemanticsNode) {
      hoveredObject = null;
    }
  }
  
  public AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
  {
    boolean bool1 = true;
    setAccessibleNavigation(true);
    if (paramInt >= 65536) {
      return accessibilityViewEmbedder.createAccessibilityNodeInfo(paramInt);
    }
    if (paramInt == -1)
    {
      localObject1 = obtainAccessibilityNodeInfo(rootAccessibilityView);
      rootAccessibilityView.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo)localObject1);
      if (flutterSemanticsTree.containsKey(Integer.valueOf(0))) {
        ((AccessibilityNodeInfo)localObject1).addChild(rootAccessibilityView, 0);
      }
      if (Build.VERSION.SDK_INT >= 24) {
        e.h((AccessibilityNodeInfo)localObject1);
      }
      return (AccessibilityNodeInfo)localObject1;
    }
    SemanticsNode localSemanticsNode = (SemanticsNode)flutterSemanticsTree.get(Integer.valueOf(paramInt));
    if (localSemanticsNode == null) {
      return null;
    }
    if ((SemanticsNode.access$1600(localSemanticsNode) != -1) && (platformViewsAccessibilityDelegate.usesVirtualDisplay(SemanticsNode.access$1600(localSemanticsNode))))
    {
      localObject2 = platformViewsAccessibilityDelegate.getPlatformViewById(SemanticsNode.access$1600(localSemanticsNode));
      if (localObject2 == null) {
        return null;
      }
      localObject1 = SemanticsNode.access$1700(localSemanticsNode);
      return accessibilityViewEmbedder.getRootNode((View)localObject2, SemanticsNode.access$000(localSemanticsNode), (Rect)localObject1);
    }
    AccessibilityNodeInfo localAccessibilityNodeInfo = obtainAccessibilityNodeInfo(rootAccessibilityView, paramInt);
    int i = Build.VERSION.SDK_INT;
    if (i >= 24) {
      f.m(localAccessibilityNodeInfo, isImportant(localSemanticsNode));
    }
    Object localObject3 = "";
    localAccessibilityNodeInfo.setViewIdResourceName("");
    if (SemanticsNode.access$1800(localSemanticsNode) != null) {
      localAccessibilityNodeInfo.setViewIdResourceName(SemanticsNode.access$1800(localSemanticsNode));
    }
    localAccessibilityNodeInfo.setPackageName(rootAccessibilityView.getContext().getPackageName());
    localAccessibilityNodeInfo.setClassName("android.view.View");
    localAccessibilityNodeInfo.setSource(rootAccessibilityView, paramInt);
    localAccessibilityNodeInfo.setFocusable(SemanticsNode.access$1900(localSemanticsNode));
    Object localObject1 = inputFocusedSemanticsNode;
    if (localObject1 != null)
    {
      if (SemanticsNode.access$000((SemanticsNode)localObject1) == paramInt) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      localAccessibilityNodeInfo.setFocused(bool2);
    }
    localObject1 = accessibilityFocusedSemanticsNode;
    if (localObject1 != null)
    {
      if (SemanticsNode.access$000((SemanticsNode)localObject1) == paramInt) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      localAccessibilityNodeInfo.setAccessibilityFocused(bool2);
    }
    Object localObject2 = Flag.IS_TEXT_FIELD;
    if (SemanticsNode.access$2000(localSemanticsNode, (Flag)localObject2))
    {
      localAccessibilityNodeInfo.setPassword(SemanticsNode.access$2000(localSemanticsNode, Flag.IS_OBSCURED));
      localObject1 = Flag.IS_READ_ONLY;
      if (!SemanticsNode.access$2000(localSemanticsNode, (Flag)localObject1)) {
        localAccessibilityNodeInfo.setClassName("android.widget.EditText");
      }
      localAccessibilityNodeInfo.setEditable(SemanticsNode.access$2000(localSemanticsNode, (Flag)localObject1) ^ true);
      if ((SemanticsNode.access$2100(localSemanticsNode) != -1) && (SemanticsNode.access$2200(localSemanticsNode) != -1)) {
        localAccessibilityNodeInfo.setTextSelection(SemanticsNode.access$2100(localSemanticsNode), SemanticsNode.access$2200(localSemanticsNode));
      }
      localObject1 = accessibilityFocusedSemanticsNode;
      if ((localObject1 != null) && (SemanticsNode.access$000((SemanticsNode)localObject1) == paramInt)) {
        localAccessibilityNodeInfo.setLiveRegion(1);
      }
      if (SemanticsNode.access$2300(localSemanticsNode, Action.MOVE_CURSOR_FORWARD_BY_CHARACTER))
      {
        localAccessibilityNodeInfo.addAction(256);
        j = 1;
      }
      else
      {
        j = 0;
      }
      int k = j;
      if (SemanticsNode.access$2300(localSemanticsNode, Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER))
      {
        localAccessibilityNodeInfo.addAction(512);
        k = j | 0x1;
      }
      int j = k;
      if (SemanticsNode.access$2300(localSemanticsNode, Action.MOVE_CURSOR_FORWARD_BY_WORD))
      {
        localAccessibilityNodeInfo.addAction(256);
        j = k | 0x2;
      }
      k = j;
      if (SemanticsNode.access$2300(localSemanticsNode, Action.MOVE_CURSOR_BACKWARD_BY_WORD))
      {
        localAccessibilityNodeInfo.addAction(512);
        k = j | 0x2;
      }
      localAccessibilityNodeInfo.setMovementGranularities(k);
      if (SemanticsNode.access$2400(localSemanticsNode) >= 0)
      {
        if (SemanticsNode.access$2500(localSemanticsNode) == null) {
          k = 0;
        } else {
          k = SemanticsNode.access$2500(localSemanticsNode).length();
        }
        SemanticsNode.access$2600(localSemanticsNode);
        SemanticsNode.access$2400(localSemanticsNode);
        localAccessibilityNodeInfo.setMaxTextLength(k - SemanticsNode.access$2600(localSemanticsNode) + SemanticsNode.access$2400(localSemanticsNode));
      }
    }
    if (SemanticsNode.access$2300(localSemanticsNode, Action.SET_SELECTION)) {
      localAccessibilityNodeInfo.addAction(131072);
    }
    if (SemanticsNode.access$2300(localSemanticsNode, Action.COPY)) {
      localAccessibilityNodeInfo.addAction(16384);
    }
    if (SemanticsNode.access$2300(localSemanticsNode, Action.CUT)) {
      localAccessibilityNodeInfo.addAction(65536);
    }
    if (SemanticsNode.access$2300(localSemanticsNode, Action.PASTE)) {
      localAccessibilityNodeInfo.addAction(32768);
    }
    if (SemanticsNode.access$2300(localSemanticsNode, Action.SET_TEXT)) {
      localAccessibilityNodeInfo.addAction(2097152);
    }
    if ((SemanticsNode.access$2000(localSemanticsNode, Flag.IS_BUTTON)) || (SemanticsNode.access$2000(localSemanticsNode, Flag.IS_LINK))) {
      localAccessibilityNodeInfo.setClassName("android.widget.Button");
    }
    if (SemanticsNode.access$2000(localSemanticsNode, Flag.IS_IMAGE)) {
      localAccessibilityNodeInfo.setClassName("android.widget.ImageView");
    }
    if (SemanticsNode.access$2300(localSemanticsNode, Action.DISMISS))
    {
      localAccessibilityNodeInfo.setDismissable(true);
      localAccessibilityNodeInfo.addAction(1048576);
    }
    if (SemanticsNode.access$2700(localSemanticsNode) != null) {
      localAccessibilityNodeInfo.setParent(rootAccessibilityView, SemanticsNode.access$000(SemanticsNode.access$2700(localSemanticsNode)));
    } else {
      localAccessibilityNodeInfo.setParent(rootAccessibilityView);
    }
    if (SemanticsNode.access$2800(localSemanticsNode) != -1) {
      localAccessibilityNodeInfo.setTraversalAfter(rootAccessibilityView, SemanticsNode.access$2800(localSemanticsNode));
    }
    localObject1 = SemanticsNode.access$1700(localSemanticsNode);
    if (SemanticsNode.access$2700(localSemanticsNode) != null)
    {
      Rect localRect = SemanticsNode.access$1700(SemanticsNode.access$2700(localSemanticsNode));
      localObject4 = new Rect((Rect)localObject1);
      ((Rect)localObject4).offset(-left, -top);
      localAccessibilityNodeInfo.setBoundsInParent((Rect)localObject4);
    }
    else
    {
      localAccessibilityNodeInfo.setBoundsInParent((Rect)localObject1);
    }
    localAccessibilityNodeInfo.setBoundsInScreen(getBoundsInScreen((Rect)localObject1));
    localAccessibilityNodeInfo.setVisibleToUser(true);
    if ((SemanticsNode.access$2000(localSemanticsNode, Flag.HAS_ENABLED_STATE)) && (!SemanticsNode.access$2000(localSemanticsNode, Flag.IS_ENABLED))) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    localAccessibilityNodeInfo.setEnabled(bool2);
    if (SemanticsNode.access$2300(localSemanticsNode, Action.TAP))
    {
      if (SemanticsNode.access$2900(localSemanticsNode) != null)
      {
        localAccessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, CustomAccessibilityAction.access$3000(SemanticsNode.access$2900(localSemanticsNode))));
        break label1070;
      }
    }
    else {
      if (!SemanticsNode.access$2000(localSemanticsNode, Flag.IS_SLIDER)) {
        break label1076;
      }
    }
    localAccessibilityNodeInfo.addAction(16);
    label1070:
    localAccessibilityNodeInfo.setClickable(true);
    label1076:
    if (SemanticsNode.access$2300(localSemanticsNode, Action.LONG_PRESS))
    {
      if (SemanticsNode.access$3100(localSemanticsNode) != null) {
        localAccessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, CustomAccessibilityAction.access$3000(SemanticsNode.access$3100(localSemanticsNode))));
      } else {
        localAccessibilityNodeInfo.addAction(32);
      }
      localAccessibilityNodeInfo.setLongClickable(true);
    }
    Object localObject4 = Action.SCROLL_LEFT;
    if ((SemanticsNode.access$2300(localSemanticsNode, (Action)localObject4)) || (SemanticsNode.access$2300(localSemanticsNode, Action.SCROLL_UP)) || (SemanticsNode.access$2300(localSemanticsNode, Action.SCROLL_RIGHT)) || (SemanticsNode.access$2300(localSemanticsNode, Action.SCROLL_DOWN)))
    {
      localAccessibilityNodeInfo.setScrollable(true);
      if (SemanticsNode.access$2000(localSemanticsNode, Flag.HAS_IMPLICIT_SCROLLING))
      {
        if ((!SemanticsNode.access$2300(localSemanticsNode, (Action)localObject4)) && (!SemanticsNode.access$2300(localSemanticsNode, Action.SCROLL_RIGHT)))
        {
          if (shouldSetCollectionInfo(localSemanticsNode))
          {
            localObject1 = AccessibilityNodeInfo.CollectionInfo.obtain(SemanticsNode.access$1400(localSemanticsNode), 0, false);
          }
          else
          {
            localObject1 = "android.widget.ScrollView";
            break label1285;
          }
        }
        else
        {
          if (!shouldSetCollectionInfo(localSemanticsNode)) {
            break label1281;
          }
          localObject1 = AccessibilityNodeInfo.CollectionInfo.obtain(0, SemanticsNode.access$1400(localSemanticsNode), false);
        }
        localAccessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)localObject1);
        break label1291;
        label1281:
        localObject1 = "android.widget.HorizontalScrollView";
        label1285:
        localAccessibilityNodeInfo.setClassName((CharSequence)localObject1);
      }
      label1291:
      if ((SemanticsNode.access$2300(localSemanticsNode, (Action)localObject4)) || (SemanticsNode.access$2300(localSemanticsNode, Action.SCROLL_UP))) {
        localAccessibilityNodeInfo.addAction(4096);
      }
      if ((SemanticsNode.access$2300(localSemanticsNode, Action.SCROLL_RIGHT)) || (SemanticsNode.access$2300(localSemanticsNode, Action.SCROLL_DOWN))) {
        localAccessibilityNodeInfo.addAction(8192);
      }
    }
    localObject1 = Action.INCREASE;
    if ((SemanticsNode.access$2300(localSemanticsNode, (Action)localObject1)) || (SemanticsNode.access$2300(localSemanticsNode, Action.DECREASE)))
    {
      localAccessibilityNodeInfo.setClassName("android.widget.SeekBar");
      if (SemanticsNode.access$2300(localSemanticsNode, (Action)localObject1)) {
        localAccessibilityNodeInfo.addAction(4096);
      }
      if (SemanticsNode.access$2300(localSemanticsNode, Action.DECREASE)) {
        localAccessibilityNodeInfo.addAction(8192);
      }
    }
    if (SemanticsNode.access$2000(localSemanticsNode, Flag.IS_LIVE_REGION)) {
      localAccessibilityNodeInfo.setLiveRegion(1);
    }
    if (SemanticsNode.access$2000(localSemanticsNode, (Flag)localObject2))
    {
      localAccessibilityNodeInfo.setText(SemanticsNode.access$3200(localSemanticsNode));
      if (i >= 28) {
        a.b(localAccessibilityNodeInfo, SemanticsNode.access$3300(localSemanticsNode));
      }
    }
    else if (!SemanticsNode.access$2000(localSemanticsNode, Flag.SCOPES_ROUTE))
    {
      localObject1 = SemanticsNode.access$3400(localSemanticsNode);
      localObject2 = localObject1;
      if (i < 28)
      {
        localObject2 = localObject1;
        if (SemanticsNode.access$3500(localSemanticsNode) != null)
        {
          localObject2 = localObject3;
          if (localObject1 != null) {
            localObject2 = localObject1;
          }
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append(localObject2);
          ((StringBuilder)localObject1).append("\n");
          ((StringBuilder)localObject1).append(SemanticsNode.access$3500(localSemanticsNode));
          localObject2 = ((StringBuilder)localObject1).toString();
        }
      }
      if (localObject2 != null) {
        localAccessibilityNodeInfo.setContentDescription((CharSequence)localObject2);
      }
    }
    if ((i >= 28) && (SemanticsNode.access$3500(localSemanticsNode) != null)) {
      android.support.v4.media.session.b.l(localAccessibilityNodeInfo, SemanticsNode.access$3500(localSemanticsNode));
    }
    boolean bool3 = SemanticsNode.access$2000(localSemanticsNode, Flag.HAS_CHECKED_STATE);
    boolean bool4 = SemanticsNode.access$2000(localSemanticsNode, Flag.HAS_TOGGLED_STATE);
    boolean bool2 = bool1;
    if (!bool3) {
      if (bool4) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    localAccessibilityNodeInfo.setCheckable(bool2);
    if (bool3)
    {
      localAccessibilityNodeInfo.setChecked(SemanticsNode.access$2000(localSemanticsNode, Flag.IS_CHECKED));
      if (SemanticsNode.access$2000(localSemanticsNode, Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
        localObject1 = "android.widget.RadioButton";
      } else {
        localObject1 = "android.widget.CheckBox";
      }
    }
    else
    {
      if (!bool4) {
        break label1720;
      }
      localAccessibilityNodeInfo.setChecked(SemanticsNode.access$2000(localSemanticsNode, Flag.IS_TOGGLED));
      localObject1 = "android.widget.Switch";
    }
    localAccessibilityNodeInfo.setClassName((CharSequence)localObject1);
    label1720:
    localAccessibilityNodeInfo.setSelected(SemanticsNode.access$2000(localSemanticsNode, Flag.IS_SELECTED));
    if (i >= 28) {
      android.support.v4.media.session.b.s(localAccessibilityNodeInfo, SemanticsNode.access$2000(localSemanticsNode, Flag.IS_HEADER));
    }
    localObject1 = accessibilityFocusedSemanticsNode;
    if ((localObject1 != null) && (SemanticsNode.access$000((SemanticsNode)localObject1) == paramInt)) {
      paramInt = 128;
    } else {
      paramInt = 64;
    }
    localAccessibilityNodeInfo.addAction(paramInt);
    if (SemanticsNode.access$3600(localSemanticsNode) != null)
    {
      localObject2 = SemanticsNode.access$3600(localSemanticsNode).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (CustomAccessibilityAction)((Iterator)localObject2).next();
        localAccessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(CustomAccessibilityAction.access$3700((CustomAccessibilityAction)localObject1), CustomAccessibilityAction.access$3800((CustomAccessibilityAction)localObject1)));
      }
    }
    localObject3 = SemanticsNode.access$3900(localSemanticsNode).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = (SemanticsNode)((Iterator)localObject3).next();
      if (!SemanticsNode.access$2000((SemanticsNode)localObject1, Flag.IS_HIDDEN))
      {
        if (SemanticsNode.access$1600((SemanticsNode)localObject1) != -1)
        {
          localObject2 = platformViewsAccessibilityDelegate.getPlatformViewById(SemanticsNode.access$1600((SemanticsNode)localObject1));
          if (!platformViewsAccessibilityDelegate.usesVirtualDisplay(SemanticsNode.access$1600((SemanticsNode)localObject1)))
          {
            localAccessibilityNodeInfo.addChild((View)localObject2);
            continue;
          }
        }
        localAccessibilityNodeInfo.addChild(rootAccessibilityView, SemanticsNode.access$000((SemanticsNode)localObject1));
      }
    }
    return localAccessibilityNodeInfo;
  }
  
  public boolean externalViewRequestSendAccessibilityEvent(View paramView1, View paramView2, AccessibilityEvent paramAccessibilityEvent)
  {
    if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(paramView1, paramView2, paramAccessibilityEvent)) {
      return false;
    }
    paramView1 = accessibilityViewEmbedder.getRecordFlutterId(paramView1, paramAccessibilityEvent);
    if (paramView1 == null) {
      return false;
    }
    int i = paramAccessibilityEvent.getEventType();
    if (i != 8)
    {
      if (i != 128)
      {
        if (i != 32768)
        {
          if (i == 65536)
          {
            embeddedInputFocusedNodeId = null;
            embeddedAccessibilityFocusedNodeId = null;
          }
        }
        else
        {
          embeddedAccessibilityFocusedNodeId = paramView1;
          accessibilityFocusedSemanticsNode = null;
        }
      }
      else {
        hoveredObject = null;
      }
    }
    else
    {
      embeddedInputFocusedNodeId = paramView1;
      inputFocusedSemanticsNode = null;
    }
    return true;
  }
  
  public AccessibilityNodeInfo findFocus(int paramInt)
  {
    Object localObject;
    if (paramInt != 1)
    {
      if (paramInt != 2) {
        break label74;
      }
    }
    else
    {
      localObject = inputFocusedSemanticsNode;
      if (localObject != null)
      {
        paramInt = SemanticsNode.access$000((SemanticsNode)localObject);
        label27:
        return createAccessibilityNodeInfo(paramInt);
      }
      localObject = embeddedInputFocusedNodeId;
      if (localObject == null) {}
    }
    do
    {
      paramInt = ((Integer)localObject).intValue();
      break label27;
      localObject = accessibilityFocusedSemanticsNode;
      if (localObject != null) {
        break;
      }
      localObject = embeddedAccessibilityFocusedNodeId;
    } while (localObject != null);
    label74:
    return null;
  }
  
  public boolean getAccessibleNavigation()
  {
    return accessibleNavigation;
  }
  
  public int getHoveredObjectId()
  {
    return SemanticsNode.access$000(hoveredObject);
  }
  
  public boolean isAccessibilityEnabled()
  {
    return accessibilityManager.isEnabled();
  }
  
  public boolean isTouchExplorationEnabled()
  {
    return accessibilityManager.isTouchExplorationEnabled();
  }
  
  public AccessibilityEvent obtainAccessibilityEvent(int paramInt)
  {
    return AccessibilityEvent.obtain(paramInt);
  }
  
  public AccessibilityNodeInfo obtainAccessibilityNodeInfo(View paramView)
  {
    return AccessibilityNodeInfo.obtain(paramView);
  }
  
  public AccessibilityNodeInfo obtainAccessibilityNodeInfo(View paramView, int paramInt)
  {
    return AccessibilityNodeInfo.obtain(paramView, paramInt);
  }
  
  public boolean onAccessibilityHoverEvent(MotionEvent paramMotionEvent)
  {
    return onAccessibilityHoverEvent(paramMotionEvent, false);
  }
  
  public boolean onAccessibilityHoverEvent(MotionEvent paramMotionEvent, boolean paramBoolean)
  {
    if (!accessibilityManager.isTouchExplorationEnabled()) {
      return false;
    }
    if (flutterSemanticsTree.isEmpty()) {
      return false;
    }
    Object localObject = SemanticsNode.access$4700(getRootSemanticsNode(), new float[] { paramMotionEvent.getX(), paramMotionEvent.getY(), 0.0F, 1.0F }, paramBoolean);
    if ((localObject != null) && (SemanticsNode.access$1600((SemanticsNode)localObject) != -1))
    {
      if (paramBoolean) {
        return false;
      }
      return accessibilityViewEmbedder.onAccessibilityHoverEvent(SemanticsNode.access$000((SemanticsNode)localObject), paramMotionEvent);
    }
    if ((paramMotionEvent.getAction() != 9) && (paramMotionEvent.getAction() != 7))
    {
      if (paramMotionEvent.getAction() == 10)
      {
        onTouchExplorationExit();
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("unexpected accessibility hover event: ");
        ((StringBuilder)localObject).append(paramMotionEvent);
        Log.d("flutter", ((StringBuilder)localObject).toString());
        return false;
      }
    }
    else {
      handleTouchExploration(paramMotionEvent.getX(), paramMotionEvent.getY(), paramBoolean);
    }
    return true;
  }
  
  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    if (paramInt1 >= 65536)
    {
      boolean bool = accessibilityViewEmbedder.performAction(paramInt1, paramInt2, paramBundle);
      if ((bool) && (paramInt2 == 128)) {
        embeddedAccessibilityFocusedNodeId = null;
      }
      return bool;
    }
    SemanticsNode localSemanticsNode = (SemanticsNode)flutterSemanticsTree.get(Integer.valueOf(paramInt1));
    int i = 0;
    if (localSemanticsNode == null) {
      return false;
    }
    switch (paramInt2)
    {
    default: 
      i = FIRST_RESOURCE_ID;
      paramBundle = (CustomAccessibilityAction)customAccessibilityActions.get(Integer.valueOf(paramInt2 - i));
      if (paramBundle != null)
      {
        accessibilityChannel.dispatchSemanticsAction(paramInt1, Action.CUSTOM_ACTION, Integer.valueOf(CustomAccessibilityAction.access$4600(paramBundle)));
        return true;
      }
      break;
    case 16908342: 
      accessibilityChannel.dispatchSemanticsAction(paramInt1, Action.SHOW_ON_SCREEN);
      return true;
    case 2097152: 
      return performSetText(localSemanticsNode, paramInt1, paramBundle);
    case 1048576: 
      accessibilityChannel.dispatchSemanticsAction(paramInt1, Action.DISMISS);
      return true;
    case 131072: 
      HashMap localHashMap = new HashMap();
      paramInt2 = i;
      if (paramBundle != null)
      {
        paramInt2 = i;
        if (paramBundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT"))
        {
          paramInt2 = i;
          if (paramBundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
            paramInt2 = 1;
          }
        }
      }
      if (paramInt2 != 0)
      {
        localHashMap.put("base", Integer.valueOf(paramBundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
        paramInt2 = paramBundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
      }
      else
      {
        localHashMap.put("base", Integer.valueOf(SemanticsNode.access$2200(localSemanticsNode)));
        paramInt2 = SemanticsNode.access$2200(localSemanticsNode);
      }
      localHashMap.put("extent", Integer.valueOf(paramInt2));
      accessibilityChannel.dispatchSemanticsAction(paramInt1, Action.SET_SELECTION, localHashMap);
      paramBundle = (SemanticsNode)flutterSemanticsTree.get(Integer.valueOf(paramInt1));
      SemanticsNode.access$2102(paramBundle, ((Integer)localHashMap.get("base")).intValue());
      SemanticsNode.access$2202(paramBundle, ((Integer)localHashMap.get("extent")).intValue());
      return true;
    case 65536: 
      accessibilityChannel.dispatchSemanticsAction(paramInt1, Action.CUT);
      return true;
    case 32768: 
      accessibilityChannel.dispatchSemanticsAction(paramInt1, Action.PASTE);
      return true;
    case 16384: 
      accessibilityChannel.dispatchSemanticsAction(paramInt1, Action.COPY);
      return true;
    case 8192: 
      paramBundle = Action.SCROLL_DOWN;
      if (SemanticsNode.access$2300(localSemanticsNode, paramBundle)) {}
      for (;;)
      {
        accessibilityChannel.dispatchSemanticsAction(paramInt1, paramBundle);
        break;
        paramBundle = Action.SCROLL_RIGHT;
        if (!SemanticsNode.access$2300(localSemanticsNode, paramBundle))
        {
          paramBundle = Action.DECREASE;
          if (!SemanticsNode.access$2300(localSemanticsNode, paramBundle)) {
            break label590;
          }
          SemanticsNode.access$2502(localSemanticsNode, SemanticsNode.access$4400(localSemanticsNode));
          SemanticsNode.access$4202(localSemanticsNode, SemanticsNode.access$4500(localSemanticsNode));
          sendAccessibilityEvent(paramInt1, 4);
        }
      }
      return true;
      return false;
    case 4096: 
      paramBundle = Action.SCROLL_UP;
      if (SemanticsNode.access$2300(localSemanticsNode, paramBundle)) {}
      for (;;)
      {
        accessibilityChannel.dispatchSemanticsAction(paramInt1, paramBundle);
        break;
        paramBundle = Action.SCROLL_LEFT;
        if (!SemanticsNode.access$2300(localSemanticsNode, paramBundle))
        {
          paramBundle = Action.INCREASE;
          if (!SemanticsNode.access$2300(localSemanticsNode, paramBundle)) {
            break label679;
          }
          SemanticsNode.access$2502(localSemanticsNode, SemanticsNode.access$4100(localSemanticsNode));
          SemanticsNode.access$4202(localSemanticsNode, SemanticsNode.access$4300(localSemanticsNode));
          sendAccessibilityEvent(paramInt1, 4);
        }
      }
      return true;
      return false;
    case 512: 
      return performCursorMoveAction(localSemanticsNode, paramInt1, paramBundle, false);
    case 256: 
      return performCursorMoveAction(localSemanticsNode, paramInt1, paramBundle, true);
    case 128: 
      paramBundle = accessibilityFocusedSemanticsNode;
      if ((paramBundle != null) && (SemanticsNode.access$000(paramBundle) == paramInt1)) {
        accessibilityFocusedSemanticsNode = null;
      }
      paramBundle = embeddedAccessibilityFocusedNodeId;
      if ((paramBundle != null) && (paramBundle.intValue() == paramInt1)) {
        embeddedAccessibilityFocusedNodeId = null;
      }
      accessibilityChannel.dispatchSemanticsAction(paramInt1, Action.DID_LOSE_ACCESSIBILITY_FOCUS);
      sendAccessibilityEvent(paramInt1, 65536);
      return true;
    case 64: 
      if (accessibilityFocusedSemanticsNode == null) {
        rootAccessibilityView.invalidate();
      }
      accessibilityFocusedSemanticsNode = localSemanticsNode;
      accessibilityChannel.dispatchSemanticsAction(paramInt1, Action.DID_GAIN_ACCESSIBILITY_FOCUS);
      paramBundle = new HashMap();
      paramBundle.put("type", "didGainFocus");
      paramBundle.put("nodeId", Integer.valueOf(SemanticsNode.access$000(localSemanticsNode)));
      accessibilityChannel.channel.send(paramBundle);
      sendAccessibilityEvent(paramInt1, 32768);
      if ((SemanticsNode.access$2300(localSemanticsNode, Action.INCREASE)) || (SemanticsNode.access$2300(localSemanticsNode, Action.DECREASE))) {
        sendAccessibilityEvent(paramInt1, 4);
      }
      return true;
    case 32: 
      accessibilityChannel.dispatchSemanticsAction(paramInt1, Action.LONG_PRESS);
      return true;
    case 16: 
      label590:
      label679:
      accessibilityChannel.dispatchSemanticsAction(paramInt1, Action.TAP);
      return true;
    }
    return false;
  }
  
  public void release()
  {
    isReleased = true;
    platformViewsAccessibilityDelegate.detachAccessibilityBridge();
    setOnAccessibilityChangeListener(null);
    accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    contentResolver.unregisterContentObserver(animationScaleObserver);
    accessibilityChannel.setAccessibilityMessageHandler(null);
  }
  
  public void reset()
  {
    flutterSemanticsTree.clear();
    SemanticsNode localSemanticsNode = accessibilityFocusedSemanticsNode;
    if (localSemanticsNode != null) {
      sendAccessibilityEvent(SemanticsNode.access$000(localSemanticsNode), 65536);
    }
    accessibilityFocusedSemanticsNode = null;
    hoveredObject = null;
    sendWindowContentChangeEvent(0);
  }
  
  public void sendAccessibilityEvent(int paramInt1, int paramInt2)
  {
    if (!accessibilityManager.isEnabled()) {
      return;
    }
    sendAccessibilityEvent(obtainAccessibilityEvent(paramInt1, paramInt2));
  }
  
  public void setOnAccessibilityChangeListener(OnAccessibilityChangeListener paramOnAccessibilityChangeListener)
  {
    onAccessibilityChangeListener = paramOnAccessibilityChangeListener;
  }
  
  public void updateCustomAccessibilityActions(ByteBuffer paramByteBuffer, String[] paramArrayOfString)
  {
    while (paramByteBuffer.hasRemaining())
    {
      CustomAccessibilityAction localCustomAccessibilityAction = getOrCreateAccessibilityAction(paramByteBuffer.getInt());
      CustomAccessibilityAction.access$4802(localCustomAccessibilityAction, paramByteBuffer.getInt());
      int i = paramByteBuffer.getInt();
      Object localObject1 = null;
      Object localObject2;
      if (i == -1) {
        localObject2 = null;
      } else {
        localObject2 = paramArrayOfString[i];
      }
      CustomAccessibilityAction.access$3802(localCustomAccessibilityAction, (String)localObject2);
      i = paramByteBuffer.getInt();
      if (i == -1) {
        localObject2 = localObject1;
      } else {
        localObject2 = paramArrayOfString[i];
      }
      CustomAccessibilityAction.access$3002(localCustomAccessibilityAction, (String)localObject2);
    }
  }
  
  public void updateSemantics(ByteBuffer paramByteBuffer, String[] paramArrayOfString, ByteBuffer[] paramArrayOfByteBuffer)
  {
    Object localObject1 = new ArrayList();
    while (paramByteBuffer.hasRemaining())
    {
      localObject2 = getOrCreateSemanticsNode(paramByteBuffer.getInt());
      SemanticsNode.access$4900((SemanticsNode)localObject2, paramByteBuffer, paramArrayOfString, paramArrayOfByteBuffer);
      if (!SemanticsNode.access$2000((SemanticsNode)localObject2, Flag.IS_HIDDEN))
      {
        if (SemanticsNode.access$2000((SemanticsNode)localObject2, Flag.IS_FOCUSED)) {
          inputFocusedSemanticsNode = ((SemanticsNode)localObject2);
        }
        if (SemanticsNode.access$5000((SemanticsNode)localObject2)) {
          ((ArrayList)localObject1).add(localObject2);
        }
        if ((SemanticsNode.access$1600((SemanticsNode)localObject2) != -1) && (!platformViewsAccessibilityDelegate.usesVirtualDisplay(SemanticsNode.access$1600((SemanticsNode)localObject2))))
        {
          localObject2 = platformViewsAccessibilityDelegate.getPlatformViewById(SemanticsNode.access$1600((SemanticsNode)localObject2));
          if (localObject2 != null) {
            ((View)localObject2).setImportantForAccessibility(0);
          }
        }
      }
    }
    paramArrayOfByteBuffer = new HashSet();
    paramByteBuffer = getRootSemanticsNode();
    Object localObject2 = new ArrayList();
    if (paramByteBuffer != null)
    {
      paramArrayOfString = new float[16];
      Matrix.setIdentityM(paramArrayOfString, 0);
      boolean bool;
      if (Build.VERSION.SDK_INT >= 28) {
        bool = doesLayoutInDisplayCutoutModeRequireLeftInset();
      } else {
        bool = true;
      }
      if (bool)
      {
        localObject3 = rootAccessibilityView.getRootWindowInsets();
        if (localObject3 != null)
        {
          if (!lastLeftFrameInset.equals(Integer.valueOf(((WindowInsets)localObject3).getSystemWindowInsetLeft())))
          {
            SemanticsNode.access$5102(paramByteBuffer, true);
            SemanticsNode.access$5202(paramByteBuffer, true);
          }
          localObject3 = Integer.valueOf(((WindowInsets)localObject3).getSystemWindowInsetLeft());
          lastLeftFrameInset = ((Integer)localObject3);
          Matrix.translateM(paramArrayOfString, 0, ((Integer)localObject3).intValue(), 0.0F, 0.0F);
        }
      }
      SemanticsNode.access$5300(paramByteBuffer, paramArrayOfString, paramArrayOfByteBuffer, false);
      SemanticsNode.access$5400(paramByteBuffer, (List)localObject2);
    }
    Object localObject3 = ((ArrayList)localObject2).iterator();
    paramByteBuffer = null;
    while (((Iterator)localObject3).hasNext())
    {
      paramArrayOfString = (SemanticsNode)((Iterator)localObject3).next();
      if (!flutterNavigationStack.contains(Integer.valueOf(SemanticsNode.access$000(paramArrayOfString)))) {
        paramByteBuffer = paramArrayOfString;
      }
    }
    paramArrayOfString = paramByteBuffer;
    if (paramByteBuffer == null)
    {
      paramArrayOfString = paramByteBuffer;
      if (((ArrayList)localObject2).size() > 0) {
        paramArrayOfString = (SemanticsNode)((ArrayList)localObject2).get(((ArrayList)localObject2).size() - 1);
      }
    }
    if ((paramArrayOfString != null) && ((SemanticsNode.access$000(paramArrayOfString) != previousRouteId) || (((ArrayList)localObject2).size() != flutterNavigationStack.size())))
    {
      previousRouteId = SemanticsNode.access$000(paramArrayOfString);
      onWindowNameChange(paramArrayOfString);
    }
    flutterNavigationStack.clear();
    paramArrayOfString = ((ArrayList)localObject2).iterator();
    while (paramArrayOfString.hasNext())
    {
      paramByteBuffer = (SemanticsNode)paramArrayOfString.next();
      flutterNavigationStack.add(Integer.valueOf(SemanticsNode.access$000(paramByteBuffer)));
    }
    paramArrayOfString = flutterSemanticsTree.entrySet().iterator();
    while (paramArrayOfString.hasNext())
    {
      paramByteBuffer = (SemanticsNode)((Map.Entry)paramArrayOfString.next()).getValue();
      if (!paramArrayOfByteBuffer.contains(paramByteBuffer))
      {
        willRemoveSemanticsNode(paramByteBuffer);
        paramArrayOfString.remove();
      }
    }
    sendWindowContentChangeEvent(0);
    paramArrayOfByteBuffer = ((ArrayList)localObject1).iterator();
    while (paramArrayOfByteBuffer.hasNext())
    {
      localObject1 = (SemanticsNode)paramArrayOfByteBuffer.next();
      if (SemanticsNode.access$5500((SemanticsNode)localObject1))
      {
        paramArrayOfString = obtainAccessibilityEvent(SemanticsNode.access$000((SemanticsNode)localObject1), 4096);
        float f1 = SemanticsNode.access$5600((SemanticsNode)localObject1);
        float f2 = SemanticsNode.access$5700((SemanticsNode)localObject1);
        float f3 = f1;
        if (Float.isInfinite(SemanticsNode.access$5700((SemanticsNode)localObject1)))
        {
          f3 = f1;
          if (f1 > 70000.0F) {
            f3 = 70000.0F;
          }
          f2 = 100000.0F;
        }
        if (Float.isInfinite(SemanticsNode.access$5800((SemanticsNode)localObject1)))
        {
          f2 += 100000.0F;
          f1 = f3;
          if (f3 < -70000.0F) {
            f1 = -70000.0F;
          }
          f1 += 100000.0F;
          f3 = f2;
        }
        else
        {
          f1 = f2 - SemanticsNode.access$5800((SemanticsNode)localObject1);
          f2 = f3 - SemanticsNode.access$5800((SemanticsNode)localObject1);
          f3 = f1;
          f1 = f2;
        }
        if ((!SemanticsNode.access$5900((SemanticsNode)localObject1, Action.SCROLL_UP)) && (!SemanticsNode.access$5900((SemanticsNode)localObject1, Action.SCROLL_DOWN)))
        {
          if ((SemanticsNode.access$5900((SemanticsNode)localObject1, Action.SCROLL_LEFT)) || (SemanticsNode.access$5900((SemanticsNode)localObject1, Action.SCROLL_RIGHT)))
          {
            paramArrayOfString.setScrollX((int)f1);
            paramArrayOfString.setMaxScrollX((int)f3);
          }
        }
        else
        {
          paramArrayOfString.setScrollY((int)f1);
          paramArrayOfString.setMaxScrollY((int)f3);
        }
        if (SemanticsNode.access$1400((SemanticsNode)localObject1) > 0)
        {
          paramArrayOfString.setItemCount(SemanticsNode.access$1400((SemanticsNode)localObject1));
          paramArrayOfString.setFromIndex(SemanticsNode.access$6000((SemanticsNode)localObject1));
          paramByteBuffer = SemanticsNode.access$6100((SemanticsNode)localObject1).iterator();
          int i = 0;
          while (paramByteBuffer.hasNext()) {
            if (!SemanticsNode.access$2000((SemanticsNode)paramByteBuffer.next(), Flag.IS_HIDDEN)) {
              i++;
            }
          }
          paramArrayOfString.setToIndex(SemanticsNode.access$6000((SemanticsNode)localObject1) + i - 1);
        }
        sendAccessibilityEvent(paramArrayOfString);
      }
      if ((SemanticsNode.access$2000((SemanticsNode)localObject1, Flag.IS_LIVE_REGION)) && (SemanticsNode.access$6200((SemanticsNode)localObject1))) {
        sendWindowContentChangeEvent(SemanticsNode.access$000((SemanticsNode)localObject1));
      }
      paramByteBuffer = accessibilityFocusedSemanticsNode;
      if ((paramByteBuffer != null) && (SemanticsNode.access$000(paramByteBuffer) == SemanticsNode.access$000((SemanticsNode)localObject1)))
      {
        paramByteBuffer = Flag.IS_SELECTED;
        if ((!SemanticsNode.access$6300((SemanticsNode)localObject1, paramByteBuffer)) && (SemanticsNode.access$2000((SemanticsNode)localObject1, paramByteBuffer)))
        {
          paramByteBuffer = obtainAccessibilityEvent(SemanticsNode.access$000((SemanticsNode)localObject1), 4);
          paramByteBuffer.getText().add(SemanticsNode.access$6400((SemanticsNode)localObject1));
          sendAccessibilityEvent(paramByteBuffer);
        }
      }
      paramByteBuffer = inputFocusedSemanticsNode;
      if ((paramByteBuffer != null) && (SemanticsNode.access$000(paramByteBuffer) == SemanticsNode.access$000((SemanticsNode)localObject1)))
      {
        paramByteBuffer = lastInputFocusedSemanticsNode;
        if ((paramByteBuffer == null) || (SemanticsNode.access$000(paramByteBuffer) != SemanticsNode.access$000(inputFocusedSemanticsNode)))
        {
          lastInputFocusedSemanticsNode = inputFocusedSemanticsNode;
          sendAccessibilityEvent(obtainAccessibilityEvent(SemanticsNode.access$000((SemanticsNode)localObject1), 8));
          break label1066;
        }
      }
      if (inputFocusedSemanticsNode == null) {
        lastInputFocusedSemanticsNode = null;
      }
      label1066:
      paramByteBuffer = inputFocusedSemanticsNode;
      if ((paramByteBuffer != null) && (SemanticsNode.access$000(paramByteBuffer) == SemanticsNode.access$000((SemanticsNode)localObject1)))
      {
        paramByteBuffer = Flag.IS_TEXT_FIELD;
        if ((SemanticsNode.access$6300((SemanticsNode)localObject1, paramByteBuffer)) && (SemanticsNode.access$2000((SemanticsNode)localObject1, paramByteBuffer)))
        {
          paramByteBuffer = accessibilityFocusedSemanticsNode;
          if ((paramByteBuffer == null) || (SemanticsNode.access$000(paramByteBuffer) == SemanticsNode.access$000(inputFocusedSemanticsNode)))
          {
            paramByteBuffer = SemanticsNode.access$6500((SemanticsNode)localObject1);
            paramArrayOfString = "";
            if (paramByteBuffer != null) {
              paramByteBuffer = SemanticsNode.access$6500((SemanticsNode)localObject1);
            } else {
              paramByteBuffer = "";
            }
            if (SemanticsNode.access$2500((SemanticsNode)localObject1) != null) {
              paramArrayOfString = SemanticsNode.access$2500((SemanticsNode)localObject1);
            }
            paramByteBuffer = createTextChangedEvent(SemanticsNode.access$000((SemanticsNode)localObject1), paramByteBuffer, paramArrayOfString);
            if (paramByteBuffer != null) {
              sendAccessibilityEvent(paramByteBuffer);
            }
            if ((SemanticsNode.access$6600((SemanticsNode)localObject1) != SemanticsNode.access$2100((SemanticsNode)localObject1)) || (SemanticsNode.access$6700((SemanticsNode)localObject1) != SemanticsNode.access$2200((SemanticsNode)localObject1)))
            {
              paramByteBuffer = obtainAccessibilityEvent(SemanticsNode.access$000((SemanticsNode)localObject1), 8192);
              paramByteBuffer.getText().add(paramArrayOfString);
              paramByteBuffer.setFromIndex(SemanticsNode.access$2100((SemanticsNode)localObject1));
              paramByteBuffer.setToIndex(SemanticsNode.access$2200((SemanticsNode)localObject1));
              paramByteBuffer.setItemCount(paramArrayOfString.length());
              sendAccessibilityEvent(paramByteBuffer);
            }
          }
        }
      }
    }
  }
  
  public static enum AccessibilityFeature
  {
    public final int value;
    
    static
    {
      DISABLE_ANIMATIONS = new AccessibilityFeature("DISABLE_ANIMATIONS", 2, 4);
      BOLD_TEXT = new AccessibilityFeature("BOLD_TEXT", 3, 8);
      REDUCE_MOTION = new AccessibilityFeature("REDUCE_MOTION", 4, 16);
      HIGH_CONTRAST = new AccessibilityFeature("HIGH_CONTRAST", 5, 32);
      ON_OFF_SWITCH_LABELS = new AccessibilityFeature("ON_OFF_SWITCH_LABELS", 6, 64);
    }
    
    private AccessibilityFeature(int paramInt)
    {
      value = paramInt;
    }
  }
  
  public static enum Action
  {
    public final int value;
    
    static
    {
      LONG_PRESS = new Action("LONG_PRESS", 1, 2);
      SCROLL_LEFT = new Action("SCROLL_LEFT", 2, 4);
      SCROLL_RIGHT = new Action("SCROLL_RIGHT", 3, 8);
      SCROLL_UP = new Action("SCROLL_UP", 4, 16);
      SCROLL_DOWN = new Action("SCROLL_DOWN", 5, 32);
      INCREASE = new Action("INCREASE", 6, 64);
      DECREASE = new Action("DECREASE", 7, 128);
      SHOW_ON_SCREEN = new Action("SHOW_ON_SCREEN", 8, 256);
      MOVE_CURSOR_FORWARD_BY_CHARACTER = new Action("MOVE_CURSOR_FORWARD_BY_CHARACTER", 9, 512);
      MOVE_CURSOR_BACKWARD_BY_CHARACTER = new Action("MOVE_CURSOR_BACKWARD_BY_CHARACTER", 10, 1024);
      SET_SELECTION = new Action("SET_SELECTION", 11, 2048);
      COPY = new Action("COPY", 12, 4096);
      CUT = new Action("CUT", 13, 8192);
      PASTE = new Action("PASTE", 14, 16384);
      DID_GAIN_ACCESSIBILITY_FOCUS = new Action("DID_GAIN_ACCESSIBILITY_FOCUS", 15, 32768);
      DID_LOSE_ACCESSIBILITY_FOCUS = new Action("DID_LOSE_ACCESSIBILITY_FOCUS", 16, 65536);
      CUSTOM_ACTION = new Action("CUSTOM_ACTION", 17, 131072);
      DISMISS = new Action("DISMISS", 18, 262144);
      MOVE_CURSOR_FORWARD_BY_WORD = new Action("MOVE_CURSOR_FORWARD_BY_WORD", 19, 524288);
      MOVE_CURSOR_BACKWARD_BY_WORD = new Action("MOVE_CURSOR_BACKWARD_BY_WORD", 20, 1048576);
      SET_TEXT = new Action("SET_TEXT", 21, 2097152);
      FOCUS = new Action("FOCUS", 22, 4194304);
      SCROLL_TO_OFFSET = new Action("SCROLL_TO_OFFSET", 23, 8388608);
    }
    
    private Action(int paramInt)
    {
      value = paramInt;
    }
  }
  
  public static class CustomAccessibilityAction
  {
    private String hint;
    private int id = -1;
    private String label;
    private int overrideId = -1;
    private int resourceId = -1;
  }
  
  public static enum Flag
  {
    public final int value;
    
    static
    {
      IS_BUTTON = new Flag("IS_BUTTON", 3, 8);
      IS_TEXT_FIELD = new Flag("IS_TEXT_FIELD", 4, 16);
      IS_FOCUSED = new Flag("IS_FOCUSED", 5, 32);
      HAS_ENABLED_STATE = new Flag("HAS_ENABLED_STATE", 6, 64);
      IS_ENABLED = new Flag("IS_ENABLED", 7, 128);
      IS_IN_MUTUALLY_EXCLUSIVE_GROUP = new Flag("IS_IN_MUTUALLY_EXCLUSIVE_GROUP", 8, 256);
      IS_HEADER = new Flag("IS_HEADER", 9, 512);
      IS_OBSCURED = new Flag("IS_OBSCURED", 10, 1024);
      SCOPES_ROUTE = new Flag("SCOPES_ROUTE", 11, 2048);
      NAMES_ROUTE = new Flag("NAMES_ROUTE", 12, 4096);
      IS_HIDDEN = new Flag("IS_HIDDEN", 13, 8192);
      IS_IMAGE = new Flag("IS_IMAGE", 14, 16384);
      IS_LIVE_REGION = new Flag("IS_LIVE_REGION", 15, 32768);
      HAS_TOGGLED_STATE = new Flag("HAS_TOGGLED_STATE", 16, 65536);
      IS_TOGGLED = new Flag("IS_TOGGLED", 17, 131072);
      HAS_IMPLICIT_SCROLLING = new Flag("HAS_IMPLICIT_SCROLLING", 18, 262144);
      IS_MULTILINE = new Flag("IS_MULTILINE", 19, 524288);
      IS_READ_ONLY = new Flag("IS_READ_ONLY", 20, 1048576);
      IS_FOCUSABLE = new Flag("IS_FOCUSABLE", 21, 2097152);
      IS_LINK = new Flag("IS_LINK", 22, 4194304);
      IS_SLIDER = new Flag("IS_SLIDER", 23, 8388608);
      IS_KEYBOARD_KEY = new Flag("IS_KEYBOARD_KEY", 24, 16777216);
      IS_CHECK_STATE_MIXED = new Flag("IS_CHECK_STATE_MIXED", 25, 33554432);
      HAS_EXPANDED_STATE = new Flag("HAS_EXPANDED_STATE", 26, 67108864);
      IS_EXPANDED = new Flag("IS_EXPANDED", 27, 134217728);
      HAS_SELECTED_STATE = new Flag("HAS_SELECTED_STATE", 28, 268435456);
    }
    
    private Flag(int paramInt)
    {
      value = paramInt;
    }
  }
  
  public static class LocaleStringAttribute
    extends AccessibilityBridge.StringAttribute
  {
    public String locale;
    
    private LocaleStringAttribute()
    {
      super();
    }
  }
  
  public static abstract interface OnAccessibilityChangeListener
  {
    public abstract void onAccessibilityChanged(boolean paramBoolean1, boolean paramBoolean2);
  }
  
  public static class SemanticsNode
  {
    public final AccessibilityBridge accessibilityBridge;
    private int actions;
    private float bottom;
    private List<SemanticsNode> childrenInHitTestOrder = new ArrayList();
    private List<SemanticsNode> childrenInTraversalOrder = new ArrayList();
    private int currentValueLength;
    private List<AccessibilityBridge.CustomAccessibilityAction> customAccessibilityActions;
    private String decreasedValue;
    private List<AccessibilityBridge.StringAttribute> decreasedValueAttributes;
    private int flags;
    private boolean globalGeometryDirty = true;
    private Rect globalRect;
    private float[] globalTransform;
    private boolean hadPreviousConfig = false;
    private String hint;
    private List<AccessibilityBridge.StringAttribute> hintAttributes;
    private int id = -1;
    private String identifier;
    private String increasedValue;
    private List<AccessibilityBridge.StringAttribute> increasedValueAttributes;
    private float[] inverseTransform;
    private boolean inverseTransformDirty = true;
    private String label;
    private List<AccessibilityBridge.StringAttribute> labelAttributes;
    private float left;
    private int maxValueLength;
    private AccessibilityBridge.CustomAccessibilityAction onLongPressOverride;
    private AccessibilityBridge.CustomAccessibilityAction onTapOverride;
    private SemanticsNode parent;
    private int platformViewId;
    private int previousActions;
    private int previousFlags;
    private String previousLabel;
    private int previousNodeId = -1;
    private float previousScrollExtentMax;
    private float previousScrollExtentMin;
    private float previousScrollPosition;
    private int previousTextSelectionBase;
    private int previousTextSelectionExtent;
    private String previousValue;
    private float right;
    private int scrollChildren;
    private float scrollExtentMax;
    private float scrollExtentMin;
    private int scrollIndex;
    private float scrollPosition;
    private AccessibilityBridge.TextDirection textDirection;
    private int textSelectionBase;
    private int textSelectionExtent;
    private String tooltip;
    private float top;
    private float[] transform;
    private String value;
    private List<AccessibilityBridge.StringAttribute> valueAttributes;
    
    public SemanticsNode(AccessibilityBridge paramAccessibilityBridge)
    {
      accessibilityBridge = paramAccessibilityBridge;
    }
    
    private void collectRoutes(List<SemanticsNode> paramList)
    {
      if (hasFlag(AccessibilityBridge.Flag.SCOPES_ROUTE)) {
        paramList.add(this);
      }
      Iterator localIterator = childrenInTraversalOrder.iterator();
      while (localIterator.hasNext()) {
        ((SemanticsNode)localIterator.next()).collectRoutes(paramList);
      }
    }
    
    private SpannableString createSpannableString(String paramString, List<AccessibilityBridge.StringAttribute> paramList)
    {
      if (paramString == null) {
        return null;
      }
      paramString = new SpannableString(paramString);
      if (paramList != null)
      {
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          AccessibilityBridge.StringAttribute localStringAttribute = (AccessibilityBridge.StringAttribute)paramList.next();
          int i = AccessibilityBridge.5.$SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType[type.ordinal()];
          if (i != 1)
          {
            if (i == 2) {
              paramString.setSpan(new LocaleSpan(Locale.forLanguageTag(locale)), start, end, 0);
            }
          }
          else {
            paramString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), start, end, 0);
          }
        }
      }
      return paramString;
    }
    
    private boolean didChangeLabel()
    {
      String str1 = label;
      boolean bool = false;
      if ((str1 == null) && (previousLabel == null)) {
        return false;
      }
      if (str1 != null)
      {
        String str2 = previousLabel;
        if ((str2 != null) && (str1.equals(str2))) {}
      }
      else
      {
        bool = true;
      }
      return bool;
    }
    
    private boolean didScroll()
    {
      boolean bool;
      if ((!Float.isNaN(scrollPosition)) && (!Float.isNaN(previousScrollPosition)) && (previousScrollPosition != scrollPosition)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private void ensureInverseTransform()
    {
      if (!inverseTransformDirty) {
        return;
      }
      inverseTransformDirty = false;
      if (inverseTransform == null) {
        inverseTransform = new float[16];
      }
      if (!Matrix.invertM(inverseTransform, 0, transform, 0)) {
        Arrays.fill(inverseTransform, 0.0F);
      }
    }
    
    private SemanticsNode getAncestor(Predicate<SemanticsNode> paramPredicate)
    {
      for (SemanticsNode localSemanticsNode = parent; localSemanticsNode != null; localSemanticsNode = parent) {
        if (paramPredicate.test(localSemanticsNode)) {
          return localSemanticsNode;
        }
      }
      return null;
    }
    
    private Rect getGlobalRect()
    {
      return globalRect;
    }
    
    private CharSequence getHint()
    {
      return createSpannableString(hint, hintAttributes);
    }
    
    private CharSequence getLabel()
    {
      return createSpannableString(label, labelAttributes);
    }
    
    private String getRouteName()
    {
      if (hasFlag(AccessibilityBridge.Flag.NAMES_ROUTE))
      {
        localObject = label;
        if ((localObject != null) && (!((String)localObject).isEmpty())) {
          return label;
        }
      }
      Object localObject = childrenInTraversalOrder.iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = ((SemanticsNode)((Iterator)localObject).next()).getRouteName();
        if ((str != null) && (!str.isEmpty())) {
          return str;
        }
      }
      return null;
    }
    
    private List<AccessibilityBridge.StringAttribute> getStringAttributesFromBuffer(ByteBuffer paramByteBuffer, ByteBuffer[] paramArrayOfByteBuffer)
    {
      int i = paramByteBuffer.getInt();
      if (i == -1) {
        return null;
      }
      ArrayList localArrayList = new ArrayList(i);
      for (int j = 0; j < i; j++)
      {
        int k = paramByteBuffer.getInt();
        int m = paramByteBuffer.getInt();
        AccessibilityBridge.StringAttributeType localStringAttributeType = AccessibilityBridge.StringAttributeType.values()[paramByteBuffer.getInt()];
        int n = AccessibilityBridge.5.$SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType[localStringAttributeType.ordinal()];
        Object localObject;
        if (n != 1)
        {
          if (n == 2)
          {
            ByteBuffer localByteBuffer = paramArrayOfByteBuffer[paramByteBuffer.getInt()];
            localObject = new AccessibilityBridge.LocaleStringAttribute(null);
            start = k;
            end = m;
            type = localStringAttributeType;
            locale = Charset.forName("UTF-8").decode(localByteBuffer).toString();
            localArrayList.add(localObject);
          }
        }
        else
        {
          paramByteBuffer.getInt();
          localObject = new AccessibilityBridge.SpellOutStringAttribute(null);
          start = k;
          end = m;
          type = localStringAttributeType;
          localArrayList.add(localObject);
        }
      }
      return localArrayList;
    }
    
    private CharSequence getTextFieldHint()
    {
      CharSequence localCharSequence1 = getLabel();
      CharSequence localCharSequence2 = getHint();
      Object localObject1 = null;
      int i = 0;
      while (i < 2)
      {
        CharSequence localCharSequence3 = new CharSequence[] { localCharSequence1, localCharSequence2 }[i];
        Object localObject2 = localObject1;
        if (localCharSequence3 != null)
        {
          localObject2 = localObject1;
          if (localCharSequence3.length() > 0) {
            if ((localObject1 != null) && (((CharSequence)localObject1).length() != 0)) {
              localObject2 = TextUtils.concat(new CharSequence[] { localObject1, ", ", localCharSequence3 });
            } else {
              localObject2 = localCharSequence3;
            }
          }
        }
        i++;
        localObject1 = localObject2;
      }
      return (CharSequence)localObject1;
    }
    
    private CharSequence getValue()
    {
      return createSpannableString(value, valueAttributes);
    }
    
    private CharSequence getValueLabelHint()
    {
      CharSequence localCharSequence1 = getValue();
      CharSequence localCharSequence2 = getLabel();
      CharSequence localCharSequence3 = getHint();
      Object localObject1 = null;
      int i = 0;
      while (i < 3)
      {
        CharSequence localCharSequence4 = new CharSequence[] { localCharSequence1, localCharSequence2, localCharSequence3 }[i];
        Object localObject2 = localObject1;
        if (localCharSequence4 != null)
        {
          localObject2 = localObject1;
          if (localCharSequence4.length() > 0) {
            if ((localObject1 != null) && (((CharSequence)localObject1).length() != 0)) {
              localObject2 = TextUtils.concat(new CharSequence[] { localObject1, ", ", localCharSequence4 });
            } else {
              localObject2 = localCharSequence4;
            }
          }
        }
        i++;
        localObject1 = localObject2;
      }
      return (CharSequence)localObject1;
    }
    
    private boolean hadAction(AccessibilityBridge.Action paramAction)
    {
      int i = previousActions;
      boolean bool;
      if ((value & i) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private boolean hadFlag(AccessibilityBridge.Flag paramFlag)
    {
      int i = previousFlags;
      boolean bool;
      if ((value & i) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private boolean hasAction(AccessibilityBridge.Action paramAction)
    {
      int i = actions;
      boolean bool;
      if ((value & i) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private boolean hasFlag(AccessibilityBridge.Flag paramFlag)
    {
      int i = flags;
      boolean bool;
      if ((value & i) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private SemanticsNode hitTest(float[] paramArrayOfFloat, boolean paramBoolean)
    {
      float f1 = paramArrayOfFloat[3];
      int i = 0;
      float f2 = paramArrayOfFloat[0] / f1;
      float f3 = paramArrayOfFloat[1] / f1;
      f1 = left;
      Object localObject1 = null;
      Object localObject2 = localObject1;
      if (f2 >= f1)
      {
        localObject2 = localObject1;
        if (f2 < right)
        {
          localObject2 = localObject1;
          if (f3 >= top) {
            if (f3 >= bottom)
            {
              localObject2 = localObject1;
            }
            else
            {
              localObject2 = new float[4];
              Iterator localIterator = childrenInHitTestOrder.iterator();
              while (localIterator.hasNext())
              {
                SemanticsNode localSemanticsNode = (SemanticsNode)localIterator.next();
                if (!localSemanticsNode.hasFlag(AccessibilityBridge.Flag.IS_HIDDEN))
                {
                  localSemanticsNode.ensureInverseTransform();
                  Matrix.multiplyMV((float[])localObject2, 0, inverseTransform, 0, paramArrayOfFloat, 0);
                  localSemanticsNode = localSemanticsNode.hitTest((float[])localObject2, paramBoolean);
                  if (localSemanticsNode != null) {
                    return localSemanticsNode;
                  }
                }
              }
              int j = i;
              if (paramBoolean)
              {
                j = i;
                if (platformViewId != -1) {
                  j = 1;
                }
              }
              if (!isFocusable())
              {
                localObject2 = localObject1;
                if (j == 0) {}
              }
              else
              {
                localObject2 = this;
              }
            }
          }
        }
      }
      return (SemanticsNode)localObject2;
    }
    
    private boolean isFocusable()
    {
      boolean bool1 = hasFlag(AccessibilityBridge.Flag.SCOPES_ROUTE);
      boolean bool2 = false;
      if (bool1) {
        return false;
      }
      if (hasFlag(AccessibilityBridge.Flag.IS_FOCUSABLE)) {
        return true;
      }
      if (((actions & AccessibilityBridge.access$7400()) == 0) && ((flags & AccessibilityBridge.access$7500()) == 0))
      {
        String str = label;
        if ((str == null) || (str.isEmpty()))
        {
          str = value;
          if ((str == null) || (str.isEmpty()))
          {
            str = hint;
            bool1 = bool2;
            if (str == null) {
              return bool1;
            }
            bool1 = bool2;
            if (str.isEmpty()) {
              return bool1;
            }
          }
        }
      }
      bool1 = true;
      return bool1;
    }
    
    private void log(String paramString, boolean paramBoolean) {}
    
    private float max(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      return Math.max(paramFloat1, Math.max(paramFloat2, Math.max(paramFloat3, paramFloat4)));
    }
    
    private float min(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      return Math.min(paramFloat1, Math.min(paramFloat2, Math.min(paramFloat3, paramFloat4)));
    }
    
    private static boolean nullableHasAncestor(SemanticsNode paramSemanticsNode, Predicate<SemanticsNode> paramPredicate)
    {
      boolean bool;
      if ((paramSemanticsNode != null) && (paramSemanticsNode.getAncestor(paramPredicate) != null)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private void transformPoint(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
    {
      Matrix.multiplyMV(paramArrayOfFloat1, 0, paramArrayOfFloat2, 0, paramArrayOfFloat3, 0);
      float f = paramArrayOfFloat1[3];
      paramArrayOfFloat1[0] /= f;
      paramArrayOfFloat1[1] /= f;
      paramArrayOfFloat1[2] /= f;
      paramArrayOfFloat1[3] = 0.0F;
    }
    
    private void updateRecursively(float[] paramArrayOfFloat, Set<SemanticsNode> paramSet, boolean paramBoolean)
    {
      paramSet.add(this);
      if (globalGeometryDirty) {
        paramBoolean = true;
      }
      Object localObject;
      if (paramBoolean)
      {
        if (globalTransform == null) {
          globalTransform = new float[16];
        }
        if (transform == null) {
          transform = new float[16];
        }
        Matrix.multiplyMM(globalTransform, 0, paramArrayOfFloat, 0, transform, 0);
        paramArrayOfFloat = new float[4];
        paramArrayOfFloat[2] = 0.0F;
        paramArrayOfFloat[3] = 1.0F;
        float[] arrayOfFloat1 = new float[4];
        float[] arrayOfFloat2 = new float[4];
        localObject = new float[4];
        float[] arrayOfFloat3 = new float[4];
        paramArrayOfFloat[0] = left;
        paramArrayOfFloat[1] = top;
        transformPoint(arrayOfFloat1, globalTransform, paramArrayOfFloat);
        paramArrayOfFloat[0] = right;
        paramArrayOfFloat[1] = top;
        transformPoint(arrayOfFloat2, globalTransform, paramArrayOfFloat);
        paramArrayOfFloat[0] = right;
        paramArrayOfFloat[1] = bottom;
        transformPoint((float[])localObject, globalTransform, paramArrayOfFloat);
        paramArrayOfFloat[0] = left;
        paramArrayOfFloat[1] = bottom;
        transformPoint(arrayOfFloat3, globalTransform, paramArrayOfFloat);
        if (globalRect == null) {
          globalRect = new Rect();
        }
        globalRect.set(Math.round(min(arrayOfFloat1[0], arrayOfFloat2[0], localObject[0], arrayOfFloat3[0])), Math.round(min(arrayOfFloat1[1], arrayOfFloat2[1], localObject[1], arrayOfFloat3[1])), Math.round(max(arrayOfFloat1[0], arrayOfFloat2[0], localObject[0], arrayOfFloat3[0])), Math.round(max(arrayOfFloat1[1], arrayOfFloat2[1], localObject[1], arrayOfFloat3[1])));
        globalGeometryDirty = false;
      }
      int i = -1;
      paramArrayOfFloat = childrenInTraversalOrder.iterator();
      while (paramArrayOfFloat.hasNext())
      {
        localObject = (SemanticsNode)paramArrayOfFloat.next();
        previousNodeId = i;
        i = id;
        ((SemanticsNode)localObject).updateRecursively(globalTransform, paramSet, paramBoolean);
      }
    }
    
    private void updateWith(ByteBuffer paramByteBuffer, String[] paramArrayOfString, ByteBuffer[] paramArrayOfByteBuffer)
    {
      hadPreviousConfig = true;
      previousValue = value;
      previousLabel = label;
      previousFlags = flags;
      previousActions = actions;
      previousTextSelectionBase = textSelectionBase;
      previousTextSelectionExtent = textSelectionExtent;
      previousScrollPosition = scrollPosition;
      previousScrollExtentMax = scrollExtentMax;
      previousScrollExtentMin = scrollExtentMin;
      flags = paramByteBuffer.getInt();
      actions = paramByteBuffer.getInt();
      maxValueLength = paramByteBuffer.getInt();
      currentValueLength = paramByteBuffer.getInt();
      textSelectionBase = paramByteBuffer.getInt();
      textSelectionExtent = paramByteBuffer.getInt();
      platformViewId = paramByteBuffer.getInt();
      scrollChildren = paramByteBuffer.getInt();
      scrollIndex = paramByteBuffer.getInt();
      scrollPosition = paramByteBuffer.getFloat();
      scrollExtentMax = paramByteBuffer.getFloat();
      scrollExtentMin = paramByteBuffer.getFloat();
      int i = paramByteBuffer.getInt();
      String str;
      if (i == -1) {
        str = null;
      } else {
        str = paramArrayOfString[i];
      }
      identifier = str;
      i = paramByteBuffer.getInt();
      if (i == -1) {
        str = null;
      } else {
        str = paramArrayOfString[i];
      }
      label = str;
      labelAttributes = getStringAttributesFromBuffer(paramByteBuffer, paramArrayOfByteBuffer);
      i = paramByteBuffer.getInt();
      if (i == -1) {
        str = null;
      } else {
        str = paramArrayOfString[i];
      }
      value = str;
      valueAttributes = getStringAttributesFromBuffer(paramByteBuffer, paramArrayOfByteBuffer);
      i = paramByteBuffer.getInt();
      if (i == -1) {
        str = null;
      } else {
        str = paramArrayOfString[i];
      }
      increasedValue = str;
      increasedValueAttributes = getStringAttributesFromBuffer(paramByteBuffer, paramArrayOfByteBuffer);
      i = paramByteBuffer.getInt();
      if (i == -1) {
        str = null;
      } else {
        str = paramArrayOfString[i];
      }
      decreasedValue = str;
      decreasedValueAttributes = getStringAttributesFromBuffer(paramByteBuffer, paramArrayOfByteBuffer);
      i = paramByteBuffer.getInt();
      if (i == -1) {
        str = null;
      } else {
        str = paramArrayOfString[i];
      }
      hint = str;
      hintAttributes = getStringAttributesFromBuffer(paramByteBuffer, paramArrayOfByteBuffer);
      i = paramByteBuffer.getInt();
      if (i == -1) {
        paramArrayOfString = null;
      } else {
        paramArrayOfString = paramArrayOfString[i];
      }
      tooltip = paramArrayOfString;
      textDirection = AccessibilityBridge.TextDirection.fromInt(paramByteBuffer.getInt());
      left = paramByteBuffer.getFloat();
      top = paramByteBuffer.getFloat();
      right = paramByteBuffer.getFloat();
      bottom = paramByteBuffer.getFloat();
      if (transform == null) {
        transform = new float[16];
      }
      int j = 0;
      for (i = 0; i < 16; i++) {
        transform[i] = paramByteBuffer.getFloat();
      }
      inverseTransformDirty = true;
      globalGeometryDirty = true;
      int k = paramByteBuffer.getInt();
      childrenInTraversalOrder.clear();
      childrenInHitTestOrder.clear();
      for (i = 0; i < k; i++)
      {
        paramArrayOfString = AccessibilityBridge.access$7000(accessibilityBridge, paramByteBuffer.getInt());
        parent = this;
        childrenInTraversalOrder.add(paramArrayOfString);
      }
      for (i = 0; i < k; i++)
      {
        paramArrayOfString = AccessibilityBridge.access$7000(accessibilityBridge, paramByteBuffer.getInt());
        parent = this;
        childrenInHitTestOrder.add(paramArrayOfString);
      }
      k = paramByteBuffer.getInt();
      if (k == 0)
      {
        customAccessibilityActions = null;
      }
      else
      {
        paramArrayOfString = customAccessibilityActions;
        if (paramArrayOfString == null)
        {
          customAccessibilityActions = new ArrayList(k);
          i = j;
        }
        else
        {
          paramArrayOfString.clear();
        }
        for (i = j; i < k; i++)
        {
          paramArrayOfString = AccessibilityBridge.access$7100(accessibilityBridge, paramByteBuffer.getInt());
          if (AccessibilityBridge.CustomAccessibilityAction.access$4800(paramArrayOfString) == TAPvalue) {
            onTapOverride = paramArrayOfString;
          } else if (AccessibilityBridge.CustomAccessibilityAction.access$4800(paramArrayOfString) == LONG_PRESSvalue) {
            onLongPressOverride = paramArrayOfString;
          } else {
            customAccessibilityActions.add(paramArrayOfString);
          }
          customAccessibilityActions.add(paramArrayOfString);
        }
      }
    }
  }
  
  public static class SpellOutStringAttribute
    extends AccessibilityBridge.StringAttribute
  {
    private SpellOutStringAttribute()
    {
      super();
    }
  }
  
  public static class StringAttribute
  {
    public int end;
    public int start;
    public AccessibilityBridge.StringAttributeType type;
  }
  
  public static enum StringAttributeType
  {
    static
    {
      LOCALE = new StringAttributeType("LOCALE", 1);
    }
    
    private StringAttributeType() {}
  }
  
  public static enum TextDirection
  {
    static
    {
      LTR = new TextDirection("LTR", 1);
      RTL = new TextDirection("RTL", 2);
    }
    
    private TextDirection() {}
    
    public static TextDirection fromInt(int paramInt)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return UNKNOWN;
        }
        return LTR;
      }
      return RTL;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityBridge
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
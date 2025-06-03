package com.facebook.share.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookException;
import com.facebook.common.R.color;
import com.facebook.common.R.dimen;
import com.facebook.common.R.styleable;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.LikeActionController;
import com.facebook.share.internal.LikeActionController.CreationCallback;
import com.facebook.share.internal.LikeBoxCountView;
import com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition;
import com.facebook.share.internal.LikeButton;

@Deprecated
public class LikeView
  extends FrameLayout
{
  private static final int NO_FOREGROUND_COLOR = -1;
  private AuxiliaryViewPosition auxiliaryViewPosition = AuxiliaryViewPosition.DEFAULT;
  private BroadcastReceiver broadcastReceiver;
  private LinearLayout containerView;
  private LikeActionControllerCreationCallback creationCallback;
  private int edgePadding;
  private boolean explicitlyDisabled = true;
  private int foregroundColor = -1;
  private HorizontalAlignment horizontalAlignment = HorizontalAlignment.DEFAULT;
  private int internalPadding;
  private LikeActionController likeActionController;
  private LikeBoxCountView likeBoxCountView;
  private LikeButton likeButton;
  private Style likeViewStyle = Style.DEFAULT;
  private String objectId;
  private ObjectType objectType;
  private OnErrorListener onErrorListener;
  private FragmentWrapper parentFragment;
  private TextView socialSentenceView;
  
  @Deprecated
  public LikeView(Context paramContext)
  {
    super(paramContext);
    initialize(paramContext);
  }
  
  @Deprecated
  public LikeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    parseAttributes(paramAttributeSet);
    initialize(paramContext);
  }
  
  private void associateWithLikeActionController(LikeActionController paramLikeActionController)
  {
    likeActionController = paramLikeActionController;
    broadcastReceiver = new LikeControllerBroadcastReceiver(null);
    LocalBroadcastManager localLocalBroadcastManager = LocalBroadcastManager.getInstance(getContext());
    paramLikeActionController = new IntentFilter();
    paramLikeActionController.addAction("com.facebook.sdk.LikeActionController.UPDATED");
    paramLikeActionController.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
    paramLikeActionController.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
    localLocalBroadcastManager.registerReceiver(broadcastReceiver, paramLikeActionController);
  }
  
  private Activity getActivity()
  {
    boolean bool;
    for (Context localContext = getContext();; localContext = ((ContextWrapper)localContext).getBaseContext())
    {
      bool = localContext instanceof Activity;
      if ((bool) || (!(localContext instanceof ContextWrapper))) {
        break;
      }
    }
    if (bool) {
      return (Activity)localContext;
    }
    throw new FacebookException("Unable to get Activity.");
  }
  
  private Bundle getAnalyticsParameters()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("style", likeViewStyle.toString());
    localBundle.putString("auxiliary_position", auxiliaryViewPosition.toString());
    localBundle.putString("horizontal_alignment", horizontalAlignment.toString());
    localBundle.putString("object_id", Utility.coerceValueIfNullOrEmpty(objectId, ""));
    localBundle.putString("object_type", objectType.toString());
    return localBundle;
  }
  
  private void initialize(Context paramContext)
  {
    edgePadding = getResources().getDimensionPixelSize(R.dimen.com_facebook_likeview_edge_padding);
    internalPadding = getResources().getDimensionPixelSize(R.dimen.com_facebook_likeview_internal_padding);
    if (foregroundColor == -1) {
      foregroundColor = getResources().getColor(R.color.com_facebook_likeview_text_color);
    }
    setBackgroundColor(0);
    containerView = new LinearLayout(paramContext);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    containerView.setLayoutParams(localLayoutParams);
    initializeLikeButton(paramContext);
    initializeSocialSentenceView(paramContext);
    initializeLikeCountView(paramContext);
    containerView.addView(likeButton);
    containerView.addView(socialSentenceView);
    containerView.addView(likeBoxCountView);
    addView(containerView);
    setObjectIdAndTypeForced(objectId, objectType);
    updateLikeStateAndLayout();
  }
  
  private void initializeLikeButton(Context paramContext)
  {
    LikeActionController localLikeActionController = likeActionController;
    boolean bool;
    if ((localLikeActionController != null) && (localLikeActionController.isObjectLiked())) {
      bool = true;
    } else {
      bool = false;
    }
    paramContext = new LikeButton(paramContext, bool);
    likeButton = paramContext;
    paramContext.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          LikeView.access$300(LikeView.this);
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(paramAnonymousView, this);
        }
      }
    });
    paramContext = new LinearLayout.LayoutParams(-2, -2);
    likeButton.setLayoutParams(paramContext);
  }
  
  private void initializeLikeCountView(Context paramContext)
  {
    likeBoxCountView = new LikeBoxCountView(paramContext);
    paramContext = new LinearLayout.LayoutParams(-1, -1);
    likeBoxCountView.setLayoutParams(paramContext);
  }
  
  private void initializeSocialSentenceView(Context paramContext)
  {
    paramContext = new TextView(paramContext);
    socialSentenceView = paramContext;
    paramContext.setTextSize(0, getResources().getDimension(R.dimen.com_facebook_likeview_text_size));
    socialSentenceView.setMaxLines(2);
    socialSentenceView.setTextColor(foregroundColor);
    socialSentenceView.setGravity(17);
    paramContext = new LinearLayout.LayoutParams(-2, -1);
    socialSentenceView.setLayoutParams(paramContext);
  }
  
  private void parseAttributes(AttributeSet paramAttributeSet)
  {
    if ((paramAttributeSet != null) && (getContext() != null))
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.com_facebook_like_view);
      if (paramAttributeSet == null) {
        return;
      }
      objectId = Utility.coerceValueIfNullOrEmpty(paramAttributeSet.getString(R.styleable.com_facebook_like_view_com_facebook_object_id), null);
      objectType = ObjectType.fromInt(paramAttributeSet.getInt(R.styleable.com_facebook_like_view_com_facebook_object_type, ObjectType.DEFAULT.getValue()));
      Object localObject = Style.fromInt(paramAttributeSet.getInt(R.styleable.com_facebook_like_view_com_facebook_style, Style.access$000(Style.DEFAULT)));
      likeViewStyle = ((Style)localObject);
      if (localObject != null)
      {
        localObject = AuxiliaryViewPosition.fromInt(paramAttributeSet.getInt(R.styleable.com_facebook_like_view_com_facebook_auxiliary_view_position, AuxiliaryViewPosition.access$100(AuxiliaryViewPosition.DEFAULT)));
        auxiliaryViewPosition = ((AuxiliaryViewPosition)localObject);
        if (localObject != null)
        {
          localObject = HorizontalAlignment.fromInt(paramAttributeSet.getInt(R.styleable.com_facebook_like_view_com_facebook_horizontal_alignment, HorizontalAlignment.access$200(HorizontalAlignment.DEFAULT)));
          horizontalAlignment = ((HorizontalAlignment)localObject);
          if (localObject != null)
          {
            foregroundColor = paramAttributeSet.getColor(R.styleable.com_facebook_like_view_com_facebook_foreground_color, -1);
            paramAttributeSet.recycle();
            return;
          }
          throw new IllegalArgumentException("Unsupported value for LikeView 'horizontal_alignment'");
        }
        throw new IllegalArgumentException("Unsupported value for LikeView 'auxiliary_view_position'");
      }
      throw new IllegalArgumentException("Unsupported value for LikeView 'style'");
    }
  }
  
  private void setObjectIdAndTypeForced(String paramString, ObjectType paramObjectType)
  {
    tearDownObjectAssociations();
    objectId = paramString;
    objectType = paramObjectType;
    if (Utility.isNullOrEmpty(paramString)) {
      return;
    }
    creationCallback = new LikeActionControllerCreationCallback(null);
    if (!isInEditMode()) {
      LikeActionController.getControllerForObjectId(paramString, paramObjectType, creationCallback);
    }
  }
  
  private void tearDownObjectAssociations()
  {
    if (broadcastReceiver != null)
    {
      LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(broadcastReceiver);
      broadcastReceiver = null;
    }
    LikeActionControllerCreationCallback localLikeActionControllerCreationCallback = creationCallback;
    if (localLikeActionControllerCreationCallback != null)
    {
      localLikeActionControllerCreationCallback.cancel();
      creationCallback = null;
    }
    likeActionController = null;
  }
  
  private void toggleLike()
  {
    if (likeActionController != null)
    {
      Activity localActivity = null;
      if (parentFragment == null) {
        localActivity = getActivity();
      }
      likeActionController.toggleLike(localActivity, parentFragment, getAnalyticsParameters());
    }
  }
  
  private void updateBoxCountCaretPosition()
  {
    int i = 2.$SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition[auxiliaryViewPosition.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3)
        {
          LikeBoxCountView localLikeBoxCountView = likeBoxCountView;
          LikeBoxCountView.LikeBoxCountViewCaretPosition localLikeBoxCountViewCaretPosition;
          if (horizontalAlignment == HorizontalAlignment.RIGHT) {
            localLikeBoxCountViewCaretPosition = LikeBoxCountView.LikeBoxCountViewCaretPosition.RIGHT;
          } else {
            localLikeBoxCountViewCaretPosition = LikeBoxCountView.LikeBoxCountViewCaretPosition.LEFT;
          }
          localLikeBoxCountView.setCaretPosition(localLikeBoxCountViewCaretPosition);
        }
      }
      else {
        likeBoxCountView.setCaretPosition(LikeBoxCountView.LikeBoxCountViewCaretPosition.TOP);
      }
    }
    else {
      likeBoxCountView.setCaretPosition(LikeBoxCountView.LikeBoxCountViewCaretPosition.BOTTOM);
    }
  }
  
  private void updateLayout()
  {
    Object localObject1 = (FrameLayout.LayoutParams)containerView.getLayoutParams();
    Object localObject2 = (LinearLayout.LayoutParams)likeButton.getLayoutParams();
    Object localObject3 = horizontalAlignment;
    int i;
    if (localObject3 == HorizontalAlignment.LEFT) {
      i = 3;
    } else if (localObject3 == HorizontalAlignment.CENTER) {
      i = 1;
    } else {
      i = 5;
    }
    gravity = (i | 0x30);
    gravity = i;
    socialSentenceView.setVisibility(8);
    likeBoxCountView.setVisibility(8);
    if (likeViewStyle == Style.STANDARD)
    {
      localObject2 = likeActionController;
      if ((localObject2 != null) && (!Utility.isNullOrEmpty(((LikeActionController)localObject2).getSocialSentence())))
      {
        localObject2 = socialSentenceView;
        break label164;
      }
    }
    if (likeViewStyle == Style.BOX_COUNT)
    {
      localObject2 = likeActionController;
      if ((localObject2 != null) && (!Utility.isNullOrEmpty(((LikeActionController)localObject2).getLikeCountString())))
      {
        updateBoxCountCaretPosition();
        localObject2 = likeBoxCountView;
        label164:
        int j = 0;
        ((View)localObject2).setVisibility(0);
        getLayoutParamsgravity = i;
        localObject1 = containerView;
        AuxiliaryViewPosition localAuxiliaryViewPosition = auxiliaryViewPosition;
        localObject3 = AuxiliaryViewPosition.INLINE;
        if (localAuxiliaryViewPosition == localObject3) {
          i = j;
        } else {
          i = 1;
        }
        ((LinearLayout)localObject1).setOrientation(i);
        localObject1 = auxiliaryViewPosition;
        if ((localObject1 != AuxiliaryViewPosition.TOP) && ((localObject1 != localObject3) || (horizontalAlignment != HorizontalAlignment.RIGHT)))
        {
          containerView.removeView((View)localObject2);
          containerView.addView((View)localObject2);
        }
        else
        {
          containerView.removeView(likeButton);
          containerView.addView(likeButton);
        }
        i = 2.$SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition[auxiliaryViewPosition.ordinal()];
        if (i != 1)
        {
          if (i != 2)
          {
            if (i == 3) {
              if (horizontalAlignment == HorizontalAlignment.RIGHT)
              {
                i = edgePadding;
                ((View)localObject2).setPadding(i, i, internalPadding, i);
              }
              else
              {
                i = internalPadding;
                j = edgePadding;
                ((View)localObject2).setPadding(i, j, j, j);
              }
            }
          }
          else
          {
            i = edgePadding;
            ((View)localObject2).setPadding(i, internalPadding, i, i);
          }
        }
        else
        {
          i = edgePadding;
          ((View)localObject2).setPadding(i, i, i, internalPadding);
        }
      }
    }
  }
  
  private void updateLikeStateAndLayout()
  {
    boolean bool = explicitlyDisabled ^ true;
    LikeActionController localLikeActionController = likeActionController;
    if (localLikeActionController == null)
    {
      likeButton.setSelected(false);
      socialSentenceView.setText(null);
      likeBoxCountView.setText(null);
    }
    else
    {
      likeButton.setSelected(localLikeActionController.isObjectLiked());
      socialSentenceView.setText(likeActionController.getSocialSentence());
      likeBoxCountView.setText(likeActionController.getLikeCountString());
      bool &= likeActionController.shouldEnableView();
    }
    super.setEnabled(bool);
    likeButton.setEnabled(bool);
    updateLayout();
  }
  
  @Deprecated
  public OnErrorListener getOnErrorListener()
  {
    return onErrorListener;
  }
  
  public void onDetachedFromWindow()
  {
    setObjectIdAndType(null, ObjectType.UNKNOWN);
    super.onDetachedFromWindow();
  }
  
  @Deprecated
  public void setAuxiliaryViewPosition(AuxiliaryViewPosition paramAuxiliaryViewPosition)
  {
    if (paramAuxiliaryViewPosition == null) {
      paramAuxiliaryViewPosition = AuxiliaryViewPosition.DEFAULT;
    }
    if (auxiliaryViewPosition != paramAuxiliaryViewPosition)
    {
      auxiliaryViewPosition = paramAuxiliaryViewPosition;
      updateLayout();
    }
  }
  
  @Deprecated
  public void setEnabled(boolean paramBoolean)
  {
    explicitlyDisabled = true;
    updateLikeStateAndLayout();
  }
  
  @Deprecated
  public void setForegroundColor(int paramInt)
  {
    if (foregroundColor != paramInt) {
      socialSentenceView.setTextColor(paramInt);
    }
  }
  
  @Deprecated
  public void setFragment(android.app.Fragment paramFragment)
  {
    parentFragment = new FragmentWrapper(paramFragment);
  }
  
  @Deprecated
  public void setFragment(androidx.fragment.app.Fragment paramFragment)
  {
    parentFragment = new FragmentWrapper(paramFragment);
  }
  
  @Deprecated
  public void setHorizontalAlignment(HorizontalAlignment paramHorizontalAlignment)
  {
    if (paramHorizontalAlignment == null) {
      paramHorizontalAlignment = HorizontalAlignment.DEFAULT;
    }
    if (horizontalAlignment != paramHorizontalAlignment)
    {
      horizontalAlignment = paramHorizontalAlignment;
      updateLayout();
    }
  }
  
  @Deprecated
  public void setLikeViewStyle(Style paramStyle)
  {
    if (paramStyle == null) {
      paramStyle = Style.DEFAULT;
    }
    if (likeViewStyle != paramStyle)
    {
      likeViewStyle = paramStyle;
      updateLayout();
    }
  }
  
  @Deprecated
  public void setObjectIdAndType(String paramString, ObjectType paramObjectType)
  {
    paramString = Utility.coerceValueIfNullOrEmpty(paramString, null);
    if (paramObjectType == null) {
      paramObjectType = ObjectType.DEFAULT;
    }
    if ((!Utility.areObjectsEqual(paramString, objectId)) || (paramObjectType != objectType))
    {
      setObjectIdAndTypeForced(paramString, paramObjectType);
      updateLikeStateAndLayout();
    }
  }
  
  @Deprecated
  public void setOnErrorListener(OnErrorListener paramOnErrorListener)
  {
    onErrorListener = paramOnErrorListener;
  }
  
  @Deprecated
  public static enum AuxiliaryViewPosition
  {
    public static AuxiliaryViewPosition DEFAULT;
    private int intValue;
    private String stringValue;
    
    static
    {
      AuxiliaryViewPosition localAuxiliaryViewPosition1 = new AuxiliaryViewPosition("BOTTOM", 0, "bottom", 0);
      BOTTOM = localAuxiliaryViewPosition1;
      AuxiliaryViewPosition localAuxiliaryViewPosition2 = new AuxiliaryViewPosition("INLINE", 1, "inline", 1);
      INLINE = localAuxiliaryViewPosition2;
      AuxiliaryViewPosition localAuxiliaryViewPosition3 = new AuxiliaryViewPosition("TOP", 2, "top", 2);
      TOP = localAuxiliaryViewPosition3;
      $VALUES = new AuxiliaryViewPosition[] { localAuxiliaryViewPosition1, localAuxiliaryViewPosition2, localAuxiliaryViewPosition3 };
      DEFAULT = localAuxiliaryViewPosition1;
    }
    
    private AuxiliaryViewPosition(String paramString, int paramInt)
    {
      stringValue = paramString;
      intValue = paramInt;
    }
    
    public static AuxiliaryViewPosition fromInt(int paramInt)
    {
      for (AuxiliaryViewPosition localAuxiliaryViewPosition : ) {
        if (localAuxiliaryViewPosition.getValue() == paramInt) {
          return localAuxiliaryViewPosition;
        }
      }
      return null;
    }
    
    private int getValue()
    {
      return intValue;
    }
    
    public String toString()
    {
      return stringValue;
    }
  }
  
  @Deprecated
  public static enum HorizontalAlignment
  {
    public static HorizontalAlignment DEFAULT;
    private int intValue;
    private String stringValue;
    
    static
    {
      HorizontalAlignment localHorizontalAlignment1 = new HorizontalAlignment("CENTER", 0, "center", 0);
      CENTER = localHorizontalAlignment1;
      HorizontalAlignment localHorizontalAlignment2 = new HorizontalAlignment("LEFT", 1, "left", 1);
      LEFT = localHorizontalAlignment2;
      HorizontalAlignment localHorizontalAlignment3 = new HorizontalAlignment("RIGHT", 2, "right", 2);
      RIGHT = localHorizontalAlignment3;
      $VALUES = new HorizontalAlignment[] { localHorizontalAlignment1, localHorizontalAlignment2, localHorizontalAlignment3 };
      DEFAULT = localHorizontalAlignment1;
    }
    
    private HorizontalAlignment(String paramString, int paramInt)
    {
      stringValue = paramString;
      intValue = paramInt;
    }
    
    public static HorizontalAlignment fromInt(int paramInt)
    {
      for (HorizontalAlignment localHorizontalAlignment : ) {
        if (localHorizontalAlignment.getValue() == paramInt) {
          return localHorizontalAlignment;
        }
      }
      return null;
    }
    
    private int getValue()
    {
      return intValue;
    }
    
    public String toString()
    {
      return stringValue;
    }
  }
  
  public class LikeActionControllerCreationCallback
    implements LikeActionController.CreationCallback
  {
    private boolean isCancelled;
    
    private LikeActionControllerCreationCallback() {}
    
    public void cancel()
    {
      isCancelled = true;
    }
    
    public void onComplete(LikeActionController paramLikeActionController, FacebookException paramFacebookException)
    {
      if (isCancelled) {
        return;
      }
      FacebookException localFacebookException = paramFacebookException;
      if (paramLikeActionController != null)
      {
        if (!paramLikeActionController.shouldEnableView()) {
          paramFacebookException = new FacebookException("Cannot use LikeView. The device may not be supported.");
        }
        LikeView.access$1100(LikeView.this, paramLikeActionController);
        LikeView.access$700(LikeView.this);
        localFacebookException = paramFacebookException;
      }
      if ((localFacebookException != null) && (LikeView.access$800(LikeView.this) != null)) {
        LikeView.access$800(LikeView.this).onError(localFacebookException);
      }
      LikeView.access$1202(LikeView.this, null);
    }
  }
  
  public class LikeControllerBroadcastReceiver
    extends BroadcastReceiver
  {
    private LikeControllerBroadcastReceiver() {}
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      paramContext = paramIntent.getAction();
      Bundle localBundle = paramIntent.getExtras();
      int i = 1;
      int j = i;
      if (localBundle != null)
      {
        paramIntent = localBundle.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
        j = i;
        if (!Utility.isNullOrEmpty(paramIntent)) {
          if (Utility.areObjectsEqual(LikeView.access$600(LikeView.this), paramIntent)) {
            j = i;
          } else {
            j = 0;
          }
        }
      }
      if (j == 0) {
        return;
      }
      if ("com.facebook.sdk.LikeActionController.UPDATED".equals(paramContext))
      {
        LikeView.access$700(LikeView.this);
      }
      else if ("com.facebook.sdk.LikeActionController.DID_ERROR".equals(paramContext))
      {
        if (LikeView.access$800(LikeView.this) != null) {
          LikeView.access$800(LikeView.this).onError(NativeProtocol.getExceptionFromErrorData(localBundle));
        }
      }
      else if ("com.facebook.sdk.LikeActionController.DID_RESET".equals(paramContext))
      {
        paramContext = LikeView.this;
        LikeView.access$1000(paramContext, LikeView.access$600(paramContext), LikeView.access$900(LikeView.this));
        LikeView.access$700(LikeView.this);
      }
    }
  }
  
  @Deprecated
  public static enum ObjectType
  {
    public static ObjectType DEFAULT;
    private int intValue;
    private String stringValue;
    
    static
    {
      ObjectType localObjectType1 = new ObjectType("UNKNOWN", 0, "unknown", 0);
      UNKNOWN = localObjectType1;
      ObjectType localObjectType2 = new ObjectType("OPEN_GRAPH", 1, "open_graph", 1);
      OPEN_GRAPH = localObjectType2;
      ObjectType localObjectType3 = new ObjectType("PAGE", 2, "page", 2);
      PAGE = localObjectType3;
      $VALUES = new ObjectType[] { localObjectType1, localObjectType2, localObjectType3 };
      DEFAULT = localObjectType1;
    }
    
    private ObjectType(String paramString, int paramInt)
    {
      stringValue = paramString;
      intValue = paramInt;
    }
    
    public static ObjectType fromInt(int paramInt)
    {
      for (ObjectType localObjectType : ) {
        if (localObjectType.getValue() == paramInt) {
          return localObjectType;
        }
      }
      return null;
    }
    
    public int getValue()
    {
      return intValue;
    }
    
    public String toString()
    {
      return stringValue;
    }
  }
  
  public static abstract interface OnErrorListener
  {
    public abstract void onError(FacebookException paramFacebookException);
  }
  
  @Deprecated
  public static enum Style
  {
    public static Style DEFAULT;
    private int intValue;
    private String stringValue;
    
    static
    {
      Style localStyle1 = new Style("STANDARD", 0, "standard", 0);
      STANDARD = localStyle1;
      Style localStyle2 = new Style("BUTTON", 1, "button", 1);
      BUTTON = localStyle2;
      Style localStyle3 = new Style("BOX_COUNT", 2, "box_count", 2);
      BOX_COUNT = localStyle3;
      $VALUES = new Style[] { localStyle1, localStyle2, localStyle3 };
      DEFAULT = localStyle1;
    }
    
    private Style(String paramString, int paramInt)
    {
      stringValue = paramString;
      intValue = paramInt;
    }
    
    public static Style fromInt(int paramInt)
    {
      for (Style localStyle : ) {
        if (localStyle.getValue() == paramInt) {
          return localStyle;
        }
      }
      return null;
    }
    
    private int getValue()
    {
      return intValue;
    }
    
    public String toString()
    {
      return stringValue;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.LikeView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
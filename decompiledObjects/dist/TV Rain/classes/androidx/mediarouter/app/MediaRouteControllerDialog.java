package androidx.mediarouter.app;

import android.app.Dialog;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.Callback;
import android.support.v4.media.session.MediaControllerCompat.TransportControls;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.util.ObjectsCompat;
import androidx.mediarouter.R.attr;
import androidx.mediarouter.R.dimen;
import androidx.mediarouter.R.id;
import androidx.mediarouter.R.integer;
import androidx.mediarouter.R.interpolator;
import androidx.mediarouter.R.layout;
import androidx.mediarouter.R.string;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.Callback;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import z2;

public class MediaRouteControllerDialog
  extends AlertDialog
{
  public static final int BUTTON_DISCONNECT_RES_ID = 16908314;
  private static final int BUTTON_NEUTRAL_RES_ID = 16908315;
  public static final int BUTTON_STOP_RES_ID = 16908313;
  public static final int CONNECTION_TIMEOUT_MILLIS = (int)TimeUnit.SECONDS.toMillis(30L);
  public static final boolean DEBUG = Log.isLoggable("MediaRouteCtrlDialog", 3);
  public static final String TAG = "MediaRouteCtrlDialog";
  public static final int VOLUME_UPDATE_DELAY_MILLIS = 500;
  private Interpolator mAccelerateDecelerateInterpolator;
  public final AccessibilityManager mAccessibilityManager;
  public int mArtIconBackgroundColor;
  public Bitmap mArtIconBitmap;
  public boolean mArtIconIsLoaded;
  public Bitmap mArtIconLoadedBitmap;
  public Uri mArtIconUri;
  private ImageView mArtView;
  private boolean mAttachedToWindow;
  private final MediaRouterCallback mCallback;
  private ImageButton mCloseButton;
  public Context mContext = getContext();
  public MediaControllerCallback mControllerCallback = new MediaControllerCallback();
  private boolean mCreated;
  private FrameLayout mCustomControlLayout;
  private View mCustomControlView;
  public FrameLayout mDefaultControlLayout;
  public MediaDescriptionCompat mDescription;
  private LinearLayout mDialogAreaLayout;
  private int mDialogContentWidth;
  private Button mDisconnectButton;
  private View mDividerView;
  public final boolean mEnableGroupVolumeUX;
  private FrameLayout mExpandableAreaLayout;
  private Interpolator mFastOutSlowInInterpolator;
  public FetchArtTask mFetchArtTask;
  private MediaRouteExpandCollapseButton mGroupExpandCollapseButton;
  public int mGroupListAnimationDurationMs;
  public Runnable mGroupListFadeInAnimation = new Runnable()
  {
    public void run()
    {
      startGroupListFadeInAnimation();
    }
  };
  private int mGroupListFadeInDurationMs;
  private int mGroupListFadeOutDurationMs;
  private List<MediaRouter.RouteInfo> mGroupMemberRoutes;
  public Set<MediaRouter.RouteInfo> mGroupMemberRoutesAdded;
  public Set<MediaRouter.RouteInfo> mGroupMemberRoutesAnimatingWithBitmap;
  private Set<MediaRouter.RouteInfo> mGroupMemberRoutesRemoved;
  public boolean mHasPendingUpdate;
  private Interpolator mInterpolator;
  public boolean mIsGroupExpanded;
  public boolean mIsGroupListAnimating;
  public boolean mIsGroupListAnimationPending;
  private Interpolator mLinearOutSlowInInterpolator;
  public MediaControllerCompat mMediaController;
  private LinearLayout mMediaMainControlLayout;
  public boolean mPendingUpdateAnimationNeeded;
  private ImageButton mPlaybackControlButton;
  private RelativeLayout mPlaybackControlLayout;
  public final MediaRouter.RouteInfo mRoute;
  public MediaRouter.RouteInfo mRouteInVolumeSliderTouched;
  private TextView mRouteNameTextView;
  public final MediaRouter mRouter;
  public PlaybackStateCompat mState;
  private Button mStopCastingButton;
  private TextView mSubtitleView;
  private TextView mTitleView;
  public VolumeChangeListener mVolumeChangeListener;
  private boolean mVolumeControlEnabled = true;
  public LinearLayout mVolumeControlLayout;
  public VolumeGroupAdapter mVolumeGroupAdapter;
  public OverlayListView mVolumeGroupList;
  private int mVolumeGroupListItemHeight;
  private int mVolumeGroupListItemIconSize;
  private int mVolumeGroupListMaxHeight;
  private final int mVolumeGroupListPaddingTop;
  public SeekBar mVolumeSlider;
  public Map<MediaRouter.RouteInfo, SeekBar> mVolumeSliderMap;
  
  public MediaRouteControllerDialog(@NonNull Context paramContext)
  {
    this(paramContext, 0);
  }
  
  public MediaRouteControllerDialog(@NonNull Context paramContext, int paramInt)
  {
    super(paramContext, MediaRouterThemeHelper.createThemedDialogStyle(paramContext));
    MediaRouter localMediaRouter = MediaRouter.getInstance(mContext);
    mRouter = localMediaRouter;
    mEnableGroupVolumeUX = MediaRouter.isGroupVolumeUxEnabled();
    mCallback = new MediaRouterCallback();
    mRoute = localMediaRouter.getSelectedRoute();
    setMediaSession(localMediaRouter.getMediaSessionToken());
    mVolumeGroupListPaddingTop = mContext.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
    mAccessibilityManager = ((AccessibilityManager)mContext.getSystemService("accessibility"));
    mLinearOutSlowInInterpolator = AnimationUtils.loadInterpolator(paramContext, R.interpolator.mr_linear_out_slow_in);
    mFastOutSlowInInterpolator = AnimationUtils.loadInterpolator(paramContext, R.interpolator.mr_fast_out_slow_in);
    mAccelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
  }
  
  private void animateGroupListItems(final Map<MediaRouter.RouteInfo, Rect> paramMap, final Map<MediaRouter.RouteInfo, BitmapDrawable> paramMap1)
  {
    mVolumeGroupList.setEnabled(false);
    mVolumeGroupList.requestLayout();
    mIsGroupListAnimating = true;
    mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public void onGlobalLayout()
      {
        mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        animateGroupListItemsInternal(paramMap, paramMap1);
      }
    });
  }
  
  private void animateLayoutHeight(final View paramView, final int paramInt)
  {
    Animation local7 = new Animation()
    {
      public void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        int i = val$startValue;
        int j = (int)((i - paramInt) * paramAnonymousFloat);
        MediaRouteControllerDialog.setLayoutHeight(paramView, i - j);
      }
    };
    local7.setDuration(mGroupListAnimationDurationMs);
    local7.setInterpolator(mInterpolator);
    paramView.startAnimation(local7);
  }
  
  private boolean canShowPlaybackControlLayout()
  {
    boolean bool;
    if ((mCustomControlView == null) && ((mDescription != null) || (mState != null))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void fadeInAddedRoutes()
  {
    Animation.AnimationListener local12 = new Animation.AnimationListener()
    {
      public void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        finishAnimation(true);
      }
      
      public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
      
      public void onAnimationStart(Animation paramAnonymousAnimation) {}
    };
    int i = mVolumeGroupList.getFirstVisiblePosition();
    int j = 0;
    int m;
    for (int k = 0; j < mVolumeGroupList.getChildCount(); k = m)
    {
      View localView = mVolumeGroupList.getChildAt(j);
      Object localObject = (MediaRouter.RouteInfo)mVolumeGroupAdapter.getItem(i + j);
      m = k;
      if (mGroupMemberRoutesAdded.contains(localObject))
      {
        localObject = new AlphaAnimation(0.0F, 1.0F);
        ((Animation)localObject).setDuration(mGroupListFadeInDurationMs);
        ((Animation)localObject).setFillEnabled(true);
        ((Animation)localObject).setFillAfter(true);
        m = k;
        if (k == 0)
        {
          ((Animation)localObject).setAnimationListener(local12);
          m = 1;
        }
        localView.clearAnimation();
        localView.startAnimation((Animation)localObject);
      }
      j++;
    }
  }
  
  private static int getLayoutHeight(View paramView)
  {
    return getLayoutParamsheight;
  }
  
  private int getMainControllerHeight(boolean paramBoolean)
  {
    int i = 0;
    if ((paramBoolean) || (mVolumeControlLayout.getVisibility() == 0))
    {
      i = mMediaMainControlLayout.getPaddingTop();
      int j = mMediaMainControlLayout.getPaddingBottom() + i + 0;
      i = j;
      if (paramBoolean) {
        i = j + mPlaybackControlLayout.getMeasuredHeight();
      }
      if (mVolumeControlLayout.getVisibility() == 0) {
        j = mVolumeControlLayout.getMeasuredHeight() + i;
      } else {
        j = i;
      }
      i = j;
      if (paramBoolean)
      {
        i = j;
        if (mVolumeControlLayout.getVisibility() == 0) {
          i = j + mDividerView.getMeasuredHeight();
        }
      }
    }
    return i;
  }
  
  public static boolean isBitmapRecycled(Bitmap paramBitmap)
  {
    boolean bool;
    if ((paramBitmap != null) && (paramBitmap.isRecycled())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isGroup()
  {
    boolean bool1 = mRoute.isGroup();
    boolean bool2 = true;
    if ((!bool1) || (mRoute.getMemberRoutes().size() <= 1)) {
      bool2 = false;
    }
    return bool2;
  }
  
  private boolean isIconChanged()
  {
    Object localObject1 = mDescription;
    Uri localUri = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((MediaDescriptionCompat)localObject1).getIconBitmap();
    }
    Object localObject2 = mDescription;
    if (localObject2 != null) {
      localUri = ((MediaDescriptionCompat)localObject2).getIconUri();
    }
    localObject2 = mFetchArtTask;
    if (localObject2 == null) {
      localObject2 = mArtIconBitmap;
    } else {
      localObject2 = ((FetchArtTask)localObject2).getIconBitmap();
    }
    Object localObject3 = mFetchArtTask;
    if (localObject3 == null) {
      localObject3 = mArtIconUri;
    } else {
      localObject3 = ((FetchArtTask)localObject3).getIconUri();
    }
    if (localObject2 != localObject1) {
      return true;
    }
    return (localObject2 == null) && (!uriEquals((Uri)localObject3, localUri));
  }
  
  private void rebuildVolumeGroupList(boolean paramBoolean)
  {
    List localList = mRoute.getMemberRoutes();
    if (localList.isEmpty())
    {
      mGroupMemberRoutes.clear();
      mVolumeGroupAdapter.notifyDataSetChanged();
    }
    else if (MediaRouteDialogHelper.listUnorderedEquals(mGroupMemberRoutes, localList))
    {
      mVolumeGroupAdapter.notifyDataSetChanged();
    }
    else
    {
      HashMap localHashMap1;
      if (paramBoolean) {
        localHashMap1 = MediaRouteDialogHelper.getItemBoundMap(mVolumeGroupList, mVolumeGroupAdapter);
      } else {
        localHashMap1 = null;
      }
      HashMap localHashMap2;
      if (paramBoolean) {
        localHashMap2 = MediaRouteDialogHelper.getItemBitmapMap(mContext, mVolumeGroupList, mVolumeGroupAdapter);
      } else {
        localHashMap2 = null;
      }
      mGroupMemberRoutesAdded = MediaRouteDialogHelper.getItemsAdded(mGroupMemberRoutes, localList);
      mGroupMemberRoutesRemoved = MediaRouteDialogHelper.getItemsRemoved(mGroupMemberRoutes, localList);
      mGroupMemberRoutes.addAll(0, mGroupMemberRoutesAdded);
      mGroupMemberRoutes.removeAll(mGroupMemberRoutesRemoved);
      mVolumeGroupAdapter.notifyDataSetChanged();
      if ((paramBoolean) && (mIsGroupExpanded))
      {
        int i = mGroupMemberRoutesAdded.size();
        if (mGroupMemberRoutesRemoved.size() + i > 0)
        {
          animateGroupListItems(localHashMap1, localHashMap2);
          return;
        }
      }
      mGroupMemberRoutesAdded = null;
      mGroupMemberRoutesRemoved = null;
    }
  }
  
  public static void setLayoutHeight(View paramView, int paramInt)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    height = paramInt;
    paramView.setLayoutParams(localLayoutParams);
  }
  
  private void setMediaSession(MediaSessionCompat.Token paramToken)
  {
    MediaControllerCompat localMediaControllerCompat = mMediaController;
    Object localObject = null;
    if (localMediaControllerCompat != null)
    {
      localMediaControllerCompat.unregisterCallback(mControllerCallback);
      mMediaController = null;
    }
    if (paramToken == null) {
      return;
    }
    if (!mAttachedToWindow) {
      return;
    }
    paramToken = new MediaControllerCompat(mContext, paramToken);
    mMediaController = paramToken;
    paramToken.registerCallback(mControllerCallback);
    paramToken = mMediaController.getMetadata();
    if (paramToken == null) {
      paramToken = (MediaSessionCompat.Token)localObject;
    } else {
      paramToken = paramToken.getDescription();
    }
    mDescription = paramToken;
    mState = mMediaController.getPlaybackState();
    updateArtIconIfNeeded();
    update(false);
  }
  
  private void updateMediaControlVisibility(boolean paramBoolean)
  {
    Object localObject = mDividerView;
    int i = mVolumeControlLayout.getVisibility();
    int j = 0;
    if ((i == 0) && (paramBoolean)) {
      i = 0;
    } else {
      i = 8;
    }
    ((View)localObject).setVisibility(i);
    localObject = mMediaMainControlLayout;
    i = j;
    if (mVolumeControlLayout.getVisibility() == 8)
    {
      i = j;
      if (!paramBoolean) {
        i = 8;
      }
    }
    ((View)localObject).setVisibility(i);
  }
  
  private void updatePlaybackControlLayout()
  {
    if (canShowPlaybackControlLayout())
    {
      Object localObject1 = mDescription;
      Object localObject2 = null;
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = ((MediaDescriptionCompat)localObject1).getTitle();
      }
      boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
      int i = 1;
      int j = bool ^ true;
      Object localObject3 = mDescription;
      if (localObject3 != null) {
        localObject2 = ((MediaDescriptionCompat)localObject3).getSubtitle();
      }
      int k = TextUtils.isEmpty((CharSequence)localObject2) ^ true;
      int m = mRoute.getPresentationDisplayId();
      int n = 0;
      if (m != -1) {
        mTitleView.setText(R.string.mr_controller_casting_screen);
      }
      for (;;)
      {
        j = 1;
        do
        {
          m = 0;
          break label217;
          localObject3 = mState;
          if ((localObject3 == null) || (((PlaybackStateCompat)localObject3).getState() == 0)) {
            break label204;
          }
          if ((j == 0) && (k == 0))
          {
            mTitleView.setText(R.string.mr_controller_no_info_available);
            break;
          }
          if (j != 0)
          {
            mTitleView.setText((CharSequence)localObject1);
            m = 1;
          }
          else
          {
            m = 0;
          }
          j = m;
        } while (k == 0);
        mSubtitleView.setText((CharSequence)localObject2);
        k = 1;
        j = m;
        m = k;
        break;
        label204:
        mTitleView.setText(R.string.mr_controller_no_media_selected);
      }
      label217:
      localObject1 = mTitleView;
      if (j != 0) {
        j = 0;
      } else {
        j = 8;
      }
      ((View)localObject1).setVisibility(j);
      localObject1 = mSubtitleView;
      if (m != 0) {
        m = 0;
      } else {
        m = 8;
      }
      ((View)localObject1).setVisibility(m);
      localObject1 = mState;
      if (localObject1 != null)
      {
        if ((((PlaybackStateCompat)localObject1).getState() != 6) && (mState.getState() != 3)) {
          m = 0;
        } else {
          m = 1;
        }
        localObject1 = mPlaybackControlButton.getContext();
        if ((m != 0) && (isPauseActionSupported()))
        {
          m = R.attr.mediaRoutePauseDrawable;
          j = R.string.mr_controller_pause;
        }
        else if ((m != 0) && (isStopActionSupported()))
        {
          m = R.attr.mediaRouteStopDrawable;
          j = R.string.mr_controller_stop;
        }
        else if ((m == 0) && (isPlayActionSupported()))
        {
          m = R.attr.mediaRoutePlayDrawable;
          j = R.string.mr_controller_play;
        }
        else
        {
          m = 0;
          j = m;
          i = j;
        }
        localObject2 = mPlaybackControlButton;
        if (i == 0) {
          n = 8;
        }
        ((View)localObject2).setVisibility(n);
        if (i != 0)
        {
          mPlaybackControlButton.setImageResource(MediaRouterThemeHelper.getThemeResource((Context)localObject1, m));
          mPlaybackControlButton.setContentDescription(((Context)localObject1).getResources().getText(j));
        }
      }
    }
  }
  
  private void updateVolumeControlLayout()
  {
    boolean bool = mEnableGroupVolumeUX;
    int i = 0;
    if ((!bool) && (isGroup()))
    {
      mVolumeControlLayout.setVisibility(8);
      mIsGroupExpanded = true;
      mVolumeGroupList.setVisibility(0);
      loadInterpolator();
      updateLayoutHeight(false);
      return;
    }
    if (((mIsGroupExpanded) && (!mEnableGroupVolumeUX)) || (!isVolumeControlAvailable(mRoute)))
    {
      mVolumeControlLayout.setVisibility(8);
    }
    else if (mVolumeControlLayout.getVisibility() == 8)
    {
      mVolumeControlLayout.setVisibility(0);
      mVolumeSlider.setMax(mRoute.getVolumeMax());
      mVolumeSlider.setProgress(mRoute.getVolume());
      MediaRouteExpandCollapseButton localMediaRouteExpandCollapseButton = mGroupExpandCollapseButton;
      if (!isGroup()) {
        i = 8;
      }
      localMediaRouteExpandCollapseButton.setVisibility(i);
    }
  }
  
  private static boolean uriEquals(Uri paramUri1, Uri paramUri2)
  {
    if ((paramUri1 != null) && (paramUri1.equals(paramUri2))) {
      return true;
    }
    return (paramUri1 == null) && (paramUri2 == null);
  }
  
  public void animateGroupListItemsInternal(Map<MediaRouter.RouteInfo, Rect> paramMap, Map<MediaRouter.RouteInfo, BitmapDrawable> paramMap1)
  {
    Object localObject1 = mGroupMemberRoutesAdded;
    if ((localObject1 != null) && (mGroupMemberRoutesRemoved != null))
    {
      int i = ((Set)localObject1).size() - mGroupMemberRoutesRemoved.size();
      localObject1 = new Animation.AnimationListener()
      {
        public void onAnimationEnd(Animation paramAnonymousAnimation) {}
        
        public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
        
        public void onAnimationStart(Animation paramAnonymousAnimation)
        {
          mVolumeGroupList.startAnimationAll();
          paramAnonymousAnimation = MediaRouteControllerDialog.this;
          mVolumeGroupList.postDelayed(mGroupListFadeInAnimation, mGroupListAnimationDurationMs);
        }
      };
      int j = mVolumeGroupList.getFirstVisiblePosition();
      int k = 0;
      Object localObject2;
      final MediaRouter.RouteInfo localRouteInfo;
      int i1;
      for (int m = 0; k < mVolumeGroupList.getChildCount(); m = i1)
      {
        localObject2 = mVolumeGroupList.getChildAt(k);
        localRouteInfo = (MediaRouter.RouteInfo)mVolumeGroupAdapter.getItem(j + k);
        Object localObject3 = (Rect)paramMap.get(localRouteInfo);
        int n = ((View)localObject2).getTop();
        if (localObject3 != null) {
          i1 = top;
        } else {
          i1 = mVolumeGroupListItemHeight * i + n;
        }
        localObject3 = new AnimationSet(true);
        Object localObject4 = mGroupMemberRoutesAdded;
        int i2 = i1;
        if (localObject4 != null)
        {
          i2 = i1;
          if (((Set)localObject4).contains(localRouteInfo))
          {
            localObject4 = new AlphaAnimation(0.0F, 0.0F);
            ((Animation)localObject4).setDuration(mGroupListFadeInDurationMs);
            ((AnimationSet)localObject3).addAnimation((Animation)localObject4);
            i2 = n;
          }
        }
        localObject4 = new TranslateAnimation(0.0F, 0.0F, i2 - n, 0.0F);
        ((Animation)localObject4).setDuration(mGroupListAnimationDurationMs);
        ((AnimationSet)localObject3).addAnimation((Animation)localObject4);
        ((AnimationSet)localObject3).setFillAfter(true);
        ((Animation)localObject3).setFillEnabled(true);
        ((Animation)localObject3).setInterpolator(mInterpolator);
        i1 = m;
        if (m == 0)
        {
          ((Animation)localObject3).setAnimationListener((Animation.AnimationListener)localObject1);
          i1 = 1;
        }
        ((View)localObject2).clearAnimation();
        ((View)localObject2).startAnimation((Animation)localObject3);
        paramMap.remove(localRouteInfo);
        paramMap1.remove(localRouteInfo);
        k++;
      }
      localObject1 = paramMap1.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramMap1 = (Map.Entry)((Iterator)localObject1).next();
        localRouteInfo = (MediaRouter.RouteInfo)paramMap1.getKey();
        localObject2 = (BitmapDrawable)paramMap1.getValue();
        paramMap1 = (Rect)paramMap.get(localRouteInfo);
        if (mGroupMemberRoutesRemoved.contains(localRouteInfo))
        {
          paramMap1 = new OverlayListView.OverlayObject((BitmapDrawable)localObject2, paramMap1).setAlphaAnimation(1.0F, 0.0F).setDuration(mGroupListFadeOutDurationMs).setInterpolator(mInterpolator);
        }
        else
        {
          i1 = mVolumeGroupListItemHeight;
          paramMap1 = new OverlayListView.OverlayObject((BitmapDrawable)localObject2, paramMap1).setTranslateYAnimation(i1 * i).setDuration(mGroupListAnimationDurationMs).setInterpolator(mInterpolator).setAnimationEndListener(new OverlayListView.OverlayObject.OnAnimationEndListener()
          {
            public void onAnimationEnd()
            {
              mGroupMemberRoutesAnimatingWithBitmap.remove(localRouteInfo);
              mVolumeGroupAdapter.notifyDataSetChanged();
            }
          });
          mGroupMemberRoutesAnimatingWithBitmap.add(localRouteInfo);
        }
        mVolumeGroupList.addOverlayObject(paramMap1);
      }
    }
  }
  
  public void clearGroupListAnimation(boolean paramBoolean)
  {
    int i = mVolumeGroupList.getFirstVisiblePosition();
    for (int j = 0; j < mVolumeGroupList.getChildCount(); j++)
    {
      View localView = mVolumeGroupList.getChildAt(j);
      Object localObject1 = (MediaRouter.RouteInfo)mVolumeGroupAdapter.getItem(i + j);
      Object localObject2;
      if (paramBoolean)
      {
        localObject2 = mGroupMemberRoutesAdded;
        if ((localObject2 != null) && (((Set)localObject2).contains(localObject1))) {}
      }
      else
      {
        ((LinearLayout)localView.findViewById(R.id.volume_item_container)).setVisibility(0);
        localObject2 = new AnimationSet(true);
        localObject1 = new AlphaAnimation(1.0F, 1.0F);
        ((Animation)localObject1).setDuration(0L);
        ((AnimationSet)localObject2).addAnimation((Animation)localObject1);
        new TranslateAnimation(0.0F, 0.0F, 0.0F, 0.0F).setDuration(0L);
        ((AnimationSet)localObject2).setFillAfter(true);
        ((Animation)localObject2).setFillEnabled(true);
        localView.clearAnimation();
        localView.startAnimation((Animation)localObject2);
      }
    }
    mVolumeGroupList.stopAnimationAll();
    if (!paramBoolean) {
      finishAnimation(false);
    }
  }
  
  public void clearLoadedBitmap()
  {
    mArtIconIsLoaded = false;
    mArtIconLoadedBitmap = null;
    mArtIconBackgroundColor = 0;
  }
  
  public void finishAnimation(boolean paramBoolean)
  {
    mGroupMemberRoutesAdded = null;
    mGroupMemberRoutesRemoved = null;
    mIsGroupListAnimating = false;
    if (mIsGroupListAnimationPending)
    {
      mIsGroupListAnimationPending = false;
      updateLayoutHeight(paramBoolean);
    }
    mVolumeGroupList.setEnabled(true);
  }
  
  public int getDesiredArtHeight(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= paramInt2) {
      return (int)(mDialogContentWidth * paramInt2 / paramInt1 + 0.5F);
    }
    return (int)(mDialogContentWidth * 9.0F / 16.0F + 0.5F);
  }
  
  @Nullable
  public View getMediaControlView()
  {
    return mCustomControlView;
  }
  
  @Nullable
  public MediaSessionCompat.Token getMediaSession()
  {
    Object localObject = mMediaController;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((MediaControllerCompat)localObject).getSessionToken();
    }
    return (MediaSessionCompat.Token)localObject;
  }
  
  @NonNull
  public MediaRouter.RouteInfo getRoute()
  {
    return mRoute;
  }
  
  public boolean isPauseActionSupported()
  {
    boolean bool;
    if ((mState.getActions() & 0x202) != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isPlayActionSupported()
  {
    boolean bool;
    if ((mState.getActions() & 0x204) != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isStopActionSupported()
  {
    boolean bool;
    if ((mState.getActions() & 1L) != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isVolumeControlAvailable(MediaRouter.RouteInfo paramRouteInfo)
  {
    boolean bool1 = mVolumeControlEnabled;
    boolean bool2 = true;
    if ((!bool1) || (paramRouteInfo.getVolumeHandling() != 1)) {
      bool2 = false;
    }
    return bool2;
  }
  
  public boolean isVolumeControlEnabled()
  {
    return mVolumeControlEnabled;
  }
  
  public void loadInterpolator()
  {
    Interpolator localInterpolator;
    if (mIsGroupExpanded) {
      localInterpolator = mLinearOutSlowInInterpolator;
    } else {
      localInterpolator = mFastOutSlowInInterpolator;
    }
    mInterpolator = localInterpolator;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    mAttachedToWindow = true;
    mRouter.addCallback(MediaRouteSelector.EMPTY, mCallback, 2);
    setMediaSession(mRouter.getMediaSessionToken());
  }
  
  public void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setBackgroundDrawableResource(17170445);
    setContentView(R.layout.mr_controller_material_dialog_b);
    findViewById(16908315).setVisibility(8);
    Object localObject1 = new ClickListener();
    Object localObject2 = (FrameLayout)findViewById(R.id.mr_expandable_area);
    mExpandableAreaLayout = ((FrameLayout)localObject2);
    ((View)localObject2).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        dismiss();
      }
    });
    localObject2 = (LinearLayout)findViewById(R.id.mr_dialog_area);
    mDialogAreaLayout = ((LinearLayout)localObject2);
    ((View)localObject2).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView) {}
    });
    int i = MediaRouterThemeHelper.getButtonTextColor(mContext);
    localObject2 = (Button)findViewById(16908314);
    mDisconnectButton = ((Button)localObject2);
    ((TextView)localObject2).setText(R.string.mr_controller_disconnect);
    mDisconnectButton.setTextColor(i);
    mDisconnectButton.setOnClickListener((View.OnClickListener)localObject1);
    localObject2 = (Button)findViewById(16908313);
    mStopCastingButton = ((Button)localObject2);
    ((TextView)localObject2).setText(R.string.mr_controller_stop_casting);
    mStopCastingButton.setTextColor(i);
    mStopCastingButton.setOnClickListener((View.OnClickListener)localObject1);
    mRouteNameTextView = ((TextView)findViewById(R.id.mr_name));
    localObject2 = (ImageButton)findViewById(R.id.mr_close);
    mCloseButton = ((ImageButton)localObject2);
    ((View)localObject2).setOnClickListener((View.OnClickListener)localObject1);
    mCustomControlLayout = ((FrameLayout)findViewById(R.id.mr_custom_control));
    mDefaultControlLayout = ((FrameLayout)findViewById(R.id.mr_default_control));
    View.OnClickListener local4 = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView = mMediaController;
        if (paramAnonymousView != null)
        {
          paramAnonymousView = paramAnonymousView.getSessionActivity();
          if (paramAnonymousView != null) {
            try
            {
              paramAnonymousView.send();
              dismiss();
            }
            catch (PendingIntent.CanceledException localCanceledException)
            {
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append(paramAnonymousView);
              localStringBuilder.append(" was not sent, it had been canceled.");
              Log.e("MediaRouteCtrlDialog", localStringBuilder.toString());
            }
          }
        }
      }
    };
    localObject2 = (ImageView)findViewById(R.id.mr_art);
    mArtView = ((ImageView)localObject2);
    ((View)localObject2).setOnClickListener(local4);
    findViewById(R.id.mr_control_title_container).setOnClickListener(local4);
    mMediaMainControlLayout = ((LinearLayout)findViewById(R.id.mr_media_main_control));
    mDividerView = findViewById(R.id.mr_control_divider);
    mPlaybackControlLayout = ((RelativeLayout)findViewById(R.id.mr_playback_control));
    mTitleView = ((TextView)findViewById(R.id.mr_control_title));
    mSubtitleView = ((TextView)findViewById(R.id.mr_control_subtitle));
    localObject2 = (ImageButton)findViewById(R.id.mr_control_playback_ctrl);
    mPlaybackControlButton = ((ImageButton)localObject2);
    ((View)localObject2).setOnClickListener((View.OnClickListener)localObject1);
    localObject1 = (LinearLayout)findViewById(R.id.mr_volume_control);
    mVolumeControlLayout = ((LinearLayout)localObject1);
    ((View)localObject1).setVisibility(8);
    localObject1 = (SeekBar)findViewById(R.id.mr_volume_slider);
    mVolumeSlider = ((SeekBar)localObject1);
    ((View)localObject1).setTag(mRoute);
    localObject1 = new VolumeChangeListener();
    mVolumeChangeListener = ((VolumeChangeListener)localObject1);
    mVolumeSlider.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)localObject1);
    mVolumeGroupList = ((OverlayListView)findViewById(R.id.mr_volume_group_list));
    mGroupMemberRoutes = new ArrayList();
    localObject1 = new VolumeGroupAdapter(mVolumeGroupList.getContext(), mGroupMemberRoutes);
    mVolumeGroupAdapter = ((VolumeGroupAdapter)localObject1);
    mVolumeGroupList.setAdapter((ListAdapter)localObject1);
    mGroupMemberRoutesAnimatingWithBitmap = new HashSet();
    MediaRouterThemeHelper.setMediaControlsBackgroundColor(mContext, mMediaMainControlLayout, mVolumeGroupList, isGroup());
    MediaRouterThemeHelper.setVolumeSliderColor(mContext, (MediaRouteVolumeSlider)mVolumeSlider, mMediaMainControlLayout);
    localObject1 = new HashMap();
    mVolumeSliderMap = ((Map)localObject1);
    ((Map)localObject1).put(mRoute, mVolumeSlider);
    localObject1 = (MediaRouteExpandCollapseButton)findViewById(R.id.mr_group_expand_collapse);
    mGroupExpandCollapseButton = ((MediaRouteExpandCollapseButton)localObject1);
    ((MediaRouteExpandCollapseButton)localObject1).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView = MediaRouteControllerDialog.this;
        boolean bool = mIsGroupExpanded ^ true;
        mIsGroupExpanded = bool;
        if (bool) {
          mVolumeGroupList.setVisibility(0);
        }
        loadInterpolator();
        updateLayoutHeight(true);
      }
    });
    loadInterpolator();
    mGroupListAnimationDurationMs = mContext.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
    mGroupListFadeInDurationMs = mContext.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
    mGroupListFadeOutDurationMs = mContext.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
    paramBundle = onCreateMediaControlView(paramBundle);
    mCustomControlView = paramBundle;
    if (paramBundle != null)
    {
      mCustomControlLayout.addView(paramBundle);
      mCustomControlLayout.setVisibility(0);
    }
    mCreated = true;
    updateLayout();
  }
  
  @Nullable
  public View onCreateMediaControlView(@Nullable Bundle paramBundle)
  {
    return null;
  }
  
  public void onDetachedFromWindow()
  {
    mRouter.removeCallback(mCallback);
    setMediaSession(null);
    mAttachedToWindow = false;
    super.onDetachedFromWindow();
  }
  
  public boolean onKeyDown(int paramInt, @NonNull KeyEvent paramKeyEvent)
  {
    if ((paramInt != 25) && (paramInt != 24)) {
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
    if ((mEnableGroupVolumeUX) || (!mIsGroupExpanded))
    {
      paramKeyEvent = mRoute;
      if (paramInt == 25) {
        paramInt = -1;
      } else {
        paramInt = 1;
      }
      paramKeyEvent.requestUpdateVolume(paramInt);
    }
    return true;
  }
  
  public boolean onKeyUp(int paramInt, @NonNull KeyEvent paramKeyEvent)
  {
    if ((paramInt != 25) && (paramInt != 24)) {
      return super.onKeyUp(paramInt, paramKeyEvent);
    }
    return true;
  }
  
  public void setVolumeControlEnabled(boolean paramBoolean)
  {
    if (mVolumeControlEnabled != paramBoolean)
    {
      mVolumeControlEnabled = paramBoolean;
      if (mCreated) {
        update(false);
      }
    }
  }
  
  public void startGroupListFadeInAnimation()
  {
    clearGroupListAnimation(true);
    mVolumeGroupList.requestLayout();
    mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public void onGlobalLayout()
      {
        mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        startGroupListFadeInAnimationInternal();
      }
    });
  }
  
  public void startGroupListFadeInAnimationInternal()
  {
    Set localSet = mGroupMemberRoutesAdded;
    if ((localSet != null) && (localSet.size() != 0)) {
      fadeInAddedRoutes();
    } else {
      finishAnimation(true);
    }
  }
  
  public void update(boolean paramBoolean)
  {
    if (mRouteInVolumeSliderTouched != null)
    {
      mHasPendingUpdate = true;
      mPendingUpdateAnimationNeeded = (paramBoolean | mPendingUpdateAnimationNeeded);
      return;
    }
    int i = 0;
    mHasPendingUpdate = false;
    mPendingUpdateAnimationNeeded = false;
    if ((mRoute.isSelected()) && (!mRoute.isDefaultOrBluetooth()))
    {
      if (!mCreated) {
        return;
      }
      mRouteNameTextView.setText(mRoute.getName());
      Object localObject = mDisconnectButton;
      if (!mRoute.canDisconnect()) {
        i = 8;
      }
      ((View)localObject).setVisibility(i);
      if ((mCustomControlView == null) && (mArtIconIsLoaded))
      {
        if (isBitmapRecycled(mArtIconLoadedBitmap))
        {
          localObject = z2.t("Can't set artwork image with recycled bitmap: ");
          ((StringBuilder)localObject).append(mArtIconLoadedBitmap);
          Log.w("MediaRouteCtrlDialog", ((StringBuilder)localObject).toString());
        }
        else
        {
          mArtView.setImageBitmap(mArtIconLoadedBitmap);
          mArtView.setBackgroundColor(mArtIconBackgroundColor);
        }
        clearLoadedBitmap();
      }
      updateVolumeControlLayout();
      updatePlaybackControlLayout();
      updateLayoutHeight(paramBoolean);
      return;
    }
    dismiss();
  }
  
  public void updateArtIconIfNeeded()
  {
    if ((mCustomControlView == null) && (isIconChanged()) && ((!isGroup()) || (mEnableGroupVolumeUX)))
    {
      FetchArtTask localFetchArtTask = mFetchArtTask;
      if (localFetchArtTask != null) {
        localFetchArtTask.cancel(true);
      }
      localFetchArtTask = new FetchArtTask();
      mFetchArtTask = localFetchArtTask;
      localFetchArtTask.execute(new Void[0]);
    }
  }
  
  public void updateLayout()
  {
    int i = MediaRouteDialogHelper.getDialogWidth(mContext);
    getWindow().setLayout(i, -2);
    Object localObject = getWindow().getDecorView();
    mDialogContentWidth = (i - ((View)localObject).getPaddingLeft() - ((View)localObject).getPaddingRight());
    localObject = mContext.getResources();
    mVolumeGroupListItemIconSize = ((Resources)localObject).getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
    mVolumeGroupListItemHeight = ((Resources)localObject).getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
    mVolumeGroupListMaxHeight = ((Resources)localObject).getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
    mArtIconBitmap = null;
    mArtIconUri = null;
    updateArtIconIfNeeded();
    update(false);
  }
  
  public void updateLayoutHeight(final boolean paramBoolean)
  {
    mDefaultControlLayout.requestLayout();
    mDefaultControlLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public void onGlobalLayout()
      {
        mDefaultControlLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        MediaRouteControllerDialog localMediaRouteControllerDialog = MediaRouteControllerDialog.this;
        if (mIsGroupListAnimating) {
          mIsGroupListAnimationPending = true;
        } else {
          localMediaRouteControllerDialog.updateLayoutHeightInternal(paramBoolean);
        }
      }
    });
  }
  
  public void updateLayoutHeightInternal(boolean paramBoolean)
  {
    int i = getLayoutHeight(mMediaMainControlLayout);
    setLayoutHeight(mMediaMainControlLayout, -1);
    updateMediaControlVisibility(canShowPlaybackControlLayout());
    View localView = getWindow().getDecorView();
    int j = View.MeasureSpec.makeMeasureSpec(getWindowgetAttributeswidth, 1073741824);
    boolean bool1 = false;
    localView.measure(j, 0);
    setLayoutHeight(mMediaMainControlLayout, i);
    if ((mCustomControlView == null) && ((mArtView.getDrawable() instanceof BitmapDrawable)))
    {
      localObject = ((BitmapDrawable)mArtView.getDrawable()).getBitmap();
      if (localObject != null)
      {
        j = getDesiredArtHeight(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
        ImageView localImageView = mArtView;
        if (((Bitmap)localObject).getWidth() >= ((Bitmap)localObject).getHeight()) {
          localObject = ImageView.ScaleType.FIT_XY;
        } else {
          localObject = ImageView.ScaleType.FIT_CENTER;
        }
        localImageView.setScaleType((ImageView.ScaleType)localObject);
        break label169;
      }
    }
    j = 0;
    label169:
    int k = getMainControllerHeight(canShowPlaybackControlLayout());
    int m = mGroupMemberRoutes.size();
    if (isGroup())
    {
      i = mVolumeGroupListItemHeight;
      i = mRoute.getMemberRoutes().size() * i;
    }
    else
    {
      i = 0;
    }
    int n = i;
    if (m > 0) {
      n = i + mVolumeGroupListPaddingTop;
    }
    i = Math.min(n, mVolumeGroupListMaxHeight);
    if (!mIsGroupExpanded) {
      i = 0;
    }
    n = Math.max(j, i) + k;
    Object localObject = new Rect();
    localView.getWindowVisibleDisplayFrame((Rect)localObject);
    int i1 = mDialogAreaLayout.getMeasuredHeight();
    m = mDefaultControlLayout.getMeasuredHeight();
    m = ((Rect)localObject).height() - (i1 - m);
    if ((mCustomControlView == null) && (j > 0) && (n <= m))
    {
      mArtView.setVisibility(0);
      setLayoutHeight(mArtView, j);
    }
    else
    {
      j = getLayoutHeight(mVolumeGroupList);
      if (mMediaMainControlLayout.getMeasuredHeight() + j >= mDefaultControlLayout.getMeasuredHeight()) {
        mArtView.setVisibility(8);
      }
      n = i + k;
      j = 0;
    }
    if ((canShowPlaybackControlLayout()) && (n <= m)) {
      mPlaybackControlLayout.setVisibility(0);
    } else {
      mPlaybackControlLayout.setVisibility(8);
    }
    if (mPlaybackControlLayout.getVisibility() == 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    updateMediaControlVisibility(bool2);
    boolean bool2 = bool1;
    if (mPlaybackControlLayout.getVisibility() == 0) {
      bool2 = true;
    }
    n = getMainControllerHeight(bool2);
    j = Math.max(j, i) + n;
    if (j > m)
    {
      i -= j - m;
      j = m;
    }
    mMediaMainControlLayout.clearAnimation();
    mVolumeGroupList.clearAnimation();
    mDefaultControlLayout.clearAnimation();
    if (paramBoolean)
    {
      animateLayoutHeight(mMediaMainControlLayout, n);
      animateLayoutHeight(mVolumeGroupList, i);
      animateLayoutHeight(mDefaultControlLayout, j);
    }
    else
    {
      setLayoutHeight(mMediaMainControlLayout, n);
      setLayoutHeight(mVolumeGroupList, i);
      setLayoutHeight(mDefaultControlLayout, j);
    }
    setLayoutHeight(mExpandableAreaLayout, ((Rect)localObject).height());
    rebuildVolumeGroupList(paramBoolean);
  }
  
  public void updateVolumeGroupItemHeight(View paramView)
  {
    setLayoutHeight((LinearLayout)paramView.findViewById(R.id.volume_item_container), mVolumeGroupListItemHeight);
    paramView = paramView.findViewById(R.id.mr_volume_item_icon);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    int i = mVolumeGroupListItemIconSize;
    width = i;
    height = i;
    paramView.setLayoutParams(localLayoutParams);
  }
  
  public final class ClickListener
    implements View.OnClickListener
  {
    public ClickListener() {}
    
    public void onClick(View paramView)
    {
      int i = paramView.getId();
      int j = 1;
      int k = 1;
      if ((i != 16908313) && (i != 16908314))
      {
        if (i == R.id.mr_control_playback_ctrl)
        {
          paramView = MediaRouteControllerDialog.this;
          if (mMediaController != null)
          {
            paramView = mState;
            if (paramView != null)
            {
              j = paramView.getState();
              i = 0;
              if (j != 3) {
                k = 0;
              }
              if ((k != 0) && (isPauseActionSupported()))
              {
                mMediaController.getTransportControls().pause();
                j = R.string.mr_controller_pause;
              }
              else if ((k != 0) && (isStopActionSupported()))
              {
                mMediaController.getTransportControls().stop();
                j = R.string.mr_controller_stop;
              }
              else
              {
                j = i;
                if (k == 0)
                {
                  j = i;
                  if (isPlayActionSupported())
                  {
                    mMediaController.getTransportControls().play();
                    j = R.string.mr_controller_play;
                  }
                }
              }
              paramView = mAccessibilityManager;
              if ((paramView != null) && (paramView.isEnabled()) && (j != 0))
              {
                paramView = AccessibilityEvent.obtain(16384);
                paramView.setPackageName(mContext.getPackageName());
                paramView.setClassName(ClickListener.class.getName());
                paramView.getText().add(mContext.getString(j));
                mAccessibilityManager.sendAccessibilityEvent(paramView);
              }
            }
          }
        }
        else if (i == R.id.mr_close)
        {
          dismiss();
        }
      }
      else
      {
        if (mRoute.isSelected())
        {
          paramView = mRouter;
          if (i == 16908313) {
            j = 2;
          }
          paramView.unselect(j);
        }
        dismiss();
      }
    }
  }
  
  public class FetchArtTask
    extends AsyncTask<Void, Void, Bitmap>
  {
    private static final long SHOW_ANIM_TIME_THRESHOLD_MILLIS = 120L;
    private int mBackgroundColor;
    private final Bitmap mIconBitmap;
    private final Uri mIconUri;
    private long mStartTimeMillis;
    
    public FetchArtTask()
    {
      Object localObject1 = mDescription;
      Object localObject2 = null;
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = ((MediaDescriptionCompat)localObject1).getIconBitmap();
      }
      Object localObject3 = localObject1;
      if (MediaRouteControllerDialog.isBitmapRecycled((Bitmap)localObject1))
      {
        Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
        localObject3 = null;
      }
      mIconBitmap = ((Bitmap)localObject3);
      this$1 = mDescription;
      if (MediaRouteControllerDialog.this == null) {
        this$1 = (MediaRouteControllerDialog)localObject2;
      } else {
        this$1 = MediaRouteControllerDialog.this.getIconUri();
      }
      mIconUri = MediaRouteControllerDialog.this;
    }
    
    private InputStream openInputStreamByScheme(Uri paramUri)
      throws IOException
    {
      String str = paramUri.getScheme().toLowerCase();
      if ((!"android.resource".equals(str)) && (!"content".equals(str)) && (!"file".equals(str)))
      {
        paramUri = new URL(paramUri.toString()).openConnection();
        int i = MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS;
        paramUri.setConnectTimeout(i);
        paramUri.setReadTimeout(i);
        paramUri = paramUri.getInputStream();
      }
      else
      {
        paramUri = mContext.getContentResolver().openInputStream(paramUri);
      }
      if (paramUri == null) {
        paramUri = null;
      } else {
        paramUri = new BufferedInputStream(paramUri);
      }
      return paramUri;
    }
    
    /* Error */
    public Bitmap doInBackground(Void... paramVarArgs)
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 54	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:mIconBitmap	Landroid/graphics/Bitmap;
      //   4: astore_1
      //   5: iconst_0
      //   6: istore_2
      //   7: aconst_null
      //   8: astore_3
      //   9: aload_1
      //   10: ifnull +6 -> 16
      //   13: goto +535 -> 548
      //   16: aload_0
      //   17: getfield 60	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   20: astore_1
      //   21: aload_1
      //   22: ifnull +524 -> 546
      //   25: aload_0
      //   26: aload_1
      //   27: invokespecial 139	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:openInputStreamByScheme	(Landroid/net/Uri;)Ljava/io/InputStream;
      //   30: astore 4
      //   32: aload 4
      //   34: ifnonnull +84 -> 118
      //   37: aload 4
      //   39: astore_3
      //   40: aload 4
      //   42: astore_1
      //   43: new 141	java/lang/StringBuilder
      //   46: astore 5
      //   48: aload 4
      //   50: astore_3
      //   51: aload 4
      //   53: astore_1
      //   54: aload 5
      //   56: invokespecial 142	java/lang/StringBuilder:<init>	()V
      //   59: aload 4
      //   61: astore_3
      //   62: aload 4
      //   64: astore_1
      //   65: aload 5
      //   67: ldc -112
      //   69: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   72: pop
      //   73: aload 4
      //   75: astore_3
      //   76: aload 4
      //   78: astore_1
      //   79: aload 5
      //   81: aload_0
      //   82: getfield 60	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   85: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   88: pop
      //   89: aload 4
      //   91: astore_3
      //   92: aload 4
      //   94: astore_1
      //   95: ldc 44
      //   97: aload 5
      //   99: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   102: invokestatic 52	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
      //   105: pop
      //   106: aload 4
      //   108: ifnull +8 -> 116
      //   111: aload 4
      //   113: invokevirtual 157	java/io/InputStream:close	()V
      //   116: aconst_null
      //   117: areturn
      //   118: aload 4
      //   120: astore_3
      //   121: aload 4
      //   123: astore_1
      //   124: new 159	android/graphics/BitmapFactory$Options
      //   127: astore 6
      //   129: aload 4
      //   131: astore_3
      //   132: aload 4
      //   134: astore_1
      //   135: aload 6
      //   137: invokespecial 160	android/graphics/BitmapFactory$Options:<init>	()V
      //   140: aload 4
      //   142: astore_3
      //   143: aload 4
      //   145: astore_1
      //   146: aload 6
      //   148: iconst_1
      //   149: putfield 164	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
      //   152: aload 4
      //   154: astore_3
      //   155: aload 4
      //   157: astore_1
      //   158: aload 4
      //   160: aconst_null
      //   161: aload 6
      //   163: invokestatic 170	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   166: pop
      //   167: aload 4
      //   169: astore_3
      //   170: aload 4
      //   172: astore_1
      //   173: aload 6
      //   175: getfield 173	android/graphics/BitmapFactory$Options:outWidth	I
      //   178: ifeq +267 -> 445
      //   181: aload 4
      //   183: astore_3
      //   184: aload 4
      //   186: astore_1
      //   187: aload 6
      //   189: getfield 176	android/graphics/BitmapFactory$Options:outHeight	I
      //   192: istore 7
      //   194: iload 7
      //   196: ifne +6 -> 202
      //   199: goto +246 -> 445
      //   202: aload 4
      //   204: astore_1
      //   205: aload 4
      //   207: invokevirtual 179	java/io/InputStream:reset	()V
      //   210: goto +121 -> 331
      //   213: astore_1
      //   214: aload 4
      //   216: astore_3
      //   217: aload 4
      //   219: astore_1
      //   220: aload 4
      //   222: invokevirtual 157	java/io/InputStream:close	()V
      //   225: aload 4
      //   227: astore_3
      //   228: aload 4
      //   230: astore_1
      //   231: aload_0
      //   232: aload_0
      //   233: getfield 60	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   236: invokespecial 139	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:openInputStreamByScheme	(Landroid/net/Uri;)Ljava/io/InputStream;
      //   239: astore 5
      //   241: aload 5
      //   243: astore 4
      //   245: aload 5
      //   247: ifnonnull +84 -> 331
      //   250: aload 5
      //   252: astore_3
      //   253: aload 5
      //   255: astore_1
      //   256: new 141	java/lang/StringBuilder
      //   259: astore 4
      //   261: aload 5
      //   263: astore_3
      //   264: aload 5
      //   266: astore_1
      //   267: aload 4
      //   269: invokespecial 142	java/lang/StringBuilder:<init>	()V
      //   272: aload 5
      //   274: astore_3
      //   275: aload 5
      //   277: astore_1
      //   278: aload 4
      //   280: ldc -112
      //   282: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   285: pop
      //   286: aload 5
      //   288: astore_3
      //   289: aload 5
      //   291: astore_1
      //   292: aload 4
      //   294: aload_0
      //   295: getfield 60	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   298: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   301: pop
      //   302: aload 5
      //   304: astore_3
      //   305: aload 5
      //   307: astore_1
      //   308: ldc 44
      //   310: aload 4
      //   312: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   315: invokestatic 52	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
      //   318: pop
      //   319: aload 5
      //   321: ifnull +8 -> 329
      //   324: aload 5
      //   326: invokevirtual 157	java/io/InputStream:close	()V
      //   329: aconst_null
      //   330: areturn
      //   331: aload 4
      //   333: astore_3
      //   334: aload 4
      //   336: astore_1
      //   337: aload 6
      //   339: iconst_0
      //   340: putfield 164	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
      //   343: aload 4
      //   345: astore_3
      //   346: aload 4
      //   348: astore_1
      //   349: aload_0
      //   350: getfield 25	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:this$0	Landroidx/mediarouter/app/MediaRouteControllerDialog;
      //   353: aload 6
      //   355: getfield 173	android/graphics/BitmapFactory$Options:outWidth	I
      //   358: aload 6
      //   360: getfield 176	android/graphics/BitmapFactory$Options:outHeight	I
      //   363: invokevirtual 183	androidx/mediarouter/app/MediaRouteControllerDialog:getDesiredArtHeight	(II)I
      //   366: istore 7
      //   368: aload 4
      //   370: astore_3
      //   371: aload 4
      //   373: astore_1
      //   374: aload 6
      //   376: iconst_1
      //   377: aload 6
      //   379: getfield 176	android/graphics/BitmapFactory$Options:outHeight	I
      //   382: iload 7
      //   384: idiv
      //   385: invokestatic 189	java/lang/Integer:highestOneBit	(I)I
      //   388: invokestatic 194	java/lang/Math:max	(II)I
      //   391: putfield 197	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   394: aload 4
      //   396: astore_3
      //   397: aload 4
      //   399: astore_1
      //   400: aload_0
      //   401: invokevirtual 201	android/os/AsyncTask:isCancelled	()Z
      //   404: istore 8
      //   406: iload 8
      //   408: ifeq +10 -> 418
      //   411: aload 4
      //   413: invokevirtual 157	java/io/InputStream:close	()V
      //   416: aconst_null
      //   417: areturn
      //   418: aload 4
      //   420: astore_3
      //   421: aload 4
      //   423: astore_1
      //   424: aload 4
      //   426: aconst_null
      //   427: aload 6
      //   429: invokestatic 170	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   432: astore 5
      //   434: aload 4
      //   436: invokevirtual 157	java/io/InputStream:close	()V
      //   439: aload 5
      //   441: astore_1
      //   442: goto +106 -> 548
      //   445: aload 4
      //   447: invokevirtual 157	java/io/InputStream:close	()V
      //   450: aconst_null
      //   451: areturn
      //   452: astore 4
      //   454: goto +11 -> 465
      //   457: astore_1
      //   458: goto +78 -> 536
      //   461: astore 4
      //   463: aconst_null
      //   464: astore_3
      //   465: aload_3
      //   466: astore_1
      //   467: new 141	java/lang/StringBuilder
      //   470: astore 5
      //   472: aload_3
      //   473: astore_1
      //   474: aload 5
      //   476: invokespecial 142	java/lang/StringBuilder:<init>	()V
      //   479: aload_3
      //   480: astore_1
      //   481: aload 5
      //   483: ldc -112
      //   485: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   488: pop
      //   489: aload_3
      //   490: astore_1
      //   491: aload 5
      //   493: aload_0
      //   494: getfield 60	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   497: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   500: pop
      //   501: aload_3
      //   502: astore_1
      //   503: ldc 44
      //   505: aload 5
      //   507: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   510: aload 4
      //   512: invokestatic 204	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   515: pop
      //   516: aload_3
      //   517: ifnull +29 -> 546
      //   520: aload_3
      //   521: invokevirtual 157	java/io/InputStream:close	()V
      //   524: goto +22 -> 546
      //   527: astore_3
      //   528: aload_1
      //   529: astore 4
      //   531: aload_3
      //   532: astore_1
      //   533: aload 4
      //   535: astore_3
      //   536: aload_3
      //   537: ifnull +7 -> 544
      //   540: aload_3
      //   541: invokevirtual 157	java/io/InputStream:close	()V
      //   544: aload_1
      //   545: athrow
      //   546: aconst_null
      //   547: astore_1
      //   548: aload_1
      //   549: invokestatic 42	androidx/mediarouter/app/MediaRouteControllerDialog:isBitmapRecycled	(Landroid/graphics/Bitmap;)Z
      //   552: ifeq +36 -> 588
      //   555: new 141	java/lang/StringBuilder
      //   558: dup
      //   559: invokespecial 142	java/lang/StringBuilder:<init>	()V
      //   562: astore_3
      //   563: aload_3
      //   564: ldc -50
      //   566: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   569: pop
      //   570: aload_3
      //   571: aload_1
      //   572: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   575: pop
      //   576: ldc 44
      //   578: aload_3
      //   579: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   582: invokestatic 52	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
      //   585: pop
      //   586: aconst_null
      //   587: areturn
      //   588: aload_1
      //   589: ifnull +67 -> 656
      //   592: aload_1
      //   593: invokevirtual 212	android/graphics/Bitmap:getWidth	()I
      //   596: aload_1
      //   597: invokevirtual 215	android/graphics/Bitmap:getHeight	()I
      //   600: if_icmpge +56 -> 656
      //   603: new 217	androidx/palette/graphics/Palette$Builder
      //   606: dup
      //   607: aload_1
      //   608: invokespecial 220	androidx/palette/graphics/Palette$Builder:<init>	(Landroid/graphics/Bitmap;)V
      //   611: iconst_1
      //   612: invokevirtual 224	androidx/palette/graphics/Palette$Builder:maximumColorCount	(I)Landroidx/palette/graphics/Palette$Builder;
      //   615: invokevirtual 228	androidx/palette/graphics/Palette$Builder:generate	()Landroidx/palette/graphics/Palette;
      //   618: astore_3
      //   619: aload_3
      //   620: invokevirtual 234	androidx/palette/graphics/Palette:getSwatches	()Ljava/util/List;
      //   623: invokeinterface 239 1 0
      //   628: ifeq +6 -> 634
      //   631: goto +20 -> 651
      //   634: aload_3
      //   635: invokevirtual 234	androidx/palette/graphics/Palette:getSwatches	()Ljava/util/List;
      //   638: iconst_0
      //   639: invokeinterface 243 2 0
      //   644: checkcast 245	androidx/palette/graphics/Palette$Swatch
      //   647: invokevirtual 248	androidx/palette/graphics/Palette$Swatch:getRgb	()I
      //   650: istore_2
      //   651: aload_0
      //   652: iload_2
      //   653: putfield 250	androidx/mediarouter/app/MediaRouteControllerDialog$FetchArtTask:mBackgroundColor	I
      //   656: aload_1
      //   657: areturn
      //   658: astore_1
      //   659: goto -543 -> 116
      //   662: astore_1
      //   663: goto -334 -> 329
      //   666: astore_1
      //   667: goto -251 -> 416
      //   670: astore_1
      //   671: goto -232 -> 439
      //   674: astore_1
      //   675: goto -225 -> 450
      //   678: astore_1
      //   679: goto -133 -> 546
      //   682: astore_3
      //   683: goto -139 -> 544
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	686	0	this	FetchArtTask
      //   0	686	1	paramVarArgs	Void[]
      //   6	647	2	i	int
      //   8	513	3	localObject1	Object
      //   527	5	3	localObject2	Object
      //   535	100	3	localObject3	Object
      //   682	1	3	localIOException1	IOException
      //   30	416	4	localObject4	Object
      //   452	1	4	localIOException2	IOException
      //   461	50	4	localIOException3	IOException
      //   529	5	4	arrayOfVoid	Void[]
      //   46	460	5	localObject5	Object
      //   127	301	6	localOptions	android.graphics.BitmapFactory.Options
      //   192	193	7	j	int
      //   404	3	8	bool	boolean
      // Exception table:
      //   from	to	target	type
      //   205	210	213	java/io/IOException
      //   43	48	452	java/io/IOException
      //   54	59	452	java/io/IOException
      //   65	73	452	java/io/IOException
      //   79	89	452	java/io/IOException
      //   95	106	452	java/io/IOException
      //   124	129	452	java/io/IOException
      //   135	140	452	java/io/IOException
      //   146	152	452	java/io/IOException
      //   158	167	452	java/io/IOException
      //   173	181	452	java/io/IOException
      //   187	194	452	java/io/IOException
      //   220	225	452	java/io/IOException
      //   231	241	452	java/io/IOException
      //   256	261	452	java/io/IOException
      //   267	272	452	java/io/IOException
      //   278	286	452	java/io/IOException
      //   292	302	452	java/io/IOException
      //   308	319	452	java/io/IOException
      //   337	343	452	java/io/IOException
      //   349	368	452	java/io/IOException
      //   374	394	452	java/io/IOException
      //   400	406	452	java/io/IOException
      //   424	434	452	java/io/IOException
      //   25	32	457	finally
      //   25	32	461	java/io/IOException
      //   43	48	527	finally
      //   54	59	527	finally
      //   65	73	527	finally
      //   79	89	527	finally
      //   95	106	527	finally
      //   124	129	527	finally
      //   135	140	527	finally
      //   146	152	527	finally
      //   158	167	527	finally
      //   173	181	527	finally
      //   187	194	527	finally
      //   205	210	527	finally
      //   220	225	527	finally
      //   231	241	527	finally
      //   256	261	527	finally
      //   267	272	527	finally
      //   278	286	527	finally
      //   292	302	527	finally
      //   308	319	527	finally
      //   337	343	527	finally
      //   349	368	527	finally
      //   374	394	527	finally
      //   400	406	527	finally
      //   424	434	527	finally
      //   467	472	527	finally
      //   474	479	527	finally
      //   481	489	527	finally
      //   491	501	527	finally
      //   503	516	527	finally
      //   111	116	658	java/io/IOException
      //   324	329	662	java/io/IOException
      //   411	416	666	java/io/IOException
      //   434	439	670	java/io/IOException
      //   445	450	674	java/io/IOException
      //   520	524	678	java/io/IOException
      //   540	544	682	java/io/IOException
    }
    
    public Bitmap getIconBitmap()
    {
      return mIconBitmap;
    }
    
    public Uri getIconUri()
    {
      return mIconUri;
    }
    
    public void onPostExecute(Bitmap paramBitmap)
    {
      MediaRouteControllerDialog localMediaRouteControllerDialog = MediaRouteControllerDialog.this;
      mFetchArtTask = null;
      if ((!ObjectsCompat.equals(mArtIconBitmap, mIconBitmap)) || (!ObjectsCompat.equals(mArtIconUri, mIconUri)))
      {
        localMediaRouteControllerDialog = MediaRouteControllerDialog.this;
        mArtIconBitmap = mIconBitmap;
        mArtIconLoadedBitmap = paramBitmap;
        mArtIconUri = mIconUri;
        mArtIconBackgroundColor = mBackgroundColor;
        boolean bool = true;
        mArtIconIsLoaded = true;
        long l1 = SystemClock.uptimeMillis();
        long l2 = mStartTimeMillis;
        paramBitmap = MediaRouteControllerDialog.this;
        if (l1 - l2 <= 120L) {
          bool = false;
        }
        paramBitmap.update(bool);
      }
    }
    
    public void onPreExecute()
    {
      mStartTimeMillis = SystemClock.uptimeMillis();
      clearLoadedBitmap();
    }
  }
  
  public final class MediaControllerCallback
    extends MediaControllerCompat.Callback
  {
    public MediaControllerCallback() {}
    
    public void onMetadataChanged(MediaMetadataCompat paramMediaMetadataCompat)
    {
      MediaRouteControllerDialog localMediaRouteControllerDialog = MediaRouteControllerDialog.this;
      if (paramMediaMetadataCompat == null) {
        paramMediaMetadataCompat = null;
      } else {
        paramMediaMetadataCompat = paramMediaMetadataCompat.getDescription();
      }
      mDescription = paramMediaMetadataCompat;
      updateArtIconIfNeeded();
      update(false);
    }
    
    public void onPlaybackStateChanged(PlaybackStateCompat paramPlaybackStateCompat)
    {
      MediaRouteControllerDialog localMediaRouteControllerDialog = MediaRouteControllerDialog.this;
      mState = paramPlaybackStateCompat;
      localMediaRouteControllerDialog.update(false);
    }
    
    public void onSessionDestroyed()
    {
      MediaRouteControllerDialog localMediaRouteControllerDialog = MediaRouteControllerDialog.this;
      MediaControllerCompat localMediaControllerCompat = mMediaController;
      if (localMediaControllerCompat != null)
      {
        localMediaControllerCompat.unregisterCallback(mControllerCallback);
        mMediaController = null;
      }
    }
  }
  
  public final class MediaRouterCallback
    extends MediaRouter.Callback
  {
    public MediaRouterCallback() {}
    
    public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      update(true);
    }
    
    public void onRouteUnselected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      update(false);
    }
    
    public void onRouteVolumeChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      SeekBar localSeekBar = (SeekBar)mVolumeSliderMap.get(paramRouteInfo);
      int i = paramRouteInfo.getVolume();
      if (MediaRouteControllerDialog.DEBUG)
      {
        paramMediaRouter = new StringBuilder();
        paramMediaRouter.append("onRouteVolumeChanged(), route.getVolume:");
        paramMediaRouter.append(i);
        Log.d("MediaRouteCtrlDialog", paramMediaRouter.toString());
      }
      if ((localSeekBar != null) && (mRouteInVolumeSliderTouched != paramRouteInfo)) {
        localSeekBar.setProgress(i);
      }
    }
  }
  
  public class VolumeChangeListener
    implements SeekBar.OnSeekBarChangeListener
  {
    private final Runnable mStopTrackingTouch = new Runnable()
    {
      public void run()
      {
        MediaRouteControllerDialog localMediaRouteControllerDialog = MediaRouteControllerDialog.this;
        if (mRouteInVolumeSliderTouched != null)
        {
          mRouteInVolumeSliderTouched = null;
          if (mHasPendingUpdate) {
            localMediaRouteControllerDialog.update(mPendingUpdateAnimationNeeded);
          }
        }
      }
    };
    
    public VolumeChangeListener() {}
    
    public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
    {
      if (paramBoolean)
      {
        paramSeekBar = (MediaRouter.RouteInfo)paramSeekBar.getTag();
        if (MediaRouteControllerDialog.DEBUG)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(");
          localStringBuilder.append(paramInt);
          localStringBuilder.append(")");
          Log.d("MediaRouteCtrlDialog", localStringBuilder.toString());
        }
        paramSeekBar.requestSetVolume(paramInt);
      }
    }
    
    public void onStartTrackingTouch(SeekBar paramSeekBar)
    {
      MediaRouteControllerDialog localMediaRouteControllerDialog = MediaRouteControllerDialog.this;
      if (mRouteInVolumeSliderTouched != null) {
        mVolumeSlider.removeCallbacks(mStopTrackingTouch);
      }
      mRouteInVolumeSliderTouched = ((MediaRouter.RouteInfo)paramSeekBar.getTag());
    }
    
    public void onStopTrackingTouch(SeekBar paramSeekBar)
    {
      mVolumeSlider.postDelayed(mStopTrackingTouch, 500L);
    }
  }
  
  public class VolumeGroupAdapter
    extends ArrayAdapter<MediaRouter.RouteInfo>
  {
    public final float mDisabledAlpha;
    
    public VolumeGroupAdapter(List<MediaRouter.RouteInfo> paramList)
    {
      super(0, localList);
      mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(paramList);
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = 0;
      if (paramView == null) {
        paramView = LayoutInflater.from(paramViewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, paramViewGroup, false);
      } else {
        updateVolumeGroupItemHeight(paramView);
      }
      MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)getItem(paramInt);
      if (localRouteInfo != null)
      {
        boolean bool = localRouteInfo.isEnabled();
        Object localObject = (TextView)paramView.findViewById(R.id.mr_name);
        ((TextView)localObject).setEnabled(bool);
        ((TextView)localObject).setText(localRouteInfo.getName());
        localObject = (MediaRouteVolumeSlider)paramView.findViewById(R.id.mr_volume_slider);
        MediaRouterThemeHelper.setVolumeSliderColor(paramViewGroup.getContext(), (MediaRouteVolumeSlider)localObject, mVolumeGroupList);
        ((View)localObject).setTag(localRouteInfo);
        mVolumeSliderMap.put(localRouteInfo, localObject);
        ((MediaRouteVolumeSlider)localObject).setHideThumb(bool ^ true);
        ((View)localObject).setEnabled(bool);
        if (bool) {
          if (isVolumeControlAvailable(localRouteInfo))
          {
            ((ProgressBar)localObject).setMax(localRouteInfo.getVolumeMax());
            ((ProgressBar)localObject).setProgress(localRouteInfo.getVolume());
            ((SeekBar)localObject).setOnSeekBarChangeListener(mVolumeChangeListener);
          }
          else
          {
            ((ProgressBar)localObject).setMax(100);
            ((ProgressBar)localObject).setProgress(100);
            ((View)localObject).setEnabled(false);
          }
        }
        paramViewGroup = (ImageView)paramView.findViewById(R.id.mr_volume_item_icon);
        if (bool) {
          paramInt = 255;
        } else {
          paramInt = (int)(mDisabledAlpha * 255.0F);
        }
        paramViewGroup.setAlpha(paramInt);
        paramViewGroup = (LinearLayout)paramView.findViewById(R.id.volume_item_container);
        paramInt = i;
        if (mGroupMemberRoutesAnimatingWithBitmap.contains(localRouteInfo)) {
          paramInt = 4;
        }
        paramViewGroup.setVisibility(paramInt);
        paramViewGroup = mGroupMemberRoutesAdded;
        if ((paramViewGroup != null) && (paramViewGroup.contains(localRouteInfo)))
        {
          paramViewGroup = new AlphaAnimation(0.0F, 0.0F);
          paramViewGroup.setDuration(0L);
          paramViewGroup.setFillEnabled(true);
          paramViewGroup.setFillAfter(true);
          paramView.clearAnimation();
          paramView.startAnimation(paramViewGroup);
        }
      }
      return paramView;
    }
    
    public boolean isEnabled(int paramInt)
    {
      return false;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.mediarouter.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.os.AsyncTask;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.mediarouter.R.attr;
import androidx.mediarouter.R.string;
import androidx.mediarouter.R.styleable;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.Callback;
import androidx.mediarouter.media.MediaRouter.ProviderInfo;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import androidx.mediarouter.media.MediaRouterParams;
import androidx.mediarouter.media.MediaRouterParams.Builder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaRouteButton
  extends View
{
  private static final int[] CHECKABLE_STATE_SET = { 16842911 };
  private static final int[] CHECKED_STATE_SET;
  private static final String CHOOSER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
  private static final int CONNECTION_STATE_CONNECTED = 2;
  private static final int CONNECTION_STATE_CONNECTING = 1;
  private static final int CONNECTION_STATE_DISCONNECTED = 0;
  private static final String CONTROLLER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
  private static final String TAG = "MediaRouteButton";
  private static ConnectivityReceiver sConnectivityReceiver;
  public static final SparseArray<Drawable.ConstantState> sRemoteIndicatorCache = new SparseArray(2);
  private boolean mAlwaysVisible;
  private boolean mAttachedToWindow;
  private ColorStateList mButtonTint;
  private final MediaRouterCallback mCallback;
  private boolean mCheatSheetEnabled;
  private int mConnectionState;
  private MediaRouteDialogFactory mDialogFactory = MediaRouteDialogFactory.getDefault();
  public boolean mIsFixedIcon;
  private int mLastConnectionState;
  private int mMinHeight;
  private int mMinWidth;
  private Drawable mRemoteIndicator;
  public RemoteIndicatorLoader mRemoteIndicatorLoader;
  private int mRemoteIndicatorResIdToLoad;
  private final MediaRouter mRouter;
  private MediaRouteSelector mSelector = MediaRouteSelector.EMPTY;
  private int mVisibility = 0;
  
  static
  {
    CHECKED_STATE_SET = new int[] { 16842912 };
  }
  
  public MediaRouteButton(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MediaRouteButton(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.mediaRouteButtonStyle);
  }
  
  public MediaRouteButton(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(MediaRouterThemeHelper.createThemedButtonContext(paramContext), paramAttributeSet, paramInt);
    paramContext = getContext();
    int[] arrayOfInt = R.styleable.MediaRouteButton;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 0);
    ViewCompat.saveAttributeDataForStyleable(this, paramContext, arrayOfInt, paramAttributeSet, localTypedArray, paramInt, 0);
    if (isInEditMode())
    {
      mRouter = null;
      mCallback = null;
      mRemoteIndicator = AppCompatResources.getDrawable(paramContext, localTypedArray.getResourceId(R.styleable.MediaRouteButton_externalRouteEnabledDrawableStatic, 0));
      return;
    }
    paramAttributeSet = MediaRouter.getInstance(paramContext);
    mRouter = paramAttributeSet;
    mCallback = new MediaRouterCallback();
    paramAttributeSet = paramAttributeSet.getSelectedRoute();
    if ((paramAttributeSet.isDefaultOrBluetooth() ^ true)) {
      paramInt = paramAttributeSet.getConnectionState();
    } else {
      paramInt = 0;
    }
    mConnectionState = paramInt;
    mLastConnectionState = paramInt;
    if (sConnectivityReceiver == null) {
      sConnectivityReceiver = new ConnectivityReceiver(paramContext.getApplicationContext());
    }
    mButtonTint = localTypedArray.getColorStateList(R.styleable.MediaRouteButton_mediaRouteButtonTint);
    mMinWidth = localTypedArray.getDimensionPixelSize(R.styleable.MediaRouteButton_android_minWidth, 0);
    mMinHeight = localTypedArray.getDimensionPixelSize(R.styleable.MediaRouteButton_android_minHeight, 0);
    int i = localTypedArray.getResourceId(R.styleable.MediaRouteButton_externalRouteEnabledDrawableStatic, 0);
    mRemoteIndicatorResIdToLoad = localTypedArray.getResourceId(R.styleable.MediaRouteButton_externalRouteEnabledDrawable, 0);
    localTypedArray.recycle();
    paramInt = mRemoteIndicatorResIdToLoad;
    if (paramInt != 0)
    {
      paramContext = (Drawable.ConstantState)sRemoteIndicatorCache.get(paramInt);
      if (paramContext != null) {
        setRemoteIndicatorDrawable(paramContext.newDrawable());
      }
    }
    if (mRemoteIndicator == null) {
      if (i != 0)
      {
        paramContext = (Drawable.ConstantState)sRemoteIndicatorCache.get(i);
        if (paramContext != null)
        {
          setRemoteIndicatorDrawableInternal(paramContext.newDrawable());
        }
        else
        {
          paramContext = new RemoteIndicatorLoader(i, getContext());
          mRemoteIndicatorLoader = paramContext;
          paramContext.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
      }
      else
      {
        loadRemoteIndicatorIfNeeded();
      }
    }
    updateContentDescription();
    setClickable(true);
  }
  
  private Activity getActivity()
  {
    for (Context localContext = getContext(); (localContext instanceof ContextWrapper); localContext = ((ContextWrapper)localContext).getBaseContext()) {
      if ((localContext instanceof Activity)) {
        return (Activity)localContext;
      }
    }
    return null;
  }
  
  private FragmentManager getFragmentManager()
  {
    Activity localActivity = getActivity();
    if ((localActivity instanceof FragmentActivity)) {
      return ((FragmentActivity)localActivity).getSupportFragmentManager();
    }
    return null;
  }
  
  private void loadRemoteIndicatorIfNeeded()
  {
    if (mRemoteIndicatorResIdToLoad > 0)
    {
      RemoteIndicatorLoader localRemoteIndicatorLoader = mRemoteIndicatorLoader;
      if (localRemoteIndicatorLoader != null) {
        localRemoteIndicatorLoader.cancel(false);
      }
      localRemoteIndicatorLoader = new RemoteIndicatorLoader(mRemoteIndicatorResIdToLoad, getContext());
      mRemoteIndicatorLoader = localRemoteIndicatorLoader;
      mRemoteIndicatorResIdToLoad = 0;
      localRemoteIndicatorLoader.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }
  }
  
  private boolean showDialogForType(int paramInt)
  {
    Object localObject1 = getFragmentManager();
    if (localObject1 != null)
    {
      Object localObject2;
      if (mRouter.getSelectedRoute().isDefaultOrBluetooth())
      {
        if (((FragmentManager)localObject1).findFragmentByTag("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null)
        {
          Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
          return false;
        }
        localObject2 = mDialogFactory.onCreateChooserDialogFragment();
        ((MediaRouteChooserDialogFragment)localObject2).setRouteSelector(mSelector);
        if (paramInt == 2) {
          ((MediaRouteChooserDialogFragment)localObject2).setUseDynamicGroup(true);
        }
        localObject1 = ((FragmentManager)localObject1).beginTransaction();
        ((FragmentTransaction)localObject1).add((Fragment)localObject2, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
        ((FragmentTransaction)localObject1).commitAllowingStateLoss();
      }
      else
      {
        if (((FragmentManager)localObject1).findFragmentByTag("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null)
        {
          Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
          return false;
        }
        localObject2 = mDialogFactory.onCreateControllerDialogFragment();
        ((MediaRouteControllerDialogFragment)localObject2).setRouteSelector(mSelector);
        if (paramInt == 2) {
          ((MediaRouteControllerDialogFragment)localObject2).setUseDynamicGroup(true);
        }
        localObject1 = ((FragmentManager)localObject1).beginTransaction();
        ((FragmentTransaction)localObject1).add((Fragment)localObject2, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
        ((FragmentTransaction)localObject1).commitAllowingStateLoss();
      }
      return true;
    }
    throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
  }
  
  private boolean showOutputSwitcher()
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool2;
    if (i >= 31)
    {
      boolean bool1 = showOutputSwitcherForAndroidSAndAbove();
      bool2 = bool1;
      if (!bool1) {
        bool2 = showOutputSwitcherForAndroidR();
      }
    }
    else if (i == 30)
    {
      bool2 = showOutputSwitcherForAndroidR();
    }
    else
    {
      bool2 = false;
    }
    return bool2;
  }
  
  private boolean showOutputSwitcherForAndroidR()
  {
    Context localContext = getContext();
    Intent localIntent = new Intent().setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", localContext.getPackageName()).putExtra("key_media_session_token", mRouter.getMediaSessionToken());
    Iterator localIterator = localContext.getPackageManager().queryIntentActivities(localIntent, 0).iterator();
    while (localIterator.hasNext())
    {
      Object localObject = nextactivityInfo;
      if (localObject != null)
      {
        localObject = applicationInfo;
        if ((localObject != null) && ((flags & 0x81) != 0))
        {
          localContext.startActivity(localIntent);
          return true;
        }
      }
    }
    return false;
  }
  
  private boolean showOutputSwitcherForAndroidSAndAbove()
  {
    Context localContext = getContext();
    Intent localIntent = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", localContext.getPackageName()).putExtra("key_media_session_token", mRouter.getMediaSessionToken());
    Iterator localIterator = localContext.getPackageManager().queryBroadcastReceivers(localIntent, 0).iterator();
    while (localIterator.hasNext())
    {
      Object localObject = nextactivityInfo;
      if (localObject != null)
      {
        localObject = applicationInfo;
        if ((localObject != null) && ((flags & 0x81) != 0))
        {
          localContext.sendBroadcast(localIntent);
          return true;
        }
      }
    }
    return false;
  }
  
  private void updateContentDescription()
  {
    int i = mConnectionState;
    if (i != 1)
    {
      if (i != 2) {
        i = R.string.mr_cast_button_disconnected;
      } else {
        i = R.string.mr_cast_button_connected;
      }
    }
    else {
      i = R.string.mr_cast_button_connecting;
    }
    String str = getContext().getString(i);
    setContentDescription(str);
    if ((!mCheatSheetEnabled) || (TextUtils.isEmpty(str))) {
      str = null;
    }
    TooltipCompat.setTooltipText(this, str);
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (mRemoteIndicator != null)
    {
      Object localObject = getDrawableState();
      mRemoteIndicator.setState((int[])localObject);
      if ((mRemoteIndicator.getCurrent() instanceof AnimationDrawable))
      {
        localObject = (AnimationDrawable)mRemoteIndicator.getCurrent();
        int i = mConnectionState;
        if ((i != 1) && (mLastConnectionState == i))
        {
          if ((i == 2) && (!((AnimationDrawable)localObject).isRunning())) {
            ((DrawableContainer)localObject).selectDrawable(((AnimationDrawable)localObject).getNumberOfFrames() - 1);
          }
        }
        else if (!((AnimationDrawable)localObject).isRunning()) {
          ((AnimationDrawable)localObject).start();
        }
      }
      invalidate();
    }
    mLastConnectionState = mConnectionState;
  }
  
  @Deprecated
  public void enableDynamicGroup()
  {
    Object localObject = mRouter.getRouterParams();
    if (localObject == null) {
      localObject = new MediaRouterParams.Builder();
    } else {
      localObject = new MediaRouterParams.Builder((MediaRouterParams)localObject);
    }
    ((MediaRouterParams.Builder)localObject).setDialogType(2);
    mRouter.setRouterParams(((MediaRouterParams.Builder)localObject).build());
  }
  
  @NonNull
  public MediaRouteDialogFactory getDialogFactory()
  {
    return mDialogFactory;
  }
  
  @NonNull
  public MediaRouteSelector getRouteSelector()
  {
    return mSelector;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    Drawable localDrawable = mRemoteIndicator;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (isInEditMode()) {
      return;
    }
    mAttachedToWindow = true;
    if (!mSelector.isEmpty()) {
      mRouter.addCallback(mSelector, mCallback);
    }
    refreshRoute();
    sConnectivityReceiver.registerReceiver(this);
  }
  
  @NonNull
  public int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (mRouter == null) {
      return arrayOfInt;
    }
    if (mIsFixedIcon) {
      return arrayOfInt;
    }
    paramInt = mConnectionState;
    if (paramInt != 1)
    {
      if (paramInt == 2) {
        View.mergeDrawableStates(arrayOfInt, CHECKED_STATE_SET);
      }
    }
    else {
      View.mergeDrawableStates(arrayOfInt, CHECKABLE_STATE_SET);
    }
    return arrayOfInt;
  }
  
  public void onDetachedFromWindow()
  {
    if (!isInEditMode())
    {
      mAttachedToWindow = false;
      if (!mSelector.isEmpty()) {
        mRouter.removeCallback(mCallback);
      }
      sConnectivityReceiver.unregisterReceiver(this);
    }
    super.onDetachedFromWindow();
  }
  
  public void onDraw(@NonNull Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (mRemoteIndicator != null)
    {
      int i = getPaddingLeft();
      int j = getWidth();
      int k = getPaddingRight();
      int m = getPaddingTop();
      int n = getHeight();
      int i1 = getPaddingBottom();
      int i2 = mRemoteIndicator.getIntrinsicWidth();
      int i3 = mRemoteIndicator.getIntrinsicHeight();
      j = (j - k - i - i2) / 2 + i;
      i1 = (n - i1 - m - i3) / 2 + m;
      mRemoteIndicator.setBounds(j, i1, i2 + j, i3 + i1);
      mRemoteIndicator.draw(paramCanvas);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    int k = View.MeasureSpec.getMode(paramInt1);
    int m = View.MeasureSpec.getMode(paramInt2);
    int n = mMinWidth;
    Drawable localDrawable = mRemoteIndicator;
    paramInt2 = 0;
    if (localDrawable != null)
    {
      i1 = localDrawable.getIntrinsicWidth();
      paramInt1 = getPaddingLeft();
      paramInt1 = getPaddingRight() + (paramInt1 + i1);
    }
    else
    {
      paramInt1 = 0;
    }
    n = Math.max(n, paramInt1);
    int i1 = mMinHeight;
    localDrawable = mRemoteIndicator;
    paramInt1 = paramInt2;
    if (localDrawable != null)
    {
      paramInt2 = localDrawable.getIntrinsicHeight();
      paramInt1 = getPaddingTop();
      paramInt1 = getPaddingBottom() + (paramInt1 + paramInt2);
    }
    i1 = Math.max(i1, paramInt1);
    if (k != Integer.MIN_VALUE)
    {
      paramInt1 = i;
      if (k != 1073741824) {
        paramInt1 = n;
      }
    }
    else
    {
      paramInt1 = Math.min(i, n);
    }
    if (m != Integer.MIN_VALUE)
    {
      paramInt2 = j;
      if (m != 1073741824) {
        paramInt2 = i1;
      }
    }
    else
    {
      paramInt2 = Math.min(j, i1);
    }
    setMeasuredDimension(paramInt1, paramInt2);
  }
  
  public boolean performClick()
  {
    boolean bool1 = super.performClick();
    boolean bool2 = false;
    if (!bool1) {
      playSoundEffect(0);
    }
    loadRemoteIndicatorIfNeeded();
    if ((showDialog()) || (bool1)) {
      bool2 = true;
    }
    return bool2;
  }
  
  public void refreshRoute()
  {
    MediaRouter.RouteInfo localRouteInfo = mRouter.getSelectedRoute();
    boolean bool1 = localRouteInfo.isDefaultOrBluetooth();
    boolean bool2 = true;
    int i = bool1 ^ true;
    int j;
    if (i != 0) {
      j = localRouteInfo.getConnectionState();
    } else {
      j = 0;
    }
    if (mConnectionState != j)
    {
      mConnectionState = j;
      updateContentDescription();
      refreshDrawableState();
    }
    if (j == 1) {
      loadRemoteIndicatorIfNeeded();
    }
    if (mAttachedToWindow)
    {
      bool1 = bool2;
      if (!mAlwaysVisible)
      {
        bool1 = bool2;
        if (i == 0) {
          if (mRouter.isRouteAvailable(mSelector, 1)) {
            bool1 = bool2;
          } else {
            bool1 = false;
          }
        }
      }
      setEnabled(bool1);
    }
  }
  
  public void refreshVisibility()
  {
    int i;
    if ((mVisibility == 0) && (!mAlwaysVisible) && (!sConnectivityReceiver.isConnected())) {
      i = 4;
    } else {
      i = mVisibility;
    }
    super.setVisibility(i);
    Drawable localDrawable = mRemoteIndicator;
    if (localDrawable != null)
    {
      boolean bool;
      if (getVisibility() == 0) {
        bool = true;
      } else {
        bool = false;
      }
      localDrawable.setVisible(bool, false);
    }
  }
  
  public void setAlwaysVisible(boolean paramBoolean)
  {
    if (paramBoolean != mAlwaysVisible)
    {
      mAlwaysVisible = paramBoolean;
      refreshVisibility();
      refreshRoute();
    }
  }
  
  public void setCheatSheetEnabled(boolean paramBoolean)
  {
    if (paramBoolean != mCheatSheetEnabled)
    {
      mCheatSheetEnabled = paramBoolean;
      updateContentDescription();
    }
  }
  
  public void setDialogFactory(@NonNull MediaRouteDialogFactory paramMediaRouteDialogFactory)
  {
    if (paramMediaRouteDialogFactory != null)
    {
      mDialogFactory = paramMediaRouteDialogFactory;
      return;
    }
    throw new IllegalArgumentException("factory must not be null");
  }
  
  public void setRemoteIndicatorDrawable(@Nullable Drawable paramDrawable)
  {
    mRemoteIndicatorResIdToLoad = 0;
    setRemoteIndicatorDrawableInternal(paramDrawable);
  }
  
  public void setRemoteIndicatorDrawableInternal(Drawable paramDrawable)
  {
    Object localObject = mRemoteIndicatorLoader;
    if (localObject != null) {
      ((AsyncTask)localObject).cancel(false);
    }
    localObject = mRemoteIndicator;
    if (localObject != null)
    {
      ((Drawable)localObject).setCallback(null);
      unscheduleDrawable(mRemoteIndicator);
    }
    localObject = paramDrawable;
    if (paramDrawable != null)
    {
      localObject = paramDrawable;
      if (mButtonTint != null)
      {
        localObject = DrawableCompat.wrap(paramDrawable.mutate());
        DrawableCompat.setTintList((Drawable)localObject, mButtonTint);
      }
      ((Drawable)localObject).setCallback(this);
      ((Drawable)localObject).setState(getDrawableState());
      boolean bool;
      if (getVisibility() == 0) {
        bool = true;
      } else {
        bool = false;
      }
      ((Drawable)localObject).setVisible(bool, false);
    }
    mRemoteIndicator = ((Drawable)localObject);
    refreshDrawableState();
  }
  
  public void setRouteSelector(@NonNull MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector != null)
    {
      if (!mSelector.equals(paramMediaRouteSelector))
      {
        if (mAttachedToWindow)
        {
          if (!mSelector.isEmpty()) {
            mRouter.removeCallback(mCallback);
          }
          if (!paramMediaRouteSelector.isEmpty()) {
            mRouter.addCallback(paramMediaRouteSelector, mCallback);
          }
        }
        mSelector = paramMediaRouteSelector;
        refreshRoute();
      }
      return;
    }
    throw new IllegalArgumentException("selector must not be null");
  }
  
  public void setVisibility(int paramInt)
  {
    mVisibility = paramInt;
    refreshVisibility();
  }
  
  public boolean showDialog()
  {
    if (!mAttachedToWindow) {
      return false;
    }
    MediaRouterParams localMediaRouterParams = mRouter.getRouterParams();
    if (localMediaRouterParams != null)
    {
      if ((localMediaRouterParams.isOutputSwitcherEnabled()) && (MediaRouter.isMediaTransferEnabled()) && (showOutputSwitcher())) {
        return true;
      }
      return showDialogForType(localMediaRouterParams.getDialogType());
    }
    return showDialogForType(1);
  }
  
  public boolean verifyDrawable(@NonNull Drawable paramDrawable)
  {
    boolean bool;
    if ((!super.verifyDrawable(paramDrawable)) && (paramDrawable != mRemoteIndicator)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static final class ConnectivityReceiver
    extends BroadcastReceiver
  {
    private List<MediaRouteButton> mButtons;
    private final Context mContext;
    private boolean mIsConnected = true;
    
    public ConnectivityReceiver(Context paramContext)
    {
      mContext = paramContext;
      mButtons = new ArrayList();
    }
    
    public boolean isConnected()
    {
      return mIsConnected;
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramIntent.getAction()))
      {
        boolean bool = paramIntent.getBooleanExtra("noConnectivity", false) ^ true;
        if (mIsConnected != bool)
        {
          mIsConnected = bool;
          paramContext = mButtons.iterator();
          while (paramContext.hasNext()) {
            ((MediaRouteButton)paramContext.next()).refreshVisibility();
          }
        }
      }
    }
    
    public void registerReceiver(MediaRouteButton paramMediaRouteButton)
    {
      if (mButtons.size() == 0)
      {
        IntentFilter localIntentFilter = new IntentFilter();
        localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        mContext.registerReceiver(this, localIntentFilter);
      }
      mButtons.add(paramMediaRouteButton);
    }
    
    public void unregisterReceiver(MediaRouteButton paramMediaRouteButton)
    {
      mButtons.remove(paramMediaRouteButton);
      if (mButtons.size() == 0) {
        mContext.unregisterReceiver(this);
      }
    }
  }
  
  public final class MediaRouterCallback
    extends MediaRouter.Callback
  {
    public MediaRouterCallback() {}
    
    public void onProviderAdded(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
    {
      refreshRoute();
    }
    
    public void onProviderChanged(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
    {
      refreshRoute();
    }
    
    public void onProviderRemoved(MediaRouter paramMediaRouter, MediaRouter.ProviderInfo paramProviderInfo)
    {
      refreshRoute();
    }
    
    public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      refreshRoute();
    }
    
    public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      refreshRoute();
    }
    
    public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      refreshRoute();
    }
    
    public void onRouteSelected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      refreshRoute();
    }
    
    public void onRouteUnselected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      refreshRoute();
    }
    
    public void onRouterParamsChanged(MediaRouter paramMediaRouter, MediaRouterParams paramMediaRouterParams)
    {
      boolean bool;
      if (paramMediaRouterParams != null) {
        bool = paramMediaRouterParams.getExtras().getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON");
      } else {
        bool = false;
      }
      paramMediaRouter = MediaRouteButton.this;
      if (mIsFixedIcon != bool)
      {
        mIsFixedIcon = bool;
        paramMediaRouter.refreshDrawableState();
      }
    }
  }
  
  public final class RemoteIndicatorLoader
    extends AsyncTask<Void, Void, Drawable>
  {
    private final Context mContext;
    private final int mResId;
    
    public RemoteIndicatorLoader(int paramInt, Context paramContext)
    {
      mResId = paramInt;
      mContext = paramContext;
    }
    
    private void cacheAndReset(Drawable paramDrawable)
    {
      if (paramDrawable != null) {
        MediaRouteButton.sRemoteIndicatorCache.put(mResId, paramDrawable.getConstantState());
      }
      mRemoteIndicatorLoader = null;
    }
    
    public Drawable doInBackground(Void... paramVarArgs)
    {
      if ((Drawable.ConstantState)MediaRouteButton.sRemoteIndicatorCache.get(mResId) == null) {
        return AppCompatResources.getDrawable(mContext, mResId);
      }
      return null;
    }
    
    public void onCancelled(Drawable paramDrawable)
    {
      cacheAndReset(paramDrawable);
    }
    
    public void onPostExecute(Drawable paramDrawable)
    {
      if (paramDrawable != null)
      {
        cacheAndReset(paramDrawable);
      }
      else
      {
        Drawable.ConstantState localConstantState = (Drawable.ConstantState)MediaRouteButton.sRemoteIndicatorCache.get(mResId);
        if (localConstantState != null) {
          paramDrawable = localConstantState.newDrawable();
        }
        mRemoteIndicatorLoader = null;
      }
      setRemoteIndicatorDrawableInternal(paramDrawable);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
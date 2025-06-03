package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.BaseObj;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.Callback;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.util.ObjectsCompat;
import androidx.mediarouter.R.dimen;
import androidx.mediarouter.R.id;
import androidx.mediarouter.R.integer;
import androidx.mediarouter.R.layout;
import androidx.mediarouter.R.string;
import androidx.mediarouter.media.MediaRouteProvider.DynamicGroupRouteController;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouter.Callback;
import androidx.mediarouter.media.MediaRouter.ProviderInfo;
import androidx.mediarouter.media.MediaRouter.RouteInfo;
import androidx.mediarouter.media.MediaRouter.RouteInfo.DynamicGroupState;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class MediaRouteDynamicControllerDialog
  extends AppCompatDialog
{
  private static final int BLUR_RADIUS = 10;
  private static final int COLOR_WHITE_ON_DARK_BACKGROUND = -1;
  private static final int CONNECTION_TIMEOUT_MS = 30000;
  public static final boolean DEBUG = Log.isLoggable("MediaRouteCtrlDialog", 3);
  private static final int MIN_UNMUTED_VOLUME = 1;
  private static final int MSG_UPDATE_ROUTES_VIEW = 1;
  private static final int MSG_UPDATE_ROUTE_VOLUME_BY_USER = 2;
  private static final int MUTED_VOLUME = 0;
  private static final String TAG = "MediaRouteCtrlDialog";
  private static final int UPDATE_ROUTES_VIEW_DELAY_MS = 300;
  private static final int UPDATE_VOLUME_DELAY_MS = 500;
  public RecyclerAdapter mAdapter;
  public int mArtIconBackgroundColor;
  public Bitmap mArtIconBitmap;
  public boolean mArtIconIsLoaded;
  public Bitmap mArtIconLoadedBitmap;
  public Uri mArtIconUri;
  public ImageView mArtView;
  private boolean mAttachedToWindow;
  private final MediaRouterCallback mCallback;
  private ImageButton mCloseButton;
  public Context mContext;
  public MediaControllerCallback mControllerCallback;
  private boolean mCreated;
  public MediaDescriptionCompat mDescription;
  public final boolean mEnableGroupVolumeUX;
  public FetchArtTask mFetchArtTask;
  public final List<MediaRouter.RouteInfo> mGroupableRoutes = new ArrayList();
  public final Handler mHandler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      int i = what;
      if (i != 1)
      {
        if (i == 2)
        {
          paramAnonymousMessage = MediaRouteDynamicControllerDialog.this;
          if (mRouteForVolumeUpdatingByUser != null)
          {
            mRouteForVolumeUpdatingByUser = null;
            paramAnonymousMessage.updateViewsIfNeeded();
          }
        }
      }
      else {
        updateRoutesView();
      }
    }
  };
  public boolean mIsAnimatingVolumeSliderLayout;
  public boolean mIsSelectingRoute;
  private long mLastUpdateTime;
  public MediaControllerCompat mMediaController;
  public final List<MediaRouter.RouteInfo> mMemberRoutes = new ArrayList();
  private ImageView mMetadataBackground;
  private View mMetadataBlackScrim;
  public RecyclerView mRecyclerView;
  public MediaRouter.RouteInfo mRouteForVolumeUpdatingByUser;
  public final MediaRouter mRouter;
  public MediaRouter.RouteInfo mSelectedRoute;
  private MediaRouteSelector mSelector = MediaRouteSelector.EMPTY;
  private Button mStopCastingButton;
  private TextView mSubtitleView;
  private String mTitlePlaceholder;
  private TextView mTitleView;
  public final List<MediaRouter.RouteInfo> mTransferableRoutes = new ArrayList();
  public final List<MediaRouter.RouteInfo> mUngroupableRoutes = new ArrayList();
  public Map<String, Integer> mUnmutedVolumeMap;
  private boolean mUpdateMetadataViewsDeferred;
  private boolean mUpdateRoutesViewDeferred;
  public VolumeChangeListener mVolumeChangeListener;
  public Map<String, MediaRouteVolumeSliderHolder> mVolumeSliderHolderMap;
  
  public MediaRouteDynamicControllerDialog(@NonNull Context paramContext)
  {
    this(paramContext, 0);
  }
  
  public MediaRouteDynamicControllerDialog(@NonNull Context paramContext, int paramInt)
  {
    super(paramContext, MediaRouterThemeHelper.createThemedDialogStyle(paramContext));
    paramContext = getContext();
    mContext = paramContext;
    paramContext = MediaRouter.getInstance(paramContext);
    mRouter = paramContext;
    mEnableGroupVolumeUX = MediaRouter.isGroupVolumeUxEnabled();
    mCallback = new MediaRouterCallback();
    mSelectedRoute = paramContext.getSelectedRoute();
    mControllerCallback = new MediaControllerCallback();
    setMediaSession(paramContext.getMediaSessionToken());
  }
  
  @RequiresApi(17)
  private static Bitmap blurBitmap(Bitmap paramBitmap, float paramFloat, Context paramContext)
  {
    paramContext = RenderScript.create(paramContext);
    Allocation localAllocation1 = Allocation.createFromBitmap(paramContext, paramBitmap);
    Allocation localAllocation2 = Allocation.createTyped(paramContext, localAllocation1.getType());
    ScriptIntrinsicBlur localScriptIntrinsicBlur = ScriptIntrinsicBlur.create(paramContext, Element.U8_4(paramContext));
    localScriptIntrinsicBlur.setRadius(paramFloat);
    localScriptIntrinsicBlur.setInput(localAllocation1);
    localScriptIntrinsicBlur.forEach(localAllocation2);
    paramBitmap = paramBitmap.copy(paramBitmap.getConfig(), true);
    localAllocation2.copyTo(paramBitmap);
    localAllocation1.destroy();
    localAllocation2.destroy();
    localScriptIntrinsicBlur.destroy();
    paramContext.destroy();
    return paramBitmap;
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
    reloadIconIfNeeded();
    updateMetadataViews();
  }
  
  private boolean shouldDeferUpdateViews()
  {
    if ((mRouteForVolumeUpdatingByUser == null) && (!mIsSelectingRoute) && (!mIsAnimatingVolumeSliderLayout)) {
      return mCreated ^ true;
    }
    return true;
  }
  
  public void clearLoadedBitmap()
  {
    mArtIconIsLoaded = false;
    mArtIconLoadedBitmap = null;
    mArtIconBackgroundColor = 0;
  }
  
  public List<MediaRouter.RouteInfo> getCurrentGroupableRoutes()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = mSelectedRoute.getProvider().getRoutes().iterator();
    while (localIterator.hasNext())
    {
      MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)localIterator.next();
      MediaRouter.RouteInfo.DynamicGroupState localDynamicGroupState = mSelectedRoute.getDynamicGroupState(localRouteInfo);
      if ((localDynamicGroupState != null) && (localDynamicGroupState.isGroupable())) {
        localArrayList.add(localRouteInfo);
      }
    }
    return localArrayList;
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
  public MediaRouteSelector getRouteSelector()
  {
    return mSelector;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    mAttachedToWindow = true;
    mRouter.addCallback(mSelector, mCallback, 1);
    updateRoutes();
    setMediaSession(mRouter.getMediaSessionToken());
  }
  
  public void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.mr_cast_dialog);
    MediaRouterThemeHelper.setDialogBackgroundColor(mContext, this);
    paramBundle = (ImageButton)findViewById(R.id.mr_cast_close_button);
    mCloseButton = paramBundle;
    paramBundle.setColorFilter(-1);
    mCloseButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        dismiss();
      }
    });
    paramBundle = (Button)findViewById(R.id.mr_cast_stop_button);
    mStopCastingButton = paramBundle;
    paramBundle.setTextColor(-1);
    mStopCastingButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (mSelectedRoute.isSelected()) {
          mRouter.unselect(2);
        }
        dismiss();
      }
    });
    mAdapter = new RecyclerAdapter();
    paramBundle = (RecyclerView)findViewById(R.id.mr_cast_list);
    mRecyclerView = paramBundle;
    paramBundle.setAdapter(mAdapter);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
    mVolumeChangeListener = new VolumeChangeListener();
    mVolumeSliderHolderMap = new HashMap();
    mUnmutedVolumeMap = new HashMap();
    mMetadataBackground = ((ImageView)findViewById(R.id.mr_cast_meta_background));
    mMetadataBlackScrim = findViewById(R.id.mr_cast_meta_black_scrim);
    mArtView = ((ImageView)findViewById(R.id.mr_cast_meta_art));
    paramBundle = (TextView)findViewById(R.id.mr_cast_meta_title);
    mTitleView = paramBundle;
    paramBundle.setTextColor(-1);
    paramBundle = (TextView)findViewById(R.id.mr_cast_meta_subtitle);
    mSubtitleView = paramBundle;
    paramBundle.setTextColor(-1);
    mTitlePlaceholder = mContext.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
    mCreated = true;
    updateLayout();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    mAttachedToWindow = false;
    mRouter.removeCallback(mCallback);
    mHandler.removeCallbacksAndMessages(null);
    setMediaSession(null);
  }
  
  public boolean onFilterRoute(@NonNull MediaRouter.RouteInfo paramRouteInfo)
  {
    boolean bool;
    if ((!paramRouteInfo.isDefaultOrBluetooth()) && (paramRouteInfo.isEnabled()) && (paramRouteInfo.matchesSelector(mSelector)) && (mSelectedRoute != paramRouteInfo)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onFilterRoutes(@NonNull List<MediaRouter.RouteInfo> paramList)
  {
    for (int i = paramList.size() - 1; i >= 0; i--) {
      if (!onFilterRoute((MediaRouter.RouteInfo)paramList.get(i))) {
        paramList.remove(i);
      }
    }
  }
  
  public void reloadIconIfNeeded()
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
    if ((localObject2 == localObject1) && ((localObject2 != null) || (ObjectsCompat.equals(localObject3, localUri)))) {
      return;
    }
    localObject1 = mFetchArtTask;
    if (localObject1 != null) {
      ((AsyncTask)localObject1).cancel(true);
    }
    localObject1 = new FetchArtTask();
    mFetchArtTask = ((FetchArtTask)localObject1);
    ((AsyncTask)localObject1).execute(new Void[0]);
  }
  
  public void setRouteSelector(@NonNull MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector != null)
    {
      if (!mSelector.equals(paramMediaRouteSelector))
      {
        mSelector = paramMediaRouteSelector;
        if (mAttachedToWindow)
        {
          mRouter.removeCallback(mCallback);
          mRouter.addCallback(paramMediaRouteSelector, mCallback, 1);
          updateRoutes();
        }
      }
      return;
    }
    throw new IllegalArgumentException("selector must not be null");
  }
  
  public void updateLayout()
  {
    int i = MediaRouteDialogHelper.getDialogWidthForDynamicGroup(mContext);
    int j = MediaRouteDialogHelper.getDialogHeight(mContext);
    getWindow().setLayout(i, j);
    mArtIconBitmap = null;
    mArtIconUri = null;
    reloadIconIfNeeded();
    updateMetadataViews();
    updateRoutesView();
  }
  
  public void updateMetadataViews()
  {
    if (shouldDeferUpdateViews())
    {
      mUpdateMetadataViewsDeferred = true;
      return;
    }
    mUpdateMetadataViewsDeferred = false;
    if ((!mSelectedRoute.isSelected()) || (mSelectedRoute.isDefaultOrBluetooth())) {
      dismiss();
    }
    boolean bool1 = mArtIconIsLoaded;
    CharSequence localCharSequence = null;
    if ((bool1) && (!isBitmapRecycled(mArtIconLoadedBitmap)) && (mArtIconLoadedBitmap != null))
    {
      mArtView.setVisibility(0);
      mArtView.setImageBitmap(mArtIconLoadedBitmap);
      mArtView.setBackgroundColor(mArtIconBackgroundColor);
      mMetadataBlackScrim.setVisibility(0);
      localObject = blurBitmap(mArtIconLoadedBitmap, 10.0F, mContext);
      mMetadataBackground.setImageBitmap((Bitmap)localObject);
    }
    else
    {
      if (isBitmapRecycled(mArtIconLoadedBitmap))
      {
        localObject = z2.t("Can't set artwork image with recycled bitmap: ");
        ((StringBuilder)localObject).append(mArtIconLoadedBitmap);
        Log.w("MediaRouteCtrlDialog", ((StringBuilder)localObject).toString());
      }
      mArtView.setVisibility(8);
      mMetadataBlackScrim.setVisibility(8);
      mMetadataBackground.setImageBitmap(null);
    }
    clearLoadedBitmap();
    Object localObject = mDescription;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((MediaDescriptionCompat)localObject).getTitle();
    }
    boolean bool2 = TextUtils.isEmpty((CharSequence)localObject);
    MediaDescriptionCompat localMediaDescriptionCompat = mDescription;
    if (localMediaDescriptionCompat != null) {
      localCharSequence = localMediaDescriptionCompat.getSubtitle();
    }
    bool1 = TextUtils.isEmpty(localCharSequence);
    if ((bool2 ^ true)) {
      mTitleView.setText((CharSequence)localObject);
    } else {
      mTitleView.setText(mTitlePlaceholder);
    }
    if ((true ^ bool1))
    {
      mSubtitleView.setText(localCharSequence);
      mSubtitleView.setVisibility(0);
    }
    else
    {
      mSubtitleView.setVisibility(8);
    }
  }
  
  public void updateRoutes()
  {
    mMemberRoutes.clear();
    mGroupableRoutes.clear();
    mTransferableRoutes.clear();
    mMemberRoutes.addAll(mSelectedRoute.getMemberRoutes());
    Object localObject1 = mSelectedRoute.getProvider().getRoutes().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)((Iterator)localObject1).next();
      localObject2 = mSelectedRoute.getDynamicGroupState(localRouteInfo);
      if (localObject2 != null)
      {
        if (((MediaRouter.RouteInfo.DynamicGroupState)localObject2).isGroupable()) {
          mGroupableRoutes.add(localRouteInfo);
        }
        if (((MediaRouter.RouteInfo.DynamicGroupState)localObject2).isTransferable()) {
          mTransferableRoutes.add(localRouteInfo);
        }
      }
    }
    onFilterRoutes(mGroupableRoutes);
    onFilterRoutes(mTransferableRoutes);
    Object localObject2 = mMemberRoutes;
    localObject1 = RouteComparator.sInstance;
    Collections.sort((List)localObject2, (Comparator)localObject1);
    Collections.sort(mGroupableRoutes, (Comparator)localObject1);
    Collections.sort(mTransferableRoutes, (Comparator)localObject1);
    mAdapter.updateItems();
  }
  
  public void updateRoutesView()
  {
    if (mAttachedToWindow) {
      if (SystemClock.uptimeMillis() - mLastUpdateTime >= 300L)
      {
        if (shouldDeferUpdateViews())
        {
          mUpdateRoutesViewDeferred = true;
          return;
        }
        mUpdateRoutesViewDeferred = false;
        if ((!mSelectedRoute.isSelected()) || (mSelectedRoute.isDefaultOrBluetooth())) {
          dismiss();
        }
        mLastUpdateTime = SystemClock.uptimeMillis();
        mAdapter.notifyAdapterDataSetChanged();
      }
      else
      {
        mHandler.removeMessages(1);
        mHandler.sendEmptyMessageAtTime(1, mLastUpdateTime + 300L);
      }
    }
  }
  
  public void updateViewsIfNeeded()
  {
    if (mUpdateRoutesViewDeferred) {
      updateRoutesView();
    }
    if (mUpdateMetadataViewsDeferred) {
      updateMetadataViews();
    }
  }
  
  public class FetchArtTask
    extends AsyncTask<Void, Void, Bitmap>
  {
    private int mBackgroundColor;
    private final Bitmap mIconBitmap;
    private final Uri mIconUri;
    
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
      if (MediaRouteDynamicControllerDialog.isBitmapRecycled((Bitmap)localObject1))
      {
        Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
        localObject3 = null;
      }
      mIconBitmap = ((Bitmap)localObject3);
      this$1 = mDescription;
      if (MediaRouteDynamicControllerDialog.this == null) {
        this$1 = (MediaRouteDynamicControllerDialog)localObject2;
      } else {
        this$1 = MediaRouteDynamicControllerDialog.this.getIconUri();
      }
      mIconUri = MediaRouteDynamicControllerDialog.this;
    }
    
    private InputStream openInputStreamByScheme(Uri paramUri)
      throws IOException
    {
      String str = paramUri.getScheme().toLowerCase();
      if ((!"android.resource".equals(str)) && (!"content".equals(str)) && (!"file".equals(str)))
      {
        paramUri = new URL(paramUri.toString()).openConnection();
        paramUri.setConnectTimeout(30000);
        paramUri.setReadTimeout(30000);
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
      //   1: getfield 49	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:mIconBitmap	Landroid/graphics/Bitmap;
      //   4: astore_1
      //   5: iconst_0
      //   6: istore_2
      //   7: aconst_null
      //   8: astore_3
      //   9: aload_1
      //   10: ifnull +6 -> 16
      //   13: goto +532 -> 545
      //   16: aload_0
      //   17: getfield 55	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   20: astore_1
      //   21: aload_1
      //   22: ifnull +521 -> 543
      //   25: aload_0
      //   26: aload_1
      //   27: invokespecial 131	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:openInputStreamByScheme	(Landroid/net/Uri;)Ljava/io/InputStream;
      //   30: astore 4
      //   32: aload 4
      //   34: ifnonnull +84 -> 118
      //   37: aload 4
      //   39: astore_3
      //   40: aload 4
      //   42: astore_1
      //   43: new 133	java/lang/StringBuilder
      //   46: astore 5
      //   48: aload 4
      //   50: astore_3
      //   51: aload 4
      //   53: astore_1
      //   54: aload 5
      //   56: invokespecial 134	java/lang/StringBuilder:<init>	()V
      //   59: aload 4
      //   61: astore_3
      //   62: aload 4
      //   64: astore_1
      //   65: aload 5
      //   67: ldc -120
      //   69: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   72: pop
      //   73: aload 4
      //   75: astore_3
      //   76: aload 4
      //   78: astore_1
      //   79: aload 5
      //   81: aload_0
      //   82: getfield 55	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   85: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   88: pop
      //   89: aload 4
      //   91: astore_3
      //   92: aload 4
      //   94: astore_1
      //   95: ldc 39
      //   97: aload 5
      //   99: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   102: invokestatic 47	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
      //   105: pop
      //   106: aload 4
      //   108: ifnull +8 -> 116
      //   111: aload 4
      //   113: invokevirtual 149	java/io/InputStream:close	()V
      //   116: aconst_null
      //   117: areturn
      //   118: aload 4
      //   120: astore_3
      //   121: aload 4
      //   123: astore_1
      //   124: new 151	android/graphics/BitmapFactory$Options
      //   127: astore 6
      //   129: aload 4
      //   131: astore_3
      //   132: aload 4
      //   134: astore_1
      //   135: aload 6
      //   137: invokespecial 152	android/graphics/BitmapFactory$Options:<init>	()V
      //   140: aload 4
      //   142: astore_3
      //   143: aload 4
      //   145: astore_1
      //   146: aload 6
      //   148: iconst_1
      //   149: putfield 156	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
      //   152: aload 4
      //   154: astore_3
      //   155: aload 4
      //   157: astore_1
      //   158: aload 4
      //   160: aconst_null
      //   161: aload 6
      //   163: invokestatic 162	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   166: pop
      //   167: aload 4
      //   169: astore_3
      //   170: aload 4
      //   172: astore_1
      //   173: aload 6
      //   175: getfield 165	android/graphics/BitmapFactory$Options:outWidth	I
      //   178: ifeq +266 -> 444
      //   181: aload 4
      //   183: astore_3
      //   184: aload 4
      //   186: astore_1
      //   187: aload 6
      //   189: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
      //   192: istore 7
      //   194: iload 7
      //   196: ifne +6 -> 202
      //   199: goto +245 -> 444
      //   202: aload 4
      //   204: astore_1
      //   205: aload 4
      //   207: invokevirtual 171	java/io/InputStream:reset	()V
      //   210: goto +121 -> 331
      //   213: astore_1
      //   214: aload 4
      //   216: astore_3
      //   217: aload 4
      //   219: astore_1
      //   220: aload 4
      //   222: invokevirtual 149	java/io/InputStream:close	()V
      //   225: aload 4
      //   227: astore_3
      //   228: aload 4
      //   230: astore_1
      //   231: aload_0
      //   232: aload_0
      //   233: getfield 55	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   236: invokespecial 131	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:openInputStreamByScheme	(Landroid/net/Uri;)Ljava/io/InputStream;
      //   239: astore 5
      //   241: aload 5
      //   243: astore 4
      //   245: aload 5
      //   247: ifnonnull +84 -> 331
      //   250: aload 5
      //   252: astore_3
      //   253: aload 5
      //   255: astore_1
      //   256: new 133	java/lang/StringBuilder
      //   259: astore 4
      //   261: aload 5
      //   263: astore_3
      //   264: aload 5
      //   266: astore_1
      //   267: aload 4
      //   269: invokespecial 134	java/lang/StringBuilder:<init>	()V
      //   272: aload 5
      //   274: astore_3
      //   275: aload 5
      //   277: astore_1
      //   278: aload 4
      //   280: ldc -120
      //   282: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   285: pop
      //   286: aload 5
      //   288: astore_3
      //   289: aload 5
      //   291: astore_1
      //   292: aload 4
      //   294: aload_0
      //   295: getfield 55	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   298: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   301: pop
      //   302: aload 5
      //   304: astore_3
      //   305: aload 5
      //   307: astore_1
      //   308: ldc 39
      //   310: aload 4
      //   312: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   315: invokestatic 47	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
      //   318: pop
      //   319: aload 5
      //   321: ifnull +8 -> 329
      //   324: aload 5
      //   326: invokevirtual 149	java/io/InputStream:close	()V
      //   329: aconst_null
      //   330: areturn
      //   331: aload 4
      //   333: astore_3
      //   334: aload 4
      //   336: astore_1
      //   337: aload 6
      //   339: iconst_0
      //   340: putfield 156	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
      //   343: aload 4
      //   345: astore_3
      //   346: aload 4
      //   348: astore_1
      //   349: aload_0
      //   350: getfield 20	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:this$0	Landroidx/mediarouter/app/MediaRouteDynamicControllerDialog;
      //   353: getfield 110	androidx/mediarouter/app/MediaRouteDynamicControllerDialog:mContext	Landroid/content/Context;
      //   356: invokevirtual 175	android/content/Context:getResources	()Landroid/content/res/Resources;
      //   359: getstatic 180	androidx/mediarouter/R$dimen:mr_cast_meta_art_size	I
      //   362: invokevirtual 186	android/content/res/Resources:getDimensionPixelSize	(I)I
      //   365: istore 7
      //   367: aload 4
      //   369: astore_3
      //   370: aload 4
      //   372: astore_1
      //   373: aload 6
      //   375: iconst_1
      //   376: aload 6
      //   378: getfield 168	android/graphics/BitmapFactory$Options:outHeight	I
      //   381: iload 7
      //   383: idiv
      //   384: invokestatic 191	java/lang/Integer:highestOneBit	(I)I
      //   387: invokestatic 197	java/lang/Math:max	(II)I
      //   390: putfield 200	android/graphics/BitmapFactory$Options:inSampleSize	I
      //   393: aload 4
      //   395: astore_3
      //   396: aload 4
      //   398: astore_1
      //   399: aload_0
      //   400: invokevirtual 204	android/os/AsyncTask:isCancelled	()Z
      //   403: istore 8
      //   405: iload 8
      //   407: ifeq +10 -> 417
      //   410: aload 4
      //   412: invokevirtual 149	java/io/InputStream:close	()V
      //   415: aconst_null
      //   416: areturn
      //   417: aload 4
      //   419: astore_3
      //   420: aload 4
      //   422: astore_1
      //   423: aload 4
      //   425: aconst_null
      //   426: aload 6
      //   428: invokestatic 162	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
      //   431: astore 5
      //   433: aload 4
      //   435: invokevirtual 149	java/io/InputStream:close	()V
      //   438: aload 5
      //   440: astore_1
      //   441: goto +104 -> 545
      //   444: aload 4
      //   446: invokevirtual 149	java/io/InputStream:close	()V
      //   449: aconst_null
      //   450: areturn
      //   451: astore 4
      //   453: goto +11 -> 464
      //   456: astore_1
      //   457: goto +76 -> 533
      //   460: astore 4
      //   462: aconst_null
      //   463: astore_3
      //   464: aload_3
      //   465: astore_1
      //   466: new 133	java/lang/StringBuilder
      //   469: astore 5
      //   471: aload_3
      //   472: astore_1
      //   473: aload 5
      //   475: invokespecial 134	java/lang/StringBuilder:<init>	()V
      //   478: aload_3
      //   479: astore_1
      //   480: aload 5
      //   482: ldc -120
      //   484: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   487: pop
      //   488: aload_3
      //   489: astore_1
      //   490: aload 5
      //   492: aload_0
      //   493: getfield 55	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:mIconUri	Landroid/net/Uri;
      //   496: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   499: pop
      //   500: aload_3
      //   501: astore_1
      //   502: ldc 39
      //   504: aload 5
      //   506: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   509: aload 4
      //   511: invokestatic 207	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   514: pop
      //   515: aload_3
      //   516: ifnull +27 -> 543
      //   519: aload_3
      //   520: invokevirtual 149	java/io/InputStream:close	()V
      //   523: goto +20 -> 543
      //   526: astore 4
      //   528: aload_1
      //   529: astore_3
      //   530: aload 4
      //   532: astore_1
      //   533: aload_3
      //   534: ifnull +7 -> 541
      //   537: aload_3
      //   538: invokevirtual 149	java/io/InputStream:close	()V
      //   541: aload_1
      //   542: athrow
      //   543: aconst_null
      //   544: astore_1
      //   545: aload_1
      //   546: invokestatic 37	androidx/mediarouter/app/MediaRouteDynamicControllerDialog:isBitmapRecycled	(Landroid/graphics/Bitmap;)Z
      //   549: ifeq +36 -> 585
      //   552: new 133	java/lang/StringBuilder
      //   555: dup
      //   556: invokespecial 134	java/lang/StringBuilder:<init>	()V
      //   559: astore_3
      //   560: aload_3
      //   561: ldc -47
      //   563: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   566: pop
      //   567: aload_3
      //   568: aload_1
      //   569: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   572: pop
      //   573: ldc 39
      //   575: aload_3
      //   576: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   579: invokestatic 47	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
      //   582: pop
      //   583: aconst_null
      //   584: areturn
      //   585: aload_1
      //   586: ifnull +67 -> 653
      //   589: aload_1
      //   590: invokevirtual 215	android/graphics/Bitmap:getWidth	()I
      //   593: aload_1
      //   594: invokevirtual 218	android/graphics/Bitmap:getHeight	()I
      //   597: if_icmpge +56 -> 653
      //   600: new 220	androidx/palette/graphics/Palette$Builder
      //   603: dup
      //   604: aload_1
      //   605: invokespecial 223	androidx/palette/graphics/Palette$Builder:<init>	(Landroid/graphics/Bitmap;)V
      //   608: iconst_1
      //   609: invokevirtual 227	androidx/palette/graphics/Palette$Builder:maximumColorCount	(I)Landroidx/palette/graphics/Palette$Builder;
      //   612: invokevirtual 231	androidx/palette/graphics/Palette$Builder:generate	()Landroidx/palette/graphics/Palette;
      //   615: astore_3
      //   616: aload_3
      //   617: invokevirtual 237	androidx/palette/graphics/Palette:getSwatches	()Ljava/util/List;
      //   620: invokeinterface 242 1 0
      //   625: ifeq +6 -> 631
      //   628: goto +20 -> 648
      //   631: aload_3
      //   632: invokevirtual 237	androidx/palette/graphics/Palette:getSwatches	()Ljava/util/List;
      //   635: iconst_0
      //   636: invokeinterface 246 2 0
      //   641: checkcast 248	androidx/palette/graphics/Palette$Swatch
      //   644: invokevirtual 251	androidx/palette/graphics/Palette$Swatch:getRgb	()I
      //   647: istore_2
      //   648: aload_0
      //   649: iload_2
      //   650: putfield 253	androidx/mediarouter/app/MediaRouteDynamicControllerDialog$FetchArtTask:mBackgroundColor	I
      //   653: aload_1
      //   654: areturn
      //   655: astore_1
      //   656: goto -540 -> 116
      //   659: astore_1
      //   660: goto -331 -> 329
      //   663: astore_1
      //   664: goto -249 -> 415
      //   667: astore_1
      //   668: goto -230 -> 438
      //   671: astore_1
      //   672: goto -223 -> 449
      //   675: astore_1
      //   676: goto -133 -> 543
      //   679: astore_3
      //   680: goto -139 -> 541
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	683	0	this	FetchArtTask
      //   0	683	1	paramVarArgs	Void[]
      //   6	644	2	i	int
      //   8	624	3	localObject1	Object
      //   679	1	3	localIOException1	IOException
      //   30	415	4	localObject2	Object
      //   451	1	4	localIOException2	IOException
      //   460	50	4	localIOException3	IOException
      //   526	5	4	localObject3	Object
      //   46	459	5	localObject4	Object
      //   127	300	6	localOptions	android.graphics.BitmapFactory.Options
      //   192	192	7	j	int
      //   403	3	8	bool	boolean
      // Exception table:
      //   from	to	target	type
      //   205	210	213	java/io/IOException
      //   43	48	451	java/io/IOException
      //   54	59	451	java/io/IOException
      //   65	73	451	java/io/IOException
      //   79	89	451	java/io/IOException
      //   95	106	451	java/io/IOException
      //   124	129	451	java/io/IOException
      //   135	140	451	java/io/IOException
      //   146	152	451	java/io/IOException
      //   158	167	451	java/io/IOException
      //   173	181	451	java/io/IOException
      //   187	194	451	java/io/IOException
      //   220	225	451	java/io/IOException
      //   231	241	451	java/io/IOException
      //   256	261	451	java/io/IOException
      //   267	272	451	java/io/IOException
      //   278	286	451	java/io/IOException
      //   292	302	451	java/io/IOException
      //   308	319	451	java/io/IOException
      //   337	343	451	java/io/IOException
      //   349	367	451	java/io/IOException
      //   373	393	451	java/io/IOException
      //   399	405	451	java/io/IOException
      //   423	433	451	java/io/IOException
      //   25	32	456	finally
      //   25	32	460	java/io/IOException
      //   43	48	526	finally
      //   54	59	526	finally
      //   65	73	526	finally
      //   79	89	526	finally
      //   95	106	526	finally
      //   124	129	526	finally
      //   135	140	526	finally
      //   146	152	526	finally
      //   158	167	526	finally
      //   173	181	526	finally
      //   187	194	526	finally
      //   205	210	526	finally
      //   220	225	526	finally
      //   231	241	526	finally
      //   256	261	526	finally
      //   267	272	526	finally
      //   278	286	526	finally
      //   292	302	526	finally
      //   308	319	526	finally
      //   337	343	526	finally
      //   349	367	526	finally
      //   373	393	526	finally
      //   399	405	526	finally
      //   423	433	526	finally
      //   466	471	526	finally
      //   473	478	526	finally
      //   480	488	526	finally
      //   490	500	526	finally
      //   502	515	526	finally
      //   111	116	655	java/io/IOException
      //   324	329	659	java/io/IOException
      //   410	415	663	java/io/IOException
      //   433	438	667	java/io/IOException
      //   444	449	671	java/io/IOException
      //   519	523	675	java/io/IOException
      //   537	541	679	java/io/IOException
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
      MediaRouteDynamicControllerDialog localMediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
      mFetchArtTask = null;
      if ((!ObjectsCompat.equals(mArtIconBitmap, mIconBitmap)) || (!ObjectsCompat.equals(mArtIconUri, mIconUri)))
      {
        localMediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
        mArtIconBitmap = mIconBitmap;
        mArtIconLoadedBitmap = paramBitmap;
        mArtIconUri = mIconUri;
        mArtIconBackgroundColor = mBackgroundColor;
        mArtIconIsLoaded = true;
        localMediaRouteDynamicControllerDialog.updateMetadataViews();
      }
    }
    
    public void onPreExecute()
    {
      clearLoadedBitmap();
    }
  }
  
  public final class MediaControllerCallback
    extends MediaControllerCompat.Callback
  {
    public MediaControllerCallback() {}
    
    public void onMetadataChanged(MediaMetadataCompat paramMediaMetadataCompat)
    {
      MediaRouteDynamicControllerDialog localMediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
      if (paramMediaMetadataCompat == null) {
        paramMediaMetadataCompat = null;
      } else {
        paramMediaMetadataCompat = paramMediaMetadataCompat.getDescription();
      }
      mDescription = paramMediaMetadataCompat;
      reloadIconIfNeeded();
      updateMetadataViews();
    }
    
    public void onSessionDestroyed()
    {
      MediaRouteDynamicControllerDialog localMediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
      MediaControllerCompat localMediaControllerCompat = mMediaController;
      if (localMediaControllerCompat != null)
      {
        localMediaControllerCompat.unregisterCallback(mControllerCallback);
        mMediaController = null;
      }
    }
  }
  
  public abstract class MediaRouteVolumeSliderHolder
    extends RecyclerView.ViewHolder
  {
    public final ImageButton mMuteButton;
    public MediaRouter.RouteInfo mRoute;
    public final MediaRouteVolumeSlider mVolumeSlider;
    
    public MediaRouteVolumeSliderHolder(View paramView, ImageButton paramImageButton, MediaRouteVolumeSlider paramMediaRouteVolumeSlider)
    {
      super();
      mMuteButton = paramImageButton;
      mVolumeSlider = paramMediaRouteVolumeSlider;
      paramImageButton.setImageDrawable(MediaRouterThemeHelper.getMuteButtonDrawableIcon(mContext));
      MediaRouterThemeHelper.setVolumeSliderColor(mContext, paramMediaRouteVolumeSlider);
    }
    
    @CallSuper
    public void bindRouteVolumeSliderHolder(MediaRouter.RouteInfo paramRouteInfo)
    {
      mRoute = paramRouteInfo;
      int i = paramRouteInfo.getVolume();
      boolean bool;
      if (i == 0) {
        bool = true;
      } else {
        bool = false;
      }
      mMuteButton.setActivated(bool);
      mMuteButton.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          Object localObject = MediaRouteDynamicControllerDialog.this;
          if (mRouteForVolumeUpdatingByUser != null) {
            mHandler.removeMessages(2);
          }
          localObject = MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder.this;
          this$0.mRouteForVolumeUpdatingByUser = mRoute;
          boolean bool = paramAnonymousView.isActivated() ^ true;
          int i;
          if (bool) {
            i = 0;
          } else {
            i = getUnmutedVolume();
          }
          setMute(bool);
          mVolumeSlider.setProgress(i);
          mRoute.requestSetVolume(i);
          mHandler.sendEmptyMessageDelayed(2, 500L);
        }
      });
      mVolumeSlider.setTag(mRoute);
      mVolumeSlider.setMax(paramRouteInfo.getVolumeMax());
      mVolumeSlider.setProgress(i);
      mVolumeSlider.setOnSeekBarChangeListener(mVolumeChangeListener);
    }
    
    public int getUnmutedVolume()
    {
      Integer localInteger = (Integer)mUnmutedVolumeMap.get(mRoute.getId());
      int i = 1;
      if (localInteger != null) {
        i = Math.max(1, localInteger.intValue());
      }
      return i;
    }
    
    public void setMute(boolean paramBoolean)
    {
      if (mMuteButton.isActivated() == paramBoolean) {
        return;
      }
      mMuteButton.setActivated(paramBoolean);
      if (paramBoolean) {
        mUnmutedVolumeMap.put(mRoute.getId(), Integer.valueOf(mVolumeSlider.getProgress()));
      } else {
        mUnmutedVolumeMap.remove(mRoute.getId());
      }
    }
    
    public void updateVolume()
    {
      int i = mRoute.getVolume();
      boolean bool;
      if (i == 0) {
        bool = true;
      } else {
        bool = false;
      }
      setMute(bool);
      mVolumeSlider.setProgress(i);
    }
  }
  
  public final class MediaRouterCallback
    extends MediaRouter.Callback
  {
    public MediaRouterCallback() {}
    
    public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      updateRoutesView();
    }
    
    public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      if ((paramRouteInfo == mSelectedRoute) && (paramRouteInfo.getDynamicGroupController() != null))
      {
        paramRouteInfo = paramRouteInfo.getProvider().getRoutes().iterator();
        while (paramRouteInfo.hasNext())
        {
          MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)paramRouteInfo.next();
          if (!mSelectedRoute.getMemberRoutes().contains(localRouteInfo))
          {
            paramMediaRouter = mSelectedRoute.getDynamicGroupState(localRouteInfo);
            if ((paramMediaRouter != null) && (paramMediaRouter.isGroupable()) && (!mGroupableRoutes.contains(localRouteInfo)))
            {
              i = 1;
              break label120;
            }
          }
        }
      }
      int i = 0;
      label120:
      if (i != 0)
      {
        updateViewsIfNeeded();
        updateRoutes();
      }
      else
      {
        updateRoutesView();
      }
    }
    
    public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      updateRoutesView();
    }
    
    public void onRouteSelected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      paramMediaRouter = MediaRouteDynamicControllerDialog.this;
      mSelectedRoute = paramRouteInfo;
      mIsSelectingRoute = false;
      paramMediaRouter.updateViewsIfNeeded();
      updateRoutes();
    }
    
    public void onRouteUnselected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      updateRoutesView();
    }
    
    public void onRouteVolumeChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      int i = paramRouteInfo.getVolume();
      if (MediaRouteDynamicControllerDialog.DEBUG)
      {
        paramMediaRouter = new StringBuilder();
        paramMediaRouter.append("onRouteVolumeChanged(), route.getVolume:");
        paramMediaRouter.append(i);
        Log.d("MediaRouteCtrlDialog", paramMediaRouter.toString());
      }
      paramMediaRouter = MediaRouteDynamicControllerDialog.this;
      if (mRouteForVolumeUpdatingByUser != paramRouteInfo)
      {
        paramMediaRouter = (MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder)mVolumeSliderHolderMap.get(paramRouteInfo.getId());
        if (paramMediaRouter != null) {
          paramMediaRouter.updateVolume();
        }
      }
    }
  }
  
  public final class RecyclerAdapter
    extends RecyclerView.Adapter<RecyclerView.ViewHolder>
  {
    private static final int ITEM_TYPE_GROUP = 4;
    private static final int ITEM_TYPE_GROUP_VOLUME = 1;
    private static final int ITEM_TYPE_HEADER = 2;
    private static final int ITEM_TYPE_ROUTE = 3;
    private final Interpolator mAccelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
    private final Drawable mDefaultIcon = MediaRouterThemeHelper.getDefaultDrawableIcon(mContext);
    private Item mGroupVolumeItem;
    private final LayoutInflater mInflater = LayoutInflater.from(mContext);
    private final ArrayList<Item> mItems = new ArrayList();
    private final int mLayoutAnimationDurationMs = mContext.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
    private final Drawable mSpeakerGroupIcon = MediaRouterThemeHelper.getSpeakerGroupDrawableIcon(mContext);
    private final Drawable mSpeakerIcon = MediaRouterThemeHelper.getSpeakerDrawableIcon(mContext);
    private final Drawable mTvIcon = MediaRouterThemeHelper.getTvDrawableIcon(mContext);
    
    public RecyclerAdapter()
    {
      updateItems();
    }
    
    private Drawable getDefaultIconDrawable(MediaRouter.RouteInfo paramRouteInfo)
    {
      int i = paramRouteInfo.getDeviceType();
      if (i != 1)
      {
        if (i != 2)
        {
          if (paramRouteInfo.isGroup()) {
            return mSpeakerGroupIcon;
          }
          return mDefaultIcon;
        }
        return mSpeakerIcon;
      }
      return mTvIcon;
    }
    
    public void animateLayoutHeight(final View paramView, final int paramInt)
    {
      Animation local1 = new Animation()
      {
        public void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
        {
          int i = paramInt;
          int j = val$startValue;
          i = (int)((i - j) * paramAnonymousFloat);
          MediaRouteDynamicControllerDialog.setLayoutHeight(paramView, j + i);
        }
      };
      local1.setAnimationListener(new Animation.AnimationListener()
      {
        public void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          paramAnonymousAnimation = MediaRouteDynamicControllerDialog.this;
          mIsAnimatingVolumeSliderLayout = false;
          paramAnonymousAnimation.updateViewsIfNeeded();
        }
        
        public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
        
        public void onAnimationStart(Animation paramAnonymousAnimation)
        {
          mIsAnimatingVolumeSliderLayout = true;
        }
      });
      local1.setDuration(mLayoutAnimationDurationMs);
      local1.setInterpolator(mAccelerateDecelerateInterpolator);
      paramView.startAnimation(local1);
    }
    
    public Drawable getIconDrawable(MediaRouter.RouteInfo paramRouteInfo)
    {
      Uri localUri = paramRouteInfo.getIconUri();
      if (localUri != null) {
        try
        {
          localObject = Drawable.createFromStream(mContext.getContentResolver().openInputStream(localUri), null);
          if (localObject != null) {
            return (Drawable)localObject;
          }
        }
        catch (IOException localIOException)
        {
          Object localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Failed to load ");
          ((StringBuilder)localObject).append(localUri);
          Log.w("MediaRouteCtrlDialog", ((StringBuilder)localObject).toString(), localIOException);
        }
      }
      return getDefaultIconDrawable(paramRouteInfo);
    }
    
    public Item getItem(int paramInt)
    {
      if (paramInt == 0) {
        return mGroupVolumeItem;
      }
      return (Item)mItems.get(paramInt - 1);
    }
    
    public int getItemCount()
    {
      return mItems.size() + 1;
    }
    
    public int getItemViewType(int paramInt)
    {
      return getItem(paramInt).getType();
    }
    
    public boolean isGroupVolumeNeeded()
    {
      MediaRouteDynamicControllerDialog localMediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
      boolean bool1 = mEnableGroupVolumeUX;
      boolean bool2 = true;
      if ((!bool1) || (mSelectedRoute.getMemberRoutes().size() <= 1)) {
        bool2 = false;
      }
      return bool2;
    }
    
    public void mayUpdateGroupVolume(MediaRouter.RouteInfo paramRouteInfo, boolean paramBoolean)
    {
      Object localObject = mSelectedRoute.getMemberRoutes();
      int i = ((List)localObject).size();
      boolean bool1 = true;
      int j = Math.max(1, i);
      boolean bool2 = paramRouteInfo.isGroup();
      i = -1;
      if (bool2)
      {
        paramRouteInfo = paramRouteInfo.getMemberRoutes().iterator();
        i = j;
        for (;;)
        {
          j = i;
          if (!paramRouteInfo.hasNext()) {
            break;
          }
          if (((List)localObject).contains((MediaRouter.RouteInfo)paramRouteInfo.next()) != paramBoolean)
          {
            if (paramBoolean) {
              j = 1;
            } else {
              j = -1;
            }
            i += j;
          }
        }
      }
      if (paramBoolean) {
        i = 1;
      }
      j += i;
      bool2 = isGroupVolumeNeeded();
      paramRouteInfo = MediaRouteDynamicControllerDialog.this;
      paramBoolean = mEnableGroupVolumeUX;
      i = 0;
      if ((paramBoolean) && (j >= 2)) {
        paramBoolean = bool1;
      } else {
        paramBoolean = false;
      }
      if (bool2 != paramBoolean)
      {
        paramRouteInfo = mRecyclerView.findViewHolderForAdapterPosition(0);
        if ((paramRouteInfo instanceof GroupVolumeViewHolder))
        {
          paramRouteInfo = (GroupVolumeViewHolder)paramRouteInfo;
          localObject = itemView;
          if (paramBoolean) {
            i = paramRouteInfo.getExpandedHeight();
          }
          animateLayoutHeight((View)localObject, i);
        }
      }
    }
    
    public void notifyAdapterDataSetChanged()
    {
      mUngroupableRoutes.clear();
      MediaRouteDynamicControllerDialog localMediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
      mUngroupableRoutes.addAll(MediaRouteDialogHelper.getItemsRemoved(mGroupableRoutes, localMediaRouteDynamicControllerDialog.getCurrentGroupableRoutes()));
      notifyDataSetChanged();
    }
    
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder paramViewHolder, int paramInt)
    {
      int i = getItemViewType(paramInt);
      Item localItem = getItem(paramInt);
      MediaRouter.RouteInfo localRouteInfo;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4) {
              Log.w("MediaRouteCtrlDialog", "Cannot bind item to ViewHolder because of wrong view type");
            } else {
              ((GroupViewHolder)paramViewHolder).bindGroupViewHolder(localItem);
            }
          }
          else
          {
            localRouteInfo = (MediaRouter.RouteInfo)localItem.getData();
            mVolumeSliderHolderMap.put(localRouteInfo.getId(), (MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder)paramViewHolder);
            ((RouteViewHolder)paramViewHolder).bindRouteViewHolder(localItem);
          }
        }
        else {
          ((HeaderViewHolder)paramViewHolder).bindHeaderViewHolder(localItem);
        }
      }
      else
      {
        localRouteInfo = (MediaRouter.RouteInfo)localItem.getData();
        mVolumeSliderHolderMap.put(localRouteInfo.getId(), (MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder)paramViewHolder);
        ((GroupVolumeViewHolder)paramViewHolder).bindGroupVolumeViewHolder(localItem);
      }
    }
    
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup paramViewGroup, int paramInt)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4)
            {
              Log.w("MediaRouteCtrlDialog", "Cannot create ViewHolder because of wrong view type");
              return null;
            }
            return new GroupViewHolder(mInflater.inflate(R.layout.mr_cast_group_item, paramViewGroup, false));
          }
          return new RouteViewHolder(mInflater.inflate(R.layout.mr_cast_route_item, paramViewGroup, false));
        }
        return new HeaderViewHolder(mInflater.inflate(R.layout.mr_cast_header_item, paramViewGroup, false));
      }
      return new GroupVolumeViewHolder(mInflater.inflate(R.layout.mr_cast_group_volume_item, paramViewGroup, false));
    }
    
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder paramViewHolder)
    {
      super.onViewRecycled(paramViewHolder);
      mVolumeSliderHolderMap.values().remove(paramViewHolder);
    }
    
    public void updateItems()
    {
      mItems.clear();
      mGroupVolumeItem = new Item(mSelectedRoute, 1);
      Object localObject1;
      Object localObject2;
      if (!mMemberRoutes.isEmpty())
      {
        localObject1 = mMemberRoutes.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (MediaRouter.RouteInfo)((Iterator)localObject1).next();
          mItems.add(new Item(localObject2, 3));
        }
      }
      mItems.add(new Item(mSelectedRoute, 3));
      boolean bool = mGroupableRoutes.isEmpty();
      int i = 0;
      Iterator localIterator;
      int j;
      MediaRouter.RouteInfo localRouteInfo;
      int k;
      if (!bool)
      {
        localIterator = mGroupableRoutes.iterator();
        j = 0;
        while (localIterator.hasNext())
        {
          localRouteInfo = (MediaRouter.RouteInfo)localIterator.next();
          if (!mMemberRoutes.contains(localRouteInfo))
          {
            k = j;
            if (j == 0)
            {
              localObject2 = mSelectedRoute.getDynamicGroupController();
              if (localObject2 != null) {
                localObject2 = ((MediaRouteProvider.DynamicGroupRouteController)localObject2).getGroupableSelectionTitle();
              } else {
                localObject2 = null;
              }
              localObject1 = localObject2;
              if (TextUtils.isEmpty((CharSequence)localObject2)) {
                localObject1 = mContext.getString(R.string.mr_dialog_groupable_header);
              }
              mItems.add(new Item(localObject1, 2));
              k = 1;
            }
            mItems.add(new Item(localRouteInfo, 3));
            j = k;
          }
        }
      }
      if (!mTransferableRoutes.isEmpty())
      {
        localIterator = mTransferableRoutes.iterator();
        j = i;
        while (localIterator.hasNext())
        {
          localRouteInfo = (MediaRouter.RouteInfo)localIterator.next();
          localObject2 = mSelectedRoute;
          if (localObject2 != localRouteInfo)
          {
            k = j;
            if (j == 0)
            {
              localObject2 = ((MediaRouter.RouteInfo)localObject2).getDynamicGroupController();
              if (localObject2 != null) {
                localObject2 = ((MediaRouteProvider.DynamicGroupRouteController)localObject2).getTransferableSectionTitle();
              } else {
                localObject2 = null;
              }
              localObject1 = localObject2;
              if (TextUtils.isEmpty((CharSequence)localObject2)) {
                localObject1 = mContext.getString(R.string.mr_dialog_transferable_header);
              }
              mItems.add(new Item(localObject1, 2));
              k = 1;
            }
            mItems.add(new Item(localRouteInfo, 4));
            j = k;
          }
        }
      }
      notifyAdapterDataSetChanged();
    }
    
    public class GroupViewHolder
      extends RecyclerView.ViewHolder
    {
      public final float mDisabledAlpha;
      public final ImageView mImageView;
      public final View mItemView;
      public final ProgressBar mProgressBar;
      public MediaRouter.RouteInfo mRoute;
      public final TextView mTextView;
      
      public GroupViewHolder(View paramView)
      {
        super();
        mItemView = paramView;
        mImageView = ((ImageView)paramView.findViewById(R.id.mr_cast_group_icon));
        ProgressBar localProgressBar = (ProgressBar)paramView.findViewById(R.id.mr_cast_group_progress_bar);
        mProgressBar = localProgressBar;
        mTextView = ((TextView)paramView.findViewById(R.id.mr_cast_group_name));
        mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(mContext);
        MediaRouterThemeHelper.setIndeterminateProgressBarColor(mContext, localProgressBar);
      }
      
      private boolean isEnabled(MediaRouter.RouteInfo paramRouteInfo)
      {
        List localList = mSelectedRoute.getMemberRoutes();
        return (localList.size() != 1) || (localList.get(0) != paramRouteInfo);
      }
      
      public void bindGroupViewHolder(MediaRouteDynamicControllerDialog.RecyclerAdapter.Item paramItem)
      {
        MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)paramItem.getData();
        mRoute = localRouteInfo;
        mImageView.setVisibility(0);
        mProgressBar.setVisibility(4);
        boolean bool = isEnabled(localRouteInfo);
        paramItem = mItemView;
        float f;
        if (bool) {
          f = 1.0F;
        } else {
          f = mDisabledAlpha;
        }
        paramItem.setAlpha(f);
        mItemView.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            paramAnonymousView = MediaRouteDynamicControllerDialog.RecyclerAdapter.GroupViewHolder.this;
            this$1.this$0.mRouter.transferToRoute(mRoute);
            mImageView.setVisibility(4);
            mProgressBar.setVisibility(0);
          }
        });
        mImageView.setImageDrawable(getIconDrawable(localRouteInfo));
        mTextView.setText(localRouteInfo.getName());
      }
    }
    
    public class GroupVolumeViewHolder
      extends MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder
    {
      private final int mExpandedHeight;
      private final TextView mTextView;
      
      public GroupVolumeViewHolder(View paramView)
      {
        super(paramView, (ImageButton)paramView.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider)paramView.findViewById(R.id.mr_cast_volume_slider));
        mTextView = ((TextView)paramView.findViewById(R.id.mr_group_volume_route_name));
        paramView = mContext.getResources();
        this$1 = paramView.getDisplayMetrics();
        TypedValue localTypedValue = new TypedValue();
        paramView.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, localTypedValue, true);
        mExpandedHeight = ((int)localTypedValue.getDimension(MediaRouteDynamicControllerDialog.RecyclerAdapter.this));
      }
      
      public void bindGroupVolumeViewHolder(MediaRouteDynamicControllerDialog.RecyclerAdapter.Item paramItem)
      {
        View localView = itemView;
        int i;
        if (isGroupVolumeNeeded()) {
          i = mExpandedHeight;
        } else {
          i = 0;
        }
        MediaRouteDynamicControllerDialog.setLayoutHeight(localView, i);
        paramItem = (MediaRouter.RouteInfo)paramItem.getData();
        super.bindRouteVolumeSliderHolder(paramItem);
        mTextView.setText(paramItem.getName());
      }
      
      public int getExpandedHeight()
      {
        return mExpandedHeight;
      }
    }
    
    public class HeaderViewHolder
      extends RecyclerView.ViewHolder
    {
      private final TextView mTextView;
      
      public HeaderViewHolder(View paramView)
      {
        super();
        mTextView = ((TextView)paramView.findViewById(R.id.mr_cast_header_name));
      }
      
      public void bindHeaderViewHolder(MediaRouteDynamicControllerDialog.RecyclerAdapter.Item paramItem)
      {
        paramItem = paramItem.getData().toString();
        mTextView.setText(paramItem);
      }
    }
    
    public class Item
    {
      private final Object mData;
      private final int mType;
      
      public Item(Object paramObject, int paramInt)
      {
        mData = paramObject;
        mType = paramInt;
      }
      
      public Object getData()
      {
        return mData;
      }
      
      public int getType()
      {
        return mType;
      }
    }
    
    public class RouteViewHolder
      extends MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder
    {
      public final CheckBox mCheckBox;
      public final int mCollapsedLayoutHeight;
      public final float mDisabledAlpha;
      public final int mExpandedLayoutHeight;
      public final ImageView mImageView;
      public final View mItemView;
      public final ProgressBar mProgressBar;
      public final TextView mTextView;
      public final View.OnClickListener mViewClickListener = new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          paramAnonymousView = MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder.this;
          boolean bool1 = paramAnonymousView.isSelected(mRoute) ^ true;
          boolean bool2 = mRoute.isGroup();
          if (bool1)
          {
            paramAnonymousView = MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder.this;
            this$1.this$0.mRouter.addMemberToDynamicGroup(mRoute);
          }
          else
          {
            paramAnonymousView = MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder.this;
            this$1.this$0.mRouter.removeMemberFromDynamicGroup(mRoute);
          }
          showSelectingProgress(bool1, bool2 ^ true);
          if (bool2)
          {
            List localList = mSelectedRoute.getMemberRoutes();
            paramAnonymousView = mRoute.getMemberRoutes().iterator();
            while (paramAnonymousView.hasNext())
            {
              Object localObject = (MediaRouter.RouteInfo)paramAnonymousView.next();
              if (localList.contains(localObject) != bool1)
              {
                localObject = (MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder)mVolumeSliderHolderMap.get(((MediaRouter.RouteInfo)localObject).getId());
                if ((localObject instanceof MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder)) {
                  ((MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder)localObject).showSelectingProgress(bool1, true);
                }
              }
            }
          }
          paramAnonymousView = MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder.this;
          this$1.mayUpdateGroupVolume(mRoute, bool1);
        }
      };
      public final RelativeLayout mVolumeSliderLayout;
      
      public RouteViewHolder(View paramView)
      {
        super(paramView, (ImageButton)paramView.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider)paramView.findViewById(R.id.mr_cast_volume_slider));
        mItemView = paramView;
        mImageView = ((ImageView)paramView.findViewById(R.id.mr_cast_route_icon));
        Object localObject = (ProgressBar)paramView.findViewById(R.id.mr_cast_route_progress_bar);
        mProgressBar = ((ProgressBar)localObject);
        mTextView = ((TextView)paramView.findViewById(R.id.mr_cast_route_name));
        mVolumeSliderLayout = ((RelativeLayout)paramView.findViewById(R.id.mr_cast_volume_layout));
        paramView = (CheckBox)paramView.findViewById(R.id.mr_cast_checkbox);
        mCheckBox = paramView;
        paramView.setButtonDrawable(MediaRouterThemeHelper.getCheckBoxDrawableIcon(mContext));
        MediaRouterThemeHelper.setIndeterminateProgressBarColor(mContext, (ProgressBar)localObject);
        mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(mContext);
        localObject = mContext.getResources();
        this$1 = ((Resources)localObject).getDisplayMetrics();
        paramView = new TypedValue();
        ((Resources)localObject).getValue(R.dimen.mr_dynamic_dialog_row_height, paramView, true);
        mExpandedLayoutHeight = ((int)paramView.getDimension(MediaRouteDynamicControllerDialog.RecyclerAdapter.this));
        mCollapsedLayoutHeight = 0;
      }
      
      private boolean isEnabled(MediaRouter.RouteInfo paramRouteInfo)
      {
        boolean bool1 = mUngroupableRoutes.contains(paramRouteInfo);
        boolean bool2 = false;
        if (bool1) {
          return false;
        }
        if ((isSelected(paramRouteInfo)) && (mSelectedRoute.getMemberRoutes().size() < 2)) {
          return false;
        }
        if (isSelected(paramRouteInfo))
        {
          paramRouteInfo = mSelectedRoute.getDynamicGroupState(paramRouteInfo);
          bool1 = bool2;
          if (paramRouteInfo != null)
          {
            bool1 = bool2;
            if (paramRouteInfo.isUnselectable()) {
              bool1 = true;
            }
          }
          return bool1;
        }
        return true;
      }
      
      public void bindRouteViewHolder(MediaRouteDynamicControllerDialog.RecyclerAdapter.Item paramItem)
      {
        Object localObject = (MediaRouter.RouteInfo)paramItem.getData();
        paramItem = (MediaRouteDynamicControllerDialog.RecyclerAdapter.Item)localObject;
        if (localObject == mSelectedRoute)
        {
          paramItem = (MediaRouteDynamicControllerDialog.RecyclerAdapter.Item)localObject;
          if (((MediaRouter.RouteInfo)localObject).getMemberRoutes().size() > 0)
          {
            Iterator localIterator = ((MediaRouter.RouteInfo)localObject).getMemberRoutes().iterator();
            do
            {
              paramItem = (MediaRouteDynamicControllerDialog.RecyclerAdapter.Item)localObject;
              if (!localIterator.hasNext()) {
                break;
              }
              paramItem = (MediaRouter.RouteInfo)localIterator.next();
            } while (mGroupableRoutes.contains(paramItem));
          }
        }
        bindRouteVolumeSliderHolder(paramItem);
        mImageView.setImageDrawable(getIconDrawable(paramItem));
        mTextView.setText(paramItem.getName());
        localObject = mCheckBox;
        boolean bool1 = false;
        ((View)localObject).setVisibility(0);
        boolean bool2 = isSelected(paramItem);
        boolean bool3 = isEnabled(paramItem);
        mCheckBox.setChecked(bool2);
        mProgressBar.setVisibility(4);
        mImageView.setVisibility(0);
        mItemView.setEnabled(bool3);
        mCheckBox.setEnabled(bool3);
        paramItem = mMuteButton;
        boolean bool4;
        if ((!bool3) && (!bool2)) {
          bool4 = false;
        } else {
          bool4 = true;
        }
        paramItem.setEnabled(bool4);
        paramItem = mVolumeSlider;
        if (!bool3)
        {
          bool4 = bool1;
          if (!bool2) {}
        }
        else
        {
          bool4 = true;
        }
        paramItem.setEnabled(bool4);
        mItemView.setOnClickListener(mViewClickListener);
        mCheckBox.setOnClickListener(mViewClickListener);
        paramItem = mVolumeSliderLayout;
        int i;
        if ((bool2) && (!mRoute.isGroup())) {
          i = mExpandedLayoutHeight;
        } else {
          i = mCollapsedLayoutHeight;
        }
        MediaRouteDynamicControllerDialog.setLayoutHeight(paramItem, i);
        paramItem = mItemView;
        float f1 = 1.0F;
        if ((!bool3) && (!bool2)) {
          f2 = mDisabledAlpha;
        } else {
          f2 = 1.0F;
        }
        paramItem.setAlpha(f2);
        paramItem = mCheckBox;
        float f2 = f1;
        if (!bool3) {
          if (!bool2) {
            f2 = f1;
          } else {
            f2 = mDisabledAlpha;
          }
        }
        paramItem.setAlpha(f2);
      }
      
      public boolean isSelected(MediaRouter.RouteInfo paramRouteInfo)
      {
        boolean bool1 = paramRouteInfo.isSelected();
        boolean bool2 = true;
        if (bool1) {
          return true;
        }
        paramRouteInfo = mSelectedRoute.getDynamicGroupState(paramRouteInfo);
        if ((paramRouteInfo == null) || (paramRouteInfo.getSelectionState() != 3)) {
          bool2 = false;
        }
        return bool2;
      }
      
      public void showSelectingProgress(boolean paramBoolean1, boolean paramBoolean2)
      {
        mCheckBox.setEnabled(false);
        mItemView.setEnabled(false);
        mCheckBox.setChecked(paramBoolean1);
        if (paramBoolean1)
        {
          mImageView.setVisibility(4);
          mProgressBar.setVisibility(0);
        }
        if (paramBoolean2)
        {
          MediaRouteDynamicControllerDialog.RecyclerAdapter localRecyclerAdapter = MediaRouteDynamicControllerDialog.RecyclerAdapter.this;
          RelativeLayout localRelativeLayout = mVolumeSliderLayout;
          int i;
          if (paramBoolean1) {
            i = mExpandedLayoutHeight;
          } else {
            i = mCollapsedLayoutHeight;
          }
          localRecyclerAdapter.animateLayoutHeight(localRelativeLayout, i);
        }
      }
    }
  }
  
  public static final class RouteComparator
    implements Comparator<MediaRouter.RouteInfo>
  {
    public static final RouteComparator sInstance = new RouteComparator();
    
    public int compare(MediaRouter.RouteInfo paramRouteInfo1, MediaRouter.RouteInfo paramRouteInfo2)
    {
      return paramRouteInfo1.getName().compareToIgnoreCase(paramRouteInfo2.getName());
    }
  }
  
  public class VolumeChangeListener
    implements SeekBar.OnSeekBarChangeListener
  {
    public VolumeChangeListener() {}
    
    public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
    {
      if (paramBoolean)
      {
        paramSeekBar = (MediaRouter.RouteInfo)paramSeekBar.getTag();
        MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder localMediaRouteVolumeSliderHolder = (MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder)mVolumeSliderHolderMap.get(paramSeekBar.getId());
        if (localMediaRouteVolumeSliderHolder != null)
        {
          if (paramInt == 0) {
            paramBoolean = true;
          } else {
            paramBoolean = false;
          }
          localMediaRouteVolumeSliderHolder.setMute(paramBoolean);
        }
        paramSeekBar.requestSetVolume(paramInt);
      }
    }
    
    public void onStartTrackingTouch(SeekBar paramSeekBar)
    {
      MediaRouteDynamicControllerDialog localMediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
      if (mRouteForVolumeUpdatingByUser != null) {
        mHandler.removeMessages(2);
      }
      mRouteForVolumeUpdatingByUser = ((MediaRouter.RouteInfo)paramSeekBar.getTag());
    }
    
    public void onStopTrackingTouch(SeekBar paramSeekBar)
    {
      mHandler.sendEmptyMessageDelayed(2, 500L);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
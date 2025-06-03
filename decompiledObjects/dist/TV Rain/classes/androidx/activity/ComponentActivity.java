package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.activity.contextaware.ContextAware;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContract.SynchronousResult;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.tracing.Trace;
import d4;
import h0;
import i0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import z2;

public class ComponentActivity
  extends androidx.core.app.ComponentActivity
  implements ContextAware, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, ActivityResultCaller, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, MenuHost
{
  private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
  private final ActivityResultRegistry mActivityResultRegistry;
  @LayoutRes
  private int mContentLayoutId;
  public final ContextAwareHelper mContextAwareHelper = new ContextAwareHelper();
  private ViewModelProvider.Factory mDefaultFactory;
  private final LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);
  private final MenuHostHelper mMenuHostHelper = new MenuHostHelper(new h0(this, 0));
  private final AtomicInteger mNextLocalRequestCode;
  private final OnBackPressedDispatcher mOnBackPressedDispatcher;
  private final CopyOnWriteArrayList<Consumer<Configuration>> mOnConfigurationChangedListeners;
  private final CopyOnWriteArrayList<Consumer<MultiWindowModeChangedInfo>> mOnMultiWindowModeChangedListeners;
  private final CopyOnWriteArrayList<Consumer<Intent>> mOnNewIntentListeners;
  private final CopyOnWriteArrayList<Consumer<PictureInPictureModeChangedInfo>> mOnPictureInPictureModeChangedListeners;
  private final CopyOnWriteArrayList<Consumer<Integer>> mOnTrimMemoryListeners;
  public final SavedStateRegistryController mSavedStateRegistryController;
  private ViewModelStore mViewModelStore;
  
  public ComponentActivity()
  {
    SavedStateRegistryController localSavedStateRegistryController = SavedStateRegistryController.create(this);
    mSavedStateRegistryController = localSavedStateRegistryController;
    mOnBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable()
    {
      public void run()
      {
        try
        {
          ComponentActivity.access$001(ComponentActivity.this);
        }
        catch (IllegalStateException localIllegalStateException)
        {
          if (!TextUtils.equals(localIllegalStateException.getMessage(), "Can not perform this action after onSaveInstanceState")) {
            break label24;
          }
        }
        return;
        label24:
        throw localIllegalStateException;
      }
    });
    mNextLocalRequestCode = new AtomicInteger();
    mActivityResultRegistry = new ActivityResultRegistry()
    {
      public <I, O> void onLaunch(final int paramAnonymousInt, @NonNull final ActivityResultContract<I, O> paramAnonymousActivityResultContract, I paramAnonymousI, @Nullable ActivityOptionsCompat paramAnonymousActivityOptionsCompat)
      {
        ComponentActivity localComponentActivity = ComponentActivity.this;
        final ActivityResultContract.SynchronousResult localSynchronousResult = paramAnonymousActivityResultContract.getSynchronousResult(localComponentActivity, paramAnonymousI);
        if (localSynchronousResult != null)
        {
          new Handler(Looper.getMainLooper()).post(new Runnable()
          {
            public void run()
            {
              dispatchResult(paramAnonymousInt, localSynchronousResult.getValue());
            }
          });
          return;
        }
        paramAnonymousI = paramAnonymousActivityResultContract.createIntent(localComponentActivity, paramAnonymousI);
        paramAnonymousActivityResultContract = null;
        if ((paramAnonymousI.getExtras() != null) && (paramAnonymousI.getExtras().getClassLoader() == null)) {
          paramAnonymousI.setExtrasClassLoader(localComponentActivity.getClassLoader());
        }
        if (paramAnonymousI.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"))
        {
          paramAnonymousActivityResultContract = paramAnonymousI.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
          paramAnonymousI.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        }
        else if (paramAnonymousActivityOptionsCompat != null)
        {
          paramAnonymousActivityResultContract = paramAnonymousActivityOptionsCompat.toBundle();
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(paramAnonymousI.getAction()))
        {
          paramAnonymousI = paramAnonymousI.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
          paramAnonymousActivityResultContract = paramAnonymousI;
          if (paramAnonymousI == null) {
            paramAnonymousActivityResultContract = new String[0];
          }
          ActivityCompat.requestPermissions(localComponentActivity, paramAnonymousActivityResultContract, paramAnonymousInt);
        }
        else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(paramAnonymousI.getAction()))
        {
          paramAnonymousI = (IntentSenderRequest)paramAnonymousI.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
          try
          {
            ActivityCompat.startIntentSenderForResult(localComponentActivity, paramAnonymousI.getIntentSender(), paramAnonymousInt, paramAnonymousI.getFillInIntent(), paramAnonymousI.getFlagsMask(), paramAnonymousI.getFlagsValues(), 0, paramAnonymousActivityResultContract);
          }
          catch (IntentSender.SendIntentException paramAnonymousActivityResultContract)
          {
            new Handler(Looper.getMainLooper()).post(new Runnable()
            {
              public void run()
              {
                dispatchResult(paramAnonymousInt, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", paramAnonymousActivityResultContract));
              }
            });
          }
        }
        else
        {
          ActivityCompat.startActivityForResult(localComponentActivity, paramAnonymousI, paramAnonymousInt, paramAnonymousActivityResultContract);
        }
      }
    };
    mOnConfigurationChangedListeners = new CopyOnWriteArrayList();
    mOnTrimMemoryListeners = new CopyOnWriteArrayList();
    mOnNewIntentListeners = new CopyOnWriteArrayList();
    mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList();
    mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList();
    if (getLifecycle() != null)
    {
      getLifecycle().addObserver(new LifecycleEventObserver()
      {
        public void onStateChanged(@NonNull LifecycleOwner paramAnonymousLifecycleOwner, @NonNull Lifecycle.Event paramAnonymousEvent)
        {
          if (paramAnonymousEvent == Lifecycle.Event.ON_STOP)
          {
            paramAnonymousLifecycleOwner = getWindow();
            if (paramAnonymousLifecycleOwner != null) {
              paramAnonymousLifecycleOwner = paramAnonymousLifecycleOwner.peekDecorView();
            } else {
              paramAnonymousLifecycleOwner = null;
            }
            if (paramAnonymousLifecycleOwner != null) {
              ComponentActivity.Api19Impl.cancelPendingInputEvents(paramAnonymousLifecycleOwner);
            }
          }
        }
      });
      getLifecycle().addObserver(new LifecycleEventObserver()
      {
        public void onStateChanged(@NonNull LifecycleOwner paramAnonymousLifecycleOwner, @NonNull Lifecycle.Event paramAnonymousEvent)
        {
          if (paramAnonymousEvent == Lifecycle.Event.ON_DESTROY)
          {
            mContextAwareHelper.clearAvailableContext();
            if (!isChangingConfigurations()) {
              getViewModelStore().clear();
            }
          }
        }
      });
      getLifecycle().addObserver(new LifecycleEventObserver()
      {
        public void onStateChanged(@NonNull LifecycleOwner paramAnonymousLifecycleOwner, @NonNull Lifecycle.Event paramAnonymousEvent)
        {
          ensureViewModelStore();
          getLifecycle().removeObserver(this);
        }
      });
      localSavedStateRegistryController.performAttach();
      SavedStateHandleSupport.enableSavedStateHandles(this);
      getSavedStateRegistry().registerSavedStateProvider("android:support:activity-result", new d4(this, 2));
      addOnContextAvailableListener(new i0(this));
      return;
    }
    throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
  }
  
  @ContentView
  public ComponentActivity(@LayoutRes int paramInt)
  {
    this();
    mContentLayoutId = paramInt;
  }
  
  private void initViewTreeOwners()
  {
    ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
    ViewTreeViewModelStoreOwner.set(getWindow().getDecorView(), this);
    ViewTreeSavedStateRegistryOwner.set(getWindow().getDecorView(), this);
    ViewTreeOnBackPressedDispatcherOwner.set(getWindow().getDecorView(), this);
  }
  
  public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View paramView, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams paramLayoutParams)
  {
    initViewTreeOwners();
    super.addContentView(paramView, paramLayoutParams);
  }
  
  public void addMenuProvider(@NonNull MenuProvider paramMenuProvider)
  {
    mMenuHostHelper.addMenuProvider(paramMenuProvider);
  }
  
  public void addMenuProvider(@NonNull MenuProvider paramMenuProvider, @NonNull LifecycleOwner paramLifecycleOwner)
  {
    mMenuHostHelper.addMenuProvider(paramMenuProvider, paramLifecycleOwner);
  }
  
  @SuppressLint({"LambdaLast"})
  public void addMenuProvider(@NonNull MenuProvider paramMenuProvider, @NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.State paramState)
  {
    mMenuHostHelper.addMenuProvider(paramMenuProvider, paramLifecycleOwner, paramState);
  }
  
  public final void addOnConfigurationChangedListener(@NonNull Consumer<Configuration> paramConsumer)
  {
    mOnConfigurationChangedListeners.add(paramConsumer);
  }
  
  public final void addOnContextAvailableListener(@NonNull OnContextAvailableListener paramOnContextAvailableListener)
  {
    mContextAwareHelper.addOnContextAvailableListener(paramOnContextAvailableListener);
  }
  
  public final void addOnMultiWindowModeChangedListener(@NonNull Consumer<MultiWindowModeChangedInfo> paramConsumer)
  {
    mOnMultiWindowModeChangedListeners.add(paramConsumer);
  }
  
  public final void addOnNewIntentListener(@NonNull Consumer<Intent> paramConsumer)
  {
    mOnNewIntentListeners.add(paramConsumer);
  }
  
  public final void addOnPictureInPictureModeChangedListener(@NonNull Consumer<PictureInPictureModeChangedInfo> paramConsumer)
  {
    mOnPictureInPictureModeChangedListeners.add(paramConsumer);
  }
  
  public final void addOnTrimMemoryListener(@NonNull Consumer<Integer> paramConsumer)
  {
    mOnTrimMemoryListeners.add(paramConsumer);
  }
  
  public void ensureViewModelStore()
  {
    if (mViewModelStore == null)
    {
      NonConfigurationInstances localNonConfigurationInstances = (NonConfigurationInstances)getLastNonConfigurationInstance();
      if (localNonConfigurationInstances != null) {
        mViewModelStore = viewModelStore;
      }
      if (mViewModelStore == null) {
        mViewModelStore = new ViewModelStore();
      }
    }
  }
  
  @NonNull
  public final ActivityResultRegistry getActivityResultRegistry()
  {
    return mActivityResultRegistry;
  }
  
  @CallSuper
  @NonNull
  public CreationExtras getDefaultViewModelCreationExtras()
  {
    MutableCreationExtras localMutableCreationExtras = new MutableCreationExtras();
    if (getApplication() != null) {
      localMutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, getApplication());
    }
    localMutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
    localMutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
    if ((getIntent() != null) && (getIntent().getExtras() != null)) {
      localMutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, getIntent().getExtras());
    }
    return localMutableCreationExtras;
  }
  
  @NonNull
  public ViewModelProvider.Factory getDefaultViewModelProviderFactory()
  {
    if (mDefaultFactory == null)
    {
      Application localApplication = getApplication();
      Bundle localBundle;
      if (getIntent() != null) {
        localBundle = getIntent().getExtras();
      } else {
        localBundle = null;
      }
      mDefaultFactory = new SavedStateViewModelFactory(localApplication, this, localBundle);
    }
    return mDefaultFactory;
  }
  
  @Deprecated
  @Nullable
  public Object getLastCustomNonConfigurationInstance()
  {
    Object localObject = (NonConfigurationInstances)getLastNonConfigurationInstance();
    if (localObject != null) {
      localObject = custom;
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  @NonNull
  public Lifecycle getLifecycle()
  {
    return mLifecycleRegistry;
  }
  
  @NonNull
  public final OnBackPressedDispatcher getOnBackPressedDispatcher()
  {
    return mOnBackPressedDispatcher;
  }
  
  @NonNull
  public final SavedStateRegistry getSavedStateRegistry()
  {
    return mSavedStateRegistryController.getSavedStateRegistry();
  }
  
  @NonNull
  public ViewModelStore getViewModelStore()
  {
    if (getApplication() != null)
    {
      ensureViewModelStore();
      return mViewModelStore;
    }
    throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
  }
  
  public void invalidateMenu()
  {
    invalidateOptionsMenu();
  }
  
  @Deprecated
  @CallSuper
  public void onActivityResult(int paramInt1, int paramInt2, @Nullable Intent paramIntent)
  {
    if (!mActivityResultRegistry.dispatchResult(paramInt1, paramInt2, paramIntent)) {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  @MainThread
  public void onBackPressed()
  {
    mOnBackPressedDispatcher.onBackPressed();
  }
  
  @CallSuper
  public void onConfigurationChanged(@NonNull Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    Iterator localIterator = mOnConfigurationChangedListeners.iterator();
    while (localIterator.hasNext()) {
      ((Consumer)localIterator.next()).accept(paramConfiguration);
    }
  }
  
  public void onCreate(@Nullable Bundle paramBundle)
  {
    mSavedStateRegistryController.performRestore(paramBundle);
    mContextAwareHelper.dispatchOnContextAvailable(this);
    super.onCreate(paramBundle);
    ReportFragment.injectIfNeededIn(this);
    int i = mContentLayoutId;
    if (i != 0) {
      setContentView(i);
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, @NonNull Menu paramMenu)
  {
    if (paramInt == 0)
    {
      super.onCreatePanelMenu(paramInt, paramMenu);
      mMenuHostHelper.onCreateMenu(paramMenu, getMenuInflater());
    }
    return true;
  }
  
  public boolean onMenuItemSelected(int paramInt, @NonNull MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    if (paramInt == 0) {
      return mMenuHostHelper.onMenuItemSelected(paramMenuItem);
    }
    return false;
  }
  
  @CallSuper
  public void onMultiWindowModeChanged(boolean paramBoolean)
  {
    Iterator localIterator = mOnMultiWindowModeChangedListeners.iterator();
    while (localIterator.hasNext()) {
      ((Consumer)localIterator.next()).accept(new MultiWindowModeChangedInfo(paramBoolean));
    }
  }
  
  @CallSuper
  @RequiresApi(api=26)
  public void onMultiWindowModeChanged(boolean paramBoolean, @NonNull Configuration paramConfiguration)
  {
    Iterator localIterator = mOnMultiWindowModeChangedListeners.iterator();
    while (localIterator.hasNext()) {
      ((Consumer)localIterator.next()).accept(new MultiWindowModeChangedInfo(paramBoolean, paramConfiguration));
    }
  }
  
  @CallSuper
  public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    Iterator localIterator = mOnNewIntentListeners.iterator();
    while (localIterator.hasNext()) {
      ((Consumer)localIterator.next()).accept(paramIntent);
    }
  }
  
  public void onPanelClosed(int paramInt, @NonNull Menu paramMenu)
  {
    mMenuHostHelper.onMenuClosed(paramMenu);
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  @CallSuper
  public void onPictureInPictureModeChanged(boolean paramBoolean)
  {
    Iterator localIterator = mOnPictureInPictureModeChangedListeners.iterator();
    while (localIterator.hasNext()) {
      ((Consumer)localIterator.next()).accept(new PictureInPictureModeChangedInfo(paramBoolean));
    }
  }
  
  @CallSuper
  @RequiresApi(api=26)
  public void onPictureInPictureModeChanged(boolean paramBoolean, @NonNull Configuration paramConfiguration)
  {
    Iterator localIterator = mOnPictureInPictureModeChangedListeners.iterator();
    while (localIterator.hasNext()) {
      ((Consumer)localIterator.next()).accept(new PictureInPictureModeChangedInfo(paramBoolean, paramConfiguration));
    }
  }
  
  public boolean onPreparePanel(int paramInt, @Nullable View paramView, @NonNull Menu paramMenu)
  {
    if (paramInt == 0)
    {
      super.onPreparePanel(paramInt, paramView, paramMenu);
      mMenuHostHelper.onPrepareMenu(paramMenu);
    }
    return true;
  }
  
  @Deprecated
  @CallSuper
  public void onRequestPermissionsResult(int paramInt, @NonNull String[] paramArrayOfString, @NonNull int[] paramArrayOfInt)
  {
    if (!mActivityResultRegistry.dispatchResult(paramInt, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", paramArrayOfString).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", paramArrayOfInt))) {
      super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    }
  }
  
  @Deprecated
  @Nullable
  public Object onRetainCustomNonConfigurationInstance()
  {
    return null;
  }
  
  @Nullable
  public final Object onRetainNonConfigurationInstance()
  {
    Object localObject1 = onRetainCustomNonConfigurationInstance();
    Object localObject2 = mViewModelStore;
    Object localObject3 = localObject2;
    if (localObject2 == null)
    {
      NonConfigurationInstances localNonConfigurationInstances = (NonConfigurationInstances)getLastNonConfigurationInstance();
      localObject3 = localObject2;
      if (localNonConfigurationInstances != null) {
        localObject3 = viewModelStore;
      }
    }
    if ((localObject3 == null) && (localObject1 == null)) {
      return null;
    }
    localObject2 = new NonConfigurationInstances();
    custom = localObject1;
    viewModelStore = ((ViewModelStore)localObject3);
    return localObject2;
  }
  
  @CallSuper
  public void onSaveInstanceState(@NonNull Bundle paramBundle)
  {
    Lifecycle localLifecycle = getLifecycle();
    if ((localLifecycle instanceof LifecycleRegistry)) {
      ((LifecycleRegistry)localLifecycle).setCurrentState(Lifecycle.State.CREATED);
    }
    super.onSaveInstanceState(paramBundle);
    mSavedStateRegistryController.performSave(paramBundle);
  }
  
  @CallSuper
  public void onTrimMemory(int paramInt)
  {
    super.onTrimMemory(paramInt);
    Iterator localIterator = mOnTrimMemoryListeners.iterator();
    while (localIterator.hasNext()) {
      ((Consumer)localIterator.next()).accept(Integer.valueOf(paramInt));
    }
  }
  
  @Nullable
  public Context peekAvailableContext()
  {
    return mContextAwareHelper.peekAvailableContext();
  }
  
  @NonNull
  public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> paramActivityResultContract, @NonNull ActivityResultCallback<O> paramActivityResultCallback)
  {
    return registerForActivityResult(paramActivityResultContract, mActivityResultRegistry, paramActivityResultCallback);
  }
  
  @NonNull
  public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> paramActivityResultContract, @NonNull ActivityResultRegistry paramActivityResultRegistry, @NonNull ActivityResultCallback<O> paramActivityResultCallback)
  {
    StringBuilder localStringBuilder = z2.t("activity_rq#");
    localStringBuilder.append(mNextLocalRequestCode.getAndIncrement());
    return paramActivityResultRegistry.register(localStringBuilder.toString(), this, paramActivityResultContract, paramActivityResultCallback);
  }
  
  public void removeMenuProvider(@NonNull MenuProvider paramMenuProvider)
  {
    mMenuHostHelper.removeMenuProvider(paramMenuProvider);
  }
  
  public final void removeOnConfigurationChangedListener(@NonNull Consumer<Configuration> paramConsumer)
  {
    mOnConfigurationChangedListeners.remove(paramConsumer);
  }
  
  public final void removeOnContextAvailableListener(@NonNull OnContextAvailableListener paramOnContextAvailableListener)
  {
    mContextAwareHelper.removeOnContextAvailableListener(paramOnContextAvailableListener);
  }
  
  public final void removeOnMultiWindowModeChangedListener(@NonNull Consumer<MultiWindowModeChangedInfo> paramConsumer)
  {
    mOnMultiWindowModeChangedListeners.remove(paramConsumer);
  }
  
  public final void removeOnNewIntentListener(@NonNull Consumer<Intent> paramConsumer)
  {
    mOnNewIntentListeners.remove(paramConsumer);
  }
  
  public final void removeOnPictureInPictureModeChangedListener(@NonNull Consumer<PictureInPictureModeChangedInfo> paramConsumer)
  {
    mOnPictureInPictureModeChangedListeners.remove(paramConsumer);
  }
  
  public final void removeOnTrimMemoryListener(@NonNull Consumer<Integer> paramConsumer)
  {
    mOnTrimMemoryListeners.remove(paramConsumer);
  }
  
  public void reportFullyDrawn()
  {
    try
    {
      if (Trace.isEnabled()) {
        Trace.beginSection("reportFullyDrawn() for ComponentActivity");
      }
      super.reportFullyDrawn();
      return;
    }
    finally
    {
      Trace.endSection();
    }
  }
  
  public void setContentView(@LayoutRes int paramInt)
  {
    initViewTreeOwners();
    super.setContentView(paramInt);
  }
  
  public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View paramView)
  {
    initViewTreeOwners();
    super.setContentView(paramView);
  }
  
  public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View paramView, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams paramLayoutParams)
  {
    initViewTreeOwners();
    super.setContentView(paramView, paramLayoutParams);
  }
  
  @Deprecated
  public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt)
  {
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  @Deprecated
  public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt, @Nullable Bundle paramBundle)
  {
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  @Deprecated
  public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender paramIntentSender, int paramInt1, @Nullable Intent paramIntent, int paramInt2, int paramInt3, int paramInt4)
    throws IntentSender.SendIntentException
  {
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
  }
  
  @Deprecated
  public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender paramIntentSender, int paramInt1, @Nullable Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, @Nullable Bundle paramBundle)
    throws IntentSender.SendIntentException
  {
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    public static void cancelPendingInputEvents(View paramView)
    {
      paramView.cancelPendingInputEvents();
    }
  }
  
  public static final class NonConfigurationInstances
  {
    public Object custom;
    public ViewModelStore viewModelStore;
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ComponentActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
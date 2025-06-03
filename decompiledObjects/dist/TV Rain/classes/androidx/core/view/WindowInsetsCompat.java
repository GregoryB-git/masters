package androidx.core.view;

import a;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets.Builder;
import android.view.WindowInsets.Type;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import l4;
import m5;
import o5;
import z2;

public class WindowInsetsCompat
{
  @NonNull
  public static final WindowInsetsCompat CONSUMED;
  private static final String TAG = "WindowInsetsCompat";
  private final Impl mImpl;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 30) {
      CONSUMED = Impl30.CONSUMED;
    } else {
      CONSUMED = Impl.CONSUMED;
    }
  }
  
  @RequiresApi(20)
  private WindowInsetsCompat(@NonNull WindowInsets paramWindowInsets)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      mImpl = new Impl30(this, paramWindowInsets);
    } else if (i >= 29) {
      mImpl = new Impl29(this, paramWindowInsets);
    } else if (i >= 28) {
      mImpl = new Impl28(this, paramWindowInsets);
    } else {
      mImpl = new Impl21(this, paramWindowInsets);
    }
  }
  
  public WindowInsetsCompat(@Nullable WindowInsetsCompat paramWindowInsetsCompat)
  {
    if (paramWindowInsetsCompat != null)
    {
      paramWindowInsetsCompat = mImpl;
      int i = Build.VERSION.SDK_INT;
      if ((i >= 30) && ((paramWindowInsetsCompat instanceof Impl30))) {
        mImpl = new Impl30(this, (Impl30)paramWindowInsetsCompat);
      } else if ((i >= 29) && ((paramWindowInsetsCompat instanceof Impl29))) {
        mImpl = new Impl29(this, (Impl29)paramWindowInsetsCompat);
      } else if ((i >= 28) && ((paramWindowInsetsCompat instanceof Impl28))) {
        mImpl = new Impl28(this, (Impl28)paramWindowInsetsCompat);
      } else if ((paramWindowInsetsCompat instanceof Impl21)) {
        mImpl = new Impl21(this, (Impl21)paramWindowInsetsCompat);
      } else if ((paramWindowInsetsCompat instanceof Impl20)) {
        mImpl = new Impl20(this, (Impl20)paramWindowInsetsCompat);
      } else {
        mImpl = new Impl(this);
      }
      paramWindowInsetsCompat.copyWindowDataInto(this);
    }
    else
    {
      mImpl = new Impl(this);
    }
  }
  
  public static Insets insetInsets(@NonNull Insets paramInsets, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = Math.max(0, left - paramInt1);
    int j = Math.max(0, top - paramInt2);
    int k = Math.max(0, right - paramInt3);
    int m = Math.max(0, bottom - paramInt4);
    if ((i == paramInt1) && (j == paramInt2) && (k == paramInt3) && (m == paramInt4)) {
      return paramInsets;
    }
    return Insets.of(i, j, k, m);
  }
  
  @NonNull
  @RequiresApi(20)
  public static WindowInsetsCompat toWindowInsetsCompat(@NonNull WindowInsets paramWindowInsets)
  {
    return toWindowInsetsCompat(paramWindowInsets, null);
  }
  
  @NonNull
  @RequiresApi(20)
  public static WindowInsetsCompat toWindowInsetsCompat(@NonNull WindowInsets paramWindowInsets, @Nullable View paramView)
  {
    paramWindowInsets = new WindowInsetsCompat((WindowInsets)Preconditions.checkNotNull(paramWindowInsets));
    if ((paramView != null) && (ViewCompat.isAttachedToWindow(paramView)))
    {
      paramWindowInsets.setRootWindowInsets(ViewCompat.getRootWindowInsets(paramView));
      paramWindowInsets.copyRootViewBounds(paramView.getRootView());
    }
    return paramWindowInsets;
  }
  
  @Deprecated
  @NonNull
  public WindowInsetsCompat consumeDisplayCutout()
  {
    return mImpl.consumeDisplayCutout();
  }
  
  @Deprecated
  @NonNull
  public WindowInsetsCompat consumeStableInsets()
  {
    return mImpl.consumeStableInsets();
  }
  
  @Deprecated
  @NonNull
  public WindowInsetsCompat consumeSystemWindowInsets()
  {
    return mImpl.consumeSystemWindowInsets();
  }
  
  public void copyRootViewBounds(@NonNull View paramView)
  {
    mImpl.copyRootViewBounds(paramView);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof WindowInsetsCompat)) {
      return false;
    }
    paramObject = (WindowInsetsCompat)paramObject;
    return ObjectsCompat.equals(mImpl, mImpl);
  }
  
  @Nullable
  public DisplayCutoutCompat getDisplayCutout()
  {
    return mImpl.getDisplayCutout();
  }
  
  @NonNull
  public Insets getInsets(int paramInt)
  {
    return mImpl.getInsets(paramInt);
  }
  
  @NonNull
  public Insets getInsetsIgnoringVisibility(int paramInt)
  {
    return mImpl.getInsetsIgnoringVisibility(paramInt);
  }
  
  @Deprecated
  @NonNull
  public Insets getMandatorySystemGestureInsets()
  {
    return mImpl.getMandatorySystemGestureInsets();
  }
  
  @Deprecated
  public int getStableInsetBottom()
  {
    return mImpl.getStableInsets().bottom;
  }
  
  @Deprecated
  public int getStableInsetLeft()
  {
    return mImpl.getStableInsets().left;
  }
  
  @Deprecated
  public int getStableInsetRight()
  {
    return mImpl.getStableInsets().right;
  }
  
  @Deprecated
  public int getStableInsetTop()
  {
    return mImpl.getStableInsets().top;
  }
  
  @Deprecated
  @NonNull
  public Insets getStableInsets()
  {
    return mImpl.getStableInsets();
  }
  
  @Deprecated
  @NonNull
  public Insets getSystemGestureInsets()
  {
    return mImpl.getSystemGestureInsets();
  }
  
  @Deprecated
  public int getSystemWindowInsetBottom()
  {
    return mImpl.getSystemWindowInsets().bottom;
  }
  
  @Deprecated
  public int getSystemWindowInsetLeft()
  {
    return mImpl.getSystemWindowInsets().left;
  }
  
  @Deprecated
  public int getSystemWindowInsetRight()
  {
    return mImpl.getSystemWindowInsets().right;
  }
  
  @Deprecated
  public int getSystemWindowInsetTop()
  {
    return mImpl.getSystemWindowInsets().top;
  }
  
  @Deprecated
  @NonNull
  public Insets getSystemWindowInsets()
  {
    return mImpl.getSystemWindowInsets();
  }
  
  @Deprecated
  @NonNull
  public Insets getTappableElementInsets()
  {
    return mImpl.getTappableElementInsets();
  }
  
  public boolean hasInsets()
  {
    Insets localInsets1 = getInsets(Type.all());
    Insets localInsets2 = Insets.NONE;
    boolean bool;
    if ((localInsets1.equals(localInsets2)) && (getInsetsIgnoringVisibility(Type.all() ^ Type.ime()).equals(localInsets2)) && (getDisplayCutout() == null)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  @Deprecated
  public boolean hasStableInsets()
  {
    return mImpl.getStableInsets().equals(Insets.NONE) ^ true;
  }
  
  @Deprecated
  public boolean hasSystemWindowInsets()
  {
    return mImpl.getSystemWindowInsets().equals(Insets.NONE) ^ true;
  }
  
  public int hashCode()
  {
    Impl localImpl = mImpl;
    int i;
    if (localImpl == null) {
      i = 0;
    } else {
      i = localImpl.hashCode();
    }
    return i;
  }
  
  @NonNull
  public WindowInsetsCompat inset(@IntRange(from=0L) int paramInt1, @IntRange(from=0L) int paramInt2, @IntRange(from=0L) int paramInt3, @IntRange(from=0L) int paramInt4)
  {
    return mImpl.inset(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  @NonNull
  public WindowInsetsCompat inset(@NonNull Insets paramInsets)
  {
    return inset(left, top, right, bottom);
  }
  
  public boolean isConsumed()
  {
    return mImpl.isConsumed();
  }
  
  public boolean isRound()
  {
    return mImpl.isRound();
  }
  
  public boolean isVisible(int paramInt)
  {
    return mImpl.isVisible(paramInt);
  }
  
  @Deprecated
  @NonNull
  public WindowInsetsCompat replaceSystemWindowInsets(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return new Builder(this).setSystemWindowInsets(Insets.of(paramInt1, paramInt2, paramInt3, paramInt4)).build();
  }
  
  @Deprecated
  @NonNull
  public WindowInsetsCompat replaceSystemWindowInsets(@NonNull Rect paramRect)
  {
    return new Builder(this).setSystemWindowInsets(Insets.of(paramRect)).build();
  }
  
  public void setOverriddenInsets(Insets[] paramArrayOfInsets)
  {
    mImpl.setOverriddenInsets(paramArrayOfInsets);
  }
  
  public void setRootViewData(@NonNull Insets paramInsets)
  {
    mImpl.setRootViewData(paramInsets);
  }
  
  public void setRootWindowInsets(@Nullable WindowInsetsCompat paramWindowInsetsCompat)
  {
    mImpl.setRootWindowInsets(paramWindowInsetsCompat);
  }
  
  public void setStableInsets(@Nullable Insets paramInsets)
  {
    mImpl.setStableInsets(paramInsets);
  }
  
  @Nullable
  @RequiresApi(20)
  public WindowInsets toWindowInsets()
  {
    Object localObject = mImpl;
    if ((localObject instanceof Impl20)) {
      localObject = mPlatformInsets;
    } else {
      localObject = null;
    }
    return (WindowInsets)localObject;
  }
  
  @SuppressLint({"SoonBlockedPrivateApi"})
  @RequiresApi(21)
  public static class Api21ReflectionHolder
  {
    private static Field sContentInsets;
    private static boolean sReflectionSucceeded;
    private static Field sStableInsets;
    private static Field sViewAttachInfoField;
    
    static
    {
      try
      {
        localObject = View.class.getDeclaredField("mAttachInfo");
        sViewAttachInfoField = (Field)localObject;
        ((AccessibleObject)localObject).setAccessible(true);
        Class localClass = Class.forName("android.view.View$AttachInfo");
        localObject = localClass.getDeclaredField("mStableInsets");
        sStableInsets = (Field)localObject;
        ((AccessibleObject)localObject).setAccessible(true);
        localObject = localClass.getDeclaredField("mContentInsets");
        sContentInsets = (Field)localObject;
        ((AccessibleObject)localObject).setAccessible(true);
        sReflectionSucceeded = true;
      }
      catch (ReflectiveOperationException localReflectiveOperationException)
      {
        Object localObject = z2.t("Failed to get visible insets from AttachInfo ");
        ((StringBuilder)localObject).append(localReflectiveOperationException.getMessage());
        Log.w("WindowInsetsCompat", ((StringBuilder)localObject).toString(), localReflectiveOperationException);
      }
    }
    
    @Nullable
    public static WindowInsetsCompat getRootWindowInsets(@NonNull View paramView)
    {
      if ((sReflectionSucceeded) && (paramView.isAttachedToWindow()))
      {
        Object localObject1 = paramView.getRootView();
        try
        {
          Object localObject2 = sViewAttachInfoField.get(localObject1);
          if (localObject2 != null)
          {
            localObject1 = (Rect)sStableInsets.get(localObject2);
            Rect localRect = (Rect)sContentInsets.get(localObject2);
            if ((localObject1 != null) && (localRect != null))
            {
              localObject2 = new androidx/core/view/WindowInsetsCompat$Builder;
              ((WindowInsetsCompat.Builder)localObject2).<init>();
              localObject1 = ((WindowInsetsCompat.Builder)localObject2).setStableInsets(Insets.of((Rect)localObject1)).setSystemWindowInsets(Insets.of(localRect)).build();
              ((WindowInsetsCompat)localObject1).setRootWindowInsets((WindowInsetsCompat)localObject1);
              ((WindowInsetsCompat)localObject1).copyRootViewBounds(paramView.getRootView());
              return (WindowInsetsCompat)localObject1;
            }
          }
        }
        catch (IllegalAccessException paramView)
        {
          localObject1 = z2.t("Failed to get insets from AttachInfo. ");
          ((StringBuilder)localObject1).append(paramView.getMessage());
          Log.w("WindowInsetsCompat", ((StringBuilder)localObject1).toString(), paramView);
        }
      }
      return null;
    }
  }
  
  public static final class Builder
  {
    private final WindowInsetsCompat.BuilderImpl mImpl;
    
    public Builder()
    {
      int i = Build.VERSION.SDK_INT;
      if (i >= 30) {
        mImpl = new WindowInsetsCompat.BuilderImpl30();
      } else if (i >= 29) {
        mImpl = new WindowInsetsCompat.BuilderImpl29();
      } else {
        mImpl = new WindowInsetsCompat.BuilderImpl20();
      }
    }
    
    public Builder(@NonNull WindowInsetsCompat paramWindowInsetsCompat)
    {
      int i = Build.VERSION.SDK_INT;
      if (i >= 30) {
        mImpl = new WindowInsetsCompat.BuilderImpl30(paramWindowInsetsCompat);
      } else if (i >= 29) {
        mImpl = new WindowInsetsCompat.BuilderImpl29(paramWindowInsetsCompat);
      } else {
        mImpl = new WindowInsetsCompat.BuilderImpl20(paramWindowInsetsCompat);
      }
    }
    
    @NonNull
    public WindowInsetsCompat build()
    {
      return mImpl.build();
    }
    
    @NonNull
    public Builder setDisplayCutout(@Nullable DisplayCutoutCompat paramDisplayCutoutCompat)
    {
      mImpl.setDisplayCutout(paramDisplayCutoutCompat);
      return this;
    }
    
    @NonNull
    public Builder setInsets(int paramInt, @NonNull Insets paramInsets)
    {
      mImpl.setInsets(paramInt, paramInsets);
      return this;
    }
    
    @NonNull
    public Builder setInsetsIgnoringVisibility(int paramInt, @NonNull Insets paramInsets)
    {
      mImpl.setInsetsIgnoringVisibility(paramInt, paramInsets);
      return this;
    }
    
    @Deprecated
    @NonNull
    public Builder setMandatorySystemGestureInsets(@NonNull Insets paramInsets)
    {
      mImpl.setMandatorySystemGestureInsets(paramInsets);
      return this;
    }
    
    @Deprecated
    @NonNull
    public Builder setStableInsets(@NonNull Insets paramInsets)
    {
      mImpl.setStableInsets(paramInsets);
      return this;
    }
    
    @Deprecated
    @NonNull
    public Builder setSystemGestureInsets(@NonNull Insets paramInsets)
    {
      mImpl.setSystemGestureInsets(paramInsets);
      return this;
    }
    
    @Deprecated
    @NonNull
    public Builder setSystemWindowInsets(@NonNull Insets paramInsets)
    {
      mImpl.setSystemWindowInsets(paramInsets);
      return this;
    }
    
    @Deprecated
    @NonNull
    public Builder setTappableElementInsets(@NonNull Insets paramInsets)
    {
      mImpl.setTappableElementInsets(paramInsets);
      return this;
    }
    
    @NonNull
    public Builder setVisible(int paramInt, boolean paramBoolean)
    {
      mImpl.setVisible(paramInt, paramBoolean);
      return this;
    }
  }
  
  public static class BuilderImpl
  {
    private final WindowInsetsCompat mInsets;
    public Insets[] mInsetsTypeMask;
    
    public BuilderImpl()
    {
      this(new WindowInsetsCompat(null));
    }
    
    public BuilderImpl(@NonNull WindowInsetsCompat paramWindowInsetsCompat)
    {
      mInsets = paramWindowInsetsCompat;
    }
    
    public final void applyInsetTypes()
    {
      Object localObject1 = mInsetsTypeMask;
      if (localObject1 != null)
      {
        Object localObject2 = localObject1[WindowInsetsCompat.Type.indexOf(1)];
        Object localObject3 = mInsetsTypeMask[WindowInsetsCompat.Type.indexOf(2)];
        localObject1 = localObject3;
        if (localObject3 == null) {
          localObject1 = mInsets.getInsets(2);
        }
        localObject3 = localObject2;
        if (localObject2 == null) {
          localObject3 = mInsets.getInsets(1);
        }
        setSystemWindowInsets(Insets.max((Insets)localObject3, (Insets)localObject1));
        localObject1 = mInsetsTypeMask[WindowInsetsCompat.Type.indexOf(16)];
        if (localObject1 != null) {
          setSystemGestureInsets((Insets)localObject1);
        }
        localObject1 = mInsetsTypeMask[WindowInsetsCompat.Type.indexOf(32)];
        if (localObject1 != null) {
          setMandatorySystemGestureInsets((Insets)localObject1);
        }
        localObject1 = mInsetsTypeMask[WindowInsetsCompat.Type.indexOf(64)];
        if (localObject1 != null) {
          setTappableElementInsets((Insets)localObject1);
        }
      }
    }
    
    @NonNull
    public WindowInsetsCompat build()
    {
      applyInsetTypes();
      return mInsets;
    }
    
    public void setDisplayCutout(@Nullable DisplayCutoutCompat paramDisplayCutoutCompat) {}
    
    public void setInsets(int paramInt, @NonNull Insets paramInsets)
    {
      if (mInsetsTypeMask == null) {
        mInsetsTypeMask = new Insets[9];
      }
      int i = 1;
      while (i <= 256)
      {
        if ((paramInt & i) != 0) {
          mInsetsTypeMask[WindowInsetsCompat.Type.indexOf(i)] = paramInsets;
        }
        i <<= 1;
      }
    }
    
    public void setInsetsIgnoringVisibility(int paramInt, @NonNull Insets paramInsets)
    {
      if (paramInt != 8) {
        return;
      }
      throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
    }
    
    public void setMandatorySystemGestureInsets(@NonNull Insets paramInsets) {}
    
    public void setStableInsets(@NonNull Insets paramInsets) {}
    
    public void setSystemGestureInsets(@NonNull Insets paramInsets) {}
    
    public void setSystemWindowInsets(@NonNull Insets paramInsets) {}
    
    public void setTappableElementInsets(@NonNull Insets paramInsets) {}
    
    public void setVisible(int paramInt, boolean paramBoolean) {}
  }
  
  @RequiresApi(api=20)
  public static class BuilderImpl20
    extends WindowInsetsCompat.BuilderImpl
  {
    private static Constructor<WindowInsets> sConstructor;
    private static boolean sConstructorFetched = false;
    private static Field sConsumedField;
    private static boolean sConsumedFieldFetched = false;
    private WindowInsets mPlatformInsets;
    private Insets mStableInsets;
    
    public BuilderImpl20()
    {
      mPlatformInsets = createWindowInsetsInstance();
    }
    
    public BuilderImpl20(@NonNull WindowInsetsCompat paramWindowInsetsCompat)
    {
      super();
      mPlatformInsets = paramWindowInsetsCompat.toWindowInsets();
    }
    
    @Nullable
    private static WindowInsets createWindowInsetsInstance()
    {
      if (!sConsumedFieldFetched)
      {
        try
        {
          sConsumedField = WindowInsets.class.getDeclaredField("CONSUMED");
        }
        catch (ReflectiveOperationException localReflectiveOperationException1)
        {
          Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", localReflectiveOperationException1);
        }
        sConsumedFieldFetched = true;
      }
      Object localObject1 = sConsumedField;
      if (localObject1 != null) {
        try
        {
          localObject1 = (WindowInsets)((Field)localObject1).get(null);
          if (localObject1 != null)
          {
            localObject1 = new WindowInsets((WindowInsets)localObject1);
            return (WindowInsets)localObject1;
          }
        }
        catch (ReflectiveOperationException localReflectiveOperationException2)
        {
          Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", localReflectiveOperationException2);
        }
      }
      if (!sConstructorFetched)
      {
        try
        {
          sConstructor = WindowInsets.class.getConstructor(new Class[] { Rect.class });
        }
        catch (ReflectiveOperationException localReflectiveOperationException3)
        {
          Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", localReflectiveOperationException3);
        }
        sConstructorFetched = true;
      }
      Object localObject2 = sConstructor;
      if (localObject2 != null) {
        try
        {
          Rect localRect = new android/graphics/Rect;
          localRect.<init>();
          localObject2 = (WindowInsets)((Constructor)localObject2).newInstance(new Object[] { localRect });
          return (WindowInsets)localObject2;
        }
        catch (ReflectiveOperationException localReflectiveOperationException4)
        {
          Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", localReflectiveOperationException4);
        }
      }
      return null;
    }
    
    @NonNull
    public WindowInsetsCompat build()
    {
      applyInsetTypes();
      WindowInsetsCompat localWindowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(mPlatformInsets);
      localWindowInsetsCompat.setOverriddenInsets(mInsetsTypeMask);
      localWindowInsetsCompat.setStableInsets(mStableInsets);
      return localWindowInsetsCompat;
    }
    
    public void setStableInsets(@Nullable Insets paramInsets)
    {
      mStableInsets = paramInsets;
    }
    
    public void setSystemWindowInsets(@NonNull Insets paramInsets)
    {
      WindowInsets localWindowInsets = mPlatformInsets;
      if (localWindowInsets != null) {
        mPlatformInsets = localWindowInsets.replaceSystemWindowInsets(left, top, right, bottom);
      }
    }
  }
  
  @RequiresApi(api=29)
  public static class BuilderImpl29
    extends WindowInsetsCompat.BuilderImpl
  {
    public final WindowInsets.Builder mPlatBuilder;
    
    public BuilderImpl29()
    {
      mPlatBuilder = new WindowInsets.Builder();
    }
    
    public BuilderImpl29(@NonNull WindowInsetsCompat paramWindowInsetsCompat)
    {
      super();
      paramWindowInsetsCompat = paramWindowInsetsCompat.toWindowInsets();
      if (paramWindowInsetsCompat != null) {
        paramWindowInsetsCompat = new WindowInsets.Builder(paramWindowInsetsCompat);
      } else {
        paramWindowInsetsCompat = new WindowInsets.Builder();
      }
      mPlatBuilder = paramWindowInsetsCompat;
    }
    
    @NonNull
    public WindowInsetsCompat build()
    {
      applyInsetTypes();
      WindowInsetsCompat localWindowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(mPlatBuilder.build());
      localWindowInsetsCompat.setOverriddenInsets(mInsetsTypeMask);
      return localWindowInsetsCompat;
    }
    
    public void setDisplayCutout(@Nullable DisplayCutoutCompat paramDisplayCutoutCompat)
    {
      WindowInsets.Builder localBuilder = mPlatBuilder;
      if (paramDisplayCutoutCompat != null) {
        paramDisplayCutoutCompat = paramDisplayCutoutCompat.unwrap();
      } else {
        paramDisplayCutoutCompat = null;
      }
      localBuilder.setDisplayCutout(paramDisplayCutoutCompat);
    }
    
    public void setMandatorySystemGestureInsets(@NonNull Insets paramInsets)
    {
      mPlatBuilder.setMandatorySystemGestureInsets(paramInsets.toPlatformInsets());
    }
    
    public void setStableInsets(@NonNull Insets paramInsets)
    {
      mPlatBuilder.setStableInsets(paramInsets.toPlatformInsets());
    }
    
    public void setSystemGestureInsets(@NonNull Insets paramInsets)
    {
      mPlatBuilder.setSystemGestureInsets(paramInsets.toPlatformInsets());
    }
    
    public void setSystemWindowInsets(@NonNull Insets paramInsets)
    {
      mPlatBuilder.setSystemWindowInsets(paramInsets.toPlatformInsets());
    }
    
    public void setTappableElementInsets(@NonNull Insets paramInsets)
    {
      mPlatBuilder.setTappableElementInsets(paramInsets.toPlatformInsets());
    }
  }
  
  @RequiresApi(30)
  public static class BuilderImpl30
    extends WindowInsetsCompat.BuilderImpl29
  {
    public BuilderImpl30() {}
    
    public BuilderImpl30(@NonNull WindowInsetsCompat paramWindowInsetsCompat)
    {
      super();
    }
    
    public void setInsets(int paramInt, @NonNull Insets paramInsets)
    {
      l4.q(mPlatBuilder, WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt), paramInsets.toPlatformInsets());
    }
    
    public void setInsetsIgnoringVisibility(int paramInt, @NonNull Insets paramInsets)
    {
      l4.m(mPlatBuilder, WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt), paramInsets.toPlatformInsets());
    }
    
    public void setVisible(int paramInt, boolean paramBoolean)
    {
      l4.n(mPlatBuilder, WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt), paramBoolean);
    }
  }
  
  public static class Impl
  {
    @NonNull
    public static final WindowInsetsCompat CONSUMED = new WindowInsetsCompat.Builder().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();
    public final WindowInsetsCompat mHost;
    
    public Impl(@NonNull WindowInsetsCompat paramWindowInsetsCompat)
    {
      mHost = paramWindowInsetsCompat;
    }
    
    @NonNull
    public WindowInsetsCompat consumeDisplayCutout()
    {
      return mHost;
    }
    
    @NonNull
    public WindowInsetsCompat consumeStableInsets()
    {
      return mHost;
    }
    
    @NonNull
    public WindowInsetsCompat consumeSystemWindowInsets()
    {
      return mHost;
    }
    
    public void copyRootViewBounds(@NonNull View paramView) {}
    
    public void copyWindowDataInto(@NonNull WindowInsetsCompat paramWindowInsetsCompat) {}
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof Impl)) {
        return false;
      }
      paramObject = (Impl)paramObject;
      if ((isRound() != ((Impl)paramObject).isRound()) || (isConsumed() != ((Impl)paramObject).isConsumed()) || (!ObjectsCompat.equals(getSystemWindowInsets(), ((Impl)paramObject).getSystemWindowInsets())) || (!ObjectsCompat.equals(getStableInsets(), ((Impl)paramObject).getStableInsets())) || (!ObjectsCompat.equals(getDisplayCutout(), ((Impl)paramObject).getDisplayCutout()))) {
        bool = false;
      }
      return bool;
    }
    
    @Nullable
    public DisplayCutoutCompat getDisplayCutout()
    {
      return null;
    }
    
    @NonNull
    public Insets getInsets(int paramInt)
    {
      return Insets.NONE;
    }
    
    @NonNull
    public Insets getInsetsIgnoringVisibility(int paramInt)
    {
      if ((paramInt & 0x8) == 0) {
        return Insets.NONE;
      }
      throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }
    
    @NonNull
    public Insets getMandatorySystemGestureInsets()
    {
      return getSystemWindowInsets();
    }
    
    @NonNull
    public Insets getStableInsets()
    {
      return Insets.NONE;
    }
    
    @NonNull
    public Insets getSystemGestureInsets()
    {
      return getSystemWindowInsets();
    }
    
    @NonNull
    public Insets getSystemWindowInsets()
    {
      return Insets.NONE;
    }
    
    @NonNull
    public Insets getTappableElementInsets()
    {
      return getSystemWindowInsets();
    }
    
    public int hashCode()
    {
      return ObjectsCompat.hash(new Object[] { Boolean.valueOf(isRound()), Boolean.valueOf(isConsumed()), getSystemWindowInsets(), getStableInsets(), getDisplayCutout() });
    }
    
    @NonNull
    public WindowInsetsCompat inset(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return CONSUMED;
    }
    
    public boolean isConsumed()
    {
      return false;
    }
    
    public boolean isRound()
    {
      return false;
    }
    
    public boolean isVisible(int paramInt)
    {
      return true;
    }
    
    public void setOverriddenInsets(Insets[] paramArrayOfInsets) {}
    
    public void setRootViewData(@NonNull Insets paramInsets) {}
    
    public void setRootWindowInsets(@Nullable WindowInsetsCompat paramWindowInsetsCompat) {}
    
    public void setStableInsets(Insets paramInsets) {}
  }
  
  @RequiresApi(20)
  public static class Impl20
    extends WindowInsetsCompat.Impl
  {
    private static Class<?> sAttachInfoClass;
    private static Field sAttachInfoField;
    private static Method sGetViewRootImplMethod;
    private static Field sVisibleInsetsField;
    private static boolean sVisibleRectReflectionFetched = false;
    private Insets[] mOverriddenInsets;
    @NonNull
    public final WindowInsets mPlatformInsets;
    public Insets mRootViewVisibleInsets;
    private WindowInsetsCompat mRootWindowInsets;
    private Insets mSystemWindowInsets = null;
    
    public Impl20(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull WindowInsets paramWindowInsets)
    {
      super();
      mPlatformInsets = paramWindowInsets;
    }
    
    public Impl20(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull Impl20 paramImpl20)
    {
      this(paramWindowInsetsCompat, new WindowInsets(mPlatformInsets));
    }
    
    @SuppressLint({"WrongConstant"})
    @NonNull
    private Insets getInsets(int paramInt, boolean paramBoolean)
    {
      Insets localInsets = Insets.NONE;
      int i = 1;
      while (i <= 256)
      {
        if ((paramInt & i) != 0) {
          localInsets = Insets.max(localInsets, getInsetsForType(i, paramBoolean));
        }
        i <<= 1;
      }
      return localInsets;
    }
    
    private Insets getRootStableInsets()
    {
      WindowInsetsCompat localWindowInsetsCompat = mRootWindowInsets;
      if (localWindowInsetsCompat != null) {
        return localWindowInsetsCompat.getStableInsets();
      }
      return Insets.NONE;
    }
    
    @Nullable
    private Insets getVisibleInsets(@NonNull View paramView)
    {
      if (Build.VERSION.SDK_INT < 30)
      {
        if (!sVisibleRectReflectionFetched) {
          loadReflectionField();
        }
        Object localObject1 = sGetViewRootImplMethod;
        Object localObject2 = null;
        if ((localObject1 != null) && (sAttachInfoClass != null) && (sVisibleInsetsField != null)) {
          try
          {
            paramView = ((Method)localObject1).invoke(paramView, new Object[0]);
            if (paramView == null)
            {
              paramView = new java/lang/NullPointerException;
              paramView.<init>();
              Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", paramView);
              return null;
            }
            paramView = sAttachInfoField.get(paramView);
            localObject1 = (Rect)sVisibleInsetsField.get(paramView);
            paramView = (View)localObject2;
            if (localObject1 != null) {
              paramView = Insets.of((Rect)localObject1);
            }
            return paramView;
          }
          catch (ReflectiveOperationException localReflectiveOperationException)
          {
            paramView = z2.t("Failed to get visible insets. (Reflection error). ");
            paramView.append(localReflectiveOperationException.getMessage());
            Log.e("WindowInsetsCompat", paramView.toString(), localReflectiveOperationException);
          }
        }
        return null;
      }
      throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }
    
    @SuppressLint({"PrivateApi"})
    private static void loadReflectionField()
    {
      try
      {
        sGetViewRootImplMethod = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
        localObject = Class.forName("android.view.View$AttachInfo");
        sAttachInfoClass = (Class)localObject;
        sVisibleInsetsField = ((Class)localObject).getDeclaredField("mVisibleInsets");
        sAttachInfoField = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
        sVisibleInsetsField.setAccessible(true);
        sAttachInfoField.setAccessible(true);
      }
      catch (ReflectiveOperationException localReflectiveOperationException)
      {
        Object localObject = z2.t("Failed to get visible insets. (Reflection error). ");
        ((StringBuilder)localObject).append(localReflectiveOperationException.getMessage());
        Log.e("WindowInsetsCompat", ((StringBuilder)localObject).toString(), localReflectiveOperationException);
      }
      sVisibleRectReflectionFetched = true;
    }
    
    public void copyRootViewBounds(@NonNull View paramView)
    {
      Insets localInsets = getVisibleInsets(paramView);
      paramView = localInsets;
      if (localInsets == null) {
        paramView = Insets.NONE;
      }
      setRootViewData(paramView);
    }
    
    public void copyWindowDataInto(@NonNull WindowInsetsCompat paramWindowInsetsCompat)
    {
      paramWindowInsetsCompat.setRootWindowInsets(mRootWindowInsets);
      paramWindowInsetsCompat.setRootViewData(mRootViewVisibleInsets);
    }
    
    public boolean equals(Object paramObject)
    {
      if (!super.equals(paramObject)) {
        return false;
      }
      paramObject = (Impl20)paramObject;
      return Objects.equals(mRootViewVisibleInsets, mRootViewVisibleInsets);
    }
    
    @NonNull
    public Insets getInsets(int paramInt)
    {
      return getInsets(paramInt, false);
    }
    
    @NonNull
    public Insets getInsetsForType(int paramInt, boolean paramBoolean)
    {
      if (paramInt != 1)
      {
        Object localObject1 = null;
        Insets localInsets = null;
        if (paramInt != 2)
        {
          if (paramInt != 8)
          {
            if (paramInt != 16)
            {
              if (paramInt != 32)
              {
                if (paramInt != 64)
                {
                  if (paramInt != 128) {
                    return Insets.NONE;
                  }
                  localObject1 = mRootWindowInsets;
                  if (localObject1 != null) {
                    localObject1 = ((WindowInsetsCompat)localObject1).getDisplayCutout();
                  } else {
                    localObject1 = getDisplayCutout();
                  }
                  if (localObject1 != null) {
                    return Insets.of(((DisplayCutoutCompat)localObject1).getSafeInsetLeft(), ((DisplayCutoutCompat)localObject1).getSafeInsetTop(), ((DisplayCutoutCompat)localObject1).getSafeInsetRight(), ((DisplayCutoutCompat)localObject1).getSafeInsetBottom());
                  }
                  return Insets.NONE;
                }
                return getTappableElementInsets();
              }
              return getMandatorySystemGestureInsets();
            }
            return getSystemGestureInsets();
          }
          localObject2 = mOverriddenInsets;
          localObject1 = localInsets;
          if (localObject2 != null) {
            localObject1 = localObject2[WindowInsetsCompat.Type.indexOf(8)];
          }
          if (localObject1 != null) {
            return (Insets)localObject1;
          }
          localInsets = getSystemWindowInsets();
          localObject1 = getRootStableInsets();
          paramInt = bottom;
          if (paramInt > bottom) {
            return Insets.of(0, 0, 0, paramInt);
          }
          localInsets = mRootViewVisibleInsets;
          if ((localInsets != null) && (!localInsets.equals(Insets.NONE)))
          {
            paramInt = mRootViewVisibleInsets.bottom;
            if (paramInt > bottom) {
              return Insets.of(0, 0, 0, paramInt);
            }
          }
          return Insets.NONE;
        }
        if (paramBoolean)
        {
          localInsets = getRootStableInsets();
          localObject1 = getStableInsets();
          return Insets.of(Math.max(left, left), 0, Math.max(right, right), Math.max(bottom, bottom));
        }
        localInsets = getSystemWindowInsets();
        Object localObject2 = mRootWindowInsets;
        if (localObject2 != null) {
          localObject1 = ((WindowInsetsCompat)localObject2).getStableInsets();
        }
        int i = bottom;
        paramInt = i;
        if (localObject1 != null) {
          paramInt = Math.min(i, bottom);
        }
        return Insets.of(left, 0, right, paramInt);
      }
      if (paramBoolean) {
        return Insets.of(0, Math.max(getRootStableInsetstop, getSystemWindowInsetstop), 0, 0);
      }
      return Insets.of(0, getSystemWindowInsetstop, 0, 0);
    }
    
    @NonNull
    public Insets getInsetsIgnoringVisibility(int paramInt)
    {
      return getInsets(paramInt, true);
    }
    
    @NonNull
    public final Insets getSystemWindowInsets()
    {
      if (mSystemWindowInsets == null) {
        mSystemWindowInsets = Insets.of(mPlatformInsets.getSystemWindowInsetLeft(), mPlatformInsets.getSystemWindowInsetTop(), mPlatformInsets.getSystemWindowInsetRight(), mPlatformInsets.getSystemWindowInsetBottom());
      }
      return mSystemWindowInsets;
    }
    
    @NonNull
    public WindowInsetsCompat inset(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      WindowInsetsCompat.Builder localBuilder = new WindowInsetsCompat.Builder(WindowInsetsCompat.toWindowInsetsCompat(mPlatformInsets));
      localBuilder.setSystemWindowInsets(WindowInsetsCompat.insetInsets(getSystemWindowInsets(), paramInt1, paramInt2, paramInt3, paramInt4));
      localBuilder.setStableInsets(WindowInsetsCompat.insetInsets(getStableInsets(), paramInt1, paramInt2, paramInt3, paramInt4));
      return localBuilder.build();
    }
    
    public boolean isRound()
    {
      return mPlatformInsets.isRound();
    }
    
    public boolean isTypeVisible(int paramInt)
    {
      if ((paramInt != 1) && (paramInt != 2)) {
        if (paramInt != 4)
        {
          if ((paramInt != 8) && (paramInt != 128)) {
            return true;
          }
        }
        else {
          return false;
        }
      }
      return getInsetsForType(paramInt, false).equals(Insets.NONE) ^ true;
    }
    
    @SuppressLint({"WrongConstant"})
    public boolean isVisible(int paramInt)
    {
      int i = 1;
      while (i <= 256)
      {
        if (((paramInt & i) != 0) && (!isTypeVisible(i))) {
          return false;
        }
        i <<= 1;
      }
      return true;
    }
    
    public void setOverriddenInsets(Insets[] paramArrayOfInsets)
    {
      mOverriddenInsets = paramArrayOfInsets;
    }
    
    public void setRootViewData(@NonNull Insets paramInsets)
    {
      mRootViewVisibleInsets = paramInsets;
    }
    
    public void setRootWindowInsets(@Nullable WindowInsetsCompat paramWindowInsetsCompat)
    {
      mRootWindowInsets = paramWindowInsetsCompat;
    }
  }
  
  @RequiresApi(21)
  public static class Impl21
    extends WindowInsetsCompat.Impl20
  {
    private Insets mStableInsets = null;
    
    public Impl21(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    public Impl21(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull Impl21 paramImpl21)
    {
      super(paramImpl21);
      mStableInsets = mStableInsets;
    }
    
    @NonNull
    public WindowInsetsCompat consumeStableInsets()
    {
      return WindowInsetsCompat.toWindowInsetsCompat(mPlatformInsets.consumeStableInsets());
    }
    
    @NonNull
    public WindowInsetsCompat consumeSystemWindowInsets()
    {
      return WindowInsetsCompat.toWindowInsetsCompat(mPlatformInsets.consumeSystemWindowInsets());
    }
    
    @NonNull
    public final Insets getStableInsets()
    {
      if (mStableInsets == null) {
        mStableInsets = Insets.of(mPlatformInsets.getStableInsetLeft(), mPlatformInsets.getStableInsetTop(), mPlatformInsets.getStableInsetRight(), mPlatformInsets.getStableInsetBottom());
      }
      return mStableInsets;
    }
    
    public boolean isConsumed()
    {
      return mPlatformInsets.isConsumed();
    }
    
    public void setStableInsets(@Nullable Insets paramInsets)
    {
      mStableInsets = paramInsets;
    }
  }
  
  @RequiresApi(28)
  public static class Impl28
    extends WindowInsetsCompat.Impl21
  {
    public Impl28(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    public Impl28(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull Impl28 paramImpl28)
    {
      super(paramImpl28);
    }
    
    @NonNull
    public WindowInsetsCompat consumeDisplayCutout()
    {
      return WindowInsetsCompat.toWindowInsetsCompat(m5.g(mPlatformInsets));
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof Impl28)) {
        return false;
      }
      paramObject = (Impl28)paramObject;
      if ((!Objects.equals(mPlatformInsets, mPlatformInsets)) || (!Objects.equals(mRootViewVisibleInsets, mRootViewVisibleInsets))) {
        bool = false;
      }
      return bool;
    }
    
    @Nullable
    public DisplayCutoutCompat getDisplayCutout()
    {
      return DisplayCutoutCompat.wrap(m5.d(mPlatformInsets));
    }
    
    public int hashCode()
    {
      return mPlatformInsets.hashCode();
    }
  }
  
  @RequiresApi(29)
  public static class Impl29
    extends WindowInsetsCompat.Impl28
  {
    private Insets mMandatorySystemGestureInsets = null;
    private Insets mSystemGestureInsets = null;
    private Insets mTappableElementInsets = null;
    
    public Impl29(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    public Impl29(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull Impl29 paramImpl29)
    {
      super(paramImpl29);
    }
    
    @NonNull
    public Insets getMandatorySystemGestureInsets()
    {
      if (mMandatorySystemGestureInsets == null) {
        mMandatorySystemGestureInsets = Insets.toCompatInsets(o5.n(mPlatformInsets));
      }
      return mMandatorySystemGestureInsets;
    }
    
    @NonNull
    public Insets getSystemGestureInsets()
    {
      if (mSystemGestureInsets == null) {
        mSystemGestureInsets = Insets.toCompatInsets(o5.c(mPlatformInsets));
      }
      return mSystemGestureInsets;
    }
    
    @NonNull
    public Insets getTappableElementInsets()
    {
      if (mTappableElementInsets == null) {
        mTappableElementInsets = Insets.toCompatInsets(o5.k(mPlatformInsets));
      }
      return mTappableElementInsets;
    }
    
    @NonNull
    public WindowInsetsCompat inset(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return WindowInsetsCompat.toWindowInsetsCompat(o5.d(mPlatformInsets, paramInt1, paramInt2, paramInt3, paramInt4));
    }
    
    public void setStableInsets(@Nullable Insets paramInsets) {}
  }
  
  @RequiresApi(30)
  public static class Impl30
    extends WindowInsetsCompat.Impl29
  {
    @NonNull
    public static final WindowInsetsCompat CONSUMED = WindowInsetsCompat.toWindowInsetsCompat(WindowInsets.CONSUMED);
    
    public Impl30(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull WindowInsets paramWindowInsets)
    {
      super(paramWindowInsets);
    }
    
    public Impl30(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull Impl30 paramImpl30)
    {
      super(paramImpl30);
    }
    
    public final void copyRootViewBounds(@NonNull View paramView) {}
    
    @NonNull
    public Insets getInsets(int paramInt)
    {
      return Insets.toCompatInsets(l4.p(mPlatformInsets, WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt)));
    }
    
    @NonNull
    public Insets getInsetsIgnoringVisibility(int paramInt)
    {
      return Insets.toCompatInsets(l4.b(mPlatformInsets, WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt)));
    }
    
    public boolean isVisible(int paramInt)
    {
      return l4.o(mPlatformInsets, WindowInsetsCompat.TypeImpl30.toPlatformType(paramInt));
    }
  }
  
  public static final class Type
  {
    public static final int CAPTION_BAR = 4;
    public static final int DISPLAY_CUTOUT = 128;
    public static final int FIRST = 1;
    public static final int IME = 8;
    public static final int LAST = 256;
    public static final int MANDATORY_SYSTEM_GESTURES = 32;
    public static final int NAVIGATION_BARS = 2;
    public static final int SIZE = 9;
    public static final int STATUS_BARS = 1;
    public static final int SYSTEM_GESTURES = 16;
    public static final int TAPPABLE_ELEMENT = 64;
    public static final int WINDOW_DECOR = 256;
    
    @SuppressLint({"WrongConstant"})
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static int all()
    {
      return -1;
    }
    
    public static int captionBar()
    {
      return 4;
    }
    
    public static int displayCutout()
    {
      return 128;
    }
    
    public static int ime()
    {
      return 8;
    }
    
    public static int indexOf(int paramInt)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 4)
          {
            if (paramInt != 8)
            {
              if (paramInt != 16)
              {
                if (paramInt != 32)
                {
                  if (paramInt != 64)
                  {
                    if (paramInt != 128)
                    {
                      if (paramInt == 256) {
                        return 8;
                      }
                      throw new IllegalArgumentException(a.f("type needs to be >= FIRST and <= LAST, type=", paramInt));
                    }
                    return 7;
                  }
                  return 6;
                }
                return 5;
              }
              return 4;
            }
            return 3;
          }
          return 2;
        }
        return 1;
      }
      return 0;
    }
    
    public static int mandatorySystemGestures()
    {
      return 32;
    }
    
    public static int navigationBars()
    {
      return 2;
    }
    
    public static int statusBars()
    {
      return 1;
    }
    
    public static int systemBars()
    {
      return 7;
    }
    
    public static int systemGestures()
    {
      return 16;
    }
    
    public static int tappableElement()
    {
      return 64;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static @interface InsetsType {}
  }
  
  @RequiresApi(30)
  public static final class TypeImpl30
  {
    public static int toPlatformType(int paramInt)
    {
      int i = 0;
      int j = 1;
      while (j <= 256)
      {
        int k = i;
        if ((paramInt & j) != 0)
        {
          if (j != 1)
          {
            if (j != 2)
            {
              if (j != 4)
              {
                if (j != 8)
                {
                  if (j != 16)
                  {
                    if (j != 32)
                    {
                      if (j != 64)
                      {
                        if (j != 128)
                        {
                          k = i;
                          break label127;
                        }
                        k = WindowInsets.Type.displayCutout();
                      }
                      else
                      {
                        k = WindowInsets.Type.tappableElement();
                      }
                    }
                    else {
                      k = WindowInsets.Type.mandatorySystemGestures();
                    }
                  }
                  else {
                    k = WindowInsets.Type.systemGestures();
                  }
                }
                else {
                  k = WindowInsets.Type.ime();
                }
              }
              else {
                k = WindowInsets.Type.captionBar();
              }
            }
            else {
              k = WindowInsets.Type.navigationBars();
            }
          }
          else {
            k = WindowInsets.Type.statusBars();
          }
          k = i | k;
        }
        label127:
        j <<= 1;
        i = k;
      }
      return i;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
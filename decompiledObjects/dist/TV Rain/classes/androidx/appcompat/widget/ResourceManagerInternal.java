package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.appcompat.resources.Compatibility.Api21Impl;
import androidx.appcompat.resources.R.drawable;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ResourceManagerInternal
{
  private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
  private static final boolean DEBUG = false;
  private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
  private static ResourceManagerInternal INSTANCE;
  private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
  private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
  private static final String TAG = "ResourceManagerInternal";
  private SimpleArrayMap<String, InflateDelegate> mDelegates;
  private final WeakHashMap<Context, LongSparseArray<WeakReference<Drawable.ConstantState>>> mDrawableCaches = new WeakHashMap(0);
  private boolean mHasCheckedVectorDrawableSetup;
  private ResourceManagerHooks mHooks;
  private SparseArrayCompat<String> mKnownDrawableIdTags;
  private WeakHashMap<Context, SparseArrayCompat<ColorStateList>> mTintLists;
  private TypedValue mTypedValue;
  
  private void addDelegate(@NonNull String paramString, @NonNull InflateDelegate paramInflateDelegate)
  {
    if (mDelegates == null) {
      mDelegates = new SimpleArrayMap();
    }
    mDelegates.put(paramString, paramInflateDelegate);
  }
  
  private boolean addDrawableToCache(@NonNull Context paramContext, long paramLong, @NonNull Drawable paramDrawable)
  {
    try
    {
      Drawable.ConstantState localConstantState = paramDrawable.getConstantState();
      if (localConstantState != null)
      {
        LongSparseArray localLongSparseArray = (LongSparseArray)mDrawableCaches.get(paramContext);
        paramDrawable = localLongSparseArray;
        if (localLongSparseArray == null)
        {
          paramDrawable = new androidx/collection/LongSparseArray;
          paramDrawable.<init>();
          mDrawableCaches.put(paramContext, paramDrawable);
        }
        paramContext = new java/lang/ref/WeakReference;
        paramContext.<init>(localConstantState);
        paramDrawable.put(paramLong, paramContext);
        return true;
      }
      return false;
    }
    finally {}
  }
  
  private void addTintListToCache(@NonNull Context paramContext, @DrawableRes int paramInt, @NonNull ColorStateList paramColorStateList)
  {
    if (mTintLists == null) {
      mTintLists = new WeakHashMap();
    }
    SparseArrayCompat localSparseArrayCompat1 = (SparseArrayCompat)mTintLists.get(paramContext);
    SparseArrayCompat localSparseArrayCompat2 = localSparseArrayCompat1;
    if (localSparseArrayCompat1 == null)
    {
      localSparseArrayCompat2 = new SparseArrayCompat();
      mTintLists.put(paramContext, localSparseArrayCompat2);
    }
    localSparseArrayCompat2.append(paramInt, paramColorStateList);
  }
  
  private void checkVectorDrawableSetup(@NonNull Context paramContext)
  {
    if (mHasCheckedVectorDrawableSetup) {
      return;
    }
    mHasCheckedVectorDrawableSetup = true;
    paramContext = getDrawable(paramContext, R.drawable.abc_vector_test);
    if ((paramContext != null) && (isVectorDrawable(paramContext))) {
      return;
    }
    mHasCheckedVectorDrawableSetup = false;
    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
  }
  
  private static long createCacheKey(TypedValue paramTypedValue)
  {
    return assetCookie << 32 | data;
  }
  
  private Drawable createDrawableIfNeeded(@NonNull Context paramContext, @DrawableRes int paramInt)
  {
    if (mTypedValue == null) {
      mTypedValue = new TypedValue();
    }
    TypedValue localTypedValue = mTypedValue;
    paramContext.getResources().getValue(paramInt, localTypedValue, true);
    long l = createCacheKey(localTypedValue);
    Object localObject = getCachedDrawable(paramContext, l);
    if (localObject != null) {
      return (Drawable)localObject;
    }
    localObject = mHooks;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((ResourceManagerHooks)localObject).createDrawableFor(this, paramContext, paramInt);
    }
    if (localObject != null)
    {
      ((Drawable)localObject).setChangingConfigurations(changingConfigurations);
      addDrawableToCache(paramContext, l, (Drawable)localObject);
    }
    return (Drawable)localObject;
  }
  
  private static PorterDuffColorFilter createTintFilter(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int[] paramArrayOfInt)
  {
    if ((paramColorStateList != null) && (paramMode != null)) {
      return getPorterDuffColorFilter(paramColorStateList.getColorForState(paramArrayOfInt, 0), paramMode);
    }
    return null;
  }
  
  public static ResourceManagerInternal get()
  {
    try
    {
      if (INSTANCE == null)
      {
        localResourceManagerInternal = new androidx/appcompat/widget/ResourceManagerInternal;
        localResourceManagerInternal.<init>();
        INSTANCE = localResourceManagerInternal;
        installDefaultInflateDelegates(localResourceManagerInternal);
      }
      ResourceManagerInternal localResourceManagerInternal = INSTANCE;
      return localResourceManagerInternal;
    }
    finally {}
  }
  
  private Drawable getCachedDrawable(@NonNull Context paramContext, long paramLong)
  {
    try
    {
      LongSparseArray localLongSparseArray = (LongSparseArray)mDrawableCaches.get(paramContext);
      if (localLongSparseArray == null) {
        return null;
      }
      Object localObject = (WeakReference)localLongSparseArray.get(paramLong);
      if (localObject != null)
      {
        localObject = (Drawable.ConstantState)((Reference)localObject).get();
        if (localObject != null)
        {
          paramContext = ((Drawable.ConstantState)localObject).newDrawable(paramContext.getResources());
          return paramContext;
        }
        localLongSparseArray.remove(paramLong);
      }
      return null;
    }
    finally {}
  }
  
  public static PorterDuffColorFilter getPorterDuffColorFilter(int paramInt, PorterDuff.Mode paramMode)
  {
    try
    {
      ColorFilterLruCache localColorFilterLruCache = COLOR_FILTER_CACHE;
      PorterDuffColorFilter localPorterDuffColorFilter1 = localColorFilterLruCache.get(paramInt, paramMode);
      PorterDuffColorFilter localPorterDuffColorFilter2 = localPorterDuffColorFilter1;
      if (localPorterDuffColorFilter1 == null)
      {
        localPorterDuffColorFilter2 = new android/graphics/PorterDuffColorFilter;
        localPorterDuffColorFilter2.<init>(paramInt, paramMode);
        localColorFilterLruCache.put(paramInt, paramMode, localPorterDuffColorFilter2);
      }
      return localPorterDuffColorFilter2;
    }
    finally {}
  }
  
  private ColorStateList getTintListFromCache(@NonNull Context paramContext, @DrawableRes int paramInt)
  {
    WeakHashMap localWeakHashMap = mTintLists;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (localWeakHashMap != null)
    {
      paramContext = (SparseArrayCompat)localWeakHashMap.get(paramContext);
      localObject2 = localObject1;
      if (paramContext != null) {
        localObject2 = (ColorStateList)paramContext.get(paramInt);
      }
    }
    return (ColorStateList)localObject2;
  }
  
  private static void installDefaultInflateDelegates(@NonNull ResourceManagerInternal paramResourceManagerInternal) {}
  
  private static boolean isVectorDrawable(@NonNull Drawable paramDrawable)
  {
    boolean bool;
    if ((!(paramDrawable instanceof VectorDrawableCompat)) && (!"android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private Drawable loadDrawableFromDelegates(@NonNull Context paramContext, @DrawableRes int paramInt)
  {
    Object localObject1 = mDelegates;
    if ((localObject1 != null) && (!((SimpleArrayMap)localObject1).isEmpty()))
    {
      localObject1 = mKnownDrawableIdTags;
      if (localObject1 != null)
      {
        localObject1 = (String)((SparseArrayCompat)localObject1).get(paramInt);
        if (("appcompat_skip_skip".equals(localObject1)) || ((localObject1 != null) && (mDelegates.get(localObject1) == null))) {
          return null;
        }
      }
      else
      {
        mKnownDrawableIdTags = new SparseArrayCompat();
      }
      if (mTypedValue == null) {
        mTypedValue = new TypedValue();
      }
      TypedValue localTypedValue = mTypedValue;
      localObject1 = paramContext.getResources();
      ((Resources)localObject1).getValue(paramInt, localTypedValue, true);
      long l = createCacheKey(localTypedValue);
      Drawable localDrawable = getCachedDrawable(paramContext, l);
      if (localDrawable != null) {
        return localDrawable;
      }
      Object localObject2 = string;
      Object localObject3 = localDrawable;
      if (localObject2 != null)
      {
        localObject3 = localDrawable;
        if (((CharSequence)localObject2).toString().endsWith(".xml"))
        {
          localObject3 = localDrawable;
          try
          {
            localObject2 = ((Resources)localObject1).getXml(paramInt);
            localObject3 = localDrawable;
            AttributeSet localAttributeSet = Xml.asAttributeSet((XmlPullParser)localObject2);
            int i;
            do
            {
              localObject3 = localDrawable;
              i = ((XmlPullParser)localObject2).next();
            } while ((i != 2) && (i != 1));
            if (i == 2)
            {
              localObject3 = localDrawable;
              localObject1 = ((XmlPullParser)localObject2).getName();
              localObject3 = localDrawable;
              mKnownDrawableIdTags.append(paramInt, localObject1);
              localObject3 = localDrawable;
              InflateDelegate localInflateDelegate = (InflateDelegate)mDelegates.get(localObject1);
              localObject1 = localDrawable;
              if (localInflateDelegate != null)
              {
                localObject3 = localDrawable;
                localObject1 = localInflateDelegate.createFromXmlInner(paramContext, (XmlPullParser)localObject2, localAttributeSet, paramContext.getTheme());
              }
              localObject3 = localObject1;
              if (localObject1 != null)
              {
                localObject3 = localObject1;
                ((Drawable)localObject1).setChangingConfigurations(changingConfigurations);
                localObject3 = localObject1;
                addDrawableToCache(paramContext, l, (Drawable)localObject1);
                localObject3 = localObject1;
              }
            }
            else
            {
              localObject3 = localDrawable;
              paramContext = new org/xmlpull/v1/XmlPullParserException;
              localObject3 = localDrawable;
              paramContext.<init>("No start tag found");
              localObject3 = localDrawable;
              throw paramContext;
            }
          }
          catch (Exception paramContext)
          {
            Log.e("ResourceManagerInternal", "Exception while inflating drawable", paramContext);
          }
        }
      }
      if (localObject3 == null) {
        mKnownDrawableIdTags.append(paramInt, "appcompat_skip_skip");
      }
      return (Drawable)localObject3;
    }
    return null;
  }
  
  private Drawable tintDrawable(@NonNull Context paramContext, @DrawableRes int paramInt, boolean paramBoolean, @NonNull Drawable paramDrawable)
  {
    Object localObject = getTintList(paramContext, paramInt);
    if (localObject != null)
    {
      paramContext = paramDrawable;
      if (DrawableUtils.canSafelyMutateDrawable(paramDrawable)) {
        paramContext = paramDrawable.mutate();
      }
      paramContext = DrawableCompat.wrap(paramContext);
      DrawableCompat.setTintList(paramContext, (ColorStateList)localObject);
      paramDrawable = getTintMode(paramInt);
      localObject = paramContext;
      if (paramDrawable != null)
      {
        DrawableCompat.setTintMode(paramContext, paramDrawable);
        localObject = paramContext;
      }
    }
    else
    {
      localObject = mHooks;
      if ((localObject != null) && (((ResourceManagerHooks)localObject).tintDrawable(paramContext, paramInt, paramDrawable)))
      {
        localObject = paramDrawable;
      }
      else
      {
        localObject = paramDrawable;
        if (!tintDrawableUsingColorFilter(paramContext, paramInt, paramDrawable))
        {
          localObject = paramDrawable;
          if (paramBoolean) {
            localObject = null;
          }
        }
      }
    }
    return (Drawable)localObject;
  }
  
  public static void tintDrawable(Drawable paramDrawable, TintInfo paramTintInfo, int[] paramArrayOfInt)
  {
    Object localObject = paramDrawable.getState();
    if (DrawableUtils.canSafelyMutateDrawable(paramDrawable))
    {
      int i;
      if (paramDrawable.mutate() == paramDrawable) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0)
      {
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
        return;
      }
    }
    if (((paramDrawable instanceof LayerDrawable)) && (paramDrawable.isStateful()))
    {
      paramDrawable.setState(new int[0]);
      paramDrawable.setState((int[])localObject);
    }
    boolean bool = mHasTintList;
    if ((!bool) && (!mHasTintMode))
    {
      paramDrawable.clearColorFilter();
    }
    else
    {
      if (bool) {
        localObject = mTintList;
      } else {
        localObject = null;
      }
      if (mHasTintMode) {
        paramTintInfo = mTintMode;
      } else {
        paramTintInfo = DEFAULT_MODE;
      }
      paramDrawable.setColorFilter(createTintFilter((ColorStateList)localObject, paramTintInfo, paramArrayOfInt));
    }
  }
  
  public Drawable getDrawable(@NonNull Context paramContext, @DrawableRes int paramInt)
  {
    try
    {
      paramContext = getDrawable(paramContext, paramInt, false);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public Drawable getDrawable(@NonNull Context paramContext, @DrawableRes int paramInt, boolean paramBoolean)
  {
    try
    {
      checkVectorDrawableSetup(paramContext);
      Object localObject1 = loadDrawableFromDelegates(paramContext, paramInt);
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = createDrawableIfNeeded(paramContext, paramInt);
      }
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = ContextCompat.getDrawable(paramContext, paramInt);
      }
      localObject2 = localObject1;
      if (localObject1 != null) {
        localObject2 = tintDrawable(paramContext, paramInt, paramBoolean, (Drawable)localObject1);
      }
      if (localObject2 != null) {
        DrawableUtils.fixDrawable((Drawable)localObject2);
      }
      return (Drawable)localObject2;
    }
    finally {}
  }
  
  public ColorStateList getTintList(@NonNull Context paramContext, @DrawableRes int paramInt)
  {
    try
    {
      Object localObject1 = getTintListFromCache(paramContext, paramInt);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject1 = mHooks;
        if (localObject1 == null) {
          localObject1 = null;
        } else {
          localObject1 = ((ResourceManagerHooks)localObject1).getTintListForDrawableRes(paramContext, paramInt);
        }
        localObject2 = localObject1;
        if (localObject1 != null)
        {
          addTintListToCache(paramContext, paramInt, (ColorStateList)localObject1);
          localObject2 = localObject1;
        }
      }
      return (ColorStateList)localObject2;
    }
    finally {}
  }
  
  public PorterDuff.Mode getTintMode(int paramInt)
  {
    Object localObject = mHooks;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((ResourceManagerHooks)localObject).getTintModeForDrawableRes(paramInt);
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public void onConfigurationChanged(@NonNull Context paramContext)
  {
    try
    {
      paramContext = (LongSparseArray)mDrawableCaches.get(paramContext);
      if (paramContext != null) {
        paramContext.clear();
      }
      return;
    }
    finally {}
  }
  
  public Drawable onDrawableLoadedFromResources(@NonNull Context paramContext, @NonNull VectorEnabledTintResources paramVectorEnabledTintResources, @DrawableRes int paramInt)
  {
    try
    {
      Drawable localDrawable1 = loadDrawableFromDelegates(paramContext, paramInt);
      Drawable localDrawable2 = localDrawable1;
      if (localDrawable1 == null) {
        localDrawable2 = paramVectorEnabledTintResources.getDrawableCanonical(paramInt);
      }
      if (localDrawable2 != null)
      {
        paramContext = tintDrawable(paramContext, paramInt, false, localDrawable2);
        return paramContext;
      }
      return null;
    }
    finally {}
  }
  
  public void setHooks(ResourceManagerHooks paramResourceManagerHooks)
  {
    try
    {
      mHooks = paramResourceManagerHooks;
      return;
    }
    finally
    {
      paramResourceManagerHooks = finally;
      throw paramResourceManagerHooks;
    }
  }
  
  public boolean tintDrawableUsingColorFilter(@NonNull Context paramContext, @DrawableRes int paramInt, @NonNull Drawable paramDrawable)
  {
    ResourceManagerHooks localResourceManagerHooks = mHooks;
    boolean bool;
    if ((localResourceManagerHooks != null) && (localResourceManagerHooks.tintDrawableUsingColorFilter(paramContext, paramInt, paramDrawable))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static class AsldcInflateDelegate
    implements ResourceManagerInternal.InflateDelegate
  {
    public Drawable createFromXmlInner(@NonNull Context paramContext, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
    {
      try
      {
        paramContext = AnimatedStateListDrawableCompat.createFromXmlInner(paramContext, paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", paramContext);
      }
      return null;
    }
  }
  
  public static class AvdcInflateDelegate
    implements ResourceManagerInternal.InflateDelegate
  {
    public Drawable createFromXmlInner(@NonNull Context paramContext, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
    {
      try
      {
        paramContext = AnimatedVectorDrawableCompat.createFromXmlInner(paramContext, paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", paramContext);
      }
      return null;
    }
  }
  
  public static class ColorFilterLruCache
    extends LruCache<Integer, PorterDuffColorFilter>
  {
    public ColorFilterLruCache(int paramInt)
    {
      super();
    }
    
    private static int generateCacheKey(int paramInt, PorterDuff.Mode paramMode)
    {
      return paramMode.hashCode() + (paramInt + 31) * 31;
    }
    
    public PorterDuffColorFilter get(int paramInt, PorterDuff.Mode paramMode)
    {
      return (PorterDuffColorFilter)get(Integer.valueOf(generateCacheKey(paramInt, paramMode)));
    }
    
    public PorterDuffColorFilter put(int paramInt, PorterDuff.Mode paramMode, PorterDuffColorFilter paramPorterDuffColorFilter)
    {
      return (PorterDuffColorFilter)put(Integer.valueOf(generateCacheKey(paramInt, paramMode)), paramPorterDuffColorFilter);
    }
  }
  
  public static class DrawableDelegate
    implements ResourceManagerInternal.InflateDelegate
  {
    public Drawable createFromXmlInner(@NonNull Context paramContext, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
    {
      Object localObject = paramAttributeSet.getClassAttribute();
      if (localObject != null) {
        try
        {
          localObject = (Drawable)DrawableDelegate.class.getClassLoader().loadClass((String)localObject).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
          Compatibility.Api21Impl.inflate((Drawable)localObject, paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
          return (Drawable)localObject;
        }
        catch (Exception paramContext)
        {
          Log.e("DrawableDelegate", "Exception while inflating <drawable>", paramContext);
        }
      }
      return null;
    }
  }
  
  public static abstract interface InflateDelegate
  {
    public abstract Drawable createFromXmlInner(@NonNull Context paramContext, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static abstract interface ResourceManagerHooks
  {
    @Nullable
    public abstract Drawable createDrawableFor(@NonNull ResourceManagerInternal paramResourceManagerInternal, @NonNull Context paramContext, @DrawableRes int paramInt);
    
    @Nullable
    public abstract ColorStateList getTintListForDrawableRes(@NonNull Context paramContext, @DrawableRes int paramInt);
    
    @Nullable
    public abstract PorterDuff.Mode getTintModeForDrawableRes(int paramInt);
    
    public abstract boolean tintDrawable(@NonNull Context paramContext, @DrawableRes int paramInt, @NonNull Drawable paramDrawable);
    
    public abstract boolean tintDrawableUsingColorFilter(@NonNull Context paramContext, @DrawableRes int paramInt, @NonNull Drawable paramDrawable);
  }
  
  public static class VdcInflateDelegate
    implements ResourceManagerInternal.InflateDelegate
  {
    public Drawable createFromXmlInner(@NonNull Context paramContext, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
    {
      try
      {
        paramContext = VectorDrawableCompat.createFromXmlInner(paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        Log.e("VdcInflateDelegate", "Exception while inflating <vector>", paramContext);
      }
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ResourceManagerInternal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
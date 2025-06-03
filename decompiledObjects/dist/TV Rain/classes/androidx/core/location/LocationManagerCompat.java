package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssMeasurementsEvent.Callback;
import android.location.GnssStatus;
import android.location.GnssStatus.Callback;
import android.location.GpsStatus;
import android.location.GpsStatus.Listener;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ExecutorCompat;
import androidx.core.util.Consumer;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import v2;

public final class LocationManagerCompat
{
  private static final long GET_CURRENT_LOCATION_TIMEOUT_MS = 30000L;
  private static final long MAX_CURRENT_LOCATION_AGE_MS = 10000L;
  private static final long PRE_N_LOOPER_TIMEOUT_S = 5L;
  private static Field sContextField;
  private static Method sGnssRequestBuilderBuildMethod;
  private static Class<?> sGnssRequestBuilderClass;
  @GuardedBy("sLocationListeners")
  public static final WeakHashMap<LocationListenerKey, WeakReference<LocationListenerTransport>> sLocationListeners = new WeakHashMap();
  private static Method sRegisterGnssMeasurementsCallbackMethod;
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public static void getCurrentLocation(@NonNull LocationManager paramLocationManager, @NonNull String paramString, @Nullable androidx.core.os.CancellationSignal paramCancellationSignal, @NonNull Executor paramExecutor, @NonNull Consumer<Location> paramConsumer)
  {
    if (Build.VERSION.SDK_INT >= 30)
    {
      Api30Impl.getCurrentLocation(paramLocationManager, paramString, paramCancellationSignal, paramExecutor, paramConsumer);
      return;
    }
    if (paramCancellationSignal != null) {
      paramCancellationSignal.throwIfCanceled();
    }
    Location localLocation = paramLocationManager.getLastKnownLocation(paramString);
    if ((localLocation != null) && (SystemClock.elapsedRealtime() - LocationCompat.getElapsedRealtimeMillis(localLocation) < 10000L))
    {
      paramExecutor.execute(new c(paramConsumer, localLocation, 1));
      return;
    }
    paramExecutor = new CancellableLocationListener(paramLocationManager, paramExecutor, paramConsumer);
    paramLocationManager.requestLocationUpdates(paramString, 0L, 0.0F, paramExecutor, Looper.getMainLooper());
    if (paramCancellationSignal != null) {
      paramCancellationSignal.setOnCancelListener(new a(paramExecutor));
    }
    paramExecutor.startTimeout(30000L);
  }
  
  @Nullable
  public static String getGnssHardwareModelName(@NonNull LocationManager paramLocationManager)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getGnssHardwareModelName(paramLocationManager);
    }
    return null;
  }
  
  public static int getGnssYearOfHardware(@NonNull LocationManager paramLocationManager)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.getGnssYearOfHardware(paramLocationManager);
    }
    return 0;
  }
  
  public static boolean hasProvider(@NonNull LocationManager paramLocationManager, @NonNull String paramString)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return Api31Impl.hasProvider(paramLocationManager, paramString);
    }
    boolean bool1 = paramLocationManager.getAllProviders().contains(paramString);
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    try
    {
      paramLocationManager = paramLocationManager.getProvider(paramString);
      if (paramLocationManager == null) {
        bool2 = false;
      }
      return bool2;
    }
    catch (SecurityException paramLocationManager) {}
    return false;
  }
  
  public static boolean isLocationEnabled(@NonNull LocationManager paramLocationManager)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.isLocationEnabled(paramLocationManager);
    }
    boolean bool;
    if ((!paramLocationManager.isProviderEnabled("network")) && (!paramLocationManager.isProviderEnabled("gps"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  @RequiresApi(24)
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public static boolean registerGnssMeasurementsCallback(@NonNull LocationManager paramLocationManager, @NonNull GnssMeasurementsEvent.Callback paramCallback, @NonNull Handler paramHandler)
  {
    if (Build.VERSION.SDK_INT != 30) {
      return Api24Impl.registerGnssMeasurementsCallback(paramLocationManager, paramCallback, paramHandler);
    }
    return registerGnssMeasurementsCallbackOnR(paramLocationManager, ExecutorCompat.create(paramHandler), paramCallback);
  }
  
  @RequiresApi(30)
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public static boolean registerGnssMeasurementsCallback(@NonNull LocationManager paramLocationManager, @NonNull Executor paramExecutor, @NonNull GnssMeasurementsEvent.Callback paramCallback)
  {
    if (Build.VERSION.SDK_INT > 30) {
      return Api31Impl.registerGnssMeasurementsCallback(paramLocationManager, paramExecutor, paramCallback);
    }
    return registerGnssMeasurementsCallbackOnR(paramLocationManager, paramExecutor, paramCallback);
  }
  
  @RequiresApi(30)
  private static boolean registerGnssMeasurementsCallbackOnR(@NonNull LocationManager paramLocationManager, @NonNull Executor paramExecutor, @NonNull GnssMeasurementsEvent.Callback paramCallback)
  {
    if (Build.VERSION.SDK_INT == 30) {
      bool1 = false;
    }
    try
    {
      if (sGnssRequestBuilderClass == null) {
        sGnssRequestBuilderClass = Class.forName("android.location.GnssRequest$Builder");
      }
      Method localMethod;
      if (sGnssRequestBuilderBuildMethod == null)
      {
        localMethod = sGnssRequestBuilderClass.getDeclaredMethod("build", new Class[0]);
        sGnssRequestBuilderBuildMethod = localMethod;
        localMethod.setAccessible(true);
      }
      if (sRegisterGnssMeasurementsCallbackMethod == null)
      {
        localMethod = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", new Class[] { Class.forName("android.location.GnssRequest"), Executor.class, GnssMeasurementsEvent.Callback.class });
        sRegisterGnssMeasurementsCallbackMethod = localMethod;
        localMethod.setAccessible(true);
      }
      paramLocationManager = sRegisterGnssMeasurementsCallbackMethod.invoke(paramLocationManager, new Object[] { sGnssRequestBuilderBuildMethod.invoke(sGnssRequestBuilderClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]), paramExecutor, paramCallback });
      bool2 = bool1;
      if (paramLocationManager != null)
      {
        boolean bool3 = ((Boolean)paramLocationManager).booleanValue();
        bool2 = bool1;
        if (bool3) {
          bool2 = true;
        }
      }
    }
    catch (ClassNotFoundException|InvocationTargetException|NoSuchMethodException|IllegalAccessException|InstantiationException paramLocationManager)
    {
      for (;;)
      {
        boolean bool2 = bool1;
      }
    }
    return bool2;
    throw new IllegalStateException();
  }
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  private static boolean registerGnssStatusCallback(LocationManager paramLocationManager, Handler paramHandler, Executor paramExecutor, GnssStatusCompat.Callback paramCallback)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return Api30Impl.registerGnssStatusCallback(paramLocationManager, paramHandler, paramExecutor, paramCallback);
    }
    return Api24Impl.registerGnssStatusCallback(paramLocationManager, paramHandler, paramExecutor, paramCallback);
  }
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public static boolean registerGnssStatusCallback(@NonNull LocationManager paramLocationManager, @NonNull GnssStatusCompat.Callback paramCallback, @NonNull Handler paramHandler)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return registerGnssStatusCallback(paramLocationManager, ExecutorCompat.create(paramHandler), paramCallback);
    }
    return registerGnssStatusCallback(paramLocationManager, new InlineHandlerExecutor(paramHandler), paramCallback);
  }
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public static boolean registerGnssStatusCallback(@NonNull LocationManager paramLocationManager, @NonNull Executor paramExecutor, @NonNull GnssStatusCompat.Callback paramCallback)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return registerGnssStatusCallback(paramLocationManager, null, paramExecutor, paramCallback);
    }
    Looper localLooper1 = Looper.myLooper();
    Looper localLooper2 = localLooper1;
    if (localLooper1 == null) {
      localLooper2 = Looper.getMainLooper();
    }
    return registerGnssStatusCallback(paramLocationManager, new Handler(localLooper2), paramExecutor, paramCallback);
  }
  
  @GuardedBy("sLocationListeners")
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public static void registerLocationListenerTransport(LocationManager paramLocationManager, LocationListenerTransport paramLocationListenerTransport)
  {
    paramLocationListenerTransport = (WeakReference)sLocationListeners.put(paramLocationListenerTransport.getKey(), new WeakReference(paramLocationListenerTransport));
    if (paramLocationListenerTransport != null) {
      paramLocationListenerTransport = (LocationListenerTransport)paramLocationListenerTransport.get();
    } else {
      paramLocationListenerTransport = null;
    }
    if (paramLocationListenerTransport != null)
    {
      paramLocationListenerTransport.unregister();
      paramLocationManager.removeUpdates(paramLocationListenerTransport);
    }
  }
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public static void removeUpdates(@NonNull LocationManager paramLocationManager, @NonNull LocationListenerCompat paramLocationListenerCompat)
  {
    WeakHashMap localWeakHashMap = sLocationListeners;
    Object localObject1 = null;
    try
    {
      Iterator localIterator = localWeakHashMap.values().iterator();
      Object localObject2;
      while (localIterator.hasNext())
      {
        LocationListenerTransport localLocationListenerTransport = (LocationListenerTransport)((WeakReference)localIterator.next()).get();
        if (localLocationListenerTransport != null)
        {
          LocationListenerKey localLocationListenerKey = localLocationListenerTransport.getKey();
          if (mListener == paramLocationListenerCompat)
          {
            localObject2 = localObject1;
            if (localObject1 == null)
            {
              localObject2 = new java/util/ArrayList;
              ((ArrayList)localObject2).<init>();
            }
            ((ArrayList)localObject2).add(localLocationListenerKey);
            localLocationListenerTransport.unregister();
            paramLocationManager.removeUpdates(localLocationListenerTransport);
            localObject1 = localObject2;
          }
        }
      }
      if (localObject1 != null)
      {
        localObject2 = ((ArrayList)localObject1).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (LocationListenerKey)((Iterator)localObject2).next();
          sLocationListeners.remove(localObject1);
        }
      }
      paramLocationManager.removeUpdates(paramLocationListenerCompat);
      return;
    }
    finally {}
  }
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public static void requestLocationUpdates(@NonNull LocationManager paramLocationManager, @NonNull String paramString, @NonNull LocationRequestCompat paramLocationRequestCompat, @NonNull LocationListenerCompat paramLocationListenerCompat, @NonNull Looper paramLooper)
  {
    if (Build.VERSION.SDK_INT >= 31)
    {
      Api31Impl.requestLocationUpdates(paramLocationManager, paramString, paramLocationRequestCompat.toLocationRequest(), ExecutorCompat.create(new Handler(paramLooper)), paramLocationListenerCompat);
      return;
    }
    if (Api19Impl.tryRequestLocationUpdates(paramLocationManager, paramString, paramLocationRequestCompat, paramLocationListenerCompat, paramLooper)) {
      return;
    }
    paramLocationManager.requestLocationUpdates(paramString, paramLocationRequestCompat.getIntervalMillis(), paramLocationRequestCompat.getMinUpdateDistanceMeters(), paramLocationListenerCompat, paramLooper);
  }
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public static void requestLocationUpdates(@NonNull LocationManager paramLocationManager, @NonNull String paramString, @NonNull LocationRequestCompat paramLocationRequestCompat, @NonNull Executor arg3, @NonNull LocationListenerCompat paramLocationListenerCompat)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 31)
    {
      Api31Impl.requestLocationUpdates(paramLocationManager, paramString, paramLocationRequestCompat.toLocationRequest(), ???, paramLocationListenerCompat);
      return;
    }
    if ((i >= 30) && (Api30Impl.tryRequestLocationUpdates(paramLocationManager, paramString, paramLocationRequestCompat, ???, paramLocationListenerCompat))) {
      return;
    }
    paramLocationListenerCompat = new LocationListenerTransport(new LocationListenerKey(paramString, paramLocationListenerCompat), ???);
    if (Api19Impl.tryRequestLocationUpdates(paramLocationManager, paramString, paramLocationRequestCompat, paramLocationListenerCompat)) {
      return;
    }
    synchronized (sLocationListeners)
    {
      paramLocationManager.requestLocationUpdates(paramString, paramLocationRequestCompat.getIntervalMillis(), paramLocationRequestCompat.getMinUpdateDistanceMeters(), paramLocationListenerCompat, Looper.getMainLooper());
      registerLocationListenerTransport(paramLocationManager, paramLocationListenerCompat);
      return;
    }
  }
  
  @RequiresApi(24)
  public static void unregisterGnssMeasurementsCallback(@NonNull LocationManager paramLocationManager, @NonNull GnssMeasurementsEvent.Callback paramCallback)
  {
    Api24Impl.unregisterGnssMeasurementsCallback(paramLocationManager, paramCallback);
  }
  
  public static void unregisterGnssStatusCallback(@NonNull LocationManager paramLocationManager, @NonNull GnssStatusCompat.Callback paramCallback)
  {
    synchronized (GnssListenersHolder.sGnssStatusListeners)
    {
      paramCallback = ???.remove(paramCallback);
      if (paramCallback != null) {
        Api24Impl.unregisterGnssStatusCallback(paramLocationManager, paramCallback);
      }
      return;
    }
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    private static Class<?> sLocationRequestClass;
    private static Method sRequestLocationUpdatesLooperMethod;
    
    @DoNotInline
    public static boolean tryRequestLocationUpdates(LocationManager paramLocationManager, String paramString, LocationRequestCompat paramLocationRequestCompat, LocationListenerCompat paramLocationListenerCompat, Looper paramLooper)
    {
      try
      {
        if (sLocationRequestClass == null) {
          sLocationRequestClass = Class.forName("android.location.LocationRequest");
        }
        if (sRequestLocationUpdatesLooperMethod == null)
        {
          Method localMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[] { sLocationRequestClass, LocationListener.class, Looper.class });
          sRequestLocationUpdatesLooperMethod = localMethod;
          localMethod.setAccessible(true);
        }
        paramString = paramLocationRequestCompat.toLocationRequest(paramString);
        if (paramString != null)
        {
          sRequestLocationUpdatesLooperMethod.invoke(paramLocationManager, new Object[] { paramString, paramLocationListenerCompat, paramLooper });
          return true;
        }
      }
      catch (NoSuchMethodException|InvocationTargetException|IllegalAccessException|ClassNotFoundException|UnsupportedOperationException paramLocationManager)
      {
        for (;;) {}
      }
      return false;
    }
    
    @DoNotInline
    @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static boolean tryRequestLocationUpdates(LocationManager paramLocationManager, String arg1, LocationRequestCompat paramLocationRequestCompat, LocationManagerCompat.LocationListenerTransport paramLocationListenerTransport)
    {
      try
      {
        if (sLocationRequestClass == null) {
          sLocationRequestClass = Class.forName("android.location.LocationRequest");
        }
        if (sRequestLocationUpdatesLooperMethod == null)
        {
          Method localMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[] { sLocationRequestClass, LocationListener.class, Looper.class });
          sRequestLocationUpdatesLooperMethod = localMethod;
          localMethod.setAccessible(true);
        }
        paramLocationRequestCompat = paramLocationRequestCompat.toLocationRequest(???);
        if (paramLocationRequestCompat != null) {
          synchronized (LocationManagerCompat.sLocationListeners)
          {
            sRequestLocationUpdatesLooperMethod.invoke(paramLocationManager, new Object[] { paramLocationRequestCompat, paramLocationListenerTransport, Looper.getMainLooper() });
            LocationManagerCompat.registerLocationListenerTransport(paramLocationManager, paramLocationListenerTransport);
            return true;
          }
        }
      }
      catch (NoSuchMethodException|InvocationTargetException|IllegalAccessException|ClassNotFoundException|UnsupportedOperationException paramLocationManager)
      {
        for (;;) {}
      }
      return false;
    }
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssMeasurementsCallback(@NonNull LocationManager paramLocationManager, @NonNull GnssMeasurementsEvent.Callback paramCallback, @NonNull Handler paramHandler)
    {
      return paramLocationManager.registerGnssMeasurementsCallback(paramCallback, paramHandler);
    }
    
    @DoNotInline
    @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static boolean registerGnssStatusCallback(LocationManager paramLocationManager, Handler paramHandler, Executor paramExecutor, GnssStatusCompat.Callback paramCallback)
    {
      boolean bool;
      if (paramHandler != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool);
      synchronized (LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners)
      {
        LocationManagerCompat.PreRGnssStatusTransport localPreRGnssStatusTransport = (LocationManagerCompat.PreRGnssStatusTransport)???.get(paramCallback);
        if (localPreRGnssStatusTransport == null)
        {
          localPreRGnssStatusTransport = new androidx/core/location/LocationManagerCompat$PreRGnssStatusTransport;
          localPreRGnssStatusTransport.<init>(paramCallback);
        }
        else
        {
          localPreRGnssStatusTransport.unregister();
        }
        localPreRGnssStatusTransport.register(paramExecutor);
        if (paramLocationManager.registerGnssStatusCallback(localPreRGnssStatusTransport, paramHandler))
        {
          ???.put(paramCallback, localPreRGnssStatusTransport);
          return true;
        }
        return false;
      }
    }
    
    @DoNotInline
    public static void unregisterGnssMeasurementsCallback(@NonNull LocationManager paramLocationManager, @NonNull GnssMeasurementsEvent.Callback paramCallback)
    {
      paramLocationManager.unregisterGnssMeasurementsCallback(paramCallback);
    }
    
    @DoNotInline
    public static void unregisterGnssStatusCallback(LocationManager paramLocationManager, Object paramObject)
    {
      if ((paramObject instanceof LocationManagerCompat.PreRGnssStatusTransport)) {
        ((LocationManagerCompat.PreRGnssStatusTransport)paramObject).unregister();
      }
      paramLocationManager.unregisterGnssStatusCallback((GnssStatus.Callback)paramObject);
    }
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static String getGnssHardwareModelName(LocationManager paramLocationManager)
    {
      return c.m(paramLocationManager);
    }
    
    @DoNotInline
    public static int getGnssYearOfHardware(LocationManager paramLocationManager)
    {
      return c.b(paramLocationManager);
    }
    
    @DoNotInline
    public static boolean isLocationEnabled(LocationManager paramLocationManager)
    {
      return c.t(paramLocationManager);
    }
  }
  
  @RequiresApi(30)
  public static class Api30Impl
  {
    private static Class<?> sLocationRequestClass;
    private static Method sRequestLocationUpdatesExecutorMethod;
    
    @DoNotInline
    @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void getCurrentLocation(LocationManager paramLocationManager, @NonNull String paramString, @Nullable androidx.core.os.CancellationSignal paramCancellationSignal, @NonNull Executor paramExecutor, @NonNull Consumer<Location> paramConsumer)
    {
      if (paramCancellationSignal != null) {
        paramCancellationSignal = (android.os.CancellationSignal)paramCancellationSignal.getCancellationSignalObject();
      } else {
        paramCancellationSignal = null;
      }
      Objects.requireNonNull(paramConsumer);
      d.s(paramLocationManager, paramString, paramCancellationSignal, paramExecutor, new v2(paramConsumer));
    }
    
    @DoNotInline
    @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static boolean registerGnssStatusCallback(LocationManager paramLocationManager, Handler paramHandler, Executor paramExecutor, GnssStatusCompat.Callback paramCallback)
    {
      synchronized (LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners)
      {
        LocationManagerCompat.GnssStatusTransport localGnssStatusTransport = (LocationManagerCompat.GnssStatusTransport)???.get(paramCallback);
        paramHandler = localGnssStatusTransport;
        if (localGnssStatusTransport == null)
        {
          paramHandler = new androidx/core/location/LocationManagerCompat$GnssStatusTransport;
          paramHandler.<init>(paramCallback);
        }
        if (d.B(paramLocationManager, paramExecutor, paramHandler))
        {
          ???.put(paramCallback, paramHandler);
          return true;
        }
        return false;
      }
    }
    
    @DoNotInline
    public static boolean tryRequestLocationUpdates(LocationManager paramLocationManager, String paramString, LocationRequestCompat paramLocationRequestCompat, Executor paramExecutor, LocationListenerCompat paramLocationListenerCompat)
    {
      if (Build.VERSION.SDK_INT >= 30) {}
      try
      {
        if (sLocationRequestClass == null) {
          sLocationRequestClass = Class.forName("android.location.LocationRequest");
        }
        if (sRequestLocationUpdatesExecutorMethod == null)
        {
          Method localMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[] { sLocationRequestClass, Executor.class, LocationListener.class });
          sRequestLocationUpdatesExecutorMethod = localMethod;
          localMethod.setAccessible(true);
        }
        paramString = paramLocationRequestCompat.toLocationRequest(paramString);
        if (paramString != null)
        {
          sRequestLocationUpdatesExecutorMethod.invoke(paramLocationManager, new Object[] { paramString, paramExecutor, paramLocationListenerCompat });
          return true;
        }
      }
      catch (NoSuchMethodException|InvocationTargetException|IllegalAccessException|ClassNotFoundException|UnsupportedOperationException paramLocationManager)
      {
        for (;;) {}
      }
      return false;
    }
  }
  
  @RequiresApi(31)
  public static class Api31Impl
  {
    @DoNotInline
    public static boolean hasProvider(LocationManager paramLocationManager, @NonNull String paramString)
    {
      return g.r(paramLocationManager, paramString);
    }
    
    @DoNotInline
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssMeasurementsCallback(@NonNull LocationManager paramLocationManager, @NonNull Executor paramExecutor, @NonNull GnssMeasurementsEvent.Callback paramCallback)
    {
      return d.A(paramLocationManager, paramExecutor, paramCallback);
    }
    
    @DoNotInline
    @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(LocationManager paramLocationManager, @NonNull String paramString, @NonNull LocationRequest paramLocationRequest, @NonNull Executor paramExecutor, @NonNull LocationListener paramLocationListener)
    {
      g.m(paramLocationManager, paramString, paramLocationRequest, paramExecutor, paramLocationListener);
    }
  }
  
  public static final class CancellableLocationListener
    implements LocationListener
  {
    private Consumer<Location> mConsumer;
    private final Executor mExecutor;
    private final LocationManager mLocationManager;
    private final Handler mTimeoutHandler;
    @Nullable
    public Runnable mTimeoutRunnable;
    @GuardedBy("this")
    private boolean mTriggered;
    
    public CancellableLocationListener(LocationManager paramLocationManager, Executor paramExecutor, Consumer<Location> paramConsumer)
    {
      mLocationManager = paramLocationManager;
      mExecutor = paramExecutor;
      mTimeoutHandler = new Handler(Looper.getMainLooper());
      mConsumer = paramConsumer;
    }
    
    @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    private void cleanup()
    {
      mConsumer = null;
      mLocationManager.removeUpdates(this);
      Runnable localRunnable = mTimeoutRunnable;
      if (localRunnable != null)
      {
        mTimeoutHandler.removeCallbacks(localRunnable);
        mTimeoutRunnable = null;
      }
    }
    
    @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void cancel()
    {
      try
      {
        if (mTriggered) {
          return;
        }
        mTriggered = true;
        cleanup();
        return;
      }
      finally {}
    }
    
    @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void onLocationChanged(@Nullable Location paramLocation)
    {
      try
      {
        if (mTriggered) {
          return;
        }
        mTriggered = true;
        Consumer localConsumer = mConsumer;
        mExecutor.execute(new c(localConsumer, paramLocation, 0));
        cleanup();
        return;
      }
      finally {}
    }
    
    @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public void onProviderDisabled(@NonNull String paramString)
    {
      onLocationChanged(null);
    }
    
    public void onProviderEnabled(@NonNull String paramString) {}
    
    public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle) {}
    
    @SuppressLint({"MissingPermission"})
    public void startTimeout(long paramLong)
    {
      try
      {
        if (mTriggered) {
          return;
        }
        b localb = new androidx/core/location/b;
        localb.<init>(this);
        mTimeoutRunnable = localb;
        mTimeoutHandler.postDelayed(localb, paramLong);
        return;
      }
      finally {}
    }
  }
  
  public static class GnssListenersHolder
  {
    @GuardedBy("sGnssStatusListeners")
    public static final SimpleArrayMap<Object, Object> sGnssStatusListeners = new SimpleArrayMap();
  }
  
  @RequiresApi(30)
  public static class GnssStatusTransport
    extends GnssStatus.Callback
  {
    public final GnssStatusCompat.Callback mCallback;
    
    public GnssStatusTransport(GnssStatusCompat.Callback paramCallback)
    {
      boolean bool;
      if (paramCallback != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "invalid null callback");
      mCallback = paramCallback;
    }
    
    public void onFirstFix(int paramInt)
    {
      mCallback.onFirstFix(paramInt);
    }
    
    public void onSatelliteStatusChanged(GnssStatus paramGnssStatus)
    {
      mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(paramGnssStatus));
    }
    
    public void onStarted()
    {
      mCallback.onStarted();
    }
    
    public void onStopped()
    {
      mCallback.onStopped();
    }
  }
  
  public static class GpsStatusTransport
    implements GpsStatus.Listener
  {
    public final GnssStatusCompat.Callback mCallback;
    @Nullable
    public volatile Executor mExecutor;
    private final LocationManager mLocationManager;
    
    public GpsStatusTransport(LocationManager paramLocationManager, GnssStatusCompat.Callback paramCallback)
    {
      boolean bool;
      if (paramCallback != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "invalid null callback");
      mLocationManager = paramLocationManager;
      mCallback = paramCallback;
    }
    
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public void onGpsStatusChanged(int paramInt)
    {
      Executor localExecutor = mExecutor;
      if (localExecutor == null) {
        return;
      }
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          GpsStatus localGpsStatus;
          if (paramInt != 3)
          {
            if (paramInt == 4)
            {
              localGpsStatus = mLocationManager.getGpsStatus(null);
              if (localGpsStatus != null) {
                localExecutor.execute(new f(this, localExecutor, GnssStatusCompat.wrap(localGpsStatus), 0));
              }
            }
          }
          else
          {
            localGpsStatus = mLocationManager.getGpsStatus(null);
            if (localGpsStatus != null) {
              localExecutor.execute(new e(this, localExecutor, localGpsStatus.getTimeToFirstFix(), 0));
            }
          }
        }
        else
        {
          localExecutor.execute(new d(this, localExecutor, 1));
        }
      }
      else {
        localExecutor.execute(new d(this, localExecutor, 0));
      }
    }
    
    public void register(Executor paramExecutor)
    {
      boolean bool;
      if (mExecutor == null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool);
      mExecutor = paramExecutor;
    }
    
    public void unregister()
    {
      mExecutor = null;
    }
  }
  
  public static final class InlineHandlerExecutor
    implements Executor
  {
    private final Handler mHandler;
    
    public InlineHandlerExecutor(@NonNull Handler paramHandler)
    {
      mHandler = ((Handler)Preconditions.checkNotNull(paramHandler));
    }
    
    public void execute(@NonNull Runnable paramRunnable)
    {
      if (Looper.myLooper() == mHandler.getLooper()) {
        paramRunnable.run();
      } else {
        if (!mHandler.post((Runnable)Preconditions.checkNotNull(paramRunnable))) {
          break label40;
        }
      }
      return;
      label40:
      paramRunnable = new StringBuilder();
      paramRunnable.append(mHandler);
      paramRunnable.append(" is shutting down");
      throw new RejectedExecutionException(paramRunnable.toString());
    }
  }
  
  public static class LocationListenerKey
  {
    public final LocationListenerCompat mListener;
    public final String mProvider;
    
    public LocationListenerKey(String paramString, LocationListenerCompat paramLocationListenerCompat)
    {
      mProvider = ((String)ObjectsCompat.requireNonNull(paramString, "invalid null provider"));
      mListener = ((LocationListenerCompat)ObjectsCompat.requireNonNull(paramLocationListenerCompat, "invalid null listener"));
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof LocationListenerKey;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (LocationListenerKey)paramObject;
      bool1 = bool2;
      if (mProvider.equals(mProvider))
      {
        bool1 = bool2;
        if (mListener.equals(mListener)) {
          bool1 = true;
        }
      }
      return bool1;
    }
    
    public int hashCode()
    {
      return ObjectsCompat.hash(new Object[] { mProvider, mListener });
    }
  }
  
  public static class LocationListenerTransport
    implements LocationListener
  {
    public final Executor mExecutor;
    @Nullable
    public volatile LocationManagerCompat.LocationListenerKey mKey;
    
    public LocationListenerTransport(@Nullable LocationManagerCompat.LocationListenerKey paramLocationListenerKey, Executor paramExecutor)
    {
      mKey = paramLocationListenerKey;
      mExecutor = paramExecutor;
    }
    
    public LocationManagerCompat.LocationListenerKey getKey()
    {
      return (LocationManagerCompat.LocationListenerKey)ObjectsCompat.requireNonNull(mKey);
    }
    
    public void onFlushComplete(int paramInt)
    {
      if (mKey == null) {
        return;
      }
      mExecutor.execute(new h(this, paramInt));
    }
    
    public void onLocationChanged(@NonNull Location paramLocation)
    {
      if (mKey == null) {
        return;
      }
      mExecutor.execute(new i(this, paramLocation, 1));
    }
    
    public void onLocationChanged(@NonNull List<Location> paramList)
    {
      if (mKey == null) {
        return;
      }
      mExecutor.execute(new i(this, paramList, 0));
    }
    
    public void onProviderDisabled(@NonNull String paramString)
    {
      if (mKey == null) {
        return;
      }
      mExecutor.execute(new g(this, paramString, 1));
    }
    
    public void onProviderEnabled(@NonNull String paramString)
    {
      if (mKey == null) {
        return;
      }
      mExecutor.execute(new g(this, paramString, 0));
    }
    
    public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
    {
      if (mKey == null) {
        return;
      }
      mExecutor.execute(new j(this, paramString, paramInt, paramBundle));
    }
    
    public void unregister()
    {
      mKey = null;
    }
  }
  
  @RequiresApi(24)
  public static class PreRGnssStatusTransport
    extends GnssStatus.Callback
  {
    public final GnssStatusCompat.Callback mCallback;
    @Nullable
    public volatile Executor mExecutor;
    
    public PreRGnssStatusTransport(GnssStatusCompat.Callback paramCallback)
    {
      boolean bool;
      if (paramCallback != null) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "invalid null callback");
      mCallback = paramCallback;
    }
    
    public void onFirstFix(int paramInt)
    {
      Executor localExecutor = mExecutor;
      if (localExecutor == null) {
        return;
      }
      localExecutor.execute(new e(this, localExecutor, paramInt, 1));
    }
    
    public void onSatelliteStatusChanged(GnssStatus paramGnssStatus)
    {
      Executor localExecutor = mExecutor;
      if (localExecutor == null) {
        return;
      }
      localExecutor.execute(new f(this, localExecutor, paramGnssStatus, 1));
    }
    
    public void onStarted()
    {
      Executor localExecutor = mExecutor;
      if (localExecutor == null) {
        return;
      }
      localExecutor.execute(new k(this, localExecutor, 0));
    }
    
    public void onStopped()
    {
      Executor localExecutor = mExecutor;
      if (localExecutor == null) {
        return;
      }
      localExecutor.execute(new k(this, localExecutor, 1));
    }
    
    public void register(Executor paramExecutor)
    {
      boolean bool1 = true;
      boolean bool2;
      if (paramExecutor != null) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      Preconditions.checkArgument(bool2, "invalid null executor");
      if (mExecutor == null) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      Preconditions.checkState(bool2);
      mExecutor = paramExecutor;
    }
    
    public void unregister()
    {
      mExecutor = null;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationManagerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
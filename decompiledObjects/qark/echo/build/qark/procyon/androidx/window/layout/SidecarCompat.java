// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import android.util.Log;
import java.util.Iterator;
import java.util.Collection;
import android.view.View;
import java.lang.ref.WeakReference;
import V5.t;
import java.util.concurrent.locks.ReentrantLock;
import java.util.WeakHashMap;
import android.text.TextUtils;
import androidx.window.core.Version;
import android.view.WindowManager$LayoutParams;
import android.view.Window;
import android.annotation.SuppressLint;
import androidx.window.sidecar.SidecarInterface$SidecarCallback;
import android.view.View$OnAttachStateChangeListener;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import androidx.window.sidecar.SidecarDeviceState;
import java.util.List;
import W5.m;
import java.util.LinkedHashMap;
import androidx.window.sidecar.SidecarProvider;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import kotlin.jvm.internal.g;
import android.os.IBinder;
import androidx.window.sidecar.SidecarInterface;
import android.content.ComponentCallbacks;
import android.app.Activity;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class SidecarCompat implements ExtensionInterfaceCompat
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private static final String TAG = "SidecarCompat";
    @NotNull
    private final Map<Activity, ComponentCallbacks> componentCallbackMap;
    private ExtensionCallbackInterface extensionCallback;
    private final SidecarInterface sidecar;
    @NotNull
    private final SidecarAdapter sidecarAdapter;
    @NotNull
    private final Map<IBinder, Activity> windowListenerRegisteredContexts;
    
    static {
        Companion = new Companion(null);
    }
    
    public SidecarCompat(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(SidecarProvider.getSidecarImpl(context.getApplicationContext()), new SidecarAdapter());
    }
    
    public SidecarCompat(final SidecarInterface sidecar, @NotNull final SidecarAdapter sidecarAdapter) {
        Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
        this.sidecar = sidecar;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new LinkedHashMap<IBinder, Activity>();
        this.componentCallbackMap = new LinkedHashMap<Activity, ComponentCallbacks>();
    }
    
    public static final /* synthetic */ ExtensionCallbackInterface access$getExtensionCallback$p(final SidecarCompat sidecarCompat) {
        return sidecarCompat.extensionCallback;
    }
    
    public static final /* synthetic */ SidecarAdapter access$getSidecarAdapter$p(final SidecarCompat sidecarCompat) {
        return sidecarCompat.sidecarAdapter;
    }
    
    public static final /* synthetic */ Map access$getWindowListenerRegisteredContexts$p(final SidecarCompat sidecarCompat) {
        return sidecarCompat.windowListenerRegisteredContexts;
    }
    
    private final void registerConfigurationChangeListener(final Activity activity) {
        if (this.componentCallbackMap.get(activity) == null) {
            final SidecarCompat$registerConfigurationChangeListener$configChangeObserver.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1 sidecarCompat$registerConfigurationChangeListener$configChangeObserver$1 = new SidecarCompat$registerConfigurationChangeListener$configChangeObserver.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1(this, activity);
            this.componentCallbackMap.put(activity, (ComponentCallbacks)sidecarCompat$registerConfigurationChangeListener$configChangeObserver$1);
            activity.registerComponentCallbacks((ComponentCallbacks)sidecarCompat$registerConfigurationChangeListener$configChangeObserver$1);
        }
    }
    
    private final void unregisterComponentCallback(final Activity activity) {
        activity.unregisterComponentCallbacks((ComponentCallbacks)this.componentCallbackMap.get(activity));
        this.componentCallbackMap.remove(activity);
    }
    
    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }
    
    @NotNull
    public final WindowLayoutInfo getWindowLayoutInfo(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return new WindowLayoutInfo(m.f());
        }
        final SidecarInterface sidecar = this.sidecar;
        SidecarDeviceState deviceState = null;
        SidecarWindowLayoutInfo windowLayoutInfo;
        if (sidecar == null) {
            windowLayoutInfo = null;
        }
        else {
            windowLayoutInfo = sidecar.getWindowLayoutInfo(activityWindowToken$window_release);
        }
        final SidecarAdapter sidecarAdapter = this.sidecarAdapter;
        final SidecarInterface sidecar2 = this.sidecar;
        if (sidecar2 != null) {
            deviceState = sidecar2.getDeviceState();
        }
        SidecarDeviceState sidecarDeviceState = deviceState;
        if (deviceState == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return sidecarAdapter.translate(windowLayoutInfo, sidecarDeviceState);
    }
    
    @Override
    public void onWindowLayoutChangeListenerAdded(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            this.register(activityWindowToken$window_release, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new FirstAttachAdapter(this, activity));
    }
    
    @Override
    public void onWindowLayoutChangeListenerRemoved(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return;
        }
        final SidecarInterface sidecar = this.sidecar;
        if (sidecar != null) {
            sidecar.onWindowLayoutChangeListenerRemoved(activityWindowToken$window_release);
        }
        this.unregisterComponentCallback(activity);
        final boolean b = this.windowListenerRegisteredContexts.size() == 1;
        this.windowListenerRegisteredContexts.remove(activityWindowToken$window_release);
        if (b) {
            final SidecarInterface sidecar2 = this.sidecar;
            if (sidecar2 == null) {
                return;
            }
            sidecar2.onDeviceStateListenersChanged(true);
        }
    }
    
    public final void register(@NotNull final IBinder binder, @NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(binder, "windowToken");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.windowListenerRegisteredContexts.put(binder, activity);
        final SidecarInterface sidecar = this.sidecar;
        if (sidecar != null) {
            sidecar.onWindowLayoutChangeListenerAdded(binder);
        }
        if (this.windowListenerRegisteredContexts.size() == 1) {
            final SidecarInterface sidecar2 = this.sidecar;
            if (sidecar2 != null) {
                sidecar2.onDeviceStateListenersChanged(false);
            }
        }
        final ExtensionCallbackInterface extensionCallback = this.extensionCallback;
        if (extensionCallback != null) {
            extensionCallback.onWindowLayoutChanged(activity, this.getWindowLayoutInfo(activity));
        }
        this.registerConfigurationChangeListener(activity);
    }
    
    @Override
    public void setExtensionCallback(@NotNull final ExtensionCallbackInterface extensionCallbackInterface) {
        Intrinsics.checkNotNullParameter(extensionCallbackInterface, "extensionCallback");
        this.extensionCallback = new DistinctElementCallback(extensionCallbackInterface);
        final SidecarInterface sidecar = this.sidecar;
        if (sidecar == null) {
            return;
        }
        sidecar.setSidecarCallback((SidecarInterface$SidecarCallback)new DistinctSidecarElementCallback(this.sidecarAdapter, (SidecarInterface$SidecarCallback)new TranslatingCallback()));
    }
    
    @SuppressLint({ "BanUncheckedReflection" })
    @Override
    public boolean validateExtensionInterface() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        androidx/window/layout/SidecarCompat.sidecar:Landroidx/window/sidecar/SidecarInterface;
        //     4: astore_1       
        //     5: aconst_null    
        //     6: astore_2       
        //     7: aload_1        
        //     8: ifnonnull       14
        //    11: goto            619
        //    14: aload_1        
        //    15: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    18: astore_1       
        //    19: aload_1        
        //    20: ifnonnull       26
        //    23: goto            619
        //    26: aload_1        
        //    27: ldc             "setSidecarCallback"
        //    29: iconst_1       
        //    30: anewarray       Ljava/lang/Class;
        //    33: dup            
        //    34: iconst_0       
        //    35: ldc             Landroidx/window/sidecar/SidecarInterface$SidecarCallback;.class
        //    37: aastore        
        //    38: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    41: astore_1       
        //    42: goto            621
        //    45: aload_1        
        //    46: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //    49: astore_1       
        //    50: getstatic       java/lang/Void.TYPE:Ljava/lang/Class;
        //    53: astore_3       
        //    54: aload_1        
        //    55: aload_3        
        //    56: invokestatic    kotlin/jvm/internal/Intrinsics.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    59: ifeq            590
        //    62: aload_0        
        //    63: getfield        androidx/window/layout/SidecarCompat.sidecar:Landroidx/window/sidecar/SidecarInterface;
        //    66: astore_1       
        //    67: aload_1        
        //    68: ifnonnull       74
        //    71: goto            81
        //    74: aload_1        
        //    75: invokeinterface androidx/window/sidecar/SidecarInterface.getDeviceState:()Landroidx/window/sidecar/SidecarDeviceState;
        //    80: pop            
        //    81: aload_0        
        //    82: getfield        androidx/window/layout/SidecarCompat.sidecar:Landroidx/window/sidecar/SidecarInterface;
        //    85: astore_1       
        //    86: aload_1        
        //    87: ifnonnull       93
        //    90: goto            100
        //    93: aload_1        
        //    94: iconst_1       
        //    95: invokeinterface androidx/window/sidecar/SidecarInterface.onDeviceStateListenersChanged:(Z)V
        //   100: aload_0        
        //   101: getfield        androidx/window/layout/SidecarCompat.sidecar:Landroidx/window/sidecar/SidecarInterface;
        //   104: astore_1       
        //   105: aload_1        
        //   106: ifnonnull       114
        //   109: aconst_null    
        //   110: astore_1       
        //   111: goto            630
        //   114: aload_1        
        //   115: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   118: astore_1       
        //   119: aload_1        
        //   120: ifnonnull       126
        //   123: goto            109
        //   126: aload_1        
        //   127: ldc_w           "getWindowLayoutInfo"
        //   130: iconst_1       
        //   131: anewarray       Ljava/lang/Class;
        //   134: dup            
        //   135: iconst_0       
        //   136: ldc_w           Landroid/os/IBinder;.class
        //   139: aastore        
        //   140: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   143: astore_1       
        //   144: goto            630
        //   147: aload_1        
        //   148: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   151: astore_1       
        //   152: aload_1        
        //   153: ldc_w           Landroidx/window/sidecar/SidecarWindowLayoutInfo;.class
        //   156: invokestatic    kotlin/jvm/internal/Intrinsics.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   159: ifeq            575
        //   162: aload_0        
        //   163: getfield        androidx/window/layout/SidecarCompat.sidecar:Landroidx/window/sidecar/SidecarInterface;
        //   166: astore_1       
        //   167: aload_1        
        //   168: ifnonnull       174
        //   171: goto            639
        //   174: aload_1        
        //   175: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   178: astore_1       
        //   179: aload_1        
        //   180: ifnonnull       186
        //   183: goto            639
        //   186: aload_1        
        //   187: ldc_w           "onWindowLayoutChangeListenerAdded"
        //   190: iconst_1       
        //   191: anewarray       Ljava/lang/Class;
        //   194: dup            
        //   195: iconst_0       
        //   196: ldc_w           Landroid/os/IBinder;.class
        //   199: aastore        
        //   200: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   203: astore_1       
        //   204: goto            641
        //   207: aload_1        
        //   208: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   211: astore_1       
        //   212: aload_1        
        //   213: aload_3        
        //   214: invokestatic    kotlin/jvm/internal/Intrinsics.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   217: ifeq            560
        //   220: aload_0        
        //   221: getfield        androidx/window/layout/SidecarCompat.sidecar:Landroidx/window/sidecar/SidecarInterface;
        //   224: astore_1       
        //   225: aload_1        
        //   226: ifnonnull       232
        //   229: goto            650
        //   232: aload_1        
        //   233: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   236: astore_1       
        //   237: aload_1        
        //   238: ifnonnull       244
        //   241: goto            650
        //   244: aload_1        
        //   245: ldc_w           "onWindowLayoutChangeListenerRemoved"
        //   248: iconst_1       
        //   249: anewarray       Ljava/lang/Class;
        //   252: dup            
        //   253: iconst_0       
        //   254: ldc_w           Landroid/os/IBinder;.class
        //   257: aastore        
        //   258: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   261: astore_1       
        //   262: goto            652
        //   265: aload_1        
        //   266: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   269: astore_1       
        //   270: aload_1        
        //   271: aload_3        
        //   272: invokestatic    kotlin/jvm/internal/Intrinsics.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   275: ifeq            545
        //   278: new             Landroidx/window/sidecar/SidecarDeviceState;
        //   281: dup            
        //   282: invokespecial   androidx/window/sidecar/SidecarDeviceState.<init>:()V
        //   285: astore_1       
        //   286: aload_1        
        //   287: iconst_3       
        //   288: putfield        androidx/window/sidecar/SidecarDeviceState.posture:I
        //   291: goto            364
        //   294: ldc             Landroidx/window/sidecar/SidecarDeviceState;.class
        //   296: ldc_w           "setPosture"
        //   299: iconst_1       
        //   300: anewarray       Ljava/lang/Class;
        //   303: dup            
        //   304: iconst_0       
        //   305: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   308: aastore        
        //   309: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   312: aload_1        
        //   313: iconst_1       
        //   314: anewarray       Ljava/lang/Object;
        //   317: dup            
        //   318: iconst_0       
        //   319: iconst_3       
        //   320: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   323: aastore        
        //   324: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   327: pop            
        //   328: ldc             Landroidx/window/sidecar/SidecarDeviceState;.class
        //   330: ldc_w           "getPosture"
        //   333: iconst_0       
        //   334: anewarray       Ljava/lang/Class;
        //   337: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   340: aload_1        
        //   341: iconst_0       
        //   342: anewarray       Ljava/lang/Object;
        //   345: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   348: astore_1       
        //   349: aload_1        
        //   350: ifnull          534
        //   353: aload_1        
        //   354: checkcast       Ljava/lang/Integer;
        //   357: invokevirtual   java/lang/Integer.intValue:()I
        //   360: iconst_3       
        //   361: if_icmpne       523
        //   364: new             Landroidx/window/sidecar/SidecarDisplayFeature;
        //   367: dup            
        //   368: invokespecial   androidx/window/sidecar/SidecarDisplayFeature.<init>:()V
        //   371: astore_1       
        //   372: aload_1        
        //   373: invokevirtual   androidx/window/sidecar/SidecarDisplayFeature.getRect:()Landroid/graphics/Rect;
        //   376: astore_2       
        //   377: aload_2        
        //   378: ldc_w           "displayFeature.rect"
        //   381: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   384: aload_1        
        //   385: aload_2        
        //   386: invokevirtual   androidx/window/sidecar/SidecarDisplayFeature.setRect:(Landroid/graphics/Rect;)V
        //   389: aload_1        
        //   390: invokevirtual   androidx/window/sidecar/SidecarDisplayFeature.getType:()I
        //   393: pop            
        //   394: aload_1        
        //   395: iconst_1       
        //   396: invokevirtual   androidx/window/sidecar/SidecarDisplayFeature.setType:(I)V
        //   399: new             Landroidx/window/sidecar/SidecarWindowLayoutInfo;
        //   402: dup            
        //   403: invokespecial   androidx/window/sidecar/SidecarWindowLayoutInfo.<init>:()V
        //   406: astore_2       
        //   407: aload_2        
        //   408: getfield        androidx/window/sidecar/SidecarWindowLayoutInfo.displayFeatures:Ljava/util/List;
        //   411: astore_3       
        //   412: iconst_1       
        //   413: ireturn        
        //   414: new             Ljava/util/ArrayList;
        //   417: dup            
        //   418: invokespecial   java/util/ArrayList.<init>:()V
        //   421: astore_3       
        //   422: aload_3        
        //   423: aload_1        
        //   424: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   429: pop            
        //   430: ldc_w           Landroidx/window/sidecar/SidecarWindowLayoutInfo;.class
        //   433: ldc_w           "setDisplayFeatures"
        //   436: iconst_1       
        //   437: anewarray       Ljava/lang/Class;
        //   440: dup            
        //   441: iconst_0       
        //   442: ldc_w           Ljava/util/List;.class
        //   445: aastore        
        //   446: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   449: aload_2        
        //   450: iconst_1       
        //   451: anewarray       Ljava/lang/Object;
        //   454: dup            
        //   455: iconst_0       
        //   456: aload_3        
        //   457: aastore        
        //   458: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   461: pop            
        //   462: ldc_w           Landroidx/window/sidecar/SidecarWindowLayoutInfo;.class
        //   465: ldc_w           "getDisplayFeatures"
        //   468: iconst_0       
        //   469: anewarray       Ljava/lang/Class;
        //   472: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   475: aload_2        
        //   476: iconst_0       
        //   477: anewarray       Ljava/lang/Object;
        //   480: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   483: astore_1       
        //   484: aload_1        
        //   485: ifnull          512
        //   488: aload_3        
        //   489: aload_1        
        //   490: checkcast       Ljava/util/List;
        //   493: invokestatic    kotlin/jvm/internal/Intrinsics.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   496: ifeq            501
        //   499: iconst_1       
        //   500: ireturn        
        //   501: new             Ljava/lang/Exception;
        //   504: dup            
        //   505: ldc_w           "Invalid display feature getter/setter"
        //   508: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //   511: athrow         
        //   512: new             Ljava/lang/NullPointerException;
        //   515: dup            
        //   516: ldc_w           "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>"
        //   519: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   522: athrow         
        //   523: new             Ljava/lang/Exception;
        //   526: dup            
        //   527: ldc_w           "Invalid device posture getter/setter"
        //   530: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //   533: athrow         
        //   534: new             Ljava/lang/NullPointerException;
        //   537: dup            
        //   538: ldc_w           "null cannot be cast to non-null type kotlin.Int"
        //   541: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   544: athrow         
        //   545: new             Ljava/lang/NoSuchMethodException;
        //   548: dup            
        //   549: ldc_w           "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
        //   552: aload_1        
        //   553: invokestatic    kotlin/jvm/internal/Intrinsics.i:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   556: invokespecial   java/lang/NoSuchMethodException.<init>:(Ljava/lang/String;)V
        //   559: athrow         
        //   560: new             Ljava/lang/NoSuchMethodException;
        //   563: dup            
        //   564: ldc_w           "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
        //   567: aload_1        
        //   568: invokestatic    kotlin/jvm/internal/Intrinsics.i:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   571: invokespecial   java/lang/NoSuchMethodException.<init>:(Ljava/lang/String;)V
        //   574: athrow         
        //   575: new             Ljava/lang/NoSuchMethodException;
        //   578: dup            
        //   579: ldc_w           "Illegal return type for 'getWindowLayoutInfo': "
        //   582: aload_1        
        //   583: invokestatic    kotlin/jvm/internal/Intrinsics.i:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   586: invokespecial   java/lang/NoSuchMethodException.<init>:(Ljava/lang/String;)V
        //   589: athrow         
        //   590: new             Ljava/lang/NoSuchMethodException;
        //   593: dup            
        //   594: ldc_w           "Illegal return type for 'setSidecarCallback': "
        //   597: aload_1        
        //   598: invokestatic    kotlin/jvm/internal/Intrinsics.i:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   601: invokespecial   java/lang/NoSuchMethodException.<init>:(Ljava/lang/String;)V
        //   604: athrow         
        //   605: iconst_0       
        //   606: ireturn        
        //   607: astore_1       
        //   608: goto            605
        //   611: astore_2       
        //   612: goto            294
        //   615: astore_3       
        //   616: goto            414
        //   619: aconst_null    
        //   620: astore_1       
        //   621: aload_1        
        //   622: ifnonnull       45
        //   625: aconst_null    
        //   626: astore_1       
        //   627: goto            50
        //   630: aload_1        
        //   631: ifnonnull       147
        //   634: aconst_null    
        //   635: astore_1       
        //   636: goto            152
        //   639: aconst_null    
        //   640: astore_1       
        //   641: aload_1        
        //   642: ifnonnull       207
        //   645: aconst_null    
        //   646: astore_1       
        //   647: goto            212
        //   650: aconst_null    
        //   651: astore_1       
        //   652: aload_1        
        //   653: ifnonnull       265
        //   656: aload_2        
        //   657: astore_1       
        //   658: goto            270
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      5      607    611    Any
        //  14     19     607    611    Any
        //  26     42     607    611    Any
        //  45     50     607    611    Any
        //  50     67     607    611    Any
        //  74     81     607    611    Any
        //  81     86     607    611    Any
        //  93     100    607    611    Any
        //  100    105    607    611    Any
        //  114    119    607    611    Any
        //  126    144    607    611    Any
        //  147    152    607    611    Any
        //  152    167    607    611    Any
        //  174    179    607    611    Any
        //  186    204    607    611    Any
        //  207    212    607    611    Any
        //  212    225    607    611    Any
        //  232    237    607    611    Any
        //  244    262    607    611    Any
        //  265    270    607    611    Any
        //  270    286    607    611    Any
        //  286    291    611    545    Ljava/lang/NoSuchFieldError;
        //  286    291    607    611    Any
        //  294    349    607    611    Any
        //  353    364    607    611    Any
        //  364    407    607    611    Any
        //  407    412    615    523    Ljava/lang/NoSuchFieldError;
        //  407    412    607    611    Any
        //  414    484    607    611    Any
        //  488    499    607    611    Any
        //  501    512    607    611    Any
        //  512    523    607    611    Any
        //  523    534    607    611    Any
        //  534    545    607    611    Any
        //  545    560    607    611    Any
        //  560    575    607    611    Any
        //  575    590    607    611    Any
        //  590    605    607    611    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 343 out of bounds for length 343
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Metadata
    public static final class Companion
    {
        private Companion() {
        }
        
        public final IBinder getActivityWindowToken$window_release(final Activity activity) {
            if (activity == null) {
                return null;
            }
            final Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            final WindowManager$LayoutParams attributes = window.getAttributes();
            if (attributes == null) {
                return null;
            }
            return attributes.token;
        }
        
        public final Version getSidecarVersion() {
            Version parse = null;
            try {
                final String apiVersion = SidecarProvider.getApiVersion();
                if (!TextUtils.isEmpty((CharSequence)apiVersion)) {
                    parse = Version.Companion.parse(apiVersion);
                }
                return parse;
            }
            catch (NoClassDefFoundError | UnsupportedOperationException noClassDefFoundError) {
                return null;
            }
        }
    }
    
    @Metadata
    public static final class DistinctElementCallback implements ExtensionCallbackInterface
    {
        @NotNull
        private final WeakHashMap<Activity, WindowLayoutInfo> activityWindowLayoutInfo;
        @NotNull
        private final ExtensionCallbackInterface callbackInterface;
        @NotNull
        private final ReentrantLock lock;
        
        public DistinctElementCallback(@NotNull final ExtensionCallbackInterface callbackInterface) {
            Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.activityWindowLayoutInfo = new WeakHashMap<Activity, WindowLayoutInfo>();
        }
        
        @Override
        public void onWindowLayoutChanged(@NotNull final Activity activity, @NotNull final WindowLayoutInfo value) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(value, "newLayout");
            final ReentrantLock lock = this.lock;
            lock.lock();
            try {
                if (Intrinsics.a(value, this.activityWindowLayoutInfo.get(activity))) {
                    return;
                }
                final WindowLayoutInfo windowLayoutInfo = this.activityWindowLayoutInfo.put(activity, value);
                lock.unlock();
                this.callbackInterface.onWindowLayoutChanged(activity, value);
            }
            finally {
                lock.unlock();
            }
        }
    }
    
    @Metadata
    public static final class DistinctSidecarElementCallback implements SidecarInterface$SidecarCallback
    {
        @NotNull
        private final SidecarInterface$SidecarCallback callbackInterface;
        private SidecarDeviceState lastDeviceState;
        @NotNull
        private final ReentrantLock lock;
        @NotNull
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> mActivityWindowLayoutInfo;
        @NotNull
        private final SidecarAdapter sidecarAdapter;
        
        public DistinctSidecarElementCallback(@NotNull final SidecarAdapter sidecarAdapter, @NotNull final SidecarInterface$SidecarCallback callbackInterface) {
            Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
            Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
            this.sidecarAdapter = sidecarAdapter;
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.mActivityWindowLayoutInfo = new WeakHashMap<IBinder, SidecarWindowLayoutInfo>();
        }
        
        public void onDeviceStateChanged(@NotNull final SidecarDeviceState lastDeviceState) {
            Intrinsics.checkNotNullParameter(lastDeviceState, "newDeviceState");
            final ReentrantLock lock = this.lock;
            lock.lock();
            try {
                if (this.sidecarAdapter.isEqualSidecarDeviceState(this.lastDeviceState, lastDeviceState)) {
                    return;
                }
                this.lastDeviceState = lastDeviceState;
                this.callbackInterface.onDeviceStateChanged(lastDeviceState);
                final t a = t.a;
            }
            finally {
                lock.unlock();
            }
        }
        
        public void onWindowLayoutChanged(@NotNull final IBinder binder, @NotNull final SidecarWindowLayoutInfo value) {
            Intrinsics.checkNotNullParameter(binder, "token");
            Intrinsics.checkNotNullParameter(value, "newLayout");
            synchronized (this.lock) {
                if (this.sidecarAdapter.isEqualSidecarWindowLayoutInfo(this.mActivityWindowLayoutInfo.get(binder), value)) {
                    return;
                }
                final SidecarWindowLayoutInfo sidecarWindowLayoutInfo = this.mActivityWindowLayoutInfo.put(binder, value);
                // monitorexit(this.lock)
                this.callbackInterface.onWindowLayoutChanged(binder, value);
            }
        }
    }
    
    @Metadata
    public static final class FirstAttachAdapter implements View$OnAttachStateChangeListener
    {
        @NotNull
        private final WeakReference<Activity> activityWeakReference;
        @NotNull
        private final SidecarCompat sidecarCompat;
        
        public FirstAttachAdapter(@NotNull final SidecarCompat sidecarCompat, @NotNull final Activity referent) {
            Intrinsics.checkNotNullParameter(sidecarCompat, "sidecarCompat");
            Intrinsics.checkNotNullParameter(referent, "activity");
            this.sidecarCompat = sidecarCompat;
            this.activityWeakReference = new WeakReference<Activity>(referent);
        }
        
        public void onViewAttachedToWindow(@NotNull final View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            final Activity activity = this.activityWeakReference.get();
            final IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
            if (activity == null) {
                return;
            }
            if (activityWindowToken$window_release == null) {
                return;
            }
            this.sidecarCompat.register(activityWindowToken$window_release, activity);
        }
        
        public void onViewDetachedFromWindow(@NotNull final View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }
    
    @Metadata
    public final class TranslatingCallback implements SidecarInterface$SidecarCallback
    {
        public TranslatingCallback() {
            Intrinsics.checkNotNullParameter(SidecarCompat.this, "this$0");
        }
        
        @SuppressLint({ "SyntheticAccessor" })
        public void onDeviceStateChanged(@NotNull final SidecarDeviceState sidecarDeviceState) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState, "newDeviceState");
            final Collection<Activity> collection = SidecarCompat.access$getWindowListenerRegisteredContexts$p(SidecarCompat.this).values();
            final SidecarCompat this$0 = SidecarCompat.this;
            for (final Activity activity : collection) {
                final IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (activityWindowToken$window_release != null) {
                    final SidecarInterface sidecar = this$0.getSidecar();
                    if (sidecar != null) {
                        windowLayoutInfo = sidecar.getWindowLayoutInfo(activityWindowToken$window_release);
                    }
                }
                final ExtensionCallbackInterface access$getExtensionCallback$p = SidecarCompat.access$getExtensionCallback$p(this$0);
                if (access$getExtensionCallback$p == null) {
                    continue;
                }
                access$getExtensionCallback$p.onWindowLayoutChanged(activity, SidecarCompat.access$getSidecarAdapter$p(this$0).translate(windowLayoutInfo, sidecarDeviceState));
            }
        }
        
        @SuppressLint({ "SyntheticAccessor" })
        public void onWindowLayoutChanged(@NotNull final IBinder binder, @NotNull final SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            Intrinsics.checkNotNullParameter(binder, "windowToken");
            Intrinsics.checkNotNullParameter(sidecarWindowLayoutInfo, "newLayout");
            final Activity activity = SidecarCompat.access$getWindowListenerRegisteredContexts$p(SidecarCompat.this).get(binder);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            final SidecarAdapter access$getSidecarAdapter$p = SidecarCompat.access$getSidecarAdapter$p(SidecarCompat.this);
            final SidecarInterface sidecar = SidecarCompat.this.getSidecar();
            SidecarDeviceState deviceState;
            if (sidecar == null) {
                deviceState = null;
            }
            else {
                deviceState = sidecar.getDeviceState();
            }
            SidecarDeviceState sidecarDeviceState = deviceState;
            if (deviceState == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            final WindowLayoutInfo translate = access$getSidecarAdapter$p.translate(sidecarWindowLayoutInfo, sidecarDeviceState);
            final ExtensionCallbackInterface access$getExtensionCallback$p = SidecarCompat.access$getExtensionCallback$p(SidecarCompat.this);
            if (access$getExtensionCallback$p == null) {
                return;
            }
            access$getExtensionCallback$p.onWindowLayoutChanged(activity, translate);
        }
    }
}

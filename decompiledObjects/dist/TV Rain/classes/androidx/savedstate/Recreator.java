package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000.\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\b\000\030\000 \0162\0020\001:\002\016\017B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026J\020\020\013\032\0020\0062\006\020\f\032\0020\rH\002R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\020"}, d2={"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "reflectiveNew", "className", "", "Companion", "SavedStateProvider", "savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class Recreator
  implements LifecycleEventObserver
{
  @NotNull
  public static final String CLASSES_KEY = "classes_to_restore";
  @NotNull
  public static final String COMPONENT_KEY = "androidx.savedstate.Restarter";
  @NotNull
  public static final Companion Companion = new Companion(null);
  @NotNull
  private final SavedStateRegistryOwner owner;
  
  public Recreator(@NotNull SavedStateRegistryOwner paramSavedStateRegistryOwner)
  {
    owner = paramSavedStateRegistryOwner;
  }
  
  /* Error */
  private final void reflectiveNew(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: iconst_0
    //   2: ldc 2
    //   4: invokevirtual 80	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   7: invokestatic 84	java/lang/Class:forName	(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   10: ldc 86
    //   12: invokevirtual 90	java/lang/Class:asSubclass	(Ljava/lang/Class;)Ljava/lang/Class;
    //   15: astore_2
    //   16: aload_2
    //   17: ldc 92
    //   19: invokestatic 95	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   22: aload_2
    //   23: iconst_0
    //   24: anewarray 76	java/lang/Class
    //   27: invokevirtual 99	java/lang/Class:getDeclaredConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   30: astore_3
    //   31: aload_3
    //   32: iconst_1
    //   33: invokevirtual 105	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   36: aload_3
    //   37: iconst_0
    //   38: anewarray 4	java/lang/Object
    //   41: invokevirtual 111	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   44: astore_2
    //   45: aload_2
    //   46: ldc 113
    //   48: invokestatic 95	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   51: aload_2
    //   52: checkcast 86	androidx/savedstate/SavedStateRegistry$AutoRecreated
    //   55: astore_2
    //   56: aload_2
    //   57: aload_0
    //   58: getfield 66	androidx/savedstate/Recreator:owner	Landroidx/savedstate/SavedStateRegistryOwner;
    //   61: invokeinterface 116 2 0
    //   66: return
    //   67: astore_2
    //   68: new 118	java/lang/RuntimeException
    //   71: dup
    //   72: ldc 120
    //   74: aload_1
    //   75: invokestatic 126	z2:o	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   78: aload_2
    //   79: invokespecial 129	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   82: athrow
    //   83: astore_1
    //   84: ldc -125
    //   86: invokestatic 135	z2:t	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: astore_3
    //   90: aload_3
    //   91: aload_2
    //   92: invokevirtual 139	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   95: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: aload_3
    //   100: ldc -110
    //   102: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: new 148	java/lang/IllegalStateException
    //   109: dup
    //   110: aload_3
    //   111: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: aload_1
    //   115: invokespecial 152	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   118: athrow
    //   119: astore_2
    //   120: new 118	java/lang/RuntimeException
    //   123: dup
    //   124: ldc -125
    //   126: aload_1
    //   127: ldc -102
    //   129: invokestatic 158	z2:p	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   132: aload_2
    //   133: invokespecial 129	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   136: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	Recreator
    //   0	137	1	paramString	String
    //   15	42	2	localObject1	Object
    //   67	25	2	localException	Exception
    //   119	14	2	localClassNotFoundException	ClassNotFoundException
    //   30	81	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   36	56	67	java/lang/Exception
    //   22	31	83	java/lang/NoSuchMethodException
    //   0	22	119	java/lang/ClassNotFoundException
  }
  
  public void onStateChanged(@NotNull LifecycleOwner paramLifecycleOwner, @NotNull Lifecycle.Event paramEvent)
  {
    Intrinsics.checkNotNullParameter(paramLifecycleOwner, "source");
    Intrinsics.checkNotNullParameter(paramEvent, "event");
    if (paramEvent == Lifecycle.Event.ON_CREATE)
    {
      paramLifecycleOwner.getLifecycle().removeObserver(this);
      paramLifecycleOwner = owner.getSavedStateRegistry().consumeRestoredStateForKey("androidx.savedstate.Restarter");
      if (paramLifecycleOwner == null) {
        return;
      }
      paramLifecycleOwner = paramLifecycleOwner.getStringArrayList("classes_to_restore");
      if (paramLifecycleOwner != null)
      {
        paramLifecycleOwner = paramLifecycleOwner.iterator();
        while (paramLifecycleOwner.hasNext()) {
          reflectiveNew((String)paramLifecycleOwner.next());
        }
        return;
      }
      throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
    }
    throw new AssertionError("Next event must be ON_CREATE");
  }
  
  @Metadata(d1={"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000¨\006\006"}, d2={"Landroidx/savedstate/Recreator$Companion;", "", "()V", "CLASSES_KEY", "", "COMPONENT_KEY", "savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class Companion {}
  
  @Metadata(d1={"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020#\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\b\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\016\020\b\032\0020\t2\006\020\n\032\0020\007J\b\020\013\032\0020\fH\026R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000¨\006\r"}, d2={"Landroidx/savedstate/Recreator$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "registry", "Landroidx/savedstate/SavedStateRegistry;", "(Landroidx/savedstate/SavedStateRegistry;)V", "classes", "", "", "add", "", "className", "saveState", "Landroid/os/Bundle;", "savedstate_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class SavedStateProvider
    implements SavedStateRegistry.SavedStateProvider
  {
    @NotNull
    private final Set<String> classes = new LinkedHashSet();
    
    public SavedStateProvider(@NotNull SavedStateRegistry paramSavedStateRegistry)
    {
      paramSavedStateRegistry.registerSavedStateProvider("androidx.savedstate.Restarter", this);
    }
    
    public final void add(@NotNull String paramString)
    {
      Intrinsics.checkNotNullParameter(paramString, "className");
      classes.add(paramString);
    }
    
    @NotNull
    public Bundle saveState()
    {
      Bundle localBundle = new Bundle();
      localBundle.putStringArrayList("classes_to_restore", new ArrayList(classes));
      return localBundle;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.savedstate.Recreator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
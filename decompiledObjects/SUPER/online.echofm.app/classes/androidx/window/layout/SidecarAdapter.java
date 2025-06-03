package androidx.window.layout;

import W5.m;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class SidecarAdapter
{
  @NotNull
  public static final Companion Companion = new Companion(null);
  private static final String TAG = SidecarAdapter.class.getSimpleName();
  
  private final boolean isEqualSidecarDisplayFeature(SidecarDisplayFeature paramSidecarDisplayFeature1, SidecarDisplayFeature paramSidecarDisplayFeature2)
  {
    if (Intrinsics.a(paramSidecarDisplayFeature1, paramSidecarDisplayFeature2)) {
      return true;
    }
    if (paramSidecarDisplayFeature1 == null) {
      return false;
    }
    if (paramSidecarDisplayFeature2 == null) {
      return false;
    }
    if (paramSidecarDisplayFeature1.getType() != paramSidecarDisplayFeature2.getType()) {
      return false;
    }
    return Intrinsics.a(paramSidecarDisplayFeature1.getRect(), paramSidecarDisplayFeature2.getRect());
  }
  
  private final boolean isEqualSidecarDisplayFeatures(List<SidecarDisplayFeature> paramList1, List<SidecarDisplayFeature> paramList2)
  {
    if (paramList1 == paramList2) {
      return true;
    }
    if (paramList1 == null) {
      return false;
    }
    if (paramList2 == null) {
      return false;
    }
    if (paramList1.size() != paramList2.size()) {
      return false;
    }
    int i = paramList1.size() - 1;
    if (i >= 0)
    {
      int k;
      for (int j = 0;; j = k)
      {
        k = j + 1;
        if (!isEqualSidecarDisplayFeature((SidecarDisplayFeature)paramList1.get(j), (SidecarDisplayFeature)paramList2.get(j))) {
          return false;
        }
        if (k > i) {
          break;
        }
      }
    }
    return true;
  }
  
  public final boolean isEqualSidecarDeviceState(SidecarDeviceState paramSidecarDeviceState1, SidecarDeviceState paramSidecarDeviceState2)
  {
    boolean bool1 = Intrinsics.a(paramSidecarDeviceState1, paramSidecarDeviceState2);
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    if (paramSidecarDeviceState1 == null) {
      return false;
    }
    if (paramSidecarDeviceState2 == null) {
      return false;
    }
    Companion localCompanion = Companion;
    if (localCompanion.getSidecarDevicePosture$window_release(paramSidecarDeviceState1) != localCompanion.getSidecarDevicePosture$window_release(paramSidecarDeviceState2)) {
      bool2 = false;
    }
    return bool2;
  }
  
  public final boolean isEqualSidecarWindowLayoutInfo(SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo1, SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo2)
  {
    if (Intrinsics.a(paramSidecarWindowLayoutInfo1, paramSidecarWindowLayoutInfo2)) {
      return true;
    }
    if (paramSidecarWindowLayoutInfo1 == null) {
      return false;
    }
    if (paramSidecarWindowLayoutInfo2 == null) {
      return false;
    }
    Companion localCompanion = Companion;
    return isEqualSidecarDisplayFeatures(localCompanion.getSidecarDisplayFeatures(paramSidecarWindowLayoutInfo1), localCompanion.getSidecarDisplayFeatures(paramSidecarWindowLayoutInfo2));
  }
  
  @NotNull
  public final WindowLayoutInfo translate(SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo, @NotNull SidecarDeviceState paramSidecarDeviceState)
  {
    Intrinsics.checkNotNullParameter(paramSidecarDeviceState, "state");
    if (paramSidecarWindowLayoutInfo == null) {
      return new WindowLayoutInfo(m.f());
    }
    SidecarDeviceState localSidecarDeviceState = new SidecarDeviceState();
    Companion localCompanion = Companion;
    localCompanion.setSidecarDevicePosture(localSidecarDeviceState, localCompanion.getSidecarDevicePosture$window_release(paramSidecarDeviceState));
    return new WindowLayoutInfo(translate(localCompanion.getSidecarDisplayFeatures(paramSidecarWindowLayoutInfo), localSidecarDeviceState));
  }
  
  @NotNull
  public final List<DisplayFeature> translate(@NotNull List<SidecarDisplayFeature> paramList, @NotNull SidecarDeviceState paramSidecarDeviceState)
  {
    Intrinsics.checkNotNullParameter(paramList, "sidecarDisplayFeatures");
    Intrinsics.checkNotNullParameter(paramSidecarDeviceState, "deviceState");
    Object localObject1 = (Iterable)paramList;
    paramList = new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (SidecarDisplayFeature)((Iterator)localObject1).next();
      localObject2 = Companion.translate$window_release((SidecarDisplayFeature)localObject2, paramSidecarDeviceState);
      if (localObject2 != null) {
        paramList.add(localObject2);
      }
    }
    return paramList;
  }
  
  @Metadata
  public static final class Companion
  {
    @SuppressLint({"BanUncheckedReflection"})
    public final int getRawSidecarDevicePosture(@NotNull SidecarDeviceState paramSidecarDeviceState)
    {
      Intrinsics.checkNotNullParameter(paramSidecarDeviceState, "sidecarDeviceState");
      try
      {
        int i = posture;
        return i;
      }
      catch (NoSuchFieldError localNoSuchFieldError)
      {
        try
        {
          paramSidecarDeviceState = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(paramSidecarDeviceState, new Object[0]);
          if (paramSidecarDeviceState != null) {
            return ((Integer)paramSidecarDeviceState).intValue();
          }
          paramSidecarDeviceState = new java/lang/NullPointerException;
          paramSidecarDeviceState.<init>("null cannot be cast to non-null type kotlin.Int");
          throw paramSidecarDeviceState;
        }
        catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException paramSidecarDeviceState) {}
      }
      return 0;
    }
    
    public final int getSidecarDevicePosture$window_release(@NotNull SidecarDeviceState paramSidecarDeviceState)
    {
      Intrinsics.checkNotNullParameter(paramSidecarDeviceState, "sidecarDeviceState");
      int i = getRawSidecarDevicePosture(paramSidecarDeviceState);
      int j;
      if (i >= 0)
      {
        j = i;
        if (i <= 4) {}
      }
      else
      {
        j = 0;
      }
      return j;
    }
    
    @SuppressLint({"BanUncheckedReflection"})
    @NotNull
    public final List<SidecarDisplayFeature> getSidecarDisplayFeatures(@NotNull SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo)
    {
      Intrinsics.checkNotNullParameter(paramSidecarWindowLayoutInfo, "info");
      try
      {
        List localList1 = displayFeatures;
        List localList2 = localList1;
        if (localList1 == null) {
          localList2 = m.f();
        }
        return localList2;
      }
      catch (NoSuchFieldError localNoSuchFieldError)
      {
        try
        {
          paramSidecarWindowLayoutInfo = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(paramSidecarWindowLayoutInfo, new Object[0]);
          if (paramSidecarWindowLayoutInfo != null) {
            return (List)paramSidecarWindowLayoutInfo;
          }
          paramSidecarWindowLayoutInfo = new java/lang/NullPointerException;
          paramSidecarWindowLayoutInfo.<init>("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
          throw paramSidecarWindowLayoutInfo;
        }
        catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException paramSidecarWindowLayoutInfo) {}
      }
      return m.f();
    }
    
    @SuppressLint({"BanUncheckedReflection"})
    public final void setSidecarDevicePosture(@NotNull SidecarDeviceState paramSidecarDeviceState, int paramInt)
    {
      Intrinsics.checkNotNullParameter(paramSidecarDeviceState, "sidecarDeviceState");
      try
      {
        posture = paramInt;
      }
      catch (NoSuchFieldError localNoSuchFieldError) {}
      try
      {
        SidecarDeviceState.class.getMethod("setPosture", new Class[] { Integer.TYPE }).invoke(paramSidecarDeviceState, new Object[] { Integer.valueOf(paramInt) });
        return;
      }
      catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException paramSidecarDeviceState)
      {
        for (;;) {}
      }
    }
    
    @SuppressLint({"BanUncheckedReflection"})
    public final void setSidecarDisplayFeatures(@NotNull SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo, @NotNull List<SidecarDisplayFeature> paramList)
    {
      Intrinsics.checkNotNullParameter(paramSidecarWindowLayoutInfo, "info");
      Intrinsics.checkNotNullParameter(paramList, "displayFeatures");
      try
      {
        displayFeatures = paramList;
      }
      catch (NoSuchFieldError localNoSuchFieldError) {}
      try
      {
        SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", new Class[] { List.class }).invoke(paramSidecarWindowLayoutInfo, new Object[] { paramList });
        return;
      }
      catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException paramSidecarWindowLayoutInfo)
      {
        for (;;) {}
      }
    }
    
    public final DisplayFeature translate$window_release(@NotNull SidecarDisplayFeature paramSidecarDisplayFeature, @NotNull SidecarDeviceState paramSidecarDeviceState)
    {
      Intrinsics.checkNotNullParameter(paramSidecarDisplayFeature, "feature");
      Intrinsics.checkNotNullParameter(paramSidecarDeviceState, "deviceState");
      Object localObject = paramSidecarDisplayFeature.getRect();
      Intrinsics.checkNotNullExpressionValue(localObject, "feature.rect");
      if ((((Rect)localObject).width() == 0) && (((Rect)localObject).height() == 0)) {
        return null;
      }
      if ((paramSidecarDisplayFeature.getType() == 1) && (((Rect)localObject).width() != 0) && (((Rect)localObject).height() != 0)) {
        return null;
      }
      if (((paramSidecarDisplayFeature.getType() == 2) || (paramSidecarDisplayFeature.getType() == 1)) && (left != 0) && (top != 0)) {
        return null;
      }
      int i = paramSidecarDisplayFeature.getType();
      if (i != 1)
      {
        if (i != 2) {
          return null;
        }
        localObject = HardwareFoldingFeature.Type.Companion.getHINGE();
      }
      else
      {
        localObject = HardwareFoldingFeature.Type.Companion.getFOLD();
      }
      i = getSidecarDevicePosture$window_release(paramSidecarDeviceState);
      if ((i != 0) && (i != 1))
      {
        if (i != 2)
        {
          if ((i != 3) && (i == 4)) {
            break label208;
          }
          paramSidecarDeviceState = FoldingFeature.State.FLAT;
        }
        else
        {
          paramSidecarDeviceState = FoldingFeature.State.HALF_OPENED;
        }
        paramSidecarDisplayFeature = paramSidecarDisplayFeature.getRect();
        Intrinsics.checkNotNullExpressionValue(paramSidecarDisplayFeature, "feature.rect");
        return new HardwareFoldingFeature(new Bounds(paramSidecarDisplayFeature), (HardwareFoldingFeature.Type)localObject, paramSidecarDeviceState);
      }
      label208:
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.SidecarAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
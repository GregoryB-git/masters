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
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class SidecarAdapter$Companion
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

/* Location:
 * Qualified Name:     androidx.window.layout.SidecarAdapter.Companion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
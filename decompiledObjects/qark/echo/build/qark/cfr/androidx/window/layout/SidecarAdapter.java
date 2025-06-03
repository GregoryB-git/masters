/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.graphics.Rect
 *  androidx.window.sidecar.SidecarDeviceState
 *  androidx.window.sidecar.SidecarDisplayFeature
 *  androidx.window.sidecar.SidecarWindowLayoutInfo
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.NoSuchFieldError
 *  java.lang.NoSuchMethodException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.List
 */
package androidx.window.layout;

import W5.m;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class SidecarAdapter {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final String TAG = SidecarAdapter.class.getSimpleName();

    public static final /* synthetic */ String access$getTAG$cp() {
        return TAG;
    }

    private final boolean isEqualSidecarDisplayFeature(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (Intrinsics.a((Object)sidecarDisplayFeature, (Object)sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null) {
            return false;
        }
        if (sidecarDisplayFeature2 == null) {
            return false;
        }
        if (sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return Intrinsics.a((Object)sidecarDisplayFeature.getRect(), (Object)sidecarDisplayFeature2.getRect());
    }

    private final boolean isEqualSidecarDisplayFeatures(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null) {
            return false;
        }
        if (list2 == null) {
            return false;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int n8 = list.size() - 1;
        if (n8 >= 0) {
            int n9 = 0;
            do {
                int n10 = n9 + 1;
                if (!this.isEqualSidecarDisplayFeature((SidecarDisplayFeature)list.get(n9), (SidecarDisplayFeature)list2.get(n9))) {
                    return false;
                }
                if (n10 > n8) {
                    return true;
                }
                n9 = n10;
            } while (true);
        }
        return true;
    }

    public final boolean isEqualSidecarDeviceState(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (Intrinsics.a((Object)sidecarDeviceState, (Object)sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null) {
            return false;
        }
        if (sidecarDeviceState2 == null) {
            return false;
        }
        Companion companion = Companion;
        if (companion.getSidecarDevicePosture$window_release(sidecarDeviceState) == companion.getSidecarDevicePosture$window_release(sidecarDeviceState2)) {
            return true;
        }
        return false;
    }

    public final boolean isEqualSidecarWindowLayoutInfo(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (Intrinsics.a((Object)sidecarWindowLayoutInfo, (Object)sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null) {
            return false;
        }
        if (sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        Companion companion = Companion;
        return this.isEqualSidecarDisplayFeatures(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo2));
    }

    @NotNull
    public final WindowLayoutInfo translate(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @NotNull SidecarDeviceState sidecarDeviceState) {
        Intrinsics.checkNotNullParameter((Object)sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new WindowLayoutInfo(m.f());
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        Companion companion = Companion;
        companion.setSidecarDevicePosture(sidecarDeviceState2, companion.getSidecarDevicePosture$window_release(sidecarDeviceState));
        return new WindowLayoutInfo(this.translate(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    @NotNull
    public final List<DisplayFeature> translate(@NotNull List<SidecarDisplayFeature> arrayList, @NotNull SidecarDeviceState sidecarDeviceState) {
        Intrinsics.checkNotNullParameter(arrayList, "sidecarDisplayFeatures");
        Intrinsics.checkNotNullParameter((Object)sidecarDeviceState, "deviceState");
        Iterable iterable = (Iterable)arrayList;
        arrayList = new ArrayList();
        for (Object object : iterable) {
            if ((object = Companion.translate$window_release((SidecarDisplayFeature)object, sidecarDeviceState)) == null) continue;
            arrayList.add(object);
        }
        return arrayList;
    }

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @SuppressLint(value={"BanUncheckedReflection"})
        public final int getRawSidecarDevicePosture(@NotNull SidecarDeviceState object) {
            Intrinsics.checkNotNullParameter(object, "sidecarDeviceState");
            try {
                return object.posture;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                object = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(object, new Object[0]);
                if (object == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                return (Integer)object;
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException invocationTargetException) {
                return 0;
            }
        }

        public final int getSidecarDevicePosture$window_release(@NotNull SidecarDeviceState sidecarDeviceState) {
            int n8;
            block3 : {
                block2 : {
                    Intrinsics.checkNotNullParameter((Object)sidecarDeviceState, "sidecarDeviceState");
                    int n9 = this.getRawSidecarDevicePosture(sidecarDeviceState);
                    if (n9 < 0) break block2;
                    n8 = n9;
                    if (n9 <= 4) break block3;
                }
                n8 = 0;
            }
            return n8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @SuppressLint(value={"BanUncheckedReflection"})
        @NotNull
        public final List<SidecarDisplayFeature> getSidecarDisplayFeatures(@NotNull SidecarWindowLayoutInfo object) {
            Intrinsics.checkNotNullParameter(object, "info");
            try {
                List list;
                List list2 = list = object.displayFeatures;
                if (list != null) return list2;
                return m.f();
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                object = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(object, new Object[0]);
                if (object == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List)object;
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException noSuchMethodException) {
                return m.f();
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @SuppressLint(value={"BanUncheckedReflection"})
        public final void setSidecarDevicePosture(@NotNull SidecarDeviceState sidecarDeviceState, int n8) {
            Intrinsics.checkNotNullParameter((Object)sidecarDeviceState, "sidecarDeviceState");
            try {
                sidecarDeviceState.posture = n8;
                return;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                SidecarDeviceState.class.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke((Object)sidecarDeviceState, new Object[]{n8});
                return;
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException invocationTargetException) {
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @SuppressLint(value={"BanUncheckedReflection"})
        public final void setSidecarDisplayFeatures(@NotNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @NotNull List<SidecarDisplayFeature> list) {
            Intrinsics.checkNotNullParameter((Object)sidecarWindowLayoutInfo, "info");
            Intrinsics.checkNotNullParameter(list, "displayFeatures");
            try {
                sidecarWindowLayoutInfo.displayFeatures = list;
                return;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", new Class[]{List.class}).invoke((Object)sidecarWindowLayoutInfo, new Object[]{list});
                return;
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException invocationTargetException) {
                return;
            }
        }

        public final DisplayFeature translate$window_release(@NotNull SidecarDisplayFeature sidecarDisplayFeature, @NotNull SidecarDeviceState object) {
            block6 : {
                Object object2;
                block8 : {
                    block7 : {
                        Intrinsics.checkNotNullParameter((Object)sidecarDisplayFeature, "feature");
                        Intrinsics.checkNotNullParameter(object, "deviceState");
                        object2 = sidecarDisplayFeature.getRect();
                        Intrinsics.checkNotNullExpressionValue(object2, "feature.rect");
                        if (object2.width() == 0 && object2.height() == 0) {
                            return null;
                        }
                        if (sidecarDisplayFeature.getType() == 1 && object2.width() != 0 && object2.height() != 0) {
                            return null;
                        }
                        if ((sidecarDisplayFeature.getType() == 2 || sidecarDisplayFeature.getType() == 1) && object2.left != 0 && object2.top != 0) {
                            return null;
                        }
                        int n8 = sidecarDisplayFeature.getType();
                        if (n8 != 1) {
                            if (n8 != 2) {
                                return null;
                            }
                            object2 = HardwareFoldingFeature.Type.Companion.getHINGE();
                        } else {
                            object2 = HardwareFoldingFeature.Type.Companion.getFOLD();
                        }
                        n8 = this.getSidecarDevicePosture$window_release((SidecarDeviceState)object);
                        if (n8 == 0 || n8 == 1) break block6;
                        if (n8 == 2) break block7;
                        if (n8 != 3 && n8 == 4) break block6;
                        object = FoldingFeature.State.FLAT;
                        break block8;
                    }
                    object = FoldingFeature.State.HALF_OPENED;
                }
                sidecarDisplayFeature = sidecarDisplayFeature.getRect();
                Intrinsics.checkNotNullExpressionValue((Object)sidecarDisplayFeature, "feature.rect");
                return new HardwareFoldingFeature(new Bounds((Rect)sidecarDisplayFeature), (HardwareFoldingFeature.Type)object2, (FoldingFeature.State)object);
            }
            return null;
        }
    }

}


// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import android.annotation.SuppressLint;
import java.util.Iterator;
import java.util.ArrayList;
import W5.m;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import androidx.window.sidecar.SidecarDeviceState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class SidecarAdapter
{
    @NotNull
    public static final Companion Companion;
    private static final String TAG;
    
    static {
        Companion = new Companion(null);
        TAG = SidecarAdapter.class.getSimpleName();
    }
    
    private final boolean isEqualSidecarDisplayFeature(final SidecarDisplayFeature sidecarDisplayFeature, final SidecarDisplayFeature sidecarDisplayFeature2) {
        return Intrinsics.a(sidecarDisplayFeature, sidecarDisplayFeature2) || (sidecarDisplayFeature != null && sidecarDisplayFeature2 != null && sidecarDisplayFeature.getType() == sidecarDisplayFeature2.getType() && Intrinsics.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect()));
    }
    
    private final boolean isEqualSidecarDisplayFeatures(final List<SidecarDisplayFeature> list, final List<SidecarDisplayFeature> list2) {
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
        final int n = list.size() - 1;
        if (n < 0) {
            return true;
        }
        int n2 = 0;
        while (true) {
            final int n3 = n2 + 1;
            if (!this.isEqualSidecarDisplayFeature(list.get(n2), list2.get(n2))) {
                return false;
            }
            if (n3 > n) {
                return true;
            }
            n2 = n3;
        }
    }
    
    public final boolean isEqualSidecarDeviceState(final SidecarDeviceState sidecarDeviceState, final SidecarDeviceState sidecarDeviceState2) {
        if (Intrinsics.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null) {
            return false;
        }
        if (sidecarDeviceState2 == null) {
            return false;
        }
        final Companion companion = SidecarAdapter.Companion;
        return companion.getSidecarDevicePosture$window_release(sidecarDeviceState) == companion.getSidecarDevicePosture$window_release(sidecarDeviceState2);
    }
    
    public final boolean isEqualSidecarWindowLayoutInfo(final SidecarWindowLayoutInfo sidecarWindowLayoutInfo, final SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (Intrinsics.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null) {
            return false;
        }
        if (sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        final Companion companion = SidecarAdapter.Companion;
        return this.isEqualSidecarDisplayFeatures(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo2));
    }
    
    @NotNull
    public final WindowLayoutInfo translate(final SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @NotNull final SidecarDeviceState sidecarDeviceState) {
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new WindowLayoutInfo(m.f());
        }
        final SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        final Companion companion = SidecarAdapter.Companion;
        companion.setSidecarDevicePosture(sidecarDeviceState2, companion.getSidecarDevicePosture$window_release(sidecarDeviceState));
        return new WindowLayoutInfo(this.translate(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }
    
    @NotNull
    public final List<DisplayFeature> translate(@NotNull final List<SidecarDisplayFeature> list, @NotNull final SidecarDeviceState sidecarDeviceState) {
        Intrinsics.checkNotNullParameter(list, "sidecarDisplayFeatures");
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "deviceState");
        final List<SidecarDisplayFeature> list2 = list;
        final ArrayList<DisplayFeature> list3 = new ArrayList<DisplayFeature>();
        final Iterator<Object> iterator = list2.iterator();
        while (iterator.hasNext()) {
            final DisplayFeature translate$window_release = SidecarAdapter.Companion.translate$window_release(iterator.next(), sidecarDeviceState);
            if (translate$window_release != null) {
                list3.add(translate$window_release);
            }
        }
        return list3;
    }
    
    @Metadata
    public static final class Companion
    {
        private Companion() {
        }
        
        @SuppressLint({ "BanUncheckedReflection" })
        public final int getRawSidecarDevicePosture(@NotNull final SidecarDeviceState p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "sidecarDeviceState"
            //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: aload_1        
            //     7: getfield        androidx/window/sidecar/SidecarDeviceState.posture:I
            //    10: istore_2       
            //    11: iload_2        
            //    12: ireturn        
            //    13: ldc             Landroidx/window/sidecar/SidecarDeviceState;.class
            //    15: ldc             "getPosture"
            //    17: iconst_0       
            //    18: anewarray       Ljava/lang/Class;
            //    21: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    24: aload_1        
            //    25: iconst_0       
            //    26: anewarray       Ljava/lang/Object;
            //    29: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
            //    32: astore_1       
            //    33: aload_1        
            //    34: ifnull          45
            //    37: aload_1        
            //    38: checkcast       Ljava/lang/Integer;
            //    41: invokevirtual   java/lang/Integer.intValue:()I
            //    44: ireturn        
            //    45: new             Ljava/lang/NullPointerException;
            //    48: dup            
            //    49: ldc             "null cannot be cast to non-null type kotlin.Int"
            //    51: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //    54: athrow         
            //    55: astore_3       
            //    56: goto            13
            //    59: astore_1       
            //    60: iconst_0       
            //    61: ireturn        
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                         
            //  -----  -----  -----  -----  ---------------------------------------------
            //  6      11     55     62     Ljava/lang/NoSuchFieldError;
            //  13     33     59     62     Ljava/lang/NoSuchMethodException;
            //  13     33     59     62     Ljava/lang/IllegalAccessException;
            //  13     33     59     62     Ljava/lang/reflect/InvocationTargetException;
            //  37     45     59     62     Ljava/lang/NoSuchMethodException;
            //  37     45     59     62     Ljava/lang/IllegalAccessException;
            //  37     45     59     62     Ljava/lang/reflect/InvocationTargetException;
            //  45     55     59     62     Ljava/lang/NoSuchMethodException;
            //  45     55     59     62     Ljava/lang/IllegalAccessException;
            //  45     55     59     62     Ljava/lang/reflect/InvocationTargetException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0013:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
        
        public final int getSidecarDevicePosture$window_release(@NotNull final SidecarDeviceState sidecarDeviceState) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
            final int rawSidecarDevicePosture = this.getRawSidecarDevicePosture(sidecarDeviceState);
            int n;
            if (rawSidecarDevicePosture < 0 || (n = rawSidecarDevicePosture) > 4) {
                n = 0;
            }
            return n;
        }
        
        @SuppressLint({ "BanUncheckedReflection" })
        @NotNull
        public final List<SidecarDisplayFeature> getSidecarDisplayFeatures(@NotNull final SidecarWindowLayoutInfo p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "info"
            //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: aload_1        
            //     7: getfield        androidx/window/sidecar/SidecarWindowLayoutInfo.displayFeatures:Ljava/util/List;
            //    10: astore_3       
            //    11: aload_3        
            //    12: astore_2       
            //    13: aload_3        
            //    14: ifnonnull       21
            //    17: invokestatic    W5/m.f:()Ljava/util/List;
            //    20: astore_2       
            //    21: aload_2        
            //    22: areturn        
            //    23: ldc             Landroidx/window/sidecar/SidecarWindowLayoutInfo;.class
            //    25: ldc             "getDisplayFeatures"
            //    27: iconst_0       
            //    28: anewarray       Ljava/lang/Class;
            //    31: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    34: aload_1        
            //    35: iconst_0       
            //    36: anewarray       Ljava/lang/Object;
            //    39: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
            //    42: astore_1       
            //    43: aload_1        
            //    44: ifnull          52
            //    47: aload_1        
            //    48: checkcast       Ljava/util/List;
            //    51: areturn        
            //    52: new             Ljava/lang/NullPointerException;
            //    55: dup            
            //    56: ldc             "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>"
            //    58: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //    61: athrow         
            //    62: invokestatic    W5/m.f:()Ljava/util/List;
            //    65: areturn        
            //    66: astore_2       
            //    67: goto            23
            //    70: astore_1       
            //    71: goto            62
            //    Signature:
            //  (Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Ljava/util/List<Landroidx/window/sidecar/SidecarDisplayFeature;>;
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                         
            //  -----  -----  -----  -----  ---------------------------------------------
            //  6      11     66     74     Ljava/lang/NoSuchFieldError;
            //  17     21     66     74     Ljava/lang/NoSuchFieldError;
            //  23     43     70     66     Ljava/lang/NoSuchMethodException;
            //  23     43     70     66     Ljava/lang/IllegalAccessException;
            //  23     43     70     66     Ljava/lang/reflect/InvocationTargetException;
            //  47     52     70     66     Ljava/lang/NoSuchMethodException;
            //  47     52     70     66     Ljava/lang/IllegalAccessException;
            //  47     52     70     66     Ljava/lang/reflect/InvocationTargetException;
            //  52     62     70     66     Ljava/lang/NoSuchMethodException;
            //  52     62     70     66     Ljava/lang/IllegalAccessException;
            //  52     62     70     66     Ljava/lang/reflect/InvocationTargetException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0023:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
        
        @SuppressLint({ "BanUncheckedReflection" })
        public final void setSidecarDevicePosture(@NotNull final SidecarDeviceState p0, final int p1) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "sidecarDeviceState"
            //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: aload_1        
            //     7: iload_2        
            //     8: putfield        androidx/window/sidecar/SidecarDeviceState.posture:I
            //    11: return         
            //    12: ldc             Landroidx/window/sidecar/SidecarDeviceState;.class
            //    14: ldc             "setPosture"
            //    16: iconst_1       
            //    17: anewarray       Ljava/lang/Class;
            //    20: dup            
            //    21: iconst_0       
            //    22: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
            //    25: aastore        
            //    26: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    29: aload_1        
            //    30: iconst_1       
            //    31: anewarray       Ljava/lang/Object;
            //    34: dup            
            //    35: iconst_0       
            //    36: iload_2        
            //    37: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //    40: aastore        
            //    41: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
            //    44: pop            
            //    45: return         
            //    46: astore_3       
            //    47: goto            12
            //    50: astore_1       
            //    51: return         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                         
            //  -----  -----  -----  -----  ---------------------------------------------
            //  6      11     46     52     Ljava/lang/NoSuchFieldError;
            //  12     45     50     52     Ljava/lang/NoSuchMethodException;
            //  12     45     50     52     Ljava/lang/IllegalAccessException;
            //  12     45     50     52     Ljava/lang/reflect/InvocationTargetException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0012:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
        
        @SuppressLint({ "BanUncheckedReflection" })
        public final void setSidecarDisplayFeatures(@NotNull final SidecarWindowLayoutInfo p0, @NotNull final List<SidecarDisplayFeature> p1) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "info"
            //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: aload_2        
            //     7: ldc             "displayFeatures"
            //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //    12: aload_1        
            //    13: aload_2        
            //    14: putfield        androidx/window/sidecar/SidecarWindowLayoutInfo.displayFeatures:Ljava/util/List;
            //    17: return         
            //    18: ldc             Landroidx/window/sidecar/SidecarWindowLayoutInfo;.class
            //    20: ldc             "setDisplayFeatures"
            //    22: iconst_1       
            //    23: anewarray       Ljava/lang/Class;
            //    26: dup            
            //    27: iconst_0       
            //    28: ldc             Ljava/util/List;.class
            //    30: aastore        
            //    31: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    34: aload_1        
            //    35: iconst_1       
            //    36: anewarray       Ljava/lang/Object;
            //    39: dup            
            //    40: iconst_0       
            //    41: aload_2        
            //    42: aastore        
            //    43: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
            //    46: pop            
            //    47: return         
            //    48: astore_3       
            //    49: goto            18
            //    52: astore_1       
            //    53: return         
            //    Signature:
            //  (Landroidx/window/sidecar/SidecarWindowLayoutInfo;Ljava/util/List<Landroidx/window/sidecar/SidecarDisplayFeature;>;)V
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                         
            //  -----  -----  -----  -----  ---------------------------------------------
            //  12     17     48     54     Ljava/lang/NoSuchFieldError;
            //  18     47     52     54     Ljava/lang/NoSuchMethodException;
            //  18     47     52     54     Ljava/lang/IllegalAccessException;
            //  18     47     52     54     Ljava/lang/reflect/InvocationTargetException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0018:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
        
        public final DisplayFeature translate$window_release(@NotNull final SidecarDisplayFeature sidecarDisplayFeature, @NotNull final SidecarDeviceState sidecarDeviceState) {
            Intrinsics.checkNotNullParameter(sidecarDisplayFeature, "feature");
            Intrinsics.checkNotNullParameter(sidecarDeviceState, "deviceState");
            final Rect rect = sidecarDisplayFeature.getRect();
            Intrinsics.checkNotNullExpressionValue(rect, "feature.rect");
            if (rect.width() == 0 && rect.height() == 0) {
                return null;
            }
            if (sidecarDisplayFeature.getType() == 1 && rect.width() != 0 && rect.height() != 0) {
                return null;
            }
            if ((sidecarDisplayFeature.getType() == 2 || sidecarDisplayFeature.getType() == 1) && rect.left != 0 && rect.top != 0) {
                return null;
            }
            final int type = sidecarDisplayFeature.getType();
            HardwareFoldingFeature.Type type2;
            if (type != 1) {
                if (type != 2) {
                    return null;
                }
                type2 = HardwareFoldingFeature.Type.Companion.getHINGE();
            }
            else {
                type2 = HardwareFoldingFeature.Type.Companion.getFOLD();
            }
            final int sidecarDevicePosture$window_release = this.getSidecarDevicePosture$window_release(sidecarDeviceState);
            if (sidecarDevicePosture$window_release != 0 && sidecarDevicePosture$window_release != 1) {
                FoldingFeature.State state;
                if (sidecarDevicePosture$window_release != 2) {
                    if (sidecarDevicePosture$window_release != 3 && sidecarDevicePosture$window_release == 4) {
                        return null;
                    }
                    state = FoldingFeature.State.FLAT;
                }
                else {
                    state = FoldingFeature.State.HALF_OPENED;
                }
                final Rect rect2 = sidecarDisplayFeature.getRect();
                Intrinsics.checkNotNullExpressionValue(rect2, "feature.rect");
                return new HardwareFoldingFeature(new Bounds(rect2), type2, state);
            }
            return null;
        }
    }
}

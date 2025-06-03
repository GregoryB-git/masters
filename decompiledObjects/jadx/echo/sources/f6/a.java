package f6;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.v;
import m6.c;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class a(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Class b7 = ((d) cVar).b();
        if (!b7.isPrimitive()) {
            Intrinsics.c(b7, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return b7;
        }
        String name = b7.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    b7 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    b7 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    b7 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    b7 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    b7 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    b7 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    b7 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    b7 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    b7 = Short.class;
                    break;
                }
                break;
        }
        Intrinsics.c(b7, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return b7;
    }

    public static final c b(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return v.b(cls);
    }
}

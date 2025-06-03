/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  rx.internal.util.atomic.LinkedQueueNode
 *  sun.misc.Unsafe
 */
import rx.internal.util.atomic.LinkedQueueNode;
import sun.misc.Unsafe;

public final class h3 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object object, long l4, LinkedQueueNode linkedQueueNode, Object object2) {
        do {
            if (!unsafe.compareAndSwapObject(object, l4, (Object)linkedQueueNode, object2)) continue;
            return true;
        } while (unsafe.getObject(object, l4) == linkedQueueNode);
        return false;
    }
}


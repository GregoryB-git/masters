/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Random
 *  java.util.concurrent.ThreadLocalRandom
 */
package k6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

public final class a
extends j6.a {
    @Override
    public Random d() {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue((Object)threadLocalRandom, "current(...)");
        return threadLocalRandom;
    }
}


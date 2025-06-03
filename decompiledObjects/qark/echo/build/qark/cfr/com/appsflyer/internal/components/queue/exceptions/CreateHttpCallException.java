/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.util.NoSuchElementException
 */
package com.appsflyer.internal.components.queue.exceptions;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class CreateHttpCallException
extends NoSuchElementException {
    public CreateHttpCallException(@NotNull String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        super(string2);
    }
}


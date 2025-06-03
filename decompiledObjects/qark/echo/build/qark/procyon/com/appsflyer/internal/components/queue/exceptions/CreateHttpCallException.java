// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal.components.queue.exceptions;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;
import java.util.NoSuchElementException;

@Metadata
public final class CreateHttpCallException extends NoSuchElementException
{
    public CreateHttpCallException(@NotNull final String s) {
        Intrinsics.checkNotNullParameter(s, "");
        super(s);
    }
}

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.AdapterView
 *  androidx.annotation.NonNull
 *  java.lang.Object
 */
package com.jakewharton.rxbinding.widget;

import android.widget.AdapterView;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.view.ViewEvent;

public abstract class AdapterViewSelectionEvent
extends ViewEvent<AdapterView<?>> {
    public AdapterViewSelectionEvent(@NonNull AdapterView<?> adapterView) {
        super(adapterView);
    }
}


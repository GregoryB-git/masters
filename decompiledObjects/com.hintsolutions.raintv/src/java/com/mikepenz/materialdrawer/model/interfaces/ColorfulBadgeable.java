/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.mikepenz.materialdrawer.model.interfaces;

import com.mikepenz.materialdrawer.holder.BadgeStyle;
import com.mikepenz.materialdrawer.model.interfaces.Badgeable;

public interface ColorfulBadgeable<T>
extends Badgeable<T> {
    public BadgeStyle getBadgeStyle();

    public T withBadgeStyle(BadgeStyle var1);
}


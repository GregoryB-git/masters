/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.Pe;
import com.yandex.metrica.impl.ob.qn;
import com.yandex.metrica.profile.BooleanAttribute;

public class NotificationsEnabledAttribute
extends BooleanAttribute {
    public NotificationsEnabledAttribute() {
        super("appmetrica_notifications_enabled", new qn<String>(), new Pe());
    }
}


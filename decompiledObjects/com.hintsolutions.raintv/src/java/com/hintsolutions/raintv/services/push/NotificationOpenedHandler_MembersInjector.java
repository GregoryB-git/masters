/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  dagger.MembersInjector
 *  java.lang.Object
 *  javax.inject.Provider
 */
package com.hintsolutions.raintv.services.push;

import android.content.Context;
import com.hintsolutions.raintv.services.push.NotificationOpenedHandler;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class NotificationOpenedHandler_MembersInjector
implements MembersInjector<NotificationOpenedHandler> {
    private final Provider<Context> contextProvider;

    public NotificationOpenedHandler_MembersInjector(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static MembersInjector<NotificationOpenedHandler> create(Provider<Context> provider) {
        return new NotificationOpenedHandler_MembersInjector(provider);
    }

    public static void injectContext(NotificationOpenedHandler notificationOpenedHandler, Context context) {
        notificationOpenedHandler.context = context;
    }

    public void injectMembers(NotificationOpenedHandler notificationOpenedHandler) {
        NotificationOpenedHandler_MembersInjector.injectContext(notificationOpenedHandler, (Context)this.contextProvider.get());
    }
}


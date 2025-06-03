/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dagger.MembersInjector
 *  java.lang.Object
 *  javax.inject.Provider
 *  tvrain.managers.PrefsManager
 */
package com.hintsolutions.raintv.services.push;

import com.hintsolutions.raintv.services.push.NotificationServiceExtension;
import dagger.MembersInjector;
import javax.inject.Provider;
import tvrain.managers.PrefsManager;

public final class NotificationServiceExtension_MembersInjector
implements MembersInjector<NotificationServiceExtension> {
    private final Provider<PrefsManager> prefsManagerProvider;

    public NotificationServiceExtension_MembersInjector(Provider<PrefsManager> provider) {
        this.prefsManagerProvider = provider;
    }

    public static MembersInjector<NotificationServiceExtension> create(Provider<PrefsManager> provider) {
        return new NotificationServiceExtension_MembersInjector(provider);
    }

    public static void injectPrefsManager(NotificationServiceExtension notificationServiceExtension, PrefsManager prefsManager) {
        notificationServiceExtension.prefsManager = prefsManager;
    }

    public void injectMembers(NotificationServiceExtension notificationServiceExtension) {
        NotificationServiceExtension_MembersInjector.injectPrefsManager(notificationServiceExtension, (PrefsManager)this.prefsManagerProvider.get());
    }
}


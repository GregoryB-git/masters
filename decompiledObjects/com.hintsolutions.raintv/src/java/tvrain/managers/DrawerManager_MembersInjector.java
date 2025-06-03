/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dagger.MembersInjector
 *  java.lang.Object
 *  javax.inject.Provider
 */
package tvrain.managers;

import dagger.MembersInjector;
import javax.inject.Provider;
import tvrain.managers.DrawerManager;
import tvrain.managers.PrefsManager;

public final class DrawerManager_MembersInjector
implements MembersInjector<DrawerManager> {
    private final Provider<PrefsManager> prefsManagerProvider;

    public DrawerManager_MembersInjector(Provider<PrefsManager> provider) {
        this.prefsManagerProvider = provider;
    }

    public static MembersInjector<DrawerManager> create(Provider<PrefsManager> provider) {
        return new DrawerManager_MembersInjector(provider);
    }

    public static void injectPrefsManager(DrawerManager drawerManager, PrefsManager prefsManager) {
        drawerManager.prefsManager = prefsManager;
    }

    public void injectMembers(DrawerManager drawerManager) {
        DrawerManager_MembersInjector.injectPrefsManager(drawerManager, (PrefsManager)this.prefsManagerProvider.get());
    }
}


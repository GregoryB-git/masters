/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dagger.MembersInjector
 *  java.lang.Object
 *  javax.inject.Provider
 */
package tvrain.utils;

import dagger.MembersInjector;
import javax.inject.Provider;
import ru.tvrain.core.services.RainService;
import tvrain.managers.UserManager;
import tvrain.utils.CurrentlyOnAirGetter;

public final class CurrentlyOnAirGetter_MembersInjector
implements MembersInjector<CurrentlyOnAirGetter> {
    private final Provider<RainService> rainApiProvider;
    private final Provider<UserManager> userManagerProvider;

    public CurrentlyOnAirGetter_MembersInjector(Provider<RainService> provider, Provider<UserManager> provider2) {
        this.rainApiProvider = provider;
        this.userManagerProvider = provider2;
    }

    public static MembersInjector<CurrentlyOnAirGetter> create(Provider<RainService> provider, Provider<UserManager> provider2) {
        return new CurrentlyOnAirGetter_MembersInjector(provider, provider2);
    }

    public static void injectRainApi(CurrentlyOnAirGetter currentlyOnAirGetter, RainService rainService) {
        currentlyOnAirGetter.rainApi = rainService;
    }

    public static void injectUserManager(CurrentlyOnAirGetter currentlyOnAirGetter, UserManager userManager) {
        currentlyOnAirGetter.userManager = userManager;
    }

    public void injectMembers(CurrentlyOnAirGetter currentlyOnAirGetter) {
        CurrentlyOnAirGetter_MembersInjector.injectRainApi(currentlyOnAirGetter, (RainService)this.rainApiProvider.get());
        CurrentlyOnAirGetter_MembersInjector.injectUserManager(currentlyOnAirGetter, (UserManager)this.userManagerProvider.get());
    }
}


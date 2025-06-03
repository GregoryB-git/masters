/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.List
 *  javax.inject.Inject
 *  rx.Subscription
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 */
package tvrain.utils;

import com.hintsolutions.raintv.RainApplication;
import com.squareup.otto.Bus;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import ru.tvrain.core.data.ScheduleProgram;
import ru.tvrain.core.services.RainService;
import ru.tvrain.core.utils.DateHelper;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.managers.UserManager;
import tvrain.services.bus.BusProvider;
import tvrain.services.bus.events.ScheduleChangedEvent;

public class CurrentlyOnAirGetter {
    private static volatile ScheduleProgram currentProgram;
    private Subscription getScheduleSubscription;
    private List<ScheduleProgram> mSchedule;
    @Inject
    public RainService rainApi;
    private String scheduleDate;
    @Inject
    public UserManager userManager;

    public CurrentlyOnAirGetter() {
        try {
            RainApplication.getAppComponent().inject(this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.getCurrentlyOnAir();
        try {
            BusProvider.getInstance().register(this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static /* synthetic */ void a(CurrentlyOnAirGetter currentlyOnAirGetter, String string2, List list) {
        currentlyOnAirGetter.lambda$getSchedule$0(string2, list);
    }

    public static /* synthetic */ void b(Throwable throwable) {
        CurrentlyOnAirGetter.lambda$getSchedule$1(throwable);
    }

    private String getCurrentScheduleDate() {
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(11) >= 0 && calendar.get(11) <= 4) {
            calendar.add(6, -1);
        }
        return DateHelper.formatDate(calendar.getTime());
    }

    private void getSchedule() {
        Object object = this.getScheduleSubscription;
        if (object == null || object.isUnsubscribed()) {
            object = this.getCurrentScheduleDate();
            this.getScheduleSubscription = this.rainApi.getSchedule(this.getAuthorization(), 1280, 720, (String)object).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new y4(this, object, 6), (Action1)new z3(13));
        }
    }

    private boolean isCurrentProgramValid() {
        if (currentProgram == null) {
            return false;
        }
        Date date = new Date();
        return date.after(CurrentlyOnAirGetter.currentProgram.date_start) && date.before(CurrentlyOnAirGetter.currentProgram.date_end);
    }

    private /* synthetic */ void lambda$getSchedule$0(String string2, List list) {
        this.mSchedule = list;
        this.scheduleDate = string2;
        this.setCurrentProgram();
    }

    private static /* synthetic */ void lambda$getSchedule$1(Throwable throwable) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void setCurrentProgram() {
        CurrentlyOnAirGetter currentlyOnAirGetter = this;
        synchronized (currentlyOnAirGetter) {
            Throwable throwable2;
            block8: {
                block7: {
                    try {
                        try {
                            Object object = this.mSchedule;
                            if (object != null && !object.isEmpty() && this.scheduleDate != null && this.getCurrentScheduleDate().equals((Object)this.scheduleDate)) {
                                currentProgram = null;
                                Object object2 = this.mSchedule.iterator();
                                while (object2.hasNext()) {
                                    object = (ScheduleProgram)object2.next();
                                    Object object3 = new Date();
                                    if (!object3.after(object.date_start) || !object3.before(object.date_end)) continue;
                                    if (currentProgram != null && currentProgram.equals(object)) break block7;
                                    currentProgram = object;
                                    object3 = BusProvider.getInstance();
                                    object2 = new ScheduleChangedEvent((ScheduleProgram)object);
                                    ((Bus)object3).post(object2);
                                    break block7;
                                }
                                break block7;
                            }
                            this.getSchedule();
                            return;
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public String getAuthorization() {
        return this.userManager.getAuthorization();
    }

    public ScheduleProgram getCurrentlyOnAir() {
        if (!this.isCurrentProgramValid()) {
            this.setCurrentProgram();
        }
        return currentProgram;
    }

    public void stop() {
        Subscription subscription = this.getScheduleSubscription;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        try {
            BusProvider.getInstance().unregister(this);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}


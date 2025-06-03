/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Date
 *  java.util.List
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.schedule.ScheduleDayFragment;
import java.util.Date;
import java.util.List;
import rx.functions.Action1;

public final class g4
implements Action1 {
    public final ScheduleDayFragment a;
    public final Date b;

    public /* synthetic */ g4(ScheduleDayFragment scheduleDayFragment, Date date) {
        this.a = scheduleDayFragment;
        this.b = date;
    }

    public final void call(Object object) {
        ScheduleDayFragment.c(this.a, this.b, (List)object);
    }
}


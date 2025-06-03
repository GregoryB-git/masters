/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Message
 *  com.hintsolutions.raintv.profile.PersonalFragment
 *  java.lang.Object
 */
import android.os.Handler;
import android.os.Message;
import com.hintsolutions.raintv.profile.PersonalFragment;

public final class q3
implements Handler.Callback {
    public final PersonalFragment a;

    public /* synthetic */ q3(PersonalFragment personalFragment) {
        this.a = personalFragment;
    }

    public final boolean handleMessage(Message message) {
        return PersonalFragment.d((PersonalFragment)this.a, (Message)message);
    }
}


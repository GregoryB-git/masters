/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.LinkInfo
 *  ru.tvrain.core.data.RainUser
 *  ru.tvrain.core.data.UserInfo
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.profile.PersonalFragment;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.LinkInfo;
import ru.tvrain.core.data.RainUser;
import ru.tvrain.core.data.UserInfo;
import rx.functions.Action1;

public final class r3
implements Action1 {
    public final int a;
    public final PersonalFragment b;

    public /* synthetic */ r3(PersonalFragment personalFragment, int n4) {
        this.a = n4;
        this.b = personalFragment;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 4: {
                PersonalFragment.f(this.b, (ResponseBody)object);
                return;
            }
            case 3: {
                PersonalFragment.e(this.b, (LinkInfo)object);
                return;
            }
            case 2: {
                PersonalFragment.c(this.b, (UserInfo)object);
                return;
            }
            case 1: {
                PersonalFragment.g(this.b, (Throwable)object);
                return;
            }
            case 0: {
                PersonalFragment.j(this.b, (RainUser)object);
                return;
            }
        }
        PersonalFragment.b(this.b, (Throwable)object);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  okhttp3.ResponseBody
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.news.NewsActivity;
import java.util.ArrayList;
import okhttp3.ResponseBody;
import rx.functions.Action1;

public final class l3
implements Action1 {
    public final int a;
    public final int b;
    public final Object c;

    public /* synthetic */ l3(Object object, int n4, int n5) {
        this.a = n5;
        this.c = object;
        this.b = n4;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                NewsActivity.Y(this.c, this.b, (ArrayList)object);
                return;
            }
        }
        NewsActivity.B((NewsActivity)this.c, this.b, (ResponseBody)object);
    }
}


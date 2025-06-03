package O5;

import android.app.Activity;
import java.util.ArrayList;
import w.AbstractC2072a;

/* loaded from: classes.dex */
public class A implements E5.o {

    /* renamed from: b, reason: collision with root package name */
    public a f4022b;

    /* renamed from: a, reason: collision with root package name */
    public final int f4021a = 240;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4023c = false;

    public interface a {
        void a(int i7);
    }

    public void a(Activity activity, a aVar, InterfaceC0461b interfaceC0461b) {
        String str;
        if (this.f4023c) {
            str = "A request for permissions is already running, please wait for it to finish before doing another request.";
        } else {
            if (activity != null) {
                this.f4022b = aVar;
                ArrayList arrayList = new ArrayList();
                arrayList.add("android.permission.POST_NOTIFICATIONS");
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                if (this.f4023c) {
                    return;
                }
                AbstractC2072a.l(activity, strArr, 240);
                this.f4023c = true;
                return;
            }
            str = "Unable to detect current Android Activity.";
        }
        interfaceC0461b.a(str);
    }

    @Override // E5.o
    public boolean b(int i7, String[] strArr, int[] iArr) {
        a aVar;
        int i8 = 0;
        if (!this.f4023c || i7 != 240 || (aVar = this.f4022b) == null) {
            return false;
        }
        this.f4023c = false;
        if (iArr.length > 0 && iArr[0] == 0) {
            i8 = 1;
        }
        aVar.a(i8);
        return true;
    }
}

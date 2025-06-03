package L;

import android.widget.ListView;

/* loaded from: classes.dex */
public class e extends a {

    /* renamed from: G, reason: collision with root package name */
    public final ListView f3285G;

    public e(ListView listView) {
        super(listView);
        this.f3285G = listView;
    }

    @Override // L.a
    public boolean a(int i7) {
        return false;
    }

    @Override // L.a
    public boolean b(int i7) {
        ListView listView = this.f3285G;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i8 = firstVisiblePosition + childCount;
        if (i7 > 0) {
            if (i8 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i7 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // L.a
    public void j(int i7, int i8) {
        f.a(this.f3285G, i8);
    }
}

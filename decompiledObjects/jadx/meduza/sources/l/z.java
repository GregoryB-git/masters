package l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z extends Spinner {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f9498q = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final l.d f9499a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9500b;

    /* renamed from: c, reason: collision with root package name */
    public y f9501c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f9502d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9503e;
    public i f;

    /* renamed from: o, reason: collision with root package name */
    public int f9504o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f9505p;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (!z.this.getInternalPopup().a()) {
                z zVar = z.this;
                zVar.f.m(c.b(zVar), c.a(zVar));
            }
            ViewTreeObserver viewTreeObserver = z.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                b.a(viewTreeObserver, this);
            }
        }
    }

    public static final class b {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static final class c {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        public static void d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    public static final class d {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public class e implements i, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public androidx.appcompat.app.b f9507a;

        /* renamed from: b, reason: collision with root package name */
        public ListAdapter f9508b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f9509c;

        public e() {
        }

        @Override // l.z.i
        public final boolean a() {
            androidx.appcompat.app.b bVar = this.f9507a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // l.z.i
        public final int b() {
            return 0;
        }

        @Override // l.z.i
        public final void d(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // l.z.i
        public final void dismiss() {
            androidx.appcompat.app.b bVar = this.f9507a;
            if (bVar != null) {
                bVar.dismiss();
                this.f9507a = null;
            }
        }

        @Override // l.z.i
        public final CharSequence e() {
            return this.f9509c;
        }

        @Override // l.z.i
        public final Drawable g() {
            return null;
        }

        @Override // l.z.i
        public final void i(CharSequence charSequence) {
            this.f9509c = charSequence;
        }

        @Override // l.z.i
        public final void j(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // l.z.i
        public final void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // l.z.i
        public final void l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // l.z.i
        public final void m(int i10, int i11) {
            if (this.f9508b == null) {
                return;
            }
            b.a aVar = new b.a(z.this.getPopupContext());
            CharSequence charSequence = this.f9509c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.f9508b;
            int selectedItemPosition = z.this.getSelectedItemPosition();
            AlertController.b bVar = aVar.f590a;
            bVar.f582m = listAdapter;
            bVar.f583n = this;
            bVar.f586q = selectedItemPosition;
            bVar.f585p = true;
            androidx.appcompat.app.b create = aVar.create();
            this.f9507a = create;
            AlertController.RecycleListView recycleListView = create.f.f549g;
            c.d(recycleListView, i10);
            c.c(recycleListView, i11);
            this.f9507a.show();
        }

        @Override // l.z.i
        public final int n() {
            return 0;
        }

        @Override // l.z.i
        public final void o(ListAdapter listAdapter) {
            this.f9508b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            z.this.setSelection(i10);
            if (z.this.getOnItemClickListener() != null) {
                z.this.performItemClick(null, i10, this.f9508b.getItemId(i10));
            }
            dismiss();
        }
    }

    public static class f implements ListAdapter, SpinnerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public SpinnerAdapter f9511a;

        /* renamed from: b, reason: collision with root package name */
        public ListAdapter f9512b;

        public f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f9511a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f9512b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    d.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof v0) {
                    v0 v0Var = (v0) spinnerAdapter;
                    if (v0Var.getDropDownViewTheme() == null) {
                        v0Var.a();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f9512b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f9511a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f9511a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f9511a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f9511a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f9511a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f9512b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f9511a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f9511a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class g extends n0 implements i {
        public CharSequence K;
        public ListAdapter L;
        public final Rect M;
        public int N;

        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                z.this.setSelection(i10);
                if (z.this.getOnItemClickListener() != null) {
                    g gVar = g.this;
                    z.this.performItemClick(view, i10, gVar.L.getItemId(i10));
                }
                g.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                g gVar = g.this;
                z zVar = z.this;
                gVar.getClass();
                WeakHashMap<View, e0.o0> weakHashMap = e0.d0.f3766a;
                if (!(zVar.isAttachedToWindow() && zVar.getGlobalVisibleRect(gVar.M))) {
                    g.this.dismiss();
                } else {
                    g.this.r();
                    g.this.show();
                }
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f9515a;

            public c(b bVar) {
                this.f9515a = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = z.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f9515a);
                }
            }
        }

        public g(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10, 0);
            this.M = new Rect();
            this.f9420w = z.this;
            this.F = true;
            this.G.setFocusable(true);
            this.f9421x = new a();
        }

        @Override // l.z.i
        public final CharSequence e() {
            return this.K;
        }

        @Override // l.z.i
        public final void i(CharSequence charSequence) {
            this.K = charSequence;
        }

        @Override // l.z.i
        public final void l(int i10) {
            this.N = i10;
        }

        @Override // l.z.i
        public final void m(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean a10 = a();
            r();
            this.G.setInputMethodMode(2);
            show();
            j0 j0Var = this.f9410c;
            j0Var.setChoiceMode(1);
            c.d(j0Var, i10);
            c.c(j0Var, i11);
            int selectedItemPosition = z.this.getSelectedItemPosition();
            j0 j0Var2 = this.f9410c;
            if (a() && j0Var2 != null) {
                j0Var2.setListSelectionHidden(false);
                j0Var2.setSelection(selectedItemPosition);
                if (j0Var2.getChoiceMode() != 0) {
                    j0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (a10 || (viewTreeObserver = z.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.G.setOnDismissListener(new c(bVar));
        }

        @Override // l.n0, l.z.i
        public final void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.L = listAdapter;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void r() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.g()
                r1 = 0
                if (r0 == 0) goto L26
                l.z r1 = l.z.this
                android.graphics.Rect r1 = r1.f9505p
                r0.getPadding(r1)
                l.z r0 = l.z.this
                boolean r0 = l.f1.a(r0)
                if (r0 == 0) goto L1d
                l.z r0 = l.z.this
                android.graphics.Rect r0 = r0.f9505p
                int r0 = r0.right
                goto L24
            L1d:
                l.z r0 = l.z.this
                android.graphics.Rect r0 = r0.f9505p
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                l.z r0 = l.z.this
                android.graphics.Rect r0 = r0.f9505p
                r0.right = r1
                r0.left = r1
            L2e:
                l.z r0 = l.z.this
                int r0 = r0.getPaddingLeft()
                l.z r2 = l.z.this
                int r2 = r2.getPaddingRight()
                l.z r3 = l.z.this
                int r3 = r3.getWidth()
                l.z r4 = l.z.this
                int r5 = r4.f9504o
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.L
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.g()
                int r4 = r4.a(r5, r6)
                l.z r5 = l.z.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                l.z r6 = l.z.this
                android.graphics.Rect r6 = r6.f9505p
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.q(r4)
                goto L85
            L82:
                r8.q(r5)
            L85:
                l.z r4 = l.z.this
                boolean r4 = l.f1.a(r4)
                if (r4 == 0) goto L96
                int r3 = r3 - r2
                int r0 = r8.f9412e
                int r3 = r3 - r0
                int r0 = r8.N
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L9b
            L96:
                int r2 = r8.N
                int r0 = r0 + r2
                int r3 = r0 + r1
            L9b:
                r8.f = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l.z.g.r():void");
        }
    }

    public static class h extends View.BaseSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public boolean f9517a;

        public class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                return new h(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel) {
            super(parcel);
            this.f9517a = parcel.readByte() != 0;
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f9517a ? (byte) 1 : (byte) 0);
        }
    }

    public interface i {
        boolean a();

        int b();

        void d(int i10);

        void dismiss();

        CharSequence e();

        Drawable g();

        void i(CharSequence charSequence);

        void j(Drawable drawable);

        void k(int i10);

        void l(int i10);

        void m(int i10, int i11);

        int n();

        void o(ListAdapter listAdapter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f9505p = r0
            android.content.Context r0 = r10.getContext()
            l.u0.a(r10, r0)
            int[] r0 = b.a0.I
            r1 = 0
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r0, r13, r1)
            l.d r2 = new l.d
            r2.<init>(r10)
            r10.f9499a = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L2e
            j.c r3 = new j.c
            r3.<init>(r11, r2)
            r10.f9500b = r3
            goto L30
        L2e:
            r10.f9500b = r11
        L30:
            r2 = 0
            r3 = -1
            int[] r4 = l.z.f9498q     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            android.content.res.TypedArray r4 = r11.obtainStyledAttributes(r12, r4, r13, r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            boolean r5 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            if (r5 == 0) goto L58
            int r3 = r4.getInt(r1, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            goto L58
        L43:
            r11 = move-exception
            r2 = r4
            goto Lcd
        L47:
            r5 = move-exception
            goto L4f
        L49:
            r11 = move-exception
            goto Lcd
        L4c:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L4f:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L5b
        L58:
            r4.recycle()
        L5b:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L95
            if (r3 == r5) goto L62
            goto La2
        L62:
            l.z$g r3 = new l.z$g
            android.content.Context r6 = r10.f9500b
            r3.<init>(r6, r12, r13)
            android.content.Context r6 = r10.f9500b
            int[] r7 = b.a0.I
            l.z0 r6 = l.z0.m(r6, r12, r7, r13)
            r7 = 3
            r8 = -2
            android.content.res.TypedArray r9 = r6.f9519b
            int r7 = r9.getLayoutDimension(r7, r8)
            r10.f9504o = r7
            android.graphics.drawable.Drawable r7 = r6.e(r5)
            r3.j(r7)
            java.lang.String r4 = r0.getString(r4)
            r3.K = r4
            r6.n()
            r10.f = r3
            l.y r4 = new l.y
            r4.<init>(r10, r10, r3)
            r10.f9501c = r4
            goto La2
        L95:
            l.z$e r3 = new l.z$e
            r3.<init>()
            r10.f = r3
            java.lang.String r4 = r0.getString(r4)
            r3.f9509c = r4
        La2:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto Lb9
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r11, r4, r1)
            r11 = 2131558466(0x7f0d0042, float:1.8742249E38)
            r3.setDropDownViewResource(r11)
            r10.setAdapter(r3)
        Lb9:
            r0.recycle()
            r10.f9503e = r5
            android.widget.SpinnerAdapter r11 = r10.f9502d
            if (r11 == 0) goto Lc7
            r10.setAdapter(r11)
            r10.f9502d = r2
        Lc7:
            l.d r11 = r10.f9499a
            r11.d(r12, r13)
            return
        Lcd:
            if (r2 == 0) goto Ld2
            r2.recycle()
        Ld2:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.z.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f9505p);
        Rect rect = this.f9505p;
        return i11 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        l.d dVar = this.f9499a;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i iVar = this.f;
        return iVar != null ? iVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i iVar = this.f;
        return iVar != null ? iVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.f9504o : super.getDropDownWidth();
    }

    public final i getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i iVar = this.f;
        return iVar != null ? iVar.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f9500b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i iVar = this.f;
        return iVar != null ? iVar.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        l.d dVar = this.f9499a;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        l.d dVar = this.f9499a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f;
        if (iVar == null || !iVar.a()) {
            return;
        }
        this.f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        if (!hVar.f9517a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        i iVar = this.f;
        hVar.f9517a = iVar != null && iVar.a();
        return hVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y yVar = this.f9501c;
        if (yVar == null || !yVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        i iVar = this.f;
        if (iVar == null) {
            return super.performClick();
        }
        if (iVar.a()) {
            return true;
        }
        this.f.m(c.b(this), c.a(this));
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f9503e) {
            this.f9502d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f != null) {
            Context context = this.f9500b;
            if (context == null) {
                context = getContext();
            }
            this.f.o(new f(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        l.d dVar = this.f9499a;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        l.d dVar = this.f9499a;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        i iVar = this.f;
        if (iVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            iVar.l(i10);
            this.f.d(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        i iVar = this.f;
        if (iVar != null) {
            iVar.k(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f != null) {
            this.f9504o = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.f;
        if (iVar != null) {
            iVar.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(x6.b.X(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i iVar = this.f;
        if (iVar != null) {
            iVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        l.d dVar = this.f9499a;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        l.d dVar = this.f9499a;
        if (dVar != null) {
            dVar.i(mode);
        }
    }
}

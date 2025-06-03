package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import b.a0;
import e0.d0;
import e0.o0;
import io.meduza.meduza.R;
import java.util.WeakHashMap;
import l.z0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public h f605a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f606b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f607c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f608d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f609e;
    public TextView f;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f610o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView f611p;

    /* renamed from: q, reason: collision with root package name */
    public LinearLayout f612q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f613r;

    /* renamed from: s, reason: collision with root package name */
    public int f614s;
    public Context t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f615u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f616v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f617w;

    /* renamed from: x, reason: collision with root package name */
    public LayoutInflater f618x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f619y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z0 m10 = z0.m(getContext(), attributeSet, a0.E, R.attr.listMenuViewStyle);
        this.f613r = m10.e(5);
        this.f614s = m10.i(1, -1);
        this.f615u = m10.a(7, false);
        this.t = context;
        this.f616v = m10.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f617w = obtainStyledAttributes.hasValue(0);
        m10.n();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f618x == null) {
            this.f618x = LayoutInflater.from(getContext());
        }
        return this.f618x;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f610o;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f611p;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f611p.getLayoutParams();
        rect.top = this.f611p.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
    @Override // androidx.appcompat.view.menu.k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.appcompat.view.menu.h r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(androidx.appcompat.view.menu.h):void");
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f605a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f613r;
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        setBackground(drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f608d = textView;
        int i10 = this.f614s;
        if (i10 != -1) {
            textView.setTextAppearance(this.t, i10);
        }
        this.f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f610o = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f616v);
        }
        this.f611p = (ImageView) findViewById(R.id.group_divider);
        this.f612q = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f606b != null && this.f615u) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f606b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f607c == null && this.f609e == null) {
            return;
        }
        if ((this.f605a.f712x & 4) != 0) {
            if (this.f607c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f607c = radioButton;
                LinearLayout linearLayout = this.f612q;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f607c;
            view = this.f609e;
        } else {
            if (this.f609e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f609e = checkBox;
                LinearLayout linearLayout2 = this.f612q;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f609e;
            view = this.f607c;
        }
        if (z10) {
            compoundButton.setChecked(this.f605a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f609e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f607c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f605a.f712x & 4) != 0) {
            if (this.f607c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f607c = radioButton;
                LinearLayout linearLayout = this.f612q;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f607c;
        } else {
            if (this.f609e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f609e = checkBox;
                LinearLayout linearLayout2 = this.f612q;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f609e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f619y = z10;
        this.f615u = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f611p;
        if (imageView != null) {
            imageView.setVisibility((this.f617w || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f605a.f703n.f682s || this.f619y;
        if (z10 || this.f615u) {
            ImageView imageView = this.f606b;
            if (imageView == null && drawable == null && !this.f615u) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f606b = imageView2;
                LinearLayout linearLayout = this.f612q;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f615u) {
                this.f606b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f606b;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f606b.getVisibility() != 0) {
                this.f606b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i10;
        TextView textView;
        if (charSequence != null) {
            this.f608d.setText(charSequence);
            if (this.f608d.getVisibility() == 0) {
                return;
            }
            textView = this.f608d;
            i10 = 0;
        } else {
            i10 = 8;
            if (this.f608d.getVisibility() == 8) {
                return;
            } else {
                textView = this.f608d;
            }
        }
        textView.setVisibility(i10);
    }
}

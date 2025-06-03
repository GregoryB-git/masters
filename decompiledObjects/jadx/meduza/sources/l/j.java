package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import l.q0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f9358b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static j f9359c;

    /* renamed from: a, reason: collision with root package name */
    public q0 f9360a;

    public class a implements q0.f {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f9361a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b, reason: collision with root package name */
        public final int[] f9362b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, io.meduza.meduza.R.drawable.abc_seekbar_tick_mark_material, io.meduza.meduza.R.drawable.abc_ic_menu_share_mtrl_alpha, io.meduza.meduza.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, io.meduza.meduza.R.drawable.abc_ic_menu_cut_mtrl_alpha, io.meduza.meduza.R.drawable.abc_ic_menu_selectall_mtrl_alpha, io.meduza.meduza.R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c, reason: collision with root package name */
        public final int[] f9363c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, io.meduza.meduza.R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d, reason: collision with root package name */
        public final int[] f9364d = {R.drawable.abc_popup_background_mtrl_mult, io.meduza.meduza.R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e, reason: collision with root package name */
        public final int[] f9365e = {io.meduza.meduza.R.drawable.abc_tab_indicator_material, io.meduza.meduza.R.drawable.abc_textfield_search_material};
        public final int[] f = {io.meduza.meduza.R.drawable.abc_btn_check_material, io.meduza.meduza.R.drawable.abc_btn_radio_material, io.meduza.meduza.R.drawable.abc_btn_check_material_anim, io.meduza.meduza.R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i10) {
            int c10 = u0.c(context, io.meduza.meduza.R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{u0.f9480b, u0.f9482d, u0.f9481c, u0.f}, new int[]{u0.b(context, io.meduza.meduza.R.attr.colorButtonNormal), x.a.b(c10, i10), x.a.b(c10, i10), i10});
        }

        public static void d(Drawable drawable, int i10, PorterDuff.Mode mode) {
            PorterDuffColorFilter h10;
            int[] iArr = i0.f9356a;
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = j.f9358b;
            }
            PorterDuff.Mode mode2 = j.f9358b;
            synchronized (j.class) {
                h10 = q0.h(i10, mode);
            }
            mutate.setColorFilter(h10);
        }

        public final ColorStateList c(Context context, int i10) {
            if (i10 == io.meduza.meduza.R.drawable.abc_edit_text_material) {
                return v.a.getColorStateList(context, io.meduza.meduza.R.color.abc_tint_edittext);
            }
            if (i10 == 2131230786) {
                return v.a.getColorStateList(context, io.meduza.meduza.R.color.abc_tint_switch_track);
            }
            if (i10 != io.meduza.meduza.R.drawable.abc_switch_thumb_material) {
                if (i10 == io.meduza.meduza.R.drawable.abc_btn_default_mtrl_shape) {
                    return b(context, u0.c(context, io.meduza.meduza.R.attr.colorButtonNormal));
                }
                if (i10 == io.meduza.meduza.R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i10 == io.meduza.meduza.R.drawable.abc_btn_colored_material) {
                    return b(context, u0.c(context, io.meduza.meduza.R.attr.colorAccent));
                }
                if (i10 == 2131230781 || i10 == io.meduza.meduza.R.drawable.abc_spinner_textfield_background_material) {
                    return v.a.getColorStateList(context, io.meduza.meduza.R.color.abc_tint_spinner);
                }
                if (a(this.f9362b, i10)) {
                    return u0.d(context, io.meduza.meduza.R.attr.colorControlNormal);
                }
                if (a(this.f9365e, i10)) {
                    return v.a.getColorStateList(context, io.meduza.meduza.R.color.abc_tint_default);
                }
                if (a(this.f, i10)) {
                    return v.a.getColorStateList(context, io.meduza.meduza.R.color.abc_tint_btn_checkable);
                }
                if (i10 == io.meduza.meduza.R.drawable.abc_seekbar_thumb_material) {
                    return v.a.getColorStateList(context, io.meduza.meduza.R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d10 = u0.d(context, io.meduza.meduza.R.attr.colorSwitchThumbNormal);
            if (d10 == null || !d10.isStateful()) {
                iArr[0] = u0.f9480b;
                iArr2[0] = u0.b(context, io.meduza.meduza.R.attr.colorSwitchThumbNormal);
                iArr[1] = u0.f9483e;
                iArr2[1] = u0.c(context, io.meduza.meduza.R.attr.colorControlActivated);
                iArr[2] = u0.f;
                iArr2[2] = u0.c(context, io.meduza.meduza.R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = u0.f9480b;
                iArr[0] = iArr3;
                iArr2[0] = d10.getColorForState(iArr3, 0);
                iArr[1] = u0.f9483e;
                iArr2[1] = u0.c(context, io.meduza.meduza.R.attr.colorControlActivated);
                iArr[2] = u0.f;
                iArr2[2] = d10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (f9359c == null) {
                c();
            }
            jVar = f9359c;
        }
        return jVar;
    }

    public static synchronized void c() {
        synchronized (j.class) {
            if (f9359c == null) {
                j jVar = new j();
                f9359c = jVar;
                jVar.f9360a = q0.d();
                q0 q0Var = f9359c.f9360a;
                a aVar = new a();
                synchronized (q0Var) {
                    q0Var.f9451g = aVar;
                }
            }
        }
    }

    public static void d(Drawable drawable, x0 x0Var, int[] iArr) {
        PorterDuff.Mode mode = q0.f9443h;
        int[] state = drawable.getState();
        int[] iArr2 = i0.f9356a;
        if (!(drawable.mutate() == drawable)) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = x0Var.f9495d;
        if (z10 || x0Var.f9494c) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z10 ? x0Var.f9492a : null;
            PorterDuff.Mode mode2 = x0Var.f9494c ? x0Var.f9493b : q0.f9443h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = q0.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f9360a.f(context, i10);
    }
}

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.StringRes
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  com.squareup.picasso.Picasso
 *  com.squareup.picasso.Transformation
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 *  javax.inject.Inject
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  tvrain.managers.DrawerManager$init$1
 */
package tvrain.managers;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.hintsolutions.raintv.RainApplication;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.utils.CircularTransformation;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.holder.BadgeStyle;
import com.mikepenz.materialdrawer.holder.StringHolder;
import com.mikepenz.materialdrawer.interfaces.OnCheckedChangeListener;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SwitchDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.util.DrawerImageLoader;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.tvrain.core.data.Playlist;
import ru.tvrain.core.data.UserInfo;
import ru.tvrain.core.data.rain_country.RCProfileInfo;
import tvrain.managers.DrawerManager;
import tvrain.managers.PrefsManager;

@Metadata(d1={"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 U2\u00020\u0001:\u0002UVB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J%\u0010#\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010%0$2\u0006\u0010&\u001a\u00020\nH\u0002\u00a2\u0006\u0002\u0010'J\u0012\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002J(\u0010,\u001a\"\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030%0-j\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030%`.H\u0002J\u0012\u0010/\u001a\u0002002\b\b\u0001\u00101\u001a\u000202H\u0002J\u000e\u00103\u001a\u00020!2\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u000207J\b\u00108\u001a\u000207H\u0002J\u0006\u00109\u001a\u00020!J\u0010\u0010:\u001a\u00020!2\u0006\u0010&\u001a\u00020\nH\u0002J\u0006\u0010;\u001a\u00020!J\u0006\u0010<\u001a\u00020!J\u0018\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020\u000e2\b\b\u0001\u0010?\u001a\u000202J\u0010\u0010@\u001a\u00020!2\u0006\u0010A\u001a\u00020\nH\u0002J\u0014\u0010B\u001a\u00020!2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0006\u0010C\u001a\u00020!J\u0016\u0010D\u001a\u00020!2\u0006\u0010E\u001a\u00020\u000e2\u0006\u0010F\u001a\u000207J\u0018\u0010G\u001a\u00020!2\u0006\u0010H\u001a\u00020\u000e2\b\u0010I\u001a\u0004\u0018\u00010JJ\u001a\u0010K\u001a\u00020!2\b\u0010L\u001a\u0004\u0018\u00010+2\b\u0010M\u001a\u0004\u0018\u00010NJ\u000e\u0010O\u001a\u00020!2\u0006\u0010P\u001a\u000202J\u000e\u0010Q\u001a\u0002072\u0006\u0010R\u001a\u000207J\u001a\u0010S\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010T\u001a\u0004\u0018\u00010)R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006W"}, d2={"Ltvrain/managers/DrawerManager;", "", "activity", "Lcom/hintsolutions/raintv/common/BaseActivity;", "onCheckedChangeListener", "Lcom/mikepenz/materialdrawer/interfaces/OnCheckedChangeListener;", "(Lcom/hintsolutions/raintv/common/BaseActivity;Lcom/mikepenz/materialdrawer/interfaces/OnCheckedChangeListener;)V", "getActivity", "()Lcom/hintsolutions/raintv/common/BaseActivity;", "currentState", "Ltvrain/managers/DrawerManager$MenuState;", "drawer", "Lcom/mikepenz/materialdrawer/Drawer;", "lastDrawerSelectionId", "", "getLastDrawerSelectionId", "()J", "setLastDrawerSelectionId", "(J)V", "getOnCheckedChangeListener", "()Lcom/mikepenz/materialdrawer/interfaces/OnCheckedChangeListener;", "setOnCheckedChangeListener", "(Lcom/mikepenz/materialdrawer/interfaces/OnCheckedChangeListener;)V", "playlists", "", "Lru/tvrain/core/data/Playlist;", "prefsManager", "Ltvrain/managers/PrefsManager;", "getPrefsManager", "()Ltvrain/managers/PrefsManager;", "setPrefsManager", "(Ltvrain/managers/PrefsManager;)V", "closeDrawer", "", "destroy", "getDrawerItemsForState", "", "Lcom/mikepenz/materialdrawer/model/interfaces/IDrawerItem;", "state", "(Ltvrain/managers/DrawerManager$MenuState;)[Lcom/mikepenz/materialdrawer/model/interfaces/IDrawerItem;", "getHeaderView", "Landroid/view/View;", "user", "Lru/tvrain/core/data/UserInfo;", "getLiveSubItems", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getString", "", "resId", "", "init", "listener", "Lcom/mikepenz/materialdrawer/Drawer$OnDrawerItemClickListener;", "isDrawerOpen", "", "isPushEnabled", "openDrawer", "refreshDrawerItems", "scrollToTop", "setEmptyHeader", "setItemIcon", "identitier", "iconRes", "setMenuState", "newState", "setPlaylists", "setPreviousSelection", "setSelection", "selectionId", "fire", "updateBadge", "id", "text", "Lcom/mikepenz/materialdrawer/holder/StringHolder;", "updateDrawerHeader", "rainUser", "rcProfileInfo", "Lru/tvrain/core/data/rain_country/RCProfileInfo;", "updateFavoritesBadge", "favoritesCount", "updateMenuState", "isAuthorized", "updateSubscriptionDaysInfo", "headerView", "Companion", "MenuState", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class DrawerManager {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long idAd = 12L;
    public static final long idAudio = 8L;
    public static final long idFavorites = 17L;
    public static final long idLogin = 15L;
    public static final long idLogout = 14L;
    public static final long idMain = 4L;
    public static final long idNotifications = 2L;
    public static final long idOffer = 11L;
    public static final long idProfile = 3L;
    public static final long idPrograms = 6L;
    public static final long idPush = 9L;
    public static final long idRainCountry = 1L;
    public static final long idRate = 13L;
    public static final long idSchedule = 5L;
    public static final long idSupport = 10L;
    public static final long idWatch = 20L;
    public static final long idWatchPlaylistAdd = 100L;
    @NotNull
    private final BaseActivity activity;
    @NotNull
    private MenuState currentState;
    @Nullable
    private Drawer drawer;
    private long lastDrawerSelectionId;
    @Nullable
    private OnCheckedChangeListener onCheckedChangeListener;
    @Nullable
    private List<? extends Playlist> playlists;
    @Inject
    public PrefsManager prefsManager;

    public DrawerManager(@NotNull BaseActivity baseActivity, @Nullable OnCheckedChangeListener onCheckedChangeListener) {
        Intrinsics.checkNotNullParameter((Object)baseActivity, (String)"activity");
        this.activity = baseActivity;
        this.onCheckedChangeListener = onCheckedChangeListener;
        RainApplication.getAppComponent().inject(this);
        this.lastDrawerSelectionId = -1L;
        this.currentState = MenuState.STATE_UNINITIALIZED;
    }

    private final IDrawerItem<?, ?>[] getDrawerItemsForState(MenuState objectArray) {
        ArrayList<IDrawerItem<?, ?>> arrayList = this.getLiveSubItems();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)new PrimaryDrawerItem().withName(this.getString(2131755216))).withIdentifier(4L)).withIcon(2131231278)).withSelectedIcon(2131231279));
        arrayList2.add(((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)new PrimaryDrawerItem().withName(this.getString(2131755224))).withIdentifier(5L)).withIcon(2131231296)).withSelectedIcon(2131231297));
        arrayList2.add((Object)new DividerDrawerItem());
        arrayList2.add(((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)new PrimaryDrawerItem().withName(this.getString(2131755211))).withIdentifier(8L)).withIcon(2131231267)).withSelectedIcon(2131231268));
        arrayList2.add(((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)new PrimaryDrawerItem().withName(this.getString(2131755226))).withIdentifier(20L)).withIcon(2131231272)).withSelectedIcon(2131231273)).withSubItems((List<IDrawerItem>)arrayList)).withIsExpanded(true));
        arrayList2.add(((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)new PrimaryDrawerItem().withName(this.getString(2131755220))).withIdentifier(6L)).withIcon(2131231288)).withSelectedIcon(2131231289));
        arrayList2.add((Object)new DividerDrawerItem());
        arrayList2.add(((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)new PrimaryDrawerItem().withName(this.getString(2131755213))).withIdentifier(17L)).withIcon(2131231269)).withSelectedIcon(2131231270)).withBadgeStyle(new BadgeStyle().withBadgeBackground(this.activity.getResources().getDrawable(2131230969))));
        arrayList2.add((Object)new DividerDrawerItem());
        arrayList2.add(((SwitchDrawerItem)((SwitchDrawerItem)((SwitchDrawerItem)((SwitchDrawerItem)((SwitchDrawerItem)((SwitchDrawerItem)new SwitchDrawerItem().withName(this.getString(2131755221))).withIdentifier(9L)).withIcon(2131231290)).withSelectedIcon(2131231291)).withChecked(this.isPushEnabled())).withOnCheckedChangeListener(this.onCheckedChangeListener)).withSelectable(false));
        arrayList2.add(((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)new PrimaryDrawerItem().withName(this.getString(2131755225))).withIdentifier(10L)).withIcon(2131231299)).withSelectedIcon(2131231300));
        arrayList2.add(((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)new PrimaryDrawerItem().withName(this.getString(2131755218))).withIdentifier(11L)).withIcon(2131231284)).withSelectedIcon(2131231285));
        arrayList2.add(((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)new PrimaryDrawerItem().withName(this.getString(2131755212))).withIdentifier(12L)).withIcon(2131231265)).withSelectedIcon(2131231266));
        arrayList2.add(((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)new PrimaryDrawerItem().withName(this.getString(2131755223))).withIdentifier(13L)).withIcon(2131231292)).withSelectedIcon(2131231293));
        if (objectArray == MenuState.STATE_LOGGED_IN) {
            arrayList2.add(((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)new PrimaryDrawerItem().withName(this.getString(2131755215))).withIdentifier(14L)).withIcon(2131231276)).withSelectedIcon(2131231277));
        }
        objectArray = arrayList2.toArray((Object[])new IDrawerItem[0]);
        Intrinsics.checkNotNull((Object)objectArray, (String)"null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (IDrawerItem[])objectArray;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final View getHeaderView(UserInfo var1_1) {
        if (var1_1 == null) ** GOTO lbl27
        var2_5 = View.inflate((Context)this.activity, (int)2131492954, null);
        var3_6 = var2_5.findViewById(2131296947);
        Intrinsics.checkNotNull((Object)var3_6, (String)"null cannot be cast to non-null type android.widget.TextView");
        ((TextView)var3_6).setText((CharSequence)var1_1.getName());
        this.updateSubscriptionDaysInfo((UserInfo)var1_1, var2_5);
        {
            catch (Exception var1_3) {
                var1_3.printStackTrace();
                var1_4 = View.inflate((Context)this.activity, (int)2131492955, null);
                Intrinsics.checkNotNullExpressionValue((Object)var1_4, (String)"inflate(activity, R.layo\u2026wer_header_no_auth, null)");
                return var1_4;
            }
        }
        try {
            if (!TextUtils.isEmpty((CharSequence)var1_1.avatar)) {
                var3_6 = var2_5.findViewById(2131296383);
                Intrinsics.checkNotNull((Object)var3_6, (String)"null cannot be cast to non-null type android.widget.ImageView");
                var3_6 = (ImageView)var3_6;
                var4_7 = Picasso.get().load(var1_1.avatar);
                var1_1 = new CircularTransformation();
                var4_7.transform((Transformation)var1_1).placeholder(2131231353).error(2131231353).into((ImageView)var3_6);
            }
            ** GOTO lbl25
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
lbl25:
            // 2 sources

            Intrinsics.checkNotNullExpressionValue((Object)var2_5, (String)"headerView");
            return var2_5;
lbl27:
            // 1 sources

            var1_1 = View.inflate((Context)this.activity, (int)2131492955, null);
            Intrinsics.checkNotNullExpressionValue((Object)var1_1, (String)"inflate(activity, R.layo\u2026wer_header_no_auth, null)");
            return var1_1;
        }
    }

    private final ArrayList<IDrawerItem<?, ?>> getLiveSubItems() {
        ArrayList arrayList = new ArrayList();
        Object object2 = this.playlists;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            for (Object object2 : object2) {
                arrayList.add(((SecondaryDrawerItem)((SecondaryDrawerItem)new SecondaryDrawerItem().withName(object2.name)).withIdentifier((long)object2.id.intValue() + 100L)).withLevel(2));
            }
        }
        return arrayList;
    }

    private final String getString(@StringRes int n3) {
        String string2 = this.activity.getString(n3);
        Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"activity.getString(resId)");
        return string2;
    }

    private final boolean isPushEnabled() {
        return this.getPrefsManager().getBoolean("push", true);
    }

    private final void refreshDrawerItems(MenuState object) {
        Drawer drawer = this.drawer;
        if (drawer != null) {
            Intrinsics.checkNotNull((Object)drawer);
            drawer.removeAllItems();
            drawer.removeAllStickyFooterItems();
            Object[] objectArray = this.getDrawerItemsForState((MenuState)((Object)object));
            drawer.addItems((IDrawerItem[])Arrays.copyOf((Object[])objectArray, (int)objectArray.length));
            if (object == MenuState.STATE_UNAUTHORIZED) {
                object = this.drawer;
                if (object != null) {
                    ((Drawer)object).addStickyFooterItem((IDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)((PrimaryDrawerItem)new PrimaryDrawerItem().withName(this.getString(2131755214))).withIdentifier(15L)).withIcon(2131231274)).withSelectedIcon(2131231275));
                }
                if ((object = this.drawer) != null) {
                    ((Drawer)object).setHeader(this.getHeaderView(null));
                }
            }
        }
    }

    private final void setMenuState(MenuState menuState) {
        this.refreshDrawerItems(menuState);
        if (this.currentState == MenuState.STATE_UNINITIALIZED) {
            if (this.activity.getIntent().hasExtra("show_profile")) {
                Drawer drawer = this.drawer;
                if (drawer != null) {
                    drawer.setSelection(3L, true);
                }
            } else if (this.activity.getIntent().hasExtra("auth")) {
                Drawer drawer = this.drawer;
                if (drawer != null) {
                    drawer.setSelection(15L, true);
                }
            } else if (this.activity.getIntent().hasExtra("rain_country")) {
                Drawer drawer = this.drawer;
                if (drawer != null) {
                    drawer.setSelection(1L, true);
                }
            } else if (this.activity.getIntent().hasExtra("favorites")) {
                Drawer drawer = this.drawer;
                if (drawer != null) {
                    drawer.setSelection(17L, true);
                }
            } else {
                Drawer drawer = this.drawer;
                if (drawer != null) {
                    drawer.setSelection(4L, true);
                }
            }
        }
        this.currentState = menuState;
    }

    public final void closeDrawer() {
        Drawer drawer = this.drawer;
        if (drawer != null) {
            drawer.closeDrawer();
        }
    }

    public final void destroy() {
        Drawer drawer = this.drawer;
        if (drawer != null) {
            drawer.setOnDrawerItemClickListener(null);
        }
        this.onCheckedChangeListener = null;
    }

    @NotNull
    public final BaseActivity getActivity() {
        return this.activity;
    }

    public final long getLastDrawerSelectionId() {
        return this.lastDrawerSelectionId;
    }

    @Nullable
    public final OnCheckedChangeListener getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    @NotNull
    public final PrefsManager getPrefsManager() {
        PrefsManager prefsManager = this.prefsManager;
        if (prefsManager != null) {
            return prefsManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)"prefsManager");
        return null;
    }

    public final void init(@NotNull Drawer.OnDrawerItemClickListener object) {
        Intrinsics.checkNotNullParameter((Object)object, (String)"listener");
        DrawerImageLoader.init((DrawerImageLoader.IDrawerImageLoader)new init.1());
        object = new DrawerBuilder().withActivity((Activity)this.activity).withSliderBackgroundColorRes(2131100751).withOnDrawerItemClickListener((Drawer.OnDrawerItemClickListener)object);
        try {
            this.drawer = ((DrawerBuilder)object).withHeader(this.getHeaderView(null)).build();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final boolean isDrawerOpen() {
        Drawer drawer = this.drawer;
        if (drawer != null) {
            Intrinsics.checkNotNull((Object)drawer);
            return drawer.isDrawerOpen();
        }
        return false;
    }

    public final void openDrawer() {
        Drawer drawer = this.drawer;
        if (drawer != null) {
            drawer.openDrawer();
        }
    }

    public final void scrollToTop() {
        Drawer drawer;
        block6: {
            block5: {
                drawer = this.drawer;
                if (drawer == null) break block5;
                drawer = drawer.getRecyclerView();
                if (drawer == null) break block5;
                drawer = drawer.getLayoutManager();
                break block6;
            }
            drawer = null;
        }
        try {
            Intrinsics.checkNotNull((Object)drawer, (String)"null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager)drawer).scrollToPositionWithOffset(0, 0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final void setEmptyHeader() {
        Drawer drawer = this.drawer;
        if (drawer != null) {
            drawer.setHeader(this.getHeaderView(null));
        }
    }

    public final void setItemIcon(long l4, @DrawableRes int n3) {
        Object object = this.drawer;
        object = object != null ? ((Drawer)object).getDrawerItem(l4) : null;
        Intrinsics.checkNotNull((Object)object, (String)"null cannot be cast to non-null type com.mikepenz.materialdrawer.model.PrimaryDrawerItem");
        ((PrimaryDrawerItem)object).withIcon(n3);
    }

    public final void setLastDrawerSelectionId(long l4) {
        this.lastDrawerSelectionId = l4;
    }

    public final void setOnCheckedChangeListener(@Nullable OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public final void setPlaylists(@NotNull List<? extends Playlist> list) {
        Intrinsics.checkNotNullParameter(list, (String)"playlists");
        this.playlists = list;
        this.refreshDrawerItems(this.currentState);
    }

    public final void setPrefsManager(@NotNull PrefsManager prefsManager) {
        Intrinsics.checkNotNullParameter((Object)prefsManager, (String)"<set-?>");
        this.prefsManager = prefsManager;
    }

    public final void setPreviousSelection() {
        Drawer drawer = this.drawer;
        if (drawer != null) {
            drawer.setSelection(this.lastDrawerSelectionId, false);
        }
    }

    public final void setSelection(long l4, boolean bl) {
        Drawer drawer = this.drawer;
        if (drawer != null) {
            drawer.setSelection(l4, bl);
        }
    }

    public final void updateBadge(long l4, @Nullable StringHolder stringHolder) {
        Drawer drawer = this.drawer;
        if (drawer != null) {
            drawer.updateBadge(l4, stringHolder);
        }
    }

    public final void updateDrawerHeader(@Nullable UserInfo userInfo, @Nullable RCProfileInfo object) {
        object = this.drawer;
        if (object != null) {
            ((Drawer)object).setHeader(this.getHeaderView(userInfo));
        }
        this.scrollToTop();
    }

    public final void updateFavoritesBadge(int n3) {
        String string2;
        if (n3 > 0) {
            string2 = n3 < 100 ? String.valueOf((int)n3) : "99+";
            this.setItemIcon(17L, 2131231270);
        } else {
            this.setItemIcon(17L, 2131231269);
            string2 = null;
        }
        this.updateBadge(17L, new StringHolder((CharSequence)string2));
    }

    public final boolean updateMenuState(boolean bl) {
        MenuState menuState = bl ? MenuState.STATE_LOGGED_IN : MenuState.STATE_UNAUTHORIZED;
        if (this.currentState != menuState) {
            this.setMenuState(menuState);
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public final void updateSubscriptionDaysInfo(@Nullable UserInfo var1_1, @Nullable View var2_2) {
        block10: {
            block12: {
                block11: {
                    if (var1_1 == null) {
                        return;
                    }
                    var3_4 = null;
                    if (var2_2 == null) ** GOTO lbl10
                    var2_2 = var2_2.findViewById(2131297174);
                    Intrinsics.checkNotNull((Object)var2_2, (String)"null cannot be cast to non-null type android.widget.TextView");
                    var2_2 = (TextView)var2_2;
                    break block10;
lbl10:
                    // 1 sources

                    var2_2 = this.drawer;
                    if (var2_2 == null) break block11;
                    try {
                        var2_2 = var2_2.getDrawerLayout();
                        if (var2_2 == null) break block11;
                    }
                    catch (Exception var2_3) {
                        var2_2 = var3_4;
                        ** continue;
                    }
                    var2_2 = (TextView)var2_2.findViewById(2131297174);
                    break block12;
                }
                var2_2 = null;
            }
            Intrinsics.checkNotNull((Object)var2_2, (String)"null cannot be cast to non-null type android.widget.TextView");
        }
lbl27:
        // 2 sources

        while (true) {
            if (var2_2 == null) {
                return;
            }
            var3_4 = var1_1.vip;
            if (var3_4 == null) ** GOTO lbl-1000
            Intrinsics.checkNotNullExpressionValue((Object)var3_4, (String)"user.vip");
            if (var3_4 > 0) {
                var4_5 = this.activity.getResources();
                var3_4 = var1_1.vip;
                Intrinsics.checkNotNullExpressionValue((Object)var3_4, (String)"user.vip");
                var2_2.setText((CharSequence)var4_5.getQuantityString(2131623937, var3_4.intValue(), new Object[]{var1_1.vip}));
            } else lbl-1000:
            // 2 sources

            {
                var2_2.setVisibility(8);
            }
            return;
        }
    }

    @Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2={"Ltvrain/managers/DrawerManager$Companion;", "", "()V", "idAd", "", "idAudio", "idFavorites", "idLogin", "idLogout", "idMain", "idNotifications", "idOffer", "idProfile", "idPrograms", "idPush", "idRainCountry", "idRate", "idSchedule", "idSupport", "idWatch", "idWatchPlaylistAdd", "getItemName", "", "id", "getPlaylistIdByIdentifier", "identitier", "getPlaylistIdentifier", "isPlaylistIdentifier", "", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long getPlaylistIdentifier(long l4) {
            return l4 + 100L;
        }

        @NotNull
        public final String getItemName(long l4) {
            if (l4 == 1L) {
                return "rain_country";
            }
            if (l4 == 2L) {
                return "notifications";
            }
            if (l4 == 3L) {
                return "profile";
            }
            if (l4 == 4L) {
                return "main_all_news";
            }
            if (l4 == 5L) {
                return "schedule";
            }
            if (l4 == 6L) {
                return "programs";
            }
            if (l4 == 8L) {
                return "live_audio";
            }
            if (l4 == 9L) {
                return "push_switch";
            }
            if (l4 == 10L) {
                return "support";
            }
            if (l4 == 11L) {
                return "offer";
            }
            if (l4 == 12L) {
                return "ad";
            }
            if (l4 == 13L) {
                return "rate";
            }
            if (l4 == 14L) {
                return "logout";
            }
            if (l4 == 15L) {
                return "login";
            }
            if (l4 == 17L) {
                return "favorites";
            }
            if (l4 == 20L) {
                return "watch";
            }
            if (this.isPlaylistIdentifier(l4)) {
                StringBuilder stringBuilder = z2.t("playlist_");
                stringBuilder.append(this.getPlaylistIdByIdentifier(l4));
                return stringBuilder.toString();
            }
            return "";
        }

        public final long getPlaylistIdByIdentifier(long l4) {
            return l4 - 100L;
        }

        public final boolean isPlaylistIdentifier(long l4) {
            boolean bl = l4 > 100L;
            return bl;
        }
    }

    @Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Ltvrain/managers/DrawerManager$MenuState;", "", "(Ljava/lang/String;I)V", "STATE_LOGGED_IN", "STATE_UNAUTHORIZED", "STATE_UNINITIALIZED", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
    public static enum MenuState {
        STATE_LOGGED_IN,
        STATE_UNAUTHORIZED,
        STATE_UNINITIALIZED;

    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  com.hintsolutions.raintv.common.BaseActivity
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 *  ru.tvrain.core.data.Article
 */
package com.hintsolutions.raintv.utils;

import android.content.SharedPreferences;
import com.hintsolutions.raintv.common.BaseActivity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import ru.tvrain.core.data.Article;

public class AddToFavoritesHelper {
    private static final String PREFS_NAME = "tvrain";
    private static final String PREF_ADD_TO_FAVORITES = "addToFavorites";
    private BaseActivity activity;

    public AddToFavoritesHelper(BaseActivity baseActivity) {
        this.activity = baseActivity;
    }

    public static /* synthetic */ void a(AddToFavoritesHelper addToFavoritesHelper, int n) {
        addToFavoritesHelper.lambda$process$0(n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Set<Integer> get() {
        HashSet hashSet = new HashSet();
        for (String string2 : this.activity.getSharedPreferences(PREFS_NAME, 0).getStringSet(PREF_ADD_TO_FAVORITES, (Set)new HashSet())) {
            try {
                hashSet.add((Object)Integer.parseInt((String)string2));
            }
            catch (Exception exception) {}
        }
        return hashSet;
    }

    private /* synthetic */ void lambda$process$0(int n) {
        this.remove(n);
    }

    private void remove(int n) {
        SharedPreferences sharedPreferences = this.activity.getSharedPreferences(PREFS_NAME, 0);
        Set set = sharedPreferences.getStringSet(PREF_ADD_TO_FAVORITES, (Set)new HashSet());
        set.remove((Object)String.valueOf((int)n));
        sharedPreferences = sharedPreferences.edit();
        sharedPreferences.clear();
        sharedPreferences.putStringSet(PREF_ADD_TO_FAVORITES, set);
        sharedPreferences.commit();
    }

    public void add(int n) {
        SharedPreferences sharedPreferences = this.activity.getSharedPreferences(PREFS_NAME, 0);
        Set set = sharedPreferences.getStringSet(PREF_ADD_TO_FAVORITES, (Set)new HashSet());
        set.add((Object)String.valueOf((int)n));
        sharedPreferences = sharedPreferences.edit();
        sharedPreferences.clear();
        sharedPreferences.putStringSet(PREF_ADD_TO_FAVORITES, set);
        sharedPreferences.commit();
    }

    public void process() {
        Iterator iterator = this.get().iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            Article article = new Article();
            article.id = n;
            this.activity.addToFavorites(article, true, (Runnable)new c4(this, n, 2), false);
        }
    }
}


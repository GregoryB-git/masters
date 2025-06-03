/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.tagmanager.DataLayer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Map
 */
package tvrain.analytics.tagmanager;

import com.google.android.gms.tagmanager.DataLayer;
import java.util.ArrayList;
import java.util.Map;
import tvrain.analytics.tagmanager.TagManager;

public class TagManagerUtils {
    public static void logOpenViewWithPayWall(TagManager tagManager, String string2, String ... map) {
        map = TagManagerUtils.preparePayWallViewParams((String[])map);
        map.putAll(DataLayer.mapOf((Object[])new Object[]{"event", "screenview", "screenname", string2}));
        tagManager.log(map);
    }

    public static void logPayWallClick(TagManager tagManager, String string2) {
        tagManager.log((Map<String, Object>)DataLayer.mapOf((Object[])new Object[]{"event", "promotionClick", "ecommerce", DataLayer.mapOf((Object[])new Object[]{"promoClick", DataLayer.mapOf((Object[])new Object[]{"promotions", DataLayer.listOf((Object[])new Object[]{DataLayer.mapOf((Object[])new Object[]{"name", string2})})})})}));
    }

    public static Map<String, Object> preparePayWallViewParams(String[] stringArray) {
        ArrayList arrayList = new ArrayList();
        int n3 = stringArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            arrayList.add((Object)DataLayer.mapOf((Object[])new Object[]{"name", stringArray[i2]}));
        }
        return DataLayer.mapOf((Object[])new Object[]{"ecommerce", DataLayer.mapOf((Object[])new Object[]{"promoView", DataLayer.mapOf((Object[])new Object[]{"promotions", arrayList})})});
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.ecommerce.ECommerceEvent
 *  com.yandex.metrica.impl.ob.Na
 *  com.yandex.metrica.impl.ob.Pa
 *  com.yandex.metrica.impl.ob.Ra
 *  com.yandex.metrica.impl.ob.Ta
 *  com.yandex.metrica.impl.ob.Ua
 *  java.lang.Object
 */
package com.yandex.metrica.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.ecommerce.ECommerceCartItem;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.ecommerce.ECommerceOrder;
import com.yandex.metrica.ecommerce.ECommerceProduct;
import com.yandex.metrica.ecommerce.ECommerceReferrer;
import com.yandex.metrica.ecommerce.ECommerceScreen;
import com.yandex.metrica.impl.ob.Ia;
import com.yandex.metrica.impl.ob.Ja;
import com.yandex.metrica.impl.ob.Ka;
import com.yandex.metrica.impl.ob.Ma;
import com.yandex.metrica.impl.ob.Na;
import com.yandex.metrica.impl.ob.Oa;
import com.yandex.metrica.impl.ob.Pa;
import com.yandex.metrica.impl.ob.Ra;
import com.yandex.metrica.impl.ob.Ta;
import com.yandex.metrica.impl.ob.Ua;
import com.yandex.metrica.impl.ob.Va;
import com.yandex.metrica.impl.ob.Wa;
import com.yandex.metrica.impl.ob.Xa;
import com.yandex.metrica.impl.ob.ua;
import com.yandex.metrica.impl.ob.za;

public class ECommerceEventProvider {
    @NonNull
    public ECommerceEvent addCartItemEvent(@NonNull ECommerceCartItem eCommerceCartItem) {
        return new Ma(4, new Na(eCommerceCartItem), new ua());
    }

    @NonNull
    public ECommerceEvent beginCheckoutEvent(@NonNull ECommerceOrder eCommerceOrder) {
        return new Oa(6, new Pa(eCommerceOrder), new za());
    }

    @NonNull
    public ECommerceEvent purchaseEvent(@NonNull ECommerceOrder eCommerceOrder) {
        return new Oa(7, new Pa(eCommerceOrder), new za());
    }

    @NonNull
    public ECommerceEvent removeCartItemEvent(@NonNull ECommerceCartItem eCommerceCartItem) {
        return new Ma(5, new Na(eCommerceCartItem), new ua());
    }

    @NonNull
    public ECommerceEvent showProductCardEvent(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        return new Va(new Ra(eCommerceProduct), new Ua(eCommerceScreen), new Ia());
    }

    @NonNull
    public ECommerceEvent showProductDetailsEvent(@NonNull ECommerceProduct eCommerceProduct, @Nullable ECommerceReferrer eCommerceReferrer) {
        Ra ra = new Ra(eCommerceProduct);
        eCommerceProduct = eCommerceReferrer == null ? null : new Ta(eCommerceReferrer);
        return new Wa(ra, (Ta)eCommerceProduct, new Ja());
    }

    @NonNull
    public ECommerceEvent showScreenEvent(@NonNull ECommerceScreen eCommerceScreen) {
        return new Xa(new Ua(eCommerceScreen), new Ka());
    }
}


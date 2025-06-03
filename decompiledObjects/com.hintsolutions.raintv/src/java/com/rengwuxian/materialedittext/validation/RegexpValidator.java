/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.regex.Pattern
 */
package com.rengwuxian.materialedittext.validation;

import androidx.annotation.NonNull;
import com.rengwuxian.materialedittext.validation.METValidator;
import java.util.regex.Pattern;

public class RegexpValidator
extends METValidator {
    private Pattern pattern;

    public RegexpValidator(@NonNull String string2, @NonNull String string3) {
        super(string2);
        this.pattern = Pattern.compile((String)string3);
    }

    @Override
    public boolean isValid(@NonNull CharSequence charSequence, boolean bl) {
        return this.pattern.matcher(charSequence).matches();
    }
}


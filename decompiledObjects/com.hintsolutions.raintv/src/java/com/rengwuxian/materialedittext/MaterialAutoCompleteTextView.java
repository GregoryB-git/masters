/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.text.Editable
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.text.method.TransformationMethod
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.widget.AutoCompleteTextView
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.appcompat.widget.AppCompatAutoCompleteTextView
 *  com.nineoldandroids.animation.ArgbEvaluator
 *  com.nineoldandroids.animation.ObjectAnimator
 *  java.lang.CharSequence
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.regex.Pattern
 */
package com.rengwuxian.materialedittext;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.nineoldandroids.animation.ArgbEvaluator;
import com.nineoldandroids.animation.ObjectAnimator;
import com.rengwuxian.materialedittext.Colors;
import com.rengwuxian.materialedittext.Density;
import com.rengwuxian.materialedittext.R;
import com.rengwuxian.materialedittext.validation.METLengthChecker;
import com.rengwuxian.materialedittext.validation.METValidator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class MaterialAutoCompleteTextView
extends AppCompatAutoCompleteTextView {
    public static final int FLOATING_LABEL_HIGHLIGHT = 2;
    public static final int FLOATING_LABEL_NONE = 0;
    public static final int FLOATING_LABEL_NORMAL = 1;
    private Typeface accentTypeface;
    private boolean autoValidate;
    private int baseColor;
    private int bottomEllipsisSize;
    private float bottomLines;
    public ObjectAnimator bottomLinesAnimator;
    private int bottomSpacing;
    private int bottomTextSize;
    private boolean charactersCountValid;
    private boolean checkCharactersCountAtBeginning;
    private Bitmap[] clearButtonBitmaps;
    private boolean clearButtonClicking;
    private boolean clearButtonTouched;
    private float currentBottomLines;
    private int errorColor;
    private int extraPaddingBottom;
    private int extraPaddingLeft;
    private int extraPaddingRight;
    private int extraPaddingTop;
    private boolean firstShown;
    private boolean floatingLabelAlwaysShown;
    private boolean floatingLabelAnimating;
    private boolean floatingLabelEnabled;
    private float floatingLabelFraction;
    private int floatingLabelPadding;
    private boolean floatingLabelShown;
    private CharSequence floatingLabelText;
    private int floatingLabelTextColor;
    private int floatingLabelTextSize;
    private ArgbEvaluator focusEvaluator = new ArgbEvaluator();
    private float focusFraction;
    private String helperText;
    private boolean helperTextAlwaysShown;
    private int helperTextColor = -1;
    private boolean hideUnderline;
    private boolean highlightFloatingLabel;
    private Bitmap[] iconLeftBitmaps;
    private int iconOuterHeight;
    private int iconOuterWidth;
    private int iconPadding;
    private Bitmap[] iconRightBitmaps;
    private int iconSize;
    public View.OnFocusChangeListener innerFocusChangeListener;
    private int innerPaddingBottom;
    private int innerPaddingLeft;
    private int innerPaddingRight;
    private int innerPaddingTop;
    public ObjectAnimator labelAnimator;
    public ObjectAnimator labelFocusAnimator;
    private METLengthChecker lengthChecker;
    private int maxCharacters;
    private int minBottomLines;
    private int minBottomTextLines;
    private int minCharacters;
    public View.OnFocusChangeListener outerFocusChangeListener;
    public Paint paint = new Paint(1);
    private int primaryColor;
    private boolean showClearButton;
    private boolean singleLineEllipsis;
    private String tempErrorText;
    private ColorStateList textColorHintStateList;
    private ColorStateList textColorStateList;
    public StaticLayout textLayout;
    public TextPaint textPaint = new TextPaint(1);
    private Typeface typeface;
    private int underlineColor;
    private boolean validateOnFocusLost;
    private List<METValidator> validators;

    public MaterialAutoCompleteTextView(Context context) {
        super(context);
        this.init(context, null);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(context, attributeSet);
    }

    @TargetApi(value=21)
    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int n4) {
        super(context, attributeSet, n4);
        this.init(context, attributeSet);
    }

    public static /* synthetic */ void access$000(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        materialAutoCompleteTextView.checkCharactersCount();
    }

    public static /* synthetic */ boolean access$100(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        return materialAutoCompleteTextView.autoValidate;
    }

    public static /* synthetic */ boolean access$200(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        return materialAutoCompleteTextView.floatingLabelEnabled;
    }

    public static /* synthetic */ boolean access$300(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        return materialAutoCompleteTextView.floatingLabelShown;
    }

    public static /* synthetic */ boolean access$302(MaterialAutoCompleteTextView materialAutoCompleteTextView, boolean bl) {
        materialAutoCompleteTextView.floatingLabelShown = bl;
        return bl;
    }

    public static /* synthetic */ ObjectAnimator access$400(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        return materialAutoCompleteTextView.getLabelAnimator();
    }

    public static /* synthetic */ boolean access$500(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        return materialAutoCompleteTextView.highlightFloatingLabel;
    }

    public static /* synthetic */ ObjectAnimator access$600(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        return materialAutoCompleteTextView.getLabelFocusAnimator();
    }

    public static /* synthetic */ boolean access$700(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        return materialAutoCompleteTextView.validateOnFocusLost;
    }

    private boolean adjustBottomLines() {
        int n4;
        if (this.getWidth() == 0) {
            return false;
        }
        this.textPaint.setTextSize((float)this.bottomTextSize);
        if (this.tempErrorText == null && this.helperText == null) {
            n4 = this.minBottomLines;
        } else {
            Layout.Alignment alignment = (this.getGravity() & 5) != 5 && !this.isRTL() ? ((this.getGravity() & 3) == 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER) : Layout.Alignment.ALIGN_OPPOSITE;
            String string = this.tempErrorText;
            if (string == null) {
                string = this.helperText;
            }
            alignment = new StaticLayout((CharSequence)string, this.textPaint, this.getWidth() - this.getBottomTextLeftOffset() - this.getBottomTextRightOffset() - this.getPaddingLeft() - this.getPaddingRight(), alignment, 1.0f, 0.0f, true);
            this.textLayout = alignment;
            n4 = Math.max((int)alignment.getLineCount(), (int)this.minBottomTextLines);
        }
        float f = this.bottomLines;
        float f2 = n4;
        if (f != f2) {
            this.getBottomLinesAnimator(f2).start();
        }
        this.bottomLines = f2;
        return true;
    }

    /*
     * Exception decompiling
     */
    private void checkCharactersCount() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at kb.i.q1(SourceFile:14)
         *     at nb.k0.m(SourceFile:8)
         *     at nb.n.b(SourceFile:118)
         *     at nb.n.f(SourceFile:56)
         *     at ib.f.d(SourceFile:172)
         *     at ib.f.e(SourceFile:7)
         *     at ib.f.c(SourceFile:95)
         *     at rc.f.n(SourceFile:11)
         *     at pc.i.m(SourceFile:5)
         *     at pc.d.K(SourceFile:92)
         *     at pc.d.g0(SourceFile:1)
         *     at fb.b.d(SourceFile:191)
         *     at fb.b.c(SourceFile:145)
         *     at fb.a.a(SourceFile:108)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithCFR(SourceFile:76)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:110)
         *     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
         *     at e7.a.run(SourceFile:1)
         *     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
         *     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
         *     at java.lang.Thread.run(Thread.java:1119)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private int checkLength(CharSequence charSequence) {
        METLengthChecker mETLengthChecker = this.lengthChecker;
        if (mETLengthChecker == null) {
            return charSequence.length();
        }
        return mETLengthChecker.getLength(charSequence);
    }

    private void correctPaddings() {
        int n4 = this.iconOuterWidth * this.getButtonsCount();
        boolean bl = this.isRTL();
        int n5 = 0;
        if (!bl) {
            n5 = n4;
            n4 = 0;
        }
        super.setPadding(this.innerPaddingLeft + this.extraPaddingLeft + n4, this.innerPaddingTop + this.extraPaddingTop, this.innerPaddingRight + this.extraPaddingRight + n5, this.innerPaddingBottom + this.extraPaddingBottom);
    }

    private Bitmap[] generateIconBitmaps(@DrawableRes int n4) {
        if (n4 == -1) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        int n5 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource((Resources)this.getResources(), (int)n4, (BitmapFactory.Options)options);
        int n6 = Math.max((int)options.outWidth, (int)options.outHeight);
        int n7 = this.iconSize;
        if (n6 > n7) {
            n5 = n6 / n7;
        }
        options.inSampleSize = n5;
        options.inJustDecodeBounds = false;
        return this.generateIconBitmaps(BitmapFactory.decodeResource((Resources)this.getResources(), (int)n4, (BitmapFactory.Options)options));
    }

    private Bitmap[] generateIconBitmaps(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap[] bitmapArray = new Bitmap[4];
        bitmap = this.scaleIcon(bitmap);
        bitmapArray[0] = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(bitmapArray[0]);
        int n4 = this.baseColor;
        int n5 = Colors.isLight(n4) ? -16777216 : -1979711488;
        canvas.drawColor(n5 | n4 & 0xFFFFFF, PorterDuff.Mode.SRC_IN);
        bitmapArray[1] = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        new Canvas(bitmapArray[1]).drawColor(this.primaryColor, PorterDuff.Mode.SRC_IN);
        bitmapArray[2] = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        canvas = new Canvas(bitmapArray[2]);
        n4 = this.baseColor;
        n5 = Colors.isLight(n4) ? 0x4C000000 : 0x42000000;
        canvas.drawColor(n5 | 0xFFFFFF & n4, PorterDuff.Mode.SRC_IN);
        bitmapArray[3] = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        new Canvas(bitmapArray[3]).drawColor(this.errorColor, PorterDuff.Mode.SRC_IN);
        return bitmapArray;
    }

    private Bitmap[] generateIconBitmaps(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        Bitmap bitmap = Bitmap.createBitmap((int)drawable.getIntrinsicWidth(), (int)drawable.getIntrinsicHeight(), (Bitmap.Config)Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        int n4 = this.iconSize;
        return this.generateIconBitmaps(Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n4, (int)n4, (boolean)false));
    }

    private int getBottomEllipsisWidth() {
        int n4 = this.singleLineEllipsis ? this.bottomEllipsisSize * 5 + this.getPixel(4) : 0;
        return n4;
    }

    private ObjectAnimator getBottomLinesAnimator(float f) {
        ObjectAnimator objectAnimator = this.bottomLinesAnimator;
        if (objectAnimator == null) {
            this.bottomLinesAnimator = ObjectAnimator.ofFloat((Object)((Object)this), (String)"currentBottomLines", (float[])new float[]{f});
        } else {
            objectAnimator.cancel();
            this.bottomLinesAnimator.setFloatValues(new float[]{f});
        }
        return this.bottomLinesAnimator;
    }

    private int getBottomTextLeftOffset() {
        int n4 = this.isRTL() ? this.getCharactersCounterWidth() : this.getBottomEllipsisWidth();
        return n4;
    }

    private int getBottomTextRightOffset() {
        int n4 = this.isRTL() ? this.getBottomEllipsisWidth() : this.getCharactersCounterWidth();
        return n4;
    }

    private int getButtonsCount() {
        return this.isShowClearButton() ? 1 : 0;
    }

    private String getCharactersCounterText() {
        Object object;
        if (this.minCharacters <= 0) {
            int n4;
            if (this.isRTL()) {
                object = new StringBuilder();
                object.append(this.maxCharacters);
                object.append(" / ");
                n4 = this.checkLength((CharSequence)this.getText());
            } else {
                object = new StringBuilder();
                object.append(this.checkLength((CharSequence)this.getText()));
                object.append(" / ");
                n4 = this.maxCharacters;
            }
            object.append(n4);
            object = object.toString();
        } else if (this.maxCharacters <= 0) {
            if (this.isRTL()) {
                object = z2.t("+");
                object.append(this.minCharacters);
                object.append(" / ");
                object.append(this.checkLength((CharSequence)this.getText()));
            } else {
                object = new StringBuilder();
                object.append(this.checkLength((CharSequence)this.getText()));
                object.append(" / ");
                object.append(this.minCharacters);
                object.append("+");
            }
            object = object.toString();
        } else {
            int n5;
            if (this.isRTL()) {
                object = new StringBuilder();
                object.append(this.maxCharacters);
                object.append("-");
                object.append(this.minCharacters);
                object.append(" / ");
                n5 = this.checkLength((CharSequence)this.getText());
            } else {
                object = new StringBuilder();
                object.append(this.checkLength((CharSequence)this.getText()));
                object.append(" / ");
                object.append(this.minCharacters);
                object.append("-");
                n5 = this.maxCharacters;
            }
            object.append(n5);
            object = object.toString();
        }
        return object;
    }

    private int getCharactersCounterWidth() {
        int n4 = this.hasCharactersCounter() ? (int)this.textPaint.measureText(this.getCharactersCounterText()) : 0;
        return n4;
    }

    private Typeface getCustomTypeface(@NonNull String string) {
        return Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), (String)string);
    }

    private ObjectAnimator getLabelAnimator() {
        if (this.labelAnimator == null) {
            this.labelAnimator = ObjectAnimator.ofFloat((Object)((Object)this), (String)"floatingLabelFraction", (float[])new float[]{0.0f, 1.0f});
        }
        ObjectAnimator objectAnimator = this.labelAnimator;
        long l4 = this.floatingLabelAnimating ? 300L : 0L;
        objectAnimator.setDuration(l4);
        return this.labelAnimator;
    }

    private ObjectAnimator getLabelFocusAnimator() {
        if (this.labelFocusAnimator == null) {
            this.labelFocusAnimator = ObjectAnimator.ofFloat((Object)((Object)this), (String)"focusFraction", (float[])new float[]{0.0f, 1.0f});
        }
        return this.labelFocusAnimator;
    }

    private int getPixel(int n4) {
        return Density.dp2px(this.getContext(), n4);
    }

    private boolean hasCharactersCounter() {
        boolean bl = this.minCharacters > 0 || this.maxCharacters > 0;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void init(Context context, AttributeSet attributeSet) {
        int n4;
        this.iconSize = this.getPixel(32);
        this.iconOuterWidth = this.getPixel(48);
        this.iconOuterHeight = this.getPixel(32);
        this.bottomSpacing = this.getResources().getDimensionPixelSize(R.dimen.inner_components_spacing);
        this.bottomEllipsisSize = this.getResources().getDimensionPixelSize(R.dimen.bottom_ellipsis_height);
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialEditText);
        this.textColorStateList = typedArray.getColorStateList(R.styleable.MaterialEditText_met_textColor);
        this.textColorHintStateList = typedArray.getColorStateList(R.styleable.MaterialEditText_met_textColorHint);
        this.baseColor = typedArray.getColor(R.styleable.MaterialEditText_met_baseColor, -16777216);
        TypedValue typedValue = new TypedValue();
        try {
            context.getTheme().resolveAttribute(16843827, typedValue, true);
            n4 = typedValue.data;
        }
        catch (Exception exception) {
            try {
                n4 = this.getResources().getIdentifier("colorPrimary", "attr", this.getContext().getPackageName());
                if (n4 == 0) {
                    RuntimeException runtimeException = new RuntimeException("colorPrimary not found");
                    throw runtimeException;
                }
                context.getTheme().resolveAttribute(n4, typedValue, true);
                n4 = typedValue.data;
            }
            catch (Exception exception2) {
                n4 = this.baseColor;
            }
        }
        this.primaryColor = typedArray.getColor(R.styleable.MaterialEditText_met_primaryColor, n4);
        this.setFloatingLabelInternal(typedArray.getInt(R.styleable.MaterialEditText_met_floatingLabel, 0));
        this.errorColor = typedArray.getColor(R.styleable.MaterialEditText_met_errorColor, Color.parseColor((String)"#e7492E"));
        this.minCharacters = typedArray.getInt(R.styleable.MaterialEditText_met_minCharacters, 0);
        this.maxCharacters = typedArray.getInt(R.styleable.MaterialEditText_met_maxCharacters, 0);
        this.singleLineEllipsis = typedArray.getBoolean(R.styleable.MaterialEditText_met_singleLineEllipsis, false);
        this.helperText = typedArray.getString(R.styleable.MaterialEditText_met_helperText);
        this.helperTextColor = typedArray.getColor(R.styleable.MaterialEditText_met_helperTextColor, -1);
        this.minBottomTextLines = typedArray.getInt(R.styleable.MaterialEditText_met_minBottomTextLines, 0);
        String string = typedArray.getString(R.styleable.MaterialEditText_met_accentTypeface);
        if (string != null && !this.isInEditMode()) {
            string = this.getCustomTypeface(string);
            this.accentTypeface = string;
            this.textPaint.setTypeface((Typeface)string);
        }
        if ((string = typedArray.getString(R.styleable.MaterialEditText_met_typeface)) != null && !this.isInEditMode()) {
            string = this.getCustomTypeface(string);
            this.typeface = string;
            this.setTypeface((Typeface)string);
        }
        string = typedArray.getString(R.styleable.MaterialEditText_met_floatingLabelText);
        this.floatingLabelText = string;
        if (string == null) {
            this.floatingLabelText = this.getHint();
        }
        this.floatingLabelPadding = typedArray.getDimensionPixelSize(R.styleable.MaterialEditText_met_floatingLabelPadding, this.bottomSpacing);
        this.floatingLabelTextSize = typedArray.getDimensionPixelSize(R.styleable.MaterialEditText_met_floatingLabelTextSize, this.getResources().getDimensionPixelSize(R.dimen.floating_label_text_size));
        this.floatingLabelTextColor = typedArray.getColor(R.styleable.MaterialEditText_met_floatingLabelTextColor, -1);
        this.floatingLabelAnimating = typedArray.getBoolean(R.styleable.MaterialEditText_met_floatingLabelAnimating, true);
        this.bottomTextSize = typedArray.getDimensionPixelSize(R.styleable.MaterialEditText_met_bottomTextSize, this.getResources().getDimensionPixelSize(R.dimen.bottom_text_size));
        this.hideUnderline = typedArray.getBoolean(R.styleable.MaterialEditText_met_hideUnderline, false);
        this.underlineColor = typedArray.getColor(R.styleable.MaterialEditText_met_underlineColor, -1);
        this.autoValidate = typedArray.getBoolean(R.styleable.MaterialEditText_met_autoValidate, false);
        this.iconLeftBitmaps = this.generateIconBitmaps(typedArray.getResourceId(R.styleable.MaterialEditText_met_iconLeft, -1));
        this.iconRightBitmaps = this.generateIconBitmaps(typedArray.getResourceId(R.styleable.MaterialEditText_met_iconRight, -1));
        this.showClearButton = typedArray.getBoolean(R.styleable.MaterialEditText_met_clearButton, false);
        this.clearButtonBitmaps = this.generateIconBitmaps(R.drawable.met_ic_clear);
        this.iconPadding = typedArray.getDimensionPixelSize(R.styleable.MaterialEditText_met_iconPadding, this.getPixel(16));
        this.floatingLabelAlwaysShown = typedArray.getBoolean(R.styleable.MaterialEditText_met_floatingLabelAlwaysShown, false);
        this.helperTextAlwaysShown = typedArray.getBoolean(R.styleable.MaterialEditText_met_helperTextAlwaysShown, false);
        this.validateOnFocusLost = typedArray.getBoolean(R.styleable.MaterialEditText_met_validateOnFocusLost, false);
        this.checkCharactersCountAtBeginning = typedArray.getBoolean(R.styleable.MaterialEditText_met_checkCharactersCountAtBeginning, true);
        typedArray.recycle();
        context = context.obtainStyledAttributes(attributeSet, new int[]{16842965, 16842966, 16842967, 16842968, 16842969});
        n4 = context.getDimensionPixelSize(0, 0);
        this.innerPaddingLeft = context.getDimensionPixelSize(1, n4);
        this.innerPaddingTop = context.getDimensionPixelSize(2, n4);
        this.innerPaddingRight = context.getDimensionPixelSize(3, n4);
        this.innerPaddingBottom = context.getDimensionPixelSize(4, n4);
        context.recycle();
        this.setBackground(null);
        if (this.singleLineEllipsis) {
            context = this.getTransformationMethod();
            this.setSingleLine();
            this.setTransformationMethod((TransformationMethod)context);
        }
        this.initMinBottomLines();
        this.initPadding();
        this.initText();
        this.initFloatingLabel();
        this.initTextWatcher();
        this.checkCharactersCount();
    }

    private void initFloatingLabel() {
        View.OnFocusChangeListener onFocusChangeListener;
        this.addTextChangedListener(new TextWatcher(this){
            public final MaterialAutoCompleteTextView this$0;
            {
                this.this$0 = materialAutoCompleteTextView;
            }

            public void afterTextChanged(Editable editable) {
                if (MaterialAutoCompleteTextView.access$200(this.this$0)) {
                    if (editable.length() == 0) {
                        if (MaterialAutoCompleteTextView.access$300(this.this$0)) {
                            MaterialAutoCompleteTextView.access$302(this.this$0, false);
                            MaterialAutoCompleteTextView.access$400(this.this$0).reverse();
                        }
                    } else if (!MaterialAutoCompleteTextView.access$300(this.this$0)) {
                        MaterialAutoCompleteTextView.access$302(this.this$0, true);
                        MaterialAutoCompleteTextView.access$400(this.this$0).start();
                    }
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int n4, int n5, int n6) {
            }

            public void onTextChanged(CharSequence charSequence, int n4, int n5, int n6) {
            }
        });
        this.innerFocusChangeListener = onFocusChangeListener = new View.OnFocusChangeListener(this){
            public final MaterialAutoCompleteTextView this$0;
            {
                this.this$0 = materialAutoCompleteTextView;
            }

            public void onFocusChange(View view, boolean bl) {
                View.OnFocusChangeListener onFocusChangeListener;
                if (MaterialAutoCompleteTextView.access$200(this.this$0) && MaterialAutoCompleteTextView.access$500(this.this$0)) {
                    if (bl) {
                        MaterialAutoCompleteTextView.access$600(this.this$0).start();
                    } else {
                        MaterialAutoCompleteTextView.access$600(this.this$0).reverse();
                    }
                }
                if (MaterialAutoCompleteTextView.access$700(this.this$0) && !bl) {
                    this.this$0.validate();
                }
                if ((onFocusChangeListener = this.this$0.outerFocusChangeListener) != null) {
                    onFocusChangeListener.onFocusChange(view, bl);
                }
            }
        };
        super.setOnFocusChangeListener(onFocusChangeListener);
    }

    private void initMinBottomLines() {
        int n4 = this.minCharacters;
        int n5 = 0;
        n4 = n4 <= 0 && this.maxCharacters <= 0 && !this.singleLineEllipsis && this.tempErrorText == null && this.helperText == null ? 0 : 1;
        int n6 = this.minBottomTextLines;
        if (n6 > 0) {
            n5 = n6;
        } else if (n4 != 0) {
            n5 = 1;
        }
        this.minBottomLines = n5;
        this.currentBottomLines = n5;
    }

    private void initPadding() {
        int n4 = this.floatingLabelEnabled ? this.floatingLabelTextSize + this.floatingLabelPadding : this.floatingLabelPadding;
        this.extraPaddingTop = n4;
        this.textPaint.setTextSize((float)this.bottomTextSize);
        Bitmap[] bitmapArray = this.textPaint.getFontMetrics();
        int n5 = (int)((bitmapArray.descent - bitmapArray.ascent) * this.currentBottomLines);
        n4 = this.hideUnderline ? this.bottomSpacing : this.bottomSpacing * 2;
        this.extraPaddingBottom = n5 + n4;
        bitmapArray = this.iconLeftBitmaps;
        n5 = 0;
        n4 = bitmapArray == null ? 0 : this.iconOuterWidth + this.iconPadding;
        this.extraPaddingLeft = n4;
        if (this.iconRightBitmaps == null) {
            n4 = n5;
        } else {
            n4 = this.iconOuterWidth;
            n4 = this.iconPadding + n4;
        }
        this.extraPaddingRight = n4;
        this.correctPaddings();
    }

    private void initText() {
        if (!TextUtils.isEmpty((CharSequence)this.getText())) {
            Editable editable = this.getText();
            this.setText(null);
            this.resetHintTextColor();
            this.setText((CharSequence)editable);
            this.setSelection(editable.length());
            this.floatingLabelFraction = 1.0f;
            this.floatingLabelShown = true;
        } else {
            this.resetHintTextColor();
        }
        this.resetTextColor();
    }

    private void initTextWatcher() {
        this.addTextChangedListener(new TextWatcher(this){
            public final MaterialAutoCompleteTextView this$0;
            {
                this.this$0 = materialAutoCompleteTextView;
            }

            public void afterTextChanged(Editable editable) {
                MaterialAutoCompleteTextView.access$000(this.this$0);
                if (MaterialAutoCompleteTextView.access$100(this.this$0)) {
                    this.this$0.validate();
                } else {
                    this.this$0.setError(null);
                }
                this.this$0.postInvalidate();
            }

            public void beforeTextChanged(CharSequence charSequence, int n4, int n5, int n6) {
            }

            public void onTextChanged(CharSequence charSequence, int n4, int n5, int n6) {
            }
        });
    }

    private boolean insideClearButton(MotionEvent bitmapArray) {
        float f = bitmapArray.getX();
        float f2 = bitmapArray.getY();
        int n4 = this.getScrollX();
        bitmapArray = this.iconLeftBitmaps;
        boolean bl = false;
        int n5 = bitmapArray == null ? 0 : this.iconOuterWidth + this.iconPadding;
        n4 += n5;
        int n6 = this.getScrollX();
        n5 = this.iconRightBitmaps == null ? this.getWidth() : this.getWidth() - this.iconOuterWidth - this.iconPadding;
        n5 = this.isRTL() ? n4 : n6 + n5 - this.iconOuterWidth;
        int n7 = this.getScrollY();
        n6 = this.getHeight();
        int n8 = this.getPaddingBottom();
        int n9 = this.bottomSpacing;
        n4 = this.iconOuterHeight;
        n6 = n6 + n7 - n8 + n9 - n4;
        boolean bl2 = bl;
        if (f >= (float)n5) {
            bl2 = bl;
            if (f < (float)(n5 + this.iconOuterWidth)) {
                bl2 = bl;
                if (f2 >= (float)n6) {
                    bl2 = bl;
                    if (f2 < (float)(n6 + n4)) {
                        bl2 = true;
                    }
                }
            }
        }
        return bl2;
    }

    private boolean isInternalValid() {
        boolean bl = this.tempErrorText == null && this.isCharactersCountValid();
        return bl;
    }

    @TargetApi(value=17)
    private boolean isRTL() {
        int n4 = this.getResources().getConfiguration().getLayoutDirection();
        boolean bl = true;
        if (n4 != 1) {
            bl = false;
        }
        return bl;
    }

    private void resetHintTextColor() {
        ColorStateList colorStateList = this.textColorHintStateList;
        if (colorStateList == null) {
            this.setHintTextColor(this.baseColor & 0xFFFFFF | 0x44000000);
        } else {
            this.setHintTextColor(colorStateList);
        }
    }

    private void resetTextColor() {
        Object object = this.textColorStateList;
        if (object == null) {
            object = new int[]{16842910};
            int[] nArray = AutoCompleteTextView.EMPTY_STATE_SET;
            int n4 = this.baseColor;
            this.textColorStateList = object = new ColorStateList((int[][])new int[][]{(int[])object, nArray}, new int[]{n4 & 0xFFFFFF | 0xDF000000, n4 & 0xFFFFFF | 0x44000000});
            this.setTextColor((ColorStateList)object);
        } else {
            this.setTextColor((ColorStateList)object);
        }
    }

    private Bitmap scaleIcon(Bitmap bitmap) {
        int n4;
        int n5;
        int n6 = bitmap.getWidth();
        int n7 = Math.max((int)n6, (int)(n5 = bitmap.getHeight()));
        if (n7 == (n4 = this.iconSize)) {
            return bitmap;
        }
        Bitmap bitmap2 = bitmap;
        if (n7 > n4) {
            if (n6 > n4) {
                float f = n4;
                n6 = (int)((float)n5 / (float)n6 * f);
                n7 = n4;
            } else {
                float f = n4;
                n7 = (int)((float)n6 / (float)n5 * f);
                n6 = n4;
            }
            bitmap2 = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n7, (int)n6, (boolean)false);
        }
        return bitmap2;
    }

    private void setFloatingLabelInternal(int n4) {
        if (n4 != 1) {
            if (n4 != 2) {
                this.floatingLabelEnabled = false;
                this.highlightFloatingLabel = false;
            } else {
                this.floatingLabelEnabled = true;
                this.highlightFloatingLabel = true;
            }
        } else {
            this.floatingLabelEnabled = true;
            this.highlightFloatingLabel = false;
        }
    }

    public MaterialAutoCompleteTextView addValidator(METValidator mETValidator) {
        if (this.validators == null) {
            this.validators = new ArrayList();
        }
        this.validators.add((Object)mETValidator);
        return this;
    }

    public void clearValidators() {
        List<METValidator> list = this.validators;
        if (list != null) {
            list.clear();
        }
    }

    @Nullable
    public Typeface getAccentTypeface() {
        return this.accentTypeface;
    }

    public int getBottomTextSize() {
        return this.bottomTextSize;
    }

    public float getCurrentBottomLines() {
        return this.currentBottomLines;
    }

    public CharSequence getError() {
        return this.tempErrorText;
    }

    public int getErrorColor() {
        return this.errorColor;
    }

    public float getFloatingLabelFraction() {
        return this.floatingLabelFraction;
    }

    public int getFloatingLabelPadding() {
        return this.floatingLabelPadding;
    }

    public CharSequence getFloatingLabelText() {
        return this.floatingLabelText;
    }

    public int getFloatingLabelTextColor() {
        return this.floatingLabelTextColor;
    }

    public int getFloatingLabelTextSize() {
        return this.floatingLabelTextSize;
    }

    public float getFocusFraction() {
        return this.focusFraction;
    }

    public String getHelperText() {
        return this.helperText;
    }

    public int getHelperTextColor() {
        return this.helperTextColor;
    }

    public int getInnerPaddingBottom() {
        return this.innerPaddingBottom;
    }

    public int getInnerPaddingLeft() {
        return this.innerPaddingLeft;
    }

    public int getInnerPaddingRight() {
        return this.innerPaddingRight;
    }

    public int getInnerPaddingTop() {
        return this.innerPaddingTop;
    }

    public int getMaxCharacters() {
        return this.maxCharacters;
    }

    public int getMinBottomTextLines() {
        return this.minBottomTextLines;
    }

    public int getMinCharacters() {
        return this.minCharacters;
    }

    public int getUnderlineColor() {
        return this.underlineColor;
    }

    @Nullable
    public List<METValidator> getValidators() {
        return this.validators;
    }

    public boolean hasValidators() {
        List<METValidator> list = this.validators;
        boolean bl = list != null && !list.isEmpty();
        return bl;
    }

    public boolean isAutoValidate() {
        return this.autoValidate;
    }

    public boolean isCharactersCountValid() {
        return this.charactersCountValid;
    }

    public boolean isFloatingLabelAlwaysShown() {
        return this.floatingLabelAlwaysShown;
    }

    public boolean isFloatingLabelAnimating() {
        return this.floatingLabelAnimating;
    }

    public boolean isHelperTextAlwaysShown() {
        return this.helperTextAlwaysShown;
    }

    public boolean isHideUnderline() {
        return this.hideUnderline;
    }

    public boolean isShowClearButton() {
        return this.showClearButton;
    }

    @Deprecated
    public boolean isValid(String string) {
        if (string == null) {
            return false;
        }
        return Pattern.compile((String)string).matcher((CharSequence)this.getText()).matches();
    }

    public boolean isValidateOnFocusLost() {
        return this.validateOnFocusLost;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.firstShown) {
            this.firstShown = true;
        }
    }

    public void onDraw(@NonNull Canvas canvas) {
        float f;
        float f2;
        float f3;
        int n4;
        int n5;
        int n6;
        int n7 = this.getScrollX();
        int n8 = this.iconLeftBitmaps == null ? 0 : this.iconOuterWidth + this.iconPadding;
        n7 += n8;
        int n9 = this.getScrollX();
        n8 = this.iconRightBitmaps == null ? this.getWidth() : this.getWidth() - this.iconOuterWidth - this.iconPadding;
        int n10 = n9 + n8;
        n8 = this.getScrollY();
        int n11 = this.getHeight() + n8 - this.getPaddingBottom();
        this.paint.setAlpha(255);
        Object object = this.iconLeftBitmaps;
        int n12 = 1;
        if (object != null) {
            n8 = !this.isInternalValid() ? 3 : (!this.isEnabled() ? 2 : (this.hasFocus() ? 1 : 0));
            object = object[n8];
            n6 = this.iconPadding;
            n5 = this.iconOuterWidth;
            int n13 = (n5 - object.getWidth()) / 2;
            n9 = this.bottomSpacing;
            n8 = this.iconOuterHeight;
            n4 = (n8 - object.getHeight()) / 2;
            canvas.drawBitmap(object, (float)(n13 + (n7 - n6 - n5)), (float)(n4 + (n9 + n11 - n8)), this.paint);
        }
        if ((object = this.iconRightBitmaps) != null) {
            n8 = !this.isInternalValid() ? 3 : (!this.isEnabled() ? 2 : (this.hasFocus() ? 1 : 0));
            object = object[n8];
            n4 = this.iconPadding;
            n5 = (this.iconOuterWidth - object.getWidth()) / 2;
            n9 = this.bottomSpacing;
            n6 = this.iconOuterHeight;
            n8 = (n6 - object.getHeight()) / 2;
            canvas.drawBitmap(object, (float)(n5 + (n4 + n10)), (float)(n8 + (n9 + n11 - n6)), this.paint);
        }
        if (this.hasFocus() && this.showClearButton && !TextUtils.isEmpty((CharSequence)this.getText())) {
            this.paint.setAlpha(255);
            n8 = this.isRTL() ? n7 : n10 - this.iconOuterWidth;
            object = this.clearButtonBitmaps[0];
            n9 = (this.iconOuterWidth - object.getWidth()) / 2;
            n6 = this.bottomSpacing;
            n5 = this.iconOuterHeight;
            n4 = (n5 - object.getHeight()) / 2;
            canvas.drawBitmap(object, (float)(n9 + n8), (float)(n4 + (n6 + n11 - n5)), this.paint);
        }
        n9 = n11;
        if (!this.hideUnderline) {
            n9 = n11 + this.bottomSpacing;
            if (!this.isInternalValid()) {
                this.paint.setColor(this.errorColor);
                canvas.drawRect((float)n7, (float)n9, (float)n10, (float)(this.getPixel(2) + n9), this.paint);
            } else if (!this.isEnabled()) {
                object = this.paint;
                n8 = this.underlineColor;
                if (n8 == -1) {
                    n8 = this.baseColor & 0xFFFFFF | 0x44000000;
                }
                object.setColor(n8);
                f3 = this.getPixel(1);
                f2 = 0.0f;
                while (f2 < (float)this.getWidth()) {
                    f = (float)n7 + f2;
                    canvas.drawRect(f, (float)n9, f + f3, (float)(this.getPixel(1) + n9), this.paint);
                    f2 = f3 * 3.0f + f2;
                }
            } else if (this.hasFocus()) {
                this.paint.setColor(this.primaryColor);
                canvas.drawRect((float)n7, (float)n9, (float)n10, (float)(this.getPixel(2) + n9), this.paint);
            } else {
                object = this.paint;
                n8 = this.underlineColor;
                if (n8 == -1) {
                    n8 = this.baseColor & 0xFFFFFF | 0x1E000000;
                }
                object.setColor(n8);
                canvas.drawRect((float)n7, (float)n9, (float)n10, (float)(this.getPixel(1) + n9), this.paint);
            }
        }
        this.textPaint.setTextSize((float)this.bottomTextSize);
        object = this.textPaint.getFontMetrics();
        f3 = object.ascent;
        f2 = -f3;
        f = object.descent;
        float f6 = (float)this.bottomTextSize + f3 + f;
        if (this.hasFocus() && this.hasCharactersCounter() || !this.isCharactersCountValid()) {
            object = this.textPaint;
            n8 = this.isCharactersCountValid() ? this.baseColor & 0xFFFFFF | 0x44000000 : this.errorColor;
            object.setColor(n8);
            object = this.getCharactersCounterText();
            f3 = this.isRTL() ? (float)n7 : (float)n10 - this.textPaint.measureText((String)object);
            canvas.drawText((String)object, f3, (float)(this.bottomSpacing + n9) + (f2 - f), (Paint)this.textPaint);
        }
        if (this.textLayout != null && (this.tempErrorText != null || (this.helperTextAlwaysShown || this.hasFocus()) && !TextUtils.isEmpty((CharSequence)this.helperText))) {
            object = this.textPaint;
            if (this.tempErrorText != null) {
                n8 = this.errorColor;
            } else {
                n8 = this.helperTextColor;
                if (n8 == -1) {
                    n8 = this.baseColor & 0xFFFFFF | 0x44000000;
                }
            }
            object.setColor(n8);
            canvas.save();
            if (this.isRTL()) {
                canvas.translate((float)(n10 - this.textLayout.getWidth()), (float)(this.bottomSpacing + n9) - f6);
            } else {
                canvas.translate((float)(this.getBottomTextLeftOffset() + n7), (float)(this.bottomSpacing + n9) - f6);
            }
            this.textLayout.draw(canvas);
            canvas.restore();
        }
        if (this.floatingLabelEnabled && !TextUtils.isEmpty((CharSequence)this.floatingLabelText)) {
            this.textPaint.setTextSize((float)this.floatingLabelTextSize);
            object = this.textPaint;
            ArgbEvaluator argbEvaluator = this.focusEvaluator;
            f3 = this.focusFraction;
            n8 = this.floatingLabelTextColor;
            if (n8 == -1) {
                n8 = this.baseColor & 0xFFFFFF | 0x44000000;
            }
            object.setColor(((Integer)argbEvaluator.evaluate(f3, (Object)n8, (Object)this.primaryColor)).intValue());
            f3 = this.textPaint.measureText(this.floatingLabelText.toString());
            if ((this.getGravity() & 5) != 5 && !this.isRTL()) {
                if ((this.getGravity() & 3) == 3) {
                    n8 = n7;
                } else {
                    f2 = this.getInnerPaddingLeft();
                    n8 = (int)(((float)(this.getWidth() - this.getInnerPaddingLeft() - this.getInnerPaddingRight()) - f3) / 2.0f + f2) + n7;
                }
            } else {
                n8 = (int)((float)n10 - f3);
            }
            n11 = this.floatingLabelPadding;
            f6 = this.innerPaddingTop + this.floatingLabelTextSize + n11;
            f = n11;
            boolean bl = this.floatingLabelAlwaysShown;
            f2 = 1.0f;
            f3 = bl ? 1.0f : this.floatingLabelFraction;
            n11 = (int)(f6 - f * f3 + (float)this.getScrollY());
            f3 = this.floatingLabelAlwaysShown ? 1.0f : this.floatingLabelFraction;
            f = this.focusFraction;
            n4 = this.floatingLabelTextColor;
            if (n4 == -1) {
                f2 = (float)Color.alpha((int)n4) / 256.0f;
            }
            n4 = (int)((f * 0.74f + 0.26f) * (f3 * 255.0f) * f2);
            this.textPaint.setAlpha(n4);
            canvas.drawText(this.floatingLabelText.toString(), (float)n8, (float)n11, (Paint)this.textPaint);
        }
        if (this.hasFocus() && this.singleLineEllipsis && this.getScrollX() != 0) {
            object = this.paint;
            n8 = this.isInternalValid() ? this.primaryColor : this.errorColor;
            object.setColor(n8);
            f3 = n9 + this.bottomSpacing;
            if (this.isRTL()) {
                n7 = n10;
            }
            n8 = n12;
            if (this.isRTL()) {
                n8 = -1;
            }
            n9 = this.bottomEllipsisSize;
            canvas.drawCircle((float)z2.a(n8, n9, 2, n7), (float)(n9 / 2) + f3, (float)(n9 / 2), this.paint);
            n9 = this.bottomEllipsisSize;
            canvas.drawCircle((float)(n8 * n9 * 5 / 2 + n7), (float)(n9 / 2) + f3, (float)(n9 / 2), this.paint);
            n9 = this.bottomEllipsisSize;
            canvas.drawCircle((float)(n8 * n9 * 9 / 2 + n7), f3 + (float)(n9 / 2), (float)(n9 / 2), this.paint);
        }
        super.onDraw(canvas);
    }

    public void onLayout(boolean bl, int n4, int n5, int n6, int n7) {
        super.onLayout(bl, n4, n5, n6, n7);
        if (bl) {
            this.adjustBottomLines();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        block8: {
            block11: {
                block9: {
                    block10: {
                        if (this.singleLineEllipsis && this.getScrollX() > 0 && motionEvent.getAction() == 0 && motionEvent.getX() < (float)this.getPixel(20) && motionEvent.getY() > (float)(this.getHeight() - this.extraPaddingBottom - this.innerPaddingBottom) && motionEvent.getY() < (float)(this.getHeight() - this.innerPaddingBottom)) {
                            this.setSelection(0);
                            return false;
                        }
                        if (!this.hasFocus() || !this.showClearButton) break block8;
                        int n4 = motionEvent.getAction();
                        if (n4 == 0) break block9;
                        if (n4 == 1) break block10;
                        if (n4 == 2) break block11;
                        if (n4 == 3) {
                            this.clearButtonTouched = false;
                            this.clearButtonClicking = false;
                        }
                        break block8;
                    }
                    if (this.clearButtonClicking) {
                        if (!TextUtils.isEmpty((CharSequence)this.getText())) {
                            this.setText(null);
                        }
                        this.clearButtonClicking = false;
                    }
                    if (this.clearButtonTouched) {
                        this.clearButtonTouched = false;
                        return true;
                    }
                    this.clearButtonTouched = false;
                    break block8;
                }
                if (this.insideClearButton(motionEvent)) {
                    this.clearButtonTouched = true;
                    this.clearButtonClicking = true;
                    return true;
                }
            }
            if (this.clearButtonClicking && !this.insideClearButton(motionEvent)) {
                this.clearButtonClicking = false;
            }
            if (this.clearButtonTouched) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentTypeface(Typeface typeface) {
        this.accentTypeface = typeface;
        this.textPaint.setTypeface(typeface);
        this.postInvalidate();
    }

    public void setAutoValidate(boolean bl) {
        this.autoValidate = bl;
        if (bl) {
            this.validate();
        }
    }

    public void setBaseColor(int n4) {
        if (this.baseColor != n4) {
            this.baseColor = n4;
        }
        this.initText();
        this.postInvalidate();
    }

    public void setBottomTextSize(int n4) {
        this.bottomTextSize = n4;
        this.initPadding();
    }

    public void setCurrentBottomLines(float f) {
        this.currentBottomLines = f;
        this.initPadding();
    }

    public void setError(CharSequence object) {
        object = object == null ? null : object.toString();
        this.tempErrorText = object;
        if (this.adjustBottomLines()) {
            this.postInvalidate();
        }
    }

    public void setErrorColor(int n4) {
        this.errorColor = n4;
        this.postInvalidate();
    }

    public void setFloatingLabel(@FloatingLabelType int n4) {
        this.setFloatingLabelInternal(n4);
        this.initPadding();
    }

    public void setFloatingLabelAlwaysShown(boolean bl) {
        this.floatingLabelAlwaysShown = bl;
        this.invalidate();
    }

    public void setFloatingLabelAnimating(boolean bl) {
        this.floatingLabelAnimating = bl;
    }

    public void setFloatingLabelFraction(float f) {
        this.floatingLabelFraction = f;
        this.invalidate();
    }

    public void setFloatingLabelPadding(int n4) {
        this.floatingLabelPadding = n4;
        this.postInvalidate();
    }

    public void setFloatingLabelText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            charSequence2 = this.getHint();
        }
        this.floatingLabelText = charSequence2;
        this.postInvalidate();
    }

    public void setFloatingLabelTextColor(int n4) {
        this.floatingLabelTextColor = n4;
        this.postInvalidate();
    }

    public void setFloatingLabelTextSize(int n4) {
        this.floatingLabelTextSize = n4;
        this.initPadding();
    }

    public void setFocusFraction(float f) {
        this.focusFraction = f;
        this.invalidate();
    }

    public void setHelperText(CharSequence object) {
        object = object == null ? null : object.toString();
        this.helperText = object;
        if (this.adjustBottomLines()) {
            this.postInvalidate();
        }
    }

    public void setHelperTextAlwaysShown(boolean bl) {
        this.helperTextAlwaysShown = bl;
        this.invalidate();
    }

    public void setHelperTextColor(int n4) {
        this.helperTextColor = n4;
        this.postInvalidate();
    }

    public void setHideUnderline(boolean bl) {
        this.hideUnderline = bl;
        this.initPadding();
        this.postInvalidate();
    }

    public void setIconLeft(@DrawableRes int n4) {
        this.iconLeftBitmaps = this.generateIconBitmaps(n4);
        this.initPadding();
    }

    public void setIconLeft(Bitmap bitmap) {
        this.iconLeftBitmaps = this.generateIconBitmaps(bitmap);
        this.initPadding();
    }

    public void setIconLeft(Drawable drawable2) {
        this.iconLeftBitmaps = this.generateIconBitmaps(drawable2);
        this.initPadding();
    }

    public void setIconRight(@DrawableRes int n4) {
        this.iconRightBitmaps = this.generateIconBitmaps(n4);
        this.initPadding();
    }

    public void setIconRight(Bitmap bitmap) {
        this.iconRightBitmaps = this.generateIconBitmaps(bitmap);
        this.initPadding();
    }

    public void setIconRight(Drawable drawable2) {
        this.iconRightBitmaps = this.generateIconBitmaps(drawable2);
        this.initPadding();
    }

    public void setLengthChecker(METLengthChecker mETLengthChecker) {
        this.lengthChecker = mETLengthChecker;
    }

    public void setMaxCharacters(int n4) {
        this.maxCharacters = n4;
        this.initMinBottomLines();
        this.initPadding();
        this.postInvalidate();
    }

    public void setMetHintTextColor(int n4) {
        this.textColorHintStateList = ColorStateList.valueOf((int)n4);
        this.resetHintTextColor();
    }

    public void setMetHintTextColor(ColorStateList colorStateList) {
        this.textColorHintStateList = colorStateList;
        this.resetHintTextColor();
    }

    public void setMetTextColor(int n4) {
        this.textColorStateList = ColorStateList.valueOf((int)n4);
        this.resetTextColor();
    }

    public void setMetTextColor(ColorStateList colorStateList) {
        this.textColorStateList = colorStateList;
        this.resetTextColor();
    }

    public void setMinBottomTextLines(int n4) {
        this.minBottomTextLines = n4;
        this.initMinBottomLines();
        this.initPadding();
        this.postInvalidate();
    }

    public void setMinCharacters(int n4) {
        this.minCharacters = n4;
        this.initMinBottomLines();
        this.initPadding();
        this.postInvalidate();
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.innerFocusChangeListener == null) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.outerFocusChangeListener = onFocusChangeListener;
        }
    }

    @Deprecated
    public final void setPadding(int n4, int n5, int n6, int n7) {
        super.setPadding(n4, n5, n6, n7);
    }

    public void setPaddings(int n4, int n5, int n6, int n7) {
        this.innerPaddingTop = n5;
        this.innerPaddingBottom = n7;
        this.innerPaddingLeft = n4;
        this.innerPaddingRight = n6;
        this.correctPaddings();
    }

    public void setPrimaryColor(int n4) {
        this.primaryColor = n4;
        this.postInvalidate();
    }

    public void setShowClearButton(boolean bl) {
        this.showClearButton = bl;
        this.correctPaddings();
    }

    public void setSingleLineEllipsis() {
        this.setSingleLineEllipsis(true);
    }

    public void setSingleLineEllipsis(boolean bl) {
        this.singleLineEllipsis = bl;
        this.initMinBottomLines();
        this.initPadding();
        this.postInvalidate();
    }

    public void setUnderlineColor(int n4) {
        this.underlineColor = n4;
        this.postInvalidate();
    }

    public void setValidateOnFocusLost(boolean bl) {
        this.validateOnFocusLost = bl;
    }

    public boolean validate() {
        Editable editable = this.validators;
        if (editable != null && !editable.isEmpty()) {
            boolean bl;
            block3: {
                METValidator mETValidator;
                editable = this.getText();
                boolean bl2 = editable.length() == 0;
                Iterator iterator = this.validators.iterator();
                boolean bl3 = true;
                do {
                    bl = bl3;
                    if (!iterator.hasNext()) break block3;
                    mETValidator = (METValidator)iterator.next();
                    bl = bl3 && mETValidator.isValid((CharSequence)editable, bl2);
                    bl3 = bl;
                } while (bl);
                this.setError(mETValidator.getErrorMessage());
            }
            if (bl) {
                this.setError(null);
            }
            this.postInvalidate();
            return bl;
        }
        return true;
    }

    @Deprecated
    public boolean validate(String string, CharSequence charSequence) {
        boolean bl = this.isValid(string);
        if (!bl) {
            this.setError(charSequence);
        }
        this.postInvalidate();
        return bl;
    }

    public boolean validateWith(@NonNull METValidator mETValidator) {
        Editable editable = this.getText();
        boolean bl = editable.length() == 0;
        if (!(bl = mETValidator.isValid((CharSequence)editable, bl))) {
            this.setError(mETValidator.getErrorMessage());
        }
        this.postInvalidate();
        return bl;
    }
}


.class public final Ll/t;
.super Landroid/widget/RadioButton;
.source "SourceFile"

# interfaces
.implements Lj0/j;


# instance fields
.field public final a:Ll/i;

.field public final b:Ll/d;

.field public final c:Ll/b0;

.field public d:Ll/m;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-static {p1}, Ll/w0;->a(Landroid/content/Context;)V

    const v0, 0x7f0400ef

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Ll/u0;->a(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Ll/i;

    invoke-direct {p1, p0}, Ll/i;-><init>(Landroid/widget/CompoundButton;)V

    iput-object p1, p0, Ll/t;->a:Ll/i;

    invoke-virtual {p1, p2, v0}, Ll/i;->b(Landroid/util/AttributeSet;I)V

    new-instance p1, Ll/d;

    invoke-direct {p1, p0}, Ll/d;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ll/t;->b:Ll/d;

    invoke-virtual {p1, p2, v0}, Ll/d;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, Ll/b0;

    invoke-direct {p1, p0}, Ll/b0;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ll/t;->c:Ll/b0;

    invoke-virtual {p1, p2, v0}, Ll/b0;->f(Landroid/util/AttributeSet;I)V

    invoke-direct {p0}, Ll/t;->getEmojiTextViewHelper()Ll/m;

    move-result-object p1

    invoke-virtual {p1, p2, v0}, Ll/m;->a(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getEmojiTextViewHelper()Ll/m;
    .locals 1

    iget-object v0, p0, Ll/t;->d:Ll/m;

    if-nez v0, :cond_0

    new-instance v0, Ll/m;

    invoke-direct {v0, p0}, Ll/m;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ll/t;->d:Ll/m;

    :cond_0
    iget-object v0, p0, Ll/t;->d:Ll/m;

    return-object v0
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/RadioButton;->drawableStateChanged()V

    iget-object v0, p0, Ll/t;->b:Ll/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/d;->a()V

    :cond_0
    iget-object v0, p0, Ll/t;->c:Ll/b0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/b0;->b()V

    :cond_1
    return-void
.end method

.method public getCompoundPaddingLeft()I
    .locals 2

    invoke-super {p0}, Landroid/widget/RadioButton;->getCompoundPaddingLeft()I

    move-result v0

    iget-object v1, p0, Ll/t;->a:Ll/i;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Ll/t;->b:Ll/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/d;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Ll/t;->b:Ll/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/d;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Ll/t;->a:Ll/i;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/i;->b:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportButtonTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Ll/t;->a:Ll/i;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/i;->c:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Ll/t;->c:Ll/b0;

    invoke-virtual {v0}, Ll/b0;->d()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Ll/t;->c:Ll/b0;

    invoke-virtual {v0}, Ll/b0;->e()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setAllCaps(Z)V

    invoke-direct {p0}, Ll/t;->getEmojiTextViewHelper()Ll/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/m;->b(Z)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ll/t;->b:Ll/d;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/d;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V

    iget-object v0, p0, Ll/t;->b:Ll/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/d;->f(I)V

    :cond_0
    return-void
.end method

.method public setButtonDrawable(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lx6/b;->X(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/t;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ll/t;->a:Ll/i;

    if-eqz p1, :cond_1

    .line 1
    iget-boolean v0, p1, Ll/i;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p1, Ll/i;->f:Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p1, Ll/i;->f:Z

    invoke-virtual {p1}, Ll/i;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/RadioButton;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ll/t;->c:Ll/b0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/b0;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/RadioButton;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Ll/t;->c:Ll/b0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/b0;->b()V

    :cond_0
    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-direct {p0}, Ll/t;->getEmojiTextViewHelper()Ll/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/m;->c(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ll/t;->getEmojiTextViewHelper()Ll/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Ll/m;->b:Lv0/f;

    .line 6
    .line 7
    iget-object v0, v0, Lv0/f;->a:Lv0/f$b;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lv0/f$b;->a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setFilters([Landroid/text/InputFilter;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Ll/t;->b:Ll/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/d;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Ll/t;->b:Ll/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/d;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Ll/t;->a:Ll/i;

    if-eqz v0, :cond_0

    iput-object p1, v0, Ll/i;->b:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Ll/i;->d:Z

    invoke-virtual {v0}, Ll/i;->a()V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Ll/t;->a:Ll/i;

    if-eqz v0, :cond_0

    iput-object p1, v0, Ll/i;->c:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, Ll/i;->e:Z

    invoke-virtual {v0}, Ll/i;->a()V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Ll/t;->c:Ll/b0;

    invoke-virtual {v0, p1}, Ll/b0;->l(Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Ll/t;->c:Ll/b0;

    invoke-virtual {p1}, Ll/b0;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Ll/t;->c:Ll/b0;

    invoke-virtual {v0, p1}, Ll/b0;->m(Landroid/graphics/PorterDuff$Mode;)V

    iget-object p1, p0, Ll/t;->c:Ll/b0;

    invoke-virtual {p1}, Ll/b0;->b()V

    return-void
.end method

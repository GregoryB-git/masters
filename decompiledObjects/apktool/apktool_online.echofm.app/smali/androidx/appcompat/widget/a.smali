.class public Landroidx/appcompat/widget/a;
.super Landroidx/appcompat/view/menu/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/a$b;,
        Landroidx/appcompat/widget/a$c;,
        Landroidx/appcompat/widget/a$f;,
        Landroidx/appcompat/widget/a$a;,
        Landroidx/appcompat/widget/a$e;,
        Landroidx/appcompat/widget/a$d;
    }
.end annotation


# instance fields
.field public A:Z

.field public B:Z

.field public C:I

.field public D:I

.field public E:I

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:I

.field public final K:Landroid/util/SparseBooleanArray;

.field public L:Landroidx/appcompat/widget/a$e;

.field public M:Landroidx/appcompat/widget/a$a;

.field public N:Landroidx/appcompat/widget/a$c;

.field public O:Landroidx/appcompat/widget/a$b;

.field public final P:Landroidx/appcompat/widget/a$f;

.field public Q:I

.field public x:Landroidx/appcompat/widget/a$d;

.field public y:Landroid/graphics/drawable/Drawable;

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    sget v0, Le/f;->c:I

    sget v1, Le/f;->b:I

    invoke-direct {p0, p1, v0, v1}, Landroidx/appcompat/view/menu/a;-><init>(Landroid/content/Context;II)V

    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/widget/a;->K:Landroid/util/SparseBooleanArray;

    new-instance p1, Landroidx/appcompat/widget/a$f;

    invoke-direct {p1, p0}, Landroidx/appcompat/widget/a$f;-><init>(Landroidx/appcompat/widget/a;)V

    iput-object p1, p0, Landroidx/appcompat/widget/a;->P:Landroidx/appcompat/widget/a$f;

    return-void
.end method

.method public static synthetic p(Landroidx/appcompat/widget/a;)Landroidx/appcompat/view/menu/d;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/view/menu/a;->q:Landroidx/appcompat/view/menu/d;

    return-object p0
.end method

.method public static synthetic q(Landroidx/appcompat/widget/a;)Landroidx/appcompat/view/menu/d;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/view/menu/a;->q:Landroidx/appcompat/view/menu/d;

    return-object p0
.end method

.method public static synthetic r(Landroidx/appcompat/widget/a;)Landroidx/appcompat/view/menu/h;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/view/menu/a;->w:Landroidx/appcompat/view/menu/h;

    return-object p0
.end method

.method public static synthetic s(Landroidx/appcompat/widget/a;)Landroidx/appcompat/view/menu/d;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/view/menu/a;->q:Landroidx/appcompat/view/menu/d;

    return-object p0
.end method

.method public static synthetic t(Landroidx/appcompat/widget/a;)Landroidx/appcompat/view/menu/d;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/view/menu/a;->q:Landroidx/appcompat/view/menu/d;

    return-object p0
.end method

.method public static synthetic u(Landroidx/appcompat/widget/a;)Landroidx/appcompat/view/menu/d;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/view/menu/a;->q:Landroidx/appcompat/view/menu/d;

    return-object p0
.end method

.method public static synthetic v(Landroidx/appcompat/widget/a;)Landroidx/appcompat/view/menu/h;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/view/menu/a;->w:Landroidx/appcompat/view/menu/h;

    return-object p0
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a;->M:Landroidx/appcompat/widget/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/f;->b()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public B()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a;->L:Landroidx/appcompat/widget/a$e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/f;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public C(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    iget-boolean p1, p0, Landroidx/appcompat/widget/a;->F:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/view/menu/a;->p:Landroid/content/Context;

    invoke-static {p1}, Lj/a;->a(Landroid/content/Context;)Lj/a;

    move-result-object p1

    invoke-virtual {p1}, Lj/a;->c()I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/a;->E:I

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/view/menu/a;->q:Landroidx/appcompat/view/menu/d;

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/view/menu/d;->G(Z)V

    :cond_1
    return-void
.end method

.method public D(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/widget/a;->I:Z

    return-void
.end method

.method public E(Landroidx/appcompat/widget/ActionMenuView;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/appcompat/view/menu/a;->w:Landroidx/appcompat/view/menu/h;

    iget-object v0, p0, Landroidx/appcompat/view/menu/a;->q:Landroidx/appcompat/view/menu/d;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionMenuView;->E(Landroidx/appcompat/view/menu/d;)V

    return-void
.end method

.method public F(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/widget/a;->z:Z

    iput-object p1, p0, Landroidx/appcompat/widget/a;->y:Landroid/graphics/drawable/Drawable;

    :goto_0
    return-void
.end method

.method public G(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/widget/a;->A:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/widget/a;->B:Z

    return-void
.end method

.method public H()Z
    .locals 7

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/a;->A:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/a;->B()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/view/menu/a;->q:Landroidx/appcompat/view/menu/d;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/appcompat/view/menu/a;->w:Landroidx/appcompat/view/menu/h;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/appcompat/widget/a;->N:Landroidx/appcompat/widget/a$c;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/d;->v()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/appcompat/widget/a$e;

    iget-object v3, p0, Landroidx/appcompat/view/menu/a;->p:Landroid/content/Context;

    iget-object v4, p0, Landroidx/appcompat/view/menu/a;->q:Landroidx/appcompat/view/menu/d;

    iget-object v5, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    const/4 v6, 0x1

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Landroidx/appcompat/widget/a$e;-><init>(Landroidx/appcompat/widget/a;Landroid/content/Context;Landroidx/appcompat/view/menu/d;Landroid/view/View;Z)V

    new-instance v1, Landroidx/appcompat/widget/a$c;

    invoke-direct {v1, p0, v0}, Landroidx/appcompat/widget/a$c;-><init>(Landroidx/appcompat/widget/a;Landroidx/appcompat/widget/a$e;)V

    iput-object v1, p0, Landroidx/appcompat/widget/a;->N:Landroidx/appcompat/widget/a$c;

    iget-object v0, p0, Landroidx/appcompat/view/menu/a;->w:Landroidx/appcompat/view/menu/h;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b(Landroidx/appcompat/view/menu/d;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/a;->w()Z

    invoke-super {p0, p1, p2}, Landroidx/appcompat/view/menu/a;->b(Landroidx/appcompat/view/menu/d;Z)V

    return-void
.end method

.method public c(Landroid/content/Context;Landroidx/appcompat/view/menu/d;)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/appcompat/view/menu/a;->c(Landroid/content/Context;Landroidx/appcompat/view/menu/d;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-static {p1}, Lj/a;->a(Landroid/content/Context;)Lj/a;

    move-result-object p1

    iget-boolean v0, p0, Landroidx/appcompat/widget/a;->B:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lj/a;->d()Z

    move-result v0

    iput-boolean v0, p0, Landroidx/appcompat/widget/a;->A:Z

    :cond_0
    iget-boolean v0, p0, Landroidx/appcompat/widget/a;->H:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lj/a;->b()I

    move-result v0

    iput v0, p0, Landroidx/appcompat/widget/a;->C:I

    :cond_1
    iget-boolean v0, p0, Landroidx/appcompat/widget/a;->F:Z

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lj/a;->c()I

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/a;->E:I

    :cond_2
    iget p1, p0, Landroidx/appcompat/widget/a;->C:I

    iget-boolean v0, p0, Landroidx/appcompat/widget/a;->A:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    if-nez v0, :cond_4

    new-instance v0, Landroidx/appcompat/widget/a$d;

    iget-object v2, p0, Landroidx/appcompat/view/menu/a;->o:Landroid/content/Context;

    invoke-direct {v0, p0, v2}, Landroidx/appcompat/widget/a$d;-><init>(Landroidx/appcompat/widget/a;Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    iget-boolean v2, p0, Landroidx/appcompat/widget/a;->z:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget-object v2, p0, Landroidx/appcompat/widget/a;->y:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iput-object v1, p0, Landroidx/appcompat/widget/a;->y:Landroid/graphics/drawable/Drawable;

    iput-boolean v3, p0, Landroidx/appcompat/widget/a;->z:Z

    :cond_3
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iget-object v1, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    invoke-virtual {v1, v0, v0}, Landroid/view/View;->measure(II)V

    :cond_4
    iget-object v0, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    sub-int/2addr p1, v0

    goto :goto_0

    :cond_5
    iput-object v1, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    :goto_0
    iput p1, p0, Landroidx/appcompat/widget/a;->D:I

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 p2, 0x42600000    # 56.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    iput p1, p0, Landroidx/appcompat/widget/a;->J:I

    return-void
.end method

.method public d(Landroidx/appcompat/view/menu/e;Landroidx/appcompat/view/menu/h$a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Landroidx/appcompat/view/menu/h$a;->d(Landroidx/appcompat/view/menu/e;I)V

    iget-object p1, p0, Landroidx/appcompat/view/menu/a;->w:Landroidx/appcompat/view/menu/h;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    check-cast p2, Landroidx/appcompat/view/menu/ActionMenuItemView;

    invoke-virtual {p2, p1}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setItemInvoker(Landroidx/appcompat/view/menu/d$b;)V

    iget-object p1, p0, Landroidx/appcompat/widget/a;->O:Landroidx/appcompat/widget/a$b;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/appcompat/widget/a$b;

    invoke-direct {p1, p0}, Landroidx/appcompat/widget/a$b;-><init>(Landroidx/appcompat/widget/a;)V

    iput-object p1, p0, Landroidx/appcompat/widget/a;->O:Landroidx/appcompat/widget/a$b;

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/widget/a;->O:Landroidx/appcompat/widget/a$b;

    invoke-virtual {p2, p1}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setPopupCallback(Landroidx/appcompat/view/menu/ActionMenuItemView$b;)V

    return-void
.end method

.method public e(Landroidx/appcompat/view/menu/j;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroidx/appcompat/view/menu/d;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-virtual {v0}, Landroidx/appcompat/view/menu/j;->W()Landroid/view/Menu;

    move-result-object v2

    iget-object v3, p0, Landroidx/appcompat/view/menu/a;->q:Landroidx/appcompat/view/menu/d;

    if-eq v2, v3, :cond_1

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/j;->W()Landroid/view/Menu;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/view/menu/j;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroidx/appcompat/view/menu/j;->getItem()Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/a;->x(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {p1}, Landroidx/appcompat/view/menu/j;->getItem()Landroid/view/MenuItem;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    iput v2, p0, Landroidx/appcompat/widget/a;->Q:I

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/d;->size()I

    move-result v2

    move v3, v1

    :goto_1
    const/4 v4, 0x1

    if-ge v3, v2, :cond_4

    invoke-virtual {p1, v3}, Landroidx/appcompat/view/menu/d;->getItem(I)Landroid/view/MenuItem;

    move-result-object v5

    invoke-interface {v5}, Landroid/view/MenuItem;->isVisible()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_3

    move v1, v4

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    new-instance v2, Landroidx/appcompat/widget/a$a;

    iget-object v3, p0, Landroidx/appcompat/view/menu/a;->p:Landroid/content/Context;

    invoke-direct {v2, p0, v3, p1, v0}, Landroidx/appcompat/widget/a$a;-><init>(Landroidx/appcompat/widget/a;Landroid/content/Context;Landroidx/appcompat/view/menu/j;Landroid/view/View;)V

    iput-object v2, p0, Landroidx/appcompat/widget/a;->M:Landroidx/appcompat/widget/a$a;

    invoke-virtual {v2, v1}, Landroidx/appcompat/view/menu/f;->g(Z)V

    iget-object v0, p0, Landroidx/appcompat/widget/a;->M:Landroidx/appcompat/widget/a$a;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/f;->k()V

    invoke-super {p0, p1}, Landroidx/appcompat/view/menu/a;->e(Landroidx/appcompat/view/menu/j;)Z

    return v4
.end method

.method public f(Z)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/view/menu/a;->f(Z)V

    iget-object p1, p0, Landroidx/appcompat/view/menu/a;->w:Landroidx/appcompat/view/menu/h;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    iget-object p1, p0, Landroidx/appcompat/view/menu/a;->q:Landroidx/appcompat/view/menu/d;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/d;->r()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/view/menu/e;

    invoke-virtual {v3}, Landroidx/appcompat/view/menu/e;->g()LI/b;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/view/menu/a;->q:Landroidx/appcompat/view/menu/d;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/d;->v()Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iget-boolean v1, p0, Landroidx/appcompat/widget/a;->A:Z

    if-eqz v1, :cond_5

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/view/menu/e;

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->isActionViewExpanded()Z

    move-result p1

    xor-int/2addr p1, v2

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_2
    if-lez v1, :cond_5

    :goto_2
    iget-object p1, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    if-nez p1, :cond_3

    new-instance p1, Landroidx/appcompat/widget/a$d;

    iget-object v0, p0, Landroidx/appcompat/view/menu/a;->o:Landroid/content/Context;

    invoke-direct {p1, p0, v0}, Landroidx/appcompat/widget/a$d;-><init>(Landroidx/appcompat/widget/a;Landroid/content/Context;)V

    iput-object p1, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    :cond_3
    iget-object p1, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Landroidx/appcompat/view/menu/a;->w:Landroidx/appcompat/view/menu/h;

    if-eq p1, v0, :cond_6

    if-eqz p1, :cond_4

    iget-object v0, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_4
    iget-object p1, p0, Landroidx/appcompat/view/menu/a;->w:Landroidx/appcompat/view/menu/h;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    iget-object v0, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionMenuView;->C()Landroidx/appcompat/widget/ActionMenuView$c;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_3

    :cond_5
    iget-object p1, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    iget-object v0, p0, Landroidx/appcompat/view/menu/a;->w:Landroidx/appcompat/view/menu/h;

    if-ne p1, v0, :cond_6

    check-cast v0, Landroid/view/ViewGroup;

    iget-object p1, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_6
    :goto_3
    iget-object p1, p0, Landroidx/appcompat/view/menu/a;->w:Landroidx/appcompat/view/menu/h;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    iget-boolean v0, p0, Landroidx/appcompat/widget/a;->A:Z

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionMenuView;->setOverflowReserved(Z)V

    return-void
.end method

.method public g()Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/appcompat/view/menu/a;->q:Landroidx/appcompat/view/menu/d;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/d;->A()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    goto :goto_0

    :cond_0
    move-object v1, v2

    move v4, v3

    :goto_0
    iget v5, v0, Landroidx/appcompat/widget/a;->E:I

    iget v6, v0, Landroidx/appcompat/widget/a;->D:I

    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    iget-object v8, v0, Landroidx/appcompat/view/menu/a;->w:Landroidx/appcompat/view/menu/h;

    check-cast v8, Landroid/view/ViewGroup;

    move v9, v3

    move v10, v9

    move v11, v10

    move v12, v11

    :goto_1
    if-ge v9, v4, :cond_4

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/appcompat/view/menu/e;

    invoke-virtual {v14}, Landroidx/appcompat/view/menu/e;->n()Z

    move-result v15

    if-eqz v15, :cond_1

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_1
    invoke-virtual {v14}, Landroidx/appcompat/view/menu/e;->m()Z

    move-result v15

    if-eqz v15, :cond_2

    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_2
    const/4 v10, 0x1

    :goto_2
    iget-boolean v13, v0, Landroidx/appcompat/widget/a;->I:Z

    if-eqz v13, :cond_3

    invoke-virtual {v14}, Landroidx/appcompat/view/menu/e;->isActionViewExpanded()Z

    move-result v13

    if-eqz v13, :cond_3

    move v5, v3

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_4
    iget-boolean v9, v0, Landroidx/appcompat/widget/a;->A:Z

    if-eqz v9, :cond_6

    if-nez v10, :cond_5

    add-int/2addr v12, v11

    if-le v12, v5, :cond_6

    :cond_5
    add-int/lit8 v5, v5, -0x1

    :cond_6
    sub-int/2addr v5, v11

    iget-object v9, v0, Landroidx/appcompat/widget/a;->K:Landroid/util/SparseBooleanArray;

    invoke-virtual {v9}, Landroid/util/SparseBooleanArray;->clear()V

    iget-boolean v10, v0, Landroidx/appcompat/widget/a;->G:Z

    if-eqz v10, :cond_7

    iget v10, v0, Landroidx/appcompat/widget/a;->J:I

    div-int v11, v6, v10

    rem-int v12, v6, v10

    div-int/2addr v12, v11

    add-int/2addr v10, v12

    goto :goto_3

    :cond_7
    move v10, v3

    move v11, v10

    :goto_3
    move v12, v3

    move v14, v12

    :goto_4
    if-ge v12, v4, :cond_1b

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroidx/appcompat/view/menu/e;

    invoke-virtual {v15}, Landroidx/appcompat/view/menu/e;->n()Z

    move-result v16

    if-eqz v16, :cond_b

    invoke-virtual {v0, v15, v2, v8}, Landroidx/appcompat/widget/a;->n(Landroidx/appcompat/view/menu/e;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v13

    iget-boolean v2, v0, Landroidx/appcompat/widget/a;->G:Z

    if-eqz v2, :cond_8

    invoke-static {v13, v10, v11, v7, v3}, Landroidx/appcompat/widget/ActionMenuView;->G(Landroid/view/View;IIII)I

    move-result v2

    sub-int/2addr v11, v2

    goto :goto_5

    :cond_8
    invoke-virtual {v13, v7, v7}, Landroid/view/View;->measure(II)V

    :goto_5
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    sub-int/2addr v6, v2

    if-nez v14, :cond_9

    move v14, v2

    :cond_9
    invoke-virtual {v15}, Landroidx/appcompat/view/menu/e;->getGroupId()I

    move-result v2

    const/4 v13, 0x1

    if-eqz v2, :cond_a

    invoke-virtual {v9, v2, v13}, Landroid/util/SparseBooleanArray;->put(IZ)V

    :cond_a
    invoke-virtual {v15, v13}, Landroidx/appcompat/view/menu/e;->t(Z)V

    move v0, v3

    move/from16 v17, v4

    goto/16 :goto_e

    :cond_b
    invoke-virtual {v15}, Landroidx/appcompat/view/menu/e;->m()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-virtual {v15}, Landroidx/appcompat/view/menu/e;->getGroupId()I

    move-result v2

    invoke-virtual {v9, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v13

    if-gtz v5, :cond_c

    if-eqz v13, :cond_e

    :cond_c
    if-lez v6, :cond_e

    iget-boolean v3, v0, Landroidx/appcompat/widget/a;->G:Z

    if-eqz v3, :cond_d

    if-lez v11, :cond_e

    :cond_d
    const/4 v3, 0x1

    goto :goto_6

    :cond_e
    const/4 v3, 0x0

    :goto_6
    move/from16 v18, v3

    move/from16 v17, v4

    if-eqz v3, :cond_14

    const/4 v3, 0x0

    invoke-virtual {v0, v15, v3, v8}, Landroidx/appcompat/widget/a;->n(Landroidx/appcompat/view/menu/e;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    iget-boolean v3, v0, Landroidx/appcompat/widget/a;->G:Z

    if-eqz v3, :cond_10

    const/4 v3, 0x0

    invoke-static {v4, v10, v11, v7, v3}, Landroidx/appcompat/widget/ActionMenuView;->G(Landroid/view/View;IIII)I

    move-result v19

    sub-int v11, v11, v19

    if-nez v19, :cond_f

    const/16 v18, 0x0

    :cond_f
    :goto_7
    move/from16 v3, v18

    goto :goto_8

    :cond_10
    invoke-virtual {v4, v7, v7}, Landroid/view/View;->measure(II)V

    goto :goto_7

    :goto_8
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    sub-int/2addr v6, v4

    if-nez v14, :cond_11

    move v14, v4

    :cond_11
    iget-boolean v4, v0, Landroidx/appcompat/widget/a;->G:Z

    if-eqz v4, :cond_13

    if-ltz v6, :cond_12

    :goto_9
    const/4 v4, 0x1

    goto :goto_a

    :cond_12
    const/4 v4, 0x0

    :goto_a
    and-int/2addr v3, v4

    goto :goto_b

    :cond_13
    add-int v4, v6, v14

    if-lez v4, :cond_12

    goto :goto_9

    :cond_14
    :goto_b
    if-eqz v3, :cond_15

    if-eqz v2, :cond_15

    const/4 v4, 0x1

    invoke-virtual {v9, v2, v4}, Landroid/util/SparseBooleanArray;->put(IZ)V

    goto :goto_d

    :cond_15
    if-eqz v13, :cond_18

    const/4 v4, 0x0

    invoke-virtual {v9, v2, v4}, Landroid/util/SparseBooleanArray;->put(IZ)V

    const/4 v4, 0x0

    :goto_c
    if-ge v4, v12, :cond_18

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/appcompat/view/menu/e;

    invoke-virtual {v13}, Landroidx/appcompat/view/menu/e;->getGroupId()I

    move-result v0

    if-ne v0, v2, :cond_17

    invoke-virtual {v13}, Landroidx/appcompat/view/menu/e;->k()Z

    move-result v0

    if-eqz v0, :cond_16

    add-int/lit8 v5, v5, 0x1

    :cond_16
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Landroidx/appcompat/view/menu/e;->t(Z)V

    :cond_17
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, p0

    goto :goto_c

    :cond_18
    :goto_d
    if-eqz v3, :cond_19

    add-int/lit8 v5, v5, -0x1

    :cond_19
    invoke-virtual {v15, v3}, Landroidx/appcompat/view/menu/e;->t(Z)V

    const/4 v0, 0x0

    goto :goto_e

    :cond_1a
    move v0, v3

    move/from16 v17, v4

    invoke-virtual {v15, v0}, Landroidx/appcompat/view/menu/e;->t(Z)V

    :goto_e
    add-int/lit8 v12, v12, 0x1

    move v3, v0

    move/from16 v4, v17

    const/4 v2, 0x0

    move-object/from16 v0, p0

    goto/16 :goto_4

    :cond_1b
    const/4 v2, 0x1

    return v2
.end method

.method public l(Landroid/view/ViewGroup;I)Z
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/appcompat/view/menu/a;->l(Landroid/view/ViewGroup;I)Z

    move-result p1

    return p1
.end method

.method public n(Landroidx/appcompat/view/menu/e;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->getActionView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroidx/appcompat/view/menu/a;->n(Landroidx/appcompat/view/menu/e;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    :cond_1
    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->isActionViewExpanded()Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0x8

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    check-cast p3, Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroidx/appcompat/widget/ActionMenuView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result p2

    if-nez p2, :cond_3

    invoke-virtual {p3, p1}, Landroidx/appcompat/widget/ActionMenuView;->B(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    return-object v0
.end method

.method public o(ILandroidx/appcompat/view/menu/e;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroidx/appcompat/view/menu/e;->k()Z

    move-result p1

    return p1
.end method

.method public w()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/a;->z()Z

    move-result v0

    invoke-virtual {p0}, Landroidx/appcompat/widget/a;->A()Z

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public final x(Landroid/view/MenuItem;)Landroid/view/View;
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/a;->w:Landroidx/appcompat/view/menu/h;

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    instance-of v5, v4, Landroidx/appcompat/view/menu/h$a;

    if-eqz v5, :cond_1

    move-object v5, v4

    check-cast v5, Landroidx/appcompat/view/menu/h$a;

    invoke-interface {v5}, Landroidx/appcompat/view/menu/h$a;->getItemData()Landroidx/appcompat/view/menu/e;

    move-result-object v5

    if-ne v5, p1, :cond_1

    return-object v4

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public y()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a;->x:Landroidx/appcompat/widget/a$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_0
    iget-boolean v0, p0, Landroidx/appcompat/widget/a;->z:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/widget/a;->y:Landroid/graphics/drawable/Drawable;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public z()Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a;->N:Landroidx/appcompat/widget/a$c;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v2, p0, Landroidx/appcompat/view/menu/a;->w:Landroidx/appcompat/view/menu/h;

    if-eqz v2, :cond_0

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/widget/a;->N:Landroidx/appcompat/widget/a$c;

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/a;->L:Landroidx/appcompat/widget/a$e;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/f;->b()V

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

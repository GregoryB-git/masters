.class public final Landroidx/appcompat/view/menu/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC/b;


# instance fields
.field public A:Landroid/view/View;

.field public B:Landroid/view/MenuItem$OnActionExpandListener;

.field public C:Z

.field public D:Landroid/view/ContextMenu$ContextMenuInfo;

.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public e:Ljava/lang/CharSequence;

.field public f:Ljava/lang/CharSequence;

.field public g:Landroid/content/Intent;

.field public h:C

.field public i:I

.field public j:C

.field public k:I

.field public l:Landroid/graphics/drawable/Drawable;

.field public m:I

.field public n:Landroidx/appcompat/view/menu/d;

.field public o:Landroidx/appcompat/view/menu/j;

.field public p:Ljava/lang/Runnable;

.field public q:Landroid/view/MenuItem$OnMenuItemClickListener;

.field public r:Ljava/lang/CharSequence;

.field public s:Ljava/lang/CharSequence;

.field public t:Landroid/content/res/ColorStateList;

.field public u:Landroid/graphics/PorterDuff$Mode;

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/d;IIIILjava/lang/CharSequence;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1000

    iput v0, p0, Landroidx/appcompat/view/menu/e;->i:I

    iput v0, p0, Landroidx/appcompat/view/menu/e;->k:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/appcompat/view/menu/e;->m:I

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/appcompat/view/menu/e;->t:Landroid/content/res/ColorStateList;

    iput-object v1, p0, Landroidx/appcompat/view/menu/e;->u:Landroid/graphics/PorterDuff$Mode;

    iput-boolean v0, p0, Landroidx/appcompat/view/menu/e;->v:Z

    iput-boolean v0, p0, Landroidx/appcompat/view/menu/e;->w:Z

    iput-boolean v0, p0, Landroidx/appcompat/view/menu/e;->x:Z

    const/16 v1, 0x10

    iput v1, p0, Landroidx/appcompat/view/menu/e;->y:I

    iput-boolean v0, p0, Landroidx/appcompat/view/menu/e;->C:Z

    iput-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    iput p3, p0, Landroidx/appcompat/view/menu/e;->a:I

    iput p2, p0, Landroidx/appcompat/view/menu/e;->b:I

    iput p4, p0, Landroidx/appcompat/view/menu/e;->c:I

    iput p5, p0, Landroidx/appcompat/view/menu/e;->d:I

    iput-object p6, p0, Landroidx/appcompat/view/menu/e;->e:Ljava/lang/CharSequence;

    iput p7, p0, Landroidx/appcompat/view/menu/e;->z:I

    return-void
.end method

.method public static b(Ljava/lang/StringBuilder;IILjava/lang/String;)V
    .locals 0

    .line 1
    and-int/2addr p1, p2

    if-ne p1, p2, :cond_0

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method


# virtual methods
.method public A()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/view/menu/e;->z:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {v0, p0}, Landroidx/appcompat/view/menu/d;->E(Landroidx/appcompat/view/menu/e;)V

    return-void
.end method

.method public final c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    if-eqz p1, :cond_3

    iget-boolean v0, p0, Landroidx/appcompat/view/menu/e;->x:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Landroidx/appcompat/view/menu/e;->v:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/appcompat/view/menu/e;->w:Z

    if-eqz v0, :cond_3

    :cond_0
    invoke-static {p1}, LB/a;->o(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-boolean v0, p0, Landroidx/appcompat/view/menu/e;->v:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->t:Landroid/content/res/ColorStateList;

    invoke-static {p1, v0}, LB/a;->m(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_1
    iget-boolean v0, p0, Landroidx/appcompat/view/menu/e;->w:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->u:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v0}, LB/a;->n(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/appcompat/view/menu/e;->x:Z

    :cond_3
    return-object p1
.end method

.method public collapseActionView()Z
    .locals 2

    iget v0, p0, Landroidx/appcompat/view/menu/e;->z:I

    and-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->A:Landroid/view/View;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->B:Landroid/view/MenuItem$OnActionExpandListener;

    if-eqz v0, :cond_3

    invoke-interface {v0, p0}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {v0, p0}, Landroidx/appcompat/view/menu/d;->e(Landroidx/appcompat/view/menu/e;)Z

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/view/menu/e;->d:I

    return v0
.end method

.method public e()C
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/d;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-char v0, p0, Landroidx/appcompat/view/menu/e;->j:C

    goto :goto_0

    :cond_0
    iget-char v0, p0, Landroidx/appcompat/view/menu/e;->h:C

    :goto_0
    return v0
.end method

.method public expandActionView()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/e;->i()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->B:Landroid/view/MenuItem$OnActionExpandListener;

    if-eqz v0, :cond_2

    invoke-interface {v0, p0}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {v0, p0}, Landroidx/appcompat/view/menu/d;->j(Landroidx/appcompat/view/menu/e;)Z

    move-result v0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/view/menu/e;->e()C

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/d;->s()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {v3}, Landroidx/appcompat/view/menu/d;->s()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result v3

    if-eqz v3, :cond_1

    sget v3, Le/g;->k:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v3, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {v3}, Landroidx/appcompat/view/menu/d;->C()Z

    move-result v3

    if-eqz v3, :cond_2

    iget v3, p0, Landroidx/appcompat/view/menu/e;->k:I

    goto :goto_0

    :cond_2
    iget v3, p0, Landroidx/appcompat/view/menu/e;->i:I

    :goto_0
    sget v4, Le/g;->g:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/high16 v5, 0x10000

    invoke-static {v2, v3, v5, v4}, Landroidx/appcompat/view/menu/e;->b(Ljava/lang/StringBuilder;IILjava/lang/String;)V

    sget v4, Le/g;->c:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x1000

    invoke-static {v2, v3, v5, v4}, Landroidx/appcompat/view/menu/e;->b(Ljava/lang/StringBuilder;IILjava/lang/String;)V

    sget v4, Le/g;->b:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    invoke-static {v2, v3, v5, v4}, Landroidx/appcompat/view/menu/e;->b(Ljava/lang/StringBuilder;IILjava/lang/String;)V

    sget v4, Le/g;->h:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v2, v3, v5, v4}, Landroidx/appcompat/view/menu/e;->b(Ljava/lang/StringBuilder;IILjava/lang/String;)V

    sget v4, Le/g;->j:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x4

    invoke-static {v2, v3, v5, v4}, Landroidx/appcompat/view/menu/e;->b(Ljava/lang/StringBuilder;IILjava/lang/String;)V

    sget v4, Le/g;->f:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x8

    invoke-static {v2, v3, v5, v4}, Landroidx/appcompat/view/menu/e;->b(Ljava/lang/StringBuilder;IILjava/lang/String;)V

    if-eq v0, v5, :cond_5

    const/16 v3, 0xa

    if-eq v0, v3, :cond_4

    const/16 v3, 0x20

    if-eq v0, v3, :cond_3

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    sget v0, Le/g;->i:I

    :goto_1
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    sget v0, Le/g;->e:I

    goto :goto_1

    :cond_5
    sget v0, Le/g;->d:I

    goto :goto_1

    :goto_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()LI/b;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getActionProvider()Landroid/view/ActionProvider;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This is not supported, use MenuItemCompat.getActionProvider()"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getActionView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->A:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAlphabeticModifiers()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/view/menu/e;->k:I

    return v0
.end method

.method public getAlphabeticShortcut()C
    .locals 1

    iget-char v0, p0, Landroidx/appcompat/view/menu/e;->j:C

    return v0
.end method

.method public getContentDescription()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->r:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getGroupId()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/view/menu/e;->b:I

    return v0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->l:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Landroidx/appcompat/view/menu/e;->c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_0
    iget v0, p0, Landroidx/appcompat/view/menu/e;->m:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/d;->s()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Landroidx/appcompat/view/menu/e;->m:I

    invoke-static {v0, v1}, Lg/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, p0, Landroidx/appcompat/view/menu/e;->m:I

    iput-object v0, p0, Landroidx/appcompat/view/menu/e;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Landroidx/appcompat/view/menu/e;->c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->t:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getIconTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->u:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->g:Landroid/content/Intent;

    return-object v0
.end method

.method public getItemId()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/view/menu/e;->a:I

    return v0
.end method

.method public getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->D:Landroid/view/ContextMenu$ContextMenuInfo;

    return-object v0
.end method

.method public getNumericModifiers()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/view/menu/e;->i:I

    return v0
.end method

.method public getNumericShortcut()C
    .locals 1

    iget-char v0, p0, Landroidx/appcompat/view/menu/e;->h:C

    return v0
.end method

.method public getOrder()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/view/menu/e;->c:I

    return v0
.end method

.method public getSubMenu()Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->o:Landroidx/appcompat/view/menu/j;

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->e:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getTitleCondensed()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->f:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->e:Ljava/lang/CharSequence;

    :goto_0
    return-object v0
.end method

.method public getTooltipText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->s:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public h(Landroidx/appcompat/view/menu/h$a;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroidx/appcompat/view/menu/h$a;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/e;->getTitleCondensed()Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/view/menu/e;->getTitle()Ljava/lang/CharSequence;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public hasSubMenu()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->o:Landroidx/appcompat/view/menu/j;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/view/menu/e;->z:I

    and-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->A:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public isActionViewExpanded()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/view/menu/e;->C:Z

    return v0
.end method

.method public isCheckable()Z
    .locals 2

    iget v0, p0, Landroidx/appcompat/view/menu/e;->y:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public isChecked()Z
    .locals 2

    iget v0, p0, Landroidx/appcompat/view/menu/e;->y:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isEnabled()Z
    .locals 1

    iget v0, p0, Landroidx/appcompat/view/menu/e;->y:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isVisible()Z
    .locals 1

    iget v0, p0, Landroidx/appcompat/view/menu/e;->y:I

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->q:Landroid/view/MenuItem$OnMenuItemClickListener;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Landroid/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {v0, v0, p0}, Landroidx/appcompat/view/menu/d;->g(Landroidx/appcompat/view/menu/d;Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->p:Ljava/lang/Runnable;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return v1

    :cond_2
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->g:Landroid/content/Intent;

    if-eqz v0, :cond_3

    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/d;->s()Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Landroidx/appcompat/view/menu/e;->g:Landroid/content/Intent;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception v0

    const-string v1, "MenuItemImpl"

    const-string v2, "Can\'t find activity to handle intent; ignoring"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public k()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/view/menu/e;->y:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l()Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/view/menu/e;->y:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/view/menu/e;->z:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public n()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/view/menu/e;->z:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o(I)LC/b;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/appcompat/view/menu/d;->s()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Landroid/widget/LinearLayout;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {v1, p1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/e;->p(Landroid/view/View;)LC/b;

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public p(Landroid/view/View;)LC/b;
    .locals 2

    .line 1
    iput-object p1, p0, Landroidx/appcompat/view/menu/e;->A:Landroid/view/View;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget v0, p0, Landroidx/appcompat/view/menu/e;->a:I

    .line 13
    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Landroidx/appcompat/view/menu/d;->E(Landroidx/appcompat/view/menu/e;)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public q(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/view/menu/e;->C:Z

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/view/menu/d;->G(Z)V

    return-void
.end method

.method public r(Z)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/appcompat/view/menu/e;->y:I

    and-int/lit8 v1, v0, -0x3

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    or-int/2addr p1, v1

    iput p1, p0, Landroidx/appcompat/view/menu/e;->y:I

    if-eq v0, p1, :cond_1

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {p1, v2}, Landroidx/appcompat/view/menu/d;->G(Z)V

    :cond_1
    return-void
.end method

.method public s(Z)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/view/menu/e;->y:I

    and-int/lit8 v0, v0, -0x5

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, v0

    iput p1, p0, Landroidx/appcompat/view/menu/e;->y:I

    return-void
.end method

.method public setActionProvider(Landroid/view/ActionProvider;)Landroid/view/MenuItem;
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "This is not supported, use MenuItemCompat.setActionProvider()"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic setActionView(I)Landroid/view/MenuItem;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/e;->o(I)LC/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setActionView(Landroid/view/View;)Landroid/view/MenuItem;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/e;->p(Landroid/view/View;)LC/b;

    move-result-object p1

    return-object p1
.end method

.method public setAlphabeticShortcut(C)Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-char v0, p0, Landroidx/appcompat/view/menu/e;->j:C

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Landroidx/appcompat/view/menu/e;->j:C

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/view/menu/d;->G(Z)V

    return-object p0
.end method

.method public setAlphabeticShortcut(CI)Landroid/view/MenuItem;
    .locals 1

    .line 2
    iget-char v0, p0, Landroidx/appcompat/view/menu/e;->j:C

    if-ne v0, p1, :cond_0

    iget v0, p0, Landroidx/appcompat/view/menu/e;->k:I

    if-ne v0, p2, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Landroidx/appcompat/view/menu/e;->j:C

    invoke-static {p2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/view/menu/e;->k:I

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroidx/appcompat/view/menu/d;->G(Z)V

    return-object p0
.end method

.method public setCheckable(Z)Landroid/view/MenuItem;
    .locals 2

    iget v0, p0, Landroidx/appcompat/view/menu/e;->y:I

    and-int/lit8 v1, v0, -0x2

    or-int/2addr p1, v1

    iput p1, p0, Landroidx/appcompat/view/menu/e;->y:I

    if-eq v0, p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/view/menu/d;->G(Z)V

    :cond_0
    return-object p0
.end method

.method public setChecked(Z)Landroid/view/MenuItem;
    .locals 1

    iget v0, p0, Landroidx/appcompat/view/menu/e;->y:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {p1, p0}, Landroidx/appcompat/view/menu/d;->M(Landroid/view/MenuItem;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/e;->r(Z)V

    :goto_0
    return-object p0
.end method

.method public setContentDescription(Ljava/lang/CharSequence;)LC/b;
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/appcompat/view/menu/e;->r:Ljava/lang/CharSequence;

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/view/menu/d;->G(Z)V

    return-object p0
.end method

.method public bridge synthetic setContentDescription(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/e;->setContentDescription(Ljava/lang/CharSequence;)LC/b;

    move-result-object p1

    return-object p1
.end method

.method public setEnabled(Z)Landroid/view/MenuItem;
    .locals 1

    if-eqz p1, :cond_0

    iget p1, p0, Landroidx/appcompat/view/menu/e;->y:I

    or-int/lit8 p1, p1, 0x10

    :goto_0
    iput p1, p0, Landroidx/appcompat/view/menu/e;->y:I

    goto :goto_1

    :cond_0
    iget p1, p0, Landroidx/appcompat/view/menu/e;->y:I

    and-int/lit8 p1, p1, -0x11

    goto :goto_0

    :goto_1
    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/view/menu/d;->G(Z)V

    return-object p0
.end method

.method public setIcon(I)Landroid/view/MenuItem;
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/view/menu/e;->l:Landroid/graphics/drawable/Drawable;

    iput p1, p0, Landroidx/appcompat/view/menu/e;->m:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/view/menu/e;->x:Z

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/view/menu/d;->G(Z)V

    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Landroidx/appcompat/view/menu/e;->m:I

    iput-object p1, p0, Landroidx/appcompat/view/menu/e;->l:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/view/menu/e;->x:Z

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {p1, v0}, Landroidx/appcompat/view/menu/d;->G(Z)V

    return-object p0
.end method

.method public setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;
    .locals 1

    iput-object p1, p0, Landroidx/appcompat/view/menu/e;->t:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/view/menu/e;->v:Z

    iput-boolean p1, p0, Landroidx/appcompat/view/menu/e;->x:Z

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/view/menu/d;->G(Z)V

    return-object p0
.end method

.method public setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;
    .locals 1

    iput-object p1, p0, Landroidx/appcompat/view/menu/e;->u:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/appcompat/view/menu/e;->w:Z

    iput-boolean p1, p0, Landroidx/appcompat/view/menu/e;->x:Z

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/view/menu/d;->G(Z)V

    return-object p0
.end method

.method public setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/view/menu/e;->g:Landroid/content/Intent;

    return-object p0
.end method

.method public setNumericShortcut(C)Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-char v0, p0, Landroidx/appcompat/view/menu/e;->h:C

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    iput-char p1, p0, Landroidx/appcompat/view/menu/e;->h:C

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/view/menu/d;->G(Z)V

    return-object p0
.end method

.method public setNumericShortcut(CI)Landroid/view/MenuItem;
    .locals 1

    .line 2
    iget-char v0, p0, Landroidx/appcompat/view/menu/e;->h:C

    if-ne v0, p1, :cond_0

    iget v0, p0, Landroidx/appcompat/view/menu/e;->i:I

    if-ne v0, p2, :cond_0

    return-object p0

    :cond_0
    iput-char p1, p0, Landroidx/appcompat/view/menu/e;->h:C

    invoke-static {p2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/view/menu/e;->i:I

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroidx/appcompat/view/menu/d;->G(Z)V

    return-object p0
.end method

.method public setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/view/menu/e;->B:Landroid/view/MenuItem$OnActionExpandListener;

    return-object p0
.end method

.method public setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/view/menu/e;->q:Landroid/view/MenuItem$OnMenuItemClickListener;

    return-object p0
.end method

.method public setShortcut(CC)Landroid/view/MenuItem;
    .locals 0

    .line 1
    iput-char p1, p0, Landroidx/appcompat/view/menu/e;->h:C

    invoke-static {p2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Landroidx/appcompat/view/menu/e;->j:C

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroidx/appcompat/view/menu/d;->G(Z)V

    return-object p0
.end method

.method public setShortcut(CCII)Landroid/view/MenuItem;
    .locals 0

    .line 2
    iput-char p1, p0, Landroidx/appcompat/view/menu/e;->h:C

    invoke-static {p3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/view/menu/e;->i:I

    invoke-static {p2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Landroidx/appcompat/view/menu/e;->j:C

    invoke-static {p4}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Landroidx/appcompat/view/menu/e;->k:I

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroidx/appcompat/view/menu/d;->G(Z)V

    return-object p0
.end method

.method public setShowAsAction(I)V
    .locals 2

    and-int/lit8 v0, p1, 0x3

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput p1, p0, Landroidx/appcompat/view/menu/e;->z:I

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {p1, p0}, Landroidx/appcompat/view/menu/d;->E(Landroidx/appcompat/view/menu/e;)V

    return-void
.end method

.method public bridge synthetic setShowAsActionFlags(I)Landroid/view/MenuItem;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/e;->v(I)LC/b;

    move-result-object p1

    return-object p1
.end method

.method public setTitle(I)Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/d;->s()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/e;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method

.method public setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 2

    .line 2
    iput-object p1, p0, Landroidx/appcompat/view/menu/e;->e:Ljava/lang/CharSequence;

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/view/menu/d;->G(Z)V

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->o:Landroidx/appcompat/view/menu/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/j;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    :cond_0
    return-object p0
.end method

.method public setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    iput-object p1, p0, Landroidx/appcompat/view/menu/e;->f:Ljava/lang/CharSequence;

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/view/menu/d;->G(Z)V

    return-object p0
.end method

.method public setTooltipText(Ljava/lang/CharSequence;)LC/b;
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/appcompat/view/menu/e;->s:Ljava/lang/CharSequence;

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/view/menu/d;->G(Z)V

    return-object p0
.end method

.method public bridge synthetic setTooltipText(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/e;->setTooltipText(Ljava/lang/CharSequence;)LC/b;

    move-result-object p1

    return-object p1
.end method

.method public setVisible(Z)Landroid/view/MenuItem;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/e;->x(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {p1, p0}, Landroidx/appcompat/view/menu/d;->F(Landroidx/appcompat/view/menu/e;)V

    :cond_0
    return-object p0
.end method

.method public t(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    iget p1, p0, Landroidx/appcompat/view/menu/e;->y:I

    or-int/lit8 p1, p1, 0x20

    :goto_0
    iput p1, p0, Landroidx/appcompat/view/menu/e;->y:I

    goto :goto_1

    :cond_0
    iget p1, p0, Landroidx/appcompat/view/menu/e;->y:I

    and-int/lit8 p1, p1, -0x21

    goto :goto_0

    :goto_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->e:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public u(Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/view/menu/e;->D:Landroid/view/ContextMenu$ContextMenuInfo;

    return-void
.end method

.method public v(I)LC/b;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/e;->setShowAsAction(I)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public w(Landroidx/appcompat/view/menu/j;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/appcompat/view/menu/e;->o:Landroidx/appcompat/view/menu/j;

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/e;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/view/menu/j;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    return-void
.end method

.method public x(Z)Z
    .locals 3

    .line 1
    iget v0, p0, Landroidx/appcompat/view/menu/e;->y:I

    and-int/lit8 v1, v0, -0x9

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    or-int/2addr p1, v1

    iput p1, p0, Landroidx/appcompat/view/menu/e;->y:I

    if-eq v0, p1, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method public y()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/d;->w()Z

    move-result v0

    return v0
.end method

.method public z()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/view/menu/e;->n:Landroidx/appcompat/view/menu/d;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/d;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/e;->e()C

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.class public final Lj/e;
.super Landroid/view/ActionMode;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/e$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lj/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lj/a;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    iput-object p1, p0, Lj/e;->a:Landroid/content/Context;

    iput-object p2, p0, Lj/e;->b:Lj/a;

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    invoke-virtual {v0}, Lj/a;->c()V

    return-void
.end method

.method public final getCustomView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    invoke-virtual {v0}, Lj/a;->d()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final getMenu()Landroid/view/Menu;
    .locals 3

    new-instance v0, Lk/e;

    iget-object v1, p0, Lj/e;->a:Landroid/content/Context;

    iget-object v2, p0, Lj/e;->b:Lj/a;

    invoke-virtual {v2}, Lj/a;->e()Landroidx/appcompat/view/menu/f;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lk/e;-><init>(Landroid/content/Context;Lz/a;)V

    return-object v0
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    invoke-virtual {v0}, Lj/a;->f()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    invoke-virtual {v0}, Lj/a;->g()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTag()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    iget-object v0, v0, Lj/a;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    invoke-virtual {v0}, Lj/a;->h()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTitleOptionalHint()Z
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    iget-boolean v0, v0, Lj/a;->b:Z

    return v0
.end method

.method public final invalidate()V
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    invoke-virtual {v0}, Lj/a;->i()V

    return-void
.end method

.method public final isTitleOptional()Z
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    invoke-virtual {v0}, Lj/a;->j()Z

    move-result v0

    return v0
.end method

.method public final setCustomView(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    invoke-virtual {v0, p1}, Lj/a;->k(Landroid/view/View;)V

    return-void
.end method

.method public final setSubtitle(I)V
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    invoke-virtual {v0, p1}, Lj/a;->l(I)V

    return-void
.end method

.method public final setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    invoke-virtual {v0, p1}, Lj/a;->m(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTag(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    iput-object p1, v0, Lj/a;->a:Ljava/lang/Object;

    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    invoke-virtual {v0, p1}, Lj/a;->n(I)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    invoke-virtual {v0, p1}, Lj/a;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTitleOptionalHint(Z)V
    .locals 1

    iget-object v0, p0, Lj/e;->b:Lj/a;

    invoke-virtual {v0, p1}, Lj/a;->p(Z)V

    return-void
.end method

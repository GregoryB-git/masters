.class public final Lg/k;
.super Le0/q0;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lg/g;


# direct methods
.method public constructor <init>(Lg/g;)V
    .locals 0

    iput-object p1, p0, Lg/k;->b:Lg/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Le0/q0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lg/k;->b:Lg/g;

    iget-object v0, v0, Lg/g;->D:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object v0, p0, Lg/k;->b:Lg/g;

    iget-object v0, v0, Lg/g;->D:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg/k;->b:Lg/g;

    iget-object v0, v0, Lg/g;->D:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget-object v1, Le0/d0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, Le0/d0$c;->c(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lg/k;->b:Lg/g;

    iget-object v0, v0, Lg/g;->D:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Lg/k;->b:Lg/g;

    iget-object v0, v0, Lg/g;->G:Le0/o0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Le0/o0;->d(Le0/p0;)V

    iget-object v0, p0, Lg/k;->b:Lg/g;

    iput-object v1, v0, Lg/g;->G:Le0/o0;

    return-void
.end method

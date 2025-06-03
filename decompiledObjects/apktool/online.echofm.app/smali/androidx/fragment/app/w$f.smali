.class public Landroidx/fragment/app/w$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/w;->l(Landroidx/fragment/app/y;Landroid/view/ViewGroup;Landroid/view/View;Lt/a;Landroidx/fragment/app/w$h;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Landroidx/fragment/app/y;

.field public final synthetic p:Lt/a;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Landroidx/fragment/app/w$h;

.field public final synthetic s:Ljava/util/ArrayList;

.field public final synthetic t:Landroid/view/View;

.field public final synthetic u:Landroidx/fragment/app/Fragment;

.field public final synthetic v:Landroidx/fragment/app/Fragment;

.field public final synthetic w:Z

.field public final synthetic x:Ljava/util/ArrayList;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/y;Lt/a;Ljava/lang/Object;Landroidx/fragment/app/w$h;Ljava/util/ArrayList;Landroid/view/View;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLjava/util/ArrayList;Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/w$f;->o:Landroidx/fragment/app/y;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/w$f;->p:Lt/a;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/fragment/app/w$f;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/fragment/app/w$f;->r:Landroidx/fragment/app/w$h;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/fragment/app/w$f;->s:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/fragment/app/w$f;->t:Landroid/view/View;

    .line 12
    .line 13
    iput-object p7, p0, Landroidx/fragment/app/w$f;->u:Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    iput-object p8, p0, Landroidx/fragment/app/w$f;->v:Landroidx/fragment/app/Fragment;

    .line 16
    .line 17
    iput-boolean p9, p0, Landroidx/fragment/app/w$f;->w:Z

    .line 18
    .line 19
    iput-object p10, p0, Landroidx/fragment/app/w$f;->x:Ljava/util/ArrayList;

    .line 20
    .line 21
    iput-object p11, p0, Landroidx/fragment/app/w$f;->y:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p12, p0, Landroidx/fragment/app/w$f;->z:Landroid/graphics/Rect;

    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/w$f;->o:Landroidx/fragment/app/y;

    iget-object v1, p0, Landroidx/fragment/app/w$f;->p:Lt/a;

    iget-object v2, p0, Landroidx/fragment/app/w$f;->q:Ljava/lang/Object;

    iget-object v3, p0, Landroidx/fragment/app/w$f;->r:Landroidx/fragment/app/w$h;

    invoke-static {v0, v1, v2, v3}, Landroidx/fragment/app/w;->h(Landroidx/fragment/app/y;Lt/a;Ljava/lang/Object;Landroidx/fragment/app/w$h;)Lt/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/w$f;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Lt/a;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Landroidx/fragment/app/w$f;->s:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/w$f;->t:Landroid/view/View;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/w$f;->u:Landroidx/fragment/app/Fragment;

    iget-object v2, p0, Landroidx/fragment/app/w$f;->v:Landroidx/fragment/app/Fragment;

    iget-boolean v3, p0, Landroidx/fragment/app/w$f;->w:Z

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v0, v4}, Landroidx/fragment/app/w;->f(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLt/a;Z)V

    iget-object v1, p0, Landroidx/fragment/app/w$f;->q:Ljava/lang/Object;

    if-eqz v1, :cond_1

    iget-object v2, p0, Landroidx/fragment/app/w$f;->o:Landroidx/fragment/app/y;

    iget-object v3, p0, Landroidx/fragment/app/w$f;->x:Ljava/util/ArrayList;

    iget-object v4, p0, Landroidx/fragment/app/w$f;->s:Ljava/util/ArrayList;

    invoke-virtual {v2, v1, v3, v4}, Landroidx/fragment/app/y;->A(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    iget-object v1, p0, Landroidx/fragment/app/w$f;->r:Landroidx/fragment/app/w$h;

    iget-object v2, p0, Landroidx/fragment/app/w$f;->y:Ljava/lang/Object;

    iget-boolean v3, p0, Landroidx/fragment/app/w$f;->w:Z

    invoke-static {v0, v1, v2, v3}, Landroidx/fragment/app/w;->s(Lt/a;Landroidx/fragment/app/w$h;Ljava/lang/Object;Z)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/w$f;->o:Landroidx/fragment/app/y;

    iget-object v2, p0, Landroidx/fragment/app/w$f;->z:Landroid/graphics/Rect;

    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/y;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method

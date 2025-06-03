.class public Landroidx/fragment/app/w$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/w;->y(Landroidx/fragment/app/y;Landroid/view/ViewGroup;Landroidx/fragment/app/Fragment;Landroid/view/View;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Landroidx/fragment/app/y;

.field public final synthetic q:Landroid/view/View;

.field public final synthetic r:Landroidx/fragment/app/Fragment;

.field public final synthetic s:Ljava/util/ArrayList;

.field public final synthetic t:Ljava/util/ArrayList;

.field public final synthetic u:Ljava/util/ArrayList;

.field public final synthetic v:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroidx/fragment/app/y;Landroid/view/View;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/w$d;->o:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/fragment/app/w$d;->p:Landroidx/fragment/app/y;

    iput-object p3, p0, Landroidx/fragment/app/w$d;->q:Landroid/view/View;

    iput-object p4, p0, Landroidx/fragment/app/w$d;->r:Landroidx/fragment/app/Fragment;

    iput-object p5, p0, Landroidx/fragment/app/w$d;->s:Ljava/util/ArrayList;

    iput-object p6, p0, Landroidx/fragment/app/w$d;->t:Ljava/util/ArrayList;

    iput-object p7, p0, Landroidx/fragment/app/w$d;->u:Ljava/util/ArrayList;

    iput-object p8, p0, Landroidx/fragment/app/w$d;->v:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/w$d;->o:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/w$d;->p:Landroidx/fragment/app/y;

    iget-object v2, p0, Landroidx/fragment/app/w$d;->q:Landroid/view/View;

    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/y;->p(Ljava/lang/Object;Landroid/view/View;)V

    iget-object v0, p0, Landroidx/fragment/app/w$d;->p:Landroidx/fragment/app/y;

    iget-object v1, p0, Landroidx/fragment/app/w$d;->o:Ljava/lang/Object;

    iget-object v2, p0, Landroidx/fragment/app/w$d;->r:Landroidx/fragment/app/Fragment;

    iget-object v3, p0, Landroidx/fragment/app/w$d;->s:Ljava/util/ArrayList;

    iget-object v4, p0, Landroidx/fragment/app/w$d;->q:Landroid/view/View;

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/fragment/app/w;->k(Landroidx/fragment/app/y;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/w$d;->t:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/w$d;->u:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/w$d;->v:Ljava/lang/Object;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Landroidx/fragment/app/w$d;->q:Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Landroidx/fragment/app/w$d;->p:Landroidx/fragment/app/y;

    iget-object v2, p0, Landroidx/fragment/app/w$d;->v:Ljava/lang/Object;

    iget-object v3, p0, Landroidx/fragment/app/w$d;->u:Ljava/util/ArrayList;

    invoke-virtual {v1, v2, v3, v0}, Landroidx/fragment/app/y;->q(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/w$d;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Landroidx/fragment/app/w$d;->u:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/w$d;->q:Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

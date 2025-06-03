.class public Landroidx/fragment/app/w$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/w;->n(Landroid/view/ViewGroup;Landroidx/fragment/app/w$h;Landroid/view/View;Lt/a;Landroidx/fragment/app/w$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Landroidx/fragment/app/w$g;

.field public final synthetic p:Landroidx/fragment/app/Fragment;

.field public final synthetic q:LE/c;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/w$g;Landroidx/fragment/app/Fragment;LE/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/w$c;->o:Landroidx/fragment/app/w$g;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/w$c;->p:Landroidx/fragment/app/Fragment;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/fragment/app/w$c;->q:LE/c;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/w$c;->o:Landroidx/fragment/app/w$g;

    iget-object v1, p0, Landroidx/fragment/app/w$c;->p:Landroidx/fragment/app/Fragment;

    iget-object v2, p0, Landroidx/fragment/app/w$c;->q:LE/c;

    invoke-interface {v0, v1, v2}, Landroidx/fragment/app/w$g;->a(Landroidx/fragment/app/Fragment;LE/c;)V

    return-void
.end method

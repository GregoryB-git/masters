.class public Landroidx/fragment/app/c$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/c;->x(Ljava/util/List;ZLandroidx/fragment/app/B$e;Landroidx/fragment/app/B$e;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Landroidx/fragment/app/B$e;

.field public final synthetic p:Landroidx/fragment/app/B$e;

.field public final synthetic q:Z

.field public final synthetic r:Lt/a;

.field public final synthetic s:Landroidx/fragment/app/c;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/c;Landroidx/fragment/app/B$e;Landroidx/fragment/app/B$e;ZLt/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/c$g;->s:Landroidx/fragment/app/c;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/c$g;->o:Landroidx/fragment/app/B$e;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/fragment/app/c$g;->p:Landroidx/fragment/app/B$e;

    .line 6
    .line 7
    iput-boolean p4, p0, Landroidx/fragment/app/c$g;->q:Z

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/fragment/app/c$g;->r:Lt/a;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/c$g;->o:Landroidx/fragment/app/B$e;

    invoke-virtual {v0}, Landroidx/fragment/app/B$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/c$g;->p:Landroidx/fragment/app/B$e;

    invoke-virtual {v1}, Landroidx/fragment/app/B$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v1

    iget-boolean v2, p0, Landroidx/fragment/app/c$g;->q:Z

    iget-object v3, p0, Landroidx/fragment/app/c$g;->r:Lt/a;

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/fragment/app/w;->f(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLt/a;Z)V

    return-void
.end method

.class public Landroidx/fragment/app/c$k;
.super Landroidx/fragment/app/c$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "k"
.end annotation


# instance fields
.field public c:Z

.field public d:Landroidx/fragment/app/f$d;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/B$e;LE/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/fragment/app/c$l;-><init>(Landroidx/fragment/app/B$e;LE/c;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Landroidx/fragment/app/c$k;->c:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public e(Landroid/content/Context;)Landroidx/fragment/app/f$d;
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/c$k;->c:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/c$k;->d:Landroidx/fragment/app/f$d;

    return-object p1

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/c$l;->b()Landroidx/fragment/app/B$e;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/B$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/c$l;->b()Landroidx/fragment/app/B$e;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/B$e;->e()Landroidx/fragment/app/B$e$c;

    move-result-object v1

    sget-object v2, Landroidx/fragment/app/B$e$c;->p:Landroidx/fragment/app/B$e$c;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {p1, v0, v1}, Landroidx/fragment/app/f;->b(Landroid/content/Context;Landroidx/fragment/app/Fragment;Z)Landroidx/fragment/app/f$d;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/c$k;->d:Landroidx/fragment/app/f$d;

    iput-boolean v3, p0, Landroidx/fragment/app/c$k;->c:Z

    return-object p1
.end method

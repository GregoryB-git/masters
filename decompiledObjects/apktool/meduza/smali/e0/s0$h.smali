.class public Le0/s0$h;
.super Le0/s0$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# direct methods
.method public constructor <init>(Le0/s0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Le0/s0$g;-><init>(Le0/s0;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public a()Le0/s0;
    .locals 2

    iget-object v0, p0, Le0/s0$f;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, Landroid/support/v4/media/session/b;->f(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Le0/s0;->c(Landroid/view/WindowInsets;Landroid/view/View;)Le0/s0;

    move-result-object v0

    return-object v0
.end method

.method public e()Le0/h;
    .locals 2

    iget-object v0, p0, Le0/s0$f;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, Ld2/k;->d(Landroid/view/WindowInsets;)Landroid/view/DisplayCutout;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Le0/h;

    invoke-direct {v1, v0}, Le0/h;-><init>(Landroid/view/DisplayCutout;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Le0/s0$h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Le0/s0$h;

    iget-object v1, p0, Le0/s0$f;->c:Landroid/view/WindowInsets;

    iget-object v3, p1, Le0/s0$f;->c:Landroid/view/WindowInsets;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Le0/s0$f;->e:Lx/b;

    iget-object p1, p1, Le0/s0$f;->e:Lx/b;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Le0/s0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->hashCode()I

    move-result v0

    return v0
.end method

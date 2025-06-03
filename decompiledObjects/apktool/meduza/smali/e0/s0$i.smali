.class public Le0/s0$i;
.super Le0/s0$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# direct methods
.method public constructor <init>(Le0/s0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Le0/s0$h;-><init>(Le0/s0;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public h(IIII)Le0/s0;
    .locals 1

    iget-object v0, p0, Le0/s0$f;->c:Landroid/view/WindowInsets;

    invoke-static {v0, p1, p2, p3, p4}, Laa/u;->d(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Le0/s0;->c(Landroid/view/WindowInsets;Landroid/view/View;)Le0/s0;

    move-result-object p1

    return-object p1
.end method

.method public m(Lx/b;)V
    .locals 0

    return-void
.end method

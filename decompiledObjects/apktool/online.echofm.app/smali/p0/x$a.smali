.class public Lp0/x$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp0/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Looper;Ll0/y1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(Ld0/q;)I
    .locals 0

    .line 1
    iget-object p1, p1, Ld0/q;->r:Ld0/m;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    return p1
.end method

.method public c(Lp0/v$a;Ld0/q;)Lp0/n;
    .locals 2

    .line 1
    iget-object p1, p2, Ld0/q;->r:Ld0/m;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    new-instance p1, Lp0/D;

    .line 8
    .line 9
    new-instance p2, Lp0/n$a;

    .line 10
    .line 11
    new-instance v0, Lp0/T;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1}, Lp0/T;-><init>(I)V

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x1771

    .line 18
    .line 19
    invoke-direct {p2, v0, v1}, Lp0/n$a;-><init>(Ljava/lang/Throwable;I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, p2}, Lp0/D;-><init>(Lp0/n$a;)V

    .line 23
    .line 24
    .line 25
    return-object p1
.end method

.method public synthetic d(Lp0/v$a;Ld0/q;)Lp0/x$b;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lp0/w;->a(Lp0/x;Lp0/v$a;Ld0/q;)Lp0/x$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public synthetic g()V
    .locals 0

    .line 1
    invoke-static {p0}, Lp0/w;->b(Lp0/x;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public synthetic release()V
    .locals 0

    .line 1
    invoke-static {p0}, Lp0/w;->c(Lp0/x;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

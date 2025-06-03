.class public final Lnb/g;
.super Lnb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnb/g$a;
    }
.end annotation


# instance fields
.field public final a:Leb/k0$e;


# direct methods
.method public constructor <init>(Leb/k0$e;)V
    .locals 1

    invoke-direct {p0}, Lnb/c;-><init>()V

    const-string v0, "helper"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lnb/g;->a:Leb/k0$e;

    return-void
.end method


# virtual methods
.method public final a(Leb/k0$b;)Leb/k0$i;
    .locals 3

    sget-object v0, Leb/k0;->b:Leb/a$b;

    invoke-virtual {p1}, Leb/k0$b;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/k0$k;

    invoke-super {p0, p1}, Lnb/c;->a(Leb/k0$b;)Leb/k0$i;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Leb/k0$i;->c()Leb/a;

    move-result-object v1

    sget-object v2, Leb/k0;->d:Leb/a$b;

    invoke-virtual {v1, v2}, Leb/a;->a(Leb/a$b;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    return-object p1

    :cond_1
    new-instance v1, Lnb/g$a;

    invoke-direct {v1, p1, v0}, Lnb/g$a;-><init>(Leb/k0$i;Leb/k0$k;)V

    return-object v1
.end method

.method public final g()Leb/k0$e;
    .locals 1

    iget-object v0, p0, Lnb/g;->a:Leb/k0$e;

    return-object v0
.end method

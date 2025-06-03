.class public final Lnb/i$c;
.super Lnb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public a:Lnb/g;

.field public final synthetic b:Lnb/i;


# direct methods
.method public constructor <init>(Lnb/i;Leb/k0$e;)V
    .locals 0

    iput-object p1, p0, Lnb/i$c;->b:Lnb/i;

    invoke-direct {p0}, Lnb/c;-><init>()V

    new-instance p1, Lnb/g;

    invoke-direct {p1, p2}, Lnb/g;-><init>(Leb/k0$e;)V

    iput-object p1, p0, Lnb/i$c;->a:Lnb/g;

    return-void
.end method


# virtual methods
.method public final a(Leb/k0$b;)Leb/k0$i;
    .locals 4

    .line 1
    new-instance v0, Lnb/i$h;

    .line 2
    .line 3
    iget-object v1, p0, Lnb/i$c;->b:Lnb/i;

    .line 4
    .line 5
    iget-object v2, p0, Lnb/i$c;->a:Lnb/g;

    .line 6
    .line 7
    invoke-direct {v0, v1, p1, v2}, Lnb/i$h;-><init>(Lnb/i;Leb/k0$b;Lnb/g;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Leb/k0$b;->a:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {p1}, Lnb/i;->g(Ljava/util/List;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lnb/i$c;->b:Lnb/i;

    .line 19
    .line 20
    iget-object v1, v1, Lnb/i;->f:Lnb/i$b;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Leb/u;

    .line 28
    .line 29
    iget-object v3, v3, Leb/u;->a:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v1, v3}, Lo7/p;->containsKey(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    iget-object v1, p0, Lnb/i$c;->b:Lnb/i;

    .line 42
    .line 43
    iget-object v1, v1, Lnb/i;->f:Lnb/i$b;

    .line 44
    .line 45
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Leb/u;

    .line 50
    .line 51
    iget-object p1, p1, Leb/u;->a:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v1, p1}, Lo7/p;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Lnb/i$a;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lnb/i$a;->a(Lnb/i$h;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p1, Lnb/i$a;->d:Ljava/lang/Long;

    .line 67
    .line 68
    if-eqz p1, :cond_0

    .line 69
    .line 70
    invoke-virtual {v0}, Lnb/i$h;->k()V

    .line 71
    .line 72
    .line 73
    :cond_0
    return-object v0
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final f(Leb/n;Leb/k0$j;)V
    .locals 2

    iget-object v0, p0, Lnb/i$c;->a:Lnb/g;

    new-instance v1, Lnb/i$g;

    invoke-direct {v1, p2}, Lnb/i$g;-><init>(Leb/k0$j;)V

    invoke-virtual {v0, p1, v1}, Lnb/c;->f(Leb/n;Leb/k0$j;)V

    return-void
.end method

.method public final g()Leb/k0$e;
    .locals 1

    iget-object v0, p0, Lnb/i$c;->a:Lnb/g;

    return-object v0
.end method

.class public final Lnb/e$a;
.super Leb/k0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic f:Lnb/e;


# direct methods
.method public constructor <init>(Lnb/e;)V
    .locals 0

    iput-object p1, p0, Lnb/e$a;->f:Lnb/e;

    invoke-direct {p0}, Leb/k0;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Leb/e1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnb/e$a;->f:Lnb/e;

    .line 2
    .line 3
    iget-object v0, v0, Lnb/e;->g:Leb/k0$e;

    .line 4
    .line 5
    sget-object v1, Leb/n;->c:Leb/n;

    .line 6
    .line 7
    new-instance v2, Leb/k0$d;

    .line 8
    .line 9
    invoke-static {p1}, Leb/k0$f;->a(Leb/e1;)Leb/k0$f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {v2, p1}, Leb/k0$d;-><init>(Leb/k0$f;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Leb/k0$e;->f(Leb/n;Leb/k0$j;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final d(Leb/k0$h;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()V
    .locals 0

    return-void
.end method

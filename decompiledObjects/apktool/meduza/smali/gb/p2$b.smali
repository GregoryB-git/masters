.class public final Lgb/p2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/k0$k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/p2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public a:Leb/o;

.field public b:Lgb/p2$g;

.field public final synthetic c:Lgb/p2;


# direct methods
.method public constructor <init>(Lgb/p2;)V
    .locals 0

    iput-object p1, p0, Lgb/p2$b;->c:Lgb/p2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Leb/n;->d:Leb/n;

    invoke-static {p1}, Leb/o;->a(Leb/n;)Leb/o;

    move-result-object p1

    iput-object p1, p0, Lgb/p2$b;->a:Leb/o;

    return-void
.end method


# virtual methods
.method public final a(Leb/o;)V
    .locals 5

    .line 1
    sget-object v0, Lgb/p2;->o:Ljava/util/logging/Logger;

    .line 2
    .line 3
    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object p1, v2, v3

    .line 10
    .line 11
    iget-object v3, p0, Lgb/p2$b;->b:Lgb/p2$g;

    .line 12
    .line 13
    iget-object v3, v3, Lgb/p2$g;->a:Leb/k0$i;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    aput-object v3, v2, v4

    .line 17
    .line 18
    const-string v3, "Received health status {0} for subchannel {1}"

    .line 19
    .line 20
    invoke-virtual {v0, v1, v3, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lgb/p2$b;->a:Leb/o;

    .line 24
    .line 25
    iget-object p1, p0, Lgb/p2$b;->c:Lgb/p2;

    .line 26
    .line 27
    iget-object p1, p1, Lgb/p2;->h:Lgb/p2$c;

    .line 28
    .line 29
    invoke-virtual {p1}, Lgb/p2$c;->c()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    iget-object p1, p0, Lgb/p2$b;->c:Lgb/p2;

    .line 36
    .line 37
    iget-object v0, p1, Lgb/p2;->g:Ljava/util/HashMap;

    .line 38
    .line 39
    iget-object p1, p1, Lgb/p2;->h:Lgb/p2$c;

    .line 40
    .line 41
    invoke-virtual {p1}, Lgb/p2$c;->a()Ljava/net/SocketAddress;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lgb/p2$g;

    .line 50
    .line 51
    iget-object p1, p1, Lgb/p2$g;->c:Lgb/p2$b;

    .line 52
    .line 53
    if-ne p1, p0, :cond_0

    .line 54
    .line 55
    iget-object p1, p0, Lgb/p2$b;->c:Lgb/p2;

    .line 56
    .line 57
    iget-object v0, p0, Lgb/p2$b;->b:Lgb/p2$g;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Lgb/p2;->j(Lgb/p2$g;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    return-void
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

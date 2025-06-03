.class public final Lio/meduza/meduza/MainActivity$b$a;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/meduza/meduza/MainActivity$b;->onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwb/i;",
        "Ldc/p<",
        "Lnc/d0;",
        "Lub/e<",
        "-",
        "Lrb/h;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "io.meduza.meduza.MainActivity$networkHandler$1$onCapabilitiesChanged$1"
    f = "MainActivity.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic a:Lio/meduza/meduza/MainActivity;


# direct methods
.method public constructor <init>(Lio/meduza/meduza/MainActivity;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/meduza/meduza/MainActivity;",
            "Lub/e<",
            "-",
            "Lio/meduza/meduza/MainActivity$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/meduza/meduza/MainActivity$b$a;->a:Lio/meduza/meduza/MainActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lub/e<",
            "*>;)",
            "Lub/e<",
            "Lrb/h;",
            ">;"
        }
    .end annotation

    new-instance p1, Lio/meduza/meduza/MainActivity$b$a;

    iget-object v0, p0, Lio/meduza/meduza/MainActivity$b$a;->a:Lio/meduza/meduza/MainActivity;

    invoke-direct {p1, v0, p2}, Lio/meduza/meduza/MainActivity$b$a;-><init>(Lio/meduza/meduza/MainActivity;Lub/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc/d0;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lio/meduza/meduza/MainActivity$b$a;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lio/meduza/meduza/MainActivity$b$a;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lio/meduza/meduza/MainActivity$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 2
    .line 3
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lio/meduza/meduza/MainActivity$b$a;->a:Lio/meduza/meduza/MainActivity;

    .line 7
    .line 8
    iget-object v0, p1, Lio/meduza/meduza/MainActivity;->d:Ljava/util/Map;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lio/meduza/meduza/MainActivity;->b(Ljava/util/Map;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 14
    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
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

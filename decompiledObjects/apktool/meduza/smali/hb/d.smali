.class public final Lhb/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljb/d;

.field public static final b:Ljb/d;

.field public static final c:Ljb/d;

.field public static final d:Ljb/d;

.field public static final e:Ljb/d;

.field public static final f:Ljb/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljb/d;

    .line 2
    .line 3
    sget-object v1, Ljb/d;->g:Lxc/i;

    .line 4
    .line 5
    const-string v2, "https"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljb/d;-><init>(Lxc/i;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lhb/d;->a:Ljb/d;

    .line 11
    .line 12
    new-instance v0, Ljb/d;

    .line 13
    .line 14
    const-string v2, "http"

    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Ljb/d;-><init>(Lxc/i;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lhb/d;->b:Ljb/d;

    .line 20
    .line 21
    new-instance v0, Ljb/d;

    .line 22
    .line 23
    sget-object v1, Ljb/d;->e:Lxc/i;

    .line 24
    .line 25
    const-string v2, "POST"

    .line 26
    .line 27
    invoke-direct {v0, v1, v2}, Ljb/d;-><init>(Lxc/i;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lhb/d;->c:Ljb/d;

    .line 31
    .line 32
    new-instance v0, Ljb/d;

    .line 33
    .line 34
    const-string v2, "GET"

    .line 35
    .line 36
    invoke-direct {v0, v1, v2}, Ljb/d;-><init>(Lxc/i;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lhb/d;->d:Ljb/d;

    .line 40
    .line 41
    new-instance v0, Ljb/d;

    .line 42
    .line 43
    sget-object v1, Lgb/v0;->i:Leb/s0$b;

    .line 44
    .line 45
    iget-object v1, v1, Leb/s0$d;->a:Ljava/lang/String;

    .line 46
    .line 47
    const-string v2, "application/grpc"

    .line 48
    .line 49
    invoke-direct {v0, v1, v2}, Ljb/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lhb/d;->e:Ljb/d;

    .line 53
    .line 54
    new-instance v0, Ljb/d;

    .line 55
    .line 56
    const-string v1, "te"

    .line 57
    .line 58
    const-string v2, "trailers"

    .line 59
    .line 60
    invoke-direct {v0, v1, v2}, Ljb/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lhb/d;->f:Ljb/d;

    .line 64
    .line 65
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

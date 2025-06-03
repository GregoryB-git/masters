.class public final Lo6/c;
.super Lk6/d;
.source "SourceFile"


# static fields
.field public static final a:Lk6/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk6/a$g;

    invoke-direct {v0}, Lk6/a$g;-><init>()V

    new-instance v1, Lo6/b;

    invoke-direct {v1}, Lo6/b;-><init>()V

    new-instance v2, Lk6/a;

    const-string v3, "ClientTelemetry.API"

    invoke-direct {v2, v3, v1, v0}, Lk6/a;-><init>(Ljava/lang/String;Lk6/a$a;Lk6/a$g;)V

    sput-object v2, Lo6/c;->a:Lk6/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm6/n;)V
    .locals 2

    sget-object v0, Lo6/c;->a:Lk6/a;

    sget-object v1, Lk6/d$a;->c:Lk6/d$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lk6/d;-><init>(Landroid/content/Context;Lk6/a;Lk6/a$d;Lk6/d$a;)V

    return-void
.end method


# virtual methods
.method public final a(Lm6/m;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/m;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ll6/q$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ll6/q$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Lj6/d;

    .line 8
    .line 9
    sget-object v2, Lcom/google/android/gms/internal/base/zaf;->zaa:Lj6/d;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aput-object v2, v1, v3

    .line 13
    .line 14
    iput-object v1, v0, Ll6/q$a;->c:[Lj6/d;

    .line 15
    .line 16
    iput-boolean v3, v0, Ll6/q$a;->b:Z

    .line 17
    .line 18
    new-instance v1, Ld2/h0;

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    invoke-direct {v1, p1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, Ll6/q$a;->a:Ll6/n;

    .line 25
    .line 26
    invoke-virtual {v0}, Ll6/q$a;->a()Ll6/s0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1}, Lk6/d;->doBestEffortWrite(Ll6/q;)Lcom/google/android/gms/tasks/Task;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
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

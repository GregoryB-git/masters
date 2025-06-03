.class public final Lm9/n;
.super Leb/b;
.source "SourceFile"


# static fields
.field public static final c:Leb/s0$b;

.field public static final d:Leb/s0$b;


# instance fields
.field public final a:Le9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le9/a;"
        }
    .end annotation
.end field

.field public final b:Le9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le9/a;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Leb/s0;->d:Leb/s0$a;

    .line 2
    .line 3
    sget-object v1, Leb/s0$d;->d:Ljava/util/BitSet;

    .line 4
    .line 5
    new-instance v1, Leb/s0$b;

    .line 6
    .line 7
    const-string v2, "Authorization"

    .line 8
    .line 9
    invoke-direct {v1, v2, v0}, Leb/s0$b;-><init>(Ljava/lang/String;Leb/s0$c;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lm9/n;->c:Leb/s0$b;

    .line 13
    .line 14
    new-instance v1, Leb/s0$b;

    .line 15
    .line 16
    const-string v2, "x-firebase-appcheck"

    .line 17
    .line 18
    invoke-direct {v1, v2, v0}, Leb/s0$b;-><init>(Ljava/lang/String;Leb/s0$c;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lm9/n;->d:Leb/s0$b;

    .line 22
    .line 23
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public constructor <init>(Le9/a;Le9/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le9/a;",
            "Le9/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Leb/b;-><init>()V

    iput-object p1, p0, Lm9/n;->a:Le9/a;

    iput-object p2, p0, Lm9/n;->b:Le9/a;

    return-void
.end method


# virtual methods
.method public final a(Leb/b$b;Ljava/util/concurrent/Executor;Leb/b$a;)V
    .locals 3

    iget-object p1, p0, Lm9/n;->a:Le9/a;

    invoke-virtual {p1}, Le9/a;->s()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iget-object p2, p0, Lm9/n;->b:Le9/a;

    invoke-virtual {p2}, Le9/a;->s()Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/tasks/Task;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 v1, 0x1

    aput-object p2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->whenAll([Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    sget-object v1, Ln9/f;->b:Lm/a;

    new-instance v2, Lm9/m;

    invoke-direct {v2, p1, p3, p2}, Lm9/m;-><init>(Lcom/google/android/gms/tasks/Task;Leb/b$a;Lcom/google/android/gms/tasks/Task;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

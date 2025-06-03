.class public final Le7/w2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/util/List<",
        "Le7/f;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/google/android/gms/measurement/internal/zzig;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Le7/w2;->a:Ljava/lang/String;

    iput-object p3, p0, Le7/w2;->b:Ljava/lang/String;

    iput-object p4, p0, Le7/w2;->c:Ljava/lang/String;

    iput-object p1, p0, Le7/w2;->d:Lcom/google/android/gms/measurement/internal/zzig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Le7/w2;->d:Lcom/google/android/gms/measurement/internal/zzig;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 4
    .line 5
    invoke-virtual {v0}, Le7/i6;->c0()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Le7/w2;->d:Lcom/google/android/gms/measurement/internal/zzig;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 11
    .line 12
    iget-object v0, v0, Le7/i6;->c:Le7/o;

    .line 13
    .line 14
    invoke-static {v0}, Le7/i6;->q(Le7/h6;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Le7/w2;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v2, p0, Le7/w2;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v3, p0, Le7/w2;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2, v3}, Le7/o;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
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

.class public final Le7/q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:Lcom/google/android/gms/measurement/internal/zzig;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Le7/q2;->a:Ljava/lang/String;

    iput-object p3, p0, Le7/q2;->b:Ljava/lang/String;

    iput-object p4, p0, Le7/q2;->c:Ljava/lang/String;

    iput-wide p5, p0, Le7/q2;->d:J

    iput-object p1, p0, Le7/q2;->e:Lcom/google/android/gms/measurement/internal/zzig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Le7/q2;->a:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Le7/q2;->e:Lcom/google/android/gms/measurement/internal/zzig;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 8
    .line 9
    iget-object v1, p0, Le7/q2;->b:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Le7/e2;->l()V

    .line 17
    .line 18
    .line 19
    iget-object v3, v0, Le7/i6;->O:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iput-object v1, v0, Le7/i6;->O:Ljava/lang/String;

    .line 31
    .line 32
    iput-object v2, v0, Le7/i6;->N:Le7/q4;

    .line 33
    .line 34
    :goto_0
    return-void

    .line 35
    :cond_1
    new-instance v1, Le7/q4;

    .line 36
    .line 37
    iget-object v2, p0, Le7/q2;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-wide v3, p0, Le7/q2;->d:J

    .line 40
    .line 41
    invoke-direct {v1, v3, v4, v2, v0}, Le7/q4;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Le7/q2;->e:Lcom/google/android/gms/measurement/internal/zzig;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 47
    .line 48
    iget-object v2, p0, Le7/q2;->b:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3}, Le7/e2;->l()V

    .line 55
    .line 56
    .line 57
    iget-object v3, v0, Le7/i6;->O:Ljava/lang/String;

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    :cond_2
    iput-object v2, v0, Le7/i6;->O:Ljava/lang/String;

    .line 66
    .line 67
    iput-object v1, v0, Le7/i6;->N:Le7/q4;

    .line 68
    .line 69
    return-void
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

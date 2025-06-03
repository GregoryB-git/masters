.class public final Le7/b5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le7/k6;

.field public final synthetic b:Z

.field public final synthetic c:Le7/q6;

.field public final synthetic d:Le7/w4;


# direct methods
.method public constructor <init>(Le7/w4;Le7/k6;ZLe7/q6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Le7/b5;->a:Le7/k6;

    iput-boolean p3, p0, Le7/b5;->b:Z

    iput-object p4, p0, Le7/b5;->c:Le7/q6;

    iput-object p1, p0, Le7/b5;->d:Le7/w4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Le7/b5;->d:Le7/w4;

    .line 2
    .line 3
    iget-object v1, v0, Le7/w4;->e:Le7/n0;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 12
    .line 13
    const-string v1, "Discarding data. Failed to set user property"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Le7/b5;->a:Le7/k6;

    .line 20
    .line 21
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Le7/b5;->d:Le7/w4;

    .line 25
    .line 26
    iget-boolean v2, p0, Le7/b5;->b:Z

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v2, p0, Le7/b5;->c:Le7/q6;

    .line 33
    .line 34
    :goto_0
    iget-object v3, p0, Le7/b5;->a:Le7/k6;

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2, v3}, Le7/w4;->w(Le7/n0;Ln6/a;Le7/k6;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Le7/b5;->d:Le7/w4;

    .line 40
    .line 41
    invoke-virtual {v0}, Le7/w4;->H()V

    .line 42
    .line 43
    .line 44
    return-void
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

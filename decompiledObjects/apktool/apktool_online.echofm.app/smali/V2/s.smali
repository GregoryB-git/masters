.class public final LV2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LV2/j;

.field public final synthetic p:LV2/t;


# direct methods
.method public constructor <init>(LV2/t;LV2/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV2/s;->p:LV2/t;

    .line 2
    .line 3
    iput-object p2, p0, LV2/s;->o:LV2/j;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LV2/s;->o:LV2/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LV2/j;->l()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LV2/s;->p:LV2/t;

    .line 10
    .line 11
    invoke-static {v0}, LV2/t;->b(LV2/t;)LV2/K;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, LV2/K;->s()Z

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    :try_start_0
    iget-object v0, p0, LV2/s;->p:LV2/t;

    .line 20
    .line 21
    invoke-static {v0}, LV2/t;->a(LV2/t;)LV2/b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, LV2/s;->o:LV2/j;

    .line 26
    .line 27
    invoke-interface {v0, v1}, LV2/b;->a(LV2/j;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0
    :try_end_0
    .catch LV2/h; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    iget-object v1, p0, LV2/s;->p:LV2/t;

    .line 32
    .line 33
    invoke-static {v1}, LV2/t;->b(LV2/t;)LV2/K;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1, v0}, LV2/K;->r(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    move-exception v0

    .line 42
    goto :goto_0

    .line 43
    :catch_1
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    :goto_0
    iget-object v1, p0, LV2/s;->p:LV2/t;

    .line 46
    .line 47
    invoke-static {v1}, LV2/t;->b(LV2/t;)LV2/K;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1, v0}, LV2/K;->q(Ljava/lang/Exception;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    instance-of v1, v1, Ljava/lang/Exception;

    .line 60
    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    iget-object v1, p0, LV2/s;->p:LV2/t;

    .line 64
    .line 65
    invoke-static {v1}, LV2/t;->b(LV2/t;)LV2/K;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ljava/lang/Exception;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, LV2/K;->q(Ljava/lang/Exception;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    iget-object v1, p0, LV2/s;->p:LV2/t;

    .line 80
    .line 81
    invoke-static {v1}, LV2/t;->b(LV2/t;)LV2/K;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1, v0}, LV2/K;->q(Ljava/lang/Exception;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

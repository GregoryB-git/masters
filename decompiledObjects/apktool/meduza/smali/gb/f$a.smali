.class public final Lgb/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/f;->f(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lgb/f;


# direct methods
.method public constructor <init>(Lgb/f;I)V
    .locals 0

    iput-object p1, p0, Lgb/f$a;->b:Lgb/f;

    iput p2, p0, Lgb/f$a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lgb/f$a;->b:Lgb/f;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/f;->c:Lgb/i2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lgb/i2;->isClosed()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_0
    iget-object v0, p0, Lgb/f$a;->b:Lgb/f;

    .line 13
    .line 14
    iget-object v0, v0, Lgb/f;->c:Lgb/i2;

    .line 15
    .line 16
    iget v1, p0, Lgb/f$a;->a:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lgb/i2;->f(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    iget-object v1, p0, Lgb/f$a;->b:Lgb/f;

    .line 24
    .line 25
    iget-object v1, v1, Lgb/f;->b:Lgb/g;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lgb/g;->e(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lgb/f$a;->b:Lgb/f;

    .line 31
    .line 32
    iget-object v0, v0, Lgb/f;->c:Lgb/i2;

    .line 33
    .line 34
    invoke-virtual {v0}, Lgb/i2;->close()V

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void
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

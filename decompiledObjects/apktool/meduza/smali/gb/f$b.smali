.class public final Lgb/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/f;->C(Lgb/u2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgb/u2;

.field public final synthetic b:Lgb/f;


# direct methods
.method public constructor <init>(Lgb/f;Lhb/l;)V
    .locals 0

    iput-object p1, p0, Lgb/f$b;->b:Lgb/f;

    iput-object p2, p0, Lgb/f$b;->a:Lgb/u2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lgb/f$b;->b:Lgb/f;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/f;->c:Lgb/i2;

    .line 4
    .line 5
    iget-object v1, p0, Lgb/f$b;->a:Lgb/u2;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lgb/i2;->C(Lgb/u2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    iget-object v1, p0, Lgb/f$b;->b:Lgb/f;

    .line 13
    .line 14
    iget-object v1, v1, Lgb/f;->b:Lgb/g;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lgb/g;->e(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lgb/f$b;->b:Lgb/f;

    .line 20
    .line 21
    iget-object v0, v0, Lgb/f;->c:Lgb/i2;

    .line 22
    .line 23
    invoke-virtual {v0}, Lgb/i2;->close()V

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void
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

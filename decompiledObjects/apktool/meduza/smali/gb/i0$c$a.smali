.class public final Lgb/i0$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/i0$c;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lgb/i0$c;


# direct methods
.method public constructor <init>(Lgb/i0$c;Z)V
    .locals 0

    iput-object p1, p0, Lgb/i0$c$a;->b:Lgb/i0$c;

    iput-boolean p2, p0, Lgb/i0$c$a;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lgb/i0$c$a;->a:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lgb/i0$c$a;->b:Lgb/i0$c;

    .line 7
    .line 8
    iget-object v0, v0, Lgb/i0$c;->b:Lgb/i0;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iput-boolean v2, v0, Lgb/i0;->l:Z

    .line 12
    .line 13
    iget-wide v2, v0, Lgb/i0;->i:J

    .line 14
    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    cmp-long v2, v2, v4

    .line 18
    .line 19
    if-lez v2, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, Lgb/i0;->k:Ln7/p;

    .line 22
    .line 23
    iput-boolean v1, v0, Ln7/p;->b:Z

    .line 24
    .line 25
    invoke-virtual {v0}, Ln7/p;->b()V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lgb/i0$c$a;->b:Lgb/i0$c;

    .line 29
    .line 30
    iget-object v0, v0, Lgb/i0$c;->b:Lgb/i0;

    .line 31
    .line 32
    iput-boolean v1, v0, Lgb/i0;->q:Z

    .line 33
    .line 34
    return-void
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

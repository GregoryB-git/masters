.class public final synthetic Lj8/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lj8/d0;

.field public final synthetic b:Lm8/f0$e$d;

.field public final synthetic c:Ll8/c;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lj8/d0;Lm8/f0$e$d;Ll8/c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/c0;->a:Lj8/d0;

    iput-object p2, p0, Lj8/c0;->b:Lm8/f0$e$d;

    iput-object p3, p0, Lj8/c0;->c:Ll8/c;

    iput-boolean p4, p0, Lj8/c0;->d:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lj8/c0;->a:Lj8/d0;

    .line 2
    .line 3
    iget-object v1, p0, Lj8/c0;->b:Lm8/f0$e$d;

    .line 4
    .line 5
    iget-object v2, p0, Lj8/c0;->c:Ll8/c;

    .line 6
    .line 7
    iget-boolean v3, p0, Lj8/c0;->d:Z

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x3

    .line 14
    const-string v6, "FirebaseCrashlytics"

    .line 15
    .line 16
    invoke-static {v6, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    const-string v5, "disk worker: log non-fatal event to persistence"

    .line 23
    .line 24
    invoke-static {v6, v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, v0, Lj8/d0;->b:Lp8/c;

    .line 28
    .line 29
    iget-object v2, v2, Ll8/c;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2, v3}, Lp8/c;->c(Lm8/f0$e$d;Ljava/lang/String;Z)V

    .line 32
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

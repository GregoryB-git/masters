.class public Lgb/f$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/n3$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public b:Z

.field public final synthetic c:Lgb/f;


# direct methods
.method public constructor <init>(Lgb/f;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lgb/f$g;->c:Lgb/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lgb/f$g;->b:Z

    iput-object p2, p0, Lgb/f$g;->a:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final next()Ljava/io/InputStream;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lgb/f$g;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lgb/f$g;->a:Ljava/lang/Runnable;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lgb/f$g;->b:Z

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lgb/f$g;->c:Lgb/f;

    .line 14
    .line 15
    iget-object v0, v0, Lgb/f;->b:Lgb/g;

    .line 16
    .line 17
    iget-object v0, v0, Lgb/g;->c:Ljava/util/ArrayDeque;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/io/InputStream;

    .line 24
    .line 25
    return-object v0
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

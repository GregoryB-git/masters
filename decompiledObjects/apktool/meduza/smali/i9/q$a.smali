.class public final Li9/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/k1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:Ln9/a;

.field public final b:Li9/n;

.field public c:Z

.field public d:Ln9/a$a;

.field public final synthetic e:Li9/q;


# direct methods
.method public constructor <init>(Li9/q;Ln9/a;Li9/n;)V
    .locals 0

    iput-object p1, p0, Li9/q$a;->e:Li9/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Li9/q$a;->c:Z

    iput-object p2, p0, Li9/q$a;->a:Ln9/a;

    iput-object p3, p0, Li9/q$a;->b:Li9/n;

    return-void
.end method


# virtual methods
.method public final start()V
    .locals 6

    .line 1
    iget-object v0, p0, Li9/q$a;->e:Li9/q;

    .line 2
    .line 3
    iget-object v0, v0, Li9/q;->b:Li9/q$b;

    .line 4
    .line 5
    iget-wide v0, v0, Li9/q$b;->a:J

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-boolean v0, p0, Li9/q$a;->c:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-wide v0, Li9/q;->d:J

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-wide v0, Li9/q;->c:J

    .line 21
    .line 22
    :goto_0
    iget-object v2, p0, Li9/q$a;->a:Ln9/a;

    .line 23
    .line 24
    sget-object v3, Ln9/a$c;->o:Ln9/a$c;

    .line 25
    .line 26
    new-instance v4, Lb/m;

    .line 27
    .line 28
    const/16 v5, 0x10

    .line 29
    .line 30
    invoke-direct {v4, p0, v5}, Lb/m;-><init>(Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v3, v0, v1, v4}, Ln9/a;->b(Ln9/a$c;JLjava/lang/Runnable;)Ln9/a$a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Li9/q$a;->d:Ln9/a$a;

    .line 38
    .line 39
    :cond_1
    return-void
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

.method public final stop()V
    .locals 1

    iget-object v0, p0, Li9/q$a;->d:Ln9/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln9/a$a;->a()V

    :cond_0
    return-void
.end method

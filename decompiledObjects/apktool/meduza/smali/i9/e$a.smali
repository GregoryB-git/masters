.class public final Li9/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/k1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Ln9/a$a;

.field public final b:Ln9/a;

.field public final synthetic c:Li9/e;


# direct methods
.method public constructor <init>(Li9/e;Ln9/a;)V
    .locals 0

    iput-object p1, p0, Li9/e$a;->c:Li9/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Li9/e$a;->b:Ln9/a;

    return-void
.end method


# virtual methods
.method public final start()V
    .locals 6

    .line 1
    sget-wide v0, Li9/e;->f:J

    .line 2
    .line 3
    iget-object v2, p0, Li9/e$a;->b:Ln9/a;

    .line 4
    .line 5
    sget-object v3, Ln9/a$c;->r:Ln9/a$c;

    .line 6
    .line 7
    new-instance v4, Lu/a;

    .line 8
    .line 9
    const/16 v5, 0xc

    .line 10
    .line 11
    invoke-direct {v4, p0, v5}, Lu/a;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v3, v0, v1, v4}, Ln9/a;->b(Ln9/a$c;JLjava/lang/Runnable;)Ln9/a$a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Li9/e$a;->a:Ln9/a$a;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
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

.method public final stop()V
    .locals 1

    iget-object v0, p0, Li9/e$a;->a:Ln9/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln9/a$a;->a()V

    :cond_0
    return-void
.end method

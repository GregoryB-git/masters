.class public final Lgb/r1$k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/r1$k;->f(Leb/n;Leb/k0$j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Leb/k0$j;

.field public final synthetic b:Leb/n;

.field public final synthetic c:Lgb/r1$k;


# direct methods
.method public constructor <init>(Lgb/r1$k;Leb/k0$j;Leb/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lgb/r1$k$b;->c:Lgb/r1$k;

    iput-object p2, p0, Lgb/r1$k$b;->a:Leb/k0$j;

    iput-object p3, p0, Lgb/r1$k$b;->b:Leb/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lgb/r1$k$b;->c:Lgb/r1$k;

    .line 2
    .line 3
    iget-object v1, v0, Lgb/r1$k;->b:Lgb/r1;

    .line 4
    .line 5
    iget-object v2, v1, Lgb/r1;->y:Lgb/r1$k;

    .line 6
    .line 7
    if-eq v0, v2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lgb/r1$k$b;->a:Leb/k0$j;

    .line 11
    .line 12
    iput-object v0, v1, Lgb/r1;->z:Leb/k0$j;

    .line 13
    .line 14
    iget-object v1, v1, Lgb/r1;->F:Lgb/f0;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lgb/f0;->i(Leb/k0$j;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lgb/r1$k$b;->b:Leb/n;

    .line 20
    .line 21
    sget-object v1, Leb/n;->e:Leb/n;

    .line 22
    .line 23
    if-eq v0, v1, :cond_1

    .line 24
    .line 25
    iget-object v1, p0, Lgb/r1$k$b;->c:Lgb/r1$k;

    .line 26
    .line 27
    iget-object v1, v1, Lgb/r1$k;->b:Lgb/r1;

    .line 28
    .line 29
    iget-object v1, v1, Lgb/r1;->P:Lgb/n;

    .line 30
    .line 31
    sget-object v2, Leb/d$a;->b:Leb/d$a;

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    new-array v3, v3, [Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    aput-object v0, v3, v4

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    iget-object v4, p0, Lgb/r1$k$b;->a:Leb/k0$j;

    .line 41
    .line 42
    aput-object v4, v3, v0

    .line 43
    .line 44
    const-string v0, "Entering {0} state with picker: {1}"

    .line 45
    .line 46
    invoke-virtual {v1, v2, v0, v3}, Lgb/n;->b(Leb/d$a;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lgb/r1$k$b;->c:Lgb/r1$k;

    .line 50
    .line 51
    iget-object v0, v0, Lgb/r1$k;->b:Lgb/r1;

    .line 52
    .line 53
    iget-object v0, v0, Lgb/r1;->s:Lgb/y;

    .line 54
    .line 55
    iget-object v1, p0, Lgb/r1$k$b;->b:Leb/n;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lgb/y;->a(Leb/n;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void
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

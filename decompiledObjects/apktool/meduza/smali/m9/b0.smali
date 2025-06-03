.class public final Lm9/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/b0$a;
    }
.end annotation


# instance fields
.field public a:Lg9/d0;

.field public b:I

.field public c:Ln9/a$a;

.field public d:Z

.field public final e:Ln9/a;

.field public final f:Lm9/b0$a;


# direct methods
.method public constructor <init>(Ln9/a;Laa/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/b0;->e:Ln9/a;

    iput-object p2, p0, Lm9/b0;->f:Lm9/b0$a;

    sget-object p1, Lg9/d0;->a:Lg9/d0;

    iput-object p1, p0, Lm9/b0;->a:Lg9/d0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lm9/b0;->d:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend."

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-boolean v1, p0, Lm9/b0;->d:Z

    const-string v3, "%s"

    const-string v4, "OnlineStateTracker"

    new-array v0, v0, [Ljava/lang/Object;

    if-eqz v1, :cond_0

    aput-object p1, v0, v2

    invoke-static {v4, v3, v0}, Lp2/m0;->h0(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v2, p0, Lm9/b0;->d:Z

    goto :goto_0

    :cond_0
    aput-object p1, v0, v2

    invoke-static {v4, v3, v0}, Lp2/m0;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final b(Lg9/d0;)V
    .locals 1

    iget-object v0, p0, Lm9/b0;->a:Lg9/d0;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Lm9/b0;->a:Lg9/d0;

    iget-object v0, p0, Lm9/b0;->f:Lm9/b0$a;

    check-cast v0, Laa/m0;

    iget-object v0, v0, Laa/m0;->b:Ljava/lang/Object;

    check-cast v0, Lm9/h0$a;

    invoke-interface {v0, p1}, Lm9/h0$a;->b(Lg9/d0;)V

    :cond_0
    return-void
.end method

.method public final c(Lg9/d0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm9/b0;->c:Ln9/a$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ln9/a$a;->a()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lm9/b0;->c:Ln9/a$a;

    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lm9/b0;->b:I

    .line 13
    .line 14
    sget-object v1, Lg9/d0;->b:Lg9/d0;

    .line 15
    .line 16
    if-ne p1, v1, :cond_1

    .line 17
    .line 18
    iput-boolean v0, p0, Lm9/b0;->d:Z

    .line 19
    .line 20
    :cond_1
    invoke-virtual {p0, p1}, Lm9/b0;->b(Lg9/d0;)V

    .line 21
    .line 22
    .line 23
    return-void
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
.end method

.class public final Lgb/v1;
.super Leb/k0$j;
.source "SourceFile"


# instance fields
.field public final a:Leb/k0$f;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Leb/k0$j;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Leb/e1;->m:Leb/e1;

    .line 5
    .line 6
    const-string v1, "Panic! This is a bug!"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Leb/e1;->f(Ljava/lang/Throwable;)Leb/e1;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object v0, Leb/k0$f;->e:Leb/k0$f;

    .line 17
    .line 18
    invoke-virtual {p1}, Leb/e1;->e()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x1

    .line 23
    xor-int/2addr v0, v1

    .line 24
    const-string v2, "drop status shouldn\'t be OK"

    .line 25
    .line 26
    invoke-static {v2, v0}, Lx6/b;->s(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Leb/k0$f;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-direct {v0, v2, v2, p1, v1}, Leb/k0$f;-><init>(Leb/k0$i;Lnb/i$g$a;Leb/e1;Z)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lgb/v1;->a:Leb/k0$f;

    .line 36
    .line 37
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
.end method


# virtual methods
.method public final a(Leb/k0$g;)Leb/k0$f;
    .locals 0

    iget-object p1, p0, Lgb/v1;->a:Leb/k0$f;

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    const-class v0, Lgb/v1;

    .line 2
    .line 3
    new-instance v1, Ln7/g$a;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {v1, v0}, Ln7/g$a;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lgb/v1;->a:Leb/k0$f;

    .line 13
    .line 14
    const-string v2, "panicPickResult"

    .line 15
    .line 16
    invoke-virtual {v1, v0, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ln7/g$a;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
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

.class public final Lm0/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/N$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/E$b;,
        Lm0/E$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm0/E;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ld0/q;Ld0/b;)Lm0/k;
    .locals 4

    .line 1
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    sget v0, Lg0/M;->a:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-lt v0, v1, :cond_5

    .line 12
    .line 13
    iget v1, p1, Ld0/q;->C:I

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-object v1, p0, Lm0/E;->a:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lm0/E;->b(Landroid/content/Context;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v2, p1, Ld0/q;->n:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, p1, Ld0/q;->j:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v2, v3}, Ld0/z;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    invoke-static {v2}, Lg0/M;->K(I)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-ge v0, v3, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget v3, p1, Ld0/q;->B:I

    .line 49
    .line 50
    invoke-static {v3}, Lg0/M;->M(I)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    sget-object p1, Lm0/k;->d:Lm0/k;

    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_2
    :try_start_0
    iget p1, p1, Ld0/q;->C:I

    .line 60
    .line 61
    invoke-static {p1, v3, v2}, Lg0/M;->L(III)Landroid/media/AudioFormat;

    .line 62
    .line 63
    .line 64
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    const/16 v2, 0x1f

    .line 66
    .line 67
    invoke-virtual {p2}, Ld0/b;->a()Ld0/b$d;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iget-object p2, p2, Ld0/b$d;->a:Landroid/media/AudioAttributes;

    .line 72
    .line 73
    if-lt v0, v2, :cond_3

    .line 74
    .line 75
    invoke-static {p1, p2, v1}, Lm0/E$b;->a(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;Z)Lm0/k;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_3
    invoke-static {p1, p2, v1}, Lm0/E$a;->a(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;Z)Lm0/k;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    :catch_0
    sget-object p1, Lm0/k;->d:Lm0/k;

    .line 86
    .line 87
    return-object p1

    .line 88
    :cond_4
    :goto_0
    sget-object p1, Lm0/k;->d:Lm0/k;

    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_5
    :goto_1
    sget-object p1, Lm0/k;->d:Lm0/k;

    .line 92
    .line 93
    return-object p1
.end method

.method public final b(Landroid/content/Context;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/E;->b:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    if-eqz p1, :cond_2

    .line 11
    .line 12
    const-string v0, "audio"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroid/media/AudioManager;

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    const-string v0, "offloadVariableRateSupported"

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->getParameters(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    const-string v0, "offloadVariableRateSupported=1"

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 47
    .line 48
    :goto_1
    iput-object p1, p0, Lm0/E;->b:Ljava/lang/Boolean;

    .line 49
    .line 50
    iget-object p1, p0, Lm0/E;->b:Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    return p1
.end method

.class public final LR4/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:LR4/x;

.field public final c:Lg6/a;

.field public final d:Ljava/lang/String;

.field public e:I

.field public f:LR4/p;


# direct methods
.method public constructor <init>(ZLR4/x;Lg6/a;)V
    .locals 1

    .line 1
    const-string v0, "timeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uuidGenerator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LR4/s;->a:Z

    iput-object p2, p0, LR4/s;->b:LR4/x;

    iput-object p3, p0, LR4/s;->c:Lg6/a;

    invoke-virtual {p0}, LR4/s;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LR4/s;->d:Ljava/lang/String;

    const/4 p1, -0x1

    iput p1, p0, LR4/s;->e:I

    return-void
.end method

.method public synthetic constructor <init>(ZLR4/x;Lg6/a;ILkotlin/jvm/internal/g;)V
    .locals 0

    .line 2
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    sget-object p3, LR4/s$a;->o:LR4/s$a;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LR4/s;-><init>(ZLR4/x;Lg6/a;)V

    return-void
.end method


# virtual methods
.method public final a()LR4/p;
    .locals 8

    .line 1
    iget v0, p0, LR4/s;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, LR4/s;->e:I

    .line 6
    .line 7
    new-instance v7, LR4/p;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LR4/s;->d:Ljava/lang/String;

    .line 12
    .line 13
    :goto_0
    move-object v2, v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {p0}, LR4/s;->b()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :goto_1
    iget-object v3, p0, LR4/s;->d:Ljava/lang/String;

    .line 21
    .line 22
    iget v4, p0, LR4/s;->e:I

    .line 23
    .line 24
    iget-object v0, p0, LR4/s;->b:LR4/x;

    .line 25
    .line 26
    invoke-interface {v0}, LR4/x;->a()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    move-object v1, v7

    .line 31
    invoke-direct/range {v1 .. v6}, LR4/p;-><init>(Ljava/lang/String;Ljava/lang/String;IJ)V

    .line 32
    .line 33
    .line 34
    iput-object v7, p0, LR4/s;->f:LR4/p;

    .line 35
    .line 36
    invoke-virtual {p0}, LR4/s;->d()LR4/p;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, LR4/s;->c:Lg6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg6/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/UUID;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v0, "uuidGenerator().toString()"

    .line 14
    .line 15
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x4

    .line 19
    const/4 v6, 0x0

    .line 20
    const-string v2, "-"

    .line 21
    .line 22
    const-string v3, ""

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, Lkotlin/text/i;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LR4/s;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()LR4/p;
    .locals 1

    .line 1
    iget-object v0, p0, LR4/s;->f:LR4/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "currentSession"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->n(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, LR4/s;->f:LR4/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    return v0
.end method

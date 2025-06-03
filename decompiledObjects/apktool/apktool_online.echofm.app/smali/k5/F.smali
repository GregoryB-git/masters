.class public Lk5/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA5/a;
.implements LE5/k$c;


# static fields
.field public static c:Ljava/util/Map;

.field public static d:Ljava/util/List;


# instance fields
.field public a:LE5/k;

.field public b:Lk5/E;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk5/F;->d:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 4

    .line 1
    sget-object v0, Lk5/F;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lk5/F;

    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v1, Lk5/F;->a:LE5/k;

    .line 29
    .line 30
    invoke-virtual {v1, p1, v2}, LE5/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public onAttachedToEngine(LA5/a$b;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, LA5/a$b;->b()LE5/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LE5/k;

    .line 6
    .line 7
    const-string v2, "com.ryanheise.audio_session"

    .line 8
    .line 9
    invoke-direct {v1, v0, v2}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lk5/F;->a:LE5/k;

    .line 13
    .line 14
    invoke-virtual {v1, p0}, LE5/k;->e(LE5/k$c;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lk5/E;

    .line 18
    .line 19
    invoke-virtual {p1}, LA5/a$b;->a()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v1, p1, v0}, Lk5/E;-><init>(Landroid/content/Context;LE5/c;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lk5/F;->b:Lk5/E;

    .line 27
    .line 28
    sget-object p1, Lk5/F;->d:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onDetachedFromEngine(LA5/a$b;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lk5/F;->a:LE5/k;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, LE5/k;->e(LE5/k$c;)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Lk5/F;->a:LE5/k;

    .line 8
    .line 9
    iget-object p1, p0, Lk5/F;->b:Lk5/E;

    .line 10
    .line 11
    invoke-virtual {p1}, Lk5/E;->b()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lk5/F;->b:Lk5/E;

    .line 15
    .line 16
    sget-object p1, Lk5/F;->d:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {p1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Ljava/util/List;

    .line 5
    .line 6
    iget-object p1, p1, LE5/j;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    const-string v2, "setConfiguration"

    .line 12
    .line 13
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    const-string v0, "getConfiguration"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    invoke-interface {p2}, LE5/k$d;->c()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sget-object p1, Lk5/F;->c:Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Ljava/util/Map;

    .line 42
    .line 43
    sput-object p1, Lk5/F;->c:Ljava/util/Map;

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    new-array p1, p1, [Ljava/lang/Object;

    .line 51
    .line 52
    sget-object p2, Lk5/F;->c:Ljava/util/Map;

    .line 53
    .line 54
    aput-object p2, p1, v0

    .line 55
    .line 56
    const-string p2, "onConfigurationChanged"

    .line 57
    .line 58
    invoke-virtual {p0, p2, p1}, Lk5/F;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    return-void
.end method

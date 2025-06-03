.class public LD5/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LE5/k;

.field public final b:LE5/k$c;


# direct methods
.method public constructor <init>(Lw5/a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LD5/n$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LD5/n$a;-><init>(LD5/n;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LD5/n;->b:LE5/k$c;

    .line 10
    .line 11
    new-instance v1, LE5/k;

    .line 12
    .line 13
    const-string v2, "flutter/navigation"

    .line 14
    .line 15
    sget-object v3, LE5/g;->a:LE5/g;

    .line 16
    .line 17
    invoke-direct {v1, p1, v2, v3}, LE5/k;-><init>(LE5/c;Ljava/lang/String;LE5/l;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, LD5/n;->a:LE5/k;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, LE5/k;->e(LE5/k$c;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    const-string v0, "NavigationChannel"

    .line 2
    .line 3
    const-string v1, "Sending message to pop route."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LD5/n;->a:LE5/k;

    .line 9
    .line 10
    const-string v1, "popRoute"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, v2}, LE5/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Sending message to push route information \'"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, "\'"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "NavigationChannel"

    .line 24
    .line 25
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v1, "location"

    .line 34
    .line 35
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, LD5/n;->a:LE5/k;

    .line 39
    .line 40
    const-string v1, "pushRouteInformation"

    .line 41
    .line 42
    invoke-virtual {p1, v1, v0}, LE5/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Sending message to set initial route to \'"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, "\'"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "NavigationChannel"

    .line 24
    .line 25
    invoke-static {v1, v0}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, LD5/n;->a:LE5/k;

    .line 29
    .line 30
    const-string v1, "setInitialRoute"

    .line 31
    .line 32
    invoke-virtual {v0, v1, p1}, LE5/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

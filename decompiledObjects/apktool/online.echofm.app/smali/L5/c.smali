.class public abstract LL5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LE5/d$b;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(LE5/d$b;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL5/c;->a:LE5/d$b;

    .line 5
    .line 6
    iput-object p2, p0, LL5/c;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public g(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "eventType"

    .line 7
    .line 8
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    const-string p1, "previousChildKey"

    .line 14
    .line 15
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :cond_0
    return-object v0
.end method

.method public h(Ljava/lang/String;LQ3/b;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LL5/c;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, LL5/x;

    .line 11
    .line 12
    invoke-direct {v0, p2}, LL5/x;-><init>(LQ3/b;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p3}, LL5/c;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p2, p0, LL5/c;->a:LE5/d$b;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, LL5/x;->b(Ljava/util/Map;)LL5/x;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, LL5/x;->a()Ljava/util/Map;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p2, p1}, LE5/d$b;->a(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

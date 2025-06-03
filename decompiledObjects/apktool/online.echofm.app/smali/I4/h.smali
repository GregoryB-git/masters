.class public LI4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/http/client/ResponseHandler;


# instance fields
.field public final a:Lorg/apache/http/client/ResponseHandler;

.field public final b:LM4/l;

.field public final c:LG4/j;


# direct methods
.method public constructor <init>(Lorg/apache/http/client/ResponseHandler;LM4/l;LG4/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LI4/h;->a:Lorg/apache/http/client/ResponseHandler;

    .line 5
    .line 6
    iput-object p2, p0, LI4/h;->b:LM4/l;

    .line 7
    .line 8
    iput-object p3, p0, LI4/h;->c:LG4/j;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public handleResponse(Lorg/apache/http/HttpResponse;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LI4/h;->c:LG4/j;

    .line 2
    .line 3
    iget-object v1, p0, LI4/h;->b:LM4/l;

    .line 4
    .line 5
    invoke-virtual {v1}, LM4/l;->c()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {v0, v1, v2}, LG4/j;->A(J)LG4/j;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LI4/h;->c:LG4/j;

    .line 13
    .line 14
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, v1}, LG4/j;->r(I)LG4/j;

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, LI4/j;->a(Lorg/apache/http/HttpMessage;)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, LI4/h;->c:LG4/j;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    invoke-virtual {v1, v2, v3}, LG4/j;->y(J)LG4/j;

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-static {p1}, LI4/j;->b(Lorg/apache/http/HttpResponse;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v1, p0, LI4/h;->c:LG4/j;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, LG4/j;->x(Ljava/lang/String;)LG4/j;

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object v0, p0, LI4/h;->c:LG4/j;

    .line 52
    .line 53
    invoke-virtual {v0}, LG4/j;->g()LN4/h;

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, LI4/h;->a:Lorg/apache/http/client/ResponseHandler;

    .line 57
    .line 58
    invoke-interface {v0, p1}, Lorg/apache/http/client/ResponseHandler;->handleResponse(Lorg/apache/http/HttpResponse;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method
